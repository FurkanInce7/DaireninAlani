import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r, aci;
        double pi=3.14, alan;

        Scanner inp= new Scanner(System.in);
        System.out.println("Lutfen Dairenin Yaricapini Giriniz: " );
        r= inp.nextInt();
        System.out.println("Lutfen Daire Diliminin Acisini Giriniz: ");
        aci= inp.nextInt();

        alan= (pi* (r *r)* aci)/360;
        System.out.println("Daire Diliminin Alani: "+alan);



    }
}
