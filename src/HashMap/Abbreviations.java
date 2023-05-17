package HashMap;

import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }


    //Adds
    public void addAbbreviation(String abbreviation, String explanation) {

        abbreviations.put(abbreviation, explanation);

    }

    //True or False if already in
    public boolean hasAbbreviation(String abbreviation) {

        if(abbreviations.get(abbreviation) != null) {
            return true;
        } else {
            return false;
        }
    }

    //Finds, if none returns null
    public String findExplanationFor(String abbreviation) {

        return abbreviations.get(abbreviation);
    }


}
