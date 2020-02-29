package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Contract {

	private Integer contractNumber;
	private Date contractDate;
	private Double contractValue;
	ArrayList<Installment> installment = new ArrayList<Installment>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
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
	
	public String showInstallments() {
		String installments = "";
		
		for (Installment c : installment) {
			installments += String.format("" + sdf.format(c.getDueDate()) + " - " + c.getAmount() + "\n","%.2f");
		}
		
		return installments;
		
	}
	
	
	
}
