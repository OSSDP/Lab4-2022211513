import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private Solution solution;
    private int[][] board;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testGameOfLifeExample1() {
        // Example 1
        board = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] expected = new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        solution.gameOfLife(board);
        assertBoardState(expected);
    }

    @Test
    public void testGameOfLifeExample2() {
        // Example 2
        board = new int[][]{{1,1},{1,0}};
        int[][] expected = new int[][]{{1,1},{1,1}};
        solution.gameOfLife(board);
        assertBoardState(expected);
    }

    @Test
    public void testGameOfLifeEmptyBoard() {
        // Test with an empty board
        board = new int[][]{};
        solution.gameOfLife(board);
        assertBoardState(new int[][]{});
    }

    @Test
    public void testGameOfLifeSingleRowColumn() {
        // Test with a single row and column
        board = new int[][]{{0}};
        int[][] expected = new int[][]{{0}};
        solution.gameOfLife(board);
        assertBoardState(expected);
    }

    @Test
    public void testGameOfLifeAllDead() {
        // Test with all dead cells
        board = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int[][] expected = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        solution.gameOfLife(board);
        assertBoardState(expected);
    }

    @Test
    public void testGameOfLifeAllAlive() {
        // Test with all alive cells
        board = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] expected = new int[][]{{1,0,0,1},{0,0,0,0},{0,0,0,0},{1,0,0,1}};
        solution.gameOfLife(board);
        assertBoardState(expected);
    }

    private void assertBoardState(int[][] expected) {
        for (int i = 0; i < board.length; i++) {
            assertArrayEquals("Row " + i + " does not match expected state.", expected[i], board[i]);
        }
    }
}