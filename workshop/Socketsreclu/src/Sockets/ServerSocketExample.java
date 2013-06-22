package Sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {//class to run the server
	
	String[] array = {"one", "three", "four", "five"};
	
	public void establishConnection(){
		try {
			ServerSocket socket = new ServerSocket(50000);//listen at port 50000
			while(true){
				Socket sock = socket.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String ran = getStringList();
				writer.println(ran);
				writer.close();
				System.out.println(ran);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main (String[] args)
	{
		new ServerSocketExample().establishConnection();
	}
	private String getStringList()
	{
		int random = (int)(Math.random()* array.length);
		return array[random];
	}
}
