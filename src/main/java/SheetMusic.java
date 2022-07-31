public class SheetMusic implements  ISell {

    private String type;

    private double sellPrice;
    private double boughtPrice;

    public SheetMusic(double boughtPrice, double sellPrice){
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.type = "MISC";
    }

    public double calculateMarkup() {
        return sellPrice - boughtPrice;
    }
    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }
    }



