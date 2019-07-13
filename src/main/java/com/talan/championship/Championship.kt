package com.talan.championship

data class Championship(val title: String,
                        val athletes: List<Athlete> = emptyList())