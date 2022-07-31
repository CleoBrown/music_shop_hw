import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShopTests {

    Maraca maraca;
    DoubleBass doublebass;
    FrenchHorn frenchHorn;
    SheetMusic sheetMusic;
    DrumStick drumStick;
    Shop shop;

    @Before
    public void before(){
        maraca = new Maraca("wood", "red", "shells");
        frenchHorn = new  FrenchHorn("brass", "gold", 3);
        sheetMusic = new SheetMusic(3, 9.99);
        drumStick = new DrumStick(1, 15);
        shop = new Shop("HornsRus");
        shop.addItem(sheetMusic);

    }

    @Test
    public void hasName(){
        assertEquals("HornsRus", shop.getName());
    }

    @Test
    public void addStock(){
        assertEquals(1, shop.getNumberOfItems());
        shop.addItem(drumStick);
        assertEquals(2, shop.getNumberOfItems());
    }

    @Test
    public void removeStock() {
        shop.removeItem(sheetMusic);
        assertEquals(0, shop.getNumberOfItems());

    }
    @Test
    public void calculateMarkup(){
        assertEquals(6.99, sheetMusic.calculateMarkup(),0.01);
    }


}
