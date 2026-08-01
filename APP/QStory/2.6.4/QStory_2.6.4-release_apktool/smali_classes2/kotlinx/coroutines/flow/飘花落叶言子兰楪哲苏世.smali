.class public final Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世苏哲兰(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;->label:I

    .line 30
    .line 31
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-lez p1, :cond_3

    .line 53
    .line 54
    iget-object p2, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 55
    .line 56
    iget-boolean v2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    iput-boolean v4, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 61
    .line 62
    sget-object p2, Lkotlinx/coroutines/flow/SharingCommand;->START:Lkotlinx/coroutines/flow/SharingCommand;

    .line 63
    .line 64
    iput p1, v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;->I$0:I

    .line 65
    .line 66
    iput v4, v0, Lkotlinx/coroutines/flow/StartedLazily$command$1$1$emit$1;->label:I

    .line 67
    .line 68
    iget-object p0, p0, Lkotlinx/coroutines/flow/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 69
    .line 70
    invoke-interface {p0, p2, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    return-object v3
.end method
