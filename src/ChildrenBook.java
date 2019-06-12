public class ChildrenBook extends Book {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double computeSalePrice(double p){
        double d = p * 0.25;
        return d;
    }
    @Override
    public String toString() {
        return getBarcode() + " " + getRegularPrice() + " " + getTitle() +
               " " + getPublisher() + " " + getYearPublished() + " " + getAge() + "\n";
    }
}
