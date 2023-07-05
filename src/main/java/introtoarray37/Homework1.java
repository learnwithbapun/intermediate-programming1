package introtoarray37;

/*
 * 
 * Q1. Max Min of an Array


Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109


Input Format
First argument A is an integer array.


Output Format
Return the sum of maximum and minimum element of the array


Example Input
Input 1:

A = [-2, 1, -4, 5, 3]
Input 2:

A = [1, 3, 4, 1]


Example Output
Output 1:

1
Output 2:

5


Example Explanation
Explanation 1:

Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1. 
Explanation 2:

Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 */
public class Homework1 {
	
	public int solve(int[] A) {

		int max = A[0];
		int min = A[0];

		for (int i = 0; i < A.length ; i++) {
			if (A[i] > max) {
				max = A[i];
			}
			if (A[i] < min) {
				min = A[i];
			}

		}
		return min + max;
	}
}
