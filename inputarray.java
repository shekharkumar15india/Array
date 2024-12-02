import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array:");
       //create the size of array
        int size=s.nextInt();
        int arr[]= new int[size];
//enter the element in array44
System.out.println("enter the "+size + " elements:");
for(int i=1;i<size;i++){
    arr[i]=s.nextInt();
}
//display the element of array
System.out.println("element of an array are:");
for(int i=0 ;i<arr.length;i++){
    System.out.println(arr[i]);

}

    }
}
