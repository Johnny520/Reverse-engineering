.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "QueryOptions"
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final delayBetweenItemsMs:J

.field private final loadReplyWhenCountIncreased:Z

.field private final notifyIfNew:Z


# direct methods
.method public constructor <init>(ZJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;ZJZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 14
    .line 15
    if-eqz p5, :cond_2

    .line 16
    .line 17
    iget-boolean p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->copy(ZJZ)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component2()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component3()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 2
    .line 3
    return p0
.end method

.method public final copy(ZJZ)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;
    .locals 0

    .line 1
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;-><init>(ZJZ)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 21
    .line 22
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 23
    .line 24
    cmp-long v1, v3, v5

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 30
    .line 31
    iget-boolean p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    return v0
.end method

.method public final getDelayBetweenItemsMs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLoadReplyWhenCountIncreased()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getNotifyIfNew()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->loadReplyWhenCountIncreased:Z

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->delayBetweenItemsMs:J

    .line 4
    .line 5
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->notifyIfNew:Z

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v4, "QueryOptions(loadReplyWhenCountIncreased="

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", delayBetweenItemsMs="

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", notifyIfNew="

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
