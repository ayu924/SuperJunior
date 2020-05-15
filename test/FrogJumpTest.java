import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJumpTest {
    @Test
    public void jump() throws Exception{
        assertEquals(8,new FrogJump().jump(5));
    }
}