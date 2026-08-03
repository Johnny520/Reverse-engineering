.class public final LTD;
.super LgF;
.source ""


# instance fields
.field public k:Lvd;

.field public l:LD5;


# virtual methods
.method public final a(Ltd;)V
    .locals 10

    iget p1, p0, LgF;->j:I

    invoke-static {p1}, LEy;->v(I)I

    move-result p1

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq p1, v0, :cond_e

    iget-object p1, p0, LgF;->e:LRd;

    iget-boolean v2, p1, Lvd;->c:Z

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-boolean v2, p1, Lvd;->j:Z

    if-nez v2, :cond_5

    iget v2, p0, LgF;->d:I

    if-ne v2, v0, :cond_5

    iget-object v2, p0, LgF;->b:Lrb;

    iget v5, v2, Lrb;->s:I

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    if-eq v5, v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v5, v2, Lrb;->d:LRk;

    iget-object v5, v5, LgF;->e:LRd;

    iget-boolean v6, v5, Lvd;->j:Z

    if-eqz v6, :cond_5

    iget v6, v2, Lrb;->X:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    if-eq v6, v1, :cond_1

    move v2, v4

    goto :goto_2

    :cond_1
    iget v5, v5, Lvd;->g:I

    int-to-float v5, v5

    iget v2, v2, Lrb;->W:F

    :goto_0
    div-float/2addr v5, v2

    :goto_1
    add-float/2addr v5, v3

    float-to-int v2, v5

    goto :goto_2

    :cond_2
    iget v5, v5, Lvd;->g:I

    int-to-float v5, v5

    iget v2, v2, Lrb;->W:F

    mul-float/2addr v5, v2

    goto :goto_1

    :cond_3
    iget v5, v5, Lvd;->g:I

    int-to-float v5, v5

    iget v2, v2, Lrb;->W:F

    goto :goto_0

    :goto_2
    invoke-virtual {p1, v2}, LRd;->d(I)V

    goto :goto_3

    :cond_4
    iget-object v5, v2, Lrb;->T:Lrb;

    if-eqz v5, :cond_5

    iget-object v5, v5, Lrb;->e:LTD;

    iget-object v5, v5, LgF;->e:LRd;

    iget-boolean v6, v5, Lvd;->j:Z

    if-eqz v6, :cond_5

    iget v2, v2, Lrb;->z:F

    iget v5, v5, Lvd;->g:I

    int-to-float v5, v5

    mul-float/2addr v5, v2

    add-float/2addr v5, v3

    float-to-int v2, v5

    invoke-virtual {p1, v2}, LRd;->d(I)V

    :cond_5
    :goto_3
    iget-object v2, p0, LgF;->h:Lvd;

    iget-boolean v5, v2, Lvd;->c:Z

    iget-object v6, v2, Lvd;->l:Ljava/util/ArrayList;

    if-eqz v5, :cond_d

    iget-object v5, p0, LgF;->i:Lvd;

    iget-boolean v7, v5, Lvd;->c:Z

    iget-object v8, v5, Lvd;->l:Ljava/util/ArrayList;

    if-nez v7, :cond_6

    goto/16 :goto_6

    :cond_6
    iget-boolean v7, v2, Lvd;->j:Z

    if-eqz v7, :cond_7

    iget-boolean v7, v5, Lvd;->j:Z

    if-eqz v7, :cond_7

    iget-boolean v7, p1, Lvd;->j:Z

    if-eqz v7, :cond_7

    goto/16 :goto_6

    :cond_7
    iget-boolean v7, p1, Lvd;->j:Z

    if-nez v7, :cond_8

    iget v7, p0, LgF;->d:I

    if-ne v7, v0, :cond_8

    iget-object v7, p0, LgF;->b:Lrb;

    iget v9, v7, Lrb;->r:I

    if-nez v9, :cond_8

    invoke-virtual {v7}, Lrb;->y()Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvd;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvd;

    iget v0, v0, Lvd;->g:I

    iget v3, v2, Lvd;->f:I

    add-int/2addr v0, v3

    iget v1, v1, Lvd;->g:I

    iget v3, v5, Lvd;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    invoke-virtual {v2, v0}, Lvd;->d(I)V

    invoke-virtual {v5, v1}, Lvd;->d(I)V

    invoke-virtual {p1, v3}, LRd;->d(I)V

    return-void

    :cond_8
    iget-boolean v7, p1, Lvd;->j:Z

    if-nez v7, :cond_a

    iget v7, p0, LgF;->d:I

    if-ne v7, v0, :cond_a

    iget v0, p0, LgF;->a:I

    if-ne v0, v1, :cond_a

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvd;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvd;

    iget v0, v0, Lvd;->g:I

    iget v7, v2, Lvd;->f:I

    add-int/2addr v0, v7

    iget v1, v1, Lvd;->g:I

    iget v7, v5, Lvd;->f:I

    add-int/2addr v1, v7

    sub-int/2addr v1, v0

    iget v0, p1, LRd;->m:I

    if-ge v1, v0, :cond_9

    invoke-virtual {p1, v1}, LRd;->d(I)V

    goto :goto_4

    :cond_9
    invoke-virtual {p1, v0}, LRd;->d(I)V

    :cond_a
    :goto_4
    iget-boolean v0, p1, Lvd;->j:Z

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvd;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvd;

    iget v4, v0, Lvd;->g:I

    iget v6, v2, Lvd;->f:I

    add-int/2addr v6, v4

    iget v7, v1, Lvd;->g:I

    iget v8, v5, Lvd;->f:I

    add-int/2addr v8, v7

    iget-object v9, p0, LgF;->b:Lrb;

    iget v9, v9, Lrb;->e0:F

    if-ne v0, v1, :cond_c

    move v9, v3

    goto :goto_5

    :cond_c
    move v4, v6

    move v7, v8

    :goto_5
    sub-int/2addr v7, v4

    iget v0, p1, Lvd;->g:I

    sub-int/2addr v7, v0

    int-to-float v0, v4

    add-float/2addr v0, v3

    int-to-float v1, v7

    mul-float/2addr v1, v9

    add-float/2addr v1, v0

    float-to-int v0, v1

    invoke-virtual {v2, v0}, Lvd;->d(I)V

    iget v0, v2, Lvd;->g:I

    iget p1, p1, Lvd;->g:I

    add-int/2addr v0, p1

    invoke-virtual {v5, v0}, Lvd;->d(I)V

    :cond_d
    :goto_6
    return-void

    :cond_e
    iget-object p1, p0, LgF;->b:Lrb;

    iget-object v0, p1, Lrb;->J:Lcb;

    iget-object p1, p1, Lrb;->L:Lcb;

    invoke-virtual {p0, v0, p1, v1}, LgF;->l(Lcb;Lcb;I)V

    return-void
.end method

.method public final d()V
    .locals 15

    iget-object v0, p0, LTD;->k:Lvd;

    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v2, v1, Lrb;->a:Z

    iget-object v3, p0, LgF;->e:LRd;

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lrb;->k()I

    move-result v1

    invoke-virtual {v3, v1}, LRd;->d(I)V

    :cond_0
    iget-boolean v1, v3, Lvd;->j:Z

    iget-object v2, v3, Lvd;->k:Ljava/util/ArrayList;

    iget-object v4, v3, Lvd;->l:Ljava/util/ArrayList;

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x3

    iget-object v8, p0, LgF;->i:Lvd;

    iget-object v9, p0, LgF;->h:Lvd;

    if-nez v1, :cond_3

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v10, v1, Lrb;->p0:[I

    aget v10, v10, v6

    iput v10, p0, LgF;->d:I

    iget-boolean v1, v1, Lrb;->E:Z

    if-eqz v1, :cond_1

    new-instance v1, LD5;

    invoke-direct {v1, p0}, LRd;-><init>(LgF;)V

    iput-object v1, p0, LTD;->l:LD5;

    :cond_1
    iget v1, p0, LgF;->d:I

    if-eq v1, v7, :cond_4

    if-ne v1, v5, :cond_2

    iget-object v10, p0, LgF;->b:Lrb;

    iget-object v10, v10, Lrb;->T:Lrb;

    if-eqz v10, :cond_2

    iget-object v11, v10, Lrb;->p0:[I

    aget v11, v11, v6

    if-ne v11, v6, :cond_2

    invoke-virtual {v10}, Lrb;->k()I

    move-result v0

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->J:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->L:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, v10, Lrb;->e:LTD;

    iget-object v1, v1, LgF;->h:Lvd;

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->J:Lcb;

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    invoke-static {v9, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    iget-object v1, v10, Lrb;->e:LTD;

    iget-object v1, v1, LgF;->i:Lvd;

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->L:Lcb;

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    neg-int v2, v2

    invoke-static {v8, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {v3, v0}, LRd;->d(I)V

    return-void

    :cond_2
    if-ne v1, v6, :cond_4

    iget-object v1, p0, LgF;->b:Lrb;

    invoke-virtual {v1}, Lrb;->k()I

    move-result v1

    invoke-virtual {v3, v1}, LRd;->d(I)V

    goto :goto_0

    :cond_3
    iget v1, p0, LgF;->d:I

    if-ne v1, v5, :cond_4

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v10, v1, Lrb;->T:Lrb;

    if-eqz v10, :cond_4

    iget-object v11, v10, Lrb;->p0:[I

    aget v11, v11, v6

    if-ne v11, v6, :cond_4

    iget-object v0, v10, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->h:Lvd;

    iget-object v1, v1, Lrb;->J:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    invoke-static {v9, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    iget-object v0, v10, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->i:Lvd;

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->L:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v8, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_4
    :goto_0
    iget-boolean v1, v3, Lvd;->j:Z

    const/4 v10, 0x0

    const/4 v11, 0x2

    if-eqz v1, :cond_d

    iget-object v12, p0, LgF;->b:Lrb;

    iget-boolean v13, v12, Lrb;->a:Z

    if-eqz v13, :cond_d

    iget-object v1, v12, Lrb;->Q:[Lcb;

    aget-object v2, v1, v11

    iget-object v4, v2, Lcb;->f:Lcb;

    if-eqz v4, :cond_8

    aget-object v13, v1, v7

    iget-object v13, v13, Lcb;->f:Lcb;

    if-eqz v13, :cond_8

    invoke-virtual {v12}, Lrb;->y()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v11

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    iput v1, v9, Lvd;->f:I

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    iput v1, v8, Lvd;->f:I

    goto :goto_1

    :cond_5
    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v11

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v11

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    invoke-static {v9, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    :cond_6
    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v7

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v7

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    neg-int v2, v2

    invoke-static {v8, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    :cond_7
    iput-boolean v6, v9, Lvd;->b:Z

    iput-boolean v6, v8, Lvd;->b:Z

    :goto_1
    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v2, v1, Lrb;->E:Z

    if-eqz v2, :cond_1e

    iget v1, v1, Lrb;->a0:I

    invoke-static {v0, v9, v1}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_8
    if-eqz v4, :cond_9

    invoke-static {v2}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_1e

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v11

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    invoke-static {v9, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    iget v1, v3, Lvd;->g:I

    invoke-static {v8, v9, v1}, LgF;->b(Lvd;Lvd;I)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v2, v1, Lrb;->E:Z

    if-eqz v2, :cond_1e

    iget v1, v1, Lrb;->a0:I

    invoke-static {v0, v9, v1}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_9
    aget-object v2, v1, v7

    iget-object v4, v2, Lcb;->f:Lcb;

    if-eqz v4, :cond_b

    invoke-static {v2}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v7

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    neg-int v2, v2

    invoke-static {v8, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    iget v1, v3, Lvd;->g:I

    neg-int v1, v1

    invoke-static {v9, v8, v1}, LgF;->b(Lvd;Lvd;I)V

    :cond_a
    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v2, v1, Lrb;->E:Z

    if-eqz v2, :cond_1e

    iget v1, v1, Lrb;->a0:I

    invoke-static {v0, v9, v1}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_b
    aget-object v1, v1, v5

    iget-object v2, v1, Lcb;->f:Lcb;

    if-eqz v2, :cond_c

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_1e

    invoke-static {v0, v1, v10}, LgF;->b(Lvd;Lvd;I)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget v1, v1, Lrb;->a0:I

    neg-int v1, v1

    invoke-static {v9, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    iget v0, v3, Lvd;->g:I

    invoke-static {v8, v9, v0}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_c
    instance-of v1, v12, Luk;

    if-nez v1, :cond_1e

    iget-object v1, v12, Lrb;->T:Lrb;

    if-eqz v1, :cond_1e

    const/4 v1, 0x7

    invoke-virtual {v12, v1}, Lrb;->i(I)Lcb;

    move-result-object v1

    iget-object v1, v1, Lcb;->f:Lcb;

    if-nez v1, :cond_1e

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v2, v1, Lrb;->T:Lrb;

    iget-object v2, v2, Lrb;->e:LTD;

    iget-object v2, v2, LgF;->h:Lvd;

    invoke-virtual {v1}, Lrb;->s()I

    move-result v1

    invoke-static {v9, v2, v1}, LgF;->b(Lvd;Lvd;I)V

    iget v1, v3, Lvd;->g:I

    invoke-static {v8, v9, v1}, LgF;->b(Lvd;Lvd;I)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v2, v1, Lrb;->E:Z

    if-eqz v2, :cond_1e

    iget v1, v1, Lrb;->a0:I

    invoke-static {v0, v9, v1}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_d
    if-nez v1, :cond_12

    iget v1, p0, LgF;->d:I

    if-ne v1, v7, :cond_12

    iget-object v1, p0, LgF;->b:Lrb;

    iget v12, v1, Lrb;->s:I

    if-eq v12, v11, :cond_10

    if-eq v12, v7, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {v1}, Lrb;->y()Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, LgF;->b:Lrb;

    iget v12, v1, Lrb;->r:I

    if-ne v12, v7, :cond_f

    goto :goto_2

    :cond_f
    iget-object v1, v1, Lrb;->d:LRk;

    iget-object v1, v1, LgF;->e:LRd;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v6, v3, Lvd;->b:Z

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    iget-object v1, v1, Lrb;->T:Lrb;

    if-nez v1, :cond_11

    goto :goto_2

    :cond_11
    iget-object v1, v1, Lrb;->e:LTD;

    iget-object v1, v1, LgF;->e:LRd;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v6, v3, Lvd;->b:Z

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    invoke-virtual {v3, p0}, Lvd;->b(LgF;)V

    :cond_13
    :goto_2
    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v2, v1, Lrb;->Q:[Lcb;

    aget-object v12, v2, v11

    iget-object v13, v12, Lcb;->f:Lcb;

    if-eqz v13, :cond_17

    aget-object v14, v2, v7

    iget-object v14, v14, Lcb;->f:Lcb;

    if-eqz v14, :cond_17

    invoke-virtual {v1}, Lrb;->y()Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v11

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    iput v1, v9, Lvd;->f:I

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    iput v1, v8, Lvd;->f:I

    goto :goto_3

    :cond_14
    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v11

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v7

    invoke-static {v2}, LgF;->h(Lcb;)Lvd;

    move-result-object v2

    if-eqz v1, :cond_15

    invoke-virtual {v1, p0}, Lvd;->b(LgF;)V

    :cond_15
    if-eqz v2, :cond_16

    invoke-virtual {v2, p0}, Lvd;->b(LgF;)V

    :cond_16
    iput v5, p0, LgF;->j:I

    :goto_3
    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v1, v1, Lrb;->E:Z

    if-eqz v1, :cond_1d

    iget-object v1, p0, LTD;->l:LD5;

    invoke-virtual {p0, v0, v9, v6, v1}, LgF;->c(Lvd;Lvd;ILRd;)V

    goto/16 :goto_4

    :cond_17
    const/4 v14, 0x0

    if-eqz v13, :cond_19

    invoke-static {v12}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_1d

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v11

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    invoke-static {v9, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {p0, v8, v9, v6, v3}, LgF;->c(Lvd;Lvd;ILRd;)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v1, v1, Lrb;->E:Z

    if-eqz v1, :cond_18

    iget-object v1, p0, LTD;->l:LD5;

    invoke-virtual {p0, v0, v9, v6, v1}, LgF;->c(Lvd;Lvd;ILRd;)V

    :cond_18
    iget v0, p0, LgF;->d:I

    if-ne v0, v7, :cond_1d

    iget-object v0, p0, LgF;->b:Lrb;

    iget v1, v0, Lrb;->W:F

    cmpl-float v1, v1, v14

    if-lez v1, :cond_1d

    iget-object v0, v0, Lrb;->d:LRk;

    iget v1, v0, LgF;->d:I

    if-ne v1, v7, :cond_1d

    iget-object v0, v0, LgF;->e:LRd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->d:LRk;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v3, Lvd;->a:LgF;

    goto/16 :goto_4

    :cond_19
    aget-object v11, v2, v7

    iget-object v12, v11, Lcb;->f:Lcb;

    const/4 v13, -0x1

    if-eqz v12, :cond_1a

    invoke-static {v11}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_1d

    iget-object v2, p0, LgF;->b:Lrb;

    iget-object v2, v2, Lrb;->Q:[Lcb;

    aget-object v2, v2, v7

    invoke-virtual {v2}, Lcb;->e()I

    move-result v2

    neg-int v2, v2

    invoke-static {v8, v1, v2}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {p0, v9, v8, v13, v3}, LgF;->c(Lvd;Lvd;ILRd;)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v1, v1, Lrb;->E:Z

    if-eqz v1, :cond_1d

    iget-object v1, p0, LTD;->l:LD5;

    invoke-virtual {p0, v0, v9, v6, v1}, LgF;->c(Lvd;Lvd;ILRd;)V

    goto :goto_4

    :cond_1a
    aget-object v2, v2, v5

    iget-object v5, v2, Lcb;->f:Lcb;

    if-eqz v5, :cond_1b

    invoke-static {v2}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v1, :cond_1d

    invoke-static {v0, v1, v10}, LgF;->b(Lvd;Lvd;I)V

    iget-object v1, p0, LTD;->l:LD5;

    invoke-virtual {p0, v9, v0, v13, v1}, LgF;->c(Lvd;Lvd;ILRd;)V

    invoke-virtual {p0, v8, v9, v6, v3}, LgF;->c(Lvd;Lvd;ILRd;)V

    goto :goto_4

    :cond_1b
    instance-of v2, v1, Luk;

    if-nez v2, :cond_1d

    iget-object v2, v1, Lrb;->T:Lrb;

    if-eqz v2, :cond_1d

    iget-object v2, v2, Lrb;->e:LTD;

    iget-object v2, v2, LgF;->h:Lvd;

    invoke-virtual {v1}, Lrb;->s()I

    move-result v1

    invoke-static {v9, v2, v1}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {p0, v8, v9, v6, v3}, LgF;->c(Lvd;Lvd;ILRd;)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-boolean v1, v1, Lrb;->E:Z

    if-eqz v1, :cond_1c

    iget-object v1, p0, LTD;->l:LD5;

    invoke-virtual {p0, v0, v9, v6, v1}, LgF;->c(Lvd;Lvd;ILRd;)V

    :cond_1c
    iget v0, p0, LgF;->d:I

    if-ne v0, v7, :cond_1d

    iget-object v0, p0, LgF;->b:Lrb;

    iget v1, v0, Lrb;->W:F

    cmpl-float v1, v1, v14

    if-lez v1, :cond_1d

    iget-object v0, v0, Lrb;->d:LRk;

    iget v1, v0, LgF;->d:I

    if-ne v1, v7, :cond_1d

    iget-object v0, v0, LgF;->e:LRd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->d:LRk;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v3, Lvd;->a:LgF;

    :cond_1d
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1e

    iput-boolean v6, v3, Lvd;->c:Z

    :cond_1e
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LgF;->h:Lvd;

    iget-boolean v1, v0, Lvd;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, LgF;->b:Lrb;

    iget v0, v0, Lvd;->g:I

    iput v0, v1, Lrb;->Z:I

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LgF;->c:LRw;

    iget-object v0, p0, LgF;->h:Lvd;

    invoke-virtual {v0}, Lvd;->c()V

    iget-object v0, p0, LgF;->i:Lvd;

    invoke-virtual {v0}, Lvd;->c()V

    iget-object v0, p0, LTD;->k:Lvd;

    invoke-virtual {v0}, Lvd;->c()V

    iget-object v0, p0, LgF;->e:LRd;

    invoke-virtual {v0}, Lvd;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LgF;->g:Z

    return-void
.end method

.method public final k()Z
    .locals 2

    iget v0, p0, LgF;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LgF;->b:Lrb;

    iget v0, v0, Lrb;->s:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, LgF;->g:Z

    iget-object v1, p0, LgF;->h:Lvd;

    invoke-virtual {v1}, Lvd;->c()V

    iput-boolean v0, v1, Lvd;->j:Z

    iget-object v1, p0, LgF;->i:Lvd;

    invoke-virtual {v1}, Lvd;->c()V

    iput-boolean v0, v1, Lvd;->j:Z

    iget-object v1, p0, LTD;->k:Lvd;

    invoke-virtual {v1}, Lvd;->c()V

    iput-boolean v0, v1, Lvd;->j:Z

    iget-object v1, p0, LgF;->e:LRd;

    iput-boolean v0, v1, Lvd;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VerticalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->h0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
