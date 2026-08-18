package org.core.java.DSA;

public class Test {


    public String revStr(String s){
        int len = s.length();
        String rev_str = "";
        for (int i = len-1; i>=0;i--){
            rev_str = rev_str + s.charAt(i);
        }
        return rev_str;
    }


    public int[] twoSum(int [] a,int tar){
        for (int i = 0; i< a.length;i++){
            for (int j = i+1; j< a.length;j++){
                if ((a[i]+a[j]) ==tar){
                    return new int[] {i,j};
                }
            }
        }return new int[0];
    }

    public static boolean palindromIntiger(int number){
        int reverseDigit = 0;
        while(number>0){
            int newDigit = number % 10;
            reverseDigit = reverseDigit * 10 + newDigit;
            number = number/10;
        }
        return reverseDigit == number;
    }

    public static boolean pakindromString(String key){
        int len = key.length();
        int left = 0;
        int right = len-1;
        while (left < right){
            if (key.charAt(left) != key.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String [] args){
        Test soul = new Test();
        int[] array = {1,2,3,4,5,6,7,8};
        int tar = 9;

        System.out.println(soul.revStr("deepu"));
        int[] twosum = soul.twoSum(array,tar);
        System.out.println("resutl " + twosum[0]+" : "+ twosum[1]);

        System.out.println("palindrom test will be :: " + palindromIntiger(1234321));
        System.out.println("palindrom test from String :: " + pakindromString("deepeed"));
    }

}
