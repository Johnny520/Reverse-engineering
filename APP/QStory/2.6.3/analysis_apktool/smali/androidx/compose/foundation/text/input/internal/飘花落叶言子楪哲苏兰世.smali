.class public final Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicReference;

.field public final 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲(F)Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/input/internal/CursorAnimationState$snapToVisibleAndAnimate$2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/text/input/internal/CursorAnimationState$snapToVisibleAndAnimate$2;-><init>(Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
