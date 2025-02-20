public class Main {
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
            "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getIsSongPremium(), 2);

        
        MusicBox mbox2 = new MusicBox("A1B2C3D4", 'N', "Sunshine", "Bright", 
            "The journey ahead", "Pop", "Happy Music", "Tune Town");

        System.out.println("Now playing the song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getIsSongPremium(), 1);
    }
}




