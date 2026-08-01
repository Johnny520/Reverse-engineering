.class public abstract Lj50;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:I = 0x9

.field public static final b:I = 0x6

.field public static final c:I = 0xa

.field public static final d:I = 0x5

.field public static final e:I = 0xf


# direct methods
.method public static final A(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public static final B(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2b

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lpe0;Lc90;Ljn0;Lyt;Lj5;Lga;Lu8;Lsw;Lji;II)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v0, p7

    move/from16 v11, p9

    move/from16 v12, p10

    .line 1
    move-object/from16 v13, p8

    check-cast v13, Lpi;

    const v2, 0x37213af3

    invoke-virtual {v13, v2}, Lpi;->X(I)Lpi;

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v13, v1}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_1
    move v2, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v4}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :cond_5
    and-int/lit16 v5, v11, 0xc00

    const/4 v15, 0x0

    const/16 v16, 0x400

    if-nez v5, :cond_7

    invoke-virtual {v13, v15}, Lpi;->g(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    move/from16 v5, v16

    :goto_4
    or-int/2addr v2, v5

    :cond_7
    and-int/lit16 v5, v11, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v13, v15}, Lpi;->g(Z)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v2, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v11

    if-nez v5, :cond_b

    move-object/from16 v5, p3

    invoke-virtual {v13, v5}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    const/high16 v19, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v19, 0x10000

    :goto_6
    or-int v2, v2, v19

    goto :goto_7

    :cond_b
    move-object/from16 v5, p3

    :goto_7
    const/high16 v19, 0x180000

    and-int v20, v11, v19

    const/4 v10, 0x1

    if-nez v20, :cond_d

    invoke-virtual {v13, v10}, Lpi;->g(Z)Z

    move-result v20

    if-eqz v20, :cond_c

    const/high16 v20, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v20, 0x80000

    :goto_8
    or-int v2, v2, v20

    :cond_d
    const/high16 v20, 0xc00000

    and-int v21, v11, v20

    move-object/from16 v8, p4

    if-nez v21, :cond_f

    invoke-virtual {v13, v8}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_e

    const/high16 v22, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v22, 0x400000

    :goto_9
    or-int v2, v2, v22

    :cond_f
    const/high16 v22, 0x6000000

    and-int v23, v11, v22

    if-nez v23, :cond_10

    const/high16 v23, 0x2000000

    or-int v2, v2, v23

    :cond_10
    const/high16 v23, 0x30000000

    or-int v2, v2, v23

    or-int/lit8 v24, v12, 0x6

    and-int/lit8 v25, v12, 0x30

    if-nez v25, :cond_12

    invoke-virtual {v13, v6}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_11

    const/16 v17, 0x20

    goto :goto_a

    :cond_11
    const/16 v17, 0x10

    :goto_a
    or-int v24, v24, v17

    :cond_12
    and-int/lit16 v15, v12, 0x180

    if-nez v15, :cond_14

    invoke-virtual {v13, v7}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/16 v18, 0x100

    goto :goto_b

    :cond_13
    const/16 v18, 0x80

    :goto_b
    or-int v24, v24, v18

    :cond_14
    and-int/lit16 v15, v12, 0xc00

    if-nez v15, :cond_16

    invoke-virtual {v13, v0}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_15

    const/16 v16, 0x800

    :cond_15
    or-int v24, v24, v16

    :cond_16
    move/from16 v15, v24

    const v16, 0x12492493

    and-int v9, v2, v16

    const v10, 0x12492492

    if-ne v9, v10, :cond_18

    and-int/lit16 v9, v15, 0x493

    const/16 v10, 0x492

    if-eq v9, v10, :cond_17

    goto :goto_c

    :cond_17
    const/4 v9, 0x0

    goto :goto_d

    :cond_18
    :goto_c
    const/4 v9, 0x1

    :goto_d
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v13, v10, v9}, Lpi;->O(IZ)Z

    move-result v9

    if-eqz v9, :cond_47

    invoke-virtual {v13}, Lpi;->T()V

    and-int/lit8 v9, v11, 0x1

    const v10, -0xe000001

    if-eqz v9, :cond_1a

    invoke-virtual {v13}, Lpi;->y()Z

    move-result v9

    if-eqz v9, :cond_19

    goto :goto_e

    .line 2
    :cond_19
    invoke-virtual {v13}, Lpi;->R()V

    :cond_1a
    :goto_e
    and-int/2addr v2, v10

    invoke-virtual {v13}, Lpi;->q()V

    shr-int/lit8 v24, v2, 0x3

    and-int/lit8 v9, v24, 0xe

    shr-int/lit8 v10, v15, 0x6

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v10, v9

    .line 3
    invoke-static {v0, v13}, Lr60;->z(Ljava/lang/Object;Lji;)Loh0;

    move-result-object v14

    and-int/lit8 v26, v10, 0xe

    xor-int/lit8 v0, v26, 0x6

    move/from16 v26, v2

    const/4 v2, 0x4

    if-le v0, v2, :cond_1b

    .line 4
    invoke-virtual {v13, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    :cond_1b
    and-int/lit8 v0, v10, 0x6

    if-ne v0, v2, :cond_1d

    :cond_1c
    const/4 v0, 0x1

    goto :goto_f

    :cond_1d
    const/4 v0, 0x0

    .line 5
    :goto_f
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v2

    .line 6
    sget-object v10, Lii;->a:Lr3;

    if-nez v0, :cond_1e

    if-ne v2, v10, :cond_1f

    .line 7
    :cond_1e
    new-instance v0, Ly60;

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v2, Ldp0;

    const v5, 0x7fffffff

    invoke-direct {v2, v5}, Ldp0;-><init>(I)V

    .line 10
    iput-object v2, v0, Ly60;->a:Ldp0;

    .line 11
    new-instance v2, Ldp0;

    invoke-direct {v2, v5}, Ldp0;-><init>(I)V

    .line 12
    iput-object v2, v0, Ly60;->b:Ldp0;

    .line 13
    sget-object v2, Ln2;->R:Ln2;

    new-instance v5, Lq70;

    const/4 v8, 0x1

    invoke-direct {v5, v14, v8}, Lq70;-><init>(Loh0;I)V

    invoke-static {v2, v5}, Lr60;->l(Ln2;Lhw;)Ldn;

    move-result-object v5

    .line 14
    new-instance v14, Lp9;

    const/4 v8, 0x5

    invoke-direct {v14, v5, v3, v0, v8}, Lp9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v14}, Lr60;->l(Ln2;Lhw;)Ldn;

    move-result-object v31

    .line 15
    new-instance v27, Lx70;

    const/16 v28, 0x0

    const/16 v29, 0x1

    .line 16
    const-class v30, Lw31;

    const-string v32, "value"

    const-string v33, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v27 .. v33}, Lx70;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v27

    .line 17
    invoke-virtual {v13, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 18
    :cond_1f
    move-object v5, v2

    check-cast v5, Lx70;

    shr-int/lit8 v0, v26, 0x9

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v2, v9

    and-int/lit8 v8, v2, 0xe

    xor-int/lit8 v8, v8, 0x6

    const/4 v9, 0x4

    if-le v8, v9, :cond_20

    .line 19
    invoke-virtual {v13, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_21

    :cond_20
    and-int/lit8 v8, v2, 0x6

    if-ne v8, v9, :cond_22

    :cond_21
    const/4 v8, 0x1

    goto :goto_10

    :cond_22
    const/4 v8, 0x0

    :goto_10
    and-int/lit8 v9, v2, 0x70

    xor-int/lit8 v9, v9, 0x30

    const/16 v14, 0x20

    if-le v9, v14, :cond_23

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lpi;->g(Z)Z

    move-result v18

    if-nez v18, :cond_24

    :cond_23
    and-int/lit8 v2, v2, 0x30

    if-ne v2, v14, :cond_25

    :cond_24
    const/4 v2, 0x1

    goto :goto_11

    :cond_25
    const/4 v2, 0x0

    :goto_11
    or-int/2addr v2, v8

    .line 20
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_26

    if-ne v8, v10, :cond_27

    .line 21
    :cond_26
    new-instance v8, Lh80;

    invoke-direct {v8, v3}, Lh80;-><init>(Lc90;)V

    .line 22
    invoke-virtual {v13, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 23
    :cond_27
    move-object v14, v8

    check-cast v14, Lf80;

    .line 24
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_28

    .line 25
    invoke-static {v13}, Ls91;->s(Lji;)Lyk;

    move-result-object v2

    .line 26
    invoke-virtual {v13, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 27
    :cond_28
    check-cast v2, Lyk;

    .line 28
    sget-object v8, Ldj;->g:Lg41;

    .line 29
    invoke-virtual {v13, v8}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v8

    .line 30
    check-cast v8, Lux;

    .line 31
    sget-object v9, Ldj;->v:Lej;

    .line 32
    invoke-virtual {v13, v9}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v9

    .line 33
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move/from16 v27, v0

    if-nez v9, :cond_29

    .line 34
    sget-object v9, Li41;->a:Ljo0;

    goto :goto_12

    :cond_29
    const/4 v9, 0x0

    :goto_12
    const v28, 0xfff0

    and-int v26, v26, v28

    const/high16 v28, 0x380000

    and-int v27, v27, v28

    or-int v26, v26, v27

    shl-int/lit8 v27, v15, 0x12

    const/high16 v29, 0x1c00000

    and-int v30, v27, v29

    or-int v26, v26, v30

    const/high16 v30, 0xe000000

    and-int v27, v27, v30

    or-int v26, v26, v27

    shl-int/lit8 v15, v15, 0x1b

    const/high16 v27, 0x70000000

    and-int v15, v15, v27

    or-int v15, v26, v15

    and-int/lit8 v26, v15, 0x70

    xor-int/lit8 v0, v26, 0x30

    move-object/from16 v26, v2

    const/16 v2, 0x20

    if-le v0, v2, :cond_2a

    .line 35
    invoke-virtual {v13, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    :cond_2a
    and-int/lit8 v0, v15, 0x30

    if-ne v0, v2, :cond_2c

    :cond_2b
    const/4 v0, 0x1

    goto :goto_13

    :cond_2c
    const/4 v0, 0x0

    :goto_13
    and-int/lit16 v2, v15, 0x380

    xor-int/lit16 v2, v2, 0x180

    move/from16 v18, v0

    const/16 v0, 0x100

    if-le v2, v0, :cond_2d

    .line 36
    invoke-virtual {v13, v4}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    :cond_2d
    and-int/lit16 v2, v15, 0x180

    if-ne v2, v0, :cond_2f

    :cond_2e
    const/4 v0, 0x1

    goto :goto_14

    :cond_2f
    const/4 v0, 0x0

    :goto_14
    or-int v0, v18, v0

    and-int/lit16 v2, v15, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    move/from16 p8, v0

    const/16 v0, 0x800

    if-le v2, v0, :cond_30

    const/4 v2, 0x0

    .line 37
    invoke-virtual {v13, v2}, Lpi;->g(Z)Z

    move-result v18

    if-nez v18, :cond_31

    :cond_30
    and-int/lit16 v2, v15, 0xc00

    if-ne v2, v0, :cond_32

    :cond_31
    const/4 v0, 0x1

    goto :goto_15

    :cond_32
    const/4 v0, 0x0

    :goto_15
    or-int v0, p8, v0

    const v2, 0xe000

    and-int/2addr v2, v15

    xor-int/lit16 v2, v2, 0x6000

    move/from16 p8, v0

    const/16 v0, 0x4000

    if-le v2, v0, :cond_33

    const/4 v2, 0x0

    .line 38
    invoke-virtual {v13, v2}, Lpi;->g(Z)Z

    move-result v18

    if-nez v18, :cond_34

    :cond_33
    and-int/lit16 v2, v15, 0x6000

    if-ne v2, v0, :cond_35

    :cond_34
    const/4 v0, 0x1

    goto :goto_16

    :cond_35
    const/4 v0, 0x0

    :goto_16
    or-int v0, p8, v0

    const/4 v2, 0x0

    .line 39
    invoke-virtual {v13, v2}, Lpi;->d(I)Z

    move-result v18

    or-int v0, v0, v18

    and-int v2, v15, v28

    xor-int v2, v2, v19

    move/from16 p8, v0

    const/high16 v0, 0x100000

    if-le v2, v0, :cond_37

    const/4 v0, 0x0

    .line 40
    invoke-virtual {v13, v0}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_36

    goto :goto_17

    :cond_36
    const/4 v0, 0x1

    goto :goto_18

    :cond_37
    :goto_17
    const/4 v0, 0x0

    :goto_18
    or-int v0, p8, v0

    and-int v2, v15, v29

    xor-int v2, v2, v20

    move/from16 p8, v0

    const/high16 v0, 0x800000

    if-le v2, v0, :cond_38

    .line 41
    invoke-virtual {v13, v6}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_39

    :cond_38
    and-int v2, v15, v20

    if-ne v2, v0, :cond_3a

    :cond_39
    const/4 v0, 0x1

    goto :goto_19

    :cond_3a
    const/4 v0, 0x0

    :goto_19
    or-int v0, p8, v0

    and-int v2, v15, v30

    xor-int v2, v2, v22

    move/from16 p8, v0

    const/high16 v0, 0x4000000

    if-le v2, v0, :cond_3b

    .line 42
    invoke-virtual {v13, v7}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3c

    :cond_3b
    and-int v2, v15, v22

    if-ne v2, v0, :cond_3d

    :cond_3c
    const/4 v0, 0x1

    goto :goto_1a

    :cond_3d
    const/4 v0, 0x0

    :goto_1a
    or-int v0, p8, v0

    and-int v2, v15, v27

    xor-int v2, v2, v23

    const/high16 v15, 0x20000000

    if-le v2, v15, :cond_3f

    const/4 v2, 0x0

    .line 43
    invoke-virtual {v13, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    goto :goto_1b

    :cond_3e
    const/4 v2, 0x1

    goto :goto_1c

    :cond_3f
    :goto_1b
    const/4 v2, 0x0

    :goto_1c
    or-int/2addr v0, v2

    .line 44
    invoke-virtual {v13, v8}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 45
    invoke-virtual {v13, v9}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 46
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_41

    if-ne v2, v10, :cond_40

    goto :goto_1d

    :cond_40
    move-object v15, v10

    const/4 v0, 0x1

    move-object v10, v5

    goto :goto_1e

    .line 47
    :cond_41
    :goto_1d
    new-instance v2, Lu80;

    move-object v15, v10

    const/4 v0, 0x1

    move-object v10, v6

    move-object v6, v7

    move-object/from16 v7, v26

    invoke-direct/range {v2 .. v10}, Lu80;-><init>(Lc90;Ljn0;Lx70;Lu8;Lyk;Lux;Ljo0;Lga;)V

    move-object v10, v5

    .line 48
    invoke-virtual {v13, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 49
    :goto_1e
    move-object/from16 v16, v2

    check-cast v16, Lr70;

    const v2, -0x7bcec0e8

    .line 50
    invoke-virtual {v13, v2}, Lpi;->W(I)V

    and-int/lit8 v2, v24, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v9, 0x4

    if-le v2, v9, :cond_42

    .line 51
    invoke-virtual {v13, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_43

    :cond_42
    and-int/lit8 v2, v24, 0x6

    if-ne v2, v9, :cond_44

    :cond_43
    move v2, v0

    :goto_1f
    const/4 v9, 0x0

    goto :goto_20

    :cond_44
    const/4 v2, 0x0

    goto :goto_1f

    :goto_20
    invoke-virtual {v13, v9}, Lpi;->d(I)Z

    move-result v4

    or-int/2addr v2, v4

    .line 52
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_45

    if-ne v4, v15, :cond_46

    .line 53
    :cond_45
    new-instance v4, Ln80;

    invoke-direct {v4, v3}, Ln80;-><init>(Lc90;)V

    .line 54
    invoke-virtual {v13, v4}, Lpi;->g0(Ljava/lang/Object;)V

    .line 55
    :cond_46
    check-cast v4, Ln80;

    .line 56
    iget-object v2, v3, Lc90;->o:Leb;

    .line 57
    sget-object v5, Lum0;->e:Lum0;

    invoke-static {v4, v2, v5}, Lkl;->t(Lf70;Leb;Lum0;)Lpe0;

    move-result-object v2

    const/4 v9, 0x0

    .line 58
    invoke-virtual {v13, v9}, Lpi;->p(Z)V

    .line 59
    iget-object v4, v3, Lc90;->l:La90;

    .line 60
    invoke-interface {v1, v4}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v4

    .line 61
    iget-object v6, v3, Lc90;->m:Lo9;

    .line 62
    invoke-interface {v4, v6}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v4

    .line 63
    invoke-static {v4, v10, v14, v5, v0}, Lp30;->O(Lpe0;Lx70;Lf80;Lum0;Z)Lpe0;

    move-result-object v0

    .line 64
    invoke-interface {v0, v2}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v0

    .line 65
    iget-object v2, v3, Lc90;->n:Ll70;

    .line 66
    iget-object v2, v2, Ll70;->i:Lpe0;

    .line 67
    invoke-interface {v0, v2}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v2

    .line 68
    iget-object v8, v3, Lc90;->g:Lxg0;

    const/4 v9, 0x0

    const/4 v6, 0x1

    move-object/from16 v7, p3

    move-object v4, v5

    move-object/from16 v5, p4

    .line 69
    invoke-static/range {v2 .. v9}, Ls91;->N(Lpe0;Lez0;Lum0;Lj5;ZLyt;Lxg0;Lon0;)Lpe0;

    move-result-object v0

    move-object v8, v3

    .line 70
    iget-object v4, v8, Lc90;->p:Ld80;

    const/4 v7, 0x0

    move-object v3, v0

    move-object v2, v10

    move-object v6, v13

    move-object/from16 v5, v16

    .line 71
    invoke-static/range {v2 .. v7}, Lr60;->b(Lhw;Lpe0;Ld80;Lr70;Lji;I)V

    goto :goto_21

    :cond_47
    move-object v8, v3

    move-object v6, v13

    .line 72
    invoke-virtual {v6}, Lpi;->R()V

    .line 73
    :goto_21
    invoke-virtual {v6}, Lpi;->r()Lht0;

    move-result-object v13

    if-eqz v13, :cond_48

    new-instance v0, Ls80;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object v2, v8

    move v9, v11

    move v10, v12

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Ls80;-><init>(Lpe0;Lc90;Ljn0;Lyt;Lj5;Lga;Lu8;Lsw;II)V

    .line 74
    iput-object v0, v13, Lht0;->d:Lww;

    :cond_48
    return-void
.end method

.method public static final b(FFFFJ)Lbw0;
    .locals 17

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p4, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long v4, p4, v2

    .line 16
    .line 17
    long-to-int v4, v4

    .line 18
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-long v5, v1

    .line 27
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-long v7, v1

    .line 32
    shl-long v0, v5, v0

    .line 33
    .line 34
    and-long/2addr v2, v7

    .line 35
    or-long v9, v0, v2

    .line 36
    .line 37
    new-instance v4, Lbw0;

    .line 38
    .line 39
    move-wide v11, v9

    .line 40
    move-wide v13, v9

    .line 41
    move-wide v15, v9

    .line 42
    move/from16 v5, p0

    .line 43
    .line 44
    move/from16 v6, p1

    .line 45
    .line 46
    move/from16 v7, p2

    .line 47
    .line 48
    move/from16 v8, p3

    .line 49
    .line 50
    invoke-direct/range {v4 .. v16}, Lbw0;-><init>(FFFFJJJJ)V

    .line 51
    .line 52
    .line 53
    return-object v4
.end method

.method public static final c(Lb60;Z)Lxz0;
    .locals 8

    .line 1
    iget-object v0, p0, Lb60;->I:Lmj0;

    .line 2
    .line 3
    iget-object v0, v0, Lmj0;->f:Loe0;

    .line 4
    .line 5
    iget v1, v0, Loe0;->g:I

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_8

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_8

    .line 13
    .line 14
    iget v1, v0, Loe0;->f:I

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    if-eqz v1, :cond_7

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    move-object v3, v2

    .line 22
    :goto_1
    if-eqz v1, :cond_7

    .line 23
    .line 24
    instance-of v4, v1, Lvz0;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    goto :goto_4

    .line 30
    :cond_0
    iget v4, v1, Loe0;->f:I

    .line 31
    .line 32
    and-int/lit8 v4, v4, 0x8

    .line 33
    .line 34
    if-eqz v4, :cond_6

    .line 35
    .line 36
    instance-of v4, v1, Lsm;

    .line 37
    .line 38
    if-eqz v4, :cond_6

    .line 39
    .line 40
    move-object v4, v1

    .line 41
    check-cast v4, Lsm;

    .line 42
    .line 43
    iget-object v4, v4, Lsm;->s:Loe0;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_2
    const/4 v6, 0x1

    .line 47
    if-eqz v4, :cond_5

    .line 48
    .line 49
    iget v7, v4, Loe0;->f:I

    .line 50
    .line 51
    and-int/lit8 v7, v7, 0x8

    .line 52
    .line 53
    if-eqz v7, :cond_4

    .line 54
    .line 55
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    if-ne v5, v6, :cond_1

    .line 58
    .line 59
    move-object v1, v4

    .line 60
    goto :goto_3

    .line 61
    :cond_1
    if-nez v3, :cond_2

    .line 62
    .line 63
    new-instance v3, Lsh0;

    .line 64
    .line 65
    const/16 v6, 0x10

    .line 66
    .line 67
    new-array v6, v6, [Loe0;

    .line 68
    .line 69
    invoke-direct {v3, v6}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :cond_3
    invoke-virtual {v3, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    :goto_3
    iget-object v4, v4, Loe0;->i:Loe0;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    if-ne v5, v6, :cond_6

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    invoke-static {v3}, Lpf1;->f(Lsh0;)Loe0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_7
    iget v1, v0, Loe0;->g:I

    .line 93
    .line 94
    and-int/lit8 v1, v1, 0x8

    .line 95
    .line 96
    if-eqz v1, :cond_8

    .line 97
    .line 98
    iget-object v0, v0, Loe0;->i:Loe0;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_8
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast v2, Lvz0;

    .line 105
    .line 106
    check-cast v2, Loe0;

    .line 107
    .line 108
    iget-object v0, v2, Loe0;->d:Loe0;

    .line 109
    .line 110
    invoke-virtual {p0}, Lb60;->x()Lsz0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-nez v1, :cond_9

    .line 115
    .line 116
    new-instance v1, Lsz0;

    .line 117
    .line 118
    invoke-direct {v1}, Lsz0;-><init>()V

    .line 119
    .line 120
    .line 121
    :cond_9
    new-instance v2, Lxz0;

    .line 122
    .line 123
    invoke-direct {v2, v0, p1, p0, v1}, Lxz0;-><init>(Loe0;ZLb60;Lsz0;)V

    .line 124
    .line 125
    .line 126
    return-object v2
.end method

.method public static final d(Lny0;FLw7;Lml;Lsw;Ljk;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Lh21;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lh21;

    .line 7
    .line 8
    iget v1, v0, Lh21;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lh21;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh21;

    .line 21
    .line 22
    invoke-direct {v0, p5}, Ljk;-><init>(Lik;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lh21;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh21;->k:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p1, v0, Lh21;->g:F

    .line 35
    .line 36
    iget-object p0, v0, Lh21;->i:Lwt0;

    .line 37
    .line 38
    iget-object p2, v0, Lh21;->h:Lw7;

    .line 39
    .line 40
    invoke-static {p5}, Lw60;->M(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p5}, Lw60;->M(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Lwt0;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Lw7;->a()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p5

    .line 63
    check-cast p5, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {p5}, Ljava/lang/Number;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    const/4 v1, 0x0

    .line 70
    cmpg-float p5, p5, v1

    .line 71
    .line 72
    if-nez p5, :cond_3

    .line 73
    .line 74
    move p5, v2

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/4 p5, 0x0

    .line 77
    :goto_1
    xor-int/2addr p5, v2

    .line 78
    new-instance v3, Lg21;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    move-object v6, p0

    .line 82
    move v4, p1

    .line 83
    move-object v7, p4

    .line 84
    invoke-direct/range {v3 .. v8}, Lg21;-><init>(FLwt0;Lny0;Lsw;I)V

    .line 85
    .line 86
    .line 87
    iput-object p2, v0, Lh21;->h:Lw7;

    .line 88
    .line 89
    iput-object v5, v0, Lh21;->i:Lwt0;

    .line 90
    .line 91
    iput v4, v0, Lh21;->g:F

    .line 92
    .line 93
    iput v2, v0, Lh21;->k:I

    .line 94
    .line 95
    invoke-static {p2, p3, p5, v3, v0}, Lz60;->g(Lw7;Lml;ZLsw;Ljk;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    sget-object p1, Lzk;->d:Lzk;

    .line 100
    .line 101
    if-ne p0, p1, :cond_4

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_4
    move p1, v4

    .line 105
    move-object p0, v5

    .line 106
    :goto_2
    new-instance p3, Ls7;

    .line 107
    .line 108
    iget p0, p0, Lwt0;->d:F

    .line 109
    .line 110
    sub-float/2addr p1, p0

    .line 111
    new-instance p0, Ljava/lang/Float;

    .line 112
    .line 113
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p3, p0, p2}, Ls7;-><init>(Ljava/lang/Float;Lw7;)V

    .line 117
    .line 118
    .line 119
    return-object p3
.end method

.method public static final e(Lny0;FFLw7;Lo31;Lsw;Ljk;)Ljava/lang/Object;
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Li21;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Li21;

    .line 11
    .line 12
    iget v3, v2, Li21;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Li21;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Li21;

    .line 26
    .line 27
    invoke-direct {v2, v1}, Ljk;-><init>(Lik;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Li21;->k:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v8, Li21;->l:I

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget v0, v8, Li21;->h:F

    .line 42
    .line 43
    iget v2, v8, Li21;->g:F

    .line 44
    .line 45
    iget-object v3, v8, Li21;->j:Lwt0;

    .line 46
    .line 47
    iget-object v4, v8, Li21;->i:Lw7;

    .line 48
    .line 49
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move v1, v0

    .line 53
    move v0, v2

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0

    .line 62
    :cond_2
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v12, Lwt0;

    .line 66
    .line 67
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p3 .. p3}, Lw7;->a()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    new-instance v4, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-direct {v4, v0}, Ljava/lang/Float;-><init>(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {p3 .. p3}, Lw7;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    cmpg-float v2, v2, v9

    .line 96
    .line 97
    if-nez v2, :cond_3

    .line 98
    .line 99
    move v2, v3

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    const/4 v2, 0x0

    .line 102
    :goto_2
    xor-int/lit8 v6, v2, 0x1

    .line 103
    .line 104
    new-instance v10, Lg21;

    .line 105
    .line 106
    const/4 v15, 0x1

    .line 107
    move-object/from16 v13, p0

    .line 108
    .line 109
    move/from16 v11, p2

    .line 110
    .line 111
    move-object/from16 v14, p5

    .line 112
    .line 113
    invoke-direct/range {v10 .. v15}, Lg21;-><init>(FLwt0;Lny0;Lsw;I)V

    .line 114
    .line 115
    .line 116
    move-object/from16 v2, p3

    .line 117
    .line 118
    iput-object v2, v8, Li21;->i:Lw7;

    .line 119
    .line 120
    iput-object v12, v8, Li21;->j:Lwt0;

    .line 121
    .line 122
    iput v0, v8, Li21;->g:F

    .line 123
    .line 124
    iput v1, v8, Li21;->h:F

    .line 125
    .line 126
    iput v3, v8, Li21;->l:I

    .line 127
    .line 128
    move-object/from16 v5, p4

    .line 129
    .line 130
    move-object v3, v2

    .line 131
    move-object v7, v10

    .line 132
    invoke-static/range {v3 .. v8}, Lz60;->h(Lw7;Ljava/lang/Float;Lv7;ZLsw;Ljk;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    sget-object v3, Lzk;->d:Lzk;

    .line 137
    .line 138
    if-ne v2, v3, :cond_4

    .line 139
    .line 140
    return-object v3

    .line 141
    :cond_4
    move-object/from16 v4, p3

    .line 142
    .line 143
    move-object v3, v12

    .line 144
    :goto_3
    invoke-virtual {v4}, Lw7;->a()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-static {v2, v1}, Lj50;->j(FF)F

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    new-instance v2, Ls7;

    .line 159
    .line 160
    iget v3, v3, Lwt0;->d:F

    .line 161
    .line 162
    sub-float/2addr v0, v3

    .line 163
    new-instance v3, Ljava/lang/Float;

    .line 164
    .line 165
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 166
    .line 167
    .line 168
    const/16 v0, 0x1d

    .line 169
    .line 170
    invoke-static {v4, v9, v1, v0}, Lpf1;->q(Lw7;FFI)Lw7;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-direct {v2, v3, v0}, Ls7;-><init>(Ljava/lang/Float;Lw7;)V

    .line 175
    .line 176
    .line 177
    return-object v2
.end method

.method public static final f(Lu7;Lny0;Lsw;F)V
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p1, p3}, Lny0;->a(F)F

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    goto :goto_0

    .line 6
    :catch_0
    invoke-virtual {p0}, Lu7;->a()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sub-float/2addr p3, p1

    .line 18
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/high16 p2, 0x3f000000    # 0.5f

    .line 23
    .line 24
    cmpl-float p1, p1, p2

    .line 25
    .line 26
    if-lez p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lu7;->a()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public static final g(Li50;)Lst0;
    .locals 6

    .line 1
    invoke-interface {p0}, Li50;->k()Li50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-interface {v0, p0, v1}, Li50;->B(Li50;Z)Lst0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lst0;

    .line 14
    .line 15
    invoke-interface {p0}, Li50;->G()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    shr-long/2addr v1, v3

    .line 22
    long-to-int v1, v1

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-interface {p0}, Li50;->G()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide v4, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v2, v4

    .line 34
    long-to-int p0, v2

    .line 35
    int-to-float p0, p0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, v2, v2, v1, p0}, Lst0;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public static final h(Li50;Z)Lst0;
    .locals 14

    .line 1
    invoke-static {p0}, Lj50;->l(Li50;)Li50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Li50;->G()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    shr-long/2addr v1, v3

    .line 12
    long-to-int v1, v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-interface {v0}, Li50;->G()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    const-wide v6, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v4, v6

    .line 24
    long-to-int v2, v4

    .line 25
    int-to-float v2, v2

    .line 26
    invoke-interface {v0, p0, p1}, Li50;->B(Li50;Z)Lst0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget v4, p0, Lst0;->a:F

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    cmpg-float v8, v4, v5

    .line 36
    .line 37
    if-gez v8, :cond_0

    .line 38
    .line 39
    move v4, v5

    .line 40
    :cond_0
    cmpl-float v8, v4, v1

    .line 41
    .line 42
    if-lez v8, :cond_1

    .line 43
    .line 44
    move v4, v1

    .line 45
    :cond_1
    iget v8, p0, Lst0;->b:F

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    cmpg-float v9, v8, v5

    .line 50
    .line 51
    if-gez v9, :cond_2

    .line 52
    .line 53
    move v8, v5

    .line 54
    :cond_2
    cmpl-float v9, v8, v2

    .line 55
    .line 56
    if-lez v9, :cond_3

    .line 57
    .line 58
    move v8, v2

    .line 59
    :cond_3
    iget v9, p0, Lst0;->c:F

    .line 60
    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    cmpg-float v10, v9, v5

    .line 64
    .line 65
    if-gez v10, :cond_4

    .line 66
    .line 67
    move v9, v5

    .line 68
    :cond_4
    cmpl-float v10, v9, v1

    .line 69
    .line 70
    if-lez v10, :cond_5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    move v1, v9

    .line 74
    :goto_0
    move v9, v1

    .line 75
    :cond_6
    iget p0, p0, Lst0;->d:F

    .line 76
    .line 77
    if-eqz p1, :cond_9

    .line 78
    .line 79
    cmpg-float p1, p0, v5

    .line 80
    .line 81
    if-gez p1, :cond_7

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_7
    move v5, p0

    .line 85
    :goto_1
    cmpl-float p0, v5, v2

    .line 86
    .line 87
    if-lez p0, :cond_8

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_8
    move v2, v5

    .line 91
    :goto_2
    move p0, v2

    .line 92
    :cond_9
    cmpg-float p1, v4, v9

    .line 93
    .line 94
    if-nez p1, :cond_a

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_a
    cmpg-float p1, v8, p0

    .line 98
    .line 99
    if-nez p1, :cond_b

    .line 100
    .line 101
    :goto_3
    sget-object p0, Lst0;->e:Lst0;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_b
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-long v1, p1

    .line 109
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    int-to-long v10, p1

    .line 114
    shl-long/2addr v1, v3

    .line 115
    and-long/2addr v10, v6

    .line 116
    or-long/2addr v1, v10

    .line 117
    invoke-interface {v0, v1, v2}, Li50;->i(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-long v10, p1

    .line 126
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long v12, p1

    .line 131
    shl-long/2addr v10, v3

    .line 132
    and-long/2addr v12, v6

    .line 133
    or-long/2addr v10, v12

    .line 134
    invoke-interface {v0, v10, v11}, Li50;->i(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    int-to-long v8, p1

    .line 143
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    int-to-long v12, p1

    .line 148
    shl-long/2addr v8, v3

    .line 149
    and-long/2addr v12, v6

    .line 150
    or-long/2addr v8, v12

    .line 151
    invoke-interface {v0, v8, v9}, Li50;->i(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    int-to-long v4, p1

    .line 160
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    int-to-long p0, p0

    .line 165
    shl-long/2addr v4, v3

    .line 166
    and-long/2addr p0, v6

    .line 167
    or-long/2addr p0, v4

    .line 168
    invoke-interface {v0, p0, p1}, Li50;->i(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide p0

    .line 172
    shr-long v4, v1, v3

    .line 173
    .line 174
    long-to-int v0, v4

    .line 175
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    shr-long v4, v10, v3

    .line 180
    .line 181
    long-to-int v4, v4

    .line 182
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    shr-long v12, p0, v3

    .line 187
    .line 188
    long-to-int v5, v12

    .line 189
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    shr-long v12, v8, v3

    .line 194
    .line 195
    long-to-int v3, v12

    .line 196
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-static {v4, v12}, Ljava/lang/Math;->min(FF)F

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    invoke-static {v0, v12}, Ljava/lang/Math;->min(FF)F

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    and-long/2addr v1, v6

    .line 225
    long-to-int v1, v1

    .line 226
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    and-long v2, v10, v6

    .line 231
    .line 232
    long-to-int v2, v2

    .line 233
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    and-long/2addr p0, v6

    .line 238
    long-to-int p0, p0

    .line 239
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    and-long v3, v8, v6

    .line 244
    .line 245
    long-to-int p1, v3

    .line 246
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-static {v2, p0}, Ljava/lang/Math;->max(FF)F

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    new-instance p1, Lst0;

    .line 275
    .line 276
    invoke-direct {p1, v12, v3, v0, p0}, Lst0;-><init>(FFFF)V

    .line 277
    .line 278
    .line 279
    return-object p1
.end method

.method public static final i(Lo70;La80;Leb;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p2, Leb;->a:Lsh0;

    .line 2
    .line 3
    iget v1, v0, Lsh0;->f:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v1, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p1, La80;->d:Lc31;

    .line 15
    .line 16
    invoke-virtual {v1}, Lc31;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    sget-object p0, Lhs;->d:Lhs;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object p2, p2, Leb;->a:Lsh0;

    .line 31
    .line 32
    iget p2, p2, Lsh0;->f:I

    .line 33
    .line 34
    if-eqz p2, :cond_9

    .line 35
    .line 36
    new-instance p2, Lz20;

    .line 37
    .line 38
    iget v4, v0, Lsh0;->f:I

    .line 39
    .line 40
    const-string v5, "MutableVector is empty."

    .line 41
    .line 42
    if-eqz v4, :cond_8

    .line 43
    .line 44
    iget-object v6, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 45
    .line 46
    aget-object v7, v6, v2

    .line 47
    .line 48
    check-cast v7, La70;

    .line 49
    .line 50
    iget v7, v7, La70;->a:I

    .line 51
    .line 52
    move v8, v2

    .line 53
    :goto_1
    if-ge v8, v4, :cond_3

    .line 54
    .line 55
    aget-object v9, v6, v8

    .line 56
    .line 57
    check-cast v9, La70;

    .line 58
    .line 59
    iget v9, v9, La70;->a:I

    .line 60
    .line 61
    if-ge v9, v7, :cond_2

    .line 62
    .line 63
    move v7, v9

    .line 64
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    if-ltz v7, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const-string v4, "negative minIndex"

    .line 71
    .line 72
    invoke-static {v4}, Lz10;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    iget v4, v0, Lsh0;->f:I

    .line 76
    .line 77
    if-eqz v4, :cond_7

    .line 78
    .line 79
    iget-object v0, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 80
    .line 81
    aget-object v5, v0, v2

    .line 82
    .line 83
    check-cast v5, La70;

    .line 84
    .line 85
    iget v5, v5, La70;->b:I

    .line 86
    .line 87
    move v6, v2

    .line 88
    :goto_3
    if-ge v6, v4, :cond_6

    .line 89
    .line 90
    aget-object v8, v0, v6

    .line 91
    .line 92
    check-cast v8, La70;

    .line 93
    .line 94
    iget v8, v8, La70;->b:I

    .line 95
    .line 96
    if-le v8, v5, :cond_5

    .line 97
    .line 98
    move v5, v8

    .line 99
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    invoke-interface {p0}, Lo70;->a()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    sub-int/2addr v0, v3

    .line 107
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-direct {p2, v7, v0, v3}, Lx20;-><init>(III)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 116
    .line 117
    invoke-direct {p0, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_8
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 122
    .line 123
    invoke-direct {p0, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_9
    sget-object p2, Lz20;->g:Lz20;

    .line 128
    .line 129
    :goto_4
    iget-object v0, p1, La80;->d:Lc31;

    .line 130
    .line 131
    invoke-virtual {v0}, Lc31;->size()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    :goto_5
    if-ge v2, v0, :cond_c

    .line 136
    .line 137
    invoke-virtual {p1, v2}, La80;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Ly70;

    .line 142
    .line 143
    iget-object v4, v3, Ly70;->a:Ljava/lang/Object;

    .line 144
    .line 145
    iget v3, v3, Ly70;->c:I

    .line 146
    .line 147
    invoke-static {v3, p0, v4}, Lg60;->k(ILo70;Ljava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    iget v4, p2, Lx20;->d:I

    .line 152
    .line 153
    iget v5, p2, Lx20;->e:I

    .line 154
    .line 155
    if-gt v3, v5, :cond_a

    .line 156
    .line 157
    if-gt v4, v3, :cond_a

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_a
    if-ltz v3, :cond_b

    .line 161
    .line 162
    invoke-interface {p0}, Lo70;->a()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-ge v3, v4, :cond_b

    .line 167
    .line 168
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_b
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_c
    iget p0, p2, Lx20;->d:I

    .line 179
    .line 180
    iget p1, p2, Lx20;->e:I

    .line 181
    .line 182
    if-gt p0, p1, :cond_d

    .line 183
    .line 184
    :goto_7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    if-eq p0, p1, :cond_d

    .line 192
    .line 193
    add-int/lit8 p0, p0, 0x1

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_d
    return-object v1
.end method

.method public static final j(FF)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    cmpl-float v0, p0, p1

    .line 12
    .line 13
    if-lez v0, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    cmpg-float v0, p0, p1

    .line 17
    .line 18
    if-gez v0, :cond_2

    .line 19
    .line 20
    :goto_0
    return p1

    .line 21
    :cond_2
    return p0
.end method

.method public static final k(Llo0;)J
    .locals 4

    .line 1
    iget-object v0, p0, Llo0;->d:Lco0;

    .line 2
    .line 3
    iget-object v0, v0, Lco0;->b:Ldp0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldp0;->g()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    invoke-virtual {p0}, Llo0;->p()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-long v2, v2

    .line 15
    mul-long/2addr v0, v2

    .line 16
    invoke-virtual {p0}, Llo0;->l()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, Llo0;->p()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-float p0, p0

    .line 25
    mul-float/2addr v2, p0

    .line 26
    float-to-double v2, v2

    .line 27
    invoke-static {v2, v3}, Lrd0;->R(D)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    add-long/2addr v2, v0

    .line 32
    return-wide v2
.end method

.method public static final l(Li50;)Li50;
    .locals 2

    .line 1
    invoke-interface {p0}, Li50;->k()Li50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    move-object v1, v0

    .line 6
    move-object v0, p0

    .line 7
    move-object p0, v1

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Li50;->k()Li50;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p0, v0, Lqj0;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    move-object p0, v0

    .line 20
    check-cast p0, Lqj0;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    :goto_1
    if-nez p0, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    iget-object v0, p0, Lqj0;->t:Lqj0;

    .line 28
    .line 29
    :goto_2
    move-object v1, v0

    .line 30
    move-object v0, p0

    .line 31
    move-object p0, v1

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lqj0;->t:Lqj0;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    return-object v0
.end method

.method public static final m(Landroid/view/View;)Lx90;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    const/4 v0, 0x0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const v1, 0x7f060074

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Lx90;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Lx90;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p0}, Lz60;->y(Landroid/view/View;)Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object p0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-object v0
.end method

.method public static n()Lfb0;
    .locals 8

    .line 1
    sget-object v0, Lcr0;->a:Lo8;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, v0, Lo8;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljo0;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    iget-object v3, v0, Lo8;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lfb0;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-object v4, v0, Lo8;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    if-ne v1, v4, :cond_0

    .line 26
    .line 27
    monitor-exit v2

    .line 28
    return-object v3

    .line 29
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/os/LocaleList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    new-instance v4, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    :goto_0
    if-ge v5, v3, :cond_1

    .line 40
    .line 41
    new-instance v6, Leb0;

    .line 42
    .line 43
    invoke-virtual {v1, v5}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-direct {v6, v7}, Leb0;-><init>(Ljava/util/Locale;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    new-instance v3, Lfb0;

    .line 59
    .line 60
    invoke-direct {v3, v4}, Lfb0;-><init>(Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, v0, Lo8;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v3, v0, Lo8;->b:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    return-object v3

    .line 69
    :goto_1
    monitor-exit v2

    .line 70
    throw v0
.end method

.method public static final o(Landroid/view/View;)Lur0;
    .locals 2

    .line 1
    const v0, 0x7f06004f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lur0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lur0;

    .line 13
    .line 14
    invoke-direct {v1}, Lur0;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v1
.end method

.method public static final p(D)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    double-to-float p0, p0

    .line 7
    invoke-static {p0, v0, v1}, Lj50;->t(FJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static final q(I)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-float p0, p0

    .line 7
    invoke-static {p0, v0, v1}, Lj50;->t(FJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static final r(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static final s(Lbw0;)Z
    .locals 6

    .line 1
    iget-wide v0, p0, Lbw0;->e:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v2, v0, v2

    .line 6
    .line 7
    const-wide v4, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v4, v0

    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-wide v2, p0, Lbw0;->f:J

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, p0, Lbw0;->g:J

    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget-wide v2, p0, Lbw0;->h:J

    .line 30
    .line 31
    cmp-long p0, v0, v2

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static final t(FJ)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr v0, v2

    .line 12
    or-long p0, p1, v0

    .line 13
    .line 14
    sget-object p2, Lu71;->b:[Lv71;

    .line 15
    .line 16
    return-wide p0
.end method

.method public static final u(Lsm0;ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsm0;->e:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lsm0;->f:I

    .line 4
    .line 5
    iget-object v2, p0, Lsm0;->a:[Lpm0;

    .line 6
    .line 7
    iget p0, p0, Lsm0;->b:I

    .line 8
    .line 9
    add-int/lit8 p0, p0, -0x1

    .line 10
    .line 11
    aget-object p0, v2, p0

    .line 12
    .line 13
    iget p0, p0, Lpm0;->b:I

    .line 14
    .line 15
    sub-int/2addr v1, p0

    .line 16
    add-int/2addr v1, p1

    .line 17
    aput-object p2, v0, v1

    .line 18
    .line 19
    return-void
.end method

.method public static final v(Lsm0;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lsm0;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lsm0;->a:[Lpm0;

    .line 4
    .line 5
    iget v2, p0, Lsm0;->b:I

    .line 6
    .line 7
    add-int/lit8 v2, v2, -0x1

    .line 8
    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget v1, v1, Lpm0;->b:I

    .line 12
    .line 13
    sub-int/2addr v0, v1

    .line 14
    iget-object p0, p0, Lsm0;->e:[Ljava/lang/Object;

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    aput-object p2, p0, p1

    .line 18
    .line 19
    add-int/2addr v0, p3

    .line 20
    aput-object p4, p0, v0

    .line 21
    .line 22
    return-void
.end method

.method public static final w(Ljava/lang/String;JJJ)J
    .locals 4

    .line 1
    sget v0, La61;->a:I

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-wide p1

    .line 12
    :cond_0
    invoke-static {v0}, Lr41;->U(Ljava/lang/String;)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 p2, 0x27

    .line 17
    .line 18
    const-string v1, "System property \'"

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    cmp-long p1, p3, v2

    .line 27
    .line 28
    if-gtz p1, :cond_1

    .line 29
    .line 30
    cmp-long p1, v2, p5

    .line 31
    .line 32
    if-gtz p1, :cond_1

    .line 33
    .line 34
    return-wide v2

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, "\' should be in range "

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ".."

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, ", but is \'"

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    new-instance p3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p0, "\' has unrecognized value \'"

    .line 95
    .line 96
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1
.end method

.method public static x(IILjava/lang/String;)I
    .locals 7

    .line 1
    and-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const p1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const p1, 0x1ffffe

    .line 10
    .line 11
    .line 12
    :goto_0
    int-to-long v1, p0

    .line 13
    const-wide/16 v3, 0x1

    .line 14
    .line 15
    int-to-long v5, p1

    .line 16
    move-object v0, p2

    .line 17
    invoke-static/range {v0 .. v6}, Lj50;->w(Ljava/lang/String;JJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    long-to-int p0, p0

    .line 22
    return p0
.end method

.method public static final y(JJ)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-float/2addr v2, v1

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p0, v3

    .line 24
    long-to-int p0, p0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    and-long p1, p2, v3

    .line 30
    .line 31
    long-to-int p1, p1

    .line 32
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    mul-float/2addr p1, p0

    .line 37
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    int-to-long p2, p0

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long p0, p0

    .line 47
    shl-long/2addr p2, v0

    .line 48
    and-long/2addr p0, v3

    .line 49
    or-long/2addr p0, p2

    .line 50
    return-wide p0
.end method

.method public static final z(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lj50;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Lr91;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Cannot cast type "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " to java.lang.Class object."

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method
