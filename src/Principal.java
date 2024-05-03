package src;

import java.util.Scanner;
import src.model.Movie;
import src.model.Serie;

public class Principal {
    public void showMenu(){
        int option = 0;

        Scanner keyboard = new Scanner(System.in);

        while (option != 9) {
            String menu = """
                    Bienvenido/a a Screenmatch:
                    1) Registrar nueva película.
                    2) Registrar nueva serie.
                    9) Salir.
                    """;
            System.out.println(menu);
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre de la Película: ");    
                    String name = keyboard.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la Película: ");
                    int releaseDate = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Ingrese la duración en minutos de la Película: ");
                    int durationTimeInMinutes = Integer.parseInt(keyboard.nextLine());
                    Movie userMovie = new Movie();
                    userMovie.setName(name);
                    userMovie.setReleaseDate(releaseDate);
                    userMovie.setDurationTimeInMinutes(durationTimeInMinutes);
                    userMovie.showTechnicFile();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la Serie: ");    
                    String name2 = keyboard.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la Serie: ");
                    int releaseDate2 = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Ingrese la duración en minutos de la Serie: ");
                    int durationTimeInMinutes2 = Integer.parseInt(keyboard.nextLine());
                    Serie userSerie = new Serie();
                    userSerie.setName(name2);
                    userSerie.setReleaseDate(releaseDate2);
                    userSerie.setDurationTimeInMinutes(durationTimeInMinutes2);
                    userSerie.showTechnicFile();
                    break;
                case 9:
                    System.out.println("Gracias por utilizar Screenmatch");
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
