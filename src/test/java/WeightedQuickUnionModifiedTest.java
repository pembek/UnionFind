import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WeightedQuickUnionModifiedTest {

    private static WeightedQuickUnionModified weightedQuickUnionModified;

    @BeforeClass
    public static void init(){
        weightedQuickUnionModified = new WeightedQuickUnionModified(10);
    }

    @Before
    public void beforeTestProcess(){
        int [] myArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        weightedQuickUnionModified.setArr(myArr);    }

    @Test
    public void quickUnionConnectedTest(){

        assertEquals(false,weightedQuickUnionModified.connected(1,2));
    }

}
