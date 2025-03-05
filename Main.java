public class Main 
{
    public static void main(String[] args)
    {
        // Test case 1 
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);

        System.out.println(bio2019.getBookInfo());
    }
}