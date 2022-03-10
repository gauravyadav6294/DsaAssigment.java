/*  3.  Given a sorted array of non-negative distinct integers, find the smallest missing non-negative
 element in it.
Input:  nums[] = [0, 1, 2, 6, 9, 11, 15]
Output: The smallest missing element is 3
 
Input:  nums[] = [1, 2, 3, 4, 6, 9, 11, 15]
Output: The smallest missing element is 0
 
Input:  nums[] = [0, 1, 2, 3, 4, 5, 6]
Output: The smallest missing element is 7
----------------------------------------------*/

class Solution{

    public static int missingFirst(int arr[], int start, int end){

        if(start>end){
            return end+1;
        }

        if(strat!=arr[strat]){
            return start;
        }

        int mid=(strat+end)/2;

        if(arr[mid]==mid){
            return missingFirst(arr,mid+1, end);
        }
        return missingFirst(arr, strat, mid);
    }

    public static void main(String [] args){
        Scanner scn =new Scanner(System.in);
        int n=arr.length;
        int arr[]={0,1,2,3,4,5,6,7,10};
        System.out.println(missingFisrt(arr,start,end));
    }
}

