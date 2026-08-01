.class public final Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;
.super Landroidx/compose/animation/飘花落叶言子世哲兰楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Landroidx/compose/animation/core/飘花落叶言子苏世哲楪兰;

.field public 飘花落叶言子世苏哲楪兰:J

.field public 飘花落叶言子世苏楪兰哲:Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子世苏楪哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;


# virtual methods
.method public final 飘花落叶言子哲苏世兰楪()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:J

    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 7

    .line 1
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏楪兰世哲()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const-wide v0, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 p4, 0x20

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget p3, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 19
    .line 20
    iget v2, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 21
    .line 22
    int-to-long v3, p3

    .line 23
    shl-long/2addr v3, p4

    .line 24
    int-to-long v5, v2

    .line 25
    and-long/2addr v5, v0

    .line 26
    or-long v2, v3, v5

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p3, p0, Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:Landroidx/compose/animation/core/飘花落叶言子苏世哲楪兰;

    .line 30
    .line 31
    iget v2, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 32
    .line 33
    if-nez p3, :cond_1

    .line 34
    .line 35
    iget p3, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 36
    .line 37
    int-to-long v2, v2

    .line 38
    shl-long/2addr v2, p4

    .line 39
    int-to-long v4, p3

    .line 40
    and-long/2addr v4, v0

    .line 41
    or-long/2addr v2, v4

    .line 42
    iput-wide v2, p0, Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget v3, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 46
    .line 47
    int-to-long v4, v2

    .line 48
    shl-long/2addr v4, p4

    .line 49
    int-to-long v2, v3

    .line 50
    and-long/2addr v2, v0

    .line 51
    or-long/2addr v2, v4

    .line 52
    new-instance v4, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1;

    .line 53
    .line 54
    invoke-direct {v4, p0, v2, v3}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1;-><init>(Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;J)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2;

    .line 58
    .line 59
    invoke-direct {v5, p0, v2, v3}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2;-><init>(Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;J)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, v4, v5}, Landroidx/compose/animation/core/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/animation/core/飘花落叶言子苏世楪兰哲;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    iget-object v2, p0, Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;

    .line 67
    .line 68
    iput-object p3, v2, Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/animation/core/飘花落叶言子苏世楪兰哲;

    .line 69
    .line 70
    invoke-virtual {p3}, Landroidx/compose/animation/core/飘花落叶言子苏世楪兰哲;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 75
    .line 76
    iget-wide v2, v2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 77
    .line 78
    invoke-virtual {p3}, Landroidx/compose/animation/core/飘花落叶言子苏世楪兰哲;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    check-cast p3, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 83
    .line 84
    iget-wide v4, p3, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 85
    .line 86
    iput-wide v4, p0, Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:J

    .line 87
    .line 88
    :goto_0
    shr-long p3, v2, p4

    .line 89
    .line 90
    long-to-int p3, p3

    .line 91
    and-long/2addr v0, v2

    .line 92
    long-to-int p4, v0

    .line 93
    new-instance v0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1;

    .line 94
    .line 95
    invoke-direct {v0, p0, p2, v2, v3}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1;-><init>(Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;J)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p3, p4, v0}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
