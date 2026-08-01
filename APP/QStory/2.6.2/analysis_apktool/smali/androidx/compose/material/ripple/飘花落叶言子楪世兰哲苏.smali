.class public final Landroidx/compose/material/ripple/飘花落叶言子楪世兰哲苏;
.super Landroid/view/ViewGroup;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public final 飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    iput v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance v2, Landroidx/compose/material/ripple/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    invoke-direct {v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Landroidx/compose/material/ripple/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;

    .line 33
    .line 34
    invoke-direct {v2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput p1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:I

    .line 48
    .line 49
    const p1, 0x24090185

    .line 50
    .line 51
    .line 52
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final requestLayout()V
    .locals 0

    .line 1
    return-void
.end method
