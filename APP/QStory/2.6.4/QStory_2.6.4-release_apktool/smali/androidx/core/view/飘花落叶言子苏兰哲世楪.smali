.class public final Landroidx/core/view/飘花落叶言子苏兰哲世楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroidx/core/view/飘花落叶言子苏兰世哲楪;

    .line 11
    .line 12
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪苏哲兰世(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Landroidx/core/view/飘花落叶言子苏兰世哲楪;-><init>(Landroid/view/WindowInsetsAnimation;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Landroidx/core/view/飘花落叶言子苏兰楪哲世;

    .line 23
    .line 24
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/core/view/飘花落叶言子苏兰哲楪世;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 28
    .line 29
    return-void
.end method
