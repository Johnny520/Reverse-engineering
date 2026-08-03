.class public final Ls7/f;
.super Lo7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final d0(IZ)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-super {p0, p1, p2}, Lo7/b;->d0(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final k0()V
    .locals 5

    .line 1
    invoke-super {p0}, Lo7/b;->e0()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Lz7/c;->b()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lr7/n;

    .line 22
    .line 23
    invoke-virtual {v2}, Lr7/n;->N()Lr7/o;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v3, v3, Lk7/a;->g:I

    .line 30
    .line 31
    iget v4, v2, Lk7/a;->g:I

    .line 32
    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v3, v2}, Lo7/b;->T(ILk7/a;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const-class v0, Lm7/g;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lm7/g;

    .line 49
    .line 50
    iget-object v0, v0, Lm7/g;->o:Lu7/a;

    .line 51
    .line 52
    invoke-virtual {v0}, Lu7/a;->c0()V

    .line 53
    .line 54
    .line 55
    :cond_2
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-super {p0}, Lo7/b;->e0()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :cond_3
    new-instance v0, Lce/n;

    .line 62
    .line 63
    const/16 v1, 0x1c

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lo7/b;->f0(Ljava/util/function/Predicate;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final p()I
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lr7/n;

    .line 15
    .line 16
    invoke-virtual {v1}, Lr7/b;->p()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    mul-int/2addr v1, v0

    .line 21
    return v1

    .line 22
    :cond_0
    return v0
.end method
