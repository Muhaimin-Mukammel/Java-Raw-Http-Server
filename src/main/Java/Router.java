package Router;

import Logic.logic;

public class router {
    public String Routing(String txt, String body) {
        try {
            String[] token = txt.split("\\s+");
            String[] resource = token[1].split("/");
            if (resource.length != 4) {
                return "Invalid Request";
            }
            int ID = Integer.parseInt(resource[3]);

            String name = "", occupation = "", language = "";
            if(!body.isEmpty()){
                String[] parts = body.split(",");
                name = parts[0].split(":")[1].trim();
                occupation = parts[1].split(":")[1].trim();
                language = parts[2].split(":")[1].trim();
            }
            logic obj = new logic();
            switch (token[0]) {
                case "GET":
                    return obj.handledataget(resource, ID);
                case "POST":
                    return obj.handledatapost(resource, ID, name, occupation, language);
                case "PATCH":
                    return obj.handledatapatch(resource, ID, name, occupation, language);
                case "DELETE":
                    return obj.handledatadelete(resource, ID);
                default:
                    return "404 Error";
            }
        } catch (Exception e) {
            return "Error in splitting/router";
        }
    }
}