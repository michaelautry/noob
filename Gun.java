/** Gun Class
* Copyright 2015 Michael Autry
* UMUC CMIS 141 - Professor Daniel Brownell
**/

public class Gun {

// -- FIELDS -- //

private int magazineSize;
private int roundType;
private int damage;
private int range;

// -- CONSTRUCTOR -- //

public Gun(int changeMagazineSize, int changeRoundType, int changeDamage, int changeRange) {
  magazineSize = changeMagazineSize;
  roundType = changeRoundType;
  damage = changeDamage;
  range = changeRange;
  
}

// -- METHODS -- //

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
