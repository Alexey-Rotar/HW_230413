package org.example.hw230413.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("  a good    example  "));
    }

    /**
     *
     * @param originalStr Исходная строка;
     * @return Строка со словами, раcположенными в обратном порядке, без лишних пробелов;
     */
    public static String reverseString(String originalStr) {
        originalStr = originalStr.trim();
        String[] words = originalStr.split(" ");
        String resultStr = "";
        for (int i = words.length - 1; i >= 0; i--) {
            resultStr += words[i];
            if (i > 0 && words[i].length() > 0)
                resultStr += " ";
        }
        return resultStr;
    }
}