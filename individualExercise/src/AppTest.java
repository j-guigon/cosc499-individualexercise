import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testSumArray() {
        var app = new App();
        int[] x = {1, 5, 4, 3, 10};
        assertEquals(23, app.sumArray(x));
    }
}
