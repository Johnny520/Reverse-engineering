.class public final LfB;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbw;
.implements LXv;


# instance fields
.field public final a:Lbw;

.field public final b:Ljava/lang/Object;

.field public volatile c:Lty;

.field public volatile d:LXv;

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lbw;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, LfB;->e:I

    iput v0, p0, LfB;->f:I

    iput-object p1, p0, LfB;->b:Ljava/lang/Object;

    iput-object p2, p0, LfB;->a:Lbw;

    return-void
.end method


# virtual methods
.method public final a(LXv;)Z
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->a:Lbw;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, Lbw;->a(LXv;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, LfB;->e:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(LXv;)Z
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->a:Lbw;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, Lbw;->b(LXv;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LfB;->e()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c(LXv;)V
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x5

    if-nez p1, :cond_0

    iput v1, p0, LfB;->f:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput v1, p0, LfB;->e:I

    iget-object p1, p0, LfB;->a:Lbw;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lbw;->c(LXv;)V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, LfB;->g:Z

    const/4 v1, 0x3

    iput v1, p0, LfB;->e:I

    iput v1, p0, LfB;->f:I

    iget-object v1, p0, LfB;->d:LXv;

    invoke-interface {v1}, LXv;->clear()V

    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {v1}, Lty;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LfB;->f:I

    invoke-static {v1}, Lph;->d(I)Z

    move-result v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    iput v2, p0, LfB;->f:I

    iget-object v1, p0, LfB;->d:LXv;

    invoke-interface {v1}, LXv;->d()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget v1, p0, LfB;->e:I

    invoke-static {v1}, Lph;->d(I)Z

    move-result v1

    if-nez v1, :cond_1

    iput v2, p0, LfB;->e:I

    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {v1}, Lty;->d()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->d:LXv;

    invoke-interface {v1}, LXv;->e()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {v1}, Lty;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f(LXv;)Z
    .locals 2

    instance-of v0, p1, LfB;

    if-eqz v0, :cond_2

    check-cast p1, LfB;

    iget-object v0, p0, LfB;->c:Lty;

    if-nez v0, :cond_0

    iget-object v0, p1, LfB;->c:Lty;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, LfB;->c:Lty;

    iget-object v1, p1, LfB;->c:Lty;

    invoke-virtual {v0, v1}, Lty;->f(LXv;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, LfB;->d:LXv;

    if-nez v0, :cond_1

    iget-object p1, p1, LfB;->d:LXv;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_1
    iget-object v0, p0, LfB;->d:LXv;

    iget-object p1, p1, LfB;->d:LXv;

    invoke-interface {v0, p1}, LXv;->f(LXv;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final g(LXv;)Z
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->a:Lbw;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, Lbw;->g(LXv;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget p1, p0, LfB;->e:I

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final getRoot()Lbw;
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->a:Lbw;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lbw;->getRoot()Lbw;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v1, p0

    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h(LXv;)V
    .locals 2

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfB;->d:LXv;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    iput v1, p0, LfB;->f:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput v1, p0, LfB;->e:I

    iget-object p1, p0, LfB;->a:Lbw;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lbw;->h(LXv;)V

    :cond_1
    iget p1, p0, LfB;->f:I

    invoke-static {p1}, Lph;->d(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LfB;->d:LXv;

    invoke-interface {p1}, LXv;->clear()V

    :cond_2
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i()Z
    .locals 3

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LfB;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final isRunning()Z
    .locals 3

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LfB;->e:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()V
    .locals 5

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LfB;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    :try_start_1
    iget v3, p0, LfB;->e:I

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    iget v3, p0, LfB;->f:I

    if-eq v3, v1, :cond_0

    iput v1, p0, LfB;->f:I

    iget-object v3, p0, LfB;->d:LXv;

    invoke-interface {v3}, LXv;->j()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-boolean v3, p0, LfB;->g:Z

    if-eqz v3, :cond_1

    iget v3, p0, LfB;->e:I

    if-eq v3, v1, :cond_1

    iput v1, p0, LfB;->e:I

    iget-object v1, p0, LfB;->c:Lty;

    invoke-virtual {v1}, Lty;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    iput-boolean v2, p0, LfB;->g:Z

    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    goto :goto_2

    :goto_1
    iput-boolean v2, p0, LfB;->g:Z

    throw v1

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final k()Z
    .locals 3

    iget-object v0, p0, LfB;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LfB;->e:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
