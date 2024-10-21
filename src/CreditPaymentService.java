public class CreditPaymentService {
    public int calculateCredit(int amountCredit, int timeMonths) {
        double result;
        double percents = 9.99 / 12 / 100;

        double annuityRate = (percents * Math.pow(1 + percents, timeMonths)) / (Math.pow(1 + percents, timeMonths) - 1);

        result = amountCredit * annuityRate;
        return (int) result;
    }
}