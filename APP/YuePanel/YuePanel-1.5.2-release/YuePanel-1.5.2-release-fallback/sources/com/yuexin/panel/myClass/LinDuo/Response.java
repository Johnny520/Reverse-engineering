package com.yuexin.panel.myClass.LinDuo;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class Response {

    @com.google.gson.annotations.SerializedName("resCode")
    private java.lang.Integer resCode;

    @com.google.gson.annotations.SerializedName("resMsg")
    private java.lang.String resMsg;

    @com.google.gson.annotations.SerializedName("sheetList")
    private java.util.List<com.yuexin.panel.myClass.LinDuo.Sheet> sheetList;

    @com.google.gson.annotations.SerializedName("videoList")
    private java.util.List<com.yuexin.panel.myClass.LinDuo.Video> videoList;

    static {
            r0 = 177(0xb1, float:2.48E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.lang.Integer getResCode();

    public native java.lang.String getResMsg();

    public native java.util.List<com.yuexin.panel.myClass.LinDuo.Sheet> getSheetList();

    public native java.util.List<com.yuexin.panel.myClass.LinDuo.Video> getVideoList();

    public native void setResCode(java.lang.Integer r1);

    public native void setResMsg(java.lang.String r1);

    public native void setSheetList(java.util.List<com.yuexin.panel.myClass.LinDuo.Sheet> r1);

    public native void setVideoList(java.util.List<com.yuexin.panel.myClass.LinDuo.Video> r1);
}
