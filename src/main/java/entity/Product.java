/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.awt.Color;
import java.awt.Image;

/**
 * @author YWB
 *
 */
public class Product {
	private int id;
	private double price;
	private String name;
	private Image[] images;
	private Color color;
	private String group;
	private int memory;
	private int pixel;
	private int battery;
	private String processor;
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
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price Ҫ���õ� price
	 */
	public void setPrice(double price) {
		this.price = price;
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
	 * @return images
	 */
	public Image[] getImages() {
		return images;
	}
	/**
	 * @param images Ҫ���õ� images
	 */
	public void setImages(Image[] images) {
		this.images = images;
	}
	/**
	 * @return color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color Ҫ���õ� color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return group
	 */
	public String getGroup() {
		return group;
	}
	/**
	 * @param group Ҫ���õ� group
	 */
	public void setGroup(String group) {
		this.group = group;
	}
	/**
	 * @return memory
	 */
	public int getMemory() {
		return memory;
	}
	/**
	 * @param memory Ҫ���õ� memory
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	/**
	 * @return pixel
	 */
	public int getPixel() {
		return pixel;
	}
	/**
	 * @param pixel Ҫ���õ� pixel
	 */
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	/**
	 * @return battery
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param battery Ҫ���õ� battery
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}
	/**
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor Ҫ���õ� processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

}
