package practiceprograms;

import org.testng.annotations.Test;

public class JavaPrograms {

    @Test(description = "Reverse a string to check whether a string is a Palindromen")
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
        while (i > j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                i++;
                j--;
            }
        }

        if (flag) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }


    //-------Reverse a string in Java----------------------------------------------------------------------------------

    //StringBuffer str = new StringBuffer("sudhansu");
    //System.out.println(str.reverse());

    /*
     * String str = "sudhansu"; char[] myCharStr = str.toCharArray(); String
     * temp=""; for(int i = myCharStr.length-1;i>=0;i--) {
     * System.out.println(myCharStr[i]); temp =temp+myCharStr[i]; }
     * System.out.println(temp);
     */


}


//	class HackerEarth	{
//		int val = 10 ;
//
//
//	public static void main(String[] args) throws Exception {
//
//	}
//	}

//}

//String s1 = new String("abc");
//String s2 = new String("abc");
//System.out.println(s1.equals(s2));

//

		/*StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(s1.equals(anObject)(sb1));
		*/
// Program 1 - reverse a string without using string inbuilt functons

//method 1 - using charAt
/*
 * String str = "Automation"; System.out.println(str); String newstr = "";
 * for(int i = 0 ; i<str.length();i++) { newstr = str.charAt(i)+ newstr ; }
 * System.out.println(newstr);
 */


// method2 - using stringbuilder as this is mutable/changeable
/*
 * String str = "Automation"; System.out.println(str);
 *
 * StringBuilder SB = new StringBuilder(); SB.append(str); StringBuilder
 * reversestr = SB.reverse(); System.out.println(reversestr);
 */


// Program 2 - Write a Java Program to count the number of words in a string using

/*
 * String str = "My Name is sudhansu p u i o ";
 *
 * //Method 1 String[] strarray = str.split(" ");
 * System.out.println(strarray.length);
 */

// Program 3 - Write a Java Program to count the number of DUPLICATE / repeated words in a string using HashMap
/*
 * String str = "My My Name Name is is sudhansu ricky patro"; String[] strarray
 * = str.split(" "); //Method 1 using HASHMAP int count =1 ; Map<String,Integer>
 * map = new HashMap<String,Integer>();
 *
 * for(int i=0;i<strarray.length;i++) {
 *
 * if(map.containsKey(strarray[i])){
 *
 * map.put(strarray[i], count+1); } else { map.put(strarray[i], count) ; }
 *
 * }
 *
 * System.out.println(map);
 *
 * }
 *
 */

// Program 3 - Write a Java Program to count the number of DUPLICATE / repeated characters in a word using HashMap

	/*String str = "AaaaaABBBbbbCCCCCddddEEeeffG";
	String[] strarray = str.split("");
	//Method 1 using HASHMAP
	int count =1 ;
	Map<String,Integer> map = new LinkedHashMap<String,Integer>();

	for(int i=0;i<strarray.length;i++)
	{

		if(map.containsKey(strarray[i])){

			map.put(strarray[i], count+1);
		}
		else {
			map.put(strarray[i], count)	;
		}

	}

	System.out.println(map);

	}

	*/


//Program 4 - Write a Java Program to find whether a number is prime or not.

/*
 * boolean flag = false ; int num = 11; System.out.println(num); for(int i=2;
 * i<=num/2;i++) { if(num%i==0) { flag=false; } } if(flag) {
 * System.out.println("number is not prime"); }else {
 * System.out.println("number is prime"); }
 *
 */


//Program 5 -  Write a Java Program to find whether a string or number is palindrome or not

//Method 1 : using String builder
/*
 * String str = "malayalam"; StringBuilder SB = new StringBuilder(str);
 * if(SB.reverse().toString().equalsIgnoreCase(str)) {
 * System.out.println("string is pallindrome " + str ); } else {
 * System.out.println("string is not pallindrome " + str ); }
 */


//program- 6 - filter out numbers for the below string
/*
 * String str = "Ind12ia45"; //String newstr = str.replaceAll("[\\d]","");//
 * replace all digits //String newstr2 = str.replaceAll("[^\\d]","");// replace
 * all non digits/character String newstr3 =
 * str.replaceAll("[\\d]","")+str.replaceAll("[^\\d]","");// op: India1245
 * System.out.println(newstr3);
 */


//		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//
//
//	}
//}
//
//


//
//
//
//
//			//HASHMAP - find unique numbers in an array
//
//				int arr[] = {1,1,2,4,2,5,6,3,4};
//
//				//Approach 1 - less time complexity sing hashmap
//
//				HashMap hm = new HashMap();
//
//				for(int i=0;i<arr.length;i++ ) {
//					hm.put(arr[i],i);
//
//				}
//				System.out.println(hm.keySet());
//
//				//second best approach using hashset
//
//				HashSet hs = new HashSet();
//				for(int i=0; i<arr.length;i++) {
//
//					if(!hs.contains(arr[i])){
//						hs.add(arr[i]);
//
//					}
//
//				}
//				for(Object a:hs) {
//					System.out.println(a);
//
//				}
//
//
//
//
//
//
//			}
//			}
//
////				//find number of duplicate words
////
////				String mystring = "Big black bug bit a big black dog";
////		        int count = 0;
////
////		        String mystrarr[] = mystring.toLowerCase().split(" ");
////
////			for (int i=0; i<mystrarr.length;i++) {
////				for(int j=i+1;j<mystrarr.length;j++) {
////					if(mystrarr[i].equals(mystrarr[j])) {
////						count++;
////						System.out.println(mystrarr[i]);
////					}
////				}
////			}
////
////			}
////}
//
//
//				//reverse string
////			String mystr = "hello";
////
////			int i = mystr.length();
////			String newstr = "";
////			while(i>0)
////			{
////				System.out.println(mystr.charAt(i-1));
////				newstr = newstr + mystr.charAt(i-1);
////				i--;
////			}
////
////			System.out.println(newstr);
////
////			}
////}
////
////
////
//
////
////				int lnum = 654321;
////
////								System.out.println("Input value : " + lnum);
////								System.out.println("Inverted value : " + doInvert(lnum));
////
////							}
////
////							public static int doInvert(int number) {
////								int rev = 0 ;
////
////									while (number != 0) {
////										rev = (rev * 10) + (number % 10);
////										number = number / 10;
////										System.out.println(rev);
////
//			//System.out.println(number);
////
////									}
////									return rev;
////								}
////
////							}
//
//
////				Scanner scan = new Scanner(System.in);
////				System.out.println(" please enter a number");
////				int value = scan.nextInt();
////
////				boolean update = checkprime(value);
////
////				if(update) {
////					System.out.println(value + " : this number is not prime");
////				}
////				else {
////
////				System.out.println(value + " : this number is prime");
////				}
////
////			}
////
////			public static boolean checkprime(int value) {
////
////				if (value <=1) {
////					System.out.println(value + " : this is not prime");
////				}
////
////				for(int i =2 ; i< Math.sqrt(value) ; i++) {
////
////					if(value%2==0) {
////						return false;
////
////					}
////				}
////				return true;
////
////			}
////
////
////			}
////
////
////
////
////
////
////
////
//
//
////				//Write a function to reverse a number in Java
////
////				int lnum = 654321;
////
////				System.out.println("Input value : " + lnum);
////				System.out.println("Inverted value : " + doInvert(lnum));
////
////			}
////
////			public static int doInvert(int number) {
////				int rev = 0 ;
////
////					while (number != 0) {
////						rev = (rev * 10) + (number % 10);
////						number = number / 10;
////						System.out.println(rev);
////						System.out.println(number);
////
////					}
////					return rev;
////				}
////
////			}
//
//
//////Write code to sort the list of strings using Java collection?
////			String[] myStArray = {"Beta" , "Alpha" ,"alp" ,"Gamma","beta"} ;
////
////			printfunc(myStArray);
////
////			Arrays.sort(myStArray);
////			printfunc(myStArray);
////
////			Arrays.sort(myStArray,String.CASE_INSENSITIVE_ORDER);
////			printfunc(myStArray);
////
////		}
////
////
////		public static void printfunc(String[] mystr) {
////			for(String item : mystr) {
////				System.out.print(item + " ");
////				}
////			System.out.println();
////			}
////
//
//
////
////			String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec" };
////
////			// Display input un-sorted list.
////			System.out.println("-------Input List-------");
////			showList(inputList);
////
////			// Call to sort the input list.
////			Arrays.sort(inputList);
////			//Arrays.sort
////
////			// Display the sorted list.
////			System.out.println("\n-------Sorted List-------");
////			showList(inputList);
////
////			// Call to sort the input list in case-sensitive order.
////			System.out.println("\n-------Sorted list (Case-Sensitive)-------");
////			Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
////			//Arrays.sort(null, String.CASE_INSENSITIVE_ORDER)
////
////			// Display the sorted list.
////			showList(inputList);
////		}
////
////		public static void showList(String[] array) {
////			for (String str : array) {
////				System.out.print(str + " ");
////			}
////			System.out.println();
////		}
////		}
////
////	}
//
////	@SuppressWarnings("null")
////	public static void main(String[] args) {
////
////		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudpatro\\Desktop\\MYDOCS\\SeleniumLearning\\mydriver85\\chromedriver.exe");
////
////		WebDriver driver = new ChromeDriver();
////		driver.get("https://www2.deloitte.com/global/en.html");
////
////		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
////		//object obj = (Object)jsExecutor.ExecuteScript("return window.jsObj;");
////		Object allobj =(Object) jsExecutor.executeScript("return window.jsObj;");
////
////
////
////
////       System.out.println("driver quitting");
////        driver.quit();
////
//
//
//
//
//
//
//
//
//
//
//	/*	// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudpatro\\Desktop\\MYDOCS\\SeleniumLearning\\mydriver85\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//
//		driver.get("https://jobs.jobvite.com/servicenow/search?q=");
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Select iSelectCategory = new Select(driver.findElement(By.id("jv-search-category")));
//		iSelectCategory.selectByVisibleText("Engineering, Infrastructure and Operations");
//
//		Select iSelectRegion = new Select(driver.findElement(By.id("jv-search-region")));
//		iSelectRegion.selectByVisibleText("APAC");
//
//		driver.findElement(By.cssSelector("button[class='jv-button jv-button-primary']")).click();
//
//		String paginationText = driver.findElement(By.cssSelector(".jv-pagination-text")).getText();
//		String[] allList = paginationText.split("of");
//		System.out.println("Total number of Job listings are : " + allList[1].trim());
//
//		driver.quit();
//
//	*/
//
//
//	/*
//	 * sum of all elements in an array
//	 *
//	 * int[] myArray = {1,2,3,4,5};
//
//		int sum = sumOfArray(myArray);
//
//		System.out.println(sum);
//
//
//	private static int sumOfArray(int[] myArray) {
//		// TODO Auto-generated method stub
//		int Sum = 0;
//		for(int iCounter=0;iCounter<=myArray.length-1;iCounter++)
//		{
//			Sum = Sum + myArray[iCounter];
//
//		}
//		return Sum;
//	}
//	*/
//
//
//		/* maximum difference between any adjacent index in array
//		 *
//
//		int[] a = {1,4,8,15,17};
//		int[] diff = new int[4];
//		for(int i=0;i<a.length-1;i++) {
//
//			diff[i] = a[i+1]-a[i];
//			int difference = a[i+1]-a[i];
//			System.out.println(diff[i]);
//			//System.out.println(diff[i]);
//		}
//
//		int max = 0;
//		for(int i=0;i<diff.length;i++) {
//
//			if (diff[i]>max) {
//				max = diff[i];
//			}
//		}
//
//		System.out.println("maximum difference is : " + max);*/
//
//
//
//		/*
//		 * compare same indexes of 2 array and create a third array with matching values
//		 *
//
//
//
//		int a[]= {1,4,5,7};
//		int b[]= {6,4,3,7};
//
//		ArrayList<Integer> AL = new ArrayList<Integer>();
//		for (int i=0; i<a.length;i++) {
//			if(a[i]==b[i]) {
//				AL.add(a[i]);
//			}
//			}
//
//		for (int i=0; i<AL.size();i++) {
//		System.out.println(AL.get(i));}
//
//		 */
//
//
//
//
//		/*
//		 * sort array in ascending and descending order
//
//
//		int a[] = {2,6,1,4,9};
//
//		int i ;
//		int j ;
//		int temp ;
//		for (i=0; i<a.length;i++) {
//			for (j=i+1; j<a.length;j++) {
//				if(a[i]<a[j]) {
//					temp =a[i];
//					a[i]=a[j];
//					a[j]=temp;
//
//				}
//			}
//		}
//
//		for (i=0; i<a.length;i++) {
//		System.out.println(a[i]);
//		}
//		*/
//
//
//
//		/* swap with and without using third variable
//
//
//		int a = 4;
//		int b = 5;
//
////		int temp;
////
////		temp =a ;
////		a= b;
////		b=temp;
////
////		System.out.println("a is  " + a);
////		System.out.println("b is  " + b);
////
//
//
//		a=a+b;
//		b=a-b;
//		a=a-b;
//
//		System.out.println("a is  " + a);
//		System.out.println("b is  " + b);
//
//
//		*/
//
//
//		/*printing pyramid pattern as below -
//		 *
//		 * *
//		 * * *
//		 * * * *
//
//
//
//		for(int i=1; i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//				System.out.print("\t");
//
//			}
//			System.out.println();
//
//
//		}
//
//
//
//		/*printing fibonacci pattern as below -
//		 0  1 1 2 3 5 8 13 21
//
//
//
//		int a=0;
//		int b=1;
//		int i=1;
//		int sum=0;
//		while(i<=8) {
//			sum = a + b;
//			a=b;
//			b=sum;
//
//			System.out.println(sum);
//			i++;
//
//		}
//		*/
//
//
//
//
//		//String val ="aBcDefgHIJkL";
////
////		char[] str=val.toCharArray();
////
////        // Traverse the string
////        for (int i=0; i < str.length-1; i++)
////        {
////            // Convert to lowercase if its
////            // an uppercase character
////            if (str[i]>='a' && str[i]<='b')
////            {
////                int myval = (char) (str[i]-32);
////
////                // Print space before it
////                // if its an uppercase character
////                if (str[0]>='A' && str[]<='Z') {
////                    System.out.print("_");
////                }
////                // Print the character
////                System.out.print(str[i]);
////            }
////
////            // if lowercase character
////            // then just print
////            else
////            System.out.print(str[i]);
////        }
////
////
//
//
//	/*	String val ="abcdefghijkl";
//		char[] myval = val.toCharArray();
//
//		char first ='a';
//		char last ='c';
//		int firstFoundAt = 0;
//		int lastFoundAt = 0;
//
//		for (int i=0;i<myval.length;i++) {
//
//
//		if(myval[i]==first) {
//			firstFoundAt = i ;
//		}
//		if(myval[i]==last) {
//			lastFoundAt = i ;
//		}
//		}
//		int distance = lastFoundAt -firstFoundAt ;
//		System.out.println(distance);
//
//		*/
//
//
//
//
//
//
//
//
//
//
//
//		import java.lang.reflect.Array;


//[PROGRAM - 3]-------------- Program to count the number of repeating characters in a string word using HashMap.----------------------------


//[PROGRAM - 2]-------------- Program to count the number of repeating characters in a string word using HashMap.------------------------------

      /* String str = "aabbccccdddddddefff";
       String[] strArr = str.split("");

       HashMap<String,Integer> map = new HashMap<String, Integer>();
       for(int i=0;i<strArr.length;i++){

           if(!map.containsKey(strArr[i])){
               map.put(strArr[i],1);

           }
           else
           {
               int count = map.get(strArr[i]);
               map.put(strArr[i],count+1);
           }
       }
       System.out.println(map);

*/


//[PROGRAM - 1]-------------- Program to count the number of repeating words in a string  sentence using HashMap.------------------------------

       /* String str ="This this is is is my Name Name" ;
        String[] strArr = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (int i=0;i<strArr.length;i++){


            if(map.containsKey(strArr[i])){
                int count = map.get(strArr[i]);
                map.put(strArr[i],count+1 );
            }
            else {
                map.put(strArr[i],1);
            }


        }

        System.out.println(map);


*/
//-------------------put _ between a small and capital character in a string----------

/*
        String str = "SudhansuPatro";
        char[] myArr = str.toCharArray();
        String temp = "";
        for (int i = 0; i < myArr.length-1; i++) {
            int ASCIIValueofI = myArr[i];
            int ASCIIValueofJ = myArr[i + 1];
            if (ASCIIValueofI >= 65 && ASCIIValueofI <= 90) {
                if (ASCIIValueofJ >= 97 && ASCIIValueofJ <= 122) {
                    temp = temp + myArr[i] + "_";
                }
                else{
                    temp = temp + myArr[i];
                }
            }
            else {
                if (ASCIIValueofI>= 97 && ASCIIValueofI <= 122) {
                    if (ASCIIValueofJ >= 65 && ASCIIValueofJ <= 90) {
                        temp = temp + myArr[i] + "_";
                    } else {
                        temp = temp + myArr[i];
                    }
                }
            }

        }

*/

// System.out.println(temp);






               /* if(Character.isLowerCase(str.charAt(i))){
            if(Character.isUpperCase(str.charAt(i+1)))
            {
                newStr = newStr + str.charAt(i)+"_" ;
            }
        }
        else{
            newStr = newStr + str.charAt(i);
        }*/


//-------------------find out distance between two characters in a string----------
/*
        String str = "ricky";
        char firstChar = 'r';
        char lastChar = 'y';
        int firstElement = 0 ;
        int lastElement  = 0;
        char[] myArr = str.toCharArray();

        for(int i=0; i<myArr.length;i++){
            if (myArr[i]==firstChar){
                lastElement = i ;
                break;
            }
        }

        for(int j=0; j<myArr.length;j++){
            if (myArr[j]==lastChar){
                lastElement = j ;
                break;
            }
        }
        int distance = lastElement - firstElement ;

        System.out.println(distance);*/

        /*


        System.out.println(str.indexOf(firstChar));
        System.out.println(str.indexOf(lastChar));

        int distance = str.indexOf(lastChar) - (str.indexOf(firstChar)+1) ;

        System.out.println(distance);*/


//-------------------e common element from two arrays----------
        /*String[] Arr1 ={"A","B","C"};
        String[] Arr2 ={"C","D","E"};

        for(int i = 0 ; i< Arr1.length;i++){
            for (int j=0 ; j< Arr2.length;j++){
                if(Arr1[i].equalsIgnoreCase(Arr2[j])) {
                    System.out.println(Arr1[i]);
                }
            }
        }*/

      /*  int[] Arr1 ={1,2,3,4};
        int[] Arr2 ={3,4,5};

        for(int i = 0 ; i< Arr1.length;i++){
            for (int j=0 ; j< Arr2.length;j++){
                if(Arr1[i]==Arr2[j]) {
                    System.out.println(Arr1[i]);
                }
            }
        }
*/


//-------------------reverse a string without using any function----------
      /*  String str = "sudhansu";
        String temp ="";
        for(int i=str.length()-1;i>=0;i--){
            temp = temp + str.charAt(i);
        }
        System.out.println(temp);

*/


//-------------------Add 2 array lists----------

       /* ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println(list1);

        list1.addAll(list2);
        System.out.println(list1);*/


//----------------------How to remove a particular character from a String-----------------
//
//        Character c = 'p';
//        String str = "peek";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c) {
//                deletecharatindex(str,i);
//            }
//        }
//    }
//
//        public static void deletecharatindex(String S ,int i) {
//            StringBuffer sb = new StringBuffer(S);
//            sb.deleteCharAt(i);
//            System.out.println(sb);
//        }


//--------------How to swap two String variables without third variable------------------
       /* String str1 = "hello" ;
        String str2 = "world" ;

        str1 = str1 + str2 ; //helloworld
        str2 = str1.substring(0,str1.length()-str2.length());//hello
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
*/

//---------------------Java Program to count the number of words in a String---------------
       /* String str = "My Name is sudhansu patro";
        String[] myArr  = str.split(" ");
        System.out.println(myArr.length) ;
*/


//--------------------------------whether one string is a rotation of another?------------------------
/*
        String str1 = "avajava";
        String str2 = "javaava";

        StringBuffer sb = new StringBuffer(str2);
        if(sb.reverse().toString().equalsIgnoreCase(str1))
            System.out.println("yes , this is rotation");
        else
            System.out.println("no , this is not rotation");
*/


//-------------------------------Java Program to find duplicate characters in a String------------

       /* String str = "Beautiful beach";
        int Count = 0 ;
        char[] mystr = str.toLowerCase().toCharArray();

        for(int i=0;i<str.length();i++ ){
            for(int j=i+1;j<str.length();j++){
                if(mystr[i]==mystr[j]){
                    System.out.println("Repeated characters are : " + mystr[i] + " ");
                }
            }
        }
*/


//-------------------convert String to Integer and Integer to String in Java--------------
       /* String str = "sudhansu";
        Integer.parseInt(str);
        Integer.valueOf(str);

        int i = 100 ;
        String.valueOf(i);
        Integer.toString(i);
*/


//-------check number of upper case , lower case , digits etc-------------------------------------------------------------

        /*String str = "India is my country 100%" ;
        int lowerCase = 0 ;
        int upperCase = 0 ;
        int digit = 0 ;
        int other = 0 ;
        for(int i = 0 ; i<str.length()-1;i++){
            if (Character.isLowerCase(str.charAt(i)))
                lowerCase++;
            else if (Character.isUpperCase(str.charAt(i)))
                upperCase++;
            else if (Character.isDigit(str.charAt(i)))
                digit++;
            else
                other++;
        }


        System.out.println("Details are as follows : " + "lowerCase - " + lowerCase + " ; upperCase - " + upperCase + " , digits - " + digit + " ; others - " + other );
*/


//-------check of two string are anagrams-------------------------------------------------------------

      /*  String str1 = "Keep" ;
        String str2 = "Peek";
        boolean flag ;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()!=str2.length()){
            flag = false ;
        }
        else
        {
            char[] Arr1 = str1.toCharArray();
            char[] Arr2 = str2.toCharArray();

            Arrays.sort(Arr1);
            Arrays.sort(Arr2);

            if(Arrays.equals(Arr1,Arr2)){
                flag=true;
            }
            else
                flag=false;
        }

        if(flag){
            System.out.println("anagram");
        }
        else
        {

            System.out.println("not anagram");
        }*/


//-------reverse each of the words in string-------------------------------------------------------------

          /*  String str = "My Name is Sudhansu";

            String[] myarr = str.split(" ");
            String temp ="";
        for (String eachElement:myarr) {

            StringBuffer sb = new StringBuffer(eachElement);
             temp = temp + sb.reverse().toString()+ " ";


        }
        System.out.println(temp);
*/


//-------reverse words----------------------------------------------------------------------------------

//        String str = "east west north south" ;
//        String[] myStrArr = str.split(" ");
//        int i = myStrArr.length-1;
//        String temp = "";
//        while (i >= 0)
//        {
//            System.out.println(myStrArr[i]);
//            temp = temp + myStrArr[i] + " ";
//            i--;
//
//        }
//
//        System.out.println(temp);


//-------capitalize each word----------------------------------------------------------------------------------

      /*  String str = "this is javatpoint";
        System.out.println(str.toUpperCase());*/


//-------check whether a string is a Palindrome----------------------------------------------------------------------------------
/*
 * String str = "nitin"; StringBuffer str1 = new StringBuffer(str);
 *
 * if(str.equals(str1.reverse().toString())){ System.out.println("palindrome");
 * } else { System.out.println("not palindrome"); }
 */

       /* String str = "nitin";

        int i = 0 ;
        int j = str.length()-1;

        boolean flag = true;
        while(i< j) {
            if(str.charAt(i)!=str.charAt(j)) {
                flag = false;}
            i++;
            j--;

        }

        if(flag) {System.out.println("pallindrome");}
        else {System.out.println("not pallindrome");}

        if(flag) {System.out.println("pallindrome");}
        else {System.out.println("not pallindrome");}
*/

//-------Reverse a string in Java----------------------------------------------------------------------------------

//StringBuffer str = new StringBuffer("sudhansu");
//System.out.println(str.reverse());

/*
 * String str = "sudhansu"; char[] myCharStr = str.toCharArray(); String
 * temp=""; for(int i = myCharStr.length-1;i>=0;i--) {
 * System.out.println(myCharStr[i]); temp =temp+myCharStr[i]; }
 * System.out.println(temp);
 */




