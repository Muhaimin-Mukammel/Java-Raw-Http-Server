package Client;

import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8080);
            PrintWriter request = new PrintWriter(clientSocket.getOutputStream(), true);
            request.print("GET /data/dev/4/ HTTP/1.1\r\n");
            String body = "name:Emon,occupation:Debugging Expert,language:C++";
            request.print("Content-Lenght: " + body.length() + "\r\n");
            request.print("\r\n");
            request.println(body);
            request.flush();
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Error in client : " + e.getMessage());
        }
    }
}