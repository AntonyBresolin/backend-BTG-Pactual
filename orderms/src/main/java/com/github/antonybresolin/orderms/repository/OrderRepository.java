package com.github.antonybresolin.orderms.repository;

import com.github.antonybresolin.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long>{
}
