.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProfileAwemeListResult"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final hasMore:Z

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation
.end field

.field private final maxCursor:J

.field private final rawResponse:Ljava/lang/Object;

.field private final totalCount:I


# direct methods
.method public constructor <init>(ILjava/util/List;Ljava/lang/Object;ZJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;",
            "Ljava/lang/Object;",
            "ZJ)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 24
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 25
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 26
    iput-boolean p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 27
    iput-wide p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/Object;ZJILzq;)V
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x8

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move v4, p4

    .line 7
    and-int/lit8 p4, p7, 0x10

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const-wide/16 p5, 0x0

    .line 12
    .line 13
    :cond_1
    move-object v0, p0

    .line 14
    move v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move-object v3, p3

    .line 17
    move-wide v5, p5

    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;-><init>(ILjava/util/List;Ljava/lang/Object;ZJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;ILjava/util/List;Ljava/lang/Object;ZJILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
    .locals 0

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 14
    .line 15
    if-eqz p8, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 20
    .line 21
    if-eqz p8, :cond_3

    .line 22
    .line 23
    iget-boolean p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p7, p7, 0x10

    .line 26
    .line 27
    if-eqz p7, :cond_4

    .line 28
    .line 29
    iget-wide p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 30
    .line 31
    :cond_4
    move-wide p7, p5

    .line 32
    move-object p5, p3

    .line 33
    move p6, p4

    .line 34
    move p3, p1

    .line 35
    move-object p4, p2

    .line 36
    move-object p2, p0

    .line 37
    invoke-virtual/range {p2 .. p8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->copy(ILjava/util/List;Ljava/lang/Object;ZJ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

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
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final component2()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component5()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final copy(ILjava/util/List;Ljava/lang/Object;ZJ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;",
            "Ljava/lang/Object;",
            "ZJ)",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 5
    .line 6
    invoke-direct/range {p0 .. p6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;-><init>(ILjava/util/List;Ljava/lang/Object;ZJ)V

    .line 7
    .line 8
    .line 9
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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 12
    .line 13
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 14
    .line 15
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 21
    .line 22
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 43
    .line 44
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 50
    .line 51
    iget-wide p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 52
    .line 53
    cmp-long p0, v3, p0

    .line 54
    .line 55
    if-eqz p0, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    return v0
.end method

.method public final getHasMore()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getItems()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMaxCursor()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRawResponse()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTotalCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->γ(Ljava/util/List;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 35
    .line 36
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->totalCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->items:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->rawResponse:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->hasMore:Z

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->maxCursor:J

    .line 10
    .line 11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v6, "ProfileAwemeListResult(totalCount="

    .line 14
    .line 15
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", items="

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", rawResponse="

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", hasMore="

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", maxCursor="

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ")"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
