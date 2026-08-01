.class public abstract Lm2;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lln0;

.field public static final b:Lln0;

.field public static final c:Lln0;

.field public static final d:Lej;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lln0;

    .line 2
    .line 3
    const/high16 v1, 0x41c00000    # 24.0f

    .line 4
    .line 5
    invoke-direct {v0, v1, v1, v1, v1}, Lln0;-><init>(FFFF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm2;->a:Lln0;

    .line 9
    .line 10
    const/high16 v0, 0x41800000    # 16.0f

    .line 11
    .line 12
    invoke-static {v0}, Lrd0;->e(F)Lln0;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lrd0;->e(F)Lln0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lm2;->b:Lln0;

    .line 20
    .line 21
    invoke-static {v1}, Lrd0;->e(F)Lln0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lm2;->c:Lln0;

    .line 26
    .line 27
    new-instance v0, La2;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-direct {v0, v1}, La2;-><init>(I)V

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
    sput-object v1, Lm2;->d:Lej;

    .line 39
    .line 40
    return-void
.end method

.method public static final a(Lmh;Lpe0;Lww;Lww;Lx01;JJJJJLji;I)V
    .locals 27

    .line 1
    move-object/from16 v9, p15

    .line 2
    .line 3
    check-cast v9, Lpi;

    .line 4
    .line 5
    const v0, 0x522d8af1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v9, v0}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    or-int/lit8 v0, p16, 0x30

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v9, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x100

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v1, 0x80

    .line 24
    .line 25
    :goto_0
    or-int/2addr v0, v1

    .line 26
    move-object/from16 v11, p2

    .line 27
    .line 28
    invoke-virtual {v9, v11}, Lpi;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/16 v1, 0x800

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v1, 0x400

    .line 38
    .line 39
    :goto_1
    or-int/2addr v0, v1

    .line 40
    move-object/from16 v12, p3

    .line 41
    .line 42
    invoke-virtual {v9, v12}, Lpi;->h(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    const/16 v1, 0x4000

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v1, 0x2000

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v1

    .line 54
    move-object/from16 v1, p4

    .line 55
    .line 56
    invoke-virtual {v9, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    const/high16 v2, 0x20000

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    const/high16 v2, 0x10000

    .line 66
    .line 67
    :goto_3
    or-int/2addr v0, v2

    .line 68
    move-wide/from16 v2, p5

    .line 69
    .line 70
    invoke-virtual {v9, v2, v3}, Lpi;->e(J)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    const/high16 v4, 0x100000

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    const/high16 v4, 0x80000

    .line 80
    .line 81
    :goto_4
    or-int/2addr v0, v4

    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-virtual {v9, v6}, Lpi;->c(F)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    const/high16 v4, 0x800000

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_5
    const/high16 v4, 0x400000

    .line 93
    .line 94
    :goto_5
    or-int/2addr v0, v4

    .line 95
    move-wide/from16 v4, p7

    .line 96
    .line 97
    invoke-virtual {v9, v4, v5}, Lpi;->e(J)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_6

    .line 102
    .line 103
    const/high16 v7, 0x4000000

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_6
    const/high16 v7, 0x2000000

    .line 107
    .line 108
    :goto_6
    or-int/2addr v0, v7

    .line 109
    move-wide/from16 v13, p9

    .line 110
    .line 111
    invoke-virtual {v9, v13, v14}, Lpi;->e(J)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_7

    .line 116
    .line 117
    const/high16 v7, 0x20000000

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_7
    const/high16 v7, 0x10000000

    .line 121
    .line 122
    :goto_7
    or-int/2addr v0, v7

    .line 123
    move-wide/from16 v7, p11

    .line 124
    .line 125
    invoke-virtual {v9, v7, v8}, Lpi;->e(J)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_8

    .line 130
    .line 131
    const/4 v10, 0x4

    .line 132
    :goto_8
    move-wide/from16 v6, p13

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :cond_8
    const/4 v10, 0x2

    .line 136
    goto :goto_8

    .line 137
    :goto_9
    invoke-virtual {v9, v6, v7}, Lpi;->e(J)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eqz v8, :cond_9

    .line 142
    .line 143
    const/16 v8, 0x20

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_9
    const/16 v8, 0x10

    .line 147
    .line 148
    :goto_a
    or-int/2addr v8, v10

    .line 149
    const v10, 0x12492493

    .line 150
    .line 151
    .line 152
    and-int/2addr v10, v0

    .line 153
    const v15, 0x12492492

    .line 154
    .line 155
    .line 156
    if-ne v10, v15, :cond_b

    .line 157
    .line 158
    and-int/lit8 v8, v8, 0x13

    .line 159
    .line 160
    const/16 v10, 0x12

    .line 161
    .line 162
    if-eq v8, v10, :cond_a

    .line 163
    .line 164
    goto :goto_b

    .line 165
    :cond_a
    const/4 v8, 0x0

    .line 166
    goto :goto_c

    .line 167
    :cond_b
    :goto_b
    const/4 v8, 0x1

    .line 168
    :goto_c
    and-int/lit8 v10, v0, 0x1

    .line 169
    .line 170
    invoke-virtual {v9, v10, v8}, Lpi;->O(IZ)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eqz v8, :cond_c

    .line 175
    .line 176
    new-instance v10, Li2;

    .line 177
    .line 178
    move-object/from16 v21, p0

    .line 179
    .line 180
    move-wide/from16 v15, p11

    .line 181
    .line 182
    move-wide/from16 v19, v4

    .line 183
    .line 184
    move-wide/from16 v17, v6

    .line 185
    .line 186
    invoke-direct/range {v10 .. v21}, Li2;-><init>(Lww;Lww;JJJJLmh;)V

    .line 187
    .line 188
    .line 189
    const v4, -0x26e8eb4a

    .line 190
    .line 191
    .line 192
    invoke-static {v4, v10, v9}, Lkl;->w(ILex;Lji;)Lmh;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    shr-int/lit8 v4, v0, 0xc

    .line 197
    .line 198
    and-int/lit8 v5, v4, 0x70

    .line 199
    .line 200
    const v6, 0xc00006

    .line 201
    .line 202
    .line 203
    or-int/2addr v5, v6

    .line 204
    and-int/lit16 v4, v4, 0x380

    .line 205
    .line 206
    or-int/2addr v4, v5

    .line 207
    shr-int/lit8 v0, v0, 0x9

    .line 208
    .line 209
    const v5, 0xe000

    .line 210
    .line 211
    .line 212
    and-int/2addr v0, v5

    .line 213
    or-int v10, v4, v0

    .line 214
    .line 215
    const/16 v11, 0x68

    .line 216
    .line 217
    sget-object v0, Lme0;->a:Lme0;

    .line 218
    .line 219
    const-wide/16 v4, 0x0

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v6, 0x0

    .line 223
    invoke-static/range {v0 .. v11}, Lh51;->a(Lpe0;Lx01;JJFFLmh;Lji;II)V

    .line 224
    .line 225
    .line 226
    move-object v12, v0

    .line 227
    goto :goto_d

    .line 228
    :cond_c
    invoke-virtual {v9}, Lpi;->R()V

    .line 229
    .line 230
    .line 231
    move-object/from16 v12, p1

    .line 232
    .line 233
    :goto_d
    invoke-virtual {v9}, Lpi;->r()Lht0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_d

    .line 238
    .line 239
    new-instance v10, Le2;

    .line 240
    .line 241
    move-object/from16 v11, p0

    .line 242
    .line 243
    move-object/from16 v13, p2

    .line 244
    .line 245
    move-object/from16 v14, p3

    .line 246
    .line 247
    move-object/from16 v15, p4

    .line 248
    .line 249
    move-wide/from16 v16, p5

    .line 250
    .line 251
    move-wide/from16 v18, p7

    .line 252
    .line 253
    move-wide/from16 v20, p9

    .line 254
    .line 255
    move-wide/from16 v22, p11

    .line 256
    .line 257
    move-wide/from16 v24, p13

    .line 258
    .line 259
    move/from16 v26, p16

    .line 260
    .line 261
    invoke-direct/range {v10 .. v26}, Le2;-><init>(Lmh;Lpe0;Lww;Lww;Lx01;JJJJJI)V

    .line 262
    .line 263
    .line 264
    iput-object v10, v0, Lht0;->d:Lww;

    .line 265
    .line 266
    :cond_d
    return-void
.end method

.method public static final b(Lmh;Lji;I)V
    .locals 8

    .line 1
    check-cast p1, Lpi;

    .line 2
    .line 3
    const v0, -0x36b20a24    # -843613.75f

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    and-int/lit16 v0, p2, 0x93

    .line 10
    .line 11
    const/16 v1, 0x92

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    move v0, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Lpi;->O(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lii;->a:Lr3;

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    new-instance v0, Lb5;

    .line 37
    .line 38
    const/4 v1, 0x5

    .line 39
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    check-cast v0, Lxd0;

    .line 46
    .line 47
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    sget-object v5, Lme0;->a:Lme0;

    .line 56
    .line 57
    invoke-static {p1, v5}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    sget-object v6, Lfi;->b:Lei;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v6, Lei;->b:Lcj;

    .line 67
    .line 68
    invoke-virtual {p1}, Lpi;->Z()V

    .line 69
    .line 70
    .line 71
    iget-boolean v7, p1, Lpi;->S:Z

    .line 72
    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-virtual {p1}, Lpi;->j0()V

    .line 80
    .line 81
    .line 82
    :goto_1
    sget-object v6, Lei;->e:Lm7;

    .line 83
    .line 84
    invoke-static {p1, v6, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lei;->d:Lm7;

    .line 88
    .line 89
    invoke-static {p1, v0, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lei;->f:Lm7;

    .line 93
    .line 94
    iget-boolean v4, p1, Lpi;->S:Z

    .line 95
    .line 96
    if-nez v4, :cond_3

    .line 97
    .line 98
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v4, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_4

    .line 111
    .line 112
    :cond_3
    invoke-static {v1, p1, v1, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    sget-object v0, Lei;->c:Lm7;

    .line 116
    .line 117
    invoke-static {p1, v0, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x6

    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p0, p1, v0}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v3}, Lpi;->p(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-virtual {p1}, Lpi;->R()V

    .line 133
    .line 134
    .line 135
    :goto_2
    invoke-virtual {p1}, Lpi;->r()Lht0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-eqz p1, :cond_6

    .line 140
    .line 141
    new-instance v0, Lg2;

    .line 142
    .line 143
    invoke-direct {v0, p0, p2, v2}, Lg2;-><init>(Lmh;II)V

    .line 144
    .line 145
    .line 146
    iput-object v0, p1, Lht0;->d:Lww;

    .line 147
    .line 148
    :cond_6
    return-void
.end method

.method public static final c(Lhw;Lmh;Lpe0;Lww;Lww;Lww;Lx01;JJJJLxn;Lji;II)V
    .locals 25

    move/from16 v0, p17

    move/from16 v1, p18

    .line 1
    move-object/from16 v6, p16

    check-cast v6, Lpi;

    const v2, -0x33b6c663    # -5.274994E7f

    invoke-virtual {v6, v2}, Lpi;->X(I)Lpi;

    and-int/lit8 v2, v0, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p0

    invoke-virtual {v6, v2}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    move v5, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v6, v7}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    goto :goto_3

    :cond_3
    move-object/from16 v7, p1

    :goto_3
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v6, v10}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_4

    :cond_4
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v5, v13

    goto :goto_5

    :cond_5
    move-object/from16 v10, p2

    :goto_5
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_7

    move-object/from16 v13, p3

    invoke-virtual {v6, v13}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x800

    goto :goto_6

    :cond_6
    const/16 v16, 0x400

    :goto_6
    or-int v5, v5, v16

    goto :goto_7

    :cond_7
    move-object/from16 v13, p3

    :goto_7
    and-int/lit16 v3, v0, 0x6000

    if-nez v3, :cond_9

    const/4 v3, 0x0

    invoke-virtual {v6, v3}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_8

    :cond_8
    const/16 v3, 0x2000

    :goto_8
    or-int/2addr v5, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v0

    if-nez v3, :cond_b

    move-object/from16 v3, p4

    invoke-virtual {v6, v3}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/high16 v16, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v16, 0x10000

    :goto_9
    or-int v5, v5, v16

    goto :goto_a

    :cond_b
    move-object/from16 v3, p4

    :goto_a
    const/high16 v16, 0x180000

    and-int v16, v0, v16

    move-object/from16 v4, p5

    if-nez v16, :cond_d

    invoke-virtual {v6, v4}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    const/high16 v17, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v17, 0x80000

    :goto_b
    or-int v5, v5, v17

    :cond_d
    const/high16 v17, 0xc00000

    and-int v17, v0, v17

    move-object/from16 v8, p6

    if-nez v17, :cond_f

    invoke-virtual {v6, v8}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    const/high16 v18, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v18, 0x400000

    :goto_c
    or-int v5, v5, v18

    :cond_f
    const/high16 v18, 0x6000000

    and-int v18, v0, v18

    move-wide/from16 v9, p7

    if-nez v18, :cond_11

    invoke-virtual {v6, v9, v10}, Lpi;->e(J)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v19, 0x2000000

    :goto_d
    or-int v5, v5, v19

    :cond_11
    const/high16 v19, 0x30000000

    and-int v19, v0, v19

    move-wide/from16 v11, p9

    if-nez v19, :cond_13

    invoke-virtual {v6, v11, v12}, Lpi;->e(J)Z

    move-result v21

    if-eqz v21, :cond_12

    const/high16 v21, 0x20000000

    goto :goto_e

    :cond_12
    const/high16 v21, 0x10000000

    :goto_e
    or-int v5, v5, v21

    :cond_13
    and-int/lit8 v21, v1, 0x6

    move-wide/from16 v14, p11

    if-nez v21, :cond_15

    invoke-virtual {v6, v14, v15}, Lpi;->e(J)Z

    move-result v23

    if-eqz v23, :cond_14

    const/16 v16, 0x4

    goto :goto_f

    :cond_14
    const/16 v16, 0x2

    :goto_f
    or-int v16, v1, v16

    goto :goto_10

    :cond_15
    move/from16 v16, v1

    :goto_10
    and-int/lit8 v23, v1, 0x30

    move-wide/from16 v2, p13

    if-nez v23, :cond_17

    invoke-virtual {v6, v2, v3}, Lpi;->e(J)Z

    move-result v23

    if-eqz v23, :cond_16

    const/16 v17, 0x20

    goto :goto_11

    :cond_16
    const/16 v17, 0x10

    :goto_11
    or-int v16, v16, v17

    :cond_17
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_19

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lpi;->c(F)Z

    move-result v0

    if-eqz v0, :cond_18

    const/16 v19, 0x100

    goto :goto_12

    :cond_18
    const/16 v19, 0x80

    :goto_12
    or-int v16, v16, v19

    :cond_19
    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_1b

    move-object/from16 v0, p15

    invoke-virtual {v6, v0}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1a

    const/16 v21, 0x800

    goto :goto_13

    :cond_1a
    const/16 v21, 0x400

    :goto_13
    or-int v16, v16, v21

    :goto_14
    move/from16 v0, v16

    goto :goto_15

    :cond_1b
    move-object/from16 v0, p15

    goto :goto_14

    :goto_15
    const v16, 0x12492493

    and-int v1, v5, v16

    const v2, 0x12492492

    if-ne v1, v2, :cond_1d

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    if-eq v1, v2, :cond_1c

    goto :goto_16

    :cond_1c
    const/4 v1, 0x0

    goto :goto_17

    :cond_1d
    :goto_16
    const/4 v1, 0x1

    :goto_17
    and-int/lit8 v2, v5, 0x1

    invoke-virtual {v6, v2, v1}, Lpi;->O(IZ)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 2
    new-instance v10, Ll2;

    move-wide/from16 v20, p13

    move-object/from16 v23, v7

    move-wide/from16 v16, v11

    move-object/from16 v22, v13

    move-wide/from16 v18, v14

    move-object/from16 v11, p4

    move-wide/from16 v14, p7

    move-object v12, v4

    move-object v13, v8

    invoke-direct/range {v10 .. v23}, Ll2;-><init>(Lww;Lww;Lx01;JJJJLww;Lmh;)V

    const v1, 0x1f6fcd57

    invoke-static {v1, v10, v6}, Lkl;->w(ILex;Lji;)Lmh;

    move-result-object v1

    and-int/lit8 v2, v5, 0xe

    or-int/lit16 v2, v2, 0xc00

    shr-int/lit8 v3, v5, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v7, v2, v0

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p15

    move-object v5, v1

    .line 3
    invoke-static/range {v2 .. v7}, Lm2;->d(Lhw;Lpe0;Lxn;Lmh;Lji;I)V

    goto :goto_18

    .line 4
    :cond_1e
    invoke-virtual {v6}, Lpi;->R()V

    .line 5
    :goto_18
    invoke-virtual {v6}, Lpi;->r()Lht0;

    move-result-object v0

    if-eqz v0, :cond_1f

    move-object v1, v0

    new-instance v0, Ld2;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v24, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Ld2;-><init>(Lhw;Lmh;Lpe0;Lww;Lww;Lww;Lx01;JJJJLxn;II)V

    move-object/from16 v1, v24

    .line 6
    iput-object v0, v1, Lht0;->d:Lww;

    :cond_1f
    return-void
.end method

.method public static final d(Lhw;Lpe0;Lxn;Lmh;Lji;I)V
    .locals 7

    .line 1
    check-cast p4, Lpi;

    .line 2
    .line 3
    const v0, 0x17c55da

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p5, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p4, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p5

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p5

    .line 25
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p4, p1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {p4, p2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    const/16 v1, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v1, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_5
    and-int/lit16 v1, p5, 0xc00

    .line 58
    .line 59
    if-nez v1, :cond_7

    .line 60
    .line 61
    invoke-virtual {p4, p3}, Lpi;->h(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    const/16 v1, 0x800

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    const/16 v1, 0x400

    .line 71
    .line 72
    :goto_4
    or-int/2addr v0, v1

    .line 73
    :cond_7
    and-int/lit16 v1, v0, 0x493

    .line 74
    .line 75
    const/16 v2, 0x492

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x1

    .line 79
    if-eq v1, v2, :cond_8

    .line 80
    .line 81
    move v1, v4

    .line 82
    goto :goto_5

    .line 83
    :cond_8
    move v1, v3

    .line 84
    :goto_5
    and-int/2addr v0, v4

    .line 85
    invoke-virtual {p4, v0, v1}, Lpi;->O(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_9

    .line 90
    .line 91
    sget-object v0, Lm2;->d:Lej;

    .line 92
    .line 93
    invoke-virtual {p4, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lol;

    .line 98
    .line 99
    new-instance v1, Ly2;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object p0, v1, Ly2;->d:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object p1, v1, Ly2;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object p2, v1, Ly2;->f:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object p3, v1, Ly2;->g:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v0, v1, p4, v3}, Lol;->a(Ly2;Lji;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_9
    invoke-virtual {p4}, Lpi;->R()V

    .line 117
    .line 118
    .line 119
    :goto_6
    invoke-virtual {p4}, Lpi;->r()Lht0;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    if-eqz p4, :cond_a

    .line 124
    .line 125
    new-instance v0, Lf2;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    move-object v1, p0

    .line 129
    move-object v2, p1

    .line 130
    move-object v3, p2

    .line 131
    move-object v4, p3

    .line 132
    move v5, p5

    .line 133
    invoke-direct/range {v0 .. v6}, Lf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lww;II)V

    .line 134
    .line 135
    .line 136
    iput-object v0, p4, Lht0;->d:Lww;

    .line 137
    .line 138
    :cond_a
    return-void
.end method
