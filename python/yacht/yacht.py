"""
This exercise stub and the test suite contain several enumerated constants.

Since Python 2 does not have the enum module, the idiomatic way to write
enumerated constants has traditionally been a NAME assigned to an arbitrary,
but unique value. An integer is traditionally used because it’s memory
efficient.
It is a common practice to export both constants and functions that work with
those constants (ex. the constants in the os, subprocess and re modules).

You can learn more here: https://en.wikipedia.org/wiki/Enumerated_type
"""

# Score categories.
# Change the values as you see fit.
YACHT = lambda dice: 50 if dice.count(dice[0]) == len(
    dice) else 0  # or len(set(dice)) == 1 when list is casted to set, all duplicates has been removed
ONES = lambda dice: len(list(filter(lambda x: x == 1, dice))) * 1
TWOS = lambda dice: len(list(filter(lambda x: x == 2, dice))) * 2
THREES = lambda dice: len(list(filter(lambda x: x == 3, dice))) * 3
FOURS = lambda dice: len(list(filter(lambda x: x == 4, dice))) * 4
FIVES = lambda dice: len(list(filter(lambda x: x == 5, dice))) * 5
SIXES = lambda dice: len(list(filter(lambda x: x == 6, dice))) * 6
FULL_HOUSE = lambda x: sum(x)
FOUR_OF_A_KIND = None
LITTLE_STRAIGHT = lambda x: 30 if sum(x) == 15 else 0
BIG_STRAIGHT = lambda x: 30 if sum(x) == 20 else 0
CHOICE = lambda x: sum(x)


def score(dice, category):
    return category(dice)
