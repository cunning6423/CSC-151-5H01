import java.io.*;
import java.util.Scanner;

// By implementing Serializable interface
// we make sure that state of instances of class CharacterSheet
// can be saved in a file.
class CharacterSheet implements Serializable {
    private static final long serialVersionUID = 1L;
    
    //Character stats
    int experience; // start a zero
    String charname;
    String charClass;
    String playerName;
    int strength;
    int dexterity;
    int constiution;

    // CharacterSheet
    // class constructor{
    public CharacterSheet (String playerName ,String charname,String charClass, int experience, int strength, int dexterity, int constiution) {
        this.playerName = playerName;
        this.charname = charname;
        this.charClass = charClass;
        this.experience = experience;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constiution = constiution;
    }
}

public class Test {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        //get all the info

        /*
        int experience = 0;
        String charname= "steve";
        String charClass= "Fighter";
        String playerName = Cunningham;
        */
        // Ask the User to type the info
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the user's name: ");
        String playerName = scanner.nextLine();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the characters name: ");
        String charname = scanner.nextLine();

        System.out.print("Enter Character class (fighter, wizard,etc...): ");
        String charClass = scanner.nextLine();

        System.out.print("Enter the amount of xp: ");
        int experience = scanner.nextInt();

        System.out.print("Enter your strength: ");
        int strength = scanner.nextInt();

        System.out.print("Enter your dexterity: ");
        int dexterity = scanner.nextInt();

        System.out.print("Enter your constiution: ");
        int constiution = scanner.nextInt();

        // cleanup
        scanner.close();

        // Make the object
        CharacterSheet
        tracker = new CharacterSheet (playerName , charname, charClass, experience, strength, dexterity, constiution);
        // Write it to a file
        System.out.println("Writing file...");
        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("Character_Sheet.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("Character_Sheet.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        CharacterSheet
        deserializedTracker = (CharacterSheet) ois.readObject(); // down-casting object
        System.out.println("Reading file...");
        System.out.println("Player name: " + deserializedTracker.playerName);
        System.out.println("Character name: " + deserializedTracker.charname + ", XP: " + deserializedTracker.experience);
        System.out.println("Class: " + deserializedTracker.charClass);
        System.out.println("STR: " + deserializedTracker.strength);
        System.out.println("DEX: " + deserializedTracker.dexterity);
        System.out.println("CON: " + deserializedTracker.constiution);
        // print all the other data 
        // closing streams
        oos.close();
        ois.close();
    }
}

