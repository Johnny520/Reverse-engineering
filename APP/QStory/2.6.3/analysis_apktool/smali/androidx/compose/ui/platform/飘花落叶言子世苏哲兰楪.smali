.class public final Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReference;

.field public final 飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;

.field public final 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    .locals 5

    .line 1
    instance-of v0, p2, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;->label:I

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
    iput v1, v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;-><init>(Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eq v2, v4, :cond_1

    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;

    .line 51
    .line 52
    invoke-direct {p2, p1, p0}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;-><init>(Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3;

    .line 56
    .line 57
    invoke-direct {p1, p0, v3}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3;-><init>(Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 58
    .line 59
    .line 60
    iput v4, v0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$1;->label:I

    .line 61
    .line 62
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    .line 64
    invoke-static {p0, p2, p1, v0}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/util/concurrent/atomic/AtomicReference;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-ne p0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 72
    .line 73
    .line 74
    return-object v3
.end method
