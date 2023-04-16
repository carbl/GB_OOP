package Lesson6.LSP;
import java.math.BigDecimal;
public class Deposit extends Account {
    @Override
    public BigDecimal balans(String numberAccount) {
        return super.balans(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }
}
