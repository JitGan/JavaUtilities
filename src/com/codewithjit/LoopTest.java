package com.codewithjit;

import com.codewithjit.MyOwnException;

import java.util.Scanner;
public class LoopTest {


    public static void main(String[] args) throws MyOwnException {
        /*#1 Loops
        int i = 0;
        while (i < 10) {
            System.out.println("i:"+i);
            i = i + 1;}
        for (int i = 0; i < 10; i++) {
            System.out.println("i:"+i);
        }



        // Find out leap year.
        int year = 2001;
        if (year % 4 == 0) {
            System.out.println("Leap Year:"+year);
        } else {
            System.out.println(year + " is not a Leap Year");
        }


        boolean test = i < 0 ? true : false;
        System.out.println("test:"+test);
        */
        try {
            LoopTest loopTest = new LoopTest();
            Scanner myNum1 = new Scanner(System.in);
            System.out.println("Enter First Number");
            double num1 = myNum1.nextDouble();
            Scanner myNum2 = new Scanner(System.in);
            System.out.println("Enter Second Number");
            double num2 = myNum2.nextDouble();
            loopTest.addNum(num1, num2);
            loopTest.getMin(num1, num2);
            loopTest.division(num1, num2);

            Scanner myFname = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName = myFname.nextLine();
            Scanner myMname = new Scanner(System.in);
            System.out.println("Enter Middle Name");
            String middle = myMname.nextLine();
            Scanner myLname = new Scanner(System.in);
            System.out.println("Enter Last Name");
            String lastName = myLname.nextLine();

            String fullname = loopTest.getFullName(firstName, middle, lastName);
            loopTest.getLastName(fullname);

            double d1 = 99.89;
            System.out.println("double:" + d1);
            int intDouble = (int) d1;
            System.out.println("intDouble:" + intDouble);

            double d2 = intDouble;

            String strDouble = d1 + "";

            StringBuffer sb = new StringBuffer();
            sb.append("");

            double d3 = Double.parseDouble(strDouble);

            int N =100;
            for (int i=1; i<=N; i++){
                if (loopTest.isPrime(i)){
                    System.out.println(i+ " ");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception :"+e);
            throw new MyOwnException("My Own Error");
        }
    }

    //Write a method which will return addition of two numbers
    public double addNum(double num1, double num2) {
        double total = num1 + num2;
        System.out.println("Total:" + total);
        return total;

    }

    //Write a method which will return the reminder when two decimals are passed
    public double division(double num1, double num2) {
        double ans = num1 % num2;
        System.out.println("Remainder:" + ans);
        return ans;
    }

    // Write a method which will return full name, when first, middle and last name is passed
    public String getFullName(String firstName, String middle, String lastName) {
        String fullname = firstName + " " + middle + " " + lastName;
        System.out.println("FullName:" + fullname);
        return fullname;
    }

    // Write a method which should return last name if full name is passed, Hint : Use substring
    public String getLastName(String fullname) {
        String[] arr = fullname.split(" ", 3);
        System.out.println("Last Name:" + arr[2]);
        String lastName = fullname.substring(13);
        System.out.println("Last Name:" + lastName);
        return lastName;
    }

    //find min of two numbers
    public double getMin(double num1, double num2) {
        double minNum;
        if (num1 > num2) {
            minNum = num2;
            System.out.println("Min:" + minNum);
        } else if (num1 < num2) {
            System.out.println("Min:" + num1);
            minNum = num1;
        } else {
            System.out.println("Both numbers are the same");
            minNum = 0;
        }
        return minNum;

    }
    public boolean isPrime (int n ){
        if (n==1 | n==0)
            return false;
        for (int i=2; i<n; i++){
            if (n%i==0) return false;
        }
            return true;
    }
}