import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> map = new HashMap<>();
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, index);
            index++;
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, i * i);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> map = new TreeMap<>();
        for (String s : words) {
            int count = 0;
            for (String s1 : words) {
                if (s.equals(s1)) {
                    count++;
                }
            }
            map.put(s, count);
        }
        return map;
    }


    public static void main(String[] args) {
        // letterToNum
        /*
        Map<Character, Integer> map = letterToNum();
        for (Character key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get('b'));
         */
        // squares
        /*
        List<Integer> nums = Arrays.asList(1, 3, 6, 7);
        Map<Integer, Integer> map = squares(nums);
        System.out.println(map);
         */
        // countWord
        List<String> words = List.of("apple", "banana", "orange", "banana");
        System.out.println(countWords(words));
    }
}
