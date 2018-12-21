package database;

import java.sql.DriverManager;



public class Connection {
    public static void main (String[] args) throws Exception
    {

        database();
    }

    public static Connection database(){
        try{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/database";
            String username = "PNT";
            String password = "Mdenam@786";
            Class.forName(driver);

            Connection con = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("connected");
            return con;

        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
