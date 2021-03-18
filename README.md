# Informações do caminho do arquivo

### File - Representação abstrata de um arquivo e seu caminho
* https://docs.oracle.com/javase/10/docs/api/java/io/File.html

### Scanner - Leitor de texto
* https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html


```java
import java.io.File;
import java.util.Scanner;

public class Program {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
	  
      System.out.println("Enter a folder path: ");
      String strPath = sc.nextLine();
	  
      File path = new File(strPath);
	  
      System.out.println("getPath: " + path.getPath());
      System.out.println("getParent: " + path.getParent());
      System.out.println("getName: " + path.getName());
	  
      sc.close();
   }
}
```