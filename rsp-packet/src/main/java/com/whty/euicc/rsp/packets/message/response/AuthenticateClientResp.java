package com.whty.euicc.rsp.packets.message.response;

import com.whty.euicc.rsp.packets.message.response.base.ResponseMsgBody;

public class AuthenticateClientResp extends ResponseMsgBody {
	private String transactionID;
	//opt.
	private String profileMetadata;
	private String smdpSigned2;
	private String smdpSignature2;
	private String smdpCertificate;
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getProfileMetadata() {
		return profileMetadata;
	}
	public void setProfileMetadata(String profileMetadata) {
		this.profileMetadata = profileMetadata;
	}
	public String getSmdpSigned2() {
		return smdpSigned2;
	}
	public void setSmdpSigned2(String smdpSigned2) {
		this.smdpSigned2 = smdpSigned2;
	}
	public String getSmdpSignature2() {
		return smdpSignature2;
	}
	public void setSmdpSignature2(String smdpSignature2) {
		this.smdpSignature2 = smdpSignature2;
	}
	public String getSmdpCertificate() {
		return smdpCertificate;
	}
	public void setSmdpCertificate(String smdpCertificate) {
		this.smdpCertificate = smdpCertificate;
	}
	

}
