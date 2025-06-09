import java.util.Scanner;
public class amrita_RotateArray {

//    public static void Rotate(int[] arr) {
//        Rotate(arr, 0, arr.length - 1); // Call the overloaded version
//    }
    public static void Rotate(int[] arr, int left, int right){
         left=0;
         right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void RotatebyD(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of d");
        int d = sc.nextInt();
        sc.close();
        int n = arr.length;
        int b = d%n;
        Rotate(arr, 0 , b-1);
        Rotate(arr, b , n-1);
        Rotate(arr, 0 , n-1);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        RotatebyD(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
