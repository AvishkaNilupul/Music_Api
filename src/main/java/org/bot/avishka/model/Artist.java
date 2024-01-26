package org.bot.avishka.model;

// Artist.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "artists")
public class Artist {

    @Id
    private String artistId;

    private String artistName;

    // You can store songs directly in the artist document if you prefer, or use @DBRef as done in Song entity
    private List<Song> songs;

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

// Constructors, getters, setters, etc.

    // Other fields and methods...
}
