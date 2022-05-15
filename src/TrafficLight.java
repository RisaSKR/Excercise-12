enum TrafficColour{
    RED, YELLOW, GREEN
}
class TrafficLightSimulator {
    //variable that stores the current light colour
    TrafficColour colour = TrafficColour.RED;

    public void changeColour() {
        //switch statement change colour
        switch (colour) {
            case RED:
                colour = TrafficColour.YELLOW;
                break;
            case YELLOW:
                colour = TrafficColour.GREEN;
                break;
            case GREEN:
                colour = TrafficColour.RED;
        }
    }

    public String toString() {
        return " " + colour;
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator();
        for(int i = 0; i < 9; i++){ //limit the number(9) of execution in our method
            System.out.println(t1);
            t1.changeColour();
        }
        }
    }
