package com.yuexin.panel.panel.voice.audiobuild;

import Yue.C6411;
import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class AudioResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("data")
    private AudioData data;

    @SerializedName(C6411.f16274)
    private String msg;

    static {
        NativeUtil.classesInit0(929);
    }

    public native int getCode();

    public native AudioData getData();

    public native String getMsg();

    public native void setCode(int i);

    public native void setData(AudioData audioData);

    public native void setMsg(String str);
}
