package volobueva;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

@RunWith(Parameterized.class)
public class TestOfFindingMinCycle {
    private final int n;
    private final int expectedResult;

    public TestOfFindingMinCycle(int n, int expectedResult) {
        this.n = n;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> cases() {
        return Arrays.asList(new Object[][]{
                {5, 4},
        });
    }

    @Test
    public void testOfFinding() throws Exception {
        for (int i = 0; i < MinCycle.N; i++)
            MinCycle.graph[i] = new Vector<>();

        MinCycle.addEdge(0, 6);
        MinCycle.addEdge(0, 5);
        MinCycle.addEdge(5, 1);
        MinCycle.addEdge(1, 6);
        MinCycle.addEdge(2, 6);
        MinCycle.addEdge(2, 3);
        MinCycle.addEdge(3, 4);
        MinCycle.addEdge(4, 1);

        int actualResult = MinCycle.findShortestCycle(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
