package com.example.apirest2.apirest2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.*;

import com.example.apirest2.apirest2.model.Curso;

@RestController
public class CursoController{
    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()	{
		return "{ \"todoOk\" : true }";
    }

    @GetMapping("/cursos")
	public List<Curso> getCursos()	{
		List<Curso> cursoList = new ArrayList<Curso>();
		cursoList.add(new Curso(1,"Estructuras discretas 1",3));
        cursoList.add(new Curso(2,"Matematicas",4));
		return cursoList;
	}
    
	@GetMapping("/curso/{id}")
	public Curso getEmployee(@PathVariable int id)	{
		Curso emp = new Curso(id, "Estructuras discretas 1",3);
		return emp;
	}
	
	@PutMapping("/curso/{id}")
	public Curso updateEmployee(@RequestBody Curso newEmployee, @PathVariable int id)	{
		Curso emp = newEmployee;
		return emp;
	}
	
	@DeleteMapping(value = "/curso/{id}", produces = "application/json; charset=utf-8")
	public String deleteEmployee(@PathVariable String id) {
		return "{ \"operacionExitosa\" : true }";
	}
	
	@PostMapping("/curso")
	public Curso addEmployee(@RequestBody Curso newCurso){
		int id = new Random().nextInt();
		Curso emp = new Curso(id, newCurso.getNombre(), newCurso.getCreditos());
		return emp;
	}
    
}

 