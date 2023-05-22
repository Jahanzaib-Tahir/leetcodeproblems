import java.util.HashMap;

/**
 * Description : Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            if(map.containsKey(num))
                return true;
            map.put(num,num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        //int nums[] = {1,2,3,4};
        //int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }
}
