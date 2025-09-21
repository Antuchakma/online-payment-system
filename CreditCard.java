public class CreditCard extends Payment{

    @Override
     void makepayment(double payment){
        
         System.out.println("payment of "+payment+" was made by CRedit card");
    }
    
}
