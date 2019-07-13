package com.ts.vector;

import java.util.Vector;

public class ClearMyVector {
	
	//Program: How to delete all elements from my vector?
	//Below example shows how to remove all elements from vector at once. You can call clear() method to delete all elements of a vector at one call.
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        vct.clear();
        System.out.println("After clear vector:"+vct);
    }
}
