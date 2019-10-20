package Exercise5_0;

import pkt2.Department_1;

public class Employee {

	int ssn;
	String sname;
	String address;

	public Employee(int ssn, String sname, String address) {

		this.ssn=ssn;
		this.sname=sname;
		this.address=address;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	


}
