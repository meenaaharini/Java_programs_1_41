import java.sql.*;

public class BankTransaction {
    public static void transfer(Connection con, int fromId, int toId, double amount) throws SQLException {
        try {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - " + amount + " WHERE id = " + fromId);
            stmt.executeUpdate("UPDATE accounts SET balance = balance + " + amount + " WHERE id = " + toId);
            con.commit();
        } catch (Exception e) {
            con.rollback();
            System.out.println("Transaction failed, rolled back");
        }
    }
}