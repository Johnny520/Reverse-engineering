package com.yuexin.panel.myClass.LinDuo;

import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class Video {
    private static volatile /* synthetic */ String yue_xin_qwq0;

    @SerializedName("artist")
    public String artist;

    @SerializedName("aspect")
    public Double aspect;

    @SerializedName("comment_num")
    public Integer commentNum;

    @SerializedName("cover_url")
    public String coverUrl;

    @SerializedName("cover_url_ori")
    public String coverUrlOri;

    @SerializedName("head_url")
    public String headUrl;

    @SerializedName("name")
    public String name;

    @SerializedName("rid")
    public Long rid;

    @SerializedName("score")
    public Integer score;

    @SerializedName("share")
    public String share;

    @SerializedName("uid")
    public String uid;

    @SerializedName("video_url")
    public String videoUrl;

    static {
        NativeUtil.classesInit0(357);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    public native String getArtist();

    public native Double getAspect();

    public native Integer getCommentNum();

    public native String getCoverUrl();

    public native String getCoverUrlOri();

    public native String getHeadUrl();

    public native String getName();

    public native Long getRid();

    public native Integer getScore();

    public native String getShare();

    public native String getUid();

    public native String getVideoUrl();

    public native void setArtist(String str);

    public native void setAspect(Double d);

    public native void setCommentNum(Integer num);

    public native void setCoverUrl(String str);

    public native void setCoverUrlOri(String str);

    public native void setHeadUrl(String str);

    public native void setName(String str);

    public native void setRid(Long l);

    public native void setScore(Integer num);

    public native void setShare(String str);

    public native void setUid(String str);

    public native void setVideoUrl(String str);
}
