package java7.Autoclosable;

public class Handler {

    public void openConnection() {
        System.out.println("Connection established");
    }

    public void closeConnection() {
        System.out.println("Connection closed");
    }

    public void makeQuery(String query) throws Exception {
        System.out.println("Make query: " + query);
        if (query.chars().sum() % 2 > 0) {
            throw new Exception();
        }
    }

}
