.class public abstract Lik;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x42200000    # 40.0f

    .line 2
    .line 3
    invoke-static {v0, v0}, Lp7;->a(FF)J

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Ljava/lang/String;Lin0;Luh1;ZZLm13;Lm51;Lk51;ZIILwb3;Lin0;Lft2;Lkw;Lpx;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v9, p8

    .line 1
    move-object/from16 v0, p15

    check-cast v0, Lgo0;

    const v3, 0x78d0d0fc

    invoke-virtual {v0, v3}, Lgo0;->X(I)Lgo0;

    invoke-virtual {v0, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p16, v3

    invoke-virtual {v0, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v6

    const/16 v8, 0x10

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    move v6, v8

    :goto_1
    or-int/2addr v3, v6

    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x100

    goto :goto_2

    :cond_2
    const/16 v10, 0x80

    :goto_2
    or-int/2addr v3, v10

    move/from16 v10, p3

    invoke-virtual {v0, v10}, Lgo0;->g(Z)Z

    move-result v11

    if-eqz v11, :cond_3

    const/16 v11, 0x800

    goto :goto_3

    :cond_3
    const/16 v11, 0x400

    :goto_3
    or-int/2addr v3, v11

    move/from16 v11, p4

    invoke-virtual {v0, v11}, Lgo0;->g(Z)Z

    move-result v12

    const/16 v13, 0x2000

    const/16 v14, 0x4000

    if-eqz v12, :cond_4

    move v12, v14

    goto :goto_4

    :cond_4
    move v12, v13

    :goto_4
    or-int/2addr v3, v12

    move-object/from16 v12, p5

    invoke-virtual {v0, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_5

    const/high16 v16, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v16, 0x10000

    :goto_5
    or-int v3, v3, v16

    invoke-virtual {v0, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_6

    const/high16 v16, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v16, 0x80000

    :goto_6
    or-int v3, v3, v16

    move-object/from16 v5, p7

    invoke-virtual {v0, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/high16 v16, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v16, 0x400000

    :goto_7
    or-int v3, v3, v16

    invoke-virtual {v0, v9}, Lgo0;->g(Z)Z

    move-result v16

    if-eqz v16, :cond_8

    const/high16 v16, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v16, 0x2000000

    :goto_8
    or-int v3, v3, v16

    move/from16 v15, p9

    invoke-virtual {v0, v15}, Lgo0;->d(I)Z

    move-result v17

    if-eqz v17, :cond_9

    const/high16 v17, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v17, 0x10000000

    :goto_9
    or-int v3, v3, v17

    move/from16 v11, p10

    invoke-virtual {v0, v11}, Lgo0;->d(I)Z

    move-result v17

    if-eqz v17, :cond_a

    const/16 v17, 0x4

    goto :goto_a

    :cond_a
    const/16 v17, 0x2

    :goto_a
    const/high16 v18, 0x30000

    or-int v17, v18, v17

    move-object/from16 v11, p11

    invoke-virtual {v0, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_b

    const/16 v8, 0x20

    :cond_b
    or-int v8, v17, v8

    or-int/lit16 v8, v8, 0xd80

    move-object/from16 v11, p13

    invoke-virtual {v0, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    move v13, v14

    :cond_c
    or-int v17, v8, v13

    const v8, 0x12492493

    and-int/2addr v8, v3

    const v13, 0x12492492

    const/16 v19, 0x0

    if-ne v8, v13, :cond_e

    const v8, 0x12493

    and-int v8, v17, v8

    const v13, 0x12492

    if-eq v8, v13, :cond_d

    goto :goto_b

    :cond_d
    move/from16 v8, v19

    goto :goto_c

    :cond_e
    :goto_b
    const/4 v8, 0x1

    :goto_c
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v0, v13, v8}, Lgo0;->O(IZ)Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-virtual {v0}, Lgo0;->T()V

    and-int/lit8 v8, p16, 0x1

    sget-object v13, Lnx;->a:Leb;

    if-eqz v8, :cond_10

    invoke-virtual {v0}, Lgo0;->y()Z

    move-result v8

    if-eqz v8, :cond_f

    goto :goto_d

    .line 2
    :cond_f
    invoke-virtual {v0}, Lgo0;->R()V

    move-object/from16 v20, p12

    goto :goto_e

    .line 3
    :cond_10
    :goto_d
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_11

    .line 4
    new-instance v8, Lw;

    const/16 v14, 0x14

    invoke-direct {v8, v14}, Lw;-><init>(I)V

    .line 5
    invoke-virtual {v0, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 6
    :cond_11
    check-cast v8, Lin0;

    move-object/from16 v20, v8

    .line 7
    :goto_e
    invoke-virtual {v0}, Lgo0;->q()V

    .line 8
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_12

    .line 9
    new-instance v8, Lk03;

    const/16 p15, 0x1

    const-wide/16 v11, 0x0

    const/4 v14, 0x6

    invoke-direct {v8, v1, v11, v12, v14}, Lk03;-><init>(Ljava/lang/String;JI)V

    invoke-static {v8}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    move-result-object v8

    .line 10
    invoke-virtual {v0, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    goto :goto_f

    :cond_12
    const/16 p15, 0x1

    .line 11
    :goto_f
    check-cast v8, Lxk1;

    .line 12
    invoke-interface {v8}, Lgu2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lk03;

    .line 13
    iget-wide v4, v11, Lk03;->b:J

    .line 14
    iget-object v11, v11, Lk03;->c:Lf13;

    .line 15
    new-instance v14, Lk03;

    new-instance v12, Lsd;

    invoke-direct {v12, v1}, Lsd;-><init>(Ljava/lang/String;)V

    invoke-direct {v14, v12, v4, v5, v11}, Lk03;-><init>(Lsd;JLf13;)V

    .line 16
    invoke-virtual {v0, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v4

    .line 17
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v5

    const/16 v11, 0x9

    if-nez v4, :cond_13

    if-ne v5, v13, :cond_14

    .line 18
    :cond_13
    new-instance v5, Lr1;

    invoke-direct {v5, v11, v14, v8}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    invoke-virtual {v0, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 20
    :cond_14
    check-cast v5, Lxm0;

    invoke-static {v5, v0}, Leu;->r(Lxm0;Lpx;)V

    and-int/lit8 v4, v3, 0xe

    const/4 v12, 0x4

    if-ne v4, v12, :cond_15

    move/from16 v4, p15

    goto :goto_10

    :cond_15
    move/from16 v4, v19

    .line 21
    :goto_10
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_16

    if-ne v5, v13, :cond_17

    .line 22
    :cond_16
    invoke-static {v1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    move-result-object v5

    .line 23
    invoke-virtual {v0, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 24
    :cond_17
    check-cast v5, Lxk1;

    .line 25
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v4, v8

    .line 26
    new-instance v8, Lxx0;

    .line 27
    iget v12, v7, Lm51;->a:I

    .line 28
    new-instance v11, Ll51;

    invoke-direct {v11, v12}, Ll51;-><init>(I)V

    const/4 v1, -0x1

    const/16 v21, 0x0

    if-ne v12, v1, :cond_18

    move-object/from16 v11, v21

    :cond_18
    if-eqz v11, :cond_19

    .line 29
    iget v1, v11, Ll51;->a:I

    goto :goto_11

    :cond_19
    move/from16 v1, v19

    .line 30
    :goto_11
    iget v11, v7, Lm51;->b:I

    .line 31
    new-instance v12, Ln51;

    invoke-direct {v12, v11}, Ln51;-><init>(I)V

    if-nez v11, :cond_1a

    move-object/from16 v12, v21

    :cond_1a
    if-eqz v12, :cond_1b

    .line 32
    iget v11, v12, Ln51;->a:I

    move v12, v11

    :goto_12
    move-object v11, v14

    goto :goto_13

    :cond_1b
    move/from16 v12, p15

    goto :goto_12

    .line 33
    :goto_13
    sget-object v14, Lkc1;->j:Lkc1;

    move-object/from16 v21, v13

    move/from16 v13, p15

    move v10, v1

    move-object/from16 p12, v11

    move-object/from16 v1, v21

    const/16 v21, 0x9

    move/from16 v11, p15

    .line 34
    invoke-direct/range {v8 .. v14}, Lxx0;-><init>(ZIZIILkc1;)V

    xor-int/lit8 v15, p8, 0x1

    move/from16 v9, v17

    if-eqz p8, :cond_1c

    move/from16 v17, v11

    goto :goto_14

    :cond_1c
    move/from16 v17, p10

    :goto_14
    if-eqz p8, :cond_1d

    move/from16 v16, v11

    :goto_15
    const/16 v10, 0x20

    goto :goto_16

    :cond_1d
    move/from16 v16, p9

    goto :goto_15

    .line 35
    :goto_16
    invoke-virtual {v0, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit8 v13, v3, 0x70

    if-ne v13, v10, :cond_1e

    move/from16 v19, v11

    :cond_1e
    or-int v10, v12, v19

    .line 36
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_1f

    if-ne v11, v1, :cond_20

    .line 37
    :cond_1f
    new-instance v11, Lm0;

    invoke-direct {v11, v2, v4, v5}, Lm0;-><init>(Lin0;Lxk1;Lxk1;)V

    .line 38
    invoke-virtual {v0, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 39
    :cond_20
    check-cast v11, Lin0;

    and-int/lit16 v1, v3, 0x380

    shr-int/lit8 v4, v3, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v1, v4

    shl-int/lit8 v4, v9, 0x9

    const v5, 0xe000

    and-int v9, v4, v5

    or-int/2addr v1, v9

    const/high16 v9, 0x1b0000

    or-int/2addr v1, v9

    const/high16 v9, 0x1c00000

    and-int/2addr v4, v9

    or-int v24, v1, v4

    shr-int/lit8 v1, v3, 0xf

    and-int/lit16 v1, v1, 0x380

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v1, v4

    and-int/2addr v3, v5

    or-int/2addr v1, v3

    or-int v25, v1, v18

    move/from16 v21, p4

    move-object/from16 v19, p7

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v22, p14

    move-object/from16 v23, v0

    move-object v10, v6

    move-object/from16 v18, v8

    move-object v9, v11

    move-object/from16 v13, v20

    move/from16 v20, p3

    move-object/from16 v11, p5

    move-object/from16 v8, p12

    .line 40
    invoke-static/range {v8 .. v25}, Lgf1;->a(Lk03;Lin0;Luh1;Lm13;Lwb3;Lin0;Lft2;ZIILxx0;Lk51;ZZLkw;Lpx;II)V

    goto :goto_17

    :cond_21
    move-object/from16 v23, v0

    .line 41
    invoke-virtual/range {v23 .. v23}, Lgo0;->R()V

    move-object/from16 v13, p12

    .line 42
    :goto_17
    invoke-virtual/range {v23 .. v23}, Lgo0;->r()Lb62;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object v1, v0

    new-instance v0, Lhk;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move-object/from16 v26, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lhk;-><init>(Ljava/lang/String;Lin0;Luh1;ZZLm13;Lm51;Lk51;ZIILwb3;Lin0;Lft2;Lkw;I)V

    move-object/from16 v1, v26

    .line 43
    iput-object v0, v1, Lb62;->d:Lmn0;

    :cond_22
    return-void
.end method
