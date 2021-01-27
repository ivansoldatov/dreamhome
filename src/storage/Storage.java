package storage;

public interface Storage {
    void clear();

    void update();

    void save();

    get();

    void delete(String uuid);

    getAll();

    int size();

}
