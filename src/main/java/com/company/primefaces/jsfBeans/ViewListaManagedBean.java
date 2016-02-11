package com.company.primefaces.jsfBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import com.company.primefaces.data.Lista;

@ManagedBean
@SessionScoped
public class ViewListaManagedBean {
	private List<Lista> listas = new ArrayList<Lista>();
    private Lista selectedLista;
 
    public ViewListaManagedBean(){
 
    }
 
    @PostConstruct
    public void populateEmployeeList(){
        for(int i = 1 ; i <= 30 ; i++){
        	Lista lista = new Lista();
            lista.setIdLista(new Long(i));
            lista.setNombre("Nombre " + i);
            lista.setDescripcion("Descripcion " + i);
            lista.setActivo(true);
            this.listas.add(lista);
        }
    }
    
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Lista Selected", ((Lista) event.getObject()).getIdLista().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Lista Unselected", ((Lista) event.getObject()).getIdLista().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public List<Lista> getListas() {
		return listas;
	}

	public void setListas(List<Lista> listas) {
		this.listas = listas;
	}

	public Lista getSelectedLista() {
		return selectedLista;
	}

	public void setSelectedLista(Lista selectedLista) {
		this.selectedLista = selectedLista;
	}
}