.class public abstract Landroidx/core/view/飘花落叶言子哲兰苏楪世;
.super Landroidx/core/view/飘花落叶言子兰楪苏哲世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroidx/core/view/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/view/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:Landroid/view/Window;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public addOnControllableInsetsChangedListener(Landroidx/core/view/飘花落叶言子兰楪哲世苏;)V
    .locals 0

    .line 1
    return-void
.end method

.method public removeOnControllableInsetsChangedListener(Landroidx/core/view/飘花落叶言子兰楪哲世苏;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世苏哲兰:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    or-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
