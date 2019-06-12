import java.io.*;

public class Read {
    public void ser(Product[] products) {

        try {
            FileWriter writer = new FileWriter("L.txt");
            for(int i=0; i<products.length; i++){
            writer.write(products[i].toString());}
            writer.close();
            System.out.println("OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  /* public Product[] des(int q) throws InvalidObjectException {
        ObjectInputStream ois=null;
            try {
                FileInputStream fis = new FileInputStream("N.txt");

                    ois = new ObjectInputStream(fis);
                    Product[] products = new Product[q];
                    for (int i=0; i<q; i++){
                    products[i]= (Product) ois.readObject();}
                    return products;

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        throw new InvalidObjectException("Object Not");
    }*/
}
