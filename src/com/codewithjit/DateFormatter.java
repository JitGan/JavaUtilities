package com.codewithjit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class DateFormatter {

    public static void main(String[] args){
        Date today = new Date();
        System.out.println(today.toString());
        System.out.println(today.getTime());
        SimpleDateFormat ft = new SimpleDateFormat("E MMM.dd.yyyy. 'At' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(today));
        System.out.printf("%1$s %2$tb %2$te, %2$tY", "Due date:", today);
        System.out.printf("%n%s %tB %<te, %<tY", "Due date:", today);
        System.out.printf("%n%s %tD", "Due date:", today);

        Calendar bd = Calendar.getInstance();
        bd.set(Calendar.MONTH,01);
        bd.set(Calendar.DATE,23);
        bd.set(Calendar.YEAR,1998);
        Date bday = bd.getTime();
        System.out.printf("%n%s %tD", "My Birthday is on:", bday);
    }
}
