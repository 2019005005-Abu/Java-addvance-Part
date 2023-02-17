class MergeSort{
  public static void conquer(int arr[],int si,int ei,int mid){
    int merged[]=new int [ei-si+1];
   int index_1=si;
   int index_2=mid+1;
   int x=0;
   while(index_1 <=mid && index_2 <=ei){
    if(arr[index_1] <=arr[index_2]){
     merged[x++]=arr[index_1++];
    }else{
      merged[x++]=arr[index_2++];
    }
   }
   while(index_1<=mid){
    merged[x++]=arr[index_1++];
   }
   while(index_2 <=ei){
    merged[x++]=arr[index_2++];
   }
    for(int i=0,j=si;i<merged.length;i++,j++){
      arr[j]=merged[i];
    }
  }
  public static void divide(int arr[],
    int si,int ei){
    if(si>=ei){
      return;
    }
    int mid=si+(ei-si)/2;//(si+ei)/2
    divide(arr,si,mid);
    divide(arr,mid+1,ei);
    conquer(arr,si,mid,ei);

  }
  public static void main(String[] args) {
    int arr[]={6,3,9,5,2,8};
    int n=arr.length;
    divide(arr, 0, n-1);
    //print
    for(int i=0;i<n;i++){
      System.out.println(arr[i]+" ");
    }
    System.out.println();
  }
}

//time complexity-Big o(nlog)
