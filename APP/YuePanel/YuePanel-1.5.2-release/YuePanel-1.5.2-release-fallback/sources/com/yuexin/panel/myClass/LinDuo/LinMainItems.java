package com.yuexin.panel.myClass.LinDuo;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class LinMainItems {
    private java.lang.String desc;
    private java.lang.String id;
    private boolean isPackage;
    private java.lang.String name;
    private int packageCount;
    private long size;
    private java.lang.String uploadName;
    private java.lang.String uploadTime;
    private java.lang.String url;

    static {
            r0 = 695(0x2b7, float:9.74E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public LinMainItems() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isPackage = r0
            return
    }

    public native java.lang.String getDesc();

    public native java.lang.String getId();

    public native java.lang.String getName();

    public native int getPackageCount();

    public native long getSize();

    public native java.lang.String getUploadName();

    public native java.lang.String getUploadTime();

    public native java.lang.String getUrl();

    public native boolean isPackage();

    public native void setDesc(java.lang.String r1);

    public native void setId(java.lang.String r1);

    public native void setName(java.lang.String r1);

    public native void setPackage(boolean r1);

    public native void setPackageCount(int r1);

    public native void setSize(long r1);

    public native void setUploadName(java.lang.String r1);

    public native void setUploadTime(java.lang.String r1);

    public native void setUrl(java.lang.String r1);
}
