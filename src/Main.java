
public class Main {
    public static void main(String[] args) {
        Database db = null;
        try {
            db = Database.getInstance();

        } catch (Exception e) {
            System.err.println("Impossible to connect to database\n" + e.getMessage() + "\nExiting");
            System.exit(-1);
        }

        db.insert("ciao', 2, 3); DROP TABLE menu; -- ", 3, 2);
        System.out.println(db.selectAll());

    }
}
