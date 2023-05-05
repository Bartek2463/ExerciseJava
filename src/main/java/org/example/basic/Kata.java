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
        System.out.println(squareDigitsSt(9119));

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

        String collect = String.valueOf(n)
                .chars()
                .map(t -> Integer.parseInt(String.valueOf((char) t)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));


        return Integer.parseInt(collect);
    }

}

