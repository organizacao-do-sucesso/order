package store.order;

import lombok.Builder;

@Builder
public record ProductRef(
    String id
) {}
