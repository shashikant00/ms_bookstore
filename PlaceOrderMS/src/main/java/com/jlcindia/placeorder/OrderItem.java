package com.jlcindia.placeorder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name = "myorderitems" ,schema = "jlcordersdb")
@ApiModel("OrderItem contains OrderItem Details")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "orderItemId_generator")
	@SequenceGenerator(name ="orderItemId_generator",sequenceName = "myorderItemId_gen",initialValue = 3,allocationSize = 1)
	@Column(name ="order_item_id")
	private Integer orderItemId;
	
	@Column(name ="order_id")
	private Integer orderId;
	
	@Column(name ="book_id")
	private Integer bookId;
	
	@Column(name ="qty")
	private int qty;
	
	@Column(name ="cost")
	private double cost;

	public OrderItem() {}
	public OrderItem(Integer orderId, Integer bookId, int qty, double cost) {
		super();
		this.orderId = orderId;
		this.bookId = bookId;
		this.qty = qty;
		this.cost = cost;
	}
	public OrderItem(Integer orderItemId, Integer orderId, Integer bookId, int qty, double cost) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.bookId = bookId;
		this.qty = qty;
		this.cost = cost;
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
		
}
