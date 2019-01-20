package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepo extends CrudRepository <Album,Integer> {
    List <Album> findAll();
}
