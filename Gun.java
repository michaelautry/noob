public class Gun {
        
    // the Gun class has
    // three fields
    private int damage;
    private int magazine;
    private int rounds;
        
    // the Gun class has
    // one constructor
    public Gun(int startdamage, int startrounds, int startmagazine) {
        magazine = startmagazine;
        damage = startdamage;
        rounds = startrounds;
    }
        
    // the Gun class has
    // four methods
    public void setdamage(int newValue) {
        damage = newValue;
    }
        
    public void setmagazine(int newValue) {
        magazine = newValue;
    }
        
    public void pullTrigger(int decrement) {
        rounds -= decrement;
    }
        
    public void reload(int increment) {
        rounds += increment;
    }
        
}
