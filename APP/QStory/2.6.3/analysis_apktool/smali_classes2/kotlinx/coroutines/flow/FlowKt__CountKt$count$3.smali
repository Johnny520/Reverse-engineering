.class final Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;
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
    c = "kotlinx.coroutines.flow.FlowKt__CountKt"
    f = "Count.kt"
    l = {
        0x19
    }
    m = "count"
    v = 0x1
.end annotation


# instance fields
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
            "Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;",
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
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->label:I

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->label:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-ne v0, v2, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->L$2:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 39
    .line 40
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 43
    .line 44
    iget-object p0, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget p0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 52
    .line 53
    new-instance p1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 69
    .line 70
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->L$2:Ljava/lang/Object;

    .line 78
    .line 79
    iput v2, p0, Lkotlinx/coroutines/flow/FlowKt__CountKt$count$3;->label:I

    .line 80
    .line 81
    throw v1
.end method
