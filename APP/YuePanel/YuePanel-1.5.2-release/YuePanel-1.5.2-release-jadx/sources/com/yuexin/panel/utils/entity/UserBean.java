package com.yuexin.panel.utils.entity;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class UserBean {
    private int chatType;

    /* JADX INFO: renamed from: id */
    private String f4215id;
    private boolean isSwitch;
    private String msg;
    private long sendTime;
    private long shortID;
    private int sleep;
    private long time;
    private String uin;

    static {
        NativeUtil.classesInit0(905);
    }

    public native int getChatType();

    public native String getId();

    public native String getMsg();

    public native long getSendTime();

    public native long getShortID();

    public native int getSleep();

    public native long getTime();

    public native String getUin();

    public native boolean isSwitch();

    public native void setChatType(int i);

    public native void setId(String str);

    public native void setMsg(String str);

    public native void setSendTime(long j);

    public native void setShortID(long j);

    public native void setSleep(int i);

    public native void setSwitch(boolean z);

    public native void setTime(long j);

    public native void setUin(String str);
}
