import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    private List<String> expectedFood;
    @Before
    public void setCat(){
        expectedFood = List.of("Мясо", "Птица", "Рыба");
    }

    @Mock
    private Feline feline;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound() );
    }

    @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals (expectedFood,cat.getFood());
    }
}