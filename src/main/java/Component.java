public abstract class Component implements IConnect{
    protected String make, model;
    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String make() { return make; }
    public String model() { return model; }
}
