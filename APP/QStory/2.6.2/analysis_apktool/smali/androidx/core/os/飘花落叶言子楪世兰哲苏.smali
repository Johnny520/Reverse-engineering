.class public final Landroidx/core/os/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Z

.field public 飘花落叶言子楪世苏兰哲:Landroidx/core/os/飘花落叶言子楪世兰苏哲;

.field public 飘花落叶言子楪世苏哲兰:Z


# virtual methods
.method public setOnCancelListener(Landroidx/core/os/飘花落叶言子楪世兰苏哲;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :catch_0
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Landroidx/core/os/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_2
    iget-object v0, p0, Landroidx/core/os/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/core/os/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    if-ne v0, p1, :cond_1

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    goto :goto_2

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_3

    .line 18
    :cond_1
    iput-object p1, p0, Landroidx/core/os/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/core/os/飘花落叶言子楪世兰苏哲;

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/core/os/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    invoke-interface {p1}, Landroidx/core/os/飘花落叶言子楪世兰苏哲;->onCancel()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_3
    :goto_1
    :try_start_3
    monitor-exit p0

    .line 33
    :goto_2
    return-void

    .line 34
    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    throw p1
.end method
