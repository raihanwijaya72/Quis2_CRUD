
package com.raihan.pbo.quis2_b_3101.quis2;

class Prodi_3101 {
     private String idProdi_3101;
    private String namaProdi_3101;

    public Prodi_3101(String idProdi_3101, String namaProdi_3101) {
        this.idProdi_3101 = idProdi_3101;
        this.namaProdi_3101 = namaProdi_3101;
    }

    Prodi_3101() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void tampilProdi(){
        System.out.println("TAMPIL DATA PRODI");
        System.out.println("Id Prodi : " + idProdi_3101);
        System.out.println("Nama Prodi : " + namaProdi_3101);
    }
}

    

