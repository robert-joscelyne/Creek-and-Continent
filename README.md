# The Creek and Continent Shop kata
Bases on the popular Gilded Rose kata
## Setup

This repository includes the initial setup for this Kata, including the tests. 
Your job is to:

1. Refactor the monstrous code in the `CreekAndContinent.java` class.
2. Add a new item type, "Homeware Hand Towel". The specs for this item are commented out in the `CreekAndContinentTest.java` file.

When finished (or for help), you may review the solution by switching to the "solution" branch of this repo.

## Rules

Hi and welcome to team Creek and Continent. As you know, we are a small inn with a prime location in a prominent city ran by a friendly assistant named Allison. We also buy and sell only the finest goods. Unfortunately, with fashion trends constantly changing, prices as they approach their sell by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures.

**Your task is to add the new feature to our system so that we can begin selling a new category of items.**

First an introduction to our system:

- All items have a SellIn value which denotes the number of days we have to sell the item before the fashion trend changes
- All items have a Price value which denotes how valuable the item is
- At the end of each day our system lowers both values for every item by 1

Pretty simple, right? Well this is where it gets interesting:

- Once the sell by date has passed, Price price reduces twice as fast
- The Price of an item is never negative
- "Japanese Denim" actually increases in Price the older it gets
- The Price of an item is never more than 50
- "White Vest Top", being a stable of the wardrobe, never has to be sold or decreases in price
- "Fashion Show Tickets", like Japanese Denim, increases in Price as it's SellIn value approaches; Price increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but Price drops to 0 after the fashion show.

We have recently signed a supplier of Homeware items. This requires an update to our system:

Being new to the Homeware market we want to sell our new product quickly so items reduce in Price twice as fast as normal items

Just for clarification, an item can never have its Price increase above 50, however "White Vest Top" is a legendary item and as such its price be any value and never alters.
