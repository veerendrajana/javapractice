import java.util.HashMap;

public class NRepeatedElements {
    public static void main(String[] args){
        int[] nums = {5,1,5,2,5,3,5,4};

        int answer = repeatedNTimes(nums);

        System.out.println(answer);
    }

    private static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : nums){
            if(map.get(i) > 1){
                return i;
            }
        }

        return -1;
    }
}
