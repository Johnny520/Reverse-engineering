.class public abstract Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;
.super Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰世哲苏;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 16
    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    if-ne v0, v1, :cond_4

    .line 5
    .line 6
    invoke-interface {p2}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    new-instance v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    const/16 v3, 0x11

    .line 15
    .line 16
    invoke-direct {v2, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 20
    .line 21
    invoke-interface {v3, v1, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->fold(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    invoke-static {v0, v3, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Z)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 54
    .line 55
    if-ne p0, p1, :cond_5

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    sget-object v2, Lkotlin/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    invoke-interface {v1, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v0, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v3, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-interface {p2}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v2, p1, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰世哲苏;

    .line 79
    .line 80
    if-nez v2, :cond_3

    .line 81
    .line 82
    instance-of v2, p1, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲兰世苏;

    .line 83
    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-instance v2, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;

    .line 88
    .line 89
    invoke-direct {v2, p1, v0}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 90
    .line 91
    .line 92
    move-object p1, v2

    .line 93
    :cond_3
    :goto_1
    new-instance v0, Lkotlinx/coroutines/flow/internal/ChannelFlowOperator$collectWithContextUndispatched$2;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    invoke-direct {v0, p0, v2}, Lkotlinx/coroutines/flow/internal/ChannelFlowOperator$collectWithContextUndispatched$2;-><init>(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世兰哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {v1, p1, p0, v0, p2}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 108
    .line 109
    if-ne p0, p1, :cond_5

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    invoke-super {p0, p1, p2}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 117
    .line 118
    if-ne p0, p1, :cond_5

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 122
    .line 123
    return-object p0
.end method

.method public abstract 飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
.end method
