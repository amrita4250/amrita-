public class amrita_reverseArray2 {
    public static void ReverseArray(int[] arr){
        int n = arr.length;
        int left  = 0;
        int right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[]args){
        int[] arr = {1, 4, 3, 2, 6, 5};
        ReverseArray(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
