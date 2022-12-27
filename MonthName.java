import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] months =
                { null, "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        System.out.println("Digita el numero del mes: ");
        int mes = sc.nextInt();

        if (mes >= 1 && mes <= 12){
            System.out.println(months[mes]);
        } else{
            System.out.println("no es un numero valido!!!");
        }
    }
}
