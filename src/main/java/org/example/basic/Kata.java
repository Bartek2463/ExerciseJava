package org.example.basic;

import javax.swing.text.html.parser.Parser;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
//        System.out.println(findNeedle(new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}));
//        System.out.println(findNeedle1(new Object[]{"3", "needle", "123124234", null, "world", "hay", 2, "3", true, false}));
//        System.out.println(number(new int[]{1, 2, 3,4}, 2));
//        Kata kata = new Kata();
//        System.out.println(kata.min(new int[]{-1, 4, 5, 6, -100}));
//        System.out.println(kata.max(new int[]{-1, 4, 5, 6, -100}));
//        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
//        squareDigits(9119);
//        System.out.println(squareDigitsSt(9119));
//        System.out.println(getGrade(95,90,93));
//updateLight("green");
         int[] ints = new int[]{9,5,3,7,8,2,1};

         for (int x : tabSort(ints,0,ints.length-1)){
             System.out.println(x);
         }


    }

    public static String findNeedle(Object[] haystack) {
        List<String> strings = Arrays.stream(haystack).map(String::valueOf)
                .map(String::toString)
                .collect(Collectors.toList());
        return "found the needle position  " + strings.indexOf("needle");
    }

    public static String findNeedle1(Object[] haystack) {
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }

    public static int number(int[] array, int n) {
        try {
            return (int) Math.pow(array[n], n);
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    public int min(int[] minn) {
        return IntStream.of(minn).min().getAsInt();
    }

    public int max(int[] max) {
        return IntStream.of(max).max().getAsInt();
    }

    public static long ipsBetween(String start, String end) {


        return convertAdresToLong(end) - convertAdresToLong(start);
    }

    public static long convertAdresToLong(String ip) {
        long sum = 0;
        for (String number : ip.split("[.]")) {
            sum = sum * 256 + Long.parseLong(number);
        }
        return sum;
    }

    public static int squareDigits(int n) {
        String value = "";
        String parseNumber = String.valueOf(n);
        for (int i = 0; i < parseNumber.length(); i++) {
            char c = parseNumber.charAt(i);
            int numericValue = Character.getNumericValue(c);
            value += numericValue * numericValue;
        }
        return Integer.parseInt(value);

    }

    public static int squareDigitsSt(int n) {

       return Integer.parseInt( String.valueOf(n)
                .chars()
                .map(v->Integer.parseInt(String.valueOf((char)v)))
                .map(i->i*i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int avr = (s1 + s2 + s3)/3;
        return avr>=90?'A':avr>=80?'B':avr>=70?'C':avr>=60?'D':'F';
    }

    public static String updateLight(String current) {

        switch (current){
            case "red" : return "green";
            case "green" : return "yellow";
            case "yellow" : return "red";
            default:throw new IllegalArgumentException();
        }

    }

    public static int[] tabSort(int[]tab, int low, int high ){

        if (low<high){
            int pivotIndex = partition(tab, low, high);
            tabSort(tab,low,pivotIndex);
            tabSort(tab,pivotIndex+1,high);

        }

return tab;
    }

    private static int partition(int[] tab, int low, int high) {
        int pivot = tab[low];
        int q = high+1;
        int p = low-1;
        while (true){
            do {
                p++;
            }while (tab[p]<pivot);
            do {
                q--;
            }while (tab[q]>pivot);
            if (p>=q){
                return q;
            }
            int temp = tab[p];
            tab[p] = tab[q];
            tab[q]= temp;
        }
    }
}

