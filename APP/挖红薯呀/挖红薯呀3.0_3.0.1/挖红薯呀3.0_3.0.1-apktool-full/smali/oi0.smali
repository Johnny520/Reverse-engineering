.class public abstract Loi0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F

.field public static final g:F

.field public static final h:Lej;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Li4;->l:F

    .line 2
    .line 3
    sput v0, Loi0;->a:F

    .line 4
    .line 5
    const/high16 v0, 0x41000000    # 8.0f

    .line 6
    .line 7
    sput v0, Loi0;->b:F

    .line 8
    .line 9
    const/high16 v0, 0x40800000    # 4.0f

    .line 10
    .line 11
    sput v0, Loi0;->c:F

    .line 12
    .line 13
    const/high16 v1, 0x41800000    # 16.0f

    .line 14
    .line 15
    sput v1, Loi0;->d:F

    .line 16
    .line 17
    sput v0, Loi0;->e:F

    .line 18
    .line 19
    const/high16 v0, 0x41400000    # 12.0f

    .line 20
    .line 21
    sput v0, Loi0;->f:F

    .line 22
    .line 23
    const/high16 v0, 0x42300000    # 44.0f

    .line 24
    .line 25
    sput v0, Loi0;->g:F

    .line 26
    .line 27
    new-instance v0, Lsc0;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lej;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Loi0;->h:Lej;

    .line 39
    .line 40
    return-void
.end method

.method public static final a(Lpe0;JJFLfd1;Lmh;Lji;I)V
    .locals 11

    .line 1
    move-object/from16 v9, p8

    .line 2
    .line 3
    check-cast v9, Lpi;

    .line 4
    .line 5
    const v0, 0x3ed4477e

    .line 6
    .line 7
    .line 8
    invoke-virtual {v9, v0}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    or-int/lit8 v0, p9, 0x6

    .line 12
    .line 13
    invoke-virtual {v9, p1, p2}, Lpi;->e(J)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v1, 0x10

    .line 24
    .line 25
    :goto_0
    or-int/2addr v0, v1

    .line 26
    or-int/lit16 v0, v0, 0x2080

    .line 27
    .line 28
    const v1, 0x12493

    .line 29
    .line 30
    .line 31
    and-int/2addr v1, v0

    .line 32
    const v5, 0x12492

    .line 33
    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eq v1, v5, :cond_1

    .line 38
    .line 39
    move v1, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, v10

    .line 42
    :goto_1
    and-int/2addr v0, v6

    .line 43
    invoke-virtual {v9, v0, v1}, Lpi;->O(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {v9}, Lpi;->T()V

    .line 50
    .line 51
    .line 52
    and-int/lit8 v0, p9, 0x1

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {v9}, Lpi;->y()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    invoke-virtual {v9}, Lpi;->R()V

    .line 64
    .line 65
    .line 66
    move-wide v4, p3

    .line 67
    move-object/from16 v7, p6

    .line 68
    .line 69
    :goto_2
    move-object v1, p0

    .line 70
    goto :goto_4

    .line 71
    :cond_3
    :goto_3
    sget-object p0, Lnf;->a:Lg41;

    .line 72
    .line 73
    invoke-virtual {v9, p0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Llf;

    .line 78
    .line 79
    invoke-static {p0, p1, p2}, Lnf;->a(Llf;J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    sget-object p0, Lde1;->v:Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-static {v9}, Ljo0;->o(Lji;)Lde1;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object p0, p0, Lde1;->g:Lx6;

    .line 90
    .line 91
    invoke-static {v9}, Ljo0;->o(Lji;)Lde1;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    iget-object v5, v5, Lde1;->b:Lx6;

    .line 96
    .line 97
    new-instance v6, Lma1;

    .line 98
    .line 99
    invoke-direct {v6, p0, v5}, Lma1;-><init>(Lfd1;Lfd1;)V

    .line 100
    .line 101
    .line 102
    const/16 p0, 0xf

    .line 103
    .line 104
    or-int/2addr p0, v4

    .line 105
    new-instance v4, Lea0;

    .line 106
    .line 107
    invoke-direct {v4, v6, p0}, Lea0;-><init>(Lma1;I)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lme0;->a:Lme0;

    .line 111
    .line 112
    move-object v7, v4

    .line 113
    move-wide v4, v0

    .line 114
    goto :goto_2

    .line 115
    :goto_4
    invoke-virtual {v9}, Lpi;->q()V

    .line 116
    .line 117
    .line 118
    sget-object p0, Loi0;->h:Lej;

    .line 119
    .line 120
    invoke-virtual {v9, p0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Lim;

    .line 125
    .line 126
    new-instance v0, Lpi0;

    .line 127
    .line 128
    move-wide v2, p1

    .line 129
    move/from16 v6, p5

    .line 130
    .line 131
    move-object/from16 v8, p7

    .line 132
    .line 133
    invoke-direct/range {v0 .. v8}, Lpi0;-><init>(Lpe0;JJFLfd1;Lmh;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0, v9, v10}, Lim;->a(Lpi0;Lji;I)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_4
    invoke-virtual {v9}, Lpi;->R()V

    .line 141
    .line 142
    .line 143
    move-object v1, p0

    .line 144
    move-wide v4, p3

    .line 145
    move-object/from16 v7, p6

    .line 146
    .line 147
    :goto_5
    invoke-virtual {v9}, Lpi;->r()Lht0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    if-eqz p0, :cond_5

    .line 152
    .line 153
    new-instance v0, Lfi0;

    .line 154
    .line 155
    move-wide v2, p1

    .line 156
    move/from16 v6, p5

    .line 157
    .line 158
    move-object/from16 v8, p7

    .line 159
    .line 160
    move/from16 v9, p9

    .line 161
    .line 162
    invoke-direct/range {v0 .. v9}, Lfi0;-><init>(Lpe0;JJFLfd1;Lmh;I)V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, Lht0;->d:Lww;

    .line 166
    .line 167
    :cond_5
    return-void
.end method

.method public static final b(Ljw0;ZLhw;Lww;Lpe0;ZLww;ZLei0;Lji;I)V
    .locals 24

    move/from16 v2, p1

    move-object/from16 v5, p6

    move-object/from16 v1, p8

    move/from16 v10, p10

    .line 1
    move-object/from16 v8, p9

    check-cast v8, Lpi;

    const v0, 0x3a128822

    invoke-virtual {v8, v0}, Lpi;->X(I)Lpi;

    and-int/lit8 v0, v10, 0x6

    const/4 v11, 0x4

    move-object/from16 v12, p0

    if-nez v0, :cond_1

    invoke-virtual {v8, v12}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v11

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v8, v2}, Lpi;->g(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v10, 0x180

    move-object/from16 v14, p2

    if-nez v3, :cond_5

    invoke-virtual {v8, v14}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v10, 0xc00

    move-object/from16 v7, p3

    if-nez v3, :cond_7

    invoke-virtual {v8, v7}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    const v3, 0x36000

    or-int/2addr v0, v3

    const/high16 v3, 0x180000

    and-int/2addr v3, v10

    if-nez v3, :cond_9

    invoke-virtual {v8, v5}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/high16 v3, 0x100000

    goto :goto_5

    :cond_8
    const/high16 v3, 0x80000

    :goto_5
    or-int/2addr v0, v3

    :cond_9
    const/high16 v3, 0xc00000

    or-int/2addr v0, v3

    const/high16 v3, 0x6000000

    and-int/2addr v3, v10

    if-nez v3, :cond_b

    invoke-virtual {v8, v1}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x4000000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x2000000

    :goto_6
    or-int/2addr v0, v3

    :cond_b
    const/high16 v3, 0x30000000

    or-int v15, v0, v3

    const v0, 0x12492493

    and-int/2addr v0, v15

    const v3, 0x12492492

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eq v0, v3, :cond_c

    move v0, v6

    goto :goto_7

    :cond_c
    move v0, v4

    :goto_7
    and-int/lit8 v3, v15, 0x1

    invoke-virtual {v8, v3, v0}, Lpi;->O(IZ)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {v8}, Lpi;->T()V

    and-int/lit8 v0, v10, 0x1

    if-eqz v0, :cond_e

    invoke-virtual {v8}, Lpi;->y()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_8

    .line 2
    :cond_d
    invoke-virtual {v8}, Lpi;->R()V

    move-object/from16 v16, p4

    move/from16 v3, p5

    move v0, v6

    move/from16 v6, p7

    goto :goto_9

    .line 3
    :cond_e
    :goto_8
    sget-object v0, Lme0;->a:Lme0;

    move-object/from16 v16, v0

    move v0, v6

    move v3, v0

    .line 4
    :goto_9
    invoke-virtual {v8}, Lpi;->q()V

    const v0, -0xd68aba7

    .line 5
    invoke-virtual {v8, v0}, Lpi;->W(I)V

    .line 6
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v0

    const/16 p9, 0x20

    .line 7
    sget-object v13, Lii;->a:Lr3;

    if-ne v0, v13, :cond_f

    .line 8
    new-instance v0, Lxg0;

    invoke-direct {v0}, Lxg0;-><init>()V

    .line 9
    invoke-virtual {v8, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 10
    :cond_f
    move-object/from16 v17, v0

    check-cast v17, Lxg0;

    .line 11
    invoke-virtual {v8, v4}, Lpi;->p(Z)V

    .line 12
    sget-object v0, Leg0;->e:Leg0;

    move/from16 v18, v4

    invoke-static {v0, v8}, Lg60;->u(Leg0;Lji;)Lo31;

    move-result-object v4

    move-object/from16 v19, v0

    .line 13
    new-instance v0, Lli0;

    move/from16 v9, v18

    move-object/from16 v20, v19

    invoke-direct/range {v0 .. v7}, Lli0;-><init>(Lei0;ZZLo31;Lww;ZLww;)V

    const v1, -0x34406c44    # -2.5110392E7f

    invoke-static {v1, v0, v8}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v7

    if-nez p6, :cond_10

    const v0, -0xd5a8732

    .line 14
    invoke-virtual {v8, v0}, Lpi;->W(I)V

    .line 15
    invoke-virtual {v8, v9}, Lpi;->p(Z)V

    const/4 v0, 0x0

    :goto_a
    move-object/from16 v18, v0

    goto :goto_b

    :cond_10
    const v0, -0xd5a8731

    .line 16
    invoke-virtual {v8, v0}, Lpi;->W(I)V

    .line 17
    new-instance v0, Lmi0;

    move/from16 v2, p1

    move-object/from16 v5, p6

    move-object/from16 v1, p8

    invoke-direct/range {v0 .. v5}, Lmi0;-><init>(Lei0;ZZLo31;Lww;)V

    const v1, 0x2fd0b9ce

    invoke-static {v1, v0, v8}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v0

    .line 18
    invoke-virtual {v8, v9}, Lpi;->p(Z)V

    goto :goto_a

    .line 19
    :goto_b
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_11

    .line 20
    new-instance v0, Ldp0;

    invoke-direct {v0, v9}, Ldp0;-><init>(I)V

    .line 21
    invoke-virtual {v8, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 22
    :cond_11
    check-cast v0, Lwg0;

    .line 23
    new-instance v4, Lxv0;

    invoke-direct {v4, v11}, Lxv0;-><init>(I)V

    move/from16 v1, p1

    move-object/from16 v11, p8

    move-object v5, v14

    move-object/from16 v2, v17

    move-object v14, v0

    move-object/from16 v0, v16

    .line 24
    invoke-static/range {v0 .. v5}, Lpf1;->T(Lpe0;ZLxg0;ZLxv0;Lhw;)Lpe0;

    move-result-object v4

    move-object/from16 v17, v0

    move/from16 v16, v3

    .line 25
    sget v0, Loi0;->a:F

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 26
    invoke-static {v4, v1, v0}, Ls11;->a(Lpe0;FF)Lpe0;

    move-result-object v0

    .line 27
    new-instance v1, Ls60;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ls60;-><init>(FZ)V

    .line 28
    invoke-interface {v0, v1}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v0

    .line 29
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_12

    .line 30
    new-instance v1, Lo;

    const/16 v5, 0xc

    invoke-direct {v1, v5, v14}, Lo;-><init>(ILjava/lang/Object;)V

    .line 31
    invoke-virtual {v8, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 32
    :cond_12
    check-cast v1, Lsw;

    invoke-static {v0, v1}, Lp30;->R(Lpe0;Lsw;)Lpe0;

    move-result-object v0

    .line 33
    sget-object v1, Ln2;->i:Lha;

    .line 34
    invoke-static {v1, v4}, Lza;->d(Lha;Z)Lxd0;

    move-result-object v1

    .line 35
    invoke-static {v8}, Lo30;->p(Lji;)I

    move-result v5

    .line 36
    invoke-virtual {v8}, Lpi;->l()Lfq0;

    move-result-object v3

    .line 37
    invoke-static {v8, v0}, Ls91;->E(Lji;Lpe0;)Lpe0;

    move-result-object v0

    .line 38
    sget-object v19, Lfi;->b:Lei;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    sget-object v4, Lei;->b:Lcj;

    .line 40
    invoke-virtual {v8}, Lpi;->Z()V

    .line 41
    iget-boolean v9, v8, Lpi;->S:Z

    if-eqz v9, :cond_13

    .line 42
    invoke-virtual {v8, v4}, Lpi;->k(Lhw;)V

    goto :goto_c

    .line 43
    :cond_13
    invoke-virtual {v8}, Lpi;->j0()V

    .line 44
    :goto_c
    sget-object v4, Lei;->e:Lm7;

    .line 45
    invoke-static {v8, v4, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 46
    sget-object v1, Lei;->d:Lm7;

    .line 47
    invoke-static {v8, v1, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 48
    sget-object v1, Lei;->f:Lm7;

    .line 49
    iget-boolean v3, v8, Lpi;->S:Z

    if-nez v3, :cond_14

    .line 50
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    .line 51
    :cond_14
    invoke-static {v5, v8, v5, v1}, Lt1;->o(ILpi;ILm7;)V

    .line 52
    :cond_15
    sget-object v1, Lei;->c:Lm7;

    .line 53
    invoke-static {v8, v1, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_16

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_d
    move-object/from16 v3, v20

    goto :goto_e

    :cond_16
    move v1, v0

    goto :goto_d

    .line 54
    :goto_e
    invoke-static {v3, v8}, Lg60;->u(Leg0;Lji;)Lo31;

    move-result-object v3

    .line 55
    invoke-static {v1, v3, v8}, Lf7;->a(FLo31;Lji;)Lw31;

    move-result-object v1

    if-eqz p1, :cond_17

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_17
    move v3, v0

    .line 56
    :goto_f
    sget-object v0, Leg0;->d:Leg0;

    invoke-static {v0, v8}, Lg60;->u(Leg0;Lji;)Lo31;

    move-result-object v0

    .line 57
    invoke-static {v3, v0, v8}, Lf7;->a(FLo31;Lji;)Lw31;

    move-result-object v0

    .line 58
    sget-object v3, Ldj;->h:Lg41;

    .line 59
    invoke-virtual {v8, v3}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v3

    .line 60
    check-cast v3, Lym;

    const/high16 v4, 0x42600000    # 56.0f

    .line 61
    invoke-interface {v3, v4}, Lym;->F(F)I

    move-result v4

    .line 62
    move-object v5, v14

    check-cast v5, Ldp0;

    invoke-virtual {v5}, Ldp0;->g()I

    move-result v5

    sub-int/2addr v5, v4

    int-to-float v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    .line 63
    sget v5, Loi0;->f:F

    invoke-interface {v3, v5}, Lym;->p(F)F

    move-result v3

    .line 64
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    .line 65
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    move-wide/from16 p4, v4

    int-to-long v3, v3

    shl-long v20, p4, p9

    const-wide v22, 0xffffffffL

    and-long v3, v3, v22

    or-long v3, v20, v3

    .line 66
    invoke-virtual {v8, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v3, v4}, Lpi;->e(J)Z

    move-result v9

    or-int/2addr v5, v9

    .line 67
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_18

    if-ne v9, v13, :cond_19

    .line 68
    :cond_18
    new-instance v9, Lld0;

    invoke-direct {v9, v2, v3, v4}, Lld0;-><init>(Lxg0;J)V

    .line 69
    invoke-virtual {v8, v9}, Lpi;->g0(Ljava/lang/Object;)V

    .line 70
    :cond_19
    check-cast v9, Lld0;

    .line 71
    new-instance v2, Lhm;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v9}, Lhm;-><init>(ILjava/lang/Object;)V

    const v4, -0x7c1b956b

    invoke-static {v4, v2, v8}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v2

    .line 72
    new-instance v4, Ljc;

    invoke-direct {v4, v3, v1, v11}, Ljc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x2fa7c59b

    invoke-static {v3, v4, v8}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v3

    .line 73
    invoke-virtual {v8, v1}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v4

    .line 74
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1a

    if-ne v5, v13, :cond_1b

    .line 75
    :cond_1a
    new-instance v5, Lgi0;

    const/4 v9, 0x0

    invoke-direct {v5, v1, v9}, Lgi0;-><init>(Lw31;I)V

    .line 76
    invoke-virtual {v8, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 77
    :cond_1b
    check-cast v5, Lhw;

    .line 78
    invoke-virtual {v8, v0}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v1

    .line 79
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_1d

    if-ne v4, v13, :cond_1c

    goto :goto_10

    :cond_1c
    const/4 v1, 0x1

    goto :goto_11

    .line 80
    :cond_1d
    :goto_10
    new-instance v4, Lgi0;

    const/4 v1, 0x1

    invoke-direct {v4, v0, v1}, Lgi0;-><init>(Lw31;I)V

    .line 81
    invoke-virtual {v8, v4}, Lpi;->g0(Ljava/lang/Object;)V

    .line 82
    :goto_11
    check-cast v4, Lhw;

    shr-int/lit8 v0, v15, 0x9

    const v9, 0xe000

    and-int/2addr v0, v9

    or-int/lit16 v0, v0, 0x1b6

    move-object v9, v8

    move v8, v0

    move-object v0, v2

    move-object v2, v7

    move-object v7, v9

    move v9, v6

    move-object v6, v4

    move v4, v9

    move v9, v1

    move-object v1, v3

    move-object/from16 v3, v18

    .line 83
    invoke-static/range {v0 .. v8}, Loi0;->c(Lmh;Lmh;Lmh;Lww;ZLhw;Lhw;Lji;I)V

    move v6, v4

    .line 84
    invoke-virtual {v7, v9}, Lpi;->p(Z)V

    move v8, v6

    move/from16 v6, v16

    move-object/from16 v5, v17

    goto :goto_12

    :cond_1e
    move-object v11, v1

    move-object v7, v8

    .line 85
    invoke-virtual {v7}, Lpi;->R()V

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    .line 86
    :goto_12
    invoke-virtual {v7}, Lpi;->r()Lht0;

    move-result-object v13

    if-eqz v13, :cond_1f

    new-instance v0, Lhi0;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object v9, v11

    move-object v1, v12

    invoke-direct/range {v0 .. v10}, Lhi0;-><init>(Ljw0;ZLhw;Lww;Lpe0;ZLww;ZLei0;I)V

    .line 87
    iput-object v0, v13, Lht0;->d:Lww;

    :cond_1f
    return-void
.end method

.method public static final c(Lmh;Lmh;Lmh;Lww;ZLhw;Lhw;Lji;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move/from16 v8, p8

    .line 16
    .line 17
    move-object/from16 v0, p7

    .line 18
    .line 19
    check-cast v0, Lpi;

    .line 20
    .line 21
    const v9, -0x3cc4f656

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v9}, Lpi;->X(I)Lpi;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v9, v8, 0x6

    .line 28
    .line 29
    if-nez v9, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    if-eqz v9, :cond_0

    .line 36
    .line 37
    const/4 v9, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v9, 0x2

    .line 40
    :goto_0
    or-int/2addr v9, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v9, v8

    .line 43
    :goto_1
    and-int/lit8 v10, v8, 0x30

    .line 44
    .line 45
    if-nez v10, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lpi;->h(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_2

    .line 52
    .line 53
    const/16 v10, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v10, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v9, v10

    .line 59
    :cond_3
    and-int/lit16 v10, v8, 0x180

    .line 60
    .line 61
    if-nez v10, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Lpi;->h(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    const/16 v10, 0x100

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/16 v10, 0x80

    .line 73
    .line 74
    :goto_3
    or-int/2addr v9, v10

    .line 75
    :cond_5
    and-int/lit16 v10, v8, 0xc00

    .line 76
    .line 77
    const/16 v11, 0x800

    .line 78
    .line 79
    if-nez v10, :cond_7

    .line 80
    .line 81
    invoke-virtual {v0, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_6

    .line 86
    .line 87
    move v10, v11

    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/16 v10, 0x400

    .line 90
    .line 91
    :goto_4
    or-int/2addr v9, v10

    .line 92
    :cond_7
    and-int/lit16 v10, v8, 0x6000

    .line 93
    .line 94
    const/16 v12, 0x4000

    .line 95
    .line 96
    if-nez v10, :cond_9

    .line 97
    .line 98
    invoke-virtual {v0, v5}, Lpi;->g(Z)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_8

    .line 103
    .line 104
    move v10, v12

    .line 105
    goto :goto_5

    .line 106
    :cond_8
    const/16 v10, 0x2000

    .line 107
    .line 108
    :goto_5
    or-int/2addr v9, v10

    .line 109
    :cond_9
    const/high16 v10, 0x30000

    .line 110
    .line 111
    and-int/2addr v10, v8

    .line 112
    if-nez v10, :cond_b

    .line 113
    .line 114
    invoke-virtual {v0, v6}, Lpi;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_a

    .line 119
    .line 120
    const/high16 v10, 0x20000

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_a
    const/high16 v10, 0x10000

    .line 124
    .line 125
    :goto_6
    or-int/2addr v9, v10

    .line 126
    :cond_b
    const/high16 v10, 0x180000

    .line 127
    .line 128
    and-int/2addr v10, v8

    .line 129
    const/high16 v14, 0x100000

    .line 130
    .line 131
    if-nez v10, :cond_d

    .line 132
    .line 133
    invoke-virtual {v0, v7}, Lpi;->h(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_c

    .line 138
    .line 139
    move v10, v14

    .line 140
    goto :goto_7

    .line 141
    :cond_c
    const/high16 v10, 0x80000

    .line 142
    .line 143
    :goto_7
    or-int/2addr v9, v10

    .line 144
    :cond_d
    const v10, 0x92493

    .line 145
    .line 146
    .line 147
    and-int/2addr v10, v9

    .line 148
    const v15, 0x92492

    .line 149
    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    if-eq v10, v15, :cond_e

    .line 153
    .line 154
    const/4 v10, 0x1

    .line 155
    goto :goto_8

    .line 156
    :cond_e
    move v10, v13

    .line 157
    :goto_8
    and-int/lit8 v15, v9, 0x1

    .line 158
    .line 159
    invoke-virtual {v0, v15, v10}, Lpi;->O(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-eqz v10, :cond_22

    .line 164
    .line 165
    new-instance v10, Lv9;

    .line 166
    .line 167
    invoke-direct {v10, v13}, Lv9;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-static {v10}, Li4;->x(Lxw;)Lpe0;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    const/high16 v15, 0x380000

    .line 175
    .line 176
    and-int/2addr v15, v9

    .line 177
    if-ne v15, v14, :cond_f

    .line 178
    .line 179
    const/4 v14, 0x1

    .line 180
    goto :goto_9

    .line 181
    :cond_f
    move v14, v13

    .line 182
    :goto_9
    and-int/lit16 v15, v9, 0x1c00

    .line 183
    .line 184
    if-ne v15, v11, :cond_10

    .line 185
    .line 186
    const/4 v11, 0x1

    .line 187
    goto :goto_a

    .line 188
    :cond_10
    move v11, v13

    .line 189
    :goto_a
    or-int/2addr v11, v14

    .line 190
    const v14, 0xe000

    .line 191
    .line 192
    .line 193
    and-int/2addr v14, v9

    .line 194
    if-ne v14, v12, :cond_11

    .line 195
    .line 196
    const/4 v15, 0x1

    .line 197
    goto :goto_b

    .line 198
    :cond_11
    move v15, v13

    .line 199
    :goto_b
    or-int/2addr v11, v15

    .line 200
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    sget-object v12, Lii;->a:Lr3;

    .line 205
    .line 206
    if-nez v11, :cond_12

    .line 207
    .line 208
    if-ne v15, v12, :cond_13

    .line 209
    .line 210
    :cond_12
    new-instance v15, Lni0;

    .line 211
    .line 212
    invoke-direct {v15, v7, v4, v5}, Lni0;-><init>(Lhw;Lww;Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v15}, Lpi;->g0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_13
    check-cast v15, Lxd0;

    .line 219
    .line 220
    invoke-static {v0}, Lo30;->p(Lji;)I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    invoke-virtual {v0}, Lpi;->l()Lfq0;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    invoke-static {v0, v10}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    sget-object v16, Lfi;->b:Lei;

    .line 233
    .line 234
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    sget-object v7, Lei;->b:Lcj;

    .line 238
    .line 239
    invoke-virtual {v0}, Lpi;->Z()V

    .line 240
    .line 241
    .line 242
    iget-boolean v8, v0, Lpi;->S:Z

    .line 243
    .line 244
    if-eqz v8, :cond_14

    .line 245
    .line 246
    invoke-virtual {v0, v7}, Lpi;->k(Lhw;)V

    .line 247
    .line 248
    .line 249
    goto :goto_c

    .line 250
    :cond_14
    invoke-virtual {v0}, Lpi;->j0()V

    .line 251
    .line 252
    .line 253
    :goto_c
    sget-object v8, Lei;->e:Lm7;

    .line 254
    .line 255
    invoke-static {v0, v8, v15}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    sget-object v15, Lei;->d:Lm7;

    .line 259
    .line 260
    invoke-static {v0, v15, v13}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v13, Lei;->f:Lm7;

    .line 264
    .line 265
    move/from16 v16, v9

    .line 266
    .line 267
    iget-boolean v9, v0, Lpi;->S:Z

    .line 268
    .line 269
    if-nez v9, :cond_15

    .line 270
    .line 271
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-static {v9, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-nez v4, :cond_16

    .line 284
    .line 285
    :cond_15
    invoke-static {v11, v0, v11, v13}, Lt1;->o(ILpi;ILm7;)V

    .line 286
    .line 287
    .line 288
    :cond_16
    sget-object v4, Lei;->c:Lm7;

    .line 289
    .line 290
    invoke-static {v0, v4, v10}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    and-int/lit8 v9, v16, 0xe

    .line 294
    .line 295
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-virtual {v1, v0, v9}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    shr-int/lit8 v9, v16, 0x3

    .line 303
    .line 304
    and-int/lit8 v9, v9, 0xe

    .line 305
    .line 306
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    invoke-virtual {v2, v0, v9}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    const-string v9, "icon"

    .line 314
    .line 315
    invoke-static {v9}, Lpf1;->E(Ljava/lang/String;)Lpe0;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    sget-object v10, Ln2;->e:Lha;

    .line 320
    .line 321
    const/4 v11, 0x0

    .line 322
    invoke-static {v10, v11}, Lza;->d(Lha;Z)Lxd0;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v0}, Lo30;->p(Lji;)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    invoke-virtual {v0}, Lpi;->l()Lfq0;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-static {v0, v9}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    invoke-virtual {v0}, Lpi;->Z()V

    .line 339
    .line 340
    .line 341
    move-object/from16 v17, v10

    .line 342
    .line 343
    iget-boolean v10, v0, Lpi;->S:Z

    .line 344
    .line 345
    if-eqz v10, :cond_17

    .line 346
    .line 347
    invoke-virtual {v0, v7}, Lpi;->k(Lhw;)V

    .line 348
    .line 349
    .line 350
    goto :goto_d

    .line 351
    :cond_17
    invoke-virtual {v0}, Lpi;->j0()V

    .line 352
    .line 353
    .line 354
    :goto_d
    invoke-static {v0, v8, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-static {v0, v15, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget-boolean v1, v0, Lpi;->S:Z

    .line 361
    .line 362
    if-nez v1, :cond_18

    .line 363
    .line 364
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-static {v1, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-nez v1, :cond_19

    .line 377
    .line 378
    :cond_18
    invoke-static {v11, v0, v11, v13}, Lt1;->o(ILpi;ILm7;)V

    .line 379
    .line 380
    .line 381
    :cond_19
    invoke-static {v0, v4, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    shr-int/lit8 v1, v16, 0x6

    .line 385
    .line 386
    and-int/lit8 v1, v1, 0xe

    .line 387
    .line 388
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-virtual {v3, v0, v1}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    const/4 v1, 0x1

    .line 396
    invoke-virtual {v0, v1}, Lpi;->p(Z)V

    .line 397
    .line 398
    .line 399
    if-eqz p3, :cond_21

    .line 400
    .line 401
    const v1, -0x275dfe19

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v1}, Lpi;->W(I)V

    .line 405
    .line 406
    .line 407
    const-string v1, "label"

    .line 408
    .line 409
    invoke-static {v1}, Lpf1;->E(Ljava/lang/String;)Lpe0;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    const/16 v2, 0x4000

    .line 414
    .line 415
    if-ne v14, v2, :cond_1a

    .line 416
    .line 417
    const/4 v2, 0x1

    .line 418
    goto :goto_e

    .line 419
    :cond_1a
    const/4 v2, 0x0

    .line 420
    :goto_e
    const/high16 v9, 0x70000

    .line 421
    .line 422
    and-int v9, v16, v9

    .line 423
    .line 424
    const/high16 v10, 0x20000

    .line 425
    .line 426
    if-ne v9, v10, :cond_1b

    .line 427
    .line 428
    const/4 v9, 0x1

    .line 429
    goto :goto_f

    .line 430
    :cond_1b
    const/4 v9, 0x0

    .line 431
    :goto_f
    or-int/2addr v2, v9

    .line 432
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    if-nez v2, :cond_1c

    .line 437
    .line 438
    if-ne v9, v12, :cond_1d

    .line 439
    .line 440
    :cond_1c
    new-instance v9, Lii0;

    .line 441
    .line 442
    invoke-direct {v9, v5, v6}, Lii0;-><init>(ZLhw;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v9}, Lpi;->g0(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    :cond_1d
    check-cast v9, Lsw;

    .line 449
    .line 450
    invoke-static {v1, v9}, Lp30;->H(Lpe0;Lsw;)Lpe0;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    move-object/from16 v2, v17

    .line 455
    .line 456
    const/4 v11, 0x0

    .line 457
    invoke-static {v2, v11}, Lza;->d(Lha;Z)Lxd0;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-static {v0}, Lo30;->p(Lji;)I

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    invoke-virtual {v0}, Lpi;->l()Lfq0;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    invoke-static {v0, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual {v0}, Lpi;->Z()V

    .line 474
    .line 475
    .line 476
    iget-boolean v11, v0, Lpi;->S:Z

    .line 477
    .line 478
    if-eqz v11, :cond_1e

    .line 479
    .line 480
    invoke-virtual {v0, v7}, Lpi;->k(Lhw;)V

    .line 481
    .line 482
    .line 483
    goto :goto_10

    .line 484
    :cond_1e
    invoke-virtual {v0}, Lpi;->j0()V

    .line 485
    .line 486
    .line 487
    :goto_10
    invoke-static {v0, v8, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v0, v15, v10}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    iget-boolean v2, v0, Lpi;->S:Z

    .line 494
    .line 495
    if-nez v2, :cond_1f

    .line 496
    .line 497
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    invoke-static {v2, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-nez v2, :cond_20

    .line 510
    .line 511
    :cond_1f
    invoke-static {v9, v0, v9, v13}, Lt1;->o(ILpi;ILm7;)V

    .line 512
    .line 513
    .line 514
    :cond_20
    invoke-static {v0, v4, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    shr-int/lit8 v1, v16, 0x9

    .line 518
    .line 519
    and-int/lit8 v1, v1, 0xe

    .line 520
    .line 521
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    move-object/from16 v4, p3

    .line 526
    .line 527
    invoke-interface {v4, v0, v1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    const/4 v1, 0x1

    .line 531
    invoke-virtual {v0, v1}, Lpi;->p(Z)V

    .line 532
    .line 533
    .line 534
    const/4 v11, 0x0

    .line 535
    invoke-virtual {v0, v11}, Lpi;->p(Z)V

    .line 536
    .line 537
    .line 538
    goto :goto_11

    .line 539
    :cond_21
    move-object/from16 v4, p3

    .line 540
    .line 541
    const/4 v1, 0x1

    .line 542
    const/4 v11, 0x0

    .line 543
    const v2, -0x2759db7f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v2}, Lpi;->W(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v11}, Lpi;->p(Z)V

    .line 550
    .line 551
    .line 552
    :goto_11
    invoke-virtual {v0, v1}, Lpi;->p(Z)V

    .line 553
    .line 554
    .line 555
    goto :goto_12

    .line 556
    :cond_22
    invoke-virtual {v0}, Lpi;->R()V

    .line 557
    .line 558
    .line 559
    :goto_12
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    if-eqz v9, :cond_23

    .line 564
    .line 565
    new-instance v0, Lic;

    .line 566
    .line 567
    move-object/from16 v1, p0

    .line 568
    .line 569
    move-object/from16 v2, p1

    .line 570
    .line 571
    move-object/from16 v7, p6

    .line 572
    .line 573
    move/from16 v8, p8

    .line 574
    .line 575
    invoke-direct/range {v0 .. v8}, Lic;-><init>(Lmh;Lmh;Lmh;Lww;ZLhw;Lhw;I)V

    .line 576
    .line 577
    .line 578
    iput-object v0, v9, Lht0;->d:Lww;

    .line 579
    .line 580
    :cond_23
    return-void
.end method
