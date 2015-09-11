public class Gun {
    // the Gun class has    
    // four fields    
    private int damage;    
    private int magazine;         
    private int range;    
    private int rounds;   
    
    // the Gun class has    
    // one constructor    
    public Gun(int changeDamage, int changeMagazine, int changeRange) {        
        damage = changeDamage;        
        magazine = changeMagazine;        
        range = changeRange;    
        
    }   
    
    // the Gun class has    
    // four methods
    
    public void changeDamage(int newValue) {        
        damage = newValue;    
        
    }            
    
    public void changeMagazine(int newValue) {        
        magazine = newValue;    
            
    }            
    
    public void pullTrigger(int decrement) {
        rounds -= decrement;    
        
    }            
    
    public void reload(int increment) {
        rounds += increment;    
        
    }        
    
}
