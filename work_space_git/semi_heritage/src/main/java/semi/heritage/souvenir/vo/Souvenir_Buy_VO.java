package semi.heritage.souvenir.vo;

import java.util.Date;

public class Souvenir_Buy_VO {
	int orderNum;
	int uno;
	int souv_pro_no;
	String souv_pro_name;
	int souv_pro_price;
	int bsb_total_price;

	public Souvenir_Buy_VO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Souvenir_Buy_VO(int orderNum, int uno, int souv_pro_no, String souv_pro_name, int souv_pro_price,
			int bsb_total_price) {
		super();
		this.orderNum = orderNum;
		this.uno = uno;
		this.souv_pro_no = souv_pro_no;
		this.souv_pro_name = souv_pro_name;
		this.souv_pro_price = souv_pro_price;
		this.bsb_total_price = bsb_total_price;
	}

	@Override
	public String toString() {
		return "Souvenir_Buy_VO [orderNum=" + orderNum + ", uno=" + uno + ", souv_pro_no=" + souv_pro_no
				+ ", souv_pro_name=" + souv_pro_name + ", souv_pro_price=" + souv_pro_price + ", bsb_total_price="
				+ bsb_total_price + "]";
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public int getSouv_pro_no() {
		return souv_pro_no;
	}

	public void setSouv_pro_no(int souv_pro_no) {
		this.souv_pro_no = souv_pro_no;
	}

	public String getSouv_pro_name() {
		return souv_pro_name;
	}

	public void setSouv_pro_name(String souv_pro_name) {
		this.souv_pro_name = souv_pro_name;
	}

	public int getSouv_pro_price() {
		return souv_pro_price;
	}

	public void setSouv_pro_price(int souv_pro_price) {
		this.souv_pro_price = souv_pro_price;
	}

	public int getBsb_total_price() {
		return bsb_total_price;
	}

	public void setBsb_total_price(int bsb_total_price) {
		this.bsb_total_price = bsb_total_price;
	}

}
