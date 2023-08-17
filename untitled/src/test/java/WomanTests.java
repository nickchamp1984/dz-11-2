import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    Woman woman = new Woman("Mila", "", 38);
    Woman woman1 = new Woman("Vasylyna", "", 65);

    @Test
    void womanIsRetired() {
        Assert.assertTrue(woman1.isRetired());
    }

    @Test
    void womanIsNotRetired() {
        Assert.assertFalse(woman.isRetired());
    }
}
