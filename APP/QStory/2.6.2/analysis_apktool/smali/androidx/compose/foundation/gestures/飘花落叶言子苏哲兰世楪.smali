.class public abstract Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-direct {p1, p2}, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 17
    .line 18
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-boolean v4, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:Z

    .line 51
    .line 52
    new-instance p2, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$2;

    .line 53
    .line 54
    invoke-direct {p2, p0, p1, v3}, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$2;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 55
    .line 56
    .line 57
    iput v4, v0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogic$userScroll$1;->label:I

    .line 58
    .line 59
    new-instance p1, Lkotlinx/coroutines/飘花落叶言子哲楪苏世兰;

    .line 60
    .line 61
    invoke-interface {v0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {p1, v0, v2}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏世兰;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v4, p1, p2}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏(Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏世兰;ZLkotlinx/coroutines/internal/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:Z

    .line 77
    .line 78
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 79
    .line 80
    return-object p0
.end method
