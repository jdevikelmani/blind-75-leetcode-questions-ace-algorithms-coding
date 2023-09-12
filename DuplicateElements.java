import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void main(String args[]) {

        int[] nums1 = {1, 2, 3, 4, 4};
       // boolean dup = containsDuplicate(nums1);
        boolean dup = containsDuplicateUsingHashSet(nums1);
        System.out.println("Array has" +" " +dup);

    }

    public static  boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {

                return true;
            }

        }

        return false;

    }

    public static  boolean containsDuplicateUsingHashSet(int[] nums) {

        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;

            } else {
                hashSet.add(nums[i]);

            }

        }
        return false;

    }

    }