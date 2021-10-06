import java.util.Scanner;
//The class Game, which contains the main method, and the class Tamagotchi,
//contain an array of detailed commentary, which is not present within the
//two subclasses (Cat & Dog), due to the commentary becoming repetitive

public class Game {
    public static int randomInt = getRandomInt(10, 3); //This variable is used throughout the program to determine
    // the initial value of a certain attribute. The int is randomly generated within the confines of the interval 3-10.
    public static String typeOfTamagotchi;
    static Scanner scan = new Scanner(System.in);

    //Method used for generate the random attributes for the objects (Cat/Dog
    public static int getRandomInt(int max, int min) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    //Method that returns an object of the class Cat
    //Created with both name and gender
    public static Cat createNewCat(String nameOfTamagotchi, boolean choiceOfGender) {
        return new Cat(nameOfTamagotchi, choiceOfGender);
    }

    //This method prompts the user to take an action in reference to the Tamagotchi
    //After each user input, the method is called again, therein functioning as a loop
    public static void gameMenuCat(Cat newCatObject) {

        System.out.println("\n\nNow what would you like to do with " + newCatObject.name + "?");
        System.out.println("__________________________________________________");
        System.out.println("Press 1: Play\nPress 2: Feed\nPress 3: Lick " +
                newCatObject.genderRhetoricHimOrHer(newCatObject.gender) +
                "\nPress 4: Give a bath\nPress 5: Sleep\nPress 6: Quit");

        String choiceOfActivity = scan.nextLine();
        switch (choiceOfActivity) {
            case "1" -> {
                newCatObject.play();
                gameMenuCat(newCatObject);
            }
            case "2" -> {
                newCatObject.feed();
                gameMenuCat(newCatObject);
            }
            case "3" -> {
                newCatObject.lickFur();
                gameMenuCat(newCatObject);
            }
            case "4" -> {
                newCatObject.batheTamagotchi();
                gameMenuCat(newCatObject);
            }
            case "5" -> {
                newCatObject.switchSleepState("2");
                gameMenuCat(newCatObject);
            }
            case "6" -> System.out.println();
            default -> {
                System.out.println("Please choose an activity"); //If anything other than 1,2,3,4,5 or 6 is entered,
                gameMenuCat(newCatObject); //this will print, subsequently returning the user to the start of the method again
            }
        }
    }

    //Method that returns an object of the class Dog
    //Created with both name and gender
    public static Dog createNewDog(String nameOfTamagotchi, boolean choiceOfGender) {
        return new Dog(nameOfTamagotchi, choiceOfGender);
    }

    //This method works in much the same way as the gameMenuCat
    public static void gameMenuDog(Dog newDogObject) {

        System.out.println("\n\nNow what would you like to do with " + newDogObject.name + "?");
        System.out.println("__________________________________________________");
        System.out.println("""
                Press 1: Play
                Press 2: Feed
                Press 3: Teach trick
                Press 4: Give treat
                Press 5: Give love
                Press 6: Sleep
                Press 7: Quit""");

        String choiceOfActivity = scan.nextLine();
        switch (choiceOfActivity) {
            case "1" -> {
                newDogObject.play();
                gameMenuDog(newDogObject);
            }
            case "2" -> {
                newDogObject.feed();
                gameMenuDog(newDogObject);
            }
            case "3" -> {
                newDogObject.teachTrick();
                gameMenuDog(newDogObject);
            }
            case "4" -> {
                newDogObject.giveTreat();
                gameMenuDog(newDogObject);
            }
            case "5" -> {
                newDogObject.giveLove();
                gameMenuDog(newDogObject);
            }
            case "6" -> {
                newDogObject.switchSleepState("2");
                gameMenuDog(newDogObject);
            }
            case "7" -> System.out.println();
            default -> {
                System.out.println("Please choose an activity");
                gameMenuDog(newDogObject);
            }
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
        boolean maleOrFemaleBoolean = !maleOrFemaleString.equals("2");

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
