package com.atos.eduhub.service;

import com.atos.eduhub.model.Approval;

import java.util.List;

public interface ApprovalService {
	public Approval addApproval(Approval approval);
	public Approval editApproval(int approvalId,Approval approval);
	public String deleteApproval(int approvalId);
	public String deleteAllApprovals();
	public Approval getApproval(int approvalId);
	public List<Approval> getAllApprovals();


}
