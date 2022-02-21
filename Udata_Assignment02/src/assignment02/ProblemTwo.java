/**
 * 
 */
package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author S545622 (Chaitanya Swaroop Udata)
 *
 */
public class ProblemTwo {

	/**
	 * @param args
	 */
	public void ProblemTwo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("======= Problem Two =======");
		System.out.print("Enter Number of Strings:- ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " Strings:- ");

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			arr[i] = s;

		}

		Map<String, String> res = concatStrings(arr);
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
		System.out.print("Output (M1): {");
		count = 0;
		for (Map.Entry<String, String> entry : res.entrySet()) {
			count++;
			if (count != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

		}
		System.out.print("}");
	}

	public static Map<String, String> concatStrings(String[] input) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			String s = input[i];
			map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
		}

		return map;
	}
}
