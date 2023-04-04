package org.example.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
//        System.out.println(findNeedle(new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}));
        System.out.println(findNeedle1(new Object[]{"3", "needle", "123124234", null, "world", "hay", 2, "3", true, false}));
    }
  public static String findNeedle(Object[] haystack){
      List<String> strings = Arrays.stream(haystack).map(String::valueOf)
              .map(String::toString)
              .collect(Collectors.toList());
      return "found the needle position  "+strings.indexOf("needle");
  }
  public static String findNeedle1(Object[]haystack){
        return String.format("found the needle at position %d",Arrays.asList(haystack).indexOf("needle"));
  }
}
