public class Dog extends Tamagotchi {
    public int loyalty = 0;

    public Dog(String name, boolean gender) {
        super(name, gender);
    }

    public void giveLove() {

    }

    public void giveTreat() {

    }

    public void learnTrick() {

    }

    public static void feedDogArt() {
        System.out.println();
        System.out.println("    ,    /-.");
        System.out.println("   ((___/ __>");
        System.out.println("   /      }");
        System.out.println("   \\ .--.(    ___");
        System.out.println("    \\\\   \\\\  /___\\");
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
            System.out.print(name + " fainted due to exhaustion, so ");
            switchSleepState("3");                                     //Induces sleep state
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
