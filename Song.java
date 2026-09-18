

public class Song {
    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds){
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
    public int getDurationSeconds(){
        return durationSeconds;
    }
    public void setDurationSeconds(int durationSeconds){
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
        String label =  "\"" + title + "\"" + artist + "\"" + durationSeconds + "'\"";
        return label;
    }
    public String toString(){
        return "";
    }
    public boolean equals(Song other){
        if(title == other.getTitle() && artist == other.getArtist() && durationSeconds == other.getDurationSeconds()){
            return true;
        }
        else {
            return false;
        }
    }


}
