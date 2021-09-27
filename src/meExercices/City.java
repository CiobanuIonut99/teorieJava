package meExercices;


import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class City {

    private double longitude;
    private double latitude;
    private Country countryOfOrigin;

        public List<City> filterByNameWithFor(List<City> filteredList ){

            for(int i = 0; i<filteredList.size();i++){
                if(!filteredList.get(i).getCountryOfOrigin().getNameOfCountry().equalsIgnoreCase("Russia")){
                    filteredList.remove(filteredList.get(i));
                }
            }
            return filteredList;
        }

        public List<City> filtredByNameWithForEach(List<City> filtredList){
            for(City x:filtredList){
                if(!x.getCountryOfOrigin().getNameOfCountry().equalsIgnoreCase("Russia")){
                    filtredList.remove(x);
                }
            }
            return filtredList;
        }

        public List<City> filtredByNameWithStream(List<City> filtredList){
            filtredList
                    .stream()
                    .filter(eachObject -> !eachObject.getCountryOfOrigin().getNameOfCountry().equalsIgnoreCase("Russia"))
                    .collect(toList());
            return filtredList;
        }

        public List<City> filtredByNameWithWhile(List<City> filtredList) {
            int i = 0;
            while(i<filtredList.size()) {

                if (!filtredList.get(i).getCountryOfOrigin().getNameOfCountry().equalsIgnoreCase("Russia")) {

                    filtredList.remove(filtredList.get(i));
                }
                i++;
            }
            return filtredList;
        }


}
