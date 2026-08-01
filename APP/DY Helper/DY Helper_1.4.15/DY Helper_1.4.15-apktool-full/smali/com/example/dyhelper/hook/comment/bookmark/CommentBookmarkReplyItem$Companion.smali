.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 5
    .line 6
    const-string p0, "replyId"

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string p0, "authorName"

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string p0, "content"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string p0, "createTime"

    .line 34
    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    invoke-virtual {p1, p0, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
