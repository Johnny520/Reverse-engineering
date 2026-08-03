.class public abstract Landroidx/recyclerview/widget/z;
.super Landroidx/recyclerview/widget/RecyclerView$i;
.source "SourceFile"


# instance fields
.field public g:Z


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView$A;Landroidx/recyclerview/widget/RecyclerView$A;Landroidx/recyclerview/widget/RecyclerView$i$b;Landroidx/recyclerview/widget/RecyclerView$i$b;)Z
    .locals 9

    iget v2, p3, Landroidx/recyclerview/widget/RecyclerView$i$b;->a:I

    iget v3, p3, Landroidx/recyclerview/widget/RecyclerView$i$b;->b:I

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$A;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p4, p3, Landroidx/recyclerview/widget/RecyclerView$i$b;->a:I

    iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$i$b;->b:I

    move v5, p3

    move v4, p4

    goto :goto_0

    :cond_0
    iget p3, p4, Landroidx/recyclerview/widget/RecyclerView$i$b;->a:I

    iget p4, p4, Landroidx/recyclerview/widget/RecyclerView$i$b;->b:I

    move v4, p3

    move v5, p4

    :goto_0
    move-object v0, p0

    check-cast v0, Landroidx/recyclerview/widget/k;

    if-ne p1, p2, :cond_1

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/k;->g(Landroidx/recyclerview/widget/RecyclerView$A;IIII)Z

    move-result p1

    return p1

    :cond_1
    move-object v1, p1

    iget-object p1, v1, Landroidx/recyclerview/widget/RecyclerView$A;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p4

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v6

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/k;->l(Landroidx/recyclerview/widget/RecyclerView$A;)V

    sub-int v7, v4, v2

    int-to-float v7, v7

    sub-float/2addr v7, p3

    float-to-int v7, v7

    sub-int v8, v5, v3

    int-to-float v8, v8

    sub-float/2addr v8, p4

    float-to-int v8, v8

    invoke-virtual {p1, p3}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p1, p4}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/k;->l(Landroidx/recyclerview/widget/RecyclerView$A;)V

    neg-int p1, v7

    int-to-float p1, p1

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$A;->a:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationX(F)V

    neg-int p1, v8

    int-to-float p1, p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationY(F)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, v0, Landroidx/recyclerview/widget/k;->k:Ljava/util/ArrayList;

    new-instance p3, Landroidx/recyclerview/widget/k$a;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object v1, p3, Landroidx/recyclerview/widget/k$a;->a:Landroidx/recyclerview/widget/RecyclerView$A;

    iput-object p2, p3, Landroidx/recyclerview/widget/k$a;->b:Landroidx/recyclerview/widget/RecyclerView$A;

    iput v2, p3, Landroidx/recyclerview/widget/k$a;->c:I

    iput v3, p3, Landroidx/recyclerview/widget/k$a;->d:I

    iput v4, p3, Landroidx/recyclerview/widget/k$a;->e:I

    iput v5, p3, Landroidx/recyclerview/widget/k$a;->f:I

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public abstract g(Landroidx/recyclerview/widget/RecyclerView$A;IIII)Z
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation
.end method
