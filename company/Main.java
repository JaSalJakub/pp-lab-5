import beans.Person;
import utils.MathUtils; 
import exceptions.InvalidAgeException;
import implementations.EmailMessenger;
import interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        
        final int b = 10;

        try {
            people[0] = new Person("Timothy Bradford", 39);
            people[1] = new Person("John Nolan", 46);
            people[2] = new Person("Lucy Chen", 29);
            people[3] = new Person("Angela Lopez", 35);
            people[4] = new Person("Jackson West", 29);

            Messenger messenger = new EmailMessenger();

            for (Person person : people) {
                int value = MathUtils.add(person.getAge(), b);

                messenger.sendMessage("Wiadomość dla " + person.getName() + ": Wynik dodawania wieku i stałej b = " + value);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}