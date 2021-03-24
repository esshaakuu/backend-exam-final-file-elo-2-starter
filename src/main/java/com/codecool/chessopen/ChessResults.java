package com.codecool.chessopen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Scanner;

public class ChessResults {

    public List<String> getCompetitorsNamesFromFile(String fileName){

        List<String> namesInOrder = new ArrayList<>();

        try {
            File chessResults = new File("fileName");
            Scanner myReader = new Scanner(chessResults);
            while(myReader.hasNext()){
                String[] results = myReader.nextLine().split(",");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }



        return null;
    }

}
