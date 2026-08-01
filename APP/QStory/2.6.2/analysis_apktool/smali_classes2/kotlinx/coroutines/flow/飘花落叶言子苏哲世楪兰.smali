.class public final Lkotlinx/coroutines/flow/飘花落叶言子苏哲世楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子苏哲世楪兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    iget-object p0, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v4, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v4, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v4, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v4, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    iput p2, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->I$0:I

    .line 68
    .line 69
    iput v3, v0, Lkotlinx/coroutines/flow/FlowKt__ShareKt$asFlow$$inlined$transform$1$1$1;->label:I

    .line 70
    .line 71
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 72
    .line 73
    invoke-interface {p0, p1, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 81
    .line 82
    return-object p0
.end method
