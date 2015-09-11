public class SMG extends Gun {

    // the SMG subclass has
    // one field

public int caliber;

    // the SMG subclass has
    // one constructor    

public SMG( int setCaliber, int changeMagazine, int changeRange) {
    super(changeDamage, changeMagazine, changeRange)
        caliber = setCaliber;

    }           
    
    // the SMG subclass has
    // one method
    public void setCaliber(int newValue) {
        caliber = newValue;
    }
    
}
