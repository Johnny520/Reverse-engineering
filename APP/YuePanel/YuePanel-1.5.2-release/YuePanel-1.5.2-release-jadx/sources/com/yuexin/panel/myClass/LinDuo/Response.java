package com.yuexin.panel.myClass.LinDuo;

import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class Response {

    @SerializedName("resCode")
    private Integer resCode;

    @SerializedName("resMsg")
    private String resMsg;

    @SerializedName("sheetList")
    private List<Sheet> sheetList;

    @SerializedName("videoList")
    private List<Video> videoList;

    static {
        NativeUtil.classesInit0(177);
    }

    public native Integer getResCode();

    public native String getResMsg();

    public native List<Sheet> getSheetList();

    public native List<Video> getVideoList();

    public native void setResCode(Integer num);

    public native void setResMsg(String str);

    public native void setSheetList(List<Sheet> list);

    public native void setVideoList(List<Video> list);
}
