package pakiet1;

public class PersonSingleton {
    private static PersonSingleton instance;
    private String name = "";
    private String surname = "";
    private String pesel = "";

    private PersonSingleton(){}

    public  static PersonSingleton getInstance(){
        if(instance==null){
            instance = new PersonSingleton();
            instance.name = "nameSingleton";
            instance.surname = "surnameSingleton";
            instance.pesel = "peselSingleton";
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
