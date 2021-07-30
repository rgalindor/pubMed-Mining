import java.sql.*;
import java.io.*;
import java.util.*;

public class MyMySQL
{
 public static void main(String[] args) throws Exception
  {
   try
    {
     Class.forName("com.mysql.jdbc.Driver").newInstance();
    }
   catch(Exception e) 
   {
    System.err.println("Unable to load driver."); 
    e.printStackTrace();
   } 

   Connection Conn = DriverManager.getConnection(args[0], args[1], args[2]);
   Statement Stat = Conn.createStatement();
   System.out.println("Te conectaste mijo");
  }
}

