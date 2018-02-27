package br.com.adrianopogianeli.ntepadapi.controller

import br.com.adrianopogianeli.ntepadapi.model.Nota
import br.com.adrianopogianeli.ntepadapi.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/nota")
class NotaController {
    @Autowired
    lateinit var notaService: NotaService
    @GetMapping
    fun buscarTodos(): List<Nota>{
        return notaService.buscarTodas()
    }
    @GetMapping("/titulo/{titulo}")
    fun buscar(@PathVariable("titulo") titulo: String):
            Nota {
        return notaService.buscar(titulo)
    }
    @PostMapping
    fun salvar(@RequestBody nota: Nota){
        notaService.salvar(nota)
    }
}