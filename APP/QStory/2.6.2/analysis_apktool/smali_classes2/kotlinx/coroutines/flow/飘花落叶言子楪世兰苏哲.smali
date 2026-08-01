.class public final Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->label:I

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
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v4

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;

    .line 53
    .line 54
    iget-object v2, p2, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    invoke-interface {v2, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v6, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 61
    .line 62
    iget-object v7, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object v8, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 65
    .line 66
    if-eq v7, v8, :cond_3

    .line 67
    .line 68
    iget-object p2, p2, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 69
    .line 70
    invoke-interface {p2, v7, v2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p2, :cond_4

    .line 81
    .line 82
    :cond_3
    iput-object v2, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v3, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v3, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    iput v5, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2$emit$1;->label:I

    .line 89
    .line 90
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 91
    .line 92
    invoke-interface {p0, p1, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, v1, :cond_4

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_4
    return-object v4
.end method
