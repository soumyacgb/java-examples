package com.ts.hashset;

import java.util.HashSet;

public class MyHashSetRetain {
	
	//Program: How to compare two sets and retain elements which are same on both sets?
	
	//Below example shows how to compare two sets, and retain the values which are common on both set objects. By calling retainAll() method you can do this operation.
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("apple");
        hs.add("rat");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("rat");
        subSet.add("second");
        subSet.add("first");
        hs.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hs);
    }
}
