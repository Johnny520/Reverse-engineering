.class final Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.flow.FlowKt__LogicKt"
    f = "Logic.kt"
    l = {
        0x77
    }
    m = "all"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$4:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlinx/coroutines/flow/飘花落叶言子苏楪世兰哲;

    .line 22
    .line 23
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$3:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$2:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 30
    .line 31
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 34
    .line 35
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 55
    .line 56
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lkotlinx/coroutines/flow/飘花落叶言子苏楪世兰哲;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/飘花落叶言子苏楪世兰哲;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$2:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$3:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->L$4:Ljava/lang/Object;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    iput v3, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->I$0:I

    .line 76
    .line 77
    iput v2, p0, Lkotlinx/coroutines/flow/FlowKt__LogicKt$all$1;->label:I
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    .line 79
    throw v1

    .line 80
    :catch_1
    move-exception v1

    .line 81
    move-object v4, v1

    .line 82
    move-object v1, p1

    .line 83
    move-object p1, v4

    .line 84
    :goto_0
    iget-object v3, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->owner:Ljava/lang/Object;

    .line 85
    .line 86
    if-ne v3, v0, :cond_2

    .line 87
    .line 88
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏世兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-boolean p0, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 96
    .line 97
    xor-int/2addr p0, v2

    .line 98
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_2
    throw p1
.end method
