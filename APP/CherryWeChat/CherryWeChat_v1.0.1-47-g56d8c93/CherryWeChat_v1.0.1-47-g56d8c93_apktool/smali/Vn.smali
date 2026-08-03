.class public final LVn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQn;
.implements LXn;


# instance fields
.field public final a:Ljava/util/HashSet;

.field public final b:LRn;


# direct methods
.method public constructor <init>(LRn;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LVn;->a:Ljava/util/HashSet;

    iput-object p1, p0, LVn;->b:LRn;

    invoke-virtual {p1, p0}, LRn;->a(LXn;)V

    return-void
.end method


# virtual methods
.method public final d(LWn;)V
    .locals 1

    iget-object v0, p0, LVn;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final l(LWn;)V
    .locals 2

    iget-object v0, p0, LVn;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LVn;->b:LRn;

    check-cast v0, Lao;

    iget-object v0, v0, Lao;->c:LPn;

    sget-object v1, LPn;->a:LPn;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, LWn;->b()V

    return-void

    :cond_0
    sget-object v1, LPn;->d:LPn;

    invoke-virtual {v0, v1}, LPn;->a(LPn;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LWn;->k()V

    return-void

    :cond_1
    invoke-interface {p1}, LWn;->d()V

    return-void
.end method

.method public onDestroy(LYn;)V
    .locals 2
    .annotation runtime Lqt;
        value = .enum LOn;->ON_DESTROY:LOn;
    .end annotation

    iget-object v0, p0, LVn;->a:Ljava/util/HashSet;

    invoke-static {v0}, LvD;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWn;

    invoke-interface {v1}, LWn;->b()V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LYn;->getLifecycle()LRn;

    move-result-object p1

    invoke-virtual {p1, p0}, LRn;->b(LXn;)V

    return-void
.end method

.method public onStart(LYn;)V
    .locals 1
    .annotation runtime Lqt;
        value = .enum LOn;->ON_START:LOn;
    .end annotation

    iget-object p1, p0, LVn;->a:Ljava/util/HashSet;

    invoke-static {p1}, LvD;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWn;

    invoke-interface {v0}, LWn;->k()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStop(LYn;)V
    .locals 1
    .annotation runtime Lqt;
        value = .enum LOn;->ON_STOP:LOn;
    .end annotation

    iget-object p1, p0, LVn;->a:Ljava/util/HashSet;

    invoke-static {p1}, LvD;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWn;

    invoke-interface {v0}, LWn;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method
