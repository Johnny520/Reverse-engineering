.class public final Lv7/c0;
.super Lv7/g0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# virtual methods
.method public final L(Lu7/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv7/g0;->l:Lk7/a;

    .line 2
    .line 3
    check-cast v0, Lj7/c;

    .line 4
    .line 5
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lv7/e0;

    .line 22
    .line 23
    invoke-virtual {v1}, Lv7/j0;->T()Lv7/k0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Lv7/k0;->u:Lv7/k0;

    .line 28
    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lv7/j0;->U(Lu7/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final M(Lk7/a;Lv7/i0;)V
    .locals 1

    .line 1
    check-cast p1, Lj7/c;

    .line 2
    .line 3
    check-cast p2, Lv7/f;

    .line 4
    .line 5
    iget-object p2, p2, Lr7/b;->k:[B

    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    invoke-static {p2, v0}, Lk7/a;->s([BI)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1, p2}, Lk7/b;->c0(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final N()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 2
    .line 3
    check-cast v0, Lv7/f;

    .line 4
    .line 5
    iget-object v1, v0, Lv7/i0;->m:Lv7/h0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    iput-object v2, v0, Lv7/i0;->m:Lv7/h0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lv7/i0;->N()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gez v3, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 21
    .line 22
    :goto_0
    if-eqz v0, :cond_3

    .line 23
    .line 24
    instance-of v4, v0, Ll7/g;

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    check-cast v0, Ll7/g;

    .line 29
    .line 30
    invoke-interface {v0}, Ll7/g;->a()Lu7/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move-object v0, v2

    .line 39
    :goto_1
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    invoke-virtual {v0, v3}, Lu7/c;->V(I)Lr7/s;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_2
    if-nez v2, :cond_5

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_5
    invoke-virtual {v2, v1}, Lr7/s;->a0(Lr7/m;)V

    .line 50
    .line 51
    .line 52
    :goto_3
    iget-object v0, p0, Lv7/g0;->l:Lk7/a;

    .line 53
    .line 54
    check-cast v0, Lj7/c;

    .line 55
    .line 56
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 57
    .line 58
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_6

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lv7/e0;

    .line 73
    .line 74
    invoke-virtual {v1}, Lv7/j0;->W()V

    .line 75
    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_6
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/g0;->l:Lk7/a;

    .line 2
    .line 3
    check-cast v0, Lj7/c;

    .line 4
    .line 5
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv7/g0;->k:Lv7/i0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lv7/g0;->l:Lk7/a;

    .line 12
    .line 13
    check-cast v1, Lj7/c;

    .line 14
    .line 15
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x4

    .line 22
    if-le v2, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v2

    .line 26
    :goto_0
    const/4 v4, 0x0

    .line 27
    :goto_1
    if-ge v4, v3, :cond_1

    .line 28
    .line 29
    const-string v5, "\n    "

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v5, v1, Lz7/c;->g:[Ljava/lang/Object;

    .line 35
    .line 36
    aget-object v5, v5, v4

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-lez v2, :cond_3

    .line 45
    .line 46
    if-eq v3, v2, :cond_2

    .line 47
    .line 48
    const-string v1, "\n    ..."

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_2
    const-string v1, "\n   "

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method
