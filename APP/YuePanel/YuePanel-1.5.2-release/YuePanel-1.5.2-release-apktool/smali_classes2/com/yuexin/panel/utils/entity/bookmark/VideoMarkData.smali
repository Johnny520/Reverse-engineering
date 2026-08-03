.class public Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private authorName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "author_name"
    .end annotation
.end field

.field private authorUid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "author_uid"
    .end annotation
.end field

.field private collectCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "collect_count"
    .end annotation
.end field

.field private commentUID:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "comment_uid"
    .end annotation
.end field

.field private createTime:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "create_time"
    .end annotation
.end field

.field private transient firstListName:Ljava/lang/String;

.field private transient firstListUid:Ljava/lang/String;

.field private forwardCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "forward_count"
    .end annotation
.end field

.field private likeCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "like_count"
    .end annotation
.end field

.field private listUids:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "list_uids"
    .end annotation
.end field

.field private markType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mark_type"
    .end annotation
.end field

.field private markUid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mark_uid"
    .end annotation
.end field

.field private replyCount:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "reply_count"
    .end annotation
.end field

.field private shareCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_count"
    .end annotation
.end field

.field private videoCover:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "video_cover"
    .end annotation
.end field

.field private videoTime:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "video_time"
    .end annotation
.end field

.field private videoTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "video_title"
    .end annotation
.end field

.field private videoUid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "video_uid"
    .end annotation
.end field

.field private videoUploadTime:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "video_upload_time"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28f

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->markUid:Ljava/lang/String;

    .line 4
    iput-wide p1, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->videoTime:J

    .line 5
    iput-object p3, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->videoTitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->videoUid:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->videoCover:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->markType:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->listUids:Ljava/lang/String;

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkData;->createTime:J

    return-void
.end method


# virtual methods
.method public native getAuthorName()Ljava/lang/String;
.end method

.method public native getAuthorUid()Ljava/lang/String;
.end method

.method public native getCollectCount()I
.end method

.method public native getCommentUID()Ljava/lang/String;
.end method

.method public native getCreateTime()J
.end method

.method public native getFirstListName()Ljava/lang/String;
.end method

.method public native getFirstListUid()Ljava/lang/String;
.end method

.method public native getForwardCount()I
.end method

.method public native getLikeCount()I
.end method

.method public native getListUids()Ljava/lang/String;
.end method

.method public native getMarkType()Ljava/lang/String;
.end method

.method public native getMarkUid()Ljava/lang/String;
.end method

.method public native getReplyCount()J
.end method

.method public native getShareCount()I
.end method

.method public native getVideoCover()Ljava/lang/String;
.end method

.method public native getVideoTime()J
.end method

.method public native getVideoTitle()Ljava/lang/String;
.end method

.method public native getVideoUid()Ljava/lang/String;
.end method

.method public native getVideoUploadTime()J
.end method

.method public native setAuthorName(Ljava/lang/String;)V
.end method

.method public native setAuthorUid(Ljava/lang/String;)V
.end method

.method public native setCollectCount(I)V
.end method

.method public native setCommentUID(Ljava/lang/String;)V
.end method

.method public native setCreateTime(J)V
.end method

.method public native setFirstListName(Ljava/lang/String;)V
.end method

.method public native setFirstListUid(Ljava/lang/String;)V
.end method

.method public native setForwardCount(I)V
.end method

.method public native setLikeCount(I)V
.end method

.method public native setListUids(Ljava/lang/String;)V
.end method

.method public native setReplyCount(J)V
.end method

.method public native setShareCount(I)V
.end method

.method public native setVideoTitle(Ljava/lang/String;)V
.end method

.method public native setVideoUploadTime(J)V
.end method
