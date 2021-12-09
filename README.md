# Algorithmic problem

Moles have infested a 16x16 area.
The fences of your gardens are outlined on maps with |, + and - symbols.
The mole hills are represented by a lower-case o.
How many mole hills are in your gardens?

- Two parallel fences of the garden cannot touch (it wouldn't make sense).
- Garden space is filled with white space unless there is a mole hill. Other space is filled with dots unless there is a mole hill.
- Everything that touches the outside of the map and is not enclosed in fences is other space. A fence is always between garden space and other space.
- Mole hills cannot be on fences.

## Challenge

Implement an algorithm with a programming language of your choice to count the mole hills in your gardens.

## Input
16 lines of 16 symbols, representing the map of the area.

## Output
An integer for the number of mole hills in your gardens.

## Constraints
16 lines of 16 symbols.

## Test case 01
**Input:** 
```
................
................
..+----------+..
..|          |..
..|   o      |..
..|      o   |..
..|          |..
..+----------+..
................
............o...
.....o..........
................
.........o......
................
................
................
```
**Output:**
```2```

## Test case 02
**Input:**
```
................
................
...+-------+.o..
.o.|  o o  |..o.
...|       |....
...| o  +--+.oo.
...|    |.......
...+----+.......
................
........oo......
................
...o............
................
...........o....
................
................
```
**Output:**
```3```

## Test case 03
**Input:**
```
................
................
.oo.+------+oooo
.oo.|  o   |.oo.
oooo|oooooo|....
....+--+ o |.oo.
.......| o |....
....oo.|o ++.oo.
....oo.+--+o.oo.
................
......ooo.......
................
................
................
................
................
```

**Output:**
```10```

## Test case 04
**Input:** 
```
+--+....o..o....
| o|............
|  |......o.....
|o +---+........
|      |....+--+
|  o   |....|oo|
|      |....|oo|
+------+..o.+--+
................
.....oo.........
................
+--------------+
|          o   |
|          o   |
|              |
+--------------+
```

**Output:**
```9```

## Test case 05
**Input:** 
```
.....o..........
.+-------+..o.o.
.|       |.oo...
.|    o  |ooooo.
.|       |oo....
.|oo+-+oo+--+oo.
.|  |.|     |o..
.|  |.|     +-+.
.|oo|o|       |.
.|  |.|       |.
.|  |.|ooo   o|.
.|  |.|       |.
.|  |.|  oo   |.
.|  |.|       |.
.+--+o+-------+.
...............o
```

**Output:**
```13```

## Test case 06
**Input:**
```
+--------------+
|    o       o |
+----------+  ++
..........++ ++.
....o....++ ++..
........++ ++...
.......++ ++....
.oo...++o++...o.
.....++ ++......
....++ ++.......
...++ ++....oo..
..++ ++....o....
.++ ++..........
++o +----------+
|       o      |
+--------------+
```

**Output:**
```5```

## Test case 07
**Input:**
```
+--------------+
|   o      oo  |
| +----------+o|
| |..........| |
| |.+------+o|o|
| |.|      |.| |
| |o| +--+o|.| |
| |.| |oo|o|.| |
| |.| +--+ |.| |
| |.|  oo  |.| |
| |.|oooooo|.| |
| |.+------+o|o|
|o|..........| |
|o+----------+ |
|      o   o   |
+--------------+
```

**Output:**
```20```

## Test case 08
**Input:**
```
oooooo+--+oooooo
o+--+o|oo|o+--+o
o|oo+-+oo+-+oo|o
o++oooooooooo++o
oo+-+o+--+o+-+oo
oooo|o|oo|o|oooo
o+--+o+--+o+--+o
++oooooooooooo++
|oooooooooooooo|
+--------------+
oooooooooooooooo
o+-+oo+--+oo+-+o
++o|oo|oo|oo|o++
|oo+--+oo+--+oo|
|oooooooooooooo|
+--------------+
```

**Output:**
```74```
