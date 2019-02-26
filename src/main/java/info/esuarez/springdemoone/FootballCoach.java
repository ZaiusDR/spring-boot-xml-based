package info.esuarez.springdemoone;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice shooting to goal for 2 hours.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
