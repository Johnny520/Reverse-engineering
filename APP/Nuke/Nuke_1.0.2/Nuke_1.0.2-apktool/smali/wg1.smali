.class public final Lwg1;
.super Lag1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final a(Lz70;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb42;

    .line 4
    .line 5
    iget-object v1, p0, Lgx0;->i:Lr30;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lb42;->p(Lr30;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lz70;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lb42;

    .line 13
    .line 14
    iget-object v1, p0, Lag1;->j:Lm30;

    .line 15
    .line 16
    iget-object v1, v1, Lm30;->i:Lo30;

    .line 17
    .line 18
    iget-object v1, v1, Lo30;->h:Lq30;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lb42;->o(Lq30;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lz70;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lb42;

    .line 26
    .line 27
    iget-object p0, p0, Lag1;->j:Lm30;

    .line 28
    .line 29
    check-cast p0, Ln30;

    .line 30
    .line 31
    iget-object p0, p0, Ln30;->j:Ld42;

    .line 32
    .line 33
    monitor-enter p1

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-virtual {p1}, Ljm2;->g()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p1, Lb42;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/TreeMap;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La42;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    new-instance v0, La42;

    .line 52
    .line 53
    invoke-direct {v0, p0}, La42;-><init>(Ld42;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p1, Lb42;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/util/TreeMap;

    .line 59
    .line 60
    invoke-virtual {v1, p0, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    :goto_0
    monitor-exit p1

    .line 67
    return-void

    .line 68
    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 69
    .line 70
    const-string v0, "prototype == null"

    .line 71
    .line 72
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p0
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->p:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lz70;)I
    .locals 1

    .line 1
    iget-object p1, p1, Lz70;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lb42;

    .line 4
    .line 5
    iget-object p0, p0, Lag1;->j:Lm30;

    .line 6
    .line 7
    check-cast p0, Ln30;

    .line 8
    .line 9
    iget-object p0, p0, Ln30;->j:Ld42;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Ljm2;->f()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lb42;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Ljava/util/TreeMap;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La42;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Liy0;->e()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_0
    const-string p0, "not found"

    .line 35
    .line 36
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const-string p0, "prototype == null"

    .line 44
    .line 45
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "proto_idx"

    .line 2
    .line 3
    return-object p0
.end method
