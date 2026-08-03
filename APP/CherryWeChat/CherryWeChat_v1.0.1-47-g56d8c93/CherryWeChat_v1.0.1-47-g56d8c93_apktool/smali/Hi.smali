.class public final LHi;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:LP3;

.field public final b:Lqs;

.field public final c:Lhi;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(LP3;Lqs;Lhi;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LHi;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LHi;->e:I

    .line 4
    iput-object p1, p0, LHi;->a:LP3;

    .line 5
    iput-object p2, p0, LHi;->b:Lqs;

    .line 6
    iput-object p3, p0, LHi;->c:Lhi;

    return-void
.end method

.method public constructor <init>(LP3;Lqs;Lhi;Landroid/os/Bundle;)V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, LHi;->d:Z

    const/4 v1, -0x1

    .line 37
    iput v1, p0, LHi;->e:I

    .line 38
    iput-object p1, p0, LHi;->a:LP3;

    .line 39
    iput-object p2, p0, LHi;->b:Lqs;

    .line 40
    iput-object p3, p0, LHi;->c:Lhi;

    const/4 p1, 0x0

    .line 41
    iput-object p1, p3, Lhi;->c:Landroid/util/SparseArray;

    .line 42
    iput-object p1, p3, Lhi;->d:Landroid/os/Bundle;

    .line 43
    iput v0, p3, Lhi;->q:I

    .line 44
    iput-boolean v0, p3, Lhi;->n:Z

    .line 45
    iput-boolean v0, p3, Lhi;->k:Z

    .line 46
    iget-object p2, p3, Lhi;->g:Lhi;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lhi;->e:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Lhi;->h:Ljava/lang/String;

    .line 47
    iput-object p1, p3, Lhi;->g:Lhi;

    .line 48
    iput-object p4, p3, Lhi;->b:Landroid/os/Bundle;

    .line 49
    const-string p1, "arguments"

    invoke-virtual {p4, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p3, Lhi;->f:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(LP3;Lqs;Ljava/lang/ClassLoader;Lti;Landroid/os/Bundle;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, LHi;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, LHi;->e:I

    .line 10
    iput-object p1, p0, LHi;->a:LP3;

    .line 11
    iput-object p2, p0, LHi;->b:Lqs;

    .line 12
    const-string p1, "state"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, LGi;

    .line 13
    iget-object p2, p1, LGi;->a:Ljava/lang/String;

    invoke-virtual {p4, p2}, Lti;->a(Ljava/lang/String;)Lhi;

    move-result-object p2

    .line 14
    iget-object p4, p1, LGi;->b:Ljava/lang/String;

    iput-object p4, p2, Lhi;->e:Ljava/lang/String;

    .line 15
    iget-boolean p4, p1, LGi;->c:Z

    iput-boolean p4, p2, Lhi;->m:Z

    const/4 p4, 0x1

    .line 16
    iput-boolean p4, p2, Lhi;->o:Z

    .line 17
    iget p4, p1, LGi;->d:I

    iput p4, p2, Lhi;->v:I

    .line 18
    iget p4, p1, LGi;->e:I

    iput p4, p2, Lhi;->w:I

    .line 19
    iget-object p4, p1, LGi;->f:Ljava/lang/String;

    iput-object p4, p2, Lhi;->x:Ljava/lang/String;

    .line 20
    iget-boolean p4, p1, LGi;->g:Z

    iput-boolean p4, p2, Lhi;->A:Z

    .line 21
    iget-boolean p4, p1, LGi;->h:Z

    iput-boolean p4, p2, Lhi;->l:Z

    .line 22
    iget-boolean p4, p1, LGi;->i:Z

    iput-boolean p4, p2, Lhi;->z:Z

    .line 23
    iget-boolean p4, p1, LGi;->j:Z

    iput-boolean p4, p2, Lhi;->y:Z

    .line 24
    invoke-static {}, LPn;->values()[LPn;

    move-result-object p4

    iget v0, p1, LGi;->k:I

    aget-object p4, p4, v0

    iput-object p4, p2, Lhi;->L:LPn;

    .line 25
    iget-object p4, p1, LGi;->l:Ljava/lang/String;

    iput-object p4, p2, Lhi;->h:Ljava/lang/String;

    .line 26
    iget p4, p1, LGi;->m:I

    iput p4, p2, Lhi;->i:I

    .line 27
    iget-boolean p1, p1, LGi;->n:Z

    iput-boolean p1, p2, Lhi;->G:Z

    .line 28
    iput-object p2, p0, LHi;->c:Lhi;

    .line 29
    iput-object p5, p2, Lhi;->b:Landroid/os/Bundle;

    .line 30
    const-string p1, "arguments"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 32
    :cond_0
    invoke-virtual {p2, p1}, Lhi;->B(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    .line 33
    invoke-static {p1}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 34
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v1

    iget-object v2, p0, LHi;->c:Lhi;

    if-eqz v1, :cond_0

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v1, v2, Lhi;->b:Landroid/os/Bundle;

    const-string v3, "savedInstanceState"

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    iget-object v5, v2, Lhi;->t:LAi;

    invoke-virtual {v5}, Lzi;->N()V

    iput v0, v2, Lhi;->a:I

    const/4 v5, 0x0

    iput-boolean v5, v2, Lhi;->C:Z

    invoke-virtual {v2}, Lhi;->l()V

    iget-boolean v6, v2, Lhi;->C:Z

    const-string v7, "Fragment "

    if-eqz v6, :cond_7

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lhi;->toString()Ljava/lang/String;

    :cond_2
    iget-object v0, v2, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_6

    iget-object v0, v2, Lhi;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v4

    :goto_1
    iget-object v3, v2, Lhi;->c:Landroid/util/SparseArray;

    if-eqz v3, :cond_4

    iget-object v6, v2, Lhi;->E:Landroid/view/View;

    invoke-virtual {v6, v3}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    iput-object v4, v2, Lhi;->c:Landroid/util/SparseArray;

    :cond_4
    iput-boolean v5, v2, Lhi;->C:Z

    invoke-virtual {v2, v0}, Lhi;->w(Landroid/os/Bundle;)V

    iget-boolean v0, v2, Lhi;->C:Z

    if-eqz v0, :cond_5

    iget-object v0, v2, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_6

    iget-object v0, v2, Lhi;->N:LLi;

    sget-object v3, LOn;->ON_CREATE:LOn;

    invoke-virtual {v0, v3}, LLi;->a(LOn;)V

    goto :goto_2

    :cond_5
    new-instance v0, LGz;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    iput-object v4, v2, Lhi;->b:Landroid/os/Bundle;

    iget-object v0, v2, Lhi;->t:LAi;

    iput-boolean v5, v0, Lzi;->F:Z

    iput-boolean v5, v0, Lzi;->G:Z

    iget-object v3, v0, Lzi;->M:LDi;

    iput-boolean v5, v3, LDi;->i:Z

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lzi;->t(I)V

    iget-object v0, p0, LHi;->a:LP3;

    invoke-virtual {v0, v2, v1, v5}, LP3;->m(Lhi;Landroid/os/Bundle;Z)V

    return-void

    :cond_7
    new-instance v0, LGz;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 8

    iget-object v0, p0, LHi;->c:Lhi;

    iget-object v1, v0, Lhi;->D:Landroid/view/ViewGroup;

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const v3, 0x550a0109

    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lhi;

    if-eqz v4, :cond_0

    check-cast v3, Lhi;

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_1

    move-object v2, v3

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v3, v1, Landroid/view/View;

    if-eqz v3, :cond_2

    check-cast v1, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object v1, v2

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v1, v0, Lhi;->u:Lhi;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget v1, v0, Lhi;->w:I

    sget-object v3, LJi;->a:LIi;

    new-instance v3, LFi;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Attempting to nest fragment "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " within the view of parent fragment "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " via container with ID "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " without using parent\'s childFragmentManager"

    invoke-static {v4, v1, v2}, LEy;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, LFi;-><init>(Lhi;Ljava/lang/String;)V

    invoke-static {v3}, LJi;->b(LFi;)V

    invoke-static {v0}, LJi;->a(Lhi;)LIi;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    iget-object v1, p0, LHi;->b:Lqs;

    iget-object v1, v1, Lqs;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lhi;->D:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    :goto_3
    if-ltz v5, :cond_7

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhi;

    iget-object v7, v6, Lhi;->D:Landroid/view/ViewGroup;

    if-ne v7, v2, :cond_6

    iget-object v6, v6, Lhi;->E:Landroid/view/View;

    if-eqz v6, :cond_6

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    add-int/lit8 v3, v1, 0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_7
    :goto_4
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_9

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhi;

    iget-object v6, v5, Lhi;->D:Landroid/view/ViewGroup;

    if-ne v6, v2, :cond_8

    iget-object v5, v5, Lhi;->E:Landroid/view/View;

    if-eqz v5, :cond_8

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    goto :goto_5

    :cond_8
    goto :goto_4

    :cond_9
    :goto_5
    iget-object v1, v0, Lhi;->D:Landroid/view/ViewGroup;

    iget-object v0, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final c()V
    .locals 10

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->g:Lhi;

    const/4 v2, 0x0

    const-string v3, " that does not belong to this FragmentManager!"

    const-string v4, " declared target fragment "

    iget-object v5, p0, LHi;->b:Lqs;

    const-string v6, "Fragment "

    if-eqz v0, :cond_2

    iget-object v0, v0, Lhi;->e:Ljava/lang/String;

    iget-object v5, v5, Lqs;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHi;

    if-eqz v0, :cond_1

    iget-object v3, v1, Lhi;->g:Lhi;

    iget-object v3, v3, Lhi;->e:Ljava/lang/String;

    iput-object v3, v1, Lhi;->h:Ljava/lang/String;

    iput-object v2, v1, Lhi;->g:Lhi;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lhi;->g:Lhi;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lhi;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v5, v5, Lqs;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHi;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lhi;->h:Ljava/lang/String;

    invoke-static {v2, v1, v3}, LEy;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v0}, LHi;->k()V

    :cond_5
    iget-object v0, v1, Lhi;->r:Lzi;

    iget-object v3, v0, Lzi;->u:Lji;

    iput-object v3, v1, Lhi;->s:Lji;

    iget-object v0, v0, Lzi;->w:Lhi;

    iput-object v0, v1, Lhi;->u:Lhi;

    iget-object v0, p0, LHi;->a:LP3;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, LP3;->t(Lhi;Z)V

    iget-object v4, v1, Lhi;->Q:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldi;

    iget-object v7, v7, Ldi;->a:Lhi;

    iget-object v8, v7, Lhi;->P:Lwy;

    invoke-virtual {v8}, Lwy;->c()V

    invoke-static {v7}, LOj;->o(Lix;)V

    iget-object v8, v7, Lhi;->b:Landroid/os/Bundle;

    if-eqz v8, :cond_6

    const-string v9, "registryState"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    goto :goto_2

    :cond_6
    move-object v8, v2

    :goto_2
    iget-object v7, v7, Lhi;->P:Lwy;

    invoke-virtual {v7, v8}, Lwy;->d(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v1, Lhi;->t:LAi;

    iget-object v4, v1, Lhi;->s:Lji;

    invoke-virtual {v1}, Lhi;->a()LTB;

    move-result-object v5

    invoke-virtual {v2, v4, v5, v1}, Lzi;->b(Lji;LTB;Lhi;)V

    iput v3, v1, Lhi;->a:I

    iput-boolean v3, v1, Lhi;->C:Z

    iget-object v2, v1, Lhi;->s:Lji;

    iget-object v2, v2, Lji;->m:Lc3;

    invoke-virtual {v1, v2}, Lhi;->m(Landroid/content/Context;)V

    iget-boolean v2, v1, Lhi;->C:Z

    if-eqz v2, :cond_9

    iget-object v2, v1, Lhi;->r:Lzi;

    iget-object v2, v2, Lzi;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LEi;

    invoke-interface {v4, v1}, LEi;->a(Lhi;)V

    goto :goto_3

    :cond_8
    iget-object v2, v1, Lhi;->t:LAi;

    iput-boolean v3, v2, Lzi;->F:Z

    iput-boolean v3, v2, Lzi;->G:Z

    iget-object v4, v2, Lzi;->M:LDi;

    iput-boolean v3, v4, LDi;->i:Z

    invoke-virtual {v2, v3}, Lzi;->t(I)V

    invoke-virtual {v0, v1, v3}, LP3;->n(Lhi;Z)V

    return-void

    :cond_9
    new-instance v0, LGz;

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
    .locals 14

    iget-object v0, p0, LHi;->c:Lhi;

    iget-object v1, v0, Lhi;->r:Lzi;

    if-nez v1, :cond_0

    iget v0, v0, Lhi;->a:I

    return v0

    :cond_0
    iget v1, p0, LHi;->e:I

    iget-object v2, v0, Lhi;->L:LPn;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/4 v6, -0x1

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eq v2, v9, :cond_3

    if-eq v2, v8, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v7, :cond_4

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_4
    :goto_0
    iget-boolean v2, v0, Lhi;->m:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Lhi;->n:Z

    if-eqz v2, :cond_5

    iget v1, p0, LHi;->e:I

    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Lhi;->E:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_7

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v2, p0, LHi;->e:I

    if-ge v2, v7, :cond_6

    iget v2, v0, Lhi;->a:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_7
    :goto_1
    iget-boolean v2, v0, Lhi;->k:Z

    if-nez v2, :cond_8

    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    iget-object v2, v0, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Lhi;->f()Lzi;

    move-result-object v10

    invoke-virtual {v10}, Lzi;->F()LPg;

    const v10, 0x550a01fc

    invoke-virtual {v2, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lnd;

    if-eqz v12, :cond_9

    check-cast v11, Lnd;

    goto :goto_2

    :cond_9
    new-instance v11, Lnd;

    invoke-direct {v11, v2}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v2, v10, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_2
    invoke-virtual {v11, v0}, Lnd;->d(Lhi;)LMy;

    move-result-object v2

    if-eqz v2, :cond_a

    iget v2, v2, LMy;->b:I

    goto :goto_3

    :cond_a
    move v2, v3

    :goto_3
    iget-object v10, v11, Lnd;->c:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LMy;

    iget-object v13, v12, LMy;->c:Lhi;

    invoke-static {v13, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    iget-boolean v12, v12, LMy;->f:Z

    if-nez v12, :cond_b

    goto :goto_4

    :cond_c
    const/4 v11, 0x0

    :goto_4
    check-cast v11, LMy;

    if-eqz v11, :cond_d

    iget v3, v11, LMy;->b:I

    :cond_d
    if-nez v2, :cond_e

    move v10, v6

    goto :goto_5

    :cond_e
    sget-object v10, LNy;->a:[I

    invoke-static {v2}, LEy;->v(I)I

    move-result v11

    aget v10, v10, v11

    :goto_5
    if-eq v10, v6, :cond_f

    if-eq v10, v9, :cond_f

    move v3, v2

    :cond_f
    if-ne v3, v8, :cond_10

    const/4 v2, 0x6

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_6

    :cond_10
    if-ne v3, v5, :cond_11

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_6

    :cond_11
    iget-boolean v2, v0, Lhi;->l:Z

    if-eqz v2, :cond_13

    invoke-virtual {v0}, Lhi;->k()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_6

    :cond_12
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_13
    :goto_6
    iget-boolean v2, v0, Lhi;->F:Z

    if-eqz v2, :cond_14

    iget v2, v0, Lhi;->a:I

    if-ge v2, v4, :cond_14

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_14
    invoke-static {v8}, Lzi;->G(I)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_15
    return v1
.end method

.method public final e()V
    .locals 8

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v2, "savedInstanceState"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-boolean v2, v1, Lhi;->J:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, p0, LHi;->a:LP3;

    invoke-virtual {v2, v1, v0, v4}, LP3;->u(Lhi;Landroid/os/Bundle;Z)V

    iget-object v5, v1, Lhi;->t:LAi;

    invoke-virtual {v5}, Lzi;->N()V

    iput v3, v1, Lhi;->a:I

    iput-boolean v4, v1, Lhi;->C:Z

    iget-object v5, v1, Lhi;->M:Lao;

    new-instance v6, Lcv;

    const/4 v7, 0x3

    invoke-direct {v6, v7, v1}, Lcv;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v5, v6}, Lao;->a(LXn;)V

    invoke-virtual {v1, v0}, Lhi;->n(Landroid/os/Bundle;)V

    iput-boolean v3, v1, Lhi;->J:Z

    iget-boolean v3, v1, Lhi;->C:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, Lhi;->M:Lao;

    sget-object v5, LOn;->ON_CREATE:LOn;

    invoke-virtual {v3, v5}, Lao;->e(LOn;)V

    invoke-virtual {v2, v1, v0, v4}, LP3;->o(Lhi;Landroid/os/Bundle;Z)V

    return-void

    :cond_2
    new-instance v0, LGz;

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
    iput v3, v1, Lhi;->a:I

    iget-object v0, v1, Lhi;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    const-string v2, "childFragmentManager"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v2, v1, Lhi;->t:LAi;

    invoke-virtual {v2, v0}, Lzi;->T(Landroid/os/Bundle;)V

    iget-object v0, v1, Lhi;->t:LAi;

    iput-boolean v4, v0, Lzi;->F:Z

    iput-boolean v4, v0, Lzi;->G:Z

    iget-object v1, v0, Lzi;->M:LDi;

    iput-boolean v4, v1, LDi;->i:Z

    invoke-virtual {v0, v3}, Lzi;->t(I)V

    :cond_4
    return-void
.end method

.method public final f()V
    .locals 9

    iget-object v0, p0, LHi;->c:Lhi;

    iget-boolean v1, v0, Lhi;->m:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    iget-object v2, v0, Lhi;->b:Landroid/os/Bundle;

    const-string v3, "savedInstanceState"

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v4

    :goto_0
    invoke-virtual {v0, v2}, Lhi;->r(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v5

    iget-object v6, v0, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v6, :cond_3

    move-object v4, v6

    goto/16 :goto_2

    :cond_3
    iget v6, v0, Lhi;->w:I

    if-eqz v6, :cond_7

    const/4 v4, -0x1

    if-eq v6, v4, :cond_6

    iget-object v4, v0, Lhi;->r:Lzi;

    iget-object v4, v4, Lzi;->v:LTB;

    invoke-virtual {v4, v6}, LTB;->y(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-nez v4, :cond_5

    iget-boolean v6, v0, Lhi;->o:Z

    if-eqz v6, :cond_4

    goto/16 :goto_2

    :cond_4
    :try_start_0
    invoke-virtual {v0}, Lhi;->y()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, v0, Lhi;->w:I

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

    iget v4, v0, Lhi;->w:I

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
    instance-of v6, v4, Landroidx/fragment/app/FragmentContainerView;

    if-nez v6, :cond_7

    sget-object v6, LJi;->a:LIi;

    new-instance v6, LFi;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Attempting to add fragment "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " to container "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " which is not a FragmentContainerView"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v0, v7}, LFi;-><init>(Lhi;Ljava/lang/String;)V

    invoke-static {v6}, LJi;->b(LFi;)V

    invoke-static {v0}, LJi;->a(Lhi;)LIi;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-object v4, v0, Lhi;->D:Landroid/view/ViewGroup;

    invoke-virtual {v0, v5, v4, v2}, Lhi;->x(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v5, v0, Lhi;->E:Landroid/view/View;

    const/4 v6, 0x2

    if-eqz v5, :cond_e

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_8
    iget-object v5, v0, Lhi;->E:Landroid/view/View;

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v5, v0, Lhi;->E:Landroid/view/View;

    const v8, 0x550a0109

    invoke-virtual {v5, v8, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v4, :cond_9

    invoke-virtual {p0}, LHi;->b()V

    :cond_9
    iget-boolean v4, v0, Lhi;->y:Z

    if-eqz v4, :cond_a

    iget-object v4, v0, Lhi;->E:Landroid/view/View;

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    iget-object v4, v0, Lhi;->E:Landroid/view/View;

    sget-object v5, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    invoke-static {v1}, LcE;->c(Landroid/view/View;)V

    goto :goto_3

    :cond_b
    iget-object v4, v0, Lhi;->E:Landroid/view/View;

    new-instance v5, LX6;

    invoke-direct {v5, v1, v4}, LX6;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_3
    iget-object v1, v0, Lhi;->b:Landroid/os/Bundle;

    if-eqz v1, :cond_c

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    :cond_c
    iget-object v1, v0, Lhi;->t:LAi;

    invoke-virtual {v1, v6}, Lzi;->t(I)V

    iget-object v1, p0, LHi;->a:LP3;

    iget-object v3, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v1, v0, v3, v2, v7}, LP3;->z(Lhi;Landroid/view/View;Landroid/os/Bundle;Z)V

    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    iget-object v2, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    invoke-virtual {v0}, Lhi;->b()Lfi;

    move-result-object v3

    iput v2, v3, Lfi;->j:F

    iget-object v2, v0, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v2, :cond_e

    if-nez v1, :cond_e

    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Lhi;->b()Lfi;

    move-result-object v2

    iput-object v1, v2, Lfi;->k:Landroid/view/View;

    invoke-static {v6}, Lzi;->G(I)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_d
    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_e
    iput v6, v0, Lhi;->a:I

    return-void
.end method

.method public final g()V
    .locals 10

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v1

    iget-object v2, p0, LHi;->c:Lhi;

    if-eqz v1, :cond_0

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v1, v2, Lhi;->l:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Lhi;->k()Z

    move-result v1

    if-nez v1, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    const/4 v5, 0x0

    iget-object v6, p0, LHi;->b:Lqs;

    if-eqz v1, :cond_2

    iget-object v7, v2, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v6, v5, v7}, Lqs;->D(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    :cond_2
    if-nez v1, :cond_7

    iget-object v7, v6, Lqs;->d:Ljava/lang/Object;

    check-cast v7, LDi;

    iget-object v8, v7, LDi;->d:Ljava/util/HashMap;

    iget-object v9, v2, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v8, v7, LDi;->g:Z

    if-eqz v8, :cond_4

    iget-boolean v7, v7, LDi;->h:Z

    goto :goto_2

    :cond_4
    :goto_1
    move v7, v4

    :goto_2
    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, v2, Lhi;->h:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {v6, v0}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-boolean v1, v0, Lhi;->A:Z

    if-eqz v1, :cond_6

    iput-object v0, v2, Lhi;->g:Lhi;

    :cond_6
    iput v3, v2, Lhi;->a:I

    return-void

    :cond_7
    :goto_3
    iget-object v7, v2, Lhi;->s:Lji;

    if-eqz v7, :cond_8

    iget-object v7, v6, Lqs;->d:Ljava/lang/Object;

    check-cast v7, LDi;

    iget-boolean v7, v7, LDi;->h:Z

    goto :goto_4

    :cond_8
    iget-object v7, v7, Lji;->m:Lc3;

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v7

    xor-int/2addr v7, v4

    goto :goto_4

    :cond_9
    move v7, v4

    :goto_4
    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    if-eqz v7, :cond_c

    :goto_5
    iget-object v1, v6, Lqs;->d:Ljava/lang/Object;

    check-cast v1, LDi;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_b
    iget-object v0, v2, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, LDi;->c(Ljava/lang/String;)V

    :cond_c
    iget-object v0, v2, Lhi;->t:LAi;

    invoke-virtual {v0}, Lzi;->k()V

    iget-object v0, v2, Lhi;->M:Lao;

    sget-object v1, LOn;->ON_DESTROY:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    iput v3, v2, Lhi;->a:I

    iput-boolean v3, v2, Lhi;->J:Z

    iput-boolean v4, v2, Lhi;->C:Z

    iget-object v0, p0, LHi;->a:LP3;

    invoke-virtual {v0, v2, v3}, LP3;->p(Lhi;Z)V

    invoke-virtual {v6}, Lqs;->q()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHi;

    if-eqz v1, :cond_d

    iget-object v1, v1, LHi;->c:Lhi;

    iget-object v3, v2, Lhi;->e:Ljava/lang/String;

    iget-object v4, v1, Lhi;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    iput-object v2, v1, Lhi;->g:Lhi;

    iput-object v5, v1, Lhi;->h:Ljava/lang/String;

    goto :goto_6

    :cond_e
    iget-object v0, v2, Lhi;->h:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v6, v0}, Lqs;->n(Ljava/lang/String;)Lhi;

    move-result-object v0

    iput-object v0, v2, Lhi;->g:Lhi;

    :cond_f
    invoke-virtual {v6, p0}, Lqs;->v(LHi;)V

    return-void
.end method

.method public final h()V
    .locals 10

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v2, v1, Lhi;->E:Landroid/view/View;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, v1, Lhi;->t:LAi;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lzi;->t(I)V

    iget-object v0, v1, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, v1, Lhi;->N:LLi;

    invoke-virtual {v0}, LLi;->b()V

    iget-object v0, v0, LLi;->d:Lao;

    iget-object v0, v0, Lao;->c:LPn;

    sget-object v3, LPn;->c:LPn;

    invoke-virtual {v0, v3}, LPn;->a(LPn;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lhi;->N:LLi;

    sget-object v3, LOn;->ON_DESTROY:LOn;

    invoke-virtual {v0, v3}, LLi;->a(LOn;)V

    :cond_2
    iput v2, v1, Lhi;->a:I

    const/4 v0, 0x0

    iput-boolean v0, v1, Lhi;->C:Z

    invoke-virtual {v1}, Lhi;->p()V

    iget-boolean v2, v1, Lhi;->C:Z

    if-eqz v2, :cond_7

    invoke-interface {v1}, LyE;->getViewModelStore()LxE;

    move-result-object v2

    sget-object v3, Ljc;->b:Ljc;

    const-class v4, LQo;

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    const-string v6, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v2, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LuE;

    invoke-virtual {v4, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    sget-object v9, LQo;->e:LCi;

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    new-instance v6, Lts;

    invoke-direct {v6, v3}, Lts;-><init>(Llc;)V

    sget-object v3, Lgf;->n:Lgf;

    invoke-virtual {v6, v3, v5}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {v9, v4, v6}, LwE;->b(Ljava/lang/Class;Lts;)LuE;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v6, v3

    goto :goto_1

    :catch_0
    invoke-interface {v9, v4}, LwE;->a(Ljava/lang/Class;)LuE;

    move-result-object v3

    goto :goto_0

    :goto_1
    iget-object v2, v2, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LuE;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LuE;->b()V

    :cond_4
    :goto_2
    check-cast v6, LQo;

    iget-object v2, v6, LQo;->d:LKy;

    iget v3, v2, LKy;->c:I

    if-gtz v3, :cond_5

    iput-boolean v0, v1, Lhi;->p:Z

    iget-object v2, p0, LHi;->a:LP3;

    invoke-virtual {v2, v1, v0}, LP3;->A(Lhi;Z)V

    iput-object v8, v1, Lhi;->D:Landroid/view/ViewGroup;

    iput-object v8, v1, Lhi;->E:Landroid/view/View;

    iput-object v8, v1, Lhi;->N:LLi;

    iget-object v2, v1, Lhi;->O:Lus;

    invoke-virtual {v2, v8}, Lus;->d(Ljava/lang/Object;)V

    iput-boolean v0, v1, Lhi;->n:Z

    return-void

    :cond_5
    iget-object v1, v2, LKy;->b:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, LGz;

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
    .locals 6

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v1

    iget-object v2, p0, LHi;->c:Lhi;

    if-eqz v1, :cond_0

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    const/4 v1, -0x1

    iput v1, v2, Lhi;->a:I

    const/4 v3, 0x0

    iput-boolean v3, v2, Lhi;->C:Z

    invoke-virtual {v2}, Lhi;->q()V

    iget-boolean v4, v2, Lhi;->C:Z

    if-eqz v4, :cond_7

    iget-object v4, v2, Lhi;->t:LAi;

    iget-boolean v5, v4, Lzi;->H:Z

    if-nez v5, :cond_1

    invoke-virtual {v4}, Lzi;->k()V

    new-instance v4, LAi;

    invoke-direct {v4}, Lzi;-><init>()V

    iput-object v4, v2, Lhi;->t:LAi;

    :cond_1
    iget-object v4, p0, LHi;->a:LP3;

    invoke-virtual {v4, v2, v3}, LP3;->q(Lhi;Z)V

    iput v1, v2, Lhi;->a:I

    const/4 v1, 0x0

    iput-object v1, v2, Lhi;->s:Lji;

    iput-object v1, v2, Lhi;->u:Lhi;

    iput-object v1, v2, Lhi;->r:Lzi;

    iget-boolean v1, v2, Lhi;->l:Z

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Lhi;->k()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, LHi;->b:Lqs;

    iget-object v1, v1, Lqs;->d:Ljava/lang/Object;

    check-cast v1, LDi;

    iget-object v3, v1, LDi;->d:Ljava/util/HashMap;

    iget-object v4, v2, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v3, v1, LDi;->g:Z

    if-eqz v3, :cond_4

    iget-boolean v1, v1, LDi;->h:Z

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_6

    :goto_2
    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    invoke-virtual {v2}, Lhi;->h()V

    :cond_6
    return-void

    :cond_7
    new-instance v0, LGz;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 6

    iget-object v0, p0, LHi;->c:Lhi;

    iget-boolean v1, v0, Lhi;->m:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Lhi;->n:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Lhi;->p:Z

    if-nez v1, :cond_4

    const/4 v1, 0x3

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v1, v0, Lhi;->b:Landroid/os/Bundle;

    const-string v2, "savedInstanceState"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Lhi;->r(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v0, v4, v3, v1}, Lhi;->x(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v3, v0, Lhi;->E:Landroid/view/View;

    if-eqz v3, :cond_4

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v3, v0, Lhi;->E:Landroid/view/View;

    const v5, 0x550a0109

    invoke-virtual {v3, v5, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-boolean v3, v0, Lhi;->y:Z

    if-eqz v3, :cond_2

    iget-object v3, v0, Lhi;->E:Landroid/view/View;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v3, v0, Lhi;->b:Landroid/os/Bundle;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    :cond_3
    iget-object v2, v0, Lhi;->t:LAi;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lzi;->t(I)V

    iget-object v2, p0, LHi;->a:LP3;

    iget-object v5, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v2, v0, v5, v1, v4}, LP3;->z(Lhi;Landroid/view/View;Landroid/os/Bundle;Z)V

    iput v3, v0, Lhi;->a:I

    :cond_4
    return-void
.end method

.method public final k()V
    .locals 11

    iget-object v0, p0, LHi;->b:Lqs;

    iget-boolean v1, p0, LHi;->d:Z

    const/4 v2, 0x2

    iget-object v3, p0, LHi;->c:Lhi;

    if-eqz v1, :cond_1

    invoke-static {v2}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void

    :cond_1
    const/4 v1, 0x1

    const/4 v4, 0x0

    :try_start_0
    iput-boolean v1, p0, LHi;->d:Z

    move v5, v4

    :goto_0
    invoke-virtual {p0}, LHi;->d()I

    move-result v6

    iget v7, v3, Lhi;->a:I

    const/4 v8, 0x3

    const v9, 0x550a01fc

    if-eq v6, v7, :cond_e

    if-le v6, v7, :cond_8

    add-int/lit8 v7, v7, 0x1

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0}, LHi;->n()V

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :pswitch_1
    const/4 v5, 0x6

    iput v5, v3, Lhi;->a:I

    goto/16 :goto_4

    :pswitch_2
    invoke-virtual {p0}, LHi;->q()V

    goto/16 :goto_4

    :pswitch_3
    iget-object v5, v3, Lhi;->E:Landroid/view/View;

    const/4 v6, 0x4

    if-eqz v5, :cond_7

    iget-object v5, v3, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v5, :cond_7

    invoke-virtual {v3}, Lhi;->f()Lzi;

    move-result-object v7

    invoke-virtual {v7}, Lzi;->F()LPg;

    invoke-virtual {v5, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v7

    instance-of v10, v7, Lnd;

    if-eqz v10, :cond_2

    check-cast v7, Lnd;

    goto :goto_1

    :cond_2
    new-instance v7, Lnd;

    invoke-direct {v7, v5}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v5, v9, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_1
    iget-object v5, v3, Lhi;->E:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eqz v5, :cond_5

    if-eq v5, v6, :cond_4

    const/16 v9, 0x8

    if-ne v5, v9, :cond_3

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown visibility "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move v8, v6

    goto :goto_2

    :cond_5
    move v8, v2

    :goto_2
    invoke-static {v2}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_6
    invoke-virtual {v7, v8, v2, p0}, Lnd;->a(IILHi;)V

    :cond_7
    iput v6, v3, Lhi;->a:I

    goto/16 :goto_4

    :pswitch_4
    invoke-virtual {p0}, LHi;->a()V

    goto/16 :goto_4

    :pswitch_5
    invoke-virtual {p0}, LHi;->j()V

    invoke-virtual {p0}, LHi;->f()V

    goto/16 :goto_4

    :pswitch_6
    invoke-virtual {p0}, LHi;->e()V

    goto/16 :goto_4

    :pswitch_7
    invoke-virtual {p0}, LHi;->c()V

    goto/16 :goto_4

    :cond_8
    add-int/lit8 v7, v7, -0x1

    packed-switch v7, :pswitch_data_1

    goto :goto_4

    :pswitch_8
    invoke-virtual {p0}, LHi;->l()V

    goto :goto_4

    :pswitch_9
    const/4 v5, 0x5

    iput v5, v3, Lhi;->a:I

    goto :goto_4

    :pswitch_a
    invoke-virtual {p0}, LHi;->r()V

    goto :goto_4

    :pswitch_b
    invoke-static {v8}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_9
    iget-object v5, v3, Lhi;->E:Landroid/view/View;

    if-eqz v5, :cond_a

    iget-object v5, v3, Lhi;->c:Landroid/util/SparseArray;

    if-nez v5, :cond_a

    invoke-virtual {p0}, LHi;->p()V

    :cond_a
    iget-object v5, v3, Lhi;->E:Landroid/view/View;

    if-eqz v5, :cond_d

    iget-object v5, v3, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v5, :cond_d

    invoke-virtual {v3}, Lhi;->f()Lzi;

    move-result-object v6

    invoke-virtual {v6}, Lzi;->F()LPg;

    invoke-virtual {v5, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lnd;

    if-eqz v7, :cond_b

    check-cast v6, Lnd;

    goto :goto_3

    :cond_b
    new-instance v6, Lnd;

    invoke-direct {v6, v5}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v5, v9, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_3
    invoke-static {v2}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_c
    invoke-virtual {v6, v1, v8, p0}, Lnd;->a(IILHi;)V

    :cond_d
    iput v8, v3, Lhi;->a:I

    goto :goto_4

    :pswitch_c
    iput-boolean v4, v3, Lhi;->n:Z

    iput v2, v3, Lhi;->a:I

    goto :goto_4

    :pswitch_d
    invoke-virtual {p0}, LHi;->h()V

    iput v1, v3, Lhi;->a:I

    goto :goto_4

    :pswitch_e
    invoke-virtual {p0}, LHi;->g()V

    goto :goto_4

    :pswitch_f
    invoke-virtual {p0}, LHi;->i()V

    :goto_4
    move v5, v1

    goto/16 :goto_0

    :cond_e
    if-nez v5, :cond_12

    const/4 v5, -0x1

    if-ne v7, v5, :cond_12

    iget-boolean v5, v3, Lhi;->l:Z

    if-eqz v5, :cond_12

    invoke-virtual {v3}, Lhi;->k()Z

    move-result v5

    if-nez v5, :cond_12

    invoke-static {v8}, Lzi;->G(I)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_f
    iget-object v5, v0, Lqs;->d:Ljava/lang/Object;

    check-cast v5, LDi;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Lzi;->G(I)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_10
    iget-object v6, v3, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v5, v6}, LDi;->c(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lqs;->v(LHi;)V

    invoke-static {v8}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_11
    invoke-virtual {v3}, Lhi;->h()V

    :cond_12
    iget-boolean v0, v3, Lhi;->I:Z

    if-eqz v0, :cond_19

    iget-object v0, v3, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_17

    iget-object v0, v3, Lhi;->D:Landroid/view/ViewGroup;

    if-eqz v0, :cond_17

    invoke-virtual {v3}, Lhi;->f()Lzi;

    move-result-object v5

    invoke-virtual {v5}, Lzi;->F()LPg;

    invoke-virtual {v0, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lnd;

    if-eqz v6, :cond_13

    check-cast v5, Lnd;

    goto :goto_5

    :cond_13
    new-instance v5, Lnd;

    invoke-direct {v5, v0}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v9, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_5
    iget-boolean v0, v3, Lhi;->y:Z

    if-eqz v0, :cond_15

    invoke-static {v2}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_14
    invoke-virtual {v5, v8, v1, p0}, Lnd;->a(IILHi;)V

    goto :goto_6

    :cond_15
    invoke-static {v2}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_16
    invoke-virtual {v5, v2, v1, p0}, Lnd;->a(IILHi;)V

    :cond_17
    :goto_6
    iget-object v0, v3, Lhi;->r:Lzi;

    if-eqz v0, :cond_18

    iget-boolean v2, v3, Lhi;->k:Z

    if-eqz v2, :cond_18

    invoke-static {v3}, Lzi;->H(Lhi;)Z

    move-result v2

    if-eqz v2, :cond_18

    iput-boolean v1, v0, Lzi;->E:Z

    :cond_18
    iput-boolean v4, v3, Lhi;->I:Z

    iget-object v0, v3, Lhi;->t:LAi;

    invoke-virtual {v0}, Lzi;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_19
    iput-boolean v4, p0, LHi;->d:Z

    return-void

    :goto_7
    iput-boolean v4, p0, LHi;->d:Z

    throw v0

    nop

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

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->t:LAi;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lzi;->t(I)V

    iget-object v0, v1, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lhi;->N:LLi;

    sget-object v2, LOn;->ON_PAUSE:LOn;

    invoke-virtual {v0, v2}, LLi;->a(LOn;)V

    :cond_1
    iget-object v0, v1, Lhi;->M:Lao;

    sget-object v2, LOn;->ON_PAUSE:LOn;

    invoke-virtual {v0, v2}, Lao;->e(LOn;)V

    const/4 v0, 0x6

    iput v0, v1, Lhi;->a:I

    const/4 v0, 0x1

    iput-boolean v0, v1, Lhi;->C:Z

    iget-object v0, p0, LHi;->a:LP3;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LP3;->s(Lhi;Z)V

    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    iget-object v0, p0, LHi;->c:Lhi;

    iget-object v1, v0, Lhi;->b:Landroid/os/Bundle;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, v0, Lhi;->b:Landroid/os/Bundle;

    const-string v1, "savedInstanceState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, v0, Lhi;->b:Landroid/os/Bundle;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object p1, v0, Lhi;->b:Landroid/os/Bundle;

    const-string v1, "viewState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, v0, Lhi;->c:Landroid/util/SparseArray;

    iget-object p1, v0, Lhi;->b:Landroid/os/Bundle;

    const-string v1, "viewRegistryState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v0, Lhi;->d:Landroid/os/Bundle;

    iget-object p1, v0, Lhi;->b:Landroid/os/Bundle;

    const-string v1, "state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, LGi;

    if-eqz p1, :cond_2

    iget-object v1, p1, LGi;->l:Ljava/lang/String;

    iput-object v1, v0, Lhi;->h:Ljava/lang/String;

    iget v1, p1, LGi;->m:I

    iput v1, v0, Lhi;->i:I

    iget-boolean p1, p1, LGi;->n:Z

    iput-boolean p1, v0, Lhi;->G:Z

    :cond_2
    iget-boolean p1, v0, Lhi;->G:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, v0, Lhi;->F:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final n()V
    .locals 6

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->H:Lfi;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lfi;->k:Landroid/view/View;

    :goto_0
    if-eqz v0, :cond_4

    iget-object v3, v1, Lhi;->E:Landroid/view/View;

    if-ne v0, v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_4

    iget-object v4, v1, Lhi;->E:Landroid/view/View;

    if-ne v3, v4, :cond_3

    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const/4 v3, 0x2

    invoke-static {v3}, Lzi;->G(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, v1, Lhi;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_3

    :cond_3
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    goto :goto_1

    :cond_4
    :goto_3
    invoke-virtual {v1}, Lhi;->b()Lfi;

    move-result-object v0

    iput-object v2, v0, Lfi;->k:Landroid/view/View;

    iget-object v0, v1, Lhi;->t:LAi;

    invoke-virtual {v0}, Lzi;->N()V

    iget-object v0, v1, Lhi;->t:LAi;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lzi;->y(Z)Z

    const/4 v0, 0x7

    iput v0, v1, Lhi;->a:I

    const/4 v3, 0x0

    iput-boolean v3, v1, Lhi;->C:Z

    invoke-virtual {v1}, Lhi;->s()V

    iget-boolean v4, v1, Lhi;->C:Z

    if-eqz v4, :cond_6

    iget-object v4, v1, Lhi;->M:Lao;

    sget-object v5, LOn;->ON_RESUME:LOn;

    invoke-virtual {v4, v5}, Lao;->e(LOn;)V

    iget-object v4, v1, Lhi;->E:Landroid/view/View;

    if-eqz v4, :cond_5

    iget-object v4, v1, Lhi;->N:LLi;

    invoke-virtual {v4, v5}, LLi;->a(LOn;)V

    :cond_5
    iget-object v4, v1, Lhi;->t:LAi;

    iput-boolean v3, v4, Lzi;->F:Z

    iput-boolean v3, v4, Lzi;->G:Z

    iget-object v5, v4, Lzi;->M:LDi;

    iput-boolean v3, v5, LDi;->i:Z

    invoke-virtual {v4, v0}, Lzi;->t(I)V

    iget-object v0, p0, LHi;->a:LP3;

    invoke-virtual {v0, v1, v3}, LP3;->v(Lhi;Z)V

    iget-object v0, p0, LHi;->b:Lqs;

    iget-object v3, v1, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lqs;->D(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    iput-object v2, v1, Lhi;->b:Landroid/os/Bundle;

    iput-object v2, v1, Lhi;->c:Landroid/util/SparseArray;

    iput-object v2, v1, Lhi;->d:Landroid/os/Bundle;

    return-void

    :cond_6
    new-instance v0, LGz;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onResume()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o()Landroid/os/Bundle;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, LHi;->c:Lhi;

    iget v2, v1, Lhi;->a:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Lhi;->b:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    new-instance v2, LGi;

    invoke-direct {v2, v1}, LGi;-><init>(Lhi;)V

    const-string v4, "state"

    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget v2, v1, Lhi;->a:I

    if-le v2, v3, :cond_6

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v2}, Lhi;->t(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "savedInstanceState"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object v3, p0, LHi;->a:LP3;

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v2, v4}, LP3;->w(Lhi;Landroid/os/Bundle;Z)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, v1, Lhi;->P:Lwy;

    invoke-virtual {v3, v2}, Lwy;->e(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "registryState"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    iget-object v2, v1, Lhi;->t:LAi;

    invoke-virtual {v2}, Lzi;->U()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "childFragmentManager"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    iget-object v2, v1, Lhi;->E:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {p0}, LHi;->p()V

    :cond_4
    iget-object v2, v1, Lhi;->c:Landroid/util/SparseArray;

    if-eqz v2, :cond_5

    const-string v3, "viewState"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_5
    iget-object v2, v1, Lhi;->d:Landroid/os/Bundle;

    if-eqz v2, :cond_6

    const-string v3, "viewRegistryState"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    iget-object v1, v1, Lhi;->f:Landroid/os/Bundle;

    if-eqz v1, :cond_7

    const-string v2, "arguments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_7
    return-object v0
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, LHi;->c:Lhi;

    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-lez v2, :cond_2

    iput-object v1, v0, Lhi;->c:Landroid/util/SparseArray;

    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lhi;->N:LLi;

    iget-object v2, v2, LLi;->e:Lwy;

    invoke-virtual {v2, v1}, Lwy;->e(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iput-object v1, v0, Lhi;->d:Landroid/os/Bundle;

    :cond_3
    :goto_0
    return-void
.end method

.method public final q()V
    .locals 5

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->t:LAi;

    invoke-virtual {v0}, Lzi;->N()V

    iget-object v0, v1, Lhi;->t:LAi;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lzi;->y(Z)Z

    const/4 v0, 0x5

    iput v0, v1, Lhi;->a:I

    const/4 v2, 0x0

    iput-boolean v2, v1, Lhi;->C:Z

    invoke-virtual {v1}, Lhi;->u()V

    iget-boolean v3, v1, Lhi;->C:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, Lhi;->M:Lao;

    sget-object v4, LOn;->ON_START:LOn;

    invoke-virtual {v3, v4}, Lao;->e(LOn;)V

    iget-object v3, v1, Lhi;->E:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-object v3, v1, Lhi;->N:LLi;

    invoke-virtual {v3, v4}, LLi;->a(LOn;)V

    :cond_1
    iget-object v3, v1, Lhi;->t:LAi;

    iput-boolean v2, v3, Lzi;->F:Z

    iput-boolean v2, v3, Lzi;->G:Z

    iget-object v4, v3, Lzi;->M:LDi;

    iput-boolean v2, v4, LDi;->i:Z

    invoke-virtual {v3, v0}, Lzi;->t(I)V

    iget-object v0, p0, LHi;->a:LP3;

    invoke-virtual {v0, v1, v2}, LP3;->x(Lhi;Z)V

    return-void

    :cond_2
    new-instance v0, LGz;

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

.method public final r()V
    .locals 4

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    iget-object v1, p0, LHi;->c:Lhi;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Lhi;->t:LAi;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lzi;->G:Z

    iget-object v3, v0, Lzi;->M:LDi;

    iput-boolean v2, v3, LDi;->i:Z

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lzi;->t(I)V

    iget-object v0, v1, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lhi;->N:LLi;

    sget-object v3, LOn;->ON_STOP:LOn;

    invoke-virtual {v0, v3}, LLi;->a(LOn;)V

    :cond_1
    iget-object v0, v1, Lhi;->M:Lao;

    sget-object v3, LOn;->ON_STOP:LOn;

    invoke-virtual {v0, v3}, Lao;->e(LOn;)V

    iput v2, v1, Lhi;->a:I

    const/4 v0, 0x0

    iput-boolean v0, v1, Lhi;->C:Z

    invoke-virtual {v1}, Lhi;->v()V

    iget-boolean v2, v1, Lhi;->C:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, LHi;->a:LP3;

    invoke-virtual {v2, v1, v0}, LP3;->y(Lhi;Z)V

    return-void

    :cond_2
    new-instance v0, LGz;

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
