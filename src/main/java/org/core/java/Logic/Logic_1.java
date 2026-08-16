package org.core.java.Logic;

import java.util.*;
import java.lang.Runnable;
import java.util.stream.Collectors;

public class Logic_1 {

    public char char_at_count(String str, int count){
        return str.charAt(count);
    }

    public String reverse_string(String str){
        int len = str.length();
        String rev_str = "";
        for(int i = len - 1; i >= 0; i-- ){
                rev_str = rev_str + str.charAt(i);
        }
        return rev_str;
    }

    public int[] two_sum(int[] nums , int tar){
        for (int i = 0; i <= nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == tar){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public String RevDeepu(String value){
        String revStr = "";
        int len = value.length();
        for (int i = len-1; i >= 0; i--){
            revStr = revStr + value.charAt(i);
        }
        return revStr;
    }

    public static boolean Palindrom(String input){
        int len = input.length();
        int left = 0;
        int right = len-1;

        while(left < right){
            if (input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean Palindrom2(String input){
        int len = input.length();
        int left =0;
        int right = len-1;

        while (left < right){
            if (input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean Pal(Integer n){
        int orgInt  = n;
        int reverseInt = 0;
        while (n>0){
            int digit = n%10;
            reverseInt = reverseInt * 10 + digit;
            n = n/10;
        }
        return reverseInt == orgInt;
    }

    public List<Integer> converSion(int[] nums){
        List<Integer> returnInts = new ArrayList<>();
        for (Integer num : nums){
            returnInts.add(num);
        }return returnInts;
    }


//    @FunctionalInterface
//    public interface Runnable{
//        void run();
//    }


    public static void Fibnochi(int count){
        int first = 0;
        int second = 1;
        for (int i = 0; i <= count; i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public String strRev(String value){
        int length = value.length();
        String revStr = "";
     for (int i = length-1; i>=0; i--){
         revStr = revStr + value.charAt(i);
        }
     return revStr;
    }

    public static void fibNochiiii(int count){
        int first = 0;
        int second = 1;
        for (int i=0;i<=count;i++){
            System.out.println(first +",");
            int next = first + second;
            first = second;
            second = next;
        }
    }


    public static void fibNochis(int number){
    int first = 0;
    int second = 1;
    for (int i = 0; i<=number;i++){
        System.out.println(first + ",");
        int next = first + second;
        first = second;
        second = next;
    }
    }

    public int[] twoSum(int[] array , int target){
        for (int i = 0; i< array.length;i++){
            for (int j = i+1; j< array.length; j++){
                if (array[i] + array[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    //remove element
    public int removeElement(int[] nums, int val){
    int k = 0;
    for (int i = 0; i<nums.length;i++){
        if (nums[i] != val){
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
    }


    public static boolean presentElement(int[] array,int k){
        for(int num : array){
            if (num == k){
                return true;
            }
        }
        return false;
    }


    public Character firstNonRepeatingCharactor(String str){
        Map<Character,Integer> frequency = new LinkedHashMap<>();

        for (char c : str.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry
                : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }


    public int indexOfQuery(String mainString, String keyString){
        return mainString.indexOf(keyString);
    }

    public int indexOfKey(String mainString, String key){
        for (int i = 0; i<= mainString.length()-key.length(); i++){
            int j = 0;
            while(j < key.length() && mainString.charAt(i+j) == key.charAt(j)){
                j++;
            }
            if (j == key.length()){
                return i;
            }
        }return -1;
    }

    /*
    itrate through the main string
    initialise zero for first charactor of second string
    check the conditions requirment
    1: itrate through the second string
    2: and charactor at define palace of first string is getting equals to charactor at define place pf second string
    length of itratation becames length of second string
    return value of i
    else return -1
     */

    public int countOfkeyValue(String mainString, String key){
        int count = 0;
        for(int i = 0; i<= mainString.length()-key.length(); i++){
            int j = 0;
            while(j<key.length() && mainString.charAt(i+j) == key.charAt(j)){
                j++;
            }
            if (j == key.length()){
                count ++;
            }
        }
        return count;
    }

    /*
    * psudo code
    * 1 : we need to run a loop up to where we should check the code
    * 2 : initialise j as zero so that the each charactor starts from 0 to its maximum length
    * 3 : give a while condition where we need to check j is less than the key  length and char at i+j position is equal to char of j position in key string
    * if thats true then increase j
    * and if value of j is getting equals to length of key
    * then thats the first occurance
    * at that point return the value of i which is going to be the index
    * elase return -1
    */
public static void countAndIndexs(String mainString, String key){
    int count = 0;
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i<= mainString.length()-key.length(); i++){
        int j = 0;
        while (j < key.length() && mainString.charAt(i+j) == key.charAt(j)){
            j++;
        }
        if (j == key.length()){
            count++;
            indexes.add(i);
        }
    }
    System.out.println("count :: " + count);
    System.out.println("indexes :: " + indexes);
}



    public static void main(String [] args){

        Logic_1 logic = new Logic_1();
        char c = logic.char_at_count("divyendhsuresh",5);
        System.out.println("char" + "  " + c);

        System.out.println("reversed string ::" + " " + logic.reverse_string("deepu"));

        Fibnochi(5);

        int[] arr = {1,2,3,4,6,33,3,2,77,8};
        int tar = 36;
        int[] result = logic.two_sum(arr,tar);
        System.out.println("two sum  " + result[0] + result[1]);

        int[] resultNew = logic.twoSum(arr,tar);
        System.out.println("two sum from new methode {} , {} " + resultNew[0]+ " : " + resultNew[1]);
        System.out.println("remove element result ::: " + logic.removeElement(arr,8));
        System.out.println("true or false from new array " + presentElement(arr,6));
        System.out.println(logic.RevDeepu("Deeeepu"));
        System.out.println(Pal(232));
        System.out.println("Index of key string from the mehtode ::: " + logic.indexOfQuery("geethanjalyee" , "ee"));
        System.out.println("result from length shorten methode for index value :::: "  + logic.countOfkeyValue("lalaDEEPUidGOINGDEEPU","DEEPU"));

        countAndIndexs("geethanjalyee", "ee");

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        System.out.println("from list of intiger " +" : " + nums);

        List<String> names = new ArrayList<>();
        names.add("deepu");
        names.add("khalid");
        System.out.println("list from names " + " : " + names);


        for(int i=0;i<nums.size(); i++){
            System.out.println("from loop of intiger list: " + " " + nums.get(i));
        }

        for (Integer num:nums){
            System.out.println("from enhanced for loop : " + " " + num);
        }

        Set<Integer> numss = new HashSet<>();
        numss.add(1);
        numss.add(2);
        System.out.println("from numsss :: " + " " + numss );

        Set<String> dataName = new HashSet<>();
        dataName.add("lalalalala");
        System.out.println("from dataName :: " + " " + dataName );

        Map<Integer,String> students = new HashMap<>();
        students.put(1,"deepu");
        students.put(2,"olieee");
        System.out.println("Students are : " +" " + students);

        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println("Each student is from loop : " + student.getValue() + " " + student.getKey());
        }
        for (String student : students.values()){
            System.out.println("only student : " + " " + student);
        }

        int[] numz = {1, 2, 3, 4};
        System.out.println("converted into list : "+"  " + logic.converSion(numz));

//        Runnable task = () -> System.out.println("Task executed");

        //Threading
        List<Integer> orderAmount = List.of(100,200,300,400);

        Runnable caluculateTotalTask = () ->{
            int total =0;
            for (Integer amount:orderAmount){
                total = total+amount;
            }
            System.out.println("Executed by: " + Thread.currentThread().getName());
            System.out.println("Order total: " + total);
        };

        Thread calculationThread = new Thread(caluculateTotalTask);
        calculationThread.start();

        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> result2 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("From SET :: " +" : " + result2);



        List<String> tech = List.of("java","ram","program");
        Set<String> uniq = new HashSet<>(tech);

        class Employee {
            String name;
            int id;

            Employee(String name,int id){
                this.name = name;
                this.id = id;
            }
        }
        Employee employee = new Employee("Deepu", 20);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", "SUCCESS");
        response.put("message", "Employee fetched");
        response.put("data", employee.name);

        System.out.println("response for map of string and object " +" : " + response);

    }

}
