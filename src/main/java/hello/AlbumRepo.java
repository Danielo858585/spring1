package hello;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepo extends CrudRepository <Album,Long> {
}
