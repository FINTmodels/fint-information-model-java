package no.fint.model.resource.felles.kodeverk.iso;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class SprakResources extends AbstractCollectionResources<SprakResource> {

    public SprakResources(Collection<SprakResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<SprakResource>> getTypeReference() {
        return new TypeReference<List<SprakResource>>() {};
    }
}
