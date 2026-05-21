# MemoryProject - Complete Memory Game

A fully functional Memory Game implementation in Java Swing.

## Overview

This is a complete Memory Game with 12 cards (6 pairs) where players must find matching pairs by clicking on cards. The game features a graphical UI built with Java Swing.

## Features

✅ **Implemented:**
- 12 memory cards (4×3 grid, 120×120 pixels each)
- 6 matching pairs (numbers 1-6)
- Automatic card shuffling at game start
- Click-based card reveal system
- Match detection with feedback
- Visual feedback:
  - `?` for hidden cards
  - Number for revealed cards
  - `✓` for matched pairs (green background)
- 1-second delay between card flips
- Win condition detection
- Pair counter display
- Quit button
- Auto-reset on win

## Game Logic

### How to Play:
1. Click on any card to reveal it
2. Click on a second card
3. If the cards match → they stay revealed with a green background and `✓`
4. If they don't match → they flip back after 1 second
5. Find all 6 pairs to win!

## Project Structure

```
MemoryProject/
├── src/recources/
│   ├── MemoryProject.java      # Main GUI class
│   ├── GameLogic.java          # Game logic and state management
│   └── Card.java               # Card model class
├── nbproject/                  # NetBeans project files
├── build/                      # Compiled classes
├── build.xml                   # Ant build script
└── manifest.mf                 # JAR manifest
```

## Classes

### Card.java
- Represents a single card with value, revealed state, and matched state
- Properties: value, revealed, matched

### GameLogic.java
- Manages game state and logic
- Creates and shuffles 6 pairs of cards
- Handles card clicks and match checking
- Detects win condition
- Methods:
  - `handleCardClick(int)` - Process card click
  - `checkMatch()` - Verify if two cards match
  - `isGameWon()` - Check win condition
  - `resetGame()` - Reset for new game

### MemoryProject.java
- GUI frame with 12 buttons
- Integrates GameLogic
- Handles visual updates and user interaction

## Build & Run

### Using Java Compiler Directly:
```bash
cd src/recources
javac -source 21 -target 21 -d ../../build/classes *.java
cd ../.. 
java -cp build/classes recources.MemoryProject
```

### Using NetBeans:
1. Open the project
2. Press `F6` to run

## Requirements
- Java 21 or compatible version
- No external dependencies (uses only javax.swing)

## Game Screenshots

- **Hidden State**: Cards show `?`
- **Revealed State**: Cards show their number (1-6)
- **Matched State**: Cards show `✓` with green background and are disabled

## Future Enhancements

- [ ] Difficulty levels (different grid sizes)
- [ ] Timer/Score tracking
- [ ] Sound effects
- [ ] Themes/Skins
- [ ] Leaderboard
- [ ] Card flip animation

## Author

Valentino Amori

## License

MIT
