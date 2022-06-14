package com.ejemplo.crud;

import java.util.Scanner;

import com.ejemplo.crud.controller.UsuarioController;
import com.ejemplo.crud.model.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		//Conexion.conexion();
		//Crear un objeto de UsuarioController
		UsuarioController usuarioC = new UsuarioController();
		
		//crear un objeto de Usuario
		Usuario usuario1 =new Usuario("Rodrigo", "Vergara", "RodriVerga", "rvergara@gmail.com"); 
		//cargar un objeto de usuario al metodo insertar de UsuarioController
		
		//llama al metodo para insertar registros 
		//usuarioC.insertar("pepito");
		//llama al metodo para mostrar todos los registros
		//usuarioC.listarUsuarios();
		
		//cargar el id que voy a modificar al objeto usuario1
		//usuario1.setId(2);
		//usuarioC.actualizar(usuario1);
		//usuarioC.listarUsuarios();
		
		//usuarioC.eliminar(1);
		
		//usuarioC.listarUsuarios();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique un id");
		int busqueda = teclado.nextInt();
		
		System.out.println("El resultado de su busqueda es, quiere algo mas?");
		System.out.println("quiere pasar a tomar una tasita de cafe?");
		usuarioC.buscarUsuario(busqueda);
	
		
		
	}

}
