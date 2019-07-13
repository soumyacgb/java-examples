package com.ts.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
 
public class MyElementCheck {
	
	//Program: How to find does vector contains all list elements or not?
	//Below example shows how to find whether a vector contains list of objects or not. The method containsAll() helps us to find the match.
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
        list.add("one");
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
    }
}