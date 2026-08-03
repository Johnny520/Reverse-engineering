.class public final La/H6;
.super La/Yg;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/H6$a;
    }
.end annotation


# instance fields
.field public A0:F

.field public B0:F

.field public C0:F

.field public D0:I

.field public E0:I

.field public F0:I

.field public G0:I

.field public H0:I

.field public I0:I

.field public J0:I

.field public final K0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/H6$a;",
            ">;"
        }
    .end annotation
.end field

.field public L0:[La/N3;

.field public M0:[La/N3;

.field public N0:[I

.field public O0:[La/N3;

.field public P0:I

.field public r0:I

.field public s0:I

.field public t0:I

.field public u0:I

.field public v0:I

.field public w0:I

.field public x0:F

.field public y0:F

.field public z0:F


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, La/Yg;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/H6;->r0:I

    iput v0, p0, La/H6;->s0:I

    iput v0, p0, La/H6;->t0:I

    iput v0, p0, La/H6;->u0:I

    iput v0, p0, La/H6;->v0:I

    iput v0, p0, La/H6;->w0:I

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, La/H6;->x0:F

    iput v1, p0, La/H6;->y0:F

    iput v1, p0, La/H6;->z0:F

    iput v1, p0, La/H6;->A0:F

    iput v1, p0, La/H6;->B0:F

    iput v1, p0, La/H6;->C0:F

    const/4 v1, 0x0

    iput v1, p0, La/H6;->D0:I

    iput v1, p0, La/H6;->E0:I

    const/4 v2, 0x2

    iput v2, p0, La/H6;->F0:I

    iput v2, p0, La/H6;->G0:I

    iput v1, p0, La/H6;->H0:I

    iput v0, p0, La/H6;->I0:I

    iput v1, p0, La/H6;->J0:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/H6;->K0:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, La/H6;->L0:[La/N3;

    iput-object v0, p0, La/H6;->M0:[La/N3;

    iput-object v0, p0, La/H6;->N0:[I

    iput v1, p0, La/H6;->P0:I

    return-void
.end method


# virtual methods
.method public final C(IIII)V
    .locals 36

    move-object/from16 v1, p0

    move/from16 v8, p1

    move/from16 v9, p2

    iget v0, v1, La/f8;->f0:I

    sget-object v12, La/N3$a;->b:La/N3$a;

    sget-object v13, La/N3$a;->c:La/N3$a;

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-lez v0, :cond_8

    iget-object v0, v1, La/N3;->K:La/N3;

    if-eqz v0, :cond_0

    check-cast v0, La/O3;

    iget-object v0, v0, La/O3;->h0:La/e2$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iput v14, v1, La/Yg;->n0:I

    iput v14, v1, La/Yg;->o0:I

    iput-boolean v14, v1, La/Yg;->m0:Z

    return-void

    :cond_1
    move v3, v14

    :goto_1
    iget v4, v1, La/f8;->f0:I

    if-ge v3, v4, :cond_8

    iget-object v4, v1, La/f8;->e0:[La/N3;

    aget-object v4, v4, v3

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    instance-of v5, v4, La/a8;

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v4, v14}, La/N3;->h(I)La/N3$a;

    move-result-object v5

    invoke-virtual {v4, v15}, La/N3;->h(I)La/N3$a;

    move-result-object v6

    if-ne v5, v13, :cond_4

    iget v7, v4, La/N3;->j:I

    if-eq v7, v15, :cond_4

    if-ne v6, v13, :cond_4

    iget v7, v4, La/N3;->k:I

    if-eq v7, v15, :cond_4

    goto :goto_3

    :cond_4
    if-ne v5, v13, :cond_5

    move-object v5, v12

    :cond_5
    if-ne v6, v13, :cond_6

    move-object v6, v12

    :cond_6
    iget-object v7, v1, La/Yg;->p0:La/e2$a;

    iput-object v5, v7, La/e2$a;->a:La/N3$a;

    iput-object v6, v7, La/e2$a;->b:La/N3$a;

    invoke-virtual {v4}, La/N3;->l()I

    move-result v5

    iput v5, v7, La/e2$a;->c:I

    invoke-virtual {v4}, La/N3;->i()I

    move-result v5

    iput v5, v7, La/e2$a;->d:I

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-virtual {v5, v4, v7}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a(La/N3;La/e2$a;)V

    iget v5, v7, La/e2$a;->e:I

    invoke-virtual {v4, v5}, La/N3;->y(I)V

    iget v5, v7, La/e2$a;->f:I

    invoke-virtual {v4, v5}, La/N3;->v(I)V

    iget v5, v7, La/e2$a;->g:I

    iput v5, v4, La/N3;->R:I

    if-lez v5, :cond_7

    move v5, v15

    goto :goto_2

    :cond_7
    move v5, v14

    :goto_2
    iput-boolean v5, v4, La/N3;->w:Z

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_8
    iget v0, v1, La/Yg;->k0:I

    iget v3, v1, La/Yg;->l0:I

    iget v4, v1, La/Yg;->g0:I

    iget v5, v1, La/Yg;->h0:I

    const/4 v6, 0x2

    new-array v7, v6, [I

    sub-int v16, v9, v0

    sub-int v16, v16, v3

    iget v2, v1, La/H6;->J0:I

    if-ne v2, v15, :cond_9

    sub-int v16, p4, v4

    sub-int v16, v16, v5

    :cond_9
    move/from16 v29, v16

    const/4 v6, -0x1

    if-nez v2, :cond_b

    iget v2, v1, La/H6;->r0:I

    if-ne v2, v6, :cond_a

    iput v14, v1, La/H6;->r0:I

    :cond_a
    iget v2, v1, La/H6;->s0:I

    if-ne v2, v6, :cond_d

    iput v14, v1, La/H6;->s0:I

    goto :goto_4

    :cond_b
    iget v2, v1, La/H6;->r0:I

    if-ne v2, v6, :cond_c

    iput v14, v1, La/H6;->r0:I

    :cond_c
    iget v2, v1, La/H6;->s0:I

    if-ne v2, v6, :cond_d

    iput v14, v1, La/H6;->s0:I

    :cond_d
    :goto_4
    iget-object v2, v1, La/f8;->e0:[La/N3;

    move v6, v14

    move/from16 v18, v6

    move/from16 v30, v18

    :goto_5
    iget v14, v1, La/f8;->f0:I

    const/16 v15, 0x8

    if-ge v6, v14, :cond_f

    iget-object v14, v1, La/f8;->e0:[La/N3;

    aget-object v14, v14, v6

    iget v14, v14, La/N3;->X:I

    if-ne v14, v15, :cond_e

    add-int/lit8 v18, v18, 0x1

    :cond_e
    add-int/lit8 v6, v6, 0x1

    const/4 v15, 0x1

    goto :goto_5

    :cond_f
    if-lez v18, :cond_12

    sub-int v14, v14, v18

    new-array v2, v14, [La/N3;

    move/from16 v6, v30

    move v14, v6

    :goto_6
    iget v15, v1, La/f8;->f0:I

    if-ge v6, v15, :cond_11

    iget-object v15, v1, La/f8;->e0:[La/N3;

    aget-object v15, v15, v6

    move/from16 v19, v0

    iget v0, v15, La/N3;->X:I

    move-object/from16 v20, v2

    const/16 v2, 0x8

    if-eq v0, v2, :cond_10

    aput-object v15, v20, v14

    add-int/lit8 v14, v14, 0x1

    :cond_10
    add-int/lit8 v6, v6, 0x1

    move/from16 v0, v19

    move-object/from16 v2, v20

    goto :goto_6

    :cond_11
    move-object/from16 v20, v2

    move v15, v14

    move-object/from16 v14, v20

    :goto_7
    move/from16 v19, v0

    goto :goto_8

    :cond_12
    move v15, v14

    move-object v14, v2

    goto :goto_7

    :goto_8
    iput-object v14, v1, La/H6;->O0:[La/N3;

    iput v15, v1, La/H6;->P0:I

    iget v0, v1, La/H6;->H0:I

    iget-object v2, v1, La/H6;->K0:Ljava/util/ArrayList;

    if-eqz v0, :cond_55

    const/4 v6, 0x1

    if-eq v0, v6, :cond_3a

    const/4 v6, 0x2

    if-eq v0, v6, :cond_13

    move/from16 v29, v3

    move/from16 v32, v4

    move/from16 v33, v5

    move-object/from16 v34, v7

    :goto_9
    move/from16 v16, v19

    :goto_a
    const/16 v31, 0x1

    goto/16 :goto_31

    :cond_13
    iget v0, v1, La/H6;->J0:I

    if-nez v0, :cond_19

    iget v2, v1, La/H6;->I0:I

    if-gtz v2, :cond_18

    move/from16 v2, v30

    move v6, v2

    move v12, v6

    :goto_b
    if-ge v2, v15, :cond_17

    if-lez v2, :cond_14

    iget v13, v1, La/H6;->D0:I

    add-int/2addr v6, v13

    :cond_14
    aget-object v13, v14, v2

    if-nez v13, :cond_15

    move/from16 v18, v2

    move/from16 v2, v29

    goto :goto_c

    :cond_15
    move/from16 v18, v2

    move/from16 v2, v29

    invoke-virtual {v1, v13, v2}, La/H6;->F(La/N3;I)I

    move-result v13

    add-int/2addr v13, v6

    if-le v13, v2, :cond_16

    goto :goto_d

    :cond_16
    add-int/lit8 v12, v12, 0x1

    move v6, v13

    :goto_c
    add-int/lit8 v13, v18, 0x1

    move/from16 v29, v2

    move v2, v13

    goto :goto_b

    :cond_17
    move/from16 v2, v29

    :goto_d
    move/from16 v18, v3

    :goto_e
    move/from16 v13, v30

    goto :goto_12

    :cond_18
    move v6, v2

    move/from16 v2, v29

    move/from16 v18, v3

    move v12, v6

    goto :goto_e

    :cond_19
    move/from16 v2, v29

    iget v6, v1, La/H6;->I0:I

    if-gtz v6, :cond_1e

    move/from16 v6, v30

    move v12, v6

    move v13, v12

    :goto_f
    move/from16 v18, v3

    if-ge v6, v15, :cond_1d

    if-lez v6, :cond_1a

    iget v3, v1, La/H6;->E0:I

    add-int/2addr v12, v3

    :cond_1a
    aget-object v3, v14, v6

    if-nez v3, :cond_1b

    goto :goto_10

    :cond_1b
    invoke-virtual {v1, v3, v2}, La/H6;->E(La/N3;I)I

    move-result v3

    add-int/2addr v3, v12

    if-le v3, v2, :cond_1c

    goto :goto_11

    :cond_1c
    add-int/lit8 v13, v13, 0x1

    move v12, v3

    :goto_10
    add-int/lit8 v6, v6, 0x1

    move/from16 v3, v18

    goto :goto_f

    :cond_1d
    :goto_11
    move/from16 v12, v30

    goto :goto_12

    :cond_1e
    move/from16 v18, v3

    move v13, v6

    goto :goto_11

    :goto_12
    iget-object v3, v1, La/H6;->N0:[I

    if-nez v3, :cond_1f

    const/4 v6, 0x2

    new-array v3, v6, [I

    iput-object v3, v1, La/H6;->N0:[I

    :cond_1f
    if-nez v13, :cond_20

    const/4 v6, 0x1

    if-eq v0, v6, :cond_21

    :cond_20
    if-nez v12, :cond_22

    if-nez v0, :cond_22

    :cond_21
    const/4 v3, 0x1

    goto :goto_13

    :cond_22
    move/from16 v3, v30

    :goto_13
    if-nez v3, :cond_39

    if-nez v0, :cond_23

    int-to-float v6, v15

    int-to-float v13, v12

    div-float/2addr v6, v13

    move/from16 v20, v3

    move/from16 v16, v4

    float-to-double v3, v6

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v13, v3

    goto :goto_14

    :cond_23
    move/from16 v20, v3

    move/from16 v16, v4

    int-to-float v3, v15

    int-to-float v4, v13

    div-float/2addr v3, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v12, v3

    :goto_14
    iget-object v3, v1, La/H6;->M0:[La/N3;

    if-eqz v3, :cond_24

    array-length v4, v3

    if-ge v4, v12, :cond_25

    :cond_24
    const/4 v4, 0x0

    goto :goto_15

    :cond_25
    const/4 v4, 0x0

    invoke-static {v3, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_16

    :goto_15
    new-array v3, v12, [La/N3;

    iput-object v3, v1, La/H6;->M0:[La/N3;

    :goto_16
    iget-object v3, v1, La/H6;->L0:[La/N3;

    if-eqz v3, :cond_27

    array-length v6, v3

    if-ge v6, v13, :cond_26

    goto :goto_17

    :cond_26
    invoke-static {v3, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_18

    :cond_27
    :goto_17
    new-array v3, v13, [La/N3;

    iput-object v3, v1, La/H6;->L0:[La/N3;

    :goto_18
    move/from16 v3, v30

    :goto_19
    if-ge v3, v12, :cond_30

    move/from16 v4, v30

    :goto_1a
    if-ge v4, v13, :cond_2f

    mul-int v6, v4, v12

    add-int/2addr v6, v3

    move/from16 v21, v3

    const/4 v3, 0x1

    if-ne v0, v3, :cond_28

    mul-int v3, v21, v13

    add-int v6, v3, v4

    :cond_28
    array-length v3, v14

    if-lt v6, v3, :cond_29

    :goto_1b
    move/from16 v22, v0

    goto :goto_1c

    :cond_29
    aget-object v3, v14, v6

    if-nez v3, :cond_2a

    goto :goto_1b

    :cond_2a
    invoke-virtual {v1, v3, v2}, La/H6;->F(La/N3;I)I

    move-result v6

    move/from16 v22, v0

    iget-object v0, v1, La/H6;->M0:[La/N3;

    aget-object v0, v0, v21

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, La/N3;->l()I

    move-result v0

    if-ge v0, v6, :cond_2c

    :cond_2b
    iget-object v0, v1, La/H6;->M0:[La/N3;

    aput-object v3, v0, v21

    :cond_2c
    invoke-virtual {v1, v3, v2}, La/H6;->E(La/N3;I)I

    move-result v0

    iget-object v6, v1, La/H6;->L0:[La/N3;

    aget-object v6, v6, v4

    if-eqz v6, :cond_2d

    invoke-virtual {v6}, La/N3;->i()I

    move-result v6

    if-ge v6, v0, :cond_2e

    :cond_2d
    iget-object v0, v1, La/H6;->L0:[La/N3;

    aput-object v3, v0, v4

    :cond_2e
    :goto_1c
    add-int/lit8 v4, v4, 0x1

    move/from16 v3, v21

    move/from16 v0, v22

    goto :goto_1a

    :cond_2f
    move/from16 v22, v0

    move/from16 v21, v3

    add-int/lit8 v3, v21, 0x1

    goto :goto_19

    :cond_30
    move/from16 v22, v0

    move/from16 v0, v30

    move v3, v0

    :goto_1d
    if-ge v0, v12, :cond_33

    iget-object v4, v1, La/H6;->M0:[La/N3;

    aget-object v4, v4, v0

    if-eqz v4, :cond_32

    if-lez v0, :cond_31

    iget v6, v1, La/H6;->D0:I

    add-int/2addr v3, v6

    :cond_31
    invoke-virtual {v1, v4, v2}, La/H6;->F(La/N3;I)I

    move-result v4

    add-int/2addr v4, v3

    move v3, v4

    :cond_32
    add-int/lit8 v0, v0, 0x1

    goto :goto_1d

    :cond_33
    move/from16 v0, v30

    move v4, v0

    :goto_1e
    if-ge v0, v13, :cond_36

    iget-object v6, v1, La/H6;->L0:[La/N3;

    aget-object v6, v6, v0

    move/from16 v21, v0

    if-eqz v6, :cond_35

    if-lez v0, :cond_34

    iget v0, v1, La/H6;->E0:I

    add-int/2addr v4, v0

    :cond_34
    invoke-virtual {v1, v6, v2}, La/H6;->E(La/N3;I)I

    move-result v0

    add-int/2addr v0, v4

    move v4, v0

    :cond_35
    add-int/lit8 v0, v21, 0x1

    goto :goto_1e

    :cond_36
    aput v3, v7, v30

    const/4 v6, 0x1

    aput v4, v7, v6

    if-nez v22, :cond_38

    if-le v3, v2, :cond_37

    if-le v12, v6, :cond_37

    add-int/lit8 v12, v12, -0x1

    :goto_1f
    move/from16 v3, v20

    goto :goto_20

    :cond_37
    move v3, v6

    goto :goto_20

    :cond_38
    if-le v4, v2, :cond_37

    if-le v13, v6, :cond_37

    add-int/lit8 v13, v13, -0x1

    goto :goto_1f

    :goto_20
    move/from16 v4, v16

    move/from16 v0, v22

    goto/16 :goto_13

    :cond_39
    move/from16 v16, v4

    const/4 v6, 0x1

    iget-object v0, v1, La/H6;->N0:[I

    aput v12, v0, v30

    aput v13, v0, v6

    move/from16 v33, v5

    move-object/from16 v34, v7

    move/from16 v32, v16

    move/from16 v29, v18

    goto/16 :goto_9

    :cond_3a
    move-object v0, v2

    move/from16 v18, v3

    move/from16 v16, v4

    move/from16 v28, v29

    iget v2, v1, La/H6;->J0:I

    if-nez v15, :cond_3b

    move/from16 v33, v5

    move-object/from16 v34, v7

    move/from16 v32, v16

    move/from16 v29, v18

    goto/16 :goto_9

    :cond_3b
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    move-object v3, v0

    new-instance v0, La/H6$a;

    move-object v4, v3

    iget-object v3, v1, La/N3;->y:La/M3;

    move-object v6, v4

    iget-object v4, v1, La/N3;->z:La/M3;

    move/from16 v17, v5

    iget-object v5, v1, La/N3;->A:La/M3;

    move-object/from16 v20, v6

    iget-object v6, v1, La/N3;->B:La/M3;

    move-object/from16 v34, v7

    move-object/from16 v35, v14

    move/from16 v32, v16

    move/from16 v33, v17

    move/from16 v29, v18

    move/from16 v16, v19

    move-object/from16 v14, v20

    move/from16 v7, v28

    invoke-direct/range {v0 .. v7}, La/H6$a;-><init>(La/H6;ILa/M3;La/M3;La/M3;La/M3;I)V

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_42

    move/from16 v3, v30

    move v4, v3

    move v5, v4

    :goto_21
    if-ge v3, v15, :cond_4a

    aget-object v6, v35, v3

    invoke-virtual {v1, v6, v7}, La/H6;->F(La/N3;I)I

    move-result v17

    move/from16 v19, v2

    iget-object v2, v6, La/N3;->J:[La/N3$a;

    aget-object v2, v2, v30

    if-ne v2, v13, :cond_3c

    add-int/lit8 v4, v4, 0x1

    :cond_3c
    move/from16 v18, v4

    if-eq v5, v7, :cond_3d

    iget v2, v1, La/H6;->D0:I

    add-int/2addr v2, v5

    add-int v2, v2, v17

    if-le v2, v7, :cond_3e

    :cond_3d
    iget-object v2, v0, La/H6$a;->b:La/N3;

    if-eqz v2, :cond_3e

    const/4 v2, 0x1

    goto :goto_22

    :cond_3e
    move/from16 v2, v30

    :goto_22
    if-nez v2, :cond_3f

    if-lez v3, :cond_3f

    iget v4, v1, La/H6;->I0:I

    if-lez v4, :cond_3f

    rem-int v4, v3, v4

    if-nez v4, :cond_3f

    const/4 v2, 0x1

    :cond_3f
    if-eqz v2, :cond_41

    new-instance v0, La/H6$a;

    move v2, v3

    iget-object v3, v1, La/N3;->y:La/M3;

    iget-object v4, v1, La/N3;->z:La/M3;

    iget-object v5, v1, La/N3;->A:La/M3;

    move-object/from16 v20, v6

    iget-object v6, v1, La/N3;->B:La/M3;

    move v11, v2

    move/from16 v2, v19

    move-object/from16 v10, v20

    invoke-direct/range {v0 .. v7}, La/H6$a;-><init>(La/H6;ILa/M3;La/M3;La/M3;La/M3;I)V

    iput v11, v0, La/H6$a;->n:I

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_40
    move/from16 v5, v17

    goto :goto_23

    :cond_41
    move v11, v3

    move-object v10, v6

    move/from16 v2, v19

    if-lez v11, :cond_40

    iget v3, v1, La/H6;->D0:I

    add-int v3, v3, v17

    add-int/2addr v3, v5

    move v5, v3

    :goto_23
    invoke-virtual {v0, v10}, La/H6$a;->a(La/N3;)V

    add-int/lit8 v3, v11, 0x1

    move/from16 v4, v18

    goto :goto_21

    :cond_42
    move/from16 v3, v30

    move v4, v3

    move v10, v4

    :goto_24
    if-ge v10, v15, :cond_49

    aget-object v11, v35, v10

    invoke-virtual {v1, v11, v7}, La/H6;->E(La/N3;I)I

    move-result v17

    iget-object v5, v11, La/N3;->J:[La/N3$a;

    const/16 v31, 0x1

    aget-object v5, v5, v31

    if-ne v5, v13, :cond_43

    add-int/lit8 v3, v3, 0x1

    :cond_43
    move/from16 v18, v3

    if-eq v4, v7, :cond_44

    iget v3, v1, La/H6;->E0:I

    add-int/2addr v3, v4

    add-int v3, v3, v17

    if-le v3, v7, :cond_45

    :cond_44
    iget-object v3, v0, La/H6$a;->b:La/N3;

    if-eqz v3, :cond_45

    const/4 v3, 0x1

    goto :goto_25

    :cond_45
    move/from16 v3, v30

    :goto_25
    if-nez v3, :cond_46

    if-lez v10, :cond_46

    iget v5, v1, La/H6;->I0:I

    if-lez v5, :cond_46

    rem-int v5, v10, v5

    if-nez v5, :cond_46

    const/4 v3, 0x1

    :cond_46
    if-eqz v3, :cond_48

    new-instance v0, La/H6$a;

    iget-object v3, v1, La/N3;->y:La/M3;

    iget-object v4, v1, La/N3;->z:La/M3;

    iget-object v5, v1, La/N3;->A:La/M3;

    iget-object v6, v1, La/N3;->B:La/M3;

    invoke-direct/range {v0 .. v7}, La/H6$a;-><init>(La/H6;ILa/M3;La/M3;La/M3;La/M3;I)V

    iput v10, v0, La/H6$a;->n:I

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_47
    move/from16 v4, v17

    goto :goto_26

    :cond_48
    if-lez v10, :cond_47

    iget v3, v1, La/H6;->E0:I

    add-int v3, v3, v17

    add-int/2addr v3, v4

    move v4, v3

    :goto_26
    invoke-virtual {v0, v11}, La/H6$a;->a(La/N3;)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v3, v18

    goto :goto_24

    :cond_49
    move v4, v3

    :cond_4a
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v3, v1, La/Yg;->k0:I

    iget v5, v1, La/Yg;->g0:I

    iget v6, v1, La/Yg;->l0:I

    iget v10, v1, La/Yg;->h0:I

    iget-object v11, v1, La/N3;->J:[La/N3$a;

    aget-object v13, v11, v30

    if-eq v13, v12, :cond_4c

    const/16 v31, 0x1

    aget-object v11, v11, v31

    if-ne v11, v12, :cond_4b

    goto :goto_27

    :cond_4b
    move/from16 v11, v30

    goto :goto_28

    :cond_4c
    :goto_27
    const/4 v11, 0x1

    :goto_28
    if-lez v4, :cond_4e

    if-eqz v11, :cond_4e

    move/from16 v4, v30

    :goto_29
    if-ge v4, v0, :cond_4e

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/H6$a;

    if-nez v2, :cond_4d

    invoke-virtual {v11}, La/H6$a;->d()I

    move-result v12

    sub-int v12, v7, v12

    invoke-virtual {v11, v12}, La/H6$a;->e(I)V

    goto :goto_2a

    :cond_4d
    invoke-virtual {v11}, La/H6$a;->c()I

    move-result v12

    sub-int v12, v7, v12

    invoke-virtual {v11, v12}, La/H6$a;->e(I)V

    :goto_2a
    add-int/lit8 v4, v4, 0x1

    goto :goto_29

    :cond_4e
    iget-object v4, v1, La/N3;->B:La/M3;

    iget-object v11, v1, La/N3;->A:La/M3;

    iget-object v12, v1, La/N3;->y:La/M3;

    iget-object v13, v1, La/N3;->z:La/M3;

    move/from16 v24, v3

    move-object/from16 v23, v4

    move/from16 v25, v5

    move/from16 v26, v6

    move/from16 v27, v10

    move-object/from16 v22, v11

    move-object/from16 v20, v12

    move-object/from16 v21, v13

    move/from16 v3, v30

    move v5, v3

    move v6, v5

    :goto_2b
    if-ge v3, v0, :cond_54

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/H6$a;

    if-nez v2, :cond_51

    add-int/lit8 v12, v0, -0x1

    if-ge v3, v12, :cond_4f

    add-int/lit8 v12, v3, 0x1

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/H6$a;

    iget-object v12, v12, La/H6$a;->b:La/N3;

    iget-object v12, v12, La/N3;->z:La/M3;

    move-object/from16 v23, v12

    move/from16 v27, v30

    goto :goto_2c

    :cond_4f
    iget v12, v1, La/Yg;->h0:I

    move-object/from16 v23, v4

    move/from16 v27, v12

    :goto_2c
    iget-object v12, v10, La/H6$a;->b:La/N3;

    iget-object v12, v12, La/N3;->B:La/M3;

    move/from16 v19, v2

    move/from16 v28, v7

    move-object/from16 v18, v10

    invoke-virtual/range {v18 .. v28}, La/H6$a;->f(ILa/M3;La/M3;La/M3;La/M3;IIIII)V

    invoke-virtual {v10}, La/H6$a;->d()I

    move-result v13

    invoke-static {v5, v13}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v10}, La/H6$a;->c()I

    move-result v10

    add-int/2addr v10, v6

    if-lez v3, :cond_50

    iget v6, v1, La/H6;->E0:I

    add-int/2addr v10, v6

    :cond_50
    move v6, v10

    move-object/from16 v21, v12

    move/from16 v25, v30

    goto :goto_2e

    :cond_51
    add-int/lit8 v12, v0, -0x1

    if-ge v3, v12, :cond_52

    add-int/lit8 v12, v3, 0x1

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/H6$a;

    iget-object v12, v12, La/H6$a;->b:La/N3;

    iget-object v12, v12, La/N3;->y:La/M3;

    move-object/from16 v22, v12

    move/from16 v26, v30

    goto :goto_2d

    :cond_52
    iget v12, v1, La/Yg;->l0:I

    move-object/from16 v22, v11

    move/from16 v26, v12

    :goto_2d
    iget-object v12, v10, La/H6$a;->b:La/N3;

    iget-object v12, v12, La/N3;->A:La/M3;

    move/from16 v19, v2

    move/from16 v28, v7

    move-object/from16 v18, v10

    invoke-virtual/range {v18 .. v28}, La/H6$a;->f(ILa/M3;La/M3;La/M3;La/M3;IIIII)V

    invoke-virtual/range {v18 .. v18}, La/H6$a;->d()I

    move-result v10

    add-int/2addr v10, v5

    invoke-virtual/range {v18 .. v18}, La/H6$a;->c()I

    move-result v5

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-lez v3, :cond_53

    iget v6, v1, La/H6;->D0:I

    add-int/2addr v10, v6

    :cond_53
    move v6, v5

    move v5, v10

    move-object/from16 v20, v12

    move/from16 v24, v30

    :goto_2e
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2b

    :cond_54
    aput v5, v34, v30

    const/16 v31, 0x1

    aput v6, v34, v31

    goto/16 :goto_a

    :cond_55
    move/from16 v32, v4

    move/from16 v33, v5

    move-object/from16 v34, v7

    move-object/from16 v35, v14

    move/from16 v16, v19

    move/from16 v7, v29

    move-object v14, v2

    move/from16 v29, v3

    iget v2, v1, La/H6;->J0:I

    if-nez v15, :cond_56

    goto/16 :goto_a

    :cond_56
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_57

    new-instance v0, La/H6$a;

    iget-object v3, v1, La/N3;->y:La/M3;

    iget-object v4, v1, La/N3;->z:La/M3;

    iget-object v5, v1, La/N3;->A:La/M3;

    iget-object v6, v1, La/N3;->B:La/M3;

    invoke-direct/range {v0 .. v7}, La/H6$a;-><init>(La/H6;ILa/M3;La/M3;La/M3;La/M3;I)V

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2f

    :cond_57
    move/from16 v0, v30

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/H6$a;

    iput v0, v3, La/H6$a;->c:I

    const/4 v4, 0x0

    iput-object v4, v3, La/H6$a;->b:La/N3;

    iput v0, v3, La/H6$a;->l:I

    iput v0, v3, La/H6$a;->m:I

    iput v0, v3, La/H6$a;->n:I

    iput v0, v3, La/H6$a;->o:I

    iput v0, v3, La/H6$a;->p:I

    iget v0, v1, La/Yg;->k0:I

    iget v4, v1, La/Yg;->g0:I

    iget v5, v1, La/Yg;->l0:I

    iget v6, v1, La/Yg;->h0:I

    iget-object v10, v1, La/N3;->A:La/M3;

    iget-object v11, v1, La/N3;->B:La/M3;

    iget-object v12, v1, La/N3;->y:La/M3;

    iget-object v13, v1, La/N3;->z:La/M3;

    move/from16 v24, v0

    move/from16 v19, v2

    move-object/from16 v18, v3

    move/from16 v25, v4

    move/from16 v26, v5

    move/from16 v27, v6

    move/from16 v28, v7

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-object/from16 v20, v12

    move-object/from16 v21, v13

    invoke-virtual/range {v18 .. v28}, La/H6$a;->f(ILa/M3;La/M3;La/M3;La/M3;IIIII)V

    move-object/from16 v0, v18

    :goto_2f
    const/4 v2, 0x0

    :goto_30
    if-ge v2, v15, :cond_58

    aget-object v3, v35, v2

    invoke-virtual {v0, v3}, La/H6$a;->a(La/N3;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_30

    :cond_58
    invoke-virtual {v0}, La/H6$a;->d()I

    move-result v2

    const/16 v30, 0x0

    aput v2, v34, v30

    invoke-virtual {v0}, La/H6$a;->c()I

    move-result v0

    const/16 v31, 0x1

    aput v0, v34, v31

    :goto_31
    aget v0, v34, v30

    add-int v0, v0, v16

    add-int v0, v0, v29

    aget v2, v34, v31

    add-int v2, v2, v32

    add-int v2, v2, v33

    const/high16 v3, -0x80000000

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v8, v4, :cond_59

    move/from16 v10, p3

    move v0, v9

    goto :goto_32

    :cond_59
    if-ne v8, v3, :cond_5a

    invoke-static {v0, v9}, Ljava/lang/Math;->min(II)I

    move-result v0

    move/from16 v10, p3

    goto :goto_32

    :cond_5a
    move/from16 v10, p3

    if-nez v8, :cond_5b

    goto :goto_32

    :cond_5b
    move/from16 v0, v30

    :goto_32
    if-ne v10, v4, :cond_5c

    move/from16 v2, p4

    goto :goto_33

    :cond_5c
    if-ne v10, v3, :cond_5d

    move/from16 v11, p4

    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_33

    :cond_5d
    if-nez v10, :cond_5e

    goto :goto_33

    :cond_5e
    move/from16 v2, v30

    :goto_33
    iput v0, v1, La/Yg;->n0:I

    iput v2, v1, La/Yg;->o0:I

    invoke-virtual {v1, v0}, La/N3;->y(I)V

    invoke-virtual {v1, v2}, La/N3;->v(I)V

    iget v0, v1, La/f8;->f0:I

    if-lez v0, :cond_5f

    move/from16 v14, v31

    goto :goto_34

    :cond_5f
    move/from16 v14, v30

    :goto_34
    iput-boolean v14, v1, La/Yg;->m0:Z

    return-void
.end method

.method public final E(La/N3;I)I
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, La/N3;->J:[La/N3$a;

    const/4 v2, 0x1

    aget-object v3, v1, v2

    sget-object v4, La/N3$a;->c:La/N3$a;

    if-ne v3, v4, :cond_5

    iget v3, p1, La/N3;->k:I

    if-nez v3, :cond_1

    return v0

    :cond_1
    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    iget v2, p1, La/N3;->r:F

    int-to-float p2, p2

    mul-float/2addr v2, p2

    float-to-int v8, v2

    invoke-virtual {p1}, La/N3;->i()I

    move-result p2

    if-eq v8, p2, :cond_2

    aget-object v5, v1, v0

    invoke-virtual {p1}, La/N3;->l()I

    move-result v6

    sget-object v7, La/N3$a;->a:La/N3$a;

    move-object v3, p0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, La/Yg;->D(La/N3;La/N3$a;ILa/N3$a;I)V

    :cond_2
    return v8

    :cond_3
    move-object v4, p1

    if-ne v3, v2, :cond_4

    invoke-virtual {v4}, La/N3;->i()I

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x3

    if-ne v3, p1, :cond_6

    invoke-virtual {v4}, La/N3;->l()I

    move-result p1

    int-to-float p1, p1

    iget p2, v4, La/N3;->N:F

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    return p1

    :cond_5
    move-object v4, p1

    :cond_6
    invoke-virtual {v4}, La/N3;->i()I

    move-result p1

    return p1
.end method

.method public final F(La/N3;I)I
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, La/N3;->J:[La/N3$a;

    aget-object v2, v1, v0

    sget-object v3, La/N3$a;->c:La/N3$a;

    if-ne v2, v3, :cond_5

    iget v2, p1, La/N3;->j:I

    if-nez v2, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x2

    const/4 v3, 0x1

    if-ne v2, v0, :cond_3

    iget v0, p1, La/N3;->o:F

    int-to-float p2, p2

    mul-float/2addr v0, p2

    float-to-int v7, v0

    invoke-virtual {p1}, La/N3;->l()I

    move-result p2

    if-eq v7, p2, :cond_2

    sget-object v6, La/N3$a;->a:La/N3$a;

    aget-object v8, v1, v3

    invoke-virtual {p1}, La/N3;->i()I

    move-result v9

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, La/Yg;->D(La/N3;La/N3$a;ILa/N3$a;I)V

    :cond_2
    return v7

    :cond_3
    move-object v5, p1

    if-ne v2, v3, :cond_4

    invoke-virtual {v5}, La/N3;->l()I

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x3

    if-ne v2, p1, :cond_6

    invoke-virtual {v5}, La/N3;->i()I

    move-result p1

    int-to-float p1, p1

    iget p2, v5, La/N3;->N:F

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    return p1

    :cond_5
    move-object v5, p1

    :cond_6
    invoke-virtual {v5}, La/N3;->l()I

    move-result p1

    return p1
.end method

.method public final a(La/B9;)V
    .locals 11

    invoke-super {p0, p1}, La/N3;->a(La/B9;)V

    iget-object p1, p0, La/N3;->K:La/N3;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p1, La/O3;

    iget-boolean p1, p1, La/O3;->i0:Z

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iget v1, p0, La/H6;->H0:I

    iget-object v2, p0, La/H6;->K0:Ljava/util/ArrayList;

    const/4 v3, 0x1

    if-eqz v1, :cond_19

    if-eq v1, v3, :cond_17

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto/16 :goto_c

    :cond_1
    iget-object v1, p0, La/H6;->N0:[I

    if-eqz v1, :cond_1a

    iget-object v1, p0, La/H6;->M0:[La/N3;

    if-eqz v1, :cond_1a

    iget-object v1, p0, La/H6;->L0:[La/N3;

    if-nez v1, :cond_2

    goto/16 :goto_c

    :cond_2
    move v1, v0

    :goto_1
    iget v2, p0, La/H6;->P0:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, La/H6;->O0:[La/N3;

    aget-object v2, v2, v1

    invoke-virtual {v2}, La/N3;->t()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, La/H6;->N0:[I

    aget v2, v1, v0

    aget v1, v1, v3

    const/4 v4, 0x0

    move v5, v0

    :goto_2
    const/16 v6, 0x8

    if-ge v5, v2, :cond_a

    if-eqz p1, :cond_4

    sub-int v7, v2, v5

    sub-int/2addr v7, v3

    goto :goto_3

    :cond_4
    move v7, v5

    :goto_3
    iget-object v8, p0, La/H6;->M0:[La/N3;

    aget-object v7, v8, v7

    if-eqz v7, :cond_9

    iget v8, v7, La/N3;->X:I

    if-ne v8, v6, :cond_5

    goto :goto_4

    :cond_5
    iget-object v6, v7, La/N3;->y:La/M3;

    if-nez v5, :cond_6

    iget v8, p0, La/Yg;->k0:I

    iget-object v9, p0, La/N3;->y:La/M3;

    invoke-virtual {v7, v6, v9, v8}, La/N3;->e(La/M3;La/M3;I)V

    iget v8, p0, La/H6;->r0:I

    iput v8, v7, La/N3;->Z:I

    iget v8, p0, La/H6;->x0:F

    iput v8, v7, La/N3;->U:F

    :cond_6
    add-int/lit8 v8, v2, -0x1

    if-ne v5, v8, :cond_7

    iget v8, p0, La/Yg;->l0:I

    iget-object v9, v7, La/N3;->A:La/M3;

    iget-object v10, p0, La/N3;->A:La/M3;

    invoke-virtual {v7, v9, v10, v8}, La/N3;->e(La/M3;La/M3;I)V

    :cond_7
    if-lez v5, :cond_8

    iget-object v8, v4, La/N3;->A:La/M3;

    iget v9, p0, La/H6;->D0:I

    invoke-virtual {v7, v6, v8, v9}, La/N3;->e(La/M3;La/M3;I)V

    iget-object v8, v4, La/N3;->A:La/M3;

    invoke-virtual {v4, v8, v6, v0}, La/N3;->e(La/M3;La/M3;I)V

    :cond_8
    move-object v4, v7

    :cond_9
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_a
    move p1, v0

    :goto_5
    if-ge p1, v1, :cond_10

    iget-object v5, p0, La/H6;->L0:[La/N3;

    aget-object v5, v5, p1

    if-eqz v5, :cond_f

    iget v7, v5, La/N3;->X:I

    if-ne v7, v6, :cond_b

    goto :goto_6

    :cond_b
    iget-object v7, v5, La/N3;->z:La/M3;

    if-nez p1, :cond_c

    iget v8, p0, La/Yg;->g0:I

    iget-object v9, p0, La/N3;->z:La/M3;

    invoke-virtual {v5, v7, v9, v8}, La/N3;->e(La/M3;La/M3;I)V

    iget v8, p0, La/H6;->s0:I

    iput v8, v5, La/N3;->a0:I

    iget v8, p0, La/H6;->y0:F

    iput v8, v5, La/N3;->V:F

    :cond_c
    add-int/lit8 v8, v1, -0x1

    if-ne p1, v8, :cond_d

    iget v8, p0, La/Yg;->h0:I

    iget-object v9, v5, La/N3;->B:La/M3;

    iget-object v10, p0, La/N3;->B:La/M3;

    invoke-virtual {v5, v9, v10, v8}, La/N3;->e(La/M3;La/M3;I)V

    :cond_d
    if-lez p1, :cond_e

    iget-object v8, v4, La/N3;->B:La/M3;

    iget v9, p0, La/H6;->E0:I

    invoke-virtual {v5, v7, v8, v9}, La/N3;->e(La/M3;La/M3;I)V

    iget-object v8, v4, La/N3;->B:La/M3;

    invoke-virtual {v4, v8, v7, v0}, La/N3;->e(La/M3;La/M3;I)V

    :cond_e
    move-object v4, v5

    :cond_f
    :goto_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_10
    move p1, v0

    :goto_7
    if-ge p1, v2, :cond_1a

    move v4, v0

    :goto_8
    if-ge v4, v1, :cond_16

    mul-int v5, v4, v2

    add-int/2addr v5, p1

    iget v7, p0, La/H6;->J0:I

    if-ne v7, v3, :cond_11

    mul-int v5, p1, v1

    add-int/2addr v5, v4

    :cond_11
    iget-object v7, p0, La/H6;->O0:[La/N3;

    array-length v8, v7

    if-lt v5, v8, :cond_12

    goto :goto_9

    :cond_12
    aget-object v5, v7, v5

    if-eqz v5, :cond_15

    iget v7, v5, La/N3;->X:I

    if-ne v7, v6, :cond_13

    goto :goto_9

    :cond_13
    iget-object v7, p0, La/H6;->M0:[La/N3;

    aget-object v7, v7, p1

    iget-object v8, p0, La/H6;->L0:[La/N3;

    aget-object v8, v8, v4

    if-eq v5, v7, :cond_14

    iget-object v9, v7, La/N3;->y:La/M3;

    iget-object v10, v5, La/N3;->y:La/M3;

    invoke-virtual {v5, v10, v9, v0}, La/N3;->e(La/M3;La/M3;I)V

    iget-object v9, v5, La/N3;->A:La/M3;

    iget-object v7, v7, La/N3;->A:La/M3;

    invoke-virtual {v5, v9, v7, v0}, La/N3;->e(La/M3;La/M3;I)V

    :cond_14
    if-eq v5, v8, :cond_15

    iget-object v7, v8, La/N3;->z:La/M3;

    iget-object v9, v5, La/N3;->z:La/M3;

    invoke-virtual {v5, v9, v7, v0}, La/N3;->e(La/M3;La/M3;I)V

    iget-object v7, v5, La/N3;->B:La/M3;

    iget-object v8, v8, La/N3;->B:La/M3;

    invoke-virtual {v5, v7, v8, v0}, La/N3;->e(La/M3;La/M3;I)V

    :cond_15
    :goto_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_16
    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v4, v0

    :goto_a
    if-ge v4, v1, :cond_1a

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/H6$a;

    add-int/lit8 v6, v1, -0x1

    if-ne v4, v6, :cond_18

    move v6, v3

    goto :goto_b

    :cond_18
    move v6, v0

    :goto_b
    invoke-virtual {v5, v4, p1, v6}, La/H6$a;->b(IZZ)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1a

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/H6$a;

    invoke-virtual {v1, v0, p1, v3}, La/H6$a;->b(IZZ)V

    :cond_1a
    :goto_c
    iput-boolean v0, p0, La/Yg;->m0:Z

    return-void
.end method
