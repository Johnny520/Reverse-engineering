.class public abstract Lv03;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhn1;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lmy;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lv03;->a:Lmy;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lm13;Lkw;Lpx;I)V
    .locals 6

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, 0xe9e0ce

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

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
    invoke-virtual {p2, p1}, Lgo0;->h(Ljava/lang/Object;)Z

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
    invoke-virtual {p2, v2, v1}, Lgo0;->O(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    sget-object v1, Lv03;->a:Lmy;

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lm13;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    sget-object v3, Lm13;->d:Lm13;

    .line 62
    .line 63
    invoke-virtual {p0, v3}, Lm13;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    new-instance v3, Lm13;

    .line 71
    .line 72
    iget-object v4, v2, Lm13;->a:Llt2;

    .line 73
    .line 74
    iget-object v5, p0, Lm13;->a:Llt2;

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Llt2;->c(Llt2;)Llt2;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-object v2, v2, Lm13;->b:Lvw1;

    .line 81
    .line 82
    iget-object v5, p0, Lm13;->b:Lvw1;

    .line 83
    .line 84
    invoke-virtual {v2, v5}, Lvw1;->a(Lvw1;)Lvw1;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {v3, v4, v2}, Lm13;-><init>(Llt2;Lvw1;)V

    .line 89
    .line 90
    .line 91
    move-object v2, v3

    .line 92
    :cond_4
    :goto_3
    invoke-virtual {v1, v2}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    and-int/lit8 v0, v0, 0x70

    .line 97
    .line 98
    const/16 v2, 0x8

    .line 99
    .line 100
    or-int/2addr v0, v2

    .line 101
    invoke-static {v1, p1, p2, v0}, Lci0;->a(Lf42;Lkw;Lpx;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    invoke-virtual {p2}, Lgo0;->R()V

    .line 106
    .line 107
    .line 108
    :goto_4
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-eqz p2, :cond_6

    .line 113
    .line 114
    new-instance v0, Laf;

    .line 115
    .line 116
    const/16 v1, 0x15

    .line 117
    .line 118
    invoke-direct {v0, p3, v1, p0, p1}, Laf;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 122
    .line 123
    :cond_6
    return-void
.end method

.method public static final b(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;Lpx;III)V
    .locals 26

    move-wide/from16 v3, p2

    move/from16 v0, p17

    move/from16 v1, p19

    .line 1
    move-object/from16 v2, p16

    check-cast v2, Lgo0;

    const v5, 0x6bda414b

    invoke-virtual {v2, v5}, Lgo0;->X(I)Lgo0;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    move-object/from16 v5, p0

    invoke-virtual {v2, v5}, Lgo0;->f(Ljava/lang/Object;)Z

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
    move-object/from16 v5, p0

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

    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v6, v11

    :goto_3
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_6

    invoke-virtual {v2, v3, v4}, Lgo0;->e(J)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x100

    goto :goto_4

    :cond_5
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    :cond_6
    or-int/lit16 v6, v6, 0xc00

    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_8

    move-wide/from16 v11, p4

    invoke-virtual {v2, v11, v12}, Lgo0;->e(J)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x4000

    goto :goto_5

    :cond_7
    const/16 v13, 0x2000

    :goto_5
    or-int/2addr v6, v13

    goto :goto_6

    :cond_8
    move-wide/from16 v11, p4

    :goto_6
    const/high16 v13, 0x30000

    or-int/2addr v13, v6

    and-int/lit8 v14, v1, 0x40

    if-eqz v14, :cond_a

    const/high16 v13, 0x1b0000

    or-int/2addr v13, v6

    :cond_9
    move-object/from16 v6, p6

    goto :goto_8

    :cond_a
    const/high16 v6, 0x180000

    and-int/2addr v6, v0

    if-nez v6, :cond_9

    move-object/from16 v6, p6

    invoke-virtual {v2, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    const/high16 v15, 0x100000

    goto :goto_7

    :cond_b
    const/high16 v15, 0x80000

    :goto_7
    or-int/2addr v13, v15

    :goto_8
    const/high16 v15, 0xc00000

    or-int/2addr v15, v13

    and-int/lit16 v8, v1, 0x100

    if-eqz v8, :cond_c

    const/high16 v15, 0x6c00000

    or-int/2addr v15, v13

    move-wide/from16 v9, p7

    goto :goto_a

    :cond_c
    const/high16 v13, 0x6000000

    and-int/2addr v13, v0

    move-wide/from16 v9, p7

    if-nez v13, :cond_e

    invoke-virtual {v2, v9, v10}, Lgo0;->e(J)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x4000000

    goto :goto_9

    :cond_d
    const/high16 v16, 0x2000000

    :goto_9
    or-int v15, v15, v16

    :cond_e
    :goto_a
    const/high16 v16, 0x30000000

    or-int v24, v15, v16

    or-int/lit8 v15, p18, 0x6

    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_f

    const/16 v15, 0x36

    move-wide/from16 v0, p9

    goto :goto_c

    :cond_f
    and-int/lit8 v17, p18, 0x30

    move-wide/from16 v0, p9

    if-nez v17, :cond_11

    invoke-virtual {v2, v0, v1}, Lgo0;->e(J)Z

    move-result v17

    if-eqz v17, :cond_10

    const/16 v16, 0x20

    goto :goto_b

    :cond_10
    const/16 v16, 0x10

    :goto_b
    or-int v15, v15, v16

    :cond_11
    :goto_c
    const v16, 0x5b6d80

    or-int v15, v15, v16

    const v16, 0x12492493

    and-int v0, v24, v16

    const v1, 0x12492492

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v1, :cond_13

    const v0, 0x492493

    and-int/2addr v0, v15

    const v1, 0x492492

    if-eq v0, v1, :cond_12

    goto :goto_d

    :cond_12
    move v0, v3

    goto :goto_e

    :cond_13
    :goto_d
    move v0, v4

    :goto_e
    and-int/lit8 v1, v24, 0x1

    invoke-virtual {v2, v1, v0}, Lgo0;->O(IZ)Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {v2}, Lgo0;->T()V

    and-int/lit8 v0, p17, 0x1

    if-eqz v0, :cond_15

    invoke-virtual {v2}, Lgo0;->y()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_f

    .line 2
    :cond_14
    invoke-virtual {v2}, Lgo0;->R()V

    move-object/from16 v0, p1

    move-wide/from16 v21, p9

    move/from16 v4, p11

    move/from16 v1, p12

    move/from16 v7, p14

    move-object/from16 v12, p15

    move-object/from16 v17, v6

    move-wide/from16 v18, v9

    move/from16 v6, p13

    goto :goto_14

    :cond_15
    :goto_f
    if-eqz v7, :cond_16

    .line 3
    sget-object v0, Lrh1;->a:Lrh1;

    goto :goto_10

    :cond_16
    move-object/from16 v0, p1

    :goto_10
    if-eqz v14, :cond_17

    const/4 v1, 0x0

    goto :goto_11

    :cond_17
    move-object v1, v6

    :goto_11
    if-eqz v8, :cond_18

    .line 4
    sget-wide v6, Lp13;->c:J

    goto :goto_12

    :cond_18
    move-wide v6, v9

    :goto_12
    if-eqz v13, :cond_19

    .line 5
    sget-wide v8, Lp13;->c:J

    goto :goto_13

    :cond_19
    move-wide/from16 v8, p9

    .line 6
    :goto_13
    sget-object v10, Lv03;->a:Lmy;

    .line 7
    invoke-virtual {v2, v10}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm13;

    const v13, 0x7fffffff

    move-object/from16 v17, v1

    move v1, v4

    move-wide/from16 v18, v6

    move-wide/from16 v21, v8

    move-object v12, v10

    move v6, v13

    move v7, v1

    .line 8
    :goto_14
    invoke-virtual {v2}, Lgo0;->q()V

    const v8, -0x21b08752

    invoke-virtual {v2, v8}, Lgo0;->W(I)V

    const-wide/16 v8, 0x10

    cmp-long v10, p2, v8

    if-eqz v10, :cond_1a

    move-wide/from16 v13, p2

    goto :goto_16

    :cond_1a
    const v10, -0x21b0844d

    .line 9
    invoke-virtual {v2, v10}, Lgo0;->W(I)V

    .line 10
    invoke-virtual {v12}, Lm13;->b()J

    move-result-wide v10

    cmp-long v8, v10, v8

    if-eqz v8, :cond_1b

    goto :goto_15

    .line 11
    :cond_1b
    sget-object v8, Lc00;->a:Lmy;

    .line 12
    invoke-virtual {v2, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v8

    .line 13
    check-cast v8, Lju;

    .line 14
    iget-wide v10, v8, Lju;->a:J

    .line 15
    :goto_15
    invoke-virtual {v2, v3}, Lgo0;->p(Z)V

    move-wide v13, v10

    :goto_16
    invoke-virtual {v2, v3}, Lgo0;->p(Z)V

    const v23, 0xfd6f50

    move-wide/from16 v15, p4

    move/from16 v20, v3

    .line 16
    invoke-static/range {v12 .. v23}, Lm13;->d(Lm13;JJLim0;JIJI)Lm13;

    move-result-object v3

    and-int/lit8 v8, v24, 0x7e

    const v9, 0xdb6c00

    or-int/2addr v8, v9

    shl-int/lit8 v9, v24, 0x12

    const/high16 v10, 0x70000000

    and-int/2addr v9, v10

    or-int/2addr v8, v9

    const/16 v9, 0x100

    move-object/from16 p7, v0

    move/from16 p10, v1

    move-object/from16 p13, v2

    move-object/from16 p8, v3

    move/from16 p9, v4

    move-object/from16 p6, v5

    move/from16 p11, v6

    move/from16 p12, v7

    move/from16 p14, v8

    move/from16 p15, v9

    .line 17
    invoke-static/range {p6 .. p15}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    move-object/from16 v1, p7

    move/from16 v2, p10

    move/from16 v13, p11

    move/from16 v3, p12

    move-object/from16 v0, p13

    move v15, v3

    move-object/from16 v16, v12

    move v14, v13

    move-object/from16 v7, v17

    move-wide/from16 v8, v18

    move-wide/from16 v10, v21

    move v13, v2

    move v12, v4

    move-object v2, v1

    goto :goto_17

    :cond_1c
    move-object v0, v2

    .line 18
    invoke-virtual {v0}, Lgo0;->R()V

    move-object/from16 v2, p1

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object v7, v6

    move-wide v8, v9

    move-wide/from16 v10, p9

    .line 19
    :goto_17
    invoke-virtual {v0}, Lgo0;->r()Lb62;

    move-result-object v0

    if-eqz v0, :cond_1d

    move-object v1, v0

    new-instance v0, Lu03;

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v25, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Lu03;-><init>(Ljava/lang/String;Luh1;JJLim0;JJIZIILm13;III)V

    move-object/from16 v1, v25

    .line 20
    iput-object v0, v1, Lb62;->d:Lmn0;

    :cond_1d
    return-void
.end method
