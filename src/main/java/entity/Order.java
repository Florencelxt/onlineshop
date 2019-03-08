/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.util.Calendar;

/**
 * @author YWB
 *
 */
public class Order {
	private int id;
	private int orderNo;
	private Customer customer;
	private Calendar orderDate;
	private double totalPrice;
	private int amount;
	private int state;
	final static int NR_notDelivered = 0;
	final static int NR_unCollected = 1;
	final static int NR_finish = 2;
	final static int NR_returning = 3;
	final static int NR_returned = 4;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return orderNo
	 */
	public int getOrderNo() {
		return orderNo;
	}
	/**
	 * @param orderNo Ҫ���õ� orderNo
	 */
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * @return customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer Ҫ���õ� customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return orderDate
	 */
	public Calendar getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate Ҫ���õ� orderDate
	 */
	public void setOrderDate(Calendar orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice Ҫ���õ� totalPrice
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount Ҫ���õ� amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state Ҫ���õ� state
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * ������״̬ת��ΪNotDelivered
	 * */
	public boolean orderNotDelivered() {
		
		//TODO
		
		return true;
	}
	
	/**
	 * ������״̬��ΪunCollected
	 * */
	public boolean orderUnCollected() {
		//TODO
		return true;
	}
	
	/**
	 * ������״̬��ΪFinish
	 * */
	public boolean orderFinish() {
		//TODO
		return true;
	}
	/**
	 * ������״̬��ΪReturning
	 * 
	 * */
	public boolean orderReturning() {
		//TODO
		return true;
	}
	/**
	 * ������״̬��ΪReturned
	 * 
	 * */
	public boolean orderReturned() {
		//TODO
		return true;
	}
	
	
	

}
