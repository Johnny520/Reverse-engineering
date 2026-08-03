package com.yuexin.panel.utils.entity.comment;

import Yue.C6411;
import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class CommentBean {

    @SerializedName("aweme_id")
    private String aweme_id;

    @SerializedName("cid")
    private String cid;

    @SerializedName("content_type")
    private int content_type;

    @SerializedName("send_name")
    private String send_name;

    @SerializedName("send_uid")
    private String send_uid;

    @SerializedName(C6411.f16287)
    private int status;

    @SerializedName("text")
    private String text;

    @SerializedName("time")
    private long time;

    @SerializedName("uid")
    private String uid;

    static {
        NativeUtil.classesInit0(397);
    }

    public native String getAweme_id();

    public native String getCid();

    public native int getContent_type();

    public native String getSend_name();

    public native String getSend_uid();

    public native int getStatus();

    public native String getText();

    public native long getTime();

    public native String getUid();

    public native void setAweme_id(String str);

    public native void setCid(String str);

    public native void setContent_type(int i);

    public native void setSend_name(String str);

    public native void setSend_uid(String str);

    public native void setStatus(int i);

    public native void setText(String str);

    public native void setTime(long j);

    public native void setUid(String str);
}
