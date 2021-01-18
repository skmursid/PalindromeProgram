package com.program;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class LongestPalindrome {
    static int beginIndex, strSize;

    /**
     * In this method first we are checking if the total length is more than 1 or not.
     * Then we are calling the method filterValue which will check for odd and even
     * palindrome sequence
     * @param strVal
     * @return
     */
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

    /**
     * Here basically the iteration will check from left to right.And our target is to find
     * matching element in the middle. If match is found,then begin will traverse to left and
     * end will traverse to right. Both begin and end traverse left and right, till match is found.
     * @param str
     * @param begin
     * @param end
     */
    private static void filterValue(String str, int begin, int end) {
        while(begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            --begin;
            ++end;
        }
        storeIndexAndLength(begin, end);
    }

    /**
     *Also at the same time, we are storing the beginIndex and checking the total length.
     *So that we can pick the substring out of it which is the longest palindrome.
     * @param begin
     * @param end
     */
    private static void storeIndexAndLength(int begin, int end) {
        if (strSize < end - begin - 1) {
            beginIndex = begin + 1;
            strSize = end - begin - 1;
        }
    }

    /**
     * Entry point of Palindrome program
     * @param args
     */
    public static void main(String[] args) {
        String value = checkLongestPalindrome("HelloWelcomeemoclewHelloolle");
        System.out.print("The value is: " + value);
    }
}
