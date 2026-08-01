.class final Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;
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
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u4e16\u54f2\u5170;",
        "invoke-LIALnN8",
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
.field final synthetic $enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

.field final synthetic $exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

.field final synthetic $transformOriginWhenVisible:Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$transformOriginWhenVisible:Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroidx/compose/animation/EnterExitState;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->invoke-LIALnN8(Landroidx/compose/animation/EnterExitState;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance v0, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke-LIALnN8(Landroidx/compose/animation/EnterExitState;)J
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/animation/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_4

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 20
    .line 21
    check-cast p1, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;

    .line 22
    .line 23
    iget-object p1, p1, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 24
    .line 25
    iget-object p1, p1, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-wide p0, p1, Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:J

    .line 30
    .line 31
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;-><init>(J)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 38
    .line 39
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 42
    .line 43
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;

    .line 44
    .line 45
    if-eqz p0, :cond_5

    .line 46
    .line 47
    iget-wide p0, p0, Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:J

    .line 48
    .line 49
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 50
    .line 51
    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;-><init>(J)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 56
    .line 57
    .line 58
    const-wide/16 p0, 0x0

    .line 59
    .line 60
    return-wide p0

    .line 61
    :cond_2
    iget-object p1, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 62
    .line 63
    check-cast p1, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;

    .line 64
    .line 65
    iget-object p1, p1, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 66
    .line 67
    iget-object p1, p1, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget-wide p0, p1, Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:J

    .line 72
    .line 73
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 74
    .line 75
    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;-><init>(J)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 80
    .line 81
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;

    .line 82
    .line 83
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 84
    .line 85
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    iget-wide p0, p0, Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:J

    .line 90
    .line 91
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 92
    .line 93
    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;-><init>(J)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;->$transformOriginWhenVisible:Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;

    .line 98
    .line 99
    :cond_5
    :goto_0
    if-eqz v1, :cond_6

    .line 100
    .line 101
    iget-wide p0, v1, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 102
    .line 103
    return-wide p0

    .line 104
    :cond_6
    sget-wide p0, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:J

    .line 105
    .line 106
    return-wide p0
.end method
