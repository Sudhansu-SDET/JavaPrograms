package practiceprograms;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Javaprograms {

    public static void printfunc(String[] mystr) {
        for (String item : mystr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void showList(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }


    // <-------------PROGRAMS------------------->
    @Test(description = "Reverse a string to check whether a string is a Palindrome")
    public void test1() {
        String str = "nitin";
        StringBuffer str1 = new StringBuffer(str);

        if (str.equals(str1.reverse().toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    @Test(description = "Another approach to check whether a string is a Palindromen")
    public void test2() {
        String str = "notin";

        int i = 0;
        int j = str.length() - 1;

        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;

        }

        if (flag) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }

    @Test(description = "Reverse a string")
    public void test3() {
        StringBuffer str = new StringBuffer("sudhansu");
        System.out.println(str.reverse());

    }

    @Test(description = "Reverse a string without inbuilt func - 2nd Approach")
    public void test4() {
        String str = "sudhansu";
        char[] myCharStr = str.toCharArray();
        String temp = "";
        for (int i = myCharStr.length - 1; i >= 0; i--) {
            //System.out.println(myCharStr[i]);
            temp += myCharStr[i];
        }
        System.out.println(temp);

    }

    @Test(description = "Count the number of words in a string")
    public void test5() {
        String str = "My Name is sudhansu p u i o ";
        String[] strarray = str.split(" ");
        System.out.println(strarray.length);


    }


    @Test(description = "Count the number of DUPLICATE / repeated words in a string using HashMap")
    public void test6() {
        String str = "My My Name Name is is sudhansu ricky patro";
        String[] strarray = str.split(" ");
        //Method 1 using HASHMAP
        int count = 1;
        Map<String, Integer> map = new HashMap<>();

        for (String s : strarray) {

            if (map.containsKey(s)) {

                map.put(s, count + 1);
            } else {
                map.put(s, count);
            }

        }

        System.out.println(map);

    }


    @Test(description = "find whether a number is prime or not")
    public void test7() {

        boolean flag = true;
        int num = 13;
        System.out.println(num);
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }


    }

    @Test(description = "filter out numbers from string")
    public void test8() {

        String str = "Ind12ia45";
        String newstr = str.replaceAll("[\\d]", "");//
        String newstr2 = str.replaceAll("[^\\d]", "");// replace
        //all non digits/character
        String newstr3 = str.replaceAll("[\\d]", "") + str.replaceAll("[^\\d]", "");// op: India1245
        System.out.println(newstr3);

    }

    @Test(description = "find unique numbers in an array - 1st Approach")
    public void test9() {
        int[] arr = {1, 1, 2, 4, 2, 5, 6, 3, 4};
        //Approach 1 - less time complexity using hashmap

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) System.out.println(entry.getKey());
        }

    }

    @Test(description = "remove duplicate numbers in an array")
    public void test10() {
        int[] arr = {1, 1, 2, 4, 2, 5, 6, 3, 4};
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }

    @Test(description = "find number of duplicate words")
    public void test11() {
        String mystring = "Big black bug bit a big black dog";
        int count = 0;

        String[] mystrarr = mystring.toLowerCase().split(" ");
//Approach 1
        for (int i = 0; i < mystrarr.length; i++) {
            for (int j = i + 1; j < mystrarr.length; j++) {
                if (mystrarr[i].equals(mystrarr[j])) {
                    count++;
                    System.out.println(mystrarr[i]);
                }
            }
        }

        //Approach 2
        Map<String, Integer> map = new HashMap<>();
        for (String str : mystrarr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        //System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }

        }

    }

    @Test(description = "sort the list of strings using Java collection")
    public void test12() {
        //Write code to sort the list of strings using Java collection?
        String[] myStArray = {"Beta", "Alpha", "alp", "Gamma", "beta"};

        printfunc(myStArray);

        Arrays.sort(myStArray);
        printfunc(myStArray);

        Arrays.sort(myStArray, String.CASE_INSENSITIVE_ORDER);
        printfunc(myStArray);
    }

    @Test(description = "Sorting")
    public void test13() {
        String[] inputList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec"};

        // Display input un-sorted list.
        System.out.println("-------Input List-------");
        showList(inputList);

        // Call to sort the input list.
        Arrays.sort(inputList);

        // Display the sorted list.
        System.out.println("\n-------Sorted List-------");
        showList(inputList);

        // Call to sort the input list in case-sensitive order.
        System.out.println("\n-------Sorted list (Case-Sensitive)-------");
        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

        // Display the sorted list.
        showList(inputList);
    }

    @Test(description = " sum of all elements in an array")
    public void test14() {
        int[] myArray = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : myArray)
            sum += num;
        System.out.println(sum);

    }

    @Test(description = "maximum difference between any adjacent index in array")
    public void test15() {
        int[] arr = {1, 4, 8, 15, 80, 99, 3, 5};

        int maxDiff = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        System.out.println("maximum difference is : " + maxDiff);
    }

    @Test(description = "compare same indexes of 2 array and create a third array with matching values")
    public void test16() {
        int[] a = {1, 4, 5, 7};
        int[] b = {6, 4, 3, 7};

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                arrayList.add(a[i]);
            }
        }
        System.out.println(arrayList);

    }

    @Test(description = "sort array in ascending and descending order")
    public void test17() {
        int[] a = {2, 6, 1, 4, 9};
        Integer[] b = {3, 1, 5, 2, 6};

        Arrays.sort(b, Collections.reverseOrder());
        Arrays.stream(b).forEach(System.out::println);
        int i;
        int j;
        int temp;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test(description = "swap with and without using third variable")
    public void test18() {
        int a = 4;
        int b = 5;

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a is  " + a);
        System.out.println("b is  " + b);


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is  " + a);
        System.out.println("b is  " + b);

    }

    @Test(description = "printing pyramid pattern as below")
    public void test19() {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // New line after each row
            System.out.println();
        }

        /////Inverted pyramid
        System.out.println("----------Inverted pyramid--------------");
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // New line after each row
            System.out.println();
        }

    }

    @Test(description = "printing fibonacci pattern using recursion")
    public void test20() {
        //    0  1 1 2 3 5 8 13
        int n1 = 0;
        int n2 = 1;
        int count = 8;

        System.out.println(n1 + "\n" + n2);
        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }


    @Test(description = "Distance between two characters in a string")
    public void test21() {
        String str = "abcdefghijkl";
        char ch1 = 'i';
        char ch2 = 'k';

        if (str.indexOf(ch1) == -1 || str.indexOf(ch2) == -1) System.out.println("Character not found in the string");
        else System.out.println("Distance is : " + Math.abs(str.indexOf(ch1) - str.indexOf(ch2)));

    }

    @Test(description = "count the number of repeating characters in a string")
    public void test22() {
        String str = "aabbcccdddddefffg";
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                count++;
            }
        }
        System.out.println("Count the number of repeating characters is : " + count);

    }

    @Test(description = "count the number of repeating words in a string  sentence using HashMap")
    public void test23() {
        String str = "This this is is is my Name Name";
        String[] strArray = str.toLowerCase().split(" ");
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String mystr : strArray) {
            map.put(mystr, map.getOrDefault(mystr, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                count++;
            }
        }
        System.out.println("Count the number of repeating words is : " + count);

    }

    @Test(description = "put _ between a lower case and upper case character in a string")
    public void test24() {
        String str = "SudhansuPatro";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i > 0 && Character.isLowerCase(str.charAt(i - 1)) && Character.isUpperCase(str.charAt(i)))
                sb.append("_");

            sb.append(str.charAt(i));
        }
        System.out.println(sb);

    }

    @Test(description = "find out distance between two characters in a string")
    public void test25() {

        //TBD
    }

    @Test(description = "common element from two arrays")
    public void test26() {
        String[] strArr1 = {"A", "B", "C"};
        String[] strArr2 = {"C", "D", "E"};

        for (int i = 0; i < strArr1.length; i++) {
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i].equalsIgnoreCase(strArr2[j])) {
                    System.out.println(strArr1[i]);
                }
            }
        }

        int[] intArr1 = {1, 2, 3, 4};
        int[] intArr2 = {3, 4, 5};

        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr1[i] == intArr2[j]) {
                    System.out.println(intArr1[i]);
                }
            }
        }

        //Approach 3 - using set
        System.out.println("hasset approach");
        Set<Integer> set = new HashSet<>();
        for (int i : intArr1)
            set.add(i);

        for (int j : intArr2) {
            if (set.contains(j)) System.out.println(j);
        }

    }

    @Test(description = "Add 2 array lists")
    public void test27() {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println(list1);

        list1.addAll(list2);
        System.out.println(list1);
    }

    @Test(description = "remove a particular character from a String")
    public void test28() {
        Character mychar = 'p';
        String str = "peek";
        StringBuilder sb = new StringBuilder();

        for (Character ch : str.toCharArray()) {
            if (ch != mychar) sb.append(ch);
        }
        System.out.println(sb);
    }

    @Test(description = "swap two String variables without third variable")
    public void test30() {
        String str1 = "hello";
        String str2 = "sudhansu";

        str1 = str1 + str2; //hellosudhansu
        str2 = str1.substring(0, str1.length() - str2.length());  //hello
        str1 = str1.substring(str2.length());

        System.out.println(str1 + " ------" + str2);

    }

    @Test(description = "count the number of words in a String")
    public void test31() {
        String str = "My Name is sudhansu patro";
        String[] myArr = str.split(" ");
        System.out.println(myArr.length);
    }

    @Test(description = "whether one string is a rotation of another / anagram")
    public void test32() {
        String str1 = "java";
        String str2 = "avaj";

        StringBuilder sb = new StringBuilder(str2);
        if (sb.reverse().toString().equalsIgnoreCase(str1)) System.out.println("yes , this is rotation/anagram");
        else System.out.println("no , this is not rotation/anagram");

    }

    @Test(description = "convert String to Integer and Integer to String")
    public void test33() {
        String str = "123";

// Method 1: Using Integer.parseInt()
        int num1 = Integer.parseInt(str);

// Method 2: Using Integer.valueOf()
        int num2 = Integer.valueOf(str);

        System.out.println("Integer: " + Integer.valueOf(str));
    }

    @Test(description = "check number of upper case , lower case , digits")
    public void test34() {

        String str = "India is my country 100%";
        int lowerCase = 0;
        int upperCase = 0;
        int digit = 0;
        int other = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isLowerCase(str.charAt(i))) lowerCase++;
            else if (Character.isUpperCase(str.charAt(i))) upperCase++;
            else if (Character.isDigit(str.charAt(i))) digit++;
            else other++;
        }


        System.out.println("Details are as follows : " + "lowerCase - " + lowerCase + " ; upperCase - " + upperCase + " , digits - " + digit + " ; others - " + other);


    }

    @Test(description = "check of two string are anagrams")
    public void test35() {
        String str1 = "listen";
        String str2 = "silenp";

        char[] strArray1 = str1.replace("\\s", "").toCharArray();
        char[] strArray2 = str2.replace("\\s", "").toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        System.out.println(Arrays.equals(strArray1, strArray2) ? "Anagram" : "Not Anagram");

    }

    @Test(description = "reverse each of the words in string")
    public void test36() {
        String str = "My Name is Sudhansu";
        StringBuilder sb2 = new StringBuilder();
        for (String eachStr : str.split(" ")) {
            String reversestr = new StringBuilder(eachStr).reverse().append(" ").toString();
            sb2.append(reversestr);
        }
        System.out.println(sb2);
    }

    @Test(description = "reverse words")
    public void test37() {
        //String str = "east west north south";
        String str = "I am good";
        String[] myStrArr = str.split(" ");
        String temp = "";
        for (int i = myStrArr.length - 1; i >= 0; i--) {
            temp += myStrArr[i];
            temp += " ";

        }
        System.out.println(temp);

        //---------Approach2-------------
        StringBuilder sb = new StringBuilder();
        System.out.println("---------Approach2---------");
        for (int i = myStrArr.length - 1; i >= 0; i--)
            sb.append(myStrArr[i]).append(" ");

        System.out.println(sb);

    }

    @Test(description = "capitalize each word")
    public void test38() {
        String str = "this is javatpoint";
        System.out.println(str.toUpperCase());

    }

    @Test(description = "find the repeated / duplicate characters in a string")
    public void test39() {
        //TBD

    }

    @Test(description = "sort integer array in ascending order ")
    public void test40() {
        Integer[] array = {20, 10, 25, 12, 36};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test(description = "sort integer array in descending order ")
    public void test41() {
        Integer[] array = {20, 10, 25, 12, 36};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }


    @Test(description = "iterate over hashmap and print key , values ")
    public void test42() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("sp1", 100);
        map.put("sp2", 200);
        map.put("sp3", 300);
        map.put("sp4", 400);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }

    @Test(description = "convert list to array ")
    public void test43() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("sp1");
        arrayList.add("sp2");
        arrayList.add("sp3");

        System.out.println(arrayList);

        String[] myArray = new String[arrayList.size()];

        arrayList.toArray(myArray);

        for (String m : myArray) {
            System.out.println(m);

        }
    }

    @Test(description = "find a string in another string")
    public void test44() {

        String str = "This is my world";
        String searchString = "my";
        if (str.contains(searchString)) System.out.println(searchString + " - is present in  - " + str);
        else System.out.println(searchString + " - is NOT present in  - " + str);
    }

    @Test(description = "find missing numbers")
    public void test45() {

        int[] arr1 = {1, 2, 5, 7, 4, 3};

        int numberOfElements = arr1.length + 1;
        int sumTotal = (numberOfElements * (numberOfElements + 1)) / 2; //n*n+1/2
        int sum = 0;
        for (int j : arr1) {
            sum = sum + j;
        }

        int missingNumber = sumTotal - sum;
        System.out.println("The missing number is " + missingNumber);
    }

    @Test(description = "find duplicates in an integer array ")
    public void test46() {
        //TBD

    }

    @Test(description = "Give Indexes of array elements which has sum=10 ")
    public void test47() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == 10) {
                    System.out.println("i is " + arr[i] + " , j is " + arr[j]);
                }
            }
        }
    }

    @Test(description = "Arrange it in increasing length order of words. i.e “for a This is new an”")
    public void test48() {
        String str = "for a This is new an";
        String[] arr = str.split(" ");
        Arrays.sort(arr, Comparator.comparing(String::length)); // ascending
        System.out.println("Ascending Order = " + Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("Descending Order = " + Arrays.toString(arr));

    }

    @Test(description = "find largest element in an array")
    public void test49() {
        int[] arr = {22, 9, 1, 25, 99, 45, 87, 100};
        int largestElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        System.out.println(largestElement);

    }

    @Test(description = "find largest element in a range in an array")
    public void test50() {
        int[] arr = {22, 9, 1, 25, 99, 45, 87, 34, 6, 8, 111, 223, 98};

        int min = 0;
        int max = 10;

        int largestElement = arr[min];

        for (int i = min; i <= max; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        System.out.println(largestElement);

    }

    @Test(description = "reverse/swap elements in an array")
    public void test51() {
        int[] arr = {22, 9, 1, 25, 99};

        int min = 0;
        int max = arr.length - 1;
        int temp;
        while (min < max) {
            temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;

            min++;
            max--;
        }

        System.out.println(Arrays.toString(arr));

        //Approach 2
        System.out.println("--------Approach 2----------");
        int[] reversearr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversearr[i] = arr[i];

        }
        System.out.println(Arrays.toString(reversearr));
    }

    @Test(description = "find if element present in array")
    public void test52() {
        int[] arr = {4, 7, 2, 1, 4, 9, 32};
        int checkValue = 99;
        //Approach 1using streams---
        System.out.println("----using streams----------");
        boolean found = Arrays.stream(arr).anyMatch(x -> x == checkValue);
        System.out.println(found ? "found" : "Not found");


        boolean flag = false;
        for (int item : arr) {
            if (item == checkValue) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("The element " + checkValue + " is present in array");
        else System.out.println("The element " + checkValue + " is not present in array");
    }

    @Test(description = "find if element present in array within a range")
    public void test53() {

        int[] arr = {4, 7, 2, 1, 4, 9, 32};
        int checkValue = 99;
        boolean flag = false;
        int startIndex = 2;
        int endIndex = 5;
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == checkValue) {
                System.out.println("Value found at Index " + i);
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("The element " + checkValue + " is present in array");
        else System.out.println("The element " + checkValue + " is not present in array");
    }


    @Test(description = "find if element present in 2D array")
    public void test54() {

        int[][] arr = {{4, 7, 2, 1}, {9, 8, 5}};
        int checkValue = 1;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == checkValue) {
                    System.out.println("Matching value found at " + "Row : " + i + " , Column : " + j);
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag ? "Value Found" : "Value not found");
    }

    @Test(description = "find maximum value in 2D array")
    public void test55() {

        int[][] arr = {{4, 7, 2, 1}, {9, 88, 5}};
        int maxValue = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("Maximum value in 2D array is " + maxValue);

    }

    //Approach 1
    @Test(description = "https://leetcode.com/problems/find-numbers-with-even-number-of-digits")
    public void test56() {

        int[] nums = {11, 34, 2, 6, 7895};
        int count = 0;
        for (int item : nums) {
            int length = Integer.toString(item).length();
            //System.out.println(length);
            if (length % 2 == 0) {
                count++;
                //System.out.println(item);
            }
        }
        System.out.println("The count is " + count);
    }


    //Approach 2
    @Test(description = "https://leetcode.com/problems/find-numbers-with-even-number-of-digits")
    public void test57() {

        int[] nums = {11, 34, 2, 6, 7895};
        int count = 0;
        for (int item : nums) {
            int length = numberOfDigits(item);
            if (length % 2 == 0) {
                count++;
                System.out.println(item);
            }
        }
        System.out.println("The count is " + count);
    }

    private int numberOfDigits(int item) {
        int number = 0;
        while (item > 0) {
            number++;
            item = item / 10;
        }
        return number;
    }

    //Approach1
    @Test(description = "https://leetcode.com/problems/richest-customer-wealth/")
    public void test58() {

        int[][] accounts = {{1, 5, 9, 3}, {7, 3, 90}, {3}};
        int maximumWealth = 0;
        for (int[] arr : accounts) {
            int sum = 0;
            for (int element : arr) {
                sum = sum + element;
            }
            if (sum > maximumWealth) {
                maximumWealth = sum;
            }
        }
        System.out.println("The largest wealth is " + maximumWealth);


    }

    @Test(description = "search for target element in binary search in ascending order sorted array")
    public void test59() {

        int[] arr = {-15, -10, -3, 1, 2, 13, 17, 22, 38, 45, 57, 60};

        int targetValue = 45;
        int foundAt = binarySearch(arr, targetValue);
        if (foundAt == -1) {
            System.out.println(targetValue + " is not present in the array ");
        } else System.out.println(targetValue + " is present in the array at index " + foundAt);

    }

    public int binarySearch(int[] arr, int targetValue) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (targetValue < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (targetValue > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

    @Test(description = "search for target element in binary search in descending order sorted array")
    public void test60() {

        int[] arr = {60, 55, 43, 37, 21, 11, 9, 3};

        int targetValue = 21;
        int foundAt = binarySearchDesc(arr, targetValue);
        if (foundAt == -1) {
            System.out.println(targetValue + " is not present in the array ");
        } else System.out.println(targetValue + " is present in the array at index " + foundAt);

    }

    public int binarySearchDesc(int[] arr, int targetValue) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (targetValue > arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (targetValue < arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

    @Test(description = "https://leetcode.com/problems/search-insert-position/discuss/1456649/simplest-java-solution-searching-ceiling-index-using-binary-search-100-faster")
    //ceiling of a number means the smallest element in a array , that is greater than or equal to the given number
    public void test61() {

        int[] arr = {1, 12, 23, 44, 57, 69, 73, 88};

        int targetValue = 10;
        int ceilingValue = binarySearch1(arr, targetValue);
        if (ceilingValue == -1) {
            System.out.println("Ceiling value for " + targetValue + " cannot be found as it is greater than the greatest element in the array");
        } else {
            System.out.println("The ceiling value of " + targetValue + " is " + ceilingValue);
        }
    }

    public int binarySearch1(int[] arr, int targetValue) {

        int startIndex = 0;
        int endIndex = arr.length - 1;
        if (targetValue > arr[endIndex]) {
            return -1;
        }
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (targetValue == arr[midIndex]) {
                return arr[midIndex];
            } else if (targetValue < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return arr[startIndex];
    }

    @Test(description = "find floor of a number in array")
    // . floor means the largest number in array which is less than or equal to target value

    public void test62() {

        int[] arr = {1, 9, 12, 24, 33, 45, 55};
        int targetValue = 2;
        int floorValue = binarySearch2(arr, targetValue);
        if (floorValue == -1) {
            System.out.println("Floor value for " + targetValue + " cannot be found as it is less than the smallest element in the array");
        } else {
            System.out.println("The floor value of " + targetValue + " is " + floorValue);
        }


    }

    public int binarySearch2(int[] arr, int targetValue) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        if (targetValue < arr[startIndex]) {
            return -1;
        }
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (targetValue == arr[midIndex]) {
                return arr[midIndex];
            } else if (targetValue < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return arr[endIndex];
    }


    @Test(description = "https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/")

    public void test63() {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 5;

        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        int[] result = {first, last};
        System.out.println("First and Last Positions are : " + Arrays.toString(result));


    }

    public int findPosition(int[] arr, int targetValue, boolean findStartValue) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int result = -1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (targetValue == arr[midIndex]) {
                result = midIndex;
                if (findStartValue) endIndex = midIndex - 1;
                else startIndex = midIndex + 1;
            } else if (arr[midIndex] > targetValue) endIndex = midIndex - 1;
            else startIndex = midIndex + 1;
        }

        return result;
    }


    @Test(description = "https://leetcode.com/problems/find-smallest-letter-greater-than-target/")
    //similar to ceiling of a number question
    public void test64() {

        char[] arr = {'c', 'f', 'j'};
        char targetValue = 'e';

        char smallestLetter = binarySearch4(arr, targetValue);

        System.out.println("The smallest letter greater than target-" + targetValue + " is " + smallestLetter);
    }


    public char binarySearch4(char[] arr, int targetValue) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (targetValue < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return arr[startIndex % arr.length];
    }

    @Test(description = "https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/")
    public void test65() {
// tbd = more practice required
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int targetValue = 10;
        int position = findPosition(arr, targetValue);
        System.out.println("The target " + targetValue + " is found in the sub array at index: " + position);
    }

    public int findPosition(int[] arr, int targetValue) {
        //start search with box of 2 elements
        int start = 0;
        int end = 1;

        while (targetValue > arr[end]) { // condition for the target to lie in the range
            int temp = end + 1;
            end = end + (end - start + 1) * 2; // end = previous end + size of box*2
            start = temp;
        }
        int foundAt = binarySearch5(arr, targetValue, start, end);
        return foundAt;
    }

    public int binarySearch5(int[] arr, int targetValue, int startIndex, int endIndex) {

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (targetValue < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (targetValue > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return startIndex;
    }


    @Test(description = "https://leetcode.com/problems/peak-index-in-a-mountain-array/")
    public void test66() {

        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2};
        int position = peakIndexInMountainArray(arr);
        System.out.println("The peak of the mountain is at index : " + position + " and the value is " + arr[position]);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) // you are in decreasing part of the array, this maybe the answer but continue searching in the left
            {
                end = mid;
            } else { // you are in ascending part of the array, this maybe the answer but continue searching in the right
                start = mid + 1;
            }
            //In the end , start will be == end and pointing to the largest number bcz of the two checks above
            //start and end are always tring to find max element in the above two check at the time
            // hence when they are pointing to 1 element , that is the maximum element i.e. peak of the mountain
        }
        return start;// you can return end also , as start == end at this time
    }


    @Test(description = "https://leetcode.com/problems/find-in-mountain-array/")
    public void test67() {
//TBD = FURTHER STUDY
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 1;
        int position = findInMountainArray(arr, target);
        System.out.println("The first occurance of the element is at index : " + position);
    }

    public int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        int secondTry = orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return secondTry;
        }
    }

    public int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) { // can search in both ascending and descending array

        boolean isAsc = arr[start] < arr[end];//check if asc or desc array

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    @Test(description = "https://leetcode.com/problems/search-in-rotated-sorted-array/")
    //TBD
    public void test68() {

    }


    //    @Test(description = "can we access private methods of a class in another class . Answer is yes using reflection API as below")
//    public void test69() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Absclass abs = new Absclass();
//        Method method = Absclass.class.getDeclaredMethod("private_method");
//        method.setAccessible(true);
//        method.invoke(abs);
//
//    }
    @Test(description = "tbd")
    @Parameters({"val1", "1"})
    public void test70() {
        //TBD

    }

    @Test(description = "Compose script to Display the Oddsum and Evensum from the list of array inputs")
    public void test71() {
        int arr[] = {2, 3, 6, 1, 5, 3};
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers = sumOfEvenNumbers + arr[i];
            } else sumOfOddNumbers = sumOfOddNumbers + arr[i];
        }
        System.out.println("Sum of Even numbers is : " + sumOfEvenNumbers);
        System.out.println("Sum of Odd numbers is : " + sumOfOddNumbers);
    }


    @Test(description = "Write program to find 1dt, 2nd , 3rd largest number from the array")
    public void test72() {
        Integer[] arr = {77, 25, 31, 6, 11, 59, 44, 98};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("1st Largest number : " + arr[0]);
        System.out.println("2nd Largest number : " + arr[1]);
        System.out.println("3rd Largest number : " + arr[2]);
    }

    @Test(description = "Convert string to lowercase and remove spaces and special characters")
    public void test73() {
        String str = "ABCD 1234 !@#$";
        str = str.toLowerCase().replace(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }

    @Test(description = "WAP to save username of students, input username and print valid if it contains alphanumeric and invalid if it contains any special charcters or spaces or duplicate")
    public void test74() {
        String str = "abcd123";
        Set<String> set = new HashSet<>();

        if (str.matches("[A-Za-z0-9]+")) {
            set.add(str);
            System.out.println(set);
        } else {
            System.out.println("invalid username");
        }
    }


    @Test(description = "WAP to count occurrences of characters in a string ")
    public void test75() {
        String str = "abcd123dfsdfs";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

    }

    @Test(description = "WAP to find the highest number from the array w/o using inbuilt method")
    public void test76() {

        //TBD
    }

    @Test(description = "Reverse a string without inbuilt func - best Approach")
    public void test77() {
        String str = "sudhansu";
        String reversestr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr = reversestr + str.charAt(i);
        }
        System.out.println(reversestr);
    }


    @Test(description = "WAP to Concatenate Characters From Each String , ip:[{“Rama”, “Test”, “Type”, “Tata”} –>> RTTTaeyamsptatea]")
    public void test78() {
        String finalValue = "";
        String[] arr = {"Rama", "Test", "Type", "Tata"};

        for (int i = 0; i < arr.length; i++) {
            for (String str : arr) {
                finalValue = finalValue + str.charAt(i);

            }
        }
        System.out.println(finalValue);
    }

    @Test(description = "WAP to Reverse characters Only From String" + "Input: today110is210my310interview" + "Output: yadot110si210ym310weivretni”")
    public void test79() {
        ///2 pointer approach
        //TBD
    }

    @Test(description = "WAP to Find the Number Of Times Substring Appears in a String\n" + "    String s =“sudhansu” How many times “su” is Getting repeated\n" + "    Input: sudhansu" + "    Output: 2")
    public void test80() {
        //TBD
    }

    @Test(description = "WAP to Order/reaarrange Characters Based On Number Of Occurrences\n" + "Input string: “dadeadrs”" + "Output: “dddaaers”")
    public void test81() {
        //TBD
    }


    @Test(description = "Write a Java Program to Print the Preceding Character By the Value / expand the string" + "Input: Welcome to Mis2is2ip2i" + "Output:Welcome to Mississippi")
    public void test82() {
        String inputStr = "Welcome to Mis2is2ip2i";

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isDigit(inputStr.charAt(i))) {
                int count = Character.getNumericValue(inputStr.charAt(i));
                Character charToAppend = inputStr.charAt(i - 1);
                while (count-- > 1) {
                    res.append(charToAppend);
                }
            } else {
                res.append(inputStr.charAt(i));
            }
        }

        System.out.println(res);
    }


    @Test(description = "Write a Java Program to Print Character And Count Of a Word:" + "Input= abbcccdeee" + "Output= a1b2c3d1e3")
    public void test83() {
        String inputStr = "abbcccdeee";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : inputStr.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        System.out.println(map);

    }


    @Test(description = "Reverse a string preserving space positions" + "Input : Help others" + "Output : sreh topleH")
    public void test84() {
        String inputStr = "Help others";

        char[] arr = inputStr.toCharArray();
        int start = 0;
        int end = inputStr.length() - 1;
        char temp;
        while (start < end) {
            if (arr[start] == ' ') {
                start++;
            } else if (arr[end] == ' ') {
                end--;
            } else {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }
        System.out.println(arr);
    }

    @Test(description = "WAP to Sort Array Of String According To String Length" + "Input { “Hi” , “maven” , “selenium ” , “java” }" + "Output { “Hi”, “java”, “maven” , “selenium” }")
    public void test85() {
        String[] arr = {"Hi", "maven", "selenium", "java"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-------Approach 2-----------");
        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(arr));
    }

    @Test(description = "WAP to find the first non-repeated character in a String?\n" + "Input: “minimum”" + "Output: n")
    public void test86() {
        String inputStr = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : inputStr.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    @Test(description = "TBD -- Print/sort Characters As Per the Number Of Occurrences" + "Input=”1222bbbbcccaaaammmmm”" + "Output=”1222cccbbbbaaaammmmm”")
    public void test87() {
        //TBD

    }

    @Test(description = "WAP For Sum Of Digits Of a String" + "Input : “Welcome[21], Java1How are you78" + "OutPut : 19 [2+1+1+7+8]")
    public void test88() {
        String inputStr = "Welcome[21], Java1How are you78";
        int res = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isDigit(inputStr.charAt(i))) {
                res = res + Character.getNumericValue(inputStr.charAt(i));
            }
        }
        System.out.println(res);
    }

    @Test(description = "Find Sum of numbers in given strings" + "Input : “Welcome[21], Java1How are you78" + "OutPut : 100 [21+1+78]")
    public void test89() {
        String str = "Welcome[21], Java1How are you78";
        int sum = 0;
        String number = "";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number + ch;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }

        }
        // Add last number if present
        if (number.isEmpty() == false) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }

    @Test(description = "Move zeroes to the left of Array")
    public void test90() {

        int[] arr = {1, 0, 2, 0, 9, 3, 4, 0};
        int count = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count--;

            }
        }

        System.out.println(Arrays.toString(arr));


    }

    @Test(description = "Move zeroes to the right of Array")
    public void test91() {

        int[] arr = {1, 0, 2, 0, 9, 3, 4, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;

            }
        }
        System.out.println(Arrays.toString(arr));

    }


    @Test(description = "replace each o with increasing number of $ signs , input -\"Tomorrow\" , output - \"T$m$$rr$$$w\"")
    public void test92() {

        String input = "tomorrow";
        StringBuilder sb = new StringBuilder();
        int dollarCount = 1;

        for (char ch : input.toCharArray()) {
            if (ch == 'o' || ch == 'O') {
                sb.append("$".repeat(dollarCount));
                dollarCount++;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    @Test(description = "remove duplicate characters in a string")
    public void test93() {

        String str = "HappyNewYear";
        Set<Character> s = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            s.add(ch);
        }
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        for (Character ch : s)
            sb.append(ch);
        System.out.println(sb);

    }

    @Test(description = "remove second highest element from the hashmap")
    public void test94() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("C", 300);
        map.put("D", 150);
        map.put("B", 200);
//TBD
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).filter(t->t.getKey().)reduce()forEach(System.out::println);


    }


    @Test(description = "flip the number and find the highest")
    public void test95() {
//TBD
    }

    @Test(description = "WAP to find Longest sequence of the same repeating character " + "Input: aaabbccccddeeaaaff" + "Output:" + "Character: c" + "Length: 4" + "longest sequence : cccc")
    public void test96() {
        String str = "aaabbccccddeeaaaff";
        int maxCount = 1;
        int currentCount = 1;

        char maxCharacter = str.charAt(0);
        char currentCharacter = str.charAt(0);

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty");
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentCharacter) {
                currentCount++;
            } else {
                currentCharacter = str.charAt(i);
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxCharacter = currentCharacter;
            }
        }
        String longestSequence = String.valueOf(maxCharacter).repeat(maxCount);
        System.out.println("Character: " + maxCharacter + " Length: " + maxCount + " longest sequence : " + longestSequence);
    }

    @Test(description = "WAP to find and replace data in a map " + "Suppose you have a map.put(“1”, “test, Cognizant”); data in the map how u will replace Cognizant by VISA ")
    public void test97() {

        Map<String, String> map = new HashMap<>();
        map.put("1", "Cognizant, Cognizant");

        String updatedString = map.get("1").replace("Cognizant", "Visa");
        map.put("1", updatedString);
        System.out.println(map);
    }

    @Test(description = "WAP to find and replace 2nd data in a map " + "Suppose you have a map.put(“1”, “Cognizant, Cognizant”); data in the map how u will replace 2nd Cognizant by VISA ")
    public void test98() {

        Map<String, String> mp = new HashMap<>();
        mp.put("1", "Cognizant, Cognizant");

        String value = mp.get("1");
        // Replace only the 2nd occurrence of "Cognizant"
        int firstIndex = value.indexOf("Cognizant");
        int secondIndex = value.indexOf("Cognizant", firstIndex + 1);

        if (secondIndex != -1) {
            StringBuilder sb = new StringBuilder(value);
            sb.replace(secondIndex, secondIndex + "Cognizant".length(), "VISA");
            mp.put("1", sb.toString());
        }


        System.out.println(mp);

    }

    @Test(description = "WAP to find the product of two consecutive elements in an array ")
    public void test99() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            int product = arr[i] * arr[i + 1];
            System.out.println(" product of " + arr[i] + " * " + arr[i + 1] + " = " + product);
        }
    }


    @Test(description = "Print only integers from strings" + "Input:  \"Order123 has 3 items and costs 450 INR\"\n" + "Output: 123 3 450")
    public void test100() {
        String inputStr = "Order123 has 3 items and costs 450 INR";
        Map<Character, Integer> map = new LinkedHashMap<>();

        StringBuilder sb = new StringBuilder();
        for (char ch : inputStr.toCharArray()) {
            if (Character.isDigit(ch) || ch == ' ') sb.append(ch);
        }
        System.out.println(sb.toString());
    }

    @Test(description = "Remove duplicates from ArrayList." + "Input:  [10, 20, 10, 30, 20, 40]\n" +
            "Output: [10, 20, 30, 40]")
    public void test101() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40));

        Set<Integer> set = new LinkedHashSet<>();
        for(int item: list){
            set.add(item);
        }
        System.out.println(set);


    }
    @Test(description = "Remove duplicate characters from a string and print")
    public void test102() {
        String str ="swissabc";
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

    @Test(description = "Print the occurrence of a character if it is present more than once in a string")
    public void test103() {
        String str ="swissabc";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: str.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);

        map.entrySet().stream().filter( entry -> entry.getValue()>1)
                .forEach(entry ->System.out.println(entry.getKey()));

    }
    @Test(description = "Create a hash map with the below structure" +
            "‘A’ : 5, " +
            "‘G’ : {‘E’ : 10, ‘B’ : 20}, " +
            "‘F’ : 100, ‘" +
            "S’ : 90" +
            "} (Note G contains hashmap as its value)")
    public void test104() {
        Map<String,Integer> nestedMap = new LinkedHashMap<>();
        nestedMap.put("E",10);
        nestedMap.put("B",20);

        Map<String,Object> map = new LinkedHashMap<>();
        map.put("A",5);
        map.put("G",nestedMap);
        map.put("F",100);
        map.put("S",90);

        System.out.println(map);

    }
    @Test(description = "Write a program to merge two array lists [a,b,c] [1,2,3]. " +
            "Output should be [a,1,b,2,c,3]. Result arraylist should be of size 6.")
    public void test105() {

        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));

        List<Object> resultArray = new ArrayList<>();

        for(int i=0 ;i<list1.size();i++){
           resultArray.add(list1.get(i));
           resultArray.add(list2.get(i));
        }

        //resultArray.stream().forEach(System.out::println);
        System.out.println(resultArray + " Size is " +  resultArray.size());
    }

    @Test(description = "Given a string s = “tomorrow” replace the second ‘o’ with $")
    public void test106() {

        String str ="tomorrow";
        int count =0;
        StringBuilder sb = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='o' || ch=='O'){
                count++;
                if(count==2){
                   sb.append("$");
                   continue;
                }
            }
            sb.append(ch);
        }
        System.out.println(sb);

    }
}



/**

 ### 🔁 **String & Array Questions**

 1. **Find first non-repeating character in a string** done
 2. **Reverse words in a sentence** – e.g., `"I am good"` → `"good am I"` done
 3. **Check if two strings are anagrams** done
 4. **Longest substring without repeating characters**
 5. **Find duplicate characters in a string**
 6. **Replace all spaces with '%20' (URLify a string)**
 7. **Rotate an array by k positions**
 8. **Find the maximum product subarray**
 9. **Find all pairs with a given sum in an array**
 10. **Move all zeros to the end without changing the order**

 ---

 ### 📊 **HashMap & Set Based Problems**

 1. **Find the first duplicate element in an array**
 2. **Count frequency of elements in an array or string**
 3. **Two Sum problem** – find indices of numbers adding up to a target
 4. **Group anagrams**
 5. **Find intersection and union of two arrays**

 ---

 ### 🔢 **Number-Based / Math Logic**

 1. **Check if a number is a palindrome**
 2. **Reverse digits of a number**
 3. **Find missing number in a sequence**
 4. **Find the nth Fibonacci number (with and without recursion)**
 5. **Count digits / Sum of digits**
 6. **Find if a number is a power of 2**

 ---

 ### 🧮 **Sorting and Searching**

 1. **Binary search**
 2. **Find kth largest or smallest element**
 3. **Sort array of 0s, 1s and 2s (Dutch National Flag Problem)**
 4. **Merge two sorted arrays**
 5. **Find peak element in array**

 ---

 ### 🔄 **Recursion & Backtracking**

 1. **Generate all subsets of a set**
 2. **Permutations of a string**
 3. **N-Queens problem (advanced but sometimes asked)**
 4. **Find all valid parentheses combinations**

 ---

 ### 🧵 **Linked List**

 1. **Reverse a linked list**
 2. **Detect a cycle in linked list**
 3. **Find the middle of a linked list**
 4. **Merge two sorted linked lists**
 5. **Remove nth node from end**

 ---

 ### 🧱 **Stacks & Queues**

 1. **Validate balanced parentheses**
 2. **Implement stack using queues and vice versa**
 3. **Min Stack implementation**
 4. **Design a queue using two stacks**
 5. **Next Greater Element**

 ---

 ### 🌳 **Trees & Graphs (for senior SDET roles)**

 1. **Inorder, Preorder, Postorder traversal**
 2. **Check if binary tree is symmetric**
 3. **Find lowest common ancestor (LCA)**
 4. **Check if two trees are identical**
 5. **Level-order traversal (BFS)**

 ---

 ### 🔐 **Bit Manipulation (Occasional)**

 1. **Find the number that appears once (others appear twice)**
 2. **Count set bits in a number**
 3. **Check if number is power of 2 using bitwise ops**

 ---

 ### 🧠 **Logic / Puzzle-Based (Real SDET Interviews)**

 1. **Design a rate limiter (Leetcode-style)**
 2. **Find the longest valid parentheses**
 3. **Flip a number and return the largest possible value**
 4. **Implement a mini Twitter system (System Design + DSA)**
 5. **Ships and containers problem** (greedy/interval logic)

 */

























































