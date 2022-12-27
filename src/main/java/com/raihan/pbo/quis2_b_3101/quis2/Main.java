
package com.raihan.pbo.quis2_b_3101.quis2;


    import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk meminta input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input data fakultas
        System.out.print("Masukkan ID fakultas: ");
        int idFakultas = input.nextInt();
        input.nextLine(); // Menghapus baris baru yang dibaca oleh nextInt()
        System.out.print("Masukkan nama fakultas: ");
        String namaFakultas = input.nextLine();
        System.out.print("Masukkan pencacah fakultas: ");
        int pencacah = input.nextInt();

        // Meminta input data prodi
        System.out.println("Masukkan data prodi:");
        ArrayList<Prodi> prodiList = new ArrayList<Prodi>();
        for (int i = 1; i <= 4; i++) {
            System.out.print("ID prodi " + i + ": ");
            int idProdi = input.nextInt();
            input.nextLine(); // Menghapus baris baru yang dibaca oleh nextInt()
            System.out.print("Nama prodi " + i + ": ");
            String namaProdi = input.nextLine();

            // Membuat objek Prodi dan menambahkannya ke dalam list prodi
            Prodi prodi = new Prodi(idProdi, namaProdi);
            prodiList.add(prodi);
        }

        // Membuat objek Fakultas_3048 dengan data yang telah dimasukkan
        Fakultas_3048 fakultas = new Fakultas_3048(idFakultas, namaFakultas, pencacah, prodiList);

        // Menampilkan data fakultas dan prodi yang telah dimasukkan
        System.out.println("\nData fakultas dan prodi:");
        System.out.println("ID fakultas: " + fakultas.getIdFakultas());
        System.out.println("Nama fakultas: " + fakultas.getNamaFakultas());
        System.out.println("Pencacah fakultas: " + fakultas.getPencacah());
        System.out.println("Data prodi:");
        ArrayList<Prodi> prodis = fakultas.getProdi();
        for (int i = 0; i < prodis.size(); i++) {
            Prodi prodi = prodis.get(i);
            System.out.println("ID prodi " + (i+1) + ": " + prodi.getIdProdi
    

    

