package com.mim.archive;

/**
 * Created by User on 6/8/2016.
 */
public class Admin{
    private int _adminId;
    private String _adminName;
    private String _adminPassword;


    public Admin(){

    }

    public void set_adminId(int _adminId) {
        this._adminId = _adminId;
    }

    public void set_adminName(String _adminName) {
        this._adminName = _adminName;
    }

    public void set_adminPassword(String adminPassword) {
        this._adminPassword=adminPassword;
    }

    public int get_adminId(){
        return _adminId;
    }
    public String get_adminName() {
        return _adminName;
    }

    public String get_adminPassword() {
        return _adminPassword;
    }

    public Admin(String adminName, String adminPassword) {
        this._adminName = adminName;
        this._adminPassword = adminPassword;
    }

}

