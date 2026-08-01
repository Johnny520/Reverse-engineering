.class final Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;
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
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt"
    f = "Limit.kt"
    l = {
        0x86
    }
    m = "collectWhile"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;",
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
    .locals 3

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->label:I

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
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlinx/coroutines/flow/飘花落叶言子世哲兰楪苏;

    .line 22
    .line 23
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 26
    .line 27
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lkotlinx/coroutines/flow/飘花落叶言子世哲兰楪苏;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    :try_start_1
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->L$2:Ljava/lang/Object;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->I$0:I

    .line 59
    .line 60
    iput v2, p0, Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1;->label:I
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    throw v1

    .line 63
    :goto_0
    iget-object v1, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->owner:Ljava/lang/Object;

    .line 64
    .line 65
    if-ne v1, v0, :cond_2

    .line 66
    .line 67
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏世兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    throw p1
.end method
