.class public abstract Ls/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:[Ls/t;

.field public static final b:Lb8/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ls/t;

    .line 3
    .line 4
    sput-object v0, Ls/o;->a:[Ls/t;

    .line 5
    .line 6
    new-instance v0, Lb8/c;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lb8/c;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ls/o;->b:Lb8/c;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lfg/a;Ly0/o;Ls/m0;Lr/o;Li0/h0;I)V
    .locals 6

    .line 1
    const v0, 0x3ee63d6d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p5

    .line 17
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p4, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    invoke-virtual {p4, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/16 v1, 0x800

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/16 v1, 0x400

    .line 51
    .line 52
    :goto_3
    or-int/2addr v0, v1

    .line 53
    and-int/lit16 v1, v0, 0x493

    .line 54
    .line 55
    const/16 v2, 0x492

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-eq v1, v2, :cond_4

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    const/4 v1, 0x0

    .line 63
    :goto_4
    and-int/2addr v0, v3

    .line 64
    invoke-virtual {p4, v0, v1}, Li0/h0;->S(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    invoke-static {p0, p4}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Ls/c0;

    .line 75
    .line 76
    invoke-direct {v1, p2, p1, p3, v0}, Ls/c0;-><init>(Ls/m0;Ly0/o;Lr/o;Li0/a1;)V

    .line 77
    .line 78
    .line 79
    const v0, -0x379ecb6b

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1, p4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/4 v1, 0x6

    .line 87
    invoke-static {v0, p4, v1}, Ls/o;->c(Ls0/d;Li0/h0;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 92
    .line 93
    .line 94
    :goto_5
    invoke-virtual {p4}, Li0/h0;->t()Li0/r1;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    if-eqz p4, :cond_6

    .line 99
    .line 100
    new-instance v0, Ls/d0;

    .line 101
    .line 102
    move-object v1, p0

    .line 103
    move-object v2, p1

    .line 104
    move-object v3, p2

    .line 105
    move-object v4, p3

    .line 106
    move v5, p5

    .line 107
    invoke-direct/range {v0 .. v5}, Ls/d0;-><init>(Lfg/a;Ly0/o;Ls/m0;Lr/o;I)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p4, Li0/r1;->d:Lfg/p;

    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public static final b(Ljava/lang/Object;ILs/j0;Ls0/d;Li0/h0;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v0, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    const v6, 0x340208e3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v6}, Li0/h0;->b0(I)Li0/h0;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v6, v5, 0x6

    .line 20
    .line 21
    if-nez v6, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    const/4 v6, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v6, 0x2

    .line 32
    :goto_0
    or-int/2addr v6, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v6, v5

    .line 35
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 36
    .line 37
    if-nez v7, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Li0/h0;->d(I)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v6, v7

    .line 51
    :cond_3
    and-int/lit16 v7, v5, 0x180

    .line 52
    .line 53
    if-nez v7, :cond_5

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const/16 v7, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v7, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v6, v7

    .line 67
    :cond_5
    and-int/lit16 v7, v5, 0xc00

    .line 68
    .line 69
    if-nez v7, :cond_7

    .line 70
    .line 71
    invoke-virtual {v0, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_6

    .line 76
    .line 77
    const/16 v7, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v7, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v6, v7

    .line 83
    :cond_7
    and-int/lit16 v7, v6, 0x493

    .line 84
    .line 85
    const/16 v8, 0x492

    .line 86
    .line 87
    if-eq v7, v8, :cond_8

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/4 v7, 0x0

    .line 92
    :goto_5
    and-int/lit8 v8, v6, 0x1

    .line 93
    .line 94
    invoke-virtual {v0, v8, v7}, Li0/h0;->S(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_11

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    or-int/2addr v7, v8

    .line 109
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    sget-object v9, Li0/l;->a:Li0/e;

    .line 114
    .line 115
    if-nez v7, :cond_9

    .line 116
    .line 117
    if-ne v8, v9, :cond_a

    .line 118
    .line 119
    :cond_9
    new-instance v8, Ls/h0;

    .line 120
    .line 121
    invoke-direct {v8, v1, v3}, Ls/h0;-><init>(Ljava/lang/Object;Ls/j0;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_a
    check-cast v8, Ls/h0;

    .line 128
    .line 129
    iput v2, v8, Ls/h0;->c:I

    .line 130
    .line 131
    iget-object v7, v8, Ls/h0;->g:Li0/j1;

    .line 132
    .line 133
    sget-object v10, Lv1/z0;->a:Li0/u;

    .line 134
    .line 135
    invoke-virtual {v0, v10}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, Ls/h0;

    .line 140
    .line 141
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    if-eqz v12, :cond_b

    .line 146
    .line 147
    invoke-virtual {v12}, Lw0/f;->e()Lfg/l;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    goto :goto_6

    .line 152
    :cond_b
    const/4 v14, 0x0

    .line 153
    :goto_6
    invoke-static {v12}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    :try_start_0
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    move-object/from16 v13, v16

    .line 162
    .line 163
    check-cast v13, Ls/h0;

    .line 164
    .line 165
    if-eq v11, v13, :cond_e

    .line 166
    .line 167
    invoke-virtual {v7, v11}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget v7, v8, Ls/h0;->d:I

    .line 171
    .line 172
    if-lez v7, :cond_e

    .line 173
    .line 174
    iget-object v7, v8, Ls/h0;->e:Ls/h0;

    .line 175
    .line 176
    if-eqz v7, :cond_c

    .line 177
    .line 178
    invoke-virtual {v7}, Ls/h0;->b()V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    goto :goto_9

    .line 184
    :cond_c
    :goto_7
    if-eqz v11, :cond_d

    .line 185
    .line 186
    invoke-virtual {v11}, Ls/h0;->a()Ls/h0;

    .line 187
    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_d
    const/4 v11, 0x0

    .line 191
    :goto_8
    iput-object v11, v8, Ls/h0;->e:Ls/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    :cond_e
    invoke-static {v12, v15, v14}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    if-nez v7, :cond_f

    .line 205
    .line 206
    if-ne v11, v9, :cond_10

    .line 207
    .line 208
    :cond_f
    new-instance v11, Lnb/a;

    .line 209
    .line 210
    const/4 v7, 0x7

    .line 211
    invoke-direct {v11, v8, v7}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_10
    check-cast v11, Lfg/l;

    .line 218
    .line 219
    invoke-static {v8, v11, v0}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v8}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    shr-int/lit8 v6, v6, 0x6

    .line 227
    .line 228
    and-int/lit8 v6, v6, 0x70

    .line 229
    .line 230
    const/16 v8, 0x8

    .line 231
    .line 232
    or-int/2addr v6, v8

    .line 233
    invoke-static {v7, v4, v0, v6}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 234
    .line 235
    .line 236
    goto :goto_a

    .line 237
    :goto_9
    invoke-static {v12, v15, v14}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 238
    .line 239
    .line 240
    throw v0

    .line 241
    :cond_11
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 242
    .line 243
    .line 244
    :goto_a
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    if-eqz v6, :cond_12

    .line 249
    .line 250
    new-instance v0, Ls/i0;

    .line 251
    .line 252
    invoke-direct/range {v0 .. v5}, Ls/i0;-><init>(Ljava/lang/Object;ILs/j0;Ls0/d;I)V

    .line 253
    .line 254
    .line 255
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 256
    .line 257
    :cond_12
    return-void
.end method

.method public static final c(Ls0/d;Li0/h0;I)V
    .locals 10

    .line 1
    const v0, -0x2a4a252b

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
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, Li0/h0;->S(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    sget-object v0, Lv0/h;->a:Li0/m2;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lv0/f;

    .line 31
    .line 32
    const v3, 0x753e26b5

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v3}, Li0/h0;->a0(I)V

    .line 36
    .line 37
    .line 38
    new-array v3, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    sget-object v5, Li0/l;->a:Li0/e;

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    new-instance v4, Lk/s1;

    .line 49
    .line 50
    const/16 v6, 0xe

    .line 51
    .line 52
    invoke-direct {v4, v6}, Lk/s1;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    check-cast v4, Lfg/a;

    .line 59
    .line 60
    const/16 v6, 0x180

    .line 61
    .line 62
    sget-object v7, Lv0/d;->k:Lp4/t;

    .line 63
    .line 64
    invoke-static {v3, v7, v4, p1, v6}, Lv0/k;->e([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lv0/d;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Lv0/f;

    .line 75
    .line 76
    iput-object v4, v3, Lv0/d;->i:Lv0/f;

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Li0/h0;->p(Z)V

    .line 79
    .line 80
    .line 81
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    new-instance v6, Li2/y;

    .line 86
    .line 87
    const/16 v7, 0xf

    .line 88
    .line 89
    invoke-direct {v6, v7}, Li2/y;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v7, Lm/b;

    .line 93
    .line 94
    const/16 v8, 0xe

    .line 95
    .line 96
    invoke-direct {v7, v1, v8, v3}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v8, Lp4/t;

    .line 100
    .line 101
    const/16 v9, 0xc

    .line 102
    .line 103
    invoke-direct {v8, v6, v9, v7}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual {p1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    or-int/2addr v6, v7

    .line 115
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-nez v6, :cond_2

    .line 120
    .line 121
    if-ne v7, v5, :cond_3

    .line 122
    .line 123
    :cond_2
    new-instance v7, Laa/c;

    .line 124
    .line 125
    const/16 v5, 0x1c

    .line 126
    .line 127
    invoke-direct {v7, v1, v5, v3}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    check-cast v7, Lfg/a;

    .line 134
    .line 135
    invoke-static {v4, v8, v7, p1, v2}, Lv0/k;->e([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Ls/x0;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v2, Lb0/q;

    .line 146
    .line 147
    const/16 v3, 0xc

    .line 148
    .line 149
    invoke-direct {v2, p0, v3, v1}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const v1, -0x189b31eb

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2, p1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const/16 v2, 0x38

    .line 160
    .line 161
    invoke-static {v0, v1, p1, v2}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 166
    .line 167
    .line 168
    :goto_1
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-eqz p1, :cond_5

    .line 173
    .line 174
    new-instance v0, Lbi/i;

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    invoke-direct {v0, p0, p2, v1}, Lbi/i;-><init>(Ls0/d;II)V

    .line 178
    .line 179
    .line 180
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 181
    .line 182
    :cond_5
    return-void
.end method

.method public static final d(Lr/k;Ljava/lang/Object;ILjava/lang/Object;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, 0x55d242fd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p5

    .line 17
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p4, p2}, Li0/h0;->d(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    invoke-virtual {p4, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/16 v1, 0x800

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/16 v1, 0x400

    .line 51
    .line 52
    :goto_3
    or-int/2addr v0, v1

    .line 53
    and-int/lit16 v1, v0, 0x493

    .line 54
    .line 55
    const/16 v2, 0x492

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-eq v1, v2, :cond_4

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    const/4 v1, 0x0

    .line 63
    :goto_4
    and-int/2addr v0, v3

    .line 64
    invoke-virtual {p4, v0, v1}, Li0/h0;->S(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    move-object v0, p1

    .line 71
    check-cast v0, Lv0/c;

    .line 72
    .line 73
    new-instance v1, Lr/j;

    .line 74
    .line 75
    invoke-direct {v1, p2, p3, p0}, Lr/j;-><init>(ILjava/lang/Object;Lr/k;)V

    .line 76
    .line 77
    .line 78
    const v2, 0x3a785bde

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v1, p4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const/16 v2, 0x30

    .line 86
    .line 87
    invoke-interface {v0, p3, v1, p4, v2}, Lv0/c;->b(Ljava/lang/Object;Ls0/d;Li0/h0;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 92
    .line 93
    .line 94
    :goto_5
    invoke-virtual {p4}, Li0/h0;->t()Li0/r1;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    if-eqz p4, :cond_6

    .line 99
    .line 100
    new-instance v0, Lb0/r;

    .line 101
    .line 102
    const/4 v6, 0x6

    .line 103
    move-object v1, p0

    .line 104
    move-object v2, p1

    .line 105
    move v3, p2

    .line 106
    move-object v4, p3

    .line 107
    move v5, p5

    .line 108
    invoke-direct/range {v0 .. v6}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p4, Li0/r1;->d:Lfg/p;

    .line 112
    .line 113
    :cond_6
    return-void
.end method

.method public static final e(ILj0/b;)I
    .locals 5

    .line 1
    iget v0, p1, Lj0/b;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    sub-int v2, v0, v1

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    add-int/2addr v2, v1

    .line 13
    iget-object v3, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v4, v3, v2

    .line 16
    .line 17
    check-cast v4, Ls/i;

    .line 18
    .line 19
    iget v4, v4, Ls/i;->a:I

    .line 20
    .line 21
    if-ne v4, p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    if-ge v4, p0, :cond_2

    .line 25
    .line 26
    add-int/lit8 v1, v2, 0x1

    .line 27
    .line 28
    aget-object v3, v3, v1

    .line 29
    .line 30
    check-cast v3, Ls/i;

    .line 31
    .line 32
    iget v3, v3, Ls/i;->a:I

    .line 33
    .line 34
    if-ge p0, v3, :cond_0

    .line 35
    .line 36
    :goto_1
    return v2

    .line 37
    :cond_2
    add-int/lit8 v0, v2, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return v1
.end method

.method public static final f(ILjava/lang/Object;Lr/k;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p2}, Lr/k;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Lr/k;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge p0, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2, p0}, Lr/k;->d(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p2, p2, Lr/k;->d:Lac/k;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lac/k;->o(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, -0x1

    .line 34
    if-eq p1, p2, :cond_2

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    :goto_0
    return p0
.end method

.method public static final g(Lr/g;Lm/c;Lm/p1;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Ls/n;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Ls/n;-><init>(Lr/g;Lm/c;Lm/p1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final h(Ly0/o;Lr/l;Lr/f;Lm/p1;Z)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Ls/s0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Ls/s0;-><init>(Lfg/a;Lr/f;Lm/p1;Z)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
