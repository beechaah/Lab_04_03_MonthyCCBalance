public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double interestRate = 0.17;

        System.out.println("Enter your Credit Card Balance: ");
        System.out.println("Enter your Interest Rate: ");

        balance = balance + balance * interestRate;
        System.out.println("Your balance for month one is : " + balance);

        balance = balance + balance * interestRate;
        System.out.println("Your balance for month two is : " + balance);
    }
}