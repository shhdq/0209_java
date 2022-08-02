import java.sql.Connection;
import java.sql.DriverManager;

public class Con {

    String DB = "jdbc:mysql://localhost:3306/crudJava";
    String USER = "root";
    String PASS = "biskviits";

    public void co() {
        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
