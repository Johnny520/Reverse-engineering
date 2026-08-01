.class public L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;
.super Ljava/util/AbstractMap;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Map;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世兰苏哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public 飘花落叶言子楪兰苏世哲:I

.field public 飘花落叶言子楪哲兰世苏:L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    new-instance v0, L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    iget-object v0, p1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    iget p1, p1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 18
    .line 19
    iput p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, p1, v1, v0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;II)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世兰哲苏;-><init>(IL飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, p1, v1, v0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;II)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世兰哲苏;-><init>(IL飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    move v2, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    const/4 v5, 0x0

    .line 17
    move-object v6, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-virtual/range {v1 .. v6}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(ILjava/lang/Object;Ljava/lang/Object;IL飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iput-object p0, v6, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 25
    .line 26
    iget-object p0, v6, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 27
    .line 28
    return-object p0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5

    .line 1
    instance-of v0, p1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-nez v0, :cond_2

    .line 12
    .line 13
    instance-of v0, p1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v1

    .line 22
    :goto_1
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object v1, v0

    .line 30
    :cond_3
    :goto_2
    if-eqz v1, :cond_5

    .line 31
    .line 32
    new-instance p1, L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput v0, p1, L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 39
    .line 40
    iget v2, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 41
    .line 42
    iget-object v3, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 43
    .line 44
    iget-object v4, v1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4, v0, p1, p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰(L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;IL飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏哲兰;L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 54
    .line 55
    iget v0, v1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 56
    .line 57
    add-int/2addr v0, v2

    .line 58
    iget p1, p1, L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 59
    .line 60
    sub-int/2addr v0, p1

    .line 61
    if-eq v2, v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0, v0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void

    .line 67
    :cond_5
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 36
    iget-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/Object;IL飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    :cond_1
    iput-object p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 37
    iget-object p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    return-object p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v7

    .line 14
    :goto_0
    const/4 v5, 0x0

    .line 15
    move-object v6, p0

    .line 16
    move-object v3, p1

    .line 17
    move-object v4, p2

    .line 18
    invoke-virtual/range {v1 .. v6}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(ILjava/lang/Object;Ljava/lang/Object;IL飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    sget-object p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 25
    .line 26
    :cond_1
    iput-object p0, v6, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 27
    .line 28
    iget p0, v6, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 29
    .line 30
    if-eq v0, p0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    return v7
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-direct {v0, p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    iget p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:I

    .line 8
    .line 9
    return-void
.end method

.method public bridge 飘花落叶言子楪世苏兰哲()L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    invoke-virtual {p0}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰()L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    iget-object v2, v1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子世哲楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    new-instance v1, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    iget-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 20
    .line 21
    iget v2, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 22
    .line 23
    invoke-direct {v1, v0, v2}, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iput-object v1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    return-object v1
.end method
