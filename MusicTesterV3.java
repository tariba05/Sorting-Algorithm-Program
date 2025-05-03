/* Areesha Tariq
 * 3/28/2024
 * 
 */


 public class MusicTesterV3 {

    // main method
    public static void main (String []args){

        // creating an array of 10 objects
        Music[] songs = new Music[10];
        songs[0] = new Music("Baby shark", 2015, "Kids");
        songs[1] = new Music ("Wheels on the Bus", 1999, "Random");
        songs[2] = new Music ("Twinkle Star", 2006, "People");
        songs[3] = new Music("Row your Boat", 2011, "Someone");
        songs[4] = new Music("Mokeys jumping", 1999, "People");
        songs[5] = new Music("Jump up", 2006, "Team2");
        songs[6] = new Music("Dancing pencils", 1996, "Someone");
        songs[7] = new Music ("This song", 2007, "This person");
        songs[8] = new Music ("That", 1994, "persons");
        songs[9] = new Music("Baby shark", 1986, " funny");


        //testing searching by title
        System.out.println("Searching by year: ");
        findSongsByYear(songs, 1999);
        findSongsByYear(songs, 1985);

        System.out.println();
        // testing searhcing by artist
        System.out.println("Searching for artist" );
        findSongsbyName(songs, "Someone");
        findSongsbyName(songs, "Samantha");
        System.out.println();

        //testing searching by title
        System.out.println("Searching by title");
        findbyTitle(songs, "Baby shark");
        findbyTitle(songs, "Sneezing");

        /* 
//Testing the sort methods
        sortArtist(songs);
        printAll(songs);
System.out.println();
        sortTitle(songs);
        printAll(songs);
System.out.println();
        sortYears(songs);
        printAll(songs);
        
        */


        
    }

    //disply method
    public static void printAll(Music[] list){
        for (Music item : list){
            System.out.println(item);
        }
    }

    // INSERTATION SORT METHODS

    // year sort
    public static void sortYears(Music[] list){

            for (int i =0; i< list.length; i++){
            Music next = list[i];
            int insertindex = 0;
            int k = i;
            while (k>0 && insertindex == 0){
            if (next.getYear() > list[k-1].getYear())
            {
            insertindex = k;
            } else {
            list[k] = list[k-1];
            }
            k--;
            }
            list[insertindex] = next;
            }
    }
    //title sort
    public static void sortTitle(Music[] list){
        for (int i = 0; i< list.length; i++){
            Music next = list[i];
            int insertindex = 0;
            int k = i;
            while (k>0 && insertindex == 0){
            if(next.getTitle().compareTo(list[k-1].getTitle())>0){
            insertindex = k;
            }else {
            list[k] = list[k-1];
            }
            k--;
            }
            list[insertindex] = next;
            }
    }
    //artist sort
    public static void sortArtist(Music[] list){
        for(int i = 0; i<list.length; i++){
            Music next = list[i];
            int insertindex = 0;
            int k = i;
            while (k > 0 && insertindex == 0){
            if (next.getArtist().compareTo(list[k-1].getArtist())>0){
            insertindex = k;
            } else {
            list[k] = list[k-1];
            }
            k--;
            }
            list[insertindex] = next;
            }
    }

    //method to find songs by year
    public static void findSongsByYear(Music[] list, int year) {
        sortYears(list);
        int high = list.length;
        int low = 0;
        int mid = (low + high)/2;
        boolean found = false;
    
        while ((low <= high)&& list[mid].getYear() != year){

            if(year< list[mid].getYear()){
                high = mid-1;
            } else{
                low = mid +1;
            }

            mid = (low + high) /2;

        }

        if(list[mid].getYear() == year){
            found = true;
            System.out.println("Results:");
            for(Music item : list){
                if (item.getYear() == year){
                    System.out.println(item.getTitle() + " by " + item.getArtist());
                }
            }
        }

        if (!found){
            System.out.println("No results found for " + year);
        }
        
    }

        // method to find songs by artist name
        public static void findSongsbyName (Music[] list, String artist){

            sortArtist(list);

            int low = 0;
            int high = list.length;
            int mid = (low + high) /2;
            boolean found  = false;


            while(low <= high && !found){
                mid = (low + high)/2;
                if(list[mid].getArtist().equals(artist)){
                    found = true;
                }
                else if (artist.compareTo(list[mid].getArtist()) < 0) {
                     high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (found ==  true){
                System.out.println("Results");
                for (Music item : list){
                    if (item.getArtist().equals(artist)){
                        System.out.println(item.getTitle() + " by " + item.getArtist());
                    }
                }
            }
            if (!found) {
                System.out.println("No results found for " + artist);
            }
        
            
        }

        // method to find song by title of song
        public static void findbyTitle(Music[] list, String title){

            sortTitle(list);
            int low = 0;
            int high  = list.length;
            int mid;
            boolean found = false;

            while (low<= high && !found){
                mid = (low + high)/2;
                if(list[mid].getTitle().equals(title)){
                    found = true;
                }
                else if ( title.compareTo(list[mid].getTitle()) < 0){
                    high = mid -1;
                } else {
                    low = mid+ 1;
                }

            }

            if (found == true){
                System.out.println("Results");
                for (Music item: list){
                    if (item.getTitle().equals(title)){
                        System.out.println(item.getTitle() + " by " + item.getArtist());
                    }
                }
            }

            if (!found) {
                System.out.println("No results found for " + title);
            }

        }
            

}
