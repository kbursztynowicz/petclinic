package kb.springlessons.petclinic.services;

import kb.springlessons.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
