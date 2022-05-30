package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

	try(FileWriter writer = new FileWriter("File.txt")){
        char a;
        for(a = 'A'; a <='Z'; a++){
            writer.write(a+ "" + Character.toLowerCase(a) + " \n");
        }

        for(int i = 0; i < 10; i++){
            writer.write(i + " \n");
        }
    }

    catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try(FileReader reader = new FileReader("File.txt")){
        Scanner scanner = new Scanner(reader);
        int counter = 0;

        while (scanner.hasNextLine()){
            counter++;
            System.out.println(counter + ": " + scanner.nextLine());
        }

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
