package com.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 解约表
 * </p>
 *
 * @author liyb58
 * @since 2018-06-28
 */
@TableName("t_unwind")
public class Unwind extends Model<Unwind> {

    private static final long serialVersionUID = 1L;
	/**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 请求序列号
     */
	@TableField("request_sn")
	private String requestSn;
    /**
     * 解约单号
     */
	@TableField("unwind_num")
	private String unwindNum;
	/**
	 * 保证金账单唯一编号
	 */
	@TableField("deposit_num")
	private String depositNum;
    /**
     * 出房合同号
     */
	@TableField("contract_code")
	private String contractCode;
    /**
     * 数据来源
     */
	@TableField("sys_code")
	private String sysCode;
    /**
     * 解约类型 1正常解约 5清退、非退 10正常解约变非退
     */
	@TableField("unwind_type")
	private Integer unwindType;
    /**
     * 解约时间
     */
	@TableField("unwind_time")
	private Date unwindTime;
    /**
     * 单据类型  0、未关联；1、出房关联；2、收房关联；3、业务订单号关联；4、预定单号关联
     */
	private Integer type;
    /**
     * 用户uid
     */
	private String uid;

    /**
     * 公司编码
     */
	@TableField("company_code")
	private String companyCode;
    /**
     * 用户名字
     */
	@TableField("user_name")
	private String userName;

	/**
	 * 应收金额
	 */
	@TableField("receipt_amount")
	private Long receiptAmount;

	/**
	 * 应付金额
	 */
	@TableField("payment_amount")
	private Long paymentAmount;


    /**
     * 解约收付金额
     */
	private Long amount;
    /**
     * 解约收付款账单编号
     */
	@TableField("bill_num")
	private String billNum;
    /**
     * 处理状态 1.待支付	3.付款中 5.收付款成功 
     */
	private Integer status;
    /**
     * 版本号
     */
	@Version
	private Integer version;
    /**
     * 逻辑删除标识
     */
	@TableField("is_del")
	@TableLogic
	private Integer isDel;
    /**
     * 创建时间
     */
	@TableField("create_date")
	private Date createDate;
    /**
     * 最后修改时间
     */
	@TableField("last_modify_time")
	private Date lastModifyTime;
	/**
	 * CRM合同ID
	 */
	@TableField("crm_contract_id")
	private String crmContractId;
	/**
	 * CRM合同ID
	 */
	@TableField("rent_back_type")
	private String rentBackType;
	/**
	 * CRM合同ID
	 */
	@TableField("audit_date")
	private String auditDate;
	/**
	 * CRM合同ID
	 */
	@TableField("receivable_amount")
	private Long receivableAmount;
	/**
	 * CRM合同ID
	 */
	@TableField("net_receipt_amount")
	private Long netReceiptAmount;
	/**
	 * CRM合同ID
	 */
	@TableField("service_charge_receivable_amount")
	private Long serviceChargeReceivableAmount;
	/**
	 * CRM合同ID
	 */
	@TableField("service_charge_net_recipt_amount")
	private Long serviceChargeNetReciptAmount;
	/**
	 * 父解约合同号
	 */
	@TableField("parent_unwind_num")
	private String parentUnwindNum;

	public String getParentUnwindNum() {
		return parentUnwindNum;
	}

	public void setParentUnwindNum(String parentUnwindNum) {
		this.parentUnwindNum = parentUnwindNum;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequestSn() {
		return requestSn;
	}

	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}

	public String getUnwindNum() {
		return unwindNum;
	}

	public void setUnwindNum(String unwindNum) {
		this.unwindNum = unwindNum;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public Integer getUnwindType() {
		return unwindType;
	}

	public void setUnwindType(Integer unwindType) {
		this.unwindType = unwindType;
	}

	public Date getUnwindTime() {
		return unwindTime;
	}

	public void setUnwindTime(Date unwindTime) {
		this.unwindTime = unwindTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public Long getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(Long receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public Long getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getCrmContractId() {
		return crmContractId;
	}

	public void setCrmContractId(String crmContractId) {
		this.crmContractId = crmContractId;
	}

	public String getRentBackType() {
		return rentBackType;
	}

	public void setRentBackType(String rentBackType) {
		this.rentBackType = rentBackType;
	}

	public String getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}

	public Long getReceivableAmount() {
		return receivableAmount;
	}

	public void setReceivableAmount(Long receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public Long getNetReceiptAmount() {
		return netReceiptAmount;
	}

	public void setNetReceiptAmount(Long netReceiptAmount) {
		this.netReceiptAmount = netReceiptAmount;
	}

	public Long getServiceChargeReceivableAmount() {
		return serviceChargeReceivableAmount;
	}

	public void setServiceChargeReceivableAmount(Long serviceChargeReceivableAmount) {
		this.serviceChargeReceivableAmount = serviceChargeReceivableAmount;
	}

	public Long getServiceChargeNetReciptAmount() {
		return serviceChargeNetReciptAmount;
	}

	public void setServiceChargeNetReciptAmount(Long serviceChargeNetReciptAmount) {
		this.serviceChargeNetReciptAmount = serviceChargeNetReciptAmount;
	}

	public String getDepositNum() {
		return depositNum;
	}

	public void setDepositNum(String depositNum) {
		this.depositNum = depositNum;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Unwind{" +
			", id=" + id +
			", requestSn=" + requestSn +
			", unwindNum=" + unwindNum +
			", contractCode=" + contractCode +
			", sysCode=" + sysCode +
			", unwindType=" + unwindType +
			", unwindTime=" + unwindTime +
			", type=" + type +
			", uid=" + uid +
			", companyCode=" + companyCode +
			", crmContractId=" + crmContractId +
			", userName=" + userName +
			", amount=" + amount +
			", billNum=" + billNum +
			", status=" + status +
			", version=" + version +
			", isDel=" + isDel +
			", createDate=" + createDate +
			", lastModifyTime=" + lastModifyTime +
				", rentBackType=" + rentBackType +
				", auditDate=" + auditDate +
				", receivableAmount=" + receivableAmount +
				", netReceiptAmount=" + netReceiptAmount +
				", serviceChargeReceivableAmount=" + serviceChargeReceivableAmount +
				", serviceChargeNetReciptAmount=" + serviceChargeNetReciptAmount +
				", depositNum=" + depositNum +
				", parentUnwindNum=" + parentUnwindNum +
			"}";
	}
}
