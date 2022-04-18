# Algorithms-etc.

## answer(numbers)

### --Integer Array Instructions loop - how many entities are we infinitely looping through?

 - Java loop to count how many elements are involved in an infinite loop.
Parent loop goes starts at element 0 and steps to the index indicated at that location each time.
Simply call main.
 - To change interger array input values, go to main, which passes the array to the only method - "answer(numbers)".

 - Alternative explanation: Program to loop through given integer array, each increment stepping to index
indicated by previous element integer value, until an infinite loop is established. Program then counts number of
elements involved in that infinite loop.
 - Swarthy Example: If the numbers list were [1, 2, 3, 4, 3]. Pirate 0 redirects to pirate 1, who redirects to pirate 2,
who redirects to pirate 3, who redirects to pirate 4, who redirects back to pirate 3. Then, we are stuck going between
 pirate 3 and pirate 4 forever. There are two pirates in this loop, thus the answer would be 2. Note that even though
 you visited pirates 0, 1, and 2, they are not part of the loop and don’t factor into the answer.
