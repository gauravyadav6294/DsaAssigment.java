
  /*2. For the given array = ['a','b','d','e','f','g','h','i','x','z'] use binary search to find the target 
  element = 'z'*/


  import java.io.*;
  import java.util.*;

  class Solution{

      public static char[] Search(char arr[], char target){
         
         int low=0;
         int high=arr.length-1;
            
        while(low<=high){
         int mid=(low+high)/2;

         if(arr[mid]==target){
             return mid;
         }

         else if(arr[mid]>target){
            low=mid+1; 
         }
         else{
             high=mid-1;
         }
      }
  }
}