package Lab7;

public class car {
    private String color;
    private int seat;
    private String geaTppe;
    private String engineSize;

    //constructor


    public car(String color, int seat, String geaTppe, String engineSize) {
        this.color = color;
        this.seat = seat;
        this.geaTppe = geaTppe;
        this.engineSize = engineSize;
    }
    //getter and setter methods

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getGeaTppe() {
        return geaTppe;
    }

    public void setGeaTppe(String geaTppe) {
        this.geaTppe = geaTppe;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
}//class
