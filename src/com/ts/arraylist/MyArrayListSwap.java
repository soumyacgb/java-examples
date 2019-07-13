package com.ts.arraylist;

import java.util.ArrayList;
import java.util.Collections;
 
public class MyArrayListSwap {
	
	//Program: How to swap two elements in a ArrayList?
	//This example gives how to swap two elements in the ArrayList. By calling Collections.swap() method you can swap two elements of the ArrayList. You have to pass the indexes which you need to swap.
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
         
        Collections.swap(list, 2, 5);
        System.out.println("Results after swap operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}
