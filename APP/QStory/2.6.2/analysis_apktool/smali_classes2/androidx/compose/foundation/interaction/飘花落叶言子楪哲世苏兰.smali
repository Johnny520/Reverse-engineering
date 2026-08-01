.class public final Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {v1, v0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method
