public class Radio extends Component {

    String tune;

    public Radio(String make, String model, String tune){
        super(make, model);
        this.tune = tune;
    }

    public String tune(){
        return tune;
    }

    public String connect(Stereo s) {
        return "I am " + s.getName() + "'s radio, connecting";
    }


}
