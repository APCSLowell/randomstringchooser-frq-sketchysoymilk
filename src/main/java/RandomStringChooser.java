import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> array;
  public RandomStringChooser(String [] wordArray){
    array = new ArrayList <String>();
    for(String word : wordArray)
      array.add(word);
  }
  public String getNext(){
    int R = (int)(Math.random*array.size());
    if(array.size() == 0)
      return "NONE";
    return array.remove(r);
  }
}
