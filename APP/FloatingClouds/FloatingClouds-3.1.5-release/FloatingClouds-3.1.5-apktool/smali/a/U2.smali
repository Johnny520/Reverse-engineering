.class public final La/U2;
.super La/ih;
.source "SourceFile"


# instance fields
.field public final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/ih;",
            ">;"
        }
    .end annotation
.end field

.field public l:I


# direct methods
.method public constructor <init>(La/N3;I)V
    .locals 4

    invoke-direct {p0, p1}, La/ih;-><init>(La/N3;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/U2;->k:Ljava/util/ArrayList;

    iput p2, p0, La/ih;->f:I

    iget-object p1, p0, La/ih;->b:La/N3;

    invoke-virtual {p1, p2}, La/N3;->k(I)La/N3;

    move-result-object p2

    :goto_0
    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    if-eqz p1, :cond_0

    iget p2, p0, La/ih;->f:I

    invoke-virtual {p1, p2}, La/N3;->k(I)La/N3;

    move-result-object p2

    goto :goto_0

    :cond_0
    iput-object p2, p0, La/ih;->b:La/N3;

    iget p1, p0, La/ih;->f:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-object p1, p2, La/N3;->d:La/K8;

    goto :goto_1

    :cond_1
    if-ne p1, v1, :cond_2

    iget-object p1, p2, La/N3;->e:La/og;

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    iget-object v2, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, La/ih;->f:I

    invoke-virtual {p2, p1}, La/N3;->j(I)La/N3;

    move-result-object p1

    :goto_2
    if-eqz p1, :cond_5

    iget p2, p0, La/ih;->f:I

    if-nez p2, :cond_3

    iget-object p2, p1, La/N3;->d:La/K8;

    goto :goto_3

    :cond_3
    if-ne p2, v1, :cond_4

    iget-object p2, p1, La/N3;->e:La/og;

    goto :goto_3

    :cond_4
    move-object p2, v0

    :goto_3
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p2, p0, La/ih;->f:I

    invoke-virtual {p1, p2}, La/N3;->j(I)La/N3;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La/ih;

    iget v0, p0, La/ih;->f:I

    if-nez v0, :cond_7

    iget-object p2, p2, La/ih;->b:La/N3;

    iput-object p0, p2, La/N3;->b:La/U2;

    goto :goto_4

    :cond_7
    if-ne v0, v1, :cond_6

    iget-object p2, p2, La/ih;->b:La/N3;

    iput-object p0, p2, La/N3;->c:La/U2;

    goto :goto_4

    :cond_8
    iget p1, p0, La/ih;->f:I

    if-nez p1, :cond_9

    iget-object p1, p0, La/ih;->b:La/N3;

    iget-object p1, p1, La/N3;->K:La/N3;

    check-cast p1, La/O3;

    iget-boolean p1, p1, La/O3;->i0:Z

    if-eqz p1, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-le p1, v1, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/ih;

    iget-object p1, p1, La/ih;->b:La/N3;

    iput-object p1, p0, La/ih;->b:La/N3;

    :cond_9
    iget p1, p0, La/ih;->f:I

    if-nez p1, :cond_a

    iget-object p1, p0, La/ih;->b:La/N3;

    iget p1, p1, La/N3;->Z:I

    goto :goto_5

    :cond_a
    iget-object p1, p0, La/ih;->b:La/N3;

    iget p1, p1, La/N3;->a0:I

    :goto_5
    iput p1, p0, La/U2;->l:I

    return-void
.end method


# virtual methods
.method public final a(La/T4;)V
    .locals 29

    move-object/from16 v0, p0

    iget-object v1, v0, La/ih;->h:La/V4;

    iget-boolean v2, v1, La/V4;->j:Z

    if-eqz v2, :cond_59

    iget-object v2, v0, La/ih;->i:La/V4;

    iget-boolean v3, v2, La/V4;->j:Z

    if-nez v3, :cond_0

    goto/16 :goto_34

    :cond_0
    iget-object v3, v0, La/ih;->b:La/N3;

    iget-object v3, v3, La/N3;->K:La/N3;

    if-eqz v3, :cond_1

    instance-of v5, v3, La/O3;

    if-eqz v5, :cond_1

    check-cast v3, La/O3;

    iget-boolean v3, v3, La/O3;->i0:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget v5, v2, La/V4;->g:I

    iget v6, v1, La/V4;->g:I

    sub-int/2addr v5, v6

    iget-object v6, v0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_1
    const/4 v9, -0x1

    const/16 v10, 0x8

    if-ge v8, v7, :cond_2

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/ih;

    iget-object v11, v11, La/ih;->b:La/N3;

    iget v11, v11, La/N3;->X:I

    if-ne v11, v10, :cond_3

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    move v8, v9

    :cond_3
    add-int/lit8 v11, v7, -0x1

    move v12, v11

    :goto_2
    if-ltz v12, :cond_5

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, La/ih;

    iget-object v13, v13, La/ih;->b:La/N3;

    iget v13, v13, La/N3;->X:I

    if-ne v13, v10, :cond_4

    add-int/lit8 v12, v12, -0x1

    goto :goto_2

    :cond_4
    move v9, v12

    :cond_5
    const/4 v12, 0x0

    :goto_3
    sget-object v13, La/N3$a;->c:La/N3$a;

    const/16 p1, 0x0

    const/4 v15, 0x2

    if-ge v12, v15, :cond_14

    move/from16 v20, p1

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_4
    if-ge v4, v7, :cond_11

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v14, v21

    check-cast v14, La/ih;

    iget-object v10, v14, La/ih;->b:La/N3;

    move/from16 v23, v3

    iget v3, v10, La/N3;->X:I

    move/from16 v24, v12

    const/16 v12, 0x8

    if-ne v3, v12, :cond_6

    goto/16 :goto_a

    :cond_6
    add-int/lit8 v19, v19, 0x1

    if-lez v4, :cond_7

    if-lt v4, v8, :cond_7

    iget-object v3, v14, La/ih;->h:La/V4;

    iget v3, v3, La/V4;->f:I

    add-int/2addr v15, v3

    :cond_7
    iget-object v3, v14, La/ih;->e:La/l5;

    iget v12, v3, La/V4;->g:I

    move/from16 v25, v12

    iget-object v12, v14, La/ih;->d:La/N3$a;

    if-eq v12, v13, :cond_8

    const/4 v12, 0x1

    goto :goto_5

    :cond_8
    const/4 v12, 0x0

    :goto_5
    if-eqz v12, :cond_b

    iget v3, v0, La/ih;->f:I

    move/from16 v26, v12

    if-nez v3, :cond_9

    iget-object v12, v10, La/N3;->d:La/K8;

    iget-object v12, v12, La/ih;->e:La/l5;

    iget-boolean v12, v12, La/V4;->j:Z

    if-nez v12, :cond_9

    goto/16 :goto_34

    :cond_9
    const/4 v12, 0x1

    if-ne v3, v12, :cond_a

    iget-object v3, v10, La/N3;->e:La/og;

    iget-object v3, v3, La/ih;->e:La/l5;

    iget-boolean v3, v3, La/V4;->j:Z

    if-nez v3, :cond_a

    goto/16 :goto_34

    :cond_a
    move/from16 v27, v15

    goto :goto_7

    :cond_b
    move/from16 v26, v12

    move/from16 v27, v15

    const/4 v12, 0x1

    iget v15, v14, La/ih;->a:I

    if-ne v15, v12, :cond_c

    if-nez v24, :cond_c

    iget v12, v3, La/l5;->m:I

    add-int/lit8 v18, v18, 0x1

    :goto_6
    const/16 v26, 0x1

    goto :goto_8

    :cond_c
    iget-boolean v3, v3, La/V4;->j:Z

    if-eqz v3, :cond_d

    move/from16 v12, v25

    goto :goto_6

    :cond_d
    :goto_7
    move/from16 v12, v25

    :goto_8
    if-nez v26, :cond_f

    add-int/lit8 v18, v18, 0x1

    iget-object v3, v10, La/N3;->b0:[F

    iget v10, v0, La/ih;->f:I

    aget v3, v3, v10

    cmpl-float v10, v3, p1

    if-ltz v10, :cond_e

    add-float v20, v20, v3

    :cond_e
    move/from16 v15, v27

    goto :goto_9

    :cond_f
    add-int v15, v27, v12

    :goto_9
    if-ge v4, v11, :cond_10

    if-ge v4, v9, :cond_10

    iget-object v3, v14, La/ih;->i:La/V4;

    iget v3, v3, La/V4;->f:I

    neg-int v3, v3

    add-int/2addr v15, v3

    :cond_10
    :goto_a
    add-int/lit8 v4, v4, 0x1

    move/from16 v3, v23

    move/from16 v12, v24

    const/16 v10, 0x8

    goto/16 :goto_4

    :cond_11
    move/from16 v23, v3

    move/from16 v24, v12

    if-lt v15, v5, :cond_13

    if-nez v18, :cond_12

    goto :goto_b

    :cond_12
    add-int/lit8 v12, v24, 0x1

    move/from16 v3, v23

    const/16 v10, 0x8

    goto/16 :goto_3

    :cond_13
    :goto_b
    move/from16 v3, v18

    move/from16 v4, v19

    goto :goto_c

    :cond_14
    move/from16 v23, v3

    move/from16 v20, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    :goto_c
    iget v1, v1, La/V4;->g:I

    if-eqz v23, :cond_15

    iget v1, v2, La/V4;->g:I

    :cond_15
    const/high16 v2, 0x3f000000    # 0.5f

    if-le v15, v5, :cond_17

    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v23, :cond_16

    sub-int v12, v15, v5

    int-to-float v12, v12

    div-float/2addr v12, v10

    add-float/2addr v12, v2

    float-to-int v10, v12

    add-int/2addr v1, v10

    goto :goto_d

    :cond_16
    sub-int v12, v15, v5

    int-to-float v12, v12

    div-float/2addr v12, v10

    add-float/2addr v12, v2

    float-to-int v10, v12

    sub-int/2addr v1, v10

    :cond_17
    :goto_d
    if-lez v3, :cond_28

    sub-int v10, v5, v15

    int-to-float v10, v10

    int-to-float v12, v3

    div-float v12, v10, v12

    add-float/2addr v12, v2

    float-to-int v12, v12

    const/4 v14, 0x0

    const/16 v18, 0x0

    :goto_e
    if-ge v14, v7, :cond_21

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v24, v2

    move-object/from16 v2, v19

    check-cast v2, La/ih;

    move/from16 v19, v1

    iget-object v1, v2, La/ih;->b:La/N3;

    move/from16 v25, v3

    iget v3, v1, La/N3;->X:I

    move/from16 v26, v10

    const/16 v10, 0x8

    if-ne v3, v10, :cond_19

    :cond_18
    move/from16 v27, v12

    move/from16 v28, v14

    goto/16 :goto_13

    :cond_19
    iget-object v3, v2, La/ih;->d:La/N3$a;

    if-ne v3, v13, :cond_18

    iget-object v3, v2, La/ih;->e:La/l5;

    iget-boolean v10, v3, La/V4;->j:Z

    if-nez v10, :cond_18

    cmpl-float v10, v20, p1

    if-lez v10, :cond_1a

    iget-object v10, v1, La/N3;->b0:[F

    move-object/from16 v27, v10

    iget v10, v0, La/ih;->f:I

    aget v10, v27, v10

    mul-float v10, v10, v26

    div-float v10, v10, v20

    add-float v10, v10, v24

    float-to-int v10, v10

    move/from16 v27, v12

    goto :goto_f

    :cond_1a
    move v10, v12

    move/from16 v27, v10

    :goto_f
    iget v12, v0, La/ih;->f:I

    if-nez v12, :cond_1d

    iget v12, v1, La/N3;->n:I

    iget v1, v1, La/N3;->m:I

    iget v2, v2, La/ih;->a:I

    move/from16 v28, v14

    const/4 v14, 0x1

    if-ne v2, v14, :cond_1b

    iget v2, v3, La/l5;->m:I

    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_10

    :cond_1b
    move v2, v10

    :goto_10
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v12, :cond_1c

    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_1c
    if-eq v1, v10, :cond_20

    goto :goto_12

    :cond_1d
    move/from16 v28, v14

    iget v12, v1, La/N3;->q:I

    iget v1, v1, La/N3;->p:I

    iget v2, v2, La/ih;->a:I

    const/4 v14, 0x1

    if-ne v2, v14, :cond_1e

    iget v2, v3, La/l5;->m:I

    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_11

    :cond_1e
    move v2, v10

    :goto_11
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v12, :cond_1f

    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_1f
    if-eq v1, v10, :cond_20

    :goto_12
    add-int/lit8 v18, v18, 0x1

    move v10, v1

    :cond_20
    invoke-virtual {v3, v10}, La/l5;->d(I)V

    :goto_13
    add-int/lit8 v14, v28, 0x1

    move/from16 v1, v19

    move/from16 v2, v24

    move/from16 v3, v25

    move/from16 v10, v26

    move/from16 v12, v27

    goto/16 :goto_e

    :cond_21
    move/from16 v19, v1

    move/from16 v24, v2

    move/from16 v25, v3

    if-lez v18, :cond_25

    sub-int v3, v25, v18

    const/4 v1, 0x0

    const/4 v15, 0x0

    :goto_14
    if-ge v1, v7, :cond_26

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    iget-object v10, v2, La/ih;->b:La/N3;

    iget v10, v10, La/N3;->X:I

    const/16 v12, 0x8

    if-ne v10, v12, :cond_22

    goto :goto_15

    :cond_22
    if-lez v1, :cond_23

    if-lt v1, v8, :cond_23

    iget-object v10, v2, La/ih;->h:La/V4;

    iget v10, v10, La/V4;->f:I

    add-int/2addr v15, v10

    :cond_23
    iget-object v10, v2, La/ih;->e:La/l5;

    iget v10, v10, La/V4;->g:I

    add-int/2addr v15, v10

    if-ge v1, v11, :cond_24

    if-ge v1, v9, :cond_24

    iget-object v2, v2, La/ih;->i:La/V4;

    iget v2, v2, La/V4;->f:I

    neg-int v2, v2

    add-int/2addr v15, v2

    :cond_24
    :goto_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_25
    move/from16 v3, v25

    :cond_26
    iget v1, v0, La/U2;->l:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_27

    if-nez v18, :cond_27

    const/4 v1, 0x0

    iput v1, v0, La/U2;->l:I

    goto :goto_16

    :cond_27
    const/4 v1, 0x0

    goto :goto_16

    :cond_28
    move/from16 v19, v1

    move/from16 v24, v2

    move/from16 v25, v3

    const/4 v1, 0x0

    const/4 v2, 0x2

    :goto_16
    if-le v15, v5, :cond_29

    iput v2, v0, La/U2;->l:I

    :cond_29
    if-lez v4, :cond_2a

    if-nez v3, :cond_2a

    if-ne v8, v9, :cond_2a

    iput v2, v0, La/U2;->l:I

    :cond_2a
    iget v2, v0, La/U2;->l:I

    const/4 v14, 0x1

    if-ne v2, v14, :cond_3b

    if-le v4, v14, :cond_2b

    sub-int/2addr v5, v15

    sub-int/2addr v4, v14

    div-int/2addr v5, v4

    goto :goto_17

    :cond_2b
    if-ne v4, v14, :cond_2c

    sub-int/2addr v5, v15

    const/16 v17, 0x2

    div-int/lit8 v5, v5, 0x2

    goto :goto_17

    :cond_2c
    move v5, v1

    :goto_17
    if-lez v3, :cond_2d

    move v5, v1

    :cond_2d
    move v4, v1

    move/from16 v1, v19

    :goto_18
    if-ge v4, v7, :cond_59

    if-eqz v23, :cond_2e

    add-int/lit8 v2, v4, 0x1

    sub-int v2, v7, v2

    goto :goto_19

    :cond_2e
    move v2, v4

    :goto_19
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    iget-object v3, v2, La/ih;->b:La/N3;

    iget v3, v3, La/N3;->X:I

    iget-object v10, v2, La/ih;->i:La/V4;

    iget-object v12, v2, La/ih;->h:La/V4;

    const/16 v14, 0x8

    if-ne v3, v14, :cond_2f

    invoke-virtual {v12, v1}, La/V4;->d(I)V

    invoke-virtual {v10, v1}, La/V4;->d(I)V

    goto :goto_21

    :cond_2f
    if-lez v4, :cond_31

    if-eqz v23, :cond_30

    sub-int/2addr v1, v5

    goto :goto_1a

    :cond_30
    add-int/2addr v1, v5

    :cond_31
    :goto_1a
    if-lez v4, :cond_33

    if-lt v4, v8, :cond_33

    if-eqz v23, :cond_32

    iget v3, v12, La/V4;->f:I

    sub-int/2addr v1, v3

    goto :goto_1b

    :cond_32
    iget v3, v12, La/V4;->f:I

    add-int/2addr v1, v3

    :cond_33
    :goto_1b
    if-eqz v23, :cond_34

    invoke-virtual {v10, v1}, La/V4;->d(I)V

    goto :goto_1c

    :cond_34
    invoke-virtual {v12, v1}, La/V4;->d(I)V

    :goto_1c
    iget-object v3, v2, La/ih;->e:La/l5;

    iget v14, v3, La/V4;->g:I

    iget-object v15, v2, La/ih;->d:La/N3$a;

    if-ne v15, v13, :cond_35

    iget v15, v2, La/ih;->a:I

    move/from16 v16, v1

    const/4 v1, 0x1

    if-ne v15, v1, :cond_36

    iget v14, v3, La/l5;->m:I

    goto :goto_1d

    :cond_35
    move/from16 v16, v1

    :cond_36
    :goto_1d
    if-eqz v23, :cond_37

    sub-int v1, v16, v14

    goto :goto_1e

    :cond_37
    add-int v1, v16, v14

    :goto_1e
    if-eqz v23, :cond_38

    invoke-virtual {v12, v1}, La/V4;->d(I)V

    :goto_1f
    const/4 v14, 0x1

    goto :goto_20

    :cond_38
    invoke-virtual {v10, v1}, La/V4;->d(I)V

    goto :goto_1f

    :goto_20
    iput-boolean v14, v2, La/ih;->g:Z

    if-ge v4, v11, :cond_3a

    if-ge v4, v9, :cond_3a

    if-eqz v23, :cond_39

    iget v2, v10, La/V4;->f:I

    neg-int v2, v2

    sub-int/2addr v1, v2

    goto :goto_21

    :cond_39
    iget v2, v10, La/V4;->f:I

    neg-int v2, v2

    add-int/2addr v1, v2

    :cond_3a
    :goto_21
    add-int/lit8 v4, v4, 0x1

    goto :goto_18

    :cond_3b
    if-nez v2, :cond_48

    sub-int/2addr v5, v15

    const/16 v22, 0x1

    add-int/lit8 v4, v4, 0x1

    div-int/2addr v5, v4

    if-lez v3, :cond_3c

    move v5, v1

    :cond_3c
    move v4, v1

    move/from16 v1, v19

    :goto_22
    if-ge v4, v7, :cond_59

    if-eqz v23, :cond_3d

    add-int/lit8 v2, v4, 0x1

    sub-int v2, v7, v2

    goto :goto_23

    :cond_3d
    move v2, v4

    :goto_23
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    iget-object v3, v2, La/ih;->b:La/N3;

    iget v3, v3, La/N3;->X:I

    iget-object v10, v2, La/ih;->i:La/V4;

    iget-object v12, v2, La/ih;->h:La/V4;

    const/16 v14, 0x8

    if-ne v3, v14, :cond_3e

    invoke-virtual {v12, v1}, La/V4;->d(I)V

    invoke-virtual {v10, v1}, La/V4;->d(I)V

    goto :goto_29

    :cond_3e
    if-eqz v23, :cond_3f

    sub-int/2addr v1, v5

    goto :goto_24

    :cond_3f
    add-int/2addr v1, v5

    :goto_24
    if-lez v4, :cond_41

    if-lt v4, v8, :cond_41

    if-eqz v23, :cond_40

    iget v3, v12, La/V4;->f:I

    sub-int/2addr v1, v3

    goto :goto_25

    :cond_40
    iget v3, v12, La/V4;->f:I

    add-int/2addr v1, v3

    :cond_41
    :goto_25
    if-eqz v23, :cond_42

    invoke-virtual {v10, v1}, La/V4;->d(I)V

    goto :goto_26

    :cond_42
    invoke-virtual {v12, v1}, La/V4;->d(I)V

    :goto_26
    iget-object v3, v2, La/ih;->e:La/l5;

    iget v14, v3, La/V4;->g:I

    iget-object v15, v2, La/ih;->d:La/N3$a;

    if-ne v15, v13, :cond_43

    iget v2, v2, La/ih;->a:I

    const/4 v15, 0x1

    if-ne v2, v15, :cond_43

    iget v2, v3, La/l5;->m:I

    invoke-static {v14, v2}, Ljava/lang/Math;->min(II)I

    move-result v14

    :cond_43
    if-eqz v23, :cond_44

    sub-int/2addr v1, v14

    goto :goto_27

    :cond_44
    add-int/2addr v1, v14

    :goto_27
    if-eqz v23, :cond_45

    invoke-virtual {v12, v1}, La/V4;->d(I)V

    goto :goto_28

    :cond_45
    invoke-virtual {v10, v1}, La/V4;->d(I)V

    :goto_28
    if-ge v4, v11, :cond_47

    if-ge v4, v9, :cond_47

    if-eqz v23, :cond_46

    iget v2, v10, La/V4;->f:I

    neg-int v2, v2

    sub-int/2addr v1, v2

    goto :goto_29

    :cond_46
    iget v2, v10, La/V4;->f:I

    neg-int v2, v2

    add-int/2addr v1, v2

    :cond_47
    :goto_29
    add-int/lit8 v4, v4, 0x1

    goto :goto_22

    :cond_48
    const/4 v4, 0x2

    if-ne v2, v4, :cond_59

    iget v2, v0, La/ih;->f:I

    if-nez v2, :cond_49

    iget-object v2, v0, La/ih;->b:La/N3;

    iget v2, v2, La/N3;->U:F

    goto :goto_2a

    :cond_49
    iget-object v2, v0, La/ih;->b:La/N3;

    iget v2, v2, La/N3;->V:F

    :goto_2a
    if-eqz v23, :cond_4a

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float v2, v4, v2

    :cond_4a
    sub-int/2addr v5, v15

    int-to-float v4, v5

    mul-float/2addr v4, v2

    add-float v4, v4, v24

    float-to-int v2, v4

    if-ltz v2, :cond_4b

    if-lez v3, :cond_4c

    :cond_4b
    move v2, v1

    :cond_4c
    if-eqz v23, :cond_4d

    sub-int v2, v19, v2

    goto :goto_2b

    :cond_4d
    add-int v2, v19, v2

    :goto_2b
    move v4, v1

    :goto_2c
    if-ge v4, v7, :cond_59

    if-eqz v23, :cond_4e

    add-int/lit8 v1, v4, 0x1

    sub-int v1, v7, v1

    goto :goto_2d

    :cond_4e
    move v1, v4

    :goto_2d
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/ih;

    iget-object v3, v1, La/ih;->b:La/N3;

    iget v3, v3, La/N3;->X:I

    iget-object v5, v1, La/ih;->i:La/V4;

    iget-object v10, v1, La/ih;->h:La/V4;

    const/16 v14, 0x8

    if-ne v3, v14, :cond_4f

    invoke-virtual {v10, v2}, La/V4;->d(I)V

    invoke-virtual {v5, v2}, La/V4;->d(I)V

    const/4 v15, 0x1

    goto :goto_33

    :cond_4f
    if-lez v4, :cond_51

    if-lt v4, v8, :cond_51

    if-eqz v23, :cond_50

    iget v3, v10, La/V4;->f:I

    sub-int/2addr v2, v3

    goto :goto_2e

    :cond_50
    iget v3, v10, La/V4;->f:I

    add-int/2addr v2, v3

    :cond_51
    :goto_2e
    if-eqz v23, :cond_52

    invoke-virtual {v5, v2}, La/V4;->d(I)V

    goto :goto_2f

    :cond_52
    invoke-virtual {v10, v2}, La/V4;->d(I)V

    :goto_2f
    iget-object v3, v1, La/ih;->e:La/l5;

    iget v12, v3, La/V4;->g:I

    iget-object v15, v1, La/ih;->d:La/N3$a;

    if-ne v15, v13, :cond_53

    iget v1, v1, La/ih;->a:I

    const/4 v15, 0x1

    if-ne v1, v15, :cond_54

    iget v12, v3, La/l5;->m:I

    goto :goto_30

    :cond_53
    const/4 v15, 0x1

    :cond_54
    :goto_30
    if-eqz v23, :cond_55

    sub-int/2addr v2, v12

    goto :goto_31

    :cond_55
    add-int/2addr v2, v12

    :goto_31
    if-eqz v23, :cond_56

    invoke-virtual {v10, v2}, La/V4;->d(I)V

    goto :goto_32

    :cond_56
    invoke-virtual {v5, v2}, La/V4;->d(I)V

    :goto_32
    if-ge v4, v11, :cond_58

    if-ge v4, v9, :cond_58

    if-eqz v23, :cond_57

    iget v1, v5, La/V4;->f:I

    neg-int v1, v1

    sub-int/2addr v2, v1

    goto :goto_33

    :cond_57
    iget v1, v5, La/V4;->f:I

    neg-int v1, v1

    add-int/2addr v2, v1

    :cond_58
    :goto_33
    add-int/lit8 v4, v4, 0x1

    goto :goto_2c

    :cond_59
    :goto_34
    return-void
.end method

.method public final d()V
    .locals 7

    iget-object v0, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    invoke-virtual {v2}, La/ih;->d()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    return-void

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/ih;

    iget-object v4, v4, La/ih;->b:La/N3;

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/ih;

    iget-object v0, v0, La/ih;->b:La/N3;

    iget v1, p0, La/ih;->f:I

    iget-object v5, p0, La/ih;->i:La/V4;

    iget-object v6, p0, La/ih;->h:La/V4;

    if-nez v1, :cond_5

    iget-object v1, v4, La/N3;->y:La/M3;

    iget-object v0, v0, La/N3;->A:La/M3;

    invoke-static {v1, v3}, La/ih;->i(La/M3;I)La/V4;

    move-result-object v2

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    invoke-virtual {p0}, La/U2;->m()La/N3;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v1, v4, La/N3;->y:La/M3;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    :cond_2
    if-eqz v2, :cond_3

    invoke-static {v6, v2, v1}, La/ih;->b(La/V4;La/V4;I)V

    :cond_3
    invoke-static {v0, v3}, La/ih;->i(La/M3;I)La/V4;

    move-result-object v1

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    invoke-virtual {p0}, La/U2;->n()La/N3;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v0, v2, La/N3;->A:La/M3;

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    :cond_4
    if-eqz v1, :cond_9

    neg-int v0, v0

    invoke-static {v5, v1, v0}, La/ih;->b(La/V4;La/V4;I)V

    goto :goto_1

    :cond_5
    iget-object v1, v4, La/N3;->z:La/M3;

    iget-object v0, v0, La/N3;->B:La/M3;

    invoke-static {v1, v2}, La/ih;->i(La/M3;I)La/V4;

    move-result-object v3

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    invoke-virtual {p0}, La/U2;->m()La/N3;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v1, v4, La/N3;->z:La/M3;

    invoke-virtual {v1}, La/M3;->c()I

    move-result v1

    :cond_6
    if-eqz v3, :cond_7

    invoke-static {v6, v3, v1}, La/ih;->b(La/V4;La/V4;I)V

    :cond_7
    invoke-static {v0, v2}, La/ih;->i(La/M3;I)La/V4;

    move-result-object v1

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    invoke-virtual {p0}, La/U2;->n()La/N3;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v0, v2, La/N3;->B:La/M3;

    invoke-virtual {v0}, La/M3;->c()I

    move-result v0

    :cond_8
    if-eqz v1, :cond_9

    neg-int v0, v0

    invoke-static {v5, v1, v0}, La/ih;->b(La/V4;La/V4;I)V

    :cond_9
    :goto_1
    iput-object p0, v6, La/V4;->a:La/ih;

    iput-object p0, v5, La/V4;->a:La/ih;

    return-void
.end method

.method public final e()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/ih;

    invoke-virtual {v1}, La/ih;->e()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, La/ih;->c:La/Dd;

    iget-object v0, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/ih;

    invoke-virtual {v1}, La/ih;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j()J
    .locals 8

    iget-object v0, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/ih;

    iget-object v6, v5, La/ih;->h:La/V4;

    iget v6, v6, La/V4;->f:I

    int-to-long v6, v6

    add-long/2addr v2, v6

    invoke-virtual {v5}, La/ih;->j()J

    move-result-wide v6

    add-long/2addr v6, v2

    iget-object v2, v5, La/ih;->i:La/V4;

    iget v2, v2, La/V4;->f:I

    int-to-long v2, v2

    add-long/2addr v2, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public final k()Z
    .locals 5

    iget-object v0, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/ih;

    invoke-virtual {v4}, La/ih;->k()Z

    move-result v4

    if-nez v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final m()La/N3;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/ih;

    iget-object v1, v1, La/ih;->b:La/N3;

    iget v2, v1, La/N3;->X:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final n()La/N3;
    .locals 5

    iget-object v0, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    iget-object v2, v2, La/ih;->b:La/N3;

    iget v3, v2, La/N3;->X:I

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, La/ih;->f:I

    if-nez v0, :cond_0

    const-string v0, "horizontal : "

    goto :goto_0

    :cond_0
    const-string v0, "vertical : "

    :goto_0
    const-string v1, "ChainRun "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La/U2;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ih;

    const-string v3, "<"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "> "

    invoke-static {v0, v2}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    return-object v0
.end method
