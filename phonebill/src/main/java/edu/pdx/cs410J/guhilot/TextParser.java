package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.ParserException;
import edu.pdx.cs410J.PhoneBillParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextParser implements PhoneBillParser {

    String filename, custName;

    public TextParser(String fiName, String cuName){
        this.filename = fiName;
        this.custName = cuName;
    }


    @Override
    public AbstractPhoneBill parse() throws ParserException {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(this.filename));
        } catch (FileNotFoundException e) {
            System.out.println("Text Dump File with given name does not exist. File created.");
            if(!this.filename.contains("/")){
                PrintWriter out = null;
                try {
                    out = new PrintWriter(this.filename);
                } catch (FileNotFoundException ex) {
                    System.out.println("File is not present.");
                }
                out.write(this.custName);
                out.close();
            }
            else {
                PrintWriter out = null;
                File f = null;
                File f1 = null;
                String v;
                boolean bool = false;
                f = new File(this.filename);
                f1 = f.getParentFile();
                v = f1.getAbsolutePath();
                bool = f1.exists();
                //check if directory exists or not
                if (bool) {
                    try {
                        out = new PrintWriter(this.filename);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    out.write(this.custName);
                    out.close();
                } else {
                    File folder = new File(v);
                    if (folder.mkdir()) {
                        try {
                            out = new PrintWriter(this.filename);
                        } catch (FileNotFoundException ex) {
                            ex.printStackTrace();
                        }
                        out.write(this.custName);
                        out.close();
                    } else {
                        System.out.println("Could not create directory");
                        System.exit(1);
                    }
                }
            }
        }
        try {
            sc = new Scanner(new File(this.filename));
        } catch (FileNotFoundException e) {
            System.out.println("File is not present.");
        }
        ArrayList<String> lines = new ArrayList<String>();
        assert sc != null;
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        if(lines.size() == 0){
            System.err.println("The textfile is empty!");
            System.exit(1);
        }
        int sze = lines.size();
        PhoneBill bill = new PhoneBill(lines.get(0));
        //This for loop checks each and every detail of every flight in the text file
        for(int i = 1; i < sze; ++i) {
            String[] words = lines.get(i).split(" ");

//            if(words.length != 10) {
//                System.err.println("The text file is not formatted properly.");
//                System.exit(1);
//            }
            //PhoneCall call = new PhoneCall(words[1],words[2],words[3], words[4].concat(" ").concat(words[5]), words[6], words[7].concat(" ").concat(words[8]));
            PhoneCall call = new PhoneCall(words[3],words[5],words[7], words[8].concat(" ").concat(words[9]), words[11], words[12].concat(" ").concat(words[13]));
            bill.addPhoneCall(call);
        }
        //System.out.println(bill.getPhoneCalls());
        return bill;
    }
}




//            checkFlightnum(words[1]);
////            checkairportcode(words[3]);
////            checkairportcode(words[9]);
////            checkdatetime(words[5], words[6], words[7]);
////            checkdatetime(words[11], words[12], words[13]);
////            Flight flight = new Flight();
////            flight.setFlightnum(words[1]);
////            flight.setSrc(words[3]);
////            flight.setDepart(words[5], words[6], words[7]);
////            flight.setDest(words[9]);
////            flight.setArrive(words[11], words[12], words[13]);
////            if(flight.checkdeparturebeforearrival()){
////                airline.addFlight(flight);
////            }
////            else{
////                System.err.println("The flight's arrival time is before its departure time in the text file");
////                System.exit(1);
////            }


//Checks if the airline name in the file is similar to that in the command line or not
//        if(!this.airlinename.equals(lines.get(0))){
//            System.err.println("The airline name is different than in the file");
//            System.exit(1);
//        }