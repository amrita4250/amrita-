public class amrita_Array_Day_1 {
        public int getSecondLargest(int[] arr) {
            // code here
            int largest = -1;
            int secondLargest = -1;
            for(int currentElement : arr){
                if(currentElement > largest){
                    secondLargest = largest;
                    largest = currentElement;
                }

                if(currentElement < largest && currentElement > secondLargest){
                    secondLargest =  currentElement;
                }
            }
            return secondLargest;
        }
        public static void main(String[] args){
                int[] arr = {1,6,3,6};
           getSecondLargest(arr);
                for(int num: arr){
System.out.print(num + " " );
        }
    }


