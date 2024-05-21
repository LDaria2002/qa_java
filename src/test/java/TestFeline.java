import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    private List<String> expectedFood;
    Feline feline = new Feline();

    @Before
    public void setFeline(){
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void testEatMeat() throws Exception {
       Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, feline.eatMeat());
    }

    @Test//тестируем метод getKittens без параметра
    public void testOfKittens(){
        feline.getKittens();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test //тестируем метод getKittens c параметром
    public void testGetKittens(){
        int result = feline.getKittens (2);
        Assert.assertEquals(2, result );
    }

    @Test
    public void testGetFamily(){
        String expected = "Кошачьи";
        Assert.assertEquals(expected, feline.getFamily());
    }
}
