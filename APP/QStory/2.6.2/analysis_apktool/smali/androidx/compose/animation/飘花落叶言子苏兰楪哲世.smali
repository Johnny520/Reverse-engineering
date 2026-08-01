.class public abstract Landroidx/compose/animation/飘花落叶言子苏兰楪哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Landroidx/compose/animation/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:F

    .line 6
    .line 7
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    invoke-interface {v0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰(F)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 26
    .line 27
    if-ne v2, v1, :cond_1

    .line 28
    .line 29
    :cond_0
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;-><init>(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Landroidx/compose/animation/core/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Landroidx/compose/animation/core/飘花落叶言子楪兰世哲苏;-><init>(Landroidx/compose/animation/core/飘花落叶言子世楪哲苏兰;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    check-cast v2, Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;

    .line 43
    .line 44
    return-object v2
.end method
