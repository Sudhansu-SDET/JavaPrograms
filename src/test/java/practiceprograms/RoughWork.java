package practiceprograms;

import com.sun.deploy.security.SelectableSecurityManager;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Array;
import java.util.*;

public class RoughWork {


    @Test
    public void func1(){

        String str = "aaaaabbcccd";
        char[] strarray = str.toCharArray();
        int count=1;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(char ch:strarray) {
            if(map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch,count+1);
            }
            else {
                map.put(ch,1);
            }

        }
        System.out.println(map);
    }

    @Test
    public void test1(){
        boolean flag= false;
        Assert.assertTrue(flag);

    }


    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }


    @Test(invocationCount = 5)
    public void test3(){
        System.out.println("test3");
    }

    @Test()
    public void test4(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
       // arrayList.add();
    }

    @Test(description = "find the repeated characters in a string")
    public void test5(){
        String string1 = "regression";
        int count;

        //Converts given string into character array
        char[] string = string1.toCharArray();

        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j]) {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1  && string[i] != '0')
                System.out.println(string[i]);
        }
    }

    @Parameters("browser")
    @Test()
    public void test6(String key) throws InterruptedException {
        System.out.println(key);
    }

    @Test()
    public void test7(){
      String str ="123AB456CD";
      String charac ="";
      String digit ="";
      for(int i=0;i<str.length();i++){
          if(Character.isLetter(str.charAt(i))){
          charac=charac+str.charAt(i);}
          else{
              digit=digit+str.charAt(i);
          }
      }
        System.out.println(charac);
        System.out.println(digit);
    }

    @Test()
    public void test8() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Absclass abs = new Absclass();
        Method method = Absclass.class.getDeclaredMethod("private_method");
        method.setAccessible(true);
        method.invoke(abs);
    }

}
