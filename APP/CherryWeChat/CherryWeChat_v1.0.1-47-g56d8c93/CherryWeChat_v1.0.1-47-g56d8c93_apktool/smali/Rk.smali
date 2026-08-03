.class public final LRk;
.super LgF;
.source ""


# static fields
.field public static final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, LRk;->k:[I

    return-void
.end method

.method public static m([IIIIIFI)V
    .locals 2

    sub-int/2addr p2, p1

    sub-int/2addr p4, p3

    const/4 p1, -0x1

    const/4 p3, 0x0

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    if-eq p6, p1, :cond_2

    if-eqz p6, :cond_1

    if-eq p6, v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p1, p2

    mul-float/2addr p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    aput p2, p0, p3

    aput p1, p0, v1

    return-void

    :cond_1
    int-to-float p1, p4

    mul-float/2addr p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    aput p1, p0, p3

    aput p4, p0, v1

    return-void

    :cond_2
    int-to-float p1, p4

    mul-float/2addr p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    int-to-float p6, p2

    div-float/2addr p6, p5

    add-float/2addr p6, v0

    float-to-int p5, p6

    if-gt p1, p2, :cond_3

    aput p1, p0, p3

    aput p4, p0, v1

    return-void

    :cond_3
    if-gt p5, p4, :cond_4

    aput p2, p0, p3

    aput p5, p0, v1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Ltd;)V
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, LgF;->j:I

    invoke-static {v1}, LEy;->v(I)I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eq v1, v2, :cond_26

    iget-object v1, v0, LgF;->e:LRd;

    iget-boolean v4, v1, Lvd;->j:Z

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x1

    iget-object v7, v0, LgF;->h:Lvd;

    iget-object v8, v0, LgF;->i:Lvd;

    if-nez v4, :cond_0

    iget v4, v0, LgF;->d:I

    if-ne v4, v2, :cond_0

    iget-object v4, v0, LgF;->b:Lrb;

    iget v9, v4, Lrb;->r:I

    const/4 v10, 0x2

    if-eq v9, v10, :cond_1c

    if-eq v9, v2, :cond_1

    :cond_0
    :goto_0
    move/from16 p1, v5

    goto/16 :goto_a

    :cond_1
    iget v9, v4, Lrb;->s:I

    const/4 v10, -0x1

    if-eqz v9, :cond_6

    if-ne v9, v2, :cond_2

    goto :goto_4

    :cond_2
    iget v9, v4, Lrb;->X:I

    if-eq v9, v10, :cond_5

    if-eqz v9, :cond_4

    if-eq v9, v6, :cond_3

    move v4, v3

    goto :goto_3

    :cond_3
    iget-object v9, v4, Lrb;->e:LTD;

    iget-object v9, v9, LgF;->e:LRd;

    iget v9, v9, Lvd;->g:I

    int-to-float v9, v9

    iget v4, v4, Lrb;->W:F

    :goto_1
    mul-float/2addr v9, v4

    :goto_2
    add-float/2addr v9, v5

    float-to-int v4, v9

    goto :goto_3

    :cond_4
    iget-object v9, v4, Lrb;->e:LTD;

    iget-object v9, v9, LgF;->e:LRd;

    iget v9, v9, Lvd;->g:I

    int-to-float v9, v9

    iget v4, v4, Lrb;->W:F

    div-float/2addr v9, v4

    goto :goto_2

    :cond_5
    iget-object v9, v4, Lrb;->e:LTD;

    iget-object v9, v9, LgF;->e:LRd;

    iget v9, v9, Lvd;->g:I

    int-to-float v9, v9

    iget v4, v4, Lrb;->W:F

    goto :goto_1

    :goto_3
    invoke-virtual {v1, v4}, LRd;->d(I)V

    goto :goto_0

    :cond_6
    :goto_4
    iget-object v9, v4, Lrb;->e:LTD;

    iget-object v11, v9, LgF;->h:Lvd;

    iget-object v9, v9, LgF;->i:Lvd;

    iget-object v12, v4, Lrb;->I:Lcb;

    iget-object v12, v12, Lcb;->f:Lcb;

    if-eqz v12, :cond_7

    move v12, v6

    goto :goto_5

    :cond_7
    move v12, v3

    :goto_5
    iget-object v13, v4, Lrb;->J:Lcb;

    iget-object v13, v13, Lcb;->f:Lcb;

    if-eqz v13, :cond_8

    move v13, v6

    goto :goto_6

    :cond_8
    move v13, v3

    :goto_6
    iget-object v14, v4, Lrb;->K:Lcb;

    iget-object v14, v14, Lcb;->f:Lcb;

    if-eqz v14, :cond_9

    move v14, v6

    goto :goto_7

    :cond_9
    move v14, v3

    :goto_7
    iget-object v15, v4, Lrb;->L:Lcb;

    iget-object v15, v15, Lcb;->f:Lcb;

    if-eqz v15, :cond_a

    move v15, v6

    :goto_8
    move/from16 p1, v5

    goto :goto_9

    :cond_a
    move v15, v3

    goto :goto_8

    :goto_9
    iget v5, v4, Lrb;->X:I

    if-eqz v12, :cond_10

    if-eqz v13, :cond_10

    if-eqz v14, :cond_10

    if-eqz v15, :cond_10

    iget v4, v4, Lrb;->W:F

    iget-boolean v10, v11, Lvd;->j:Z

    iget-object v12, v11, Lvd;->l:Ljava/util/ArrayList;

    sget-object v16, LRk;->k:[I

    if-eqz v10, :cond_c

    iget-boolean v10, v9, Lvd;->j:Z

    if-eqz v10, :cond_c

    iget-boolean v2, v7, Lvd;->c:Z

    if-eqz v2, :cond_25

    iget-boolean v2, v8, Lvd;->c:Z

    if-nez v2, :cond_b

    goto/16 :goto_c

    :cond_b
    iget-object v2, v7, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvd;

    iget v2, v2, Lvd;->g:I

    iget v7, v7, Lvd;->f:I

    add-int v17, v2, v7

    iget-object v2, v8, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvd;

    iget v2, v2, Lvd;->g:I

    iget v7, v8, Lvd;->f:I

    sub-int v18, v2, v7

    iget v2, v11, Lvd;->g:I

    iget v7, v11, Lvd;->f:I

    add-int v19, v2, v7

    iget v2, v9, Lvd;->g:I

    iget v7, v9, Lvd;->f:I

    sub-int v20, v2, v7

    move/from16 v21, v4

    move/from16 v22, v5

    invoke-static/range {v16 .. v22}, LRk;->m([IIIIIFI)V

    aget v2, v16, v3

    invoke-virtual {v1, v2}, LRd;->d(I)V

    iget-object v1, v0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->e:LTD;

    iget-object v1, v1, LgF;->e:LRd;

    aget v2, v16, v6

    invoke-virtual {v1, v2}, LRd;->d(I)V

    return-void

    :cond_c
    move/from16 v21, v4

    move/from16 v22, v5

    iget-boolean v4, v7, Lvd;->j:Z

    if-eqz v4, :cond_e

    iget-boolean v4, v8, Lvd;->j:Z

    if-eqz v4, :cond_e

    iget-boolean v4, v11, Lvd;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v9, Lvd;->c:Z

    if-nez v4, :cond_d

    goto/16 :goto_c

    :cond_d
    iget v4, v7, Lvd;->g:I

    iget v5, v7, Lvd;->f:I

    add-int v17, v4, v5

    iget v4, v8, Lvd;->g:I

    iget v5, v8, Lvd;->f:I

    sub-int v18, v4, v5

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v4, v4, Lvd;->g:I

    iget v5, v11, Lvd;->f:I

    add-int v19, v4, v5

    iget-object v4, v9, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v4, v4, Lvd;->g:I

    iget v5, v9, Lvd;->f:I

    sub-int v20, v4, v5

    invoke-static/range {v16 .. v22}, LRk;->m([IIIIIFI)V

    aget v4, v16, v3

    invoke-virtual {v1, v4}, LRd;->d(I)V

    iget-object v4, v0, LgF;->b:Lrb;

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v4, v4, LgF;->e:LRd;

    aget v5, v16, v6

    invoke-virtual {v4, v5}, LRd;->d(I)V

    :cond_e
    iget-boolean v4, v7, Lvd;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v8, Lvd;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v11, Lvd;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v9, Lvd;->c:Z

    if-nez v4, :cond_f

    goto/16 :goto_c

    :cond_f
    iget-object v4, v7, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v4, v4, Lvd;->g:I

    iget v5, v7, Lvd;->f:I

    add-int v17, v4, v5

    iget-object v4, v8, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v4, v4, Lvd;->g:I

    iget v5, v8, Lvd;->f:I

    sub-int v18, v4, v5

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v4, v4, Lvd;->g:I

    iget v5, v11, Lvd;->f:I

    add-int v19, v4, v5

    iget-object v4, v9, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v4, v4, Lvd;->g:I

    iget v5, v9, Lvd;->f:I

    sub-int v20, v4, v5

    invoke-static/range {v16 .. v22}, LRk;->m([IIIIIFI)V

    aget v4, v16, v3

    invoke-virtual {v1, v4}, LRd;->d(I)V

    iget-object v4, v0, LgF;->b:Lrb;

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v4, v4, LgF;->e:LRd;

    aget v5, v16, v6

    invoke-virtual {v4, v5}, LRd;->d(I)V

    goto/16 :goto_a

    :cond_10
    if-eqz v12, :cond_16

    if-eqz v14, :cond_16

    iget-boolean v9, v7, Lvd;->c:Z

    if-eqz v9, :cond_25

    iget-boolean v9, v8, Lvd;->c:Z

    if-nez v9, :cond_11

    goto/16 :goto_c

    :cond_11
    iget v4, v4, Lrb;->W:F

    iget-object v9, v7, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lvd;

    iget v9, v9, Lvd;->g:I

    iget v11, v7, Lvd;->f:I

    add-int/2addr v9, v11

    iget-object v11, v8, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lvd;

    iget v11, v11, Lvd;->g:I

    iget v12, v8, Lvd;->f:I

    sub-int/2addr v11, v12

    if-eq v5, v10, :cond_14

    if-eqz v5, :cond_14

    if-eq v5, v6, :cond_12

    goto/16 :goto_a

    :cond_12
    sub-int/2addr v11, v9

    invoke-virtual {v0, v11, v3}, LgF;->g(II)I

    move-result v5

    int-to-float v9, v5

    div-float/2addr v9, v4

    add-float v9, v9, p1

    float-to-int v9, v9

    invoke-virtual {v0, v9, v6}, LgF;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_13

    int-to-float v5, v10

    mul-float/2addr v5, v4

    add-float v5, v5, p1

    float-to-int v5, v5

    :cond_13
    invoke-virtual {v1, v5}, LRd;->d(I)V

    iget-object v4, v0, LgF;->b:Lrb;

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v4, v4, LgF;->e:LRd;

    invoke-virtual {v4, v10}, LRd;->d(I)V

    goto/16 :goto_a

    :cond_14
    sub-int/2addr v11, v9

    invoke-virtual {v0, v11, v3}, LgF;->g(II)I

    move-result v5

    int-to-float v9, v5

    mul-float/2addr v9, v4

    add-float v9, v9, p1

    float-to-int v9, v9

    invoke-virtual {v0, v9, v6}, LgF;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_15

    int-to-float v5, v10

    div-float/2addr v5, v4

    add-float v5, v5, p1

    float-to-int v5, v5

    :cond_15
    invoke-virtual {v1, v5}, LRd;->d(I)V

    iget-object v4, v0, LgF;->b:Lrb;

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v4, v4, LgF;->e:LRd;

    invoke-virtual {v4, v10}, LRd;->d(I)V

    goto/16 :goto_a

    :cond_16
    if-eqz v13, :cond_1d

    if-eqz v15, :cond_1d

    iget-boolean v12, v11, Lvd;->c:Z

    if-eqz v12, :cond_25

    iget-boolean v12, v9, Lvd;->c:Z

    if-nez v12, :cond_17

    goto/16 :goto_c

    :cond_17
    iget v4, v4, Lrb;->W:F

    iget-object v12, v11, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lvd;

    iget v12, v12, Lvd;->g:I

    iget v11, v11, Lvd;->f:I

    add-int/2addr v12, v11

    iget-object v11, v9, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lvd;

    iget v11, v11, Lvd;->g:I

    iget v9, v9, Lvd;->f:I

    sub-int/2addr v11, v9

    if-eq v5, v10, :cond_1a

    if-eqz v5, :cond_18

    if-eq v5, v6, :cond_1a

    goto :goto_a

    :cond_18
    sub-int/2addr v11, v12

    invoke-virtual {v0, v11, v6}, LgF;->g(II)I

    move-result v5

    int-to-float v9, v5

    mul-float/2addr v9, v4

    add-float v9, v9, p1

    float-to-int v9, v9

    invoke-virtual {v0, v9, v3}, LgF;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_19

    int-to-float v5, v10

    div-float/2addr v5, v4

    add-float v5, v5, p1

    float-to-int v5, v5

    :cond_19
    invoke-virtual {v1, v10}, LRd;->d(I)V

    iget-object v4, v0, LgF;->b:Lrb;

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v4, v4, LgF;->e:LRd;

    invoke-virtual {v4, v5}, LRd;->d(I)V

    goto :goto_a

    :cond_1a
    sub-int/2addr v11, v12

    invoke-virtual {v0, v11, v6}, LgF;->g(II)I

    move-result v5

    int-to-float v9, v5

    div-float/2addr v9, v4

    add-float v9, v9, p1

    float-to-int v9, v9

    invoke-virtual {v0, v9, v3}, LgF;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_1b

    int-to-float v5, v10

    mul-float/2addr v5, v4

    add-float v5, v5, p1

    float-to-int v5, v5

    :cond_1b
    invoke-virtual {v1, v10}, LRd;->d(I)V

    iget-object v4, v0, LgF;->b:Lrb;

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v4, v4, LgF;->e:LRd;

    invoke-virtual {v4, v5}, LRd;->d(I)V

    goto :goto_a

    :cond_1c
    move/from16 p1, v5

    iget-object v5, v4, Lrb;->T:Lrb;

    if-eqz v5, :cond_1d

    iget-object v5, v5, Lrb;->d:LRk;

    iget-object v5, v5, LgF;->e:LRd;

    iget-boolean v9, v5, Lvd;->j:Z

    if-eqz v9, :cond_1d

    iget v4, v4, Lrb;->w:F

    iget v5, v5, Lvd;->g:I

    int-to-float v5, v5

    mul-float/2addr v5, v4

    add-float v5, v5, p1

    float-to-int v4, v5

    invoke-virtual {v1, v4}, LRd;->d(I)V

    :cond_1d
    :goto_a
    iget-boolean v4, v7, Lvd;->c:Z

    iget-object v5, v7, Lvd;->l:Ljava/util/ArrayList;

    if-eqz v4, :cond_25

    iget-boolean v4, v8, Lvd;->c:Z

    iget-object v9, v8, Lvd;->l:Ljava/util/ArrayList;

    if-nez v4, :cond_1e

    goto/16 :goto_c

    :cond_1e
    iget-boolean v4, v7, Lvd;->j:Z

    if-eqz v4, :cond_1f

    iget-boolean v4, v8, Lvd;->j:Z

    if-eqz v4, :cond_1f

    iget-boolean v4, v1, Lvd;->j:Z

    if-eqz v4, :cond_1f

    goto/16 :goto_c

    :cond_1f
    iget-boolean v4, v1, Lvd;->j:Z

    if-nez v4, :cond_20

    iget v4, v0, LgF;->d:I

    if-ne v4, v2, :cond_20

    iget-object v4, v0, LgF;->b:Lrb;

    iget v10, v4, Lrb;->r:I

    if-nez v10, :cond_20

    invoke-virtual {v4}, Lrb;->x()Z

    move-result v4

    if-nez v4, :cond_20

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvd;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvd;

    iget v2, v2, Lvd;->g:I

    iget v4, v7, Lvd;->f:I

    add-int/2addr v2, v4

    iget v3, v3, Lvd;->g:I

    iget v4, v8, Lvd;->f:I

    add-int/2addr v3, v4

    sub-int v4, v3, v2

    invoke-virtual {v7, v2}, Lvd;->d(I)V

    invoke-virtual {v8, v3}, Lvd;->d(I)V

    invoke-virtual {v1, v4}, LRd;->d(I)V

    return-void

    :cond_20
    iget-boolean v4, v1, Lvd;->j:Z

    if-nez v4, :cond_22

    iget v4, v0, LgF;->d:I

    if-ne v4, v2, :cond_22

    iget v2, v0, LgF;->a:I

    if-ne v2, v6, :cond_22

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_22

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_22

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvd;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvd;

    iget v2, v2, Lvd;->g:I

    iget v6, v7, Lvd;->f:I

    add-int/2addr v2, v6

    iget v4, v4, Lvd;->g:I

    iget v6, v8, Lvd;->f:I

    add-int/2addr v4, v6

    sub-int/2addr v4, v2

    iget v2, v1, LRd;->m:I

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v4, v0, LgF;->b:Lrb;

    iget v6, v4, Lrb;->v:I

    iget v4, v4, Lrb;->u:I

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v6, :cond_21

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_21
    invoke-virtual {v1, v2}, LRd;->d(I)V

    :cond_22
    iget-boolean v2, v1, Lvd;->j:Z

    if-nez v2, :cond_23

    goto :goto_c

    :cond_23
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvd;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvd;

    iget v4, v2, Lvd;->g:I

    iget v5, v7, Lvd;->f:I

    add-int/2addr v5, v4

    iget v6, v3, Lvd;->g:I

    iget v9, v8, Lvd;->f:I

    add-int/2addr v9, v6

    iget-object v10, v0, LgF;->b:Lrb;

    iget v10, v10, Lrb;->d0:F

    if-ne v2, v3, :cond_24

    move/from16 v10, p1

    goto :goto_b

    :cond_24
    move v4, v5

    move v6, v9

    :goto_b
    sub-int/2addr v6, v4

    iget v2, v1, Lvd;->g:I

    sub-int/2addr v6, v2

    int-to-float v2, v4

    add-float v2, v2, p1

    int-to-float v3, v6

    mul-float/2addr v3, v10

    add-float/2addr v3, v2

    float-to-int v2, v3

    invoke-virtual {v7, v2}, Lvd;->d(I)V

    iget v2, v7, Lvd;->g:I

    iget v1, v1, Lvd;->g:I

    add-int/2addr v2, v1

    invoke-virtual {v8, v2}, Lvd;->d(I)V

    :cond_25
    :goto_c
    return-void

    :cond_26
    iget-object v1, v0, LgF;->b:Lrb;

    iget-object v2, v1, Lrb;->I:Lcb;

    iget-object v1, v1, Lrb;->K:Lcb;

    invoke-virtual {v0, v2, v1, v3}, LgF;->l(Lcb;Lcb;I)V

    return-void
.end method

.method public final d()V
    .locals 13

    iget-object v0, p0, LgF;->b:Lrb;

    iget-boolean v1, v0, Lrb;->a:Z

    iget-object v2, p0, LgF;->e:LRd;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lrb;->q()I

    move-result v0

    invoke-virtual {v2, v0}, LRd;->d(I)V

    :cond_0
    iget-boolean v0, v2, Lvd;->j:Z

    iget-object v1, v2, Lvd;->k:Ljava/util/ArrayList;

    iget-object v3, v2, Lvd;->l:Ljava/util/ArrayList;

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    iget-object v8, p0, LgF;->i:Lvd;

    iget-object v9, p0, LgF;->h:Lvd;

    if-nez v0, :cond_3

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v10, v0, Lrb;->p0:[I

    aget v10, v10, v7

    iput v10, p0, LgF;->d:I

    if-eq v10, v4, :cond_5

    if-ne v10, v5, :cond_2

    iget-object v11, v0, Lrb;->T:Lrb;

    if-eqz v11, :cond_2

    iget-object v12, v11, Lrb;->p0:[I

    aget v12, v12, v7

    if-eq v12, v6, :cond_1

    if-ne v12, v5, :cond_2

    :cond_1
    invoke-virtual {v11}, Lrb;->q()I

    move-result v0

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->I:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->K:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, v11, Lrb;->d:LRk;

    iget-object v1, v1, LgF;->h:Lvd;

    iget-object v3, p0, LgF;->b:Lrb;

    iget-object v3, v3, Lrb;->I:Lcb;

    invoke-virtual {v3}, Lcb;->e()I

    move-result v3

    invoke-static {v9, v1, v3}, LgF;->b(Lvd;Lvd;I)V

    iget-object v1, v11, Lrb;->d:LRk;

    iget-object v1, v1, LgF;->i:Lvd;

    iget-object v3, p0, LgF;->b:Lrb;

    iget-object v3, v3, Lrb;->K:Lcb;

    invoke-virtual {v3}, Lcb;->e()I

    move-result v3

    neg-int v3, v3

    invoke-static {v8, v1, v3}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {v2, v0}, LRd;->d(I)V

    return-void

    :cond_2
    if-ne v10, v6, :cond_5

    invoke-virtual {v0}, Lrb;->q()I

    move-result v0

    invoke-virtual {v2, v0}, LRd;->d(I)V

    goto :goto_0

    :cond_3
    iget v0, p0, LgF;->d:I

    if-ne v0, v5, :cond_5

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v10, v0, Lrb;->T:Lrb;

    if-eqz v10, :cond_5

    iget-object v11, v10, Lrb;->p0:[I

    aget v11, v11, v7

    if-eq v11, v6, :cond_4

    if-ne v11, v5, :cond_5

    :cond_4
    iget-object v1, v10, Lrb;->d:LRk;

    iget-object v1, v1, LgF;->h:Lvd;

    iget-object v0, v0, Lrb;->I:Lcb;

    invoke-virtual {v0}, Lcb;->e()I

    move-result v0

    invoke-static {v9, v1, v0}, LgF;->b(Lvd;Lvd;I)V

    iget-object v0, v10, Lrb;->d:LRk;

    iget-object v0, v0, LgF;->i:Lvd;

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->K:Lcb;

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v8, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_5
    :goto_0
    iget-boolean v0, v2, Lvd;->j:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, LgF;->b:Lrb;

    iget-boolean v10, v0, Lrb;->a:Z

    if-eqz v10, :cond_c

    iget-object v1, v0, Lrb;->Q:[Lcb;

    aget-object v3, v1, v7

    iget-object v4, v3, Lcb;->f:Lcb;

    if-eqz v4, :cond_9

    aget-object v5, v1, v6

    iget-object v5, v5, Lcb;->f:Lcb;

    if-eqz v5, :cond_9

    invoke-virtual {v0}, Lrb;->x()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Lcb;->e()I

    move-result v0

    iput v0, v9, Lvd;->f:I

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v6

    invoke-virtual {v0}, Lcb;->e()I

    move-result v0

    neg-int v0, v0

    iput v0, v8, Lvd;->f:I

    return-void

    :cond_6
    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v7

    invoke-static {v0}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    invoke-static {v9, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    :cond_7
    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v6

    invoke-static {v0}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v8, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    :cond_8
    iput-boolean v6, v9, Lvd;->b:Z

    iput-boolean v6, v8, Lvd;->b:Z

    return-void

    :cond_9
    if-eqz v4, :cond_a

    invoke-static {v3}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    invoke-static {v9, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    iget v0, v2, Lvd;->g:I

    invoke-static {v8, v9, v0}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_a
    aget-object v1, v1, v6

    iget-object v3, v1, Lcb;->f:Lcb;

    if-eqz v3, :cond_b

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v8, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    iget v0, v2, Lvd;->g:I

    neg-int v0, v0

    invoke-static {v9, v8, v0}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_b
    instance-of v1, v0, Luk;

    if-nez v1, :cond_1a

    iget-object v1, v0, Lrb;->T:Lrb;

    if-eqz v1, :cond_1a

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lrb;->i(I)Lcb;

    move-result-object v0

    iget-object v0, v0, Lcb;->f:Lcb;

    if-nez v0, :cond_1a

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v1, v0, Lrb;->T:Lrb;

    iget-object v1, v1, Lrb;->d:LRk;

    iget-object v1, v1, LgF;->h:Lvd;

    invoke-virtual {v0}, Lrb;->r()I

    move-result v0

    invoke-static {v9, v1, v0}, LgF;->b(Lvd;Lvd;I)V

    iget v0, v2, Lvd;->g:I

    invoke-static {v8, v9, v0}, LgF;->b(Lvd;Lvd;I)V

    return-void

    :cond_c
    iget v0, p0, LgF;->d:I

    if-ne v0, v4, :cond_13

    iget-object v0, p0, LgF;->b:Lrb;

    iget v10, v0, Lrb;->r:I

    const/4 v11, 0x2

    if-eq v10, v11, :cond_11

    if-eq v10, v4, :cond_d

    goto/16 :goto_1

    :cond_d
    iget v10, v0, Lrb;->s:I

    if-ne v10, v4, :cond_10

    iput-object p0, v9, Lvd;->a:LgF;

    iput-object p0, v8, Lvd;->a:LgF;

    iget-object v4, v0, Lrb;->e:LTD;

    iget-object v10, v4, LgF;->h:Lvd;

    iput-object p0, v10, Lvd;->a:LgF;

    iget-object v4, v4, LgF;->i:Lvd;

    iput-object p0, v4, Lvd;->a:LgF;

    iput-object p0, v2, Lvd;->a:LgF;

    invoke-virtual {v0}, Lrb;->y()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v1, v0, LgF;->e:LRd;

    iput-object p0, v1, Lvd;->a:LgF;

    iget-object v0, v0, LgF;->h:Lvd;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->i:Lvd;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->h:Lvd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->i:Lvd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_e
    iget-object v0, p0, LgF;->b:Lrb;

    invoke-virtual {v0}, Lrb;->x()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    iget-object v0, v0, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_f
    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    iget-object v0, v0, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_10
    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->h:Lvd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->i:Lvd;

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v6, v2, Lvd;->b:Z

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v9, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v8, Lvd;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_11
    iget-object v0, v0, Lrb;->T:Lrb;

    if-nez v0, :cond_12

    goto :goto_1

    :cond_12
    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lvd;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v6, v2, Lvd;->b:Z

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_1
    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v1, v0, Lrb;->Q:[Lcb;

    aget-object v3, v1, v7

    iget-object v4, v3, Lcb;->f:Lcb;

    if-eqz v4, :cond_17

    aget-object v10, v1, v6

    iget-object v10, v10, Lcb;->f:Lcb;

    if-eqz v10, :cond_17

    invoke-virtual {v0}, Lrb;->x()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Lcb;->e()I

    move-result v0

    iput v0, v9, Lvd;->f:I

    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v6

    invoke-virtual {v0}, Lcb;->e()I

    move-result v0

    neg-int v0, v0

    iput v0, v8, Lvd;->f:I

    return-void

    :cond_14
    iget-object v0, p0, LgF;->b:Lrb;

    iget-object v0, v0, Lrb;->Q:[Lcb;

    aget-object v0, v0, v7

    invoke-static {v0}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v6

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-virtual {v0, p0}, Lvd;->b(LgF;)V

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1, p0}, Lvd;->b(LgF;)V

    :cond_16
    iput v5, p0, LgF;->j:I

    return-void

    :cond_17
    if-eqz v4, :cond_18

    invoke-static {v3}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    invoke-static {v9, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {p0, v8, v9, v6, v2}, LgF;->c(Lvd;Lvd;ILRd;)V

    return-void

    :cond_18
    aget-object v1, v1, v6

    iget-object v3, v1, Lcb;->f:Lcb;

    if-eqz v3, :cond_19

    invoke-static {v1}, LgF;->h(Lcb;)Lvd;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->Q:[Lcb;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lcb;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v8, v0, v1}, LgF;->b(Lvd;Lvd;I)V

    const/4 v0, -0x1

    invoke-virtual {p0, v9, v8, v0, v2}, LgF;->c(Lvd;Lvd;ILRd;)V

    return-void

    :cond_19
    instance-of v1, v0, Luk;

    if-nez v1, :cond_1a

    iget-object v1, v0, Lrb;->T:Lrb;

    if-eqz v1, :cond_1a

    iget-object v1, v1, Lrb;->d:LRk;

    iget-object v1, v1, LgF;->h:Lvd;

    invoke-virtual {v0}, Lrb;->r()I

    move-result v0

    invoke-static {v9, v1, v0}, LgF;->b(Lvd;Lvd;I)V

    invoke-virtual {p0, v8, v9, v6, v2}, LgF;->c(Lvd;Lvd;ILRd;)V

    :cond_1a
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LgF;->h:Lvd;

    iget-boolean v1, v0, Lvd;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, LgF;->b:Lrb;

    iget v0, v0, Lvd;->g:I

    iput v0, v1, Lrb;->Y:I

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

    iget v0, v0, Lrb;->r:I

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

.method public final n()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, LgF;->g:Z

    iget-object v1, p0, LgF;->h:Lvd;

    invoke-virtual {v1}, Lvd;->c()V

    iput-boolean v0, v1, Lvd;->j:Z

    iget-object v1, p0, LgF;->i:Lvd;

    invoke-virtual {v1}, Lvd;->c()V

    iput-boolean v0, v1, Lvd;->j:Z

    iget-object v1, p0, LgF;->e:LRd;

    iput-boolean v0, v1, Lvd;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HorizontalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LgF;->b:Lrb;

    iget-object v1, v1, Lrb;->h0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
