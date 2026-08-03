.class public abstract Lnd/b0;
.super Lnd/r;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/k;
.implements Lhc/c;


# virtual methods
.method public final I(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lbc/a;->l:Lbc/a;

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lnd/o;->b(Lnd/b0;Lbc/a;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final J(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lbc/a;->k:Lbc/a;

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lnd/o;->b(Lnd/b0;Lbc/a;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lxe/h;->c:Lmh/b;

    .line 2
    .line 3
    invoke-interface {p0}, Lud/k;->n()Lud/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lud/u;->b:Lxe/h;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, v0, Lxe/h;->b:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    sget-object v1, Lxe/h;->c:Lmh/b;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lxe/h;->b(Lud/k;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v1, v2}, Lmh/b;->v(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    sget-object v0, Lbc/a;->j:Lbc/a;

    .line 26
    .line 27
    invoke-static {p0, v0, p1}, Lnd/o;->b(Lnd/b0;Lbc/a;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lmd/a;->Z:Lmd/a;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lmd/e;->w(Lmd/a;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
.end method

.method public final L(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lbc/a;->j:Lbc/a;

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lnd/o;->b(Lnd/b0;Lbc/a;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final M(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lud/k;->n()Lud/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 6
    .line 7
    iget-object v0, v0, Lbc/g;->F:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p2}, Lxe/s;->g(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p1, v0, p2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object p2, Lbc/a;->j:Lbc/a;

    .line 18
    .line 19
    invoke-static {p0, p2, p1}, Lnd/o;->b(Lnd/b0;Lbc/a;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final N(Lbc/a;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lud/k;->n()Lud/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 6
    .line 7
    iget-object v0, v0, Lbc/g;->H:Lbc/a;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-gt p1, v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public abstract O()Lb5/k;
.end method

.method public abstract P()Lud/e;
.end method

.method public abstract Q(Lb5/k;)V
.end method
