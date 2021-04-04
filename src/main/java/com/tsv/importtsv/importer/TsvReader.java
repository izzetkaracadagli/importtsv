package com.tsv.importtsv.importer;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class TsvReader {
    public static List<NameBasics> tsvr(File test2) {
        List<NameBasics> nameBasicsList = new ArrayList<>();
        try (BufferedReader TSVReader = new BufferedReader(new FileReader(test2))) {
            String line = null;
            TSVReader.readLine();
            NameBasics nameBasics;
            while ((line = TSVReader.readLine()) != null) {
                String[] lineItems = line.split("\t"); //splitting the line and adding its items in String[]
                nameBasics = new NameBasics(lineItems[0],lineItems[1],lineItems[2],lineItems[3],lineItems[4],lineItems[5]);
                nameBasicsList.add(nameBasics);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return nameBasicsList;
    }
}
