public class Main {
    public static void main(String[] args) {
        Country[] countries = new Country[3];
        countries[0] = new Country("Rusia", "there is access to the ocean", 1710000, "have nuclear weapon");
        countries[1] = new Country("USA", "there is access to the ocean", 9834000, "Have nuclear weapon ");
        countries[2] = new Country("Kyrgezstan", "no access to the ocean", 199000, "no nuclear weapon");

        System.out.println(countries[2]);

        Person[] persons = new Person[3];
        persons[0] = new Person("Sadyr Japarov", "Koshaliev Erkinbek", "Kamxhybel Tashiev");
        persons[1] = new Person("Djo Baiden", "Kevin Makkarti", "Djon Edgar");
        persons[2] = new Person("Vladimir Putin", "Volodin Vyacheslav", "Aleksandr Volotnikov");

        System.out.println(persons[1]);

        Address[] addresses = new Address[3];
        addresses[0] = new Address("Chuy avenue №110", "On-Archa №76", "Grajdanskay119");

        System.out.println(addresses[0]);

        City [] cities = new City[3];
        cities [0] = new City("Bishkek",1071000,"very good");
        cities [1] = new City("Москва",13000000,"Bad");
        cities [2] = new City("New-York",8468000,"Avarge");

        System.out.println(cities[2]);

    }
}
