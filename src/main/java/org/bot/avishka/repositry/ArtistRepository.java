package org.bot.avishka.repositry;

// ArtistRepository.java
import org.bot.avishka.model.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository<Artist, String> {
    Artist findByArtistName(String artistName);
}
