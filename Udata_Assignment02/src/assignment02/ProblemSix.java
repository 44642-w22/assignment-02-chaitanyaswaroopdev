/**
 * 
 */
package assignment02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author S545622 (Chaitanya Swaroop Udata)
 *
 */
public class ProblemSix {

	/**
	 * @param args
	 */
	public void ProblemSix() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("======= Problem Six =======");
		System.out.print("Enter Number of Strings:- ");
		int n = sc.nextInt();
		ArrayList<String> input = new ArrayList<>();
		System.out.println("Enter " + n + " Elements:- ");

		for (int i = 0; i < n; i++) {
			String ele = sc.next();
			input.add(ele);

		}

		Map<String, Boolean> res = setBooleanMap(input);
		System.out.print("Input (S1): [");
		int count = 0;
		for (int i = 0; i < input.size(); i++) {
			count++;
			if (count != input.size())
				System.out.print("\"" + input.get(i) + "\",");
			else
				System.out.print("\"" + input.get(i) + "\"");
		}
		System.out.println("]");

		System.out.print("Output (M1): {");
		count = 0;
		for (Map.Entry<String, Boolean> entry : res.entrySet()) {
			count++;
			if (count != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ", ");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());

		}
		System.out.print("}");
	}

	public static Map<String, Boolean> setBooleanMap(ArrayList<String> input) {

		Map<String, Boolean> map = new HashMap<>();
		for (int i = 0; i < input.size(); i++) {
			if (map.containsKey(input.get(i))) {
				map.put(input.get(i), true);
			} else {
				map.put(input.get(i), false);
			}
		}
		return map;
	}

}
