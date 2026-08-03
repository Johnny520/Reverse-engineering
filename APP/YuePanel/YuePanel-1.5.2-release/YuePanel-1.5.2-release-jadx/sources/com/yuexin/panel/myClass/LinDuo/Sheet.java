package com.yuexin.panel.myClass.LinDuo;

import Yue.C6411;
import Yue.C6468;
import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class Sheet {

    @SerializedName("desc")
    private String desc;

    @SerializedName("favCount")
    private Integer favCount;

    @SerializedName("isPrivate")
    private Boolean isPrivate;

    @SerializedName("modifyTime")
    private Long modifyTime;

    @SerializedName("orderMode")
    private Integer orderMode;

    @SerializedName("playCount")
    private Integer playCount;

    @SerializedName("ringCount")
    private Integer ringCount;

    @SerializedName("sheetId")
    private Integer sheetId;

    @SerializedName("sheetImg")
    private String sheetImg;

    @SerializedName("showInSquare")
    private Integer showInSquare;

    @SerializedName("tags")
    private List<Integer> tags;

    @SerializedName(C6411.C6442.f16441)
    private Long timestamp;

    @SerializedName(C6468.f16546)
    private String title;

    @SerializedName("uid")
    private String uid;

    @SerializedName("updateTime")
    private Long updateTime;

    static {
        NativeUtil.classesInit0(541);
    }

    public native String getDesc();

    public native Integer getFavCount();

    public native Long getModifyTime();

    public native Integer getOrderMode();

    public native Integer getPlayCount();

    public native Boolean getPrivate();

    public native Integer getRingCount();

    public native Integer getSheetId();

    public native String getSheetImg();

    public native Integer getShowInSquare();

    public native List<Integer> getTags();

    public native Long getTimestamp();

    public native String getTitle();

    public native String getUid();

    public native Long getUpdateTime();

    public native void setDesc(String str);

    public native void setFavCount(Integer num);

    public native void setModifyTime(Long l);

    public native void setOrderMode(Integer num);

    public native void setPlayCount(Integer num);

    public native void setPrivate(Boolean bool);

    public native void setRingCount(Integer num);

    public native void setSheetId(Integer num);

    public native void setSheetImg(String str);

    public native void setShowInSquare(Integer num);

    public native void setTags(List<Integer> list);

    public native void setTimestamp(Long l);

    public native void setTitle(String str);

    public native void setUid(String str);

    public native void setUpdateTime(Long l);
}
