import coins.Coin;
import coins.CoinType;
import machine.components.CoinReturn;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CoinReturnTest {

    Coin coin1;
    Coin coin2;
    Coin coin3;
    Coin coin4;
    Coin coin5;
    Coin coin6;
    CoinReturn coinReturn;

    @Before
    public void before() {
        coin1 = new Coin(CoinType.ONEPENCE);
        coin2 = new Coin(CoinType.TWOPENCE);
        coin3 = new Coin(CoinType.FIVEPENCE);
        coin4 = new Coin(CoinType.TENPENCE);
        coin5 = new Coin(CoinType.FIFTYPENCE);
        coin6 = new Coin(CoinType.ONEPOUND);
        coinReturn = new CoinReturn();
    }

    @Test
    public void addsAcceptedCoinsReturnsTotal() {
        coinReturn.addCoin(coin4);
        coinReturn.addCoin(coin5);
        coinReturn.addCoin(coin6);
        assertEquals(1.6, coinReturn.getValueOfCoins(), 0.0);
    }

    @Test
    public void doesNotAddAcceptedCoins() {
        coinReturn.addCoin(coin1);
        coinReturn.addCoin(coin2);
        coinReturn.addCoin(coin3);
        assertEquals(0.0, coinReturn.getValueOfCoins(), 0.0);
    }

}
