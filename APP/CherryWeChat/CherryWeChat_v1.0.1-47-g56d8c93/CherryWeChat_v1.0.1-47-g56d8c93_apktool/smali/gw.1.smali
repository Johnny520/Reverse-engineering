.class public final Lgw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements LWn;


# static fields
.field public static final k:Lmw;


# instance fields
.field public final a:Lcom/bumptech/glide/a;

.field public final b:Landroid/content/Context;

.field public final c:LQn;

.field public final d:Lwy;

.field public final e:Llw;

.field public final f:LhA;

.field public final g:LK0;

.field public final h:Lab;

.field public final i:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final j:Lmw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmw;

    invoke-direct {v0}, Ly5;-><init>()V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ly5;->d(Ljava/lang/Class;)Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ly5;->n:Z

    sput-object v0, Lgw;->k:Lmw;

    new-instance v0, Lmw;

    invoke-direct {v0}, Ly5;-><init>()V

    const-class v2, LAj;

    invoke-virtual {v0, v2}, Ly5;->d(Ljava/lang/Class;)Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    iput-boolean v1, v0, Ly5;->n:Z

    new-instance v0, Lmw;

    invoke-direct {v0}, Ly5;-><init>()V

    sget-object v1, LVd;->d:LVd;

    invoke-virtual {v0, v1}, Ly5;->e(LVd;)Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    invoke-virtual {v0}, Ly5;->l()Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    invoke-virtual {v0}, Ly5;->q()Ly5;

    move-result-object v0

    check-cast v0, Lmw;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;LQn;Llw;Landroid/content/Context;)V
    .locals 4

    new-instance v0, Lwy;

    invoke-direct {v0}, Lwy;-><init>()V

    iget-object v1, p1, Lcom/bumptech/glide/a;->f:Lm6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, LhA;

    invoke-direct {v2}, LhA;-><init>()V

    iput-object v2, p0, Lgw;->f:LhA;

    new-instance v2, LK0;

    const/16 v3, 0xc

    invoke-direct {v2, v3, p0}, LK0;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Lgw;->g:LK0;

    iput-object p1, p0, Lgw;->a:Lcom/bumptech/glide/a;

    iput-object p2, p0, Lgw;->c:LQn;

    iput-object p3, p0, Lgw;->e:Llw;

    iput-object v0, p0, Lgw;->d:Lwy;

    iput-object p4, p0, Lgw;->b:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    new-instance p4, Lfw;

    invoke-direct {p4, p0, v0}, Lfw;-><init>(Lgw;Lwy;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p3, v0}, LGu;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LNc;

    invoke-direct {v0, p3, p4}, LNc;-><init>(Landroid/content/Context;Lfw;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lbt;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    iput-object v0, p0, Lgw;->h:Lab;

    iget-object p3, p1, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    monitor-enter p3

    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_6

    iget-object p4, p1, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    sget-object p3, LvD;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    const/4 v1, 0x1

    if-ne p3, p4, :cond_1

    move p3, v1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    if-nez p3, :cond_2

    invoke-static {}, LvD;->f()Landroid/os/Handler;

    move-result-object p3

    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_2
    invoke-interface {p2, p0}, LQn;->l(LWn;)V

    :goto_2
    invoke-interface {p2, v0}, LQn;->l(LWn;)V

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p3, p1, Lcom/bumptech/glide/a;->c:LRj;

    iget-object p3, p3, LRj;->e:Ljava/util/List;

    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lgw;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p1, p1, Lcom/bumptech/glide/a;->c:LRj;

    monitor-enter p1

    :try_start_1
    iget-object p2, p1, LRj;->j:Lmw;

    if-nez p2, :cond_3

    iget-object p2, p1, LRj;->d:LPg;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lmw;

    invoke-direct {p2}, Ly5;-><init>()V

    iput-boolean v1, p2, Ly5;->n:Z

    iput-object p2, p1, LRj;->j:Lmw;

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_5

    :cond_3
    :goto_3
    iget-object p2, p1, LRj;->j:Lmw;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    monitor-enter p0

    :try_start_2
    invoke-virtual {p2}, Ly5;->c()Ly5;

    move-result-object p1

    check-cast p1, Lmw;

    iget-boolean p2, p1, Ly5;->n:Z

    if-eqz p2, :cond_5

    iget-boolean p2, p1, Ly5;->o:Z

    if-eqz p2, :cond_4

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_4
    iput-boolean v1, p1, Ly5;->o:Z

    iput-boolean v1, p1, Ly5;->n:Z

    iput-object p1, p0, Lgw;->j:Lmw;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :goto_5
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p2

    :catchall_2
    move-exception p1

    goto :goto_6

    :cond_6
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot register already registered manager"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_6
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgw;->f:LhA;

    invoke-virtual {v0}, LhA;->b()V

    invoke-virtual {p0}, Lgw;->m()V

    iget-object v0, p0, Lgw;->d:Lwy;

    iget-object v1, v0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, LvD;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXv;

    invoke-virtual {v0, v2}, Lwy;->a(LXv;)Z

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    iget-object v0, p0, Lgw;->c:LQn;

    invoke-interface {v0, p0}, LQn;->d(LWn;)V

    iget-object v0, p0, Lgw;->c:LQn;

    iget-object v1, p0, Lgw;->h:Lab;

    invoke-interface {v0, v1}, LQn;->d(LWn;)V

    iget-object v0, p0, Lgw;->g:LK0;

    invoke-static {}, LvD;->f()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lgw;->a:Lcom/bumptech/glide/a;

    iget-object v1, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot unregister not yet registered manager"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgw;->f:LhA;

    invoke-virtual {v0}, LhA;->d()V

    invoke-virtual {p0}, Lgw;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized k()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lgw;->p()V

    iget-object v0, p0, Lgw;->f:LhA;

    invoke-virtual {v0}, LhA;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final l(LgA;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lgw;->q(LgA;)Z

    move-result v0

    invoke-interface {p1}, LgA;->a()LXv;

    move-result-object v1

    if-nez v0, :cond_3

    iget-object v0, p0, Lgw;->a:Lcom/bumptech/glide/a;

    iget-object v2, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgw;

    invoke-virtual {v3, p1}, Lgw;->q(LgA;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LgA;->g(LXv;)V

    invoke-interface {v1}, LXv;->clear()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final declared-synchronized m()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgw;->f:LhA;

    iget-object v0, v0, LhA;->a:Ljava/util/Set;

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

    check-cast v1, LgA;

    invoke-virtual {p0, v1}, Lgw;->l(LgA;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lgw;->f:LhA;

    iget-object v0, v0, LhA;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final n(Ljava/lang/String;)Law;
    .locals 4

    new-instance v0, Law;

    iget-object v1, p0, Lgw;->a:Lcom/bumptech/glide/a;

    iget-object v2, p0, Lgw;->b:Landroid/content/Context;

    const-class v3, Landroid/graphics/drawable/Drawable;

    invoke-direct {v0, v1, p0, v3, v2}, Law;-><init>(Lcom/bumptech/glide/a;Lgw;Ljava/lang/Class;Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Law;->C(Ljava/lang/Object;)Law;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized o()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgw;->d:Lwy;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lwy;->b:Z

    iget-object v1, v0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, LvD;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXv;

    invoke-interface {v2}, LXv;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, LXv;->d()V

    iget-object v3, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized p()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgw;->d:Lwy;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lwy;->b:Z

    iget-object v1, v0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, LvD;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXv;

    invoke-interface {v2}, LXv;->k()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, LXv;->isRunning()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, LXv;->j()V

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized q(LgA;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, LgA;->a()LXv;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v2, p0, Lgw;->d:Lwy;

    invoke-virtual {v2, v0}, Lwy;->a(LXv;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgw;->f:LhA;

    iget-object v0, v0, LhA;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LgA;->g(LXv;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{tracker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgw;->d:Lwy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", treeNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgw;->e:Llw;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
