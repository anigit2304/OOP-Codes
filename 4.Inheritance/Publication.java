public class Publication{
    protected String title;
    protected double price;
    protected double copies;

    Publication(String title,double price, double copies){
        this.title = title;
        this.price = price;
        this.copies = copies;
    }


    //common method
    void sellCopy(int qty){
     if(copies >= qty){
        copies -= qty;
        System.out.println(qty+" Copies of " + title +" has sold for $" + qty * price);
     }  
     else{
        System.out.println("Insufficent Copies of " + title + "Available for sell");
     } 
    }
}