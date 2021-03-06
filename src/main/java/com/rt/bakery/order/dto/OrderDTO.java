package com.rt.bakery.order.dto;

import java.util.List;

public class OrderDTO {
	private String productName = "";
	private int totalQuantity = 0;
	private String totalCost = "";
	private List<PackageDTO> packageDTOList = null;
	public List<PackageDTO> getPackageDTOList() {
		return packageDTOList;
	}
	public void setPackageDTOList(List<PackageDTO> packageDTOList) {
		this.packageDTOList = packageDTOList;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public String getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(String string) {
		this.totalCost = string;
	}

}