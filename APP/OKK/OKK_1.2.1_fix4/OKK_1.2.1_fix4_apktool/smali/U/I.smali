.class public final LU/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:I

.field public e:I

.field public f:LU/H;

.field public final synthetic g:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LU/I;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, LU/I;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LU/I;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    const/4 p1, 0x2

    iput p1, p0, LU/I;->d:I

    iput p1, p0, LU/I;->e:I

    return-void
.end method


# virtual methods
.method public final a(LU/O;Z)V
    .locals 5

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->e(LU/O;)V

    iget-object v0, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LU/Q;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v1, LU/Q;->e:LU/P;

    instance-of v3, v1, LU/P;

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_0

    iget-object v1, v1, LU/P;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v4}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/b;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v4, v1}, LD/Q;->j(Landroid/view/View;LD/b;)V

    :cond_1
    if-eqz p2, :cond_2

    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    if-eqz p2, :cond_2

    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LA/c;

    invoke-virtual {p2, p1}, LA/c;->n(LU/O;)V

    :cond_2
    iput-object v2, p1, LU/O;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, LU/I;->c()LU/H;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v0}, LU/H;->a(I)LU/G;

    move-result-object v1

    iget-object v1, v1, LU/G;->a:Ljava/util/ArrayList;

    iget-object p2, p2, LU/H;->a:Landroid/util/SparseArray;

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LU/G;

    iget p2, p2, LU/G;->b:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p2, v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, LU/O;->m()V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public final b(I)I
    .locals 4

    iget-object v0, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz p1, :cond_1

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    invoke-virtual {v1}, LU/L;->a()I

    move-result v1

    if-ge p1, v1, :cond_1

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    iget-boolean v1, v1, LU/L;->f:Z

    if-nez v1, :cond_0

    return p1

    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LJ0/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LJ0/d;->e(II)I

    move-result p1

    return p1

    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid position "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". State item count is "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    invoke-virtual {p1}, LU/L;->a()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->p()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()LU/H;
    .locals 2

    iget-object v0, p0, LU/I;->f:LU/H;

    if-nez v0, :cond_0

    new-instance v0, LU/H;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, v0, LU/H;->a:Landroid/util/SparseArray;

    const/4 v1, 0x0

    iput v1, v0, LU/H;->b:I

    iput-object v0, p0, LU/I;->f:LU/H;

    :cond_0
    iget-object v0, p0, LU/I;->f:LU/H;

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LU/I;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    invoke-virtual {p0, v1}, LU/I;->e(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->k0:[I

    iget-object v0, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->V:LU/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    iput v1, v0, LU/l;->c:I

    return-void
.end method

.method public final e(I)V
    .locals 3

    iget-object v0, p0, LU/I;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU/O;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, LU/I;->a(LU/O;Z)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    move-result-object v0

    invoke-virtual {v0}, LU/O;->k()Z

    move-result v1

    iget-object v2, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_0
    invoke-virtual {v0}, LU/O;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v0, LU/O;->c:LU/I;

    invoke-virtual {p1, v0}, LU/I;->j(LU/O;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LU/O;->p()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, v0, LU/O;->b:I

    and-int/lit8 p1, p1, -0x21

    iput p1, v0, LU/O;->b:I

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, LU/I;->g(LU/O;)V

    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->F:LU/z;

    if-eqz p1, :cond_3

    invoke-virtual {v0}, LU/O;->h()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->F:LU/z;

    invoke-virtual {p1, v0}, LU/z;->c(LU/O;)V

    :cond_3
    return-void
.end method

.method public final g(LU/O;)V
    .locals 2

    invoke-virtual {p1}, LU/O;->j()Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, LU/O;->j()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " isAttached:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    move-result-object p1

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, LU/O;->d(I)Z

    move-result v0

    iget-object v1, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_2

    invoke-virtual {p1}, LU/O;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->F:LU/z;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LU/O;->c()Ljava/util/List;

    move-result-object v2

    check-cast v0, LU/g;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v0, v0, LU/g;->g:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LU/O;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LU/I;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LU/I;->b:Ljava/util/ArrayList;

    :cond_1
    iput-object p0, p1, LU/O;->c:LU/I;

    const/4 v0, 0x1

    iput-boolean v0, p1, LU/O;->d:Z

    iget-object v0, p0, LU/I;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_0
    invoke-virtual {p1}, LU/O;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LU/O;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_4
    :goto_1
    iput-object p0, p1, LU/O;->c:LU/I;

    const/4 v0, 0x0

    iput-boolean v0, p1, LU/O;->d:Z

    iget-object v0, p0, LU/I;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    return-void
.end method

.method public final i(IJ)LU/O;
    .locals 10

    iget-object p2, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz p1, :cond_12

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    invoke-virtual {p3}, LU/L;->a()I

    move-result p3

    if-ge p1, p3, :cond_12

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    iget-boolean v0, p3, LU/L;->f:Z

    const/4 v1, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, LU/I;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_2

    iget-object v5, p0, LU/I;->b:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LU/O;

    invoke-virtual {v5}, LU/O;->p()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, LU/O;->b()I

    move-result v6

    if-ne v6, p1, :cond_1

    invoke-virtual {v5, v2}, LU/O;->a(I)V

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    throw v1

    :cond_3
    :goto_1
    iget-object v0, p0, LU/I;->c:Ljava/util/ArrayList;

    iget-object v4, p0, LU/I;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v3

    :goto_2
    if-ge v6, v5, :cond_6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LU/O;

    invoke-virtual {v7}, LU/O;->p()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v7}, LU/O;->b()I

    move-result v8

    if-ne v8, p1, :cond_5

    invoke-virtual {v7}, LU/O;->g()Z

    move-result v8

    if-nez v8, :cond_5

    iget-boolean v8, p3, LU/L;->f:Z

    if-nez v8, :cond_4

    invoke-virtual {v7}, LU/O;->i()Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-virtual {v7, v2}, LU/O;->a(I)V

    goto/16 :goto_8

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    iget-object v2, p2, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    iget-object v4, v2, LJ0/d;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v3

    :goto_3
    if-ge v6, v5, :cond_8

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    iget-object v8, v2, LJ0/d;->b:Ljava/lang/Object;

    check-cast v8, LU/v;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    move-result-object v8

    invoke-virtual {v8}, LU/O;->b()I

    move-result v9

    if-ne v9, p1, :cond_7

    invoke-virtual {v8}, LU/O;->g()Z

    move-result v9

    if-nez v9, :cond_7

    invoke-virtual {v8}, LU/O;->i()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    move-object v7, v1

    :goto_4
    if-eqz v7, :cond_e

    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    move-result-object v0

    iget-object v2, p2, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    iget-object v4, v2, LJ0/d;->b:Ljava/lang/Object;

    check-cast v4, LU/v;

    iget-object v4, v4, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    if-ltz v4, :cond_d

    iget-object v5, v2, LJ0/d;->c:Ljava/lang/Object;

    check-cast v5, LU/b;

    invoke-virtual {v5, v4}, LU/b;->d(I)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v5, v4}, LU/b;->a(I)V

    invoke-virtual {v2, v7}, LJ0/d;->x(Landroid/view/View;)V

    iget-object v2, p2, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    iget-object v4, v2, LJ0/d;->b:Ljava/lang/Object;

    check-cast v4, LU/v;

    iget-object v4, v4, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_9

    :goto_5
    move v4, v5

    goto :goto_6

    :cond_9
    iget-object v2, v2, LJ0/d;->c:Ljava/lang/Object;

    check-cast v2, LU/b;

    invoke-virtual {v2, v4}, LU/b;->d(I)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v2, v4}, LU/b;->b(I)I

    move-result v2

    sub-int/2addr v4, v2

    :goto_6
    if-eq v4, v5, :cond_b

    iget-object v2, p2, Landroidx/recyclerview/widget/RecyclerView;->d:LJ0/d;

    invoke-virtual {v2, v4}, LJ0/d;->d(I)V

    invoke-virtual {p0, v7}, LU/I;->h(Landroid/view/View;)V

    const/16 v2, 0x2020

    invoke-virtual {v0, v2}, LU/O;->a(I)V

    goto :goto_8

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "layout index should not be -1 after unhiding a view:"

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->p()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "trying to unhide a view that was not hidden"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "view is not a child, cannot hide "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v4, v3

    :goto_7
    if-ge v4, v2, :cond_10

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LU/O;

    invoke-virtual {v5}, LU/O;->g()Z

    move-result v6

    if-nez v6, :cond_f

    invoke-virtual {v5}, LU/O;->b()I

    move-result v6

    if-ne v6, p1, :cond_f

    invoke-virtual {v5}, LU/O;->e()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_8

    :cond_f
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_10
    :goto_8
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->c:LJ0/d;

    invoke-virtual {v0, p1, v3}, LJ0/d;->e(II)I

    move-result v0

    if-ltz v0, :cond_11

    throw v1

    :cond_11
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inconsistency detected. Invalid item position "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "(offset:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ").state:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, LU/L;->a()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->p()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid item position "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "). Item count:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView;->W:LU/L;

    invoke-virtual {p1}, LU/L;->a()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->p()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public final j(LU/O;)V
    .locals 1

    iget-boolean v0, p1, LU/O;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LU/I;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LU/I;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p1, LU/O;->c:LU/I;

    const/4 v0, 0x0

    iput-boolean v0, p1, LU/O;->d:Z

    iget v0, p1, LU/O;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p1, LU/O;->b:I

    return-void
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, LU/I;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j:LU/C;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iget v0, p0, LU/I;->d:I

    add-int/lit8 v0, v0, 0x0

    iput v0, p0, LU/I;->e:I

    iget-object v0, p0, LU/I;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, LU/I;->e:I

    if-le v2, v3, :cond_1

    invoke-virtual {p0, v1}, LU/I;->e(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method
