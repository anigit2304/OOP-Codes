class Book extends Publication {
    private String author;

    // Constructor for Book
    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }
    void orderCopy(int orderQty){
        this.copies += orderQty;
        System.out.println(orderQty +" Copies of Book has been Ordered of " + title );
    }
}
