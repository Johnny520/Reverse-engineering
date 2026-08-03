.class public final Ls7/g;
.super Ls7/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Lr7/a;

.field public p:I

.field public q:Z


# direct methods
.method public constructor <init>(Lr7/a;Lp7/i;Lo7/c;Lokio/a;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lp7/i;->w:Lr7/f;

    .line 2
    .line 3
    invoke-direct {p0, v0, p3}, Ls7/d;-><init>(Lr7/f;Lo7/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ls7/g;->o:Lr7/a;

    .line 7
    .line 8
    new-instance p1, Lq9/a;

    .line 9
    .line 10
    const/4 p3, 0x4

    .line 11
    invoke-direct {p1, p0, p3}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p2, Lp7/i;->y:Lq9/a;

    .line 15
    .line 16
    new-instance p1, Le9/a;

    .line 17
    .line 18
    const/4 p3, 0x6

    .line 19
    invoke-direct {p1, p4, p3, p2}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lo7/b;->b0(Lk7/f;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final L(ILk7/a;)V
    .locals 1

    .line 1
    check-cast p2, Lr7/s;

    .line 2
    .line 3
    const-class v0, Lu7/c;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lu7/c;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lu7/c;->Y(ILr7/s;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Lo7/b;->L(ILk7/a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final V()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ls7/d;->l0()Lo7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lo7/c;->c0(I)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Ls7/g;->q:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ls7/g;->m0()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final W(Lk7/a;)V
    .locals 8

    .line 1
    check-cast p1, Lr7/s;

    .line 2
    .line 3
    const-class v0, Lu7/c;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lu7/c;

    .line 10
    .line 11
    iget-boolean v1, v0, Lu7/c;->s:Z

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_8

    .line 16
    .line 17
    iget-object v0, v0, Lu7/c;->r:Lf1/h;

    .line 18
    .line 19
    invoke-virtual {p1}, Lr7/s;->Y()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v4, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v4

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    :try_start_0
    monitor-exit v4

    .line 29
    goto :goto_2

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v0, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/HashMap;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    monitor-exit v4

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    monitor-exit v4

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const-class v7, Lz7/o;

    .line 53
    .line 54
    if-ne v6, v7, :cond_6

    .line 55
    .line 56
    check-cast v5, Lz7/o;

    .line 57
    .line 58
    invoke-virtual {v5, p1, v3, v2}, Lz7/c;->f(Ljava/lang/Object;ZI)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-gez v6, :cond_3

    .line 63
    .line 64
    monitor-exit v4

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {v5, v6}, Lz7/c;->remove(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Lz7/c;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    iget v6, v5, Lz7/c;->i:I

    .line 80
    .line 81
    if-ne v6, v3, :cond_5

    .line 82
    .line 83
    iget-object v5, v5, Lz7/c;->g:[Ljava/lang/Object;

    .line 84
    .line 85
    aget-object v5, v5, v2

    .line 86
    .line 87
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_5
    :goto_0
    monitor-exit v4

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    if-ne v5, p1, :cond_7

    .line 96
    .line 97
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    monitor-exit v4

    .line 101
    goto :goto_2

    .line 102
    :cond_7
    monitor-exit v4

    .line 103
    goto :goto_2

    .line 104
    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    throw p1

    .line 106
    :cond_8
    :goto_2
    iget-object v0, p1, Lr7/s;->q:Lr7/u;

    .line 107
    .line 108
    if-eqz v0, :cond_9

    .line 109
    .line 110
    invoke-virtual {v0}, Lr7/u;->R()V

    .line 111
    .line 112
    .line 113
    :cond_9
    const/4 v0, 0x0

    .line 114
    invoke-virtual {p1, v0}, Lk7/a;->J(Lk7/a;)V

    .line 115
    .line 116
    .line 117
    iput v2, p0, Ls7/g;->p:I

    .line 118
    .line 119
    iput-boolean v3, p0, Ls7/g;->q:Z

    .line 120
    .line 121
    return-void
.end method

.method public final Y(Lq7/b;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ls7/d;->Y(Lq7/b;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Ls7/g;->p:I

    .line 6
    .line 7
    iput-boolean p1, p0, Ls7/g;->q:Z

    .line 8
    .line 9
    return-void
.end method

.method public final j0()I
    .locals 2

    .line 1
    invoke-super {p0}, Ls7/d;->j0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ls7/g;->o:Lr7/a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lr7/b;->p()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sub-int v1, v0, v1

    .line 12
    .line 13
    iput v1, p0, Ls7/g;->p:I

    .line 14
    .line 15
    return v0
.end method

.method public final k0()Lr7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls7/g;->o:Lr7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ls7/g;->q:Z

    .line 3
    .line 4
    invoke-super {p0}, Lo7/b;->e0()Z

    .line 5
    .line 6
    .line 7
    const-class v1, Lu7/c;

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lu7/c;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lu7/c;->Z()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-boolean v0, p0, Ls7/g;->q:Z

    .line 21
    .line 22
    return-void
.end method

.method public final p()I
    .locals 2

    .line 1
    iget v0, p0, Ls7/g;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-super {p0}, Lo7/b;->p()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Ls7/g;->p:I

    .line 18
    .line 19
    :cond_0
    return v0
.end method

.method public final z(Lf6/b;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lf6/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk7/a;

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lf6/b;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    instance-of v0, v0, Lr7/s;

    .line 17
    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0}, Ls7/g;->p()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v1, p1, Lf6/b;->b:Z

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget v1, p1, Lf6/b;->c:I

    .line 32
    .line 33
    add-int/2addr v1, v0

    .line 34
    iput v1, p1, Lf6/b;->c:I

    .line 35
    .line 36
    :cond_3
    :goto_0
    return-void

    .line 37
    :cond_4
    invoke-super {p0, p1}, Lo7/b;->z(Lf6/b;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
