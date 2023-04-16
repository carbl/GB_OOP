package Lesson6.LSP;
import java.math.BigDecimal;
public class Salary extends Account {
    @Override
    public BigDecimal balans(String numberAccount) {
        return super.balans(numberAccount);
    }
    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }
    public void payment(String numberAccount, BigDecimal sum) {
        payment(numberAccount, sum);
    }
}
