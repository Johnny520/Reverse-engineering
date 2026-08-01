.class public final Lsa0;
.super Lf21;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# virtual methods
.method public final Ε(La80;La80;)Lf21;
    .locals 1

    .line 1
    new-instance p0, Lxv;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, p1, v0, p2}, Lxv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lxj0;

    .line 8
    .line 9
    const/16 p2, 0x9

    .line 10
    .line 11
    invoke-direct {p1, p0, p2}, Lxj0;-><init>(La80;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lax1;->ε(La80;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ltw1;

    .line 19
    .line 20
    check-cast p0, Lf21;

    .line 21
    .line 22
    return-object p0
.end method

.method public final γ()V
    .locals 1

    .line 1
    sget-object v0, Lax1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ltw1;->ο()V
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

.method public final λ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final μ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final ν()V
    .locals 0

    .line 1
    invoke-static {}, Lax1;->α()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final φ(La80;)Ltw1;
    .locals 1

    .line 1
    new-instance p0, Loc;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0, p1}, Loc;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lxj0;

    .line 8
    .line 9
    const/16 v0, 0x9

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, Lxj0;-><init>(La80;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lax1;->ε(La80;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ltw1;

    .line 19
    .line 20
    check-cast p0, Lok1;

    .line 21
    .line 22
    return-object p0
.end method

.method public final ψ()Lg81;
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
