package xyz.gorani.springcloudeurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class SpringCloudEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaServerApplication>(*args)
}
