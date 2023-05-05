package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        int hour = now.getHour();
       if (hour>=3 && hour<=10){
           System.out.println("Morning");
       }else if (hour>10 && hour<12){
           System.out.println("Until Noon");
       }else if (hour>=12 && hour<=16){
           System.out.println("After Noon");
       }else if (hour>16 && hour<=19){
           System.out.println("Evening");
       }else {
           System.out.println("Night");
       }
        int day = now.getDayOfWeek().getValue();
        String dayFreeOrWorkingOrHoliday = day == 6 ? "Day Off" : day == 7 ? "Holiday" : "Working Day";
        System.out.println(dayFreeOrWorkingOrHoliday);
        String payment = now.getDayOfMonth() <= 10 && now.getDayOfMonth()>=1 ? "Before Payment" : "After Payment";
        System.out.println(payment);

        int dayOfMonth = now.getMonth().getValue();

        String s = dayOfMonth >= 3 && dayOfMonth<=5 ? "Spring" : (dayOfMonth > 5 && dayOfMonth <= 8) ? "Summer" : dayOfMonth > 8 && dayOfMonth<=11 ? "Jesien" : "Zima";

        System.out.println(s);

//        test(new int[]{1,2,5,10,20});
//        fieldValidator(new int[][]
//                {{1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
//                        {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
//                        {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
//                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
//                        {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
//                        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
//                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}});
    }

    public static boolean fieldValidator(int [][] field){

        for (int i = 0;i< field.length;i++){
            for (int j = 0;j<field[i].length;j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        return false;
    }

    public static  int test( int[] tab){
        int sum = 0;
        while (sum==100){
        for (int i =0;i<1;i++){



         }}
        System.out.println(sum);
       return 5;
    }

}