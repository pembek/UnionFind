import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class WeightedQuickUnionWithPathCompressionTest {

    private static WeightedQuickUnionWithPathCompression weightedQuickUnionWithPathCompression;

    @BeforeClass
    public static void init(){
        weightedQuickUnionWithPathCompression = new WeightedQuickUnionWithPathCompression(10);
    }

    @Before
    public void beforeTestProcess(){
        int [] myArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        weightedQuickUnionWithPathCompression.setArr(myArr);
    }

    @Test
    public void quickUnionConnectedTest(){

        assertEquals(false,weightedQuickUnionWithPathCompression.connected(1,2));
    }

    /** Social network connectivity.
     Given a social network containing n members and a log file
     containing m timestamps at which times pairs of members
     formed friendships, design an algorithm to determine the
     earliest time at which all members are connected
     (i.e., every member is a friend of a friend of a friend ... of a friend).
     Assume that the log file is sorted by timestamp and that
     friendship is an equivalence relation. The running time of your
     algorithm should be m \log nmlogn or better and use extra space
     proportional to n. */
    //SOLUTION: continue to call union in list of m unions
    //until every node is connected
    //
    @Test
    public void weightedQuickUnionConnectedTest(){

        weightedQuickUnionWithPathCompression.union(1,2);
        weightedQuickUnionWithPathCompression.union(1,5);
        weightedQuickUnionWithPathCompression.union(1,8);
        weightedQuickUnionWithPathCompression.union(4,3);
        weightedQuickUnionWithPathCompression.union(3,6);
        weightedQuickUnionWithPathCompression.union(4,7);
        weightedQuickUnionWithPathCompression.union(4,9);
        weightedQuickUnionWithPathCompression.union(4,0);

        weightedQuickUnionWithPathCompression.union(4,8);
        // now all the tree must be connected

        //assert that all the nodes are connected
        for (int i = 0; i < weightedQuickUnionWithPathCompression.getArr().length - 1; i++){
            assertTrue(weightedQuickUnionWithPathCompression.connected(0,i+1));
        }
    }
}
