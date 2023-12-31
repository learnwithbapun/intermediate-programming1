package introtoarray37;
/*
 * Q1. Count of elements


Problem Description
Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First and only argument is an array of integers A.


Output Format
Return the count of elements.


Example Input
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output
Output 1:
2
Output 2:
1


Example Explanation
Explanation 1:
The elements that have at least 1 element greater than itself are 1 and 2
Explanation 2:
The elements that have at least 1 element greater than itself is 3
 */
public class Assignment2 {
	public int solve(int[] A) {
		int max = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (max != A[i]) {
				count++;
			}
		}
		return count;
	}
}
