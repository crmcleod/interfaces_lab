public class RecordDeck extends Component {
    PlaySpeed recordSpeed;

    public RecordDeck(String make, String model, PlaySpeed recordSpeed){
        super(make, model);
        this.recordSpeed = recordSpeed;
    }

    public String connect(Stereo s) {
        return "I am " + s.getName() + "'s record deck, connecting";
    }
}
