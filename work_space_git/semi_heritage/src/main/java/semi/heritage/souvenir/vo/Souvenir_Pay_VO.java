package semi.heritage.souvenir.vo;

import java.sql.Date;

public class Souvenir_Pay_VO {

	int uno;
	String uname;
	String uadr;
	String upn;
	String uemail;
	int souv_pro_no;
	String souv_pro_name;
	int souv_pro_price;
	int total_price;
	int bsb_total_price;

	public Souvenir_Pay_VO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Souvenir_Pay_VO(int uno, String uname, String uadr, String upn, String uemail, int souv_pro_no,
			String souv_pro_name, int souv_pro_price, int total_price, int bsb_total_price) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.uadr = uadr;
		this.upn = upn;
		this.uemail = uemail;
		this.souv_pro_no = souv_pro_no;
		this.souv_pro_name = souv_pro_name;
		this.souv_pro_price = souv_pro_price;
		this.total_price = total_price;
		this.bsb_total_price = bsb_total_price;
	}

	@Override
	public String toString() {
		return "Souvenir_Pay_VO [uno=" + uno + ", uname=" + uname + ", uadr=" + uadr + ", upn=" + upn + ", uemail="
				+ uemail + ", souv_pro_no=" + souv_pro_no + ", souv_pro_name=" + souv_pro_name + ", souv_pro_price="
				+ souv_pro_price + ", total_price=" + total_price + ", bsb_total_price=" + bsb_total_price + "]";
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUadr() {
		return uadr;
	}

	public void setUadr(String uadr) {
		this.uadr = uadr;
	}

	public String getUpn() {
		return upn;
	}

	public void setUpn(String upn) {
		this.upn = upn;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
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

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getBsb_total_price() {
		return bsb_total_price;
	}

	public void setBsb_total_price(int bsb_total_price) {
		this.bsb_total_price = bsb_total_price;
	}

}
