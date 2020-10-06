// Built from tag v3.6.0-rc-1

package no.fint.model.resource.arkiv.kodeverk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class SkjermingshjemmelResources extends AbstractCollectionResources<SkjermingshjemmelResource> {

    public SkjermingshjemmelResources(Collection<SkjermingshjemmelResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<SkjermingshjemmelResource>> getTypeReference() {
        return new TypeReference<List<SkjermingshjemmelResource>>() {};
    }
}