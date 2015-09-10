public class SMG extends Gun {
        
    // the SMG subclass has
    // four fields
    private int magazineSize;
    private int roundType;
    private int damage;
    private int range;


    // the SMG subclass has
    // one constructor
    public SMG(int changeMagazineSize, int changeRoundType, int changeDamage, int changeRange) {
        super(changeMagazineSize, changeRoundType, changeDamage, changeRange);
    }   
        
    // the SMG subclass has
    // four methods
    public void changeMagazineSize(int newValue) {
      magazineSize = newValue;
  }

  public void changeRoundType (int newValue) {
      roundType = newValue;    
  }

  public void changeDamage (int newValue) {
      damage = newValue;    
  }

  public void changeRange (int newValue) {
      range = newValue;
  }

  public void printStates() {
      System.out.println("Magazine size:" + magazineSize + " round:" + roundType + " damage:" + damage + " range:" + range );
  }
  
}