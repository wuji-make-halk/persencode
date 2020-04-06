package com.persen.beijing.mybatis.po;

import java.sql.Date;

import org.apache.ibatis.ognl.IntHashMap.Entry;

/**
 * InfoPayBalance对应数据库中INFO_PAY_BALANCE(账本信息表)
 */
public final class InfoPayBalance extends Entry {
    private long balance_id;
    private String pay_id;
    private int balance_type_id;
    private long balance;
    private long real_balance;
    private long used_balance;
    private int latn_id;
    private Date eff_date;
    private Date exp_date;
    private String local_net;

    public long getBalance_id() {
        return balance_id;
    }

    public void setBalance_id(long balance_id) {
        this.balance_id = balance_id;
    }

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getReal_balance() {
        return real_balance;
    }

    public void setReal_balance(long real_balance) {
        this.real_balance = real_balance;
    }

    public long getUsed_balance() {
        return used_balance;
    }

    public void setUsed_balance(long used_balance) {
        this.used_balance = used_balance;
    }

    public int getLatn_id() {
        return latn_id;
    }

    public void setLatn_id(int latn_id) {
        this.latn_id = latn_id;
    }

    public Date getEff_date() {
        return eff_date;
    }

    public void setEff_date(Date eff_date) {
        this.eff_date = eff_date;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    public int getBalance_type_id() {
        return balance_type_id;
    }

    public void setBalance_type_id(int balance_type_id) {
        this.balance_type_id = balance_type_id;
    }

    public String getLocal_net() {
        return local_net;
    }

    public void setLocal_net(String local_net) {
        this.local_net = local_net;
    }

    @Override
    public String toString() {
        return "InfoPayBalance [balance_id=" + balance_id + ", pay_id="
                + pay_id + ", balance_type_id=" + balance_type_id
                + ", balance=" + balance + ", real_balance=" + real_balance
                + ", used_balance=" + used_balance + ", latn_id=" + latn_id
                + ", eff_date=" + eff_date + ", exp_date=" + exp_date
                + ", local_net=" + local_net + "]";
    }
}
