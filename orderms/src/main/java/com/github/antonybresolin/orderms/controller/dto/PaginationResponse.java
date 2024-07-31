package com.github.antonybresolin.orderms.controller.dto;

public record PaginationResponse(Integer page,
                                 Integer size,
                                 Integer totalPages,
                                 Integer totalElements) {
}
