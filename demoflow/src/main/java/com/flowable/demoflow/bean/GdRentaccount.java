package com.flowable.demoflow.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GdRentaccount implements Serializable {
    @ApiModelProperty(example = "xxxx", required = false, value = "id")
    private String id;
    @ApiModelProperty(example = "201908", required = true, value = "起租月份")
    private String rentTime;
    @ApiModelProperty(example = "xxxx", required = false, value = "产品业务确认单编号")
    private String orderCode;
    @ApiModelProperty(example = "电信", required = false, value = "运营商")
    private String operators;
    @ApiModelProperty(example = "xx", required = false, value = "站址名称")
    private String stationName;
    @ApiModelProperty(example = "xx-xx", required = false, value = "站址编码")
    private String stationCode;
    @ApiModelProperty(example = "xx", required = false, value = "起租站址类型")
    private String stationType;
    @ApiModelProperty(example = "0.00", required = false, value = "维护费共享用户数")
    private String shareUsers;
    @ApiModelProperty(example = "0.00", required = false, value = "维护费打折后金额")
    private BigDecimal moneyDiscount;
    @ApiModelProperty(example = "xx", required = false, value = "运营商区县")
    private String operatorsArea;
    @ApiModelProperty(example = "xx", required = false, value = "移交范围")
    private String transfer;
    @ApiModelProperty(example = "xx", required = false, value = "站址状态")
    private String stationStatue;
    @ApiModelProperty(example = "xx", required = false, value = "春耕站址类型")
    private String spring;
    @ApiModelProperty(example = "xx", required = false, value = "有无电池")
    private String battery;
    @ApiModelProperty(example = "xx", required = false, value = "共享方式")
    private String shareType;
    @ApiModelProperty(example = "xx", required = false, value = "站址产权")
    private String stationRight;
    @ApiModelProperty(example = "xx", required = false, value = "共享单位")
    private String shareCell;
    @ApiModelProperty(example = "0.00", required = false, value = "起租服务费(合)")
    private BigDecimal moneyBytotal;
    @ApiModelProperty(example = "0.00", required = false, value = "起租服务费(最大)")
    private BigDecimal moneyBymax;
    @ApiModelProperty(example = "1", required = false, value = "台账状态（1未确认2已确认）")
    private String orderStatus;
    @ApiModelProperty(example = "xx", required = false, value = "运营商不一致原因")
    private String txtOperators;
    @ApiModelProperty(example = "xx", required = false, value = "运营商不一致图片")
    private String imgOperators;
    @ApiModelProperty(example = "xx", required = false, value = "共享信息不一致原因")
    private String txtShare;
    @ApiModelProperty(example = "xx", required = false, value = "共享信息不一致图片")
    private String imgShare;
    @ApiModelProperty(example = "xx", required = false, value = "起租类型不一致原因")
    private String txtType;
    @ApiModelProperty(example = "xx", required = false, value = "起租类型不一致图片")
    private String imgType;
    @ApiModelProperty(example = "xx", required = false, value = "维护费金额不一致原因")
    private String txtMoney;
    @ApiModelProperty(example = "xx", required = false, value = "维护费金额不一致图片")
    private String imgMoney;
    @ApiModelProperty(example = "xx", required = false, value = "需运营商整改原因")
    private String txtRect;
    @ApiModelProperty(example = "xx", required = false, value = "需运营商整改图片")
    private String imgRect;
    @ApiModelProperty(example = "xx", required = false, value = "其他原因")
    private String txtOther;
    @ApiModelProperty(example = "xx", required = false, value = "其他图片")
    private String imgOther;
    @ApiModelProperty(example = "", required = false, value = "")
    private LocalDateTime editTime;
    @ApiModelProperty(example = "", required = false, value = "")
    private LocalDateTime createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime == null ? null : rentTime.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOperators() {
        return operators;
    }

    public void setOperators(String operators) {
        this.operators = operators == null ? null : operators.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode == null ? null : stationCode.trim();
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType == null ? null : stationType.trim();
    }

    public String getShareUsers() {
        return shareUsers;
    }

    public void setShareUsers(String shareUsers) {
        this.shareUsers = shareUsers == null ? null : shareUsers.trim();
    }

    public BigDecimal getMoneyDiscount() {
        return moneyDiscount;
    }

    public void setMoneyDiscount(BigDecimal moneyDiscount) {
        this.moneyDiscount = moneyDiscount;
    }

    public String getOperatorsArea() {
        return operatorsArea;
    }

    public void setOperatorsArea(String operatorsArea) {
        this.operatorsArea = operatorsArea == null ? null : operatorsArea.trim();
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer == null ? null : transfer.trim();
    }

    public String getStationStatue() {
        return stationStatue;
    }

    public void setStationStatue(String stationStatue) {
        this.stationStatue = stationStatue == null ? null : stationStatue.trim();
    }

    public String getSpring() {
        return spring;
    }

    public void setSpring(String spring) {
        this.spring = spring == null ? null : spring.trim();
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery == null ? null : battery.trim();
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    public String getStationRight() {
        return stationRight;
    }

    public void setStationRight(String stationRight) {
        this.stationRight = stationRight == null ? null : stationRight.trim();
    }

    public String getShareCell() {
        return shareCell;
    }

    public void setShareCell(String shareCell) {
        this.shareCell = shareCell == null ? null : shareCell.trim();
    }

    public BigDecimal getMoneyBytotal() {
        return moneyBytotal;
    }

    public void setMoneyBytotal(BigDecimal moneyBytotal) {
        this.moneyBytotal = moneyBytotal;
    }

    public BigDecimal getMoneyBymax() {
        return moneyBymax;
    }

    public void setMoneyBymax(BigDecimal moneyBymax) {
        this.moneyBymax = moneyBymax;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getTxtOperators() {
        return txtOperators;
    }

    public void setTxtOperators(String txtOperators) {
        this.txtOperators = txtOperators == null ? null : txtOperators.trim();
    }

    public String getImgOperators() {
        return imgOperators;
    }

    public void setImgOperators(String imgOperators) {
        this.imgOperators = imgOperators == null ? null : imgOperators.trim();
    }

    public String getTxtShare() {
        return txtShare;
    }

    public void setTxtShare(String txtShare) {
        this.txtShare = txtShare == null ? null : txtShare.trim();
    }

    public String getImgShare() {
        return imgShare;
    }

    public void setImgShare(String imgShare) {
        this.imgShare = imgShare == null ? null : imgShare.trim();
    }

    public String getTxtType() {
        return txtType;
    }

    public void setTxtType(String txtType) {
        this.txtType = txtType == null ? null : txtType.trim();
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType == null ? null : imgType.trim();
    }

    public String getTxtMoney() {
        return txtMoney;
    }

    public void setTxtMoney(String txtMoney) {
        this.txtMoney = txtMoney == null ? null : txtMoney.trim();
    }

    public String getImgMoney() {
        return imgMoney;
    }

    public void setImgMoney(String imgMoney) {
        this.imgMoney = imgMoney == null ? null : imgMoney.trim();
    }

    public String getTxtRect() {
        return txtRect;
    }

    public void setTxtRect(String txtRect) {
        this.txtRect = txtRect == null ? null : txtRect.trim();
    }

    public String getImgRect() {
        return imgRect;
    }

    public void setImgRect(String imgRect) {
        this.imgRect = imgRect == null ? null : imgRect.trim();
    }

    public String getTxtOther() {
        return txtOther;
    }

    public void setTxtOther(String txtOther) {
        this.txtOther = txtOther == null ? null : txtOther.trim();
    }

    public String getImgOther() {
        return imgOther;
    }

    public void setImgOther(String imgOther) {
        this.imgOther = imgOther == null ? null : imgOther.trim();
    }

    public LocalDateTime getEditTime() {
        return editTime;
    }

    public void setEditTime(LocalDateTime editTime) {
        this.editTime = editTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}