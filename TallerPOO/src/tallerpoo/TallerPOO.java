
package tallerpoo;


import java.util.ArrayList;
/**
 * libreria utilizada para ordenar.
 */
import java.util.Collections;
/**
 * libreria utilizada para ordenar.
 */
import java.util.Comparator;
import java.util.Scanner;

/**
 * Taller de buenas practicas de programación orientada a objetos para la 
 * cantera nivel 2 de softka university
 * 
 * @version 1.00.000 2022-02-18
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class TallerPOO {

    public static void main(String[] args) {
        /**
         * Variable para leer entradas por consola
         */
        Scanner read = new Scanner(System.in);
        Library library = new Library();
        Song newSong;
        Playlist newPlaylist;
        String title = null;
        String id = null;
        String date = null;
        String duration = null;
        String genre = null;
        String cover = null;
        String description = null;
        String idSongPlaylist = null;
        boolean songFound = false;
        int option = 0;
        int option2 = 0;
        
        do {
            /**
             * Impresión del menú
             */
            System.out.println("1.Agregar nueva canción");
            System.out.println("2.Crear nueva playlist");
            System.out.println("3.Mostrar libreria");
            System.out.println("4.Filtrar por año");
            System.out.println("5.Filtrar por genero");
            System.out.println("6.Ordenar por duración");
            System.out.println("7.Ordenar por fecha");
            System.out.println("0.Salir");
            option = read.nextInt();
            
            /**
             * Se ejecuta un case, dependiendo de la opción seleccionada.
             */
            try{
                switch (option) {               
                    case 1:
                        /**
                         * Se piden los datos necesarios para crear una canción.
                         */
                        System.out.println("Titulo de la canción: ");
                        title = read.next();
                        System.out.println("Identificador de la canción: ");
                        id = read.next();
                        System.out.println("Fecha de la canción (aaaa-dd-mm): ");
                        date = read.next();
                        System.out.println("Duracion de la cacnción (mm:ss): ");
                        duration = read.next();
                        System.out.println("Genero de la canción: ");
                        genre = read.next();
                        System.out.println("Caratula de la canción: ");
                        cover = read.next();
                        System.out.println("Descripcion de la canción: ");
                        description = read.next();

                        /**
                         * Se crea la nueva canción.
                         */
                        newSong = new Song(title, id, date, duration, genre, cover, description);
                        library.addSong(newSong);
                        break;
                    case 2:
                        System.out.println("Nombre de la playlist");
                        newPlaylist = new Playlist(read.next());

                        /**
                         * Menú para añadir tantas canciones como se desee.
                         */
                        do {
                            System.out.println("1.Añadir canción a la playlist");
                            System.out.println("0.Salir");
                            option2 = read.nextInt();

                            try{
                                switch (option2) {
                                    case 1:
                                        /**
                                         * Las canciones se añadirán de acuerdo a su ID.
                                         */
                                        System.out.println("Id de la canción");
                                        idSongPlaylist = read.next();

                                        /**
                                         * Se verifica que la canción esté dentro de la libreria,
                                         * de ser así es añadida.
                                         */
                                        for (Song song : library.getLibrary()) {
                                            if (song.getId().equals(idSongPlaylist)) {
                                                newPlaylist.addSong(song);
                                                songFound = true;
                                            }
                                        }
                                        /**
                                         * Se muestra un mensaje dependiendo de si la canción fue encontrada o no.
                                         */
                                        if (songFound) {
                                            System.out.println("Canción añadida con exito");
                                        }else{
                                            System.out.println("Canción no encontrada");
                                        }
                                        break;
                                    case 0:
                                        System.out.println("Saliendo de creación de playlist.");
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            }catch(AssertionError exc){
                                System.out.println("opción incorrecta");
                            }
                        } while (option2!=0);

                        break;
                    case 3:
                        /**
                         * Se muestra la libreria de canciones, utilizando un foreach para recorrer 
                         * el arreglo de canciones almacenado en la clase library.
                         */
                        for (Song song : library.getLibrary()) {
                            System.out.println("\nTitulo : "+song.getTitle()+"\n Id : " +song.getId()+
                                    "\nFecha : "+song.getDate()+"\nDuracion : "+song.getDuration()+
                                    "\nGenero : "+song.getGenre()+"\nCaratula : "+song.getCover()+
                                    "\nDescripcion : "+song.getDescription());
                        }
                        break;
                    case 4:
                        /**
                         * Se se captura el año que se desea visualizar.
                         */
                        System.out.println("Año que desea ver");
                        /**
                         * Se crea un nuevo arrayList que almacenará la libreria filtrada por año.
                         */
                        ArrayList<Song> yearLibrary = library.filterYear(read.next());
                        /**
                         * Se muestra el nuevo arrayList, con las canciones filtradas por año.
                         */
                        for (Song song : yearLibrary) {
                            System.out.println("\nTitulo : "+song.getTitle()+"\n Id : " +song.getId()+
                                    "\nFecha : "+song.getDate()+"\nDuracion : "+song.getDuration()+
                                    "\nGenero : "+song.getGenre()+"\nCaratula : "+song.getCover()+
                                    "\nDescripcion : "+song.getDescription());
                        }
                        break;
                    case 5:
                        /**
                         * Se captura el genero que se desea visualizar.
                         */
                        System.out.println("Genero que desea ver");
                        /**
                         * Se crea un nuevo arrayList que almacenará la libreria filtrada por genero.
                         */
                        ArrayList<Song> genreLibrary = library.filterGenre(read.next());
                        /**
                         * Se muestra el nuevo arrayList, con las canciones filtradas por genero.
                         */
                        for (Song song : genreLibrary) {
                            System.out.println("\nTitulo : "+song.getTitle()+"\n Id : " +song.getId()+
                                    "\nFecha : "+song.getDate()+"\nDuracion : "+song.getDuration()+
                                    "\nGenero : "+song.getGenre()+"\nCaratula : "+song.getCover()+
                                    "\nDescripcion : "+song.getDescription());
                        }
                        break;
                    case 6:
                        /**
                         * Se crea un nuevo arrayList que almacenará la libreria ordenada por duracion.
                         */
                        ArrayList<Song> sortLibraryDuration = library.getLibrary();
                        /**
                         * Se utilizan las librerias collections y comparator para ordenar la nueva libreria.
                         */
                        Collections.sort(sortLibraryDuration, new Comparator<Song>(){
                            @Override
                            public int compare (Song s1, Song s2){
                                return new Integer(s1.getDurationInt()).compareTo(s2.getDurationInt());
                            }
                        });
                        /**
                         * Se muestra la libreria ordenada por duración.
                         */
                        for (Song song : sortLibraryDuration) {
                            System.out.println("\nTitulo : "+song.getTitle()+"\n Id : " +song.getId()+
                                    "\nFecha : "+song.getDate()+"\nDuracion : "+song.getDuration()+
                                    "\nGenero : "+song.getGenre()+"\nCaratula : "+song.getCover()+
                                    "\nDescripcion : "+song.getDescription());
                        }
                        break;
                    case 7:
                        /**
                         * Se crea un nuevo arrayList que almacenará la libreria ordenada por fecha.
                         */
                        ArrayList<Song> sortLibraryDate = library.getLibrary();
                        /**
                         * Se utilizan las librerias collections y comparator para ordenar la nueva libreria.
                         */
                        Collections.sort(sortLibraryDate, new Comparator<Song>(){
                            @Override
                            public int compare (Song s1, Song s2){
                                return new Integer(s1.getDateInt()).compareTo(s2.getDateInt());
                            }
                        });
                        /**
                         * Se muestra la libreria ordenada por fecha.
                         */
                        for (Song song : sortLibraryDate) {
                            System.out.println("\nTitulo : "+song.getTitle()+"\n Id : " +song.getId()+
                                    "\nFecha : "+song.getDate()+"\nDuracion : "+song.getDuration()+
                                    "\nGenero : "+song.getGenre()+"\nCaratula : "+song.getCover()+
                                    "\nDescripcion : "+song.getDescription());
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo");
                        break;
                    default:
                        throw new AssertionError();
                }
            }catch(AssertionError exc){
                System.out.println("opción incorrecta");
            }
        } while (option!=0);
        
    }
    
}
