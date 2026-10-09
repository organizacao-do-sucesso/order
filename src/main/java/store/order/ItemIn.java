package store.order;

import lombok.Builder;

@Builder
public record ItemIn(
    String idProduct,
    Integer quantity
) {}
