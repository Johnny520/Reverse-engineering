.class public final LYue/ۥۣ۟ۨۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۨۧ$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:LYue/ۥۣ۟ۨۧ$ۥ;

.field public ۥ۟۟:Ljava/lang/Object;

.field public ۥ۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ:Z

    iput-boolean v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟۟:Z

    iget-object v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟:LYue/ۥۣ۟ۨۧ$ۥ;

    iget-object v1, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟:Ljava/lang/Object;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0}, LYue/ۥۣ۟ۨۧ$ۥ;->onCancel()V

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    check-cast v1, Landroid/os/CancellationSignal;

    invoke-virtual {v1}, Landroid/os/CancellationSignal;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :goto_1
    monitor-enter p0

    :try_start_2
    iput-boolean v2, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟۟:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :cond_2
    :goto_2
    monitor-enter p0

    :try_start_4
    iput-boolean v2, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟۟:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_3
    move-exception v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public ۥ۟()Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟:Ljava/lang/Object;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/CancellationSignal;

    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟:Ljava/lang/Object;

    iget-boolean v1, p0, LYue/ۥۣ۟ۨۧ;->ۥ:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟:Ljava/lang/Object;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public ۥ۟۟()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ:Z

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public ۥ۟۟۟(LYue/ۥۣ۟ۨۧ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۨۧ$ۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۨۧ;->ۥ۟۟۟۠()V

    iget-object v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟:LYue/ۥۣ۟ۨۧ$ۥ;

    if-ne v0, p1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput-object p1, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟:LYue/ۥۣ۟ۨۧ$ۥ;

    iget-boolean v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ:Z

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, LYue/ۥۣ۟ۨۧ$ۥ;->onCancel()V

    return-void

    :cond_2
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۨۧ;->ۥ۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥۣۡۤ۟;

    invoke-direct {v0}, LYue/ۥۣۡۤ۟;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۟۠()V
    .locals 1

    :catch_0
    :goto_0
    iget-boolean v0, p0, LYue/ۥۣ۟ۨۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void
.end method
