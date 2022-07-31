public class Maraca extends Instrument implements ISell, IPlay{

    private String filler;
    public Maraca(String material, String colour, String filler){
        super( material, colour, Type.PERCUSSION);
        this.filler = filler;
    }


    public String play() {
        return "Rattle";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
