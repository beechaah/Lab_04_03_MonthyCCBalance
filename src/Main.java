public class Main
{
    public static void main(String[] args)
    {
        double ccBalance = 5000;
        double intrestRate = 0.17;
        double balance;

        System.out.println("Enter your Credit Card Balance: ");
        System.out.println("Enter your Intrest Rate: ");

        for(int month = 1; month <= 12; month++);
        balance = ccBalance + ccBalance * intrestRate;
        System.out.println("Your balance for month is :" + balance);
    }
}