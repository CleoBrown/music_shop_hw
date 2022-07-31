public class DoubleBass extends Instrument implements IPlay{

    private int numberOfStrings;
    private Type type;

    public DoubleBass(String material, String colour, int numberOfStrings){
        super( material, colour, Type.STRING);
        this.numberOfStrings = numberOfStrings;
    }


    public String play() {
        return "BUM BUM";
    }
}
