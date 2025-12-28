public class SortedMatrix {
    public static void main(String[] args){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        int count = countNegatives(grid);

        System.out.println(count);
    }

    public static int countNegatives(int[][] grid){

        int rows = grid.length;
        int cols = grid[0].length;

        int row = 0;
        int col = cols - 1;
        int count = 0;

        while(row < rows && col >= 0){
            if(grid[row][col] < 0){
                count += rows - row;
                col --;
            }
            else{
                row++;
            }
        }

        return count;
    }
}
