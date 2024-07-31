import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            int opcion = 0;
            do {
                System.out.println("-------------BIBILIOTECA VIRTUAL---------------");
                System.out.println("1.Usuarios");
                System.out.println("2.Libros");
                System.out.println("3.Prestamos");
                System.out.println("4.Salir");
                System.out.println("Digite una opcion");

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        biblioteca libroharry = new biblioteca();
                        libroharry.setTitulo("Harry Potter");
                        libroharry.setAutor("J.K. Rowling");
                        libroharry.setEditorial("Piedra Santa");
                        libroharry.setAnoPublicacion(2004);
                        libroharry.setPaginas(1999);
                        libroharry.greet();
                        break;
                    case 2:
                        USUARIO cliente = new USUARIO();
                        cliente.setnombre("Jose");
                        cliente.setapellido("Oliva");
                        cliente.setcorreo("jgfoliva10@gmail.com");
                        cliente.setedad(20);
                        cliente.setnit(2020020);
                        cliente.greet();
                        break;
                    case 3:
                        prestamos prest = new prestamos();
                        prest.setUsuprestamo("Jose");
                        prest.setFecha_devolucion("3/3/24");
                        prest.setFecha_prestamo("10/4/24");
                        prest.greet();
                        break;
                    case 4:

                        System.out.println("Adios");
                        break;
                }
            }while (opcion != 4) ;


        }


    }







