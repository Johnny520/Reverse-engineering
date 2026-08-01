.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Summary"
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final failed:I

.field private final queried:I

.field private final skipped:I

.field private final total:I

.field private final updated:I


# direct methods
.method public constructor <init>(IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 5
    .line 6
    iput p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 7
    .line 8
    iput p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 9
    .line 10
    iput p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 11
    .line 12
    iput p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;IIIIIILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 20
    .line 21
    if-eqz p7, :cond_3

    .line 22
    .line 23
    iget p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    .line 29
    iget p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 30
    .line 31
    :cond_4
    move p6, p4

    .line 32
    move p7, p5

    .line 33
    move p4, p2

    .line 34
    move p5, p3

    .line 35
    move-object p2, p0

    .line 36
    move p3, p1

    .line 37
    invoke-virtual/range {p2 .. p7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->copy(IIIII)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    return p0
.end method

.method public final component2()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 2
    .line 3
    return p0
.end method

.method public final component3()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 2
    .line 3
    return p0
.end method

.method public final component4()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 2
    .line 3
    return p0
.end method

.method public final component5()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(IIIII)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;
    .locals 0

    .line 1
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 2
    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;-><init>(IIIII)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 12
    .line 13
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 14
    .line 15
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 21
    .line 22
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 28
    .line 29
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 35
    .line 36
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 42
    .line 43
    iget p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 44
    .line 45
    if-eq p0, p1, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    return v0
.end method

.method public final getFailed()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 2
    .line 3
    return p0
.end method

.method public final getQueried()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSkipped()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTotal()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    return p0
.end method

.method public final getUpdated()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 4
    .line 5
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 6
    .line 7
    iget v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 8
    .line 9
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 10
    .line 11
    const-string v4, ", queried="

    .line 12
    .line 13
    const-string v5, ", updated="

    .line 14
    .line 15
    const-string v6, "Summary(total="

    .line 16
    .line 17
    invoke-static {v6, v0, v4, v1, v5}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, ", skipped="

    .line 22
    .line 23
    const-string v4, ", failed="

    .line 24
    .line 25
    invoke-static {v0, v2, v1, v3, v4}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final toastText()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->queried:I

    .line 2
    .line 3
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->total:I

    .line 4
    .line 5
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->updated:I

    .line 6
    .line 7
    iget v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->skipped:I

    .line 8
    .line 9
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->failed:I

    .line 10
    .line 11
    const-string v4, "/"

    .line 12
    .line 13
    const-string v5, "\uff0c\u65b0\u56de\u590d "

    .line 14
    .line 15
    const-string v6, "\u67e5\u8be2\u5b8c\u6210\uff1a\u6210\u529f "

    .line 16
    .line 17
    invoke-static {v6, v0, v4, v1, v5}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "\uff0c\u8df3\u8fc7 "

    .line 22
    .line 23
    const-string v4, "\uff0c\u5931\u8d25 "

    .line 24
    .line 25
    invoke-static {v0, v2, v1, v3, v4}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
