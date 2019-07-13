package com.talan.championship

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("athlete")
interface AthleteStore {

    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/{championship}")
    fun getAthletesBy(@PathVariable("championship") championship: String): List<Athlete>

}