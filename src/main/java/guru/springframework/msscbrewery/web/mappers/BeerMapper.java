package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDtoV2 beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDtoV2 beerDto);
}
