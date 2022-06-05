package com.codewithjit;

import java.util.*;

public class CollectionTest {
    public static void main(String args[]){
        testArrayList();
        testHashMap();
    }

    public static void testArrayList(){
        int num=5;
        do{
            int n=num--;
            System.out.println("n:"+n);
            System.out.println(n + "    ");
        }while (num==0);

        List<String> list=new ArrayList();
        list.add("Robb");
        list.add("Bran");
        list.add("Rick");
        list.add("Bran");

        if(list.remove("Bran")){
            list.remove("Jon");
        }
        //#1 Iterator
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            String element=(String)iterator.next();
            System.out.println("ArrayList Element in while:"+element);
        }
        //#2  Dynamic For loop
        for(String element:list){
            System.out.println("ArrayList Element in for loop:"+element);
        }

    }
    public static void testHashMap (){
        Map<Integer,String> map = new HashMap();
        map.put(1, "Joe");
        map.put(2,"Nick");
        Iterator iterator= map.keySet().iterator();
        while(iterator.hasNext()){
            Integer key = (Integer) iterator.next();
            System.out.println("HashMap:"+key+" "+map.get(key));
        }

    }
}
