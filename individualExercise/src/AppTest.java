import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAvgArray() {
        // var app = new App();
        int[] x = {1, 5, 4, 3, 10};
        assertEquals(4.6, App.avgArray(x), 0.1);
    }
}
