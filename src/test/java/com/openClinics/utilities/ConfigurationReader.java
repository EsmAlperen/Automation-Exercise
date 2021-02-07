package com.openClinics.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- I created properties object.
    private static Properties properties = new Properties();

    static{
        //2- I got my path and store in String
        String path = "configuration.properties";

        //3- I need to open the file
        try {
            FileInputStream file = new FileInputStream(path);
            //4- I need to load the file to properties object
            properties.load(file);
            //5- close.file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Properties file not found.");
        }
    }
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }



}
