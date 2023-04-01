import java.util.Scanner;

public class kategoribuku {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Input Judul Buku");
String judulBuku = input.nextLine();

System.out.println("Input Nama Pengarang");
String pengarang = input.nextLine();

System.out.println("Input Nama Penerbit");
String penerbit = input.nextLine();

System.out.println("Input Tahun Terbit");
int tahunTerbit = input.nextInt();

// Variable untuk kategori buku
String kategoriBuku = "";

// Membuat stack untuk menentukan kategori buku
Stack<String> kategori = new Stack<>();

// Push element ke stack
kategori.push("Buku Lainnya");
kategori.push("Buku Fiksi");
kategori.push("Buku Manajemen");
kategori.push("Buku Teknik");
kategori.push("Buku Lama");

if (tahunTerbit < 2010) {
kategoriBuku = kategori.pop();
}
else if (judulBuku.contains("Teknik")) {
kategoriBuku = kategori.pop();
}
else if (judulBuku.contains("Manajemen")) {
kategoriBuku = kategori.pop();
}
else if (judulBuku.contains("Fiksi")) {
kategoriBuku = kategori.pop();
}
else {
kategoriBuku = kategori.pop();
}

System.out.println("Judul buku: " + judulBuku);
System.out.println("Nama pengarang: " + pengarang);
System.out.println("Nama penerbit: " + penerbit);
System.out.println("Tahun terbit: " + tahunTerbit);
System.out.println("Kategori buku: " + kategoriBuku);
}
}