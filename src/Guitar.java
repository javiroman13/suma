public class Guitar {
    private String SerialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backwood;
    private String topwood;

    public Guitar() {
    }


    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackwood() {
        return backwood;
    }

    public void setBackwood(String backwood) {
        this.backwood = backwood;
    }

    public String getTopwood() {
        return topwood;
    }

    public void setTopwood(String topwood) {
        this.topwood = topwood;
    }
}//fin
