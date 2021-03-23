package TestingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10; arr[1] = 10; arr[2] = 4;
		System.out.println(arr.length);
		System.out.println(" Values in Array: "+Arrays.toString(arr));
		List<Integer> li = new ArrayList<Integer>();
		li = DuplicateElements.ConvertArrayToList(arr);
		System.out.println("Values of List: "+li);
		Collections.sort(li);
		System.out.println(li);
	}
		public static ArrayList ConvertArrayToList(int arr1[]) {
			ArrayList al1 = new ArrayList<Integer>();
			for(Integer i: arr1) {
				al1.add(i);
			}
			return al1;
			//ArrayList al = new ArrayList();
			//al = (ArrayList) al1;
			//return al;
		}
}
