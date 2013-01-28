package br.com.caelum.livraria.ejb;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.caelum.livraria.modelo.Livro;

public interface Carrinho extends Remote {
	void addLivro(Livro livro) throws RemoteException;
	List<Livro> getLivros() throws RemoteException;
	double getTotal() throws RemoteException;
}
