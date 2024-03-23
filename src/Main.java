import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String [] REGEX = {
                "^([\\dA-Za-z_.%-]{1,}@[\\dA-Za-z.-]{1,}\\.[A-Za-z]{2,})$",
                "^\\(?(\\d{3})\\)?[-. ]?(\\d{3})[-. ]?(\\d{4})$",
                "^\\d{4}[-/]\\d{2}[-/]\\d{2}$|^\\d{2}[-/]\\d{2}[-/]\\d{4}$|^\\d{1}[-/]\\d{2}[-/]\\d{4}$|^\\d{2}[-/]\\d{1}[-/]\\d{4}$",
                "^(?:(?:\\d|[01]\\d\\d?|2[0-4]\\d|25[0-5]).){3}(?:\\d|[01]\\d\\d?|2[0-4]\\d|25[0-5])$",
                "^[A-Za-z_][A-Za-z\\d_]*$",
                "^(?!.*[bB]{3}).*$",
                "((?:aa|bb)*(?:ab|ba)(?:aa|bb)*)",
                "\\b\\w{3}\\b",
                "\\bhttps?://\\S+\\b",
                "^([A-Za-z\\d]+(?:[+*/-]+[A-Za-z\\d]+)*)=([A-Za-z\\d]+(?:[+*/-]+[A-Za-z\\d]+)*)$"

        };
        String inputFilePath = "input.txt";
        String outputFilePath = "out.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            String problemNo;
            Pattern pattern;
            Matcher matcher;
            while((problemNo = reader.readLine())!=null){
                switch (problemNo){
                    case "1":{
                        String text;
                        writer.write("1");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                             pattern = Pattern.compile(REGEX[Integer.parseInt("1")-1]);
                           matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid email");
                                writer.newLine();
                            } else {
                                writer.write("invalid email");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "2":{
                        String text;
                        writer.write("2");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("2")-1]);
                            matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid phone number");
                                writer.newLine();
                            } else {
                                writer.write("invalid phone number");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "3":{
                        String text;
                        writer.write("3");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("3")-1]);
                            matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid date");
                                writer.newLine();
                            } else {
                                writer.write("invalid date");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "4":{
                        String text;
                        writer.write("4");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("4")-1]);
                            matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid IP address");
                                writer.newLine();
                            } else {
                                writer.write("invalid IP address");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "5":{
                        String text;
                        writer.write("5");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("5")-1]);
                            matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid C++ variable name");
                                writer.newLine();
                            } else {
                                writer.write("invalid C++ variable name");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "6":{
                        String text;
                        writer.write("6");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("6")-1]);
                            matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid string");
                                writer.newLine();
                            } else {
                                writer.write("invalid string, has 3 consecutive b's");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "7":{
                        String text;
                        writer.write("7");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("7")-1]);
                            matcher = pattern.matcher(text);
                            writer.write("*" + text + "*");
                            writer.newLine();
                            ArrayList<String []> matched = new ArrayList<>();
                            while (matcher.find()) {
                                String [] matchedData = {
                                        matcher.group(),
                                        Integer.toString(matcher.start()),
                                        Integer.toString(matcher.end())
                                };
                                matched.add(matchedData);
                            }
                            if(matched.isEmpty()){
                                writer.write("No substring matches");
                                writer.newLine();
                                continue;
                            }
                            writer.write("number of matched substrings: " + matched.size());
                            writer.newLine();
                            for(String [] group : matched) {
                                writer.write("matched substring: " + group[0]);
                                writer.newLine();
                                writer.write("start index: " + group[1] + ", end index: " + group[2]);
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "8":{
                        String text;
                        writer.write("8");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("8")-1]);
                            matcher = pattern.matcher(text);
                            writer.write("*" + text + "*");
                            writer.newLine();
                            ArrayList<String []> matched = new ArrayList<>();
                            while (matcher.find()) {
                                String [] matchedData = {
                                        matcher.group(),
                                        Integer.toString(matcher.start()),
                                        Integer.toString(matcher.end())
                                };
                                matched.add(matchedData);
                            }
                            if(matched.isEmpty()){
                                writer.write("No word matches");
                                writer.newLine();
                                continue;
                            }
                            writer.write("number of matched words: " + matched.size());
                            writer.newLine();
                            for(String [] group : matched) {
                                writer.write("matched word: " + group[0]);
                                writer.newLine();
                                writer.write("start index: " + group[1] + ", end index: " + group[2]);
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "9":{
                        String text;
                        writer.write("9");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            writer.write("*" + text + "*");
                            writer.newLine();
                            pattern = Pattern.compile(REGEX[Integer.parseInt("9")-1]);
                            BufferedReader prob9Reader = new BufferedReader(new FileReader(text));
                            String prob9Line;
                            ArrayList<String []> matched = new ArrayList<>();
                            int lineCounter = 1;
                            while((prob9Line = prob9Reader.readLine()) != null){
                                matcher = pattern.matcher(prob9Line);
                                while (matcher.find()) {
                                    String [] matchedData = {
                                            matcher.group(),
                                            Integer.toString(matcher.start()),
                                            Integer.toString(matcher.end()),
                                            Integer.toString(lineCounter)
                                    };
                                    matched.add(matchedData);
                                }
                                lineCounter++;
                            }
                            if(matched.isEmpty()){
                                writer.write("No URL");
                                writer.newLine();
                                break;
                            }
                            writer.write("Number of URLs: " + matched.size());
                            writer.newLine();
                            for(String [] group:matched){
                                writer.write("URL: " + group[0]);
                                writer.newLine();
                                writer.write("Line: " + group[3]);
                                writer.newLine();
                                writer.write("start index: " + group[1] + ", end index: " + group[2]);
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                    case "10":{
                        String text;
                        writer.write("10");
                        writer.newLine();
                        while(!(text = reader.readLine()).equals("end")){
                            pattern = Pattern.compile(REGEX[Integer.parseInt("10")-1]);
                            matcher = pattern.matcher(text);
                            if (matcher.matches()) {
                                writer.write("valid mathematical expression");
                                writer.newLine();
                            } else {
                                writer.write("invalid mathematical expression");
                                writer.newLine();
                            }
                        }
                        writer.write("x");
                        writer.newLine();
                        break;
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Error in files: " + e.getMessage());
        }
    }
}