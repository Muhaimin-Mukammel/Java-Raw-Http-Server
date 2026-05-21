package Logic;

import database.Base;

public class logic {
    Base Database = new Base();
    public String handledataget(String[] resource, int ID) {

        try {
            if (resource[1].equals("data") && resource[2].equals("dev")) {
                Database.findid(ID);
                return "\n" + Database.getname() + "\n" + Database.getOccupation() + "\n" + Database.getlanguage();
            } else {
                return "invalid request";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
    public String handledatapost(String[] resource, int ID, String name, String occupation, String language) throws Exception {
        try {
            if (resource[1].equals("data") && resource[2].equals("dev")) {
                return Database.giveit(ID, name, occupation, language);
            }
            return "Wrong request";
        }catch (Exception e){
            return "Error : " + e.getMessage();
        }
    }

    public String handledatadelete(String[] resource, int ID) throws Exception {
        try {
            if (resource[1].equals("data") && resource[2].equals("dev")) {
                return Database.deleteit(ID);
            } else {
                return "Wrong request";
            }
        }catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }

    public String handledatapatch(String[] resource, int ID, String name, String occupation, String language) throws Exception {
        try{
            if (resource[1].equals("data") && resource[2].equals("dev")) {
                return Database.updateit(ID, name, occupation, language);
            } else {
                return "Wrong request";
            }
        }catch (Exception e){
            return "Error : " + e.getMessage();
        }
    }
}