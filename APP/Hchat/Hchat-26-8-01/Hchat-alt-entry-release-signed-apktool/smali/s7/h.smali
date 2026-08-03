.class public final Ls7/h;
.super Ls7/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public o:Z


# virtual methods
.method public final W(Lk7/a;)V
    .locals 0

    .line 1
    check-cast p1, Lr7/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr7/u;->R()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final X()V
    .locals 0

    .line 1
    invoke-super {p0}, Ls7/d;->X()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ls7/h;->n0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final m0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ls7/h;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ls7/h;->o:Z

    .line 7
    .line 8
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lr7/u;

    .line 22
    .line 23
    invoke-virtual {v2}, Lr7/u;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lr7/w;

    .line 38
    .line 39
    iget-object v3, v3, Lr7/w;->m:Lr7/v;

    .line 40
    .line 41
    invoke-virtual {v3}, Lr7/v;->a()Lr7/s;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-virtual {v4, v3}, Lr7/s;->P(Lr7/m;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void
.end method

.method public final n0()V
    .locals 7

    .line 1
    const-class v0, Lu7/c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lu7/c;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Lu7/c;->p:Ls7/g;

    .line 14
    .line 15
    iget-boolean v1, v1, Ls7/g;->q:Z

    .line 16
    .line 17
    xor-int/2addr v1, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v2

    .line 20
    :goto_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-super {p0}, Lo7/b;->e0()Z

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 27
    .line 28
    invoke-virtual {v1}, Lz7/c;->b()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lr7/u;

    .line 43
    .line 44
    iget-object v5, v4, Lr7/u;->p:Lr7/s;

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    iget v5, v5, Lk7/a;->g:I

    .line 49
    .line 50
    iget v6, v4, Lk7/a;->g:I

    .line 51
    .line 52
    if-eq v5, v6, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v5, v4}, Lo7/b;->T(ILk7/a;)V

    .line 55
    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    if-eqz v2, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lu7/c;

    .line 66
    .line 67
    invoke-virtual {v0}, Lu7/c;->X()V

    .line 68
    .line 69
    .line 70
    :cond_4
    if-eqz v2, :cond_5

    .line 71
    .line 72
    invoke-super {p0}, Lo7/b;->e0()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :cond_5
    new-instance v0, Lce/n;

    .line 77
    .line 78
    const/16 v1, 0x1d

    .line 79
    .line 80
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lo7/b;->f0(Ljava/util/function/Predicate;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
