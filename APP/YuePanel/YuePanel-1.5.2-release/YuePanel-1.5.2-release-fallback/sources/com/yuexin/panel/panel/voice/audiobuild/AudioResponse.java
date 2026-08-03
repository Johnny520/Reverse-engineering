package com.yuexin.panel.panel.voice.audiobuild;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class AudioResponse {

    @com.google.gson.annotations.SerializedName("code")
    private int code;

    @com.google.gson.annotations.SerializedName("data")
    private com.yuexin.panel.panel.voice.audiobuild.AudioData data;

    @com.google.gson.annotations.SerializedName("msg")
    private java.lang.String msg;

    static {
            r0 = 929(0x3a1, float:1.302E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public AudioResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public native int getCode();

    public native com.yuexin.panel.panel.voice.audiobuild.AudioData getData();

    public native java.lang.String getMsg();

    public native void setCode(int r1);

    public native void setData(com.yuexin.panel.panel.voice.audiobuild.AudioData r1);

    public native void setMsg(java.lang.String r1);
}
