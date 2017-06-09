/**
 * 
 */
package com.li.solr.entity;

/**
 * @author liliu
 *
 */
public class Product {

	private String productType;
	private String color;
	private Float minPrice;
	private Float maxPrice;
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Float minPrice) {
		this.minPrice = minPrice;
	}
	public Float getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
	}
	@Override
	public String toString() {
		return "Product [productType=" + productType + ", color=" + color
				+ ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", getProductType()=" + getProductType() + ", getColor()="
				+ getColor() + ", getMinPrice()=" + getMinPrice()
				+ ", getMaxPrice()=" + getMaxPrice() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
