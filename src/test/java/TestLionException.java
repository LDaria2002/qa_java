import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLionException {

    String sex;
    Feline feline;


    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"UNKNOWN"},
                {"Альфа"},
                {null},
        }; // тестовые данные для работы
    }
    public TestLionException(String sex) {
        this.sex = sex;
    }

    @Test(expected = Exception.class)
    public void testDoesHaveMane() throws Exception{
        new Lion(sex, feline);
    }
}
