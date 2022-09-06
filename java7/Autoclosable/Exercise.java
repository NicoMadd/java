package java7.Autoclosable;

/*
 * Before you start, know that something is wrong and the code wont just compile. 
 */

public class Exercise {
    public static void main(String[] args) {
        Handler handler = new Handler();
        handler.openConnection();
        handler.makeQuery("Some query");
        handler.closeConnection();
    }
}
