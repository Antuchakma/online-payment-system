public class Mobile {
    public Mobile getMobile(String s)
    {
        if(s==null)
        {
            return null;
        }

        else if(s=="PP")
        {
            PP one = new PP();
            one.makepayment(20000);
        }

        else if(s=="Credit")
        {
            CreditCard one = new CreditCard();
            one.makepayment(347653);
        }
    }


}
