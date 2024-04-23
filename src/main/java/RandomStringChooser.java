import java.util.*;
public class RandomStringChooser
{
  private ArrayList <Integer> array;
  public RandomStringChooser(String [] wordArray){
    array = new ArrayList <Integer>();
    for(String word : wordArray)
      array.add(word);
  }
  public String getNext(){
    int R = (int)(math.Random*array.size());
    if(array.size() == 0)
      return "NONE";
    return array.remove(r);
  }
}
