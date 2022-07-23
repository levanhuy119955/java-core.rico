import java.util.ArrayList;
import java.util.List;

public class Bai_442 {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> num =new ArrayList<>();
        int[] arr =new int[1000000];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==2){
                num.add(i);
                arr[i]=0;
            }
        }
        return num;
    }
}
