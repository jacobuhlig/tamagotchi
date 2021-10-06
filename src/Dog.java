public class Dog extends Tamagotchi {
    public int loyalty = 0;

    public Dog(String name, boolean gender) {
        super(name, gender);
    }


    public static void feedDogArt() {
        System.out.println();
        System.out.println("    ,    /-.");
        System.out.println("   ((___/ __>");
        System.out.println("   /      }");
        System.out.println("   \\ .--.(    ___");
        System.out.println("    \\\\   \\\\  /___\\");
    }

    public void teachTrickDogArt() {
        System.out.println();
        System.out.println("                                                    /)");
        System.out.println("                                              o__^^/_/)");
        System.out.println("                                               \\ ' \\`-'     ___");
        System.out.println("                                                `|  \\______/--'`");
        System.out.println("                                                 |         \\");
        System.out.println("                                               ././-------,.\\ ");
        System.out.println();

        System.out.println();
        System.out.println("                                   _");
        System.out.println("                                (\\ \\)");
        System.out.println("                              o__^\\/     ,");
        System.out.println("                               \\ ' \\    <   _  _");
        System.out.println("' '  .                          `|  \\____\\   -   -");
        System.out.println("       '      . .      ()        |        )  _   _");
        System.out.println("         `.'       `.'         .//---_/-_/ _  _");
        System.out.println();

        System.out.println();
        System.out.println("                        (\\");
        System.out.println("                       (\\_\\^^__o   .");
        System.out.println("                       `-'\\ ` /   `(");
        System.out.println("                          |  \\_____|");
        System.out.println("                          |        |                _");
        System.out.println("                        ./`,----./~|     .   .   . - ()");
        System.out.println();

        System.out.println();
        System.out.println("                                                        (\\");
        System.out.println("                                                       (\\_\\_^__o");
        System.out.println("                                                ___     `-'/ `_/");
        System.out.println("                                               '`--\\______/  |");
        System.out.println("                                          '        /         |");
        System.out.println("                                      `    .  '  -`/.------'\\^-'");
        System.out.println();
    }

    public static void playDogArt() {
        System.out.println();
        System.out.println("                .--~~,__");
        System.out.println("   :-....,-------`~~'._.'");
        System.out.println("    `-,,,  ,_      ;'~U'");
        System.out.println("     _,-' ,'`-__; '--.");
        System.out.println("    (_/'~~      ''''(;");
        System.out.println();
    }

    public void giveLoveDogArt() {
        System.out.println();
        System.out.println("     $$$$         $$$$");
        System.out.println("   $$$$$$$$     $$$$$$$$");
        System.out.println(" $$$$$$$$$$$$ $$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("  $$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("    $$$$$$$$$$$$$$$$$$$");
        System.out.println("       $$$$$$$$$$$$$");
        System.out.println("          $$$$$$$");
        System.out.println("            $$$");
        System.out.println("             $");
        System.out.println();
    }

    public void sleepDogWakingUpArt() {
        System.out.println();
        System.out.println("    ___");
        System.out.println(" __/_  `.  .-\"\"\"-.");
        System.out.println(" \\_,` | \\-'  /   )`-')");
        System.out.println("  \"\") `\"`    \\  ((`\"`");
        System.out.println(" ___Y  ,    .'7 /|");
        System.out.println("(_,___/...-` (_/_/");
        System.out.println();
    }

    public void sleepDogSleepingArt() {
        System.out.println();
        System.out.println("(                   )            \\ \\");
        System.out.println(" \\   Z  Z  Z  Z    /              \\ \\");
        System.out.println("  \\ _ _ _ _ _ _ _ /             ___) )");
        System.out.println("           (__)_     ____      /     \\");
        System.out.println("              (_)o  /   | \\--._)     /");
        System.out.println("                  __|uu | |   \\   \\_ \\");
        System.out.println("                  /      | | __ \\  /_) \\");
        System.out.println("                 (_)_____|_|(____)(_____)");
        System.out.println();
    }


    public void giveLove() {
        if (loyalty >= 4) {
            giveLoveDogArt();
            System.out.println("\n" + "You cuddled with " + name);
            printOfAttribute("1", 1.0, 4);      //Positive effect on mood
            printOfAttribute("4", 1.0, 1);     //Positive effect on loyalty
        } else {
            System.out.println("\n" + name + " didn't feel comfortable enough to let you come that close");
            System.out.println("Your bond isn't strong enough yet");
            printOfAttribute("-1", 2.0, 1);      //Negative effect on mood
        }
    }

    public void giveTreat() {
        System.out.print("\nYou offered a treat");
        if (loyalty <= 2) {
            System.out.println(" and " + name + " hesitantly and shakingly accepted");
            printOfAttribute("1", 1.0, 2);     //Positive effect on mood
            printOfAttribute("4", 1.0, 1);     //Positive effect on loyalty
            printOfAttribute("3", 1.0, 1);     //Negative effect on fullness
        } else if (loyalty <= 4) {
            System.out.println(" and " + name + " slowly but surely ate it from your hand");
            printOfAttribute("1", 1.0, 2);     //Positive effect on mood
            printOfAttribute("4", 1.0, 1);     //Positive effect on loyalty
            printOfAttribute("3", 1.0, 1);     //Negative effect on fullness
        } else if (loyalty <= 7) {
            System.out.println(" and " + name + " gladly accepted, showing her gratitude\n" +
                    "by a subtle lick of your hand");
            printOfAttribute("1", 1.0, 2);     //Positive effect on mood
            printOfAttribute("4", 1.0, 1);     //Positive effect on loyalty
            printOfAttribute("3", 1.0, 1);     //Negative effect on fullness
        } else {
            System.out.println(" and " + name + " practically jumped up in the air out of sheer joy\n" +
                    "of course only after having devoured the succulent treat");
            printOfAttribute("1", 1.0, 2);     //Positive effect on mood
            printOfAttribute("4", 1.0, 1);     //Positive effect on loyalty
            printOfAttribute("3", 1.0, 1);     //Negative effect on fullness
        }
    }

    public void teachTrick() {
        if (loyalty <= 3 && energy >= 3 && fullness >= 3) {
            System.out.println("\nAs you throw the ball, " + name + " excitedly runs around " +
                    "in a circle.\n" + genderRhetoricFirstLetterCapital(gender, true) +
                    " looks up at you in confusion");
            System.out.println(genderRhetoricFirstLetterCapital(gender, true) +
                    " still has a lot to learn\n");
            printOfAttribute("-2", 2.0, 2);     //Negative effect on energy
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
        } else if (loyalty <= 6 && energy >= 3 && fullness >= 3) {
            System.out.println("\nOnce the ball is thrown, " + name + " is on it with great focus and concentration");
            System.out.println("As " + genderRhetoricLowercase(gender, true) + " is returning," +
                    " ball in mouth,\nit occurs to " + genderRhetoricHimOrHer(gender) +
                    " that letting go of the ball, therein returning it to you,\n" +
                    "would defeat the purpose of getting it in the first place\n");
            printOfAttribute("-2", 2.0, 2);     //Negative effect on energy
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
        } else if (loyalty <= 10 && energy >= 3 && fullness >= 3) {
            teachTrickDogArt();
            System.out.println("Finally " + name + " manages to retrieve and redeliver the ball to you");
            printOfAttribute("-2", 2.0, 2);     //Negative effect on energy
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
        } else {
            System.out.println(name + " is too exhausted right now");
        }
    }


    @Override
    public void play() {
        System.out.println("\n" + "You played with " + name);
        playDogArt();
        if (energy > 2) {
            printOfAttribute("1", 1.0, 3);      //Positive effect on mood
            printOfAttribute("4", 1.0, 2);     //Positive effect on loyalty
            printOfAttribute("-2", 2.0, 2);     //Negative effect on energy
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
        } else {
            energy = getTypeOfStatValue("-2", 10);    //Negative effect on energy
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
            sleepDogSleepingArt();
            System.out.print(name + " fainted due to exhaustion, so ");
            switchSleepState("3");                                     //Induces sleep state
        }
    }

    @Override
    public void switchSleepState(String awakeOrNot) {
        if (awakeOrNot.equals("1")) {
            System.out.print(name + " woke up feeling ");
            stateOfMind();
            sleepDogWakingUpArt();

        } else if (awakeOrNot.equals("2")) {
            System.out.println("\n" + name + " went to sleep");
            sleepDogSleepingArt();
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

    @Override
    public int getTypeOfStatValue(String variable, int increaseOrDecreaseByValue) {

        int returnValue = 0;

        if (variable.equals("1") || variable.equals("-1") || variable.equals("2") || variable.equals("-2") || variable.equals("3") || variable.equals("-3")) {
            return super.getTypeOfStatValue(variable, increaseOrDecreaseByValue);
        }

        if (variable.equals("4")) {
            returnValue = loyalty += increaseOrDecreaseByValue;
            if (returnValue >= 10) {
                loyalty = 10;
            }
        } else if (variable.equals("-4")) {
            returnValue = loyalty -= increaseOrDecreaseByValue;
            if (returnValue <= 0) {
                loyalty = 0;
            }
        }

        if (returnValue >= 10) {
            returnValue = 10;
        } else if (returnValue <= 0) {
            returnValue = 0;
        }

        return returnValue;
    }

    @Override
    public String getTypeOfStatString(String variable) {

        String returnTypeString = "";

        if (variable.equals("1") || variable.equals("-1") || variable.equals("2") || variable.equals("-2") || variable.equals("3") || variable.equals("-3")) {
            return super.getTypeOfStatString(variable);
        }
        if (variable.equals("4") || variable.equals("-4")) {
            returnTypeString = "loyalty";
        }
        return returnTypeString;
    }
}
