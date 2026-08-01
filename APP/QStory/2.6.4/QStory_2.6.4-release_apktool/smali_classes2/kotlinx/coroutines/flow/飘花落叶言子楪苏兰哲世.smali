.class public final Lkotlinx/coroutines/flow/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of p1, p2, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    check-cast p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;

    .line 7
    .line 8
    iget v0, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->label:I

    .line 9
    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    and-int v2, v0, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    sub-int/2addr v0, v1

    .line 17
    iput v0, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;

    .line 21
    .line 22
    invoke-direct {p1, p0, p2}, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v0, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->label:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-ne v0, v2, :cond_3

    .line 36
    .line 37
    iget v0, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->I$1:I

    .line 38
    .line 39
    iget v3, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->I$0:I

    .line 40
    .line 41
    iget-object v4, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$4:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Ljava/util/Iterator;

    .line 44
    .line 45
    iget-object v5, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Ljava/lang/Iterable;

    .line 48
    .line 49
    iget-object v5, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 52
    .line 53
    iget-object v6, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 56
    .line 57
    iget-object v6, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v5, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$3:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v4, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$4:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$5:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->L$6:Ljava/lang/Object;

    .line 87
    .line 88
    iput v3, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->I$0:I

    .line 89
    .line 90
    iput v0, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->I$1:I

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    iput v6, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->I$2:I

    .line 94
    .line 95
    iput v2, p1, Lkotlinx/coroutines/flow/FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;->label:I

    .line 96
    .line 97
    invoke-interface {v5, p0, p1}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-ne p0, p2, :cond_1

    .line 102
    .line 103
    return-object p2

    .line 104
    :cond_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 108
    .line 109
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_4
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method
