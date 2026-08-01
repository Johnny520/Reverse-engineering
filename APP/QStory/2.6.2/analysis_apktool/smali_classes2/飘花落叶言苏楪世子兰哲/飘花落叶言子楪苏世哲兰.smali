.class public final synthetic L飘花落叶言苏楪世子兰哲/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;


# virtual methods
.method public final synthetic annotationType()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-interface {p1}, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;->number()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 p1, 0x1

    .line 13
    if-eq p1, p0, :cond_1

    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const-wide v0, -0x36a5872f051405a7L    # -2.3613758469527734E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    mul-int/lit8 p0, p0, 0x7f

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    xor-int/2addr p0, v0

    .line 22
    return p0
.end method

.method public final synthetic number()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a58716051405a7L    # -2.3614098751894655E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "1)"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
