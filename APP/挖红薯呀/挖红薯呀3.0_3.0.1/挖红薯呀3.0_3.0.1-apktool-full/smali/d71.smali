.class public abstract Ld71;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lus0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lej;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ld71;->a:Lej;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Ls71;Lww;Lji;I)V
    .locals 3

    .line 1
    check-cast p2, Lpi;

    .line 2
    .line 3
    const v0, 0xe9e0ce

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p3

    .line 19
    invoke-virtual {p2, p1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    and-int/lit8 v1, v0, 0x13

    .line 32
    .line 33
    const/16 v2, 0x12

    .line 34
    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/4 v1, 0x0

    .line 40
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 41
    .line 42
    invoke-virtual {p2, v2, v1}, Lpi;->O(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    sget-object v1, Ld71;->a:Lej;

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ls71;

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ls71;->c(Ls71;)Ls71;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    and-int/lit8 v0, v0, 0x70

    .line 65
    .line 66
    const/16 v2, 0x8

    .line 67
    .line 68
    or-int/2addr v0, v2

    .line 69
    invoke-static {v1, p1, p2, v0}, Li4;->b(Lct0;Lww;Lji;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {p2}, Lpi;->R()V

    .line 74
    .line 75
    .line 76
    :goto_3
    invoke-virtual {p2}, Lpi;->r()Lht0;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-eqz p2, :cond_4

    .line 81
    .line 82
    new-instance v0, Led;

    .line 83
    .line 84
    const/16 v1, 0xb

    .line 85
    .line 86
    invoke-direct {v0, p3, v1, p0, p1}, Led;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p2, Lht0;->d:Lww;

    .line 90
    .line 91
    :cond_4
    return-void
.end method

.method public static final b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V
    .locals 25

    move/from16 v0, p19

    move/from16 v1, p21

    .line 1
    move-object/from16 v2, p18

    check-cast v2, Lpi;

    const v3, 0x6bda414b

    invoke-virtual {v2, v3}, Lpi;->X(I)Lpi;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    invoke-virtual {v2, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v1, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    :cond_2
    move-object/from16 v10, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_2

    move-object/from16 v10, p1

    invoke-virtual {v2, v10}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v6, v11

    :goto_3
    and-int/lit8 v11, v1, 0x4

    if-eqz v11, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-wide/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v0, 0x180

    if-nez v12, :cond_5

    move-wide/from16 v12, p2

    invoke-virtual {v2, v12, v13}, Lpi;->e(J)Z

    move-result v14

    if-eqz v14, :cond_7

    const/16 v14, 0x100

    goto :goto_4

    :cond_7
    const/16 v14, 0x80

    :goto_4
    or-int/2addr v6, v14

    :goto_5
    or-int/lit16 v14, v6, 0xc00

    and-int/lit8 v15, v1, 0x10

    if-eqz v15, :cond_8

    or-int/lit16 v14, v6, 0x6c00

    move-wide/from16 v4, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v6, v0, 0x6000

    move-wide/from16 v4, p4

    if-nez v6, :cond_a

    invoke-virtual {v2, v4, v5}, Lpi;->e(J)Z

    move-result v16

    if-eqz v16, :cond_9

    const/16 v16, 0x4000

    goto :goto_6

    :cond_9
    const/16 v16, 0x2000

    :goto_6
    or-int v14, v14, v16

    :cond_a
    :goto_7
    const/high16 v16, 0x30000

    or-int v16, v14, v16

    and-int/lit8 v17, v1, 0x40

    if-eqz v17, :cond_c

    const/high16 v16, 0x1b0000

    or-int v16, v14, v16

    :cond_b
    move-object/from16 v14, p6

    goto :goto_9

    :cond_c
    const/high16 v14, 0x180000

    and-int/2addr v14, v0

    if-nez v14, :cond_b

    move-object/from16 v14, p6

    invoke-virtual {v2, v14}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_d

    const/high16 v18, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v18, 0x80000

    :goto_8
    or-int v16, v16, v18

    :goto_9
    and-int/lit16 v6, v1, 0x80

    const/high16 v19, 0xc00000

    if-eqz v6, :cond_e

    or-int v16, v16, v19

    move-object/from16 v8, p7

    goto :goto_b

    :cond_e
    and-int v19, v0, v19

    move-object/from16 v8, p7

    if-nez v19, :cond_10

    invoke-virtual {v2, v8}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_f

    const/high16 v20, 0x800000

    goto :goto_a

    :cond_f
    const/high16 v20, 0x400000

    :goto_a
    or-int v16, v16, v20

    :cond_10
    :goto_b
    const/high16 v20, 0x36000000

    or-int v16, v16, v20

    and-int/lit16 v9, v1, 0x400

    if-eqz v9, :cond_11

    or-int/lit8 v18, p20, 0x6

    move-object/from16 v0, p10

    goto :goto_d

    :cond_11
    move-object/from16 v0, p10

    invoke-virtual {v2, v0}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_12

    const/16 v18, 0x4

    goto :goto_c

    :cond_12
    const/16 v18, 0x2

    :goto_c
    or-int v18, p20, v18

    :goto_d
    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_14

    or-int/lit8 v18, v18, 0x30

    :cond_13
    move/from16 v21, v0

    move-wide/from16 v0, p11

    goto :goto_f

    :cond_14
    and-int/lit8 v21, p20, 0x30

    if-nez v21, :cond_13

    move/from16 v21, v0

    move-wide/from16 v0, p11

    invoke-virtual {v2, v0, v1}, Lpi;->e(J)Z

    move-result v22

    if-eqz v22, :cond_15

    const/16 v19, 0x20

    goto :goto_e

    :cond_15
    const/16 v19, 0x10

    :goto_e
    or-int v18, v18, v19

    :goto_f
    const v19, 0x5b6d80

    or-int v18, v18, v19

    const v19, 0x12492493

    and-int v0, v16, v19

    const v1, 0x12492492

    const/16 v19, 0x1

    if-ne v0, v1, :cond_17

    const v0, 0x492493

    and-int v0, v18, v0

    const v1, 0x492492

    if-eq v0, v1, :cond_16

    goto :goto_10

    :cond_16
    const/4 v0, 0x0

    goto :goto_11

    :cond_17
    :goto_10
    move/from16 v0, v19

    :goto_11
    and-int/lit8 v1, v16, 0x1

    invoke-virtual {v2, v1, v0}, Lpi;->O(IZ)Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual {v2}, Lpi;->T()V

    and-int/lit8 v0, p19, 0x1

    if-eqz v0, :cond_19

    invoke-virtual {v2}, Lpi;->y()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_12

    .line 2
    :cond_18
    invoke-virtual {v2}, Lpi;->R()V

    move-wide/from16 v17, p11

    move/from16 v19, p13

    move/from16 v7, p14

    move/from16 v9, p15

    move/from16 v11, p16

    move-object/from16 v15, p17

    move-wide v0, v4

    move-wide/from16 v5, p8

    move-object/from16 v4, p10

    goto :goto_16

    :cond_19
    :goto_12
    if-eqz v7, :cond_1a

    .line 3
    sget-object v0, Lme0;->a:Lme0;

    move-object v10, v0

    :cond_1a
    if-eqz v11, :cond_1b

    .line 4
    sget-wide v0, Lff;->g:J

    move-wide v12, v0

    :cond_1b
    if-eqz v15, :cond_1c

    .line 5
    sget-wide v0, Lu71;->c:J

    goto :goto_13

    :cond_1c
    move-wide v0, v4

    :goto_13
    const/4 v4, 0x0

    if-eqz v17, :cond_1d

    move-object v14, v4

    :cond_1d
    if-eqz v6, :cond_1e

    move-object v8, v4

    .line 6
    :cond_1e
    sget-wide v5, Lu71;->c:J

    if-eqz v9, :cond_1f

    goto :goto_14

    :cond_1f
    move-object/from16 v4, p10

    :goto_14
    if-eqz v21, :cond_20

    move-wide/from16 v17, v5

    goto :goto_15

    :cond_20
    move-wide/from16 v17, p11

    .line 7
    :goto_15
    sget-object v7, Ld71;->a:Lej;

    .line 8
    invoke-virtual {v2, v7}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls71;

    const v9, 0x7fffffff

    move-object v15, v7

    move/from16 v7, v19

    move v11, v7

    .line 9
    :goto_16
    invoke-virtual {v2}, Lpi;->q()V

    const v3, -0x21b08752

    invoke-virtual {v2, v3}, Lpi;->W(I)V

    const-wide/16 v20, 0x10

    cmp-long v3, v12, v20

    if-eqz v3, :cond_21

    move-wide/from16 p4, v0

    move-wide/from16 v22, v12

    const/4 v0, 0x0

    goto :goto_19

    :cond_21
    const v3, -0x21b0844d

    .line 10
    invoke-virtual {v2, v3}, Lpi;->W(I)V

    .line 11
    invoke-virtual {v15}, Ls71;->b()J

    move-result-wide v22

    cmp-long v3, v22, v20

    if-eqz v3, :cond_22

    move-wide/from16 p4, v0

    :goto_17
    const/4 v0, 0x0

    goto :goto_18

    .line 12
    :cond_22
    sget-object v3, Lxj;->a:Lej;

    .line 13
    invoke-virtual {v2, v3}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v3

    .line 14
    check-cast v3, Lff;

    move-wide/from16 p4, v0

    .line 15
    iget-wide v0, v3, Lff;->a:J

    move-wide/from16 v22, v0

    goto :goto_17

    .line 16
    :goto_18
    invoke-virtual {v2, v0}, Lpi;->p(Z)V

    :goto_19
    invoke-virtual {v2, v0}, Lpi;->p(Z)V

    if-eqz v4, :cond_23

    .line 17
    iget v3, v4, Lr61;->a:I

    goto :goto_1a

    :cond_23
    move v3, v0

    :goto_1a
    const v0, 0xfd6f50

    move/from16 p13, v0

    move/from16 p10, v3

    move-wide/from16 p8, v5

    move-object/from16 p7, v8

    move-object/from16 p6, v14

    move-object/from16 p1, v15

    move-wide/from16 p11, v17

    move-wide/from16 p2, v22

    .line 18
    invoke-static/range {p1 .. p13}, Ls71;->d(Ls71;JJLzv;Lz51;JIJI)Ls71;

    move-result-object v0

    move-object/from16 v1, p1

    move-wide/from16 v5, p4

    move-wide/from16 v17, p8

    move-wide/from16 v20, p11

    and-int/lit8 v3, v16, 0x7e

    const v15, 0xdb6c00

    or-int/2addr v3, v15

    shl-int/lit8 v15, v16, 0x12

    const/high16 v16, 0x70000000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 p1, p0

    move-object/from16 p3, v0

    move-object/from16 p8, v2

    move/from16 p9, v3

    move/from16 p5, v7

    move/from16 p6, v9

    move-object/from16 p2, v10

    move/from16 p7, v11

    move/from16 p4, v19

    .line 19
    invoke-static/range {p1 .. p9}, Ls91;->a(Ljava/lang/String;Lpe0;Ls71;IZIILji;I)V

    move/from16 v2, p5

    move/from16 v3, p7

    move-object/from16 v0, p8

    move v15, v2

    move-object v11, v4

    move/from16 v16, v9

    move-object v2, v10

    move-object v7, v14

    move-wide/from16 v9, v17

    move/from16 v14, v19

    move-object/from16 v18, v1

    move/from16 v17, v3

    move-wide v3, v12

    move-wide/from16 v12, v20

    goto :goto_1b

    :cond_24
    move-object v0, v2

    .line 20
    invoke-virtual {v0}, Lpi;->R()V

    move-object/from16 v11, p10

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-wide v5, v4

    move-object v2, v10

    move-wide v3, v12

    move-object v7, v14

    move-wide/from16 v9, p8

    move-wide/from16 v12, p11

    move/from16 v14, p13

    .line 21
    :goto_1b
    invoke-virtual {v0}, Lpi;->r()Lht0;

    move-result-object v0

    if-eqz v0, :cond_25

    move-object v1, v0

    new-instance v0, Lc71;

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v24, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v21}, Lc71;-><init>(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;III)V

    move-object/from16 v1, v24

    .line 22
    iput-object v0, v1, Lht0;->d:Lww;

    :cond_25
    return-void
.end method
