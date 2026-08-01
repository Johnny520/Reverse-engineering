.class public final L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 8
    .line 9
    aget-byte v1, p0, v1

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "...("

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    array-length p0, p0

    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    invoke-static {v0, v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;)I
    .locals 4

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    iget-object v1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 5
    .line 6
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 7
    .line 8
    array-length v1, v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    aget-byte v2, p0, v1

    .line 17
    .line 18
    aget-byte v3, p1, v1

    .line 19
    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    and-int/lit16 p0, v2, 0xff

    .line 23
    .line 24
    and-int/lit16 p1, v3, 0xff

    .line 25
    .line 26
    :goto_1
    sub-int/2addr p0, p1

    .line 27
    return p0

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    array-length p0, p0

    .line 32
    array-length p1, p1

    .line 33
    goto :goto_1
.end method
