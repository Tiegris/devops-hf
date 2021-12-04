package hu.bme.mit.ftsrg.canary_be.dal

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDate

interface NameDayRepository : JpaRepository<NameDay, Int> {

    fun getFirstByDateAfter(date: LocalDate): NameDay

}