package com.yuexin.panel.panel.voice.audiobuild;

import Yue.C6411;
import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class AudioData {

    @SerializedName("audioRecords")
    private List<AudioRecord> audioRecords;

    @SerializedName("current")
    private int current;

    @SerializedName(C6411.C6456.f16500)
    private int pages;

    @SerializedName("remainingPages")
    private int remainingPages;

    @SerializedName("total")
    private int total;

    static {
        NativeUtil.classesInit0(387);
    }

    public native List<AudioRecord> getAudioRecords();

    public native int getCurrent();

    public native int getPages();

    public native int getRemainingPages();

    public native int getTotal();

    public native void setAudioRecords(List<AudioRecord> list);

    public native void setCurrent(int i);

    public native void setPages(int i);

    public native void setRemainingPages(int i);

    public native void setTotal(int i);
}
