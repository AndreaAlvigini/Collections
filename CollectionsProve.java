import java.util.ArrayList;
import java.util.Collections;

public class CollectionsProve
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");
        list.add("Raspberry");
        list.add("Lemon");

        //Collections.sort(list);

        Collections.replaceAll(list, "Banana", "Gatto") ;
        //Collections.shuffle(list);
        Collections.swap(list,0, 3);
        System.out.println("modifica uno ciaoooo");
        System.out.println("Modifica 2 ciao");
        System.out.println("Sorted list: " +list);
        for (String  fruit : list)
        {
            System.out.println(fruit);
        }
    }
    
}
