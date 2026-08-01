.class final Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    c = "kotlinx.coroutines.flow.FlowKt__ReduceKt"
    f = "Reduce.kt"
    l = {
        0xb3
    }
    m = "singleOrNull"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;",
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
    .locals 6

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sget-object v2, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    iput v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->label:I

    .line 12
    .line 13
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$3:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lkotlinx/coroutines/flow/飘花落叶言子苏哲楪兰世;

    .line 24
    .line 25
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$2:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$1:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 32
    .line 33
    iget-object v4, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 53
    .line 54
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v0, Lkotlinx/coroutines/flow/飘花落叶言子苏哲楪兰世;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/飘花落叶言子苏哲楪兰世;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$2:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->L$3:Ljava/lang/Object;

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    iput v4, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->I$0:I

    .line 74
    .line 75
    iput v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$singleOrNull$1;->label:I
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    .line 76
    .line 77
    throw v3

    .line 78
    :catch_1
    move-exception v1

    .line 79
    move-object v5, v1

    .line 80
    move-object v1, p1

    .line 81
    move-object p1, v5

    .line 82
    :goto_0
    iget-object v4, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->owner:Ljava/lang/Object;

    .line 83
    .line 84
    if-ne v4, v0, :cond_3

    .line 85
    .line 86
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏世兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object p0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 94
    .line 95
    if-ne p0, v2, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move-object v3, p0

    .line 99
    :goto_2
    return-object v3

    .line 100
    :cond_3
    throw p1
.end method
