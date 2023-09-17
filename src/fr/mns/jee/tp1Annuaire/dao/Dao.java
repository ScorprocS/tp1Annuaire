package fr.mns.jee.tp1Annuaire.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T extends Serializable> {
	T find(Long id);
	List<T> findAll();
	T create(T entity);
	T update(T entity);
	T delete(Long id);



	
}
