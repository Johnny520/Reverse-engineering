.class public final La/b8;
.super La/ih;
.source "SourceFile"


# virtual methods
.method public final a(La/T4;)V
    .locals 2

    iget-object p1, p0, La/ih;->h:La/V4;

    iget-boolean v0, p1, La/V4;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, La/V4;->j:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, La/V4;->l:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/V4;

    iget-object v1, p0, La/ih;->b:La/N3;

    check-cast v1, La/a8;

    iget v0, v0, La/V4;->g:I

    int-to-float v0, v0

    iget v1, v1, La/a8;->e0:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1, v0}, La/V4;->d(I)V

    return-void
.end method

.method public final d()V
    .locals 7

    iget-object v0, p0, La/ih;->b:La/N3;

    move-object v1, v0

    check-cast v1, La/a8;

    iget v2, v1, La/a8;->f0:I

    iget v3, v1, La/a8;->g0:I

    iget v1, v1, La/a8;->i0:I

    iget-object v4, p0, La/ih;->h:La/V4;

    const/4 v5, 0x1

    const/4 v6, -0x1

    if-ne v1, v5, :cond_2

    if-eq v2, v6, :cond_0

    iget-object v1, v4, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->h:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v4, La/V4;->f:I

    goto :goto_0

    :cond_0
    if-eq v3, v6, :cond_1

    iget-object v1, v4, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v3

    iput v0, v4, La/V4;->f:I

    goto :goto_0

    :cond_1
    iput-boolean v5, v4, La/V4;->b:Z

    iget-object v1, v4, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {p0, v0}, La/b8;->m(La/V4;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {p0, v0}, La/b8;->m(La/V4;)V

    return-void

    :cond_2
    if-eq v2, v6, :cond_3

    iget-object v1, v4, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v4, La/V4;->f:I

    goto :goto_1

    :cond_3
    if-eq v3, v6, :cond_4

    iget-object v1, v4, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v3

    iput v0, v4, La/V4;->f:I

    goto :goto_1

    :cond_4
    iput-boolean v5, v4, La/V4;->b:Z

    iget-object v1, v4, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->K:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {p0, v0}, La/b8;->m(La/V4;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    invoke-virtual {p0, v0}, La/b8;->m(La/V4;)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, La/ih;->b:La/N3;

    move-object v1, v0

    check-cast v1, La/a8;

    iget v1, v1, La/a8;->i0:I

    const/4 v2, 0x1

    iget-object v3, p0, La/ih;->h:La/V4;

    if-ne v1, v2, :cond_0

    iget v1, v3, La/V4;->g:I

    iput v1, v0, La/N3;->P:I

    return-void

    :cond_0
    iget v1, v3, La/V4;->g:I

    iput v1, v0, La/N3;->Q:I

    return-void
.end method

.method public final f()V
    .locals 1

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
