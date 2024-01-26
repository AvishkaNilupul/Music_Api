package org.bot.avishka.service;

// SongService.java
import org.bot.avishka.model.Artist;
import org.bot.avishka.model.Song;
import org.bot.avishka.repositry.ArtistRepository;
import org.bot.avishka.repositry.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private ArtistRepository artistRepository;

    public List<Song> getSongsByArtist(String artistId) {
        return songRepository.findByArtistArtistId(artistId);
    }

    public List<Song> getSongsByArtistName(String artistName) {
        Artist artist = artistRepository.findByArtistName(artistName);
        if (artist != null) {
            return songRepository.findByArtistArtistId(artist.getArtistId());
        }
        return null;
    }

    public List<Song> getSongsBySongName(String songName) {
        return songRepository.findBySongName(songName);
    }
}
