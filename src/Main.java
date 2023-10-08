import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int g = scanner.nextInt();
            if (g == 0) {
                System.out.println("Exit");
                break;
            }

            if (g > 0 && g <= 10) {
                g = 'A';
            } else if (g > 11 && g <= 20) {
                g = 'B';
            } else if (g > 21 && g <= 30) {
                g = 'C';
            } else if (g > 31 && g <= 40) {
                g = 'D';
            }  else if (g > 41 && g <= 50) {
                g = 'E';
            }

            switch (g){
                case 'A' -> System.out.println("Numarul introdus este: " + g + " si textul pentru el este: Zehn!");
                case 'B' -> System.out.println("Numarul introdus: " + g + " si textul pentru el este: Zwanzig!");
                case 'C' -> System.out.println("Numarul introdus: " + g + " si textul pentru el este: Dreizig!");
                case 'D' -> System.out.println("Numarul introdus: " + g + " si textul pentru el este: Vierzig!");
                case 'E' -> System.out.println("Numarul introdus: " + g + " si textul pentru el este: Funfzig!");
                default -> System.out.println("Numarul introdus: " + g + " si textul pentru el este: Mehr als Funfzig!");
            }
        }

    }
}