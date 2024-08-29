import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(new int[]{9,3,9,3,9,7,9,2});
    }
}

class Solution {
    public void solution(int[] A) {

        //AtomicInteger occurrence = new AtomicInteger();

        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        Arrays.stream(A).forEach(value -> {
            // for odd numbers
            if (value%2 == 1) {
                occurrenceMap.put("Number", value);

            } else {
                System.out.println("even number -> " + value);
            }

        });



//        for (int i=0; i < A.length; i++) {
//            //if (A[i]%2 == 1) {
//
//
//            //}
//        }

        System.out.println(occurrenceMap.size());
    }
}