.class public final LMy;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:I

.field public final c:Lhi;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/LinkedHashSet;

.field public f:Z

.field public g:Z

.field public final h:LHi;


# direct methods
.method public constructor <init>(IILHi;LO6;)V
    .locals 1

    iget-object v0, p3, LHi;->c:Lhi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LMy;->a:I

    iput p2, p0, LMy;->b:I

    iput-object v0, p0, LMy;->c:Lhi;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LMy;->d:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LMy;->e:Ljava/util/LinkedHashSet;

    new-instance p1, Lrl;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Lrl;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p4, p1}, LO6;->a(LN6;)V

    iput-object p3, p0, LMy;->h:LHi;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, LMy;->e:Ljava/util/LinkedHashSet;

    iget-boolean v1, p0, LMy;->f:Z

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LMy;->f:Z

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LMy;->b()V

    return-void

    :cond_1
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO6;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, v2, LO6;->a:Z

    if-eqz v3, :cond_2

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    iput-boolean v1, v2, LO6;->a:Z

    iput-boolean v1, v2, LO6;->c:Z

    iget-object v3, v2, LO6;->b:LN6;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    :try_start_1
    invoke-interface {v3}, LN6;->onCancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-enter v2

    :try_start_2
    iput-boolean v4, v2, LO6;->c:Z

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :cond_3
    :goto_1
    monitor-enter v2

    :try_start_4
    iput-boolean v4, v2, LO6;->c:Z

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v2

    goto :goto_0

    :catchall_3
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :goto_2
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :cond_4
    :goto_3
    return-void
.end method

.method public final b()V
    .locals 2

    iget-boolean v0, p0, LMy;->g:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LMy;->toString()Ljava/lang/String;

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LMy;->g:Z

    iget-object v0, p0, LMy;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, LMy;->h:LHi;

    invoke-virtual {v0}, LHi;->k()V

    return-void
.end method

.method public final c(II)V
    .locals 3

    invoke-static {p2}, LEy;->v(I)I

    move-result p2

    iget-object v0, p0, LMy;->c:Lhi;

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eqz p2, :cond_4

    if-eq p2, v1, :cond_2

    if-eq p2, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v2}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    iput v1, p0, LMy;->a:I

    const/4 p1, 0x3

    iput p1, p0, LMy;->b:I

    return-void

    :cond_2
    iget p1, p0, LMy;->a:I

    if-ne p1, v1, :cond_7

    invoke-static {v2}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_3
    iput v2, p0, LMy;->a:I

    iput v2, p0, LMy;->b:I

    return-void

    :cond_4
    iget p2, p0, LMy;->a:I

    if-eq p2, v1, :cond_7

    invoke-static {v2}, Lzi;->G(I)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const/4 p2, 0x1

    if-eq p1, p2, :cond_6

    const/4 p2, 0x2

    if-eq p1, p2, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_6

    const/4 p2, 0x4

    if-ne p1, p2, :cond_5

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    throw p1

    :cond_6
    :goto_0
    iput p1, p0, LMy;->a:I

    :cond_7
    :goto_1
    return-void
.end method

.method public final d()V
    .locals 5

    iget v0, p0, LMy;->b:I

    const/4 v1, 0x2

    iget-object v2, p0, LMy;->h:LHi;

    if-ne v0, v1, :cond_4

    iget-object v0, v2, LHi;->c:Lhi;

    iget-object v3, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lhi;->b()Lfi;

    move-result-object v4

    iput-object v3, v4, Lfi;->k:Landroid/view/View;

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Lhi;->toString()Ljava/lang/String;

    :cond_0
    iget-object v1, p0, LMy;->c:Lhi;

    invoke-virtual {v1}, Lhi;->z()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    invoke-virtual {v2}, LHi;->b()V

    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v0, v0, Lhi;->H:Lfi;

    if-nez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_3
    iget v0, v0, Lfi;->j:F

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_4
    const/4 v3, 0x3

    if-ne v0, v3, :cond_6

    iget-object v0, v2, LHi;->c:Lhi;

    invoke-virtual {v0}, Lhi;->z()Landroid/view/View;

    move-result-object v2

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v2}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Lhi;->toString()Ljava/lang/String;

    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->clearFocus()V

    :cond_6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Operation {"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "} {finalState = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LMy;->a:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const-string v0, "null"

    goto :goto_0

    :cond_0
    const-string v0, "INVISIBLE"

    goto :goto_0

    :cond_1
    const-string v0, "GONE"

    goto :goto_0

    :cond_2
    const-string v0, "VISIBLE"

    goto :goto_0

    :cond_3
    const-string v0, "REMOVED"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " lifecycleImpact = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LMy;->b:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_4

    const-string v0, "null"

    goto :goto_1

    :cond_4
    const-string v0, "REMOVING"

    goto :goto_1

    :cond_5
    const-string v0, "ADDING"

    goto :goto_1

    :cond_6
    const-string v0, "NONE"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " fragment = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LMy;->c:Lhi;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
