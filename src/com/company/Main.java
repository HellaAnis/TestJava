package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println("partition = " + partition(arrayList, 2));
	}

	public static List<ArrayList<Integer>> partition(ArrayList<Integer> liste,
		int taille)
	{

		ArrayList<Integer> init = liste;
		ArrayList<ArrayList<Integer>> result = new ArrayList();
		ArrayList<Integer> integerArrayList = new ArrayList<>();

		int i = 0;
		int j = 0;
		while (i < init.size()) {
			while (j < taille && (i+j) < init.size()) {
				integerArrayList.add(init.get(i+j));
				j++;
			}
			i = i + j;
			j = 0;
			result.add(integerArrayList);
			integerArrayList = new ArrayList<>();
		}
		return result;
	}
}
