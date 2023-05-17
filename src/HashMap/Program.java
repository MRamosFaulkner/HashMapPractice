package HashMap;

import java.util.HashMap;

public class Program {

    //Prints all of the keys in the hashmap given as a parameter
    public static void printKeys(HashMap<String, String> hashmap) {

        System.out.println(hashmap.keySet());
    }

    //Prints keys given as parameter, which contain string given
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String k : hashmap.keySet()) {
            if (k.contains(text)) {
                System.out.println();
            }
        }
    }

    //Prints the values, which keys has he given string
    public static void printsValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String k : hashmap.keySet()) {
            if (k.contains(text)) {
                System.out.println(hashmap.get(k));
            }
        }
    }
}
