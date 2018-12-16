package hello;

public class Artist {

    public long id;
    public String Name;

    public Artist() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
