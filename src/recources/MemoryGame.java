package recources;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MemoryGame extends JFrame {
    // Game state - only 2 arrays are needed here:
    //  1) cardNumbers stores the hidden values of each card,
    //     where each number appears exactly twice.
    //  2) cardState stores whether a card is hidden, revealed, or matched.
    private int[] cardNumbers = new int[12];    // Card values (1-6)
    private int[] cardState = new int[12];      // 0=hidden, 1=revealed, 2=matched
    
    private JButton[] buttons = new JButton[12];
    private JLabel statusLabel;
    
    // Track the currently flipped cards for a pair check.
    private int firstCard = -1;
    private int secondCard = -1;
    private boolean isChecking = false; // Prevent clicks while checking a pair.
    private int matchedPairs = 0;      // Count how many pairs have been found.

    public MemoryGame() {
        initializeGame();
        createUI();
        setTitle("Valememory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeGame() {
        // Build the list of card values: 6 pairs numbered 1 through 6.
        int[] values = new int[12];
        int index = 0;
        for (int i = 1; i <= 6; i++) {
            values[index++] = i;
            values[index++] = i;
        }
        
        // Shuffle the card values so the board is randomized.
        Random rand = new Random();
        for (int i = 11; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
        
        // Store the shuffled values and hide all cards initially.
        for (int i = 0; i < 12; i++) {
            cardNumbers[i] = values[i];
            cardState[i] = 0; // 0 = hidden
        }
        
        // Reset any previously selected cards and matched pair count.
        firstCard = -1;
        secondCard = -1;
        isChecking = false;
        matchedPairs = 0;
    }

    private void createUI() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Status label
        statusLabel = new JLabel("Valememory - Pairs: 0/6");
        statusLabel.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(statusLabel, BorderLayout.NORTH);
        
        // Cards panel (4x3 grid)
        JPanel cardsPanel = new JPanel(new GridLayout(3, 4, 10, 10));
        for (int i = 0; i < 12; i++) {
            buttons[i] = new JButton("?");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 24));
            buttons[i].setPreferredSize(new Dimension(100, 100));
            int index = i;
            buttons[i].addActionListener(e -> handleClick(index));
            cardsPanel.add(buttons[i]);
        }
        mainPanel.add(cardsPanel, BorderLayout.CENTER);
        
        // Quit button
        JPanel bottomPanel = new JPanel();
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(e -> System.exit(0));
        bottomPanel.add(quitButton);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
    }

    private void handleClick(int index) {
        // Ignore clicks while the game is checking a previous pair
        // or if the game is already complete.
        if (matchedPairs == 6 || isChecking) {
            return;
        }
        
        // Ignore clicks on cards that are already matched or already revealed.
        if (cardState[index] == 2 || cardState[index] == 1) {
            return;
        }
        
        // Reveal the selected card.
        cardState[index] = 1;
        updateDisplay();
        
        // If this is the first card of the pair, remember it.
        if (firstCard == -1) {
            firstCard = index;
        } else if (secondCard == -1) {
            // If this is the second card, schedule a match check.
            secondCard = index;
            isChecking = true;
            
            // Allow the player to see the second card briefly before checking.
            Timer timer = new Timer(1000, e -> checkMatch());
            timer.setRepeats(false);
            timer.start();
        }
    }

    private void checkMatch() {
        // Compare the two selected cards.
        if (cardNumbers[firstCard] == cardNumbers[secondCard]) {
            // If the values match, mark both cards as permanently matched.
            cardState[firstCard] = 2;
            cardState[secondCard] = 2;
            matchedPairs++;
            JOptionPane.showMessageDialog(this, "Match Found! " + matchedPairs + "/6");
            
            // If all pairs are matched, the player wins and the board resets.
            if (matchedPairs == 6) {
                JOptionPane.showMessageDialog(this, "🎉 You Won!");
                initializeGame();
            }
        } else {
            // If the cards do not match, hide them again.
            cardState[firstCard] = 0;
            cardState[secondCard] = 0;
            JOptionPane.showMessageDialog(this, "No match. Try again!");
        }
        
        // Reset selection state so the player can choose a new pair.
        firstCard = -1;
        secondCard = -1;
        isChecking = false;
        updateDisplay();
    }

    private void updateDisplay() {
        // Refresh each button to match its current game state.
        for (int i = 0; i < 12; i++) {
            if (cardState[i] == 2) {
                // Matched cards stay visible as check marks and cannot be clicked again.
                buttons[i].setText("✓");
                buttons[i].setEnabled(false);
                buttons[i].setBackground(new Color(144, 238, 144));
                buttons[i].setOpaque(true);
            } else if (cardState[i] == 1) {
                // Revealed cards show their number briefly.
                buttons[i].setText(String.valueOf(cardNumbers[i]));
                buttons[i].setEnabled(true);
                buttons[i].setBackground(new Color(173, 216, 230));
                buttons[i].setOpaque(true);
            } else {
                // Hidden cards show a question mark.
                buttons[i].setText("?");
                buttons[i].setEnabled(true);
                buttons[i].setBackground(UIManager.getColor("Button.background"));
                buttons[i].setOpaque(false);
            }
        }
        statusLabel.setText("Valememory - Pairs: " + matchedPairs + "/6");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MemoryGame::new);
    }
}
