import coins.Coin;
import coins.CoinType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CoinTest {

    Coin coin;

    @Before
    public void before() {
        coin = new Coin(CoinType.ONEPOUND);
    }

    @Test
    public void hasType() {
        assertEquals(CoinType.ONEPOUND, coin.getCoinType());
    }

    @Test
    public void hasValue() {
        assertEquals(1.00, coin.getValue(), 0.0);
    }

}
