import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class QuickUnionTest {

    private static QuickUnion quickUnion;

    @BeforeClass
    public static void init(){
        quickUnion = new QuickUnion(10);
    }

    @Before
    public void beforeTestProcess(){
        quickUnion.setArr(new int[]{0});
    }

    @Test
    public void quickUnionConnectedTest(){
        int [] myArr = new int[10];
        myArr = new int[]{0, 1, 1, 8, 8, 0, 0, 1, 8, 8};

        quickUnion.setArr(myArr);

        boolean b = quickUnion.connected(1,2);

        assertEquals(true,quickUnion.connected(1,2));
    }

    @Test
    public void quickUnionTest(){
        int [] myArr = new int[10];
        myArr = new int[]{0, 1, 1, 8, 8, 0, 0, 1, 8, 8};

        quickUnion.setArr(myArr);

        assertEquals(false,quickUnion.connected(0,1));
        assertEquals(false,quickUnion.connected(0,2));
        assertEquals(false,quickUnion.connected(0,7));
        assertEquals(false,quickUnion.connected(5,7));
        assertEquals(false,quickUnion.connected(6,7));
        assertTrue(quickUnion.connected(6,0));
        assertTrue(quickUnion.connected(5,0));
        assertTrue(quickUnion.connected(1,2));
        assertTrue(quickUnion.connected(1,7));
        assertTrue(quickUnion.connected(8,9));
        assertTrue(quickUnion.connected(8,3));
    }
}
