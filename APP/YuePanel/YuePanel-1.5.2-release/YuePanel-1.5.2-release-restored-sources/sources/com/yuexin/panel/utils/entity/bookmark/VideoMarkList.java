package com.yuexin.panel.utils.entity.bookmark;

import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class VideoMarkList {

    @SerializedName("create_time")
    private long createTime;

    @SerializedName("is_default")
    private boolean isDefault;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("list_uid")
    private String listUid;

    static {
        NativeUtil.classesInit0(1063);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VideoMarkList() {
    }

    public native long getCreateTime();

    public native String getListName();

    public native String getListUid();

    public native boolean isDefault();

    public native void setCreateTime(long j);

    public native void setDefault(boolean z);

    public native void setListName(String str);

    public native void setListUid(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public VideoMarkList(String str, boolean z) {
        this.listUid = UUID.randomUUID().toString();
        this.listName = str;
        this.isDefault = z;
        this.createTime = System.currentTimeMillis();
    }
}
