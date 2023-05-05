package org.example.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pass {

    public static void main(String[] args) {
        timeAsAString(367);
    }

    public class Util {
        public String name;
        public int value;

        public Util(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    public static String timeAsAString(int seconds) {
        List<String> collect = Arrays.stream(new String[]{
                        formatTime("year", (seconds / 60 * 60 * 24 * 365)),
                        formatTime("day", (seconds / 60 * 60 * 24) % 365),
                        formatTime("hour", (seconds / 60 * 60) % 24),
                        formatTime("minute", (seconds / 60) % 60),
                        formatTime("second", (seconds % 3600) % 60)})
                .collect(Collectors.toList());
        System.out.println(collect);
        return "";

    }

    private static String formatTime(String s, int time) {
        return time == 0 ? "" : Integer.toString(time) + " " + s + (time == 1 ? "" : "s");
    }

}
