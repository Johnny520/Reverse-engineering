.class public final Lcom/typesafe/config/impl/飘花落叶言子世哲楪兰苏;
.super Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世哲楪兰苏;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 15
    .line 16
    iget p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, v0

    .line 20
    :goto_0
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 25
    .line 26
    iget v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 27
    .line 28
    :cond_1
    if-ne p1, v0, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x29

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x29

    .line 10
    .line 11
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 16
    .line 17
    iget p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, -0x1

    .line 21
    :goto_0
    add-int/2addr p0, v0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\'\\n\'@"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 13
    .line 14
    iget p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/飘花落叶言子世哲楪兰苏;

    .line 2
    .line 3
    return p0
.end method
