import java.util.ArrayList;
import java.util.*;

public class arrList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list = new ArrayList<String>();
        //ArrayList<Boolean> list = new ArrayList<Boolean>();
        
        list.add(0);
        list.add(1, 2);  //through this method we can add element to the index we want//
        list.add(3);
        list.add(4);
        System.out.println(list);


        //setting element into array//
        list.set(0, 5);
        System.out.println(list);

        
        //deleting(remove) element through array//
        list.remove(1);
        System.out.println(list);


        //Size of array//
        int size = list.size();
        System.out.println(size);

        //getting through loops//
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));     //Note always use get to print numbers from arrays
        }
        System.out.println();


        //Sorting in ArrayList//
        Collections.sort(list);
        System.out.print(list);
    }
    
}
