public class SMG extends Gun {
        
    // the SMG subclass has
    // one field
    public int fireRate;

    // the SMG subclass has
    // one constructor
    public SMG(int loadFireRate, int loadDamage,int loadRounds, int loadMagazine) {
        super(loadDamage, loadRounds, loadMagazine);
        fireRate = loadFireRate;
    }   
        
    // the SMG subclass has
    // one method
    public void setFireRate(int newValue) {
        fireRate = newValue;
    }   

}
