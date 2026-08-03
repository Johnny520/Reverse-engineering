.class public abstract LU/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LU/v;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# virtual methods
.method public a(LU/O;)V
    .locals 0

    invoke-virtual {p0, p1}, LU/z;->b(LU/O;)V

    return-void
.end method

.method public final b(LU/O;)V
    .locals 9

    iget-object v0, p0, LU/z;->a:LU/v;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, LU/O;->n(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p1, LU/O;->b:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->I()V

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    iget-object v3, v2, LJ0/d;->b:Ljava/lang/Object;

    check-cast v3, LU/v;

    iget-object v4, v3, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v5, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-ne v4, v6, :cond_1

    invoke-virtual {v2, v5}, LJ0/d;->x(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-object v6, v2, LJ0/d;->c:Ljava/lang/Object;

    check-cast v6, LU/b;

    invoke-virtual {v6, v4}, LU/b;->d(I)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v6, v4}, LU/b;->f(I)Z

    invoke-virtual {v2, v5}, LJ0/d;->x(Landroid/view/View;)V

    invoke-virtual {v3, v4}, LU/v;->a(I)V

    goto :goto_0

    :cond_2
    move v1, v7

    :goto_0
    if-eqz v1, :cond_3

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    move-result-object v2

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->a:LU/I;

    invoke-virtual {v3, v2}, LU/I;->j(LU/O;)V

    invoke-virtual {v3, v2}, LU/I;->g(LU/O;)V

    :cond_3
    xor-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->J(Z)V

    if-nez v1, :cond_4

    invoke-virtual {p1}, LU/O;->k()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, v5, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_4
    :goto_1
    return-void
.end method

.method public abstract c(LU/O;)V
.end method

.method public abstract d()V
.end method

.method public abstract e()Z
.end method
