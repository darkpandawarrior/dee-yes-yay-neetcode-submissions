# NeetCode submissions in Kotlin

My solutions from [NeetCode](https://neetcode.io), one folder per problem, all in Kotlin. I do the practice in the language I write Android in, so the habits carry over.

The solution files are not committed by hand. NeetCode's GitHub integration pushes each submission as a commit titled `Add: <problem> - submission-N`, and that is the only reason the files look the way they do. The README is the one thing I edit.

## What is in the tree

On 2026-11-06 there are 56 problem folders under `Data Structures & Algorithms/` (the folder name really does have spaces and an ampersand, quote it in a shell) holding 67 `.kt` files. Most folders have one file. Ten have more than one, because I re-submitted a better or cleaner version; the highest is `invert-a-binary-tree` with three. The number in `submission-N.kt` is NeetCode's own counter and does not always start at 0.

```
Data Structures & Algorithms/
  climbing-stairs/
    submission-1.kt
    submission-2.kt
  house-robber/
    submission-0.kt
```

Each file is just the `Solution` class NeetCode asks for, with its own helper types (`ListNode`, `TreeNode`) supplied by the site, so a single file does not compile on its own.

## How the 56 split by topic

Grouped by me from the problem names, since the repo itself stores no topic tag.

| Topic | Folders |
|---|---|
| Trees | 10 |
| Arrays and hashing | 9 |
| Linked lists | 6 |
| Graphs | 5 |
| Intervals | 5 |
| Bit manipulation | 5 |
| Sliding window | 4 |
| Two pointers | 3 |
| Dynamic programming | 3 |
| Binary search | 2 |
| Plain string problems | 2 |
| Stack | 1 |
| Heap | 1 |

The gaps are real. There is no trie, no backtracking and only three DP problems (climbing stairs and both house robbers), so this is a partial run through the NeetCode list, not a finished one.

## Running one

There is no build file. To try a solution, paste it into a scratch Kotlin file or the NeetCode editor along with the helper type it needs. Nothing here is tested beyond NeetCode's own judge.
