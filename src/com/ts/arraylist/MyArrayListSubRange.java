package com.ts.arraylist;

import java.util.ArrayList;
import java.util.List;
 
public class MyArrayListSubRange {
	
	//Program: How to get sub list from ArrayList?
	//Here we can see example for getting ArrayList content based on range of index. By specifing the start and end index of the range, you can get the sub-list.
 
    public static void main(String a[]){
        List<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Click");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = arrl.subList(2, 4);
        System.out.println("Sub List: "+list);
    }
}