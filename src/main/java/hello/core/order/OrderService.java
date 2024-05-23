package hello.core.order;

import org.apache.commons.logging.Log;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
