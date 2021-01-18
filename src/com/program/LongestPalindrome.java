package com.program;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class LongestPalindrome {
    static int beginIndex, strSize;

    public static String checkLongestPalindrome(String strVal) {
        int strLength = strVal.length();
        if (strLength == 1) {
            return strVal;
        } else {
            for(int i = 0; i < strLength - 1; ++i) {
                filterValue(strVal.toLowerCase(), i, i);
                filterValue(strVal.toLowerCase(), i, i + 1);
            }
            return strVal.substring(beginIndex, beginIndex + strSize);
        }
    }

    private static void filterValue(String str, int begin, int end) {
        while(begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            --begin;
            ++end;
        }
        storeIndexAndLength(begin, end);
    }

    private static void storeIndexAndLength(int begin, int end) {
        if (strSize < end - begin - 1) {
            beginIndex = begin + 1;
            strSize = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        String value = checkLongestPalindrome("HelloWelcomeemoclewHelloolle");
        System.out.print("The value is: " + value);
    }
}
