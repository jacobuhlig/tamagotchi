import java.util.Scanner;

public class Game {
    public static boolean randomBoolean = getRandomBoolean();
    public static int randomInt = getRandomInt(10, 3);
    public static String typeOfTamagotchi;
    static Scanner scan = new Scanner(System.in);

    public static int getRandomInt(int max, int min) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public static boolean getRandomBoolean() {
        int range = 2;
        int oneOrTwo = (int) (Math.random() * range) + 1;

        if (oneOrTwo == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static Cat createNewCat(String nameOfTamagotchi, boolean choiceOfGender) {
        return new Cat(nameOfTamagotchi, choiceOfGender);
    }

    public static void gameMenuCat(Cat newCatObject) {

        System.out.println("\n\nNow what would you like to do with " + newCatObject.name + "?");
        System.out.println("__________________________________________________");
        System.out.println("Press 1: Play\nPress 2: Feed\nPress 3: Lick " +
                newCatObject.genderRhetoricLowercase(false, false) +
                "self\nPress 4: Give a bath\nPress 5: Sleep\nPress 6: Quit");

        String choiceOfActivity = scan.nextLine();
        if (choiceOfActivity.equals("1")) {
            newCatObject.play();
            gameMenuCat(newCatObject);
        } else if (choiceOfActivity.equals("2")) {
            newCatObject.feed();
            gameMenuCat(newCatObject);
        } else if (choiceOfActivity.equals("3")) {
            newCatObject.lickFur();
            gameMenuCat(newCatObject);
        } else if (choiceOfActivity.equals("4")) {
            newCatObject.batheTamagotchi();
            gameMenuCat(newCatObject);
        } else if (choiceOfActivity.equals("5")) {
            newCatObject.switchSleepState("2");
            gameMenuCat(newCatObject);
        } else if (choiceOfActivity.equals("6")) {
            System.out.println();
        } else {
            System.out.println("Please choose an activity");
            gameMenuCat(newCatObject);
        }
    }


    public static Dog createNewDog(String nameOfTamagotchi, boolean choiceOfGender) {
        return new Dog(nameOfTamagotchi, choiceOfGender);
    }

    public static void gameMenuDog(Dog newDogObject) {

        System.out.println("\n\nNow what would you like to do with " + newDogObject.name + "?");
        System.out.println("__________________________________________________");
        System.out.println("Press 1: Play\nPress 2: Feed\nPress 3: Give love\nPress 4: Give treat\nPress 5: Teach trick" +
                "\nPress 6: Sleep\nPress 7: Quit");

        String choiceOfActivity = scan.nextLine();
        if (choiceOfActivity.equals("1")) {
            newDogObject.play();
            gameMenuDog(newDogObject);
        } else if (choiceOfActivity.equals("2")) {
            newDogObject.feed();
            gameMenuDog(newDogObject);
        } else if (choiceOfActivity.equals("3")) {
            newDogObject.giveLove();
            gameMenuDog(newDogObject);
        } else if (choiceOfActivity.equals("4")) {
            newDogObject.giveTreat();
            gameMenuDog(newDogObject);
        } else if (choiceOfActivity.equals("5")) {
            newDogObject.learnTrick();
            gameMenuDog(newDogObject);
        } else if (choiceOfActivity.equals("6")) {
            newDogObject.switchSleepState("2");
            gameMenuDog(newDogObject);
        } else if (choiceOfActivity.equals("7")) {
            System.out.println();
        } else {
            System.out.println("Please choose an activity");
            gameMenuDog(newDogObject);
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to the Tamagotchi game\n");

        System.out.println("Firstly you get to decide whether you want a cat or a dog");
        System.out.println("_________________________________________________________");
        System.out.println("\nPress 1:\tCat\nPress 2:\tDog");
        typeOfTamagotchi = scan.nextLine();

        System.out.println("\nSecondly whether it should be a boy or a girl?");
        System.out.println("_____________________________________________");
        System.out.println("\nPress 1:\tBoy\nPress 2:\tGirl");
        String maleOrFemaleString = scan.nextLine();
        boolean maleOrFemaleBoolean = true;
        if (maleOrFemaleString.equals("2")) {
            maleOrFemaleBoolean = false;
        }

        System.out.println("\nWhat name would you like your Tamagotchi to have?");
        System.out.println("__________________________________________________");
        String nameOfTamagotchi = scan.nextLine();

        if (typeOfTamagotchi.equals("1")) {
            Cat petCat = createNewCat(nameOfTamagotchi, maleOrFemaleBoolean);
            gameMenuCat(petCat);
        } else if (typeOfTamagotchi.equals("2")) {
            Dog petDog = createNewDog(nameOfTamagotchi, maleOrFemaleBoolean);
            gameMenuDog(petDog);
        }

        System.out.println("Thanks for playing!");
    }
}
