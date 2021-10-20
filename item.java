import java.util.Scanner;
interface Item {
    public void read();

    public void show();
}
class Book implements Item
{ protected String name;
    protected String author;
    protected String publication;

    public void read()
    { Scanner sc= new Scanner(System.in);
        System.out.print("Enter the details: ");
         name= sc.nextLine();
         author= sc.nextLine();
        publication= sc.nextLine();
    }
    public void show()
    { System.out.println("Book Name:" +name);
        System.out.println("Author Name:"+author);
        System.out.println("Publicatin: "+publication);
    }
}
class Dvd implements Item
{ protected String title;
    protected String director;
    protected String category;
    public void read()
    { Scanner sc= new Scanner(System.in);
        System.out.print("Enter the details: ");
        title= sc.nextLine();
         director= sc.nextLine();
        category= sc.nextLine();
    }
    public void show()
    { System.out.println("Book Name:" +title);
        System.out.println("Author Name:"+director);
        System.out.println("Publicatin: "+category);
    }
}
public class itemscode{

    public static void main( String []args)
    {
        items it[]=new items[5] ;
        
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                char c = sc.next().charAt(0);
                if (c == 'b') {
                    it[i] = new book();

                    it[i].read();
                    it[i].show();


                }
                if (c == 'd') {
                    it[i] = new dvd();
                    it[i].read();
                    it[i].show();
                }
            }
        
    }
}
