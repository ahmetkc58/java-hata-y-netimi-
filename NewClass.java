/*
 bu programı yazmamızın nedeni hata yönetimi hakkında bilgi edinmek ve java da dışarıdan gelen verileri kulanabilmek 
programın amacı txt dosyasında bulunan sayıları toplamak 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 throws FileNotFoundException yazmamızın nedeni bu hatayı karşı taraf alacağımızı bilsin diye y


hata alacağımız kesin ya brada try catch şeklinde hata yönetimini kulanman gerek 
throws yazmamızın nedeni bu classı kulanan kişi try catch kulanması gerekecek 
 */
 /*
ıoException yapmamızın nedeni finally de dosyayı kapatma komutu verdik eğer dosya bulunamaz ve açamazsak dosyayı kapatamayız o yüzden yaptık
 */
public class NewClass {

    public static void main(String[] args) {//throws IOException {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("a.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) { // eğer bulunduğu satırda bir değer varsa true değeri döndürür   line null değise bu çalışır                
                total += Integer.valueOf(line);//herhangi bir değeri ınteger değerine çevirmek için kulanırız 
            }
            System.out.println("toplam =" + total);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {

            }
        }

    }
}
