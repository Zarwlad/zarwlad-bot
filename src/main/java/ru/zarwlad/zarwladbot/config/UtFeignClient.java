package ru.zarwlad.zarwladbot.config;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "utFeignClient", url = "${zarwlad.utbot.ut.host:}")
public interface UtFeignClient {
}
