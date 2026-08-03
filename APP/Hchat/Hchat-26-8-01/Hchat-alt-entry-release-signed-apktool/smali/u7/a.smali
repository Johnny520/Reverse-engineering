.class public final Lu7/a;
.super Lu7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final M()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu7/c;->U()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu7/c;->U()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lu7/c;->p:Ls7/g;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls7/g;->m0()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final R()V
    .locals 0

    .line 1
    invoke-super {p0}, Lu7/c;->R()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu7/a;->c0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final Y(ILr7/s;)V
    .locals 1

    .line 1
    check-cast p2, Lr7/o;

    .line 2
    .line 3
    const-class p2, Lm7/f;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lm7/f;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Lm7/q;->k:Lk7/c;

    .line 14
    .line 15
    check-cast p2, Lm7/g;

    .line 16
    .line 17
    iget-object p2, p2, Lm7/g;->p:Lm7/n;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x0

    .line 21
    :goto_0
    iget-object p2, p2, Lm7/n;->o:Ls7/f;

    .line 22
    .line 23
    iget-object v0, p2, Lo7/b;->k:Lz7/c;

    .line 24
    .line 25
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    if-ge p1, v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Lo7/b;->O(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, Lu7/c;->Z()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lm7/f;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lm7/f;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lm7/q;->k:Lk7/c;

    .line 15
    .line 16
    check-cast v0, Lm7/g;

    .line 17
    .line 18
    iget-object v0, v0, Lm7/g;->p:Lm7/n;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v0, v0, Lm7/n;->o:Ls7/f;

    .line 23
    .line 24
    invoke-virtual {v0}, Ls7/f;->k0()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final c0()V
    .locals 7

    .line 1
    const-class v0, Lm7/f;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm7/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lm7/q;->k:Lk7/c;

    .line 12
    .line 13
    check-cast v0, Lm7/g;

    .line 14
    .line 15
    iget-object v0, v0, Lm7/g;->p:Lm7/n;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_4

    .line 22
    :cond_1
    iget-object v0, v0, Lm7/n;->o:Ls7/f;

    .line 23
    .line 24
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 25
    .line 26
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lu7/c;->p:Ls7/g;

    .line 31
    .line 32
    iget-object v3, v2, Lo7/b;->k:Lz7/c;

    .line 33
    .line 34
    invoke-virtual {v3}, Lz7/c;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge v1, v3, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_1
    const/4 v3, 0x0

    .line 43
    :goto_2
    if-ge v3, v1, :cond_6

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lr7/o;

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Lr7/n;

    .line 56
    .line 57
    if-eqz v5, :cond_5

    .line 58
    .line 59
    iget-object v6, v4, Lr7/o;->t:Lr7/n;

    .line 60
    .line 61
    if-ne v6, v5, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    if-nez v6, :cond_4

    .line 65
    .line 66
    iput-object v5, v4, Lr7/o;->t:Lr7/n;

    .line 67
    .line 68
    iput-object v4, v5, Lr7/n;->p:Lr7/o;

    .line 69
    .line 70
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const-string v0, "Resource id string item is already linked"

    .line 74
    .line 75
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const-string v0, "Can not link null id item"

    .line 83
    .line 84
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_6
    :goto_4
    return-void
.end method
