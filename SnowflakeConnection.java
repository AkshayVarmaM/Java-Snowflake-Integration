import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SnowflakeConnection {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("user", "AKSHAY");
        properties.put("password", "Akshay1234567891011");
        properties.put("warehouse", "<none selected>");
        properties.put("db", "MY_DATABASE");
        properties.put("schema", "MY_SCHEMA");

        try (Connection connection = DriverManager.getConnection(
                "jdbc:snowflake://ZPDWZPV-MO11799.snowflakecomputing.com/",
                properties);
                Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT CURRENT_TIMESTAMP");
            while (resultSet.next()) {
                System.out.println("Current Timestamp: " + resultSet.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
