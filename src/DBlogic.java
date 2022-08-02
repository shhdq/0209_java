import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBlogic {

    String name = "Name";

    Con co = new Con();

    // insert
//    public void insert() {
//        try(Connection conn = DriverManager.getConnection(DB, USER, PASS);
//            Statement stmt = conn.createStatement();
//        ) {
//
////            String sql = "INSERT INTO users (usr, name) VALUES ('" +  name + "', 'test')";
//
//            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (usr, name) VALUES (?, ?)");
//
//            ps.setString(1, name);
//            ps.setString(2, "School");
//
//            ps.executeUpdate();
//
//            System.out.println("Dati pievienoti!");
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // delete
    public void delete() {

        co.co();
        try {

            PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE id=?");

            ps.setInt(1, 1);

            ps.executeUpdate();

            System.out.println("Dati izdzēsti!");
        } catch (Exception a) {
            a.printStackTrace();
        }
    }


}
