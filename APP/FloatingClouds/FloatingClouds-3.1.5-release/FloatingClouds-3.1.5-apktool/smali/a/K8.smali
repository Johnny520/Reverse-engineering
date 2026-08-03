.class public final La/K8;
.super La/ih;
.source "SourceFile"


# static fields
.field public static final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, La/K8;->k:[I

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
.method public final a(La/T4;)V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, La/ih;->j:La/ih$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-eq v1, v3, :cond_26

    iget-object v1, v0, La/ih;->e:La/l5;

    iget-boolean v4, v1, La/V4;->j:Z

    sget-object v5, La/N3$a;->c:La/N3$a;

    iget-object v6, v0, La/ih;->h:La/V4;

    iget-object v7, v0, La/ih;->i:La/V4;

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, 0x1

    if-nez v4, :cond_0

    iget-object v4, v0, La/ih;->d:La/N3$a;

    if-ne v4, v5, :cond_0

    iget-object v4, v0, La/ih;->b:La/N3;

    iget v10, v4, La/N3;->j:I

    const/4 v11, 0x2

    if-eq v10, v11, :cond_1c

    if-eq v10, v3, :cond_1

    :cond_0
    :goto_0
    move/from16 p1, v8

    goto/16 :goto_a

    :cond_1
    iget v10, v4, La/N3;->k:I

    const/4 v11, -0x1

    if-eqz v10, :cond_6

    if-ne v10, v3, :cond_2

    goto :goto_4

    :cond_2
    iget v3, v4, La/N3;->O:I

    if-eq v3, v11, :cond_5

    if-eqz v3, :cond_4

    if-eq v3, v9, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    iget-object v3, v4, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    iget v3, v3, La/V4;->g:I

    int-to-float v3, v3

    iget v4, v4, La/N3;->N:F

    :goto_1
    mul-float/2addr v3, v4

    :goto_2
    add-float/2addr v3, v8

    float-to-int v3, v3

    goto :goto_3

    :cond_4
    iget-object v3, v4, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    iget v3, v3, La/V4;->g:I

    int-to-float v3, v3

    iget v4, v4, La/N3;->N:F

    div-float/2addr v3, v4

    goto :goto_2

    :cond_5
    iget-object v3, v4, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    iget v3, v3, La/V4;->g:I

    int-to-float v3, v3

    iget v4, v4, La/N3;->N:F

    goto :goto_1

    :goto_3
    invoke-virtual {v1, v3}, La/l5;->d(I)V

    goto :goto_0

    :cond_6
    :goto_4
    iget-object v3, v4, La/N3;->e:La/og;

    iget-object v10, v3, La/ih;->h:La/V4;

    iget-object v3, v3, La/ih;->i:La/V4;

    iget-object v12, v4, La/N3;->y:La/M3;

    iget-object v12, v12, La/M3;->d:La/M3;

    if-eqz v12, :cond_7

    move v12, v9

    goto :goto_5

    :cond_7
    move v12, v2

    :goto_5
    iget-object v13, v4, La/N3;->z:La/M3;

    iget-object v13, v13, La/M3;->d:La/M3;

    if-eqz v13, :cond_8

    move v13, v9

    goto :goto_6

    :cond_8
    move v13, v2

    :goto_6
    iget-object v14, v4, La/N3;->A:La/M3;

    iget-object v14, v14, La/M3;->d:La/M3;

    if-eqz v14, :cond_9

    move v14, v9

    goto :goto_7

    :cond_9
    move v14, v2

    :goto_7
    iget-object v15, v4, La/N3;->B:La/M3;

    iget-object v15, v15, La/M3;->d:La/M3;

    if-eqz v15, :cond_a

    move v15, v9

    :goto_8
    move/from16 p1, v8

    goto :goto_9

    :cond_a
    move v15, v2

    goto :goto_8

    :goto_9
    iget v8, v4, La/N3;->O:I

    if-eqz v12, :cond_10

    if-eqz v13, :cond_10

    if-eqz v14, :cond_10

    if-eqz v15, :cond_10

    iget v4, v4, La/N3;->N:F

    iget-boolean v11, v10, La/V4;->j:Z

    sget-object v16, La/K8;->k:[I

    if-eqz v11, :cond_c

    iget-boolean v11, v3, La/V4;->j:Z

    if-eqz v11, :cond_c

    iget-boolean v5, v6, La/V4;->c:Z

    if-eqz v5, :cond_25

    iget-boolean v5, v7, La/V4;->c:Z

    if-nez v5, :cond_b

    goto/16 :goto_c

    :cond_b
    iget-object v5, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/V4;

    iget v5, v5, La/V4;->g:I

    iget v6, v6, La/V4;->f:I

    add-int v17, v5, v6

    iget-object v5, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/V4;

    iget v5, v5, La/V4;->g:I

    iget v6, v7, La/V4;->f:I

    sub-int v18, v5, v6

    iget v5, v10, La/V4;->g:I

    iget v6, v10, La/V4;->f:I

    add-int v19, v5, v6

    iget v5, v3, La/V4;->g:I

    iget v3, v3, La/V4;->f:I

    sub-int v20, v5, v3

    move/from16 v21, v4

    move/from16 v22, v8

    invoke-static/range {v16 .. v22}, La/K8;->m([IIIIIFI)V

    aget v2, v16, v2

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    iget-object v1, v0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->e:La/og;

    iget-object v1, v1, La/ih;->e:La/l5;

    aget v2, v16, v9

    invoke-virtual {v1, v2}, La/l5;->d(I)V

    return-void

    :cond_c
    move/from16 v21, v4

    move/from16 v22, v8

    iget-boolean v4, v6, La/V4;->j:Z

    iget-object v8, v10, La/V4;->l:Ljava/util/ArrayList;

    if-eqz v4, :cond_e

    iget-boolean v4, v7, La/V4;->j:Z

    if-eqz v4, :cond_e

    iget-boolean v4, v10, La/V4;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v3, La/V4;->c:Z

    if-nez v4, :cond_d

    goto/16 :goto_c

    :cond_d
    iget v4, v6, La/V4;->g:I

    iget v11, v6, La/V4;->f:I

    add-int v17, v4, v11

    iget v4, v7, La/V4;->g:I

    iget v11, v7, La/V4;->f:I

    sub-int v18, v4, v11

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v11, v10, La/V4;->f:I

    add-int v19, v4, v11

    iget-object v4, v3, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v11, v3, La/V4;->f:I

    sub-int v20, v4, v11

    invoke-static/range {v16 .. v22}, La/K8;->m([IIIIIFI)V

    aget v4, v16, v2

    invoke-virtual {v1, v4}, La/l5;->d(I)V

    iget-object v4, v0, La/ih;->b:La/N3;

    iget-object v4, v4, La/N3;->e:La/og;

    iget-object v4, v4, La/ih;->e:La/l5;

    aget v11, v16, v9

    invoke-virtual {v4, v11}, La/l5;->d(I)V

    :cond_e
    iget-boolean v4, v6, La/V4;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v7, La/V4;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v10, La/V4;->c:Z

    if-eqz v4, :cond_25

    iget-boolean v4, v3, La/V4;->c:Z

    if-nez v4, :cond_f

    goto/16 :goto_c

    :cond_f
    iget-object v4, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v11, v6, La/V4;->f:I

    add-int v17, v4, v11

    iget-object v4, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v11, v7, La/V4;->f:I

    sub-int v18, v4, v11

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v8, v10, La/V4;->f:I

    add-int v19, v4, v8

    iget-object v4, v3, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v3, v3, La/V4;->f:I

    sub-int v20, v4, v3

    invoke-static/range {v16 .. v22}, La/K8;->m([IIIIIFI)V

    aget v3, v16, v2

    invoke-virtual {v1, v3}, La/l5;->d(I)V

    iget-object v3, v0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    aget v4, v16, v9

    invoke-virtual {v3, v4}, La/l5;->d(I)V

    goto/16 :goto_a

    :cond_10
    if-eqz v12, :cond_16

    if-eqz v14, :cond_16

    iget-boolean v3, v6, La/V4;->c:Z

    if-eqz v3, :cond_25

    iget-boolean v3, v7, La/V4;->c:Z

    if-nez v3, :cond_11

    goto/16 :goto_c

    :cond_11
    iget v3, v4, La/N3;->N:F

    iget-object v4, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v4, v4, La/V4;->g:I

    iget v10, v6, La/V4;->f:I

    add-int/2addr v4, v10

    iget-object v10, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/V4;

    iget v10, v10, La/V4;->g:I

    iget v12, v7, La/V4;->f:I

    sub-int/2addr v10, v12

    if-eq v8, v11, :cond_14

    if-eqz v8, :cond_14

    if-eq v8, v9, :cond_12

    goto/16 :goto_a

    :cond_12
    sub-int/2addr v10, v4

    invoke-virtual {v0, v10, v2}, La/ih;->g(II)I

    move-result v4

    int-to-float v8, v4

    div-float/2addr v8, v3

    add-float v8, v8, p1

    float-to-int v8, v8

    invoke-virtual {v0, v8, v9}, La/ih;->g(II)I

    move-result v10

    if-eq v8, v10, :cond_13

    int-to-float v4, v10

    mul-float/2addr v4, v3

    add-float v4, v4, p1

    float-to-int v4, v4

    :cond_13
    invoke-virtual {v1, v4}, La/l5;->d(I)V

    iget-object v3, v0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    invoke-virtual {v3, v10}, La/l5;->d(I)V

    goto/16 :goto_a

    :cond_14
    sub-int/2addr v10, v4

    invoke-virtual {v0, v10, v2}, La/ih;->g(II)I

    move-result v4

    int-to-float v8, v4

    mul-float/2addr v8, v3

    add-float v8, v8, p1

    float-to-int v8, v8

    invoke-virtual {v0, v8, v9}, La/ih;->g(II)I

    move-result v10

    if-eq v8, v10, :cond_15

    int-to-float v4, v10

    div-float/2addr v4, v3

    add-float v4, v4, p1

    float-to-int v4, v4

    :cond_15
    invoke-virtual {v1, v4}, La/l5;->d(I)V

    iget-object v3, v0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    invoke-virtual {v3, v10}, La/l5;->d(I)V

    goto/16 :goto_a

    :cond_16
    if-eqz v13, :cond_1d

    if-eqz v15, :cond_1d

    iget-boolean v12, v10, La/V4;->c:Z

    if-eqz v12, :cond_25

    iget-boolean v12, v3, La/V4;->c:Z

    if-nez v12, :cond_17

    goto/16 :goto_c

    :cond_17
    iget v4, v4, La/N3;->N:F

    iget-object v12, v10, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/V4;

    iget v12, v12, La/V4;->g:I

    iget v10, v10, La/V4;->f:I

    add-int/2addr v12, v10

    iget-object v10, v3, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/V4;

    iget v10, v10, La/V4;->g:I

    iget v3, v3, La/V4;->f:I

    sub-int/2addr v10, v3

    if-eq v8, v11, :cond_1a

    if-eqz v8, :cond_18

    if-eq v8, v9, :cond_1a

    goto :goto_a

    :cond_18
    sub-int/2addr v10, v12

    invoke-virtual {v0, v10, v9}, La/ih;->g(II)I

    move-result v3

    int-to-float v8, v3

    mul-float/2addr v8, v4

    add-float v8, v8, p1

    float-to-int v8, v8

    invoke-virtual {v0, v8, v2}, La/ih;->g(II)I

    move-result v10

    if-eq v8, v10, :cond_19

    int-to-float v3, v10

    div-float/2addr v3, v4

    add-float v3, v3, p1

    float-to-int v3, v3

    :cond_19
    invoke-virtual {v1, v10}, La/l5;->d(I)V

    iget-object v4, v0, La/ih;->b:La/N3;

    iget-object v4, v4, La/N3;->e:La/og;

    iget-object v4, v4, La/ih;->e:La/l5;

    invoke-virtual {v4, v3}, La/l5;->d(I)V

    goto :goto_a

    :cond_1a
    sub-int/2addr v10, v12

    invoke-virtual {v0, v10, v9}, La/ih;->g(II)I

    move-result v3

    int-to-float v8, v3

    div-float/2addr v8, v4

    add-float v8, v8, p1

    float-to-int v8, v8

    invoke-virtual {v0, v8, v2}, La/ih;->g(II)I

    move-result v10

    if-eq v8, v10, :cond_1b

    int-to-float v3, v10

    mul-float/2addr v3, v4

    add-float v3, v3, p1

    float-to-int v3, v3

    :cond_1b
    invoke-virtual {v1, v10}, La/l5;->d(I)V

    iget-object v4, v0, La/ih;->b:La/N3;

    iget-object v4, v4, La/N3;->e:La/og;

    iget-object v4, v4, La/ih;->e:La/l5;

    invoke-virtual {v4, v3}, La/l5;->d(I)V

    goto :goto_a

    :cond_1c
    move/from16 p1, v8

    iget-object v3, v4, La/N3;->K:La/N3;

    if-eqz v3, :cond_1d

    iget-object v3, v3, La/N3;->d:La/K8;

    iget-object v3, v3, La/ih;->e:La/l5;

    iget-boolean v8, v3, La/V4;->j:Z

    if-eqz v8, :cond_1d

    iget v4, v4, La/N3;->o:F

    iget v3, v3, La/V4;->g:I

    int-to-float v3, v3

    mul-float/2addr v3, v4

    add-float v3, v3, p1

    float-to-int v3, v3

    invoke-virtual {v1, v3}, La/l5;->d(I)V

    :cond_1d
    :goto_a
    iget-boolean v3, v6, La/V4;->c:Z

    if-eqz v3, :cond_25

    iget-boolean v3, v7, La/V4;->c:Z

    if-nez v3, :cond_1e

    goto/16 :goto_c

    :cond_1e
    iget-boolean v3, v6, La/V4;->j:Z

    if-eqz v3, :cond_1f

    iget-boolean v3, v7, La/V4;->j:Z

    if-eqz v3, :cond_1f

    iget-boolean v3, v1, La/V4;->j:Z

    if-eqz v3, :cond_1f

    goto/16 :goto_c

    :cond_1f
    iget-boolean v3, v1, La/V4;->j:Z

    if-nez v3, :cond_20

    iget-object v3, v0, La/ih;->d:La/N3$a;

    if-ne v3, v5, :cond_20

    iget-object v3, v0, La/ih;->b:La/N3;

    iget v4, v3, La/N3;->j:I

    if-nez v4, :cond_20

    invoke-virtual {v3}, La/N3;->q()Z

    move-result v3

    if-nez v3, :cond_20

    iget-object v3, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    iget-object v4, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/V4;

    iget v3, v3, La/V4;->g:I

    iget v4, v6, La/V4;->f:I

    add-int/2addr v3, v4

    iget v2, v2, La/V4;->g:I

    iget v4, v7, La/V4;->f:I

    add-int/2addr v2, v4

    sub-int v4, v2, v3

    invoke-virtual {v6, v3}, La/V4;->d(I)V

    invoke-virtual {v7, v2}, La/V4;->d(I)V

    invoke-virtual {v1, v4}, La/l5;->d(I)V

    return-void

    :cond_20
    iget-boolean v3, v1, La/V4;->j:Z

    if-nez v3, :cond_22

    iget-object v3, v0, La/ih;->d:La/N3$a;

    if-ne v3, v5, :cond_22

    iget v3, v0, La/ih;->a:I

    if-ne v3, v9, :cond_22

    iget-object v3, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_22

    iget-object v3, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_22

    iget-object v3, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    iget-object v4, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/V4;

    iget v3, v3, La/V4;->g:I

    iget v5, v6, La/V4;->f:I

    add-int/2addr v3, v5

    iget v4, v4, La/V4;->g:I

    iget v5, v7, La/V4;->f:I

    add-int/2addr v4, v5

    sub-int/2addr v4, v3

    iget v3, v1, La/l5;->m:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, v0, La/ih;->b:La/N3;

    iget v5, v4, La/N3;->n:I

    iget v4, v4, La/N3;->m:I

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-lez v5, :cond_21

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_21
    invoke-virtual {v1, v3}, La/l5;->d(I)V

    :cond_22
    iget-boolean v3, v1, La/V4;->j:Z

    if-nez v3, :cond_23

    goto :goto_c

    :cond_23
    iget-object v3, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/V4;

    iget-object v4, v7, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/V4;

    iget v4, v3, La/V4;->g:I

    iget v5, v6, La/V4;->f:I

    add-int/2addr v5, v4

    iget v8, v2, La/V4;->g:I

    iget v9, v7, La/V4;->f:I

    add-int/2addr v9, v8

    iget-object v10, v0, La/ih;->b:La/N3;

    iget v10, v10, La/N3;->U:F

    if-ne v3, v2, :cond_24

    move/from16 v10, p1

    goto :goto_b

    :cond_24
    move v4, v5

    move v8, v9

    :goto_b
    sub-int/2addr v8, v4

    iget v2, v1, La/V4;->g:I

    sub-int/2addr v8, v2

    int-to-float v2, v4

    add-float v2, v2, p1

    int-to-float v3, v8

    mul-float/2addr v3, v10

    add-float/2addr v3, v2

    float-to-int v2, v3

    invoke-virtual {v6, v2}, La/V4;->d(I)V

    iget v2, v6, La/V4;->g:I

    iget v1, v1, La/V4;->g:I

    add-int/2addr v2, v1

    invoke-virtual {v7, v2}, La/V4;->d(I)V

    :cond_25
    :goto_c
    return-void

    :cond_26
    iget-object v1, v0, La/ih;->b:La/N3;

    iget-object v3, v1, La/N3;->y:La/M3;

    iget-object v1, v1, La/N3;->A:La/M3;

    invoke-virtual {v0, v3, v1, v2}, La/ih;->l(La/M3;La/M3;I)V

    return-void
.end method

.method public final d()V
    .locals 11

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v1, v0, La/N3;->a:Z

    iget-object v2, p0, La/ih;->e:La/l5;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La/N3;->l()I

    move-result v0

    invoke-virtual {v2, v0}, La/l5;->d(I)V

    :cond_0
    iget-boolean v0, v2, La/V4;->j:Z

    sget-object v1, La/N3$a;->d:La/N3$a;

    sget-object v3, La/N3$a;->c:La/N3$a;

    sget-object v4, La/N3$a;->a:La/N3$a;

    iget-object v5, p0, La/ih;->i:La/V4;

    iget-object v6, p0, La/ih;->h:La/V4;

    const/4 v7, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v8, v0, La/N3;->J:[La/N3$a;

    aget-object v8, v8, v7

    iput-object v8, p0, La/ih;->d:La/N3$a;

    if-eq v8, v3, :cond_7

    if-ne v8, v1, :cond_3

    iget-object v9, v0, La/N3;->K:La/N3;

    if-eqz v9, :cond_1

    iget-object v10, v9, La/N3;->J:[La/N3$a;

    aget-object v10, v10, v7

    if-eq v10, v4, :cond_2

    :cond_1
    iget-object v10, v9, La/N3;->J:[La/N3$a;

    aget-object v10, v10, v7

    if-ne v10, v1, :cond_3

    :cond_2
    invoke-virtual {v9}, La/N3;->l()I

    move-result v0

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->y:La/M3;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->A:La/M3;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, v9, La/N3;->d:La/K8;

    iget-object v3, v1, La/ih;->h:La/V4;

    iget-object v4, p0, La/ih;->b:La/N3;

    iget-object v4, v4, La/N3;->y:La/M3;

    invoke-virtual {v4}, La/M3;->c()I

    move-result v4

    invoke-static {v6, v3, v4}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v1, v1, La/ih;->i:La/V4;

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->A:La/M3;

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    neg-int v3, v3

    invoke-static {v5, v1, v3}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {v2, v0}, La/l5;->d(I)V

    return-void

    :cond_3
    if-ne v8, v4, :cond_7

    invoke-virtual {v0}, La/N3;->l()I

    move-result v0

    invoke-virtual {v2, v0}, La/l5;->d(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v8, v0, La/N3;->K:La/N3;

    if-eqz v8, :cond_5

    iget-object v9, v8, La/N3;->J:[La/N3$a;

    aget-object v9, v9, v7

    if-eq v9, v4, :cond_6

    :cond_5
    iget-object v4, v8, La/N3;->J:[La/N3$a;

    aget-object v4, v4, v7

    if-ne v4, v1, :cond_7

    :cond_6
    iget-object v1, v8, La/N3;->d:La/K8;

    iget-object v1, v1, La/ih;->h:La/V4;

    iget-object v0, v0, La/N3;->y:La/M3;

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    invoke-static {v6, v1, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget-object v0, v8, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->A:La/M3;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_7
    :goto_0
    iget-boolean v0, v2, La/V4;->j:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_e

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-boolean v4, v0, La/N3;->a:Z

    if-eqz v4, :cond_e

    iget-object v3, v0, La/N3;->G:[La/M3;

    aget-object v4, v3, v7

    iget-object v8, v4, La/M3;->d:La/M3;

    if-eqz v8, :cond_b

    aget-object v9, v3, v1

    iget-object v9, v9, La/M3;->d:La/M3;

    if-eqz v9, :cond_b

    invoke-virtual {v0}, La/N3;->q()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v7

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    iput v0, v6, La/V4;->f:I

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v1

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    neg-int v0, v0

    iput v0, v5, La/V4;->f:I

    return-void

    :cond_8
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v7

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v2, p0, La/ih;->b:La/N3;

    iget-object v2, v2, La/N3;->G:[La/M3;

    aget-object v2, v2, v7

    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    invoke-static {v6, v0, v2}, La/ih;->b(La/V4;La/V4;I)V

    :cond_9
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v1

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v2, p0, La/ih;->b:La/N3;

    iget-object v2, v2, La/N3;->G:[La/M3;

    aget-object v2, v2, v1

    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    neg-int v2, v2

    invoke-static {v5, v0, v2}, La/ih;->b(La/V4;La/V4;I)V

    :cond_a
    iput-boolean v1, v6, La/V4;->b:Z

    iput-boolean v1, v5, La/V4;->b:Z

    return-void

    :cond_b
    if-eqz v8, :cond_c

    invoke-static {v4}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->G:[La/M3;

    aget-object v1, v1, v7

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    invoke-static {v6, v0, v1}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    invoke-static {v5, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_c
    aget-object v3, v3, v1

    iget-object v4, v3, La/M3;->d:La/M3;

    if-eqz v4, :cond_d

    invoke-static {v3}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v1, v3, v1

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    neg-int v0, v0

    invoke-static {v6, v5, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_d
    instance-of v1, v0, La/f8;

    if-nez v1, :cond_1a

    iget-object v1, v0, La/N3;->K:La/N3;

    if-eqz v1, :cond_1a

    sget-object v1, La/M3$a;->f:La/M3$a;

    invoke-virtual {v0, v1}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    iget-object v0, v0, La/M3;->d:La/M3;

    if-nez v0, :cond_1a

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v1, v0, La/N3;->K:La/N3;

    iget-object v1, v1, La/N3;->d:La/K8;

    iget-object v1, v1, La/ih;->h:La/V4;

    invoke-virtual {v0}, La/N3;->m()I

    move-result v0

    invoke-static {v6, v1, v0}, La/ih;->b(La/V4;La/V4;I)V

    iget v0, v2, La/V4;->g:I

    invoke-static {v5, v6, v0}, La/ih;->b(La/V4;La/V4;I)V

    return-void

    :cond_e
    iget-object v0, p0, La/ih;->d:La/N3$a;

    if-ne v0, v3, :cond_15

    iget-object v0, p0, La/ih;->b:La/N3;

    iget v3, v0, La/N3;->j:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_13

    const/4 v4, 0x3

    if-eq v3, v4, :cond_f

    goto/16 :goto_1

    :cond_f
    iget v3, v0, La/N3;->k:I

    if-ne v3, v4, :cond_12

    iput-object p0, v6, La/V4;->a:La/ih;

    iput-object p0, v5, La/V4;->a:La/ih;

    iget-object v3, v0, La/N3;->e:La/og;

    iget-object v4, v3, La/ih;->h:La/V4;

    iput-object p0, v4, La/V4;->a:La/ih;

    iget-object v3, v3, La/ih;->i:La/V4;

    iput-object p0, v3, La/V4;->a:La/ih;

    iput-object p0, v2, La/V4;->a:La/ih;

    invoke-virtual {v0}, La/N3;->r()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v3, v0, La/ih;->e:La/l5;

    iput-object p0, v3, La/V4;->a:La/ih;

    iget-object v3, v2, La/V4;->l:Ljava/util/ArrayList;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->l:Ljava/util/ArrayList;

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->i:La/V4;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_10
    iget-object v0, p0, La/ih;->b:La/N3;

    invoke-virtual {v0}, La/N3;->q()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v0, v0, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_11
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v0, v0, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_12
    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v3, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->i:La/V4;

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v1, v2, La/V4;->b:Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v6, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_13
    iget-object v0, v0, La/N3;->K:La/N3;

    if-nez v0, :cond_14

    goto :goto_1

    :cond_14
    iget-object v0, v0, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->e:La/l5;

    iget-object v3, v2, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v1, v2, La/V4;->b:Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_1
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v3, v0, La/N3;->G:[La/M3;

    aget-object v4, v3, v7

    iget-object v8, v4, La/M3;->d:La/M3;

    if-eqz v8, :cond_17

    aget-object v9, v3, v1

    iget-object v9, v9, La/M3;->d:La/M3;

    if-eqz v9, :cond_17

    invoke-virtual {v0}, La/N3;->q()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v7

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    iput v0, v6, La/V4;->f:I

    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v1

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    neg-int v0, v0

    iput v0, v5, La/V4;->f:I

    return-void

    :cond_16
    iget-object v0, p0, La/ih;->b:La/N3;

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v7

    invoke-static {v0}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    iget-object v2, p0, La/ih;->b:La/N3;

    iget-object v2, v2, La/N3;->G:[La/M3;

    aget-object v1, v2, v1

    invoke-static {v1}, La/ih;->h(La/M3;)La/V4;

    move-result-object v1

    invoke-virtual {v0, p0}, La/V4;->b(La/ih;)V

    invoke-virtual {v1, p0}, La/V4;->b(La/ih;)V

    sget-object v0, La/ih$a;->b:La/ih$a;

    iput-object v0, p0, La/ih;->j:La/ih$a;

    return-void

    :cond_17
    if-eqz v8, :cond_18

    invoke-static {v4}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v7

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    invoke-static {v6, v0, v3}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {p0, v5, v6, v1, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    return-void

    :cond_18
    aget-object v3, v3, v1

    iget-object v4, v3, La/M3;->d:La/M3;

    if-eqz v4, :cond_19

    invoke-static {v3}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v3, p0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v1, v3, v1

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, La/ih;->b(La/V4;La/V4;I)V

    const/4 v0, -0x1

    invoke-virtual {p0, v6, v5, v0, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    return-void

    :cond_19
    instance-of v3, v0, La/f8;

    if-nez v3, :cond_1a

    iget-object v3, v0, La/N3;->K:La/N3;

    if-eqz v3, :cond_1a

    iget-object v3, v3, La/N3;->d:La/K8;

    iget-object v3, v3, La/ih;->h:La/V4;

    invoke-virtual {v0}, La/N3;->m()I

    move-result v0

    invoke-static {v6, v3, v0}, La/ih;->b(La/V4;La/V4;I)V

    invoke-virtual {p0, v5, v6, v1, v2}, La/ih;->c(La/V4;La/V4;ILa/l5;)V

    :cond_1a
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, La/ih;->h:La/V4;

    iget-boolean v1, v0, La/V4;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, La/ih;->b:La/N3;

    iget v0, v0, La/V4;->g:I

    iput v0, v1, La/N3;->P:I

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

    iget v0, v0, La/N3;->j:I

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

    iput-boolean v0, p0, La/ih;->g:Z

    iget-object v1, p0, La/ih;->h:La/V4;

    invoke-virtual {v1}, La/V4;->c()V

    iput-boolean v0, v1, La/V4;->j:Z

    iget-object v1, p0, La/ih;->i:La/V4;

    invoke-virtual {v1}, La/V4;->c()V

    iput-boolean v0, v1, La/V4;->j:Z

    iget-object v1, p0, La/ih;->e:La/l5;

    iput-boolean v0, v1, La/V4;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HorizontalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/ih;->b:La/N3;

    iget-object v1, v1, La/N3;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
