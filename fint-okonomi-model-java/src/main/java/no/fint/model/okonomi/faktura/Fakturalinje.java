package no.fint.model.okonomi.faktura;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fakturalinje implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            VARE
    }

    @NotNull
    private Float antall;
    private List<String> fritekst;
    @NotNull
    private Long pris;
}
