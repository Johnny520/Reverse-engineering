.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;
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

.field private final total:I

.field private final updated:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 5
    .line 6
    iput p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 7
    .line 8
    iput p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 9
    .line 10
    iput p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;IIIIILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->copy(IIII)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    return p0
.end method

.method public final component2()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 2
    .line 3
    return p0
.end method

.method public final component3()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 2
    .line 3
    return p0
.end method

.method public final component4()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(IIII)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;
    .locals 0

    .line 1
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;-><init>(IIII)V

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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 12
    .line 13
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 14
    .line 15
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 21
    .line 22
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 28
    .line 29
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 35
    .line 36
    iget p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 37
    .line 38
    if-eq p0, p1, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    return v0
.end method

.method public final getFailed()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 2
    .line 3
    return p0
.end method

.method public final getQueried()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTotal()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    return p0
.end method

.method public final getUpdated()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

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
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 2
    .line 3
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 4
    .line 5
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 6
    .line 7
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 8
    .line 9
    const-string v3, ", queried="

    .line 10
    .line 11
    const-string v4, ", updated="

    .line 12
    .line 13
    const-string v5, "Summary(total="

    .line 14
    .line 15
    invoke-static {v5, v0, v3, v1, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", failed="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ")"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final toastText()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->queried:I

    .line 2
    .line 3
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->total:I

    .line 4
    .line 5
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->updated:I

    .line 6
    .line 7
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->failed:I

    .line 8
    .line 9
    const-string v3, "/"

    .line 10
    .line 11
    const-string v4, "\uff0c\u65b0\u4f5c\u54c1 "

    .line 12
    .line 13
    const-string v5, "\u4e3b\u9875\u67e5\u8be2\u5b8c\u6210\uff1a\u6210\u529f "

    .line 14
    .line 15
    invoke-static {v5, v0, v3, v1, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\uff0c\u5931\u8d25 "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
