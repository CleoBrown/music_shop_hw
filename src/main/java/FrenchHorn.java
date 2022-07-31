public class FrenchHorn extends Instrument implements IPlay {
    private int valves;
    private Type type;

    public FrenchHorn (String material, String colour, int valves){
        super( material, colour, Type.BRASS);
        this.valves = valves;
    }


    public String play() {
        return "Toot toot";
    }
}
