
package librarycardcatalog;

public class CatalogCard
{
    
    int cardID;
    String bookTitle;
    String bookAuthor;
    int yearPublished;
    String dateAdded;
    String dateUpdated;
    String addedBy;
    String updatedBy;
    
    public CatalogCard()
    {
        cardID = 0;
        bookTitle = "";
        bookAuthor = "";
        yearPublished = 0;
        addedBy = "";
        updatedBy = "";
    }
    
    public CatalogCard(int id, String title, String bookAuthor, int yrPub,
        String dateAdded, String addedBy)
    {
        this.cardID = id;
        this.bookTitle = title;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yrPub;
        this.dateAdded = dateAdded;
        this.addedBy = addedBy;
    }
}
