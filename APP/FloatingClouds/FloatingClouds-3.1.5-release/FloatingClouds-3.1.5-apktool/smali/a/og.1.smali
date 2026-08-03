.class public final La/og;
.super La/ih;
.source "SourceFile"


# instance fields
.field public k:La/V4;

.field public l:La/d2;


# virtual methods
.method public final a(La/T4;)V
    .locals 10

    iget-object p1, p0, La/ih;->j:La/ih$a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_e

    iget-object p1, p0, La/ih;->e:La/l5;

    iget-boolean v2, p1, La/V4;->c:Z

    sget-object v3, La/N3$a;->c:La/N3$a;

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    iget-boolean v2, p1, La/V4;->j:Z

    if-nez v2, :cond_5

    iget-object v2, p0, La/ih;->d:La/N3$a;

    if-ne v2, v3, :cond_5

    iget-object v2, p0, La/ih;->b:La/N3;

    iget v6, v2, La/N3;->k:I

    const/4 v7, 0x2

    if-eq v6, v7, :cond_4

    if-eq v6, v1, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, v2, La/N3;->d:La/K8;

    iget-object v1, v1, La/ih;->e:La/l5;

    iget-boolean v6, v1, La/V4;->j:Z

    if-eqz v6, :cond_5

    iget v6, v2, La/N3;->O:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    if-eq v6, v0, :cond_1

    move v1, v5

    goto :goto_2

    :cond_1
    iget v1, v1, La/V4;->g:I

    int-to-float v1, v1

    iget v2, v2, La/N3;->N:F

    :goto_0
    div-float/2addr v1, v2

    :goto_1
    add-float/2addr v1, v4

    float-to-int v1, v1

    goto :goto_2

    :cond_2
    iget v1, v1, La/V4;->g:I

    int-to-float v1, v1

    iget v2, v2, La/N3;->N:F

    mul-float/2addr v1, v2

    goto :goto_1

    :cond_3
    iget v1, v1, La/V4;->g:I

    int-to-float v1, v1

    iget v2, v2, La/N3;->N:F

    goto :goto_0

    :goto_2
    invoke-virtual {p1, v1}, La/l5;->d(I)V

    goto :goto_3

    :cond_4
    iget-object v1, v2, La/N3;->K:La/N3;

    if-eqz v1, :cond_5

    iget-object v1, v1, La/N3;->e:La/og;

    iget-object v1, v1, La/ih;->e:La/l5;

    iget-boolean v6, v1, La/V4;->j:Z

    if-eqz v6, :cond_5

    iget v2, v2, La/N3;->r:F

    iget v1, v1, La/V4;->g:I

    int-to-float v1, v1

    mul-float/2addr v1, v2

    add-float/2addr v1, v4

    float-to-int v1, v1

    invoke-virtual {p1, v1}, La/l5;->d(I)V

    :cond_5
    :goto_3
    iget-object v1, p0, La/ih;->h:La/V4;

    iget-boolean v2, v1, La/V4;->c:Z

    if-eqz v2, :cond_d

    iget-object v2, p0, La/ih;->i:La/V4;

    iget-boolean v6, v2, La/V4;->c:Z

    if-nez v6, :cond_6

    goto/16 :goto_6

    :cond_6
    iget-boolean v6, v1, La/V4;->j:Z

    if-eqz v6, :cond_7

    iget-boolean v6, v2, La/V4;->j:Z

    if-eqz v6, :cond_7

    iget-boolean v6, p1, La/V4;->j:Z

    if-eqz v6, :cond_7

    goto/16 :goto_6

    :cond_7
    iget-boolean v6, p1, La/V4;->j:Z

    if-nez v6, :cond_8

    iget-object v6, p0, La/ih;->d:La/N3$a;

    if-ne v6, v3, :cond_8

    iget-object v6, p0, La/ih;->b:La/N3;

    iget v7, v6, La/N3;->j:I

    if-nez v7, :cond_8

    invoke-virtual {v6}, La/N3;->r()Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v0, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/V4;

    iget-object v3, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    iget v0, v0, La/V4;->g:I

    iget v4, v1, La/V4;->f:I

    add-int/2addr v0, v4

    iget v3, v3, La/V4;->g:I

    iget v4, v2, La/V4;->f:I

    add-int/2addr v3, v4

    sub-int v4, v3, v0

    invoke-virtual {v1, v0}, La/V4;->d(I)V

    invoke-virtual {v2, v3}, La/V4;->d(I)V

    invoke-virtual {p1, v4}, La/l5;->d(I)V

    return-void

    :cond_8
    iget-boolean v6, p1, La/V4;->j:Z

    if-nez v6, :cond_a

    iget-object v6, p0, La/ih;->d:La/N3$a;

    if-ne v6, v3, :cond_a

    iget v3, p0, La/ih;->a:I

    if-ne v3, v0, :cond_a

    iget-object v0, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    iget-object v0, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/V4;

    iget-object v3, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    iget v0, v0, La/V4;->g:I

    iget v6, v1, La/V4;->f:I

    add-int/2addr v0, v6

    iget v3, v3, La/V4;->g:I

    iget v6, v2, La/V4;->f:I

    add-int/2addr v3, v6

    sub-int/2addr v3, v0

    iget v0, p1, La/l5;->m:I

    if-ge v3, v0, :cond_9

    invoke-virtual {p1, v3}, La/l5;->d(I)V

    goto :goto_4

    :cond_9
    invoke-virtual {p1, v0}, La/l5;->d(I)V

    :cond_a
    :goto_4
    iget-boolean v0, p1, La/V4;->j:Z

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    iget-object v0, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    iget-object v0, v1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/V4;

    iget-object v3, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    iget v5, v0, La/V4;->g:I

    iget v6, v1, La/V4;->f:I

    add-int/2addr v6, v5

    iget v7, v3, La/V4;->g:I

    iget v8, v2, La/V4;->f:I

    add-int/2addr v8, v7

    iget-object v9, p0, La/ih;->b:La/N3;

    iget v9, v9, La/N3;->V:F

    if-ne v0, v3, :cond_c

    move v9, v4

    goto :goto_5

    :cond_c
    move v5, v6

    move v7, v8

    :goto_5
    sub-int/2addr v7, v5

    iget v0, p1, La/V4;->g:I

    sub-int/2addr v7, v0

    int-to-float v0, v5

    add-float/2addr v0, v4

    int-to-float v3, v7

    mul-float/2addr v3, v9

    add-float/2addr v3, v0

    float-to-int v0, v3

    invoke-virtual {v1, v0}, La/V4;->d(I)V

    iget v0, v1, La/V4;->g:I

    iget p1, p1, La/V4;->g:I

    add-int/2addr v0, p1

    invoke-virtual {v2, v0}, La/V4;->d(I)V

    :cond_d
    :goto_6
    return-void

    :cond_e
    iget-object p1, p0, La/ih;->b:La/N3;

    iget-object v1, p1, La/N3;->z:La/M3;

    iget-object p1, p1, La/N3;->B:La/M3;

    invoke-virtual {p0, v1, p1, v0}, La/ih;->l(La/M3;La/M3;I)V

    return-void
.end method

.method public final d()V
    .locals 15

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v1, v0, La/N3;->a:Z

    iget-object v2, p0, La/ih;->e:La/l5;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La/N3;->i()I

    move-result v0

    invoke-virtual {v2, v0}, La/l5;->d(I)V

    :cond_0
    iget-boolean v0, v2, La/V4;->j:Z

    sget-object v1, La/N3$a;->d:La/N3$a;

    sget-object v3, La/N3$a;->a:La/N3$a;

    sget-object v4, La/N3$a;->c:La/N3$a;

    iget-object v5, p0, La/ih;->i:La/V4;

    iget-object v6, p0, La/ih;->h:La/V4;

    const/4 v7, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v8, v0, La/N3;->J:[La/N3$a;

    aget-object v8, v8, v7

    iput-object v8, p0, La/ih;->d:La/N3$a;

    iget-boolean v0, v0, La/N3;->w:Z

    if-eqz v0, :cond_1

    new-instance v0, La/d2;

    invoke-direct {v0, p0}, La/l5;-><init>(La/ih;)V

    iput-object v0, p0, La/og;->l:La/d2;

    :cond_1
    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-eq v0, v4, :cond_4

    if-ne v0, v1, :cond_2

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->K:La/N3;

    if-eqz v1, :cond_2

    iget-object v8, v1, La/N3;->J:[La/N3$a;

    aget-object v8, v8, v7

    if-ne v8, v3, :cond_2

    invoke-virtual {v1}, La/N3;->i()I

    move-result v0

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->z:La/M3;

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    sub-int/2addr v0, v3

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->B:La/M3;

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    sub-int/2addr v0, v3

    iget-object v1, v1, La/N3;->e:La/og;

    iget-object v3, v1, La/ih;->h:La/V4;

    iget-object v4, p0, La/ih;->b:La/N3;

    iget-object v4, v4, La/N3;->z:La/M3;

    invoke-virtual {v4}, La/M3;->c()I

    move-result v4

    invoke-static {v6, v3, v4}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v1, v1, La/ih;->i:La/V4;

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->B:La/M3;

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    neg-int v3, v3

    invoke-static {v5, v1, v3}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {v2, v0}, La/l5;->d(I)V

    return-void

    :cond_2
    if-ne v0, v3, :cond_4

    iget-object v0, p0, La/ih;->b:La/N3;

    invoke-virtual {v0}, La/N3;->i()I

    move-result v0

    invoke-virtual {v2, v0}, La/l5;->d(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v1, v0, La/N3;->K:La/N3;

    if-eqz v1, :cond_4

    iget-object v8, v1, La/N3;->J:[La/N3$a;

    aget-object v8, v8, v7

    if-ne v8, v3, :cond_4

    iget-object v1, v1, La/N3;->e:La/og;

    iget-object v2, v1, La/ih;->h:La/V4;

    iget-object v0, v0, La/N3;->z:La/M3;

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    invoke-static {v6, v2, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v0, v1, La/ih;->i:La/V4;

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->B:La/M3;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_4
    :goto_0
    iget-boolean v0, v2, La/V4;->j:Z

    iget-object v1, p0, La/og;->k:La/V4;

    const/4 v3, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x3

    if-eqz v0, :cond_d

    iget-object v11, p0, La/ih;->b:La/N3;

    iget-boolean v12, v11, La/N3;->a:Z

    if-eqz v12, :cond_d

    iget-object v0, v11, La/N3;->G:[La/M3;

    aget-object v4, v0, v9

    iget-object v12, v4, La/M3;->d:La/M3;

    if-eqz v12, :cond_8

    aget-object v13, v0, v10

    iget-object v13, v13, La/M3;->d:La/M3;

    if-eqz v13, :cond_8

    invoke-virtual {v11}, La/N3;->r()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v9

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    iput v0, v6, La/V4;->f:I

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v10

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    neg-int v0, v0

    iput v0, v5, La/V4;->f:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v9

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v2, p0, La/ih;->b:La/N3;

    iget-object v2, v2, La/N3;->G:[La/M3;

    aget-object v2, v2, v9

    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    invoke-static {v6, v0, v2}, La/ih;->b(La/V4;La/V4;I)V

    :cond_6
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v10

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v2, p0, La/ih;->b:La/N3;

    iget-object v2, v2, La/N3;->G:[La/M3;

    aget-object v2, v2, v10

    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    neg-int v2, v2

    invoke-static {v5, v0, v2}, La/ih;->b(La/V4;La/V4;I)V

    :cond_7
    iput-boolean v7, v6, La/V4;->b:Z

    iput-boolean v7, v5, La/V4;->b:Z

    :goto_1
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v2, v0, La/N3;->w:Z

    if-eqz v2, :cond_1c

    iget v0, v0, La/N3;->R:I

    invoke-static {v1, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_8
    if-eqz v12, :cond_9

    invoke-static {v4}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v9

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    invoke-static {v6, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    invoke-static {v5, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v2, v0, La/N3;->w:Z

    if-eqz v2, :cond_1c

    iget v0, v0, La/N3;->R:I

    invoke-static {v1, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_9
    aget-object v4, v0, v10

    iget-object v7, v4, La/M3;->d:La/M3;

    if-eqz v7, :cond_b

    invoke-static {v4}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v10

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    neg-int v3, v3

    invoke-static {v5, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    neg-int v0, v0

    invoke-static {v6, v5, v0}, La/ih;->b(La/V4;La/V4;I)V

    :cond_a
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v2, v0, La/N3;->w:Z

    if-eqz v2, :cond_1c

    iget v0, v0, La/N3;->R:I

    invoke-static {v1, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_b
    aget-object v0, v0, v8

    iget-object v4, v0, La/M3;->d:La/M3;

    if-eqz v4, :cond_c

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-static {v1, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v0, v0, La/N3;->R:I

    neg-int v0, v0

    invoke-static {v6, v1, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    invoke-static {v5, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_c
    instance-of v0, v11, La/f8;

    if-nez v0, :cond_1c

    iget-object v0, v11, La/N3;->K:La/N3;

    if-eqz v0, :cond_1c

    sget-object v0, La/M3$a;->f:La/M3$a;

    invoke-virtual {v11, v0}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    iget-object v0, v0, La/M3;->d:La/M3;

    if-nez v0, :cond_1c

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v3, v0, La/N3;->K:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->h:La/V4;

    invoke-virtual {v0}, La/N3;->n()I

    move-result v0

    invoke-static {v6, v3, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    invoke-static {v5, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v2, v0, La/N3;->w:Z

    if-eqz v2, :cond_1c

    iget v0, v0, La/N3;->R:I

    invoke-static {v1, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_d
    if-nez v0, :cond_12

    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-ne v0, v4, :cond_12

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v11, v0, La/N3;->k:I

    if-eq v11, v9, :cond_10

    if-eq v11, v10, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {v0}, La/N3;->r()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v11, v0, La/N3;->j:I

    if-ne v11, v10, :cond_f

    goto :goto_2

    :cond_f
    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v11, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v7, v2, La/V4;->b:Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    iget-object v0, v0, La/N3;->K:La/N3;

    if-nez v0, :cond_11

    goto :goto_2

    :cond_11
    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v11, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v7, v2, La/V4;->b:Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    invoke-virtual {v2, p0}, La/V4;->b(La/ih;)V

    :cond_13
    :goto_2
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v11, v0, La/N3;->G:[La/M3;

    aget-object v12, v11, v9

    iget-object v13, v12, La/M3;->d:La/M3;

    if-eqz v13, :cond_15

    aget-object v14, v11, v10

    iget-object v14, v14, La/M3;->d:La/M3;

    if-eqz v14, :cond_15

    invoke-virtual {v0}, La/N3;->r()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v9

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    iput v0, v6, La/V4;->f:I

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v10

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    neg-int v0, v0

    iput v0, v5, La/V4;->f:I

    goto :goto_3

    :cond_14
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v9

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v10

    invoke-static {v3}, La/ih;->h(La/M3;)La/V4;

    move-result-object v3

    invoke-virtual {v0, p0}, La/V4;->b(La/ih;)V

    invoke-virtual {v3, p0}, La/V4;->b(La/ih;)V

    sget-object v0, La/ih$a;->b:La/ih$a;

    iput-object v0, p0, La/ih;->j:La/ih$a;

    :goto_3
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v0, v0, La/N3;->w:Z

    if-eqz v0, :cond_1b

    iget-object v0, p0, La/og;->l:La/d2;

    invoke-virtual {p0, v1, v6, v7, v0}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    goto/16 :goto_4

    :cond_15
    const/4 v14, 0x0

    if-eqz v13, :cond_17

    invoke-static {v12}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v9

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    invoke-static {v6, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {p0, v5, v6, v7, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v0, v0, La/N3;->w:Z

    if-eqz v0, :cond_16

    iget-object v0, p0, La/og;->l:La/d2;

    invoke-virtual {p0, v1, v6, v7, v0}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    :cond_16
    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-ne v0, v4, :cond_1b

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v1, v0, La/N3;->N:F

    cmpl-float v1, v1, v14

    if-lez v1, :cond_1b

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v1, v0, La/ih;->d:La/N3$a;

    if-ne v1, v4, :cond_1b

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->d:La/K8;

    iget-object v1, v1, La/ih;->e:La/l5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v2, La/V4;->a:La/ih;

    goto/16 :goto_4

    :cond_17
    aget-object v9, v11, v10

    iget-object v12, v9, La/M3;->d:La/M3;

    const/4 v13, -0x1

    if-eqz v12, :cond_18

    invoke-static {v9}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v10

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    neg-int v3, v3

    invoke-static {v5, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {p0, v6, v5, v13, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v0, v0, La/N3;->w:Z

    if-eqz v0, :cond_1b

    iget-object v0, p0, La/og;->l:La/d2;

    invoke-virtual {p0, v1, v6, v7, v0}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    goto :goto_4

    :cond_18
    aget-object v8, v11, v8

    iget-object v9, v8, La/M3;->d:La/M3;

    if-eqz v9, :cond_19

    invoke-static {v8}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-static {v1, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v0, p0, La/og;->l:La/d2;

    invoke-virtual {p0, v6, v1, v13, v0}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    invoke-virtual {p0, v5, v6, v7, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    goto :goto_4

    :cond_19
    instance-of v3, v0, La/f8;

    if-nez v3, :cond_1b

    iget-object v3, v0, La/N3;->K:La/N3;

    if-eqz v3, :cond_1b

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->h:La/V4;

    invoke-virtual {v0}, La/N3;->n()I

    move-result v0

    invoke-static {v6, v3, v0}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {p0, v5, v6, v7, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v0, v0, La/N3;->w:Z

    if-eqz v0, :cond_1a

    iget-object v0, p0, La/og;->l:La/d2;

    invoke-virtual {p0, v1, v6, v7, v0}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    :cond_1a
    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-ne v0, v4, :cond_1b

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v1, v0, La/N3;->N:F

    cmpl-float v1, v1, v14

    if-lez v1, :cond_1b

    iget-object v0, v0, La/N3;->d:La/K8;

    iget-object v1, v0, La/ih;->d:La/N3$a;

    if-ne v1, v4, :cond_1b

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->d:La/K8;

    iget-object v1, v1, La/ih;->e:La/l5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v2, La/V4;->a:La/ih;

    :cond_1b
    :goto_4
    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1c

    iput-boolean v7, v2, La/V4;->c:Z

    :cond_1c
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, La/ih;->h:La/V4;

    iget-boolean v1, v0, La/V4;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, La/ih;->b:La/N3;

    iget v0, v0, La/V4;->g:I

    iput v0, v1, La/N3;->Q:I

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La/ih;->c:La/Dd;

    iget-object v0, p0, La/ih;->h:La/V4;

    invoke-virtual {v0}, La/V4;->c()V

    iget-object v0, p0, La/ih;->i:La/V4;

    invoke-virtual {v0}, La/V4;->c()V

    iget-object v0, p0, La/og;->k:La/V4;

    invoke-virtual {v0}, La/V4;->c()V

    iget-object v0, p0, La/ih;->e:La/l5;

    invoke-virtual {v0}, La/V4;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/ih;->g:Z

    return-void
.end method

.method public final k()Z
    .locals 3

    iget-object v0, p0, La/ih;->d:La/N3$a;

    sget-object v1, La/N3$a;->c:La/N3$a;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v0, v0, La/N3;->k:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, La/ih;->g:Z

    iget-object v1, p0, La/ih;->h:La/V4;

    invoke-virtual {v1}, La/V4;->c()V

    iput-boolean v0, v1, La/V4;->j:Z

    iget-object v1, p0, La/ih;->i:La/V4;

    invoke-virtual {v1}, La/V4;->c()V

    iput-boolean v0, v1, La/V4;->j:Z

    iget-object v1, p0, La/og;->k:La/V4;

    invoke-virtual {v1}, La/V4;->c()V

    iput-boolean v0, v1, La/V4;->j:Z

    iget-object v1, p0, La/ih;->e:La/l5;

    iput-boolean v0, v1, La/V4;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VerticalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
