
 class Account {
    int rate;
    int amount;
    int interest;
    Account(int r, int a)
    {
    rate=r;
    amount=a;
}
void Total_Interest()
{
    int rate=5;
    rate=this.rate+rate;//use of this keyword
    interest=rate*amount/100;
    System.out.println("Total Interest on amount"+amount+" is:"+interest);
}
}
public class ThisTest {
    public static void main(String[] args)
    {
        Account Acc1=new Account(5,5000);
        Acc1.Total_Interest();
    }
}
