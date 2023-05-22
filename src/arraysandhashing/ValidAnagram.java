package arraysandhashing;

import java.util.HashMap;
/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        HashMap<Character, Integer> map = getCharacterOccurrence(s);
        HashMap<Character, Integer> map2 = getCharacterOccurrence(t);
        if(map.equals(map2))
            return true;
        return false;
    }

    public static HashMap<Character,Integer> getCharacterOccurrence(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.replace(s.charAt(i), (map.get(s.charAt(i)) + 1));
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        //String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }
}
