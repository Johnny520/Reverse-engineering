.class public final Lbl;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[F

.field public b:Landroid/graphics/ColorMatrix;

.field public c:Landroid/graphics/ColorMatrix;

.field public d:F

.field public e:F

.field public f:F

.field public g:F


# virtual methods
.method public final a(Landroidx/constraintlayout/utils/widget/ImageFilterView;)V
    .locals 36

    move-object/from16 v0, p0

    iget-object v1, v0, Lbl;->a:[F

    iget-object v2, v0, Lbl;->c:Landroid/graphics/ColorMatrix;

    iget-object v3, v0, Lbl;->b:Landroid/graphics/ColorMatrix;

    invoke-virtual {v3}, Landroid/graphics/ColorMatrix;->reset()V

    iget v4, v0, Lbl;->e:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v6, v4, v5

    const/16 v8, 0x12

    const/16 v9, 0x11

    const/16 v10, 0x10

    const/16 v11, 0xf

    const/16 v12, 0xe

    const/16 v13, 0xd

    const/16 v14, 0xc

    const/16 v15, 0xb

    const/16 v16, 0xa

    const/16 v17, 0x9

    const/16 v18, 0x8

    const/16 v19, 0x7

    const/16 v20, 0x6

    const/16 v21, 0x5

    const/16 v22, 0x4

    const/16 v23, 0x13

    const/4 v7, 0x0

    const/16 v24, 0x3

    const/16 v25, 0x2

    const/16 v26, 0x1

    const/16 v27, 0x0

    if-eqz v6, :cond_0

    sub-float v6, v5, v4

    const v28, 0x3e998c7e    # 0.2999f

    mul-float v28, v28, v6

    const v29, 0x3f1645a2    # 0.587f

    mul-float v29, v29, v6

    const v30, 0x3de978d5    # 0.114f

    mul-float v6, v6, v30

    add-float v30, v28, v4

    aput v30, v1, v27

    aput v29, v1, v26

    aput v6, v1, v25

    aput v7, v1, v24

    aput v7, v1, v22

    aput v28, v1, v21

    add-float v30, v29, v4

    aput v30, v1, v20

    aput v6, v1, v19

    aput v7, v1, v18

    aput v7, v1, v17

    aput v28, v1, v16

    aput v29, v1, v15

    add-float/2addr v6, v4

    aput v6, v1, v14

    aput v7, v1, v13

    aput v7, v1, v12

    aput v7, v1, v11

    aput v7, v1, v10

    aput v7, v1, v9

    aput v5, v1, v8

    aput v7, v1, v23

    invoke-virtual {v3, v1}, Landroid/graphics/ColorMatrix;->set([F)V

    move/from16 v4, v26

    goto :goto_0

    :cond_0
    move/from16 v4, v27

    :goto_0
    iget v6, v0, Lbl;->f:F

    cmpl-float v28, v6, v5

    if-eqz v28, :cond_1

    invoke-virtual {v2, v6, v6, v6, v5}, Landroid/graphics/ColorMatrix;->setScale(FFFF)V

    invoke-virtual {v3, v2}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    move/from16 v4, v26

    :cond_1
    iget v6, v0, Lbl;->g:F

    cmpl-float v28, v6, v5

    if-eqz v28, :cond_6

    cmpg-float v4, v6, v7

    if-gtz v4, :cond_2

    const v6, 0x3c23d70a    # 0.01f

    :cond_2
    const v4, 0x459c4000    # 5000.0f

    div-float/2addr v4, v6

    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v4, v6

    const/high16 v6, 0x42840000    # 66.0f

    cmpl-float v28, v4, v6

    const v29, 0x43211e9c

    const v30, 0x42c6f10d

    move/from16 v31, v5

    const/high16 v5, 0x437f0000    # 255.0f

    if-lez v28, :cond_3

    const/high16 v28, 0x42700000    # 60.0f

    move/from16 v32, v6

    sub-float v6, v4, v28

    move/from16 v28, v8

    move/from16 v33, v9

    float-to-double v8, v6

    move v6, v10

    move/from16 v34, v11

    const-wide v10, -0x403ef32580000000L    # -0.13320475816726685

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v10, v10

    const v11, 0x43a4d970

    mul-float/2addr v10, v11

    move v11, v12

    move/from16 v35, v13

    const-wide v12, 0x3fb354f100000000L    # 0.07551485300064087

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    double-to-float v8, v8

    const v9, 0x43900fa3

    mul-float/2addr v8, v9

    goto :goto_1

    :cond_3
    move/from16 v32, v6

    move/from16 v28, v8

    move/from16 v33, v9

    move v6, v10

    move/from16 v34, v11

    move v11, v12

    move/from16 v35, v13

    float-to-double v8, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    double-to-float v8, v8

    mul-float v8, v8, v30

    sub-float v8, v8, v29

    move v10, v5

    :goto_1
    cmpg-float v9, v4, v32

    const v13, 0x430a848a

    if-gez v9, :cond_5

    const/high16 v9, 0x41980000    # 19.0f

    cmpl-float v9, v4, v9

    if-lez v9, :cond_4

    const/high16 v9, 0x41200000    # 10.0f

    sub-float/2addr v4, v9

    move v9, v11

    const v32, 0x439885bc

    float-to-double v11, v4

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    double-to-float v4, v11

    mul-float/2addr v4, v13

    sub-float v4, v4, v32

    goto :goto_2

    :cond_4
    move v9, v11

    const v32, 0x439885bc

    move v4, v7

    goto :goto_2

    :cond_5
    move v9, v11

    const v32, 0x439885bc

    move v4, v5

    :goto_2
    invoke-static {v10, v7}, Ljava/lang/Math;->max(FF)F

    move-result v10

    invoke-static {v5, v10}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v5, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    invoke-static {v4, v7}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/high16 v11, 0x42480000    # 50.0f

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    double-to-float v11, v11

    mul-float v11, v11, v30

    sub-float v11, v11, v29

    const/high16 v12, 0x42200000    # 40.0f

    move/from16 v29, v9

    move/from16 v30, v10

    float-to-double v9, v12

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    double-to-float v9, v9

    mul-float/2addr v9, v13

    sub-float v9, v9, v32

    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    move-result v10

    invoke-static {v5, v10}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-static {v11, v7}, Ljava/lang/Math;->max(FF)F

    move-result v11

    invoke-static {v5, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    invoke-static {v9, v7}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-static {v5, v9}, Ljava/lang/Math;->min(FF)F

    move-result v5

    div-float v10, v30, v10

    div-float/2addr v8, v11

    div-float/2addr v4, v5

    aput v10, v1, v27

    aput v7, v1, v26

    aput v7, v1, v25

    aput v7, v1, v24

    aput v7, v1, v22

    aput v7, v1, v21

    aput v8, v1, v20

    aput v7, v1, v19

    aput v7, v1, v18

    aput v7, v1, v17

    aput v7, v1, v16

    aput v7, v1, v15

    aput v4, v1, v14

    aput v7, v1, v35

    aput v7, v1, v29

    aput v7, v1, v34

    aput v7, v1, v6

    aput v7, v1, v33

    aput v31, v1, v28

    aput v7, v1, v23

    invoke-virtual {v2, v1}, Landroid/graphics/ColorMatrix;->set([F)V

    invoke-virtual {v3, v2}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    move/from16 v4, v26

    goto :goto_3

    :cond_6
    move/from16 v31, v5

    move/from16 v28, v8

    move/from16 v33, v9

    move v6, v10

    move/from16 v34, v11

    move/from16 v29, v12

    move/from16 v35, v13

    :goto_3
    iget v5, v0, Lbl;->d:F

    cmpl-float v8, v5, v31

    if-eqz v8, :cond_7

    aput v5, v1, v27

    aput v7, v1, v26

    aput v7, v1, v25

    aput v7, v1, v24

    aput v7, v1, v22

    aput v7, v1, v21

    aput v5, v1, v20

    aput v7, v1, v19

    aput v7, v1, v18

    aput v7, v1, v17

    aput v7, v1, v16

    aput v7, v1, v15

    aput v5, v1, v14

    aput v7, v1, v35

    aput v7, v1, v29

    aput v7, v1, v34

    aput v7, v1, v6

    aput v7, v1, v33

    aput v31, v1, v28

    aput v7, v1, v23

    invoke-virtual {v2, v1}, Landroid/graphics/ColorMatrix;->set([F)V

    invoke-virtual {v3, v2}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    goto :goto_4

    :cond_7
    move/from16 v26, v4

    :goto_4
    if-eqz v26, :cond_8

    new-instance v1, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {v1, v3}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_8
    move-object/from16 v2, p1

    invoke-virtual {v2}, Landroid/widget/ImageView;->clearColorFilter()V

    return-void
.end method
