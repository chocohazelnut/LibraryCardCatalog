
package librarycardcatalog;

import java.util.ArrayList;

public class LibraryCardCatalog
{
    
    ArrayList<CatalogCard> cat = new ArrayList<CatalogCard>();
    ArrayList<CatalogCard> archive = new ArrayList<CatalogCard>();
    
    public ArrayList initial() {
        CatalogCard c1 = new CatalogCard(1, "Shiver", "Maggie Stiefvater",
            2009, "5-10-2018 3:55:31", "Hazel Cavite");
        CatalogCard c2 = new CatalogCard(2, "Linger", "Maggie Stiefvater",
            2010, "5-11-2018 4:06:02", "Earvin Hao");
        CatalogCard c3 = new CatalogCard(3, "Forever", "Maggie Stiefvater",
            2011, "5-12-2018 4:10:28", "Clizen Cortes");
        CatalogCard c4 = new CatalogCard(4, "Sinner", "Maggie Stiefvater",
            2014, "5-13-2018 10:10:28", "Thessa Quijote");
        cat.add(c1);
        cat.add(c2);
        cat.add(c3);
        cat.add(c4);
        return cat;
    }
    
    public void addCard (CatalogCard card)
    {   
        cat.add(card);
    }
    public void deleteCard (CatalogCard card)
    {
        cat.remove(card);
        archive.add(card);
    }
    public void editCard (CatalogCard card)
    {
        
    }

}