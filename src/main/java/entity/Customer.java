/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

/**
 * @author YWB
 *
 */
public class Customer {
	private int id;
	private String name;
	private String passwd;
	private boolean sex;
	private int credit;
	private Address[] addr;
	private Product[] products;
	private Order[] orders;
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
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd Ҫ���õ� passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * @return sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @param sex Ҫ���õ� sex
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	/**
	 * @return credit
	 */
	public int getCredit() {
		return credit;
	}
	/**
	 * @param credit Ҫ���õ� credit
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	/**
	 * @return addr
	 */
	public Address[] getAddr() {
		return addr;
	}
	/**
	 * @param addr Ҫ���õ� addr
	 */
	public void setAddr(Address[] addr) {
		this.addr = addr;
	}
	/**
	 * @return products
	 */
	public Product[] getProducts() {
		return products;
	}
	/**
	 * @param products Ҫ���õ� products
	 */
	public void setProducts(Product[] products) {
		this.products = products;
	}
	/**
	 * @return orders
	 */
	public Order[] getOrders() {
		return orders;
	}
	/**
	 * @param orders Ҫ���õ� orders
	 */
	public void setOrders(Order[] orders) {
		this.orders = orders;
	}

}
