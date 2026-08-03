package com.yuexin.panel.myClass.LinDuo;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class LinMainItems {
    private String desc;

    /* JADX INFO: renamed from: id */
    private String f4199id;
    private boolean isPackage = false;
    private String name;
    private int packageCount;
    private long size;
    private String uploadName;
    private String uploadTime;
    private String url;

    static {
        NativeUtil.classesInit0(695);
    }

    public native String getDesc();

    public native String getId();

    public native String getName();

    public native int getPackageCount();

    public native long getSize();

    public native String getUploadName();

    public native String getUploadTime();

    public native String getUrl();

    public native boolean isPackage();

    public native void setDesc(String str);

    public native void setId(String str);

    public native void setName(String str);

    public native void setPackage(boolean z);

    public native void setPackageCount(int i);

    public native void setSize(long j);

    public native void setUploadName(String str);

    public native void setUploadTime(String str);

    public native void setUrl(String str);
}
