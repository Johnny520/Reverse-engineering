.class public final Lm7/d;
.super Lo7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final B(Lq7/b;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lo7/c;->n:Lr7/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lr7/g;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Lm7/d;->c0(I)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-class v1, Lm7/t;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lm7/t;

    .line 19
    .line 20
    iget-object v1, v1, Lm7/t;->r:Lb/e;

    .line 21
    .line 22
    invoke-virtual {v1}, Lb/e;->get()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    move v3, v2

    .line 28
    :goto_0
    if-ge v3, v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lm7/c;

    .line 35
    .line 36
    add-int/lit8 v5, v1, -0xc

    .line 37
    .line 38
    iget v6, v4, Lv7/j0;->n:I

    .line 39
    .line 40
    add-int/2addr v5, v6

    .line 41
    invoke-virtual {v4, v5, v2}, Lr7/b;->M(IZ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Lr7/b;->p()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    sub-int/2addr v5, v6

    .line 49
    iget-object v7, v4, Lr7/b;->k:[B

    .line 50
    .line 51
    int-to-short v5, v5

    .line 52
    invoke-static {v7, v6, v5}, Lk7/a;->F([BIS)V

    .line 53
    .line 54
    .line 55
    iget v5, p1, Lq7/b;->k:I

    .line 56
    .line 57
    invoke-virtual {v4, p1}, Lk7/a;->G(Lq7/b;)V

    .line 58
    .line 59
    .line 60
    add-int/2addr v5, v1

    .line 61
    invoke-virtual {p1, v5}, Lq7/b;->g(I)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
.end method

.method public final W(Lk7/a;)V
    .locals 4

    .line 1
    check-cast p1, Lm7/c;

    .line 2
    .line 3
    const-class v0, Lm7/t;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lm7/t;

    .line 10
    .line 11
    iget-object v1, v0, Lm7/t;->t:Lm7/e;

    .line 12
    .line 13
    iget-object v2, v1, Lm7/e;->p:Lm7/c;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-ne v2, p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, v0, Lm7/t;->u:Lm7/e;

    .line 20
    .line 21
    iget-object v2, v1, Lm7/e;->p:Lm7/c;

    .line 22
    .line 23
    if-ne v2, p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v1, v0, Lm7/t;->v:Lm7/e;

    .line 27
    .line 28
    iget-object v0, v1, Lm7/e;->p:Lm7/c;

    .line 29
    .line 30
    if-ne v0, p1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move-object v1, v3

    .line 34
    :goto_0
    if-eqz v1, :cond_3

    .line 35
    .line 36
    iput-object v3, v1, Lm7/e;->p:Lm7/c;

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    invoke-virtual {v1, v0}, Lm7/e;->Q(I)V

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-virtual {p1}, Lv7/j0;->W()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, Lm7/c;->s:Lm7/u;

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    iput-object v3, p1, Lm7/c;->s:Lm7/u;

    .line 51
    .line 52
    iget-object v0, v0, Lm7/u;->q:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object v0, p1, Lm7/c;->o:Lr7/l;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lm7/c;->e0(Lr7/m;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p1, Lm7/c;->p:Lr7/l;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lm7/c;->e0(Lr7/m;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p1, Lm7/c;->r:Lr7/l;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lm7/c;->e0(Lr7/m;)V

    .line 70
    .line 71
    .line 72
    iput-object v3, p1, Lm7/c;->o:Lr7/l;

    .line 73
    .line 74
    iput-object v3, p1, Lm7/c;->p:Lr7/l;

    .line 75
    .line 76
    iput-object v3, p1, Lm7/c;->r:Lr7/l;

    .line 77
    .line 78
    iget-object v0, p1, Lr7/b;->k:[B

    .line 79
    .line 80
    const/4 v1, 0x4

    .line 81
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-gez v0, :cond_5

    .line 86
    .line 87
    :goto_2
    move-object v0, v3

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    invoke-virtual {p1}, Lm7/c;->b0()Lu7/a;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    invoke-virtual {v1, v0}, Lu7/c;->V(I)Lr7/s;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :goto_3
    check-cast v0, Lr7/o;

    .line 101
    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    iget-object v3, v0, Lr7/o;->t:Lr7/n;

    .line 105
    .line 106
    :cond_7
    invoke-virtual {p1, v3}, Lm7/c;->d0(Lr7/n;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final c0(I)V
    .locals 1

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
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lo7/c;->n:Lr7/g;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lr7/g;->k(I)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, p1, v0}, Lo7/b;->d0(IZ)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final k0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lo7/b;->e0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-class v0, Lm7/t;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lm7/t;

    .line 14
    .line 15
    iget-object v1, v0, Lm7/t;->t:Lm7/e;

    .line 16
    .line 17
    invoke-virtual {v1}, Lm7/e;->c()V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lm7/t;->u:Lm7/e;

    .line 21
    .line 22
    invoke-virtual {v1}, Lm7/e;->c()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lm7/t;->v:Lm7/e;

    .line 26
    .line 27
    invoke-virtual {v0}, Lm7/e;->c()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method
