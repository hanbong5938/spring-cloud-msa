package xyz.gorani.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class GatewayServerApplication

fun main(args: Array<String>) {
    runApplication<GatewayServerApplication>(*args)
}
