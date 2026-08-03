package com.yuexin.panel.panel.voice.audiobuild;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class AudioRecord {

    @com.google.gson.annotations.SerializedName("audioFormat")
    private java.lang.String audioFormat;

    @com.google.gson.annotations.SerializedName("audioId")
    private java.lang.String audioId;

    @com.google.gson.annotations.SerializedName("audioName")
    private java.lang.String audioName;

    @com.google.gson.annotations.SerializedName("audioSize")
    private long audioSize;

    @com.google.gson.annotations.SerializedName("auditStatus")
    private java.lang.String auditStatus;

    @com.google.gson.annotations.SerializedName("createTime")
    private java.lang.String createTime;

    @com.google.gson.annotations.SerializedName("downloadCount")
    private int downloadCount;

    static {
            r0 = 385(0x181, float:5.4E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public AudioRecord() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.lang.String getAudioFormat();

    public native java.lang.String getAudioId();

    public native java.lang.String getAudioName();

    public native long getAudioSize();

    public native java.lang.String getAuditStatus();

    public native java.lang.String getCreateTime();

    public native int getDownloadCount();

    public native void setAudioFormat(java.lang.String r1);

    public native void setAudioId(java.lang.String r1);

    public native void setAudioName(java.lang.String r1);

    public native void setAudioSize(long r1);

    public native void setAuditStatus(java.lang.String r1);

    public native void setCreateTime(java.lang.String r1);

    public native void setDownloadCount(int r1);
}
