public class pairinArr {
    public static void pairinArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
         int current= arr[i];
         for(int j=i+1;j<=arr.length-1;j++){
System.out.print("(" +current+ ","+arr[j]+ ")");
         }   
         System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        pairinArr(arr);

    }
}
