/*
 *
 * Areesha Tariq
 *  3/13/2024
 * Purpose: to sort arrays 
 */


public class MovieTesterV2 {
    //printALl method to print the whole array
    public static void printAll(Movie[] list){
        for (Movie item : list){
            System.out.println(item);
        }
    }

    // Sort by year method 
    public static void sortByYear(Movie[] list, int order){
        //ascending order
        if (order == 1){
           int i, k, posmax;

           for(i=list.length-1; i>=0;i--){
                posmax = 0;
                for (k = 0; k<=i; k++){
                    if(list[k].getYear() > list[posmax].getYear()){
                        posmax = k;
                    }
                    Movie temp = list[i];
                    list[i] = list[posmax];
                    list[posmax] = temp;
                }
           }
            //descending order
        } else if(order == 2){
            int i, k, posmax;

            for(i=list.length-1; i>=0;i--){
                 posmax = 0;
                 for (k = 0; k<=i; k++){
                     if(list[k].getYear() < list[posmax].getYear()){
                         posmax = k;
                     }
                     Movie temp = list[i];
                     list[i] = list[posmax];
                     list[posmax] = temp;
                 }
            }
        }
    }

    //sorting based on title
    public static void sortByName(Movie[] list, int order){
        //ascending
        if (order ==1){
            int i, k, posmax;

            for(i=list.length-1; i>=0;i--){
                 posmax = 0;
                 for (k = 0; k<=i; k++){
                     if(list[k].getTitle().compareTo(list[posmax].getTitle()) > 0){
                         posmax = k;
                     }
                     Movie temp = list[i];
                     list[i] = list[posmax];
                     list[posmax] = temp;
                 }
            }
            //descending
        } else if (order == 2){
                int i, k, posmax;
    
                for(i=list.length-1; i>=0;i--){
                     posmax = 0;
                     for (k = 0; k<=i; k++){
                         if(list[k].getTitle().compareTo(list[posmax].getTitle()) < 0){
                             posmax = k;
                         }
                         Movie temp = list[i];
                         list[i] = list[posmax];
                         list[posmax] = temp;
                     }
            }
        }   
    }
    // sorting by studio name
    public static void sortByStudio(Movie[] list, int order){
       // ascending
        if (order == 1){
                int i, k, posmax;
    
                for(i=list.length-1; i>=0;i--){
                     posmax = 0;
                     for (k = 0; k<=i; k++){
                         if(list[k].getStudio().compareTo(list[posmax].getStudio()) > 0){
                             posmax = k;
                         }
                         Movie temp = list[i];
                         list[i] = list[posmax];
                         list[posmax] = temp;
                     }
            }
            //descending
        } else if(order ==2){

                    int i, k, posmax;
        
                    for(i=list.length-1; i>=0;i--){
                         posmax = 0;
                         for (k = 0; k<=i; k++){
                             if(list[k].getStudio().compareTo(list[posmax].getStudio()) < 0){
                                 posmax = k;
                             }
                             Movie temp = list[i];
                             list[i] = list[posmax];
                             list[posmax] = temp;
                         }
            }    
        }
    }


    public static void main(String []args){
        //creating array
        Movie[] movies = new Movie[10];
        //adding items to the array
        movies[0] = new Movie("Ribbit", 2018, "Studios");
        movies[1] = new Movie("Good Movie", 2013, "Disney" );
        movies[2] = new Movie("Fun Days", 2001, "Coke");
        movies[3] = new Movie("Happy Dappy", 1999, "Bears");
        movies[4] = new Movie("Crazy Monkey", 1993, "Old Studio");
        movies[5] = new Movie("Random movie", 2016, "Jumpers");
        movies[6] = new Movie("Superman", 2019, "Avengers");
        movies[7] = new Movie("Iron man", 2010, "Marvel");
        movies[8] = new Movie("Spiderman", 2003, "Marvel");
        movies[9] = new Movie("Quack Quack", 2018, "Studios");

        //printing out the lists and testing methods
        //original
        System.out.println("Original List:");
        printAll(movies);
        System.out.println();

        // by year in ascending and descending
        sortByYear(movies, 1);
        System.out.println();
        System.out.println("Sorted by Year in ascending order");
        printAll(movies);
        sortByYear(movies, 2);
        System.out.println();
        System.out.println("Sorted by Year in descending order");
        printAll(movies);

        // by title in ascending and descending
        sortByName(movies, 1);
        System.out.println();
        System.out.println("Sorted by Title in ascending order");
        printAll(movies);
        sortByName(movies, 2);
        System.out.println();
        System.out.println("Sorted by Title in descending order");
        printAll(movies);

        // by studio in ascending and descending
        sortByStudio(movies, 1);
        System.out.println();
        System.out.println("Sorted by Studio in ascending order");
        printAll(movies);
        sortByStudio(movies, 2);
        System.out.println();
        System.out.println("Sorted by Studio in descending order");
        printAll(movies);
        


    


    }
}
