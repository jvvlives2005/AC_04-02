package nyc.c4q.jvvlives2005;

import java.util.HashSet;
import java.util.HashMap;

public class Main
{

    public static void main(String[] args)
    {
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(3);
        odd.add(57);
        odd.remove(100);

        HashSet<Integer> newOdd = new HashSet<Integer>(odd);
        HashSet<Integer>moreOdd = odd;
        System.out.println(newOdd == odd); //if they are in the same set
        System.out.println(newOdd.equals(odd));

        HashSet<Integer> even = new HashSet<Integer>();
        even.add(2);
        even.add(1);
        even.add(3);
        even.add(4);

        //odd.addAll(even);  odd + even

        odd.removeAll(even);

        System.out.println(even.contains(4));

        for (Integer num : even){
            odd.add(num);
        }

        //odd. remove(57);

        for (Integer num : odd){
            System.out.println(num);
        }

        HashMap<String, Integer> fruitCount = new HashMap<String, Integer>();
        fruitCount.put("bananas", 3);
        fruitCount.put("apples", 99);
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit);
        }
        for (Integer count: fruitCount.values()) {
            System.out.println(count);
        }


    }

}
