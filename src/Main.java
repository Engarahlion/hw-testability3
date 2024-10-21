public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000;
        int timeMonths = 36;

        int payment = service.calculateCredit(amountCredit, timeMonths);

        System.out.println(payment);
    }
}