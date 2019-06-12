import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] Lawliet) throws FileNotFoundException {
        File file = new File("N.txt");

            Scanner L = new Scanner(file);


        double pr=0;
        Product [] products = new Product[6];
        TV tv = new TV();
        products[0] = tv;

        TV tv1 = new TV();
        products[1] = tv1;

        Book book = new Book();
        products[2]=book;

        Book book1 = new Book();
        products[3]=book1;

        ChildrenBook childrenBook = new ChildrenBook();
        products[4]=childrenBook;

        ChildrenBook childrenBook1 = new ChildrenBook();
        products[5]=childrenBook1;

        byte b = 0;
        String s;
        double a = 0;
        int bc;
        while (b<6){
            if (b==0 || b==1){
                s = L.next();
                bc=Integer.parseInt(s);
                products[b].setBarcode(bc);
                s = L.next();
                a=Double.parseDouble(s);
                pr=products[b].computeSalePrice(a);
                products[b].setRegularPrice(pr);
                products[b].setTypeTV(L.next());
                s = L.next();
                a=Integer.parseInt(s);
                products[b].setScreenSize(a);
            }
            if (b==2 || b==3){
                s = L.next();
                bc=Integer.parseInt(s);
                products[b].setBarcode(bc);
                s = L.next();
                a=Double.parseDouble(s);
                pr=products[b].computeSalePrice(a);
                products[b].setRegularPrice(pr);
                String str = L.nextLine();
                String[] result = str.split("(?=[A-Z])");
                String[] res = result[2].split("(?=[ ][0-9])");
                products[b].setTitle(result[1].substring(0,result[1].length()-1));
                products[b].setPublisher(res[0]);

                bc=Integer.parseInt(res[1].substring(1,res[1].length()));
                products[b].setYearPublished(bc);

            }
            if (b==4 || b==5){
                s = L.next();
                bc=Integer.parseInt(s);
                products[b].setBarcode(bc);
                s = L.next();
                a=Double.parseDouble(s);
                pr=products[b].computeSalePrice(a);
                products[b].setRegularPrice(pr);
                String str = L.nextLine();
                String[] result = str.split("(?=[A-Z])");
                String[] res = result[2].split("(?=[ ][0-9])");
                products[b].setTitle(result[1].substring(0,result[1].length()-1));
                products[b].setPublisher(res[0]);

                bc=Integer.parseInt(res[1].substring(1,res[1].length()));
                products[b].setYearPublished(bc);
                bc=Integer.parseInt(res[2].substring(1,res[2].length()));
                products[b].setAge(bc);
            }

            b++;

        }
        L.close();

Read read = new Read();

        read.ser(products);

/*        try {

            products = read.des(products.length);

        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        for (int i=0; i<products.length; i++){
            System.out.println(products[i].toString());
        }*/


    }

}
