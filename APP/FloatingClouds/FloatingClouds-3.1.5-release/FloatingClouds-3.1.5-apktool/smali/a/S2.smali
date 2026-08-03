.class public final La/S2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/O3;La/B9;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez p2, :cond_0

    iget v2, v0, La/O3;->m0:I

    iget-object v3, v0, La/O3;->p0:[La/T2;

    const/4 v14, 0x0

    :goto_0
    move v12, v2

    move-object v13, v3

    goto :goto_1

    :cond_0
    iget v2, v0, La/O3;->n0:I

    iget-object v3, v0, La/O3;->o0:[La/T2;

    const/4 v14, 0x2

    goto :goto_0

    :goto_1
    const/4 v15, 0x0

    :goto_2
    if-ge v15, v12, :cond_6d

    aget-object v2, v13, v15

    iget-boolean v3, v2, La/T2;->q:Z

    sget-object v4, La/N3$a;->c:La/N3$a;

    iget-object v5, v2, La/T2;->a:La/N3;

    const/16 v8, 0x8

    const/16 v16, 0x0

    if-nez v3, :cond_19

    iget v3, v2, La/T2;->l:I

    mul-int/lit8 v9, v3, 0x2

    move-object v7, v5

    move-object v11, v7

    const/16 v17, 0x0

    const/16 v18, 0x0

    :goto_3
    if-nez v17, :cond_14

    const/16 v20, 0x1

    iget v6, v2, La/T2;->i:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, La/T2;->i:I

    iget-object v6, v7, La/N3;->d0:[La/N3;

    aput-object v16, v6, v3

    iget-object v6, v7, La/N3;->c0:[La/N3;

    aput-object v16, v6, v3

    iget v6, v7, La/N3;->X:I

    iget-object v10, v7, La/N3;->G:[La/M3;

    if-eq v6, v8, :cond_e

    invoke-virtual {v7, v3}, La/N3;->h(I)La/N3$a;

    aget-object v6, v10, v9

    invoke-virtual {v6}, La/M3;->c()I

    add-int/lit8 v6, v9, 0x1

    aget-object v22, v10, v6

    invoke-virtual/range {v22 .. v22}, La/M3;->c()I

    aget-object v22, v10, v9

    invoke-virtual/range {v22 .. v22}, La/M3;->c()I

    aget-object v6, v10, v6

    invoke-virtual {v6}, La/M3;->c()I

    iget-object v6, v2, La/T2;->b:La/N3;

    if-nez v6, :cond_1

    iput-object v7, v2, La/T2;->b:La/N3;

    :cond_1
    iput-object v7, v2, La/T2;->d:La/N3;

    iget-object v6, v7, La/N3;->J:[La/N3$a;

    aget-object v6, v6, v3

    if-ne v6, v4, :cond_e

    iget-object v8, v7, La/N3;->l:[I

    aget v8, v8, v3

    move/from16 v23, v3

    const/4 v3, 0x3

    if-eqz v8, :cond_3

    if-eq v8, v3, :cond_3

    const/4 v3, 0x2

    if-ne v8, v3, :cond_2

    goto :goto_4

    :cond_2
    move/from16 v26, v9

    goto :goto_7

    :cond_3
    :goto_4
    iget v3, v2, La/T2;->j:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, La/T2;->j:I

    iget-object v3, v7, La/N3;->b0:[F

    aget v3, v3, v23

    cmpl-float v25, v3, v18

    if-lez v25, :cond_4

    move/from16 v25, v3

    iget v3, v2, La/T2;->k:F

    add-float v3, v3, v25

    iput v3, v2, La/T2;->k:F

    goto :goto_5

    :cond_4
    move/from16 v25, v3

    :goto_5
    iget v3, v7, La/N3;->X:I

    move/from16 v26, v9

    const/16 v9, 0x8

    if-eq v3, v9, :cond_8

    if-ne v6, v4, :cond_8

    if-eqz v8, :cond_5

    const/4 v3, 0x3

    if-ne v8, v3, :cond_8

    :cond_5
    cmpg-float v3, v25, v18

    if-gez v3, :cond_6

    move/from16 v3, v20

    iput-boolean v3, v2, La/T2;->n:Z

    goto :goto_6

    :cond_6
    move/from16 v3, v20

    iput-boolean v3, v2, La/T2;->o:Z

    :goto_6
    iget-object v3, v2, La/T2;->h:Ljava/util/ArrayList;

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, La/T2;->h:Ljava/util/ArrayList;

    :cond_7
    iget-object v3, v2, La/T2;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v3, v2, La/T2;->f:La/N3;

    if-nez v3, :cond_9

    iput-object v7, v2, La/T2;->f:La/N3;

    :cond_9
    iget-object v3, v2, La/T2;->g:La/N3;

    if-eqz v3, :cond_a

    iget-object v3, v3, La/N3;->c0:[La/N3;

    aput-object v7, v3, v23

    :cond_a
    iput-object v7, v2, La/T2;->g:La/N3;

    :goto_7
    if-nez v23, :cond_c

    iget v3, v7, La/N3;->j:I

    if-eqz v3, :cond_b

    goto :goto_8

    :cond_b
    iget v3, v7, La/N3;->m:I

    if-nez v3, :cond_f

    iget v3, v7, La/N3;->n:I

    goto :goto_8

    :cond_c
    iget v3, v7, La/N3;->k:I

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    iget v3, v7, La/N3;->p:I

    if-nez v3, :cond_f

    iget v3, v7, La/N3;->q:I

    goto :goto_8

    :cond_e
    move/from16 v23, v3

    move/from16 v26, v9

    :cond_f
    :goto_8
    if-eq v11, v7, :cond_10

    iget-object v3, v11, La/N3;->d0:[La/N3;

    aput-object v7, v3, v23

    :cond_10
    add-int/lit8 v9, v26, 0x1

    aget-object v3, v10, v9

    iget-object v3, v3, La/M3;->d:La/M3;

    if-eqz v3, :cond_11

    iget-object v3, v3, La/M3;->b:La/N3;

    iget-object v6, v3, La/N3;->G:[La/M3;

    aget-object v6, v6, v26

    iget-object v6, v6, La/M3;->d:La/M3;

    if-eqz v6, :cond_11

    iget-object v6, v6, La/M3;->b:La/N3;

    if-eq v6, v7, :cond_12

    :cond_11
    move-object/from16 v3, v16

    :cond_12
    if-eqz v3, :cond_13

    goto :goto_9

    :cond_13
    move-object v3, v7

    const/16 v17, 0x1

    :goto_9
    move-object v11, v7

    move/from16 v9, v26

    const/16 v8, 0x8

    move-object v7, v3

    move/from16 v3, v23

    goto/16 :goto_3

    :cond_14
    move/from16 v23, v3

    move/from16 v26, v9

    iget-object v3, v2, La/T2;->b:La/N3;

    if-eqz v3, :cond_15

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v26

    invoke-virtual {v3}, La/M3;->c()I

    :cond_15
    iget-object v3, v2, La/T2;->d:La/N3;

    if-eqz v3, :cond_16

    add-int/lit8 v9, v26, 0x1

    iget-object v3, v3, La/N3;->G:[La/M3;

    aget-object v3, v3, v9

    invoke-virtual {v3}, La/M3;->c()I

    :cond_16
    iput-object v7, v2, La/T2;->c:La/N3;

    if-nez v23, :cond_17

    iget-boolean v3, v2, La/T2;->m:Z

    if-eqz v3, :cond_17

    iput-object v7, v2, La/T2;->e:La/N3;

    goto :goto_a

    :cond_17
    iput-object v5, v2, La/T2;->e:La/N3;

    :goto_a
    iget-boolean v3, v2, La/T2;->o:Z

    if-eqz v3, :cond_18

    iget-boolean v3, v2, La/T2;->n:Z

    if-eqz v3, :cond_18

    const/4 v3, 0x1

    goto :goto_b

    :cond_18
    const/4 v3, 0x0

    :goto_b
    iput-boolean v3, v2, La/T2;->p:Z

    :goto_c
    const/4 v3, 0x1

    goto :goto_d

    :cond_19
    const/16 v18, 0x0

    goto :goto_c

    :goto_d
    iput-boolean v3, v2, La/T2;->q:Z

    iget-object v10, v2, La/T2;->c:La/N3;

    iget-object v11, v2, La/T2;->b:La/N3;

    iget-object v3, v2, La/T2;->d:La/N3;

    iget-object v6, v2, La/T2;->e:La/N3;

    iget v7, v2, La/T2;->k:F

    iget-object v8, v0, La/N3;->J:[La/N3$a;

    aget-object v8, v8, p2

    sget-object v9, La/N3$a;->b:La/N3$a;

    if-ne v8, v9, :cond_1a

    const/4 v8, 0x1

    goto :goto_e

    :cond_1a
    const/4 v8, 0x0

    :goto_e
    if-nez p2, :cond_1e

    iget v9, v6, La/N3;->Z:I

    if-nez v9, :cond_1b

    const/16 v20, 0x1

    :goto_f
    move/from16 v17, v7

    const/4 v7, 0x1

    goto :goto_10

    :cond_1b
    const/16 v20, 0x0

    goto :goto_f

    :goto_10
    if-ne v9, v7, :cond_1c

    move/from16 v21, v7

    :goto_11
    const/4 v7, 0x2

    goto :goto_12

    :cond_1c
    const/16 v21, 0x0

    goto :goto_11

    :goto_12
    if-ne v9, v7, :cond_1d

    const/4 v9, 0x1

    goto :goto_13

    :cond_1d
    const/4 v9, 0x0

    :goto_13
    move-object v7, v5

    move/from16 v26, v8

    move/from16 v23, v20

    :goto_14
    move/from16 v24, v21

    const/16 v21, 0x0

    goto :goto_1a

    :cond_1e
    move/from16 v17, v7

    const/4 v7, 0x2

    iget v9, v6, La/N3;->a0:I

    if-nez v9, :cond_1f

    const/16 v23, 0x1

    :goto_15
    const/4 v7, 0x1

    goto :goto_16

    :cond_1f
    const/16 v23, 0x0

    goto :goto_15

    :goto_16
    if-ne v9, v7, :cond_20

    const/16 v21, 0x1

    :goto_17
    const/4 v7, 0x2

    goto :goto_18

    :cond_20
    const/16 v21, 0x0

    goto :goto_17

    :goto_18
    if-ne v9, v7, :cond_21

    const/4 v9, 0x1

    goto :goto_19

    :cond_21
    const/4 v9, 0x0

    :goto_19
    move-object v7, v5

    move/from16 v26, v8

    goto :goto_14

    :goto_1a
    iget-object v8, v0, La/N3;->G:[La/M3;

    move-object/from16 v27, v8

    if-nez v21, :cond_2e

    iget-object v8, v7, La/N3;->G:[La/M3;

    aget-object v8, v8, v14

    if-eqz v9, :cond_22

    const/16 v29, 0x1

    goto :goto_1b

    :cond_22
    const/16 v29, 0x4

    :goto_1b
    invoke-virtual {v8}, La/M3;->c()I

    move-result v31

    move/from16 v32, v9

    iget-object v9, v7, La/N3;->J:[La/N3$a;

    move-object/from16 v33, v9

    aget-object v9, v33, p2

    if-ne v9, v4, :cond_23

    iget-object v9, v7, La/N3;->l:[I

    aget v9, v9, p2

    if-nez v9, :cond_23

    const/16 v34, 0x1

    goto :goto_1c

    :cond_23
    const/16 v34, 0x0

    :goto_1c
    iget-object v9, v8, La/M3;->d:La/M3;

    if-eqz v9, :cond_24

    if-eq v7, v5, :cond_24

    invoke-virtual {v9}, La/M3;->c()I

    move-result v9

    add-int v31, v9, v31

    :cond_24
    move/from16 v9, v31

    if-eqz v32, :cond_25

    if-eq v7, v5, :cond_25

    if-eq v7, v11, :cond_25

    const/16 v29, 0x5

    :cond_25
    move/from16 v31, v12

    iget-object v12, v8, La/M3;->d:La/M3;

    if-eqz v12, :cond_28

    if-ne v7, v11, :cond_26

    move-object/from16 v35, v13

    iget-object v13, v8, La/M3;->g:La/le;

    iget-object v12, v12, La/M3;->g:La/le;

    move/from16 v36, v14

    const/4 v14, 0x6

    invoke-virtual {v1, v13, v12, v9, v14}, La/B9;->f(La/le;La/le;II)V

    goto :goto_1d

    :cond_26
    move-object/from16 v35, v13

    move/from16 v36, v14

    iget-object v13, v8, La/M3;->g:La/le;

    iget-object v12, v12, La/M3;->g:La/le;

    const/16 v14, 0x8

    invoke-virtual {v1, v13, v12, v9, v14}, La/B9;->f(La/le;La/le;II)V

    :goto_1d
    if-eqz v34, :cond_27

    if-nez v32, :cond_27

    const/4 v12, 0x5

    goto :goto_1e

    :cond_27
    move/from16 v12, v29

    :goto_1e
    iget-object v13, v8, La/M3;->g:La/le;

    iget-object v8, v8, La/M3;->d:La/M3;

    iget-object v8, v8, La/M3;->g:La/le;

    invoke-virtual {v1, v13, v8, v9, v12}, La/B9;->e(La/le;La/le;II)V

    goto :goto_1f

    :cond_28
    move-object/from16 v35, v13

    move/from16 v36, v14

    :goto_1f
    iget-object v8, v7, La/N3;->G:[La/M3;

    if-eqz v26, :cond_2a

    iget v9, v7, La/N3;->X:I

    const/16 v14, 0x8

    if-eq v9, v14, :cond_29

    aget-object v9, v33, p2

    if-ne v9, v4, :cond_29

    add-int/lit8 v14, v36, 0x1

    aget-object v9, v8, v14

    iget-object v9, v9, La/M3;->g:La/le;

    aget-object v12, v8, v36

    iget-object v12, v12, La/M3;->g:La/le;

    const/4 v13, 0x0

    const/4 v14, 0x5

    invoke-virtual {v1, v9, v12, v13, v14}, La/B9;->f(La/le;La/le;II)V

    goto :goto_20

    :cond_29
    const/4 v13, 0x0

    :goto_20
    aget-object v9, v8, v36

    iget-object v9, v9, La/M3;->g:La/le;

    aget-object v12, v27, v36

    iget-object v12, v12, La/M3;->g:La/le;

    const/16 v14, 0x8

    invoke-virtual {v1, v9, v12, v13, v14}, La/B9;->f(La/le;La/le;II)V

    :cond_2a
    add-int/lit8 v14, v36, 0x1

    aget-object v8, v8, v14

    iget-object v8, v8, La/M3;->d:La/M3;

    if-eqz v8, :cond_2b

    iget-object v8, v8, La/M3;->b:La/N3;

    iget-object v9, v8, La/N3;->G:[La/M3;

    aget-object v9, v9, v36

    iget-object v9, v9, La/M3;->d:La/M3;

    if-eqz v9, :cond_2b

    iget-object v9, v9, La/M3;->b:La/N3;

    if-eq v9, v7, :cond_2c

    :cond_2b
    move-object/from16 v8, v16

    :cond_2c
    if-eqz v8, :cond_2d

    move-object v7, v8

    goto :goto_21

    :cond_2d
    const/16 v21, 0x1

    :goto_21
    move/from16 v12, v31

    move/from16 v9, v32

    move-object/from16 v13, v35

    move/from16 v14, v36

    goto/16 :goto_1a

    :cond_2e
    move/from16 v32, v9

    move/from16 v31, v12

    move-object/from16 v35, v13

    move/from16 v36, v14

    if-eqz v3, :cond_31

    iget-object v7, v10, La/N3;->G:[La/M3;

    add-int/lit8 v14, v36, 0x1

    aget-object v7, v7, v14

    iget-object v7, v7, La/M3;->d:La/M3;

    if-eqz v7, :cond_31

    iget-object v7, v3, La/N3;->G:[La/M3;

    aget-object v7, v7, v14

    iget-object v8, v3, La/N3;->J:[La/N3$a;

    aget-object v8, v8, p2

    if-ne v8, v4, :cond_2f

    iget-object v4, v3, La/N3;->l:[I

    aget v4, v4, p2

    if-nez v4, :cond_2f

    if-nez v32, :cond_2f

    iget-object v4, v7, La/M3;->d:La/M3;

    iget-object v8, v4, La/M3;->b:La/N3;

    if-ne v8, v0, :cond_2f

    iget-object v8, v7, La/M3;->g:La/le;

    iget-object v4, v4, La/M3;->g:La/le;

    invoke-virtual {v7}, La/M3;->c()I

    move-result v9

    neg-int v9, v9

    const/4 v12, 0x5

    invoke-virtual {v1, v8, v4, v9, v12}, La/B9;->e(La/le;La/le;II)V

    goto :goto_22

    :cond_2f
    const/4 v12, 0x5

    if-eqz v32, :cond_30

    iget-object v4, v7, La/M3;->d:La/M3;

    iget-object v8, v4, La/M3;->b:La/N3;

    if-ne v8, v0, :cond_30

    iget-object v8, v7, La/M3;->g:La/le;

    iget-object v4, v4, La/M3;->g:La/le;

    invoke-virtual {v7}, La/M3;->c()I

    move-result v9

    neg-int v9, v9

    const/4 v13, 0x4

    invoke-virtual {v1, v8, v4, v9, v13}, La/B9;->e(La/le;La/le;II)V

    :cond_30
    :goto_22
    iget-object v4, v7, La/M3;->g:La/le;

    iget-object v8, v10, La/N3;->G:[La/M3;

    aget-object v8, v8, v14

    iget-object v8, v8, La/M3;->d:La/M3;

    iget-object v8, v8, La/M3;->g:La/le;

    invoke-virtual {v7}, La/M3;->c()I

    move-result v7

    neg-int v7, v7

    const/4 v14, 0x6

    invoke-virtual {v1, v4, v8, v7, v14}, La/B9;->g(La/le;La/le;II)V

    goto :goto_23

    :cond_31
    const/4 v12, 0x5

    :goto_23
    if-eqz v26, :cond_32

    add-int/lit8 v14, v36, 0x1

    aget-object v4, v27, v14

    iget-object v4, v4, La/M3;->g:La/le;

    iget-object v7, v10, La/N3;->G:[La/M3;

    aget-object v7, v7, v14

    iget-object v8, v7, La/M3;->g:La/le;

    invoke-virtual {v7}, La/M3;->c()I

    move-result v7

    const/16 v14, 0x8

    invoke-virtual {v1, v4, v8, v7, v14}, La/B9;->f(La/le;La/le;II)V

    :cond_32
    iget-object v4, v2, La/T2;->h:Ljava/util/ArrayList;

    if-eqz v4, :cond_3c

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_3c

    iget-boolean v9, v2, La/T2;->n:Z

    if-eqz v9, :cond_33

    iget-boolean v9, v2, La/T2;->p:Z

    if-nez v9, :cond_33

    iget v9, v2, La/T2;->j:I

    int-to-float v9, v9

    move/from16 v17, v9

    :cond_33
    move-object/from16 v9, v16

    move/from16 v14, v18

    const/4 v13, 0x0

    :goto_24
    if-ge v13, v7, :cond_3c

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v8, v20

    check-cast v8, La/N3;

    iget-object v12, v8, La/N3;->b0:[F

    aget v12, v12, p2

    cmpg-float v20, v12, v18

    iget-object v0, v8, La/N3;->G:[La/M3;

    move-object/from16 v26, v0

    if-gez v20, :cond_35

    iget-boolean v12, v2, La/T2;->p:Z

    if-eqz v12, :cond_34

    add-int/lit8 v0, v36, 0x1

    aget-object v0, v26, v0

    iget-object v0, v0, La/M3;->g:La/le;

    aget-object v8, v26, v36

    iget-object v8, v8, La/M3;->g:La/le;

    move-object/from16 v20, v4

    const/4 v4, 0x4

    const/4 v12, 0x0

    invoke-virtual {v1, v0, v8, v12, v4}, La/B9;->e(La/le;La/le;II)V

    goto :goto_25

    :cond_34
    const/high16 v12, 0x3f800000    # 1.0f

    :cond_35
    move-object/from16 v20, v4

    const/4 v4, 0x4

    cmpl-float v27, v12, v18

    if-nez v27, :cond_36

    add-int/lit8 v0, v36, 0x1

    aget-object v0, v26, v0

    iget-object v0, v0, La/M3;->g:La/le;

    aget-object v8, v26, v36

    iget-object v8, v8, La/M3;->g:La/le;

    const/16 v4, 0x8

    const/4 v12, 0x0

    invoke-virtual {v1, v0, v8, v12, v4}, La/B9;->e(La/le;La/le;II)V

    :goto_25
    move/from16 v34, v7

    move/from16 v19, v12

    move/from16 v37, v18

    move/from16 v18, v13

    goto/16 :goto_2a

    :cond_36
    const/16 v19, 0x0

    if-eqz v9, :cond_3b

    iget-object v4, v9, La/N3;->G:[La/M3;

    aget-object v9, v4, v36

    iget-object v9, v9, La/M3;->g:La/le;

    add-int/lit8 v28, v36, 0x1

    aget-object v4, v4, v28

    iget-object v4, v4, La/M3;->g:La/le;

    aget-object v0, v26, v36

    iget-object v0, v0, La/M3;->g:La/le;

    move/from16 v34, v7

    aget-object v7, v26, v28

    iget-object v7, v7, La/M3;->g:La/le;

    move-object/from16 v26, v8

    invoke-virtual {v1}, La/B9;->k()La/K1;

    move-result-object v8

    move/from16 v28, v12

    move/from16 v12, v18

    iput v12, v8, La/K1;->b:F

    cmpl-float v18, v17, v12

    move/from16 v37, v12

    const/high16 v12, -0x40800000    # -1.0f

    if-eqz v18, :cond_37

    cmpl-float v18, v14, v28

    if-nez v18, :cond_38

    :cond_37
    move/from16 v18, v13

    move v13, v12

    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_27

    :cond_38
    cmpl-float v18, v14, v37

    if-nez v18, :cond_39

    iget-object v0, v8, La/K1;->d:La/K1$a;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-interface {v0, v9, v7}, La/K1$a;->c(La/le;F)V

    iget-object v0, v8, La/K1;->d:La/K1$a;

    invoke-interface {v0, v4, v12}, La/K1$a;->c(La/le;F)V

    :goto_26
    move/from16 v18, v13

    goto :goto_28

    :cond_39
    const/high16 v12, 0x3f800000    # 1.0f

    if-nez v27, :cond_3a

    iget-object v4, v8, La/K1;->d:La/K1$a;

    invoke-interface {v4, v0, v12}, La/K1$a;->c(La/le;F)V

    iget-object v0, v8, La/K1;->d:La/K1$a;

    const/high16 v4, -0x40800000    # -1.0f

    invoke-interface {v0, v7, v4}, La/K1$a;->c(La/le;F)V

    goto :goto_26

    :cond_3a
    div-float v14, v14, v17

    div-float v18, v28, v17

    div-float v14, v14, v18

    move/from16 v18, v13

    iget-object v13, v8, La/K1;->d:La/K1$a;

    invoke-interface {v13, v9, v12}, La/K1$a;->c(La/le;F)V

    iget-object v9, v8, La/K1;->d:La/K1$a;

    const/high16 v13, -0x40800000    # -1.0f

    invoke-interface {v9, v4, v13}, La/K1$a;->c(La/le;F)V

    iget-object v4, v8, La/K1;->d:La/K1$a;

    invoke-interface {v4, v7, v14}, La/K1$a;->c(La/le;F)V

    iget-object v4, v8, La/K1;->d:La/K1$a;

    neg-float v7, v14

    invoke-interface {v4, v0, v7}, La/K1$a;->c(La/le;F)V

    goto :goto_28

    :goto_27
    iget-object v14, v8, La/K1;->d:La/K1$a;

    invoke-interface {v14, v9, v12}, La/K1$a;->c(La/le;F)V

    iget-object v9, v8, La/K1;->d:La/K1$a;

    invoke-interface {v9, v4, v13}, La/K1$a;->c(La/le;F)V

    iget-object v4, v8, La/K1;->d:La/K1$a;

    invoke-interface {v4, v7, v12}, La/K1$a;->c(La/le;F)V

    iget-object v4, v8, La/K1;->d:La/K1$a;

    invoke-interface {v4, v0, v13}, La/K1$a;->c(La/le;F)V

    :goto_28
    invoke-virtual {v1, v8}, La/B9;->c(La/K1;)V

    goto :goto_29

    :cond_3b
    move/from16 v34, v7

    move-object/from16 v26, v8

    move/from16 v28, v12

    move/from16 v37, v18

    move/from16 v18, v13

    :goto_29
    move-object/from16 v9, v26

    move/from16 v14, v28

    :goto_2a
    add-int/lit8 v13, v18, 0x1

    move-object/from16 v4, v20

    move/from16 v7, v34

    move/from16 v18, v37

    const/4 v8, 0x1

    const/4 v12, 0x5

    move-object/from16 v0, p0

    goto/16 :goto_24

    :cond_3c
    const/16 v19, 0x0

    if-eqz v11, :cond_3d

    if-eq v11, v3, :cond_3e

    if-eqz v32, :cond_3d

    goto :goto_2b

    :cond_3d
    move-object v0, v3

    const/16 v25, 0x2

    goto :goto_30

    :cond_3e
    :goto_2b
    iget-object v0, v5, La/N3;->G:[La/M3;

    aget-object v0, v0, v36

    iget-object v2, v10, La/N3;->G:[La/M3;

    add-int/lit8 v14, v36, 0x1

    aget-object v2, v2, v14

    iget-object v0, v0, La/M3;->d:La/M3;

    if-eqz v0, :cond_3f

    iget-object v0, v0, La/M3;->g:La/le;

    goto :goto_2c

    :cond_3f
    move-object/from16 v0, v16

    :goto_2c
    iget-object v2, v2, La/M3;->d:La/M3;

    if-eqz v2, :cond_40

    iget-object v2, v2, La/M3;->g:La/le;

    goto :goto_2d

    :cond_40
    move-object/from16 v2, v16

    :goto_2d
    iget-object v4, v11, La/N3;->G:[La/M3;

    aget-object v4, v4, v36

    iget-object v5, v3, La/N3;->G:[La/M3;

    aget-object v5, v5, v14

    if-eqz v0, :cond_42

    if-eqz v2, :cond_42

    if-nez p2, :cond_41

    iget v6, v6, La/N3;->U:F

    goto :goto_2e

    :cond_41
    iget v6, v6, La/N3;->V:F

    :goto_2e
    invoke-virtual {v4}, La/M3;->c()I

    move-result v7

    invoke-virtual {v5}, La/M3;->c()I

    move-result v8

    iget-object v4, v4, La/M3;->g:La/le;

    iget-object v5, v5, La/M3;->g:La/le;

    const/4 v9, 0x7

    move-object/from16 v25, v3

    move-object v3, v0

    move-object/from16 v0, v25

    move/from16 v25, v6

    move-object v6, v2

    move-object v2, v4

    move v4, v7

    move-object v7, v5

    move/from16 v5, v25

    const/16 v25, 0x2

    invoke-virtual/range {v1 .. v9}, La/B9;->b(La/le;La/le;IFLa/le;La/le;II)V

    goto :goto_2f

    :cond_42
    move-object v0, v3

    const/16 v25, 0x2

    :cond_43
    :goto_2f
    move-object/from16 v1, p1

    goto/16 :goto_45

    :goto_30
    if-eqz v23, :cond_56

    if-eqz v11, :cond_56

    iget v1, v2, La/T2;->j:I

    if-lez v1, :cond_44

    iget v2, v2, La/T2;->i:I

    if-ne v2, v1, :cond_44

    const/16 v21, 0x1

    goto :goto_31

    :cond_44
    move/from16 v21, v19

    :goto_31
    move-object v12, v11

    move-object v13, v12

    :goto_32
    if-eqz v12, :cond_43

    iget-object v1, v12, La/N3;->d0:[La/N3;

    aget-object v1, v1, p2

    move-object v14, v1

    :goto_33
    if-eqz v14, :cond_45

    iget v1, v14, La/N3;->X:I

    const/16 v4, 0x8

    if-ne v1, v4, :cond_46

    iget-object v1, v14, La/N3;->d0:[La/N3;

    aget-object v14, v1, p2

    goto :goto_33

    :cond_45
    const/16 v4, 0x8

    :cond_46
    if-nez v14, :cond_48

    if-ne v12, v0, :cond_47

    goto :goto_34

    :cond_47
    move-object/from16 v38, v5

    move-object/from16 v17, v13

    const/16 v30, 0x5

    move v13, v4

    goto/16 :goto_3b

    :cond_48
    :goto_34
    iget-object v1, v12, La/N3;->G:[La/M3;

    aget-object v2, v1, v36

    iget-object v3, v2, La/M3;->g:La/le;

    iget-object v6, v2, La/M3;->d:La/M3;

    if-eqz v6, :cond_49

    iget-object v6, v6, La/M3;->g:La/le;

    goto :goto_35

    :cond_49
    move-object/from16 v6, v16

    :goto_35
    if-eq v13, v12, :cond_4a

    iget-object v6, v13, La/N3;->G:[La/M3;

    add-int/lit8 v7, v36, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, La/M3;->g:La/le;

    goto :goto_36

    :cond_4a
    if-ne v12, v11, :cond_4c

    if-ne v13, v12, :cond_4c

    iget-object v6, v5, La/N3;->G:[La/M3;

    aget-object v6, v6, v36

    iget-object v6, v6, La/M3;->d:La/M3;

    if-eqz v6, :cond_4b

    iget-object v6, v6, La/M3;->g:La/le;

    goto :goto_36

    :cond_4b
    move-object/from16 v6, v16

    :cond_4c
    :goto_36
    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    add-int/lit8 v7, v36, 0x1

    aget-object v8, v1, v7

    invoke-virtual {v8}, La/M3;->c()I

    move-result v8

    if-eqz v14, :cond_4d

    iget-object v9, v14, La/N3;->G:[La/M3;

    aget-object v9, v9, v36

    iget-object v4, v9, La/M3;->g:La/le;

    aget-object v1, v1, v7

    iget-object v1, v1, La/M3;->g:La/le;

    goto :goto_38

    :cond_4d
    iget-object v4, v10, La/N3;->G:[La/M3;

    aget-object v4, v4, v7

    iget-object v9, v4, La/M3;->d:La/M3;

    if-eqz v9, :cond_4e

    iget-object v4, v9, La/M3;->g:La/le;

    goto :goto_37

    :cond_4e
    move-object/from16 v4, v16

    :goto_37
    aget-object v1, v1, v7

    iget-object v1, v1, La/M3;->g:La/le;

    :goto_38
    if-eqz v9, :cond_4f

    invoke-virtual {v9}, La/M3;->c()I

    move-result v9

    add-int/2addr v8, v9

    :cond_4f
    if-eqz v13, :cond_50

    iget-object v9, v13, La/N3;->G:[La/M3;

    aget-object v9, v9, v7

    invoke-virtual {v9}, La/M3;->c()I

    move-result v9

    add-int/2addr v2, v9

    :cond_50
    if-eqz v3, :cond_54

    if-eqz v6, :cond_54

    if-eqz v4, :cond_54

    if-eqz v1, :cond_54

    if-ne v12, v11, :cond_51

    iget-object v2, v11, La/N3;->G:[La/M3;

    aget-object v2, v2, v36

    invoke-virtual {v2}, La/M3;->c()I

    move-result v2

    :cond_51
    if-ne v12, v0, :cond_52

    iget-object v8, v0, La/N3;->G:[La/M3;

    aget-object v7, v8, v7

    invoke-virtual {v7}, La/M3;->c()I

    move-result v8

    :cond_52
    if-eqz v21, :cond_53

    const/16 v9, 0x8

    :goto_39
    move-object v7, v5

    goto :goto_3a

    :cond_53
    const/4 v9, 0x5

    goto :goto_39

    :goto_3a
    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v17, v4

    move v4, v2

    move-object v2, v3

    move-object v3, v6

    move-object/from16 v6, v17

    move-object/from16 v38, v7

    move-object/from16 v17, v13

    const/16 v13, 0x8

    const/16 v30, 0x5

    move-object v7, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v9}, La/B9;->b(La/le;La/le;IFLa/le;La/le;II)V

    goto :goto_3b

    :cond_54
    move-object/from16 v38, v5

    move-object/from16 v17, v13

    const/16 v13, 0x8

    const/16 v30, 0x5

    :goto_3b
    iget v1, v12, La/N3;->X:I

    if-eq v1, v13, :cond_55

    move-object/from16 v17, v12

    :cond_55
    move-object v12, v14

    move-object/from16 v13, v17

    move-object/from16 v5, v38

    goto/16 :goto_32

    :cond_56
    move-object/from16 v38, v5

    const/16 v13, 0x8

    if-eqz v24, :cond_43

    if-eqz v11, :cond_43

    iget v1, v2, La/T2;->j:I

    if-lez v1, :cond_57

    iget v2, v2, La/T2;->i:I

    if-ne v2, v1, :cond_57

    const/16 v21, 0x1

    goto :goto_3c

    :cond_57
    move/from16 v21, v19

    :goto_3c
    move-object v12, v11

    move-object v14, v12

    :goto_3d
    if-eqz v12, :cond_62

    iget-object v1, v12, La/N3;->d0:[La/N3;

    aget-object v1, v1, p2

    :goto_3e
    if-eqz v1, :cond_58

    iget v2, v1, La/N3;->X:I

    if-ne v2, v13, :cond_58

    iget-object v1, v1, La/N3;->d0:[La/N3;

    aget-object v1, v1, p2

    goto :goto_3e

    :cond_58
    if-eq v12, v11, :cond_60

    if-eq v12, v0, :cond_60

    if-eqz v1, :cond_60

    if-ne v1, v0, :cond_59

    move-object/from16 v1, v16

    :cond_59
    iget-object v2, v12, La/N3;->G:[La/M3;

    aget-object v3, v2, v36

    move-object v4, v2

    iget-object v2, v3, La/M3;->g:La/le;

    iget-object v5, v14, La/N3;->G:[La/M3;

    add-int/lit8 v6, v36, 0x1

    aget-object v5, v5, v6

    iget-object v5, v5, La/M3;->g:La/le;

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    aget-object v7, v4, v6

    invoke-virtual {v7}, La/M3;->c()I

    move-result v7

    if-eqz v1, :cond_5b

    iget-object v4, v1, La/N3;->G:[La/M3;

    aget-object v4, v4, v36

    iget-object v8, v4, La/M3;->g:La/le;

    iget-object v9, v4, La/M3;->d:La/M3;

    if-eqz v9, :cond_5a

    iget-object v9, v9, La/M3;->g:La/le;

    goto :goto_40

    :cond_5a
    move-object/from16 v9, v16

    goto :goto_40

    :cond_5b
    iget-object v8, v0, La/N3;->G:[La/M3;

    aget-object v8, v8, v36

    if-eqz v8, :cond_5c

    iget-object v9, v8, La/M3;->g:La/le;

    goto :goto_3f

    :cond_5c
    move-object/from16 v9, v16

    :goto_3f
    aget-object v4, v4, v6

    iget-object v4, v4, La/M3;->g:La/le;

    move-object/from16 v39, v9

    move-object v9, v4

    move-object v4, v8

    move-object/from16 v8, v39

    :goto_40
    if-eqz v4, :cond_5d

    invoke-virtual {v4}, La/M3;->c()I

    move-result v4

    add-int/2addr v7, v4

    :cond_5d
    iget-object v4, v14, La/N3;->G:[La/M3;

    aget-object v4, v4, v6

    invoke-virtual {v4}, La/M3;->c()I

    move-result v4

    add-int/2addr v4, v3

    move-object v6, v8

    move v8, v7

    move-object v7, v9

    if-eqz v21, :cond_5e

    move v9, v13

    goto :goto_41

    :cond_5e
    const/4 v9, 0x4

    :goto_41
    if-eqz v2, :cond_5f

    if-eqz v5, :cond_5f

    if-eqz v6, :cond_5f

    if-eqz v7, :cond_5f

    move-object v3, v5

    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v17, v1

    const/16 v29, 0x4

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v9}, La/B9;->b(La/le;La/le;IFLa/le;La/le;II)V

    move-object v2, v1

    goto :goto_42

    :cond_5f
    move-object/from16 v2, p1

    move-object/from16 v17, v1

    const/16 v29, 0x4

    :goto_42
    move-object/from16 v1, v17

    goto :goto_43

    :cond_60
    move-object/from16 v2, p1

    const/16 v29, 0x4

    :goto_43
    iget v3, v12, La/N3;->X:I

    if-eq v3, v13, :cond_61

    move-object v14, v12

    :cond_61
    move-object v12, v1

    goto/16 :goto_3d

    :cond_62
    move-object/from16 v2, p1

    iget-object v1, v11, La/N3;->G:[La/M3;

    aget-object v1, v1, v36

    move-object/from16 v7, v38

    iget-object v3, v7, La/N3;->G:[La/M3;

    aget-object v3, v3, v36

    iget-object v3, v3, La/M3;->d:La/M3;

    iget-object v4, v0, La/N3;->G:[La/M3;

    add-int/lit8 v14, v36, 0x1

    aget-object v12, v4, v14

    iget-object v4, v10, La/N3;->G:[La/M3;

    aget-object v4, v4, v14

    iget-object v13, v4, La/M3;->d:La/M3;

    const/4 v9, 0x5

    if-eqz v3, :cond_63

    if-eq v11, v0, :cond_64

    iget-object v4, v1, La/M3;->g:La/le;

    iget-object v3, v3, La/M3;->g:La/le;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    invoke-virtual {v2, v4, v3, v1, v9}, La/B9;->e(La/le;La/le;II)V

    :cond_63
    move-object v1, v2

    goto :goto_44

    :cond_64
    if-eqz v13, :cond_63

    iget-object v2, v1, La/M3;->g:La/le;

    iget-object v3, v3, La/M3;->g:La/le;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v4

    iget-object v6, v12, La/M3;->g:La/le;

    iget-object v7, v13, La/M3;->g:La/le;

    invoke-virtual {v12}, La/M3;->c()I

    move-result v8

    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v9}, La/B9;->b(La/le;La/le;IFLa/le;La/le;II)V

    :goto_44
    if-eqz v13, :cond_65

    if-eq v11, v0, :cond_65

    iget-object v2, v12, La/M3;->g:La/le;

    iget-object v3, v13, La/M3;->g:La/le;

    invoke-virtual {v12}, La/M3;->c()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {v1, v2, v3, v4, v9}, La/B9;->e(La/le;La/le;II)V

    :cond_65
    :goto_45
    if-nez v23, :cond_66

    if-eqz v24, :cond_6c

    :cond_66
    if-eqz v11, :cond_6c

    if-eq v11, v0, :cond_6c

    iget-object v2, v11, La/N3;->G:[La/M3;

    aget-object v3, v2, v36

    iget-object v4, v0, La/N3;->G:[La/M3;

    add-int/lit8 v14, v36, 0x1

    aget-object v4, v4, v14

    iget-object v5, v3, La/M3;->d:La/M3;

    if-eqz v5, :cond_67

    iget-object v5, v5, La/M3;->g:La/le;

    goto :goto_46

    :cond_67
    move-object/from16 v5, v16

    :goto_46
    iget-object v6, v4, La/M3;->d:La/M3;

    if-eqz v6, :cond_68

    iget-object v6, v6, La/M3;->g:La/le;

    goto :goto_47

    :cond_68
    move-object/from16 v6, v16

    :goto_47
    if-eq v10, v0, :cond_6a

    iget-object v6, v10, La/N3;->G:[La/M3;

    aget-object v6, v6, v14

    iget-object v6, v6, La/M3;->d:La/M3;

    if-eqz v6, :cond_69

    iget-object v6, v6, La/M3;->g:La/le;

    move-object/from16 v16, v6

    :cond_69
    move-object/from16 v6, v16

    :cond_6a
    if-ne v11, v0, :cond_6b

    aget-object v4, v2, v14

    :cond_6b
    if-eqz v5, :cond_6c

    if-eqz v6, :cond_6c

    invoke-virtual {v3}, La/M3;->c()I

    move-result v2

    iget-object v0, v0, La/N3;->G:[La/M3;

    aget-object v0, v0, v14

    invoke-virtual {v0}, La/M3;->c()I

    move-result v8

    iget-object v0, v3, La/M3;->g:La/le;

    iget-object v7, v4, La/M3;->g:La/le;

    const/4 v9, 0x5

    move-object v3, v5

    const/high16 v5, 0x3f000000    # 0.5f

    move v4, v2

    move-object v2, v0

    invoke-virtual/range {v1 .. v9}, La/B9;->b(La/le;La/le;IFLa/le;La/le;II)V

    :cond_6c
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v12, v31

    move-object/from16 v13, v35

    move/from16 v14, v36

    goto/16 :goto_2

    :cond_6d
    return-void
.end method
