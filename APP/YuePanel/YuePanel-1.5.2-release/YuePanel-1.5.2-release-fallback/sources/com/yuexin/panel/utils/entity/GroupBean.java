package com.yuexin.panel.utils.entity;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class GroupBean {
    private java.util.List<com.yuexin.panel.utils.entity.UserBean> array;
    private java.lang.String id;
    private java.lang.String name;
    private long time;

    static {
            r0 = 737(0x2e1, float:1.033E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public GroupBean() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.util.List<com.yuexin.panel.utils.entity.UserBean> getArray();

    public native java.lang.String getId();

    public native java.lang.String getName();

    public native long getTime();

    public native void setArray(java.util.List<com.yuexin.panel.utils.entity.UserBean> r1);

    public native void setId(java.lang.String r1);

    public native void setName(java.lang.String r1);

    public native void setTime(long r1);
}
