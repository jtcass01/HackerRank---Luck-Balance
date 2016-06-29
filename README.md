# HackerRank---Luck-Balance
HackerRank week of code 21

**************************************************************************************************************************************
Instructions for this problem are hard to read since some of the special characters and given values would not copy and paste over.  See the website link in the description for a better description
**************************************************************************************************************************************

Your submission will run against only preliminary test cases. Full test cases will run at the end of the day.
Lena is preparing for important coding competition that is preceded by  sequential preliminary contests. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers,  and :

 is the amount of luck that can be gained by winning the contest. If Lena wins the contest, her luck balance will decrease by ; if she loses it, her luck balance will increase by .
 denotes the contest's importance rating. It's equal to  if the contest is important, and it's equal to  if it's unimportant.
If Lena loses no more than  important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

Input Format

The first line contains two space-separated integers,  (the number of preliminary contests) and  (the maximum number of important contests Lena can lose), respectively. 
Each line  of the  subsequent lines contain two space-separated integers,  (the contest's luck balance) and (the contest's importance rating), respectively.

Constraints

Output Format

Print a single integer denoting the maximum amount of luck Lena can have after all the contests.

Sample Input

6 3
5 1
2 1
1 1
8 1
10 0
5 0
Sample Output

29
Explanation

There are  contests. Of these contests,  are important (so she cannot lose any more than  of them). Lena maximizes her luck if she wins the  important contest (where ) and loses all of the other five contests for a total luck balance of .
