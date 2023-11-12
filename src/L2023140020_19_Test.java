import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * 测试目的：验证Solution19类中gameOfLife方法的正确性
 * 测试用例设计原则：基于等价类划分原则，选取不同的初始状态，包括不同大小的板以及不同活细胞和死细胞的分布情况。
 */
public class L2023140020_19_Test {

    /**
     * 测试方法目的：验证正常大小板的生命游戏逻辑
     * 测试用例：标准大小的板，含有活细胞和死细胞
     */
    @Test
    public void testGameOfLifeStandard() {
        Solution19 solution = new Solution19();
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * 测试方法目的：验证小尺寸板的生命游戏逻辑
     * 测试用例：小尺寸板，只包含活细胞
     */
    @Test
    public void testGameOfLifeSmallBoard() {
        Solution19 solution = new Solution19();
        int[][] board = {{1, 1}, {1, 0}};
        int[][] expected = {{1, 1}, {1, 1}};
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * 测试方法目的：验证边界情况的处理
     * 测试用例：空板
     */
    @Test
    public void testGameOfLifeEmptyBoard() {
        Solution19 solution = new Solution19();
        int[][] board = new int[0][0];
        int[][] expected = new int[0][0];
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }
}
