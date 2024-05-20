import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    private List<String> expectedFood;

    @Before
    public void setLion(){
        expectedFood = List.of("Животные","Птицы", "Рыба");

    }


    @Mock
    Feline feline;



    @Test//тестируем метод getKittens класса Lion
    public void testReturnGetKittens() {
        Lion lion = new Lion(true, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int result = lion.getKittens();
        Assert.assertEquals(1,result);
    }


    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(true, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, lion.getFood());
    }

}