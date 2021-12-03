package hu.bme.mit.ftsrg.canary_be.dal

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class NameDay(
    @Id @GeneratedValue val id: Int?,
    val date: LocalDate,
    val name: String,
)
