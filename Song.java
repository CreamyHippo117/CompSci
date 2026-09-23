

public class Song {
    private String title;
    private String artist;
    private double durationSeconds;

    public Song(String title, String artist, double durationSeconds){
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public Song(){
        title = "Unknown";
        artist = "Unknown";
        durationSeconds = 0;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public double getDurationSeconds(){
        return durationSeconds;
    }
    public void setDurationSeconds(double durationSeconds){
        this.durationSeconds = durationSeconds;
    }
    public double getDurationMinutes(){
        double durationMinutes = durationSeconds / 60;
        return durationMinutes;
    }
    public String getArtistInitial(){
        String artistInitital = artist.substring(0,1);
        return artistInitital;
    }
    public int getTitleLength(){
        int titleLength = title.length();
        return titleLength;
    }
    public String getLabel(){
        return title + "-" + artist;
    }
    public String toString(){
        return  "\"" + title + "\"" + artist + "\"" + durationSeconds + "'\"";
    }
    public boolean equals(Song other){
        if(title == other.getTitle() && artist.equals(other.getArtist())){
            return true;
        }
        else {
            return false;
        }
    }


}
