/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detektifconan59;

/**
 *
 * @author ASUS TUF
 * Nama : Salma Nafisa Qurrotu'Aini
 * Nim : 22205038
 * Kelas : Teknik Informatika
 * Matakuliah : PBO1
 * Semester : 3
 * 
 */
public class DetektifConan59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KarakterUtama conan = new KarakterUtama("Conan Edogawa/Shinichi Kudo", 
                "Detektif", "Memecahkan/Menyelesaikan Kasus ", "Detektif Cilik");
        conan.tampilKarakterUtama();
        
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ahli Beladiri Karate", 
                "Ingin Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA dan Suka pada Shinichi Kudo");
        ran.tampilKarakterUtama();
        
        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta", 
                "Memecahkan/Menyelesaikan Kasus", "Detektif Swasta");
        kogoro.tampilKarakterUtama();
        
        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki", "Pengacara", 
                "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilKarakterPendukung();
        
        KarakterPendukung sonoko = new KarakterPendukung("Sonoko Suzuki", 
                "Siswi SMA", "Sahabatnya Ran Mouri");
        sonoko.tampilKarakterPendukung();
        
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", 
                "Detektif SMA", "Temannya Conan Edogawa");
        heiji.tampilKarakterPendukung();
        
        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Tayoma", 
                "Ahli Aikido", "Temannya Ran Mouri dan Suka pada Heiji Hattori");
        kazuha.tampilKarakterPendukung();
        
        KarakterPendukung agasa = new KarakterPendukung("Hiroshi Agasa", "Profesor",
                "Memberikan bantuan kepada Conan berupa alat dalam memecahkan/menyelesaikan kasus dan kepada Detektif Cilik");
        agasa.tampilKarakterPendukung();
        
         KarakterPendukung ai = new KarakterPendukung("Ai Haibara/Shiho Miyano", "Peneliti/Detektif Cilik",
                "Memberikan bantuan kepada Conan dan salah satu Detektif Cilik");
        ai.tampilKarakterPendukung();
        
    }
    
    
}
