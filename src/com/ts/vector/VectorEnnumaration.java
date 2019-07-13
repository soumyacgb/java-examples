package com.ts.vector;

import java.util.Enumeration;
import java.util.Vector;
 
public class VectorEnnumaration {
	//Program: How to read all elements in vector by using Enumeration?
	//Below example shows how to iterate through vector using Enumeration object. You can get Enumeration object by calling elements() method.
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        Enumeration<String> enm = vct.elements();
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}