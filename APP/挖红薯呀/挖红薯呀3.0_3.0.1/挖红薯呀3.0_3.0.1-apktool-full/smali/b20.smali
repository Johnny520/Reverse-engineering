.class public final Lb20;
.super Lac0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# virtual methods
.method public final I(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lac0;->r:Lqj0;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb60;->u()Ld;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ld;->m()Lxd0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lb60;

    .line 16
    .line 17
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 18
    .line 19
    iget-object v1, v1, Lmj0;->d:Lqj0;

    .line 20
    .line 21
    invoke-virtual {p0}, Lb60;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Lxd0;->j(Ll30;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final O(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lac0;->r:Lqj0;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb60;->u()Ld;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ld;->m()Lxd0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lb60;

    .line 16
    .line 17
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 18
    .line 19
    iget-object v1, v1, Lmj0;->d:Lqj0;

    .line 20
    .line 21
    invoke-virtual {p0}, Lb60;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Lxd0;->c(Ll30;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final R(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lac0;->r:Lqj0;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb60;->u()Ld;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ld;->m()Lxd0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lb60;

    .line 16
    .line 17
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 18
    .line 19
    iget-object v1, v1, Lmj0;->d:Lqj0;

    .line 20
    .line 21
    invoke-virtual {p0}, Lb60;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Lxd0;->h(Ll30;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final c0(Lo2;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lac0;->r:Lqj0;

    .line 2
    .line 3
    iget-object v0, v0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    iget-object v0, v0, Lb60;->J:Lf60;

    .line 6
    .line 7
    iget-object v0, v0, Lf60;->q:Lec0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lec0;->i:Lf60;

    .line 13
    .line 14
    iget-object v2, v1, Lf60;->d:Lx50;

    .line 15
    .line 16
    iget-object v3, v0, Lec0;->t:Lc60;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    sget-object v5, Lx50;->e:Lx50;

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v3, Lc60;->d:Z

    .line 24
    .line 25
    iget-boolean v2, v3, Lc60;->b:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-boolean v4, v1, Lf60;->f:Z

    .line 30
    .line 31
    iput-boolean v4, v1, Lf60;->g:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-boolean v4, v3, Lc60;->e:Z

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lec0;->r()Lc20;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lc20;->U:Lb20;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-boolean v4, v1, Lyb0;->n:Z

    .line 45
    .line 46
    :cond_2
    invoke-virtual {v0}, Lec0;->u()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lec0;->r()Lc20;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, Lc20;->U:Lb20;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput-boolean v1, v0, Lyb0;->n:Z

    .line 59
    .line 60
    :cond_3
    iget-object v0, v3, Lc60;->g:Ljava/util/HashMap;

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
    iget-object p0, p0, Lac0;->w:Lch0;

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Lch0;->g(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return v0
.end method

.method public final e(J)Lxq0;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lxq0;->a0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lac0;->r:Lqj0;

    .line 5
    .line 6
    iget-object v1, v0, Lqj0;->r:Lb60;

    .line 7
    .line 8
    invoke-virtual {v1}, Lb60;->z()Lsh0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, Lsh0;->d:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, v1, Lsh0;->f:I

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
    check-cast v4, Lb60;

    .line 22
    .line 23
    iget-object v4, v4, Lb60;->J:Lf60;

    .line 24
    .line 25
    iget-object v4, v4, Lf60;->q:Lec0;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v5, Lz50;->f:Lz50;

    .line 31
    .line 32
    iput-object v5, v4, Lec0;->m:Lz50;

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, v0, Lqj0;->r:Lb60;

    .line 38
    .line 39
    iget-object v1, v0, Lb60;->z:Lxd0;

    .line 40
    .line 41
    invoke-virtual {v0}, Lb60;->l()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v1, p0, v0, p1, p2}, Lxd0;->g(Lzd0;Ljava/util/List;J)Lyd0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lac0;->v0(Lac0;Lyd0;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lac0;->r:Lqj0;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb60;->u()Ld;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ld;->m()Lxd0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Ld;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lb60;

    .line 16
    .line 17
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 18
    .line 19
    iget-object v1, v1, Lmj0;->d:Lqj0;

    .line 20
    .line 21
    invoke-virtual {p0}, Lb60;->l()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Lxd0;->b(Ll30;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final w0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lac0;->r:Lqj0;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 6
    .line 7
    iget-object p0, p0, Lf60;->q:Lec0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lec0;->k0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
