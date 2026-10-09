package store.order;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record ItemOut(
    String id,
    ProductRef product,
    Integer quantity,
    BigDecimal total
) {}
