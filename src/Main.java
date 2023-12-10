import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Acoidán", LocalDate.of(2002,11,1));
        System.out.println(person);
        System.out.println(person.getAge());

    }
}
