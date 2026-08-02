.class public final Lhq0;
.super Lwk1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final C(Lin0;Lin0;)Lwk1;
    .locals 1

    .line 1
    new-instance p0, Lzh;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-direct {p0, v0, p1, p2}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lwo0;

    .line 8
    .line 9
    const/4 p2, 0x4

    .line 10
    invoke-direct {p1, p0, p2}, Lwo0;-><init>(Lin0;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lds2;->e(Lin0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lvr2;

    .line 18
    .line 19
    check-cast p0, Lwk1;

    .line 20
    .line 21
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    sget-object v0, Lds2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lvr2;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0

    .line 11
    throw p0
.end method

.method public final k()V
    .locals 0

    .line 1
    invoke-static {}, Lp40;->b0()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final l()V
    .locals 0

    .line 1
    invoke-static {}, Lp40;->b0()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final m()V
    .locals 0

    .line 1
    invoke-static {}, Lds2;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final u(Lin0;)Lvr2;
    .locals 1

    .line 1
    new-instance p0, Lgq0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lgq0;-><init>(Lin0;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lwo0;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    invoke-direct {p1, p0, v0}, Lwo0;-><init>(Lin0;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lds2;->e(Lin0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lvr2;

    .line 18
    .line 19
    check-cast p0, Ll52;

    .line 20
    .line 21
    return-object p0
.end method

.method public final w()Lp40;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
