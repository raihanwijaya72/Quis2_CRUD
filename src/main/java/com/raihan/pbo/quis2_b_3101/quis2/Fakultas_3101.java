

package com.raihan.pbo.quis2_b_3101.quis2;


public class Fakultas_3101 {
     private String idFakultas_3101;
    private String namaFakultas_3101;
    private int pencacah_3101;
    private Prodi_3101 prodi_3101;

    public Fakultas_3101(String idFakultas_3101, String namaFakultas_3101, int pencacah_3101, 
            Prodi_3101 prodi_3101,String idProdi_3101,String namaProdi_3101){
        this.idFakultas_3101 = idFakultas_3101;
        this.namaFakultas_3101 = namaFakultas_3101;
        this.pencacah_3101 = pencacah_3101;
        this.prodi_3101 = prodi_3101;
    }

    public void tambahProdi(String idProdi_3101,String namaProdi_3101){
        
    }
    
    public void tampilFakultas(){
        System.out.println("TAMPIL DATA FAKULTAS");
        System.out.println("Id Fakultas : " + idFakultas_3101);
        System.out.println("Nama Fakultas : " + namaFakultas_3101);
        
    }
}


   