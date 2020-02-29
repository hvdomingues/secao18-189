package services;

import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	Contract contract;
	Integer months;
	OnlinePaymentService onlinePaymentService;
	Installment installment;

	public ContractService(Contract contract, Integer months) {
		this.contract = contract;
		this.months = months;
	}

	public void processContract(OnlinePaymentService onlinePaymentService) {
		
		long inicialDate = contract.getContractDate().getTime();
		
		for(int i = 1; i <= months; i++) {
			
			long dueDateCalculator = (long) (inicialDate + ((1000.00 * 60.00 * 60.00 * 24.00) * i));
			
			Date dueDate = new Date(dueDateCalculator);
			
			contract.addInstallment(new Installment(dueDate, onlinePaymentService.interest(contract.getContractValue() / months, i)));
			
		}
		
		
	}
	
	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

}
