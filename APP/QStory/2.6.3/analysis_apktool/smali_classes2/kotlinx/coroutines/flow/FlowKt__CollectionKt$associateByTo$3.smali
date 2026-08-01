.class final Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "M::",
        "Ljava/util/Map<",
        "-TK;-TV;>;>",
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
    c = "kotlinx.coroutines.flow.FlowKt__CollectionKt"
    f = "Collection.kt"
    l = {
        0xa2
    }
    m = "associateByTo"
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
            "Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;",
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
    iput-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->label:I

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
    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->label:I

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
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$3:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 39
    .line 40
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 43
    .line 44
    iget-object v0, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/util/Map;

    .line 47
    .line 48
    iget-object p0, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$2:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->L$3:Ljava/lang/Object;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    iput p1, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->I$0:I

    .line 75
    .line 76
    iput v2, p0, Lkotlinx/coroutines/flow/FlowKt__CollectionKt$associateByTo$3;->label:I

    .line 77
    .line 78
    throw v1
.end method
