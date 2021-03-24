package ASD2MODUL2;
public class nomer2 {
    public static void main(String[] args){
        System.out.println("Nama : Adhen Kurdi");
        System.out.println("Nim : 20090058");
        int[][] matriks_a = {
            {10,11},
            {12,13},
            {14,15}
        };
        int[][] matriks_b = {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] hasilTambah = new int[matriks_a.length][matriks_a[0].length];
        if (matriks_a.length == matriks_b.length && matriks_a[0].length == matriks_b[0].length){
            for (int i=0; i<matriks_a.length; i++){
                for (int j=0; j<matriks_a[0].length; j++){
                hasilTambah[i][j] = matriks_a[i][j] - matriks_b[i][j];
                System.out.print(hasilTambah[i][j]+" ");
                }
            System.out.println();
            }
        }
        else{
            System.out.print("Baris dan kolom matriks tidak sama");
        }
    }
}
//AdhenKurdi
