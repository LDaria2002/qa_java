import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class TestLionParam {

    String sex;
    boolean expectedResult;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        }; // тестовые данные для работы
    }
    public TestLionParam (String sex, boolean expectedResult ) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion;
        lion = new Lion(sex);
        Assert.assertEquals(lion.doesHaveMane(), expectedResult);
    }
}
