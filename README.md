# Recursion and Binary Search

## 1. Recursive Fibonacci

In this task I used recursion to find Fibonacci numbers.

The function calls itself two times:
`fibonacci(n - 1)` and `fibonacci(n - 2)`.

When `n` is 0 or 1, the function stops.

### Examples

- fibonacci(5) = 5
- fibonacci(7) = 13
- fibonacci(10) = 55

### Recursive calls example

For `fibonacci(5)`:

fibonacci(5)
├── fibonacci(4)
│   ├── fibonacci(3)
│   └── fibonacci(2)
└── fibonacci(3)
    ├── fibonacci(2)
    └── fibonacci(1)

The function continues calling itself until it reaches 0 or 1.

2. Iterative Binary Search

In this task I used Binary Search with a while loop.

The array has to be sorted.

The algorithm checks the middle element. If the target is smaller,
I search in the left part. If the target is bigger, I search in the
right part.

Examples

Array:

[1, 3, 5, 7, 9, 11, 13, 15]
Target 7 → index 3
Target 13 → index 6
Target 4 → -1

For example, when searching for 13, the search area becomes smaller
after every iteration until 13 is found.

3. Recursive Binary Search

For this task I changed Binary Search to a recursive version.

Instead of using a while loop, the function calls itself with a new
search range.

If the target is smaller than the middle element, it searches the left
part. Otherwise, it searches the right part.

Examples
Target 7 → index 3
Target 13 → index 6
Target 4 → -1

The main difference is that the iterative version uses a loop, while
the recursive version uses function calls.
