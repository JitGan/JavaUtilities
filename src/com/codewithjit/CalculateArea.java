package com.company;

public class CalculateArea {
    public double area(double length, double width,String type){
        double area =0.0;
        if(type.equals("rectangle") || type.equals("square")) {
            area = length * width;
        }else if(type.equals("circle")){
            area=Math.PI*length*length;
        }
        return area;
    } 

    public static void printEvenNumbers(int n){
        System.out.print("Even Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
    }
    public static void printPrimeNumber(int intVal) {
        System.out.print("Prime numbers from 1 to " +intVal + " are");
        for (int p = 2; p < intVal; p++) {
            int count = 1;
            for (int j = 2; j < p; j++) {
                if (p % j == 0) {
                    count = 0;
                    break;
                }

            }
            if (count == 1) {
                System.out.println(p);

            }


        }
    }
    public static void printLeapYear (int intYr) {
        boolean leap;
        if(intYr % 4 == 0)
        {
            if( intYr % 100 == 0)
            {
                if ( intYr % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = false;
        }
        else
            leap = false;

        if(leap)
            System.out.println(intYr + " is a leap year.");
        else
            System.out.println(intYr + " is not a leap year.");
    }
public static void printStringLength (String Str1 ){
    System.out.print("String Length :" );
    System.out.println(Str1.length());

}
public static void printReverseString (String Str2){
        System.out.print("String in reverse :");
    Str2 = new StringBuilder(Str2).reverse().toString();
    System.out.println(Str2);


}




    public static void main(String[] args) {
        com.company.CalculateArea m=new com.company.CalculateArea();
        //# 1 Print Even Numbers
            printEvenNumbers(100);

        //#2 Area
            double length = 4.5;
            double width = 8.0;
            double area = m.area(length,width,"rectangle");
        System.out.println("\n");
            System.out.println("Area of Rectangle is:"+area);

        //#3
        area=m.area(12,0,"circle");
        System.out.println("\n");
        System.out.println("Area of Circle is:"+area);

        //#4
        printPrimeNumber(20);

        //#5
        printLeapYear(2000);

        //#6
        printStringLength("Jitesh Gandluru");

        //#7
        printReverseString("Jitesh Gandluru");

        //#8




    }
}