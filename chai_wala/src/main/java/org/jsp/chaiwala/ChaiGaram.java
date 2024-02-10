package org.jsp.chaiwala;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class ChaiGaram {
	@Id
	private int id;
	private String cshop;
	private String oname;
	private float qrating;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCshop() {
		return cshop;
	}
	public void setCshop(String cshop) {
		this.cshop = cshop;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public float getQrating() {
		return qrating;
	}
	public void setQrating(float qrating) {
		this.qrating = qrating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mahii");	
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		ChaiGaram cg = new ChaiGaram();
		
		cg.setId(103);
		cg.setCshop("Teen petrol pump tea stall");
		cg.setOname("sagar");
		cg.setQrating(5);
		cg.setPrice(10);
		
		et.begin();
		em.persist(cg);
		et.commit();
	}
}
