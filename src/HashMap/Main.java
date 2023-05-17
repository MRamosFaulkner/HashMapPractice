package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Nicknames Exercise
        System.out.println("Nicknames Exercise");

        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));


        //Abbreviations Exercise
        System.out.println("\nAbbreviations Exercise");

        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");
        abbreviations.addAbbreviation("lol", "laugh out loud");

        //True if it has it
        System.out.println(abbreviations.hasAbbreviation("i.e."));

        //False if it does not have it
        System.out.println(abbreviations.hasAbbreviation("ps"));

        //Finds explanation or returns null if not found
        System.out.println(abbreviations.findExplanationFor("etc."));
        System.out.println(abbreviations.findExplanationFor("ps"));

        //Print me my hash nap Exercise
        System.out.println("\nPrint me my hash map Exercise");

        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i" +
                "");
        System.out.println("---");
        Program.printsValuesOfKeysWhere(hashmap, ".e");

        //I owe you Exercise
        System.out.println("\nI owe you Exercise");

        IOU mattsIOU = new IOU();

        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

    }
}