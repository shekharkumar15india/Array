import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int arr[],int keys){
        int start=0;int end=arr.length -1;
while (start<=end) {
    int mid=(start+end)/2;
    if(arr[mid]==keys){
return mid;
    }   
    else if (arr[mid]<keys) {
        start=mid+1;
    }
    else{
        end=mid-1;
    }
}

return -1;
}
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            System.out.println("enter the size of array:");
           //create the size of array
            int size=s.nextInt();
            int arr[]= new int[size];
    //enter the element in array44
    System.out.println("enter the "+size + " elements:");
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    //display the element of array
    System.out.println("element of an array are:");
    for(int i=0 ;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    int keys=15;
    System.out.println("the elemnent index are: "+binarySearch(arr, keys));
 }  
}
