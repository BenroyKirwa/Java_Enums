import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating an array of matters
        Matter[] matters = {
                new Matter("Rock", States.SOLID),
                new Matter("Water", States.LIQUID),
                new Matter("Oil", States.LIQUID),
                new Matter("Oxygen", States.GAS),
                new Matter("Nitrogen", States.GAS)
        };

        // Creating a list to add states
        List<Matter> solids = new ArrayList<>();
        List<Matter> liquids = new ArrayList<>();
        List<Matter> gases = new ArrayList<>();

        // Checking for different states and adding them to the list
        for (Matter matter : matters) { // for each matter in the array
            switch (matter.state){
                // If the matter is a solid
                case SOLID :
                    solids.add(matter); // Add the matter to the solids list
                    break;
                // If the matter is a liquid
                case LIQUID :
                    liquids.add(matter); // Add the matter to the liquids list
                    break;
                // If the matter is a gas
                case GAS :
                    gases.add(matter); // Add the matter to the gasses list
                    break;
            }
        }

        // Print out the States
        System.out.println("Solids are: " + solids);
        System.out.println("Liquids are: " + liquids);
        System.out.println("Gases are: " + gases);
    }
}