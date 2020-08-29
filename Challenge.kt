import java.util.*

public var input = Scanner(System.`in`);
fun main(){
    println("=====MASUKKAN NAMA ANDA=====")
    print("Nama : ")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()){
        println("Nama Anda Masih Kosong")
        main()
    }
    println("=====MASUKKAN KELAS ANDA=====")
    print("Kelas : ")
    val kelas: String? = input.nextLine()

    if (kelas.isNullOrEmpty()){
        println("Kelas Anda Masih Kosong")
        main()
    }
    println("=====MASUKKAN ABSEN ANDA=====")
    print("Absen : ")
    val absen: String? = input.nextLine()

    if (absen.isNullOrEmpty()){
        println("Absen Anda Masih Kosong")
        main()
    }
    print("GitHub : ")
    val git: String? = null
    val gitLength = git?.length ?: "MichaelAgustinusS"
    println(gitLength)
    println("======================================")
    menu()
}
fun kerucut() {
    println("================================");
    print("Masukan Tinggi Kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukan Jari-jari Kerucut : ");
    val jari: Double = input.nextDouble();

    val v: Double = (0.33333) * Math.PI * (jari * jari) * tinggi;
    println("================================");
    print("Volume kerucut adalah = ");
    System.out.printf("%.2f", v);
    println()
    println("================================");

}
fun tabung() {
    println("================================");
    print("Masukan Tinggi tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = Math.PI * jari * jari * tinggi;
    println("================================");
    print("Volume tabung adalah = ")
    System.out.printf("%.2f", v);
    println()

}
fun menu() {
    println("Pilih Bangun Ruang")
    println("1.Kerucut")
    println("2.Tabung")
    println("3.Cancel")
    print("Pilih Menu Bangun Ruang : ")
    val pilih: Int? = input.nextInt()
    when (pilih) {
        1 -> {
            kerucut()
        }
        2 -> {
            tabung()
        }
        3 -> {
            println("Menu Canceled")
            }
        }
    }


