import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPM = 1e-9;  // 1e-9 = 0,000_000_0001
    private static Vector2D v1;

    @BeforeClass
    public static void CreateObjectVector(){
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLegth() {
        Vector2D v1 = new Vector2D(); // action
        // assertion
        Assert.assertEquals(0, v1.length(), EPM);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), EPM);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), EPM);
    }
}
