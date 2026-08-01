.class public final Landroidx/compose/foundation/text/selection/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-wide v0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    iget-wide v2, v2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    const-wide v4, 0x7fffffff7fffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, v4

    .line 21
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v2, v2, v6

    .line 27
    .line 28
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    and-long/2addr v4, v0

    .line 33
    cmp-long v2, v4, v6

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    iget-wide v4, v2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 44
    .line 45
    const-wide v6, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v4, v6

    .line 51
    long-to-int v2, v4

    .line 52
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    and-long v4, v0, v6

    .line 57
    .line 58
    long-to-int v4, v4

    .line 59
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    cmpg-float v2, v2, v4

    .line 64
    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance p2, Landroidx/compose/foundation/text/selection/SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-direct {p2, p1, v0, v1, v2}, Landroidx/compose/foundation/text/selection/SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1;-><init>(Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x3

    .line 75
    iget-object p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 76
    .line 77
    invoke-static {p0, v2, v2, p2, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 78
    .line 79
    .line 80
    return-object v3

    .line 81
    :cond_1
    :goto_0
    new-instance p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    invoke-direct {p0, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p0, p2}, Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 91
    .line 92
    if-ne p0, p1, :cond_2

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_2
    return-object v3
.end method
