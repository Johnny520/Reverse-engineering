.class public abstract Lkotlinx/coroutines/flow/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lkotlinx/coroutines/flow/internal/SafeCollector;

    .line 42
    .line 43
    iget-object p1, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_5

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Lkotlinx/coroutines/flow/internal/SafeCollector;

    .line 63
    .line 64
    invoke-interface {v0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {p2, p1, v2}, Lkotlinx/coroutines/flow/internal/SafeCollector;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 69
    .line 70
    .line 71
    :try_start_1
    iput-object v3, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object p2, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->L$1:Ljava/lang/Object;

    .line 74
    .line 75
    iput v5, v0, Lkotlinx/coroutines/flow/AbstractFlow$collect$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 76
    .line 77
    :try_start_2
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子哲兰楪世苏;

    .line 78
    .line 79
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 80
    .line 81
    invoke-interface {p0, p2, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 85
    if-ne p0, v1, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move-object p0, v4

    .line 89
    :goto_1
    if-ne p0, v1, :cond_4

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_4
    move-object p0, p2

    .line 93
    :goto_2
    invoke-virtual {p0}, Lkotlinx/coroutines/flow/internal/SafeCollector;->releaseIntercepted()V

    .line 94
    .line 95
    .line 96
    return-object v4

    .line 97
    :goto_3
    move-object p1, p0

    .line 98
    goto :goto_4

    .line 99
    :catchall_1
    move-exception p0

    .line 100
    goto :goto_3

    .line 101
    :goto_4
    move-object p0, p2

    .line 102
    goto :goto_5

    .line 103
    :catchall_2
    move-exception p1

    .line 104
    goto :goto_4

    .line 105
    :goto_5
    invoke-virtual {p0}, Lkotlinx/coroutines/flow/internal/SafeCollector;->releaseIntercepted()V

    .line 106
    .line 107
    .line 108
    throw p1
.end method
