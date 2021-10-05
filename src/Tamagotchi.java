public class Tamagotchi {
    public String name;
    public boolean gender;
    public static int mood = Game.randomInt;
    public int energy = Game.randomInt;
    public int fullness = Game.randomInt;


    public Tamagotchi(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String genderRhetoricFirstLetterCapital(boolean gender, boolean simpleOrPossessivePronoun) {
        if (gender) {
            if (simpleOrPossessivePronoun) {
                return "He";
            } else {
                return "His";
            }
        } else {
            if (simpleOrPossessivePronoun) {
                return "She";
            } else {
                return "Her";
            }
        }
    }


    public String genderRhetoricLowercase(boolean gender, boolean simpleOrPossessivePronoun) {
        if (gender) {
            if (simpleOrPossessivePronoun) {
                return "he";
            } else {
                return "his";
            }
        } else {
            if (simpleOrPossessivePronoun) {
                return "she";
            } else {
                return "her";
            }
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


    public void switchSleepState(String awakeOrNot) {
        if (awakeOrNot.equals("1")) {
            System.out.println(name + " woke up feeling " + stateOfMind());
        } else if (awakeOrNot.equals("2")) {
            System.out.println("\n" + name + " went to sleep");
            printOfAttribute("1", 1.0, 3); //Mood went up by three
            printOfAttribute("2", 1.0, 3); //Energy went up by three
            switchSleepState("1");
        } else {
            int energyUp = 3;
            getTypeOfStatValue("2", energyUp);
            System.out.println(genderRhetoricLowercase(this.gender, true) + " went to sleep\nand "
                    + genderRhetoricLowercase(this.gender, false) + " energy went up by " + energyUp);
            printOfAttribute("-1", 2.0, 3); //Mood went down by three
            switchSleepState("1");
        }
    }


    public void play() {
        System.out.println("\n" + "You played with " + name);

        if (energy > 1) {
            printOfAttribute("1", 1.0, 3);      //Positive effect on mood
            printOfAttribute("-2", 2.0, 2);     //Negative effect on energy
        } else {
            energy = getTypeOfStatValue("-2", 10);    //Negative effect on energy
            System.out.print(name + " fainted due to exhaustion, so ");
            switchSleepState("3");                                     //Induces sleep state
        }
    }

    public void feedArt() {
        if (Game.typeOfTamagotchi.equals("1")) {
            Cat.feedCatArt();
        } else if (Game.typeOfTamagotchi.equals("2")) {
            Dog.feedDogArt();
        }
    }

    public void feed() {

        //Effect on fullness
        if (energy <= 1) {
            System.out.println("\n" + this.name + " couldn't muster the energy to eat");
            switchSleepState("2");
        } else if (fullness < 9) {
            feedArt();
            System.out.println("\n" + name + " has been fed");
            printOfAttribute("3", 1.0, 3);  //Effect on fullness
            printOfAttribute("-2", 2.0, 1); //Effect on energy

        } else if (fullness == 9) {
            feedArt();
            System.out.println("\n" + name + " has been fed");
            printOfAttribute("3", 1.0, 1);  //Effect on fullness
            printOfAttribute("-2", 2.0, 1); //Effect on energy

        } else if (fullness == 10) {
            System.out.println("\n" + name + " refused to eat because " + genderRhetoricLowercase(gender, true) + " is too full");
        }
    }


    public int getTypeOfStatValue(String variable, int increaseOrDecreaseByValue) {

        int returnValue = 0;

        //mood
        if (variable.equals("1")) {
            returnValue = mood += increaseOrDecreaseByValue;
            if (returnValue >= 10) {
                mood = 10;
            }
        } else if (variable.equals("-1")) {
            returnValue = mood -= increaseOrDecreaseByValue;
            if (returnValue <= 0) {
                mood = 0;
            }
        }

        //energy
        else if (variable.equals("2")) {
            returnValue = energy += increaseOrDecreaseByValue;
            if (returnValue >= 10) {
                energy = 10;
            }
        } else if (variable.equals("-2")) {
            returnValue = energy -= increaseOrDecreaseByValue;
            if (returnValue <= 0) {
                energy = 0;
            }
        }

        //fullness
        else if (variable.equals("3")) {
            returnValue = fullness += increaseOrDecreaseByValue;
            if (returnValue >= 10) {
                fullness = 10;
            }
        } else if (variable.equals("-3")) {
            returnValue = fullness -= increaseOrDecreaseByValue;
            if (returnValue <= 0) {
                fullness = 0;
            }
        }

        if (returnValue >= 10) {
            returnValue = 10;
        } else if (returnValue <= 0) {
            returnValue = 0;
        }

        return returnValue;
    }


    public String getTypeOfStatString(String variable) {

        if (variable.equals("1") || variable.equals("-1")) {
            return "mood";
        } else if (variable.equals("2") || variable.equals("-2")) {
            return "energy";
        } else if (variable.equals("3") || variable.equals("-3")) {
            return "fullness";
        }
        return "null";
    }


    public void printOfAttribute(String variable, double input, int increaseOrDecreaseByValue) {

        //Variable declarations
        String name = this.name;
        boolean gender = this.gender;

        String namePronoun = genderRhetoricLowercase(gender, true);
        String namePossessivePronoun = genderRhetoricLowercase(gender, false);
        String namePronounCap = genderRhetoricFirstLetterCapital(gender, true);
        String namePossessivePronounCap = genderRhetoricFirstLetterCapital(gender, false);

        int stat = getTypeOfStatValue(variable, 0);
        String wordStat = getTypeOfStatString(variable);


        //Increases by determined value
        if (input == 1.0) {
            if (stat < 9) {
                stat = (getTypeOfStatValue(variable, increaseOrDecreaseByValue));
                System.out.println(namePossessivePronounCap + " " + wordStat + " increased and is now " + stat);
            } else if (stat == 10) {
                System.out.println(namePossessivePronounCap + " " + wordStat + " is maxed out and remains at " + stat);
            } else {
                stat = (getTypeOfStatValue(variable, 10));
                System.out.println(namePossessivePronounCap + " " + wordStat + " has been maxed out at " + stat);
            }
        }

        //Decreases by determined value
        if (input == 2.0) {
            if (stat >= 1) {
                stat = (getTypeOfStatValue(variable, increaseOrDecreaseByValue));
                System.out.println(namePossessivePronounCap + " " + wordStat + " decreased and is now " + stat);
            } else if (stat == 0) {
                System.out.println(namePossessivePronounCap + " " + wordStat + " is still at the lowest point");
            } else {
                stat = (getTypeOfStatValue(variable, 10));
                System.out.println(namePossessivePronounCap + " " + wordStat + " has reached its lowest point");
            }
        }
    }
}