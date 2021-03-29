package Assignment4;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Question45_Duplicate {




        public static void main(String[] args) throws Exception {
            String filepath = "C:/Users/Jay/Desktop/data12.txt";
            File myob = new File(filepath);
            try {
                FileWriter myWriter = new FileWriter("C:/Users/Jay/Desktop/data12.txt");
                    myWriter.write("hello "+"\n"+"how" +"\n"+"how"+"\n"+ "are"+ "\n"+"you");



                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            String line, word = "";
            int count = 0, maxCount = 0;
            ArrayList<String> words = new ArrayList<String>();

            //Opens file in read mode
            FileReader file = new FileReader("data1.txt ");
            BufferedReader reader = new BufferedReader(file);

            //Reads each line
            while((line = reader.readLine()) != null) {
                String[] string;
                string = line.toLowerCase().split("([,.\\s]+) ");
                //Adding all words generated in previous step into words
                words.addAll(Arrays.asList(string));
            }

            //Determine the most repeated word in a file
            for(int i = 0; i < words.size(); i++){
                count = 1;
                //Count each word in the file and store it in variable count
                for(int j = i+1; j < words.size(); j++){
                    if(words.get(i).equals(words.get(j))){
                        count++;
                    }
                }
                //If maxCount is less than count then store value of count in maxCount
                //and corresponding word to variable word
                if(count > maxCount){
                    maxCount = count;
                    word = words.get(i);
                }
            }

            System.out.println("Most repeated word: " + word);
            reader.close();
        }
    }

