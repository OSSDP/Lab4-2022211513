public class Test {
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 0 ? '0' : '1');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        System.out.println("Initial board:");
        printBoard(board);

        solution.gameOfLife(board);
        System.out.println("Next state:");
        printBoard(board);

        int[][] board2 = {{1,1},{1,0}};
        System.out.println("\nInitial board 2:");
        printBoard(board2);

        solution.gameOfLife(board2);
        System.out.println("Next state:");
        printBoard(board2);
    }
}