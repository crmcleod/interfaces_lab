public class MP3Player extends Component {
    public MP3Player(String make, String model) {
        super(make, model);
    }

    public String connect(Stereo s) {
        return "I am " + s.getName() + "'s MP3 Player, connecting";
    }
}
