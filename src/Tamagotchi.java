public class Tamagotchi {
    public String name;
    public boolean gender;
    public int age = 0;
    public int mood = 5;
    public int energy = 5;
    public int fullness = 5;
    public boolean awakeOrNot;

    public Tamagotchi(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String genderRhetoricHisOrHer(boolean gender) {
        if (gender) {
            return "his";
        } else {
            return "her";
        }
    }


    public String genderRhetoricHeOrShe(boolean gender) {
        if (gender) {
            return "he";
        } else {
            return "she";
        }
    }


    public void play() {
        System.out.println(this.name + " is playing");

        if (this.mood < 10) {
            int currentMood = this.mood += 1;
            System.out.println(this.name + "'s mood went up and is now " + currentMood);
        } else {
            int currentMood = (this.mood = 10);
            System.out.println(this.name + "'s mood is maxed out and remains at " + currentMood);
        }

        if (this.energy > 1) {
            int currentMood = (this.energy -= 1);
            System.out.println(this.name + "'s energy went down and is now " + currentMood);
        } else {
            int currentMood = (this.energy = 0);
            System.out.println(this.name + "'s energy went down and is now " + currentMood);
            sleepState(false);
        }

    }


    public void feed() {
        if (this.fullness < 9) {
            int currentFullness = this.fullness += 2;
            System.out.println(this.name + " has been fed and " + genderRhetoricHisOrHer(this.gender) + " fullness went up and is now " + currentFullness);
        } else if (this.fullness == 9) {
            int currentFullness = this.fullness += 1;
            System.out.println(this.name + " has been fed and " + genderRhetoricHisOrHer(this.gender) + " fullness is now maxed out at " + currentFullness);
        } else {
            int currentFullness = (this.fullness = 10);
            System.out.println(this.name + " refused to eat because " + genderRhetoricHeOrShe(this.gender) + " is too full");

        }
    }


    public String stateOfMind() {
        String stateOfMind = "";
        if (this.mood < 4 || this.energy < 4 || this.fullness < 4) {
            return stateOfMind = "sluggish";
        } else if (this.mood < 6 || this.energy < 6 || this.fullness < 6) {
            return stateOfMind = "happy";
        } else {
            return stateOfMind = "overjoyed";
        }
    }


    public void sleepState(boolean awakeOrNot) {
        if (awakeOrNot) {
            System.out.println(this.name + " woke up feeling " + stateOfMind());
        } else {
            if (this.energy < 7) {
                int energyUp = this.energy += 3;
                System.out.println(this.name + " went to sleep and " + genderRhetoricHisOrHer(this.gender) + " energy went up by " + energyUp);
            }
        }
    }

    //public void giveTreat()...
    //public void givePresent()...
}
