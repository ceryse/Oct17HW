import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void abcTest1() {
        boolean result = Main.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = Main.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = Main.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4(){
        boolean result = Main.abcTest("");
        assertEquals(false, result);
    }

    @Test
    public void alternateStrings1() {
        String result = Main.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStrings2() {
        String result = Main.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStrings3() {
        String result = Main.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }


    @Test
    public void alternateStrings4() {
        String result = Main.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStrings5() {
        String result = Main.alternateStrings("", "");
        assertEquals("", result);
    }

}