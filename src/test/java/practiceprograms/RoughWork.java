package practiceprograms;


import org.testng.annotations.Test;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RoughWork {
    @Test()
    public void test90() {

        String str = "swissre";
        String result = "";
        for(char ch :str.toCharArray()){
        if(result.indexOf(ch)==-1){
            result+= ch;
        }


       }
        System.out.println(result);





    }

}




