.class public final La/b7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/b7$a;
    }
.end annotation


# instance fields
.field public final a:La/e7;

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "La/b7$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/e7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b7;->a:La/e7;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->a(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final b(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v1, v0, La/e7;->v:La/X6$a;

    iget-object v1, v1, La/Z6;->b:La/X6;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->b(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final c(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->c(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final d(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->d(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final e(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->e(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final f(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->f(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final g(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v1, v0, La/e7;->v:La/X6$a;

    iget-object v1, v1, La/Z6;->b:La/X6;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->g(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final h(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->h(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final i(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->i(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final j(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, p2, v1}, La/b7;->j(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La/b7$a;

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final k(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->k(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final l(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->l(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final m(Landroidx/fragment/app/b;Landroid/view/View;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, p2, v1}, La/b7;->m(Landroidx/fragment/app/b;Landroid/view/View;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La/b7$a;

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final n(Landroidx/fragment/app/b;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/b7;->a:La/e7;

    iget-object v0, v0, La/e7;->x:Landroidx/fragment/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, La/e7;->n:La/b7;

    invoke-virtual {v0, p1, v1}, La/b7;->n(Landroidx/fragment/app/b;Z)V

    :cond_0
    iget-object p1, p0, La/b7;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b7$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method
