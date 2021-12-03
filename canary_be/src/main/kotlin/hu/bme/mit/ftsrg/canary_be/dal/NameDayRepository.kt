package hu.bme.mit.ftsrg.canary_be.dal

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface NameDayRepository : JpaRepository<NameDay, Int> {

//    @Query("SELECT e FROM NameDay e")
//    fun getAll()
//
//    override fun deleteById(id: Int)
//
//    fun

}