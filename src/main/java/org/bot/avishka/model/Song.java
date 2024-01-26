package org.bot.avishka.model;

// Song.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "songs")
public class Song {

    @Id
    private String songID;
    private String songSearch;

    private String songName;

    @DBRef
    private Artist artist;

    private String songLink;
    private String sdLink;


    // Constructors, getters, setters, etc.

    // Other fields and methods...

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getSongLink() {
        return songLink;
    }

    public void setSongLink(String songLink) {
        this.songLink = songLink;
    }

    public String getSongSearch() {
        return songSearch;
    }

    public void setSongSearch(String songSearch) {
        this.songSearch = songSearch;
    }

    public String getSdLink() {
        return sdLink;
    }

    public void setSdLink(String sdLink) {
        this.sdLink = sdLink;
    }
}
