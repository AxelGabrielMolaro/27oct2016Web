package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

@Service("TorneoService")
public class TorneoServiceImpl implements TorneoService{

	Torneo t1=new Torneo("LCS");
	
	
	@Override
	public HashSet<Equipo> mostrarEquipos() {
		return t1.getListaDeEquipos();
		
	}
	
	@Override
	public Torneo buscarTorneo (String nombre) throws Exception{
	UsuarioRegistrado torneoBusqueda = new UsuarioRegistrado(null, null, null, null);
		if(torneoBusqueda.getListaDeTorneos().contains(nombre)){
			
			for ( Torneo torneo : torneoBusqueda.getListaDeTorneos()){
				if(torneo.equals(torneoBusqueda)){
					return torneo;
				}
			}
		}else{
			throw new Exception("No se encontro el torneo");
		}
			return null;
	}
	
	@Override
	public void agregarEquipoAalTorneo(String nombre) {
		t1.getListaDeEquipos().add(new Equipo(nombre));
		
	}

	@Override
	public void eliminarEquipoDeTorneo(String nombre) {

		Equipo equipoAEliminar=new Equipo(nombre);
		t1.getListaDeEquipos().remove(equipoAEliminar);
		
	}

	

	@Override
	public Equipo buscarUnEquipoDeterminado(String nombre) throws Exception {
		
		Equipo equipoBuscado=new Equipo(nombre);
		if(t1.getListaDeEquipos().contains(equipoBuscado))
		{
			for( Equipo each:t1.getListaDeEquipos())
			{
				if (equipoBuscado==each) {
					
					return each;
				}
			}
		}
		else {
			throw new Exception("el equipo buscado no existe");
		}
		
		return null;
		
		
	}
	
	@Override
	public void modificarEquipoDeTorneo(String Nombre) throws Exception {
		
		
		buscarUnEquipoDeterminado(Nombre).setNombre(Nombre);
		
	}

	@Override
	public void seleccionarEquipoATrabajar(String nombre) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
