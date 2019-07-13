package com.ts.linkedlist;

import java.util.LinkedList;

public class MyPushPopOpr {
	
	//Program: LinkedList push(), pop() operations examples.
	//Below example shows how to call push() and pop() methods on LinkedList objects.

	//push(): Pushes an element onto the stack represented by this list.
	//pop(): Pops an element from the stack represented by this list.
 
    public static void main(String a[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        arrl.push("push element");
        System.out.println("After push operation:");
        System.out.println(arrl);
        arrl.pop();
        System.out.println("After pop operation:");
        System.out.println(arrl);
    }
}
