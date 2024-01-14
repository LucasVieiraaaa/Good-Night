import java.util.Date;
import javax.xml.bind.ParseConversionEvent;

public class App {
    public static void main(String[] args) throws Exception {
        String values [] = new String[3];
        int hour = 0,min = 0;
        Date date = new Date();
        String s = date.toString(),resposta = "";
        values = s.split(" ");

       s = values[3];
       values = s.split(":");
      hour = Integer.parseInt(values[0]);
      min = Integer.parseInt(values[1]);

             if (hour >= 0 && hour <6) {
                resposta = "Good Morning";
             }else if (hour >= 6 && hour <=12) {
                resposta = "Good Morning";
             }else if(hour >= 12 && hour <=18){
                resposta = "Good Afternoon";
             }else if (hour >= 19 && hour <=23){
                resposta = "Good Night";
             }
             System.out.println("Hello user, hope you have a " + resposta + "!");
    }
}
