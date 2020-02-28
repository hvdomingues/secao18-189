package entities;

import java.util.ArrayList;
import java.util.Date;

public class Contract {

	private Integer contractNumber;
	private Date contractDate;
	private Double contractValue;
	ArrayList<Installment> installment = new ArrayList<Installment>();
	
	public Contract(Integer contractNumber, Date contractDate, Double contractValue) {
		
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public Double getContractValue() {
		return contractValue;
	}

	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}

	public ArrayList<Installment> getInstallment() {
		return installment;
	}

	public void addInstallment(Installment installment) {
		this.installment.add(installment);
	}
	
	
	
}
