public class Stereo{
    CDPlayer cdPlayer;
    MP3Player mp3Player;
    Radio radio;
    RecordDeck recordDeck;
    String name;
    double volume;

    public Stereo(String name){
        this.name = name;
        this.volume = 0;
        cdPlayer = new CDPlayer("Tibo", "TI435CDP", 2);
        mp3Player = new MP3Player("Samsung", "MP3Xr7");
        radio = new Radio("DAB FM", "R11201", "Radio 1");
        recordDeck = new RecordDeck("PIXAPRO", "ORBIT600", PlaySpeed.SPEED45RPM);
    }

    public String getName() { return this.name; }

    public String playCD(){
        return cdPlayer.connect(this);
    }

    public String tuneRadio(){
        return radio.connect(this);
    }

    public String playRecord(){
        return recordDeck.connect(this);
    }

    public String playMP3(){
        return mp3Player.connect(this);
    }

    public double volume() {
        return this.volume;
    }

    public void raiseVolume(double volIncrease){
        this.volume+= volIncrease;
    }

    public void decreaseVolume(double volDecrease){
        this.volume -= volDecrease;
        if(this.volume < 0) {
            this.volume = 0;
        }
    }



}
