package recources;

import javax.swing.*;
import javax.swing.Timer;
import java.util.Random;

public class MemoryProject extends javax.swing.JFrame {
    // Game state using simple arrays
    private int[] cardValues = new int[12];           // Card values (1-6)
    private boolean[] cardRevealed = new boolean[12]; // Revealed state
    private boolean[] cardMatched = new boolean[12];  // Matched state
    
    private javax.swing.JButton[] cardButtons;
    private final int DELAY_TIME = 1000; // 1 second delay
    private int firstCardIndex = -1;
    private int secondCardIndex = -1;
    private boolean isChecking = false;
    private int matchedPairs = 0;
    private boolean gameWon = false;

    public MemoryProject() {
        initializeGame();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Valememory");
        setupCardButtons();
        updateDisplay();
    }
    
    private void initializeGame() {
        // Create 6 pairs (values 1-6, each appearing twice)
        int[] values = new int[12];
        int index = 0;
        for (int i = 1; i <= 6; i++) {
            values[index++] = i;
            values[index++] = i;
        }
        
        // Shuffle the values
        Random random = new Random();
        for (int i = values.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
        
        // Initialize card state arrays
        for (int i = 0; i < 12; i++) {
            cardValues[i] = values[i];
            cardRevealed[i] = false;
            cardMatched[i] = false;
        }
        
        firstCardIndex = -1;
        secondCardIndex = -1;
        isChecking = false;
        matchedPairs = 0;
    }
    
    private void setupCardButtons() {
        cardButtons = new javax.swing.JButton[]{
            bMemory1, bMemory2, bMemory3, bMemory4,
            bMemory5, bMemory6, bMemory7, bMemory8,
            bMemory9, bMemory10, bMemory11, bMemory12
        };
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        bMemory1 = new javax.swing.JButton();
        bMemory2 = new javax.swing.JButton();
        bMemory3 = new javax.swing.JButton();
        bMemory4 = new javax.swing.JButton();
        bMemory5 = new javax.swing.JButton();
        bMemory6 = new javax.swing.JButton();
        bMemory7 = new javax.swing.JButton();
        bMemory8 = new javax.swing.JButton();
        bMemory9 = new javax.swing.JButton();
        bMemory10 = new javax.swing.JButton();
        bMemory11 = new javax.swing.JButton();
        bMemory12 = new javax.swing.JButton();
        bQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(595, 530));
        setResizable(false);

        jLabel1.setText("Valememory");

        bMemory1.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory1.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory1.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory1.addActionListener(this::bMemory1ActionPerformed);

        bMemory2.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory2.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory2.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory2.addActionListener(this::bMemory2ActionPerformed);

        bMemory3.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory3.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory3.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory3.addActionListener(this::bMemory3ActionPerformed);

        bMemory4.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory4.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory4.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory4.addActionListener(this::bMemory4ActionPerformed);

        bMemory5.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory5.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory5.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory5.addActionListener(this::bMemory5ActionPerformed);

        bMemory6.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory6.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory6.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory6.addActionListener(this::bMemory6ActionPerformed);

        bMemory7.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory7.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory7.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory7.addActionListener(this::bMemory7ActionPerformed);

        bMemory8.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory8.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory8.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory8.addActionListener(this::bMemory8ActionPerformed);

        bMemory9.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory9.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory9.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory9.addActionListener(this::bMemory9ActionPerformed);

        bMemory10.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory10.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory10.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory10.addActionListener(this::bMemory10ActionPerformed);

        bMemory11.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory11.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory11.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory11.addActionListener(this::bMemory11ActionPerformed);

        bMemory12.setMaximumSize(new java.awt.Dimension(120, 120));
        bMemory12.setMinimumSize(new java.awt.Dimension(120, 120));
        bMemory12.setPreferredSize(new java.awt.Dimension(120, 120));
        bMemory12.addActionListener(this::bMemory12ActionPerformed);

        bQuit.setText("Quit");
        bQuit.addActionListener(this::bQuitActionPerformed);

        jLayeredPane1.setLayer(bMemory1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bMemory12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bQuit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bQuit))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(bMemory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bMemory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(bMemory5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bMemory6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(bMemory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bMemory4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(bMemory7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bMemory8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(bMemory9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bMemory10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bMemory11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bMemory12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMemory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bMemory6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bMemory9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMemory12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bQuit)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMemory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory1ActionPerformed
        handleCardClick(0);
    }//GEN-LAST:event_bMemory1ActionPerformed

    private void bQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bQuitActionPerformed

    private void bMemory2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory2ActionPerformed
        handleCardClick(1);
    }//GEN-LAST:event_bMemory2ActionPerformed

    private void bMemory4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory4ActionPerformed
        handleCardClick(3);
    }//GEN-LAST:event_bMemory4ActionPerformed
 
    private void bMemory5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory5ActionPerformed
        handleCardClick(4);
    }//GEN-LAST:event_bMemory5ActionPerformed

    private void bMemory3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory3ActionPerformed
        handleCardClick(2);
    }//GEN-LAST:event_bMemory3ActionPerformed

    private void bMemory6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory6ActionPerformed
        handleCardClick(5);
    }//GEN-LAST:event_bMemory6ActionPerformed

    private void bMemory7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory7ActionPerformed
        handleCardClick(6);
    }//GEN-LAST:event_bMemory7ActionPerformed

    private void bMemory8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory8ActionPerformed
        handleCardClick(7);
    }//GEN-LAST:event_bMemory8ActionPerformed

    private void bMemory9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory9ActionPerformed
        handleCardClick(8);
    }//GEN-LAST:event_bMemory9ActionPerformed

    private void bMemory10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory10ActionPerformed
        handleCardClick(9);
    }//GEN-LAST:event_bMemory10ActionPerformed

    private void bMemory11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory11ActionPerformed
        handleCardClick(10);
    }//GEN-LAST:event_bMemory11ActionPerformed

    private void bMemory12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMemory12ActionPerformed
        handleCardClick(11);
    }//GEN-LAST:event_bMemory12ActionPerformed

    private void handleCardClick(int index) {
        if (gameWon || isChecking) {
            return;
        }

        // Can't click on already matched or revealed cards
        if (cardMatched[index] || cardRevealed[index]) {
            return;
        }

        cardRevealed[index] = true;

        if (firstCardIndex == -1) {
            // First card clicked
            firstCardIndex = index;
            updateDisplay();
            return;
        } else if (secondCardIndex == -1) {
            // Second card clicked
            secondCardIndex = index;
            isChecking = true;
            updateDisplay();

            // Both cards clicked, check after delay
            Timer timer = new Timer(DELAY_TIME, e -> {
                checkMatch();
                updateDisplay();

                if (cardMatched[firstCardIndex] && cardMatched[secondCardIndex]) {
                    JOptionPane.showMessageDialog(null, "Match Found! " + matchedPairs + "/6");
                    if (matchedPairs == 6) {
                        gameWon = true;
                        JOptionPane.showMessageDialog(this, "🎉 You Won! All pairs found!");
                        resetGame();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No match. Try again!");
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    private void checkMatch() {
        if (cardValues[firstCardIndex] == cardValues[secondCardIndex]) {
            // Match found
            cardMatched[firstCardIndex] = true;
            cardMatched[secondCardIndex] = true;
            matchedPairs++;
        } else {
            // No match - hide cards
            cardRevealed[firstCardIndex] = false;
            cardRevealed[secondCardIndex] = false;
        }

        // Reset for next turn
        firstCardIndex = -1;
        secondCardIndex = -1;
        isChecking = false;
    }

    private void updateDisplay() {
        for (int i = 0; i < 12; i++) {
            javax.swing.JButton btn = cardButtons[i];
            
            if (cardMatched[i]) {
                btn.setText("✓");
                btn.setEnabled(false);
                btn.setBackground(new java.awt.Color(144, 238, 144)); // Light green
                btn.setOpaque(true);
            } else if (cardRevealed[i]) {
                btn.setText(String.valueOf(cardValues[i]));
                btn.setEnabled(true);
                btn.setBackground(new java.awt.Color(173, 216, 230)); // Light blue
                btn.setOpaque(true);
            } else {
                btn.setText("?");
                btn.setEnabled(true);
                btn.setBackground(javax.swing.UIManager.getColor("Button.background"));
                btn.setOpaque(false);
            }
        }
        jLabel1.setText("Valememory - Pairs: " + matchedPairs + "/6");
    }

    private void resetGame() {
        initializeGame();
        gameWon = false;
        updateDisplay();
    }

    
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new MemoryProject().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMemory1;
    private javax.swing.JButton bMemory10;
    private javax.swing.JButton bMemory11;
    private javax.swing.JButton bMemory12;
    private javax.swing.JButton bMemory2;
    private javax.swing.JButton bMemory3;
    private javax.swing.JButton bMemory4;
    private javax.swing.JButton bMemory5;
    private javax.swing.JButton bMemory6;
    private javax.swing.JButton bMemory7;
    private javax.swing.JButton bMemory8;
    private javax.swing.JButton bMemory9;
    private javax.swing.JButton bQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
