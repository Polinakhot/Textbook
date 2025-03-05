public class Book
{
    private String title;
    private double price;

    public Book(String bookTitle, double bookPrice)
    {
        //create a new book with given title and price 
    }

    public String getTitle()
    {
        return title;
    }

    public String getBookInfo()
    {
        return super.getBookInfo() + "-" + edition;
    }

 
}