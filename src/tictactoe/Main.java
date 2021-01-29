package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         Scanner:   Kokio dydzio bus lenta?
         Kur klaus musu ejimo: mes turime ivedineti X arba 0 tokiu formatu 1 5
         Po kiekvieno ejimo, turi buti atspauzdinta lenta, ir reikia patikrinti ar zaidimas ne pabaigtas
         Kompjuteris randomaizeriu sprendzia kur pastatys savo elemnta (jeigu lauaks uzimtas, jiesko kito su random)
         */
        //                      rows  columns
//        int[][] desk3x3 = new int[3][3];
        //type[row_index][column_index];
        /*
        char [][] desk3x3 = {
                {'.','.','.'},
                {'.','.','.'},
                {'.','.','.'}
        };
        String [][] desk3x3Instr = {
                {"0 0","0 1","0 2"},
                {"1 0","1 1","1 2"},
                {"2 0","2 1","2 2"},
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite su kuo zaisite. Iveskite X arba 0:");
        String choice = sc.nextLine();
        System.out.println("Pozicija pasirinkite pagal skaiciu.");
        System.out.println("Skaicius iveskite atskirai, pirmiau pirma skaiciu, po to antra.");
        // atspauzdinti taisykles
        for(int i = 0; i < desk3x3Instr.length; i++) {
            for(int j = 0; j < desk3x3Instr.length; j++) {
                System.out.print("|" + desk3x3Instr[i][j] + "|");
            }
            System.out.println();
        }
        // atspauzdina lauka
        for(int i = 0; i < desk3x3.length; i++) {
            for (int j = 0; j < desk3x3.length; j++) {
                System.out.print(desk3x3[i][j]);
            }
            System.out.println();
        }
        System.out.println("Iveskite pirma skaiciu:");
        int skX = sc.nextInt();
        System.out.println("Iveskite antra skaiciu:");
        int skY = sc.nextInt();
        */
        char [][] desk3x3 = {
                {'.','.','.'},
                {'.','.','.'},
                {'.','.','.'}
        };
        String [][] desk3x3Instr = {
                {"0 0","0 1","0 2"},
                {"1 0","1 1","1 2"},
                {"2 0","2 1","2 2"},
        };
        Scanner sc = new Scanner(System.in);
        int skX;
        int skY;
//        int kSkX = 0;
//        int kSkY = 0;
        boolean playXO = true;
        do{
            System.out.println("Pasirinkite su kuo zaisite. Iveskite X arba 0:");
            String choice = sc.nextLine();
            System.out.println("Pozicija pasirinkite pagal skaiciu.");
            System.out.println("Skaicius iveskite atskirai, pirmiau pirma skaiciu, po to antra.");
            // atspauzdinti taisykles
            for(int i = 0; i < desk3x3Instr.length; i++) {
                for(int j = 0; j < desk3x3Instr.length; j++) {
                    System.out.print("|" + desk3x3Instr[i][j] + "|");
                }
                System.out.println();
            }
            // atspauzdina lauka
            for(int i = 0; i < desk3x3.length; i++) {
                for (int j = 0; j < desk3x3.length; j++) {
                    System.out.print(desk3x3[i][j]);
                }
                System.out.println();
            }
            System.out.println("Iveskite pirma skaiciu:");
            skX = sc.nextInt();
            System.out.println("Iveskite antra skaiciu:");
            skY = sc.nextInt();
            // zaidejo eijimas
            if(skX < 0  && skX > desk3x3.length || skY < 0 && skY > desk3x3.length ) {
                playXO = false;
                throw new ArrayIndexOutOfBoundsException("Ivestas netaisingas skaicius");
            } else {
                desk3x3[skX][skY] = 'X';
            }
            // kompjuterio ejimas
            int kSkX = (int) (Math.random() * desk3x3.length);
            int kSkY = (int) (Math.random() * desk3x3.length);
            if(kSkX < 0  && kSkX > desk3x3.length || kSkY < 0 && kSkY > desk3x3.length ) {
                playXO = false;
                throw new ArrayIndexOutOfBoundsException("Ivestas netaisingas skaicius");
            } else {
                // ciklose tikrinti kSkx ir kitame kSkY
                for(int i = 0; i < desk3x3.length; i++) {

                }
                // paziureti kaip iteruoti per antrojo masyvo duoemnis ?
                for (int j = 0; j  < desk3x3[desk3x3.length][desk3x3.length - j]; j++) {

                }
//                do {
//                    kSkX = (int) (Math.random() * desk3x3.length);
//                    kSkY = (int) (Math.random() * desk3x3.length);
//                    desk3x3[kSkX][kSkY] = '0';
//                } while (kSkX != kSkX && kSkY != kSkY && kSkX != skX && kSkY !=skY);

//                if  (kSkX == kSkX && kSkY == kSkY) {
//                    kSkX = (int) (Math.random() * desk3x3.length);
//                    kSkY = (int) (Math.random() * desk3x3.length);
//                }
//                if ( kSkX != skX  &&  kSkY != skY ) {
//                    desk3x3[kSkX][kSkY] = '0';
//                } else {
//                    kSkX = (int) (Math.random() * desk3x3.length);
//                    kSkY = (int) (Math.random() * desk3x3.length);
//                }
//                    desk3x3[kSkX][kSkY] = '0';
//                if ( kSkX == kSkX && kSkY == kSkY) {
//
//                    desk3x3[kSkX][kSkY] = '0';
//                }
            }
            for(int i = 0; i < desk3x3Instr.length; i++) {
                for(int j = 0; j < desk3x3Instr.length; j++) {
                    System.out.print("|" + desk3x3Instr[i][j] + "|");
                }
                System.out.println();
            }

        } while(playXO);
    }

    public void printField() {

    }
}
