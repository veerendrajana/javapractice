public class SortedMatrix {
    public static void main(String[] args){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        int count = countNegatives(grid);

        System.out.println(count);
    }

    public static int countNegatives(int[][] grid){

        int columns = grid[0].length;
        int count = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < columns; j++) {
                if (ints[j] < 0) count++;
            }
        }

        return count;
    }
}
