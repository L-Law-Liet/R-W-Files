
abstract class Product {
    private int barcode;
    private double regularPrice;
    public abstract double computeSalePrice(double p);

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public abstract int getAge();
    public abstract String getTypeTV();
    public abstract double getScreenSize();

    public abstract String getTitle();

    public abstract void setTitle(String title);

    public abstract String getPublisher();

    public abstract void setPublisher(String publisher);

    public abstract int getYearPublished();

    public abstract void setYearPublished(int yearPublished);
    public abstract void setAge(int age);
    public abstract void setScreenSize(double screenSize);
    public abstract void setTypeTV(String typeTV);

}
