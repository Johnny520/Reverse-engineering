.class public final Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eq v2, v3, :cond_1

    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v4

    .line 43
    :cond_1
    iget-object p0, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 46
    .line 47
    iget-object p0, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 50
    .line 51
    iget-object p0, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 54
    .line 55
    iget-object p0, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 67
    .line 68
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;

    .line 72
    .line 73
    invoke-direct {v2, p2, p1}, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V

    .line 74
    .line 75
    .line 76
    iput-object v4, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v4, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v4, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v4, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->L$3:Ljava/lang/Object;

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    iput p1, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->I$0:I

    .line 86
    .line 87
    iput v3, v0, Lkotlinx/coroutines/flow/StartedLazily$command$$inlined$unsafeFlow$1$1;->label:I

    .line 88
    .line 89
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰苏哲世;

    .line 90
    .line 91
    invoke-static {p0, v2, v0}, Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪哲世苏兰(Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, v1, :cond_3

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_3
    :goto_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 99
    .line 100
    .line 101
    return-object v4
.end method
