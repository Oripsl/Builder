public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder("Giacomo", "Poretti").setAge(22).build();

        Person person2 = new PersonBuilder("Aldo", "Baglio").build();

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
    }
}
