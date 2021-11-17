import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class QuickFindTest {

    private static QuickFind quickFind;

    @BeforeClass
    public static void init(){
        quickFind = new QuickFind();
    }

    @Before
    public void beforeTestProcess(){
        quickFind.setArr(new int[]{0});
    }

    @Test
    public void quickUnionConnectedTest(){
        int [] myArr = new int[10];
        myArr = new int[]{0, 1, 1, 8, 8, 0, 0, 1, 8, 8};

        quickFind.setArr(myArr);

        assertEquals(true,quickFind.connected(1,2));
    }

    @Test
    public void quickUnionTest(){
        int [] myArr = new int[10];
        myArr = new int[]{0, 1, 1, 8, 8, 0, 0, 1, 8, 8};

        quickFind.setArr(myArr);
        quickFind.union(0,1);

        assertEquals(true,quickFind.connected(0,1));
        assertEquals(true,quickFind.connected(0,2));
        assertEquals(true,quickFind.connected(0,7));
        assertEquals(true,quickFind.connected(5,7));
        assertEquals(true,quickFind.connected(6,7));
    }
}
