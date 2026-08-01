.class public final Lbsh/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:Lbsh/NameSpace;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lbsh/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lbsh/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lbsh/NameSpace;

    .line 13
    .line 14
    iget-object v3, p1, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lbsh/NameSpace;

    .line 15
    .line 16
    if-ne v1, v3, :cond_1

    .line 17
    .line 18
    iget p0, p0, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    iget p1, p1, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    if-ne p0, p1, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, Lbsh/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method
