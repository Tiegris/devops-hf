package hu.bme.mit.ftsrg.canary_be

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CanaryBeApplication

fun main(args: Array<String>) {
	runApplication<CanaryBeApplication>(*args)
}
