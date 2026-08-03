.class public final Lot;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:LD4;

.field public c:Lri;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lot;->a:Ljava/lang/Runnable;

    new-instance p1, LD4;

    invoke-direct {p1}, LD4;-><init>()V

    iput-object p1, p0, Lot;->b:LD4;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    new-instance p1, Lht;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Lht;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lht;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lht;-><init>(ILjava/lang/Object;)V

    new-instance v1, Ljt;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ljt;-><init>(Lot;I)V

    new-instance v2, Ljt;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Ljt;-><init>(Lot;I)V

    invoke-static {p1, v0, v1, v2}, LGu;->h(Lht;Lht;Ljt;Ljt;)Lkt;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljt;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Ljt;-><init>(Lot;I)V

    new-instance v0, Lw3;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lw3;-><init>(ILjava/lang/Object;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lot;->d:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lot;->c:Lri;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lot;->b:LD4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lri;

    iget-boolean v3, v3, Lri;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    check-cast v2, Lri;

    :cond_2
    iput-object v1, p0, Lot;->c:Lri;

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lot;->c:Lri;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lot;->b:LD4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v0, LD4;->c:I

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lri;

    iget-boolean v3, v3, Lri;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Lri;

    :cond_2
    iput-object v1, p0, Lot;->c:Lri;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lri;->d:Lzi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lzi;->y(Z)Z

    iget-object v1, v0, Lzi;->h:Lri;

    iget-boolean v1, v1, Lri;->a:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lzi;->O()Z

    return-void

    :cond_3
    iget-object v0, v0, Lzi;->g:Lot;

    invoke-virtual {v0}, Lot;->b()V

    return-void

    :cond_4
    iget-object v0, p0, Lot;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final c(Z)V
    .locals 3

    iget-object v0, p0, Lot;->e:Landroid/window/OnBackInvokedDispatcher;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lot;->d:Landroid/window/OnBackInvokedCallback;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lot;->f:Z

    if-nez v2, :cond_0

    invoke-static {v0, v1}, LX;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lot;->f:Z

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lot;->f:Z

    if-eqz p1, :cond_1

    invoke-static {v0, v1}, LX;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lot;->f:Z

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 4

    iget-boolean v0, p0, Lot;->g:Z

    const/4 v1, 0x0

    iget-object v2, p0, Lot;->b:LD4;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lri;

    iget-boolean v3, v3, Lri;->a:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    iput-boolean v1, p0, Lot;->g:Z

    if-eq v1, v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_3

    invoke-virtual {p0, v1}, Lot;->c(Z)V

    :cond_3
    return-void
.end method
