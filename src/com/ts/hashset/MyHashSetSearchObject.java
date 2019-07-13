package com.ts.hashset;

import java.util.HashSet;

public class MyHashSetSearchObject {
 
    public static void main(String a[]){
         
        HashSet<Price1> lhs = new HashSet<Price1>();
        lhs.add(new Price1("Banana", 20));
        lhs.add(new Price1("Apple", 40));
        lhs.add(new Price1("Orange", 30));
        for(Price1 pr:lhs){
            System.out.println(pr);
        }
        Price1 key = new Price1("Banana", 20);
        System.out.println("Does set contains key? "+lhs.contains(key));
    }
}
 
class Price1{
     
    private String item;
    private int Price1;
     
    public Price1(String itm, int pr){
        this.item = itm;
        this.Price1 = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = Price1*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price1) {
            Price1 pp = (Price1) obj;
            return (pp.item.equals(this.item) && pp.Price1 == this.Price1);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice1() {
        return Price1;
    }
    public void setPrice1(int Price1) {
        this.Price1 = Price1;
    }
     
    public String toString(){
        return "item: "+item+"  Price1: "+Price1;
    }
}
