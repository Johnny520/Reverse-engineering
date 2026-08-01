.class public final Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲兰世苏:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子哲楪苏世兰(JJI)J
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;

    .line 8
    .line 9
    invoke-interface {p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;

    .line 17
    .line 18
    invoke-virtual {p0, p3, p4}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-interface {p1, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世兰苏哲(F)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(F)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    return-wide p0

    .line 39
    :cond_1
    :goto_0
    const-wide/16 p0, 0x0

    .line 40
    .line 41
    return-wide p0
.end method

.method public final 飘花落叶言子苏楪哲世兰(JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of p1, p5, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;

    .line 7
    .line 8
    iget p2, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->label:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;

    .line 21
    .line 22
    invoke-direct {p1, p0, p5}, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v0, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->label:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    iget-wide p3, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->J$0:J

    .line 37
    .line 38
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    iget-boolean p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲兰世苏:Z

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    if-eqz p2, :cond_5

    .line 57
    .line 58
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 59
    .line 60
    iget-boolean p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲世兰:Z

    .line 61
    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iput-wide p3, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->J$0:J

    .line 66
    .line 67
    iput v1, p1, Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection$onPostFling$1;->label:I

    .line 68
    .line 69
    invoke-virtual {p0, p3, p4, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世苏哲兰(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, p5, :cond_4

    .line 74
    .line 75
    return-object p5

    .line 76
    :cond_4
    :goto_1
    check-cast p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 77
    .line 78
    iget-wide v2, p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 79
    .line 80
    :goto_2
    invoke-static {p3, p4, v2, v3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    :cond_5
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 85
    .line 86
    invoke-direct {p0, v2, v3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method
