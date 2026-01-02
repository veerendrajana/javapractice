import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NRepeatedElements {
    public static void main(String[] args){
        int[] nums = {5,1,5,2,5,3,5,4};

        int answer = repeatedNTimes(nums);

        System.out.println(answer);
    }

    private static int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(!set.contains(i)) return i;

            set.add(i);
        }

        throw new Error("No repeated element was found");
    }
}
