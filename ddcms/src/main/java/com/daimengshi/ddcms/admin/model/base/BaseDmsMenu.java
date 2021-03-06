package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsMenu<M extends BaseDmsMenu<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsMenu:add";
    public static final String ACTION_DELETE = "DmsMenu:delete";
    public static final String ACTION_UPDATE = "DmsMenu:update";


    @Override
    public String addAction() {
        return ACTION_ADD;
    }

    @Override
    public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setSuperId(java.lang.Integer superId) {
		set("super_id", superId);
	}
	
	public java.lang.Integer getSuperId() {
		return getInt("super_id");
	}

	public void setTypeId(java.lang.String typeId) {
		set("type_id", typeId);
	}
	
	public java.lang.String getTypeId() {
		return getStr("type_id");
	}

	public void setIsOpen(java.lang.String isOpen) {
		set("is_open", isOpen);
	}
	
	public java.lang.String getIsOpen() {
		return getStr("is_open");
	}

	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	public java.lang.String getDesc() {
		return getStr("desc");
	}

	public void setSerialNum(java.lang.Integer serialNum) {
		set("serial_num", serialNum);
	}
	
	public java.lang.Integer getSerialNum() {
		return getInt("serial_num");
	}

}
