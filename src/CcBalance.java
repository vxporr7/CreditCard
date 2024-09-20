public class CcBalance {
    public static void main(String[] args) {
        System.out.println("You have $5000 as credit before interest!");

        double preInterest = 5000;
        double interestRate = 0.17;
        double interestCost1 = preInterest * interestRate;
        double interestCost2 = interestCost1 * interestRate;
        //

        System.out.println("Your credit card balance after month 1 is " + interestCost1);
        System.out.println("Your credit card balance after month 2 is " + interestCost2);
    }
}