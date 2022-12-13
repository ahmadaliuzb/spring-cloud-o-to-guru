package uz.akhmad.akhmad.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.akhmad.akhmad.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerStyle("Pele Ale")
                .build();

    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo beerni yangilash
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting beer...");
    }
}
