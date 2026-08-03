package com.yuexin.panel.utils.entity.bookmark;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3482
public class VideoMarkData {

    @com.google.gson.annotations.SerializedName("author_name")
    private java.lang.String authorName;

    @com.google.gson.annotations.SerializedName("author_uid")
    private java.lang.String authorUid;

    @com.google.gson.annotations.SerializedName("collect_count")
    private int collectCount;

    @com.google.gson.annotations.SerializedName("comment_uid")
    private java.lang.String commentUID;

    @com.google.gson.annotations.SerializedName("create_time")
    private long createTime;
    private transient java.lang.String firstListName;
    private transient java.lang.String firstListUid;

    @com.google.gson.annotations.SerializedName("forward_count")
    private int forwardCount;

    @com.google.gson.annotations.SerializedName("like_count")
    private int likeCount;

    @com.google.gson.annotations.SerializedName("list_uids")
    private java.lang.String listUids;

    @com.google.gson.annotations.SerializedName("mark_type")
    private java.lang.String markType;

    @com.google.gson.annotations.SerializedName("mark_uid")
    private java.lang.String markUid;

    @com.google.gson.annotations.SerializedName("reply_count")
    private long replyCount;

    @com.google.gson.annotations.SerializedName("share_count")
    private int shareCount;

    @com.google.gson.annotations.SerializedName("video_cover")
    private java.lang.String videoCover;

    @com.google.gson.annotations.SerializedName("video_time")
    private long videoTime;

    @com.google.gson.annotations.SerializedName("video_title")
    private java.lang.String videoTitle;

    @com.google.gson.annotations.SerializedName("video_uid")
    private java.lang.String videoUid;

    @com.google.gson.annotations.SerializedName("video_upload_time")
    private long videoUploadTime;

    static {
            r0 = 655(0x28f, float:9.18E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public VideoMarkData() {
            r0 = this;
            r0.<init>()
            return
    }

    public VideoMarkData(long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r1 = this;
            r1.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.markUid = r0
            r1.videoTime = r2
            r1.videoTitle = r4
            r1.videoUid = r5
            r1.videoCover = r6
            r1.markType = r7
            r1.listUids = r8
            long r2 = java.lang.System.currentTimeMillis()
            r1.createTime = r2
            return
    }

    public native java.lang.String getAuthorName();

    public native java.lang.String getAuthorUid();

    public native int getCollectCount();

    public native java.lang.String getCommentUID();

    public native long getCreateTime();

    public native java.lang.String getFirstListName();

    public native java.lang.String getFirstListUid();

    public native int getForwardCount();

    public native int getLikeCount();

    public native java.lang.String getListUids();

    public native java.lang.String getMarkType();

    public native java.lang.String getMarkUid();

    public native long getReplyCount();

    public native int getShareCount();

    public native java.lang.String getVideoCover();

    public native long getVideoTime();

    public native java.lang.String getVideoTitle();

    public native java.lang.String getVideoUid();

    public native long getVideoUploadTime();

    public native void setAuthorName(java.lang.String r1);

    public native void setAuthorUid(java.lang.String r1);

    public native void setCollectCount(int r1);

    public native void setCommentUID(java.lang.String r1);

    public native void setCreateTime(long r1);

    public native void setFirstListName(java.lang.String r1);

    public native void setFirstListUid(java.lang.String r1);

    public native void setForwardCount(int r1);

    public native void setLikeCount(int r1);

    public native void setListUids(java.lang.String r1);

    public native void setReplyCount(long r1);

    public native void setShareCount(int r1);

    public native void setVideoTitle(java.lang.String r1);

    public native void setVideoUploadTime(long r1);
}
