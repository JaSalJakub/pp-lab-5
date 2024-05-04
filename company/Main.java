import beans.Person;
import exceptions.InvalidAgeException;
import implementations.EmailMessenger;
import interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Timothy", 44);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Wiadomość testowa.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}