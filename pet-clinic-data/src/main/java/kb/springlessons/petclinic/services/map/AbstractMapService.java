package kb.springlessons.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected HashMap<ID, T> mapService = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(mapService.values());
    }

    T findById(ID id) {
        return mapService.get(id);
    }

    T save(ID id, T object) {
        mapService.put(id, object);
        return object;
    }

    void deleteById(ID id) {
        mapService.remove(id);
    }

    void delete(T object) {
        mapService.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }
}
