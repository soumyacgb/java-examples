package com.ts.arraylist;

import java.util.ArrayList;
import java.util.List;
 
public class MyArrayListNewCollection {
	
	//Program: How to add all elements of a list to other list?
 
    public static void main(String a[]){
        List<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);
    }
}
