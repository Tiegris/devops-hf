package hu.bme.mit.ftsrg.canary_be.domain

import java.time.LocalDate

data class NameDayRequest(val date: LocalDate, val name: String)

data class NameDayResponse(val id: Int, val date: LocalDate, val name: String)
