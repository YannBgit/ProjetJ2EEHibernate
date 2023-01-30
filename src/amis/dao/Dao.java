package amis.dao;

import java.util.List;

public interface Dao<T>
{
	public void inserer(T t);
	public void supprimer(T t);
	public void maj(Long idAModifier, T t);
	public T trouverParId(Long id);
	public List<T> trouverTout();
}