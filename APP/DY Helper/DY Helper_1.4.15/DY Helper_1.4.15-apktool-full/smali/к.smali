.class public abstract Lк;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:[Lл;

.field public ζ:I

.field public η:I

.field public θ:Lk12;


# virtual methods
.method public final α()Lл;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lк;->ε:[Lл;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lк;->ε()[Lл;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lк;->ε:[Lл;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget v1, p0, Lк;->ζ:I

    .line 16
    .line 17
    array-length v2, v0

    .line 18
    if-lt v1, v2, :cond_1

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    mul-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, [Lл;

    .line 29
    .line 30
    iput-object v1, p0, Lк;->ε:[Lл;

    .line 31
    .line 32
    check-cast v0, [Lл;

    .line 33
    .line 34
    :cond_1
    :goto_0
    iget v1, p0, Lк;->η:I

    .line 35
    .line 36
    :cond_2
    aget-object v2, v0, v1

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Lк;->β()Lл;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    aput-object v2, v0, v1

    .line 45
    .line 46
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    array-length v3, v0

    .line 49
    if-lt v1, v3, :cond_4

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    :cond_4
    invoke-virtual {v2, p0}, Lл;->α(Lк;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    iput v1, p0, Lк;->η:I

    .line 59
    .line 60
    iget v0, p0, Lк;->ζ:I

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    add-int/2addr v0, v1

    .line 64
    iput v0, p0, Lк;->ζ:I

    .line 65
    .line 66
    iget-object v0, p0, Lк;->θ:Lk12;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    monitor-exit p0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lk12;->π(I)V

    .line 72
    .line 73
    .line 74
    :cond_5
    return-object v2

    .line 75
    :goto_1
    monitor-exit p0

    .line 76
    throw v0
.end method

.method public abstract β()Lл;
.end method

.method public abstract ε()[Lл;
.end method

.method public final ζ(Lл;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lк;->ζ:I

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    add-int/2addr v0, v1

    .line 6
    iput v0, p0, Lк;->ζ:I

    .line 7
    .line 8
    iget-object v2, p0, Lк;->θ:Lk12;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput v3, p0, Lк;->η:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lл;->β(Lк;)[Lop;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    .line 26
    array-length p0, p1

    .line 27
    :goto_1
    if-ge v3, p0, :cond_2

    .line 28
    .line 29
    aget-object v0, p1, v3

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v4, Ls62;->α:Ls62;

    .line 34
    .line 35
    invoke-interface {v0, v4}, Lop;->ζ(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Lk12;->π(I)V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void

    .line 47
    :goto_2
    monitor-exit p0

    .line 48
    throw p1
.end method

.method public final η()Lk12;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lк;->θ:Lk12;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lk12;

    .line 7
    .line 8
    iget v1, p0, Lк;->ζ:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lk12;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lк;->θ:Lk12;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit p0

    .line 19
    return-object v0

    .line 20
    :goto_1
    monitor-exit p0

    .line 21
    throw v0
.end method
