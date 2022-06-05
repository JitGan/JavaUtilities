package com.codewithjit;
import java.util.*;
import java.text.*;
class DateDemo{

    public static final String NAME="JAVA";
    static int x = 10;
    public static void main(String args[]) {
        String str1=new String("Reddy");
        String str2=new String("Reddy");
        System.out.println("\n String Comparison with == :"+(str1==str2));
        System.out.println("String Comparison with equalsmethod :"+str1.equals(str2));

        int a[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.print(a[3] == b[0][2]);
        System.out.print(" " + (a[2] == b[2][1]));

        System.out.print(" " + (a[2]));
        System.out.print(" " + ( b[2][1]));

            for (int x=0;x<5;x++){
            }
            System.out.print(x);

        Date date = new Date();

        System.out.println(date.toString());

        try {
            printDate(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printDate(Date dNow) throws Exception{
        try {
            SimpleDateFormat ft =
                    new SimpleDateFormat("yyyy.MM.dd");

            String result = ft.format(dNow);
            System.out.println("Current Date: " + result);

            String date = "1971.01/01";

            System.out.println("Test:"+ ft.parse(date));

            // Reading file //open connections
        }catch (Exception e){
            System.out.println("Error:"+e);
            throw new Exception("Invalid Date Format");
        }finally {
            //close resources

        }
    }
}