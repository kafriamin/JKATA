# JKataUM
JKataUM is a kata machine program that will help you practice your Data Structure
and Algorithm skills without needing to write your own test. So you can focus on
just on the algorithm and data structure code that you want to write.

> [!IMPORTANT]
> This project is not fully finish

## Available Algorithm
- Linear Search
- Binary Search
- Bubble Sort
- Insertion Sort
- Selection Sort
- Merge Sort
- Linked List (NEW!)

## Setting up
clone this git repo into your desired directory / folder

```bash
git clone https://github.com/kafriamin/jKataUm.git
```

if you are using an IDE like `Netbeans`, `IntelliJ`, `Eclipse`, `etc`, 
you can import this gradle project in your IDE after you have cloned it.

> [!NOTE]
> Since this project uses gradle build tool, the first time you import the project, 
it's going to take a while for your IDE
to set it up. But once it set up, the second time you ran it shouldn't be a problem

## Usage
You can start practicing writing your code in `app/src/main/java/kata` directory.
Choose which one you want to do and just write your algorithm.

### Testing
After you've write your code, head over to your built in IDE terminal, and run
```bash
gradle test --tests 'kata.Kata.bubbleSort'
```
> [!NOTE]
> Replace bubbleSort with your target test. If you're unsure what is your target,
look the instruction below

To get available `target` run

```bash
gradle listKata
```

## Feature Coming Up
- Stack
- Queue
- Priority Queue
- Graph

> [!NOTE]
> Please submit an issue if you've encountered any bug