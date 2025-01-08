public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  // Non-default Dog constructor
  public Dog(String name){
    this.name = name;
    numDogs++;
    this.ID = numDogs * numDogs; //example
  }

  // Default Dog constructor
  public Dog(String name){
    this.name = name;
  }

  // Setters - instance variables only
  public void setName(String iName){
    name = iName;
  }

  public void setID(int iID){
    ID = iID;
  }

  public void setNum(int iNum){
    numDogs = iNum;
  }
  
  // Getters - instance variables only
  public String getName(){
    return name;
  }
  
  public int getID(){
    return ID;
  }

  public int getNum(){
    return numDogs;
  }
  // method getNumDogs
}
