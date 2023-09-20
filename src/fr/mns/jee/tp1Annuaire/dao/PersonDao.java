package fr.mns.jee.tp1Annuaire.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fr.mns.jee.tp1Annuaire.model.Gender;
import fr.mns.jee.tp1Annuaire.model.Person;


public class PersonDao extends AbstractDao<Person>{

	@Override
	public Person find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		Statement statement;
		List<Person> persons=new ArrayList<Person>();
		try {
			statement = ConnectionDao.getInstance().createStatement();

			ResultSet rs = statement.executeQuery("SELECT * FROM PERSON");
			while (rs.next()) {
							
				Person person=new Person();
				person.setId(Long.valueOf(rs.getInt("id")));
				person.setFirstName(rs.getString("firstname"));
				person.setLastName(rs.getString("lastname"));
				String genderStr=rs.getString("gender");
				if(genderStr!=null && !genderStr.isEmpty()) {
					person.setGender(genderStr.equalsIgnoreCase(Gender.FEMALE.name())?Gender.FEMALE:Gender.MALE);
				}
				
				person.setPhoneNumber(rs.getString("phoneNumber"));

				persons.add(person);
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persons;
	}

	@Override
	public Person create(Person entity)  {
		Statement statement;
		try {
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			statement = ConnectionDao.getInstance().createStatement();
			String sql = "INSERT INTO person(lastname, firstname, birthdate, phoneNumber, gender) VALUES ('"+entity.getLastName()+"','"+entity.getFirstName()+"','"+formatter.format(entity.getBirthDate())+"','"+entity.getPhoneNumber()+"','"+entity.getGender().name()+"')";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		return entity;
	}

	@Override
	public Person update(Person entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
