package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoAvroSerializationApplication

fun main(args: Array<String>) {
    runApplication<DemoAvroSerializationApplication>(*args)
}