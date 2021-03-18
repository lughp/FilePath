package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // somente o nome do arquivo e despreza o caminho
        System.out.println("getParent: " + path.getParent()); // somente o caminho do diretório
        System.out.println("getPath: " + path.getPath()); // caminho completo

        sc.close();
    }
}
