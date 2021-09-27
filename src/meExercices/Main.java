package meExercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Country romania = new Country("Romania");
        Country turkey = new Country("Turkey");
        Country russia = new Country("Russia");
        Country unitedKindom = new Country("UnitedKindom");
        Country germany = new Country("Germany");
        Country spain = new Country("Spain");
        Country italy = new Country("Italy");
        Country ukraine = new Country("Ukraine");

        City bucharest = new City(26.1521, 44.4396, romania);
        City istanbul = new City(28.5853, 41.0044, turkey);
        City moscow = new City(37.374, 55.456, russia);
        City london = new City(0.741, 51.3028, unitedKindom);
        City sanktPetersburg = new City(30.20, 59.56, russia);
        City berlin = new City(13.2, 52.31, germany);
        City madrid = new City(3.43, 40.23, spain);
        City roma = new City(12.3, 41.54, italy);
        City kiev = new City(30.3125, 50.27, ukraine);
        City milano = new City(9.10, 45.28, italy);


        List<City> listOfCities = new ArrayList<>();
        listOfCities.add(bucharest);
        listOfCities.add(istanbul);
        listOfCities.add(moscow);
        listOfCities.add(london);
        listOfCities.add(sanktPetersburg);
        listOfCities.add(berlin);
        listOfCities.add(madrid);
        listOfCities.add(roma);
        listOfCities.add(kiev);
        listOfCities.add(milano);

//        listOfCities.forEach(x-> System.out.println(x));

//        roma.filterByNameWithFor(listOfCities).forEach(x-> System.out.println(x));
//        milano.filtredByNameWithForEach(listOfCities).forEach(x-> System.out.println(x));
//        madrid.filtredByNameWithStream(listOfCities).forEach(x-> System.out.println(x));
//        berlin.filtredByNameWithWhile(listOfCities).forEach(x-> System.out.println(x));

    }
}