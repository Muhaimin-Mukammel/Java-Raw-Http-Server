import Server.server;

import java.io.IOException;

public class Starter {
    public static void main(String[] args) throws IOException {
        server obj = new server();
        obj.Start();
    }
}