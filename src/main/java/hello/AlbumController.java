package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlbumController {

    @Autowired
    public AlbumRepo albumRepo;

    @GetMapping("/album")
    public String albumForm(Model model){
        long ilosc = albumRepo.count();
        model.addAttribute("album", new Album());
        model.addAttribute("user", new User());
        model.addAttribute("ilosc",ilosc);
        return "album";
    }

    @PostMapping("/album")
    public String albumSubmit (@ModelAttribute Album album, Model model){
        System.out.print(album.toString());
        Album album1 = new Album();
        album1.setName(album.getName());
        album1.setArtist(album.getArtist());
        albumRepo.save(album);
        long ilosc = albumRepo.count();
        System.out.println("Ilosc encji w bazie - " + ilosc);
        model.addAttribute("albums", albumRepo.findAll());

        return "result";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable <Album> getAllAlbums(){
        return albumRepo.findAll();
    }


}
