import static org.junit.Assert.*;

public class SimpleModuleTest {

    @org.junit.Test
    public void twice() {
        SimpleModule simpleModule = new SimpleModule();
        assertEquals(4,simpleModule.twice(2));
        assertEquals(6,simpleModule.twice(3));
        assertEquals(8,simpleModule.twice(4));
    }
}