
package tallerpoo;


/**
 * Clase canción, este objeto será almacenado en bibliotecas y playlist
 
  Song nuevaCancion = new Song(title, id, date, duration, genre, cover,
                               description);
 * 
 * @version 1.00.000 2022-02-18
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 * @since 1.00.000 2022-02-18
 */
public class Song {
    private String title;
    private String id;
    private String date;
    private String duration;
    private String genre;
    private String cover;
    private String description;

    /**
     * Constructor sin parametros de la clase canción.
     */
    public Song() {
    }        
    
    /**
     * Constructor de la clase canción, recibe diferentes parametros.
     * 
     * @param title
     * @param id
     * @param date
     * @param duration
     * @param genre
     * @param cover
     * @param description 
     */
    public Song(String title, String id, String date, String duration, String 
            genre, String cover, String description) 
    {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    /**
     * 
     * @return Devuelve la fecha como un entero
     */
    public int getDateInt() {
        String[] splitDate = date.split("-");
        String dateSplited = splitDate[0]+splitDate[1]+splitDate[2];
        int dateInt = Integer.parseInt(dateSplited);
        return dateInt;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @return devuelve la duración como un entero
     */
    public int getDurationInt() {
        String[] splitDuration = duration.split(":");
        String durationSplited = splitDuration[0]+splitDuration[1];
        int durationInt = Integer.parseInt(durationSplited);
        return durationInt;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
