.class public final Lkotlinx/coroutines/flow/飘花落叶言子苏楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of p1, p2, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    check-cast p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;

    .line 7
    .line 8
    iget v0, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->label:I

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
    iput v0, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;

    .line 21
    .line 22
    invoke-direct {p1, p0, p2}, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v0, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->label:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    if-ne v0, v2, :cond_3

    .line 36
    .line 37
    iget-object p1, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p2, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    iget-object p2, p0, Lkotlinx/coroutines/flow/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 53
    .line 54
    iput-boolean v2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 55
    .line 56
    :cond_1
    if-nez p1, :cond_2

    .line 57
    .line 58
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    new-instance p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v1, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    iput p0, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->I$0:I

    .line 84
    .line 85
    iput v2, p1, Lkotlinx/coroutines/flow/FlowKt__LogicKt$any$$inlined$collectWhile$1$1;->label:I

    .line 86
    .line 87
    throw v1
.end method
