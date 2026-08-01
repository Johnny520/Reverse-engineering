.class public final Lkotlinx/coroutines/flow/飘花落叶言子兰世楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子兰楪苏世哲;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lkotlinx/coroutines/flow/飘花落叶言子兰世楪苏哲;

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

.method public final hashCode()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const-wide v0, 0x7fffffffffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v0, p0

    .line 19
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance p0, Lkotlin/collections/builders/ListBuilder;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p0, v0}, Lkotlin/collections/builders/ListBuilder;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v0, "SharingStarted.WhileSubscribed("

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/16 v6, 0x3f

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/16 v1, 0x29

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰苏哲世;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .locals 7

    .line 1
    new-instance v1, Lkotlinx/coroutines/flow/StartedWhileSubscribed$command$1;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    invoke-direct {v1, p0, v6}, Lkotlinx/coroutines/flow/StartedWhileSubscribed$command$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子兰世楪苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    sget p0, Lkotlinx/coroutines/flow/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    new-instance v0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;

    .line 10
    .line 11
    sget-object v3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 12
    .line 13
    const/4 v4, -0x2

    .line 14
    sget-object v5, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lkotlinx/coroutines/flow/StartedWhileSubscribed$command$2;

    .line 21
    .line 22
    invoke-direct {p0, v6}, Lkotlinx/coroutines/flow/StartedWhileSubscribed$command$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Lkotlinx/coroutines/flow/飘花落叶言子世兰楪苏哲;

    .line 26
    .line 27
    invoke-direct {p1, v0, p0}, Lkotlinx/coroutines/flow/飘花落叶言子世兰楪苏哲;-><init>(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 28
    .line 29
    .line 30
    instance-of p0, p1, Lkotlinx/coroutines/flow/飘花落叶言子兰世楪哲苏;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 36
    .line 37
    sget-object v0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 38
    .line 39
    new-instance v1, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;

    .line 40
    .line 41
    invoke-direct {v1, p1, p0, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method
