public class largestNumberinArray {
public static int largestNumberinArray(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=1;i<arr.length; i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
    }
    return largest;
}

    public static void main(String[] args) {
    int arr[]={1,3,5,6,12,31,4,8};
System.out.println("largest number are: "+ largestNumberinArray(arr));
    }
}
