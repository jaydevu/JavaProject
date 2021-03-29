package Assignment4;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Question44_student {

    public static void main(String[] args) throws IOException {

        String[] name_address = {"kathmandu", "08 Kathmandu", "08 pokhara", "08 Chitwan", "mustang",     "09pokhara", "lalitpur", "Bhaktapur", "Nuwakot", "karnali"};
        String[] name={"Ram","Ram","Hari","Anuj","Abhi","Jay","ajay","Haribahadur","Madanbadhur", "Bahadur",};
        int len = name_address.length;

        String filepath = "C:/Users/Jay/Desktop/new_Student.txt";
        File myob = new File(filepath);
        try {
            FileWriter myWriter = new FileWriter("C:/Users/Jay/Desktop/new_Student.txt");
            for (int i = 0; i < len; i++) {
                myWriter.write( name[i]+  ":"+name_address[i]+"\n");

            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        BufferedReader reader;
        try {
            String a="";
            reader = new BufferedReader(new FileReader(
                  "C:/Users/Jay/Desktop/new_Student.txt"));
            System.out.println("Enter a name: ");
            Scanner nn=new Scanner(System.in);
            a=nn.nextLine();

            for(int i=0 ; i<=10;i++) {
            String line=reader.readLine();
                switch(a) {
                    case "Ram":
                        System.out.println(name_address[0]);
                        reader.close();
                        break;
                    case "Sam":


                        System.out.println(name_address[1]);
                        reader.close();
                        break;
                    case "Hari":
                        System.out.println(name_address[2]);
                        reader.close();
                        break;
                    case "Anuj":
                        System.out.println(name_address[3]);
                        reader.close();
                        break;
                    case "Abhi":
                        System.out.println(name_address[4]);
                        reader.close();
                        break;
                    case "Jay":
                        System.out.println(name_address[5]);
                        reader.close();
                        break;
                    case "ajay":
                        System.out.println(name_address[6]);
                        reader.close();
                        break;
                    case "Haribadhur":
                        System.out.println(name_address[7]);
                        reader.close();
                        break;
                    case "Madanbahadur":
                        System.out.println(name_address[8]);
                        reader.close();
                        break;
                    case "Bahadur":
                        System.out.println(name_address[9]);
                        reader.close();
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + a);
                }
            }



        } catch (Exception e) {
            //e.printStackTrace();
        }

    }}




