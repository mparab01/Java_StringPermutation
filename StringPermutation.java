

/*

Q. Given two strings, write a method to decide if one is a permutation of the other
Solution : "god" is anagram of "dog". Assuming spcae senstive code. 

*/


package stringpermutation;

import java.util.Arrays;

public class StringPermutation {
    
    public boolean CompareString(String f, String s ){
        
        boolean result;
       
        if (f.length()!= s.length()){       // Return false if Strings of unequal length
            return false;
            }
        else
            
            f = SortString(f);
            s = SortString(s);
            
            System.out.println(" Sorted First String   : " +f);
            System.out.println(" Sorted Second String  : " +s);
            result = f.equals(s); // Comparing sorted strings :  f, and s
            
            return result;
    }
    
    public String SortString(String s){
        
        char[]Char_array= s.toCharArray();  //Converting into an array
        Arrays.sort(Char_array);        //Sorting
        return new String (Char_array); 
    }
    

    public static void main(String[] args) {
        
        String f_str  = "StringComparisonUsingJava"; // Strings are case sensitive eg. "A" != "a"
        String s_str  = "SJatrivangCoUsimpangrison";
        StringPermutation obj = new StringPermutation();
        boolean comp = obj.CompareString(f_str,s_str);
        
        System.out.println(" Two strings are equal : " +comp);
        
    }
    
}
