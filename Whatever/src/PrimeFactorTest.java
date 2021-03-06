import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void Prime2() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2", result);
    }
    
    @Test
    public void Prime3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3", result);
    }
    
    @Test
    public void Prime4() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("22", result);
    }

    @Test
    public void Prime6() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23", result);
    }
}
