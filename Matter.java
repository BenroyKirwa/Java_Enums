public class Matter {

    String name;
    States state;

    public Matter(String name, States state){
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public States getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Name: " + name + " State: " + state;
    }
}
