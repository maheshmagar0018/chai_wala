package org.jsp.bikewala;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.Query;

@Entity
@Table
public class Bike {
	@Id
	private int id;
	private String bname;
	private String color;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Bike [id=" + id + ", bname=" + bname + ", color=" + color + ", price=" + price + "]";
	}

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bike bike = new Bike();

//		bike.setId(1);
//		bike.setBname("Yamaha");
//		bike.setColor("Black");
//		bike.setPrice(150000);
 
//		entityTransaction.begin();
//		entityManager.persist(bike);
//		entityTransaction.commit(); 
		
//  	bike.setId(3);
//		bike.setBname("KTM");
//		bike.setColor("Orange");
//		bike.setPrice(223000);
		
//		Merge method
//		entityTransaction.begin();
//		entityManager.merge(bike);
//		entityTransaction.commit();
		
// 		Remove method
//		entityTransaction.begin();
//		Bike bike2 = entityManager.find(Bike.class, 3);
//		entityManager.remove(bike2);
//		entityTransaction.commit();
		
//		Bike bike3 = entityManager.find(Bike.class, 1);
//		System.out.println(bike3);
		
		Query query = entityManager.createQuery("select c from Bike c");
		List<Bike> bikes = query.getResultList();
		System.out.println(bikes);
			
	}
}