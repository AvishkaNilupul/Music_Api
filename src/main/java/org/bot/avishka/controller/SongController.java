package org.bot.avishka.controller;

// SongController.java
import org.bot.avishka.model.Song;
import org.bot.avishka.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/by-artist/{artistId}")
    public List<Song> getSongsByArtist(@PathVariable String artistId) {
        return songService.getSongsByArtist(artistId);
    }

    @GetMapping("/by-artist-name/{artistName}")
    public List<Song> getSongsByArtistName(@PathVariable String artistName) {
        return songService.getSongsByArtistName(artistName);
    }

    @GetMapping("/by-song-name/{songName}")
    public List<Song> getSongsBySongName(@PathVariable String songName) {
        return songService.getSongsBySongName(songName);
    }
}
