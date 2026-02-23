import java.util.HashMap;
import java.util.ArrayList;
public class PracticeProblem {
	public static void main(String args[]) {
	}
	public static void swap(ArrayList<String> list, int int1, int int2) {
		String temp = list.get(int1);
		list.set(int1, list.get(int2));
		list.set (int2, temp);
		}
	public static ArrayList<Double> createArrayList(double[] arr) {
			ArrayList<Double> list = new ArrayList<Double>();
			for (double num : arr) {
            	list.add(num);
            }
			return list;
		}	
	public static HashMap<String, Integer> combineParallelArrays (String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}
	public static void increaseAge(HashMap<String, Integer> map, String s) {
		map.put(s, map.get(s) + 1);
	}
}