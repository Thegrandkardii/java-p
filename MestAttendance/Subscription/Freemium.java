package Subscription;

public class Freemium extends Basesub {
    private Subenum allowedExtraDays;

   public Freemium(Subenum duration, int allowed) {
        super(duration);
        this.allowedExtraDays = duration;
        //TODO Auto-generated constructor stub
    }
    
}
