import java.util.*;
public class RandomStringChooser
{
    private ArrayList<String> array;

    public RandomStringChooser(String[] wordArray)
    {
        array = new ArrayList<String>();

        for(String word : wordArray)
            array.add(word);
    }

    public String getNext()
    {
      if(array.size() == 0)
            return "NONE";

      int R = (int) (Math.random() * array.size());
      return array.remove(R);
}
