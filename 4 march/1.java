class Solution{

    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

     public int[] sortArray(int[] arr, int l , int r) {
    if(l<r){

        int pi=partation(arr,l,r);
        sortArray(arr,l,pi-1);
        sortArray(arr,pi+1,r);

        return arr;
     
     }

     public static void partation(int arr[], int l, int r){
      
      int pivot=arr[r];
      int i=l-1;

      for(int j=1;j<r;i++){
          if(arr[j]<pivot){
              i++;
              swap(arr,i,j);
          }
      }

      swap(arr,i+1,r);
      return i+1;
     }
}