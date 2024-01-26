package org.bot.avishka.repositry;

// SongRepository.java
import org.bot.avishka.model.Artist;
import org.bot.avishka.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SongRepository extends MongoRepository<Song, String> {

    List<Song> findByArtistArtistId(String artistId);

    @Query("{'songSearch': { $regex: ?0, $options: 'i' }}")
    List<Song> findBySongName(String songName);

    @Query("{'songName': ?0, 'artist': ?1}")
    Song findByNameAndArtist(String songName, Artist artist);
}


