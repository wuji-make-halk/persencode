package com.persen.beijing.springmybatis.po;

import java.sql.Date;

/**
 * CodeActAcctItem对应数据库中CODE_ACT_ACCT_ITEM(明细账目定义表)
 */
public final class CodeActAcctItem {
    private int acct_item_code;
    private String acct_item_name;
    private int unit_type_id;
    private int order_number; // 越小优先级越高
    private Date update_time;

    public int getAcct_item_code() {
        return acct_item_code;
    }

    public void setAcct_item_code(int acct_item_code) {
        this.acct_item_code = acct_item_code;
    }

    public String getAcct_item_name() {
        return acct_item_name;
    }

    public void setAcct_item_name(String acct_item_name) {
        this.acct_item_name = acct_item_name;
    }

    public int getUnit_type_id() {
        return unit_type_id;
    }

    public void setUnit_type_id(int unit_type_id) {
        this.unit_type_id = unit_type_id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "CodeActAcctItem [acct_item_code=" + acct_item_code
                + ", acct_item_name=" + acct_item_name + ", unit_type_id="
                + unit_type_id + ", order_number=" + order_number
                + ", update_time=" + update_time + "]";
    }
}
