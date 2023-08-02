package org.caixuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {
        // create file
        File dkSet = new File("diploma.csv");

        //variable
        int index =0;
        int sum=0;

        ArrayList<DiplomaData> diplomaData = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<String> category = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> diplomaLanjutan = new ArrayList<>();
        ArrayList<String> kursusPengkhususan = new ArrayList<>();


        //check
        if(dkSet.exists()) {
            System.out.println("File exists");
            System.out.println();

            if (dkSet.canRead()) {
                System.out.println("File is readable");
                System.out.println();
            } else {
                System.out.println("File is unreadable");
                System.out.println();
            }

            try(Scanner reader = new Scanner(dkSet)) {
                while (reader.hasNext()) {
                    String line = reader.nextLine();
                    if(index > 0) {
                        String[] items = line.split(",");

                        DiplomaData data = new DiplomaData(items[0], items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8]);



                        int one = Integer.parseInt(items[3]);
                        int two = Integer.parseInt(items[4]);
                        int three = Integer.parseInt(items[5]);
                        int four = Integer.parseInt(items[6]);
                        int five= Integer.parseInt(items[7]);
                        int six= Integer.parseInt(items[8]);

                        sum = one + two + three + four + five + six;

                        int[] values = new int[]{one, two, three, four, five, six};

                        int largest = values[0];
                        for (int value : values) {
                            largest = Math.max(largest, value);
                        }

                        int smallest = values[0];
                        for (int value : values) {
                            smallest = Math.min(smallest, value);
                        }
                        DiplomaData dt = new DiplomaData("category","name",1,2,3);
                        dt.setCategory(items[1]);
                        dt.setName(items[2]);
                        dt.setMax(largest);
                        dt.setMin(smallest);
                        dt.setTotal(sum);

                        total.add(sum);
                        max.add(largest);
                        min.add(smallest);

                        diplomaData.add(dt);

                        System.out.println("Category : " + dt.getCategory() + " Name : " + dt.getName() + " Total : " + dt.getTotal()+" Maximum : " + dt.getMax() + " Minimum : " +dt.getMin());

                    }
                    index++;



                }

                for(DiplomaData row: diplomaData) {
                    if(row.getCategory().equals("Diploma Lanjutan")) {
                        diplomaLanjutan.add(row.getName());
                    }

                    else
                        kursusPengkhususan.add(row.getName());
                    }


                System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(ANSI_PURPLE+ "Diploma Lanjutan" + ANSI_RESET);
                for(String categories: diplomaLanjutan){
                    System.out.println(categories);
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(ANSI_PURPLE+"Kursus Pengkhususan" + ANSI_RESET);
                for(String names: kursusPengkhususan) {
                    System.out.println(names);
                }

                try {
                    PrintWriter diplomaWriter = new PrintWriter("diploma_lanjutan.txt");
                    PrintWriter kursusWriter = new PrintWriter("kursus_pengkhususan.txt");


                    for(DiplomaData row: diplomaData) {
                        if(row.getCategory().equals("Diploma Lanjutan")) {
                            diplomaWriter.println(row);
                        }
                        else{
                            kursusWriter.println(row);
                        }
                    }

                    diplomaWriter.close();
                    kursusWriter.close();

                    System.out.println("Data separated and written to files.");
                } catch (IOException e) {
                    System.err.println("An error occurred: " + e.getMessage());
                }


            } catch (FileNotFoundException exception) {
                System.out.println(exception.getMessage());
            }
        }

        else {
            System.out.println("File does not exists");}

    }
}
