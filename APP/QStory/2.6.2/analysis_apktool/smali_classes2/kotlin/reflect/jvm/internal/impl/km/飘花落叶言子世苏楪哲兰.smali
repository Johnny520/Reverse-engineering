.class public final Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public 飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;

    .line 10
    .line 11
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

    .line 12
    .line 13
    iget-object v1, p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "KmFlexibleTypeUpperBound(type="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", typeFlexibilityId="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
