# MemoryProject

A Memory Game implementation in Java Swing (incomplete)

## Overview

This is an incomplete Memory Game project created with NetBeans. The GUI is set up with 12 buttons arranged in a 4x3 grid, but the core game logic needs to be implemented.

## Current Status

### Implemented:
- ✅ GUI with 12 memory buttons (120x120 pixels)
- ✅ Quit button (functional)
- ✅ Window frame and layout
- ✅ Event listeners connected to all buttons

### Not Implemented:
- ❌ Game logic (card matching)
- ❌ Card state tracking (revealed/hidden)
- ❌ Shuffle and pair system
- ❌ Win condition
- ❌ Visual feedback on button clicks

## Project Structure

```
MemoryProject/
├── src/
│   └── recources/
│       └── MemoryProject.java
├── nbproject/
├── build.xml
├── manifest.mf
└── build/
```

## Build & Run

### Using NetBeans:
1. Open the project in NetBeans
2. Press `F6` to run

### Using Command Line:
```bash
ant run
```

## What Needs to Be Done

1. **Create Game Logic Class**
   - Array to store card pairs (6 pairs, 12 cards total)
   - Shuffle logic
   - State tracking (revealed/hidden)

2. **Implement Card Click Handlers**
   - Track first and second card clicks
   - Check for matches
   - Handle reveal/hide with delay
   - Disable buttons during verification

3. **Add Visual Feedback**
   - Display card values (numbers or symbols)
   - Change button appearance when revealed
   - Show matched pairs

4. **Win Condition**
   - Detect when all pairs are found
   - Display victory message
   - Option to play again

## Author

Valentino Amori
