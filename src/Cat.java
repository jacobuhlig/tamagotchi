public class Cat extends Tamagotchi {
    public int cleanliness = Game.randomInt;


    public Cat(String name, boolean gender) {
        super(name, gender);
    }

    public static void feedCatArt() {
        System.out.println();
        System.out.println("        |\\=/|.-\"\"\"-.  ");
        System.out.println("        /6 6\\       \\");
        System.out.println("       =\\_Y_/=  (_  ;\\");
        System.out.println("         _U//_/-/__///");
        System.out.println("        /kit\\      ((");
        System.out.println("        ^^^^^       `");
    }

    public void lickFurArt() {
        System.out.println();
        System.out.println("    ^'.           .-");
        System.out.println("   / \\ '..----..'`/ \\");
        System.out.println("   '  '   /      \\  |");
        System.out.println("   \\ , `''         /");
        System.out.println("    /  ()    ()    `");
        System.out.println("   /      _         \\");
        System.out.println("  '      \\_/         '");
        System.out.println("   `.    ,_        .`'.");
        System.out.println("     `-._/ \\,   _.'\\   `.");
        System.out.println("       _(__/        `...'^.");
        System.out.println("      /    `\\          ,--.'");
        System.out.println("     |       `.  /    |     \".");
        System.out.println("     \\_| \\_,   ''     '       `");
        System.out.println("       `-'\\            `._     \\");
        System.out.println("       '   '.             ' --.'");
        System.out.println("      /   '  `'--'       ,.    |");
        System.out.println("     /    |            .'      /");
        System.out.println("_______________________________");
        System.out.println("                              |");
        System.out.println("                           \\  |");
        System.out.println("                            '-'");
    }

    public void lickFur() {
        if (cleanliness >= 3) {
            lickFurArt();
            int cleanlinessUp = getTypeOfStatValue("4", 1);
            System.out.println(this.name + " licked " + genderRhetoricLowercase(this.gender, false) + " fur clean");
            System.out.println(genderRhetoricFirstLetterCapital(this.gender, false) + " cleanliness is now at " + cleanlinessUp);
        } else {
            System.out.println("\n" + this.name + " refused to lick " + genderRhetoricLowercase(this.gender, false) +
                    " fur, because it is too dirty");
        }
    }

    public void batheTamagotchiArt() {
        System.out.println();
        System.out.println("      ( \\");
        System.out.println("       \\ \\");
        System.out.println("       / /                |\\\\");
        System.out.println("      / /     .-`````-.   / ^`-.");
        System.out.println("      \\ \\    /         \\_/  {|} `o");
        System.out.println("       \\ \\  /   .---.   \\\\ _  ,--'");
        System.out.println("        \\ \\/   /     \\,  \\( `^^^");
        System.out.println("         \\   \\/\\      (\\  )");
        System.out.println("          \\   ) \\     ) \\ \\");
        System.out.println("           ) /__ \\__  ) (\\ \\___");
        System.out.println("          (___)))__))(__))(__)))");
    }

    public void batheTamagotchi() {
        //int cleanlinessUp = (this.cleanliness = 10);
        System.out.println("\n" + this.name + " really didn't like getting wet");
        printOfAttribute("4", 1.0, 10);
        if (this.mood >= 4 && this.mood <= 6) {
            printOfAttribute("-1", 2.0, 2);
            batheTamagotchiArt();
        } else if (this.mood >= 7 && this.mood <= 10) {
            printOfAttribute("-1", 2.0, 4);
            System.out.println(genderRhetoricFirstLetterCapital(this.gender, true) + " hisses at you");
            batheTamagotchiArt();
        } else {
            printOfAttribute("-1", 2.0, 4);
            batheTamagotchiArt();
        }
    }

    public void playCatArt() {
        System.out.println();
        System.out.println("                   __     __,");
        System.out.println("                      \\,`~\"~` /");
        System.out.println("      .-=-.           /    . .\\");
        System.out.println("     / .-. \\          {  =    Y}=");
        System.out.println("    (_/   \\ \\          \\      / ");
        System.out.println("           \\ \\        _/`'`'`b");
        System.out.println("            \\ `.__.-'`        \\-._");
        System.out.println("             |            '.__ `'-;_");
        System.out.println("             |            _.' `'-.__)");
        System.out.println("              \\    ;_..--'/     //  \\");
        System.out.println("              |   /  /   |     //    |");
        System.out.println("              \\  \\ \\__)   \\   //    /");
        System.out.println("               \\__)        './/   .'");
        System.out.println("                             `'-'`");
    }

    @Override
    public void play() {
        System.out.println("\n" + "You played with " + name);

        if (energy > 2) {
            printOfAttribute("1", 1.0, 3);      //Positive effect on mood
            printOfAttribute("-2", 2.0, 2);     //Negative effect on energy
            printOfAttribute("-4", 2.0, 2);     //Negative effect on cleanliness
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
            playCatArt();
        } else {
            energy = getTypeOfStatValue("-2", 10);    //Negative effect on energy
            printOfAttribute("-3", 2.0, 2);     //Negative effect on fullness
            sleepCatSleepingArt();
            System.out.print(name + " fainted due to exhaustion, so ");
            switchSleepState("3");                                     //Induces sleep state
        }
    }

    public void sleepCatWakingUpArt() {
        System.out.println();
        System.out.println("             _,'|             _.-''``-...___..--';)");
        System.out.println("           /_ \\'.      __..-' ,      ,--...--'''");
        System.out.println("          <\\    .`--'''       `     /'");
        System.out.println("           `-';'               ;   ; ;");
        System.out.println("     __...--''     ___...--_..'  .;.'");
        System.out.println("    (,__....----'''       (,..--''");
    }

    public void sleepCatSleepingArt() {
        System.out.println();
        System.out.println("      |\\      _,,,---,,_");
        System.out.println("ZZZzz /,`.-'`'    -.  ;-;;,_");
        System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("    '---''(_/--'  `-'\\_)   ");
        System.out.println();
    }

    @Override
    public void switchSleepState(String awakeOrNot) {
        if (awakeOrNot.equals("1")) {
            System.out.println(name + " woke up feeling " + stateOfMind());
            sleepCatWakingUpArt();

        } else if (awakeOrNot.equals("2")) {
            System.out.println("\n" + name + " went to sleep");
            sleepCatSleepingArt();
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
            returnValue = cleanliness += increaseOrDecreaseByValue;
            if (returnValue >= 10) {
                cleanliness = 10;
            }
        } else if (variable.equals("-4")) {
            returnValue = cleanliness -= increaseOrDecreaseByValue;
            if (returnValue <= 0) {
                cleanliness = 0;
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
            returnTypeString = "cleanliness";
        }
        return returnTypeString;
    }
}
