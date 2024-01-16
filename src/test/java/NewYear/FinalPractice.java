package NewYear;

import org.testng.annotations.Test;

import java.util.Arrays;
public class FinalPractice {

    @Test(description = "sort integer array in ascending order ")
    public void test01() {
        int[] array = {20, 10, 25, 12, 36};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

 }
