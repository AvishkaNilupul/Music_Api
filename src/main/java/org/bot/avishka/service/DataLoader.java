package org.bot.avishka.service;

import org.bot.avishka.model.Artist;
import org.bot.avishka.model.Song;
import org.bot.avishka.repositry.ArtistRepository;
import org.bot.avishka.repositry.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private SongRepository songRepository;

    @Override
    public void run(String... args) {
        // Clear existing data
        // artistRepository.deleteAll();  // Comment out or remove this line to keep existing artists
        // songRepository.deleteAll();    // Comment out or remove this line to keep existing songs

         //Find or create artist Ariana
//        Artist artist = artistRepository.findByArtistName("Tom Fate");
//        if (artist == null) {
//            artist = new Artist();
//            artist.setArtistName("Tom Fate");
//            artistRepository.save(artist);
//        }
//
//
//        // Create or update another song for Ariana
//        Song newSong = songRepository.findByNameAndArtist("Unstable", artist);
//        if (newSong == null) {
//            newSong = new Song();
//            newSong.setSongName("Unstable");
//            newSong.setSongLink("https://i1.sndcdn.com/artworks-FW8viC9W7pwZPLof-U2kpRA-t500x500.jpg");
//            newSong.setArtist(artist);
//            newSong.setSongSearch("unstable");
//            newSong.setSdLink("https://cdn.discordapp.com/attachments/981804109868970036/1193812495102660678/Unstable.mp3?ex=65ae1386&is=659b9e86&hm=ac9ae84329ab8d80975447f72d79ca3543958ba757ad3421557a19946ee31cf1&");
//        }
//
//        songRepository.saveAll(Arrays.asList( newSong));
    }


}
