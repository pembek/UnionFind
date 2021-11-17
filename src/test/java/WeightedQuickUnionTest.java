import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WeightedQuickUnionTest {

    private static WeightedQuickUnion weightedQuickUnion;

    @BeforeClass
    public static void init(){
        weightedQuickUnion = new WeightedQuickUnion(10);
    }

    @Before
    public void beforeTestProcess(){
        int [] myArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        weightedQuickUnion.setArr(myArr);
    }

    @Test
    public void quickUnionConnectedTest(){

        assertEquals(false,weightedQuickUnion.connected(1,2));
    }

}
