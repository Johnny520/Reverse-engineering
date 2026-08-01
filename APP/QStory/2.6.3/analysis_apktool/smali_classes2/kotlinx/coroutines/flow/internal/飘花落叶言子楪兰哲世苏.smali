.class public final Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    invoke-static {p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p2, Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector$emitRef$1;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p2, p1, v0}, Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector$emitRef$1;-><init>(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1, p2}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 17
    .line 18
    return-object p0
.end method
