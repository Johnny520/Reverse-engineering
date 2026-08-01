.class public final Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;
.super Lkotlinx/coroutines/flow/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/flow/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    move-object p1, p0

    .line 40
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput v4, v0, Lkotlinx/coroutines/flow/CallbackFlowBuilder$collectTo$1;->label:I

    .line 58
    .line 59
    invoke-super {p0, p1, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;

    .line 67
    .line 68
    iget-object p0, p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 69
    .line 70
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_4
    const-string p0, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    .line 80
    .line 81
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v3
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lkotlinx/coroutines/flow/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
