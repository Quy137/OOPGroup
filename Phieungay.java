package KhoPhuTungXeMay;

import java.util.Scanner;

public class Phieungay {
    public Phieungay() {
    }

    protected int date ,  month, year;

    public Phieungay(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay");
        int date = sc.nextInt(); sc.nextLine();
        do {
            if (date < 1 || date >31) {
                System.out.println("!!!Nhap lai!!!");
                System.out.println("Nhap ngay");
                date = sc.nextInt(); sc.nextLine();
            }

        } while(date < 1 || date >31);
        
        System.out.println("Nhap thang");
        int month = sc.nextInt(); sc.nextLine();

        do {

            if (month >12 || month < 1) {
                System.out.println("!!!Nhap lai!!!");
                System.out.println("Nhap thang");
                month = sc.nextInt(); sc.nextLine();
            }
        } while(month >12 || month < 1) ;
        System.out.println("Nhap nam");
        int year = sc.nextInt(); sc.nextLine(); 
        do {

            if (year >2024 || year < 1) {
                System.out.println("!!!Nhap lai!!!");
                System.out.println("Nhap nam");
                year = sc.nextInt(); sc.nextLine(); 
    
            }
        } while(year >2024 || year < 1);
    }

}