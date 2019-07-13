package com.talan.championship

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ChampionshipService {

    @Autowired
    private lateinit var athleteStore: AthleteStore

    private val allChampionships = listOf(Championship(title = "UFC"), Championship(title = "ONE"), Championship(title = "BELLATOR"))

    fun getAllChampionship(): List<Championship> {
        val championships = allChampionships.map {
            it.copy(
                    title = it.title,
                    athletes = athleteStore.getAthletesBy(it.title)
            )
        }

        return championships
    }
}