/*
 * package com.sk.project.dto;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.Id; import javax.persistence.OneToMany; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "user") public class User { //@Id //@GeneratedValue private
 * Long id;
 * 
 * private String desg;
 * 
 * @OneToMany(mappedBy = "user") private List<Product> products;
 * 
 * public List<Product> getProducts() { return products; }
 * 
 * public void setProducts(List<Product> products) { this.products = products; }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getDesg() { return desg; }
 * 
 * public void setDesg(String desg) { this.desg = desg; }
 * 
 * }
 */