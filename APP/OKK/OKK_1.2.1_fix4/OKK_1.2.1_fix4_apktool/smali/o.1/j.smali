.class public final Lo/j;
.super Lo/m;
.source "SourceFile"


# static fields
.field public static final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Lo/j;->k:[I

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

    goto :goto_0

    :cond_1
    int-to-float p1, p4

    mul-float/2addr p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    aput p1, p0, p3

    aput p4, p0, v1

    goto :goto_0

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

    goto :goto_0

    :cond_3
    if-gt p5, p4, :cond_4

    aput p2, p0, p3

    aput p5, p0, v1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lo/d;)V
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lo/m;->j:I

    invoke-static {v1}, Lm/h;->a(I)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-eq v1, v3, :cond_2a

    iget-object v1, v0, Lo/m;->e:Lo/g;

    iget-boolean v4, v1, Lo/f;->j:Z

    iget-object v5, v0, Lo/m;->h:Lo/f;

    iget-object v6, v0, Lo/m;->i:Lo/f;

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v8, 0x1

    if-nez v4, :cond_21

    iget v4, v0, Lo/m;->d:I

    if-ne v4, v3, :cond_21

    iget-object v4, v0, Lo/m;->b:Ln/d;

    iget v9, v4, Ln/d;->j:I

    const/4 v10, 0x2

    if-eq v9, v10, :cond_20

    if-eq v9, v3, :cond_0

    goto/16 :goto_e

    :cond_0
    iget v9, v4, Ln/d;->k:I

    const/4 v10, -0x1

    if-eqz v9, :cond_5

    if-ne v9, v3, :cond_1

    goto :goto_3

    :cond_1
    iget v9, v4, Ln/d;->M:I

    if-eq v9, v10, :cond_4

    if-eqz v9, :cond_3

    if-eq v9, v8, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    iget-object v9, v4, Ln/d;->e:Lo/l;

    iget-object v9, v9, Lo/m;->e:Lo/g;

    iget v9, v9, Lo/f;->g:I

    int-to-float v9, v9

    iget v4, v4, Ln/d;->L:F

    :goto_0
    mul-float/2addr v9, v4

    :goto_1
    add-float/2addr v9, v7

    float-to-int v4, v9

    goto :goto_2

    :cond_3
    iget-object v9, v4, Ln/d;->e:Lo/l;

    iget-object v9, v9, Lo/m;->e:Lo/g;

    iget v9, v9, Lo/f;->g:I

    int-to-float v9, v9

    iget v4, v4, Ln/d;->L:F

    div-float/2addr v9, v4

    goto :goto_1

    :cond_4
    iget-object v9, v4, Ln/d;->e:Lo/l;

    iget-object v9, v9, Lo/m;->e:Lo/g;

    iget v9, v9, Lo/f;->g:I

    int-to-float v9, v9

    iget v4, v4, Ln/d;->L:F

    goto :goto_0

    :goto_2
    invoke-virtual {v1, v4}, Lo/g;->d(I)V

    goto/16 :goto_e

    :cond_5
    :goto_3
    iget-object v9, v4, Ln/d;->e:Lo/l;

    iget-object v11, v9, Lo/m;->h:Lo/f;

    iget-object v9, v9, Lo/m;->i:Lo/f;

    iget-object v12, v4, Ln/d;->x:Ln/c;

    iget-object v12, v12, Ln/c;->d:Ln/c;

    if-eqz v12, :cond_6

    move v12, v8

    goto :goto_4

    :cond_6
    move v12, v2

    :goto_4
    iget-object v13, v4, Ln/d;->y:Ln/c;

    iget-object v13, v13, Ln/c;->d:Ln/c;

    if-eqz v13, :cond_7

    move v13, v8

    goto :goto_5

    :cond_7
    move v13, v2

    :goto_5
    iget-object v14, v4, Ln/d;->z:Ln/c;

    iget-object v14, v14, Ln/c;->d:Ln/c;

    if-eqz v14, :cond_8

    move v14, v8

    goto :goto_6

    :cond_8
    move v14, v2

    :goto_6
    iget-object v15, v4, Ln/d;->A:Ln/c;

    iget-object v15, v15, Ln/c;->d:Ln/c;

    if-eqz v15, :cond_9

    move v15, v8

    goto :goto_7

    :cond_9
    move v15, v2

    :goto_7
    iget v3, v4, Ln/d;->M:I

    if-eqz v12, :cond_12

    if-eqz v13, :cond_12

    if-eqz v14, :cond_12

    if-eqz v15, :cond_12

    iget v4, v4, Ln/d;->L:F

    iget-boolean v10, v11, Lo/f;->j:Z

    sget-object v12, Lo/j;->k:[I

    if-eqz v10, :cond_c

    iget-boolean v10, v9, Lo/f;->j:Z

    if-eqz v10, :cond_c

    iget-boolean v7, v5, Lo/f;->c:Z

    if-eqz v7, :cond_b

    iget-boolean v7, v6, Lo/f;->c:Z

    if-nez v7, :cond_a

    goto :goto_8

    :cond_a
    iget-object v7, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo/f;

    iget v7, v7, Lo/f;->g:I

    iget v5, v5, Lo/f;->f:I

    add-int v17, v7, v5

    iget-object v5, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/f;

    iget v5, v5, Lo/f;->g:I

    iget v6, v6, Lo/f;->f:I

    sub-int v18, v5, v6

    iget v5, v11, Lo/f;->g:I

    iget v6, v11, Lo/f;->f:I

    add-int v19, v5, v6

    iget v5, v9, Lo/f;->g:I

    iget v6, v9, Lo/f;->f:I

    sub-int v20, v5, v6

    move-object/from16 v16, v12

    move/from16 v21, v4

    move/from16 v22, v3

    invoke-static/range {v16 .. v22}, Lo/j;->m([IIIIIFI)V

    aget v2, v12, v2

    invoke-virtual {v1, v2}, Lo/g;->d(I)V

    iget-object v1, v0, Lo/m;->b:Ln/d;

    iget-object v1, v1, Ln/d;->e:Lo/l;

    iget-object v1, v1, Lo/m;->e:Lo/g;

    aget v2, v12, v8

    invoke-virtual {v1, v2}, Lo/g;->d(I)V

    :cond_b
    :goto_8
    return-void

    :cond_c
    iget-boolean v10, v5, Lo/f;->j:Z

    iget-object v13, v11, Lo/f;->l:Ljava/util/ArrayList;

    if-eqz v10, :cond_f

    iget-boolean v10, v6, Lo/f;->j:Z

    if-eqz v10, :cond_f

    iget-boolean v10, v11, Lo/f;->c:Z

    if-eqz v10, :cond_e

    iget-boolean v10, v9, Lo/f;->c:Z

    if-nez v10, :cond_d

    goto :goto_9

    :cond_d
    iget v10, v5, Lo/f;->g:I

    iget v14, v5, Lo/f;->f:I

    add-int v17, v10, v14

    iget v10, v6, Lo/f;->g:I

    iget v14, v6, Lo/f;->f:I

    sub-int v18, v10, v14

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/f;

    iget v10, v10, Lo/f;->g:I

    iget v14, v11, Lo/f;->f:I

    add-int v19, v10, v14

    iget-object v10, v9, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/f;

    iget v10, v10, Lo/f;->g:I

    iget v14, v9, Lo/f;->f:I

    sub-int v20, v10, v14

    move-object/from16 v16, v12

    move/from16 v21, v4

    move/from16 v22, v3

    invoke-static/range {v16 .. v22}, Lo/j;->m([IIIIIFI)V

    aget v10, v12, v2

    invoke-virtual {v1, v10}, Lo/g;->d(I)V

    iget-object v10, v0, Lo/m;->b:Ln/d;

    iget-object v10, v10, Ln/d;->e:Lo/l;

    iget-object v10, v10, Lo/m;->e:Lo/g;

    aget v14, v12, v8

    invoke-virtual {v10, v14}, Lo/g;->d(I)V

    goto :goto_a

    :cond_e
    :goto_9
    return-void

    :cond_f
    :goto_a
    iget-boolean v10, v5, Lo/f;->c:Z

    if-eqz v10, :cond_11

    iget-boolean v10, v6, Lo/f;->c:Z

    if-eqz v10, :cond_11

    iget-boolean v10, v11, Lo/f;->c:Z

    if-eqz v10, :cond_11

    iget-boolean v10, v9, Lo/f;->c:Z

    if-nez v10, :cond_10

    goto :goto_b

    :cond_10
    iget-object v10, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/f;

    iget v10, v10, Lo/f;->g:I

    iget v14, v5, Lo/f;->f:I

    add-int v17, v10, v14

    iget-object v10, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/f;

    iget v10, v10, Lo/f;->g:I

    iget v14, v6, Lo/f;->f:I

    sub-int v18, v10, v14

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/f;

    iget v10, v10, Lo/f;->g:I

    iget v11, v11, Lo/f;->f:I

    add-int v19, v10, v11

    iget-object v10, v9, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/f;

    iget v10, v10, Lo/f;->g:I

    iget v9, v9, Lo/f;->f:I

    sub-int v20, v10, v9

    move-object/from16 v16, v12

    move/from16 v21, v4

    move/from16 v22, v3

    invoke-static/range {v16 .. v22}, Lo/j;->m([IIIIIFI)V

    aget v3, v12, v2

    invoke-virtual {v1, v3}, Lo/g;->d(I)V

    iget-object v3, v0, Lo/m;->b:Ln/d;

    iget-object v3, v3, Ln/d;->e:Lo/l;

    iget-object v3, v3, Lo/m;->e:Lo/g;

    aget v4, v12, v8

    invoke-virtual {v3, v4}, Lo/g;->d(I)V

    goto/16 :goto_e

    :cond_11
    :goto_b
    return-void

    :cond_12
    if-eqz v12, :cond_19

    if-eqz v14, :cond_19

    iget-boolean v9, v5, Lo/f;->c:Z

    if-eqz v9, :cond_18

    iget-boolean v9, v6, Lo/f;->c:Z

    if-nez v9, :cond_13

    goto :goto_c

    :cond_13
    iget v4, v4, Ln/d;->L:F

    iget-object v9, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo/f;

    iget v9, v9, Lo/f;->g:I

    iget v11, v5, Lo/f;->f:I

    add-int/2addr v9, v11

    iget-object v11, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo/f;

    iget v11, v11, Lo/f;->g:I

    iget v12, v6, Lo/f;->f:I

    sub-int/2addr v11, v12

    if-eq v3, v10, :cond_16

    if-eqz v3, :cond_16

    if-eq v3, v8, :cond_14

    goto/16 :goto_e

    :cond_14
    sub-int/2addr v11, v9

    invoke-virtual {v0, v11, v2}, Lo/m;->g(II)I

    move-result v3

    int-to-float v9, v3

    div-float/2addr v9, v4

    add-float/2addr v9, v7

    float-to-int v9, v9

    invoke-virtual {v0, v9, v8}, Lo/m;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_15

    int-to-float v3, v10

    mul-float/2addr v3, v4

    add-float/2addr v3, v7

    float-to-int v3, v3

    :cond_15
    invoke-virtual {v1, v3}, Lo/g;->d(I)V

    iget-object v3, v0, Lo/m;->b:Ln/d;

    iget-object v3, v3, Ln/d;->e:Lo/l;

    iget-object v3, v3, Lo/m;->e:Lo/g;

    invoke-virtual {v3, v10}, Lo/g;->d(I)V

    goto/16 :goto_e

    :cond_16
    sub-int/2addr v11, v9

    invoke-virtual {v0, v11, v2}, Lo/m;->g(II)I

    move-result v3

    int-to-float v9, v3

    mul-float/2addr v9, v4

    add-float/2addr v9, v7

    float-to-int v9, v9

    invoke-virtual {v0, v9, v8}, Lo/m;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_17

    int-to-float v3, v10

    div-float/2addr v3, v4

    add-float/2addr v3, v7

    float-to-int v3, v3

    :cond_17
    invoke-virtual {v1, v3}, Lo/g;->d(I)V

    iget-object v3, v0, Lo/m;->b:Ln/d;

    iget-object v3, v3, Ln/d;->e:Lo/l;

    iget-object v3, v3, Lo/m;->e:Lo/g;

    invoke-virtual {v3, v10}, Lo/g;->d(I)V

    goto/16 :goto_e

    :cond_18
    :goto_c
    return-void

    :cond_19
    if-eqz v13, :cond_21

    if-eqz v15, :cond_21

    iget-boolean v12, v11, Lo/f;->c:Z

    if-eqz v12, :cond_1f

    iget-boolean v12, v9, Lo/f;->c:Z

    if-nez v12, :cond_1a

    goto :goto_d

    :cond_1a
    iget v4, v4, Ln/d;->L:F

    iget-object v12, v11, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/f;

    iget v12, v12, Lo/f;->g:I

    iget v11, v11, Lo/f;->f:I

    add-int/2addr v12, v11

    iget-object v11, v9, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo/f;

    iget v11, v11, Lo/f;->g:I

    iget v9, v9, Lo/f;->f:I

    sub-int/2addr v11, v9

    if-eq v3, v10, :cond_1d

    if-eqz v3, :cond_1b

    if-eq v3, v8, :cond_1d

    goto :goto_e

    :cond_1b
    sub-int/2addr v11, v12

    invoke-virtual {v0, v11, v8}, Lo/m;->g(II)I

    move-result v3

    int-to-float v9, v3

    mul-float/2addr v9, v4

    add-float/2addr v9, v7

    float-to-int v9, v9

    invoke-virtual {v0, v9, v2}, Lo/m;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_1c

    int-to-float v3, v10

    div-float/2addr v3, v4

    add-float/2addr v3, v7

    float-to-int v3, v3

    :cond_1c
    invoke-virtual {v1, v10}, Lo/g;->d(I)V

    iget-object v4, v0, Lo/m;->b:Ln/d;

    iget-object v4, v4, Ln/d;->e:Lo/l;

    iget-object v4, v4, Lo/m;->e:Lo/g;

    invoke-virtual {v4, v3}, Lo/g;->d(I)V

    goto :goto_e

    :cond_1d
    sub-int/2addr v11, v12

    invoke-virtual {v0, v11, v8}, Lo/m;->g(II)I

    move-result v3

    int-to-float v9, v3

    div-float/2addr v9, v4

    add-float/2addr v9, v7

    float-to-int v9, v9

    invoke-virtual {v0, v9, v2}, Lo/m;->g(II)I

    move-result v10

    if-eq v9, v10, :cond_1e

    int-to-float v3, v10

    mul-float/2addr v3, v4

    add-float/2addr v3, v7

    float-to-int v3, v3

    :cond_1e
    invoke-virtual {v1, v10}, Lo/g;->d(I)V

    iget-object v4, v0, Lo/m;->b:Ln/d;

    iget-object v4, v4, Ln/d;->e:Lo/l;

    iget-object v4, v4, Lo/m;->e:Lo/g;

    invoke-virtual {v4, v3}, Lo/g;->d(I)V

    goto :goto_e

    :cond_1f
    :goto_d
    return-void

    :cond_20
    iget-object v3, v4, Ln/d;->I:Ln/d;

    if-eqz v3, :cond_21

    iget-object v3, v3, Ln/d;->d:Lo/j;

    iget-object v3, v3, Lo/m;->e:Lo/g;

    iget-boolean v9, v3, Lo/f;->j:Z

    if-eqz v9, :cond_21

    iget v4, v4, Ln/d;->o:F

    iget v3, v3, Lo/f;->g:I

    int-to-float v3, v3

    mul-float/2addr v3, v4

    add-float/2addr v3, v7

    float-to-int v3, v3

    invoke-virtual {v1, v3}, Lo/g;->d(I)V

    :cond_21
    :goto_e
    iget-boolean v3, v5, Lo/f;->c:Z

    if-eqz v3, :cond_29

    iget-boolean v3, v6, Lo/f;->c:Z

    if-nez v3, :cond_22

    goto/16 :goto_10

    :cond_22
    iget-boolean v3, v5, Lo/f;->j:Z

    if-eqz v3, :cond_23

    iget-boolean v3, v6, Lo/f;->j:Z

    if-eqz v3, :cond_23

    iget-boolean v3, v1, Lo/f;->j:Z

    if-eqz v3, :cond_23

    return-void

    :cond_23
    iget-boolean v3, v1, Lo/f;->j:Z

    if-nez v3, :cond_24

    iget v3, v0, Lo/m;->d:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_24

    iget-object v3, v0, Lo/m;->b:Ln/d;

    iget v4, v3, Ln/d;->j:I

    if-nez v4, :cond_24

    invoke-virtual {v3}, Ln/d;->q()Z

    move-result v3

    if-nez v3, :cond_24

    iget-object v3, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/f;

    iget-object v4, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/f;

    iget v3, v3, Lo/f;->g:I

    iget v4, v5, Lo/f;->f:I

    add-int/2addr v3, v4

    iget v2, v2, Lo/f;->g:I

    iget v4, v6, Lo/f;->f:I

    add-int/2addr v2, v4

    sub-int v4, v2, v3

    invoke-virtual {v5, v3}, Lo/f;->d(I)V

    invoke-virtual {v6, v2}, Lo/f;->d(I)V

    invoke-virtual {v1, v4}, Lo/g;->d(I)V

    return-void

    :cond_24
    iget-boolean v3, v1, Lo/f;->j:Z

    if-nez v3, :cond_26

    iget v3, v0, Lo/m;->d:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_26

    iget v3, v0, Lo/m;->a:I

    if-ne v3, v8, :cond_26

    iget-object v3, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_26

    iget-object v3, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_26

    iget-object v3, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/f;

    iget-object v4, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/f;

    iget v3, v3, Lo/f;->g:I

    iget v8, v5, Lo/f;->f:I

    add-int/2addr v3, v8

    iget v4, v4, Lo/f;->g:I

    iget v8, v6, Lo/f;->f:I

    add-int/2addr v4, v8

    sub-int/2addr v4, v3

    iget v3, v1, Lo/g;->m:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, v0, Lo/m;->b:Ln/d;

    iget v8, v4, Ln/d;->n:I

    iget v4, v4, Ln/d;->m:I

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-lez v8, :cond_25

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_25
    invoke-virtual {v1, v3}, Lo/g;->d(I)V

    :cond_26
    iget-boolean v3, v1, Lo/f;->j:Z

    if-nez v3, :cond_27

    return-void

    :cond_27
    iget-object v3, v5, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/f;

    iget-object v4, v6, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/f;

    iget v4, v3, Lo/f;->g:I

    iget v8, v5, Lo/f;->f:I

    add-int/2addr v8, v4

    iget v9, v2, Lo/f;->g:I

    iget v10, v6, Lo/f;->f:I

    add-int/2addr v10, v9

    iget-object v11, v0, Lo/m;->b:Ln/d;

    iget v11, v11, Ln/d;->S:F

    if-ne v3, v2, :cond_28

    move v11, v7

    goto :goto_f

    :cond_28
    move v4, v8

    move v9, v10

    :goto_f
    sub-int/2addr v9, v4

    iget v2, v1, Lo/f;->g:I

    sub-int/2addr v9, v2

    int-to-float v2, v4

    add-float/2addr v2, v7

    int-to-float v3, v9

    mul-float/2addr v3, v11

    add-float/2addr v3, v2

    float-to-int v2, v3

    invoke-virtual {v5, v2}, Lo/f;->d(I)V

    iget v2, v5, Lo/f;->g:I

    iget v1, v1, Lo/f;->g:I

    add-int/2addr v2, v1

    invoke-virtual {v6, v2}, Lo/f;->d(I)V

    :cond_29
    :goto_10
    return-void

    :cond_2a
    iget-object v1, v0, Lo/m;->b:Ln/d;

    iget-object v3, v1, Ln/d;->x:Ln/c;

    iget-object v1, v1, Ln/d;->z:Ln/c;

    invoke-virtual {v0, v3, v1, v2}, Lo/m;->l(Ln/c;Ln/c;I)V

    return-void
.end method

.method public final d()V
    .locals 11

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-boolean v1, v0, Ln/d;->a:Z

    iget-object v2, p0, Lo/m;->e:Lo/g;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ln/d;->l()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/g;->d(I)V

    :cond_0
    iget-boolean v0, v2, Lo/f;->j:Z

    iget-object v1, p0, Lo/m;->i:Lo/f;

    iget-object v3, p0, Lo/m;->h:Lo/f;

    const/4 v4, 0x1

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v8, v0, Ln/d;->c0:[I

    aget v8, v8, v7

    iput v8, p0, Lo/m;->d:I

    if-eq v8, v5, :cond_7

    if-ne v8, v6, :cond_3

    iget-object v9, v0, Ln/d;->I:Ln/d;

    if-eqz v9, :cond_1

    iget-object v10, v9, Ln/d;->c0:[I

    aget v10, v10, v7

    if-eq v10, v4, :cond_2

    :cond_1
    iget-object v10, v9, Ln/d;->c0:[I

    aget v10, v10, v7

    if-ne v10, v6, :cond_3

    :cond_2
    invoke-virtual {v9}, Ln/d;->l()I

    move-result v0

    iget-object v4, p0, Lo/m;->b:Ln/d;

    iget-object v4, v4, Ln/d;->x:Ln/c;

    invoke-virtual {v4}, Ln/c;->c()I

    move-result v4

    sub-int/2addr v0, v4

    iget-object v4, p0, Lo/m;->b:Ln/d;

    iget-object v4, v4, Ln/d;->z:Ln/c;

    invoke-virtual {v4}, Ln/c;->c()I

    move-result v4

    sub-int/2addr v0, v4

    iget-object v4, v9, Ln/d;->d:Lo/j;

    iget-object v5, v4, Lo/m;->h:Lo/f;

    iget-object v6, p0, Lo/m;->b:Ln/d;

    iget-object v6, v6, Ln/d;->x:Ln/c;

    invoke-virtual {v6}, Ln/c;->c()I

    move-result v6

    invoke-static {v3, v5, v6}, Lo/m;->b(Lo/f;Lo/f;I)V

    iget-object v3, v4, Lo/m;->i:Lo/f;

    iget-object v4, p0, Lo/m;->b:Ln/d;

    iget-object v4, v4, Ln/d;->z:Ln/c;

    invoke-virtual {v4}, Ln/c;->c()I

    move-result v4

    neg-int v4, v4

    invoke-static {v1, v3, v4}, Lo/m;->b(Lo/f;Lo/f;I)V

    invoke-virtual {v2, v0}, Lo/g;->d(I)V

    return-void

    :cond_3
    if-ne v8, v4, :cond_7

    invoke-virtual {v0}, Ln/d;->l()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/g;->d(I)V

    goto :goto_0

    :cond_4
    iget v0, p0, Lo/m;->d:I

    if-ne v0, v6, :cond_7

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v8, v0, Ln/d;->I:Ln/d;

    if-eqz v8, :cond_5

    iget-object v9, v8, Ln/d;->c0:[I

    aget v9, v9, v7

    if-eq v9, v4, :cond_6

    :cond_5
    iget-object v9, v8, Ln/d;->c0:[I

    aget v9, v9, v7

    if-ne v9, v6, :cond_7

    :cond_6
    iget-object v2, v8, Ln/d;->d:Lo/j;

    iget-object v2, v2, Lo/m;->h:Lo/f;

    iget-object v0, v0, Ln/d;->x:Ln/c;

    invoke-virtual {v0}, Ln/c;->c()I

    move-result v0

    invoke-static {v3, v2, v0}, Lo/m;->b(Lo/f;Lo/f;I)V

    iget-object v0, v8, Ln/d;->d:Lo/j;

    iget-object v0, v0, Lo/m;->i:Lo/f;

    iget-object v2, p0, Lo/m;->b:Ln/d;

    iget-object v2, v2, Ln/d;->z:Ln/c;

    invoke-virtual {v2}, Ln/c;->c()I

    move-result v2

    neg-int v2, v2

    invoke-static {v1, v0, v2}, Lo/m;->b(Lo/f;Lo/f;I)V

    return-void

    :cond_7
    :goto_0
    iget-boolean v0, v2, Lo/f;->j:Z

    if-eqz v0, :cond_e

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-boolean v8, v0, Ln/d;->a:Z

    if-eqz v8, :cond_e

    iget-object v5, v0, Ln/d;->F:[Ln/c;

    aget-object v6, v5, v7

    iget-object v8, v6, Ln/c;->d:Ln/c;

    if-eqz v8, :cond_b

    aget-object v9, v5, v4

    iget-object v9, v9, Ln/c;->d:Ln/c;

    if-eqz v9, :cond_b

    invoke-virtual {v0}, Ln/d;->q()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Ln/c;->c()I

    move-result v0

    iput v0, v3, Lo/f;->f:I

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ln/c;->c()I

    move-result v0

    neg-int v0, v0

    iput v0, v1, Lo/f;->f:I

    goto/16 :goto_2

    :cond_8
    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v7

    invoke-static {v0}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v2, p0, Lo/m;->b:Ln/d;

    iget-object v2, v2, Ln/d;->F:[Ln/c;

    aget-object v2, v2, v7

    invoke-virtual {v2}, Ln/c;->c()I

    move-result v2

    invoke-static {v3, v0, v2}, Lo/m;->b(Lo/f;Lo/f;I)V

    :cond_9
    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v4

    invoke-static {v0}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v2, p0, Lo/m;->b:Ln/d;

    iget-object v2, v2, Ln/d;->F:[Ln/c;

    aget-object v2, v2, v4

    invoke-virtual {v2}, Ln/c;->c()I

    move-result v2

    neg-int v2, v2

    invoke-static {v1, v0, v2}, Lo/m;->b(Lo/f;Lo/f;I)V

    :cond_a
    iput-boolean v4, v3, Lo/f;->b:Z

    iput-boolean v4, v1, Lo/f;->b:Z

    goto/16 :goto_2

    :cond_b
    if-eqz v8, :cond_c

    invoke-static {v6}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v4, p0, Lo/m;->b:Ln/d;

    iget-object v4, v4, Ln/d;->F:[Ln/c;

    aget-object v4, v4, v7

    invoke-virtual {v4}, Ln/c;->c()I

    move-result v4

    invoke-static {v3, v0, v4}, Lo/m;->b(Lo/f;Lo/f;I)V

    iget v0, v2, Lo/f;->g:I

    invoke-static {v1, v3, v0}, Lo/m;->b(Lo/f;Lo/f;I)V

    goto/16 :goto_2

    :cond_c
    aget-object v5, v5, v4

    iget-object v6, v5, Ln/c;->d:Ln/c;

    if-eqz v6, :cond_d

    invoke-static {v5}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v5, p0, Lo/m;->b:Ln/d;

    iget-object v5, v5, Ln/d;->F:[Ln/c;

    aget-object v4, v5, v4

    invoke-virtual {v4}, Ln/c;->c()I

    move-result v4

    neg-int v4, v4

    invoke-static {v1, v0, v4}, Lo/m;->b(Lo/f;Lo/f;I)V

    iget v0, v2, Lo/f;->g:I

    neg-int v0, v0

    invoke-static {v3, v1, v0}, Lo/m;->b(Lo/f;Lo/f;I)V

    goto/16 :goto_2

    :cond_d
    instance-of v4, v0, Ln/i;

    if-nez v4, :cond_1a

    iget-object v4, v0, Ln/d;->I:Ln/d;

    if-eqz v4, :cond_1a

    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Ln/d;->g(I)Ln/c;

    move-result-object v0

    iget-object v0, v0, Ln/c;->d:Ln/c;

    if-nez v0, :cond_1a

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v4, v0, Ln/d;->I:Ln/d;

    iget-object v4, v4, Ln/d;->d:Lo/j;

    iget-object v4, v4, Lo/m;->h:Lo/f;

    invoke-virtual {v0}, Ln/d;->m()I

    move-result v0

    invoke-static {v3, v4, v0}, Lo/m;->b(Lo/f;Lo/f;I)V

    iget v0, v2, Lo/f;->g:I

    invoke-static {v1, v3, v0}, Lo/m;->b(Lo/f;Lo/f;I)V

    goto/16 :goto_2

    :cond_e
    iget v0, p0, Lo/m;->d:I

    if-ne v0, v5, :cond_15

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget v8, v0, Ln/d;->j:I

    const/4 v9, 0x2

    if-eq v8, v9, :cond_13

    if-eq v8, v5, :cond_f

    goto/16 :goto_1

    :cond_f
    iget v8, v0, Ln/d;->k:I

    if-ne v8, v5, :cond_12

    iput-object p0, v3, Lo/f;->a:Lo/m;

    iput-object p0, v1, Lo/f;->a:Lo/m;

    iget-object v5, v0, Ln/d;->e:Lo/l;

    iget-object v8, v5, Lo/m;->h:Lo/f;

    iput-object p0, v8, Lo/f;->a:Lo/m;

    iget-object v5, v5, Lo/m;->i:Lo/f;

    iput-object p0, v5, Lo/f;->a:Lo/m;

    iput-object p0, v2, Lo/f;->a:Lo/m;

    invoke-virtual {v0}, Ln/d;->r()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v2, Lo/f;->l:Ljava/util/ArrayList;

    iget-object v5, p0, Lo/m;->b:Ln/d;

    iget-object v5, v5, Ln/d;->e:Lo/l;

    iget-object v5, v5, Lo/m;->e:Lo/g;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->e:Lo/g;

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v5, v0, Lo/m;->e:Lo/g;

    iput-object p0, v5, Lo/f;->a:Lo/m;

    iget-object v5, v2, Lo/f;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lo/m;->h:Lo/f;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Lo/f;->l:Ljava/util/ArrayList;

    iget-object v5, p0, Lo/m;->b:Ln/d;

    iget-object v5, v5, Ln/d;->e:Lo/l;

    iget-object v5, v5, Lo/m;->i:Lo/f;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->h:Lo/f;

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->i:Lo/f;

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_10
    iget-object v0, p0, Lo/m;->b:Ln/d;

    invoke-virtual {v0}, Ln/d;->q()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->e:Lo/g;

    iget-object v0, v0, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Lo/f;->k:Ljava/util/ArrayList;

    iget-object v5, p0, Lo/m;->b:Ln/d;

    iget-object v5, v5, Ln/d;->e:Lo/l;

    iget-object v5, v5, Lo/m;->e:Lo/g;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->e:Lo/g;

    iget-object v0, v0, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_12
    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->e:Lo/g;

    iget-object v5, v2, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->h:Lo/f;

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->i:Lo/f;

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v4, v2, Lo/f;->b:Z

    iget-object v0, v2, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v3, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_13
    iget-object v0, v0, Ln/d;->I:Ln/d;

    if-nez v0, :cond_14

    goto :goto_1

    :cond_14
    iget-object v0, v0, Ln/d;->e:Lo/l;

    iget-object v0, v0, Lo/m;->e:Lo/g;

    iget-object v5, v2, Lo/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v4, v2, Lo/f;->b:Z

    iget-object v0, v2, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, Lo/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_1
    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v5, v0, Ln/d;->F:[Ln/c;

    aget-object v8, v5, v7

    iget-object v9, v8, Ln/c;->d:Ln/c;

    if-eqz v9, :cond_17

    aget-object v10, v5, v4

    iget-object v10, v10, Ln/c;->d:Ln/c;

    if-eqz v10, :cond_17

    invoke-virtual {v0}, Ln/d;->q()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Ln/c;->c()I

    move-result v0

    iput v0, v3, Lo/f;->f:I

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ln/c;->c()I

    move-result v0

    neg-int v0, v0

    iput v0, v1, Lo/f;->f:I

    goto :goto_2

    :cond_16
    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget-object v0, v0, Ln/d;->F:[Ln/c;

    aget-object v0, v0, v7

    invoke-static {v0}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    iget-object v1, p0, Lo/m;->b:Ln/d;

    iget-object v1, v1, Ln/d;->F:[Ln/c;

    aget-object v1, v1, v4

    invoke-static {v1}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v1

    invoke-virtual {v0, p0}, Lo/f;->b(Lo/d;)V

    invoke-virtual {v1, p0}, Lo/f;->b(Lo/d;)V

    iput v6, p0, Lo/m;->j:I

    goto :goto_2

    :cond_17
    if-eqz v9, :cond_18

    invoke-static {v8}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v5, p0, Lo/m;->b:Ln/d;

    iget-object v5, v5, Ln/d;->F:[Ln/c;

    aget-object v5, v5, v7

    invoke-virtual {v5}, Ln/c;->c()I

    move-result v5

    invoke-static {v3, v0, v5}, Lo/m;->b(Lo/f;Lo/f;I)V

    invoke-virtual {p0, v1, v3, v4, v2}, Lo/m;->c(Lo/f;Lo/f;ILo/g;)V

    goto :goto_2

    :cond_18
    aget-object v5, v5, v4

    iget-object v6, v5, Ln/c;->d:Ln/c;

    if-eqz v6, :cond_19

    invoke-static {v5}, Lo/m;->h(Ln/c;)Lo/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v5, p0, Lo/m;->b:Ln/d;

    iget-object v5, v5, Ln/d;->F:[Ln/c;

    aget-object v4, v5, v4

    invoke-virtual {v4}, Ln/c;->c()I

    move-result v4

    neg-int v4, v4

    invoke-static {v1, v0, v4}, Lo/m;->b(Lo/f;Lo/f;I)V

    const/4 v0, -0x1

    invoke-virtual {p0, v3, v1, v0, v2}, Lo/m;->c(Lo/f;Lo/f;ILo/g;)V

    goto :goto_2

    :cond_19
    instance-of v5, v0, Ln/i;

    if-nez v5, :cond_1a

    iget-object v5, v0, Ln/d;->I:Ln/d;

    if-eqz v5, :cond_1a

    iget-object v5, v5, Ln/d;->d:Lo/j;

    iget-object v5, v5, Lo/m;->h:Lo/f;

    invoke-virtual {v0}, Ln/d;->m()I

    move-result v0

    invoke-static {v3, v5, v0}, Lo/m;->b(Lo/f;Lo/f;I)V

    invoke-virtual {p0, v1, v3, v4, v2}, Lo/m;->c(Lo/f;Lo/f;ILo/g;)V

    :cond_1a
    :goto_2
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lo/m;->h:Lo/f;

    iget-boolean v1, v0, Lo/f;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lo/m;->b:Ln/d;

    iget v0, v0, Lo/f;->g:I

    iput v0, v1, Ln/d;->N:I

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lo/m;->c:Lo/k;

    iget-object v0, p0, Lo/m;->h:Lo/f;

    invoke-virtual {v0}, Lo/f;->c()V

    iget-object v0, p0, Lo/m;->i:Lo/f;

    invoke-virtual {v0}, Lo/f;->c()V

    iget-object v0, p0, Lo/m;->e:Lo/g;

    invoke-virtual {v0}, Lo/f;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/m;->g:Z

    return-void
.end method

.method public final k()Z
    .locals 3

    iget v0, p0, Lo/m;->d:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/m;->b:Ln/d;

    iget v0, v0, Ln/d;->j:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final n()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/m;->g:Z

    iget-object v1, p0, Lo/m;->h:Lo/f;

    invoke-virtual {v1}, Lo/f;->c()V

    iput-boolean v0, v1, Lo/f;->j:Z

    iget-object v1, p0, Lo/m;->i:Lo/f;

    invoke-virtual {v1}, Lo/f;->c()V

    iput-boolean v0, v1, Lo/f;->j:Z

    iget-object v1, p0, Lo/m;->e:Lo/g;

    iput-boolean v0, v1, Lo/f;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HorizontalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/m;->b:Ln/d;

    iget-object v1, v1, Ln/d;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
