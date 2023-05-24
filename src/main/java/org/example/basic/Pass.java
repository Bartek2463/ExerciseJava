package org.example.basic;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Pass {

    public static void main(String[] args) {
//        timeAsAString(367);
//stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "CSQ 890", "BRTY 600"},
     //    new String[] {"A","C"});
//sumLength(new String[]{"asdfg","qwertyu","gthyukder","tgbnmpsawrc","bnm"},2);
//snail(new int[][]{{1, 2, 3,4,7,3},
//        { 5, 6,7,8,5,6},
//        { 9,7,4,1,6,7},
//        {4,5,6,7,8,9},
//        {2,5,7,3,2,9},
//        {1,3,6,7,9,8},});

 solveSuperMarketQueue(new int[] { 3,7,2,6,5,3,4,7,4,5,1,6,4,5,3,3,3,6,5,1,4,1,1}, 6);
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

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter){
//        List<String> strings = Arrays.asList(lstOf1stLetter);
//
//        Map<String,Integer> stockList = new HashMap<>() ;
//
//          for (int i = 0;i<lstOfArt.length;i++){
//
//              String[] s = lstOfArt[i].split(" ");
//              stockList.put(s[0],Integer.parseInt(s[1]));
//          }
//
//
//        List<String> collect = stockList.entrySet().stream()
//                .map(t -> t.getKey().substring(0, 1))
//                .filter(t->t==strings.stream().iterator().next())
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        if (lstOfArt.length == 0) return "";
//        final int space = lstOfArt[3].indexOf(" ");
//        System.out.println(space);
//        Stream.of(lstOf1stLetter).map(c->c+" : "+Stream.of(lstOfArt));

        return "";
    }

    public static  String sumLength(String[] word, int k){

        for (int i = 0;i<word.length;i++){
            System.out.println(word[i].length());
        }


        return "";
    }
    public static int[] snail(int[][] array) {
        int[] result = new int[array.length*array.length];
        if(array.length==1)
            return array[0];
        int e=0;
        int rs=0, re=array.length-1, cs=0, ce=array.length-1;
        for(int i=0; i<array.length/2; i++){
            for(int r=rs; r<=re; r++){
                result[e++] = array[cs][r];
            }
            cs++;
            for(int c=cs; c<=ce; c++){
                result[e++] = array[c][re];
            }
            re--;
            for(int r=re; r>=rs; r--){
                result[e++] = array[ce][r];
            }
            ce--;
            for(int c=ce; c>=cs; c--){
                result[e++] = array[c][rs];
            }
            rs++;
        }
        if(array.length%2!=0){
            result[e]=array[rs][cs];
        }

        return result;
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
      int[]result = new int[n];
      for (int i = 0;i< customers.length;i++){
         result[0] = result[0]+customers[i];
          Arrays.sort(result);
      }
      return result[n-1];
    }

}
