package io.github.oleiva.dao;

import java.util.List;
import io.github.oleiva.entity.Entity;

public interface Dao<T extends Entity, I> {

	List<T> findAll();
	T find(I id);
	T save(T newsEntry);

	void delete(I id);
}