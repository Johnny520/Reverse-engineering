.class public final La/e8;
.super La/ih;
.source "SourceFile"


# virtual methods
.method public final a(La/T4;)V
    .locals 7

    iget-object p1, p0, La/ih;->b:La/N3;

    check-cast p1, La/V1;

    iget v0, p1, La/V1;->g0:I

    iget-object v1, p0, La/ih;->h:La/V4;

    iget-object v2, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    move v5, v3

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/V4;

    iget v6, v6, La/V4;->g:I

    if-eq v5, v3, :cond_1

    if-ge v6, v5, :cond_2

    :cond_1
    move v5, v6

    :cond_2
    if-ge v4, v6, :cond_0

    move v4, v6

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_5

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    iget p1, p1, La/V1;->i0:I

    add-int/2addr v4, p1

    invoke-virtual {v1, v4}, La/V4;->d(I)V

    return-void

    :cond_5
    :goto_1
    iget p1, p1, La/V1;->i0:I

    add-int/2addr v5, p1

    invoke-virtual {v1, v5}, La/V4;->d(I)V

    return-void
.end method

.method public final d()V
    .locals 7

    iget-object v0, p0, La/ih;->b:La/N3;

    instance-of v1, v0, La/V1;

    if-eqz v1, :cond_c

    iget-object v1, p0, La/ih;->h:La/V4;

    const/4 v2, 0x1

    iput-boolean v2, v1, La/V4;->b:Z

    check-cast v0, La/V1;

    iget v3, v0, La/V1;->g0:I

    iget-boolean v4, v0, La/V1;->h0:Z

    const/16 v5, 0x8

    const/4 v6, 0x0

    if-eqz v3, :cond_9

    if-eq v3, v2, :cond_6

    const/4 v2, 0x2

    if-eq v3, v2, :cond_3

    const/4 v2, 0x3

    if-eq v3, v2, :cond_0

    goto/16 :goto_8

    :cond_0
    sget-object v2, La/V4$a;->g:La/V4$a;

    iput-object v2, v1, La/V4;->e:La/V4$a;

    :goto_0
    iget v2, v0, La/f8;->f0:I

    if-ge v6, v2, :cond_2

    iget-object v2, v0, La/f8;->e0:[La/N3;

    aget-object v2, v2, v6

    if-nez v4, :cond_1

    iget v3, v2, La/N3;->X:I

    if-ne v3, v5, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, v2, La/N3;->e:La/og;

    iget-object v2, v2, La/ih;->i:La/V4;

    iget-object v3, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    return-void

    :cond_3
    sget-object v2, La/V4$a;->f:La/V4$a;

    iput-object v2, v1, La/V4;->e:La/V4$a;

    :goto_2
    iget v2, v0, La/f8;->f0:I

    if-ge v6, v2, :cond_5

    iget-object v2, v0, La/f8;->e0:[La/N3;

    aget-object v2, v2, v6

    if-nez v4, :cond_4

    iget v3, v2, La/N3;->X:I

    if-ne v3, v5, :cond_4

    goto :goto_3

    :cond_4
    iget-object v2, v2, La/N3;->e:La/og;

    iget-object v2, v2, La/ih;->h:La/V4;

    iget-object v3, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    return-void

    :cond_6
    sget-object v2, La/V4$a;->e:La/V4$a;

    iput-object v2, v1, La/V4;->e:La/V4$a;

    :goto_4
    iget v2, v0, La/f8;->f0:I

    if-ge v6, v2, :cond_8

    iget-object v2, v0, La/f8;->e0:[La/N3;

    aget-object v2, v2, v6

    if-nez v4, :cond_7

    iget v3, v2, La/N3;->X:I

    if-ne v3, v5, :cond_7

    goto :goto_5

    :cond_7
    iget-object v2, v2, La/N3;->d:La/K8;

    iget-object v2, v2, La/ih;->i:La/V4;

    iget-object v3, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_8
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    return-void

    :cond_9
    sget-object v2, La/V4$a;->d:La/V4$a;

    iput-object v2, v1, La/V4;->e:La/V4$a;

    :goto_6
    iget v2, v0, La/f8;->f0:I

    if-ge v6, v2, :cond_b

    iget-object v2, v0, La/f8;->e0:[La/N3;

    aget-object v2, v2, v6

    if-nez v4, :cond_a

    iget v3, v2, La/N3;->X:I

    if-ne v3, v5, :cond_a

    goto :goto_7

    :cond_a
    iget-object v2, v2, La/N3;->d:La/K8;

    iget-object v2, v2, La/ih;->h:La/V4;

    iget-object v3, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_b
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {p0, v0}, La/e8;->m(La/V4;)V

    :cond_c
    :goto_8
    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, La/ih;->b:La/N3;

    instance-of v1, v0, La/V1;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, La/V1;

    iget v1, v1, La/V1;->g0:I

    iget-object v2, p0, La/ih;->h:La/V4;

    if-eqz v1, :cond_1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    iget v1, v2, La/V4;->g:I

    iput v1, v0, La/N3;->Q:I

    return-void

    :cond_1
    :goto_0
    iget v1, v2, La/V4;->g:I

    iput v1, v0, La/N3;->P:I

    :cond_2
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La/ih;->c:La/Dd;

    iget-object v0, p0, La/ih;->h:La/V4;

    invoke-virtual {v0}, La/V4;->c()V

    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(La/V4;)V
    .locals 2

    iget-object v0, p0, La/ih;->h:La/V4;

    iget-object v1, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
