.class public final Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
