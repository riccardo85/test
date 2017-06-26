package codiceFiscale;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;

import com.mysql.jdbc.Statement;

public class DBManager {
  public DBManager() {
  }

  Connection Connessione() throws ServletException, IOException {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost/codfiscale?useSSL=false", "root",
          "root");
      
      Statement createStatement = (Statement) connection.createStatement();
      
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return connection;
  }
}