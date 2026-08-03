.class public final Lx1/q;
.super Lx1/o0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final G(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/f0;->t()Lp4/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lp4/t;->x()Lv1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lx1/f0;

    .line 16
    .line 17
    iget-object v2, v0, Lx1/f0;->L:Lx1/b1;

    .line 18
    .line 19
    iget-object v2, v2, Lx1/b1;->d:Lx1/i1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/f0;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v1, v2, v0, p1}, Lv1/n0;->c(Lv1/o;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public final K0(Lv1/j;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 6
    .line 7
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 13
    .line 14
    iget-object v2, v1, Lx1/j0;->d:Lx1/b0;

    .line 15
    .line 16
    iget-object v3, v0, Lx1/r0;->x:Lx1/g0;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    sget-object v5, Lx1/b0;->h:Lx1/b0;

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v3, Lx1/g0;->d:Z

    .line 24
    .line 25
    iget-boolean v2, v3, Lx1/g0;->b:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-boolean v4, v1, Lx1/j0;->f:Z

    .line 30
    .line 31
    iput-boolean v4, v1, Lx1/j0;->g:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-boolean v4, v3, Lx1/g0;->e:Z

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lx1/r0;->A()Lx1/r;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lx1/r;->Z:Lx1/q;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-boolean v4, v1, Lx1/n0;->q:Z

    .line 45
    .line 46
    :cond_2
    invoke-virtual {v0}, Lx1/r0;->h0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lx1/r0;->A()Lx1/r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, Lx1/r;->Z:Lx1/q;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput-boolean v1, v0, Lx1/n0;->q:Z

    .line 59
    .line 60
    :cond_3
    iget-object v0, v3, Lx1/g0;->g:Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Integer;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const/high16 v0, -0x80000000

    .line 76
    .line 77
    :goto_1
    iget-object v1, p0, Lx1/o0;->z:Lf/b0;

    .line 78
    .line 79
    invoke-virtual {v1, v0, p1}, Lf/b0;->g(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return v0
.end method

.method public final M(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/f0;->t()Lp4/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lp4/t;->x()Lv1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lx1/f0;

    .line 16
    .line 17
    iget-object v2, v0, Lx1/f0;->L:Lx1/b1;

    .line 18
    .line 19
    iget-object v2, v2, Lx1/b1;->d:Lx1/i1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/f0;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v1, v2, v0, p1}, Lv1/n0;->a(Lv1/o;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public final Q(J)Lv1/b1;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lv1/b1;->E0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 5
    .line 6
    iget-object v1, v0, Lx1/i1;->u:Lx1/f0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, v1, Lj0/b;->i:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_0

    .line 18
    .line 19
    aget-object v4, v2, v3

    .line 20
    .line 21
    check-cast v4, Lx1/f0;

    .line 22
    .line 23
    iget-object v4, v4, Lx1/f0;->M:Lx1/j0;

    .line 24
    .line 25
    iget-object v4, v4, Lx1/j0;->q:Lx1/r0;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v5, Lx1/d0;->i:Lx1/d0;

    .line 31
    .line 32
    iput-object v5, v4, Lx1/r0;->p:Lx1/d0;

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 38
    .line 39
    iget-object v1, v0, Lx1/f0;->C:Lv1/n0;

    .line 40
    .line 41
    invoke-virtual {v0}, Lx1/f0;->l()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v1, p0, v0, p1, p2}, Lv1/n0;->h(Lv1/p0;Ljava/util/List;J)Lv1/o0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lx1/o0;->g1(Lx1/o0;Lv1/o0;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final h1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 6
    .line 7
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/r0;->S0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final j(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/f0;->t()Lp4/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lp4/t;->x()Lv1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lx1/f0;

    .line 16
    .line 17
    iget-object v2, v0, Lx1/f0;->L:Lx1/b1;

    .line 18
    .line 19
    iget-object v2, v2, Lx1/b1;->d:Lx1/i1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/f0;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v1, v2, v0, p1}, Lv1/n0;->g(Lv1/o;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public final p0(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/o0;->u:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/f0;->t()Lp4/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lp4/t;->x()Lv1/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lx1/f0;

    .line 16
    .line 17
    iget-object v2, v0, Lx1/f0;->L:Lx1/b1;

    .line 18
    .line 19
    iget-object v2, v2, Lx1/b1;->d:Lx1/i1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/f0;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v1, v2, v0, p1}, Lv1/n0;->i(Lv1/o;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method
