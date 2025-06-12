import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class amrita_majorityElement3 {
    public static List<Integer> FindMajorityElement(int[] arr){
        int n = arr.length;
        int count1 = 0, count2 = 0;
        Integer cand1 = null;
        Integer cand2 = null;
        for(int i:arr){
            if(cand1 != null && i == cand1){
                count1++;
            }else if(cand2 != null && i == cand2){
                count2++;
            }else if(count1 == 0){
                cand1 = i;
                count1 = i;
            }else if(count2 == 0){
                cand2 = i;
                count2  = i;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i :arr){
            if(cand1 == i) count1++;
            if(cand2 == i) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int a = n/3;
        if(count1>a) result.add(cand1);
        if(count2>a) result.add(cand2);

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,2,2,1,1};
        System.out.println(FindMajorityElement(arr));
    }
}
