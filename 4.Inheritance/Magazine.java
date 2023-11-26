public class Magazine extends Publication {
    private double orderQty;
    private int currentIssue;
    
    Magazine(double orderQty, int currentIssue, String title,double price, double copies){
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    void orderCopy(int orderQty){
        this.copies += orderQty;
        System.out.println(orderQty +" Magzine Copies of " + title + " has been Ordered");
    }

    void receiveissue(int IssueNumber){
        this.currentIssue = IssueNumber;
        System.out.println("Received issue " + IssueNumber + " of " + title + ".");

    }  
}
