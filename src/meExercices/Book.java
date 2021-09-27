package meExercices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String isbn;
    private String name;
    private int releaseYear;
    private String genre;

    public List<String> filterByGenre(List<String> bookList) {
        int x = 0;
        List<String> filtredByGenreList = new ArrayList<>();

//        for (int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).equals("Comedy")) {
//                filtredByGenreList.add( bookList.get(i));
//            }
//        }

        for (String eachString : bookList) {
            if (eachString.equals("Comedy")) {
                filtredByGenreList.add( eachString);
            }
        }

//        while (x < bookList.size()) {
//            if (bookList.get(x).equals("Comedy")) {
//                filtredByGenreList.add( bookList.get(x));
//            }
//            x++;
//        }

//        bookList
//                .stream()
//                .map(eachString -> {
//                    if (eachString.equals("Comedy")) {
//                        filtredByGenreList.add(count, eachString);
//                        return filtredByGenreList;
//                    } else {
//
//                        return filtredByGenreList;
//                    }
//                })
//                .collect(toList());

        return filtredByGenreList;
    }


}
