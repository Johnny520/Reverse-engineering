.class public abstract Landroidx/collection/飘花落叶言子苏楪世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Landroidx/collection/飘花落叶言子苏楪世哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p1, Landroidx/collection/飘花落叶言子苏楪世哲兰;

    .line 7
    .line 8
    iget v0, p1, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    iget v2, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v1, v2}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪(II)L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v2, v0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 24
    .line 25
    iget v0, v0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 26
    .line 27
    if-gt v2, v0, :cond_2

    .line 28
    .line 29
    :goto_0
    aget-object v3, p0, v2

    .line 30
    .line 31
    aget-object v4, p1, v2

    .line 32
    .line 33
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    return v1

    .line 40
    :cond_1
    if-eq v2, v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 2
    .line 3
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, p0, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v2

    .line 11
    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v4, v1

    .line 20
    :goto_1
    mul-int/lit8 v4, v4, 0x1f

    .line 21
    .line 22
    add-int/2addr v3, v4

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Landroidx/collection/ObjectList$toString$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/collection/ObjectList$toString$1;-><init>(Landroidx/collection/飘花落叶言子苏楪世哲兰;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "["

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 17
    .line 18
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, p0, :cond_2

    .line 22
    .line 23
    aget-object v4, v2, v3

    .line 24
    .line 25
    const/4 v5, -0x1

    .line 26
    if-ne v3, v5, :cond_0

    .line 27
    .line 28
    const-string p0, "..."

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const-string v5, ", "

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {v0, v4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/CharSequence;

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const-string p0, "]"

    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(I)V
    .locals 2

    .line 1
    const-string v0, "Index "

    .line 2
    .line 3
    const-string v1, " must be in 0.."

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    add-int/lit8 p0, p0, -0x1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final 飘花落叶言子楪世兰苏哲()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    :goto_0
    if-ge v1, p0, :cond_3

    .line 9
    .line 10
    aget-object p1, v0, v1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    :goto_1
    if-ge v1, p0, :cond_3

    .line 21
    .line 22
    aget-object v2, v0, v1

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    const/4 p0, -0x1

    .line 35
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p0, p0, p1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏(I)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    aget-object p0, p0, v0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "ObjectList is empty."

    .line 14
    .line 15
    invoke-static {p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method
