package fr.mns.jee.tp1Annuaire.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.mns.jee.tp1Annuaire.model.User;

public class UserInMemoryDao implements Dao<User>{
	private static List<User> users = new ArrayList<>(Arrays.asList(new User("alexandre.blanc@ifa.fr","alexandre"),new User("jean@gmail.fr","jean")));

	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	@Override
	public User find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(User entity) {
		users.add(entity);
		
		return entity;
	}



	@Override
	public User update(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
