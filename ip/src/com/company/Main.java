package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//ip адресс
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите айпи адресс");
        String ipishka = in.nextLine();
        ipProverka(
               ipishka
        );
    }
    private static void ipProverka(String... Ipadress) {
        //Pattern ip = Pattern.compile("(\\d{0,3}\\.){3}\\d{0,3}");
        Pattern ip = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}");
        // рассматривает 5 варианта
        //{4} - число повторений
        for (String nip : Ipadress) {
            Matcher m = ip.matcher(nip);
            if (m.find()) {
                System.out.print("найден ip адресс: ");
                System.out.print(m.group());
            } else {
                System.out.println("не найден");
            }
        }
    }
}
