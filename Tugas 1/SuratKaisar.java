import java.io.*;
import java.util.*;

    public class SuratKaisar {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String pesan = in.nextLine();
            int nilaiPergeseran = in.nextInt();
            diGeser(pesan, nilaiPergeseran);

        }

        public static void diGeser(String kalimat, int pergeseran) {
            String penggeseran = "";
            for (int i = 0; i < kalimat.length(); i++) {

                if ((int) kalimat.charAt(i) == 32) {
                    penggeseran += (char) 32;

                } else if ((int) kalimat.charAt(i) + pergeseran > 122) {
                    int temp = ((int) kalimat.charAt(i) + pergeseran) - 122;
                    penggeseran += (char) (96 + temp);

                } else if ((int) kalimat.charAt(i) + pergeseran > 90 && (int) kalimat.charAt(i) < 96) {
                    int temp = ((int) kalimat.charAt(i) + pergeseran) - 90;
                    penggeseran += (char) (64 + temp);

                } else {
                    penggeseran += (char) ((int) kalimat.charAt(i) + pergeseran);

                }

            }
            System.out.println(penggeseran);
        }

    }

