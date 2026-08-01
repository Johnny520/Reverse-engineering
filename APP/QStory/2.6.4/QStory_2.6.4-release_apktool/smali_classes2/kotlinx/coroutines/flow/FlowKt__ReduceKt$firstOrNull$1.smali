.class final Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.flow.FlowKt__ReduceKt"
    f = "Reduce.kt"
    l = {
        0xb3
    }
    m = "firstOrNull"
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
            "Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;",
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
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->label:I

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
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$3:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlinx/coroutines/flow/飘花落叶言子苏世哲兰楪;

    .line 22
    .line 23
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$2:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$1:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 30
    .line 31
    iget-object v2, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 34
    .line 35
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 51
    .line 52
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lkotlinx/coroutines/flow/飘花落叶言子苏世哲兰楪;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/飘花落叶言子苏世哲兰楪;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$2:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->L$3:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    iput v3, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->I$0:I

    .line 70
    .line 71
    iput v2, p0, Lkotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$1;->label:I
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    .line 72
    .line 73
    throw v1

    .line 74
    :catch_1
    move-exception v1

    .line 75
    move-object v4, v1

    .line 76
    move-object v1, p1

    .line 77
    move-object p1, v4

    .line 78
    :goto_0
    iget-object v2, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->owner:Ljava/lang/Object;

    .line 79
    .line 80
    if-ne v2, v0, :cond_2

    .line 81
    .line 82
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    iget-object p0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_2
    throw p1
.end method
