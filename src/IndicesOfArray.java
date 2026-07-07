import java.util.ArrayList;
import java.util.HashMap;

public class IndicesOfArray {
    public static void main(String[] args) {

        int[] arr = {5,12,7,10,8,9};
        int target = 17;

        ArrayList<Integer[]> indices = indices(arr, target);

        for(Integer[] indexPair : indices) {
            System.out.println("Indices: " + indexPair[0] + ", " + indexPair[1]);
        }
    }

        public static ArrayList<Integer[]> indices(int[] arr, int target) {
        ArrayList<Integer[]> indices = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i  < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                indices.add(new Integer[]{map.get(complement), i});
            }
            map.put(arr[i], i);
        }
        return indices;
    }
}
