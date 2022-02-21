/**
 * 
 */
package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author S545622 (Chaitanya Swaroop Udata)
 *
 */
public class ProblemOne {

	/**
	 * @param args
	 */
	public void ProblemOne() {
		// TODO Auto-generated method stub
		System.out.println("======= Problem One =======");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Strings:- ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " Strings:- ");

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			arr[i] = s;

		}

		Map<String, Integer> res = countStrings(arr);
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (count != arr.length)
				System.out.print("\"" + arr[i] + "\",");
			else
				System.out.print("\"" + arr[i] + "\"");
		}
		System.out.println("]");
		System.out.print("Output: ");
		count = 0;
		for (Map.Entry<String, Integer> entry : res.entrySet()) {
			count++;
			if (count != res.size()) {
				System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
			} else {
				System.out.print(entry.getKey() + "-" + entry.getValue());
			}
		}
	}

	public static Map<String, Integer> countStrings(String[] input) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}
		return map;

	}
}
