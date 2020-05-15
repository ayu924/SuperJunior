import org.junit.Test;

import static org.junit.Assert.*;

public class SummerTest {
    @Test
    public void summer() throws Exception {
        assertEquals(9,new Summer().summer(3,6));
    }

}