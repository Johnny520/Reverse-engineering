package com.yuexin.panel.utils.entity.comment;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class CommentBean {

    @com.google.gson.annotations.SerializedName("aweme_id")
    private java.lang.String aweme_id;

    @com.google.gson.annotations.SerializedName("cid")
    private java.lang.String cid;

    @com.google.gson.annotations.SerializedName("content_type")
    private int content_type;

    @com.google.gson.annotations.SerializedName("send_name")
    private java.lang.String send_name;

    @com.google.gson.annotations.SerializedName("send_uid")
    private java.lang.String send_uid;

    @com.google.gson.annotations.SerializedName("status")
    private int status;

    @com.google.gson.annotations.SerializedName("text")
    private java.lang.String text;

    @com.google.gson.annotations.SerializedName("time")
    private long time;

    @com.google.gson.annotations.SerializedName("uid")
    private java.lang.String uid;

    static {
            r0 = 397(0x18d, float:5.56E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public CommentBean() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.lang.String getAweme_id();

    public native java.lang.String getCid();

    public native int getContent_type();

    public native java.lang.String getSend_name();

    public native java.lang.String getSend_uid();

    public native int getStatus();

    public native java.lang.String getText();

    public native long getTime();

    public native java.lang.String getUid();

    public native void setAweme_id(java.lang.String r1);

    public native void setCid(java.lang.String r1);

    public native void setContent_type(int r1);

    public native void setSend_name(java.lang.String r1);

    public native void setSend_uid(java.lang.String r1);

    public native void setStatus(int r1);

    public native void setText(java.lang.String r1);

    public native void setTime(long r1);

    public native void setUid(java.lang.String r1);
}
