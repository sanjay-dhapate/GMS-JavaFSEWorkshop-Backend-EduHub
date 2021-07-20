package com.atos.eduhub.controller;

import com.atos.eduhub.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

import java.util.List;

/*
Use following HTTP methods:
POST - Add approval
PUT - Edit Approval
DELETE - delete approval
GET - get approval details
*/

@RestController
@RequestMapping("/eduhubapi/v1")
public class ApprovalController {

	@Autowired(required = true)
	ApprovalService approvalService;

	// Add REST API Demo - POST Http Request

	@PostMapping("/approval")
	public Approval addApproval(@RequestBody Approval approval) {

		System.out.println("Post request received for addApproval() for id " + approval.getApprovalId());
		return approvalService.addApproval(approval);
	}
	// Edit REST API Demo - POST Http Request
	@PutMapping("/updateapproval/{approvalId}")
	public Approval editApproval(@RequestBody @PathVariable(name="approvalId") int approvalId, @RequestBody Approval approval) {
		System.out.println("Put request received for editApproval() for id "+ approvalId);
		return approvalService.editApproval(approvalId,approval);
	}
	//Delete REST API Demo
	 @DeleteMapping("/deleteapproval/{approvalId}")
	public String deleteCourse(@PathVariable(value=	"approvalId") int approvalId)

	{
		return approvalService.deleteApproval(approvalId);

	}
	//Delete all REST API Demo

	@DeleteMapping("/deleteallapprovals")
	public String deleteAllApprovals() {
		return approvalService.deleteAllApprovals();
	}

	// Get all REST API Demo
	@GetMapping("/allApprovals")
	public List<Approval> getAllDemo() {
		return approvalService.getAllApprovals();
	}

	// Get approval by id  REST API Demo
	@GetMapping("/approval/{approvalId}")
	public Approval getDemoById(@PathVariable(value="approvalId") int approvalId) {

		return approvalService.getApproval(approvalId);
	}
}
