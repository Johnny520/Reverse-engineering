package com.yuexin.panel.utils.entity.bookmark;

import Yue.InterfaceC5615;
import com.google.gson.annotations.SerializedName;
import com.nmmedit.protect.NativeUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class VideoMarkData {

    @SerializedName("author_name")
    private String authorName;

    @SerializedName("author_uid")
    private String authorUid;

    @SerializedName("collect_count")
    private int collectCount;

    @SerializedName("comment_uid")
    private String commentUID;

    @SerializedName("create_time")
    private long createTime;
    private transient String firstListName;
    private transient String firstListUid;

    @SerializedName("forward_count")
    private int forwardCount;

    @SerializedName("like_count")
    private int likeCount;

    @SerializedName("list_uids")
    private String listUids;

    @SerializedName("mark_type")
    private String markType;

    @SerializedName("mark_uid")
    private String markUid;

    @SerializedName("reply_count")
    private long replyCount;

    @SerializedName("share_count")
    private int shareCount;

    @SerializedName("video_cover")
    private String videoCover;

    @SerializedName("video_time")
    private long videoTime;

    @SerializedName("video_title")
    private String videoTitle;

    @SerializedName("video_uid")
    private String videoUid;

    @SerializedName("video_upload_time")
    private long videoUploadTime;

    static {
        NativeUtil.classesInit0(655);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VideoMarkData() {
    }

    public native String getAuthorName();

    public native String getAuthorUid();

    public native int getCollectCount();

    public native String getCommentUID();

    public native long getCreateTime();

    public native String getFirstListName();

    public native String getFirstListUid();

    public native int getForwardCount();

    public native int getLikeCount();

    public native String getListUids();

    public native String getMarkType();

    public native String getMarkUid();

    public native long getReplyCount();

    public native int getShareCount();

    public native String getVideoCover();

    public native long getVideoTime();

    public native String getVideoTitle();

    public native String getVideoUid();

    public native long getVideoUploadTime();

    public native void setAuthorName(String str);

    public native void setAuthorUid(String str);

    public native void setCollectCount(int i);

    public native void setCommentUID(String str);

    public native void setCreateTime(long j);

    public native void setFirstListName(String str);

    public native void setFirstListUid(String str);

    public native void setForwardCount(int i);

    public native void setLikeCount(int i);

    public native void setListUids(String str);

    public native void setReplyCount(long j);

    public native void setShareCount(int i);

    public native void setVideoTitle(String str);

    public native void setVideoUploadTime(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public VideoMarkData(long j, String str, String str2, String str3, String str4, String str5) {
        this.markUid = UUID.randomUUID().toString();
        this.videoTime = j;
        this.videoTitle = str;
        this.videoUid = str2;
        this.videoCover = str3;
        this.markType = str4;
        this.listUids = str5;
        this.createTime = System.currentTimeMillis();
    }
}
