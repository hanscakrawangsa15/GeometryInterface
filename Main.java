import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // scaGeometryFrame()nner untuk inputan user
        Scanner sc = new Scanner(System.in);
        String repeat;
        // looping untuk mengulang program
        do{
            System.out.println("Selamat datang di Kalkulator Geometri 2D, ada yang bisa gua bantu bro?");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("Pilih bentuk geometri yang akan dihitung:");
            int n = sc.nextInt();
            // rumus untuk menghitung luas dan keliling pada persegi
            if (n == 1){
                System.out.println("Masukkan panjang sisi persegi:");
                double sisi = sc.nextDouble();
                Square persegi = new Square(sisi);
                System.out.println("Luas persegi: " + persegi.area());
                System.out.println("Keliling persegi: " + persegi.perimeter());
                SquareFrame sq = new SquareFrame();
                sq.setVisible(true);
            }
            // rumus untuk menghitung luas dan keliling pada persegi panjang
            else if (n == 2){
                System.out.println("Masukkan panjang persegi panjang:");
                double length = sc.nextDouble();
                System.out.println("Masukkan lebar persegi panjang:");
                double width = sc.nextDouble();
                Rectangle persegipanjang = new Rectangle(length, width);
                System.out.println("Luas persegi panjang : " + persegipanjang.area());
                System.out.println("Keliling persegi panjang : " + persegipanjang.perimeter());
                RectangleFrame rect = new RectangleFrame();
                rect.setVisible(true);
            }
            // rumus untuk menghitung luas dan keliling pada segitiga
            else if (n == 3){
                System.out.println("Masukkan panjang sisi pertama segitiga:");
                double side1 = sc.nextDouble();
                System.out.println("Masukkan panjang sisi kedua segitiga:");
                double side2 = sc.nextDouble();
                System.out.println("Masukkan panjang sisi ketiga segitiga:");
                double side3 = sc.nextDouble();
                Triangle segitiga = new Triangle(side1, side2, side3);
                System.out.println("Luas segitiga : " + segitiga.area());
                System.out.println("Keliling segitiga : " + segitiga.perimeter());
                TriangleFrame tr = new TriangleFrame();
                tr.setVisible(true);
            }
            // rumus untuk menghitung luas dan keliling pada lingkaran
            else if (n == 4){
                System.out.println("Masukkan panjang jari-jari lingkaran:");
                double radius = sc.nextDouble();
                Circle lingkaran = new Circle(radius);
                System.out.println("Luas lingkaran : " + lingkaran.area());
                System.out.println("Keliling lingkaran : " + lingkaran.perimeter());
                CircleFrame cir = new CircleFrame();
                cir.setVisible(true);
            }
            // jika user memasukkan inputan yang salah
            else {
                System.out.println("Yang bener aja Syntax Error bro");
            }
            // jika user ingin mengulang program
            System.out.println("Mau hitung lagi, bro?(Yes/No)");
            repeat = sc.next();
            // jika user ingin mengulang program
        }while (repeat.equalsIgnoreCase("Yes"));
        // jika user tidak ingin mengulang program
        System.out.println("Terimakasih ya broo sudah menggunakan kalkulator ini, see you:)");
        sc.close();


    }
}