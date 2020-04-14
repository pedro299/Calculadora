/* Esta es una prueba de comentario editado*/
// Comentario añadido desde el directorio local
// rama 1

package testeadordados;

import java.util.Scanner;

public class TesteadorDados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = b = c = d = e = f = 0;
        int n;
        int aux = 0;
        System.out.println("Veces del test");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            aux = scan.nextInt();
            if (aux == 1) {
                a++;
            } else if (aux == 2) {
                b++;
            } else if (aux == 3) {
                c++;
            } else if (aux == 4) {
                d++;
            } else if (aux == 5) {
                e++;
            } else f++;
        }
        
        System.out.println("Uno: "+a);
        System.out.println("Dos: "+b);
        System.out.println("Tres: "+c);
        System.out.println("Cuatro: "+d);
        System.out.println("Cinco: "+e);
        System.out.println("Seis: "+f);
    }

}
