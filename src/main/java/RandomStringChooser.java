import java.util.*;
public class RandomStringChooser
{
    private ArrayList<String> valuesRemaining;

    public RandomStringChooser(String[] values)
    {
        valuesRemaining = new ArrayList<String>();

        for(String value : values)
            valuesRemaining.add(value);
    }

    public String getNext()
    {
        if(valuesRemaining.size() == 0)
            return "NONE";

        int index = (int) (Math.random() * valuesRemaining.size());
        return valuesRemaining.remove(index);
    }
}
