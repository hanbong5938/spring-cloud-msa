package xyz.gorani.springcloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
class SpringCloudConfigServerApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudConfigServerApplication>(*args)
}
