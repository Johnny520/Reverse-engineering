.class public final Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

.field public 飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

.field public 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$calculateNestedScrollScope$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$calculateNestedScrollScope$1;-><init>(Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 13
    .line 14
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(IJ)J
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世()Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏兰哲楪(IJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0

    .line 18
    :cond_1
    const-wide/16 p0, 0x0

    .line 19
    .line 20
    return-wide p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;->label:I

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
    iput v1, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;-><init>(Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;->label:I

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
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 51
    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世()Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_3
    if-eqz v3, :cond_5

    .line 59
    .line 60
    iput v4, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPreFling$1;->label:I

    .line 61
    .line 62
    invoke-virtual {v3, p1, p2, v0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰哲楪(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_4

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_4
    :goto_1
    check-cast p3, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 70
    .line 71
    iget-wide p0, p3, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const-wide/16 p0, 0x0

    .line 75
    .line 76
    :goto_2
    new-instance p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 77
    .line 78
    invoke-direct {p2, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 79
    .line 80
    .line 81
    return-object p2
.end method

.method public final 飘花落叶言子楪世苏兰哲(JJI)J
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世()Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    move-object v0, p0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-wide v1, p1

    .line 16
    move-wide v3, p3

    .line 17
    move v5, p5

    .line 18
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲楪苏世兰(JJI)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0

    .line 23
    :cond_1
    const-wide/16 p0, 0x0

    .line 24
    .line 25
    return-wide p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;->label:I

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
    iput v1, v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;-><init>(Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v2, p5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世()Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    move-object v0, v3

    .line 69
    :goto_2
    const-wide/16 v6, 0x0

    .line 70
    .line 71
    if-nez v0, :cond_6

    .line 72
    .line 73
    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 74
    .line 75
    if-eqz p0, :cond_9

    .line 76
    .line 77
    iput v5, p5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;->label:I

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p5}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲世兰(JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v1, :cond_5

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    :goto_3
    check-cast v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 87
    .line 88
    iget-wide v6, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 89
    .line 90
    goto :goto_6

    .line 91
    :cond_6
    iget-object p0, p0, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 92
    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世()Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_7
    move-object p0, v3

    .line 100
    if-eqz p0, :cond_9

    .line 101
    .line 102
    iput v4, p5, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher$dispatchPostFling$1;->label:I

    .line 103
    .line 104
    invoke-virtual/range {p0 .. p5}, Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲世兰(JJLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-ne v0, v1, :cond_8

    .line 109
    .line 110
    :goto_4
    return-object v1

    .line 111
    :cond_8
    :goto_5
    check-cast v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 112
    .line 113
    iget-wide v6, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:J

    .line 114
    .line 115
    :cond_9
    :goto_6
    new-instance p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 116
    .line 117
    invoke-direct {p0, v6, v7}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 118
    .line 119
    .line 120
    return-object p0
.end method
