package com.mim.archive;

/**
 * Created by User on 6/8/2016.
 */
public class User{
    private int _userId;
    private String _userName;
    private String _userPassword;


    public User(){

    }

    public void set_userId(int _userId) {
        this._userId = _userId;
    }

    public void set_userName(String _userName) {
        this._userName = _userName;
    }

    public void set_userPassword(String userPassword) {
        this._userPassword=userPassword;
    }

    public int get_userId(){
        return _userId;
    }
    public String get_userName() {
        return _userName;
    }

    public String get_userPassword() {
        return _userPassword;
    }

    public User(String userName, String userPassword) {
        this._userName = userName;
        this._userPassword = userPassword;
    }

}
