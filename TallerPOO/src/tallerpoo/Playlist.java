
package tallerpoo;

import java.util.ArrayList;

/**
 * Clase Playlist donde se guardan diferentes canciones
 *
 *   Playlist nuevaPlaylist = new Playlist(name)
 *   nuevaPlaylist.addSong(nuevaCancion)
 *
 * @version 1.00.000 2022-02-18
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 * @since 1.00.000 2022-02-18
 */
public class Playlist {
    private String name;
    private ArrayList<Song> playlist;

    /**
     * Constructor sin parametros de la clase playlist.
     */
    public Playlist() {
    }
    
    
    /**
     * Constructor del objeto playlist, este recibe un nombre como parametro.
     * @param name 
     */
    public Playlist(String name) {
        this.name = name;
    }
    
    /**
     * Metodo para añadir canciones a la playlist.
     * @param song 
     */
    public void addSong(Song song){
        playlist.add(song);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }
    
    
}
