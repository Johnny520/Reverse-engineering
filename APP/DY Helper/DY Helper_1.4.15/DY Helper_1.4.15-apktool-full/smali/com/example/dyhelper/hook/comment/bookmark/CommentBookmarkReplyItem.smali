.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;


# instance fields
.field private final authorName:Ljava/lang/String;

.field private final content:Ljava/lang/String;

.field private final createTime:J

.field private final replyId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 20
    .line 21
    if-eqz p6, :cond_3

    .line 22
    .line 23
    iget-wide p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 24
    .line 25
    :cond_3
    move-wide p6, p4

    .line 26
    move-object p4, p2

    .line 27
    move-object p5, p3

    .line 28
    move-object p2, p0

    .line 29
    move-object p3, p1

    .line 30
    invoke-virtual/range {p2 .. p7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 47
    .line 48
    iget-wide p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 49
    .line 50
    cmp-long p0, v3, p0

    .line 51
    .line 52
    if-eqz p0, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    return v0
.end method

.method public final getAuthorName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getReplyId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "replyId"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "authorName"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "content"

    .line 23
    .line 24
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "createTime"

    .line 31
    .line 32
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->replyId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->authorName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->content:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->createTime:J

    .line 8
    .line 9
    const-string p0, ", authorName="

    .line 10
    .line 11
    const-string v5, ", content="

    .line 12
    .line 13
    const-string v6, "CommentBookmarkReplyItem(replyId="

    .line 14
    .line 15
    invoke-static {v6, v0, p0, v1, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ", createTime="

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
