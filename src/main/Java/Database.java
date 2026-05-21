package database;

import java.io.*;
import java.nio.file.*;

public class Base {

    private String name;
    private String Occupation;
    private String language;
    private int ID;

    public String getname() { return name; }
    public String getOccupation() { return Occupation; }
    public String getlanguage() { return language; }

    public void setname(String name) { this.name = name; }
    public void setOccupation(String Occupation) { this.Occupation = Occupation; }
    public void setlanguage(String language) { this.language = language; }
    public void setID(int ID) { this.ID = ID; }

    public void handlingfile() throws Exception {
        Path database = Path.of("D:\\Java programming\\Factory\\src\\database\\database.txt");
        if (!Files.exists(database)) {
            Files.createFile(database);
        }
    }
    public void findid(int id) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader("D:\\Java programming\\Factory\\src\\database\\database.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int ID = Integer.parseInt(parts[0]);
            if (ID == id) {
                setID(ID);
                setname(parts[1]);
                setOccupation(parts[2]);
                setlanguage(parts[3]);
                break;
            }
        }
        reader.close();
    }
    public String giveit(int id, String name, String occupation, String language) throws Exception {
        Path path = Path.of("D:\\Java programming\\Factory\\src\\database\\database.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        java.util.List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] parts = line.split(",");
            int existingId = Integer.parseInt(parts[0]);
            if (existingId == id) {
                return "ID already exists";
            }
        }
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(path.toString(), true)
        );
        writer.write(id + "," + name + "," + occupation + "," + language);
        writer.newLine();
        writer.close();
        return "created successfully";
    }
    public String updateit(int id, String name, String occupation, String language) throws Exception {
        Path path = Path.of("D:\\Java programming\\Factory\\src\\database\\database.txt");
        if (!Files.exists(path)) {
            return "DB file not found";
        }
        java.util.List<String> lines = Files.readAllLines(path);
        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            int ID = Integer.parseInt(parts[0]);
            if (ID == id) {
                lines.set(i, id + "," + name + "," + occupation + "," + language);
                Files.write(path, lines);
                return "updated successfully";
            }
        }
        return "ID not found";
    }
    public String deleteit(int id) throws Exception {
        Path path = Path.of("D:\\Java programming\\Factory\\src\\database\\database.txt");
        if (!Files.exists(path)) {
            return "DB file not found";
        }
        java.util.List<String> lines = Files.readAllLines(path);
        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            int ID = Integer.parseInt(parts[0]);
            if (ID == id) {
                lines.remove(i);
                Files.write(path, lines);
                return "deleted successfully";
            }
        }
        return "ID not found";
    }
}