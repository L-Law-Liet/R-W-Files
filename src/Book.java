public class Book extends Product{
    private String title;
    private String publisher;
    private int yearPublished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public void setScreenSize(double screenSize) {

    }

    @Override
    public void setTypeTV(String typeTV) {

    }


    @Override
    public double computeSalePrice(double p){
        double d = p * 0.5;
        return d;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getTypeTV() {
        return null;
    }

    @Override
    public double getScreenSize() {
        return 0;
    }
    @Override
    public String toString() {
        return getBarcode() + " " + getRegularPrice() +
                " " + getTitle() + " " + getPublisher() + " " + getYearPublished() + "\n";
    }
}
