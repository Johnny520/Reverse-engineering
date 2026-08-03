package com.yuexin.panel.panel.voice.audiobuild;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class AudioData {

    @com.google.gson.annotations.SerializedName("audioRecords")
    private java.util.List<com.yuexin.panel.panel.voice.audiobuild.AudioRecord> audioRecords;

    @com.google.gson.annotations.SerializedName("current")
    private int current;

    @com.google.gson.annotations.SerializedName("pages")
    private int pages;

    @com.google.gson.annotations.SerializedName("remainingPages")
    private int remainingPages;

    @com.google.gson.annotations.SerializedName("total")
    private int total;

    static {
            r0 = 387(0x183, float:5.42E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public AudioData() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.util.List<com.yuexin.panel.panel.voice.audiobuild.AudioRecord> getAudioRecords();

    public native int getCurrent();

    public native int getPages();

    public native int getRemainingPages();

    public native int getTotal();

    public native void setAudioRecords(java.util.List<com.yuexin.panel.panel.voice.audiobuild.AudioRecord> r1);

    public native void setCurrent(int r1);

    public native void setPages(int r1);

    public native void setRemainingPages(int r1);

    public native void setTotal(int r1);
}
