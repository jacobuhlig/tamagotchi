public class Cat extends Tamagotchi {
    public int catLives = 9;
    public int cleanliness = 5;


    public Cat(String name, boolean gender) {
        super(name, gender);
    }

    public void lickFur() {
        if (cleanliness >= 4) {
            int cleanlinessUp = (this.cleanliness += 1);
            System.out.println(this.name + " licks " + genderRhetoricHisOrHer(this.gender) + " fur");
            System.out.println(genderRhetoricHisOrHer(this.gender) + " cleanliness is now at " + cleanlinessUp);
        } else {
            System.out.println(this.name + " refuses to lick " + genderRhetoricHisOrHer(this.gender) +
                    " fur, because it is too dirty");
        }
    }

    public void batheTamagotchi() {
        int cleanlinessUp = (this.cleanliness = 10);
        if (this.mood >= 4 && this.mood <= 6) {
            int moodDown = (this.mood -= 3);
        } else if (this.mood >= 7 && this.mood <= 10) {
            int moodDown = (this.mood -= 6);
        } else {
            int moodDown = (this.mood = 0);
        }
    }
}
