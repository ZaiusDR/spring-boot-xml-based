package info.esuarez.springdemoone;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

}