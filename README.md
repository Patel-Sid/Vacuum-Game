# Vacuum-Game
We are implementing a simple game. The game board is a 2-dimensional grid. Each cell in this grid represents either a section of hallway, a piece of wall, or a dumpster. We denote a wall with the symbol X, a hallway with a blank space, and dumpster with U. There are two players in this game | two vacuums. We denote them with symbols 1 and 2. Some of the cells are dirty: they contain dust (the symbol .) or dust balls (the symbol o). The vacuums' objective is to clean up as many dirty cells as possible. The dust is stationary, but the dust balls move about the grid and each cell that a dust ball visits becomes (or stays) dusty when the dust ball leaves. The game ends when all dirt (dust and dust balls) is gone. The vacuum with the higher score wins, or, if the two scores are equal, we declare a tie.
