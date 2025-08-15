package Archieve.FedexInterview;

import org.testng.annotations.Test;

import java.util.*;
import java.util.Map.Entry;

public class Practice {

    @Test(description = "practice")
    public void practice(){
        Map<String,String> map = new HashMap<>();
        map.put("1","Bangalore");
        map.put("2","Hyderabad");
        map.put("3","Bangalore");
        map.put("4","Pune");



    }

    @Test(description = " How to reverse a string in Java?")
    public void program1(){
        String str ="java";

        //Approach 1 :
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        //Approach 2 :
        String newstr ="";

        System.out.println(str.length());
        for (int i=str.length()-1;i>=0;i--){
            newstr =newstr + str.charAt(i);
        }
        System.out.println(newstr);
    }

    //TODO
    @Test(description = " How To Create Pyramid Of Numbers In Java?")
//    *
//    **
//    ***
//    ****
//    *****
    public void program2(){

       int noOfRows =5;

       int rowCount = 1;
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //Printing 'rowCount' value 'rowCount' times at the end of each row

            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }


    @Test(description = "How do you remove all white spaces from a string in Java?")
    public void program3(){
    String str ="This is java program";
        System.out.println(str.replace(" ",""));

        }

    @Test(description = " How to find duplicate characters and their count in a string in Java?")
    public void program4(){
        String str ="BetterButter";
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        char[] strArray = str.toCharArray();

        for(char ch:strArray){
            if(characterIntegerMap.containsKey(ch)){
                characterIntegerMap.put(ch,characterIntegerMap.get(ch)+1);
            }
            else
                characterIntegerMap.put(ch,1);
        }
        System.out.println("occurances of each character : " + characterIntegerMap);

        for(Map.Entry<Character,Integer> entry : characterIntegerMap.entrySet()){
            if(entry.getValue()!=1){
                System.out.println(entry);
            }
        }
    }


    @Test(description = "  How do you check the equality of two arrays in Java?")
    public void program5() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5,7};

       //Approach 1
        boolean flag = false;
        if (arr1.length != arr2.length) {
            System.out.println("Arrays not matching as size is different");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    flag = true;
                } else
                    flag = false;
            }
            if (flag)
                System.out.println("Arrays matching");
            else
                System.out.println("Arrays not matching");
        }

        //Approach 2
        System.out.println(Arrays.equals(arr1,arr2));
    }


    @Test(description = " Anagram program in Java")
    //Two strings are said to be anagram if they contain same set of characters but in different order
    public void program6() {
        String str1 ="Mother In Law";
        String str2="Hitler Woman ";
        boolean flag;
        //Approach 1
        if(str1.length()!=str2.length()){
            flag=false;
        }
        else{
            char[] arr1 = str1.toLowerCase().replace(" ","").toCharArray();
            char[] arr2 = str2.toLowerCase().replace(" ","").toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                flag=true;
            }
            else
                flag=false;
        }
        if(flag)
            System.out.println("this is anagram");
        else
            System.out.println("this is not anagram");

    }

    @Test(description = "Armstrong number program in Java")
    //A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it.
    //153= 1*3 + 5*3 + 3*3 = 1 + 125 + 27 = 153
    public void program7() {
        int num = 153;
        int copyOfNumber = 153 ;
        int sum =0;
        int numberOfDigits =String.valueOf(num).length();

        while (copyOfNumber!=0){
            int lastDigit = copyOfNumber%10;
            int lastDigitToThePowerOfDigits =1;
            for (int i = 0; i < numberOfDigits; i++) {
                lastDigitToThePowerOfDigits = lastDigitToThePowerOfDigits * lastDigit;
            }
            sum = sum + lastDigitToThePowerOfDigits;
            copyOfNumber=copyOfNumber/10;
        }
        if(sum==num){
            System.out.println("This is Armstrong number");
        }
        else
            System.out.println("This is not Armstrong number");

    }

    @Test(description = "How to find duplicate elements in an array?")
    public void program8() {
        int arr[] = {12, 11, 40, 12, 5, 6, 5, 11};

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i))
                System.out.println("Duplicate elements " + i);
        }
    }
    @Test(description = "   How to find sum of all digits of a number in Java?")
    public void program9() {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("sum is " + sum);

    }

    @Test(description = " How to find second largest number in an integer array?")
    public void program10() {
        Integer[] arr = {1,5,9,2,11,13,6};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(arr[1]);
     }

    @Test(description = " How to count occurrences of each character in a string in Java?")
    public void program11() {
        String str ="aaaabbbccd";
        char[] strarr = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c :strarr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else
                map.put(c, 1);
        }
        System.out.println(map);
    }

    @Test(description = "How to find all pairs of elements in an array whose sum is equal to given number??")
    public void program12() {
        int[] arr= {4, 5, 7, 11, 9, 13, 8, 12};
        int sum = 20;
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]+arr[j]==sum){
                    System.out.println("These 2 number add up to the sum value " + arr[i] + " - " + arr[j]);
                }
            }
        }
    }
    @Test(description = "How to find continuous sub array whose sum is equal to given number?")
    public void program13() {
        int[] arr = {5, 4, 1, 2, 3, 4, 1, 4, 5, 5};
        int reqSum = 10;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == reqSum) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                }
            }

        }
    }

    @Test(description = "WAP to print prime numbers between 2 to 100 excluding those numbers which contain 3 or 7 in it.")
    public void program14() {
       int startNum = 2 ;
       int endNum = 100 ;
        for (int i = 2; i <= 100; i++) {

        }

        }


    @Test(description = "WAP to shift zeros to left in the given integer array")
    public void program15() {
       int[] arr ={1, 10,20,0,59,63,0,88,0};
       Arrays.sort(arr);
       for (int i:arr)
        System.out.println(i);
    }

}






































