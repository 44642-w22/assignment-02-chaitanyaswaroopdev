/**
 * 
 */
package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * @author S545622 (Chaitanya Swaroop Udata)
 *
 */
public class ProblemThree {

	/**
	 * @param args
	 */
	public void ProblemThree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("======= Problem Three =======");
		System.out.print("Enter Number of Elements:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements:- ");

		for (int i = 0; i < n; i++) {
			int ele = sc.nextInt();
			arr[i] = ele;

		}

		Set<Integer> res = printSequentialSet(arr);
		System.out.println("Input (A1): "+Arrays.toString(arr));
		System.out.print("Output (S): "+res);
	}

	public static Set<Integer> printSequentialSet(int[] input) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			int ele = input[i];
			while (set.contains(ele)) {
				ele++;
			}
			set.add(ele);
		}
		return set;
	}

}
