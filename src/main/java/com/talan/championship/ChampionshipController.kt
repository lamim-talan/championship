package com.talan.championship

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChampionshipController {
    private val logger: Logger = LoggerFactory.getLogger(ChampionshipController::class.java)

    @Autowired
    private lateinit var championshipService: ChampionshipService

    @GetMapping("/")
    fun getAllChampionships(): ResponseEntity<List<Championship>> {
        logger.info("**************** Accessing all Championships ****************")
        return ResponseEntity.ok(championshipService.getAllChampionship())
    }

}
