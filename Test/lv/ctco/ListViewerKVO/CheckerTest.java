package lv.ctco.ListViewerKVO;

import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CheckerTest {
    Checker checker;

    @Before
    public void setUp() {
        checker = new Checker();
    }

    @Test
    public void testCheckOperationIfTrue() throws Exception {
        String operation="add";
        assertTrue(checker.checkOperation(operation));
    }
    @Test
    public void testCheckOperationIfFalse() throws Exception {
        String operation="asd";
        assertFalse(checker.checkOperation(operation));
    }

    @Test
    public void testCheckOperationIfNull() throws Exception {
        String operation=null;
        assertFalse(checker.checkOperation(operation));
    }

}
