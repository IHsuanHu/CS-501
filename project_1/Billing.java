public class Billing {
    // I-Hsuan Hu
    // I pledge my honer that I have abided by the Stevens Honer System

    private final float TAX = (float) 0.08;
    float total;
     
    public float computeBill(float price) {
        total = (float) (price * (1.0 + TAX));
        return total;
    }
    
    public float computeBill(float price, int quantity) {
        total = (float) (price * (1.0 + TAX) * quantity);
        return total;
    }
    
    public float computeBill(float price, int quantity, float coupon) {
        total = (float) ((price* quantity - coupon) * (1.0 + TAX));
        return total;
    }
     
    public static void main(String[] args) {
        
        Billing newBilling = new Billing();
        System.out.println(newBilling.computeBill((float)50.1));
        System.out.println(newBilling.computeBill((float)50.2, 5));
        System.out.println(newBilling.computeBill((float)100.2, 5, (float)99.99));
        
    }
}