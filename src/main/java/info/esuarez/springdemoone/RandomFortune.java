package info.esuarez.springdemoone;

import java.util.ArrayList;

public class RandomFortune implements FortuneService {

    private ArrayList<String> fortunes = new ArrayList();

    public RandomFortune() {
        fortunes.add("Today is your lucky day! Yay!!");
        fortunes.add("You will fail today maifren.");
        fortunes.add("Take care, you can make it, but be careful");
        fortunes.add("Pray on the roman baptisterio.");
    }

    @Override
    public String getFortune() {
        int index = (int) (Math.random() * 4);
        return this.fortunes.get(index);
    }
}
