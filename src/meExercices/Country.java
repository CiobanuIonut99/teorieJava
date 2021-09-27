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
public class Country {

    private String nameOfCountry;
    private int numberOfInhabitans;
    private String officialLanguage;
    private String predominantReligion;

    public Country(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }



}
