import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(((\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3})(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){
            try (BufferedWriter fl = new BufferedWriter(new FileWriter("IP.txt"))){
                String text=(matcher.group());
                fl.write("Правильный IP добавлен в сисок: "+text);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            try (BufferedWriter fl = new BufferedWriter(new FileWriter("IP.txt"))){
                fl.write("IP Введен не корректно");
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}