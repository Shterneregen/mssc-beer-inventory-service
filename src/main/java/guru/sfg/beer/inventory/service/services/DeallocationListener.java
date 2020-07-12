package guru.sfg.beer.inventory.service.services;

import guru.sfg.beer.inventory.service.config.JmsConfig;
import guru.sfg.brewery.model.events.DeallocateOrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DeallocationListener {

	private final AllocationService allocationService;

	@JmsListener(destination = JmsConfig.DEALLOCATE_ORDER_QUEUE)
	public void listen(DeallocateOrderRequest request) {
		allocationService.deallocateOrder(request.getBeerOrderDto());
	}
}
