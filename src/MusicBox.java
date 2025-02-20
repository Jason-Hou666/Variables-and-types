public class MusicBox {
    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;

    // Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        this.songTitle = title;
        this.songAlbum = album;
        this.songGenre = genre;
        this.songProducer = producer;
        this.songMusicLabel = label;
    }

    // Getters
    public String getSongID() {
        return songID;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public String getSongProducer() {
        return songProducer;
    }

    public String getSongMusicLabel() {
        return songMusicLabel;
    }

    public char getIsSongPremium() {
        return isSongPremium;
    }

    // Methods
    public void playSong(String songID, char premium, int ads) {
        switch (premium) {
            case 'Y':
                System.out.println("This is a premium song. Please buy it to play without the ads");
                playAd(ads, premium);
                break;
            case 'N':
                System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
                playAd(ads, premium);
                break;
        }
    }

    private void playAd(int ads, char premium) {
        if (ads == 1) {
            System.out.println("Playing Ad 1");
        } else {
            for (int i = 1; i <= ads; i++) {
                System.out.println("Playing Ad " + i);
            }
        }
    }

   
    public void displaySongDetails() {
        System.out.println("Song ID: " + songID);
        System.out.println("Song Title: " + songTitle);
        System.out.println("Song Artists: " + songArtists);
        System.out.println("Song Album: " + songAlbum);
        System.out.println("Song Genre: " + songGenre);
        System.out.println("Song Producer: " + songProducer);
        System.out.println("Song Music Label: " + songMusicLabel);
        System.out.println("Is Song Premium: " + isSongPremium);
    }
}
