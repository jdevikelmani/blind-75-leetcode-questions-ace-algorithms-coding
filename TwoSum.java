import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]) {
        int nums[] = {3,2,4} ;
        int target = 6;
        int [] output = twoSum(nums, target);
        System.out.println(output[0]);
        System.out.println(output[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        //input: nums = [2,7,11,15], target = 9
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
           int ans[] = new int[2];
           for(int i =0; i < nums.length; i++) {

               int diff = target - nums[i];
               if(! map.containsKey(diff)) {
                   map.put(nums[i], i);

               }else {
                   ans[0] = map.get(diff);
                   ans[1]  = i;

               }


           }

return ans;

    }
}
