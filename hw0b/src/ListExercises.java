import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i : L) {
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> newL = new ArrayList<>();
        for (int i : L) {
            if (i % 2 == 0) {
                newL.add(i);
            }
        }
        return newL;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> L = new ArrayList<>();
        for (int i : L1) {
            if (L2.contains(i)) {
                L.add(i);
            }
        }
        return L;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        // sum
        /*
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        System.out.print(sum(L));
         */
        // evens
        /*
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        System.out.print(evens(L));
         */
        // common
        /*
        List<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(2);
        List<Integer> L2 = new ArrayList<>();
        L2.add(2);
        L2.add(3);
        System.out.print(common(L1, L2));
         */
        // countOccurrencesOfC
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("juice");
        char c = 'e';
        System.out.println(countOccurrencesOfC(words, c));


    }
}
