import java.io.*;
import java.util.*;
import java.net.*;
public class Conexion
{
	public static void main(String[] args) throws Exception
	{
		String line = "";
		URL url = new URL(args[0]);
		URLConnection conn = url.openConnection();
		BufferedReader infile = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while((line = infile.readLine()) != null){
			System.out.println(line);
		}
	}
}
