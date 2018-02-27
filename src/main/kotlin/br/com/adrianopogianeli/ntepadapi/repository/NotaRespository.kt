package br.com.adrianopogianeli.ntepadapi.repository

import br.com.adrianopogianeli.ntepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRespository : MongoRepository<Nota,String>{

    @Query("{}")
    fun all(): Stream<Nota>

    fun findByTitulo(titulo: String): Nota

}