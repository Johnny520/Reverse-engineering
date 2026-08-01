.class final Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/animation/EnterExitState;",
        "it",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
        "invoke-Bjo55l4",
        "(Landroidx/compose/animation/EnterExitState;)J",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $target:J

.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2;->this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2;->$target:J

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroidx/compose/animation/EnterExitState;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2;->invoke-Bjo55l4(Landroidx/compose/animation/EnterExitState;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke-Bjo55l4(Landroidx/compose/animation/EnterExitState;)J
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2;->this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    iget-wide v2, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2;->$target:J

    .line 4
    .line 5
    iget-object p0, v0, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子世哲苏楪兰:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪()Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object p0, v0, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子世哲苏楪兰:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪()Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object p0, Landroidx/compose/animation/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    aget p0, p0, p1

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    if-eq p0, p1, :cond_4

    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    if-eq p0, p1, :cond_4

    .line 45
    .line 46
    const/4 p1, 0x3

    .line 47
    if-ne p0, p1, :cond_3

    .line 48
    .line 49
    iget-object p0, v0, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏兰楪哲:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 50
    .line 51
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;

    .line 52
    .line 53
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子楪兰世哲苏;

    .line 56
    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 60
    .line 61
    new-instance p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 62
    .line 63
    invoke-direct {p1, v2, v3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;-><init>(J)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 71
    .line 72
    iget-wide v4, p0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪()Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v6, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 82
    .line 83
    move-object v1, p0

    .line 84
    check-cast v1, Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 85
    .line 86
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 87
    .line 88
    .line 89
    move-result-wide p0

    .line 90
    iget-object v1, v0, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子世哲苏楪兰:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-interface/range {v1 .. v6}, Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-static {p0, p1, v0, v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide p0

    .line 103
    return-wide p0

    .line 104
    :cond_3
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 105
    .line 106
    .line 107
    :cond_4
    :goto_0
    return-wide v4
.end method
