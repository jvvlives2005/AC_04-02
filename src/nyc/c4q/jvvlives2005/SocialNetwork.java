package nyc.c4q.jvvlives2005;
import java.util.Collections;
import java.util.HashSet;


public class SocialNetwork
{

    public static void main(String[] args)
    {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println(allFriends(yours, mine));
        System.out.println(mutualFriends(yours, mine));
        System.out.println(justYourFriends(yours, mine));
        System.out.println(justMyFriends(yours, mine));
        System.out.println(exclusiveFriends(yours, mine));
        System.out.println(yourFriendsAreMine(yours, mine));
        System.out.println(youHaveFriends(yours));
        //System.out.println(matchmaker(yours, mine));
    }

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> yours1 = new HashSet<String>(yours);
        HashSet<String> mine1 = new HashSet<String>(mine);
        yours1.addAll(mine1);
        return yours1;
        // Yelena, Jamal, Eve, Sebastian, Mala
    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> yours2 = new HashSet<String>(yours);
        HashSet<String> mine2 = new HashSet<String>(mine);
        yours2.retainAll(mine2);    //gets only the ones that are in both the sets

        return yours2;
        // Eve
    }

    public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Yelena, Jamal
        HashSet<String> yours3 = new HashSet<String>(yours);
        HashSet<String> mine3 = new HashSet<String>(mine);
        yours3.removeAll(mine3);
        return yours3;
    }

    public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> yours4 = new HashSet<String>(yours);
        HashSet<String> mine4 = new HashSet<String>(mine);
        mine4.removeAll(yours4);
        return mine4;
        // Sebastian, Mala
    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Yelena, Jamal, Sebastian, Mala
        HashSet<String> yours5 = new HashSet<String>(yours);
        HashSet<String> mine5 = new HashSet<String>(mine);
        HashSet<String> exclusive = new HashSet<String>(Collections.<String> emptySet());
        exclusive.addAll(yours5);
        exclusive.addAll(mine5);
        yours5.retainAll(mine5);
        exclusive.removeAll(yours5);
        return exclusive;
    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine)
    {
        // true if all your friends are also my friends
        HashSet<String> yours6 = new HashSet<String>(yours);
        HashSet<String> mine6 = new HashSet<String>(mine);
        return yours6 == mine6;

      /* sames as if (yours6 == mine6){
      return true
     } else
      return false; */

    }


    public static boolean youHaveFriends(HashSet<String> yours)
    {
        // true if you have any friends
        return yours.isEmpty();
    }

//    public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine)
//    {
//        HashSet<String> yours7 = new HashSet<String>(yours);
//        HashSet<String> mine7 = new HashSet<String>(mine);
//        // HashSet<String> matchingPairs = new HashSet<String>(Collections.<String> emptySet());
//        //
//        //        for(String matchingPairs : yours7)
//        //        {
//        //
//        //            for(String matchingPairs1 : mine7)
//        //            {
//        //                yours7.add(matchingPairs1);
//        //            }
//        //        }
//        //
//        //
//        //        //         should return these sets:
//        //        //         Sebastian, Jamal
//        //        //         Jamal, Mala
//        //        //         Jamal, Eve
//        //        //         Sebastian, Yelena
//        //        //         Yelena, Mala
//        //        //         Yelena, Eve
//        //        //         Sebastian, Eve
//        //        //         Mala, Eve
//        //   }
//    }
}