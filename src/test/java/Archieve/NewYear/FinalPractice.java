package Archieve.NewYear;

import org.testng.annotations.Test;

import java.util.*;
public class FinalPractice {

    @Test(description = "WAP to Concatenate Characters From Each String [{“Rama”, “Test”, “Type”, “Tata”} –>> RTTTaeyamsptatea]\n" +
            "Input  - String arr[] = {“Rama”, “Test”, “Type”, “Tata”}" +
            "Output should be – “RTTTaeyamsptatea”")
    public void test01() {
        String finalValue = "";
        String arr[] = {"Rama", "Test", "Type", "Tata"};

        for (int i = 0; i < arr.length; i++) {
            for (String str : arr) {
                finalValue = finalValue + str.charAt(i);

            }
        }
        System.out.println(finalValue);
    }

    @Test(description = "WAP to Reverse characters Only From String" +
            "Input: today110is210my310interview" +
            "Output: yadot110si210ym310weivretni”")
    public void test02() {
        String str = "today110is210my310interview";
        //TBD
    }

    @Test(description = "WAP to Find the Number Of Times Substring Appears in a String\n" +
            "    String s =“sudhansu” How many times “su” is Getting repeated\n" +
            "    Input: sudhansu" +
            "    Output: 2")
    public void test03() {
        String inputStr = "sudhsusuansu";
        String subStr ="su";

        System.out.println("Answer is : " + inputStr.split(subStr).length);

    }

    @Test(description = "WAP to Order/reaarrange Characters Based On Number Of Occurrences\n" +
            "Input string: “dadeadrs”" +
            "Output: “dddaaers”")
    public void test04() {
        String inputStr = "dadeadrs";

       List<Character> ls = new ArrayList();
        for (int i = 0; i < inputStr.length() ; i++) {
            if (!ls.contains(inputStr.charAt(i))){
                ls.add(inputStr.charAt(i));
            }
            for (int j = i+1; j < inputStr.length(); j++) {
                if(inputStr.charAt(i)==inputStr.charAt(j)){
                    ls.add(inputStr.charAt(j));
                }
            }
        }

      for (Character ch:ls)
            System.out.println(ch);
        }


    @Test(description = "Write a Java Program to Print the Preceding Character By the Value / expand the string" +
            "Input: Welcome to Mis2is2ip2i" +
            "Output:Welcome to Mississippi")
    public void test05() {
        String inputStr = "Welcome to Mis2is2ip2i";

       StringBuilder res = new StringBuilder();
        for (int i = 0; i < inputStr.length() ; i++) {
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


    @Test(description = "Write a Java Program to Print Character And Count Of a Word:" +
            "Input= abbcccdeee"+
            "Output= a1b2c3d1e3")
    public void test06() {
        String inputStr = "abbcccdeee";

        HashMap<Character,Integer> map = new HashMap();

        for (int i = 0; i <inputStr.length() ; i++) {
            if(map.containsKey(inputStr.charAt(i))){
                int count  = map.get(inputStr.charAt(i));
                map.put(inputStr.charAt(i),++count);
            }
            else
                map.put(inputStr.charAt(i),1);
        }
        System.out.println(map);

    }


    @Test(description = "Reverse a string preserving space positions" +
            "Input : Help others" +
            "Output : sreh topleH")
    public void test07() {
        String inputStr = "Help others";
        char arr[] = inputStr.toCharArray();
        int start = 0;
        int end = inputStr.length()-1;
        char temp;
        while(start<end) {
            if (arr[start]== ' '){
                start++;
            }
            else if(arr[end]== ' '){
                end--;
            }
            else {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }
        System.out.println(arr);
        }

    @Test(description = "WAP to Sort Array Of String According To String Length" +
            "Input { “Hi” , “maven” , “selenium ” , “java” }" +
            "Output { “Hi”, “java”, “maven” , “selenium” }")
    public void test08() {
        String arr[] = { "Hi" , "maven" , "selenium" , "java" };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i].length()>arr[j].length()) {
                    String temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
            }
            }
        }
        System.out.println(Arrays.toString(arr));


    }


    @Test(description = "WAP to find the first non-repeated character in a String?\n" +
            "Input: “minimum”" +
            "Output: n")
    public void test09() {
        String inputStr = "minimum";
        HashMap<Character, Integer> map = new LinkedHashMap();

//        for (int i = 0; i < inputStr.length(); i++) {
////            if (map.containsKey(inputStr.charAt(i))) {
////                int count = map.get(inputStr.charAt(i));
////                map.put(inputStr.charAt(i), count + 1);
////            } else
////                map.put(inputStr.charAt(i), 1);
//
//        }

        for(char ch:inputStr.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {

          if(mapElement.getValue() ==1){
              System.out.println(mapElement.getKey());
              break;
          }
        }
    }

    @Test(description = "TBD -- Print/sort Characters As Per the Number Of Occurrences" +
            "Input=”1222bbbbcccaaaammmmm”"+
            "Output=”1222cccbbbbaaaammmmm”")
    public void test10() {
        String inputStr = "1222bbbbcccaaaammmmm";
        HashMap<Character, Integer> map = new LinkedHashMap();

        for(char ch:inputStr.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       List<Integer> sortedValues = new ArrayList(map.values());
        Collections.sort(sortedValues);

    }

    @Test(description = "WAP For Sum Of Digits Of a String" +
            "Input : “Welcome[21], Java1How are you78" +
            "OutPut : 19 [2+1+1+7+8]")
    public void test11() {
        String inputStr = "Welcome[21], Java1How are you78";
        int res =0;
        for (int i = 0; i < inputStr.length(); i++) {
            if(Character.isDigit(inputStr.charAt(i))){
                res = res + Character.getNumericValue(inputStr.charAt(i));
            }
        }
        System.out.println(res);
        }

    @Test(description = "Find Sum of numbers in given strings" +
            "Input : “Welcome[21], Java1How are you78" +
            "OutPut : 100 [21+1+78]")
    public void test12() {
        String inputStr = "Welcome[21], Java1How are you78";
        int res =0;
        for (int i = 0; i < inputStr.length(); i++) {
            if(Character.isDigit(inputStr.charAt(i))){
                res = res + Character.getNumericValue(inputStr.charAt(i));
            }
        }
        System.out.println(res);
    }








































    }

































