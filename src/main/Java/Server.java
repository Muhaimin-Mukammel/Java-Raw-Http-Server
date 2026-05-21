package Server;

import java.io.*;
import java.net.*;
import Router.router;

public class server {
    public void Start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            System.out.println("Server Waiting");
            Socket client = serverSocket.accept();
            System.out.println("Client connected");
            BufferedReader readdata = new BufferedReader(
                    new InputStreamReader(client.getInputStream())
            );
            String txt = readdata.readLine();
            String line;
            int lenght = 0;
            while(!(line = readdata.readLine()).isEmpty()){
                if(line.startsWith("Content-Lenght:")){
                    lenght = Integer.parseInt(line.split(":")[1].trim());
                }
            }
            String Body = "";
            if(lenght > 0){
                char[] newBody = new char[lenght];
                readdata.read(newBody);
                Body = new String(newBody);
            }
            router obj = new router();
            String response = obj.Routing(txt, Body);
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            writer.println(response);
            client.close();
        }
    }
}