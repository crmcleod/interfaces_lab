public class CDPlayer extends Component {

    int NumberOfCDs;

    public CDPlayer(String make, String model, int NumberOfCDs){
        super(make, model);
    }

    public String connect(Stereo s) {
        return "I am " + s.getName() + "'s CD Player, connecting";
    }
}
