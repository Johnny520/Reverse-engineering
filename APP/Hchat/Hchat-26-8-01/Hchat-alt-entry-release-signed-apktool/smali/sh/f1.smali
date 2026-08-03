.class public abstract Lsh/f1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const v2, 0x3f19999a    # 0.6f

    .line 4
    .line 5
    .line 6
    const v3, 0x4476c000    # 987.0f

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lsh/f1;->a:Li/r0;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(FLfg/l;Ly0/o;ZLlg/a;ILfg/a;FLsh/r0;Lsh/s0;ZLjava/util/List;FLi0/h0;II)V
    .locals 49

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v15, p13

    iget v3, v5, Llg/a;->b:F

    iget v4, v5, Llg/a;->a:F

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x6ba1e0e3

    .line 1
    invoke-virtual {v15, v6}, Li0/h0;->b0(I)Li0/h0;

    invoke-virtual {v15, v1}, Li0/h0;->c(F)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int v6, p14, v6

    and-int/lit8 v8, p14, 0x30

    if-nez v8, :cond_2

    invoke-virtual {v15, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/16 v8, 0x20

    goto :goto_1

    :cond_1
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v6, v8

    :cond_2
    or-int/lit16 v6, v6, 0xc00

    invoke-virtual {v15, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x4000

    goto :goto_2

    :cond_3
    const/16 v8, 0x2000

    :goto_2
    or-int/2addr v6, v8

    and-int/lit8 v8, p15, 0x40

    if-eqz v8, :cond_4

    const/high16 v9, 0x180000

    or-int/2addr v6, v9

    move-object/from16 v9, p6

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    invoke-virtual {v15, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/high16 v12, 0x100000

    goto :goto_3

    :cond_5
    const/high16 v12, 0x80000

    :goto_3
    or-int/2addr v6, v12

    :goto_4
    const/high16 v12, 0x16c00000

    or-int/2addr v6, v12

    const v12, 0x12492493

    and-int/2addr v12, v6

    const v13, 0x12492492

    if-ne v12, v13, :cond_6

    const/4 v12, 0x0

    goto :goto_5

    :cond_6
    const/4 v12, 0x1

    :goto_5
    and-int/lit8 v13, v6, 0x1

    invoke-virtual {v15, v13, v12}, Li0/h0;->S(IZ)Z

    move-result v12

    if-eqz v12, :cond_4e

    invoke-virtual {v15}, Li0/h0;->X()V

    and-int/lit8 v12, p14, 0x1

    const v13, -0x70000001

    sget-object v14, Li0/l;->a:Li0/e;

    if-eqz v12, :cond_8

    invoke-virtual {v15}, Li0/h0;->B()Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_7

    .line 2
    :cond_7
    invoke-virtual {v15}, Li0/h0;->V()V

    and-int/2addr v6, v13

    move/from16 v0, p3

    move/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v20, p9

    move/from16 v39, v3

    move/from16 v40, v4

    move-object v1, v9

    move-object v9, v14

    move/from16 v3, p12

    :goto_6
    move v4, v6

    goto/16 :goto_9

    :cond_8
    :goto_7
    if-eqz v8, :cond_9

    const/4 v9, 0x0

    .line 3
    :cond_9
    sget v8, Lsh/t0;->a:F

    .line 4
    sget-object v12, Lbi/d;->a:Li0/m2;

    .line 5
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v19

    .line 6
    check-cast v19, Lbi/b;

    move/from16 p3, v8

    .line 7
    invoke-virtual/range {v19 .. v19}, Lbi/b;->j()J

    move-result-wide v7

    .line 8
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v19

    move/from16 v37, v13

    .line 9
    move-object/from16 v13, v19

    check-cast v13, Lbi/b;

    .line 10
    iget-object v13, v13, Lbi/b;->m:Li0/j1;

    .line 11
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf1/w;

    .line 12
    iget-wide v10, v13, Lf1/w;->a:J

    .line 13
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v13

    .line 14
    check-cast v13, Lbi/b;

    .line 15
    iget-object v13, v13, Lbi/b;->a0:Li0/j1;

    .line 16
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf1/w;

    move/from16 v38, v6

    .line 17
    iget-wide v5, v13, Lf1/w;->a:J

    .line 18
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v13

    .line 19
    check-cast v13, Lbi/b;

    .line 20
    iget-object v13, v13, Lbi/b;->t:Li0/j1;

    .line 21
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf1/w;

    .line 22
    iget-wide v0, v13, Lf1/w;->a:J

    .line 23
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v13

    .line 24
    check-cast v13, Lbi/b;

    move/from16 v39, v3

    move/from16 v40, v4

    .line 25
    invoke-virtual {v13}, Lbi/b;->e()J

    move-result-wide v3

    .line 26
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v13

    .line 27
    check-cast v13, Lbi/b;

    move-object/from16 v41, v14

    .line 28
    invoke-virtual {v13}, Lbi/b;->b()J

    move-result-wide v13

    .line 29
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 p6, v9

    .line 30
    move-object/from16 v9, v20

    check-cast v9, Lbi/b;

    .line 31
    iget-object v9, v9, Lbi/b;->Y:Li0/j1;

    .line 32
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lf1/w;

    move-wide/from16 v31, v13

    .line 33
    iget-wide v13, v9, Lf1/w;->a:J

    .line 34
    invoke-virtual {v15, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v9

    .line 35
    check-cast v9, Lbi/b;

    .line 36
    iget-object v9, v9, Lbi/b;->Z:Li0/j1;

    .line 37
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lf1/w;

    move-wide/from16 v33, v13

    .line 38
    iget-wide v12, v9, Lf1/w;->a:J

    .line 39
    invoke-virtual {v15, v7, v8}, Li0/h0;->e(J)Z

    move-result v9

    .line 40
    invoke-virtual {v15, v10, v11}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    .line 41
    invoke-virtual {v15, v5, v6}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    .line 42
    invoke-virtual {v15, v0, v1}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    .line 43
    invoke-virtual {v15, v3, v4}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    move-wide/from16 v27, v0

    move-wide/from16 v0, v31

    .line 44
    invoke-virtual {v15, v0, v1}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    move-wide/from16 v0, v33

    .line 45
    invoke-virtual {v15, v0, v1}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    .line 46
    invoke-virtual {v15, v12, v13}, Li0/h0;->e(J)Z

    move-result v14

    or-int/2addr v9, v14

    .line 47
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v14

    if-nez v9, :cond_a

    move-object/from16 v9, v41

    if-ne v14, v9, :cond_b

    goto :goto_8

    :cond_a
    move-object/from16 v9, v41

    .line 48
    :goto_8
    new-instance v20, Lsh/r0;

    move-wide/from16 v33, v0

    move-wide/from16 v29, v3

    move-wide/from16 v25, v5

    move-wide/from16 v21, v7

    move-wide/from16 v23, v10

    move-wide/from16 v35, v12

    invoke-direct/range {v20 .. v36}, Lsh/r0;-><init>(JJJJJJJJ)V

    move-object/from16 v14, v20

    .line 49
    invoke-virtual {v15, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 50
    :cond_b
    move-object v0, v14

    check-cast v0, Lsh/r0;

    and-int v6, v38, v37

    .line 51
    sget-object v1, Lsh/t0;->b:Lsh/s0;

    const v3, 0x3ca3d70a    # 0.02f

    move/from16 v10, p3

    move-object v11, v0

    move-object/from16 v20, v1

    const/4 v0, 0x1

    move-object/from16 v1, p6

    goto/16 :goto_6

    .line 52
    :goto_9
    invoke-virtual {v15}, Li0/h0;->q()V

    if-ltz p5, :cond_4d

    cmpg-float v5, v40, v39

    if-gez v5, :cond_4c

    .line 53
    sget-object v5, Ly1/h1;->l:Li0/m2;

    .line 54
    invoke-virtual {v15, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v5

    .line 55
    check-cast v5, Ln1/a;

    .line 56
    sget-object v6, Ly1/h1;->n:Li0/m2;

    .line 57
    invoke-virtual {v15, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v6

    .line 58
    check-cast v6, Lu2/m;

    .line 59
    sget-object v7, Lu2/m;->h:Lu2/m;

    if-ne v6, v7, :cond_c

    const/4 v6, 0x1

    goto :goto_a

    :cond_c
    const/4 v6, 0x0

    .line 60
    :goto_a
    invoke-static {v2, v15}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v29

    .line 61
    invoke-static {v1, v15}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v7

    .line 62
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_d

    .line 63
    new-instance v8, Li0/f1;

    const/4 v12, 0x0

    invoke-direct {v8, v12}, Li0/f1;-><init>(F)V

    .line 64
    invoke-virtual {v15, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 65
    :cond_d
    move-object/from16 v26, v8

    check-cast v26, Li0/f1;

    .line 66
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_e

    .line 67
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v8

    .line 68
    invoke-virtual {v15, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 69
    :cond_e
    move-object/from16 v25, v8

    check-cast v25, Li0/a1;

    .line 70
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_f

    .line 71
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v8

    .line 72
    invoke-virtual {v15, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 73
    :cond_f
    check-cast v8, Li0/a1;

    .line 74
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_10

    .line 75
    new-instance v12, Li0/g1;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Li0/g1;-><init>(I)V

    .line 76
    invoke-virtual {v15, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    goto :goto_b

    :cond_10
    const/4 v13, 0x0

    .line 77
    :goto_b
    move-object/from16 v27, v12

    check-cast v27, Li0/g1;

    .line 78
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_11

    .line 79
    new-instance v12, Li0/g1;

    invoke-direct {v12, v13}, Li0/g1;-><init>(I)V

    .line 80
    invoke-virtual {v15, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 81
    :cond_11
    move-object/from16 v28, v12

    check-cast v28, Li0/g1;

    .line 82
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_12

    .line 83
    new-instance v12, Lsh/u0;

    .line 84
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 85
    invoke-virtual {v15, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 86
    :cond_12
    move-object/from16 v24, v12

    check-cast v24, Lsh/u0;

    .line 87
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_13

    .line 88
    new-instance v12, Ln/k;

    invoke-direct {v12}, Ln/k;-><init>()V

    .line 89
    invoke-virtual {v15, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    :cond_13
    check-cast v12, Ln/k;

    const/4 v13, 0x6

    .line 91
    invoke-static {v10, v15, v13}, Lbi/k;->b(FLi0/h0;I)Lf1/r0;

    move-result-object v31

    .line 92
    invoke-static {v12, v15}, Lac/p;->n(Ln/k;Li0/h0;)Li0/a1;

    move-result-object v21

    move/from16 v13, p0

    move-object/from16 v32, v1

    move/from16 v14, v39

    move/from16 v1, v40

    .line 93
    invoke-static {v13, v1, v14}, Lr9/e0;->q(FFF)F

    move-result v1

    .line 94
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    .line 95
    invoke-virtual {v15, v14}, Li0/h0;->g(Z)Z

    move-result v14

    move/from16 p3, v1

    .line 96
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_15

    if-ne v1, v9, :cond_14

    goto :goto_c

    :cond_14
    move-object/from16 p6, v5

    const/4 v5, 0x0

    goto :goto_e

    .line 97
    :cond_15
    :goto_c
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_16

    const v1, 0x3f666666    # 0.9f

    const v14, 0x44db6000    # 1755.0f

    move-object/from16 p6, v5

    const/4 v2, 0x4

    const/4 v5, 0x0

    .line 98
    invoke-static {v1, v14, v5, v2}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    move-result-object v1

    goto :goto_d

    :cond_16
    move-object/from16 p6, v5

    const/4 v2, 0x4

    const/4 v5, 0x0

    const v1, 0x3f75c28f    # 0.96f

    const/high16 v14, 0x43a10000    # 322.0f

    .line 99
    invoke-static {v1, v14, v5, v2}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    move-result-object v1

    .line 100
    :goto_d
    invoke-virtual {v15, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 101
    :goto_e
    check-cast v1, Li/r0;

    const/4 v2, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x1c

    const/4 v14, 0x0

    move-object v13, v1

    move/from16 v22, v10

    move-object v2, v12

    move-object/from16 v1, v27

    move/from16 v12, p3

    move-object v10, v9

    move-object/from16 v9, v28

    .line 102
    invoke-static/range {v12 .. v17}, Li/f;->a(FLi/k;Ljava/lang/String;Li0/h0;II)Li0/l2;

    move-result-object v13

    .line 103
    invoke-interface/range {v21 .. v21}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    const/high16 v15, 0x3f800000    # 1.0f

    if-nez v14, :cond_18

    .line 104
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-nez v14, :cond_18

    .line 105
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_17

    goto :goto_f

    :cond_17
    move v14, v15

    goto :goto_10

    :cond_18
    :goto_f
    const v14, 0x3f904189    # 1.127f

    :goto_10
    const/16 v16, 0x30

    const/16 v17, 0x1c

    move-object/from16 v21, v13

    .line 106
    sget-object v13, Lsh/f1;->a:Li/r0;

    move/from16 v23, v12

    move v12, v14

    const/4 v14, 0x0

    move-object/from16 v15, p13

    move-object/from16 v5, v21

    move/from16 v42, v23

    invoke-static/range {v12 .. v17}, Li/f;->a(FLi/k;Ljava/lang/String;Li0/h0;II)Li0/l2;

    move-result-object v12

    move-object v13, v15

    .line 107
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v10, :cond_1b

    if-nez p5, :cond_1a

    const/4 v14, 0x0

    .line 108
    new-array v15, v14, [F

    move-object/from16 p3, v7

    move-object/from16 p7, v8

    :cond_19
    move-object v14, v15

    goto :goto_12

    :cond_1a
    add-int/lit8 v14, p5, 0x2

    new-array v15, v14, [F

    move-object/from16 p3, v7

    const/4 v7, 0x0

    :goto_11
    move-object/from16 p7, v8

    if-ge v7, v14, :cond_19

    int-to-float v8, v7

    move/from16 v16, v7

    add-int/lit8 v7, p5, 0x1

    int-to-float v7, v7

    div-float/2addr v8, v7

    aput v8, v15, v16

    add-int/lit8 v7, v16, 0x1

    move-object/from16 v8, p7

    goto :goto_11

    .line 109
    :goto_12
    invoke-virtual {v13, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    goto :goto_13

    :cond_1b
    move-object/from16 p3, v7

    move-object/from16 p7, v8

    .line 110
    :goto_13
    check-cast v14, [F

    move-object/from16 v15, p11

    .line 111
    invoke-virtual {v13, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v13, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    const v8, 0xe000

    and-int/2addr v8, v4

    xor-int/lit16 v8, v8, 0x6000

    move/from16 p8, v7

    const/16 v7, 0x4000

    if-le v8, v7, :cond_1d

    move-object/from16 v7, p4

    invoke-virtual {v13, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_1c

    goto :goto_14

    :cond_1c
    move-object/from16 p9, v11

    move-object/from16 p12, v12

    goto :goto_15

    :cond_1d
    move-object/from16 v7, p4

    :goto_14
    move-object/from16 p9, v11

    and-int/lit16 v11, v4, 0x6000

    move-object/from16 p12, v12

    const/16 v12, 0x4000

    if-ne v11, v12, :cond_1e

    :goto_15
    const/4 v11, 0x1

    goto :goto_16

    :cond_1e
    const/4 v11, 0x0

    :goto_16
    or-int v11, p8, v11

    .line 112
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_1f

    if-ne v12, v10, :cond_22

    :cond_1f
    if-eqz v15, :cond_20

    .line 113
    invoke-static {v15, v7}, Lsh/f1;->d(Ljava/util/List;Llg/a;)[F

    move-result-object v11

    move-object v12, v11

    goto :goto_17

    :cond_20
    if-eqz p10, :cond_21

    move-object v12, v14

    goto :goto_17

    :cond_21
    const/4 v11, 0x0

    .line 114
    new-array v12, v11, [F

    .line 115
    :goto_17
    invoke-virtual {v13, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    :cond_22
    move-object/from16 v16, v12

    check-cast v16, [F

    .line 117
    invoke-virtual {v13, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v13, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    const/16 v12, 0x4000

    if-le v8, v12, :cond_24

    invoke-virtual {v13, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_23

    goto :goto_18

    :cond_23
    move/from16 p8, v11

    goto :goto_19

    :cond_24
    :goto_18
    move/from16 p8, v11

    and-int/lit16 v11, v4, 0x6000

    if-ne v11, v12, :cond_25

    :goto_19
    const/4 v11, 0x1

    goto :goto_1a

    :cond_25
    const/4 v11, 0x0

    :goto_1a
    or-int v11, p8, v11

    .line 118
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_27

    if-ne v12, v10, :cond_26

    goto :goto_1b

    :cond_26
    const/4 v11, 0x0

    goto :goto_1d

    :cond_27
    :goto_1b
    if-eqz v15, :cond_28

    .line 119
    invoke-static {v15, v7}, Lsh/f1;->d(Ljava/util/List;Llg/a;)[F

    move-result-object v11

    move-object v12, v11

    const/4 v11, 0x0

    goto :goto_1c

    .line 120
    :cond_28
    array-length v11, v14

    if-nez v11, :cond_29

    const/4 v11, 0x0

    new-array v12, v11, [F

    goto :goto_1c

    :cond_29
    const/4 v11, 0x0

    move-object v12, v14

    .line 121
    :goto_1c
    invoke-virtual {v13, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 122
    :goto_1d
    check-cast v12, [F

    const/16 v11, 0x4000

    if-le v8, v11, :cond_2a

    .line 123
    invoke-virtual {v13, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_2b

    :cond_2a
    and-int/lit16 v15, v4, 0x6000

    if-ne v15, v11, :cond_2c

    :cond_2b
    const/4 v11, 0x1

    goto :goto_1e

    :cond_2c
    const/4 v11, 0x0

    :goto_1e
    invoke-virtual {v13, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v11, v14

    invoke-virtual {v13, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v11, v14

    .line 124
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_2e

    if-ne v14, v10, :cond_2d

    goto :goto_1f

    :cond_2d
    move/from16 v11, p5

    goto :goto_20

    .line 125
    :cond_2e
    :goto_1f
    new-instance v14, Lsh/v0;

    move/from16 v11, p5

    invoke-direct {v14, v7, v11, v12, v3}, Lsh/v0;-><init>(Llg/a;I[FF)V

    .line 126
    invoke-virtual {v13, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 127
    :goto_20
    check-cast v14, Lfg/l;

    .line 128
    invoke-virtual {v1}, Li0/g1;->g()I

    move-result v15

    .line 129
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15, v13}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v15

    .line 130
    invoke-virtual {v9}, Li0/g1;->g()I

    move-result v17

    move/from16 v21, v3

    .line 131
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3, v13}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v3

    .line 132
    sget-object v11, Ly0/l;->a:Ly0/l;

    if-eqz v0, :cond_3e

    move-object/from16 p8, v12

    const v12, 0x4b2cece8    # 1.133284E7f

    invoke-virtual {v13, v12}, Li0/h0;->a0(I)V

    .line 133
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v10, :cond_2f

    .line 134
    new-instance v12, Lm/b;

    move-object/from16 v23, v14

    const/16 v14, 0x11

    invoke-direct {v12, v1, v14, v9}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 135
    invoke-virtual {v13, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    goto :goto_21

    :cond_2f
    move-object/from16 v23, v14

    .line 136
    :goto_21
    check-cast v12, Lfg/l;

    invoke-static {v11, v12}, Lv1/w;->n(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v12

    .line 137
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual {v13, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v13, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v27

    or-int v17, v17, v27

    invoke-virtual {v13, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v27

    or-int v17, v17, v27

    move-object/from16 v27, v1

    const/16 v1, 0x4000

    if-le v8, v1, :cond_31

    invoke-virtual {v13, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_30

    goto :goto_22

    :cond_30
    move-object/from16 v28, v3

    goto :goto_23

    :cond_31
    :goto_22
    move-object/from16 v28, v3

    and-int/lit16 v3, v4, 0x6000

    if-ne v3, v1, :cond_32

    :goto_23
    const/4 v1, 0x1

    goto :goto_24

    :cond_32
    const/4 v1, 0x0

    :goto_24
    or-int v1, v17, v1

    invoke-virtual {v13, v6}, Li0/h0;->g(Z)Z

    move-result v3

    or-int/2addr v1, v3

    .line 138
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_34

    if-ne v3, v10, :cond_33

    goto :goto_25

    :cond_33
    move-object/from16 v43, p3

    move-object/from16 v15, p6

    move v1, v4

    move v4, v6

    move-object/from16 v28, v9

    move-object/from16 v41, v10

    move-object/from16 p3, v11

    move/from16 v34, v21

    move-object/from16 v11, v29

    move-object/from16 v21, v5

    move-object v5, v7

    move v10, v8

    goto :goto_26

    .line 139
    :cond_34
    :goto_25
    new-instance v3, Lsh/c1;

    move-object/from16 v43, p3

    move v1, v4

    move-object v4, v5

    move-object v5, v7

    move-object/from16 v41, v10

    move-object/from16 p3, v11

    move/from16 v34, v21

    move-object/from16 v11, v29

    move-object/from16 v7, p7

    move v10, v8

    move-object/from16 v8, v28

    move-object/from16 v28, v9

    move-object v9, v15

    move-object/from16 v15, p6

    invoke-direct/range {v3 .. v9}, Lsh/c1;-><init>(Li0/l2;Llg/a;ZLi0/a1;Li0/a1;Li0/a1;)V

    move-object/from16 v21, v4

    move v4, v6

    .line 140
    invoke-virtual {v13, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 141
    :goto_26
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v12, v14, v5, v3}, Ls1/h0;->b(Ly0/o;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    move-result-object v3

    .line 142
    invoke-static {v3, v2, v0}, Lk/n;->n(Ly0/o;Ln/k;Z)Ly0/o;

    move-result-object v3

    .line 143
    invoke-virtual {v13, v4}, Li0/h0;->g(Z)Z

    move-result v6

    move-object/from16 v14, v23

    invoke-virtual {v13, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v13, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    const/16 v12, 0x4000

    if-le v10, v12, :cond_35

    invoke-virtual {v13, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    :cond_35
    and-int/lit16 v7, v1, 0x6000

    if-ne v7, v12, :cond_37

    :cond_36
    const/4 v7, 0x1

    goto :goto_27

    :cond_37
    const/4 v7, 0x0

    :goto_27
    or-int/2addr v6, v7

    invoke-virtual {v13, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    move-object/from16 v7, p8

    invoke-virtual {v13, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    move-object/from16 v8, p11

    invoke-virtual {v13, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    .line 144
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_39

    move-object/from16 v6, v41

    if-ne v9, v6, :cond_38

    :goto_28
    move-object v9, v3

    goto :goto_29

    :cond_38
    move-object/from16 v45, p9

    move-object/from16 v47, p12

    move/from16 p6, v0

    move/from16 v17, v1

    move-object/from16 v19, v2

    move-object v1, v3

    move-object v2, v6

    move/from16 v18, v10

    move-object v0, v13

    move-object/from16 v35, v20

    move-object/from16 v46, v21

    move/from16 v44, v22

    move-object/from16 v6, v24

    goto :goto_2a

    :cond_39
    move-object/from16 v6, v41

    goto :goto_28

    .line 145
    :goto_29
    new-instance v3, Lsh/w0;

    move-object/from16 v45, p9

    move-object/from16 v47, p12

    move/from16 p6, v0

    move/from16 v17, v1

    move-object/from16 v19, v2

    move-object v2, v6

    move-object v1, v9

    move/from16 v18, v10

    move-object v0, v13

    move-object v9, v15

    move-object/from16 v46, v21

    move/from16 v44, v22

    move-object/from16 v6, v24

    move-object/from16 v12, v26

    move-object/from16 v13, v27

    move-object v10, v7

    move-object v15, v11

    move-object v7, v5

    move-object v11, v8

    move-object v5, v14

    move-object/from16 v8, v20

    move-object/from16 v14, v28

    invoke-direct/range {v3 .. v15}, Lsh/w0;-><init>(ZLfg/l;Lsh/u0;Llg/a;Lsh/s0;Ln1/a;[FLjava/util/List;Li0/f1;Li0/g1;Li0/g1;Li0/a1;)V

    move-object/from16 v35, v8

    move-object v11, v15

    move-object v14, v5

    move-object v5, v7

    .line 146
    invoke-virtual {v0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v9, v3

    .line 147
    :goto_2a
    check-cast v9, Lfg/l;

    invoke-static {v9, v0}, Lm/s0;->b(Lfg/l;Li0/h0;)Lm/n;

    move-result-object v3

    .line 148
    invoke-virtual {v0, v4}, Li0/h0;->g(Z)Z

    move-result v7

    invoke-virtual {v0, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    .line 149
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_3b

    if-ne v8, v2, :cond_3a

    goto :goto_2b

    :cond_3a
    move-object/from16 v6, v25

    goto :goto_2c

    .line 150
    :cond_3b
    :goto_2b
    new-instance v21, Lsh/d1;

    const/16 v30, 0x0

    move/from16 v22, v4

    move-object/from16 v24, v6

    move-object/from16 v29, v11

    move-object/from16 v23, v14

    invoke-direct/range {v21 .. v30}, Lsh/d1;-><init>(ZLfg/l;Lsh/u0;Li0/a1;Li0/f1;Li0/g1;Li0/g1;Li0/a1;Lwf/c;)V

    move-object/from16 v8, v21

    move-object/from16 v6, v25

    .line 151
    invoke-virtual {v0, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 152
    :goto_2c
    check-cast v8, Lfg/q;

    move-object/from16 v7, v43

    .line 153
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    .line 154
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_3d

    if-ne v10, v2, :cond_3c

    goto :goto_2d

    :cond_3c
    const/4 v9, 0x0

    goto :goto_2e

    .line 155
    :cond_3d
    :goto_2d
    new-instance v10, Lsh/e1;

    const/4 v9, 0x0

    invoke-direct {v10, v6, v7, v9}, Lsh/e1;-><init>(Li0/a1;Li0/a1;Lwf/c;)V

    .line 156
    invoke-virtual {v0, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 157
    :goto_2e
    check-cast v10, Lfg/q;

    .line 158
    invoke-static {v1, v3, v8, v10}, Lm/s0;->a(Ly0/o;Lm/n;Lfg/q;Lfg/q;)Ly0/o;

    move-result-object v1

    move-object/from16 v12, v19

    .line 159
    invoke-static {v1, v12, v9}, Lk/v0;->a(Ly0/o;Ln/k;Lk/y0;)Ly0/o;

    move-result-object v1

    const/4 v13, 0x0

    .line 160
    invoke-virtual {v0, v13}, Li0/h0;->p(Z)V

    :goto_2f
    move-object/from16 v3, p2

    goto :goto_30

    :cond_3e
    move-object/from16 v45, p9

    move-object/from16 v47, p12

    move/from16 p6, v0

    move/from16 v17, v4

    move-object/from16 v46, v5

    move v4, v6

    move-object v5, v7

    move/from16 v18, v8

    move-object v2, v10

    move-object/from16 p3, v11

    move-object v0, v13

    move-object/from16 v35, v20

    move/from16 v34, v21

    move/from16 v44, v22

    move-object/from16 v6, v25

    move-object/from16 v11, v29

    const/4 v13, 0x0

    const v1, 0x4b6c410f    # 1.5483151E7f

    .line 161
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 162
    invoke-virtual {v0, v13}, Li0/h0;->p(Z)V

    move-object/from16 v1, p3

    goto :goto_2f

    .line 163
    :goto_30
    invoke-interface {v3, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v1

    move/from16 v12, v42

    .line 164
    invoke-virtual {v0, v12}, Li0/h0;->c(F)Z

    move-result v7

    move/from16 v10, v18

    const/16 v8, 0x4000

    if-le v10, v8, :cond_40

    invoke-virtual {v0, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3f

    goto :goto_31

    :cond_3f
    move/from16 v9, v17

    goto :goto_32

    :cond_40
    :goto_31
    move/from16 v9, v17

    and-int/lit16 v10, v9, 0x6000

    if-ne v10, v8, :cond_41

    :goto_32
    const/4 v14, 0x1

    goto :goto_33

    :cond_41
    move v14, v13

    :goto_33
    or-int/2addr v7, v14

    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    .line 165
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_43

    if-ne v8, v2, :cond_42

    goto :goto_34

    :cond_42
    move/from16 v7, p5

    goto :goto_35

    .line 166
    :cond_43
    :goto_34
    new-instance v8, Lsh/v0;

    move/from16 v7, p5

    invoke-direct {v8, v12, v5, v7, v11}, Lsh/v0;-><init>(FLlg/a;ILi0/a1;)V

    .line 167
    invoke-virtual {v0, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 168
    :goto_35
    check-cast v8, Lfg/l;

    invoke-static {v1, v8}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v1

    .line 169
    sget-object v8, Ly0/b;->j:Ly0/g;

    .line 170
    invoke-static {v8, v13}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    move-result-object v8

    .line 171
    iget-wide v10, v0, Li0/h0;->T:J

    .line 172
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    .line 173
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    move-result-object v11

    .line 174
    invoke-static {v0, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    move-result-object v1

    .line 175
    sget-object v12, Lx1/g;->f:Lx1/f;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    sget-object v12, Lx1/f;->b:Lx1/y;

    .line 177
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 178
    iget-boolean v13, v0, Li0/h0;->S:Z

    if-eqz v13, :cond_44

    .line 179
    invoke-virtual {v0, v12}, Li0/h0;->k(Lfg/a;)V

    goto :goto_36

    .line 180
    :cond_44
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 181
    :goto_36
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 182
    invoke-static {v12, v0, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 183
    sget-object v8, Lx1/f;->d:Lx1/e;

    .line 184
    invoke-static {v8, v0, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 185
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 186
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 187
    invoke-static {v0, v8, v10}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 188
    sget-object v8, Lx1/f;->g:Lx1/d;

    .line 189
    invoke-static {v8, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 190
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 191
    invoke-static {v8, v0, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    move-object/from16 v1, v45

    if-eqz p6, :cond_45

    .line 192
    iget-wide v10, v1, Lsh/r0;->c:J

    goto :goto_37

    :cond_45
    iget-wide v10, v1, Lsh/r0;->d:J

    :goto_37
    if-eqz p6, :cond_46

    .line 193
    iget-wide v12, v1, Lsh/r0;->a:J

    goto :goto_38

    :cond_46
    iget-wide v12, v1, Lsh/r0;->b:J

    :goto_38
    if-eqz p6, :cond_47

    .line 194
    iget-wide v14, v1, Lsh/r0;->e:J

    :goto_39
    move/from16 v20, v4

    move-wide v4, v10

    goto :goto_3a

    :cond_47
    iget-wide v14, v1, Lsh/r0;->f:J

    goto :goto_39

    .line 195
    :goto_3a
    iget-wide v10, v1, Lsh/r0;->g:J

    move-object/from16 v25, v6

    move-wide v6, v12

    .line 196
    iget-wide v12, v1, Lsh/r0;->h:J

    move-object/from16 v8, v46

    .line 197
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v17

    move-object/from16 p9, v1

    .line 198
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v17, :cond_48

    if-ne v1, v2, :cond_49

    .line 199
    :cond_48
    new-instance v1, Lh0/i0;

    const/4 v3, 0x2

    invoke-direct {v1, v8, v3}, Lh0/i0;-><init>(Li0/l2;I)V

    .line 200
    invoke-virtual {v0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 201
    :cond_49
    check-cast v1, Lfg/a;

    .line 202
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v8, v47

    .line 203
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v17

    move-object/from16 p7, v1

    .line 204
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v17, :cond_4a

    if-ne v1, v2, :cond_4b

    .line 205
    :cond_4a
    new-instance v1, Lh0/i0;

    const/4 v2, 0x3

    invoke-direct {v1, v8, v2}, Lh0/i0;-><init>(Li0/l2;I)V

    .line 206
    invoke-virtual {v0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 207
    :cond_4b
    move-object/from16 v19, v1

    check-cast v19, Lfg/a;

    move-object/from16 v2, p3

    const/high16 v1, 0x3f800000    # 1.0f

    .line 208
    invoke-static {v2, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    move-result-object v1

    move/from16 v2, v44

    .line 209
    invoke-static {v1, v2}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    move-result-object v21

    shl-int/lit8 v1, v9, 0x9

    const/high16 v8, 0x1c00000

    and-int/2addr v1, v8

    const/high16 v8, 0x30000000

    or-int v23, v1, v8

    const/16 v24, 0x6

    move/from16 v17, p10

    move-object/from16 v22, v0

    move-wide v8, v14

    move-object/from16 v18, v16

    move-object/from16 v15, p4

    move-object/from16 v14, p7

    move/from16 v16, v3

    move-object/from16 v3, v31

    .line 210
    invoke-static/range {v3 .. v24}, Lsh/f1;->b(Lf1/r0;JJJJJLfg/a;Llg/a;ZZ[FLfg/a;ZLy0/o;Li0/h0;II)V

    move-object/from16 v15, v22

    const/4 v0, 0x1

    .line 211
    invoke-virtual {v15, v0}, Li0/h0;->p(Z)V

    move/from16 v4, p6

    move-object/from16 v9, p9

    move v8, v2

    move-object/from16 v7, v32

    move/from16 v13, v34

    move-object/from16 v10, v35

    goto :goto_3b

    .line 212
    :cond_4c
    const-string v0, "valueRange start should be less than end"

    .line 213
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    return-void

    .line 214
    :cond_4d
    const-string v0, "steps should be >= 0"

    .line 215
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    return-void

    .line 216
    :cond_4e
    invoke-virtual {v15}, Li0/h0;->V()V

    move/from16 v4, p3

    move/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v13, p12

    move-object v7, v9

    move-object/from16 v9, p8

    .line 217
    :goto_3b
    invoke-virtual {v15}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_4f

    move-object v1, v0

    new-instance v0, Lsh/x0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v48, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Lsh/x0;-><init>(FLfg/l;Ly0/o;ZLlg/a;ILfg/a;FLsh/r0;Lsh/s0;ZLjava/util/List;FII)V

    move-object/from16 v1, v48

    .line 218
    iput-object v0, v1, Li0/r1;->d:Lfg/p;

    :cond_4f
    return-void
.end method

.method public static final b(Lf1/r0;JJJJJLfg/a;Llg/a;ZZ[FLfg/a;ZLy0/o;Li0/h0;II)V
    .locals 31

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v14, p13

    move-object/from16 v0, p15

    move-object/from16 v4, p18

    move-object/from16 v8, p19

    move/from16 v11, p20

    move/from16 v12, p21

    const v5, -0x43955395

    .line 1
    invoke-virtual {v8, v5}, Li0/h0;->b0(I)Li0/h0;

    and-int/lit8 v5, v11, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v8, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v11

    goto :goto_1

    :cond_1
    move v5, v11

    :goto_1
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v8, v2, v3}, Li0/h0;->e(J)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v11, 0x180

    move-wide/from16 v9, p3

    if-nez v7, :cond_5

    invoke-virtual {v8, v9, v10}, Li0/h0;->e(J)Z

    move-result v18

    if-eqz v18, :cond_4

    const/16 v18, 0x100

    goto :goto_3

    :cond_4
    const/16 v18, 0x80

    :goto_3
    or-int v5, v5, v18

    :cond_5
    and-int/lit16 v6, v11, 0xc00

    const/16 v19, 0x400

    move-wide/from16 v9, p5

    if-nez v6, :cond_7

    invoke-virtual {v8, v9, v10}, Li0/h0;->e(J)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    move/from16 v6, v19

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v11, 0x6000

    const/16 v21, 0x2000

    move-wide/from16 v9, p7

    if-nez v6, :cond_9

    invoke-virtual {v8, v9, v10}, Li0/h0;->e(J)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v6, v21

    :goto_5
    or-int/2addr v5, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v11

    move-wide/from16 v9, p9

    if-nez v6, :cond_b

    invoke-virtual {v8, v9, v10}, Li0/h0;->e(J)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v6, 0x10000

    :goto_6
    or-int/2addr v5, v6

    :cond_b
    const/high16 v6, 0x180000

    and-int/2addr v6, v11

    if-nez v6, :cond_d

    move-object/from16 v6, p11

    invoke-virtual {v8, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_c

    const/high16 v25, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v25, 0x80000

    :goto_7
    or-int v5, v5, v25

    goto :goto_8

    :cond_d
    move-object/from16 v6, p11

    :goto_8
    const/high16 v25, 0xc00000

    and-int v25, v11, v25

    move-object/from16 v15, p12

    if-nez v25, :cond_f

    invoke-virtual {v8, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_e

    const/high16 v27, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v27, 0x400000

    :goto_9
    or-int v5, v5, v27

    :cond_f
    const/high16 v27, 0x6000000

    and-int v27, v11, v27

    if-nez v27, :cond_11

    invoke-virtual {v8, v14}, Li0/h0;->g(Z)Z

    move-result v27

    if-eqz v27, :cond_10

    const/high16 v27, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v27, 0x2000000

    :goto_a
    or-int v5, v5, v27

    :cond_11
    const/high16 v27, 0x30000000

    and-int v27, v11, v27

    const/4 v13, 0x0

    if-nez v27, :cond_13

    invoke-virtual {v8, v13}, Li0/h0;->g(Z)Z

    move-result v10

    if-eqz v10, :cond_12

    const/high16 v10, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v10, 0x10000000

    :goto_b
    or-int/2addr v5, v10

    :cond_13
    and-int/lit8 v10, v12, 0x6

    if-nez v10, :cond_15

    move/from16 v10, p14

    invoke-virtual {v8, v10}, Li0/h0;->g(Z)Z

    move-result v27

    if-eqz v27, :cond_14

    const/16 v18, 0x4

    goto :goto_c

    :cond_14
    const/16 v18, 0x2

    :goto_c
    or-int v18, v12, v18

    goto :goto_d

    :cond_15
    move/from16 v10, p14

    move/from16 v18, v12

    :goto_d
    and-int/lit8 v27, v12, 0x30

    if-nez v27, :cond_17

    invoke-virtual {v8, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_16

    const/16 v17, 0x20

    goto :goto_e

    :cond_16
    const/16 v17, 0x10

    :goto_e
    or-int v18, v18, v17

    :cond_17
    and-int/lit16 v7, v12, 0x180

    if-nez v7, :cond_19

    move-object/from16 v7, p16

    invoke-virtual {v8, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    const/16 v16, 0x100

    goto :goto_f

    :cond_18
    const/16 v16, 0x80

    :goto_f
    or-int v18, v18, v16

    goto :goto_10

    :cond_19
    move-object/from16 v7, p16

    :goto_10
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_1b

    move/from16 v9, p17

    invoke-virtual {v8, v9}, Li0/h0;->g(Z)Z

    move-result v17

    if-eqz v17, :cond_1a

    const/16 v19, 0x800

    :cond_1a
    or-int v18, v18, v19

    goto :goto_11

    :cond_1b
    move/from16 v9, p17

    :goto_11
    and-int/lit16 v13, v12, 0x6000

    if-nez v13, :cond_1d

    invoke-virtual {v8, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1c

    const/16 v21, 0x4000

    :cond_1c
    or-int v18, v18, v21

    :cond_1d
    move/from16 v13, v18

    const v17, 0x12492493

    move/from16 v18, v5

    and-int v5, v18, v17

    const v6, 0x12492492

    const/16 v17, 0x1

    if-ne v5, v6, :cond_1f

    and-int/lit16 v5, v13, 0x2493

    const/16 v6, 0x2492

    if-eq v5, v6, :cond_1e

    goto :goto_12

    :cond_1e
    const/4 v5, 0x0

    goto :goto_13

    :cond_1f
    :goto_12
    move/from16 v5, v17

    :goto_13
    and-int/lit8 v6, v18, 0x1

    invoke-virtual {v8, v6, v5}, Li0/h0;->S(IZ)Z

    move-result v5

    if-eqz v5, :cond_2f

    if-eqz v14, :cond_20

    const v5, 0x3d343958    # 0.044f

    goto :goto_14

    :cond_20
    const/4 v5, 0x0

    :goto_14
    const/16 v6, 0x96

    move/from16 v19, v5

    const/4 v5, 0x6

    const/4 v7, 0x0

    .line 2
    invoke-static {v6, v5, v7}, Li/d;->p(IILi/v;)Li/l1;

    move-result-object v6

    const/16 v9, 0xc30

    const/16 v10, 0x14

    .line 3
    const-string v7, "SliderTrackAlpha"

    move/from16 v11, v18

    move/from16 v5, v19

    const/high16 v12, 0x20000000

    invoke-static/range {v5 .. v10}, Li/f;->a(FLi/k;Ljava/lang/String;Li0/h0;II)Li0/l2;

    move-result-object v5

    .line 4
    invoke-static {v4, v1}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    move-result-object v6

    .line 5
    sget-object v7, Lf1/c0;->b:Lf1/m0;

    invoke-static {v6, v2, v3, v7}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    move-result-object v6

    .line 6
    invoke-virtual {v8, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    .line 7
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    .line 8
    sget-object v10, Li0/l;->a:Li0/e;

    if-nez v7, :cond_21

    if-ne v9, v10, :cond_22

    .line 9
    :cond_21
    new-instance v9, Lsh/y0;

    const/4 v7, 0x0

    invoke-direct {v9, v5, v7}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 10
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 11
    :cond_22
    check-cast v9, Lfg/l;

    invoke-static {v6, v9}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v5

    const/high16 v6, 0x380000

    and-int/2addr v6, v11

    const/high16 v7, 0x100000

    if-ne v6, v7, :cond_23

    move/from16 v6, v17

    goto :goto_15

    :cond_23
    const/4 v6, 0x0

    :goto_15
    and-int/lit16 v7, v13, 0x380

    const/16 v9, 0x100

    if-ne v7, v9, :cond_24

    move/from16 v7, v17

    goto :goto_16

    :cond_24
    const/4 v7, 0x0

    :goto_16
    or-int/2addr v6, v7

    const/high16 v7, 0x1c00000

    and-int/2addr v7, v11

    const/high16 v9, 0x800000

    if-ne v7, v9, :cond_25

    move/from16 v7, v17

    goto :goto_17

    :cond_25
    const/4 v7, 0x0

    :goto_17
    or-int/2addr v6, v7

    const/high16 v7, 0x70000000

    and-int/2addr v7, v11

    if-ne v7, v12, :cond_26

    move/from16 v7, v17

    goto :goto_18

    :cond_26
    const/4 v7, 0x0

    :goto_18
    or-int/2addr v6, v7

    and-int/lit16 v7, v13, 0x1c00

    const/16 v9, 0x800

    if-ne v7, v9, :cond_27

    move/from16 v7, v17

    goto :goto_19

    :cond_27
    const/4 v7, 0x0

    :goto_19
    or-int/2addr v6, v7

    and-int/lit16 v7, v11, 0x380

    const/16 v9, 0x100

    if-ne v7, v9, :cond_28

    move/from16 v7, v17

    goto :goto_1a

    :cond_28
    const/4 v7, 0x0

    :goto_1a
    or-int/2addr v6, v7

    and-int/lit8 v7, v13, 0xe

    const/4 v9, 0x4

    if-ne v7, v9, :cond_29

    move/from16 v7, v17

    goto :goto_1b

    :cond_29
    const/4 v7, 0x0

    :goto_1b
    or-int/2addr v6, v7

    .line 12
    invoke-virtual {v8, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    const/high16 v7, 0x70000

    and-int/2addr v7, v11

    const/high16 v9, 0x20000

    if-ne v7, v9, :cond_2a

    move/from16 v7, v17

    goto :goto_1c

    :cond_2a
    const/4 v7, 0x0

    :goto_1c
    or-int/2addr v6, v7

    const v7, 0xe000

    and-int/2addr v7, v11

    const/16 v9, 0x4000

    if-ne v7, v9, :cond_2b

    move/from16 v7, v17

    goto :goto_1d

    :cond_2b
    const/4 v7, 0x0

    :goto_1d
    or-int/2addr v6, v7

    and-int/lit16 v7, v11, 0x1c00

    const/16 v9, 0x800

    if-ne v7, v9, :cond_2c

    goto :goto_1e

    :cond_2c
    const/16 v17, 0x0

    :goto_1e
    or-int v6, v6, v17

    .line 13
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_2d

    if-ne v7, v10, :cond_2e

    .line 14
    :cond_2d
    new-instance v15, Lsh/z0;

    move-wide/from16 v20, p3

    move-wide/from16 v28, p5

    move-wide/from16 v26, p7

    move-wide/from16 v24, p9

    move-object/from16 v16, p11

    move-object/from16 v18, p12

    move/from16 v22, p14

    move-object/from16 v17, p16

    move/from16 v19, p17

    move-object/from16 v23, v0

    invoke-direct/range {v15 .. v29}, Lsh/z0;-><init>(Lfg/a;Lfg/a;Llg/a;ZJZ[FJJJ)V

    .line 15
    invoke-virtual {v8, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v7, v15

    .line 16
    :cond_2e
    check-cast v7, Lfg/l;

    const/4 v0, 0x0

    .line 17
    invoke-static {v5, v7, v8, v0}, Lk/n;->a(Ly0/o;Lfg/l;Li0/h0;I)V

    goto :goto_1f

    .line 18
    :cond_2f
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 19
    :goto_1f
    invoke-virtual {v8}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_30

    move-object v5, v0

    new-instance v0, Lsh/a1;

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v19, v4

    move-object/from16 v30, v5

    move-wide/from16 v4, p3

    invoke-direct/range {v0 .. v21}, Lsh/a1;-><init>(Lf1/r0;JJJJJLfg/a;Llg/a;ZZ[FLfg/a;ZLy0/o;II)V

    move-object/from16 v5, v30

    .line 20
    iput-object v0, v5, Li0/r1;->d:Lfg/p;

    :cond_30
    return-void
.end method

.method public static final c(FII)F
    .locals 2

    .line 1
    int-to-float p2, p2

    .line 2
    const/high16 v0, 0x40000000    # 2.0f

    .line 3
    .line 4
    div-float/2addr p2, v0

    .line 5
    int-to-float p1, p1

    .line 6
    mul-float/2addr v0, p2

    .line 7
    sub-float/2addr p1, v0

    .line 8
    const/4 v0, 0x0

    .line 9
    cmpg-float v1, p1, v0

    .line 10
    .line 11
    if-gez v1, :cond_0

    .line 12
    .line 13
    move p1, v0

    .line 14
    :cond_0
    cmpg-float v1, p1, v0

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    sub-float/2addr p0, p2

    .line 20
    div-float/2addr p0, p1

    .line 21
    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, Lr9/e0;->q(FFF)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public static final d(Ljava/util/List;Llg/a;)[F
    .locals 5

    .line 1
    iget v0, p1, Llg/a;->a:F

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    sub-float/2addr v2, v0

    .line 33
    iget v3, p1, Llg/a;->b:F

    .line 34
    .line 35
    sub-float/2addr v3, v0

    .line 36
    div-float/2addr v2, v3

    .line 37
    const/4 v3, 0x0

    .line 38
    const/high16 v4, 0x3f800000    # 1.0f

    .line 39
    .line 40
    invoke-static {v2, v3, v4}, Lr9/e0;->q(FFF)F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    new-array p0, p0, [F

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/4 v0, 0x0

    .line 63
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/lit8 v2, v0, 0x1

    .line 80
    .line 81
    aput v1, p0, v0

    .line 82
    .line 83
    move v0, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    return-object p0
.end method
