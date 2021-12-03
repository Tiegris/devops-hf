package hu.bme.mit.ftsrg.canary_be.controllers

import hu.bme.mit.ftsrg.canary_be.dal.NameDay
import hu.bme.mit.ftsrg.canary_be.dal.NameDayRepository
import hu.bme.mit.ftsrg.canary_be.domain.NameDayRequest
import hu.bme.mit.ftsrg.canary_be.domain.NameDayResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/nameday")
class NameDayController(
    @Autowired val repository: NameDayRepository
) {
    @GetMapping()
    fun read(): ResponseEntity<List<NameDayResponse>> {
        val data = repository.findAll().map { NameDayResponse(it.id!!, it.date, it.name) }
        return ResponseEntity.ok(data)
    }

    @PostMapping()
    fun create(@RequestBody body: NameDayRequest): ResponseEntity<NameDay> {
        val data = body.let { NameDay(null, it.date, it.name) }
        val saved = repository.save(data)
        return created(saved)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): ResponseEntity<Void> {
        return try {
            repository.deleteById(id)
            ResponseEntity.ok().build()
        } catch (e: EmptyResultDataAccessException) {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping("/next")
    fun next(): ResponseEntity<Void> {
        return ResponseEntity.status(501).build()
    }

}

fun <T> created(body: T) : ResponseEntity<T> {
    return ResponseEntity.status(201).body(body)
}








