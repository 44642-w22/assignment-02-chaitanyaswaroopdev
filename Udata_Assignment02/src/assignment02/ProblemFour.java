/**
 * 
 */
package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * @author S545622 (Chaitanya Swaroop Udata)
 *
 */
public class ProblemFour {

	/**
	 * @param args
	 */
	public void ProblemFour() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("======= Problem Four =======");
		System.out.print("Enter number of Strings:- ");
		int n = sc.nextInt();
		ArrayList<String> input = new ArrayList<>();
		System.out.println("Enter " + n + " Elements:-");

		for (int i = 0; i < n; i++) {
			String ele = sc.next();
			input.add(ele);

		}

		ArrayList<String> res = removeDuplicateChars(input);
		System.out.print("Input (A1): [");
		int count = 0;
		for (int i = 0; i < input.size(); i++) {
			count++;
			if (count != input.size())
				System.out.print("\"" + input.get(i) + "\",");
			else
				System.out.print("\"" + input.get(i) + "\"");
		}
		System.out.println("]");

		System.out.print("Output (A2): [");
		count = 0;
		for (int i = 0; i < res.size(); i++) {
			count++;
			if (count != res.size())
				System.out.print("\"" + res.get(i) + "\",");
			else
				System.out.print("\"" + res.get(i) + "\"");
		}
		System.out.println("]");
//		System.out.println(res);

	}

	public static ArrayList<String> removeDuplicateChars(ArrayList<String> input) {
		ArrayList<String> res = new ArrayList<>();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < input.size(); i++) {
			String s = input.get(i);
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				if (!set.contains(c)) {
					sb.append(c);
					set.add(c);
				}
			}
			res.add(sb.toString());

			set.clear();
		}
		return res;
	}

}
