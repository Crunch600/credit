public class CreditPaymentService {
    public int calculate(int amount, int term, double bid) {

        double percent = bid / 100 / 12;
        double x = Math.pow(1 + percent, term);
        double index = percent * (x / (x-1));

        double paymonth = amount * index;
        return (int) paymonth;
    }

}
