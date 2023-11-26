public class publicationDemo {
    public static void main(String[] args) {
        Publication pb = new Publication("IT Ethics", 100, 50);
        Book book1 = new Book("Java Programming", 29.99, 100, "John Doe");
        Magazine magazine1 = new Magazine(100.00,5,"Magzine 1",50.0,10.0);
        pb.sellCopy(10);
        book1.orderCopy(5);
        book1.sellCopy(2);
        magazine1.orderCopy(2);

    }
}
