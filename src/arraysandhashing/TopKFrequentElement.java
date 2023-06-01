package arraysandhashing;

import java.util.*;
import java.util.stream.Collectors;
/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 * */
public class TopKFrequentElement {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elements= new TreeMap<>();
        for(int num : nums){
            if(elements.containsKey(num)){
                elements.put(num, elements.get(num) +1);
            }
            else
                elements.put(num,1);
        }
        int result[] = new int[k];
        elements = elements.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        Object[] objects = elements.keySet().toArray();
        for(int i=0; i<k; i++)
            result[i] = (int) objects[i];
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {4,1,-1,2,-1,2,3}, k = 2;
        int[] ints = topKFrequent(nums, k);
        Arrays.stream(ints).sorted().forEach(num-> System.out.println(num));
    }

}
