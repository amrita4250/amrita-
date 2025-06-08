public class Array_Day_1 {
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
            System.out.println("larges no.");
        }
    }


