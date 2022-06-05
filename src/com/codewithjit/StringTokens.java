package com.codewithjit;
import java.util.StringTokenizer;

public class StringTokens {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Jitesh", " ");
        //System.out.println("Next token is : " + st.nextToken(" "));
        System.out.println("Number of tokens: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //System.out.println("Number of tokens: " + st.countTokens());
    }

}


