package com.bolsadeideas.springboot.web.app.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("titulo", "hola Spring TEST");
		
		return "index";
	}
	
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario user = new Usuario();
		
		user.setNombre("Pedri");
		user.setApellido("González");
		user.setEmail("Pedri@gmail.com");
		
		model.addAttribute("usuario", user);
		model.addAttribute("titulo", "Perfil del Usuario: ".concat(user.getNombre()));
		
		return "perfil";
	}
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Pedri", "González", "pedri@gmail.com"));
		usuarios.add(new Usuario("Gavi", "Paéz", "gavi@gmail.com"));
		
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Lista de Usuarios");
		
		return "listar";
	}
}
