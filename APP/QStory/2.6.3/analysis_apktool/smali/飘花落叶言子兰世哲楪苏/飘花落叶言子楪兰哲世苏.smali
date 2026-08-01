.class public final L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏哲兰世;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:Z

    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 8
    .line 9
    iput p2, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/view/ViewGroup;

    .line 16
    .line 17
    iput-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 21
    .line 22
    invoke-virtual {p0, p1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:Z

    .line 3
    .line 4
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 26
    iget-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:Z

    if-nez p1, :cond_0

    .line 27
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    iget v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:I

    invoke-static {p1, v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 28
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    iget-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 8
    .line 9
    iget p2, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    invoke-static {p1, p2}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 17
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-static {p1, p2}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 10
    .line 11
    iget p0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    invoke-static {v0, p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Z

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iput-boolean p1, p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Z

    .line 14
    .line 15
    invoke-static {v0, p1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世兰楪(Landroid/view/ViewGroup;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
