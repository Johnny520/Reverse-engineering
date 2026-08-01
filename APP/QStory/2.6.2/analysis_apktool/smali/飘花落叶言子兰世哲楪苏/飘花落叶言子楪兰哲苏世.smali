.class public final L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏哲兰世;


# instance fields
.field public final synthetic 飘花落叶言子楪世兰苏哲:L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Landroid/view/View;

.field public final 飘花落叶言子楪世苏兰哲:Landroid/view/View;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏世兰哲;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏:Z

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 10
    .line 11
    iput-object p3, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 12
    .line 13
    iput-object p4, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 7
    invoke-virtual {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰()V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final onAnimationPause(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onAnimationResume(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-static {p0, p1}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    invoke-virtual {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;->cancel()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 4
    .line 5
    const p2, 0x240902cd

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-static {p1, v0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏:Z

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子世楪哲苏兰(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏哲兰世;)L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 3

    .line 1
    const v0, 0x240902cd

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏:Z

    .line 23
    .line 24
    return-void
.end method
