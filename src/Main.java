import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //task 1
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Atomic Habits");
        books1.add("Deep work");
        books1.add("Meditations");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Attack on titan");
        books2.add("The 5 A.M. club");
        books2.add("Meditations");

        ArrayList<String> merged = new ArrayList<>();
        for (String book : books1) {
            if (!merged.contains(book)) {
                merged.add(book);
            }
        }
        for (String book : books2) {
            if (!merged.contains(book)) {
                merged.add(book);
            }
        }
        System.out.println(merged);

        //task2
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Interstellar");
        movies.add("The Lord of the Rings");
        movies.add("The Social Network");
        movies.add("Fury");
        String longestMovie = " ";
        for (String movie : movies) {
            if (movie.length() > longestMovie.length()) {
                longestMovie = movie;
            }
        }
        System.out.println("The longest title movie is: " + longestMovie);

        //task3
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Kebab");
        foods.add("Pizza");
        foods.add("Salad");
        foods.add("Pizza");
        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("The word 'Pizza' appears " + count + " times");

        //task4
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Banana");
        System.out.println(fruits);
        for (int i = fruits.size() - 1; i >= 0; i--) {
            if (fruits.get(i).equals("Banana")) {
                fruits.remove(i);
            }
        }
        System.out.println(fruits);

        //task5
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Pink");
        colors.set(0, "Black");
        colors.set(1, "Black");
        colors.set(2, "Black");
        colors.set(3, "Black");
        System.out.println(colors);

        //task6
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Swimming");
        sports.add("Baseball");
        sports.add("Basketball");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Cricket");
        ArrayList<String> sports2 = new ArrayList<>();
        sports2.add("Football");
        sports2.add("Tennis");
        if (sports.containsAll(sports2)) {
            System.out.println("Sublist is present");
        } else {
            System.out.println("Sublist isn't present");
        }

        //task7
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulips");
        flowers.add("Lily of the valley");
        flowers.add("Rose");
        flowers.add("Wildflower");
        int firstApp = flowers.indexOf("Rose");
        System.out.println("first index of Rose: " + firstApp);
        int lastApp = flowers.lastIndexOf("Rose");
        System.out.println("last index of Rose: " + lastApp);

        //task8
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Penguin");
        animals.add("Snake");
        animals.add("Penguin");
        animals.add("Polar bear");
        animals.add("Penguin");
        animals.add("Snake");
        animals.add("Racoon");
        animals.add("Cat");
        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (!unique.contains(animals.get(i))) {
                unique.add(animals.get(i));
            } else {
            }
        }
        System.out.println("Unique list of animals: " + unique);

        //task9
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Melbourne");
        cities.add("Warsaw");
        cities.add("Miami");
        cities.add("Tokyo");
        String[] cityArray = cities.toArray(new String[0]);
        for (int i = 0; i < cityArray.length; i++) {
            System.out.println(cityArray[i]);
        }

        //task10
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbrs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbrs.add(numbers[i]);
        }
        System.out.println(numbrs);

        //task11
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Japan");
        countries.add("France");
        countries.add("Ghana");
        countries.add("New Zealand");
        countries.add("Iceland");
        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Italy");
        countries2.add("Ghana");
        countries2.add("Norway");
        countries2.add("Iceland");
        countries2.add("Switzerland");
        ArrayList<String> common = new ArrayList<>();
        for (String country : countries) {
            if (countries2.contains(country)) {
                common.add(country);
            }
        }
        System.out.println(common);

        //task12
        ArrayList<String> names = new ArrayList<>();
        names.add("Nurbek");
        names.add("Angel");
        names.add("Rafael");
        names.add("Michael");
        for (int i = names.size() - 1; i >= 0; i--) {
            int chars = names.get(i).length();
            if (chars % 2 == 0) {
                names.remove(i);
            }
        }
        System.out.println(names);

        //task13
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Guardian angel");
        songs.add("If we being real");
        songs.add("Walking on a dream");
        songs.add("Apologize");
        songs.add("Pressure");
        String smallest = "";
        for (String shortest : songs) {
            for (int i = 0; i < songs.size(); i++) {
                if (shortest.length() < songs.get(i).length()) {
                smallest = shortest;
                }
            }
        }
        System.out.println(smallest);

        //task14
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("beach");
        words.add("life");
        words.add("university");
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i = 0; i < words.size(); i++){
            String newWord = "";
            for(int j = 0; j < words.get(i).length(); j++){
                char vowl = words.get(i).charAt(j);
                if(vowels.contains(words.get(i).charAt(j))) {
                    newWord += '*';
                }
                else{
                    newWord += vowl;
                }
            }
            words.set(i, newWord);
        }

        System.out.println(words);

        //task15
        ArrayList<Integer> mixedNums = new ArrayList<>();
        mixedNums.add(1);
        mixedNums.add(2);
        mixedNums.add(3);
        mixedNums.add(4);
        mixedNums.add(5);
        mixedNums.add(6);
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i < mixedNums.size(); i++){
            if(mixedNums.get(i) % 2 != 0){
                odd.add(mixedNums.get(i));
            }
            mixedNums.remove(i);
        }
        System.out.println("Even nums: " + mixedNums);
        System.out.println("Odd nums: " + odd);

        //task16
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        int rotateBy = 2;
        for(int i = 0; i < rotateBy; i++){
            String last = days.remove(days.size()-1);
            days.add(0, last);
        }
        System.out.println(days);

        //task17
        ArrayList<String> nemz = new ArrayList<>();
        nemz.add("Gabriel");
        nemz.add("Diego");
        nemz.add(null);
        nemz.add("Sophie");
        nemz.add(null);
        nemz.add(null);
        System.out.println("Before: " + nemz);
        for(int i = nemz.size() - 1; i >= 0; i--){
            if(nemz.get(i) == null){
                nemz.remove(nemz.get(i));
            }
        }
        System.out.println("After: " + nemz);

        //task18
        ArrayList<String> movieTitles = new ArrayList<>();
        movieTitles.add("Fight Club");
        movieTitles.add("American Psycho");
        movieTitles.add("Good Will Hunting");
        movieTitles.add("Avengers: Endgame");
        movieTitles.add("The idea of You");
        String largest = movieTitles.get(0);
        String secondLargest = movieTitles.get(1);

        for(String movie : movieTitles){
             if(movie.length() > largest.length()){
                 secondLargest = largest;
                 largest = movie;
             } else if (movie.length() > secondLargest.length()
                     && movie.length() < largest.length()) {
                 secondLargest = movie;
             }

        }
        System.out.println("Largest : " + largest);
        System.out.println("Second largest: " + secondLargest);

        //task19
        ArrayList<String> fruitz = new ArrayList<>();
        fruitz.add("banana");
        fruitz.add("apple");
        fruitz.add("orange");
        fruitz.add("pomegranate");
        ArrayList<Integer> lengths = new ArrayList<>();
        for(int i = 0; i < fruitz.size(); i++){
            lengths.add(fruitz.get(i).length());
        }
        System.out.println(lengths);

        //task20
        ArrayList<ArrayList <String>> clubs = new ArrayList<>();
        ArrayList<String> realmadrid = new ArrayList<>();
        ArrayList<String> arsenal = new ArrayList<>();
        ArrayList<String> barcelona = new ArrayList<>();
        realmadrid.add("Kylian Mbappe");
        realmadrid.add("Jude Bellingham");
        realmadrid.add("Vinicius Jr");
        arsenal.add("Saka");
        arsenal.add("Eze");
        arsenal.add("Gabriel");
        barcelona.add("Lamine Yamal");
        barcelona.add("Pedri");
        barcelona.add("Raphinya");
        clubs.add(realmadrid);
        clubs.add(arsenal);
        clubs.add(barcelona);
        System.out.println(clubs);
    }
}


