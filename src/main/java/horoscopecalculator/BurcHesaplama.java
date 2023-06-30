package horoscopecalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi girin (GG.AA.YYYY): ");
        String date = input.nextLine();
        LocalDate dogumGünü = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String burc = burcHesapla(dogumGünü);
        System.out.println("Burcunuz: " + burc); input.close();
    }
    public static String burcHesapla(LocalDate birthDate) {
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Koç Burcu";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Boğa Burcu";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "İkizler Burcu";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Yengeç Burcu";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Aslan Burcu";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Başak Burcu";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Terazi Burcu";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Akrep Burcu";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Yay Burcu";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Oğlak Burcu";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Kova Burcu";
        } else {
            return "Balık Burcu";
        }
    }

}
