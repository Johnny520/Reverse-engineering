.class public final Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;
.super Landroidx/core/view/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

.field public final 飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;-><init>(Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏兰世;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Landroid/view/View;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    iget-object v1, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世兰楪哲苏()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 31
    .line 32
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏哲楪世兰(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世兰楪哲苏()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏世兰哲楪(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世兰楪哲苏()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲楪苏世兰(ILandroid/os/Bundle;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method
