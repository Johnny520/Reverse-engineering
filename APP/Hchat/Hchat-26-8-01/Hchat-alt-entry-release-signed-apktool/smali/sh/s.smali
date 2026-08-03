.class public abstract Lsh/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ls0/d;

.field public static final b:Ls0/d;

.field public static final c:Ls0/d;

.field public static final d:Ls0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ls0/d;

    .line 9
    .line 10
    const v2, 0x32aa63f7

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Li2/y;

    .line 18
    .line 19
    const/16 v1, 0x11

    .line 20
    .line 21
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Ls0/d;

    .line 25
    .line 26
    const v2, 0x365860e7

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Li2/y;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Ls0/d;

    .line 40
    .line 41
    const v2, 0x60ba3f07

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lsh/s;->a:Ls0/d;

    .line 48
    .line 49
    new-instance v0, Li2/y;

    .line 50
    .line 51
    const/16 v1, 0x13

    .line 52
    .line 53
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Ls0/d;

    .line 57
    .line 58
    const v2, 0x7db2a7da

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Lsh/s;->b:Ls0/d;

    .line 65
    .line 66
    new-instance v0, Li2/y;

    .line 67
    .line 68
    const/16 v1, 0x14

    .line 69
    .line 70
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Ls0/d;

    .line 74
    .line 75
    const v2, 0x8130d08

    .line 76
    .line 77
    .line 78
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 79
    .line 80
    .line 81
    sput-object v1, Lsh/s;->c:Ls0/d;

    .line 82
    .line 83
    new-instance v0, Li2/y;

    .line 84
    .line 85
    const/16 v1, 0x15

    .line 86
    .line 87
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Ls0/d;

    .line 91
    .line 92
    const v2, 0x6a16bcdb

    .line 93
    .line 94
    .line 95
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 96
    .line 97
    .line 98
    sput-object v1, Lsh/s;->d:Ls0/d;

    .line 99
    .line 100
    return-void
.end method

.method public static final a(Ly0/o;Lsh/f;FLs0/d;Li0/h0;I)V
    .locals 6

    .line 1
    const v0, -0x19a7ce07

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p5

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p5

    .line 23
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 40
    .line 41
    const/16 v2, 0x100

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {p4, p2}, Li0/h0;->c(F)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    move v1, v2

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v1, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v0, v1

    .line 56
    :cond_5
    and-int/lit16 v1, v0, 0x493

    .line 57
    .line 58
    const/16 v3, 0x492

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x1

    .line 62
    if-eq v1, v3, :cond_6

    .line 63
    .line 64
    move v1, v5

    .line 65
    goto :goto_4

    .line 66
    :cond_6
    move v1, v4

    .line 67
    :goto_4
    and-int/lit8 v3, v0, 0x1

    .line 68
    .line 69
    invoke-virtual {p4, v3, v1}, Li0/h0;->S(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_c

    .line 74
    .line 75
    invoke-virtual {p4}, Li0/h0;->X()V

    .line 76
    .line 77
    .line 78
    and-int/lit8 v1, p5, 0x1

    .line 79
    .line 80
    if-eqz v1, :cond_8

    .line 81
    .line 82
    invoke-virtual {p4}, Li0/h0;->B()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_7
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 90
    .line 91
    .line 92
    :cond_8
    :goto_5
    invoke-virtual {p4}, Li0/h0;->q()V

    .line 93
    .line 94
    .line 95
    and-int/lit16 v0, v0, 0x380

    .line 96
    .line 97
    if-ne v0, v2, :cond_9

    .line 98
    .line 99
    move v4, v5

    .line 100
    :cond_9
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v4, :cond_a

    .line 105
    .line 106
    sget-object v1, Li0/l;->a:Li0/e;

    .line 107
    .line 108
    if-ne v0, v1, :cond_b

    .line 109
    .line 110
    :cond_a
    invoke-static {p2}, Lv/e;->a(F)Lv/d;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_b
    check-cast v0, Lv/d;

    .line 118
    .line 119
    sget-object v1, Lbi/f;->a:Li0/u;

    .line 120
    .line 121
    iget-wide v2, p1, Lsh/f;->b:J

    .line 122
    .line 123
    new-instance v4, Lf1/w;

    .line 124
    .line 125
    invoke-direct {v4, v2, v3}, Lf1/w;-><init>(J)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v4}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v2, Lc9/q0;

    .line 133
    .line 134
    invoke-direct {v2, p0, v0, p1, p3}, Lc9/q0;-><init>(Ly0/o;Lv/d;Lsh/f;Ls0/d;)V

    .line 135
    .line 136
    .line 137
    const v0, -0x3c8baac7    # -244.3329f

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v2, p4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const/16 v2, 0x38

    .line 145
    .line 146
    invoke-static {v1, v0, p4, v2}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_c
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 151
    .line 152
    .line 153
    :goto_6
    invoke-virtual {p4}, Li0/h0;->t()Li0/r1;

    .line 154
    .line 155
    .line 156
    move-result-object p4

    .line 157
    if-eqz p4, :cond_d

    .line 158
    .line 159
    new-instance v0, Lsh/h;

    .line 160
    .line 161
    move-object v1, p0

    .line 162
    move-object v2, p1

    .line 163
    move v3, p2

    .line 164
    move-object v4, p3

    .line 165
    move v5, p5

    .line 166
    invoke-direct/range {v0 .. v5}, Lsh/h;-><init>(Ly0/o;Lsh/f;FLs0/d;I)V

    .line 167
    .line 168
    .line 169
    iput-object v0, p4, Li0/r1;->d:Lfg/p;

    .line 170
    .line 171
    :cond_d
    return-void
.end method

.method public static final b(Ly0/o;Lfg/q;Lp/x0;Lfg/a;ZZLn/k;Ls0/d;Li0/h0;I)V
    .locals 25

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
    move/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move-object/from16 v8, p7

    .line 16
    .line 17
    move-object/from16 v0, p8

    .line 18
    .line 19
    move/from16 v9, p9

    .line 20
    .line 21
    const v10, -0x784423a6

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v10}, Li0/h0;->b0(I)Li0/h0;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v10, v9, 0x6

    .line 28
    .line 29
    if-nez v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-eqz v10, :cond_0

    .line 36
    .line 37
    const/4 v10, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v10, 0x2

    .line 40
    :goto_0
    or-int/2addr v10, v9

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v10, v9

    .line 43
    :goto_1
    and-int/lit8 v12, v9, 0x30

    .line 44
    .line 45
    const/4 v13, 0x0

    .line 46
    if-nez v12, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    if-eqz v12, :cond_2

    .line 53
    .line 54
    const/16 v12, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v12, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v10, v12

    .line 60
    :cond_3
    and-int/lit16 v12, v9, 0x180

    .line 61
    .line 62
    if-nez v12, :cond_5

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-eqz v12, :cond_4

    .line 69
    .line 70
    const/16 v12, 0x100

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/16 v12, 0x80

    .line 74
    .line 75
    :goto_3
    or-int/2addr v10, v12

    .line 76
    :cond_5
    and-int/lit16 v12, v9, 0xc00

    .line 77
    .line 78
    if-nez v12, :cond_7

    .line 79
    .line 80
    invoke-virtual {v0, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_6

    .line 85
    .line 86
    const/16 v12, 0x800

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/16 v12, 0x400

    .line 90
    .line 91
    :goto_4
    or-int/2addr v10, v12

    .line 92
    :cond_7
    and-int/lit16 v12, v9, 0x6000

    .line 93
    .line 94
    if-nez v12, :cond_9

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_8

    .line 101
    .line 102
    const/16 v12, 0x4000

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_8
    const/16 v12, 0x2000

    .line 106
    .line 107
    :goto_5
    or-int/2addr v10, v12

    .line 108
    :cond_9
    const/high16 v12, 0x30000

    .line 109
    .line 110
    and-int/2addr v12, v9

    .line 111
    if-nez v12, :cond_b

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-eqz v12, :cond_a

    .line 118
    .line 119
    const/high16 v12, 0x20000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v12, 0x10000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v10, v12

    .line 125
    :cond_b
    const/high16 v12, 0x180000

    .line 126
    .line 127
    and-int/2addr v12, v9

    .line 128
    if-nez v12, :cond_d

    .line 129
    .line 130
    invoke-virtual {v0, v5}, Li0/h0;->g(Z)Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    if-eqz v12, :cond_c

    .line 135
    .line 136
    const/high16 v12, 0x100000

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    const/high16 v12, 0x80000

    .line 140
    .line 141
    :goto_7
    or-int/2addr v10, v12

    .line 142
    :cond_d
    const/high16 v12, 0xc00000

    .line 143
    .line 144
    and-int/2addr v12, v9

    .line 145
    if-nez v12, :cond_f

    .line 146
    .line 147
    invoke-virtual {v0, v6}, Li0/h0;->g(Z)Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-eqz v12, :cond_e

    .line 152
    .line 153
    const/high16 v12, 0x800000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_e
    const/high16 v12, 0x400000

    .line 157
    .line 158
    :goto_8
    or-int/2addr v10, v12

    .line 159
    :cond_f
    const/high16 v12, 0x6000000

    .line 160
    .line 161
    and-int/2addr v12, v9

    .line 162
    if-nez v12, :cond_11

    .line 163
    .line 164
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-eqz v12, :cond_10

    .line 169
    .line 170
    const/high16 v12, 0x4000000

    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_10
    const/high16 v12, 0x2000000

    .line 174
    .line 175
    :goto_9
    or-int/2addr v10, v12

    .line 176
    :cond_11
    const/high16 v12, 0x30000000

    .line 177
    .line 178
    and-int/2addr v12, v9

    .line 179
    if-nez v12, :cond_13

    .line 180
    .line 181
    invoke-virtual {v0, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-eqz v12, :cond_12

    .line 186
    .line 187
    const/high16 v12, 0x20000000

    .line 188
    .line 189
    goto :goto_a

    .line 190
    :cond_12
    const/high16 v12, 0x10000000

    .line 191
    .line 192
    :goto_a
    or-int/2addr v10, v12

    .line 193
    :cond_13
    const v12, 0x12492493

    .line 194
    .line 195
    .line 196
    and-int/2addr v12, v10

    .line 197
    const v11, 0x12492492

    .line 198
    .line 199
    .line 200
    const/4 v15, 0x0

    .line 201
    move-object/from16 v18, v13

    .line 202
    .line 203
    if-eq v12, v11, :cond_14

    .line 204
    .line 205
    const/4 v11, 0x1

    .line 206
    goto :goto_b

    .line 207
    :cond_14
    move v11, v15

    .line 208
    :goto_b
    and-int/lit8 v12, v10, 0x1

    .line 209
    .line 210
    invoke-virtual {v0, v12, v11}, Li0/h0;->S(IZ)Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-eqz v11, :cond_29

    .line 215
    .line 216
    sget-object v11, Li0/l;->a:Li0/e;

    .line 217
    .line 218
    if-nez v7, :cond_16

    .line 219
    .line 220
    const v12, 0x7e9855c1

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v12}, Li0/h0;->a0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    if-ne v12, v11, :cond_15

    .line 231
    .line 232
    new-instance v12, Ln/k;

    .line 233
    .line 234
    invoke-direct {v12}, Ln/k;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_15
    check-cast v12, Ln/k;

    .line 241
    .line 242
    invoke-virtual {v0, v15}, Li0/h0;->p(Z)V

    .line 243
    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_16
    const v12, -0x77c98c2a

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v12}, Li0/h0;->a0(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v15}, Li0/h0;->p(Z)V

    .line 253
    .line 254
    .line 255
    move-object v12, v7

    .line 256
    :goto_c
    invoke-static {v4, v0}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 257
    .line 258
    .line 259
    move-result-object v15

    .line 260
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    if-ne v13, v11, :cond_17

    .line 265
    .line 266
    invoke-static/range {v18 .. v18}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    invoke-virtual {v0, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_17
    check-cast v13, Li0/a1;

    .line 274
    .line 275
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    invoke-virtual {v0, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v20

    .line 283
    const/high16 v21, 0x380000

    .line 284
    .line 285
    and-int v4, v10, v21

    .line 286
    .line 287
    const/high16 v6, 0x100000

    .line 288
    .line 289
    if-ne v4, v6, :cond_18

    .line 290
    .line 291
    const/4 v4, 0x1

    .line 292
    goto :goto_d

    .line 293
    :cond_18
    const/4 v4, 0x0

    .line 294
    :goto_d
    or-int v4, v20, v4

    .line 295
    .line 296
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    if-nez v4, :cond_19

    .line 301
    .line 302
    if-ne v6, v11, :cond_1a

    .line 303
    .line 304
    :cond_19
    new-instance v6, Lsh/p;

    .line 305
    .line 306
    move-object/from16 v4, v18

    .line 307
    .line 308
    invoke-direct {v6, v5, v13, v12, v4}, Lsh/p;-><init>(ZLi0/a1;Ln/k;Lwf/c;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_1a
    check-cast v6, Lfg/p;

    .line 315
    .line 316
    shr-int/lit8 v4, v10, 0x12

    .line 317
    .line 318
    invoke-static {v14, v12, v6, v0}, Li0/r;->g(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V

    .line 319
    .line 320
    .line 321
    if-eqz p3, :cond_1b

    .line 322
    .line 323
    const/4 v6, 0x1

    .line 324
    goto :goto_e

    .line 325
    :cond_1b
    const/4 v6, 0x0

    .line 326
    :goto_e
    const/high16 v13, 0x1c00000

    .line 327
    .line 328
    and-int/2addr v10, v13

    .line 329
    const/high16 v13, 0x800000

    .line 330
    .line 331
    if-ne v10, v13, :cond_1c

    .line 332
    .line 333
    const/4 v10, 0x1

    .line 334
    goto :goto_f

    .line 335
    :cond_1c
    const/4 v10, 0x0

    .line 336
    :goto_f
    invoke-virtual {v0, v6}, Li0/h0;->g(Z)Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    or-int/2addr v10, v13

    .line 341
    invoke-virtual {v0, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v13

    .line 345
    or-int/2addr v10, v13

    .line 346
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    sget-object v19, Ly0/l;->a:Ly0/l;

    .line 351
    .line 352
    if-nez v10, :cond_1e

    .line 353
    .line 354
    if-ne v13, v11, :cond_1d

    .line 355
    .line 356
    goto :goto_10

    .line 357
    :cond_1d
    move-object/from16 v10, v19

    .line 358
    .line 359
    goto :goto_12

    .line 360
    :cond_1e
    :goto_10
    if-eqz p5, :cond_1f

    .line 361
    .line 362
    if-eqz v6, :cond_1f

    .line 363
    .line 364
    new-instance v6, Lb0/j;

    .line 365
    .line 366
    const/16 v10, 0xd

    .line 367
    .line 368
    invoke-direct {v6, v15, v10}, Lb0/j;-><init>(Li0/a1;I)V

    .line 369
    .line 370
    .line 371
    const/16 v24, 0x7

    .line 372
    .line 373
    const/16 v20, 0x0

    .line 374
    .line 375
    const/16 v21, 0x0

    .line 376
    .line 377
    move-object/from16 v23, v6

    .line 378
    .line 379
    move-object/from16 v22, v12

    .line 380
    .line 381
    invoke-static/range {v19 .. v24}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    move-object/from16 v10, v19

    .line 386
    .line 387
    move-object v13, v6

    .line 388
    goto :goto_11

    .line 389
    :cond_1f
    move-object/from16 v10, v19

    .line 390
    .line 391
    move-object v13, v10

    .line 392
    :goto_11
    invoke-virtual {v0, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    :goto_12
    check-cast v13, Ly0/o;

    .line 396
    .line 397
    const/16 v6, 0x38

    .line 398
    .line 399
    int-to-float v6, v6

    .line 400
    const/4 v12, 0x0

    .line 401
    const/4 v14, 0x2

    .line 402
    invoke-static {v1, v6, v12, v14}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    const/high16 v12, 0x3f800000    # 1.0f

    .line 407
    .line 408
    invoke-static {v6, v12}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    invoke-interface {v6, v13}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    invoke-static {v6, v3}, Lp/d;->k(Ly0/o;Lp/x0;)Ly0/o;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    sget-object v12, Lp/j;->e:Lp/f;

    .line 421
    .line 422
    sget-object v13, Ly0/b;->s:Ly0/e;

    .line 423
    .line 424
    const/4 v14, 0x6

    .line 425
    invoke-static {v12, v13, v0, v14}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 426
    .line 427
    .line 428
    move-result-object v15

    .line 429
    move/from16 v16, v14

    .line 430
    .line 431
    move-object/from16 v17, v15

    .line 432
    .line 433
    iget-wide v14, v0, Li0/h0;->T:J

    .line 434
    .line 435
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 436
    .line 437
    .line 438
    move-result v14

    .line 439
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 440
    .line 441
    .line 442
    move-result-object v15

    .line 443
    invoke-static {v0, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    sget-object v18, Lx1/g;->f:Lx1/f;

    .line 448
    .line 449
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    sget-object v1, Lx1/f;->b:Lx1/y;

    .line 453
    .line 454
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 455
    .line 456
    .line 457
    iget-boolean v3, v0, Li0/h0;->S:Z

    .line 458
    .line 459
    if-eqz v3, :cond_20

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Li0/h0;->k(Lfg/a;)V

    .line 462
    .line 463
    .line 464
    goto :goto_13

    .line 465
    :cond_20
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 466
    .line 467
    .line 468
    :goto_13
    sget-object v3, Lx1/f;->e:Lx1/e;

    .line 469
    .line 470
    move-object/from16 v5, v17

    .line 471
    .line 472
    invoke-static {v3, v0, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    sget-object v5, Lx1/f;->d:Lx1/e;

    .line 476
    .line 477
    invoke-static {v5, v0, v15}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v14

    .line 484
    sget-object v15, Lx1/f;->f:Lx1/e;

    .line 485
    .line 486
    invoke-static {v0, v14, v15}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 487
    .line 488
    .line 489
    sget-object v14, Lx1/f;->g:Lx1/d;

    .line 490
    .line 491
    invoke-static {v14, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 492
    .line 493
    .line 494
    sget-object v7, Lx1/f;->c:Lx1/e;

    .line 495
    .line 496
    invoke-static {v7, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    sget-object v6, Lp/u;->a:Lp/u;

    .line 500
    .line 501
    if-nez v2, :cond_22

    .line 502
    .line 503
    const v11, 0x7cb5e7f1

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v11}, Li0/h0;->a0(I)V

    .line 507
    .line 508
    .line 509
    and-int/lit16 v4, v4, 0x1c00

    .line 510
    .line 511
    or-int/lit16 v4, v4, 0x1b0

    .line 512
    .line 513
    const/16 v11, 0x36

    .line 514
    .line 515
    invoke-static {v12, v13, v0, v11}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 516
    .line 517
    .line 518
    move-result-object v11

    .line 519
    iget-wide v12, v0, Li0/h0;->T:J

    .line 520
    .line 521
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 522
    .line 523
    .line 524
    move-result v12

    .line 525
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 526
    .line 527
    .line 528
    move-result-object v13

    .line 529
    invoke-static {v0, v10}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 534
    .line 535
    .line 536
    move/from16 v17, v4

    .line 537
    .line 538
    iget-boolean v4, v0, Li0/h0;->S:Z

    .line 539
    .line 540
    if-eqz v4, :cond_21

    .line 541
    .line 542
    invoke-virtual {v0, v1}, Li0/h0;->k(Lfg/a;)V

    .line 543
    .line 544
    .line 545
    goto :goto_14

    .line 546
    :cond_21
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 547
    .line 548
    .line 549
    :goto_14
    invoke-static {v3, v0, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    invoke-static {v5, v0, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-static {v0, v1, v15}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 560
    .line 561
    .line 562
    invoke-static {v14, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 563
    .line 564
    .line 565
    invoke-static {v7, v0, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    shr-int/lit8 v1, v17, 0x6

    .line 569
    .line 570
    and-int/lit8 v1, v1, 0x70

    .line 571
    .line 572
    or-int/lit8 v1, v1, 0x6

    .line 573
    .line 574
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {v8, v6, v0, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    const/4 v1, 0x1

    .line 582
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 583
    .line 584
    .line 585
    const/4 v1, 0x0

    .line 586
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 587
    .line 588
    .line 589
    move v6, v1

    .line 590
    move-object v3, v2

    .line 591
    const/4 v1, 0x1

    .line 592
    goto/16 :goto_1a

    .line 593
    .line 594
    :cond_22
    const v9, 0x7cbdcd5c

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v9}, Li0/h0;->a0(I)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v9

    .line 604
    if-ne v9, v11, :cond_23

    .line 605
    .line 606
    sget-object v9, Lsh/r;->a:Lsh/r;

    .line 607
    .line 608
    invoke-virtual {v0, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    :cond_23
    check-cast v9, Lv1/n0;

    .line 612
    .line 613
    move-object/from16 v18, v12

    .line 614
    .line 615
    iget-wide v11, v0, Li0/h0;->T:J

    .line 616
    .line 617
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 622
    .line 623
    .line 624
    move-result-object v12

    .line 625
    move/from16 v19, v11

    .line 626
    .line 627
    invoke-static {v0, v10}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 628
    .line 629
    .line 630
    move-result-object v11

    .line 631
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 632
    .line 633
    .line 634
    iget-boolean v2, v0, Li0/h0;->S:Z

    .line 635
    .line 636
    if-eqz v2, :cond_24

    .line 637
    .line 638
    invoke-virtual {v0, v1}, Li0/h0;->k(Lfg/a;)V

    .line 639
    .line 640
    .line 641
    goto :goto_15

    .line 642
    :cond_24
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 643
    .line 644
    .line 645
    :goto_15
    invoke-static {v3, v0, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    invoke-static {v5, v0, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-static {v0, v2, v15}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 656
    .line 657
    .line 658
    invoke-static {v14, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 659
    .line 660
    .line 661
    invoke-static {v7, v0, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    const v2, 0x25a8202c

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    .line 668
    .line 669
    .line 670
    const/4 v2, 0x0

    .line 671
    invoke-virtual {v0, v2}, Li0/h0;->p(Z)V

    .line 672
    .line 673
    .line 674
    const-string v2, "center"

    .line 675
    .line 676
    invoke-static {v2}, Lv1/w;->l(Ljava/lang/String;)Ly0/o;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    and-int/lit16 v4, v4, 0x1c00

    .line 681
    .line 682
    or-int/lit16 v4, v4, 0x1b6

    .line 683
    .line 684
    move-object/from16 v9, v18

    .line 685
    .line 686
    const/16 v11, 0x36

    .line 687
    .line 688
    invoke-static {v9, v13, v0, v11}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 689
    .line 690
    .line 691
    move-result-object v12

    .line 692
    move-object/from16 v19, v10

    .line 693
    .line 694
    iget-wide v10, v0, Li0/h0;->T:J

    .line 695
    .line 696
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 697
    .line 698
    .line 699
    move-result v10

    .line 700
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 701
    .line 702
    .line 703
    move-result-object v11

    .line 704
    invoke-static {v0, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 709
    .line 710
    .line 711
    iget-boolean v13, v0, Li0/h0;->S:Z

    .line 712
    .line 713
    if-eqz v13, :cond_25

    .line 714
    .line 715
    invoke-virtual {v0, v1}, Li0/h0;->k(Lfg/a;)V

    .line 716
    .line 717
    .line 718
    goto :goto_16

    .line 719
    :cond_25
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 720
    .line 721
    .line 722
    :goto_16
    invoke-static {v3, v0, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    invoke-static {v5, v0, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 729
    .line 730
    .line 731
    move-result-object v10

    .line 732
    invoke-static {v0, v10, v15}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 733
    .line 734
    .line 735
    invoke-static {v14, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 736
    .line 737
    .line 738
    invoke-static {v7, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    shr-int/lit8 v2, v4, 0x6

    .line 742
    .line 743
    and-int/lit8 v2, v2, 0x70

    .line 744
    .line 745
    or-int/lit8 v2, v2, 0x6

    .line 746
    .line 747
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    invoke-virtual {v8, v6, v0, v2}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    const/4 v2, 0x1

    .line 755
    invoke-virtual {v0, v2}, Li0/h0;->p(Z)V

    .line 756
    .line 757
    .line 758
    if-nez p1, :cond_26

    .line 759
    .line 760
    const v1, 0x25b17dd4

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 764
    .line 765
    .line 766
    const/4 v1, 0x0

    .line 767
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 768
    .line 769
    .line 770
    move-object/from16 v3, p1

    .line 771
    .line 772
    move v6, v1

    .line 773
    const/4 v1, 0x1

    .line 774
    goto/16 :goto_19

    .line 775
    .line 776
    :cond_26
    const v2, 0x25b17dd5

    .line 777
    .line 778
    .line 779
    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    .line 780
    .line 781
    .line 782
    const-string v2, "end"

    .line 783
    .line 784
    invoke-static {v2}, Lv1/w;->l(Ljava/lang/String;)Ly0/o;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    sget-object v4, Ly0/b;->u:Ly0/e;

    .line 789
    .line 790
    const/16 v11, 0x36

    .line 791
    .line 792
    invoke-static {v9, v4, v0, v11}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    iget-wide v9, v0, Li0/h0;->T:J

    .line 797
    .line 798
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 803
    .line 804
    .line 805
    move-result-object v9

    .line 806
    invoke-static {v0, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 811
    .line 812
    .line 813
    iget-boolean v10, v0, Li0/h0;->S:Z

    .line 814
    .line 815
    if-eqz v10, :cond_27

    .line 816
    .line 817
    invoke-virtual {v0, v1}, Li0/h0;->k(Lfg/a;)V

    .line 818
    .line 819
    .line 820
    goto :goto_17

    .line 821
    :cond_27
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 822
    .line 823
    .line 824
    :goto_17
    invoke-static {v3, v0, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    invoke-static {v5, v0, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    invoke-static {v0, v4, v15}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 835
    .line 836
    .line 837
    invoke-static {v14, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 838
    .line 839
    .line 840
    invoke-static {v7, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 841
    .line 842
    .line 843
    sget-object v2, Lp/j;->a:Lp/c;

    .line 844
    .line 845
    sget-object v4, Ly0/b;->p:Ly0/f;

    .line 846
    .line 847
    const/4 v6, 0x0

    .line 848
    invoke-static {v2, v4, v0, v6}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    iget-wide v9, v0, Li0/h0;->T:J

    .line 853
    .line 854
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 859
    .line 860
    .line 861
    move-result-object v6

    .line 862
    move-object/from16 v10, v19

    .line 863
    .line 864
    invoke-static {v0, v10}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 865
    .line 866
    .line 867
    move-result-object v9

    .line 868
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 869
    .line 870
    .line 871
    iget-boolean v10, v0, Li0/h0;->S:Z

    .line 872
    .line 873
    if-eqz v10, :cond_28

    .line 874
    .line 875
    invoke-virtual {v0, v1}, Li0/h0;->k(Lfg/a;)V

    .line 876
    .line 877
    .line 878
    goto :goto_18

    .line 879
    :cond_28
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 880
    .line 881
    .line 882
    :goto_18
    invoke-static {v3, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    invoke-static {v5, v0, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-static {v0, v1, v15}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 893
    .line 894
    .line 895
    invoke-static {v14, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 896
    .line 897
    .line 898
    invoke-static {v7, v0, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    sget-object v1, Lp/f1;->a:Lp/f1;

    .line 902
    .line 903
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    move-object/from16 v3, p1

    .line 908
    .line 909
    invoke-interface {v3, v1, v0, v2}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    const/4 v1, 0x1

    .line 913
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 917
    .line 918
    .line 919
    const/4 v6, 0x0

    .line 920
    invoke-virtual {v0, v6}, Li0/h0;->p(Z)V

    .line 921
    .line 922
    .line 923
    :goto_19
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v0, v6}, Li0/h0;->p(Z)V

    .line 927
    .line 928
    .line 929
    :goto_1a
    const v2, 0x7d59f512

    .line 930
    .line 931
    .line 932
    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v0, v6}, Li0/h0;->p(Z)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v1}, Li0/h0;->p(Z)V

    .line 939
    .line 940
    .line 941
    goto :goto_1b

    .line 942
    :cond_29
    move-object v3, v2

    .line 943
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 944
    .line 945
    .line 946
    :goto_1b
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 947
    .line 948
    .line 949
    move-result-object v10

    .line 950
    if-eqz v10, :cond_2a

    .line 951
    .line 952
    new-instance v0, Lsh/n;

    .line 953
    .line 954
    move-object/from16 v1, p0

    .line 955
    .line 956
    move-object/from16 v4, p3

    .line 957
    .line 958
    move/from16 v5, p4

    .line 959
    .line 960
    move/from16 v6, p5

    .line 961
    .line 962
    move-object/from16 v7, p6

    .line 963
    .line 964
    move/from16 v9, p9

    .line 965
    .line 966
    move-object v2, v3

    .line 967
    move-object/from16 v3, p2

    .line 968
    .line 969
    invoke-direct/range {v0 .. v9}, Lsh/n;-><init>(Ly0/o;Lfg/q;Lp/x0;Lfg/a;ZZLn/k;Ls0/d;I)V

    .line 970
    .line 971
    .line 972
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 973
    .line 974
    :cond_2a
    return-void
.end method

.method public static final c(Ly0/o;FLs0/d;Li0/h0;I)V
    .locals 8

    .line 1
    sget-object v0, Lsh/g;->a:Lp/z0;

    .line 2
    .line 3
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 4
    .line 5
    invoke-virtual {p3, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lbi/b;

    .line 10
    .line 11
    invoke-virtual {v2}, Lbi/b;->m()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {p3, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lbi/b;

    .line 20
    .line 21
    iget-object v1, v1, Lbi/b;->P:Li0/j1;

    .line 22
    .line 23
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lf1/w;

    .line 28
    .line 29
    iget-wide v5, v1, Lf1/w;->a:J

    .line 30
    .line 31
    invoke-virtual {p3, v2, v3}, Li0/h0;->e(J)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p3, v5, v6}, Li0/h0;->e(J)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    or-int/2addr v1, v7

    .line 40
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    sget-object v1, Li0/l;->a:Li0/e;

    .line 47
    .line 48
    if-ne v7, v1, :cond_1

    .line 49
    .line 50
    :cond_0
    new-instance v7, Lsh/f;

    .line 51
    .line 52
    invoke-direct {v7, v2, v3, v5, v6}, Lsh/f;-><init>(JJ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    move-object v1, v7

    .line 59
    check-cast v1, Lsh/f;

    .line 60
    .line 61
    new-instance v2, Lb0/q;

    .line 62
    .line 63
    const/16 v3, 0xd

    .line 64
    .line 65
    invoke-direct {v2, v0, v3, p2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const v0, 0x65d02cfd

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2, p3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    and-int/lit8 v0, p4, 0xe

    .line 76
    .line 77
    or-int/lit16 v5, v0, 0xd80

    .line 78
    .line 79
    move-object v0, p0

    .line 80
    move v2, p1

    .line 81
    move-object v4, p3

    .line 82
    invoke-static/range {v0 .. v5}, Lsh/s;->a(Ly0/o;Lsh/f;FLs0/d;Li0/h0;I)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public static final d(Lh2/a;Ly0/o;Lsh/i;ZLi0/h0;I)V
    .locals 33

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    sget-object v6, Lh/c;->j:Lh/c;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v8

    .line 10
    const v0, 0x23ef5bfc

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {v5, v0}, Li0/h0;->d(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x2

    .line 29
    :goto_0
    or-int v0, p5, v0

    .line 30
    .line 31
    or-int/lit16 v0, v0, 0x6400

    .line 32
    .line 33
    and-int/lit16 v1, v0, 0x2493

    .line 34
    .line 35
    const/16 v2, 0x2492

    .line 36
    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, v7

    .line 42
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {v5, v2, v1}, Li0/h0;->S(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_5c

    .line 49
    .line 50
    invoke-virtual {v5}, Li0/h0;->X()V

    .line 51
    .line 52
    .line 53
    and-int/lit8 v1, p5, 0x1

    .line 54
    .line 55
    sget-object v12, Li0/l;->a:Li0/e;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v5}, Li0/h0;->B()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 67
    .line 68
    .line 69
    and-int/lit16 v0, v0, -0x1c01

    .line 70
    .line 71
    move-object/from16 v7, p2

    .line 72
    .line 73
    move-object/from16 v30, v8

    .line 74
    .line 75
    move-object v1, v12

    .line 76
    move/from16 v8, p3

    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_3
    :goto_2
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 81
    .line 82
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lbi/b;

    .line 87
    .line 88
    invoke-virtual {v2}, Lbi/b;->e()J

    .line 89
    .line 90
    .line 91
    move-result-wide v14

    .line 92
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lbi/b;

    .line 97
    .line 98
    iget-object v2, v2, Lbi/b;->p:Li0/j1;

    .line 99
    .line 100
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lf1/w;

    .line 105
    .line 106
    iget-wide v2, v2, Lf1/w;->a:J

    .line 107
    .line 108
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Lbi/b;

    .line 113
    .line 114
    invoke-virtual {v4}, Lbi/b;->b()J

    .line 115
    .line 116
    .line 117
    move-result-wide v9

    .line 118
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Lbi/b;

    .line 123
    .line 124
    move-object/from16 v30, v8

    .line 125
    .line 126
    invoke-virtual {v4}, Lbi/b;->b()J

    .line 127
    .line 128
    .line 129
    move-result-wide v7

    .line 130
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, Lbi/b;

    .line 135
    .line 136
    move-object/from16 v31, v12

    .line 137
    .line 138
    invoke-virtual {v4}, Lbi/b;->j()J

    .line 139
    .line 140
    .line 141
    move-result-wide v11

    .line 142
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, Lbi/b;

    .line 147
    .line 148
    iget-object v4, v4, Lbi/b;->p:Li0/j1;

    .line 149
    .line 150
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    check-cast v4, Lf1/w;

    .line 155
    .line 156
    move-wide/from16 v22, v11

    .line 157
    .line 158
    iget-wide v11, v4, Lf1/w;->a:J

    .line 159
    .line 160
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lbi/b;

    .line 165
    .line 166
    iget-object v4, v4, Lbi/b;->i:Li0/j1;

    .line 167
    .line 168
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Lf1/w;

    .line 173
    .line 174
    move-wide/from16 v24, v11

    .line 175
    .line 176
    iget-wide v11, v4, Lf1/w;->a:J

    .line 177
    .line 178
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Lbi/b;

    .line 183
    .line 184
    iget-object v1, v1, Lbi/b;->t:Li0/j1;

    .line 185
    .line 186
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Lf1/w;

    .line 191
    .line 192
    move v4, v0

    .line 193
    iget-wide v0, v1, Lf1/w;->a:J

    .line 194
    .line 195
    invoke-virtual {v5, v14, v15}, Li0/h0;->e(J)Z

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    invoke-virtual {v5, v2, v3}, Li0/h0;->e(J)Z

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    or-int v13, v13, v16

    .line 204
    .line 205
    invoke-virtual {v5, v9, v10}, Li0/h0;->e(J)Z

    .line 206
    .line 207
    .line 208
    move-result v16

    .line 209
    or-int v13, v13, v16

    .line 210
    .line 211
    invoke-virtual {v5, v7, v8}, Li0/h0;->e(J)Z

    .line 212
    .line 213
    .line 214
    move-result v16

    .line 215
    or-int v13, v13, v16

    .line 216
    .line 217
    move-wide/from16 v16, v2

    .line 218
    .line 219
    move-wide/from16 v2, v22

    .line 220
    .line 221
    invoke-virtual {v5, v2, v3}, Li0/h0;->e(J)Z

    .line 222
    .line 223
    .line 224
    move-result v18

    .line 225
    or-int v13, v13, v18

    .line 226
    .line 227
    move-wide/from16 v2, v24

    .line 228
    .line 229
    invoke-virtual {v5, v2, v3}, Li0/h0;->e(J)Z

    .line 230
    .line 231
    .line 232
    move-result v18

    .line 233
    or-int v13, v13, v18

    .line 234
    .line 235
    invoke-virtual {v5, v11, v12}, Li0/h0;->e(J)Z

    .line 236
    .line 237
    .line 238
    move-result v18

    .line 239
    or-int v13, v13, v18

    .line 240
    .line 241
    invoke-virtual {v5, v0, v1}, Li0/h0;->e(J)Z

    .line 242
    .line 243
    .line 244
    move-result v18

    .line 245
    or-int v13, v13, v18

    .line 246
    .line 247
    move-wide/from16 v28, v0

    .line 248
    .line 249
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    move-object/from16 v1, v31

    .line 254
    .line 255
    if-nez v13, :cond_4

    .line 256
    .line 257
    if-ne v0, v1, :cond_5

    .line 258
    .line 259
    :cond_4
    new-instance v13, Lsh/i;

    .line 260
    .line 261
    move-wide/from16 v24, v2

    .line 262
    .line 263
    move-wide/from16 v20, v7

    .line 264
    .line 265
    move-wide/from16 v18, v9

    .line 266
    .line 267
    move-wide/from16 v26, v11

    .line 268
    .line 269
    invoke-direct/range {v13 .. v29}, Lsh/i;-><init>(JJJJJJJJ)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    move-object v0, v13

    .line 276
    :cond_5
    check-cast v0, Lsh/i;

    .line 277
    .line 278
    and-int/lit16 v2, v4, -0x1c01

    .line 279
    .line 280
    move-object v7, v0

    .line 281
    move v0, v2

    .line 282
    const/4 v8, 0x1

    .line 283
    :goto_3
    invoke-virtual {v5}, Li0/h0;->q()V

    .line 284
    .line 285
    .line 286
    const/4 v9, 0x0

    .line 287
    invoke-static {v9, v5}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 288
    .line 289
    .line 290
    sget-object v2, Ly1/h1;->l:Li0/m2;

    .line 291
    .line 292
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Ln1/a;

    .line 297
    .line 298
    invoke-static {v2, v5}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v0, 0xe

    .line 302
    .line 303
    or-int/lit8 v0, v0, 0x30

    .line 304
    .line 305
    const-string v2, "CheckboxTransition"

    .line 306
    .line 307
    move-object/from16 v11, p0

    .line 308
    .line 309
    invoke-static {v11, v2, v5, v0}, Li/d;->r(Ljava/lang/Object;Ljava/lang/String;Li0/h0;I)Li/k1;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iget-object v10, v0, Li/k1;->d:Li0/j1;

    .line 314
    .line 315
    invoke-virtual {v10}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    check-cast v2, Lh2/a;

    .line 320
    .line 321
    const v3, 0x3e2a8384

    .line 322
    .line 323
    .line 324
    invoke-virtual {v5, v3}, Li0/h0;->a0(I)V

    .line 325
    .line 326
    .line 327
    sget-object v12, Lh2/a;->h:Lh2/a;

    .line 328
    .line 329
    if-eq v2, v12, :cond_7

    .line 330
    .line 331
    if-eqz v8, :cond_6

    .line 332
    .line 333
    iget-wide v13, v7, Lsh/i;->e:J

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_6
    iget-wide v13, v7, Lsh/i;->g:J

    .line 337
    .line 338
    :goto_4
    const/4 v2, 0x0

    .line 339
    goto :goto_5

    .line 340
    :cond_7
    if-eqz v8, :cond_8

    .line 341
    .line 342
    iget-wide v13, v7, Lsh/i;->f:J

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_8
    iget-wide v13, v7, Lsh/i;->h:J

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :goto_5
    invoke-virtual {v5, v2}, Li0/h0;->p(Z)V

    .line 349
    .line 350
    .line 351
    invoke-static {v13, v14}, Lf1/w;->f(J)Lg1/c;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v5, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v13

    .line 363
    if-nez v4, :cond_9

    .line 364
    .line 365
    if-ne v13, v1, :cond_a

    .line 366
    .line 367
    :cond_9
    new-instance v4, Lb1/f;

    .line 368
    .line 369
    const/16 v13, 0xc

    .line 370
    .line 371
    invoke-direct {v4, v2, v13}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 372
    .line 373
    .line 374
    new-instance v13, Li/m1;

    .line 375
    .line 376
    invoke-direct {v13, v6, v4}, Li/m1;-><init>(Lfg/l;Lfg/l;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    :cond_a
    move-object v4, v13

    .line 383
    check-cast v4, Li/m1;

    .line 384
    .line 385
    invoke-virtual {v0}, Li/k1;->g()Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    const v13, 0x6359c50d

    .line 390
    .line 391
    .line 392
    const v14, 0x6355e4b0

    .line 393
    .line 394
    .line 395
    if-nez v2, :cond_e

    .line 396
    .line 397
    invoke-virtual {v5, v14}, Li0/h0;->a0(I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v15

    .line 408
    if-nez v2, :cond_c

    .line 409
    .line 410
    if-ne v15, v1, :cond_b

    .line 411
    .line 412
    goto :goto_7

    .line 413
    :cond_b
    :goto_6
    const/4 v14, 0x0

    .line 414
    goto :goto_9

    .line 415
    :cond_c
    :goto_7
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    if-eqz v2, :cond_d

    .line 420
    .line 421
    invoke-virtual {v2}, Lw0/f;->e()Lfg/l;

    .line 422
    .line 423
    .line 424
    move-result-object v15

    .line 425
    goto :goto_8

    .line 426
    :cond_d
    move-object v15, v9

    .line 427
    :goto_8
    invoke-static {v2}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    :try_start_0
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 435
    invoke-static {v2, v9, v15}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    move-object v15, v14

    .line 442
    goto :goto_6

    .line 443
    :goto_9
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 444
    .line 445
    .line 446
    goto :goto_a

    .line 447
    :catchall_0
    move-exception v0

    .line 448
    invoke-static {v2, v9, v15}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_e
    const/4 v14, 0x0

    .line 453
    invoke-virtual {v5, v13}, Li0/h0;->a0(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v15

    .line 463
    :goto_a
    check-cast v15, Lh2/a;

    .line 464
    .line 465
    invoke-virtual {v5, v3}, Li0/h0;->a0(I)V

    .line 466
    .line 467
    .line 468
    if-eq v15, v12, :cond_10

    .line 469
    .line 470
    if-eqz v8, :cond_f

    .line 471
    .line 472
    iget-wide v14, v7, Lsh/i;->e:J

    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_f
    iget-wide v14, v7, Lsh/i;->g:J

    .line 476
    .line 477
    :goto_b
    const/4 v2, 0x0

    .line 478
    goto :goto_c

    .line 479
    :cond_10
    if-eqz v8, :cond_11

    .line 480
    .line 481
    iget-wide v14, v7, Lsh/i;->f:J

    .line 482
    .line 483
    goto :goto_b

    .line 484
    :cond_11
    iget-wide v14, v7, Lsh/i;->h:J

    .line 485
    .line 486
    goto :goto_b

    .line 487
    :goto_c
    invoke-virtual {v5, v2}, Li0/h0;->p(Z)V

    .line 488
    .line 489
    .line 490
    new-instance v2, Lf1/w;

    .line 491
    .line 492
    invoke-direct {v2, v14, v15}, Lf1/w;-><init>(J)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v9

    .line 499
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v14

    .line 503
    if-nez v9, :cond_12

    .line 504
    .line 505
    if-ne v14, v1, :cond_13

    .line 506
    .line 507
    :cond_12
    new-instance v9, Lsh/k;

    .line 508
    .line 509
    const/4 v14, 0x0

    .line 510
    invoke-direct {v9, v0, v14}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 511
    .line 512
    .line 513
    invoke-static {v9}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 514
    .line 515
    .line 516
    move-result-object v14

    .line 517
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    :cond_13
    check-cast v14, Li0/l2;

    .line 521
    .line 522
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v9

    .line 526
    check-cast v9, Lh2/a;

    .line 527
    .line 528
    invoke-virtual {v5, v3}, Li0/h0;->a0(I)V

    .line 529
    .line 530
    .line 531
    if-eq v9, v12, :cond_15

    .line 532
    .line 533
    if-eqz v8, :cond_14

    .line 534
    .line 535
    iget-wide v14, v7, Lsh/i;->e:J

    .line 536
    .line 537
    goto :goto_d

    .line 538
    :cond_14
    iget-wide v14, v7, Lsh/i;->g:J

    .line 539
    .line 540
    :goto_d
    const/4 v3, 0x0

    .line 541
    goto :goto_e

    .line 542
    :cond_15
    if-eqz v8, :cond_16

    .line 543
    .line 544
    iget-wide v14, v7, Lsh/i;->f:J

    .line 545
    .line 546
    goto :goto_d

    .line 547
    :cond_16
    iget-wide v14, v7, Lsh/i;->h:J

    .line 548
    .line 549
    goto :goto_d

    .line 550
    :goto_e
    invoke-virtual {v5, v3}, Li0/h0;->p(Z)V

    .line 551
    .line 552
    .line 553
    move-object v3, v2

    .line 554
    new-instance v2, Lf1/w;

    .line 555
    .line 556
    invoke-direct {v2, v14, v15}, Lf1/w;-><init>(J)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v9

    .line 563
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v14

    .line 567
    if-nez v9, :cond_17

    .line 568
    .line 569
    if-ne v14, v1, :cond_18

    .line 570
    .line 571
    :cond_17
    new-instance v9, Lsh/k;

    .line 572
    .line 573
    const/4 v14, 0x1

    .line 574
    invoke-direct {v9, v0, v14}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 575
    .line 576
    .line 577
    invoke-static {v9}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 578
    .line 579
    .line 580
    move-result-object v14

    .line 581
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_18
    check-cast v14, Li0/l2;

    .line 585
    .line 586
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v9

    .line 590
    check-cast v9, Li/e1;

    .line 591
    .line 592
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    const v9, -0x7f9c8c43

    .line 596
    .line 597
    .line 598
    invoke-virtual {v5, v9}, Li0/h0;->a0(I)V

    .line 599
    .line 600
    .line 601
    sget-object v9, Li/x;->a:Li/s;

    .line 602
    .line 603
    const/16 v14, 0x12c

    .line 604
    .line 605
    move-object/from16 v31, v1

    .line 606
    .line 607
    move-object v1, v3

    .line 608
    const/4 v15, 0x2

    .line 609
    invoke-static {v14, v15, v9}, Li/d;->p(IILi/v;)Li/l1;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    const/4 v15, 0x0

    .line 614
    invoke-virtual {v5, v15}, Li0/h0;->p(Z)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v15, v31

    .line 618
    .line 619
    invoke-static/range {v0 .. v5}, Li/d;->l(Li/k1;Ljava/lang/Object;Ljava/lang/Object;Li/y;Li/m1;Li0/h0;)Li/g1;

    .line 620
    .line 621
    .line 622
    move-result-object v17

    .line 623
    invoke-virtual {v10}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    check-cast v1, Lh2/a;

    .line 628
    .line 629
    const v2, 0x4cc4edcf    # 1.0324748E8f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 633
    .line 634
    .line 635
    if-eq v1, v12, :cond_1a

    .line 636
    .line 637
    if-eqz v8, :cond_19

    .line 638
    .line 639
    iget-wide v3, v7, Lsh/i;->a:J

    .line 640
    .line 641
    goto :goto_f

    .line 642
    :cond_19
    iget-wide v3, v7, Lsh/i;->c:J

    .line 643
    .line 644
    :goto_f
    const/4 v1, 0x0

    .line 645
    goto :goto_10

    .line 646
    :cond_1a
    if-eqz v8, :cond_1b

    .line 647
    .line 648
    iget-wide v3, v7, Lsh/i;->b:J

    .line 649
    .line 650
    goto :goto_f

    .line 651
    :cond_1b
    iget-wide v3, v7, Lsh/i;->d:J

    .line 652
    .line 653
    goto :goto_f

    .line 654
    :goto_10
    invoke-virtual {v5, v1}, Li0/h0;->p(Z)V

    .line 655
    .line 656
    .line 657
    invoke-static {v3, v4}, Lf1/w;->f(J)Lg1/c;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-virtual {v5, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    if-nez v3, :cond_1c

    .line 670
    .line 671
    if-ne v4, v15, :cond_1d

    .line 672
    .line 673
    :cond_1c
    new-instance v3, Lb1/f;

    .line 674
    .line 675
    const/16 v4, 0xc

    .line 676
    .line 677
    invoke-direct {v3, v1, v4}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 678
    .line 679
    .line 680
    new-instance v4, Li/m1;

    .line 681
    .line 682
    invoke-direct {v4, v6, v3}, Li/m1;-><init>(Lfg/l;Lfg/l;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    :cond_1d
    check-cast v4, Li/m1;

    .line 689
    .line 690
    invoke-virtual {v0}, Li/k1;->g()Z

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-nez v1, :cond_21

    .line 695
    .line 696
    const v1, 0x6355e4b0

    .line 697
    .line 698
    .line 699
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    if-nez v1, :cond_1f

    .line 711
    .line 712
    if-ne v3, v15, :cond_1e

    .line 713
    .line 714
    goto :goto_12

    .line 715
    :cond_1e
    :goto_11
    const/4 v10, 0x0

    .line 716
    goto :goto_14

    .line 717
    :cond_1f
    :goto_12
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    if-eqz v1, :cond_20

    .line 722
    .line 723
    invoke-virtual {v1}, Lw0/f;->e()Lfg/l;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    goto :goto_13

    .line 728
    :cond_20
    const/4 v3, 0x0

    .line 729
    :goto_13
    invoke-static {v1}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    :try_start_1
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 737
    invoke-static {v1, v6, v3}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v5, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    move-object v3, v10

    .line 744
    goto :goto_11

    .line 745
    :goto_14
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 746
    .line 747
    .line 748
    goto :goto_15

    .line 749
    :catchall_1
    move-exception v0

    .line 750
    invoke-static {v1, v6, v3}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 751
    .line 752
    .line 753
    throw v0

    .line 754
    :cond_21
    const/4 v10, 0x0

    .line 755
    invoke-virtual {v5, v13}, Li0/h0;->a0(I)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    :goto_15
    check-cast v3, Lh2/a;

    .line 766
    .line 767
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 768
    .line 769
    .line 770
    if-eq v3, v12, :cond_23

    .line 771
    .line 772
    if-eqz v8, :cond_22

    .line 773
    .line 774
    iget-wide v13, v7, Lsh/i;->a:J

    .line 775
    .line 776
    goto :goto_16

    .line 777
    :cond_22
    iget-wide v13, v7, Lsh/i;->c:J

    .line 778
    .line 779
    :goto_16
    const/4 v10, 0x0

    .line 780
    goto :goto_17

    .line 781
    :cond_23
    if-eqz v8, :cond_24

    .line 782
    .line 783
    iget-wide v13, v7, Lsh/i;->b:J

    .line 784
    .line 785
    goto :goto_16

    .line 786
    :cond_24
    iget-wide v13, v7, Lsh/i;->d:J

    .line 787
    .line 788
    goto :goto_16

    .line 789
    :goto_17
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 790
    .line 791
    .line 792
    const/16 v3, 0x12c

    .line 793
    .line 794
    new-instance v1, Lf1/w;

    .line 795
    .line 796
    invoke-direct {v1, v13, v14}, Lf1/w;-><init>(J)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v10

    .line 803
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v13

    .line 807
    if-nez v10, :cond_25

    .line 808
    .line 809
    if-ne v13, v15, :cond_26

    .line 810
    .line 811
    :cond_25
    new-instance v10, Lsh/k;

    .line 812
    .line 813
    const/4 v13, 0x2

    .line 814
    invoke-direct {v10, v0, v13}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 815
    .line 816
    .line 817
    invoke-static {v10}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 818
    .line 819
    .line 820
    move-result-object v13

    .line 821
    invoke-virtual {v5, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    :cond_26
    check-cast v13, Li0/l2;

    .line 825
    .line 826
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v10

    .line 830
    check-cast v10, Lh2/a;

    .line 831
    .line 832
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 833
    .line 834
    .line 835
    if-eq v10, v12, :cond_28

    .line 836
    .line 837
    if-eqz v8, :cond_27

    .line 838
    .line 839
    iget-wide v13, v7, Lsh/i;->a:J

    .line 840
    .line 841
    goto :goto_18

    .line 842
    :cond_27
    iget-wide v13, v7, Lsh/i;->c:J

    .line 843
    .line 844
    :goto_18
    const/4 v10, 0x0

    .line 845
    goto :goto_19

    .line 846
    :cond_28
    if-eqz v8, :cond_29

    .line 847
    .line 848
    iget-wide v13, v7, Lsh/i;->b:J

    .line 849
    .line 850
    goto :goto_18

    .line 851
    :cond_29
    iget-wide v13, v7, Lsh/i;->d:J

    .line 852
    .line 853
    goto :goto_18

    .line 854
    :goto_19
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 855
    .line 856
    .line 857
    new-instance v2, Lf1/w;

    .line 858
    .line 859
    invoke-direct {v2, v13, v14}, Lf1/w;-><init>(J)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v10

    .line 866
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v13

    .line 870
    if-nez v10, :cond_2a

    .line 871
    .line 872
    if-ne v13, v15, :cond_2b

    .line 873
    .line 874
    :cond_2a
    new-instance v10, Lsh/k;

    .line 875
    .line 876
    const/4 v13, 0x3

    .line 877
    invoke-direct {v10, v0, v13}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 878
    .line 879
    .line 880
    invoke-static {v10}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 881
    .line 882
    .line 883
    move-result-object v13

    .line 884
    invoke-virtual {v5, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    :cond_2b
    check-cast v13, Li0/l2;

    .line 888
    .line 889
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v10

    .line 893
    check-cast v10, Li/e1;

    .line 894
    .line 895
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    const v10, -0x710221f8

    .line 899
    .line 900
    .line 901
    invoke-virtual {v5, v10}, Li0/h0;->a0(I)V

    .line 902
    .line 903
    .line 904
    const/4 v10, 0x2

    .line 905
    invoke-static {v3, v10, v9}, Li/d;->p(IILi/v;)Li/l1;

    .line 906
    .line 907
    .line 908
    move-result-object v3

    .line 909
    const/4 v10, 0x0

    .line 910
    invoke-virtual {v5, v10}, Li0/h0;->p(Z)V

    .line 911
    .line 912
    .line 913
    move-object/from16 v10, v17

    .line 914
    .line 915
    invoke-static/range {v0 .. v5}, Li/d;->l(Li/k1;Ljava/lang/Object;Ljava/lang/Object;Li/y;Li/m1;Li0/h0;)Li/g1;

    .line 916
    .line 917
    .line 918
    move-result-object v13

    .line 919
    sget-object v4, Li/d;->j:Li/m1;

    .line 920
    .line 921
    invoke-virtual {v0}, Li/k1;->g()Z

    .line 922
    .line 923
    .line 924
    move-result v1

    .line 925
    if-nez v1, :cond_2f

    .line 926
    .line 927
    const v1, 0x6355e4b0

    .line 928
    .line 929
    .line 930
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    if-nez v1, :cond_2d

    .line 942
    .line 943
    if-ne v2, v15, :cond_2c

    .line 944
    .line 945
    goto :goto_1b

    .line 946
    :cond_2c
    :goto_1a
    const/4 v14, 0x0

    .line 947
    goto :goto_1d

    .line 948
    :cond_2d
    :goto_1b
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    if-eqz v1, :cond_2e

    .line 953
    .line 954
    invoke-virtual {v1}, Lw0/f;->e()Lfg/l;

    .line 955
    .line 956
    .line 957
    move-result-object v2

    .line 958
    goto :goto_1c

    .line 959
    :cond_2e
    const/4 v2, 0x0

    .line 960
    :goto_1c
    invoke-static {v1}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 961
    .line 962
    .line 963
    move-result-object v3

    .line 964
    :try_start_2
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 968
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    move-object v2, v14

    .line 975
    goto :goto_1a

    .line 976
    :goto_1d
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 977
    .line 978
    .line 979
    goto :goto_1e

    .line 980
    :catchall_2
    move-exception v0

    .line 981
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 982
    .line 983
    .line 984
    throw v0

    .line 985
    :cond_2f
    const v6, 0x6359c50d

    .line 986
    .line 987
    .line 988
    const/4 v14, 0x0

    .line 989
    invoke-virtual {v5, v6}, Li0/h0;->a0(I)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    :goto_1e
    check-cast v2, Lh2/a;

    .line 1000
    .line 1001
    const v1, -0x4e326a57

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 1005
    .line 1006
    .line 1007
    const/16 v16, 0x0

    .line 1008
    .line 1009
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1010
    .line 1011
    if-eq v2, v12, :cond_30

    .line 1012
    .line 1013
    move/from16 v2, v17

    .line 1014
    .line 1015
    goto :goto_1f

    .line 1016
    :cond_30
    move/from16 v2, v16

    .line 1017
    .line 1018
    :goto_1f
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 1019
    .line 1020
    .line 1021
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v3

    .line 1029
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v14

    .line 1033
    if-nez v3, :cond_31

    .line 1034
    .line 1035
    if-ne v14, v15, :cond_32

    .line 1036
    .line 1037
    :cond_31
    new-instance v3, Lsh/k;

    .line 1038
    .line 1039
    const/4 v14, 0x4

    .line 1040
    invoke-direct {v3, v0, v14}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1041
    .line 1042
    .line 1043
    invoke-static {v3}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v14

    .line 1047
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1048
    .line 1049
    .line 1050
    :cond_32
    check-cast v14, Li0/l2;

    .line 1051
    .line 1052
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v3

    .line 1056
    check-cast v3, Lh2/a;

    .line 1057
    .line 1058
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 1059
    .line 1060
    .line 1061
    if-eq v3, v12, :cond_33

    .line 1062
    .line 1063
    move/from16 v1, v17

    .line 1064
    .line 1065
    :goto_20
    const/4 v14, 0x0

    .line 1066
    goto :goto_21

    .line 1067
    :cond_33
    move/from16 v1, v16

    .line 1068
    .line 1069
    goto :goto_20

    .line 1070
    :goto_21
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v3

    .line 1081
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v14

    .line 1085
    if-nez v3, :cond_34

    .line 1086
    .line 1087
    if-ne v14, v15, :cond_35

    .line 1088
    .line 1089
    :cond_34
    new-instance v3, Lsh/k;

    .line 1090
    .line 1091
    const/4 v14, 0x5

    .line 1092
    invoke-direct {v3, v0, v14}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v3}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v14

    .line 1099
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1100
    .line 1101
    .line 1102
    :cond_35
    check-cast v14, Li0/l2;

    .line 1103
    .line 1104
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v3

    .line 1108
    check-cast v3, Li/e1;

    .line 1109
    .line 1110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    const v14, 0xe651ca9

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v5, v14}, Li0/h0;->a0(I)V

    .line 1117
    .line 1118
    .line 1119
    invoke-interface {v3}, Li/e1;->c()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v3

    .line 1123
    const/16 v14, 0x96

    .line 1124
    .line 1125
    if-eq v3, v12, :cond_36

    .line 1126
    .line 1127
    const/16 v3, 0xa

    .line 1128
    .line 1129
    const/4 v6, 0x2

    .line 1130
    invoke-static {v3, v6, v9}, Li/d;->p(IILi/v;)Li/l1;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v3

    .line 1134
    :goto_22
    const/4 v6, 0x0

    .line 1135
    goto :goto_23

    .line 1136
    :cond_36
    const/4 v6, 0x2

    .line 1137
    invoke-static {v14, v6, v9}, Li/d;->p(IILi/v;)Li/l1;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    goto :goto_22

    .line 1142
    :goto_23
    invoke-virtual {v5, v6}, Li0/h0;->p(Z)V

    .line 1143
    .line 1144
    .line 1145
    move-object/from16 v32, v2

    .line 1146
    .line 1147
    move-object v2, v1

    .line 1148
    move-object/from16 v1, v32

    .line 1149
    .line 1150
    invoke-static/range {v0 .. v5}, Li/d;->l(Li/k1;Ljava/lang/Object;Ljava/lang/Object;Li/y;Li/m1;Li0/h0;)Li/g1;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v19

    .line 1154
    new-instance v1, Ll/b;

    .line 1155
    .line 1156
    const/4 v2, 0x1

    .line 1157
    invoke-direct {v1, v2}, Ll/b;-><init>(I)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0}, Li/k1;->g()Z

    .line 1161
    .line 1162
    .line 1163
    move-result v2

    .line 1164
    if-nez v2, :cond_3a

    .line 1165
    .line 1166
    const v2, 0x6355e4b0

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v2

    .line 1176
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v3

    .line 1180
    if-nez v2, :cond_38

    .line 1181
    .line 1182
    if-ne v3, v15, :cond_37

    .line 1183
    .line 1184
    goto :goto_25

    .line 1185
    :cond_37
    :goto_24
    const/4 v14, 0x0

    .line 1186
    goto :goto_27

    .line 1187
    :cond_38
    :goto_25
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    if-eqz v2, :cond_39

    .line 1192
    .line 1193
    invoke-virtual {v2}, Lw0/f;->e()Lfg/l;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v3

    .line 1197
    goto :goto_26

    .line 1198
    :cond_39
    const/4 v3, 0x0

    .line 1199
    :goto_26
    invoke-static {v2}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v6

    .line 1203
    :try_start_3
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1207
    invoke-static {v2, v6, v3}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1211
    .line 1212
    .line 1213
    move-object v3, v14

    .line 1214
    goto :goto_24

    .line 1215
    :goto_27
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 1216
    .line 1217
    .line 1218
    goto :goto_28

    .line 1219
    :catchall_3
    move-exception v0

    .line 1220
    invoke-static {v2, v6, v3}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 1221
    .line 1222
    .line 1223
    throw v0

    .line 1224
    :cond_3a
    const v6, 0x6359c50d

    .line 1225
    .line 1226
    .line 1227
    const/4 v14, 0x0

    .line 1228
    invoke-virtual {v5, v6}, Li0/h0;->a0(I)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    :goto_28
    check-cast v3, Lh2/a;

    .line 1239
    .line 1240
    const v2, -0x1e12a11

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 1244
    .line 1245
    .line 1246
    const v18, 0x3e3e76c9    # 0.186f

    .line 1247
    .line 1248
    .line 1249
    const v21, 0x3dcccccd    # 0.1f

    .line 1250
    .line 1251
    .line 1252
    if-eq v3, v12, :cond_3b

    .line 1253
    .line 1254
    move/from16 v3, v18

    .line 1255
    .line 1256
    goto :goto_29

    .line 1257
    :cond_3b
    move/from16 v3, v21

    .line 1258
    .line 1259
    :goto_29
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 1260
    .line 1261
    .line 1262
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v3

    .line 1266
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v14

    .line 1270
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v6

    .line 1274
    if-nez v14, :cond_3c

    .line 1275
    .line 1276
    if-ne v6, v15, :cond_3d

    .line 1277
    .line 1278
    :cond_3c
    new-instance v6, Lsh/k;

    .line 1279
    .line 1280
    const/4 v14, 0x6

    .line 1281
    invoke-direct {v6, v0, v14}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1282
    .line 1283
    .line 1284
    invoke-static {v6}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v6

    .line 1288
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1289
    .line 1290
    .line 1291
    :cond_3d
    check-cast v6, Li0/l2;

    .line 1292
    .line 1293
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v6

    .line 1297
    check-cast v6, Lh2/a;

    .line 1298
    .line 1299
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 1300
    .line 1301
    .line 1302
    if-eq v6, v12, :cond_3e

    .line 1303
    .line 1304
    :goto_2a
    const/4 v14, 0x0

    .line 1305
    goto :goto_2b

    .line 1306
    :cond_3e
    move/from16 v18, v21

    .line 1307
    .line 1308
    goto :goto_2a

    .line 1309
    :goto_2b
    invoke-virtual {v5, v14}, Li0/h0;->p(Z)V

    .line 1310
    .line 1311
    .line 1312
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v6

    .line 1320
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v14

    .line 1324
    if-nez v6, :cond_3f

    .line 1325
    .line 1326
    if-ne v14, v15, :cond_40

    .line 1327
    .line 1328
    :cond_3f
    new-instance v6, Lsh/k;

    .line 1329
    .line 1330
    const/4 v14, 0x7

    .line 1331
    invoke-direct {v6, v0, v14}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1332
    .line 1333
    .line 1334
    invoke-static {v6}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v14

    .line 1338
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    :cond_40
    check-cast v14, Li0/l2;

    .line 1342
    .line 1343
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v6

    .line 1347
    move-object/from16 v14, v30

    .line 1348
    .line 1349
    invoke-virtual {v1, v6, v5, v14}, Ll/b;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    check-cast v1, Li/y;

    .line 1354
    .line 1355
    move-object/from16 v32, v3

    .line 1356
    .line 1357
    move-object v3, v1

    .line 1358
    move-object/from16 v1, v32

    .line 1359
    .line 1360
    invoke-static/range {v0 .. v5}, Li/d;->l(Li/k1;Ljava/lang/Object;Ljava/lang/Object;Li/y;Li/m1;Li0/h0;)Li/g1;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    new-instance v2, Ll/b;

    .line 1365
    .line 1366
    const/4 v3, 0x2

    .line 1367
    invoke-direct {v2, v3}, Ll/b;-><init>(I)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v0}, Li/k1;->g()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v3

    .line 1374
    if-nez v3, :cond_44

    .line 1375
    .line 1376
    const v3, 0x6355e4b0

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v5, v3}, Li0/h0;->a0(I)V

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v3

    .line 1386
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v6

    .line 1390
    if-nez v3, :cond_42

    .line 1391
    .line 1392
    if-ne v6, v15, :cond_41

    .line 1393
    .line 1394
    goto :goto_2d

    .line 1395
    :cond_41
    move-object/from16 v18, v1

    .line 1396
    .line 1397
    move-object/from16 v23, v4

    .line 1398
    .line 1399
    :goto_2c
    const/4 v4, 0x0

    .line 1400
    goto :goto_30

    .line 1401
    :cond_42
    :goto_2d
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v3

    .line 1405
    if-eqz v3, :cond_43

    .line 1406
    .line 1407
    invoke-virtual {v3}, Lw0/f;->e()Lfg/l;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v6

    .line 1411
    :goto_2e
    move-object/from16 v18, v1

    .line 1412
    .line 1413
    goto :goto_2f

    .line 1414
    :cond_43
    const/4 v6, 0x0

    .line 1415
    goto :goto_2e

    .line 1416
    :goto_2f
    invoke-static {v3}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    move-object/from16 v23, v4

    .line 1421
    .line 1422
    :try_start_4
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1426
    invoke-static {v3, v1, v6}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1430
    .line 1431
    .line 1432
    move-object v6, v4

    .line 1433
    goto :goto_2c

    .line 1434
    :goto_30
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1435
    .line 1436
    .line 1437
    move-object v1, v6

    .line 1438
    goto :goto_31

    .line 1439
    :catchall_4
    move-exception v0

    .line 1440
    invoke-static {v3, v1, v6}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 1441
    .line 1442
    .line 1443
    throw v0

    .line 1444
    :cond_44
    move-object/from16 v18, v1

    .line 1445
    .line 1446
    move-object/from16 v23, v4

    .line 1447
    .line 1448
    const/4 v4, 0x0

    .line 1449
    const v6, 0x6359c50d

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v5, v6}, Li0/h0;->a0(I)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v1

    .line 1462
    :goto_31
    check-cast v1, Lh2/a;

    .line 1463
    .line 1464
    const v3, 0x4ecaf3e8

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v5, v3}, Li0/h0;->a0(I)V

    .line 1468
    .line 1469
    .line 1470
    const v22, 0x3f4d9168    # 0.803f

    .line 1471
    .line 1472
    .line 1473
    if-eq v1, v12, :cond_45

    .line 1474
    .line 1475
    move/from16 v1, v22

    .line 1476
    .line 1477
    goto :goto_32

    .line 1478
    :cond_45
    move/from16 v1, v21

    .line 1479
    .line 1480
    :goto_32
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1481
    .line 1482
    .line 1483
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v1

    .line 1487
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v4

    .line 1491
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v6

    .line 1495
    if-nez v4, :cond_46

    .line 1496
    .line 1497
    if-ne v6, v15, :cond_47

    .line 1498
    .line 1499
    :cond_46
    new-instance v4, Lsh/k;

    .line 1500
    .line 1501
    const/16 v6, 0x8

    .line 1502
    .line 1503
    invoke-direct {v4, v0, v6}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1504
    .line 1505
    .line 1506
    invoke-static {v4}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v6

    .line 1510
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1511
    .line 1512
    .line 1513
    :cond_47
    check-cast v6, Li0/l2;

    .line 1514
    .line 1515
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v4

    .line 1519
    check-cast v4, Lh2/a;

    .line 1520
    .line 1521
    invoke-virtual {v5, v3}, Li0/h0;->a0(I)V

    .line 1522
    .line 1523
    .line 1524
    if-eq v4, v12, :cond_48

    .line 1525
    .line 1526
    move/from16 v21, v22

    .line 1527
    .line 1528
    :cond_48
    const/4 v3, 0x0

    .line 1529
    invoke-virtual {v5, v3}, Li0/h0;->p(Z)V

    .line 1530
    .line 1531
    .line 1532
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v3

    .line 1536
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1537
    .line 1538
    .line 1539
    move-result v4

    .line 1540
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v6

    .line 1544
    if-nez v4, :cond_49

    .line 1545
    .line 1546
    if-ne v6, v15, :cond_4a

    .line 1547
    .line 1548
    :cond_49
    new-instance v4, Lsh/k;

    .line 1549
    .line 1550
    const/16 v6, 0x9

    .line 1551
    .line 1552
    invoke-direct {v4, v0, v6}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1553
    .line 1554
    .line 1555
    invoke-static {v4}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v6

    .line 1559
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1560
    .line 1561
    .line 1562
    :cond_4a
    check-cast v6, Li0/l2;

    .line 1563
    .line 1564
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v4

    .line 1568
    invoke-virtual {v2, v4, v5, v14}, Ll/b;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v2

    .line 1572
    check-cast v2, Li/y;

    .line 1573
    .line 1574
    move-object v4, v3

    .line 1575
    move-object v3, v2

    .line 1576
    move-object v2, v4

    .line 1577
    move-object/from16 v12, v18

    .line 1578
    .line 1579
    move-object/from16 v6, v19

    .line 1580
    .line 1581
    move-object/from16 v4, v23

    .line 1582
    .line 1583
    invoke-static/range {v0 .. v5}, Li/d;->l(Li/k1;Ljava/lang/Object;Ljava/lang/Object;Li/y;Li/m1;Li0/h0;)Li/g1;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v14

    .line 1587
    invoke-virtual {v0}, Li/k1;->g()Z

    .line 1588
    .line 1589
    .line 1590
    move-result v1

    .line 1591
    if-nez v1, :cond_4e

    .line 1592
    .line 1593
    const v1, 0x6355e4b0

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1600
    .line 1601
    .line 1602
    move-result v1

    .line 1603
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v2

    .line 1607
    if-nez v1, :cond_4c

    .line 1608
    .line 1609
    if-ne v2, v15, :cond_4b

    .line 1610
    .line 1611
    goto :goto_34

    .line 1612
    :cond_4b
    move-object/from16 v23, v4

    .line 1613
    .line 1614
    :goto_33
    const/4 v4, 0x0

    .line 1615
    goto :goto_36

    .line 1616
    :cond_4c
    :goto_34
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v1

    .line 1620
    if-eqz v1, :cond_4d

    .line 1621
    .line 1622
    invoke-virtual {v1}, Lw0/f;->e()Lfg/l;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v2

    .line 1626
    goto :goto_35

    .line 1627
    :cond_4d
    const/4 v2, 0x0

    .line 1628
    :goto_35
    invoke-static {v1}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v3

    .line 1632
    move-object/from16 v23, v4

    .line 1633
    .line 1634
    :try_start_5
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1638
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1642
    .line 1643
    .line 1644
    move-object v2, v4

    .line 1645
    goto :goto_33

    .line 1646
    :goto_36
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1647
    .line 1648
    .line 1649
    goto :goto_37

    .line 1650
    :catchall_5
    move-exception v0

    .line 1651
    invoke-static {v1, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 1652
    .line 1653
    .line 1654
    throw v0

    .line 1655
    :cond_4e
    move-object/from16 v23, v4

    .line 1656
    .line 1657
    const v1, 0x6359c50d

    .line 1658
    .line 1659
    .line 1660
    const/4 v4, 0x0

    .line 1661
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v2

    .line 1671
    :goto_37
    check-cast v2, Lh2/a;

    .line 1672
    .line 1673
    const v1, 0x7e66988

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 1677
    .line 1678
    .line 1679
    sget-object v3, Lh2/a;->i:Lh2/a;

    .line 1680
    .line 1681
    if-ne v2, v3, :cond_4f

    .line 1682
    .line 1683
    move/from16 v2, v17

    .line 1684
    .line 1685
    goto :goto_38

    .line 1686
    :cond_4f
    move/from16 v2, v16

    .line 1687
    .line 1688
    :goto_38
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1689
    .line 1690
    .line 1691
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v2

    .line 1695
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1696
    .line 1697
    .line 1698
    move-result v4

    .line 1699
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v1

    .line 1703
    if-nez v4, :cond_50

    .line 1704
    .line 1705
    if-ne v1, v15, :cond_51

    .line 1706
    .line 1707
    :cond_50
    new-instance v1, Lsh/k;

    .line 1708
    .line 1709
    const/16 v4, 0xa

    .line 1710
    .line 1711
    invoke-direct {v1, v0, v4}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1712
    .line 1713
    .line 1714
    invoke-static {v1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v1

    .line 1718
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1719
    .line 1720
    .line 1721
    :cond_51
    check-cast v1, Li0/l2;

    .line 1722
    .line 1723
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v1

    .line 1727
    check-cast v1, Lh2/a;

    .line 1728
    .line 1729
    const v4, 0x7e66988

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 1733
    .line 1734
    .line 1735
    if-ne v1, v3, :cond_52

    .line 1736
    .line 1737
    move/from16 v16, v17

    .line 1738
    .line 1739
    :cond_52
    const/4 v4, 0x0

    .line 1740
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1741
    .line 1742
    .line 1743
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1748
    .line 1749
    .line 1750
    move-result v4

    .line 1751
    move-object/from16 p3, v1

    .line 1752
    .line 1753
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v1

    .line 1757
    if-nez v4, :cond_53

    .line 1758
    .line 1759
    if-ne v1, v15, :cond_54

    .line 1760
    .line 1761
    :cond_53
    new-instance v1, Lsh/k;

    .line 1762
    .line 1763
    const/16 v4, 0xb

    .line 1764
    .line 1765
    invoke-direct {v1, v0, v4}, Lsh/k;-><init>(Ljava/lang/Object;I)V

    .line 1766
    .line 1767
    .line 1768
    invoke-static {v1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v1

    .line 1772
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1773
    .line 1774
    .line 1775
    :cond_54
    check-cast v1, Li0/l2;

    .line 1776
    .line 1777
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v1

    .line 1781
    check-cast v1, Li/e1;

    .line 1782
    .line 1783
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1784
    .line 1785
    .line 1786
    const v4, 0x526b7088

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 1790
    .line 1791
    .line 1792
    invoke-interface {v1}, Li/e1;->c()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    if-ne v1, v3, :cond_55

    .line 1797
    .line 1798
    const/16 v1, 0xc8

    .line 1799
    .line 1800
    const/4 v3, 0x2

    .line 1801
    invoke-static {v1, v3, v9}, Li/d;->p(IILi/v;)Li/l1;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v1

    .line 1805
    :goto_39
    move-object v3, v1

    .line 1806
    const/4 v4, 0x0

    .line 1807
    goto :goto_3a

    .line 1808
    :cond_55
    const/16 v1, 0x96

    .line 1809
    .line 1810
    const/4 v3, 0x2

    .line 1811
    invoke-static {v1, v3, v9}, Li/d;->p(IILi/v;)Li/l1;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v1

    .line 1815
    goto :goto_39

    .line 1816
    :goto_3a
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1817
    .line 1818
    .line 1819
    move-object v1, v2

    .line 1820
    move-object/from16 v4, v23

    .line 1821
    .line 1822
    move-object/from16 v2, p3

    .line 1823
    .line 1824
    invoke-static/range {v0 .. v5}, Li/d;->l(Li/k1;Ljava/lang/Object;Ljava/lang/Object;Li/y;Li/m1;Li0/h0;)Li/g1;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v0

    .line 1828
    invoke-static {v5}, Lbi/k;->a(Li0/h0;)Lf1/r0;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v1

    .line 1832
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v2

    .line 1836
    if-ne v2, v15, :cond_56

    .line 1837
    .line 1838
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v2

    .line 1842
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    :cond_56
    check-cast v2, Lf1/j;

    .line 1846
    .line 1847
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v3

    .line 1851
    if-ne v3, v15, :cond_57

    .line 1852
    .line 1853
    new-instance v3, Lci/o0;

    .line 1854
    .line 1855
    const v4, 0x3f7d70a4    # 0.99f

    .line 1856
    .line 1857
    .line 1858
    const v9, 0x4476bd71

    .line 1859
    .line 1860
    .line 1861
    move-object/from16 v25, v7

    .line 1862
    .line 1863
    const/4 v7, 0x0

    .line 1864
    const/4 v11, 0x4

    .line 1865
    invoke-static {v4, v9, v7, v11}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v4

    .line 1869
    invoke-direct {v3, v4}, Lci/o0;-><init>(Li/r0;)V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1873
    .line 1874
    .line 1875
    goto :goto_3b

    .line 1876
    :cond_57
    move-object/from16 v25, v7

    .line 1877
    .line 1878
    :goto_3b
    check-cast v3, Lci/o0;

    .line 1879
    .line 1880
    const v4, -0x34436032

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 1884
    .line 1885
    .line 1886
    const/4 v4, 0x0

    .line 1887
    invoke-virtual {v5, v4}, Li0/h0;->p(Z)V

    .line 1888
    .line 1889
    .line 1890
    invoke-static/range {p1 .. p1}, Lp/h1;->p(Ly0/o;)Ly0/o;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v4

    .line 1894
    const/16 v7, 0x1a

    .line 1895
    .line 1896
    int-to-float v7, v7

    .line 1897
    invoke-static {v4, v7}, Lp/h1;->h(Ly0/o;F)Ly0/o;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v4

    .line 1901
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v7

    .line 1905
    if-ne v7, v15, :cond_58

    .line 1906
    .line 1907
    new-instance v7, Ln/k;

    .line 1908
    .line 1909
    invoke-direct {v7}, Ln/k;-><init>()V

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1913
    .line 1914
    .line 1915
    :cond_58
    check-cast v7, Ln/k;

    .line 1916
    .line 1917
    invoke-static {v4, v7, v3, v8}, Lci/k0;->c(Ly0/o;Ln/k;Lci/o0;Z)Ly0/o;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v3

    .line 1921
    invoke-static {v3, v1}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v1

    .line 1925
    invoke-virtual {v5, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1926
    .line 1927
    .line 1928
    move-result v3

    .line 1929
    invoke-virtual {v5, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1930
    .line 1931
    .line 1932
    move-result v4

    .line 1933
    or-int/2addr v3, v4

    .line 1934
    invoke-virtual {v5, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1935
    .line 1936
    .line 1937
    move-result v4

    .line 1938
    or-int/2addr v3, v4

    .line 1939
    invoke-virtual {v5, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v4

    .line 1943
    or-int/2addr v3, v4

    .line 1944
    invoke-virtual {v5, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1945
    .line 1946
    .line 1947
    move-result v4

    .line 1948
    or-int/2addr v3, v4

    .line 1949
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1950
    .line 1951
    .line 1952
    move-result v4

    .line 1953
    or-int/2addr v3, v4

    .line 1954
    invoke-virtual {v5, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1955
    .line 1956
    .line 1957
    move-result v4

    .line 1958
    or-int/2addr v3, v4

    .line 1959
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v4

    .line 1963
    if-nez v3, :cond_59

    .line 1964
    .line 1965
    if-ne v4, v15, :cond_5a

    .line 1966
    .line 1967
    :cond_59
    new-instance v16, Leb/m;

    .line 1968
    .line 1969
    const/16 v24, 0x2

    .line 1970
    .line 1971
    move-object/from16 v22, v0

    .line 1972
    .line 1973
    move-object/from16 v23, v2

    .line 1974
    .line 1975
    move-object/from16 v19, v6

    .line 1976
    .line 1977
    move-object/from16 v17, v10

    .line 1978
    .line 1979
    move-object/from16 v20, v12

    .line 1980
    .line 1981
    move-object/from16 v18, v13

    .line 1982
    .line 1983
    move-object/from16 v21, v14

    .line 1984
    .line 1985
    invoke-direct/range {v16 .. v24}, Leb/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1986
    .line 1987
    .line 1988
    move-object/from16 v4, v16

    .line 1989
    .line 1990
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1991
    .line 1992
    .line 1993
    :cond_5a
    check-cast v4, Lfg/l;

    .line 1994
    .line 1995
    invoke-static {v1, v4}, Lc1/h;->e(Ly0/o;Lfg/l;)Ly0/o;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v0

    .line 1999
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 2000
    .line 2001
    invoke-interface {v0, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v0

    .line 2005
    sget-object v1, Ly0/b;->g:Ly0/g;

    .line 2006
    .line 2007
    const/4 v14, 0x0

    .line 2008
    invoke-static {v1, v14}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v1

    .line 2012
    iget-wide v2, v5, Li0/h0;->T:J

    .line 2013
    .line 2014
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 2015
    .line 2016
    .line 2017
    move-result v2

    .line 2018
    invoke-virtual {v5}, Li0/h0;->l()Ls0/h;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v3

    .line 2022
    invoke-static {v5, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v0

    .line 2026
    sget-object v4, Lx1/g;->f:Lx1/f;

    .line 2027
    .line 2028
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2029
    .line 2030
    .line 2031
    sget-object v4, Lx1/f;->b:Lx1/y;

    .line 2032
    .line 2033
    invoke-virtual {v5}, Li0/h0;->d0()V

    .line 2034
    .line 2035
    .line 2036
    iget-boolean v6, v5, Li0/h0;->S:Z

    .line 2037
    .line 2038
    if-eqz v6, :cond_5b

    .line 2039
    .line 2040
    invoke-virtual {v5, v4}, Li0/h0;->k(Lfg/a;)V

    .line 2041
    .line 2042
    .line 2043
    goto :goto_3c

    .line 2044
    :cond_5b
    invoke-virtual {v5}, Li0/h0;->n0()V

    .line 2045
    .line 2046
    .line 2047
    :goto_3c
    sget-object v4, Lx1/f;->e:Lx1/e;

    .line 2048
    .line 2049
    invoke-static {v4, v5, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2050
    .line 2051
    .line 2052
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 2053
    .line 2054
    invoke-static {v1, v5, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2055
    .line 2056
    .line 2057
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v1

    .line 2061
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 2062
    .line 2063
    invoke-static {v5, v1, v2}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 2064
    .line 2065
    .line 2066
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 2067
    .line 2068
    invoke-static {v1, v5}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 2069
    .line 2070
    .line 2071
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 2072
    .line 2073
    invoke-static {v1, v5, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2074
    .line 2075
    .line 2076
    const/4 v0, 0x1

    .line 2077
    invoke-virtual {v5, v0}, Li0/h0;->p(Z)V

    .line 2078
    .line 2079
    .line 2080
    move v14, v8

    .line 2081
    move-object/from16 v13, v25

    .line 2082
    .line 2083
    goto :goto_3d

    .line 2084
    :cond_5c
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 2085
    .line 2086
    .line 2087
    move-object/from16 v13, p2

    .line 2088
    .line 2089
    move/from16 v14, p3

    .line 2090
    .line 2091
    :goto_3d
    invoke-virtual {v5}, Li0/h0;->t()Li0/r1;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v0

    .line 2095
    if-eqz v0, :cond_5d

    .line 2096
    .line 2097
    new-instance v10, Lsh/j;

    .line 2098
    .line 2099
    move-object/from16 v11, p0

    .line 2100
    .line 2101
    move-object/from16 v12, p1

    .line 2102
    .line 2103
    move/from16 v15, p5

    .line 2104
    .line 2105
    invoke-direct/range {v10 .. v15}, Lsh/j;-><init>(Lh2/a;Ly0/o;Lsh/i;ZI)V

    .line 2106
    .line 2107
    .line 2108
    iput-object v10, v0, Li0/r1;->d:Lfg/p;

    .line 2109
    .line 2110
    :cond_5d
    return-void
.end method

.method public static final e(Lp/f1;JLi0/h0;I)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v7, p3

    .line 6
    .line 7
    move/from16 v9, p4

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v3, 0x2074e8b8

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v3}, Li0/h0;->b0(I)Li0/h0;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v3, v9, 0x6

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v7, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v3, v4

    .line 32
    :goto_0
    or-int/2addr v3, v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v3, v9

    .line 35
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 36
    .line 37
    const/16 v6, 0x10

    .line 38
    .line 39
    const/16 v8, 0x20

    .line 40
    .line 41
    if-nez v5, :cond_3

    .line 42
    .line 43
    invoke-virtual {v7, v1, v2}, Li0/h0;->e(J)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    move v5, v8

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v5, v6

    .line 52
    :goto_2
    or-int/2addr v3, v5

    .line 53
    :cond_3
    and-int/lit8 v5, v3, 0x13

    .line 54
    .line 55
    const/16 v10, 0x12

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x1

    .line 59
    if-eq v5, v10, :cond_4

    .line 60
    .line 61
    move v5, v12

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move v5, v11

    .line 64
    :goto_3
    and-int/lit8 v10, v3, 0x1

    .line 65
    .line 66
    invoke-virtual {v7, v10, v5}, Li0/h0;->S(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_9

    .line 71
    .line 72
    and-int/lit8 v3, v3, 0x70

    .line 73
    .line 74
    if-ne v3, v8, :cond_5

    .line 75
    .line 76
    move v11, v12

    .line 77
    :cond_5
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-nez v11, :cond_6

    .line 82
    .line 83
    sget-object v5, Li0/l;->a:Li0/e;

    .line 84
    .line 85
    if-ne v3, v5, :cond_7

    .line 86
    .line 87
    :cond_6
    new-instance v3, Lf1/n;

    .line 88
    .line 89
    const/4 v5, 0x5

    .line 90
    invoke-direct {v3, v1, v2, v5}, Lf1/n;-><init>(JI)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_7
    check-cast v3, Lf1/n;

    .line 97
    .line 98
    const/16 v5, 0xa

    .line 99
    .line 100
    int-to-float v12, v5

    .line 101
    int-to-float v13, v6

    .line 102
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 103
    .line 104
    invoke-static {v5, v12, v13}, Lp/h1;->k(Ly0/o;FF)Ly0/o;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    sget-object v6, Ly0/b;->q:Ly0/f;

    .line 109
    .line 110
    new-instance v8, Lp/p1;

    .line 111
    .line 112
    invoke-direct {v8, v6}, Lp/p1;-><init>(Ly0/f;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v5, v8}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    sget-object v6, Lf8/i;->a:Lm1/f;

    .line 120
    .line 121
    if-eqz v6, :cond_8

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_8
    new-instance v10, Lm1/e;

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/16 v20, 0xe0

    .line 130
    .line 131
    const/high16 v14, 0x41200000    # 10.0f

    .line 132
    .line 133
    const/high16 v15, 0x41800000    # 16.0f

    .line 134
    .line 135
    const-wide/16 v16, 0x0

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const-string v11, "ArrowUpDown"

    .line 140
    .line 141
    invoke-direct/range {v10 .. v20}, Lm1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 142
    .line 143
    .line 144
    new-instance v6, Lf1/t0;

    .line 145
    .line 146
    sget-wide v11, Lf1/w;->b:J

    .line 147
    .line 148
    invoke-direct {v6, v11, v12}, Lf1/t0;-><init>(J)V

    .line 149
    .line 150
    .line 151
    sget v8, Lm1/h0;->a:I

    .line 152
    .line 153
    new-instance v11, Lid/a;

    .line 154
    .line 155
    invoke-direct {v11, v4}, Lid/a;-><init>(I)V

    .line 156
    .line 157
    .line 158
    iget-object v4, v11, Lid/a;->a:Ljava/util/ArrayList;

    .line 159
    .line 160
    new-instance v8, Lm1/n;

    .line 161
    .line 162
    const v12, 0x4097a0f9    # 4.7384f

    .line 163
    .line 164
    .line 165
    const v13, 0x40196873    # 2.397f

    .line 166
    .line 167
    .line 168
    invoke-direct {v8, v13, v12}, Lm1/n;-><init>(FF)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    const v8, 0x40244189    # 2.5665f

    .line 175
    .line 176
    .line 177
    const v12, 0x4092339c    # 4.5688f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 181
    .line 182
    .line 183
    const v8, 0x40082de0    # 2.1278f

    .line 184
    .line 185
    .line 186
    const v12, 0x40a03d71

    .line 187
    .line 188
    .line 189
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 190
    .line 191
    .line 192
    const v8, 0x40230069    # 2.5469f

    .line 193
    .line 194
    .line 195
    const v12, 0x40ada6b5    # 5.4266f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 199
    .line 200
    .line 201
    const v8, 0x4096ff97    # 4.7187f

    .line 202
    .line 203
    .line 204
    const v12, 0x40f326e9

    .line 205
    .line 206
    .line 207
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 208
    .line 209
    .line 210
    const v8, 0x40b4d6a1

    .line 211
    .line 212
    .line 213
    const v12, 0x41087efa    # 8.531f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 217
    .line 218
    .line 219
    const v16, 0x4119b852    # 9.6075f

    .line 220
    .line 221
    .line 222
    const v17, 0x40b4d6a1

    .line 223
    .line 224
    .line 225
    const v12, 0x410d404f

    .line 226
    .line 227
    .line 228
    const v13, 0x40be5a1d

    .line 229
    .line 230
    .line 231
    const v14, 0x4114f694

    .line 232
    .line 233
    .line 234
    const v15, 0x40be5a1d

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 238
    .line 239
    .line 240
    const v17, 0x409263f1

    .line 241
    .line 242
    .line 243
    const v12, 0x411e79a7

    .line 244
    .line 245
    .line 246
    const v13, 0x40ab53f8    # 5.354f

    .line 247
    .line 248
    .line 249
    const v14, 0x411e79a7

    .line 250
    .line 251
    .line 252
    const v15, 0x409be76d    # 4.872f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 256
    .line 257
    .line 258
    const v8, 0x40691b71

    .line 259
    .line 260
    .line 261
    const v12, 0x410acccd    # 8.675f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 265
    .line 266
    .line 267
    const v8, 0x3fbc3611    # 1.4704f

    .line 268
    .line 269
    .line 270
    const v12, 0x40d01965    # 6.5031f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 274
    .line 275
    .line 276
    const v8, 0x3f09b3d0    # 0.5379f

    .line 277
    .line 278
    .line 279
    const v12, 0x40b2425b    # 5.5706f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 283
    .line 284
    .line 285
    const v16, 0x409946dc

    .line 286
    .line 287
    .line 288
    const v17, 0x3eb573eb    # 0.3544f

    .line 289
    .line 290
    .line 291
    const v12, 0x40ab8106    # 5.3595f

    .line 292
    .line 293
    .line 294
    const v13, 0x3ea74539    # 0.3267f

    .line 295
    .line 296
    .line 297
    const v14, 0x40a1c361    # 5.0551f

    .line 298
    .line 299
    .line 300
    const v15, 0x3e87fcb9    # 0.2656f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 304
    .line 305
    .line 306
    const v16, 0x408d97f6    # 4.4248f

    .line 307
    .line 308
    .line 309
    const v17, 0x3f0eb852    # 0.5575f

    .line 310
    .line 311
    .line 312
    const v12, 0x4094fec5

    .line 313
    .line 314
    .line 315
    const v13, 0x3ec56042    # 0.3855f

    .line 316
    .line 317
    .line 318
    const v14, 0x4090ee63    # 4.5291f

    .line 319
    .line 320
    .line 321
    const v15, 0x3ee809d5    # 0.4532f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 325
    .line 326
    .line 327
    const v8, 0x3fbeb852    # 1.49f

    .line 328
    .line 329
    .line 330
    const v12, 0x405f837b    # 3.4924f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 334
    .line 335
    .line 336
    const v8, 0x406a5c92    # 3.6619f

    .line 337
    .line 338
    .line 339
    const v12, 0x3fa90625    # 1.3205f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 343
    .line 344
    .line 345
    const v8, 0x40930481

    .line 346
    .line 347
    .line 348
    const v12, 0x3ec6a7f0    # 0.388f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 352
    .line 353
    .line 354
    const v16, 0x3ec6a7f0    # 0.388f

    .line 355
    .line 356
    .line 357
    const v17, 0x40b57732

    .line 358
    .line 359
    .line 360
    const v12, 0x3db9c0ec    # 0.0907f

    .line 361
    .line 362
    .line 363
    const v13, 0x409c87fd

    .line 364
    .line 365
    .line 366
    const v14, 0x3db9c0ec    # 0.0907f

    .line 367
    .line 368
    .line 369
    const v15, 0x40abf488    # 5.3736f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 373
    .line 374
    .line 375
    const v16, 0x3fbb74bc    # 1.4645f

    .line 376
    .line 377
    .line 378
    const v12, 0x3f2f6fd2    # 0.6853f

    .line 379
    .line 380
    .line 381
    const v13, 0x40befaad    # 5.9681f

    .line 382
    .line 383
    .line 384
    const v14, 0x3f9566cf    # 1.1672f

    .line 385
    .line 386
    .line 387
    const v15, 0x40befaad    # 5.9681f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 391
    .line 392
    .line 393
    const v8, 0x4097a0f9    # 4.7384f

    .line 394
    .line 395
    .line 396
    const v12, 0x40196873    # 2.397f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v11, v12, v8}, Lid/a;->c(FF)V

    .line 400
    .line 401
    .line 402
    sget-object v8, Lm1/j;->c:Lm1/j;

    .line 403
    .line 404
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    new-instance v12, Lm1/n;

    .line 408
    .line 409
    const v13, 0x41341cac    # 11.257f

    .line 410
    .line 411
    .line 412
    const v14, 0x40196873    # 2.397f

    .line 413
    .line 414
    .line 415
    invoke-direct {v12, v14, v13}, Lm1/n;-><init>(FF)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    const v12, 0x4156dcc6

    .line 422
    .line 423
    .line 424
    const v13, 0x4092339c    # 4.5688f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 428
    .line 429
    .line 430
    const v12, 0x415de148

    .line 431
    .line 432
    .line 433
    const v13, 0x40a03d71

    .line 434
    .line 435
    .line 436
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 437
    .line 438
    .line 439
    const v12, 0x41572d0e

    .line 440
    .line 441
    .line 442
    const v13, 0x40ada6b5    # 5.4266f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 446
    .line 447
    .line 448
    const v12, 0x41346cf4

    .line 449
    .line 450
    .line 451
    const v13, 0x40f326e9

    .line 452
    .line 453
    .line 454
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 455
    .line 456
    .line 457
    const v12, 0x4125816f    # 10.3441f

    .line 458
    .line 459
    .line 460
    const v13, 0x41087efa    # 8.531f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 464
    .line 465
    .line 466
    const v16, 0x4119b852    # 9.6075f

    .line 467
    .line 468
    .line 469
    const v17, 0x4125816f    # 10.3441f

    .line 470
    .line 471
    .line 472
    const v12, 0x410d404f

    .line 473
    .line 474
    .line 475
    const v13, 0x4120bfb1

    .line 476
    .line 477
    .line 478
    const v14, 0x4114f694

    .line 479
    .line 480
    .line 481
    const v15, 0x4120bfb1

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 485
    .line 486
    .line 487
    const v17, 0x4136bac7    # 11.4206f

    .line 488
    .line 489
    .line 490
    const v12, 0x411e79a7

    .line 491
    .line 492
    .line 493
    const v13, 0x412a432d

    .line 494
    .line 495
    .line 496
    const v14, 0x411e79a7

    .line 497
    .line 498
    .line 499
    const v15, 0x4131f909

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 503
    .line 504
    .line 505
    const v12, 0x4145a64c

    .line 506
    .line 507
    .line 508
    const v13, 0x410acccd    # 8.675f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 512
    .line 513
    .line 514
    const v12, 0x41686666    # 14.525f

    .line 515
    .line 516
    .line 517
    const v13, 0x40d01965    # 6.5031f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 521
    .line 522
    .line 523
    const v12, 0x41775183

    .line 524
    .line 525
    .line 526
    const v13, 0x40b2425b    # 5.5706f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 530
    .line 531
    .line 532
    const v16, 0x409946dc

    .line 533
    .line 534
    .line 535
    const v17, 0x417a4120

    .line 536
    .line 537
    .line 538
    const v12, 0x40ab8034

    .line 539
    .line 540
    .line 541
    const v13, 0x417ab296    # 15.6686f

    .line 542
    .line 543
    .line 544
    const v14, 0x40a1c361    # 5.0551f

    .line 545
    .line 546
    .line 547
    const v15, 0x417bad43

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 551
    .line 552
    .line 553
    const v16, 0x408d97f6    # 4.4248f

    .line 554
    .line 555
    .line 556
    const v17, 0x4177013b

    .line 557
    .line 558
    .line 559
    const v12, 0x4094fec5

    .line 560
    .line 561
    .line 562
    const v13, 0x4179c1be

    .line 563
    .line 564
    .line 565
    const v14, 0x4090ee63    # 4.5291f

    .line 566
    .line 567
    .line 568
    const v15, 0x4178ac71    # 15.5421f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 572
    .line 573
    .line 574
    const v12, 0x416815b5

    .line 575
    .line 576
    .line 577
    const v13, 0x405f837b    # 3.4924f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 581
    .line 582
    .line 583
    const v12, 0x41455604    # 12.3335f

    .line 584
    .line 585
    .line 586
    const v13, 0x3fa90625    # 1.3205f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 590
    .line 591
    .line 592
    const v12, 0x41366a7f    # 11.401f

    .line 593
    .line 594
    .line 595
    const v13, 0x3ec6a7f0    # 0.388f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 599
    .line 600
    .line 601
    const v16, 0x3ec6a7f0    # 0.388f

    .line 602
    .line 603
    .line 604
    const v17, 0x41253127    # 10.3245f

    .line 605
    .line 606
    .line 607
    const v12, 0x3db9c0ec    # 0.0907f

    .line 608
    .line 609
    .line 610
    const v13, 0x4131a8c1

    .line 611
    .line 612
    .line 613
    const v14, 0x3db9c0ec    # 0.0907f

    .line 614
    .line 615
    .line 616
    const v15, 0x4129f27c

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 620
    .line 621
    .line 622
    const v16, 0x3fbb74bc    # 1.4645f

    .line 623
    .line 624
    .line 625
    const v12, 0x3f2f6fd2    # 0.6853f

    .line 626
    .line 627
    .line 628
    const v13, 0x41206f69

    .line 629
    .line 630
    .line 631
    const v14, 0x3f9566cf    # 1.1672f

    .line 632
    .line 633
    .line 634
    const v15, 0x41206f69

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v11 .. v17}, Lid/a;->b(FFFFFF)V

    .line 638
    .line 639
    .line 640
    const v12, 0x41341cac    # 11.257f

    .line 641
    .line 642
    .line 643
    const v13, 0x40196873    # 2.397f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v11, v13, v12}, Lid/a;->c(FF)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    const/16 v8, 0x3800

    .line 653
    .line 654
    invoke-static {v10, v4, v6, v8}, Lm1/e;->a(Lm1/e;Ljava/util/List;Lf1/t0;I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v10}, Lm1/e;->b()Lm1/f;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    sput-object v6, Lf8/i;->a:Lm1/f;

    .line 662
    .line 663
    :goto_4
    const/4 v4, 0x0

    .line 664
    const/16 v8, 0x30

    .line 665
    .line 666
    move-object/from16 v21, v6

    .line 667
    .line 668
    move-object v6, v3

    .line 669
    move-object/from16 v3, v21

    .line 670
    .line 671
    invoke-static/range {v3 .. v8}, Lk/n;->c(Lm1/f;Ljava/lang/String;Ly0/o;Lf1/n;Li0/h0;I)V

    .line 672
    .line 673
    .line 674
    goto :goto_5

    .line 675
    :cond_9
    invoke-virtual/range {p3 .. p3}, Li0/h0;->V()V

    .line 676
    .line 677
    .line 678
    :goto_5
    invoke-virtual/range {p3 .. p3}, Li0/h0;->t()Li0/r1;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    if-eqz v3, :cond_a

    .line 683
    .line 684
    new-instance v4, Lsh/u;

    .line 685
    .line 686
    invoke-direct {v4, v0, v1, v2, v9}, Lsh/u;-><init>(Lp/f1;JI)V

    .line 687
    .line 688
    .line 689
    iput-object v4, v3, Li0/r1;->d:Lfg/p;

    .line 690
    .line 691
    :cond_a
    return-void
.end method

.method public static final f(Ljava/lang/String;IZILsh/t;Lfg/l;Li0/h0;I)V
    .locals 36

    .line 1
    move/from16 v2, p1

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v10, p6

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v0, 0x5c41bfdc

    .line 18
    .line 19
    .line 20
    invoke-virtual {v10, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p0

    .line 24
    .line 25
    invoke-virtual {v10, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x2

    .line 34
    :goto_0
    or-int v0, p7, v0

    .line 35
    .line 36
    invoke-virtual {v10, v2}, Li0/h0;->d(I)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    const/16 v7, 0x20

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v7, 0x10

    .line 46
    .line 47
    :goto_1
    or-int/2addr v0, v7

    .line 48
    invoke-virtual {v10, v3}, Li0/h0;->g(Z)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    const/16 v7, 0x100

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v7, 0x80

    .line 58
    .line 59
    :goto_2
    or-int/2addr v0, v7

    .line 60
    invoke-virtual {v10, v4}, Li0/h0;->d(I)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_3

    .line 65
    .line 66
    const/16 v7, 0x800

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/16 v7, 0x400

    .line 70
    .line 71
    :goto_3
    or-int/2addr v0, v7

    .line 72
    invoke-virtual {v10, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    const/16 v7, 0x4000

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    const/16 v7, 0x2000

    .line 82
    .line 83
    :goto_4
    or-int/2addr v0, v7

    .line 84
    const v7, 0x12493

    .line 85
    .line 86
    .line 87
    and-int/2addr v7, v0

    .line 88
    const v9, 0x12492

    .line 89
    .line 90
    .line 91
    if-eq v7, v9, :cond_5

    .line 92
    .line 93
    const/4 v7, 0x1

    .line 94
    goto :goto_5

    .line 95
    :cond_5
    const/4 v7, 0x0

    .line 96
    :goto_5
    and-int/lit8 v9, v0, 0x1

    .line 97
    .line 98
    invoke-virtual {v10, v9, v7}, Li0/h0;->S(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_15

    .line 103
    .line 104
    invoke-virtual {v10}, Li0/h0;->X()V

    .line 105
    .line 106
    .line 107
    and-int/lit8 v7, p7, 0x1

    .line 108
    .line 109
    if-eqz v7, :cond_7

    .line 110
    .line 111
    invoke-virtual {v10}, Li0/h0;->B()Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_6

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_6
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 119
    .line 120
    .line 121
    :cond_7
    :goto_6
    invoke-virtual {v10}, Li0/h0;->q()V

    .line 122
    .line 123
    .line 124
    const/16 v7, 0xc

    .line 125
    .line 126
    const/16 v9, 0x14

    .line 127
    .line 128
    if-nez v4, :cond_8

    .line 129
    .line 130
    int-to-float v13, v9

    .line 131
    :goto_7
    move/from16 v16, v13

    .line 132
    .line 133
    goto :goto_8

    .line 134
    :cond_8
    int-to-float v13, v7

    .line 135
    goto :goto_7

    .line 136
    :goto_8
    add-int/lit8 v13, v2, -0x1

    .line 137
    .line 138
    if-ne v4, v13, :cond_9

    .line 139
    .line 140
    int-to-float v13, v9

    .line 141
    :goto_9
    move/from16 v18, v13

    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_9
    int-to-float v13, v7

    .line 145
    goto :goto_9

    .line 146
    :goto_a
    if-eqz v3, :cond_a

    .line 147
    .line 148
    iget-wide v13, v5, Lsh/t;->c:J

    .line 149
    .line 150
    new-instance v15, Lf1/w;

    .line 151
    .line 152
    invoke-direct {v15, v13, v14}, Lf1/w;-><init>(J)V

    .line 153
    .line 154
    .line 155
    iget-wide v13, v5, Lsh/t;->d:J

    .line 156
    .line 157
    new-instance v7, Lf1/w;

    .line 158
    .line 159
    invoke-direct {v7, v13, v14}, Lf1/w;-><init>(J)V

    .line 160
    .line 161
    .line 162
    new-instance v13, Lsf/e;

    .line 163
    .line 164
    invoke-direct {v13, v15, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_b

    .line 168
    :cond_a
    iget-wide v13, v5, Lsh/t;->a:J

    .line 169
    .line 170
    new-instance v7, Lf1/w;

    .line 171
    .line 172
    invoke-direct {v7, v13, v14}, Lf1/w;-><init>(J)V

    .line 173
    .line 174
    .line 175
    iget-wide v13, v5, Lsh/t;->b:J

    .line 176
    .line 177
    new-instance v15, Lf1/w;

    .line 178
    .line 179
    invoke-direct {v15, v13, v14}, Lf1/w;-><init>(J)V

    .line 180
    .line 181
    .line 182
    new-instance v13, Lsf/e;

    .line 183
    .line 184
    invoke-direct {v13, v7, v15}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :goto_b
    iget-object v7, v13, Lsf/e;->g:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v7, Lf1/w;

    .line 190
    .line 191
    iget-wide v14, v7, Lf1/w;->a:J

    .line 192
    .line 193
    iget-object v7, v13, Lsf/e;->h:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v7, Lf1/w;

    .line 196
    .line 197
    iget-wide v12, v7, Lf1/w;->a:J

    .line 198
    .line 199
    if-eqz v3, :cond_b

    .line 200
    .line 201
    iget-wide v6, v5, Lsh/t;->c:J

    .line 202
    .line 203
    goto :goto_c

    .line 204
    :cond_b
    sget-wide v6, Lf1/w;->f:J

    .line 205
    .line 206
    :goto_c
    invoke-static/range {p5 .. p6}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    move-wide/from16 v23, v14

    .line 211
    .line 212
    sget-object v15, Ly0/b;->q:Ly0/f;

    .line 213
    .line 214
    sget-object v14, Lp/j;->f:Lp/f;

    .line 215
    .line 216
    invoke-virtual {v10, v12, v13}, Li0/h0;->e(J)Z

    .line 217
    .line 218
    .line 219
    move-result v19

    .line 220
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    move-object/from16 v26, v15

    .line 225
    .line 226
    sget-object v15, Li0/l;->a:Li0/e;

    .line 227
    .line 228
    if-nez v19, :cond_c

    .line 229
    .line 230
    if-ne v11, v15, :cond_d

    .line 231
    .line 232
    :cond_c
    new-instance v11, Lca/c;

    .line 233
    .line 234
    const/16 v8, 0xb

    .line 235
    .line 236
    invoke-direct {v11, v12, v13, v8}, Lca/c;-><init>(JI)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_d
    check-cast v11, Lfg/l;

    .line 243
    .line 244
    sget-object v8, Ly0/l;->a:Ly0/l;

    .line 245
    .line 246
    invoke-static {v8, v11}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    .line 247
    .line 248
    .line 249
    move-result-object v27

    .line 250
    invoke-virtual {v10, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    and-int/lit16 v12, v0, 0x1c00

    .line 255
    .line 256
    const/16 v13, 0x800

    .line 257
    .line 258
    if-ne v12, v13, :cond_e

    .line 259
    .line 260
    const/4 v12, 0x1

    .line 261
    goto :goto_d

    .line 262
    :cond_e
    const/4 v12, 0x0

    .line 263
    :goto_d
    or-int/2addr v11, v12

    .line 264
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    if-nez v11, :cond_f

    .line 269
    .line 270
    if-ne v12, v15, :cond_10

    .line 271
    .line 272
    :cond_f
    new-instance v12, Lsh/v;

    .line 273
    .line 274
    const/4 v11, 0x0

    .line 275
    invoke-direct {v12, v4, v9, v11}, Lsh/v;-><init>(ILi0/a1;I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v10, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :cond_10
    move-object/from16 v31, v12

    .line 282
    .line 283
    check-cast v31, Lfg/a;

    .line 284
    .line 285
    const/16 v32, 0xf

    .line 286
    .line 287
    const/16 v28, 0x0

    .line 288
    .line 289
    const/16 v29, 0x0

    .line 290
    .line 291
    const/16 v30, 0x0

    .line 292
    .line 293
    invoke-static/range {v27 .. v32}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    const/16 v11, 0x14

    .line 298
    .line 299
    int-to-float v11, v11

    .line 300
    const/4 v12, 0x0

    .line 301
    const/4 v13, 0x2

    .line 302
    invoke-static {v9, v11, v12, v13}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const/16 v19, 0x5

    .line 309
    .line 310
    move-object v12, v15

    .line 311
    const/4 v15, 0x0

    .line 312
    move-object/from16 v33, v12

    .line 313
    .line 314
    move-object v12, v14

    .line 315
    move-object v14, v9

    .line 316
    move-object/from16 v9, v26

    .line 317
    .line 318
    invoke-static/range {v14 .. v19}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 319
    .line 320
    .line 321
    move-result-object v14

    .line 322
    const/16 v15, 0x36

    .line 323
    .line 324
    invoke-static {v12, v9, v10, v15}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    move-object v12, v14

    .line 329
    iget-wide v13, v10, Li0/h0;->T:J

    .line 330
    .line 331
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 332
    .line 333
    .line 334
    move-result v13

    .line 335
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 336
    .line 337
    .line 338
    move-result-object v14

    .line 339
    invoke-static {v10, v12}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    sget-object v15, Lx1/g;->f:Lx1/f;

    .line 344
    .line 345
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 349
    .line 350
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 351
    .line 352
    .line 353
    move/from16 v16, v0

    .line 354
    .line 355
    iget-boolean v0, v10, Li0/h0;->S:Z

    .line 356
    .line 357
    if-eqz v0, :cond_11

    .line 358
    .line 359
    invoke-virtual {v10, v15}, Li0/h0;->k(Lfg/a;)V

    .line 360
    .line 361
    .line 362
    goto :goto_e

    .line 363
    :cond_11
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 364
    .line 365
    .line 366
    :goto_e
    sget-object v0, Lx1/f;->e:Lx1/e;

    .line 367
    .line 368
    invoke-static {v0, v10, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 372
    .line 373
    invoke-static {v0, v10, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    sget-object v9, Lx1/f;->f:Lx1/e;

    .line 381
    .line 382
    invoke-static {v10, v0, v9}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 383
    .line 384
    .line 385
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 386
    .line 387
    invoke-static {v0, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 388
    .line 389
    .line 390
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 391
    .line 392
    invoke-static {v0, v10, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    const/16 v0, 0xc8

    .line 396
    .line 397
    int-to-float v0, v0

    .line 398
    invoke-static {v8, v0}, Lp/h1;->o(Ly0/o;F)Ly0/o;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    sget-object v9, Lbi/m;->a:Li0/m2;

    .line 403
    .line 404
    invoke-virtual {v10, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    check-cast v9, Lbi/l;

    .line 409
    .line 410
    iget-object v9, v9, Lbi/l;->c:Li0/j1;

    .line 411
    .line 412
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    check-cast v9, Li2/n0;

    .line 417
    .line 418
    iget-object v9, v9, Li2/n0;->a:Li2/f0;

    .line 419
    .line 420
    iget-wide v12, v9, Li2/f0;->b:J

    .line 421
    .line 422
    move v9, v11

    .line 423
    move-wide v10, v12

    .line 424
    sget-object v12, Lm2/k;->j:Lm2/k;

    .line 425
    .line 426
    const v13, 0x180030

    .line 427
    .line 428
    .line 429
    and-int/lit8 v14, v16, 0xe

    .line 430
    .line 431
    or-int v26, v14, v13

    .line 432
    .line 433
    const/16 v27, 0x0

    .line 434
    .line 435
    const v28, 0x3ffa8

    .line 436
    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const-wide/16 v14, 0x0

    .line 440
    .line 441
    const/16 v16, 0x0

    .line 442
    .line 443
    const-wide/16 v17, 0x0

    .line 444
    .line 445
    const/16 v19, 0x0

    .line 446
    .line 447
    const/16 v25, 0xc

    .line 448
    .line 449
    const/16 v20, 0x0

    .line 450
    .line 451
    const/16 v29, 0x1

    .line 452
    .line 453
    const/16 v21, 0x0

    .line 454
    .line 455
    const/16 v30, 0x2

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    move-object/from16 v31, v8

    .line 460
    .line 461
    move-wide/from16 v34, v23

    .line 462
    .line 463
    move/from16 v24, v9

    .line 464
    .line 465
    move-wide/from16 v8, v34

    .line 466
    .line 467
    const/16 v23, 0x0

    .line 468
    .line 469
    move/from16 v32, v24

    .line 470
    .line 471
    const/16 v24, 0x0

    .line 472
    .line 473
    move/from16 v3, v25

    .line 474
    .line 475
    move/from16 v2, v32

    .line 476
    .line 477
    move-object/from16 v25, p6

    .line 478
    .line 479
    move-wide/from16 v34, v6

    .line 480
    .line 481
    move-object v7, v0

    .line 482
    move-object v6, v1

    .line 483
    move-wide/from16 v0, v34

    .line 484
    .line 485
    invoke-static/range {v6 .. v28}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 486
    .line 487
    .line 488
    move-object/from16 v10, v25

    .line 489
    .line 490
    invoke-virtual {v10, v0, v1}, Li0/h0;->e(J)Z

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v7

    .line 498
    if-nez v6, :cond_12

    .line 499
    .line 500
    move-object/from16 v12, v33

    .line 501
    .line 502
    if-ne v7, v12, :cond_13

    .line 503
    .line 504
    :cond_12
    new-instance v7, Lf1/n;

    .line 505
    .line 506
    const/4 v6, 0x5

    .line 507
    invoke-direct {v7, v0, v1, v6}, Lf1/n;-><init>(JI)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v10, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    :cond_13
    move-object v9, v7

    .line 514
    check-cast v9, Lf1/n;

    .line 515
    .line 516
    int-to-float v0, v3

    .line 517
    move-object/from16 v27, v31

    .line 518
    .line 519
    const/16 v31, 0x0

    .line 520
    .line 521
    const/16 v32, 0xe

    .line 522
    .line 523
    const/16 v29, 0x0

    .line 524
    .line 525
    const/16 v30, 0x0

    .line 526
    .line 527
    move/from16 v28, v0

    .line 528
    .line 529
    invoke-static/range {v27 .. v32}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-static {v0, v2}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 534
    .line 535
    .line 536
    move-result-object v8

    .line 537
    sget-object v0, Lfb/v0;->b:Lm1/f;

    .line 538
    .line 539
    if-eqz v0, :cond_14

    .line 540
    .line 541
    :goto_f
    move-object v6, v0

    .line 542
    goto/16 :goto_10

    .line 543
    .line 544
    :cond_14
    new-instance v11, Lm1/e;

    .line 545
    .line 546
    const/16 v0, 0x1a

    .line 547
    .line 548
    int-to-float v13, v0

    .line 549
    const/16 v20, 0x0

    .line 550
    .line 551
    const/16 v21, 0xe0

    .line 552
    .line 553
    const-string v12, "Check"

    .line 554
    .line 555
    const/high16 v15, 0x42600000    # 56.0f

    .line 556
    .line 557
    const/high16 v16, 0x42600000    # 56.0f

    .line 558
    .line 559
    const-wide/16 v17, 0x0

    .line 560
    .line 561
    const/16 v19, 0x0

    .line 562
    .line 563
    move v14, v13

    .line 564
    invoke-direct/range {v11 .. v21}, Lm1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 565
    .line 566
    .line 567
    new-instance v0, Lf1/t0;

    .line 568
    .line 569
    sget-wide v1, Lf1/w;->b:J

    .line 570
    .line 571
    invoke-direct {v0, v1, v2}, Lf1/t0;-><init>(J)V

    .line 572
    .line 573
    .line 574
    sget v1, Lm1/h0;->a:I

    .line 575
    .line 576
    new-instance v12, Lid/a;

    .line 577
    .line 578
    const/4 v13, 0x2

    .line 579
    invoke-direct {v12, v13}, Lid/a;-><init>(I)V

    .line 580
    .line 581
    .line 582
    iget-object v1, v12, Lid/a;->a:Ljava/util/ArrayList;

    .line 583
    .line 584
    new-instance v2, Lm1/n;

    .line 585
    .line 586
    const v3, 0x423b44b6

    .line 587
    .line 588
    .line 589
    const v6, 0x41913611

    .line 590
    .line 591
    .line 592
    invoke-direct {v2, v3, v6}, Lm1/n;-><init>(FF)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    const v17, 0x4239692a

    .line 599
    .line 600
    .line 601
    const v18, 0x41539375

    .line 602
    .line 603
    .line 604
    const v13, 0x424032ca

    .line 605
    .line 606
    .line 607
    const v14, 0x41854c98

    .line 608
    .line 609
    .line 610
    const v15, 0x423f5de7

    .line 611
    .line 612
    .line 613
    const v16, 0x41674c30

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Lid/a;->b(FFFFFF)V

    .line 617
    .line 618
    .line 619
    const v17, 0x4225b2e5

    .line 620
    .line 621
    .line 622
    const v18, 0x415b01a3

    .line 623
    .line 624
    .line 625
    const v13, 0x42337454

    .line 626
    .line 627
    .line 628
    const v14, 0x413fdb23    # 11.991f

    .line 629
    .line 630
    .line 631
    const v15, 0x422aa113

    .line 632
    .line 633
    .line 634
    const v16, 0x41432eb2

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Lid/a;->b(FFFFFF)V

    .line 638
    .line 639
    .line 640
    const v2, 0x41b7a0c5

    .line 641
    .line 642
    .line 643
    const v7, 0x4210032d

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v2, v7}, Lid/a;->c(FF)V

    .line 647
    .line 648
    .line 649
    const v2, 0x41566944

    .line 650
    .line 651
    .line 652
    const v7, 0x41d39a02

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v2, v7}, Lid/a;->c(FF)V

    .line 656
    .line 657
    .line 658
    const v17, 0x410736e3    # 8.4509f

    .line 659
    .line 660
    .line 661
    const v18, 0x41d39a02

    .line 662
    .line 663
    .line 664
    const v13, 0x41408a72

    .line 665
    .line 666
    .line 667
    const v14, 0x41c8aa99

    .line 668
    .line 669
    .line 670
    const v15, 0x411d154d

    .line 671
    .line 672
    .line 673
    const v16, 0x41c8aa99

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Lid/a;->b(FFFFFF)V

    .line 677
    .line 678
    .line 679
    const v18, 0x41fb32ff    # 31.3999f

    .line 680
    .line 681
    .line 682
    const v13, 0x40e2b0f2

    .line 683
    .line 684
    .line 685
    const v14, 0x41de8937    # 27.817f

    .line 686
    .line 687
    .line 688
    const v15, 0x40e2b0f2

    .line 689
    .line 690
    .line 691
    const v16, 0x41f043ca

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Lid/a;->b(FFFFFF)V

    .line 695
    .line 696
    .line 697
    const v2, 0x41a5a95f

    .line 698
    .line 699
    .line 700
    const v7, 0x422ea076

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v2, v7}, Lid/a;->c(FF)V

    .line 704
    .line 705
    .line 706
    const v17, 0x41c3bee0

    .line 707
    .line 708
    .line 709
    const v18, 0x4231c09d

    .line 710
    .line 711
    .line 712
    const v13, 0x41adcb5e

    .line 713
    .line 714
    .line 715
    const v14, 0x4232b176

    .line 716
    .line 717
    .line 718
    const v15, 0x41b9afb8

    .line 719
    .line 720
    .line 721
    const v16, 0x4233bc36

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Lid/a;->b(FFFFFF)V

    .line 725
    .line 726
    .line 727
    const v17, 0x41cf5a86

    .line 728
    .line 729
    .line 730
    const v18, 0x422d97c2

    .line 731
    .line 732
    .line 733
    const v13, 0x41c82090

    .line 734
    .line 735
    .line 736
    const v14, 0x4230ebba

    .line 737
    .line 738
    .line 739
    const v15, 0x41cc26b5    # 25.5189f

    .line 740
    .line 741
    .line 742
    const v16, 0x422f86f7

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Lid/a;->b(FFFFFF)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v3, v6}, Lid/a;->c(FF)V

    .line 749
    .line 750
    .line 751
    sget-object v2, Lm1/j;->c:Lm1/j;

    .line 752
    .line 753
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    const/16 v2, 0x3800

    .line 757
    .line 758
    invoke-static {v11, v1, v0, v2}, Lm1/e;->a(Lm1/e;Ljava/util/List;Lf1/t0;I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v11}, Lm1/e;->b()Lm1/f;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    sput-object v0, Lfb/v0;->b:Lm1/f;

    .line 766
    .line 767
    goto/16 :goto_f

    .line 768
    .line 769
    :goto_10
    const/4 v7, 0x0

    .line 770
    const/16 v11, 0x1b0

    .line 771
    .line 772
    invoke-static/range {v6 .. v11}, Lk/n;->c(Lm1/f;Ljava/lang/String;Ly0/o;Lf1/n;Li0/h0;I)V

    .line 773
    .line 774
    .line 775
    const/4 v0, 0x1

    .line 776
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 777
    .line 778
    .line 779
    goto :goto_11

    .line 780
    :cond_15
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 781
    .line 782
    .line 783
    :goto_11
    invoke-virtual {v10}, Li0/h0;->t()Li0/r1;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    if-eqz v8, :cond_16

    .line 788
    .line 789
    new-instance v0, Ls3/c;

    .line 790
    .line 791
    move-object/from16 v1, p0

    .line 792
    .line 793
    move/from16 v2, p1

    .line 794
    .line 795
    move/from16 v3, p2

    .line 796
    .line 797
    move-object/from16 v6, p5

    .line 798
    .line 799
    move/from16 v7, p7

    .line 800
    .line 801
    invoke-direct/range {v0 .. v7}, Ls3/c;-><init>(Ljava/lang/String;IZILsh/t;Lfg/l;I)V

    .line 802
    .line 803
    .line 804
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 805
    .line 806
    :cond_16
    return-void
.end method

.method public static final g(Ls0/d;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, -0x6b9a6048

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Li0/h0;->S(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-static {p1}, Lk/n;->q(Li0/h0;)Lk/w1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v4, Li0/l;->a:Li0/e;

    .line 34
    .line 35
    if-ne v1, v4, :cond_1

    .line 36
    .line 37
    new-instance v1, Lsh/c0;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    check-cast v1, Lsh/c0;

    .line 46
    .line 47
    invoke-static {}, Lp/d;->g()Ly0/o;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4}, Lci/b0;->a(Ly0/o;)Ly0/o;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4, v0, v3, v2}, Lk/n;->r(Ly0/o;Lk/w1;ZZ)Ly0/o;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-wide v4, p1, Li0/h0;->T:J

    .line 60
    .line 61
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {p1, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 79
    .line 80
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 81
    .line 82
    .line 83
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 84
    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 92
    .line 93
    .line 94
    :goto_1
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 95
    .line 96
    invoke-static {v5, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 100
    .line 101
    invoke-static {v1, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 109
    .line 110
    invoke-static {p1, v1, v2}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 111
    .line 112
    .line 113
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 114
    .line 115
    invoke-static {v1, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 116
    .line 117
    .line 118
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 119
    .line 120
    invoke-static {v1, p1, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x6

    .line 124
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p0, p1, v0}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 136
    .line 137
    .line 138
    :goto_2
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_4

    .line 143
    .line 144
    new-instance v0, Lbi/i;

    .line 145
    .line 146
    const/4 v1, 0x2

    .line 147
    invoke-direct {v0, p0, p2, v1}, Lbi/i;-><init>(Ls0/d;II)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 151
    .line 152
    :cond_4
    return-void
.end method

.method public static final h(JLfg/l;Lfg/a;Lfg/a;Lsh/f0;JLy0/o;Ls0/d;Li0/h0;I)V
    .locals 19

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-wide/from16 v9, p6

    .line 8
    .line 9
    move-object/from16 v11, p10

    .line 10
    .line 11
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const v3, -0x51fada32

    .line 24
    .line 25
    .line 26
    invoke-virtual {v11, v3}, Li0/h0;->b0(I)Li0/h0;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v11, v1, v2}, Li0/h0;->e(J)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v5, 0x4

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    move v3, v5

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v3, 0x2

    .line 39
    :goto_0
    or-int v3, p11, v3

    .line 40
    .line 41
    invoke-virtual {v11, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/16 v7, 0x100

    .line 46
    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    move v6, v7

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/16 v6, 0x80

    .line 52
    .line 53
    :goto_1
    or-int/2addr v3, v6

    .line 54
    invoke-virtual {v11, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    const/16 v6, 0x800

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v6, 0x400

    .line 64
    .line 65
    :goto_2
    or-int/2addr v3, v6

    .line 66
    move-object/from16 v6, p5

    .line 67
    .line 68
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    if-eqz v12, :cond_3

    .line 73
    .line 74
    const/16 v12, 0x4000

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    const/16 v12, 0x2000

    .line 78
    .line 79
    :goto_3
    or-int/2addr v3, v12

    .line 80
    invoke-virtual {v11, v9, v10}, Li0/h0;->e(J)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_4

    .line 85
    .line 86
    const/high16 v12, 0x20000

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    const/high16 v12, 0x10000

    .line 90
    .line 91
    :goto_4
    or-int/2addr v3, v12

    .line 92
    const/high16 v12, 0x180000

    .line 93
    .line 94
    or-int/2addr v3, v12

    .line 95
    const v12, 0x492493

    .line 96
    .line 97
    .line 98
    and-int/2addr v12, v3

    .line 99
    const v15, 0x492492

    .line 100
    .line 101
    .line 102
    if-eq v12, v15, :cond_5

    .line 103
    .line 104
    const/4 v12, 0x1

    .line 105
    goto :goto_5

    .line 106
    :cond_5
    const/4 v12, 0x0

    .line 107
    :goto_5
    and-int/lit8 v15, v3, 0x1

    .line 108
    .line 109
    invoke-virtual {v11, v15, v12}, Li0/h0;->S(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    if-eqz v12, :cond_16

    .line 114
    .line 115
    sget-object v12, Ly1/h1;->h:Li0/m2;

    .line 116
    .line 117
    invoke-virtual {v11, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    check-cast v12, Lu2/c;

    .line 122
    .line 123
    const/16 v15, 0x10

    .line 124
    .line 125
    int-to-float v15, v15

    .line 126
    const/4 v13, 0x6

    .line 127
    invoke-static {v15, v11, v13}, Lbi/k;->b(FLi0/h0;I)Lf1/r0;

    .line 128
    .line 129
    .line 130
    move-result-object v15

    .line 131
    move/from16 p8, v13

    .line 132
    .line 133
    and-int/lit8 v13, v3, 0xe

    .line 134
    .line 135
    if-ne v13, v5, :cond_6

    .line 136
    .line 137
    const/4 v5, 0x1

    .line 138
    goto :goto_6

    .line 139
    :cond_6
    const/4 v5, 0x0

    .line 140
    :goto_6
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    sget-object v14, Li0/l;->a:Li0/e;

    .line 145
    .line 146
    if-nez v5, :cond_8

    .line 147
    .line 148
    if-ne v13, v14, :cond_7

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_7
    move-object/from16 v8, p2

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_8
    :goto_7
    new-instance v13, Leb/s0;

    .line 155
    .line 156
    const/4 v5, 0x2

    .line 157
    move-object/from16 v8, p2

    .line 158
    .line 159
    invoke-direct {v13, v1, v2, v8, v5}, Leb/s0;-><init>(JLjava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :goto_8
    check-cast v13, Lfg/l;

    .line 166
    .line 167
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 168
    .line 169
    invoke-static {v5, v13}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    and-int/lit16 v1, v3, 0x380

    .line 174
    .line 175
    if-ne v1, v7, :cond_9

    .line 176
    .line 177
    const/4 v2, 0x1

    .line 178
    goto :goto_9

    .line 179
    :cond_9
    const/4 v2, 0x0

    .line 180
    :goto_9
    and-int/lit16 v7, v3, 0x1c00

    .line 181
    .line 182
    move/from16 v18, v2

    .line 183
    .line 184
    const/16 v2, 0x800

    .line 185
    .line 186
    if-ne v7, v2, :cond_a

    .line 187
    .line 188
    const/4 v2, 0x1

    .line 189
    goto :goto_a

    .line 190
    :cond_a
    const/4 v2, 0x0

    .line 191
    :goto_a
    or-int v2, v18, v2

    .line 192
    .line 193
    const/high16 v7, 0x70000

    .line 194
    .line 195
    and-int/2addr v7, v3

    .line 196
    move/from16 v17, v2

    .line 197
    .line 198
    const/high16 v2, 0x20000

    .line 199
    .line 200
    if-ne v7, v2, :cond_b

    .line 201
    .line 202
    const/4 v2, 0x1

    .line 203
    goto :goto_b

    .line 204
    :cond_b
    const/4 v2, 0x0

    .line 205
    :goto_b
    or-int v2, v17, v2

    .line 206
    .line 207
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    if-nez v2, :cond_c

    .line 212
    .line 213
    if-ne v7, v14, :cond_d

    .line 214
    .line 215
    :cond_c
    new-instance v7, Lsh/a0;

    .line 216
    .line 217
    invoke-direct {v7, v4, v0, v9, v10}, Lsh/a0;-><init>(Lfg/a;Lfg/a;J)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_d
    check-cast v7, Lfg/l;

    .line 224
    .line 225
    invoke-static {v13, v7}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    sget-object v13, Ly0/b;->g:Ly0/g;

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    invoke-static {v13, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    move v7, v3

    .line 237
    iget-wide v3, v11, Li0/h0;->T:J

    .line 238
    .line 239
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v11, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    sget-object v16, Lx1/g;->f:Lx1/f;

    .line 252
    .line 253
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 257
    .line 258
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 259
    .line 260
    .line 261
    move/from16 v16, v3

    .line 262
    .line 263
    iget-boolean v3, v11, Li0/h0;->S:Z

    .line 264
    .line 265
    if-eqz v3, :cond_e

    .line 266
    .line 267
    invoke-virtual {v11, v8}, Li0/h0;->k(Lfg/a;)V

    .line 268
    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_e
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 272
    .line 273
    .line 274
    :goto_c
    sget-object v3, Lx1/f;->e:Lx1/e;

    .line 275
    .line 276
    invoke-static {v3, v11, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 280
    .line 281
    invoke-static {v0, v11, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    move-object/from16 v16, v8

    .line 289
    .line 290
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 291
    .line 292
    invoke-static {v11, v4, v8}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 293
    .line 294
    .line 295
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 296
    .line 297
    invoke-static {v4, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 298
    .line 299
    .line 300
    move-object/from16 v17, v8

    .line 301
    .line 302
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 303
    .line 304
    invoke-static {v8, v11, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    move/from16 v18, v2

    .line 312
    .line 313
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    if-nez v18, :cond_10

    .line 318
    .line 319
    if-ne v2, v14, :cond_f

    .line 320
    .line 321
    goto :goto_d

    .line 322
    :cond_f
    move-object/from16 v18, v3

    .line 323
    .line 324
    goto :goto_e

    .line 325
    :cond_10
    :goto_d
    new-instance v2, Lnb/a;

    .line 326
    .line 327
    move-object/from16 v18, v3

    .line 328
    .line 329
    const/16 v3, 0xa

    .line 330
    .line 331
    invoke-direct {v2, v15, v3}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v11, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :goto_e
    check-cast v2, Lfg/l;

    .line 338
    .line 339
    invoke-static {v5, v2}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const/16 v3, 0x100

    .line 344
    .line 345
    if-ne v1, v3, :cond_11

    .line 346
    .line 347
    const/4 v1, 0x1

    .line 348
    goto :goto_f

    .line 349
    :cond_11
    const/4 v1, 0x0

    .line 350
    :goto_f
    const v3, 0xe000

    .line 351
    .line 352
    .line 353
    and-int/2addr v3, v7

    .line 354
    const/16 v7, 0x4000

    .line 355
    .line 356
    if-ne v3, v7, :cond_12

    .line 357
    .line 358
    const/4 v7, 0x1

    .line 359
    goto :goto_10

    .line 360
    :cond_12
    const/4 v7, 0x0

    .line 361
    :goto_10
    or-int/2addr v1, v7

    .line 362
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    or-int/2addr v1, v3

    .line 367
    invoke-virtual {v11, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    or-int/2addr v1, v3

    .line 372
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    if-nez v1, :cond_14

    .line 377
    .line 378
    if-ne v3, v14, :cond_13

    .line 379
    .line 380
    goto :goto_11

    .line 381
    :cond_13
    move-object v10, v5

    .line 382
    move-object v9, v8

    .line 383
    move-object v6, v15

    .line 384
    move-object/from16 v1, v16

    .line 385
    .line 386
    move-object/from16 v14, v17

    .line 387
    .line 388
    move-object/from16 v12, v18

    .line 389
    .line 390
    move-object v15, v4

    .line 391
    goto :goto_12

    .line 392
    :cond_14
    :goto_11
    new-instance v3, Lc9/k;

    .line 393
    .line 394
    move-object v1, v8

    .line 395
    const/16 v8, 0xb

    .line 396
    .line 397
    move-object v9, v1

    .line 398
    move-object v10, v5

    .line 399
    move-object v5, v6

    .line 400
    move-object v7, v12

    .line 401
    move-object v6, v15

    .line 402
    move-object/from16 v1, v16

    .line 403
    .line 404
    move-object/from16 v14, v17

    .line 405
    .line 406
    move-object/from16 v12, v18

    .line 407
    .line 408
    move-object v15, v4

    .line 409
    move-object/from16 v4, p3

    .line 410
    .line 411
    invoke-direct/range {v3 .. v8}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :goto_12
    check-cast v3, Lfg/l;

    .line 418
    .line 419
    invoke-static {v2, v3}, Lc1/h;->f(Ly0/o;Lfg/l;)Ly0/o;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 424
    .line 425
    invoke-virtual {v11, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    check-cast v3, Lbi/b;

    .line 430
    .line 431
    invoke-virtual {v3}, Lbi/b;->m()J

    .line 432
    .line 433
    .line 434
    move-result-wide v3

    .line 435
    invoke-static {v2, v3, v4, v6}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    const/4 v7, 0x0

    .line 440
    invoke-static {v13, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    iget-wide v4, v11, Li0/h0;->T:J

    .line 445
    .line 446
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-static {v11, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 459
    .line 460
    .line 461
    iget-boolean v6, v11, Li0/h0;->S:Z

    .line 462
    .line 463
    if-eqz v6, :cond_15

    .line 464
    .line 465
    invoke-virtual {v11, v1}, Li0/h0;->k(Lfg/a;)V

    .line 466
    .line 467
    .line 468
    goto :goto_13

    .line 469
    :cond_15
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 470
    .line 471
    .line 472
    :goto_13
    invoke-static {v12, v11, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-static {v0, v11, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v11, v0, v14}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 483
    .line 484
    .line 485
    invoke-static {v15, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v9, v11, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    move-object/from16 v1, p9

    .line 496
    .line 497
    invoke-virtual {v1, v11, v0}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    const/4 v0, 0x1

    .line 501
    invoke-virtual {v11, v0}, Li0/h0;->p(Z)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v11, v0}, Li0/h0;->p(Z)V

    .line 505
    .line 506
    .line 507
    move-object v9, v10

    .line 508
    goto :goto_14

    .line 509
    :cond_16
    move-object/from16 v1, p9

    .line 510
    .line 511
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 512
    .line 513
    .line 514
    move-object/from16 v9, p8

    .line 515
    .line 516
    :goto_14
    invoke-virtual {v11}, Li0/h0;->t()Li0/r1;

    .line 517
    .line 518
    .line 519
    move-result-object v12

    .line 520
    if-eqz v12, :cond_17

    .line 521
    .line 522
    new-instance v0, Lsh/b0;

    .line 523
    .line 524
    move-object/from16 v3, p2

    .line 525
    .line 526
    move-object/from16 v4, p3

    .line 527
    .line 528
    move-object/from16 v5, p4

    .line 529
    .line 530
    move-object/from16 v6, p5

    .line 531
    .line 532
    move-wide/from16 v7, p6

    .line 533
    .line 534
    move/from16 v11, p11

    .line 535
    .line 536
    move-object v10, v1

    .line 537
    move-wide/from16 v1, p0

    .line 538
    .line 539
    invoke-direct/range {v0 .. v11}, Lsh/b0;-><init>(JLfg/l;Lfg/a;Lfg/a;Lsh/f0;JLy0/o;Ls0/d;I)V

    .line 540
    .line 541
    .line 542
    iput-object v0, v12, Li0/r1;->d:Lfg/p;

    .line 543
    .line 544
    :cond_17
    return-void
.end method

.method public static final i(Li0/h0;)Lsh/x;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v2, Lsh/e2;->d:Lp4/t;

    .line 5
    .line 6
    const v3, -0x800001

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v3}, Li0/h0;->c(F)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-virtual {p0, v4}, Li0/h0;->c(F)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    or-int/2addr v3, v5

    .line 19
    invoke-virtual {p0, v4}, Li0/h0;->c(F)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    or-int/2addr v3, v5

    .line 24
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    sget-object v6, Li0/l;->a:Li0/e;

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    if-ne v5, v6, :cond_1

    .line 33
    .line 34
    :cond_0
    new-instance v5, Lk/s1;

    .line 35
    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    invoke-direct {v5, v3}, Lk/s1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    check-cast v5, Lfg/a;

    .line 45
    .line 46
    invoke-static {v1, v2, v5, p0, v0}, Lv0/k;->e([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lsh/e2;

    .line 51
    .line 52
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-ne v1, v6, :cond_2

    .line 57
    .line 58
    new-instance v1, Lk/s1;

    .line 59
    .line 60
    const/16 v2, 0x9

    .line 61
    .line 62
    invoke-direct {v1, v2}, Lk/s1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    check-cast v1, Lfg/a;

    .line 69
    .line 70
    const v2, 0x451c4000    # 2500.0f

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x5

    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-static {v4, v2, v5, v3}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {p0}, Lh/g1;->a(Li0/h0;)Li/u;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {p0, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-virtual {p0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    or-int/2addr v4, v5

    .line 92
    invoke-virtual {p0, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    or-int/2addr v4, v5

    .line 97
    invoke-virtual {p0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    or-int/2addr v4, v5

    .line 102
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    if-ne v5, v6, :cond_4

    .line 109
    .line 110
    :cond_3
    new-instance v5, Lsh/x;

    .line 111
    .line 112
    invoke-direct {v5, v0, v2, v3, v1}, Lsh/x;-><init>(Lsh/e2;Li/r0;Li/u;Lfg/a;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    check-cast v5, Lsh/x;

    .line 119
    .line 120
    return-object v5
.end method

.method public static final j(Ljava/lang/String;Ly0/o;Li0/h0;II)V
    .locals 23

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    and-int/lit8 v1, p4, 0x2

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v1, p1

    .line 14
    .line 15
    :goto_0
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lbi/b;

    .line 22
    .line 23
    iget-object v2, v2, Lbi/b;->G:Li0/j1;

    .line 24
    .line 25
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lf1/w;

    .line 30
    .line 31
    iget-wide v2, v2, Lf1/w;->a:J

    .line 32
    .line 33
    sget-object v4, Lsh/g1;->a:Lp/z0;

    .line 34
    .line 35
    invoke-static {v1, v4}, Lp/d;->k(Ly0/o;Lp/x0;)Ly0/o;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v4, Lbi/m;->a:Li0/m2;

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lbi/l;

    .line 46
    .line 47
    iget-object v4, v4, Lbi/l;->j:Li0/j1;

    .line 48
    .line 49
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    move-object/from16 v18, v4

    .line 54
    .line 55
    check-cast v18, Li2/n0;

    .line 56
    .line 57
    move/from16 v4, p3

    .line 58
    .line 59
    and-int/lit16 v4, v4, 0x38e

    .line 60
    .line 61
    const/16 v21, 0x0

    .line 62
    .line 63
    const v22, 0x1fff8

    .line 64
    .line 65
    .line 66
    move/from16 v20, v4

    .line 67
    .line 68
    const-wide/16 v4, 0x0

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const-wide/16 v8, 0x0

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    const-wide/16 v11, 0x0

    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    move-object/from16 v19, v0

    .line 85
    .line 86
    move-object/from16 v0, p0

    .line 87
    .line 88
    invoke-static/range {v0 .. v22}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static final k(Lfg/a;Ly0/o;ZLf1/r0;JJFLk/y0;Ls0/d;Li0/h0;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v7, p6

    .line 4
    .line 5
    move-object/from16 v0, p11

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v2, 0x4213f0c3

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Li0/h0;->b0(I)Li0/h0;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v2, v12, 0x6

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v12

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v12

    .line 34
    :goto_1
    and-int/lit8 v3, v12, 0x30

    .line 35
    .line 36
    move-object/from16 v14, p1

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    const/16 v3, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v3, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v2, v3

    .line 52
    :cond_3
    and-int/lit16 v3, v12, 0x180

    .line 53
    .line 54
    if-nez v3, :cond_5

    .line 55
    .line 56
    move/from16 v3, p2

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Li0/h0;->g(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v4, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v2, v4

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    move/from16 v3, p2

    .line 72
    .line 73
    :goto_4
    and-int/lit16 v4, v12, 0xc00

    .line 74
    .line 75
    if-nez v4, :cond_7

    .line 76
    .line 77
    move-object/from16 v4, p3

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_6

    .line 84
    .line 85
    const/16 v5, 0x800

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    const/16 v5, 0x400

    .line 89
    .line 90
    :goto_5
    or-int/2addr v2, v5

    .line 91
    goto :goto_6

    .line 92
    :cond_7
    move-object/from16 v4, p3

    .line 93
    .line 94
    :goto_6
    and-int/lit16 v5, v12, 0x6000

    .line 95
    .line 96
    if-nez v5, :cond_9

    .line 97
    .line 98
    move-wide/from16 v5, p4

    .line 99
    .line 100
    invoke-virtual {v0, v5, v6}, Li0/h0;->e(J)Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-eqz v9, :cond_8

    .line 105
    .line 106
    const/16 v9, 0x4000

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_8
    const/16 v9, 0x2000

    .line 110
    .line 111
    :goto_7
    or-int/2addr v2, v9

    .line 112
    goto :goto_8

    .line 113
    :cond_9
    move-wide/from16 v5, p4

    .line 114
    .line 115
    :goto_8
    const/high16 v9, 0x30000

    .line 116
    .line 117
    and-int/2addr v9, v12

    .line 118
    if-nez v9, :cond_b

    .line 119
    .line 120
    invoke-virtual {v0, v7, v8}, Li0/h0;->e(J)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_a

    .line 125
    .line 126
    const/high16 v9, 0x20000

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_a
    const/high16 v9, 0x10000

    .line 130
    .line 131
    :goto_9
    or-int/2addr v2, v9

    .line 132
    :cond_b
    const/high16 v9, 0xd80000

    .line 133
    .line 134
    or-int/2addr v2, v9

    .line 135
    const/high16 v9, 0x6000000

    .line 136
    .line 137
    and-int/2addr v9, v12

    .line 138
    if-nez v9, :cond_d

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    invoke-virtual {v0, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    if-eqz v9, :cond_c

    .line 146
    .line 147
    const/high16 v9, 0x4000000

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :cond_c
    const/high16 v9, 0x2000000

    .line 151
    .line 152
    :goto_a
    or-int/2addr v2, v9

    .line 153
    :cond_d
    const/high16 v9, 0x30000000

    .line 154
    .line 155
    and-int/2addr v9, v12

    .line 156
    move-object/from16 v10, p9

    .line 157
    .line 158
    if-nez v9, :cond_f

    .line 159
    .line 160
    invoke-virtual {v0, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-eqz v9, :cond_e

    .line 165
    .line 166
    const/high16 v9, 0x20000000

    .line 167
    .line 168
    goto :goto_b

    .line 169
    :cond_e
    const/high16 v9, 0x10000000

    .line 170
    .line 171
    :goto_b
    or-int/2addr v2, v9

    .line 172
    :cond_f
    const v9, 0x12492493

    .line 173
    .line 174
    .line 175
    and-int/2addr v9, v2

    .line 176
    const v11, 0x12492492

    .line 177
    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    if-ne v9, v11, :cond_10

    .line 181
    .line 182
    move v9, v13

    .line 183
    goto :goto_c

    .line 184
    :cond_10
    const/4 v9, 0x1

    .line 185
    :goto_c
    and-int/lit8 v11, v2, 0x1

    .line 186
    .line 187
    invoke-virtual {v0, v11, v9}, Li0/h0;->S(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_17

    .line 192
    .line 193
    invoke-virtual {v0}, Li0/h0;->X()V

    .line 194
    .line 195
    .line 196
    and-int/lit8 v9, v12, 0x1

    .line 197
    .line 198
    if-eqz v9, :cond_12

    .line 199
    .line 200
    invoke-virtual {v0}, Li0/h0;->B()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_11

    .line 205
    .line 206
    goto :goto_d

    .line 207
    :cond_11
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 208
    .line 209
    .line 210
    move/from16 v9, p8

    .line 211
    .line 212
    goto :goto_e

    .line 213
    :cond_12
    :goto_d
    int-to-float v9, v13

    .line 214
    :goto_e
    invoke-virtual {v0}, Li0/h0;->q()V

    .line 215
    .line 216
    .line 217
    const v11, -0x7178fb68

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v11}, Li0/h0;->a0(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    sget-object v15, Li0/l;->a:Li0/e;

    .line 228
    .line 229
    if-ne v11, v15, :cond_13

    .line 230
    .line 231
    new-instance v11, Ln/k;

    .line 232
    .line 233
    invoke-direct {v11}, Ln/k;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :cond_13
    move-object/from16 v19, v11

    .line 240
    .line 241
    check-cast v19, Ln/k;

    .line 242
    .line 243
    invoke-virtual {v0, v13}, Li0/h0;->p(Z)V

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v0}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 247
    .line 248
    .line 249
    move-result-object v22

    .line 250
    sget-object v11, Ly1/h1;->h:Li0/m2;

    .line 251
    .line 252
    invoke-virtual {v0, v11}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    check-cast v11, Lu2/c;

    .line 257
    .line 258
    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v17

    .line 262
    const/high16 v18, 0x1c00000

    .line 263
    .line 264
    and-int v2, v2, v18

    .line 265
    .line 266
    const/high16 v13, 0x800000

    .line 267
    .line 268
    if-ne v2, v13, :cond_14

    .line 269
    .line 270
    const/4 v13, 0x1

    .line 271
    goto :goto_f

    .line 272
    :cond_14
    const/4 v13, 0x0

    .line 273
    :goto_f
    or-int v2, v17, v13

    .line 274
    .line 275
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    if-nez v2, :cond_15

    .line 280
    .line 281
    if-ne v13, v15, :cond_16

    .line 282
    .line 283
    :cond_15
    invoke-interface {v11, v9}, Lu2/c;->x0(F)F

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 288
    .line 289
    .line 290
    move-result-object v13

    .line 291
    invoke-virtual {v0, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_16
    check-cast v13, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    .line 297
    .line 298
    .line 299
    move-result v18

    .line 300
    sget-object v2, Lbi/f;->a:Li0/u;

    .line 301
    .line 302
    new-instance v11, Lf1/w;

    .line 303
    .line 304
    invoke-direct {v11, v7, v8}, Lf1/w;-><init>(J)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v11}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    new-instance v13, Lsh/j1;

    .line 312
    .line 313
    move-object/from16 v23, p10

    .line 314
    .line 315
    move/from16 v21, v3

    .line 316
    .line 317
    move-object v15, v4

    .line 318
    move-wide/from16 v16, v5

    .line 319
    .line 320
    move-object/from16 v20, v10

    .line 321
    .line 322
    invoke-direct/range {v13 .. v23}, Lsh/j1;-><init>(Ly0/o;Lf1/r0;JFLn/k;Lk/y0;ZLi0/a1;Ls0/d;)V

    .line 323
    .line 324
    .line 325
    const v3, -0x1388ba7d

    .line 326
    .line 327
    .line 328
    invoke-static {v3, v13, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    const/16 v4, 0x38

    .line 333
    .line 334
    invoke-static {v2, v3, v0, v4}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 335
    .line 336
    .line 337
    goto :goto_10

    .line 338
    :cond_17
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 339
    .line 340
    .line 341
    move/from16 v9, p8

    .line 342
    .line 343
    :goto_10
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 344
    .line 345
    .line 346
    move-result-object v13

    .line 347
    if-eqz v13, :cond_18

    .line 348
    .line 349
    new-instance v0, Lsh/k1;

    .line 350
    .line 351
    move-object/from16 v2, p1

    .line 352
    .line 353
    move/from16 v3, p2

    .line 354
    .line 355
    move-object/from16 v4, p3

    .line 356
    .line 357
    move-wide/from16 v5, p4

    .line 358
    .line 359
    move-object/from16 v10, p9

    .line 360
    .line 361
    move-object/from16 v11, p10

    .line 362
    .line 363
    invoke-direct/range {v0 .. v12}, Lsh/k1;-><init>(Lfg/a;Ly0/o;ZLf1/r0;JJFLk/y0;Ls0/d;I)V

    .line 364
    .line 365
    .line 366
    iput-object v0, v13, Li0/r1;->d:Lfg/p;

    .line 367
    .line 368
    :cond_18
    return-void
.end method

.method public static final l(Ly0/o;Lf1/r0;JJFLs0/d;Li0/h0;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v1, 0x67f722e8

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v9, 0x6

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    move-object/from16 v1, p0

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x2

    .line 26
    :goto_0
    or-int/2addr v2, v9

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object/from16 v1, p0

    .line 29
    .line 30
    move v2, v9

    .line 31
    :goto_1
    or-int/lit8 v2, v2, 0x30

    .line 32
    .line 33
    and-int/lit16 v3, v9, 0x180

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    move-wide/from16 v3, p2

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Li0/h0;->e(J)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    const/16 v5, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v5, 0x80

    .line 49
    .line 50
    :goto_2
    or-int/2addr v2, v5

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move-wide/from16 v3, p2

    .line 53
    .line 54
    :goto_3
    and-int/lit16 v5, v9, 0xc00

    .line 55
    .line 56
    if-nez v5, :cond_4

    .line 57
    .line 58
    or-int/lit16 v2, v2, 0x400

    .line 59
    .line 60
    :cond_4
    const v5, 0x36000

    .line 61
    .line 62
    .line 63
    or-int/2addr v2, v5

    .line 64
    const/high16 v5, 0x180000

    .line 65
    .line 66
    and-int/2addr v5, v9

    .line 67
    move-object/from16 v8, p7

    .line 68
    .line 69
    if-nez v5, :cond_6

    .line 70
    .line 71
    invoke-virtual {v0, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_5

    .line 76
    .line 77
    const/high16 v5, 0x100000

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    const/high16 v5, 0x80000

    .line 81
    .line 82
    :goto_4
    or-int/2addr v2, v5

    .line 83
    :cond_6
    const v5, 0x92493

    .line 84
    .line 85
    .line 86
    and-int/2addr v5, v2

    .line 87
    const v6, 0x92492

    .line 88
    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v10, 0x1

    .line 92
    if-eq v5, v6, :cond_7

    .line 93
    .line 94
    move v5, v10

    .line 95
    goto :goto_5

    .line 96
    :cond_7
    move v5, v7

    .line 97
    :goto_5
    and-int/lit8 v6, v2, 0x1

    .line 98
    .line 99
    invoke-virtual {v0, v6, v5}, Li0/h0;->S(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_d

    .line 104
    .line 105
    invoke-virtual {v0}, Li0/h0;->X()V

    .line 106
    .line 107
    .line 108
    and-int/lit8 v5, v9, 0x1

    .line 109
    .line 110
    if-eqz v5, :cond_9

    .line 111
    .line 112
    invoke-virtual {v0}, Li0/h0;->B()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_8

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_8
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 120
    .line 121
    .line 122
    and-int/lit16 v2, v2, -0x1c01

    .line 123
    .line 124
    move-object/from16 v12, p1

    .line 125
    .line 126
    move-wide/from16 v13, p4

    .line 127
    .line 128
    move/from16 v11, p6

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_9
    :goto_6
    sget-object v5, Lbi/d;->a:Li0/m2;

    .line 132
    .line 133
    invoke-virtual {v0, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Lbi/b;

    .line 138
    .line 139
    invoke-virtual {v5}, Lbi/b;->g()J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    and-int/lit16 v2, v2, -0x1c01

    .line 144
    .line 145
    int-to-float v11, v7

    .line 146
    sget-object v12, Lf1/c0;->b:Lf1/m0;

    .line 147
    .line 148
    move-wide v13, v5

    .line 149
    :goto_7
    invoke-virtual {v0}, Li0/h0;->q()V

    .line 150
    .line 151
    .line 152
    sget-object v5, Ly1/h1;->h:Li0/m2;

    .line 153
    .line 154
    invoke-virtual {v0, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Lu2/c;

    .line 159
    .line 160
    invoke-virtual {v0, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    const/high16 v15, 0x70000

    .line 165
    .line 166
    and-int/2addr v2, v15

    .line 167
    const/high16 v15, 0x20000

    .line 168
    .line 169
    if-ne v2, v15, :cond_a

    .line 170
    .line 171
    move v7, v10

    .line 172
    :cond_a
    or-int v2, v6, v7

    .line 173
    .line 174
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    if-nez v2, :cond_b

    .line 179
    .line 180
    sget-object v2, Li0/l;->a:Li0/e;

    .line 181
    .line 182
    if-ne v6, v2, :cond_c

    .line 183
    .line 184
    :cond_b
    invoke-interface {v5, v11}, Lu2/c;->x0(F)F

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-virtual {v0, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_c
    check-cast v6, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    sget-object v2, Lbi/f;->a:Li0/u;

    .line 202
    .line 203
    new-instance v5, Lf1/w;

    .line 204
    .line 205
    invoke-direct {v5, v13, v14}, Lf1/w;-><init>(J)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v5}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    new-instance v2, Lsh/h1;

    .line 213
    .line 214
    move-wide v5, v3

    .line 215
    move-object v4, v12

    .line 216
    move-object v3, v1

    .line 217
    invoke-direct/range {v2 .. v8}, Lsh/h1;-><init>(Ly0/o;Lf1/r0;JFLs0/d;)V

    .line 218
    .line 219
    .line 220
    const v1, -0x1b27858

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v2, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const/16 v2, 0x38

    .line 228
    .line 229
    invoke-static {v10, v1, v0, v2}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 230
    .line 231
    .line 232
    move-object v2, v4

    .line 233
    move v7, v11

    .line 234
    move-wide v5, v13

    .line 235
    goto :goto_8

    .line 236
    :cond_d
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 237
    .line 238
    .line 239
    move-object/from16 v2, p1

    .line 240
    .line 241
    move-wide/from16 v5, p4

    .line 242
    .line 243
    move/from16 v7, p6

    .line 244
    .line 245
    :goto_8
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    if-eqz v10, :cond_e

    .line 250
    .line 251
    new-instance v0, Lsh/i1;

    .line 252
    .line 253
    move-object/from16 v1, p0

    .line 254
    .line 255
    move-wide/from16 v3, p2

    .line 256
    .line 257
    move-object/from16 v8, p7

    .line 258
    .line 259
    invoke-direct/range {v0 .. v9}, Lsh/i1;-><init>(Ly0/o;Lf1/r0;JJFLs0/d;I)V

    .line 260
    .line 261
    .line 262
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 263
    .line 264
    :cond_e
    return-void
.end method

.method public static final m(ZLfg/l;Ly0/o;Lsh/l1;ZLi0/h0;II)V
    .locals 40

    move/from16 v1, p0

    move-object/from16 v10, p1

    move-object/from16 v5, p5

    move/from16 v11, p6

    const v0, -0x7b48024d

    .line 1
    invoke-virtual {v5, v0}, Li0/h0;->b0(I)Li0/h0;

    and-int/lit8 v0, v11, 0x6

    const/4 v13, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Li0/h0;->g(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v5, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v3, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_4

    move-object/from16 v3, p2

    invoke-virtual {v5, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_3

    :cond_6
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit16 v4, v11, 0xc00

    if-nez v4, :cond_7

    or-int/lit16 v0, v0, 0x400

    :cond_7
    or-int/lit16 v0, v0, 0x6000

    and-int/lit16 v4, v0, 0x2493

    const/16 v6, 0x2492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v4, v6, :cond_8

    move v4, v14

    goto :goto_5

    :cond_8
    move v4, v15

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6, v4}, Li0/h0;->S(IZ)Z

    move-result v4

    if-eqz v4, :cond_3f

    invoke-virtual {v5}, Li0/h0;->X()V

    and-int/lit8 v4, v11, 0x1

    sget-object v6, Ly0/l;->a:Ly0/l;

    sget-object v7, Li0/l;->a:Li0/e;

    const/4 v8, 0x3

    if-eqz v4, :cond_a

    invoke-virtual {v5}, Li0/h0;->B()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_6

    .line 2
    :cond_9
    invoke-virtual {v5}, Li0/h0;->V()V

    and-int/lit16 v0, v0, -0x1c01

    move-object/from16 v12, p3

    move/from16 v13, p4

    move-object v11, v3

    move-object/from16 v35, v6

    move-object v1, v7

    goto/16 :goto_10

    :cond_a
    :goto_6
    if-eqz v2, :cond_b

    move-object v3, v6

    .line 3
    :cond_b
    sget-object v2, Lbi/n;->a:Li0/m2;

    .line 4
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    .line 5
    check-cast v4, Lbi/a;

    if-nez v4, :cond_c

    const/4 v4, -0x1

    goto :goto_7

    .line 6
    :cond_c
    sget-object v16, Lbi/h;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v16, v4

    :goto_7
    if-eq v4, v14, :cond_d

    if-eq v4, v13, :cond_d

    if-eq v4, v8, :cond_d

    const v4, -0x1a175dda

    .line 7
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 8
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 9
    invoke-virtual {v5, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    .line 10
    check-cast v4, Lbi/b;

    .line 11
    :goto_8
    invoke-virtual {v4}, Lbi/b;->e()J

    move-result-wide v16

    .line 12
    invoke-virtual {v5, v15}, Li0/h0;->p(Z)V

    move-wide/from16 v9, v16

    goto :goto_9

    :cond_d
    const v4, -0x1a17629a

    .line 13
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 14
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 15
    invoke-virtual {v5, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbi/b;

    goto :goto_8

    .line 16
    :goto_9
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    .line 17
    check-cast v4, Lbi/a;

    if-nez v4, :cond_e

    const/4 v4, -0x1

    goto :goto_a

    .line 18
    :cond_e
    sget-object v16, Lbi/h;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v16, v4

    :goto_a
    if-eq v4, v14, :cond_f

    if-eq v4, v13, :cond_f

    if-eq v4, v8, :cond_f

    const v4, -0x1a174c98

    .line 19
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 20
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 21
    invoke-virtual {v5, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    .line 22
    check-cast v4, Lbi/b;

    .line 23
    iget-object v4, v4, Lbi/b;->q:Li0/j1;

    .line 24
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/w;

    move-wide/from16 v19, v9

    .line 25
    iget-wide v8, v4, Lf1/w;->a:J

    .line 26
    :goto_b
    invoke-virtual {v5, v15}, Li0/h0;->p(Z)V

    goto :goto_c

    :cond_f
    move-wide/from16 v19, v9

    const v4, -0x1a175198

    .line 27
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 28
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 29
    invoke-virtual {v5, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbi/b;

    .line 30
    invoke-virtual {v4}, Lbi/b;->g()J

    move-result-wide v8

    const v4, 0x3ec28f5c    # 0.38f

    invoke-static {v8, v9, v4}, Lf1/w;->b(JF)J

    move-result-wide v8

    goto :goto_b

    .line 31
    :goto_c
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    .line 32
    check-cast v2, Lbi/a;

    if-nez v2, :cond_10

    const/4 v2, -0x1

    goto :goto_d

    .line 33
    :cond_10
    sget-object v4, Lbi/h;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    :goto_d
    if-eq v2, v14, :cond_11

    if-eq v2, v13, :cond_11

    const/4 v4, 0x3

    if-eq v2, v4, :cond_12

    const v2, -0x1a173c12

    .line 34
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 35
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 36
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    .line 37
    check-cast v2, Lbi/b;

    .line 38
    invoke-virtual {v2}, Lbi/b;->b()J

    move-result-wide v16

    .line 39
    :goto_e
    invoke-virtual {v5, v15}, Li0/h0;->p(Z)V

    move-wide/from16 v12, v16

    goto :goto_f

    :cond_11
    const/4 v4, 0x3

    :cond_12
    const v2, -0x1a17409c

    .line 40
    invoke-virtual {v5, v2}, Li0/h0;->a0(I)V

    .line 41
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 42
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbi/b;

    .line 43
    invoke-virtual {v2}, Lbi/b;->l()J

    move-result-wide v16

    goto :goto_e

    .line 44
    :goto_f
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 45
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v16

    .line 46
    move-object/from16 v4, v16

    check-cast v4, Lbi/b;

    .line 47
    iget-object v4, v4, Lbi/b;->u:Li0/j1;

    .line 48
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/w;

    .line 49
    iget-wide v10, v4, Lf1/w;->a:J

    .line 50
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    .line 51
    check-cast v4, Lbi/b;

    .line 52
    invoke-virtual {v4}, Lbi/b;->j()J

    move-result-wide v14

    .line 53
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v4

    .line 54
    check-cast v4, Lbi/b;

    .line 55
    iget-object v4, v4, Lbi/b;->p:Li0/j1;

    .line 56
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/w;

    move-object/from16 p3, v3

    .line 57
    iget-wide v3, v4, Lf1/w;->a:J

    .line 58
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v35, v6

    .line 59
    move-object/from16 v6, v18

    check-cast v6, Lbi/b;

    .line 60
    iget-object v6, v6, Lbi/b;->i:Li0/j1;

    .line 61
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf1/w;

    move/from16 v36, v0

    .line 62
    iget-wide v0, v6, Lf1/w;->a:J

    .line 63
    invoke-virtual {v5, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    .line 64
    check-cast v2, Lbi/b;

    .line 65
    iget-object v2, v2, Lbi/b;->t:Li0/j1;

    .line 66
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf1/w;

    move-object/from16 v37, v7

    .line 67
    iget-wide v6, v2, Lf1/w;->a:J

    move-wide/from16 v33, v6

    move-wide/from16 v6, v19

    .line 68
    invoke-virtual {v5, v6, v7}, Li0/h0;->e(J)Z

    move-result v2

    .line 69
    invoke-virtual {v5, v8, v9}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    .line 70
    invoke-virtual {v5, v12, v13}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    .line 71
    invoke-virtual {v5, v10, v11}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    .line 72
    invoke-virtual {v5, v14, v15}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    .line 73
    invoke-virtual {v5, v3, v4}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    .line 74
    invoke-virtual {v5, v0, v1}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    move-wide/from16 v31, v0

    move-wide/from16 v0, v33

    .line 75
    invoke-virtual {v5, v0, v1}, Li0/h0;->e(J)Z

    move-result v18

    or-int v2, v2, v18

    .line 76
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v37

    if-nez v2, :cond_13

    if-ne v0, v1, :cond_14

    .line 77
    :cond_13
    new-instance v18, Lsh/l1;

    move-wide/from16 v29, v3

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    move-wide/from16 v25, v10

    move-wide/from16 v23, v12

    move-wide/from16 v27, v14

    invoke-direct/range {v18 .. v34}, Lsh/l1;-><init>(JJJJJJJJ)V

    move-object/from16 v0, v18

    .line 78
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 79
    :cond_14
    check-cast v0, Lsh/l1;

    move/from16 v2, v36

    and-int/lit16 v2, v2, -0x1c01

    move-object/from16 v11, p3

    move-object v12, v0

    move v0, v2

    const/4 v13, 0x1

    .line 80
    :goto_10
    invoke-virtual {v5}, Li0/h0;->q()V

    move-object/from16 v14, p1

    .line 81
    invoke-static {v14, v5}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v15

    .line 82
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_15

    .line 83
    new-instance v2, Ln/k;

    invoke-direct {v2}, Ln/k;-><init>()V

    .line 84
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 85
    :cond_15
    check-cast v2, Ln/k;

    .line 86
    invoke-static {v2, v5}, Lac/p;->n(Ln/k;Li0/h0;)Li0/a1;

    move-result-object v18

    .line 87
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_16

    .line 88
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v3

    .line 89
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    :cond_16
    check-cast v3, Li0/a1;

    .line 91
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v4

    const/4 v6, 0x0

    if-ne v4, v1, :cond_17

    .line 92
    new-instance v4, Ln/e;

    const/4 v7, 0x0

    invoke-direct {v4, v2, v3, v6, v7}, Ln/e;-><init>(Ln/k;Li0/a1;Lwf/c;I)V

    .line 93
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 94
    :cond_17
    check-cast v4, Lfg/p;

    invoke-static {v4, v5, v2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 95
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_18

    .line 96
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v4

    .line 97
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 98
    :cond_18
    check-cast v4, Li0/a1;

    .line 99
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_19

    .line 100
    new-instance v7, Ln/e;

    const/4 v8, 0x1

    invoke-direct {v7, v2, v4, v6, v8}, Ln/e;-><init>(Ln/k;Li0/a1;Lwf/c;I)V

    .line 101
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 102
    :cond_19
    check-cast v7, Lfg/p;

    invoke-static {v7, v5, v2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 103
    sget-object v7, Ly1/h1;->l:Li0/m2;

    .line 104
    invoke-virtual {v5, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v7

    .line 105
    check-cast v7, Ln1/a;

    .line 106
    invoke-static {v7, v5}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    move-result-object v8

    .line 107
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_1a

    .line 108
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v9

    .line 109
    invoke-virtual {v5, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 110
    :cond_1a
    move-object/from16 v19, v9

    check-cast v19, Li0/a1;

    .line 111
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_1b

    .line 112
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v9

    .line 113
    invoke-virtual {v5, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 114
    :cond_1b
    move-object/from16 v20, v9

    check-cast v20, Li0/a1;

    .line 115
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x0

    if-ne v9, v1, :cond_1c

    .line 116
    new-instance v9, Li0/f1;

    invoke-direct {v9, v10}, Li0/f1;-><init>(F)V

    .line 117
    invoke-virtual {v5, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 118
    :cond_1c
    move-object/from16 v21, v9

    check-cast v21, Li0/f1;

    .line 119
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_1d

    .line 120
    invoke-static {v6}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object v9

    .line 121
    invoke-virtual {v5, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 122
    :cond_1d
    move-object/from16 v22, v9

    check-cast v22, Li0/a1;

    .line 123
    invoke-static {v5}, Lbi/k;->a(Li0/h0;)Lf1/r0;

    move-result-object v9

    .line 124
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v10

    const v6, 0x4476c000    # 987.0f

    if-ne v10, v1, :cond_1e

    const v10, 0x3f333333    # 0.7f

    move/from16 v23, v0

    move-object/from16 p2, v2

    const/4 v0, 0x4

    const/4 v2, 0x0

    .line 125
    invoke-static {v10, v6, v2, v0}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    move-result-object v10

    .line 126
    invoke-virtual {v5, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    goto :goto_11

    :cond_1e
    move/from16 v23, v0

    move-object/from16 p2, v2

    const/4 v0, 0x4

    const/4 v2, 0x0

    .line 127
    :goto_11
    move-object/from16 v24, v10

    check-cast v24, Li/r0;

    .line 128
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_1f

    const v10, 0x3f19999a    # 0.6f

    .line 129
    invoke-static {v10, v6, v2, v0}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    move-result-object v6

    const/4 v0, 0x0

    .line 130
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1f
    move-object v6, v10

    const/4 v0, 0x0

    .line 131
    :goto_12
    move-object/from16 v25, v6

    check-cast v25, Li/r0;

    .line 132
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_20

    .line 133
    new-instance v6, Li0/f1;

    invoke-direct {v6, v0}, Li0/f1;-><init>(F)V

    .line 134
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 135
    :cond_20
    move-object v0, v6

    check-cast v0, Li0/f1;

    if-eqz p0, :cond_21

    const/16 v6, 0x19

    int-to-float v6, v6

    goto :goto_13

    :cond_21
    const/4 v10, 0x4

    int-to-float v6, v10

    .line 136
    :goto_13
    invoke-virtual {v0}, Li0/f1;->g()F

    move-result v26

    add-float v6, v26, v6

    .line 137
    sget-object v26, Li/f;->a:Li/r0;

    move-object/from16 v26, v2

    .line 138
    new-instance v2, Lu2/f;

    invoke-direct {v2, v6}, Lu2/f;-><init>(F)V

    move-object v6, v3

    .line 139
    sget-object v3, Li/d;->l:Li/m1;

    move-object/from16 v27, v8

    const/16 v8, 0x180

    move-object/from16 v28, v9

    const/16 v9, 0x8

    const/4 v5, 0x0

    move-object/from16 v29, v6

    .line 140
    const-string v6, "DpAnimation"

    move-object/from16 v10, p2

    move-object/from16 p3, v0

    move-object v0, v1

    move-object/from16 v17, v4

    move-object/from16 p4, v11

    move-object/from16 v4, v24

    move-object/from16 v1, v26

    move-object/from16 v11, v27

    move-object/from16 v14, v28

    move-object/from16 v24, v7

    move-object/from16 v7, p5

    invoke-static/range {v2 .. v9}, Li/f;->b(Ljava/lang/Object;Li/m1;Li/k;Ljava/lang/Float;Ljava/lang/String;Li0/h0;II)Li0/l2;

    move-result-object v8

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v13, :cond_22

    goto :goto_14

    .line 141
    :cond_22
    invoke-interface/range {v18 .. v18}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_23

    .line 142
    invoke-interface/range {v29 .. v29}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_23

    .line 143
    invoke-interface/range {v17 .. v17}, Li0/l2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_24

    :cond_23
    const v2, 0x3f904189    # 1.127f

    :cond_24
    :goto_14
    const/16 v6, 0x30

    const/16 v7, 0x1c

    const/4 v4, 0x0

    move-object/from16 v5, p5

    move-object/from16 v3, v25

    .line 144
    invoke-static/range {v2 .. v7}, Li/f;->a(FLi/k;Ljava/lang/String;Li0/h0;II)Li0/l2;

    move-result-object v9

    if-eqz p0, :cond_26

    if-eqz v13, :cond_25

    .line 145
    iget-wide v2, v12, Lsh/l1;->a:J

    goto :goto_15

    :cond_25
    iget-wide v2, v12, Lsh/l1;->c:J

    goto :goto_15

    :cond_26
    if-eqz v13, :cond_27

    .line 146
    iget-wide v2, v12, Lsh/l1;->b:J

    goto :goto_15

    :cond_27
    iget-wide v2, v12, Lsh/l1;->d:J

    :goto_15
    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v4, 0x0

    move-object/from16 v5, p5

    .line 147
    invoke-static/range {v2 .. v7}, Lh/y0;->a(JLi/y;Li0/h0;II)Li0/l2;

    move-result-object v2

    if-eqz p0, :cond_29

    if-eqz v13, :cond_28

    .line 148
    iget-wide v3, v12, Lsh/l1;->e:J

    goto :goto_16

    :cond_28
    iget-wide v3, v12, Lsh/l1;->g:J

    goto :goto_16

    :cond_29
    if-eqz v13, :cond_2a

    .line 149
    iget-wide v3, v12, Lsh/l1;->f:J

    goto :goto_16

    :cond_2a
    iget-wide v3, v12, Lsh/l1;->h:J

    :goto_16
    const v5, 0x3f7d70a4    # 0.99f

    const v6, 0x43db4ccd    # 438.6f

    const/4 v7, 0x4

    .line 150
    invoke-static {v5, v6, v1, v7}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    move-result-object v1

    const/16 v6, 0x30

    const/16 v7, 0xc

    move-wide/from16 v38, v3

    move-object v4, v1

    move-object v1, v2

    move-wide/from16 v2, v38

    move-object/from16 v5, p5

    .line 151
    invoke-static/range {v2 .. v7}, Lh/y0;->a(JLi/y;Li0/h0;II)Li0/l2;

    move-result-object v2

    move-object v3, v5

    if-eqz p1, :cond_2d

    const v4, -0x60a2c0e2

    .line 152
    invoke-virtual {v3, v4}, Li0/h0;->a0(I)V

    .line 153
    new-instance v4, Lf2/i;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lf2/i;-><init>(I)V

    .line 154
    invoke-virtual {v3, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v3, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 155
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_2c

    if-ne v6, v0, :cond_2b

    goto :goto_17

    :cond_2b
    const/4 v7, 0x0

    goto :goto_18

    .line 156
    :cond_2c
    :goto_17
    new-instance v6, Lsh/m1;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v15, v11}, Lsh/m1;-><init>(ILi0/a1;Li0/a1;)V

    .line 157
    invoke-virtual {v3, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 158
    :goto_18
    check-cast v6, Lfg/l;

    move/from16 v5, p0

    .line 159
    invoke-static {v4, v6, v10, v5, v13}, Lu/b;->a(Lf2/i;Lfg/l;Ln/k;ZZ)Ly0/o;

    move-result-object v6

    .line 160
    invoke-virtual {v3, v7}, Li0/h0;->p(Z)V

    goto :goto_19

    :cond_2d
    const/4 v7, 0x0

    move/from16 v5, p0

    const v4, -0x609c3609

    .line 161
    invoke-virtual {v3, v4}, Li0/h0;->a0(I)V

    .line 162
    invoke-virtual {v3, v7}, Li0/h0;->p(Z)V

    move-object/from16 v6, v35

    .line 163
    :goto_19
    invoke-static/range {p4 .. p4}, Lp/h1;->p(Ly0/o;)Ly0/o;

    move-result-object v4

    const/16 v7, 0x31

    int-to-float v7, v7

    const/16 v11, 0x1c

    int-to-float v11, v11

    .line 164
    invoke-static {v4, v7, v11}, Lp/h1;->k(Ly0/o;FF)Ly0/o;

    move-result-object v4

    .line 165
    invoke-static {v4, v14}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    move-result-object v4

    .line 166
    invoke-virtual {v3, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    .line 167
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_2e

    if-ne v11, v0, :cond_2f

    .line 168
    :cond_2e
    new-instance v11, Lsh/y0;

    const/4 v7, 0x1

    invoke-direct {v11, v2, v7}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 169
    invoke-virtual {v3, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 170
    :cond_2f
    check-cast v11, Lfg/l;

    invoke-static {v4, v11}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v2

    .line 171
    invoke-static {v2, v10, v13}, Lk/n;->n(Ly0/o;Ln/k;Z)Ly0/o;

    move-result-object v2

    .line 172
    invoke-interface {v2, v6}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v2

    .line 173
    sget-object v4, Ly0/b;->g:Ly0/g;

    const/4 v7, 0x0

    .line 174
    invoke-static {v4, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    move-result-object v4

    .line 175
    iget-wide v6, v3, Li0/h0;->T:J

    .line 176
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    .line 177
    invoke-virtual {v3}, Li0/h0;->l()Ls0/h;

    move-result-object v7

    .line 178
    invoke-static {v3, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    move-result-object v2

    .line 179
    sget-object v11, Lx1/g;->f:Lx1/f;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 181
    invoke-virtual {v3}, Li0/h0;->d0()V

    .line 182
    iget-boolean v14, v3, Li0/h0;->S:Z

    if-eqz v14, :cond_30

    .line 183
    invoke-virtual {v3, v11}, Li0/h0;->k(Lfg/a;)V

    goto :goto_1a

    .line 184
    :cond_30
    invoke-virtual {v3}, Li0/h0;->n0()V

    .line 185
    :goto_1a
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 186
    invoke-static {v11, v3, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 187
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 188
    invoke-static {v4, v3, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 189
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 190
    sget-object v6, Lx1/f;->f:Lx1/e;

    .line 191
    invoke-static {v3, v4, v6}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 192
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 193
    invoke-static {v4, v3}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 194
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 195
    invoke-static {v4, v3, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    const/16 v2, 0x14

    int-to-float v2, v2

    move-object/from16 v4, v35

    .line 196
    invoke-static {v4, v2}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    move-result-object v2

    .line 197
    sget-object v6, Ly0/b;->j:Ly0/g;

    invoke-static {v2, v6}, Lp/r;->a(Ly0/o;Ly0/c;)Ly0/o;

    move-result-object v2

    .line 198
    invoke-virtual {v3, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    .line 199
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_31

    if-ne v7, v0, :cond_32

    .line 200
    :cond_31
    new-instance v7, Lsh/y0;

    const/4 v6, 0x2

    invoke-direct {v7, v8, v6}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 201
    invoke-virtual {v3, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 202
    :cond_32
    check-cast v7, Lfg/l;

    invoke-static {v2, v7}, Lp/d;->i(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v2

    .line 203
    invoke-virtual {v3, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    .line 204
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_33

    if-ne v7, v0, :cond_34

    .line 205
    :cond_33
    new-instance v7, Lsh/y0;

    const/4 v6, 0x3

    invoke-direct {v7, v9, v6}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 206
    invoke-virtual {v3, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 207
    :cond_34
    check-cast v7, Lfg/l;

    invoke-static {v2, v7}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v2

    .line 208
    invoke-virtual {v3, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v6

    .line 209
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_36

    if-ne v7, v0, :cond_35

    goto :goto_1b

    :cond_35
    const/4 v6, 0x4

    goto :goto_1c

    .line 210
    :cond_36
    :goto_1b
    new-instance v7, Lsh/y0;

    const/4 v6, 0x4

    invoke-direct {v7, v1, v6}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 211
    invoke-virtual {v3, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 212
    :goto_1c
    check-cast v7, Lfg/l;

    invoke-static {v2, v7}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    move-result-object v11

    if-eqz v13, :cond_3e

    const v1, 0x665fe562

    .line 213
    invoke-virtual {v3, v1}, Li0/h0;->a0(I)V

    and-int/lit8 v14, v23, 0xe

    if-ne v14, v6, :cond_37

    const/4 v7, 0x1

    :goto_1d
    move-object/from16 v2, v24

    goto :goto_1e

    :cond_37
    const/4 v7, 0x0

    goto :goto_1d

    .line 214
    :goto_1e
    invoke-virtual {v3, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v7

    .line 215
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_38

    if-ne v6, v0, :cond_39

    :cond_38
    move-object v1, v0

    goto :goto_1f

    :cond_39
    move-object/from16 v1, p3

    move-object v9, v0

    move-object v8, v3

    move-object/from16 v35, v4

    move-object v0, v6

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    move-object/from16 v3, v21

    goto :goto_20

    .line 216
    :goto_1f
    new-instance v0, Lhb/x;

    const/4 v7, 0x1

    move-object v9, v1

    move-object v8, v3

    move-object/from16 v35, v4

    move v1, v5

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    move-object/from16 v3, v21

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v7}, Lhb/x;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v4

    .line 217
    invoke-virtual {v8, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 218
    :goto_20
    check-cast v0, Lfg/l;

    invoke-static {v0, v8}, Lm/s0;->b(Lfg/l;Li0/h0;)Lm/n;

    move-result-object v0

    .line 219
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_3a

    move-object v8, v3

    .line 220
    new-instance v3, Lsh/o1;

    move-object/from16 v37, v9

    const/4 v9, 0x0

    move-object/from16 p2, v0

    move-object v7, v5

    move-object v4, v10

    move-object/from16 v18, v12

    move-object/from16 v5, v22

    move-object/from16 v12, v35

    move-object/from16 v0, v37

    move-object/from16 v10, p5

    invoke-direct/range {v3 .. v9}, Lsh/o1;-><init>(Ln/k;Li0/a1;Li0/a1;Li0/a1;Li0/f1;Lwf/c;)V

    move-object v6, v5

    move-object v5, v7

    move-object v7, v4

    .line 221
    invoke-virtual {v10, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v4, v3

    goto :goto_21

    :cond_3a
    move-object/from16 p2, v0

    move-object v0, v9

    move-object v7, v10

    move-object/from16 v18, v12

    move-object/from16 v6, v22

    move-object/from16 v12, v35

    move-object v10, v8

    move-object v8, v3

    .line 222
    :goto_21
    check-cast v4, Lfg/q;

    .line 223
    invoke-virtual {v10, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v3

    const/4 v9, 0x4

    if-ne v14, v9, :cond_3b

    const/4 v9, 0x1

    goto :goto_22

    :cond_3b
    const/4 v9, 0x0

    :goto_22
    or-int/2addr v3, v9

    invoke-virtual {v10, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v3, v9

    .line 224
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_3d

    if-ne v9, v0, :cond_3c

    goto :goto_23

    :cond_3c
    move-object/from16 v14, p2

    move-object v15, v4

    goto :goto_24

    .line 225
    :cond_3d
    :goto_23
    new-instance v0, Lsh/p1;

    const/4 v9, 0x0

    move-object v3, v15

    move-object v15, v4

    move-object v4, v3

    move-object/from16 v14, p2

    move-object v3, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v9}, Lsh/p1;-><init>(ZLn1/a;Li0/f1;Li0/a1;Li0/a1;Li0/a1;Ln/k;Li0/f1;Lwf/c;)V

    .line 226
    invoke-virtual {v10, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    move-object v9, v0

    .line 227
    :goto_24
    check-cast v9, Lfg/q;

    .line 228
    invoke-static {v12, v14, v15, v9}, Lm/s0;->a(Ly0/o;Lm/n;Lfg/q;Lfg/q;)Ly0/o;

    move-result-object v6

    const/4 v7, 0x0

    .line 229
    invoke-virtual {v10, v7}, Li0/h0;->p(Z)V

    goto :goto_25

    :cond_3e
    move-object v10, v3

    move-object/from16 v18, v12

    const/4 v7, 0x0

    move-object v12, v4

    const v0, 0x668cbbbd

    .line 230
    invoke-virtual {v10, v0}, Li0/h0;->a0(I)V

    .line 231
    invoke-virtual {v10, v7}, Li0/h0;->p(Z)V

    move-object v6, v12

    .line 232
    :goto_25
    invoke-interface {v11, v6}, Ly0/o;->d(Ly0/o;)Ly0/o;

    move-result-object v0

    .line 233
    invoke-static {v0, v10, v7}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    const/4 v8, 0x1

    .line 234
    invoke-virtual {v10, v8}, Li0/h0;->p(Z)V

    move-object/from16 v3, p4

    move v5, v13

    move-object/from16 v4, v18

    goto :goto_26

    :cond_3f
    move-object v10, v5

    .line 235
    invoke-virtual {v10}, Li0/h0;->V()V

    move-object/from16 v4, p3

    move/from16 v5, p4

    .line 236
    :goto_26
    invoke-virtual {v10}, Li0/h0;->t()Li0/r1;

    move-result-object v8

    if-eqz v8, :cond_40

    new-instance v0, Lsh/n1;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lsh/n1;-><init>(ZLfg/l;Ly0/o;Lsh/l1;ZII)V

    .line 237
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    :cond_40
    return-void
.end method

.method public static final n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V
    .locals 37

    move-object/from16 v0, p19

    move/from16 v1, p20

    move/from16 v2, p21

    move/from16 v3, p22

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x5d44c011

    .line 1
    invoke-virtual {v0, v4}, Li0/h0;->b0(I)Li0/h0;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v1, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v7, v7, 0x180

    move-wide/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v1, 0x180

    move-wide/from16 v5, p2

    if-nez v15, :cond_7

    invoke-virtual {v0, v5, v6}, Li0/h0;->e(J)Z

    move-result v17

    if-eqz v17, :cond_6

    const/16 v17, 0x100

    goto :goto_4

    :cond_6
    const/16 v17, 0x80

    :goto_4
    or-int v7, v7, v17

    :cond_7
    :goto_5
    or-int/lit16 v9, v7, 0xc00

    and-int/lit8 v18, v3, 0x10

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-eqz v18, :cond_8

    or-int/lit16 v9, v7, 0x6c00

    move-wide/from16 v10, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v7, v1, 0x6000

    move-wide/from16 v10, p4

    if-nez v7, :cond_a

    invoke-virtual {v0, v10, v11}, Li0/h0;->e(J)Z

    move-result v21

    if-eqz v21, :cond_9

    move/from16 v21, v20

    goto :goto_6

    :cond_9
    move/from16 v21, v19

    :goto_6
    or-int v9, v9, v21

    :cond_a
    :goto_7
    const/high16 v21, 0x30000

    or-int v22, v9, v21

    and-int/lit8 v23, v3, 0x40

    const/high16 v24, 0x80000

    const/high16 v25, 0x100000

    const/high16 v26, 0x1b0000

    const/high16 v27, 0x180000

    if-eqz v23, :cond_c

    or-int v22, v9, v26

    :cond_b
    move-object/from16 v9, p6

    goto :goto_9

    :cond_c
    and-int v9, v1, v27

    if-nez v9, :cond_b

    move-object/from16 v9, p6

    invoke-virtual {v0, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_d

    move/from16 v28, v25

    goto :goto_8

    :cond_d
    move/from16 v28, v24

    :goto_8
    or-int v22, v22, v28

    :goto_9
    and-int/lit16 v7, v3, 0x80

    const/high16 v29, 0x400000

    const/high16 v30, 0x800000

    const/high16 v31, 0xc00000

    if-eqz v7, :cond_e

    or-int v22, v22, v31

    move-object/from16 v13, p7

    goto :goto_b

    :cond_e
    and-int v32, v1, v31

    move-object/from16 v13, p7

    if-nez v32, :cond_10

    invoke-virtual {v0, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_f

    move/from16 v33, v30

    goto :goto_a

    :cond_f
    move/from16 v33, v29

    :goto_a
    or-int v22, v22, v33

    :cond_10
    :goto_b
    const/high16 v33, 0x36000000

    or-int v22, v22, v33

    and-int/lit16 v14, v3, 0x400

    if-eqz v14, :cond_11

    or-int/lit8 v15, v2, 0x6

    move/from16 v16, v15

    move-object/from16 v15, p10

    goto :goto_d

    :cond_11
    and-int/lit8 v34, v2, 0x6

    move-object/from16 v15, p10

    if-nez v34, :cond_13

    invoke-virtual {v0, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_12

    const/16 v16, 0x4

    goto :goto_c

    :cond_12
    const/16 v16, 0x2

    :goto_c
    or-int v16, v2, v16

    goto :goto_d

    :cond_13
    move/from16 v16, v2

    :goto_d
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_15

    or-int/lit8 v16, v16, 0x30

    move-wide/from16 v4, p11

    :cond_14
    :goto_e
    move/from16 v6, v16

    goto :goto_10

    :cond_15
    and-int/lit8 v34, v2, 0x30

    move-wide/from16 v4, p11

    if-nez v34, :cond_14

    invoke-virtual {v0, v4, v5}, Li0/h0;->e(J)Z

    move-result v6

    if-eqz v6, :cond_16

    const/16 v28, 0x20

    goto :goto_f

    :cond_16
    const/16 v28, 0x10

    :goto_f
    or-int v16, v16, v28

    goto :goto_e

    :goto_10
    move/from16 v16, v1

    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_18

    or-int/lit16 v6, v6, 0x180

    move/from16 v17, v1

    :cond_17
    move/from16 v1, p13

    goto :goto_12

    :cond_18
    move/from16 v17, v1

    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_17

    move/from16 v1, p13

    invoke-virtual {v0, v1}, Li0/h0;->d(I)Z

    move-result v28

    if-eqz v28, :cond_19

    const/16 v32, 0x100

    goto :goto_11

    :cond_19
    const/16 v32, 0x80

    :goto_11
    or-int v6, v6, v32

    :goto_12
    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_1b

    or-int/lit16 v6, v6, 0xc00

    move/from16 v28, v1

    :cond_1a
    move/from16 v1, p14

    goto :goto_14

    :cond_1b
    move/from16 v28, v1

    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_1a

    move/from16 v1, p14

    invoke-virtual {v0, v1}, Li0/h0;->g(Z)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/16 v32, 0x800

    goto :goto_13

    :cond_1c
    const/16 v32, 0x400

    :goto_13
    or-int v6, v6, v32

    :goto_14
    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_1e

    or-int/lit16 v6, v6, 0x6000

    move/from16 v32, v1

    :cond_1d
    move/from16 v1, p15

    goto :goto_15

    :cond_1e
    move/from16 v32, v1

    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_1d

    move/from16 v1, p15

    invoke-virtual {v0, v1}, Li0/h0;->d(I)Z

    move-result v33

    if-eqz v33, :cond_1f

    move/from16 v19, v20

    :cond_1f
    or-int v6, v6, v19

    :goto_15
    or-int v19, v6, v21

    const/high16 v20, 0x10000

    and-int v20, v3, v20

    if-eqz v20, :cond_21

    or-int v19, v6, v26

    :cond_20
    move-object/from16 v6, p17

    goto :goto_16

    :cond_21
    and-int v6, v2, v27

    if-nez v6, :cond_20

    move-object/from16 v6, p17

    invoke-virtual {v0, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_22

    move/from16 v24, v25

    :cond_22
    or-int v19, v19, v24

    :goto_16
    and-int v21, v2, v31

    const/high16 v24, 0x20000

    if-nez v21, :cond_24

    and-int v21, v3, v24

    move-object/from16 v1, p18

    if-nez v21, :cond_23

    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_23

    move/from16 v29, v30

    :cond_23
    or-int v19, v19, v29

    goto :goto_17

    :cond_24
    move-object/from16 v1, p18

    :goto_17
    const v21, 0x12492493

    and-int v1, v22, v21

    const v2, 0x12492492

    const/4 v3, 0x0

    const/16 v21, 0x1

    if-ne v1, v2, :cond_26

    const v1, 0x492493

    and-int v1, v19, v1

    const v2, 0x492492

    if-eq v1, v2, :cond_25

    goto :goto_18

    :cond_25
    move v1, v3

    goto :goto_19

    :cond_26
    :goto_18
    move/from16 v1, v21

    :goto_19
    and-int/lit8 v2, v22, 0x1

    invoke-virtual {v0, v2, v1}, Li0/h0;->S(IZ)Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-virtual {v0}, Li0/h0;->X()V

    and-int/lit8 v1, p20, 0x1

    const v2, -0x1c00001

    if-eqz v1, :cond_2a

    invoke-virtual {v0}, Li0/h0;->B()Z

    move-result v1

    if-eqz v1, :cond_27

    goto :goto_1a

    .line 2
    :cond_27
    invoke-virtual {v0}, Li0/h0;->V()V

    and-int v1, p22, v24

    if-eqz v1, :cond_28

    and-int v19, v19, v2

    :cond_28
    move-object/from16 v1, p1

    move-wide/from16 v25, p2

    move-wide/from16 v29, p8

    move/from16 v7, p13

    move/from16 v12, p14

    move/from16 v14, p15

    move/from16 v21, p16

    :cond_29
    move-object/from16 v8, p18

    goto :goto_20

    :cond_2a
    :goto_1a
    if-eqz v8, :cond_2b

    .line 3
    sget-object v1, Ly0/l;->a:Ly0/l;

    goto :goto_1b

    :cond_2b
    move-object/from16 v1, p1

    :goto_1b
    if-eqz v12, :cond_2c

    .line 4
    sget-wide v25, Lf1/w;->g:J

    goto :goto_1c

    :cond_2c
    move-wide/from16 v25, p2

    :goto_1c
    if-eqz v18, :cond_2d

    .line 5
    sget-wide v10, Lu2/o;->c:J

    :cond_2d
    const/4 v8, 0x0

    if-eqz v23, :cond_2e

    move-object v9, v8

    :cond_2e
    if-eqz v7, :cond_2f

    move-object v13, v8

    .line 6
    :cond_2f
    sget-wide v29, Lu2/o;->c:J

    if-eqz v14, :cond_30

    move-object v15, v8

    :cond_30
    if-eqz v16, :cond_31

    move-wide/from16 v4, v29

    :cond_31
    if-eqz v17, :cond_32

    move/from16 v7, v21

    goto :goto_1d

    :cond_32
    move/from16 v7, p13

    :goto_1d
    if-eqz v28, :cond_33

    move/from16 v12, v21

    goto :goto_1e

    :cond_33
    move/from16 v12, p14

    :goto_1e
    if-eqz v32, :cond_34

    const v14, 0x7fffffff

    goto :goto_1f

    :cond_34
    move/from16 v14, p15

    :goto_1f
    if-eqz v20, :cond_35

    move-object v6, v8

    :cond_35
    and-int v8, p22, v24

    if-eqz v8, :cond_29

    .line 7
    sget-object v8, Lbi/m;->a:Li0/m2;

    .line 8
    invoke-virtual {v0, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbi/l;

    .line 9
    iget-object v8, v8, Lbi/l;->a:Li0/j1;

    .line 10
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li2/n0;

    and-int v19, v19, v2

    .line 11
    :goto_20
    invoke-virtual {v0}, Li0/h0;->q()V

    const v2, 0x1f155d14

    .line 12
    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    const-wide/16 v16, 0x10

    cmp-long v2, v25, v16

    if-eqz v2, :cond_36

    move-object/from16 p14, v1

    move-wide/from16 v23, v25

    goto :goto_22

    :cond_36
    const v2, 0x1f156019

    invoke-virtual {v0, v2}, Li0/h0;->a0(I)V

    invoke-virtual {v8}, Li2/n0;->a()J

    move-result-wide v23

    cmp-long v2, v23, v16

    if-eqz v2, :cond_37

    move-object/from16 p14, v1

    goto :goto_21

    .line 13
    :cond_37
    sget-object v2, Lbi/f;->a:Li0/u;

    .line 14
    invoke-virtual {v0, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    move-result-object v2

    .line 15
    check-cast v2, Lf1/w;

    move-object/from16 p14, v1

    .line 16
    iget-wide v1, v2, Lf1/w;->a:J

    move-wide/from16 v23, v1

    .line 17
    :goto_21
    invoke-virtual {v0, v3}, Li0/h0;->p(Z)V

    :goto_22
    invoke-virtual {v0, v3}, Li0/h0;->p(Z)V

    if-eqz v15, :cond_38

    .line 18
    iget v3, v15, Lt2/k;->a:I

    :cond_38
    const v1, 0xfd6f50

    move/from16 p13, v1

    move/from16 p10, v3

    move-wide/from16 p11, v4

    move-object/from16 p1, v8

    move-object/from16 p6, v9

    move-wide/from16 p4, v10

    move-object/from16 p7, v13

    move-wide/from16 p2, v23

    move-wide/from16 p8, v29

    .line 19
    invoke-static/range {p1 .. p13}, Li2/n0;->c(Li2/n0;JJLm2/k;Lm2/p;JIJI)Li2/n0;

    move-result-object v1

    and-int/lit8 v2, v22, 0x7e

    shr-int/lit8 v3, v19, 0x9

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v19, 0x6

    const v16, 0xe000

    and-int v16, v3, v16

    or-int v2, v2, v16

    const/high16 v16, 0x70000

    and-int v16, v3, v16

    or-int v2, v2, v16

    const/high16 v16, 0x380000

    and-int v16, v3, v16

    or-int v2, v2, v16

    const/high16 v16, 0x1c00000

    and-int v3, v3, v16

    or-int/2addr v2, v3

    shl-int/lit8 v3, v22, 0x12

    const/high16 v16, 0x70000000

    and-int v3, v3, v16

    or-int/2addr v2, v3

    const/16 v3, 0x100

    move-object/from16 p1, p0

    move-object/from16 p2, p14

    move-object/from16 p9, v0

    move-object/from16 p3, v1

    move/from16 p10, v2

    move/from16 p11, v3

    move-object/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v12

    move/from16 p7, v14

    move/from16 p8, v21

    .line 20
    invoke-static/range {p1 .. p11}, Lw/s;->b(Ljava/lang/String;Ly0/o;Li2/n0;Lfg/l;IZIILi0/h0;II)V

    move-object/from16 v1, p2

    move-object v2, v1

    move-object/from16 v18, v6

    move-object/from16 v19, v8

    move-object v8, v13

    move/from16 v16, v14

    move/from16 v17, v21

    move v14, v7

    move-object v7, v9

    move-object v3, v15

    move v15, v12

    move-wide v12, v4

    move-wide v5, v10

    move-object v11, v3

    move-wide/from16 v9, v29

    move-wide/from16 v3, v25

    goto :goto_23

    .line 21
    :cond_39
    invoke-virtual/range {p19 .. p19}, Li0/h0;->V()V

    move-object/from16 v2, p1

    move/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v19, p18

    move-object/from16 v18, v6

    move-object v7, v9

    move-object v8, v13

    move-wide v12, v4

    move-wide v5, v10

    move-object v11, v15

    move-wide/from16 v3, p2

    move-wide/from16 v9, p8

    move/from16 v15, p14

    .line 22
    :goto_23
    invoke-virtual/range {p19 .. p19}, Li0/h0;->t()Li0/r1;

    move-result-object v0

    if-eqz v0, :cond_3a

    move-object v1, v0

    new-instance v0, Lsh/r1;

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    move-object/from16 v36, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v22}, Lsh/r1;-><init>(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;III)V

    move-object/from16 v1, v36

    .line 23
    iput-object v0, v1, Li0/r1;->d:Lfg/p;

    :cond_3a
    return-void
.end method

.method public static final o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V
    .locals 21

    .line 1
    move-object/from16 v11, p9

    .line 2
    .line 3
    move/from16 v0, p11

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    and-int/lit8 v1, v0, 0x4

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v1, p2

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v2, v0, 0x8

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v2, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v4, v0, 0x10

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    sget v4, Lsh/c;->c:F

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move/from16 v4, p4

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v5, v0, 0x20

    .line 35
    .line 36
    if-eqz v5, :cond_3

    .line 37
    .line 38
    sget v5, Lsh/c;->a:F

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move/from16 v5, p5

    .line 42
    .line 43
    :goto_3
    and-int/lit8 v6, v0, 0x40

    .line 44
    .line 45
    if-eqz v6, :cond_4

    .line 46
    .line 47
    sget v6, Lsh/c;->b:F

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move/from16 v6, p6

    .line 51
    .line 52
    :goto_4
    and-int/lit16 v7, v0, 0x80

    .line 53
    .line 54
    sget-object v8, Li0/l;->a:Li0/e;

    .line 55
    .line 56
    if-eqz v7, :cond_7

    .line 57
    .line 58
    sget v7, Lsh/c;->a:F

    .line 59
    .line 60
    sget-object v7, Lbi/d;->a:Li0/m2;

    .line 61
    .line 62
    invoke-virtual {v11, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, Lbi/b;

    .line 67
    .line 68
    invoke-virtual {v9}, Lbi/b;->k()J

    .line 69
    .line 70
    .line 71
    move-result-wide v13

    .line 72
    invoke-virtual {v11, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    check-cast v9, Lbi/b;

    .line 77
    .line 78
    iget-object v9, v9, Lbi/b;->v:Li0/j1;

    .line 79
    .line 80
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    check-cast v9, Lf1/w;

    .line 85
    .line 86
    iget-wide v9, v9, Lf1/w;->a:J

    .line 87
    .line 88
    invoke-virtual {v11, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    check-cast v12, Lbi/b;

    .line 93
    .line 94
    move/from16 p3, v4

    .line 95
    .line 96
    invoke-virtual {v12}, Lbi/b;->f()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    invoke-virtual {v11, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, Lbi/b;

    .line 105
    .line 106
    move/from16 p4, v5

    .line 107
    .line 108
    move/from16 p5, v6

    .line 109
    .line 110
    invoke-virtual {v7}, Lbi/b;->c()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    invoke-virtual {v11, v13, v14}, Li0/h0;->e(J)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-virtual {v11, v9, v10}, Li0/h0;->e(J)Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    or-int/2addr v7, v12

    .line 123
    invoke-virtual {v11, v3, v4}, Li0/h0;->e(J)Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    or-int/2addr v7, v12

    .line 128
    invoke-virtual {v11, v5, v6}, Li0/h0;->e(J)Z

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    or-int/2addr v7, v12

    .line 133
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    if-nez v7, :cond_5

    .line 138
    .line 139
    if-ne v12, v8, :cond_6

    .line 140
    .line 141
    :cond_5
    new-instance v12, Lsh/q1;

    .line 142
    .line 143
    move-wide/from16 v17, v3

    .line 144
    .line 145
    move-wide/from16 v19, v5

    .line 146
    .line 147
    move-wide v15, v9

    .line 148
    invoke-direct/range {v12 .. v20}, Lsh/q1;-><init>(JJJJ)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    move-object v3, v12

    .line 155
    check-cast v3, Lsh/q1;

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    move/from16 p3, v4

    .line 159
    .line 160
    move/from16 p4, v5

    .line 161
    .line 162
    move/from16 p5, v6

    .line 163
    .line 164
    move-object/from16 v3, p7

    .line 165
    .line 166
    :goto_5
    and-int/lit16 v0, v0, 0x100

    .line 167
    .line 168
    if-eqz v0, :cond_8

    .line 169
    .line 170
    sget-object v0, Lsh/c;->d:Lp/z0;

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    move-object/from16 v0, p8

    .line 174
    .line 175
    :goto_6
    sget-object v4, Lk/v0;->a:Li0/u;

    .line 176
    .line 177
    invoke-virtual {v11, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    move-object v9, v4

    .line 182
    check-cast v9, Lk/y0;

    .line 183
    .line 184
    iget-wide v4, v3, Lsh/q1;->a:J

    .line 185
    .line 186
    iget-wide v6, v3, Lsh/q1;->b:J

    .line 187
    .line 188
    iget-wide v12, v3, Lsh/q1;->c:J

    .line 189
    .line 190
    iget-wide v14, v3, Lsh/q1;->d:J

    .line 191
    .line 192
    new-instance v3, Lsh/d;

    .line 193
    .line 194
    const/4 v10, 0x0

    .line 195
    move/from16 v16, v2

    .line 196
    .line 197
    move-object/from16 v2, p0

    .line 198
    .line 199
    invoke-direct {v3, v2, v10}, Lsh/d;-><init>(Ljava/lang/String;I)V

    .line 200
    .line 201
    .line 202
    const v2, -0x53ad778b

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v3, v11}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    shr-int/lit8 v3, p10, 0x3

    .line 210
    .line 211
    const v10, 0xfc7fffe

    .line 212
    .line 213
    .line 214
    and-int/2addr v10, v3

    .line 215
    shr-int/lit8 v10, v10, 0x9

    .line 216
    .line 217
    and-int/lit8 v10, v10, 0xe

    .line 218
    .line 219
    move/from16 p0, v3

    .line 220
    .line 221
    move/from16 v3, p3

    .line 222
    .line 223
    invoke-static {v3, v11, v10}, Lbi/k;->b(FLi0/h0;I)Lf1/r0;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    if-ne v10, v8, :cond_9

    .line 232
    .line 233
    new-instance v10, Lr9/p;

    .line 234
    .line 235
    const/4 v8, 0x1

    .line 236
    invoke-direct {v10, v8}, Lr9/p;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_9
    check-cast v10, Lfg/l;

    .line 243
    .line 244
    invoke-static {v1, v10}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    if-eqz v16, :cond_a

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_a
    move-wide v4, v6

    .line 252
    :goto_7
    if-eqz v16, :cond_b

    .line 253
    .line 254
    move-wide v6, v12

    .line 255
    goto :goto_8

    .line 256
    :cond_b
    move-wide v6, v14

    .line 257
    :goto_8
    new-instance v8, Lsh/e;

    .line 258
    .line 259
    move/from16 v10, p4

    .line 260
    .line 261
    move/from16 v12, p5

    .line 262
    .line 263
    invoke-direct {v8, v10, v12, v0, v2}, Lsh/e;-><init>(FFLp/x0;Ls0/d;)V

    .line 264
    .line 265
    .line 266
    const v0, -0x71d537

    .line 267
    .line 268
    .line 269
    invoke-static {v0, v8, v11}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    const v0, 0xe00038e

    .line 274
    .line 275
    .line 276
    and-int v12, p0, v0

    .line 277
    .line 278
    const/4 v8, 0x0

    .line 279
    move-object/from16 v0, p1

    .line 280
    .line 281
    move/from16 v2, v16

    .line 282
    .line 283
    invoke-static/range {v0 .. v12}, Lsh/s;->k(Lfg/a;Ly0/o;ZLf1/r0;JJFLk/y0;Ls0/d;Li0/h0;I)V

    .line 284
    .line 285
    .line 286
    return-void
.end method

.method public static final p(Ljava/lang/String;Ly0/o;JJLjava/lang/String;JLs0/d;Lfg/q;Lsh/x;FLi0/h0;I)V
    .locals 31

    .line 1
    move-object/from16 v11, p10

    .line 2
    .line 3
    move-object/from16 v12, p11

    .line 4
    .line 5
    move-object/from16 v0, p13

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v1, 0x24f0a145

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x2

    .line 27
    :goto_0
    or-int v2, p14, v2

    .line 28
    .line 29
    or-int/lit16 v2, v2, 0x4b0

    .line 30
    .line 31
    move-object/from16 v7, p6

    .line 32
    .line 33
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/16 v3, 0x4000

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v3, 0x2000

    .line 43
    .line 44
    :goto_1
    or-int/2addr v2, v3

    .line 45
    const/high16 v3, 0x10000

    .line 46
    .line 47
    or-int/2addr v2, v3

    .line 48
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const/high16 v3, 0x800000

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/high16 v3, 0x400000

    .line 58
    .line 59
    :goto_2
    or-int/2addr v2, v3

    .line 60
    invoke-virtual {v0, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const/high16 v4, 0x4000000

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    move v3, v4

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    const/high16 v3, 0x2000000

    .line 71
    .line 72
    :goto_3
    or-int/2addr v2, v3

    .line 73
    const v3, 0x12492493

    .line 74
    .line 75
    .line 76
    and-int/2addr v3, v2

    .line 77
    const v5, 0x12492492

    .line 78
    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v8, 0x1

    .line 82
    if-ne v3, v5, :cond_4

    .line 83
    .line 84
    move v3, v6

    .line 85
    goto :goto_4

    .line 86
    :cond_4
    move v3, v8

    .line 87
    :goto_4
    and-int/lit8 v5, v2, 0x1

    .line 88
    .line 89
    invoke-virtual {v0, v5, v3}, Li0/h0;->S(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_f

    .line 94
    .line 95
    invoke-virtual {v0}, Li0/h0;->X()V

    .line 96
    .line 97
    .line 98
    and-int/lit8 v3, p14, 0x1

    .line 99
    .line 100
    const v5, -0x71f81

    .line 101
    .line 102
    .line 103
    if-eqz v3, :cond_6

    .line 104
    .line 105
    invoke-virtual {v0}, Li0/h0;->B()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_5

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_5
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 113
    .line 114
    .line 115
    and-int/2addr v2, v5

    .line 116
    move-object/from16 v26, p1

    .line 117
    .line 118
    move-wide/from16 v14, p2

    .line 119
    .line 120
    move-wide/from16 v16, p4

    .line 121
    .line 122
    move-wide/from16 v18, p7

    .line 123
    .line 124
    move/from16 v22, p12

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_6
    :goto_5
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 128
    .line 129
    invoke-virtual {v0, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    check-cast v9, Lbi/b;

    .line 134
    .line 135
    invoke-virtual {v9}, Lbi/b;->l()J

    .line 136
    .line 137
    .line 138
    move-result-wide v9

    .line 139
    invoke-virtual {v0, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    check-cast v13, Lbi/b;

    .line 144
    .line 145
    invoke-virtual {v13}, Lbi/b;->g()J

    .line 146
    .line 147
    .line 148
    move-result-wide v13

    .line 149
    invoke-virtual {v0, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Lbi/b;

    .line 154
    .line 155
    invoke-virtual {v3}, Lbi/b;->g()J

    .line 156
    .line 157
    .line 158
    move-result-wide v15

    .line 159
    and-int/2addr v2, v5

    .line 160
    sget v3, Lsh/s1;->a:F

    .line 161
    .line 162
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 163
    .line 164
    move/from16 v22, v3

    .line 165
    .line 166
    move-object/from16 v26, v5

    .line 167
    .line 168
    move-wide/from16 v18, v15

    .line 169
    .line 170
    move-wide/from16 v16, v13

    .line 171
    .line 172
    move-wide v14, v9

    .line 173
    :goto_6
    invoke-virtual {v0}, Li0/h0;->q()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    sget-object v5, Li0/l;->a:Li0/e;

    .line 181
    .line 182
    if-ne v3, v5, :cond_7

    .line 183
    .line 184
    new-instance v3, Li0/g1;

    .line 185
    .line 186
    invoke-direct {v3, v6}, Li0/g1;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_7
    check-cast v3, Li0/g1;

    .line 193
    .line 194
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    if-ne v9, v5, :cond_8

    .line 199
    .line 200
    new-instance v9, Li/e0;

    .line 201
    .line 202
    const/16 v10, 0x15

    .line 203
    .line 204
    invoke-direct {v9, v3, v10}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    invoke-static {v9}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-virtual {v0, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    check-cast v9, Li0/l2;

    .line 215
    .line 216
    const/high16 v10, 0xe000000

    .line 217
    .line 218
    and-int/2addr v10, v2

    .line 219
    if-ne v10, v4, :cond_9

    .line 220
    .line 221
    move v13, v8

    .line 222
    goto :goto_7

    .line 223
    :cond_9
    move v13, v6

    .line 224
    :goto_7
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    if-nez v13, :cond_a

    .line 229
    .line 230
    if-ne v6, v5, :cond_b

    .line 231
    .line 232
    :cond_a
    new-instance v6, Lsh/v1;

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    invoke-direct {v6, v12, v13, v9}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_b
    check-cast v6, Lfg/a;

    .line 242
    .line 243
    invoke-static {v6, v0}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 244
    .line 245
    .line 246
    new-instance v6, Lb0/t;

    .line 247
    .line 248
    const/16 v13, 0x14

    .line 249
    .line 250
    invoke-direct {v6, v11, v13}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 251
    .line 252
    .line 253
    const v13, 0x4440991c

    .line 254
    .line 255
    .line 256
    invoke-static {v13, v6, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 257
    .line 258
    .line 259
    move-result-object v21

    .line 260
    if-ne v10, v4, :cond_c

    .line 261
    .line 262
    move v6, v8

    .line 263
    goto :goto_8

    .line 264
    :cond_c
    const/4 v6, 0x0

    .line 265
    :goto_8
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    if-nez v6, :cond_d

    .line 270
    .line 271
    if-ne v4, v5, :cond_e

    .line 272
    .line 273
    :cond_d
    new-instance v4, Lsh/w1;

    .line 274
    .line 275
    invoke-direct {v4, v12}, Lsh/w1;-><init>(Lsh/x;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :cond_e
    move-object/from16 v23, v4

    .line 282
    .line 283
    check-cast v23, Lsh/w1;

    .line 284
    .line 285
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    check-cast v4, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 292
    .line 293
    .line 294
    move-result v24

    .line 295
    and-int/lit8 v4, v2, 0xe

    .line 296
    .line 297
    const v5, 0x301b6000

    .line 298
    .line 299
    .line 300
    or-int v29, v4, v5

    .line 301
    .line 302
    shr-int/lit8 v2, v2, 0x9

    .line 303
    .line 304
    and-int/lit8 v2, v2, 0x70

    .line 305
    .line 306
    or-int/lit16 v2, v2, 0x186

    .line 307
    .line 308
    move-object/from16 v20, p9

    .line 309
    .line 310
    move-object/from16 v28, v0

    .line 311
    .line 312
    move-object v13, v1

    .line 313
    move/from16 v30, v2

    .line 314
    .line 315
    move-object/from16 v25, v3

    .line 316
    .line 317
    move-object/from16 v27, v7

    .line 318
    .line 319
    invoke-static/range {v13 .. v30}, Lsh/s;->q(Ljava/lang/String;JJJLs0/d;Ls0/d;FLsh/w1;FLi0/a1;Ly0/o;Ljava/lang/String;Li0/h0;II)V

    .line 320
    .line 321
    .line 322
    move-wide v3, v14

    .line 323
    move-wide/from16 v5, v16

    .line 324
    .line 325
    move-wide/from16 v8, v18

    .line 326
    .line 327
    move/from16 v13, v22

    .line 328
    .line 329
    move-object/from16 v2, v26

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_f
    invoke-virtual/range {p13 .. p13}, Li0/h0;->V()V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, p1

    .line 336
    .line 337
    move-wide/from16 v3, p2

    .line 338
    .line 339
    move-wide/from16 v5, p4

    .line 340
    .line 341
    move-wide/from16 v8, p7

    .line 342
    .line 343
    move/from16 v13, p12

    .line 344
    .line 345
    :goto_9
    invoke-virtual/range {p13 .. p13}, Li0/h0;->t()Li0/r1;

    .line 346
    .line 347
    .line 348
    move-result-object v15

    .line 349
    if-eqz v15, :cond_10

    .line 350
    .line 351
    new-instance v0, Lsh/x1;

    .line 352
    .line 353
    move-object/from16 v1, p0

    .line 354
    .line 355
    move-object/from16 v7, p6

    .line 356
    .line 357
    move-object/from16 v10, p9

    .line 358
    .line 359
    move/from16 v14, p14

    .line 360
    .line 361
    invoke-direct/range {v0 .. v14}, Lsh/x1;-><init>(Ljava/lang/String;Ly0/o;JJLjava/lang/String;JLs0/d;Lfg/q;Lsh/x;FI)V

    .line 362
    .line 363
    .line 364
    iput-object v0, v15, Li0/r1;->d:Lfg/p;

    .line 365
    .line 366
    :cond_10
    return-void
.end method

.method public static final q(Ljava/lang/String;JJJLs0/d;Ls0/d;FLsh/w1;FLi0/a1;Ly0/o;Ljava/lang/String;Li0/h0;II)V
    .locals 47

    .line 1
    move-wide/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v8, p7

    .line 4
    .line 5
    move-object/from16 v9, p8

    .line 6
    .line 7
    move/from16 v10, p9

    .line 8
    .line 9
    move-object/from16 v11, p10

    .line 10
    .line 11
    move/from16 v12, p11

    .line 12
    .line 13
    move-object/from16 v13, p12

    .line 14
    .line 15
    move-object/from16 v14, p13

    .line 16
    .line 17
    move-object/from16 v0, p15

    .line 18
    .line 19
    move/from16 v1, p16

    .line 20
    .line 21
    move/from16 v4, p17

    .line 22
    .line 23
    const v5, -0x4409d059

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v5}, Li0/h0;->b0(I)Li0/h0;

    .line 27
    .line 28
    .line 29
    and-int/lit8 v5, v1, 0x6

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    move-object/from16 v5, p0

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v15

    .line 39
    if-eqz v15, :cond_0

    .line 40
    .line 41
    const/4 v15, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v15, 0x2

    .line 44
    :goto_0
    or-int/2addr v15, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object/from16 v5, p0

    .line 47
    .line 48
    move v15, v1

    .line 49
    :goto_1
    and-int/lit8 v16, v1, 0x30

    .line 50
    .line 51
    const/16 v17, 0x20

    .line 52
    .line 53
    if-nez v16, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v2, v3}, Li0/h0;->e(J)Z

    .line 56
    .line 57
    .line 58
    move-result v16

    .line 59
    if-eqz v16, :cond_2

    .line 60
    .line 61
    move/from16 v16, v17

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/16 v16, 0x10

    .line 65
    .line 66
    :goto_2
    or-int v15, v15, v16

    .line 67
    .line 68
    :cond_3
    and-int/lit16 v7, v1, 0x180

    .line 69
    .line 70
    const/16 v16, 0x80

    .line 71
    .line 72
    const/16 v19, 0x100

    .line 73
    .line 74
    if-nez v7, :cond_5

    .line 75
    .line 76
    move-wide/from16 v6, p3

    .line 77
    .line 78
    invoke-virtual {v0, v6, v7}, Li0/h0;->e(J)Z

    .line 79
    .line 80
    .line 81
    move-result v20

    .line 82
    if-eqz v20, :cond_4

    .line 83
    .line 84
    move/from16 v20, v19

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    move/from16 v20, v16

    .line 88
    .line 89
    :goto_3
    or-int v15, v15, v20

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    move-wide/from16 v6, p3

    .line 93
    .line 94
    :goto_4
    and-int/lit16 v5, v1, 0xc00

    .line 95
    .line 96
    if-nez v5, :cond_7

    .line 97
    .line 98
    move-wide/from16 v5, p5

    .line 99
    .line 100
    invoke-virtual {v0, v5, v6}, Li0/h0;->e(J)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_6

    .line 105
    .line 106
    const/16 v7, 0x800

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_6
    const/16 v7, 0x400

    .line 110
    .line 111
    :goto_5
    or-int/2addr v15, v7

    .line 112
    goto :goto_6

    .line 113
    :cond_7
    move-wide/from16 v5, p5

    .line 114
    .line 115
    :goto_6
    and-int/lit16 v7, v1, 0x6000

    .line 116
    .line 117
    if-nez v7, :cond_9

    .line 118
    .line 119
    invoke-virtual {v0, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_8

    .line 124
    .line 125
    const/16 v7, 0x4000

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_8
    const/16 v7, 0x2000

    .line 129
    .line 130
    :goto_7
    or-int/2addr v15, v7

    .line 131
    :cond_9
    const/high16 v7, 0x30000

    .line 132
    .line 133
    and-int/2addr v7, v1

    .line 134
    if-nez v7, :cond_b

    .line 135
    .line 136
    invoke-virtual {v0, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_a

    .line 141
    .line 142
    const/high16 v7, 0x20000

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_a
    const/high16 v7, 0x10000

    .line 146
    .line 147
    :goto_8
    or-int/2addr v15, v7

    .line 148
    :cond_b
    const/high16 v7, 0x180000

    .line 149
    .line 150
    and-int v20, v1, v7

    .line 151
    .line 152
    if-nez v20, :cond_d

    .line 153
    .line 154
    invoke-virtual {v0, v10}, Li0/h0;->c(F)Z

    .line 155
    .line 156
    .line 157
    move-result v20

    .line 158
    if-eqz v20, :cond_c

    .line 159
    .line 160
    const/high16 v20, 0x100000

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_c
    const/high16 v20, 0x80000

    .line 164
    .line 165
    :goto_9
    or-int v15, v15, v20

    .line 166
    .line 167
    :cond_d
    const/high16 v20, 0xc00000

    .line 168
    .line 169
    and-int v20, v1, v20

    .line 170
    .line 171
    move/from16 v38, v7

    .line 172
    .line 173
    const/high16 v22, 0x1000000

    .line 174
    .line 175
    if-nez v20, :cond_10

    .line 176
    .line 177
    and-int v20, v1, v22

    .line 178
    .line 179
    if-nez v20, :cond_e

    .line 180
    .line 181
    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v20

    .line 185
    goto :goto_a

    .line 186
    :cond_e
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v20

    .line 190
    :goto_a
    if-eqz v20, :cond_f

    .line 191
    .line 192
    const/high16 v20, 0x800000

    .line 193
    .line 194
    goto :goto_b

    .line 195
    :cond_f
    const/high16 v20, 0x400000

    .line 196
    .line 197
    :goto_b
    or-int v15, v15, v20

    .line 198
    .line 199
    :cond_10
    const/high16 v20, 0x6000000

    .line 200
    .line 201
    and-int v20, v1, v20

    .line 202
    .line 203
    if-nez v20, :cond_12

    .line 204
    .line 205
    invoke-virtual {v0, v12}, Li0/h0;->c(F)Z

    .line 206
    .line 207
    .line 208
    move-result v20

    .line 209
    if-eqz v20, :cond_11

    .line 210
    .line 211
    const/high16 v20, 0x4000000

    .line 212
    .line 213
    goto :goto_c

    .line 214
    :cond_11
    const/high16 v20, 0x2000000

    .line 215
    .line 216
    :goto_c
    or-int v15, v15, v20

    .line 217
    .line 218
    :cond_12
    const/high16 v20, 0x30000000

    .line 219
    .line 220
    and-int v20, v1, v20

    .line 221
    .line 222
    if-nez v20, :cond_14

    .line 223
    .line 224
    invoke-virtual {v0, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v20

    .line 228
    if-eqz v20, :cond_13

    .line 229
    .line 230
    const/high16 v20, 0x20000000

    .line 231
    .line 232
    goto :goto_d

    .line 233
    :cond_13
    const/high16 v20, 0x10000000

    .line 234
    .line 235
    :goto_d
    or-int v15, v15, v20

    .line 236
    .line 237
    :cond_14
    move/from16 v39, v15

    .line 238
    .line 239
    and-int/lit8 v15, v4, 0x6

    .line 240
    .line 241
    if-nez v15, :cond_16

    .line 242
    .line 243
    invoke-virtual {v0, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    if-eqz v15, :cond_15

    .line 248
    .line 249
    const/16 v18, 0x4

    .line 250
    .line 251
    goto :goto_e

    .line 252
    :cond_15
    const/16 v18, 0x2

    .line 253
    .line 254
    :goto_e
    or-int v15, v4, v18

    .line 255
    .line 256
    goto :goto_f

    .line 257
    :cond_16
    move v15, v4

    .line 258
    :goto_f
    and-int/lit8 v18, v4, 0x30

    .line 259
    .line 260
    move-object/from16 v7, p14

    .line 261
    .line 262
    if-nez v18, :cond_18

    .line 263
    .line 264
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v18

    .line 268
    if-eqz v18, :cond_17

    .line 269
    .line 270
    goto :goto_10

    .line 271
    :cond_17
    const/16 v17, 0x10

    .line 272
    .line 273
    :goto_10
    or-int v15, v15, v17

    .line 274
    .line 275
    :cond_18
    and-int/lit16 v1, v4, 0x180

    .line 276
    .line 277
    move/from16 v17, v1

    .line 278
    .line 279
    const/4 v1, 0x1

    .line 280
    if-nez v17, :cond_1a

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Li0/h0;->g(Z)Z

    .line 283
    .line 284
    .line 285
    move-result v17

    .line 286
    if-eqz v17, :cond_19

    .line 287
    .line 288
    move/from16 v16, v19

    .line 289
    .line 290
    :cond_19
    or-int v15, v15, v16

    .line 291
    .line 292
    :cond_1a
    const v16, 0x12492493

    .line 293
    .line 294
    .line 295
    and-int v1, v39, v16

    .line 296
    .line 297
    const v4, 0x12492492

    .line 298
    .line 299
    .line 300
    if-ne v1, v4, :cond_1c

    .line 301
    .line 302
    and-int/lit16 v1, v15, 0x93

    .line 303
    .line 304
    const/16 v4, 0x92

    .line 305
    .line 306
    if-eq v1, v4, :cond_1b

    .line 307
    .line 308
    goto :goto_11

    .line 309
    :cond_1b
    const/4 v1, 0x0

    .line 310
    goto :goto_12

    .line 311
    :cond_1c
    :goto_11
    const/4 v1, 0x1

    .line 312
    :goto_12
    and-int/lit8 v4, v39, 0x1

    .line 313
    .line 314
    invoke-virtual {v0, v4, v1}, Li0/h0;->S(IZ)Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eqz v1, :cond_41

    .line 319
    .line 320
    invoke-virtual {v0}, Li0/h0;->X()V

    .line 321
    .line 322
    .line 323
    and-int/lit8 v1, p16, 0x1

    .line 324
    .line 325
    if-eqz v1, :cond_1e

    .line 326
    .line 327
    invoke-virtual {v0}, Li0/h0;->B()Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_1d

    .line 332
    .line 333
    goto :goto_13

    .line 334
    :cond_1d
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 335
    .line 336
    .line 337
    :cond_1e
    :goto_13
    invoke-virtual {v0}, Li0/h0;->q()V

    .line 338
    .line 339
    .line 340
    const/high16 v1, 0x1c00000

    .line 341
    .line 342
    and-int v1, v39, v1

    .line 343
    .line 344
    const/high16 v4, 0x800000

    .line 345
    .line 346
    if-eq v1, v4, :cond_20

    .line 347
    .line 348
    and-int v4, v39, v22

    .line 349
    .line 350
    if-eqz v4, :cond_1f

    .line 351
    .line 352
    invoke-virtual {v0, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_1f

    .line 357
    .line 358
    goto :goto_14

    .line 359
    :cond_1f
    const/4 v4, 0x0

    .line 360
    goto :goto_15

    .line 361
    :cond_20
    :goto_14
    const/4 v4, 0x1

    .line 362
    :goto_15
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    sget-object v5, Li0/l;->a:Li0/e;

    .line 367
    .line 368
    if-nez v4, :cond_21

    .line 369
    .line 370
    if-ne v6, v5, :cond_22

    .line 371
    .line 372
    :cond_21
    new-instance v4, Li/e0;

    .line 373
    .line 374
    const/16 v6, 0x16

    .line 375
    .line 376
    invoke-direct {v4, v11, v6}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 377
    .line 378
    .line 379
    invoke-static {v4}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-virtual {v0, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :cond_22
    check-cast v6, Li0/l2;

    .line 387
    .line 388
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    check-cast v4, Ljava/lang/Number;

    .line 393
    .line 394
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    invoke-virtual {v0, v4}, Li0/h0;->d(I)Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    move/from16 v16, v4

    .line 403
    .line 404
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    if-nez v16, :cond_23

    .line 409
    .line 410
    if-ne v4, v5, :cond_24

    .line 411
    .line 412
    :cond_23
    new-instance v4, Lsh/t1;

    .line 413
    .line 414
    const/4 v7, 0x0

    .line 415
    invoke-direct {v4, v12, v6, v7}, Lsh/t1;-><init>(FLi0/l2;I)V

    .line 416
    .line 417
    .line 418
    invoke-static {v4}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_24
    check-cast v4, Li0/l2;

    .line 426
    .line 427
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    check-cast v7, Ljava/lang/Number;

    .line 432
    .line 433
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    invoke-virtual {v0, v7}, Li0/h0;->d(I)Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    const/high16 v16, 0xe000000

    .line 442
    .line 443
    move-object/from16 v17, v4

    .line 444
    .line 445
    and-int v4, v39, v16

    .line 446
    .line 447
    move/from16 v16, v7

    .line 448
    .line 449
    const/high16 v7, 0x4000000

    .line 450
    .line 451
    if-ne v4, v7, :cond_25

    .line 452
    .line 453
    const/4 v7, 0x1

    .line 454
    goto :goto_16

    .line 455
    :cond_25
    const/4 v7, 0x0

    .line 456
    :goto_16
    or-int v7, v16, v7

    .line 457
    .line 458
    move/from16 v16, v7

    .line 459
    .line 460
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    if-nez v16, :cond_27

    .line 465
    .line 466
    if-ne v7, v5, :cond_26

    .line 467
    .line 468
    goto :goto_17

    .line 469
    :cond_26
    move/from16 v16, v15

    .line 470
    .line 471
    goto :goto_18

    .line 472
    :cond_27
    :goto_17
    new-instance v7, Lsh/t1;

    .line 473
    .line 474
    move/from16 v16, v15

    .line 475
    .line 476
    const/4 v15, 0x1

    .line 477
    invoke-direct {v7, v12, v6, v15}, Lsh/t1;-><init>(FLi0/l2;I)V

    .line 478
    .line 479
    .line 480
    invoke-static {v7}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    :goto_18
    check-cast v7, Li0/l2;

    .line 488
    .line 489
    invoke-interface/range {v17 .. v17}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v15

    .line 493
    check-cast v15, Ljava/lang/Number;

    .line 494
    .line 495
    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    .line 496
    .line 497
    .line 498
    move-result v15

    .line 499
    const/high16 v17, 0x3f800000    # 1.0f

    .line 500
    .line 501
    cmpl-float v15, v15, v17

    .line 502
    .line 503
    if-ltz v15, :cond_28

    .line 504
    .line 505
    const/4 v15, 0x1

    .line 506
    goto :goto_19

    .line 507
    :cond_28
    const/4 v15, 0x0

    .line 508
    :goto_19
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    move-object/from16 v41, v6

    .line 513
    .line 514
    const v6, 0x3c23d70a    # 0.01f

    .line 515
    .line 516
    .line 517
    move-object/from16 v42, v7

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    if-ne v13, v5, :cond_29

    .line 521
    .line 522
    invoke-static {v7, v6}, Li/d;->a(FF)Li/c;

    .line 523
    .line 524
    .line 525
    move-result-object v13

    .line 526
    invoke-virtual {v0, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    :cond_29
    check-cast v13, Li/c;

    .line 530
    .line 531
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v7

    .line 535
    if-ne v7, v5, :cond_2a

    .line 536
    .line 537
    const/high16 v7, 0x41a00000    # 20.0f

    .line 538
    .line 539
    invoke-static {v7, v6}, Li/d;->a(FF)Li/c;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_2a
    check-cast v7, Li/c;

    .line 547
    .line 548
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    invoke-virtual {v0, v15}, Li0/h0;->g(Z)Z

    .line 553
    .line 554
    .line 555
    move-result v17

    .line 556
    invoke-virtual {v0, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v18

    .line 560
    or-int v17, v17, v18

    .line 561
    .line 562
    invoke-virtual {v0, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v18

    .line 566
    or-int v17, v17, v18

    .line 567
    .line 568
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v9

    .line 572
    const/4 v10, 0x0

    .line 573
    if-nez v17, :cond_2b

    .line 574
    .line 575
    if-ne v9, v5, :cond_2c

    .line 576
    .line 577
    :cond_2b
    new-instance v9, Lsh/z1;

    .line 578
    .line 579
    invoke-direct {v9, v15, v13, v7, v10}, Lsh/z1;-><init>(ZLi/c;Li/c;Lwf/c;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    :cond_2c
    check-cast v9, Lfg/p;

    .line 586
    .line 587
    invoke-static {v9, v0, v6}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    const/16 v6, 0x32

    .line 591
    .line 592
    const/4 v9, 0x6

    .line 593
    invoke-static {v6, v9, v10}, Li/d;->p(IILi/v;)Li/l1;

    .line 594
    .line 595
    .line 596
    move-result-object v17

    .line 597
    shr-int/lit8 v15, v39, 0x6

    .line 598
    .line 599
    and-int/lit8 v15, v15, 0xe

    .line 600
    .line 601
    or-int/lit8 v19, v15, 0x30

    .line 602
    .line 603
    const/16 v20, 0xc

    .line 604
    .line 605
    move-object/from16 v18, v0

    .line 606
    .line 607
    move/from16 v0, v16

    .line 608
    .line 609
    move-wide/from16 v15, p3

    .line 610
    .line 611
    invoke-static/range {v15 .. v20}, Lh/y0;->a(JLi/y;Li0/h0;II)Li0/l2;

    .line 612
    .line 613
    .line 614
    move-result-object v25

    .line 615
    invoke-static {v6, v9, v10}, Li/d;->p(IILi/v;)Li/l1;

    .line 616
    .line 617
    .line 618
    move-result-object v17

    .line 619
    shr-int/lit8 v6, v39, 0x9

    .line 620
    .line 621
    and-int/lit8 v6, v6, 0xe

    .line 622
    .line 623
    or-int/lit8 v19, v6, 0x30

    .line 624
    .line 625
    move-wide/from16 v15, p5

    .line 626
    .line 627
    move-object/from16 v18, p15

    .line 628
    .line 629
    invoke-static/range {v15 .. v20}, Lh/y0;->a(JLi/y;Li0/h0;II)Li0/l2;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    move-object/from16 v10, v18

    .line 634
    .line 635
    sget-object v15, Lf1/c0;->b:Lf1/m0;

    .line 636
    .line 637
    sget-object v9, Ly0/l;->a:Ly0/l;

    .line 638
    .line 639
    invoke-static {v9, v2, v3, v15}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 640
    .line 641
    .line 642
    move-result-object v15

    .line 643
    invoke-interface {v14, v15}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 644
    .line 645
    .line 646
    move-result-object v15

    .line 647
    move/from16 v43, v0

    .line 648
    .line 649
    const v0, 0x4e32a952    # 7.4936026E8f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v10, v0}, Li0/h0;->a0(I)V

    .line 653
    .line 654
    .line 655
    sget-object v0, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 656
    .line 657
    invoke-static {v10}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    iget-object v0, v0, Lp/s1;->b:Lp/b;

    .line 662
    .line 663
    sget v2, Lp/d;->l:I

    .line 664
    .line 665
    new-instance v3, Lp/s0;

    .line 666
    .line 667
    invoke-direct {v3, v0, v2}, Lp/s0;-><init>(Lp/r1;I)V

    .line 668
    .line 669
    .line 670
    invoke-static {v9, v3}, Lp/d;->u(Ly0/o;Lp/s0;)Ly0/o;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v10}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    iget-object v3, v3, Lp/s1;->e:Lp/b;

    .line 679
    .line 680
    move-object/from16 v44, v6

    .line 681
    .line 682
    new-instance v6, Lp/s0;

    .line 683
    .line 684
    invoke-direct {v6, v3, v2}, Lp/s0;-><init>(Lp/r1;I)V

    .line 685
    .line 686
    .line 687
    invoke-static {v0, v6}, Lp/d;->u(Ly0/o;Lp/s0;)Ly0/o;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    const/4 v2, 0x0

    .line 692
    invoke-virtual {v10, v2}, Li0/h0;->p(Z)V

    .line 693
    .line 694
    .line 695
    invoke-interface {v15, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-static {v10}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    iget-object v2, v2, Lp/s1;->g:Lp/b;

    .line 704
    .line 705
    new-instance v3, Lp/s0;

    .line 706
    .line 707
    const/16 v6, 0x10

    .line 708
    .line 709
    invoke-direct {v3, v2, v6}, Lp/s0;-><init>(Lp/r1;I)V

    .line 710
    .line 711
    .line 712
    invoke-static {v0, v3}, Lp/d;->u(Ly0/o;Lp/s0;)Ly0/o;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-static {v0}, Lc1/h;->c(Ly0/o;)Ly0/o;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    if-ne v2, v5, :cond_2d

    .line 725
    .line 726
    sget-object v2, Lsh/a2;->a:Lsh/a2;

    .line 727
    .line 728
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    :cond_2d
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 732
    .line 733
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 734
    .line 735
    invoke-static {v0, v3, v2}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    const/high16 v2, 0x4000000

    .line 740
    .line 741
    if-ne v4, v2, :cond_2e

    .line 742
    .line 743
    const/4 v2, 0x1

    .line 744
    :goto_1a
    const/high16 v4, 0x800000

    .line 745
    .line 746
    goto :goto_1b

    .line 747
    :cond_2e
    const/4 v2, 0x0

    .line 748
    goto :goto_1a

    .line 749
    :goto_1b
    if-eq v1, v4, :cond_30

    .line 750
    .line 751
    and-int v1, v39, v22

    .line 752
    .line 753
    if-eqz v1, :cond_2f

    .line 754
    .line 755
    invoke-virtual {v10, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v1

    .line 759
    if-eqz v1, :cond_2f

    .line 760
    .line 761
    goto :goto_1c

    .line 762
    :cond_2f
    const/4 v1, 0x0

    .line 763
    goto :goto_1d

    .line 764
    :cond_30
    :goto_1c
    const/4 v1, 0x1

    .line 765
    :goto_1d
    or-int/2addr v1, v2

    .line 766
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    if-nez v1, :cond_31

    .line 771
    .line 772
    if-ne v2, v5, :cond_32

    .line 773
    .line 774
    :cond_31
    new-instance v2, Lsh/c2;

    .line 775
    .line 776
    invoke-direct {v2, v12, v11}, Lsh/c2;-><init>(FLsh/w1;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    :cond_32
    check-cast v2, Lv1/n0;

    .line 783
    .line 784
    iget-wide v3, v10, Li0/h0;->T:J

    .line 785
    .line 786
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 787
    .line 788
    .line 789
    move-result v1

    .line 790
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    invoke-static {v10, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    sget-object v4, Lx1/g;->f:Lx1/f;

    .line 799
    .line 800
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    sget-object v4, Lx1/f;->b:Lx1/y;

    .line 804
    .line 805
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 806
    .line 807
    .line 808
    iget-boolean v6, v10, Li0/h0;->S:Z

    .line 809
    .line 810
    if-eqz v6, :cond_33

    .line 811
    .line 812
    invoke-virtual {v10, v4}, Li0/h0;->k(Lfg/a;)V

    .line 813
    .line 814
    .line 815
    goto :goto_1e

    .line 816
    :cond_33
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 817
    .line 818
    .line 819
    :goto_1e
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 820
    .line 821
    invoke-static {v6, v10, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 825
    .line 826
    invoke-static {v2, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    sget-object v3, Lx1/f;->f:Lx1/e;

    .line 834
    .line 835
    invoke-static {v10, v1, v3}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 836
    .line 837
    .line 838
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 839
    .line 840
    invoke-static {v1, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 841
    .line 842
    .line 843
    sget-object v15, Lx1/f;->c:Lx1/e;

    .line 844
    .line 845
    invoke-static {v15, v10, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    const-string v0, "navigationIcon"

    .line 849
    .line 850
    invoke-static {v0}, Lv1/w;->l(Ljava/lang/String;)Ly0/o;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    sget-object v11, Ly0/b;->g:Ly0/g;

    .line 855
    .line 856
    const/4 v12, 0x0

    .line 857
    invoke-static {v11, v12}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 858
    .line 859
    .line 860
    move-result-object v14

    .line 861
    move-object/from16 v45, v11

    .line 862
    .line 863
    iget-wide v11, v10, Li0/h0;->T:J

    .line 864
    .line 865
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 866
    .line 867
    .line 868
    move-result v11

    .line 869
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 870
    .line 871
    .line 872
    move-result-object v12

    .line 873
    invoke-static {v10, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 878
    .line 879
    .line 880
    move/from16 v16, v11

    .line 881
    .line 882
    iget-boolean v11, v10, Li0/h0;->S:Z

    .line 883
    .line 884
    if-eqz v11, :cond_34

    .line 885
    .line 886
    invoke-virtual {v10, v4}, Li0/h0;->k(Lfg/a;)V

    .line 887
    .line 888
    .line 889
    goto :goto_1f

    .line 890
    :cond_34
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 891
    .line 892
    .line 893
    :goto_1f
    invoke-static {v6, v10, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    invoke-static {v2, v10, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v11

    .line 903
    invoke-static {v10, v11, v3}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 904
    .line 905
    .line 906
    invoke-static {v1, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 907
    .line 908
    .line 909
    invoke-static {v15, v10, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    shr-int/lit8 v0, v39, 0xc

    .line 913
    .line 914
    and-int/lit8 v0, v0, 0xe

    .line 915
    .line 916
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v8, v10, v0}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    const/4 v0, 0x1

    .line 924
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 925
    .line 926
    .line 927
    const-string v0, "title"

    .line 928
    .line 929
    invoke-static {v0}, Lv1/w;->l(Ljava/lang/String;)Ly0/o;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    move/from16 v11, p9

    .line 934
    .line 935
    const/4 v12, 0x0

    .line 936
    const/4 v14, 0x2

    .line 937
    invoke-static {v0, v11, v12, v14}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-virtual {v10, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    move-result v12

    .line 945
    invoke-virtual {v10, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v14

    .line 949
    or-int/2addr v12, v14

    .line 950
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v14

    .line 954
    if-nez v12, :cond_35

    .line 955
    .line 956
    if-ne v14, v5, :cond_36

    .line 957
    .line 958
    :cond_35
    new-instance v14, Lm/b;

    .line 959
    .line 960
    const/16 v12, 0x12

    .line 961
    .line 962
    invoke-direct {v14, v13, v12, v7}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v10, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    :cond_36
    check-cast v14, Lfg/l;

    .line 969
    .line 970
    invoke-static {v0, v14}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    move-object/from16 v7, v45

    .line 975
    .line 976
    const/4 v12, 0x0

    .line 977
    invoke-static {v7, v12}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 978
    .line 979
    .line 980
    move-result-object v13

    .line 981
    move-object v12, v9

    .line 982
    iget-wide v8, v10, Li0/h0;->T:J

    .line 983
    .line 984
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 985
    .line 986
    .line 987
    move-result v8

    .line 988
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 989
    .line 990
    .line 991
    move-result-object v9

    .line 992
    invoke-static {v10, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 997
    .line 998
    .line 999
    iget-boolean v14, v10, Li0/h0;->S:Z

    .line 1000
    .line 1001
    if-eqz v14, :cond_37

    .line 1002
    .line 1003
    invoke-virtual {v10, v4}, Li0/h0;->k(Lfg/a;)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_20

    .line 1007
    :cond_37
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 1008
    .line 1009
    .line 1010
    :goto_20
    invoke-static {v6, v10, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v2, v10, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v8

    .line 1020
    invoke-static {v10, v8, v3}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v1, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v15, v10, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    check-cast v0, Lf1/w;

    .line 1034
    .line 1035
    iget-wide v8, v0, Lf1/w;->a:J

    .line 1036
    .line 1037
    sget-object v0, Lbi/m;->a:Li0/m2;

    .line 1038
    .line 1039
    invoke-virtual {v10, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v13

    .line 1043
    check-cast v13, Lbi/l;

    .line 1044
    .line 1045
    iget-object v13, v13, Lbi/l;->m:Li0/j1;

    .line 1046
    .line 1047
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v13

    .line 1051
    check-cast v13, Li2/n0;

    .line 1052
    .line 1053
    iget-object v13, v13, Li2/n0;->a:Li2/f0;

    .line 1054
    .line 1055
    iget-wide v13, v13, Li2/f0;->b:J

    .line 1056
    .line 1057
    sget-object v21, Lm2/k;->j:Lm2/k;

    .line 1058
    .line 1059
    and-int/lit8 v16, v39, 0xe

    .line 1060
    .line 1061
    or-int v35, v16, v38

    .line 1062
    .line 1063
    const/16 v36, 0xd80

    .line 1064
    .line 1065
    const v37, 0x3cfaa    # 3.50002E-40f

    .line 1066
    .line 1067
    .line 1068
    const/16 v16, 0x0

    .line 1069
    .line 1070
    const/16 v22, 0x0

    .line 1071
    .line 1072
    const-wide/16 v23, 0x0

    .line 1073
    .line 1074
    const/16 v25, 0x0

    .line 1075
    .line 1076
    const-wide/16 v26, 0x0

    .line 1077
    .line 1078
    const/16 v28, 0x2

    .line 1079
    .line 1080
    const/16 v29, 0x0

    .line 1081
    .line 1082
    const/16 v30, 0x0

    .line 1083
    .line 1084
    const/16 v31, 0x0

    .line 1085
    .line 1086
    const/16 v32, 0x0

    .line 1087
    .line 1088
    const/16 v33, 0x0

    .line 1089
    .line 1090
    move-wide/from16 v17, v8

    .line 1091
    .line 1092
    move-object/from16 v34, v10

    .line 1093
    .line 1094
    move-wide/from16 v19, v13

    .line 1095
    .line 1096
    move-object v8, v15

    .line 1097
    move-object/from16 v15, p0

    .line 1098
    .line 1099
    invoke-static/range {v15 .. v37}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1100
    .line 1101
    .line 1102
    const/4 v15, 0x1

    .line 1103
    invoke-virtual {v10, v15}, Li0/h0;->p(Z)V

    .line 1104
    .line 1105
    .line 1106
    const-string v9, "actionIcons"

    .line 1107
    .line 1108
    invoke-static {v9}, Lv1/w;->l(Ljava/lang/String;)Ly0/o;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v9

    .line 1112
    const/4 v13, 0x0

    .line 1113
    invoke-static {v7, v13}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v14

    .line 1117
    move-object v15, v12

    .line 1118
    iget-wide v12, v10, Li0/h0;->T:J

    .line 1119
    .line 1120
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 1121
    .line 1122
    .line 1123
    move-result v12

    .line 1124
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v13

    .line 1128
    invoke-static {v10, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v9

    .line 1132
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 1133
    .line 1134
    .line 1135
    move/from16 v16, v12

    .line 1136
    .line 1137
    iget-boolean v12, v10, Li0/h0;->S:Z

    .line 1138
    .line 1139
    if-eqz v12, :cond_38

    .line 1140
    .line 1141
    invoke-virtual {v10, v4}, Li0/h0;->k(Lfg/a;)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_21

    .line 1145
    :cond_38
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 1146
    .line 1147
    .line 1148
    :goto_21
    invoke-static {v6, v10, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1149
    .line 1150
    .line 1151
    invoke-static {v2, v10, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1152
    .line 1153
    .line 1154
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v12

    .line 1158
    invoke-static {v10, v12, v3}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-static {v1, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-static {v8, v10, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1165
    .line 1166
    .line 1167
    shr-int/lit8 v9, v39, 0xf

    .line 1168
    .line 1169
    and-int/lit8 v9, v9, 0xe

    .line 1170
    .line 1171
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v9

    .line 1175
    move-object/from16 v12, p8

    .line 1176
    .line 1177
    invoke-virtual {v12, v10, v9}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    const/4 v9, 0x1

    .line 1181
    invoke-virtual {v10, v9}, Li0/h0;->p(Z)V

    .line 1182
    .line 1183
    .line 1184
    const-string v9, "largeTitle"

    .line 1185
    .line 1186
    invoke-static {v9}, Lv1/w;->l(Ljava/lang/String;)Ly0/o;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v16

    .line 1190
    sget v18, Lsh/s1;->b:F

    .line 1191
    .line 1192
    const/16 v20, 0x0

    .line 1193
    .line 1194
    const/16 v21, 0xd

    .line 1195
    .line 1196
    const/16 v17, 0x0

    .line 1197
    .line 1198
    const/16 v19, 0x0

    .line 1199
    .line 1200
    invoke-static/range {v16 .. v21}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v9

    .line 1204
    const/4 v13, 0x0

    .line 1205
    const/4 v14, 0x2

    .line 1206
    invoke-static {v9, v11, v13, v14}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v9

    .line 1210
    move-object/from16 v13, v42

    .line 1211
    .line 1212
    invoke-virtual {v10, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v14

    .line 1216
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v11

    .line 1220
    if-nez v14, :cond_39

    .line 1221
    .line 1222
    if-ne v11, v5, :cond_3a

    .line 1223
    .line 1224
    :cond_39
    new-instance v11, Lsh/y0;

    .line 1225
    .line 1226
    const/4 v14, 0x5

    .line 1227
    invoke-direct {v11, v13, v14}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual {v10, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    :cond_3a
    check-cast v11, Lfg/l;

    .line 1234
    .line 1235
    invoke-static {v9, v11}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v9

    .line 1239
    const/4 v13, 0x0

    .line 1240
    invoke-static {v7, v13}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v7

    .line 1244
    iget-wide v13, v10, Li0/h0;->T:J

    .line 1245
    .line 1246
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 1247
    .line 1248
    .line 1249
    move-result v11

    .line 1250
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v13

    .line 1254
    invoke-static {v10, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v9

    .line 1258
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 1259
    .line 1260
    .line 1261
    iget-boolean v14, v10, Li0/h0;->S:Z

    .line 1262
    .line 1263
    if-eqz v14, :cond_3b

    .line 1264
    .line 1265
    invoke-virtual {v10, v4}, Li0/h0;->k(Lfg/a;)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_22

    .line 1269
    :cond_3b
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 1270
    .line 1271
    .line 1272
    :goto_22
    invoke-static {v6, v10, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1273
    .line 1274
    .line 1275
    invoke-static {v2, v10, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v2

    .line 1282
    invoke-static {v10, v2, v3}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1283
    .line 1284
    .line 1285
    invoke-static {v1, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1286
    .line 1287
    .line 1288
    invoke-static {v8, v10, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1289
    .line 1290
    .line 1291
    move-object/from16 v6, v41

    .line 1292
    .line 1293
    invoke-virtual {v10, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v1

    .line 1297
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    if-nez v1, :cond_3c

    .line 1302
    .line 1303
    if-ne v2, v5, :cond_3d

    .line 1304
    .line 1305
    :cond_3c
    new-instance v2, Lsh/y0;

    .line 1306
    .line 1307
    const/4 v1, 0x6

    .line 1308
    invoke-direct {v2, v6, v1}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1312
    .line 1313
    .line 1314
    :cond_3d
    check-cast v2, Lfg/l;

    .line 1315
    .line 1316
    invoke-static {v15, v2}, Lp/d;->i(Ly0/o;Lfg/l;)Ly0/o;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v16

    .line 1320
    invoke-interface/range {v44 .. v44}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v1

    .line 1324
    check-cast v1, Lf1/w;

    .line 1325
    .line 1326
    iget-wide v1, v1, Lf1/w;->a:J

    .line 1327
    .line 1328
    invoke-virtual {v10, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    check-cast v0, Lbi/l;

    .line 1333
    .line 1334
    iget-object v0, v0, Lbi/l;->k:Li0/j1;

    .line 1335
    .line 1336
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    check-cast v0, Li2/n0;

    .line 1341
    .line 1342
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 1343
    .line 1344
    iget-wide v3, v0, Li2/f0;->b:J

    .line 1345
    .line 1346
    sget-object v21, Lm2/k;->i:Lm2/k;

    .line 1347
    .line 1348
    const/high16 v0, 0x70000000

    .line 1349
    .line 1350
    and-int v0, v39, v0

    .line 1351
    .line 1352
    const/high16 v6, 0x20000000

    .line 1353
    .line 1354
    if-ne v0, v6, :cond_3e

    .line 1355
    .line 1356
    const/16 v40, 0x1

    .line 1357
    .line 1358
    goto :goto_23

    .line 1359
    :cond_3e
    const/16 v40, 0x0

    .line 1360
    .line 1361
    :goto_23
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    if-nez v40, :cond_40

    .line 1366
    .line 1367
    if-ne v0, v5, :cond_3f

    .line 1368
    .line 1369
    goto :goto_24

    .line 1370
    :cond_3f
    move-object/from16 v13, p12

    .line 1371
    .line 1372
    goto :goto_25

    .line 1373
    :cond_40
    :goto_24
    new-instance v0, Lb0/l;

    .line 1374
    .line 1375
    const/16 v5, 0xa

    .line 1376
    .line 1377
    move-object/from16 v13, p12

    .line 1378
    .line 1379
    invoke-direct {v0, v13, v5}, Lb0/l;-><init>(Li0/a1;I)V

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v10, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1383
    .line 1384
    .line 1385
    :goto_25
    move-object/from16 v32, v0

    .line 1386
    .line 1387
    check-cast v32, Lfg/l;

    .line 1388
    .line 1389
    shr-int/lit8 v0, v43, 0x3

    .line 1390
    .line 1391
    and-int/lit8 v0, v0, 0xe

    .line 1392
    .line 1393
    or-int v35, v0, v38

    .line 1394
    .line 1395
    const/16 v36, 0x0

    .line 1396
    .line 1397
    const v37, 0x2ffa8

    .line 1398
    .line 1399
    .line 1400
    const/16 v22, 0x0

    .line 1401
    .line 1402
    const-wide/16 v23, 0x0

    .line 1403
    .line 1404
    const/16 v25, 0x0

    .line 1405
    .line 1406
    const-wide/16 v26, 0x0

    .line 1407
    .line 1408
    const/16 v28, 0x0

    .line 1409
    .line 1410
    const/16 v29, 0x0

    .line 1411
    .line 1412
    const/16 v30, 0x0

    .line 1413
    .line 1414
    const/16 v31, 0x0

    .line 1415
    .line 1416
    const/16 v33, 0x0

    .line 1417
    .line 1418
    move-object/from16 v15, p14

    .line 1419
    .line 1420
    move-wide/from16 v17, v1

    .line 1421
    .line 1422
    move-wide/from16 v19, v3

    .line 1423
    .line 1424
    move-object/from16 v34, v10

    .line 1425
    .line 1426
    invoke-static/range {v15 .. v37}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1427
    .line 1428
    .line 1429
    const/4 v15, 0x1

    .line 1430
    invoke-virtual {v10, v15}, Li0/h0;->p(Z)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v10, v15}, Li0/h0;->p(Z)V

    .line 1434
    .line 1435
    .line 1436
    goto :goto_26

    .line 1437
    :cond_41
    move-object v10, v0

    .line 1438
    move-object v12, v9

    .line 1439
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 1440
    .line 1441
    .line 1442
    :goto_26
    invoke-virtual {v10}, Li0/h0;->t()Li0/r1;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    if-eqz v0, :cond_42

    .line 1447
    .line 1448
    move-object v1, v0

    .line 1449
    new-instance v0, Lsh/u1;

    .line 1450
    .line 1451
    move-wide/from16 v2, p1

    .line 1452
    .line 1453
    move-wide/from16 v4, p3

    .line 1454
    .line 1455
    move-wide/from16 v6, p5

    .line 1456
    .line 1457
    move-object/from16 v8, p7

    .line 1458
    .line 1459
    move/from16 v10, p9

    .line 1460
    .line 1461
    move-object/from16 v11, p10

    .line 1462
    .line 1463
    move-object/from16 v14, p13

    .line 1464
    .line 1465
    move-object/from16 v15, p14

    .line 1466
    .line 1467
    move/from16 v16, p16

    .line 1468
    .line 1469
    move/from16 v17, p17

    .line 1470
    .line 1471
    move-object/from16 v46, v1

    .line 1472
    .line 1473
    move-object v9, v12

    .line 1474
    move-object/from16 v1, p0

    .line 1475
    .line 1476
    move/from16 v12, p11

    .line 1477
    .line 1478
    invoke-direct/range {v0 .. v17}, Lsh/u1;-><init>(Ljava/lang/String;JJJLs0/d;Ls0/d;FLsh/w1;FLi0/a1;Ly0/o;Ljava/lang/String;II)V

    .line 1479
    .line 1480
    .line 1481
    move-object/from16 v1, v46

    .line 1482
    .line 1483
    iput-object v0, v1, Li0/r1;->d:Lfg/p;

    .line 1484
    .line 1485
    :cond_42
    return-void
.end method

.method public static final r(Lsh/e2;FLi/u;Li/r0;Lyf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lsh/d2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lsh/d2;

    .line 7
    .line 8
    iget v1, v0, Lsh/d2;->l:I

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
    iput v1, v0, Lsh/d2;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lsh/d2;

    .line 22
    .line 23
    invoke-direct {v0, p4}, Lyf/c;-><init>(Lwf/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v6, Lsh/d2;->k:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v6, Lsh/d2;->l:I

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v8, 0x0

    .line 34
    sget-object v9, Lxf/a;->g:Lxf/a;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    if-eq v0, v2, :cond_2

    .line 39
    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    iget p0, v6, Lsh/d2;->j:F

    .line 43
    .line 44
    iget-object p1, v6, Lsh/d2;->i:Lgg/r;

    .line 45
    .line 46
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    iget p1, v6, Lsh/d2;->j:F

    .line 59
    .line 60
    iget-object p0, v6, Lsh/d2;->i:Lgg/r;

    .line 61
    .line 62
    iget-object p3, v6, Lsh/d2;->h:Li/r0;

    .line 63
    .line 64
    iget-object p2, v6, Lsh/d2;->g:Lsh/e2;

    .line 65
    .line 66
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object p4, p0

    .line 70
    move-object p0, p2

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lsh/e2;->a()F

    .line 76
    .line 77
    .line 78
    move-result p4

    .line 79
    const v0, 0x3c23d70a    # 0.01f

    .line 80
    .line 81
    .line 82
    cmpg-float p4, p4, v0

    .line 83
    .line 84
    if-ltz p4, :cond_9

    .line 85
    .line 86
    invoke-virtual {p0}, Lsh/e2;->a()F

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    const/high16 v0, 0x3f800000    # 1.0f

    .line 91
    .line 92
    cmpg-float p4, p4, v0

    .line 93
    .line 94
    if-nez p4, :cond_4

    .line 95
    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_4
    new-instance p4, Lgg/r;

    .line 99
    .line 100
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    iput p1, p4, Lgg/r;->g:F

    .line 104
    .line 105
    if-eqz p2, :cond_5

    .line 106
    .line 107
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    cmpl-float v0, v3, v0

    .line 112
    .line 113
    if-lez v0, :cond_5

    .line 114
    .line 115
    new-instance v0, Lgg/r;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    const/16 v3, 0x1c

    .line 121
    .line 122
    invoke-static {v8, p1, v3}, Li/d;->b(FFI)Li/l;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    new-instance v4, Lb0/s;

    .line 127
    .line 128
    const/16 v5, 0x12

    .line 129
    .line 130
    invoke-direct {v4, v0, p0, p4, v5}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    iput-object p0, v6, Lsh/d2;->g:Lsh/e2;

    .line 134
    .line 135
    iput-object p3, v6, Lsh/d2;->h:Li/r0;

    .line 136
    .line 137
    iput-object p4, v6, Lsh/d2;->i:Lgg/r;

    .line 138
    .line 139
    iput p1, v6, Lsh/d2;->j:F

    .line 140
    .line 141
    iput v2, v6, Lsh/d2;->l:I

    .line 142
    .line 143
    invoke-static {v3, p2, v4, v6}, Li/d;->f(Li/l;Li/u;Lfg/l;Lyf/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    if-ne p2, v9, :cond_5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    :goto_2
    move-object v3, p3

    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    iget-object p2, p0, Lsh/e2;->c:Li0/f1;

    .line 154
    .line 155
    invoke-virtual {p2}, Li0/f1;->g()F

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    cmpg-float p3, p3, v8

    .line 160
    .line 161
    if-gez p3, :cond_8

    .line 162
    .line 163
    invoke-virtual {p2}, Li0/f1;->g()F

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    iget v0, p0, Lsh/e2;->a:F

    .line 168
    .line 169
    cmpl-float p3, p3, v0

    .line 170
    .line 171
    if-lez p3, :cond_8

    .line 172
    .line 173
    invoke-virtual {p2}, Li0/f1;->g()F

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    const/16 p3, 0x1e

    .line 178
    .line 179
    invoke-static {p2, v8, p3}, Li/d;->b(FFI)Li/l;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-virtual {p0}, Lsh/e2;->a()F

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    const/high16 v0, 0x3f000000    # 0.5f

    .line 188
    .line 189
    cmpg-float p3, p3, v0

    .line 190
    .line 191
    if-gez p3, :cond_6

    .line 192
    .line 193
    move p3, v8

    .line 194
    goto :goto_3

    .line 195
    :cond_6
    iget p3, p0, Lsh/e2;->a:F

    .line 196
    .line 197
    :goto_3
    new-instance v2, Ljava/lang/Float;

    .line 198
    .line 199
    invoke-direct {v2, p3}, Ljava/lang/Float;-><init>(F)V

    .line 200
    .line 201
    .line 202
    new-instance v5, Lnb/a;

    .line 203
    .line 204
    const/16 p3, 0xb

    .line 205
    .line 206
    invoke-direct {v5, p0, p3}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 207
    .line 208
    .line 209
    const/4 p0, 0x0

    .line 210
    iput-object p0, v6, Lsh/d2;->g:Lsh/e2;

    .line 211
    .line 212
    iput-object p0, v6, Lsh/d2;->h:Li/r0;

    .line 213
    .line 214
    iput-object p4, v6, Lsh/d2;->i:Lgg/r;

    .line 215
    .line 216
    iput p1, v6, Lsh/d2;->j:F

    .line 217
    .line 218
    iput v1, v6, Lsh/d2;->l:I

    .line 219
    .line 220
    const/4 v4, 0x0

    .line 221
    const/4 v7, 0x4

    .line 222
    move-object v1, p2

    .line 223
    invoke-static/range {v1 .. v7}, Li/d;->h(Li/l;Ljava/lang/Float;Li/k;ZLfg/l;Lyf/c;I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-ne p0, v9, :cond_7

    .line 228
    .line 229
    :goto_4
    return-object v9

    .line 230
    :cond_7
    move p0, p1

    .line 231
    move-object p1, p4

    .line 232
    :goto_5
    move-object p4, p1

    .line 233
    move p1, p0

    .line 234
    :cond_8
    iget p0, p4, Lgg/r;->g:F

    .line 235
    .line 236
    sub-float/2addr p1, p0

    .line 237
    invoke-static {v8, p1}, La/a;->d(FF)J

    .line 238
    .line 239
    .line 240
    move-result-wide p0

    .line 241
    new-instance p2, Lu2/q;

    .line 242
    .line 243
    invoke-direct {p2, p0, p1}, Lu2/q;-><init>(J)V

    .line 244
    .line 245
    .line 246
    return-object p2

    .line 247
    :cond_9
    :goto_6
    new-instance p0, Lu2/q;

    .line 248
    .line 249
    const-wide/16 p1, 0x0

    .line 250
    .line 251
    invoke-direct {p0, p1, p2}, Lu2/q;-><init>(J)V

    .line 252
    .line 253
    .line 254
    return-object p0
.end method

.method public static final s(Lsh/g0;Lu2/m;)Lsh/g0;
    .locals 1

    .line 1
    sget-object v0, Lu2/m;->g:Lu2/m;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_6

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    if-eq p0, p1, :cond_5

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    if-eq p0, p1, :cond_4

    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    if-eq p0, p1, :cond_3

    .line 20
    .line 21
    const/4 p1, 0x4

    .line 22
    if-eq p0, p1, :cond_2

    .line 23
    .line 24
    const/4 p1, 0x5

    .line 25
    if-ne p0, p1, :cond_1

    .line 26
    .line 27
    sget-object p0, Lsh/g0;->k:Lsh/g0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, Lsh/g0;->l:Lsh/g0;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    sget-object p0, Lsh/g0;->i:Lsh/g0;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_4
    sget-object p0, Lsh/g0;->j:Lsh/g0;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_5
    sget-object p0, Lsh/g0;->g:Lsh/g0;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_6
    sget-object p0, Lsh/g0;->h:Lsh/g0;

    .line 48
    .line 49
    return-object p0
.end method

.method public static final t(FF)J
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    cmpg-float v0, p0, v1

    .line 9
    .line 10
    if-gez v0, :cond_1

    .line 11
    .line 12
    :cond_0
    move p0, v1

    .line 13
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    cmpg-float v0, p1, v1

    .line 20
    .line 21
    if-gez v0, :cond_3

    .line 22
    .line 23
    :cond_2
    move p1, v1

    .line 24
    :cond_3
    invoke-static {p0, p1}, Lf1/c0;->g(FF)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public static final u(Ly0/o;Lf1/r0;JF)Ly0/o;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p4, v0

    .line 3
    .line 4
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const v7, 0x7e7df

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v4, p1

    .line 15
    move v3, p4

    .line 16
    invoke-static/range {v1 .. v7}, Lf1/c0;->n(Ly0/o;FFLf1/r0;ZLf1/n;I)Ly0/o;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v4, p1

    .line 22
    move-object p1, v1

    .line 23
    :goto_0
    invoke-interface {p0, p1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0, v4}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, Lf1/c0;->b:Lf1/m0;

    .line 36
    .line 37
    invoke-static {p0, p2, p3, p1}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
