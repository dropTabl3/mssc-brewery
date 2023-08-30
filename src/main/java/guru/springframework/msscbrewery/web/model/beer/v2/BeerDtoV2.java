package guru.springframework.msscbrewery.web.model.beer.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    private UUID id;
    private String beerName;
    private BeerStylEnum beerStyle;
    private Long upc;
}
