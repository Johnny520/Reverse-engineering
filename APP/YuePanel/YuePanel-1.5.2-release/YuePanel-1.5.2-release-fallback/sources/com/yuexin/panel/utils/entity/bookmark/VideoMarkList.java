package com.yuexin.panel.utils.entity.bookmark;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class VideoMarkList {

    @com.google.gson.annotations.SerializedName("create_time")
    private long createTime;

    @com.google.gson.annotations.SerializedName("is_default")
    private boolean isDefault;

    @com.google.gson.annotations.SerializedName("list_name")
    private java.lang.String listName;

    @com.google.gson.annotations.SerializedName("list_uid")
    private java.lang.String listUid;

    static {
            r0 = 1063(0x427, float:1.49E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public VideoMarkList() {
            r0 = this;
            r0.<init>()
            return
    }

    public VideoMarkList(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.listUid = r0
            r1.listName = r2
            r1.isDefault = r3
            long r2 = java.lang.System.currentTimeMillis()
            r1.createTime = r2
            return
    }

    public native long getCreateTime();

    public native java.lang.String getListName();

    public native java.lang.String getListUid();

    public native boolean isDefault();

    public native void setCreateTime(long r1);

    public native void setDefault(boolean r1);

    public native void setListName(java.lang.String r1);

    public native void setListUid(java.lang.String r1);
}
