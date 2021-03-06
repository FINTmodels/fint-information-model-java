package no.fint.model.arkiv.noark;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Arkivressurs implements FintMainObject {
    public enum Relasjonsnavn {
            PERSONALRESSURS,
            AUTORISASJON,
            TILGANG
    }

    private @Valid Identifikator kildesystemId;
    private @Valid Identifikator systemId;
}
