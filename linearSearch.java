import java.util.Scanner;

public class linearSearch {
public static int linearSearch(int numbers[],int keys){
for(int i=0;i<numbers.length; i++){
    if(numbers[i]==keys){
        return i;
    }
    
}
return -1;
}


    public static void main(String[] args) {
        int numbers[]={2,4,6,34,12,33,56,5,43,32,7};
        System.out.println("enter the number:");
        Scanner s = new Scanner(System.in);
        int keys=s.nextInt();
        int index=linearSearch(numbers, keys);
        if(index==-1){
            System.out.println("keys not found.");
        }
        else{
            System.out.println("keys at index: " + index);
        }
    }
}