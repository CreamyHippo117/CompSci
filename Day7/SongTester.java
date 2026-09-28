package Day7;
public class SongTester {
    public static void main(String[] args) {
        Song song1 = new Song("Blinding Lights", "The Weeknd", 180);

        double minutes = song1.getDurationMinutes();
        String initial = song1.getArtistInitial();
        int titleLength = song1.getTitleLength();

        System.out.println("Duration in minutes: " + minutes);
        System.out.println("Artist initial: " + initial);
        System.out.println("Title length: " + titleLength);
        System.out.println("Label: " + song1.getLabel());
        System.out.println("Song: " + song1);

          System.out.println("Duration in minutes: " + minutes);
        System.out.println("Artist initial: " + initial);
        System.out.println("Title length: " + titleLength);
        System.out.println("Label: " + song1.getLabel());
        System.out.println("Song: " + song1);

        Song original = new Song("Blinding Lights", "The Weeknd", 180);
        Song alias = original;

        alias.setArtist("Weeknd");

        System.out.println("Original artist after alias change: " + original.getArtist());

        Song a = new Song("Blinding Lights", "The Weeknd", 180);
        Song b = new Song("Blinding Lights", "The Weeknd", 180);

        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
    }
}
