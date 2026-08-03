package com.yuexin.panel.panel.voice.audiobuild;

import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class AudioRecord {

    @SerializedName("audioFormat")
    private String audioFormat;

    @SerializedName("audioId")
    private String audioId;

    @SerializedName("audioName")
    private String audioName;

    @SerializedName("audioSize")
    private long audioSize;

    @SerializedName("auditStatus")
    private String auditStatus;

    @SerializedName("createTime")
    private String createTime;

    @SerializedName("downloadCount")
    private int downloadCount;

    static {
        NativeUtil.classesInit0(385);
    }

    public native String getAudioFormat();

    public native String getAudioId();

    public native String getAudioName();

    public native long getAudioSize();

    public native String getAuditStatus();

    public native String getCreateTime();

    public native int getDownloadCount();

    public native void setAudioFormat(String str);

    public native void setAudioId(String str);

    public native void setAudioName(String str);

    public native void setAudioSize(long j);

    public native void setAuditStatus(String str);

    public native void setCreateTime(String str);

    public native void setDownloadCount(int i);
}
