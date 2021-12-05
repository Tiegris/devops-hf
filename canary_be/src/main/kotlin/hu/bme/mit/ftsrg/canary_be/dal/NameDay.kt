package hu.bme.mit.ftsrg.canary_be.dal

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class NameDay(
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Id     
    //@GeneratedValue
    val id: Int?,
    val date: LocalDate,
    val name: String,
)
