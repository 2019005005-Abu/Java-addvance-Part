class QuickSort{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
          if(arr[j]<pivot){
            i++;
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp; 
          }
        }
        i++;
       int temp=arr[i];
       arr[i]=pivot;
       arr[high]=temp;
       return i;
    }
    public static void  QuickSort(int arr[],int low,int high) {
        if(low<high){
            int pidx=partition(arr,low,high);
           QuickSort(arr,low,pidx-1);
           QuickSort(arr,pidx+1,high);
        }
    }
  public static void main(String[] args) {
    int[]arr={40,50,10,56};
    int n=arr.length;
     QuickSort(arr, 0, n-1);
     //print
     for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
     }
     System.out.println();
  }  
}

//time complexity is-> worst-Case-0(n^2)
//time complexity is->Average->Case(nlogn) 
