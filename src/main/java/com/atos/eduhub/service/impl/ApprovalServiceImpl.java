package com.atos.eduhub.service.impl;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApprovalServiceImpl implements ApprovalService{

	@Override
	public Approval addApproval(Approval approval) {
		System.out.println("Approval object created for POST request:" );
		System.out.println(approval);
		return approval;
	}

	public Approval editApproval(int approvalId,Approval approval) {
		System.out.println("Approval object updated for PUT request:" + approvalId);
		if (approvalId == 777) {
			approval.setApprovalStatus("Approved");
			approval.setApprovalStatusMessage("Completed");
		}
		System.out.println(approval);
		return approval;
	}


	@Override
	public String deleteApproval(int approvalId) {
		// TODO Auto-generated method stub
		System.out.println("All Approvals  deleted for Delete request:");
		return "Deleted approval id :" +approvalId;
	}


	@Override
	public String deleteAllApprovals() {
		System.out.println("Approval id deleted for Delete request:");
		return "Approvals Deleted";
	}

	@Override
	public Approval getApproval(int approvalId) {
		// TODO Auto-generated method stub
		Approval approval=new Approval();
		approval.setApprovalId(444);
		approval.setRequestId(555);
		approval.setRmId(14530);
		approval.setApprovalStatus("Pending");
		approval.setApprovalStatusMessage("WIP");
		approval.setCreatedOn(null);
		approval.setLastUpdatedOn(null);

		System.out.println("Approval returned for Get request:");
		System.out.println(approval);
		return approval;

	}

	@Override
	public List<Approval> getAllApprovals() {
		// TODO Auto-generated method stub
		ArrayList<Approval> approvals=new ArrayList<>();
		Approval approval1=new Approval();
		approval1.setApprovalId(444);
		approval1.setRequestId(555);
		approval1.setRmId(14530);
		approval1.setApprovalStatus("Pending");
		approval1.setApprovalStatusMessage("WIP");
		approval1.setCreatedOn(null);
		approval1.setLastUpdatedOn(null);
		approvals.add(approval1);

		Approval approval2=new Approval();

		approval2.setApprovalId(999);
		approval2.setRequestId(666);
		approval2.setRmId(99530);
		approval2.setApprovalStatus("Approved");
		approval2.setApprovalStatusMessage("Completed");
		approval2.setCreatedOn(null);
		approval2.setLastUpdatedOn(null);
		approvals.add(approval2);
		System.out.println(" All Approvals returned for Get request:");
		System.out.println(approvals);
		return approvals;

	}

}
