import beans.Person;
import utils.MathUtils; 
import exceptions.InvalidAgeException;
import implementations.EmailMessenger;
import interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Timothy", 44);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            // Dodajemy dwie liczby
            int result = MathUtils.add(5, 15);
            System.out.println("Wynik dodawania: " + result); 

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Wiadomość testowa. Wynik dodawania: " + result); 
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}