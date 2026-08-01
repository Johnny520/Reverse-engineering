.class public final L飘花落叶言世哲子苏楪兰/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世哲子苏楪兰/飘花落叶言子苏世楪哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:[C


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[C

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge v1, p1, :cond_1

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    mul-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    if-ge p1, v1, :cond_0

    .line 10
    .line 11
    move p1, v1

    .line 12
    :cond_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[C

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[C

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
