
package tallerpoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @version 1.00.000 2022-02-18
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 * @since 1.00.000 2022-02-18
 */
public class Library {
    private ArrayList<Song> library = new ArrayList<>();

    /**
     * Constructor sin parametros de la clase libreria.
     */
    public Library() {
    }
    
    /**
     * Se añade una nueva canción a la libreria.
     * @param song 
     */
    public void addSong(Song song){
        library.add(song);
    }

    public ArrayList<Song> getLibrary() {
        return library;
    }
    
    /**
     * Filtrar la libreria por genero.
     * @param genre
     * @return libreria filtrada por genero.
     */
    public ArrayList<Song> filterGenre(String genre){
        /**
         * Se crea una nueva libreria que estar+a filtrada
         */
        ArrayList<Song> filterLibrary = new ArrayList<>();
        
        /**
         * Ciclo foreach para recorrer la libreria principal
         */
        for (Song song : library) {    
            /**
             * Se evaluan las diferentes caciones,y si los generos coinciden
             * se añade a la nueva libreria.
             */
            if(song.getGenre().equals(genre)){
                filterLibrary.add(song);
            }        
        }
        
        return filterLibrary;
    }
    
    /**
     * Filtrar la libreria por año.
     * @param year
     * @return libreria filtrada por año.
     */
    public ArrayList<Song> filterYear(String year){
        /**
         * Se crea una nueva libreria que estar+a filtrada
         */
        ArrayList<Song> filterLibrary = new ArrayList<>();
        
        /**
         * Variable para almacenar la división de la fecha.
         */
        String[] splitDate;
        
        /**
         * Ciclo foreach para recorrer la libreria principal
         */
        for (Song song : library) {    
            /**
             * Se evaluan las diferentes caciones,y si los años coinciden
             * se añade a la nueva libreria.
             */
            splitDate = song.getDate().split("-");
            
            /**
             * Se separa el String date de acuerdo al formato, en la posición 0
             * se encontraría el año.
             */
            if(splitDate[0].equals(year)){
                filterLibrary.add(song);
            }        
        }
        
        return filterLibrary;
    }

}
