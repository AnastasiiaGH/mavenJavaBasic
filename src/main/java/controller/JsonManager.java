package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Human;
import model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Метод для записи объекта University в файл JSON
    public static void writeUniversityToJson(University university, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для считывания объекта University из файла JSON
    public static University readUniversityFromJson(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
