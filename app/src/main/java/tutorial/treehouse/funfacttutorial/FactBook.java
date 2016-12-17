package tutorial.treehouse.funfacttutorial;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Admin on 17/12/2016.
 */

public class FactBook {
    private final String[] mSetOfFacts = {
            "Ostriches can run faster than horses",
            "Ants stretch when they wake up in the morning",
            "I am bored with the video",
            "Mark Twin is not his real name",
            "Slug has 4 noses",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };
    // returning one fact
    public String getRandomFact(){
        String fact = "";
        //generate random numbers, and make sure it is not the same as current number
        Random myRanGen = new Random();
       int ranNum = myRanGen.nextInt(mSetOfFacts.length);
        fact = mSetOfFacts[ranNum];
        return fact;
    }

    // returning a different fact than current
    public String getRandomFact(int currNum){
        String fact = "";
        //generate random numbers, and make sure it is not the same as current number
        Random myRanGen = new Random();
        int ranNum = currNum;
        while(ranNum==currNum) {
            ranNum = myRanGen.nextInt(mSetOfFacts.length);
        }
        fact = mSetOfFacts[ranNum];
        return fact;
    };

    public int checkCurrentFactNum(String currStr){
        return Arrays.asList(mSetOfFacts).indexOf(currStr);
    }

}
