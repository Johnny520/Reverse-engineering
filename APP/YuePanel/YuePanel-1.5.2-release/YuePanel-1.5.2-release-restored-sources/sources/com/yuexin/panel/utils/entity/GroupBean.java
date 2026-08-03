package com.yuexin.panel.utils.entity;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class GroupBean {
    private List<UserBean> array;

    /* JADX INFO: renamed from: id */
    private String f4214id;
    private String name;
    private long time;

    static {
        NativeUtil.classesInit0(737);
    }

    public native List<UserBean> getArray();

    public native String getId();

    public native String getName();

    public native long getTime();

    public native void setArray(List<UserBean> list);

    public native void setId(String str);

    public native void setName(String str);

    public native void setTime(long j);
}
