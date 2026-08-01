.class public final L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰世哲楪;
.super L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:[B


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏哲兰:[B

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
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏哲兰:[B

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏哲兰:[B

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Lkotlin/飘花落叶言子楪哲世兰苏;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lkotlin/飘花落叶言子楪哲世兰苏;-><init>([B)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
