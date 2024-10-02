
import java.util.Collections;

import java.util.ArrayList;

public class problem1ii {
    
    public static void main(String[] args){
        //testing
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(5);

        System.out.println(median(list));
    }
    
    public static double median(ArrayList<Integer> list) {

        Collections.sort(list);
        if (list.size() % 2 != 0)
            return (double) list.get(list.size() / 2);

        return (double) (( list.get((list.size() - 1) / 2) +  list.get(list.size() / 2)) / 2.0);

    }


}