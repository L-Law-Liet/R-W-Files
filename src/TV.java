
public class TV extends Product {
    private String typeTV;
    private double screenSize;

    public String getTypeTV() {
        return typeTV;
    }

    public void setTypeTV(String typeTV) {
        this.typeTV = typeTV;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public String getPublisher() {
        return null;
    }

    @Override
    public void setPublisher(String publisher) {

    }

    @Override
    public int getYearPublished() {
        return 0;
    }

    @Override
    public void setYearPublished(int yearPublished) {

    }

    @Override
    public void setAge(int age) {

    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }


    public double computeSalePrice(double p) {

        double d = p * 1.2;
        return d;
    }

    @Override
    public int getAge() {
        return 1;
    }

    @Override
    public String toString() {
        return getBarcode() + " " + getRegularPrice() +
                " " + getTypeTV() + " " + getScreenSize() + "\n";
    }
}