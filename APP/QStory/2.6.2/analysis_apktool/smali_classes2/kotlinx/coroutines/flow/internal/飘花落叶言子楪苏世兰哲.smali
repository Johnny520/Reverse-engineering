.class public final Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    iput-object p4, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;-><init>(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$ObjectRef;

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
    iget-object p1, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 42
    .line 43
    iget-object p1, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 46
    .line 47
    iget-object p1, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

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
    iget-object p2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 65
    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    new-instance v2, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    .line 69
    .line 70
    invoke-direct {v2}, Lkotlinx/coroutines/flow/internal/ChildCancelledException;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {p2, v2}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p2, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v3, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    iput v2, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->I$0:I

    .line 84
    .line 85
    iput v5, v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$emit$1;->label:I

    .line 86
    .line 87
    invoke-interface {p2, v0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-ne p2, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    :goto_1
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 95
    .line 96
    new-instance v0, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$2;

    .line 97
    .line 98
    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;

    .line 99
    .line 100
    iget-object v2, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 101
    .line 102
    invoke-direct {v0, v1, v2, p1, v3}, Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$2;-><init>(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏哲世兰;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 106
    .line 107
    invoke-static {p0, v3, p2, v0, v5}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iput-object p0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 112
    .line 113
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 114
    .line 115
    return-object p0
.end method
