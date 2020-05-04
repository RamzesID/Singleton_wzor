package pakiet1;

public class Main {

    public static void main(String[] args) {
        PersonSingleton person1 = PersonSingleton.getInstance();
        PersonSingleton person2 = PersonSingleton.getInstance();
        PersonSingleton person3 = PersonSingleton.getInstance();

        person1.setName("Pawel");
        person3.setName("Jasiu");
        person2.setName("Krzysiu");
        PersonSingleton.getInstance().setName("Jasiu");

        System.out.println(person1.getName());
        System.out.println(person3.getName());
        System.out.println(person2.getName());

        System.out.println(PersonSingleton.getInstance().getName());
    }
}
