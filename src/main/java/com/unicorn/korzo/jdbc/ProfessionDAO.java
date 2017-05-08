package com.unicorn.korzo.jdbc;

import java.util.List;

public interface ProfessionDAO {
	boolean add(Profession prof);
	boolean remove(Profession prof);
	boolean update(Profession prof);
	List<Profession> findAll();
	List<Profession> findByCriteria();
	List<Profession> findByAge();

}
