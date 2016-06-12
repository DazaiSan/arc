package com.mim.archive;

/**
 * Created by User on 6/8/2016.
 */
public class News{
    private int _newsId;
    private String _newsTitle;
    private String _newsPaper;
    private String _newsDate;
    private String _tag;
    private String _newsUrl;


    public News(){

    }

    public void set_newsId(int newsId) {
        this._newsId = newsId;
    }

    public void set_newsTitle(String newsTitle) {
        this._newsTitle = newsTitle;
    }

    public void set_newsDate(String newsDate) {
        this._newsDate=newsDate;
    }

    public void set_newsPaper(String newsPaper) {
        this._newsPaper=newsPaper;
    }


    public void set_tag(String tag) {
        this._tag=tag;
    }

    public void set_newsUrl(String newsUrl) {
        this._newsUrl= newsUrl;
    }

    public int get_newsId(){
        return _newsId;
    }
    public String get_newsTitle() {
        return _newsTitle;
    }

    public String get_newsDate() {
        return _newsDate;
    }

    public String get_newsPaper() {
        return _newsPaper;
    }

    public String get_tag() {
        return _tag;
    }

    public String get_newsUrl() {
        return _newsUrl;
    }


    public News(String newsTitle, String newsDate) {
        this._newsTitle = newsTitle;
        this._newsDate = newsDate;
    }

    public News(String newsTitle, String newsPaper,  String newsUrl) {
        this._newsTitle = newsTitle;
        this._newsDate = "1/1/2001";
        this._newsPaper = newsPaper;
        this._newsDate = newsUrl;
        this._tag = "news";
    }

}

