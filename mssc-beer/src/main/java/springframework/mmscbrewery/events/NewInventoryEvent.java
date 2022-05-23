package springframework.mmscbrewery.events;

import lombok.NoArgsConstructor;
import springframework.mmscbrewery.web.model.BeerDto;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
