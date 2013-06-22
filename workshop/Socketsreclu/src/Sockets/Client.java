package Sockets;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
      public void establishConnection(){
      try{

      Socket s = new Socket("127.0.0.1", 3551);


          InputStreamReader stream = new InputStreamReader(s.getInputStream());
          BufferedReader reader = new BufferedReader(stream);

          PrintWriter writer = new PrintWriter(s.getOutputStream());	
          writer.println("23456ABCDE");
          writer.flush();

          String str = null;
          while((str = reader.readLine()) != null){
          System.out.println("Text received from server; " + str);
           }	



          writer.close();
          reader.close();
          }catch(IOException e){
          e.printStackTrace();
          }
}

          public static void main(String[] args){
          new Client().establishConnection();
     }

}