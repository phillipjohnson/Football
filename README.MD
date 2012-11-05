Football Pool Simulator
=======================

At my work we have a pool that about 30 people go in on every week during college football season. This program simulates that pool and calculates how much money the person has at the end of season. This data can then be copied into your program of choice for analysis.

Rules
-----
###Cost
- The cost to play is $2.00 per week for all "normal" games (12 games)
- The cost to play is $5.00 for the big rivalry game (OSU vs. Michigan)
- The cost to play is $5.00 for the bowl game, if OSU goes to a bowl

###The draw
Each player draws a number ranging from 0 to 9 randomly. There are a set amount of each number (3) that ensures there is the same amount of winners each week.

###Winning
The scores of both teams are added and the ones digit of the sum is the winning number. For example, if the scores are 14 and 3, the sum is 17 and the winning number is 7. This is done for both the half-time and final scores. This means that there are usually two winning numbers each week, although it is possible for the winning number to be the same for half time and end game.

###Payout
All money collected is paid out to the winners. Assuming 30 players, each winner receives $10 for normal games and $25 for the "expensive" games.

Simulation
---

The simulation makes some assumptions.

- Each week the player is the first to pick his number.
- The likeliness of each ones digit score is based on the final scores of the past 60 years of OSU college football scores. Half-time scores were not easily available, so I assumed the same likelihood for both half-time and final.
- The team will go to a bowl game.

Analysis
---

The two $5.00 games really dominate the odds of coming out ahead since they are equivalent in cost to half of the regular season ($10.00 vs $12.00).

The worst case scenario where the player loses every game happens about 6% of the time.

The most common amount to lose is $7.00.

There is a 42.16% chance of coming out ahead.

The most a player could come out ahead is $288, but this is all but impossible. The odds of this happening are 1.375x10^(-22)%.

For each *individual* player, the odds of winning are worse than almost every casino game, including Keno. However, in this pool, because it is a close group and the house takes no profit. *someone* has to win every week.
