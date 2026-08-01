.class public final Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;

    .line 11
    .line 12
    invoke-static {p1, p0, p2}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    :cond_0
    return-object v1

    .line 22
    :pswitch_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1$1;

    .line 23
    .line 24
    check-cast p0, Landroidx/compose/foundation/text/飘花落叶言子楪兰苏世哲;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, p0, v2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1$1;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 31
    .line 32
    invoke-virtual {p1, v0, p2}, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 37
    .line 38
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    move-object v1, p0

    .line 41
    :cond_1
    return-object v1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
