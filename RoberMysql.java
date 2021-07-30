import java.sql.*;
import java.io.*;
import java.util.*;

public class RoberMysql{
	public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String dbUrl=args[0];
	String username=args[1];
	String password=args[2];
	Connection mCon = DriverManager.getConnection(dbUrl,username,password);
   Statement Stat = mCon.createStatement();
   System.out.println("Te conectaste mijo");
//   Stat.executeUpdate("create database pruebaRobertsoniana");
  ResultSet rs = Stat.executeQuery("select * from yeastnet limit 10");
	}
}

