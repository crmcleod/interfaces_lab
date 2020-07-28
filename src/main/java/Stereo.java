public class Stereo{
    CDPlayer cdPlayer;
    MP3Player mp3Player;
    Radio radio;
    RecordDeck recordDeck;
    String name;

    public Stereo(String name){
        this.name = name;
        cdPlayer = new CDPlayer("Tibo", "TI435CDP");
        mp3Player = new MP3Player("Samsung", "MP3Xr7");
        radio = new Radio("DAB FM", "R11201");
        recordDeck = new RecordDeck("PIXAPRO", "ORBIT600");
    }

    public void playCD(){
        cdPlayer.connect(this);
    }

    public void tuneRadio(){
        radio.connect(this);
    }

}
