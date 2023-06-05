package BookApp;

/**
 *
 * @author Farida Fatali
 */
public class Book {
    Author author;
    
    String title;
    {
        title = new String("A Thousand Splendid Suns");
        System.out.println("The book tytle: " + title);
    }
    
    int page;
    {
        page = 384;
        System.out.println("Pages: " + page);
    }
    
    String type;
    {
        type = new String("Novel");
        System.out.println("The book type: " + type);
    }
    
    boolean isHardCover;
    {
        isHardCover = false;
        System.out.println("Is it Hard Cover? " + isHardCover);
    }
    
    int currentPage;
    {
        currentPage = 150;
        System.out.println("Current page: " + currentPage);
    }
    

    public Book() {
    }

    public Book(Author author, String title, int page, String type) {
        this.author = author;
        this.title = title;
        this.page = page;
        this.type = type;
    }
    
    

    public Book(Author author, String title, int page, String type, boolean isHardCover, int currentPage) {
        this(author, title, page, type);
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
    }
    

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsHardCover() {
        return isHardCover;
    }

    public void setIsHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    
}
