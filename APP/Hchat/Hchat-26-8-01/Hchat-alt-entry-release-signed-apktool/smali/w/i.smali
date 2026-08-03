.class public abstract Lw/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0, v0}, Lg4/a;->d(FF)J

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final a(Ljava/lang/String;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p14

    move/from16 v3, p15

    move/from16 v4, p16

    move/from16 v5, p17

    const v6, 0x78d0d0fc

    .line 1
    invoke-virtual {v0, v6}, Li0/h0;->b0(I)Li0/h0;

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v3

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    and-int/lit8 v9, v3, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    :cond_3
    and-int/lit16 v9, v3, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    goto :goto_4

    :cond_5
    move-object/from16 v9, p2

    :goto_4
    and-int/lit8 v11, v5, 0x8

    if-eqz v11, :cond_7

    or-int/lit16 v6, v6, 0xc00

    :cond_6
    move/from16 v12, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v12, v3, 0xc00

    if-nez v12, :cond_6

    move/from16 v12, p3

    invoke-virtual {v0, v12}, Li0/h0;->g(Z)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x800

    goto :goto_5

    :cond_8
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v6, v13

    :goto_6
    or-int/lit16 v6, v6, 0x6000

    const/high16 v13, 0x30000

    and-int v14, v3, v13

    const/high16 v16, 0x20000

    if-nez v14, :cond_a

    move-object/from16 v14, p4

    invoke-virtual {v0, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_9

    move/from16 v17, v16

    goto :goto_7

    :cond_9
    const/high16 v17, 0x10000

    :goto_7
    or-int v6, v6, v17

    goto :goto_8

    :cond_a
    move-object/from16 v14, p4

    :goto_8
    and-int/lit8 v17, v5, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_b

    or-int v6, v6, v18

    move-object/from16 v8, p5

    goto :goto_a

    :cond_b
    and-int v18, v3, v18

    move-object/from16 v8, p5

    if-nez v18, :cond_d

    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_c

    const/high16 v19, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v19, 0x80000

    :goto_9
    or-int v6, v6, v19

    :cond_d
    :goto_a
    const/high16 v19, 0xc00000

    or-int v19, v6, v19

    move/from16 v20, v13

    and-int/lit16 v13, v5, 0x100

    if-eqz v13, :cond_f

    const/high16 v19, 0x6c00000

    or-int v19, v6, v19

    :cond_e
    move/from16 v6, p7

    goto :goto_c

    :cond_f
    const/high16 v6, 0x6000000

    and-int/2addr v6, v3

    if-nez v6, :cond_e

    move/from16 v6, p7

    invoke-virtual {v0, v6}, Li0/h0;->g(Z)Z

    move-result v21

    if-eqz v21, :cond_10

    const/high16 v21, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v21, 0x2000000

    :goto_b
    or-int v19, v19, v21

    :goto_c
    const/high16 v21, 0x30000000

    and-int v21, v3, v21

    if-nez v21, :cond_13

    and-int/lit16 v15, v5, 0x200

    if-nez v15, :cond_11

    move/from16 v15, p8

    invoke-virtual {v0, v15}, Li0/h0;->d(I)Z

    move-result v22

    if-eqz v22, :cond_12

    const/high16 v22, 0x20000000

    goto :goto_d

    :cond_11
    move/from16 v15, p8

    :cond_12
    const/high16 v22, 0x10000000

    :goto_d
    or-int v19, v19, v22

    goto :goto_e

    :cond_13
    move/from16 v15, p8

    :goto_e
    and-int/lit16 v10, v5, 0x400

    if-eqz v10, :cond_14

    or-int/lit8 v18, v4, 0x6

    move/from16 v7, p9

    :goto_f
    move/from16 v3, v18

    goto :goto_11

    :cond_14
    and-int/lit8 v23, v4, 0x6

    move/from16 v7, p9

    if-nez v23, :cond_16

    invoke-virtual {v0, v7}, Li0/h0;->d(I)Z

    move-result v24

    if-eqz v24, :cond_15

    const/16 v18, 0x4

    goto :goto_10

    :cond_15
    const/16 v18, 0x2

    :goto_10
    or-int v18, v4, v18

    goto :goto_f

    :cond_16
    move v3, v4

    :goto_11
    or-int/lit16 v6, v3, 0xdb0

    move/from16 v18, v6

    and-int/lit16 v6, v5, 0x4000

    if-eqz v6, :cond_18

    or-int/lit16 v3, v3, 0x6db0

    move/from16 v18, v3

    :cond_17
    move-object/from16 v3, p12

    goto :goto_13

    :cond_18
    and-int/lit16 v3, v4, 0x6000

    if-nez v3, :cond_17

    move-object/from16 v3, p12

    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_19

    const/16 v24, 0x4000

    goto :goto_12

    :cond_19
    const/16 v24, 0x2000

    :goto_12
    or-int v18, v18, v24

    :goto_13
    const v24, 0x8000

    and-int v24, v5, v24

    if-eqz v24, :cond_1a

    or-int v18, v18, v20

    move-object/from16 v3, p13

    goto :goto_15

    :cond_1a
    and-int v20, v4, v20

    move-object/from16 v3, p13

    if-nez v20, :cond_1c

    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1b

    goto :goto_14

    :cond_1b
    const/high16 v16, 0x10000

    :goto_14
    or-int v18, v18, v16

    :cond_1c
    :goto_15
    const v16, 0x12492493

    and-int v3, v19, v16

    const v4, 0x12492492

    const/16 v16, 0x0

    const/16 v20, 0x1

    if-ne v3, v4, :cond_1e

    const v3, 0x12493

    and-int v3, v18, v3

    const v4, 0x12492

    if-eq v3, v4, :cond_1d

    goto :goto_16

    :cond_1d
    move/from16 v3, v16

    goto :goto_17

    :cond_1e
    :goto_16
    move/from16 v3, v20

    :goto_17
    and-int/lit8 v4, v19, 0x1

    invoke-virtual {v0, v4, v3}, Li0/h0;->S(IZ)Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-virtual {v0}, Li0/h0;->X()V

    and-int/lit8 v3, p15, 0x1

    sget-object v4, Li0/l;->a:Li0/e;

    const v21, -0x70000001

    if-eqz v3, :cond_21

    invoke-virtual {v0}, Li0/h0;->B()Z

    move-result v3

    if-eqz v3, :cond_1f

    goto :goto_1a

    .line 2
    :cond_1f
    invoke-virtual {v0}, Li0/h0;->V()V

    and-int/lit16 v3, v5, 0x200

    if-eqz v3, :cond_20

    and-int v19, v19, v21

    :cond_20
    move-object/from16 v14, p6

    move/from16 v6, p7

    move-object/from16 v9, p12

    move/from16 v24, v7

    move-object v3, v8

    move/from16 v21, v15

    move/from16 v11, v16

    move/from16 v10, v19

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    :goto_18
    move-object/from16 v16, p13

    :goto_19
    move v15, v12

    goto/16 :goto_1f

    :cond_21
    :goto_1a
    if-eqz v11, :cond_22

    move/from16 v12, v20

    :cond_22
    if-eqz v17, :cond_23

    .line 3
    sget-object v3, Lw/p0;->b:Lw/p0;

    goto :goto_1b

    :cond_23
    move-object v3, v8

    :goto_1b
    if-eqz v13, :cond_24

    move/from16 v8, v16

    goto :goto_1c

    :cond_24
    move/from16 v8, p7

    :goto_1c
    and-int/lit16 v11, v5, 0x200

    if-eqz v11, :cond_26

    if-eqz v8, :cond_25

    move/from16 v11, v20

    goto :goto_1d

    :cond_25
    const v11, 0x7fffffff

    :goto_1d
    and-int v19, v19, v21

    move v15, v11

    :cond_26
    if-eqz v10, :cond_27

    move/from16 v7, v20

    .line 4
    :cond_27
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_28

    .line 5
    new-instance v10, Lr9/p;

    const/16 v11, 0x11

    invoke-direct {v10, v11}, Lr9/p;-><init>(I)V

    .line 6
    invoke-virtual {v0, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 7
    :cond_28
    check-cast v10, Lfg/l;

    if-eqz v6, :cond_29

    .line 8
    new-instance v6, Lf1/t0;

    move/from16 p5, v7

    move/from16 p3, v8

    .line 9
    sget-wide v7, Lf1/w;->b:J

    .line 10
    invoke-direct {v6, v7, v8}, Lf1/t0;-><init>(J)V

    goto :goto_1e

    :cond_29
    move/from16 p5, v7

    move/from16 p3, v8

    move-object/from16 v6, p12

    :goto_1e
    sget-object v7, Lw/o0;->a:Lw/o0;

    sget-object v8, Ln2/a0;->a:Lj8/o;

    if-eqz v24, :cond_2a

    sget-object v11, Lw/s;->a:Ls0/d;

    move/from16 v9, v16

    move-object/from16 v16, v11

    move v11, v9

    move/from16 v24, p5

    move-object v9, v6

    move-object v14, v7

    move-object v7, v8

    move-object v8, v10

    move/from16 v21, v15

    move/from16 v10, v19

    move/from16 v6, p3

    goto :goto_19

    :cond_2a
    move/from16 v24, p5

    move-object v9, v6

    move-object v14, v7

    move-object v7, v8

    move-object v8, v10

    move/from16 v21, v15

    move/from16 v11, v16

    move/from16 v10, v19

    move/from16 v6, p3

    goto :goto_18

    .line 11
    :goto_1f
    invoke-virtual {v0}, Li0/h0;->q()V

    .line 12
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_2b

    .line 13
    new-instance v12, Ln2/s;

    move-object/from16 p3, v7

    move-object/from16 p5, v8

    const-wide/16 v7, 0x0

    const/4 v13, 0x6

    invoke-direct {v12, v13, v1, v7, v8}, Ln2/s;-><init>(ILjava/lang/String;J)V

    invoke-static {v12}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v12

    .line 14
    invoke-virtual {v0, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    goto :goto_20

    :cond_2b
    move-object/from16 p3, v7

    move-object/from16 p5, v8

    .line 15
    :goto_20
    check-cast v12, Li0/a1;

    .line 16
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln2/s;

    move-object/from16 p7, v12

    .line 17
    iget-wide v11, v7, Ln2/s;->b:J

    .line 18
    iget-object v7, v7, Ln2/s;->c:Li2/m0;

    .line 19
    new-instance v8, Ln2/s;

    new-instance v13, Li2/g;

    invoke-direct {v13, v1}, Li2/g;-><init>(Ljava/lang/String;)V

    invoke-direct {v8, v13, v11, v12, v7}, Ln2/s;-><init>(Li2/g;JLi2/m0;)V

    .line 20
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    .line 21
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_2d

    if-ne v11, v4, :cond_2c

    goto :goto_21

    :cond_2c
    move-object/from16 v12, p7

    goto :goto_22

    .line 22
    :cond_2d
    :goto_21
    new-instance v11, Lsh/v1;

    const/4 v7, 0x2

    move-object/from16 v12, p7

    invoke-direct {v11, v8, v7, v12}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 23
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 24
    :goto_22
    check-cast v11, Lfg/a;

    invoke-static {v11, v0}, Li0/r;->j(Lfg/a;Li0/h0;)V

    and-int/lit8 v7, v10, 0xe

    const/4 v11, 0x4

    if-ne v7, v11, :cond_2e

    move/from16 v7, v20

    goto :goto_23

    :cond_2e
    const/4 v7, 0x0

    .line 25
    :goto_23
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_2f

    if-ne v11, v4, :cond_30

    .line 26
    :cond_2f
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v11

    .line 27
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 28
    :cond_30
    check-cast v11, Li0/a1;

    .line 29
    invoke-virtual {v3, v6}, Lw/p0;->a(Z)Ln2/j;

    move-result-object v13

    xor-int/lit8 v7, v6, 0x1

    if-eqz v6, :cond_31

    move/from16 v17, v20

    goto :goto_24

    :cond_31
    move/from16 v17, v24

    :goto_24
    if-eqz v6, :cond_32

    move/from16 v19, v20

    goto :goto_25

    :cond_32
    move/from16 v19, v21

    .line 30
    :goto_25
    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v23

    and-int/lit8 v1, v10, 0x70

    move-object/from16 p7, v3

    const/16 v3, 0x20

    if-ne v1, v3, :cond_33

    goto :goto_26

    :cond_33
    const/16 v20, 0x0

    :goto_26
    or-int v1, v23, v20

    .line 31
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_34

    if-ne v3, v4, :cond_35

    .line 32
    :cond_34
    new-instance v3, Lw/g;

    const/4 v1, 0x0

    invoke-direct {v3, v2, v12, v11, v1}, Lw/g;-><init>(Lfg/l;Li0/a1;Li0/a1;I)V

    .line 33
    invoke-virtual {v0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 34
    :cond_35
    move-object v4, v3

    check-cast v4, Lfg/l;

    and-int/lit16 v1, v10, 0x380

    shr-int/lit8 v3, v10, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v1, v3

    shl-int/lit8 v3, v18, 0x9

    const v11, 0xe000

    and-int v12, v3, v11

    or-int/2addr v1, v12

    const/high16 v12, 0x70000

    and-int v20, v3, v12

    or-int v1, v1, v20

    const/high16 v20, 0x380000

    and-int v20, v3, v20

    or-int v1, v1, v20

    const/high16 v20, 0x1c00000

    and-int v3, v3, v20

    or-int/2addr v1, v3

    shr-int/lit8 v3, v10, 0xf

    and-int/lit16 v3, v3, 0x380

    move/from16 p6, v11

    and-int/lit16 v11, v10, 0x1c00

    or-int/2addr v3, v11

    and-int v10, v10, p6

    or-int/2addr v3, v10

    and-int v10, v18, v12

    or-int/2addr v3, v10

    move-object/from16 v5, p2

    move/from16 v18, v1

    move v1, v6

    move v10, v7

    move/from16 v12, v17

    move/from16 v11, v19

    move-object/from16 v7, p3

    move-object/from16 v6, p4

    move-object/from16 v17, v0

    move/from16 v19, v3

    move-object v3, v8

    move-object/from16 v8, p5

    move-object/from16 v0, p7

    .line 35
    invoke-static/range {v3 .. v19}, Lw/s;->f(Ln2/s;Lfg/l;Ly0/o;Li2/n0;Lj8/o;Lfg/l;Lf1/s;ZIILn2/j;Lw/o0;ZLfg/q;Li0/h0;II)V

    move-object v6, v0

    move-object v11, v7

    move-object v12, v8

    move-object v13, v9

    move-object v7, v14

    move v4, v15

    move-object/from16 v14, v16

    move/from16 v9, v21

    move/from16 v10, v24

    move v8, v1

    goto :goto_27

    .line 36
    :cond_36
    invoke-virtual/range {p14 .. p14}, Li0/h0;->V()V

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move v10, v7

    move-object v6, v8

    move v4, v12

    move v9, v15

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v12, p11

    .line 37
    :goto_27
    invoke-virtual/range {p14 .. p14}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_37

    move-object v1, v0

    new-instance v0, Lw/h;

    const/16 v18, 0x0

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v25, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lw/h;-><init>(Ljava/lang/Object;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;IIII)V

    move-object/from16 v1, v25

    .line 38
    iput-object v0, v1, Li0/r1;->d:Lfg/p;

    :cond_37
    return-void
.end method

.method public static final b(Ln2/s;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v14, p14

    move/from16 v2, p16

    move/from16 v3, p17

    const v4, -0x39e1fa71

    .line 1
    invoke-virtual {v14, v4}, Li0/h0;->b0(I)Li0/h0;

    invoke-virtual {v14, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p15, v4

    invoke-virtual {v14, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/16 v7, 0x20

    goto :goto_1

    :cond_1
    const/16 v7, 0x10

    :goto_1
    or-int/2addr v4, v7

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x100

    goto :goto_2

    :cond_2
    const/16 v9, 0x80

    :goto_2
    or-int/2addr v4, v9

    or-int/lit16 v4, v4, 0x6c00

    move-object/from16 v9, p4

    invoke-virtual {v14, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/high16 v10, 0x20000

    goto :goto_3

    :cond_3
    const/high16 v10, 0x10000

    :goto_3
    or-int/2addr v4, v10

    and-int/lit8 v10, v3, 0x40

    const/high16 v11, 0x180000

    if-eqz v10, :cond_5

    or-int/2addr v4, v11

    :cond_4
    move-object/from16 v11, p5

    goto :goto_5

    :cond_5
    and-int v11, p15, v11

    if-nez v11, :cond_4

    move-object/from16 v11, p5

    invoke-virtual {v14, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/high16 v12, 0x100000

    goto :goto_4

    :cond_6
    const/high16 v12, 0x80000

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    const/high16 v12, 0xc00000

    or-int/2addr v12, v4

    and-int/lit16 v13, v3, 0x100

    if-eqz v13, :cond_8

    const/high16 v12, 0x6c00000

    or-int/2addr v12, v4

    :cond_7
    move/from16 v4, p7

    goto :goto_7

    :cond_8
    const/high16 v4, 0x6000000

    and-int v4, p15, v4

    if-nez v4, :cond_7

    move/from16 v4, p7

    invoke-virtual {v14, v4}, Li0/h0;->g(Z)Z

    move-result v15

    if-eqz v15, :cond_9

    const/high16 v15, 0x4000000

    goto :goto_6

    :cond_9
    const/high16 v15, 0x2000000

    :goto_6
    or-int/2addr v12, v15

    :goto_7
    const/high16 v15, 0x10000000

    or-int/2addr v12, v15

    and-int/lit16 v15, v3, 0x400

    if-eqz v15, :cond_a

    or-int/lit8 v5, v2, 0x6

    move v8, v5

    move/from16 v5, p9

    goto :goto_9

    :cond_a
    and-int/lit8 v16, v2, 0x6

    move/from16 v5, p9

    if-nez v16, :cond_c

    invoke-virtual {v14, v5}, Li0/h0;->d(I)Z

    move-result v17

    if-eqz v17, :cond_b

    const/16 v16, 0x4

    goto :goto_8

    :cond_b
    const/16 v16, 0x2

    :goto_8
    or-int v16, v2, v16

    move/from16 v8, v16

    goto :goto_9

    :cond_c
    move v8, v2

    :goto_9
    or-int/lit16 v6, v8, 0xdb0

    and-int/lit16 v4, v3, 0x4000

    if-eqz v4, :cond_e

    or-int/lit16 v6, v8, 0x6db0

    :cond_d
    move-object/from16 v8, p12

    goto :goto_b

    :cond_e
    and-int/lit16 v8, v2, 0x6000

    if-nez v8, :cond_d

    move-object/from16 v8, p12

    invoke-virtual {v14, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_f

    const/16 v18, 0x4000

    goto :goto_a

    :cond_f
    const/16 v18, 0x2000

    :goto_a
    or-int v6, v6, v18

    :goto_b
    const/high16 v18, 0x30000

    or-int v6, v6, v18

    const v18, 0x12492493

    and-int v2, v12, v18

    const v3, 0x12492492

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-ne v2, v3, :cond_11

    const v2, 0x12493

    and-int/2addr v2, v6

    const v3, 0x12492

    if-eq v2, v3, :cond_10

    goto :goto_c

    :cond_10
    move/from16 v2, v18

    goto :goto_d

    :cond_11
    :goto_c
    move/from16 v2, v19

    :goto_d
    and-int/lit8 v3, v12, 0x1

    invoke-virtual {v14, v3, v2}, Li0/h0;->S(IZ)Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-virtual {v14}, Li0/h0;->X()V

    and-int/lit8 v2, p15, 0x1

    sget-object v3, Li0/l;->a:Li0/e;

    const v20, -0x70000001

    if-eqz v2, :cond_13

    invoke-virtual {v14}, Li0/h0;->B()Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_e

    .line 2
    :cond_12
    invoke-virtual {v14}, Li0/h0;->V()V

    and-int v2, v12, v20

    move/from16 v12, p3

    move/from16 v4, p7

    move/from16 v20, p8

    move-object/from16 v13, p13

    move v10, v2

    move/from16 v21, v5

    move v15, v6

    move-object v6, v8

    move-object v2, v11

    move-object/from16 v11, p6

    move-object/from16 v8, p10

    move-object/from16 v5, p11

    goto/16 :goto_13

    :cond_13
    :goto_e
    if-eqz v10, :cond_14

    .line 3
    sget-object v2, Lw/p0;->b:Lw/p0;

    goto :goto_f

    :cond_14
    move-object v2, v11

    :goto_f
    if-eqz v13, :cond_15

    move/from16 v10, v18

    goto :goto_10

    :cond_15
    move/from16 v10, p7

    :goto_10
    if-eqz v10, :cond_16

    move/from16 v11, v19

    goto :goto_11

    :cond_16
    const v11, 0x7fffffff

    :goto_11
    and-int v12, v12, v20

    if-eqz v15, :cond_17

    move/from16 v5, v19

    .line 4
    :cond_17
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v3, :cond_18

    .line 5
    new-instance v13, Lr9/p;

    const/16 v15, 0x11

    invoke-direct {v13, v15}, Lr9/p;-><init>(I)V

    .line 6
    invoke-virtual {v14, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 7
    :cond_18
    check-cast v13, Lfg/l;

    if-eqz v4, :cond_19

    .line 8
    new-instance v4, Lf1/t0;

    move/from16 p3, v5

    move v15, v6

    .line 9
    sget-wide v5, Lf1/w;->b:J

    .line 10
    invoke-direct {v4, v5, v6}, Lf1/t0;-><init>(J)V

    goto :goto_12

    :cond_19
    move/from16 p3, v5

    move v15, v6

    move-object v4, v8

    :goto_12
    sget-object v5, Lw/s;->b:Ls0/d;

    sget-object v6, Lw/o0;->a:Lw/o0;

    sget-object v8, Ln2/a0;->a:Lj8/o;

    move-object/from16 v20, v13

    move-object v13, v5

    move-object/from16 v5, v20

    move/from16 v21, p3

    move/from16 v20, v11

    move-object v11, v6

    move-object v6, v4

    move v4, v10

    move v10, v12

    move/from16 v12, v19

    .line 11
    :goto_13
    invoke-virtual {v14}, Li0/h0;->q()V

    .line 12
    invoke-virtual {v2, v4}, Lw/p0;->a(Z)Ln2/j;

    move-result-object v22

    xor-int/lit8 v7, v4, 0x1

    if-eqz v4, :cond_1a

    move/from16 v9, v19

    goto :goto_14

    :cond_1a
    move/from16 v9, v21

    :goto_14
    move/from16 v23, v4

    if-eqz v4, :cond_1b

    move-object v4, v8

    move/from16 v8, v19

    goto :goto_15

    :cond_1b
    move-object v4, v8

    move/from16 v8, v20

    :goto_15
    move-object/from16 p3, v2

    and-int/lit8 v2, v10, 0xe

    move-object/from16 p5, v4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_1c

    move/from16 v2, v19

    goto :goto_16

    :cond_1c
    move/from16 v2, v18

    :goto_16
    and-int/lit8 v4, v10, 0x70

    move/from16 p6, v2

    const/16 v2, 0x20

    if-ne v4, v2, :cond_1d

    move/from16 v18, v19

    :cond_1d
    or-int v2, p6, v18

    .line 13
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1e

    if-ne v4, v3, :cond_1f

    .line 14
    :cond_1e
    new-instance v4, Lm/b;

    const/16 v2, 0x15

    invoke-direct {v4, v0, v2, v1}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    invoke-virtual {v14, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 16
    :cond_1f
    check-cast v4, Lfg/l;

    and-int/lit16 v2, v10, 0x38e

    shr-int/lit8 v3, v10, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v15, 0x9

    const v10, 0xe000

    and-int/2addr v10, v3

    or-int/2addr v2, v10

    const/high16 v10, 0x70000

    and-int v16, v3, v10

    or-int v2, v2, v16

    const/high16 v16, 0x380000

    and-int v16, v3, v16

    or-int v2, v2, v16

    const/high16 v16, 0x1c00000

    and-int v3, v3, v16

    or-int/2addr v2, v3

    const/16 v3, 0x6d80

    and-int/2addr v10, v15

    or-int v16, v3, v10

    move-object/from16 v17, p3

    move-object/from16 v3, p4

    move v15, v2

    move-object v1, v4

    move-object/from16 v10, v22

    move-object/from16 v2, p2

    move-object/from16 v4, p5

    .line 17
    invoke-static/range {v0 .. v16}, Lw/s;->f(Ln2/s;Lfg/l;Ly0/o;Li2/n0;Lj8/o;Lfg/l;Lf1/s;ZIILn2/j;Lw/o0;ZLfg/q;Li0/h0;II)V

    move-object v7, v11

    move-object v14, v13

    move/from16 v9, v20

    move/from16 v10, v21

    move/from16 v8, v23

    move-object v11, v4

    move-object v13, v6

    move v4, v12

    move-object/from16 v6, v17

    move-object v12, v5

    goto :goto_17

    .line 18
    :cond_20
    invoke-virtual/range {p14 .. p14}, Li0/h0;->V()V

    move/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move v10, v5

    move-object v13, v8

    move-object v6, v11

    move/from16 v8, p7

    move-object/from16 v11, p10

    .line 19
    :goto_17
    invoke-virtual/range {p14 .. p14}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_21

    move-object v1, v0

    new-instance v0, Lw/h;

    const/16 v18, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v24, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lw/h;-><init>(Ljava/lang/Object;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;IIII)V

    move-object/from16 v1, v24

    .line 20
    iput-object v0, v1, Li0/r1;->d:Lfg/p;

    :cond_21
    return-void
.end method
