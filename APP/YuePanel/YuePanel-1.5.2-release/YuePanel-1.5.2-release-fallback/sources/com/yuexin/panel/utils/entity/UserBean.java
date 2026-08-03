package com.yuexin.panel.utils.entity;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class UserBean {
    private int chatType;
    private java.lang.String id;
    private boolean isSwitch;
    private java.lang.String msg;
    private long sendTime;
    private long shortID;
    private int sleep;
    private long time;
    private java.lang.String uin;

    static {
            r0 = 905(0x389, float:1.268E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public UserBean() {
            r0 = this;
            r0.<init>()
            return
    }

    public native int getChatType();

    public native java.lang.String getId();

    public native java.lang.String getMsg();

    public native long getSendTime();

    public native long getShortID();

    public native int getSleep();

    public native long getTime();

    public native java.lang.String getUin();

    public native boolean isSwitch();

    public native void setChatType(int r1);

    public native void setId(java.lang.String r1);

    public native void setMsg(java.lang.String r1);

    public native void setSendTime(long r1);

    public native void setShortID(long r1);

    public native void setSleep(int r1);

    public native void setSwitch(boolean r1);

    public native void setTime(long r1);

    public native void setUin(java.lang.String r1);
}
