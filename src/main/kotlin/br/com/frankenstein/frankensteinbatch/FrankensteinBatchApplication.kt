package br.com.frankenstein.frankensteinbatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FrankensteinBatchApplication

fun main(args: Array<String>) {
    runApplication<FrankensteinBatchApplication>(*args)
}
