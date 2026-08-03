.class public final Landroidx/fragment/app/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/b7;

.field public final b:La/A2;

.field public final c:Landroidx/fragment/app/b;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(La/b7;La/A2;Landroidx/fragment/app/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/e;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/e;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/e;->a:La/b7;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/e;->b:La/A2;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    return-void
.end method

.method public constructor <init>(La/b7;La/A2;Landroidx/fragment/app/b;Landroid/os/Bundle;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Landroidx/fragment/app/e;->d:Z

    const/4 v1, -0x1

    .line 39
    iput v1, p0, Landroidx/fragment/app/e;->e:I

    .line 40
    iput-object p1, p0, Landroidx/fragment/app/e;->a:La/b7;

    .line 41
    iput-object p2, p0, Landroidx/fragment/app/e;->b:La/A2;

    .line 42
    iput-object p3, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    const/4 p1, 0x0

    .line 43
    iput-object p1, p3, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    .line 44
    iput-object p1, p3, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    .line 45
    iput v0, p3, Landroidx/fragment/app/b;->s:I

    .line 46
    iput-boolean v0, p3, Landroidx/fragment/app/b;->o:Z

    .line 47
    iput-boolean v0, p3, Landroidx/fragment/app/b;->k:Z

    .line 48
    iget-object p2, p3, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    .line 49
    iput-object p1, p3, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    .line 50
    iput-object p4, p3, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    .line 51
    const-string p1, "arguments"

    invoke-virtual {p4, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p3, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(La/b7;La/A2;Ljava/lang/ClassLoader;Landroidx/fragment/app/d;Landroid/os/Bundle;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/e;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/e;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/e;->a:La/b7;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/e;->b:La/A2;

    .line 12
    const-string p1, "state"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, La/n7;

    .line 13
    iget-object p2, p1, La/n7;->a:Ljava/lang/String;

    .line 14
    invoke-virtual {p4, p2}, Landroidx/fragment/app/d;->a(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object p2

    .line 15
    iget-object p4, p1, La/n7;->b:Ljava/lang/String;

    iput-object p4, p2, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    .line 16
    iget-boolean p4, p1, La/n7;->c:Z

    iput-boolean p4, p2, Landroidx/fragment/app/b;->n:Z

    .line 17
    iget-boolean p4, p1, La/n7;->d:Z

    iput-boolean p4, p2, Landroidx/fragment/app/b;->p:Z

    const/4 p4, 0x1

    .line 18
    iput-boolean p4, p2, Landroidx/fragment/app/b;->q:Z

    .line 19
    iget p4, p1, La/n7;->e:I

    iput p4, p2, Landroidx/fragment/app/b;->x:I

    .line 20
    iget p4, p1, La/n7;->f:I

    iput p4, p2, Landroidx/fragment/app/b;->y:I

    .line 21
    iget-object p4, p1, La/n7;->g:Ljava/lang/String;

    iput-object p4, p2, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    .line 22
    iget-boolean p4, p1, La/n7;->h:Z

    iput-boolean p4, p2, Landroidx/fragment/app/b;->C:Z

    .line 23
    iget-boolean p4, p1, La/n7;->i:Z

    iput-boolean p4, p2, Landroidx/fragment/app/b;->l:Z

    .line 24
    iget-boolean p4, p1, La/n7;->j:Z

    iput-boolean p4, p2, Landroidx/fragment/app/b;->B:Z

    .line 25
    iget-boolean p4, p1, La/n7;->k:Z

    iput-boolean p4, p2, Landroidx/fragment/app/b;->A:Z

    .line 26
    invoke-static {}, Landroidx/lifecycle/e$b;->values()[Landroidx/lifecycle/e$b;

    move-result-object p4

    iget v0, p1, La/n7;->l:I

    aget-object p4, p4, v0

    iput-object p4, p2, Landroidx/fragment/app/b;->N:Landroidx/lifecycle/e$b;

    .line 27
    iget-object p4, p1, La/n7;->m:Ljava/lang/String;

    iput-object p4, p2, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    .line 28
    iget p4, p1, La/n7;->n:I

    iput p4, p2, Landroidx/fragment/app/b;->i:I

    .line 29
    iget-boolean p1, p1, La/n7;->o:Z

    iput-boolean p1, p2, Landroidx/fragment/app/b;->I:Z

    .line 30
    iput-object p2, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    .line 31
    iput-object p5, p2, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    .line 32
    const-string p1, "arguments"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 33
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 34
    :cond_0
    invoke-virtual {p2, p1}, Landroidx/fragment/app/b;->E(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    .line 35
    invoke-static {p1}, La/e7;->J(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Instantiated fragment "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    iget-object v3, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "moveto ACTIVITY_CREATED: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, v3, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v4, "savedInstanceState"

    if-eqz v1, :cond_1

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    :cond_1
    iget-object v1, v3, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1}, La/e7;->P()V

    iput v0, v3, Landroidx/fragment/app/b;->a:I

    const/4 v1, 0x0

    iput-boolean v1, v3, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {v3}, Landroidx/fragment/app/b;->l()V

    iget-boolean v5, v3, Landroidx/fragment/app/b;->E:Z

    const-string v6, "Fragment "

    if-eqz v5, :cond_7

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "moveto RESTORE_VIEW_STATE: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, v3, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    iget-object v0, v3, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v2

    :goto_0
    iget-object v4, v3, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    if-eqz v4, :cond_4

    iget-object v5, v3, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v5, v4}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    iput-object v2, v3, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    :cond_4
    iput-boolean v1, v3, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {v3, v0}, Landroidx/fragment/app/b;->x(Landroid/os/Bundle;)V

    iget-boolean v0, v3, Landroidx/fragment/app/b;->E:Z

    if-eqz v0, :cond_5

    iget-object v0, v3, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v0, :cond_6

    iget-object v0, v3, Landroidx/fragment/app/b;->P:La/q7;

    sget-object v4, Landroidx/lifecycle/e$a;->ON_CREATE:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v4}, La/q7;->a(Landroidx/lifecycle/e$a;)V

    goto :goto_1

    :cond_5
    new-instance v0, La/Fe;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_1
    iput-object v2, v3, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    iget-object v0, v3, Landroidx/fragment/app/b;->v:La/i7;

    iput-boolean v1, v0, La/e7;->G:Z

    iput-boolean v1, v0, La/e7;->H:Z

    iget-object v2, v0, La/e7;->N:La/k7;

    iput-boolean v1, v2, La/k7;->i:Z

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, La/e7;->u(I)V

    iget-object v0, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v0, v3, v1}, La/b7;->a(Landroidx/fragment/app/b;Z)V

    return-void

    :cond_7
    new-instance v0, La/Fe;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 8

    const/4 v0, -0x1

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v2, v1, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_3

    sget v4, Landroidx/fragment/R$id;->fragment_container_view_tag:I

    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroidx/fragment/app/b;

    if-eqz v5, :cond_0

    check-cast v4, Landroidx/fragment/app/b;

    goto :goto_1

    :cond_0
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_1

    move-object v3, v4

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v4, v2, Landroid/view/View;

    if-eqz v4, :cond_2

    check-cast v2, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object v2, v3

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v2, v1, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    iget v2, v1, Landroidx/fragment/app/b;->y:I

    sget-object v4, La/o7;->a:La/o7$b;

    new-instance v4, La/m7;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Attempting to nest fragment "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " within the view of parent fragment "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " via container with ID "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " without using parent\'s childFragmentManager"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v1, v2}, La/m7;-><init>(Landroidx/fragment/app/b;Ljava/lang/String;)V

    invoke-static {v4}, La/o7;->b(La/m7;)V

    invoke-static {v1}, La/o7;->a(Landroidx/fragment/app/b;)La/o7$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    iget-object v2, p0, Landroidx/fragment/app/e;->b:La/A2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    iget-object v2, v2, La/A2;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    :goto_3
    if-ltz v5, :cond_7

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/b;

    iget-object v7, v6, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-ne v7, v3, :cond_6

    iget-object v6, v6, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v6, :cond_6

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    add-int/2addr v5, v0

    goto :goto_3

    :cond_7
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_8

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/b;

    iget-object v6, v5, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-ne v6, v3, :cond_7

    iget-object v5, v5, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v5, :cond_7

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    :cond_8
    :goto_4
    iget-object v2, v1, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final c()V
    .locals 7

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "moveto ATTACHED: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    const/4 v2, 0x0

    const-string v3, " that does not belong to this FragmentManager!"

    const-string v4, " declared target fragment "

    iget-object v5, p0, Landroidx/fragment/app/e;->b:La/A2;

    const-string v6, "Fragment "

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iget-object v5, v5, La/A2;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e;

    if-eqz v0, :cond_1

    iget-object v3, v1, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    iget-object v3, v3, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iput-object v3, v1, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    iput-object v2, v1, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    move-object v2, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v2, v5, La/A2;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/e;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    invoke-static {v2, v1, v3}, La/z;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroidx/fragment/app/e;->k()V

    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/b;->t:La/e7;

    iget-object v2, v0, La/e7;->v:La/X6$a;

    iput-object v2, v1, Landroidx/fragment/app/b;->u:La/X6$a;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    iput-object v0, v1, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    iget-object v0, p0, Landroidx/fragment/app/e;->a:La/b7;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, La/b7;->g(Landroidx/fragment/app/b;Z)V

    iget-object v3, v1, Landroidx/fragment/app/b;->S:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/b$f;

    invoke-virtual {v5}, Landroidx/fragment/app/b$f;->a()V

    goto :goto_1

    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v1, Landroidx/fragment/app/b;->v:La/i7;

    iget-object v4, v1, Landroidx/fragment/app/b;->u:La/X6$a;

    invoke-virtual {v1}, Landroidx/fragment/app/b;->a()La/a2;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v1}, La/e7;->b(La/X6$a;La/a2;Landroidx/fragment/app/b;)V

    iput v2, v1, Landroidx/fragment/app/b;->a:I

    iput-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    iget-object v3, v1, Landroidx/fragment/app/b;->u:La/X6$a;

    iget-object v3, v3, La/Z6;->b:La/X6;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/b;->n(La/X6;)V

    iget-boolean v3, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz v3, :cond_8

    iget-object v3, v1, Landroidx/fragment/app/b;->t:La/e7;

    iget-object v3, v3, La/e7;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/l7;

    invoke-interface {v4, v1}, La/l7;->a(Landroidx/fragment/app/b;)V

    goto :goto_2

    :cond_7
    iget-object v3, v1, Landroidx/fragment/app/b;->v:La/i7;

    iput-boolean v2, v3, La/e7;->G:Z

    iput-boolean v2, v3, La/e7;->H:Z

    iget-object v4, v3, La/e7;->N:La/k7;

    iput-boolean v2, v4, La/k7;->i:Z

    invoke-virtual {v3, v2}, La/e7;->u(I)V

    invoke-virtual {v0, v1, v2}, La/b7;->b(Landroidx/fragment/app/b;Z)V

    return-void

    :cond_8
    new-instance v0, La/Fe;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onAttach()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()I
    .locals 12

    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v1, v0, Landroidx/fragment/app/b;->t:La/e7;

    if-nez v1, :cond_0

    iget v0, v0, Landroidx/fragment/app/b;->a:I

    return v0

    :cond_0
    iget v1, p0, Landroidx/fragment/app/e;->e:I

    iget-object v2, v0, Landroidx/fragment/app/b;->N:Landroidx/lifecycle/e$b;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, -0x1

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v2, v8, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v6, :cond_4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/b;->n:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Landroidx/fragment/app/b;->o:Z

    if-eqz v2, :cond_5

    iget v1, p0, Landroidx/fragment/app/e;->e:I

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_7

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v2, p0, Landroidx/fragment/app/e;->e:I

    if-ge v2, v6, :cond_6

    iget v2, v0, Landroidx/fragment/app/b;->a:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/b;->p:Z

    if-eqz v2, :cond_8

    iget-object v2, v0, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-nez v2, :cond_8

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    iget-boolean v2, v0, Landroidx/fragment/app/b;->k:Z

    if-nez v2, :cond_9

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_9
    iget-object v2, v0, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    const/4 v9, 0x0

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v10

    invoke-static {v2, v10}, Landroidx/fragment/app/f;->i(Landroid/view/ViewGroup;La/e7;)Landroidx/fragment/app/f;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/f;->f(Landroidx/fragment/app/b;)Landroidx/fragment/app/f$c;

    move-result-object v10

    if-eqz v10, :cond_a

    iget-object v10, v10, Landroidx/fragment/app/f$c;->b:Landroidx/fragment/app/f$c$a;

    goto :goto_2

    :cond_a
    move-object v10, v9

    :goto_2
    invoke-virtual {v2, v0}, Landroidx/fragment/app/f;->g(Landroidx/fragment/app/b;)Landroidx/fragment/app/f$c;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v9, v2, Landroidx/fragment/app/f$c;->b:Landroidx/fragment/app/f$c$a;

    :cond_b
    if-nez v10, :cond_c

    move v2, v4

    goto :goto_3

    :cond_c
    sget-object v2, Landroidx/fragment/app/f$d;->$EnumSwitchMapping$0:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v2, v2, v11

    :goto_3
    if-eq v2, v4, :cond_d

    if-eq v2, v8, :cond_d

    move-object v9, v10

    :cond_d
    sget-object v2, Landroidx/fragment/app/f$c$a;->b:Landroidx/fragment/app/f$c$a;

    if-ne v9, v2, :cond_e

    const/4 v2, 0x6

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_4

    :cond_e
    sget-object v2, Landroidx/fragment/app/f$c$a;->c:Landroidx/fragment/app/f$c$a;

    if-ne v9, v2, :cond_f

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_4

    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/b;->l:Z

    if-eqz v2, :cond_11

    invoke-virtual {v0}, Landroidx/fragment/app/b;->k()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_4

    :cond_10
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_11
    :goto_4
    iget-boolean v2, v0, Landroidx/fragment/app/b;->H:Z

    if-eqz v2, :cond_12

    iget v2, v0, Landroidx/fragment/app/b;->a:I

    if-ge v2, v3, :cond_12

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_12
    iget-boolean v2, v0, Landroidx/fragment/app/b;->m:Z

    if-eqz v2, :cond_13

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_13
    invoke-static {v7}, La/e7;->J(I)Z

    move-result v2

    if-eqz v2, :cond_14

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "computeExpectedState() of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_14
    return v1
.end method

.method public final e()V
    .locals 7

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "moveto CREATED: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v2, "savedInstanceState"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-boolean v2, v1, Landroidx/fragment/app/b;->L:Z

    const/4 v3, 0x1

    if-nez v2, :cond_3

    iget-object v2, p0, Landroidx/fragment/app/e;->a:La/b7;

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4}, La/b7;->h(Landroidx/fragment/app/b;Z)V

    iget-object v5, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v5}, La/e7;->P()V

    iput v3, v1, Landroidx/fragment/app/b;->a:I

    iput-boolean v4, v1, Landroidx/fragment/app/b;->E:Z

    iget-object v5, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    new-instance v6, Landroidx/fragment/app/Fragment$6;

    invoke-direct {v6, v1}, Landroidx/fragment/app/Fragment$6;-><init>(Landroidx/fragment/app/b;)V

    invoke-virtual {v5, v6}, Landroidx/lifecycle/h;->a(La/x9;)V

    invoke-virtual {v1, v0}, Landroidx/fragment/app/b;->o(Landroid/os/Bundle;)V

    iput-boolean v3, v1, Landroidx/fragment/app/b;->L:Z

    iget-boolean v0, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz v0, :cond_2

    iget-object v0, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    sget-object v3, Landroidx/lifecycle/e$a;->ON_CREATE:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v3}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    invoke-virtual {v2, v1, v4}, La/b7;->c(Landroidx/fragment/app/b;Z)V

    return-void

    :cond_2
    new-instance v0, La/Fe;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iput v3, v1, Landroidx/fragment/app/b;->a:I

    invoke-virtual {v1}, Landroidx/fragment/app/b;->C()V

    return-void
.end method

.method public final f()V
    .locals 10

    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-boolean v1, v0, Landroidx/fragment/app/b;->n:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    invoke-static {v1}, La/e7;->J(I)Z

    move-result v2

    const-string v3, "FragmentManager"

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "moveto CREATE_VIEW: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v2, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v4, "savedInstanceState"

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v5

    :goto_0
    invoke-virtual {v0, v2}, Landroidx/fragment/app/b;->s(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v6

    iget-object v7, v0, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v7, :cond_3

    move-object v5, v7

    goto/16 :goto_2

    :cond_3
    iget v7, v0, Landroidx/fragment/app/b;->y:I

    if-eqz v7, :cond_7

    const/4 v5, -0x1

    if-eq v7, v5, :cond_6

    iget-object v5, v0, Landroidx/fragment/app/b;->t:La/e7;

    iget-object v5, v5, La/e7;->w:La/a2;

    invoke-virtual {v5, v7}, La/a2;->c(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-nez v5, :cond_5

    iget-boolean v7, v0, Landroidx/fragment/app/b;->q:Z

    if-nez v7, :cond_7

    iget-boolean v7, v0, Landroidx/fragment/app/b;->p:Z

    if-eqz v7, :cond_4

    goto/16 :goto_2

    :cond_4
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/b;->A()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, v0, Landroidx/fragment/app/b;->y:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v1, "unknown"

    :goto_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No view found for id 0x"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, Landroidx/fragment/app/b;->y:I

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") for fragment "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    instance-of v7, v5, Landroidx/fragment/app/FragmentContainerView;

    if-nez v7, :cond_7

    sget-object v7, La/o7;->a:La/o7$b;

    new-instance v7, La/m7;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Attempting to add fragment "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " to container "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " which is not a FragmentContainerView"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v0, v8}, La/m7;-><init>(Landroidx/fragment/app/b;Ljava/lang/String;)V

    invoke-static {v7}, La/o7;->b(La/m7;)V

    invoke-static {v0}, La/o7;->a(Landroidx/fragment/app/b;)La/o7$b;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot create fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for a container view with no id"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_2
    iput-object v5, v0, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    invoke-virtual {v0, v6, v5, v2}, Landroidx/fragment/app/b;->y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v2, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/4 v6, 0x2

    if-eqz v2, :cond_e

    invoke-static {v1}, La/e7;->J(I)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto VIEW_CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    sget v7, Landroidx/fragment/R$id;->fragment_container_view_tag:I

    invoke-virtual {v1, v7, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v5, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/e;->b()V

    :cond_9
    iget-boolean v1, v0, Landroidx/fragment/app/b;->A:Z

    if-eqz v1, :cond_a

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/16 v5, 0x8

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    sget-object v5, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, La/ug$c;->c(Landroid/view/View;)V

    goto :goto_3

    :cond_b
    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    new-instance v5, Landroidx/fragment/app/e$a;

    invoke-direct {v5, v1}, Landroidx/fragment/app/e$a;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_3
    iget-object v1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v1, :cond_c

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    :cond_c
    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b;->w(Landroid/view/View;)V

    iget-object v1, v0, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1, v6}, La/e7;->u(I)V

    iget-object v1, p0, Landroidx/fragment/app/e;->a:La/b7;

    iget-object v4, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1, v0, v4, v2}, La/b7;->m(Landroidx/fragment/app/b;Landroid/view/View;Z)V

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    iget-object v2, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    invoke-virtual {v0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v4

    iput v2, v4, Landroidx/fragment/app/b$d;->j:F

    iget-object v2, v0, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v2, :cond_e

    if-nez v1, :cond_e

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v2

    iput-object v1, v2, Landroidx/fragment/app/b$d;->k:Landroid/view/View;

    invoke-static {v6}, La/e7;->J(I)Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "requestFocus: Saved focused view "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for Fragment "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_e
    iput v6, v0, Landroidx/fragment/app/b;->a:I

    return-void
.end method

.method public final g()V
    .locals 9

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "movefrom CREATED: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, v1, Landroidx/fragment/app/b;->l:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/b;->k()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/fragment/app/e;->b:La/A2;

    if-eqz v0, :cond_2

    iget-object v6, v1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, La/A2;->j(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    :cond_2
    if-nez v0, :cond_7

    iget-object v6, v5, La/A2;->d:Ljava/lang/Object;

    check-cast v6, La/k7;

    iget-object v7, v6, La/k7;->d:Ljava/util/HashMap;

    iget-object v8, v1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v7, v6, La/k7;->g:Z

    if-eqz v7, :cond_4

    iget-boolean v6, v6, La/k7;->h:Z

    goto :goto_2

    :cond_4
    :goto_1
    move v6, v2

    :goto_2
    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {v5, v0}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-boolean v2, v0, Landroidx/fragment/app/b;->C:Z

    if-eqz v2, :cond_6

    iput-object v0, v1, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    :cond_6
    iput v3, v1, Landroidx/fragment/app/b;->a:I

    return-void

    :cond_7
    :goto_3
    iget-object v6, v1, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v6, :cond_8

    iget-object v6, v5, La/A2;->d:Ljava/lang/Object;

    check-cast v6, La/k7;

    iget-boolean v6, v6, La/k7;->h:Z

    goto :goto_4

    :cond_8
    iget-object v6, v6, La/Z6;->b:La/X6;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v6

    xor-int/2addr v6, v2

    goto :goto_4

    :cond_9
    move v6, v2

    :goto_4
    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    if-eqz v6, :cond_b

    :goto_5
    iget-object v0, v5, La/A2;->d:Ljava/lang/Object;

    check-cast v0, La/k7;

    invoke-virtual {v0, v1, v3}, La/k7;->c(Landroidx/fragment/app/b;Z)V

    :cond_b
    iget-object v0, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v0}, La/e7;->l()V

    iget-object v0, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    sget-object v6, Landroidx/lifecycle/e$a;->ON_DESTROY:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v6}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iput v3, v1, Landroidx/fragment/app/b;->a:I

    iput-boolean v3, v1, Landroidx/fragment/app/b;->L:Z

    iput-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    iget-object v0, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v0, v1, v3}, La/b7;->d(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v5}, La/A2;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/e;

    if-eqz v2, :cond_c

    iget-object v3, v1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iget-object v2, v2, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v6, v2, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    iput-object v1, v2, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    iput-object v4, v2, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    goto :goto_6

    :cond_d
    iget-object v0, v1, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-virtual {v5, v0}, La/A2;->c(Ljava/lang/String;)Landroidx/fragment/app/b;

    move-result-object v0

    iput-object v0, v1, Landroidx/fragment/app/b;->g:Landroidx/fragment/app/b;

    :cond_e
    invoke-virtual {v5, p0}, La/A2;->i(Landroidx/fragment/app/e;)V

    return-void
.end method

.method public final h()V
    .locals 6

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "movefrom CREATE_VIEW: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v2, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, La/e7;->u(I)V

    iget-object v0, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, v1, Landroidx/fragment/app/b;->P:La/q7;

    invoke-virtual {v0}, La/q7;->b()V

    iget-object v0, v0, La/q7;->d:Landroidx/lifecycle/h;

    iget-object v0, v0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    sget-object v3, Landroidx/lifecycle/e$b;->c:Landroidx/lifecycle/e$b;

    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_2

    iget-object v0, v1, Landroidx/fragment/app/b;->P:La/q7;

    sget-object v3, Landroidx/lifecycle/e$a;->ON_DESTROY:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v3}, La/q7;->a(Landroidx/lifecycle/e$a;)V

    :cond_2
    iput v2, v1, Landroidx/fragment/app/b;->a:I

    const/4 v0, 0x0

    iput-boolean v0, v1, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {v1}, Landroidx/fragment/app/b;->q()V

    iget-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz v2, :cond_5

    invoke-interface {v1}, La/Gg;->getViewModelStore()La/Fg;

    move-result-object v2

    new-instance v3, Landroidx/lifecycle/q;

    sget-object v4, La/I9$b;->e:La/I9$b$a;

    invoke-direct {v3, v2, v4}, Landroidx/lifecycle/q;-><init>(La/Fg;Landroidx/lifecycle/q$b;)V

    const-class v2, La/I9$b;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Landroidx/lifecycle/q;->a(Ljava/lang/Class;Ljava/lang/String;)La/Dg;

    move-result-object v2

    check-cast v2, La/I9$b;

    iget-object v2, v2, La/I9$b;->d:La/oe;

    iget v3, v2, La/oe;->c:I

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v2, La/oe;->b:[Ljava/lang/Object;

    aget-object v5, v5, v4

    check-cast v5, La/I9$a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iput-boolean v0, v1, Landroidx/fragment/app/b;->r:Z

    iget-object v2, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v2, v1, v0}, La/b7;->n(Landroidx/fragment/app/b;Z)V

    const/4 v2, 0x0

    iput-object v2, v1, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    iput-object v2, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    iput-object v2, v1, Landroidx/fragment/app/b;->P:La/q7;

    iget-object v3, v1, Landroidx/fragment/app/b;->Q:La/Bb;

    invoke-virtual {v3, v2}, La/Bb;->g(Ljava/lang/Object;)V

    iput-boolean v0, v1, Landroidx/fragment/app/b;->o:Z

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, La/Fe;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onDestroyView()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()V
    .locals 7

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    iget-object v3, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "movefrom ATTACHED: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v1, -0x1

    iput v1, v3, Landroidx/fragment/app/b;->a:I

    const/4 v4, 0x0

    iput-boolean v4, v3, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {v3}, Landroidx/fragment/app/b;->r()V

    iget-boolean v5, v3, Landroidx/fragment/app/b;->E:Z

    if-eqz v5, :cond_7

    iget-object v5, v3, Landroidx/fragment/app/b;->v:La/i7;

    iget-boolean v6, v5, La/e7;->I:Z

    if-nez v6, :cond_1

    invoke-virtual {v5}, La/e7;->l()V

    new-instance v5, La/i7;

    invoke-direct {v5}, La/e7;-><init>()V

    iput-object v5, v3, Landroidx/fragment/app/b;->v:La/i7;

    :cond_1
    iget-object v5, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v5, v3, v4}, La/b7;->e(Landroidx/fragment/app/b;Z)V

    iput v1, v3, Landroidx/fragment/app/b;->a:I

    const/4 v1, 0x0

    iput-object v1, v3, Landroidx/fragment/app/b;->u:La/X6$a;

    iput-object v1, v3, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    iput-object v1, v3, Landroidx/fragment/app/b;->t:La/e7;

    iget-boolean v1, v3, Landroidx/fragment/app/b;->l:Z

    if-eqz v1, :cond_2

    invoke-virtual {v3}, Landroidx/fragment/app/b;->k()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/e;->b:La/A2;

    iget-object v1, v1, La/A2;->d:Ljava/lang/Object;

    check-cast v1, La/k7;

    iget-object v4, v1, La/k7;->d:Ljava/util/HashMap;

    iget-object v5, v3, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v4, v1, La/k7;->g:Z

    if-eqz v4, :cond_4

    iget-boolean v1, v1, La/k7;->h:Z

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_6

    :goto_2
    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initState called for fragment: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/b;->h()V

    :cond_6
    return-void

    :cond_7
    new-instance v0, La/Fe;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-boolean v1, v0, Landroidx/fragment/app/b;->n:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Landroidx/fragment/app/b;->o:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Landroidx/fragment/app/b;->r:Z

    if-nez v1, :cond_4

    const/4 v1, 0x3

    invoke-static {v1}, La/e7;->J(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto CREATE_VIEW: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v2, "savedInstanceState"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/fragment/app/b;->s(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v0, v4, v3, v1}, Landroidx/fragment/app/b;->y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v1, :cond_4

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    sget v4, Landroidx/fragment/R$id;->fragment_container_view_tag:I

    invoke-virtual {v1, v4, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-boolean v1, v0, Landroidx/fragment/app/b;->A:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    :cond_3
    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b;->w(Landroid/view/View;)V

    iget-object v1, v0, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, La/e7;->u(I)V

    iget-object v1, p0, Landroidx/fragment/app/e;->a:La/b7;

    iget-object v4, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1, v0, v4, v3}, La/b7;->m(Landroidx/fragment/app/b;Landroid/view/View;Z)V

    iput v2, v0, Landroidx/fragment/app/b;->a:I

    :cond_4
    return-void
.end method

.method public final k()V
    .locals 12

    iget-object v0, p0, Landroidx/fragment/app/e;->b:La/A2;

    iget-boolean v1, p0, Landroidx/fragment/app/e;->d:Z

    const/4 v2, 0x2

    const-string v3, "FragmentManager"

    iget-object v4, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v1, :cond_1

    invoke-static {v2}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring re-entrant call to moveToExpectedState() for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    const/4 v1, 0x1

    const/4 v5, 0x0

    :try_start_0
    iput-boolean v1, p0, Landroidx/fragment/app/e;->d:Z

    move v6, v5

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/e;->d()I

    move-result v7

    iget v8, v4, Landroidx/fragment/app/b;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v9, Landroidx/fragment/app/f$c$b;->b:Landroidx/fragment/app/f$c$b;

    sget-object v10, Landroidx/fragment/app/f$c$b;->c:Landroidx/fragment/app/f$c$b;

    const/4 v11, 0x3

    if-eq v7, v8, :cond_c

    if-le v7, v8, :cond_7

    add-int/lit8 v8, v8, 0x1

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/e;->n()V

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :pswitch_1
    const/4 v6, 0x6

    iput v6, v4, Landroidx/fragment/app/b;->a:I

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/e;->p()V

    goto/16 :goto_2

    :pswitch_3
    iget-object v6, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const/4 v7, 0x4

    if-eqz v6, :cond_6

    iget-object v6, v4, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v6, :cond_6

    invoke-virtual {v4}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v8

    invoke-static {v6, v8}, Landroidx/fragment/app/f;->i(Landroid/view/ViewGroup;La/e7;)Landroidx/fragment/app/f;

    move-result-object v6

    iget-object v8, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eqz v8, :cond_4

    if-eq v8, v7, :cond_3

    const/16 v9, 0x8

    if-ne v8, v9, :cond_2

    move-object v9, v10

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown visibility "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    sget-object v9, Landroidx/fragment/app/f$c$b;->d:Landroidx/fragment/app/f$c$b;

    :cond_4
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/e7;->J(I)Z

    move-result v8

    if-eqz v8, :cond_5

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "SpecialEffectsController: Enqueuing add operation for fragment "

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    sget-object v8, Landroidx/fragment/app/f$c$a;->b:Landroidx/fragment/app/f$c$a;

    invoke-virtual {v6, v9, v8, p0}, Landroidx/fragment/app/f;->d(Landroidx/fragment/app/f$c$b;Landroidx/fragment/app/f$c$a;Landroidx/fragment/app/e;)V

    :cond_6
    iput v7, v4, Landroidx/fragment/app/b;->a:I

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/e;->a()V

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/e;->j()V

    invoke-virtual {p0}, Landroidx/fragment/app/e;->f()V

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/e;->e()V

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/e;->c()V

    goto/16 :goto_2

    :cond_7
    add-int/lit8 v8, v8, -0x1

    packed-switch v8, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/e;->l()V

    goto/16 :goto_2

    :pswitch_9
    const/4 v6, 0x5

    iput v6, v4, Landroidx/fragment/app/b;->a:I

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/e;->q()V

    goto :goto_2

    :pswitch_b
    invoke-static {v11}, La/e7;->J(I)Z

    move-result v6

    if-eqz v6, :cond_8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    iget-object v6, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v6, :cond_9

    iget-object v6, v4, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    if-nez v6, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/e;->o()V

    :cond_9
    iget-object v6, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v6, :cond_b

    iget-object v6, v4, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v6, :cond_b

    invoke-virtual {v4}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/fragment/app/f;->i(Landroid/view/ViewGroup;La/e7;)Landroidx/fragment/app/f;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/e7;->J(I)Z

    move-result v7

    if-eqz v7, :cond_a

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "SpecialEffectsController: Enqueuing remove operation for fragment "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    sget-object v7, Landroidx/fragment/app/f$c$b;->a:Landroidx/fragment/app/f$c$b;

    sget-object v8, Landroidx/fragment/app/f$c$a;->c:Landroidx/fragment/app/f$c$a;

    invoke-virtual {v6, v7, v8, p0}, Landroidx/fragment/app/f;->d(Landroidx/fragment/app/f$c$b;Landroidx/fragment/app/f$c$a;Landroidx/fragment/app/e;)V

    :cond_b
    iput v11, v4, Landroidx/fragment/app/b;->a:I

    goto :goto_2

    :pswitch_c
    iput-boolean v5, v4, Landroidx/fragment/app/b;->o:Z

    iput v2, v4, Landroidx/fragment/app/b;->a:I

    goto :goto_2

    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/e;->h()V

    iput v1, v4, Landroidx/fragment/app/b;->a:I

    goto :goto_2

    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/e;->g()V

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/e;->i()V

    :goto_2
    move v6, v1

    goto/16 :goto_0

    :cond_c
    if-nez v6, :cond_f

    const/4 v6, -0x1

    if-ne v8, v6, :cond_f

    iget-boolean v6, v4, Landroidx/fragment/app/b;->l:Z

    if-eqz v6, :cond_f

    invoke-virtual {v4}, Landroidx/fragment/app/b;->k()Z

    move-result v6

    if-nez v6, :cond_f

    invoke-static {v11}, La/e7;->J(I)Z

    move-result v6

    if-eqz v6, :cond_d

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Cleaning up state of never attached fragment: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    iget-object v6, v0, La/A2;->d:Ljava/lang/Object;

    check-cast v6, La/k7;

    invoke-virtual {v6, v4, v1}, La/k7;->c(Landroidx/fragment/app/b;Z)V

    invoke-virtual {v0, p0}, La/A2;->i(Landroidx/fragment/app/e;)V

    invoke-static {v11}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "initState called for fragment: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    invoke-virtual {v4}, Landroidx/fragment/app/b;->h()V

    :cond_f
    iget-boolean v0, v4, Landroidx/fragment/app/b;->K:Z

    if-eqz v0, :cond_15

    iget-object v0, v4, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v0, :cond_13

    iget-object v0, v4, Landroidx/fragment/app/b;->F:Landroid/view/ViewGroup;

    if-eqz v0, :cond_13

    invoke-virtual {v4}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/fragment/app/f;->i(Landroid/view/ViewGroup;La/e7;)Landroidx/fragment/app/f;

    move-result-object v0

    iget-boolean v6, v4, Landroidx/fragment/app/b;->A:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v7, Landroidx/fragment/app/f$c$a;->a:Landroidx/fragment/app/f$c$a;

    if-eqz v6, :cond_11

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/e7;->J(I)Z

    move-result v2

    if-eqz v2, :cond_10

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_10
    invoke-virtual {v0, v10, v7, p0}, Landroidx/fragment/app/f;->d(Landroidx/fragment/app/f$c$b;Landroidx/fragment/app/f$c$a;Landroidx/fragment/app/e;)V

    goto :goto_3

    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/e7;->J(I)Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "SpecialEffectsController: Enqueuing show operation for fragment "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_12
    invoke-virtual {v0, v9, v7, p0}, Landroidx/fragment/app/f;->d(Landroidx/fragment/app/f$c$b;Landroidx/fragment/app/f$c$a;Landroidx/fragment/app/e;)V

    :cond_13
    :goto_3
    iget-object v0, v4, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v0, :cond_14

    iget-boolean v2, v4, Landroidx/fragment/app/b;->k:Z

    if-eqz v2, :cond_14

    invoke-static {v4}, La/e7;->K(Landroidx/fragment/app/b;)Z

    move-result v2

    if-eqz v2, :cond_14

    iput-boolean v1, v0, La/e7;->F:Z

    :cond_14
    iput-boolean v5, v4, Landroidx/fragment/app/b;->K:Z

    iget-object v0, v4, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v0}, La/e7;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_15
    iput-boolean v5, p0, Landroidx/fragment/app/e;->d:Z

    return-void

    :goto_4
    iput-boolean v5, p0, Landroidx/fragment/app/e;->d:Z

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "movefrom RESUMED: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, La/e7;->u(I)V

    iget-object v0, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, v1, Landroidx/fragment/app/b;->P:La/q7;

    sget-object v2, Landroidx/lifecycle/e$a;->ON_PAUSE:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v2}, La/q7;->a(Landroidx/lifecycle/e$a;)V

    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    sget-object v2, Landroidx/lifecycle/e$a;->ON_PAUSE:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    const/4 v0, 0x6

    iput v0, v1, Landroidx/fragment/app/b;->a:I

    const/4 v0, 0x1

    iput-boolean v0, v1, Landroidx/fragment/app/b;->E:Z

    iget-object v0, p0, Landroidx/fragment/app/e;->a:La/b7;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, La/b7;->f(Landroidx/fragment/app/b;Z)V

    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v1, "savedInstanceState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    :try_start_0
    iget-object p1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v1, "viewState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v1, "viewRegistryState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    iget-object p1, v0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    const-string v1, "state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, La/n7;

    if-eqz p1, :cond_2

    iget-object v1, p1, La/n7;->m:Ljava/lang/String;

    iput-object v1, v0, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    iget v1, p1, La/n7;->n:I

    iput v1, v0, Landroidx/fragment/app/b;->i:I

    iget-boolean p1, p1, La/n7;->o:Z

    iput-boolean p1, v0, Landroidx/fragment/app/b;->I:Z

    :cond_2
    iget-boolean p1, v0, Landroidx/fragment/app/b;->I:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroidx/fragment/app/b;->H:Z

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to restore view hierarchy state for fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final n()V
    .locals 7

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    const-string v1, "FragmentManager"

    iget-object v2, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "moveto RESUMED: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    const/4 v3, 0x0

    if-nez v0, :cond_1

    move-object v0, v3

    goto :goto_0

    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/b$d;->k:Landroid/view/View;

    :goto_0
    if-eqz v0, :cond_5

    iget-object v4, v2, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-ne v0, v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_5

    iget-object v5, v2, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-ne v4, v5, :cond_4

    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v4

    const/4 v5, 0x2

    invoke-static {v5}, La/e7;->J(I)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "requestFocus: Restoring focused view "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v4, :cond_3

    const-string v0, "succeeded"

    goto :goto_3

    :cond_3
    const-string v0, "failed"

    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on Fragment "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " resulting in focused view "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v2, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_4
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    goto :goto_1

    :cond_5
    :goto_4
    invoke-virtual {v2}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v0

    iput-object v3, v0, Landroidx/fragment/app/b$d;->k:Landroid/view/View;

    iget-object v0, v2, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v0}, La/e7;->P()V

    iget-object v0, v2, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La/e7;->z(Z)Z

    const/4 v0, 0x7

    iput v0, v2, Landroidx/fragment/app/b;->a:I

    iput-boolean v1, v2, Landroidx/fragment/app/b;->E:Z

    iget-object v1, v2, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    sget-object v4, Landroidx/lifecycle/e$a;->ON_RESUME:Landroidx/lifecycle/e$a;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iget-object v1, v2, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v1, :cond_6

    iget-object v1, v2, Landroidx/fragment/app/b;->P:La/q7;

    iget-object v1, v1, La/q7;->d:Landroidx/lifecycle/h;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    :cond_6
    iget-object v1, v2, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v4, 0x0

    iput-boolean v4, v1, La/e7;->G:Z

    iput-boolean v4, v1, La/e7;->H:Z

    iget-object v5, v1, La/e7;->N:La/k7;

    iput-boolean v4, v5, La/k7;->i:Z

    invoke-virtual {v1, v0}, La/e7;->u(I)V

    iget-object v0, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v0, v2, v4}, La/b7;->i(Landroidx/fragment/app/b;Z)V

    iget-object v0, p0, Landroidx/fragment/app/e;->b:La/A2;

    iget-object v1, v2, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, La/A2;->j(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    iput-object v3, v2, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    iput-object v3, v2, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    iput-object v3, v2, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    invoke-static {v1}, La/e7;->J(I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Saving view state for fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with view "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-lez v2, :cond_2

    iput-object v1, v0, Landroidx/fragment/app/b;->c:Landroid/util/SparseArray;

    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Landroidx/fragment/app/b;->P:La/q7;

    iget-object v2, v2, La/q7;->e:La/Kd;

    invoke-virtual {v2, v1}, La/Kd;->c(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iput-object v1, v0, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    :cond_3
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 5

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "moveto STARTED: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v0}, La/e7;->P()V

    iget-object v0, v1, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, La/e7;->z(Z)Z

    const/4 v0, 0x5

    iput v0, v1, Landroidx/fragment/app/b;->a:I

    const/4 v2, 0x0

    iput-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {v1}, Landroidx/fragment/app/b;->u()V

    iget-boolean v3, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    sget-object v4, Landroidx/lifecycle/e$a;->ON_START:Landroidx/lifecycle/e$a;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iget-object v3, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-object v3, v1, Landroidx/fragment/app/b;->P:La/q7;

    iget-object v3, v3, La/q7;->d:Landroidx/lifecycle/h;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    :cond_1
    iget-object v3, v1, Landroidx/fragment/app/b;->v:La/i7;

    iput-boolean v2, v3, La/e7;->G:Z

    iput-boolean v2, v3, La/e7;->H:Z

    iget-object v4, v3, La/e7;->N:La/k7;

    iput-boolean v2, v4, La/k7;->i:Z

    invoke-virtual {v3, v0}, La/e7;->u(I)V

    iget-object v0, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v0, v1, v2}, La/b7;->k(Landroidx/fragment/app/b;Z)V

    return-void

    :cond_2
    new-instance v0, La/Fe;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onStart()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()V
    .locals 4

    const/4 v0, 0x3

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "movefrom STARTED: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v2, 0x1

    iput-boolean v2, v0, La/e7;->H:Z

    iget-object v3, v0, La/e7;->N:La/k7;

    iput-boolean v2, v3, La/k7;->i:Z

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, La/e7;->u(I)V

    iget-object v0, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, v1, Landroidx/fragment/app/b;->P:La/q7;

    sget-object v3, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v3}, La/q7;->a(Landroidx/lifecycle/e$a;)V

    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    sget-object v3, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v3}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iput v2, v1, Landroidx/fragment/app/b;->a:I

    const/4 v0, 0x0

    iput-boolean v0, v1, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {v1}, Landroidx/fragment/app/b;->v()V

    iget-boolean v2, v1, Landroidx/fragment/app/b;->E:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroidx/fragment/app/e;->a:La/b7;

    invoke-virtual {v2, v1, v0}, La/b7;->l(Landroidx/fragment/app/b;Z)V

    return-void

    :cond_2
    new-instance v0, La/Fe;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onStop()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
