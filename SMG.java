public class SMG extends Gun {
        
    // the SMG subclass has
    // one field
    public int fireRate;

    // the SMG subclass has
    // one constructor
    public SMG(int startFireRate, int startdamage,int startrounds, int startmagazine) {
        super(startdamage, startrounds, startmagazine);
        fireRate = startFireRate;
    }   
        
    // the SMG subclass has
    // one method
    public void setFireRate(int newValue) {
        fireRate = newValue;
    }   

}
