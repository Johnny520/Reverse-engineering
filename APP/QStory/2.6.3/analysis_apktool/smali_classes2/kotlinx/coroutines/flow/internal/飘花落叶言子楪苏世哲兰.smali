.class public final Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世哲兰;
.super Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;ILkotlinx/coroutines/channels/BufferOverflow;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    and-int/lit8 v1, p4, 0x4

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/4 p2, -0x3

    .line 14
    :cond_1
    and-int/lit8 p4, p4, 0x8

    .line 15
    .line 16
    if-eqz p4, :cond_2

    .line 17
    .line 18
    sget-object p3, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 19
    .line 20
    :cond_2
    invoke-direct {p0, p1, v0, p2, p3}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏世兰哲()Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method
