.class public final Lzc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0xfffe2c55L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lp30;->c(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, Lzc0;->a:J

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic A(Loh0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->v0(Loh0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final A0(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p3, p2}, Lzc0;->z0(Ljava/lang/String;Ljava/lang/String;Lji;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic B(Loh0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->t0(Loh0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final B0(Llf1;ZLsw;Lpe0;IZLji;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf1;",
            "Z",
            "Lsw;",
            "Lpe0;",
            "IZ",
            "Lji;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v7, p7

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object/from16 v0, p6

    .line 7
    .line 8
    check-cast v0, Lpi;

    .line 9
    .line 10
    const v1, -0x75817faf

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lpi;->X(I)Lpi;

    .line 14
    .line 15
    .line 16
    and-int/lit8 v1, v7, 0x6

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    move-object/from16 v11, p0

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v11}, Lpi;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    move v1, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x2

    .line 32
    :goto_0
    or-int/2addr v1, v7

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v1, v7

    .line 35
    :goto_1
    and-int/lit8 v3, v7, 0x30

    .line 36
    .line 37
    move/from16 v12, p1

    .line 38
    .line 39
    if-nez v3, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, v12}, Lpi;->g(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v1, v3

    .line 53
    :cond_3
    and-int/lit16 v3, v7, 0x180

    .line 54
    .line 55
    move-object/from16 v13, p2

    .line 56
    .line 57
    if-nez v3, :cond_5

    .line 58
    .line 59
    invoke-virtual {v0, v13}, Lpi;->h(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    const/16 v3, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v3, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v1, v3

    .line 71
    :cond_5
    and-int/lit8 v3, p8, 0x8

    .line 72
    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    or-int/lit16 v1, v1, 0xc00

    .line 76
    .line 77
    :cond_6
    move-object/from16 v4, p3

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_7
    and-int/lit16 v4, v7, 0xc00

    .line 81
    .line 82
    if-nez v4, :cond_6

    .line 83
    .line 84
    move-object/from16 v4, p3

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_8

    .line 91
    .line 92
    const/16 v5, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_8
    const/16 v5, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v1, v5

    .line 98
    :goto_5
    and-int/lit8 v5, p8, 0x10

    .line 99
    .line 100
    if-eqz v5, :cond_a

    .line 101
    .line 102
    or-int/lit16 v1, v1, 0x6000

    .line 103
    .line 104
    :cond_9
    move/from16 v6, p4

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_a
    and-int/lit16 v6, v7, 0x6000

    .line 108
    .line 109
    if-nez v6, :cond_9

    .line 110
    .line 111
    move/from16 v6, p4

    .line 112
    .line 113
    invoke-virtual {v0, v6}, Lpi;->d(I)Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-eqz v8, :cond_b

    .line 118
    .line 119
    const/16 v8, 0x4000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_b
    const/16 v8, 0x2000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v1, v8

    .line 125
    :goto_7
    and-int/lit8 v8, p8, 0x20

    .line 126
    .line 127
    const/high16 v9, 0x30000

    .line 128
    .line 129
    if-eqz v8, :cond_d

    .line 130
    .line 131
    or-int/2addr v1, v9

    .line 132
    :cond_c
    move/from16 v9, p5

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :cond_d
    and-int/2addr v9, v7

    .line 136
    if-nez v9, :cond_c

    .line 137
    .line 138
    move/from16 v9, p5

    .line 139
    .line 140
    invoke-virtual {v0, v9}, Lpi;->g(Z)Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-eqz v10, :cond_e

    .line 145
    .line 146
    const/high16 v10, 0x20000

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_e
    const/high16 v10, 0x10000

    .line 150
    .line 151
    :goto_8
    or-int/2addr v1, v10

    .line 152
    :goto_9
    const v10, 0x12493

    .line 153
    .line 154
    .line 155
    and-int/2addr v10, v1

    .line 156
    const v14, 0x12492

    .line 157
    .line 158
    .line 159
    const/4 v15, 0x0

    .line 160
    const/16 v16, 0x1

    .line 161
    .line 162
    if-eq v10, v14, :cond_f

    .line 163
    .line 164
    move/from16 v10, v16

    .line 165
    .line 166
    goto :goto_a

    .line 167
    :cond_f
    move v10, v15

    .line 168
    :goto_a
    and-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    invoke-virtual {v0, v1, v10}, Lpi;->O(IZ)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_14

    .line 175
    .line 176
    if-eqz v3, :cond_10

    .line 177
    .line 178
    sget-object v1, Lme0;->a:Lme0;

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_10
    move-object v1, v4

    .line 182
    :goto_b
    if-eqz v5, :cond_11

    .line 183
    .line 184
    move v9, v15

    .line 185
    goto :goto_c

    .line 186
    :cond_11
    move v9, v6

    .line 187
    :goto_c
    if-eqz v8, :cond_12

    .line 188
    .line 189
    move v14, v15

    .line 190
    goto :goto_d

    .line 191
    :cond_12
    move/from16 v14, p5

    .line 192
    .line 193
    :goto_d
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    sget-object v4, Lii;->a:Lr3;

    .line 198
    .line 199
    if-ne v3, v4, :cond_13

    .line 200
    .line 201
    new-instance v3, Ldp0;

    .line 202
    .line 203
    invoke-direct {v3, v9}, Ldp0;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_13
    move-object v10, v3

    .line 210
    check-cast v10, Lwg0;

    .line 211
    .line 212
    sget-object v3, Ls11;->b:Lrt;

    .line 213
    .line 214
    invoke-interface {v1, v3}, Lpe0;->c(Lpe0;)Lpe0;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    new-instance v4, Lya;

    .line 219
    .line 220
    invoke-direct {v4, v2, v10}, Lya;-><init>(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    const v2, -0x7e3a9954

    .line 224
    .line 225
    .line 226
    invoke-static {v2, v4, v0}, Lkl;->w(ILex;Lji;)Lmh;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    new-instance v8, Lic0;

    .line 231
    .line 232
    invoke-direct/range {v8 .. v14}, Lic0;-><init>(ILwg0;Llf1;ZLsw;Z)V

    .line 233
    .line 234
    .line 235
    move v6, v9

    .line 236
    move v4, v14

    .line 237
    const v5, 0x3725f022

    .line 238
    .line 239
    .line 240
    invoke-static {v5, v8, v0}, Lkl;->w(ILex;Lji;)Lmh;

    .line 241
    .line 242
    .line 243
    move-result-object v19

    .line 244
    const v21, 0x30000180

    .line 245
    .line 246
    .line 247
    const/4 v9, 0x0

    .line 248
    const/4 v11, 0x0

    .line 249
    const/4 v12, 0x0

    .line 250
    const/4 v13, 0x0

    .line 251
    const-wide/16 v14, 0x0

    .line 252
    .line 253
    const-wide/16 v16, 0x0

    .line 254
    .line 255
    const/16 v18, 0x0

    .line 256
    .line 257
    move-object/from16 v20, v0

    .line 258
    .line 259
    move-object v10, v2

    .line 260
    move-object v8, v3

    .line 261
    invoke-static/range {v8 .. v21}, Lz60;->b(Lpe0;Lww;Lmh;Lww;Lww;IJJLfd1;Lmh;Lji;I)V

    .line 262
    .line 263
    .line 264
    move v5, v6

    .line 265
    move v6, v4

    .line 266
    move-object v4, v1

    .line 267
    goto :goto_e

    .line 268
    :cond_14
    move-object/from16 v20, v0

    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Lpi;->R()V

    .line 271
    .line 272
    .line 273
    move v5, v6

    .line 274
    move/from16 v6, p5

    .line 275
    .line 276
    :goto_e
    invoke-virtual/range {v20 .. v20}, Lpi;->r()Lht0;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    if-eqz v9, :cond_15

    .line 281
    .line 282
    new-instance v0, Ljc0;

    .line 283
    .line 284
    move-object/from16 v1, p0

    .line 285
    .line 286
    move/from16 v2, p1

    .line 287
    .line 288
    move-object/from16 v3, p2

    .line 289
    .line 290
    move/from16 v8, p8

    .line 291
    .line 292
    invoke-direct/range {v0 .. v8}, Ljc0;-><init>(Llf1;ZLsw;Lpe0;IZII)V

    .line 293
    .line 294
    .line 295
    iput-object v0, v9, Lht0;->d:Lww;

    .line 296
    .line 297
    :cond_15
    return-void
.end method

.method public static synthetic C(Loh0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->f0(Loh0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final C0(Lwg0;)I
    .locals 0

    .line 1
    check-cast p0, Ldp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldp0;->g()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static synthetic D(Lwg0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->L0(Lwg0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final D0(ILwg0;Llf1;ZLsw;ZLjn0;Lji;I)Lna1;
    .locals 21

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v3, p8, 0x6

    .line 11
    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    move-object/from16 v3, p7

    .line 15
    .line 16
    check-cast v3, Lpi;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v3, 0x2

    .line 27
    :goto_0
    or-int v3, p8, v3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v3, p8

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v4, v3, 0x13

    .line 33
    .line 34
    const/16 v5, 0x12

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    if-eq v4, v5, :cond_2

    .line 39
    .line 40
    move v4, v6

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v4, v7

    .line 43
    :goto_2
    and-int/2addr v3, v6

    .line 44
    move-object/from16 v5, p7

    .line 45
    .line 46
    check-cast v5, Lpi;

    .line 47
    .line 48
    invoke-virtual {v5, v3, v4}, Lpi;->O(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_a

    .line 53
    .line 54
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v4, Lii;->a:Lr3;

    .line 59
    .line 60
    if-ne v3, v4, :cond_3

    .line 61
    .line 62
    new-instance v3, Lsc0;

    .line 63
    .line 64
    invoke-direct {v3, v7}, Lsc0;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    check-cast v3, Lhw;

    .line 71
    .line 72
    sget-object v6, Loo0;->a:Lno0;

    .line 73
    .line 74
    new-array v6, v7, [Ljava/lang/Object;

    .line 75
    .line 76
    sget-object v8, Lkm;->J:Ld;

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Lpi;->d(I)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    const/4 v10, 0x0

    .line 83
    invoke-virtual {v5, v10}, Lpi;->c(F)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    or-int/2addr v9, v10

    .line 88
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    if-nez v9, :cond_4

    .line 93
    .line 94
    if-ne v10, v4, :cond_5

    .line 95
    .line 96
    :cond_4
    new-instance v10, Lmo0;

    .line 97
    .line 98
    invoke-direct {v10, v0, v3}, Lmo0;-><init>(ILhw;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    check-cast v10, Lhw;

    .line 105
    .line 106
    invoke-static {v6, v8, v10, v5, v7}, Lr60;->y([Ljava/lang/Object;Lqx0;Lhw;Lji;I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    move-object v8, v0

    .line 111
    check-cast v8, Lkm;

    .line 112
    .line 113
    iget-object v0, v8, Lkm;->I:Lgp0;

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Lzc0;->C0(Lwg0;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v5, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    const/4 v7, 0x0

    .line 135
    if-nez v3, :cond_6

    .line 136
    .line 137
    if-ne v6, v4, :cond_7

    .line 138
    .line 139
    :cond_6
    new-instance v6, Lzc0$c;

    .line 140
    .line 141
    invoke-direct {v6, v8, v1, v7}, Lzc0$c;-><init>(Llo0;Lwg0;Lik;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    check-cast v6, Lww;

    .line 148
    .line 149
    invoke-static {v5, v6, v0}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v8, Llo0;->d:Lco0;

    .line 153
    .line 154
    iget-object v0, v0, Lco0;->b:Ldp0;

    .line 155
    .line 156
    invoke-virtual {v0}, Ldp0;->g()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v5, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    invoke-virtual {v5}, Lpi;->L()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    if-nez v3, :cond_8

    .line 173
    .line 174
    if-ne v6, v4, :cond_9

    .line 175
    .line 176
    :cond_8
    new-instance v6, Lzc0$d;

    .line 177
    .line 178
    invoke-direct {v6, v8, v1, v7}, Lzc0$d;-><init>(Llo0;Lwg0;Lik;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_9
    check-cast v6, Lww;

    .line 185
    .line 186
    invoke-static {v5, v6, v0}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object v0, Lme0;->a:Lme0;

    .line 190
    .line 191
    invoke-static {v0, v2}, Lrd0;->C(Lpe0;Ljn0;)Lpe0;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    new-instance v0, Ltc0;

    .line 196
    .line 197
    move-object/from16 v1, p2

    .line 198
    .line 199
    move/from16 v2, p3

    .line 200
    .line 201
    move-object/from16 v3, p4

    .line 202
    .line 203
    move/from16 v4, p5

    .line 204
    .line 205
    invoke-direct {v0, v1, v2, v3, v4}, Ltc0;-><init>(Llf1;ZLsw;Z)V

    .line 206
    .line 207
    .line 208
    const v1, 0xcb67823

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v0, v5}, Lkl;->w(ILex;Lji;)Lmh;

    .line 212
    .line 213
    .line 214
    move-result-object v18

    .line 215
    const/16 v20, 0x0

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    const/4 v11, 0x0

    .line 219
    const/4 v12, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    move-object/from16 v19, v5

    .line 228
    .line 229
    invoke-static/range {v8 .. v20}, Lr60;->a(Lkm;Lpe0;Ljn0;Ln2;Lga;Lf21;ZLaj0;Ln2;Lj5;Lmh;Lji;I)V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_a
    move-object/from16 v19, v5

    .line 234
    .line 235
    invoke-virtual/range {v19 .. v19}, Lpi;->R()V

    .line 236
    .line 237
    .line 238
    :goto_3
    sget-object v0, Lna1;->a:Lna1;

    .line 239
    .line 240
    return-object v0
.end method

.method public static synthetic E(Ljava/util/List;Landroid/content/Context;Lx60;ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lzc0;->p0(Ljava/util/List;Landroid/content/Context;Lx60;ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final E0()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public static synthetic F()I
    .locals 1

    .line 1
    invoke-static {}, Lzc0;->E0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static final F0(Llf1;ZLsw;ZLao0;ILji;I)Lna1;
    .locals 7

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p4, 0x0

    .line 5
    if-eqz p5, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    if-eq p5, p0, :cond_0

    .line 9
    .line 10
    check-cast p6, Lpi;

    .line 11
    .line 12
    const p0, 0x6596c37f

    .line 13
    .line 14
    .line 15
    invoke-virtual {p6, p0}, Lpi;->W(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p6, p4}, Lpi;->p(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast p6, Lpi;

    .line 23
    .line 24
    const p1, -0x4706e675

    .line 25
    .line 26
    .line 27
    invoke-virtual {p6, p1}, Lpi;->W(I)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-static {p1, p3, p6, p4, p0}, Lzc0;->T0(Lpe0;ZLji;II)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v4, p6

    .line 36
    check-cast v4, Lpi;

    .line 37
    .line 38
    const p3, -0x4706fcdd

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p3}, Lpi;->W(I)V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/16 v6, 0x8

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    move-object v0, p0

    .line 49
    move v1, p1

    .line 50
    move-object v2, p2

    .line 51
    invoke-static/range {v0 .. v6}, Lzc0;->g0(Llf1;ZLsw;Lpe0;Lji;II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p4}, Lpi;->p(Z)V

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 58
    .line 59
    return-object p0
.end method

.method public static synthetic G(Loh0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->W(Loh0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final G0(Llf1;ZLsw;Lpe0;IZIILji;I)Lna1;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result v8

    .line 7
    move-object v1, p0

    .line 8
    move v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move v5, p4

    .line 12
    move v6, p5

    .line 13
    move/from16 v9, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    invoke-static/range {v1 .. v9}, Lzc0;->B0(Llf1;ZLsw;Lpe0;IZLji;II)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lna1;->a:Lna1;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic H(Loh0;Lji;I)Lna1;
    .locals 1

    .line 1
    sget-object v0, Lxf;->a:Lxf;

    .line 2
    .line 3
    invoke-static {v0, p0, p1, p2}, Lzc0;->u0(Lwf;Loh0;Lji;I)Lna1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static final H0(Lwg0;I)V
    .locals 0

    .line 1
    check-cast p0, Ldp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldp0;->h(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic I(Landroid/content/Context;Landroid/graphics/Bitmap;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lzc0;->T(Landroid/content/Context;Landroid/graphics/Bitmap;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final I0(Lwg0;Lji;I)Lna1;
    .locals 13

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eq v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/2addr p2, v1

    .line 11
    move-object v11, p1

    .line 12
    check-cast v11, Lpi;

    .line 13
    .line 14
    invoke-virtual {v11, p2, v0}, Lpi;->O(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    sget-object p1, Lnf;->a:Lg41;

    .line 21
    .line 22
    invoke-virtual {v11, p1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Llf;

    .line 27
    .line 28
    iget-wide v4, p1, Llf;->p:J

    .line 29
    .line 30
    new-instance p1, Lvc;

    .line 31
    .line 32
    invoke-direct {p1, v2, p0}, Lvc;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const p0, -0x89b6db

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1, v11}, Lkl;->w(ILex;Lji;)Lmh;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const v12, 0x30c00

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const-wide/16 v6, 0x0

    .line 47
    .line 48
    const/high16 v8, 0x40400000    # 3.0f

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    invoke-static/range {v3 .. v12}, Loi0;->a(Lpe0;JJFLfd1;Lmh;Lji;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v11}, Lpi;->R()V

    .line 56
    .line 57
    .line 58
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 59
    .line 60
    return-object p0
.end method

.method public static synthetic J(Landroid/content/Context;Ljava/lang/String;)Lna1;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lzc0;->P(Ljava/lang/String;Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final J0(Lwg0;Ljw0;Lji;I)Lna1;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    and-int/lit8 v1, p3, 0x6

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    move-object/from16 v1, p2

    .line 11
    .line 12
    check-cast v1, Lpi;

    .line 13
    .line 14
    move-object/from16 v2, p1

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x2

    .line 25
    :goto_0
    or-int v1, p3, v1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object/from16 v2, p1

    .line 29
    .line 30
    move/from16 v1, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v3, v1, 0x13

    .line 33
    .line 34
    const/16 v4, 0x12

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x1

    .line 38
    if-eq v3, v4, :cond_2

    .line 39
    .line 40
    move v3, v14

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v3, v13

    .line 43
    :goto_2
    and-int/lit8 v4, v1, 0x1

    .line 44
    .line 45
    move-object/from16 v11, p2

    .line 46
    .line 47
    check-cast v11, Lpi;

    .line 48
    .line 49
    invoke-virtual {v11, v4, v3}, Lpi;->O(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_7

    .line 54
    .line 55
    invoke-static {v0}, Lzc0;->C0(Lwg0;)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    move v3, v14

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move v3, v13

    .line 64
    :goto_3
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget-object v15, Lii;->a:Lr3;

    .line 69
    .line 70
    if-ne v4, v15, :cond_4

    .line 71
    .line 72
    new-instance v4, Loc0;

    .line 73
    .line 74
    invoke-direct {v4, v0, v13}, Loc0;-><init>(Lwg0;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v11, v4}, Lpi;->g0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    check-cast v4, Lhw;

    .line 81
    .line 82
    sget-object v16, Loh;->a:Loh;

    .line 83
    .line 84
    invoke-virtual/range {v16 .. v16}, Loh;->x()Lww;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    invoke-virtual/range {v16 .. v16}, Loh;->n()Lww;

    .line 89
    .line 90
    .line 91
    move-result-object v17

    .line 92
    invoke-static {}, Lhf;->d()J

    .line 93
    .line 94
    .line 95
    move-result-wide v5

    .line 96
    invoke-static {}, Lhf;->d()J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    invoke-static {}, Lhf;->d()J

    .line 101
    .line 102
    .line 103
    move-result-wide v9

    .line 104
    const v13, 0x3df5c28f    # 0.12f

    .line 105
    .line 106
    .line 107
    invoke-static {v13, v9, v10}, Lff;->b(FJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    invoke-static/range {v5 .. v11}, Lz60;->q(JJJLpi;)Lei0;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    and-int/lit8 v1, v1, 0xe

    .line 116
    .line 117
    const v5, 0x180d80

    .line 118
    .line 119
    .line 120
    or-int/2addr v1, v5

    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    move-object v5, v12

    .line 125
    move-object/from16 v8, v17

    .line 126
    .line 127
    move v12, v1

    .line 128
    invoke-static/range {v2 .. v12}, Loi0;->b(Ljw0;ZLhw;Lww;Lpe0;ZLww;ZLei0;Lji;I)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Lzc0;->C0(Lwg0;)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-ne v1, v14, :cond_5

    .line 136
    .line 137
    move v3, v14

    .line 138
    goto :goto_4

    .line 139
    :cond_5
    const/4 v3, 0x0

    .line 140
    :goto_4
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-ne v1, v15, :cond_6

    .line 145
    .line 146
    new-instance v1, Loc0;

    .line 147
    .line 148
    invoke-direct {v1, v0, v14}, Loc0;-><init>(Lwg0;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    move-object v4, v1

    .line 155
    check-cast v4, Lhw;

    .line 156
    .line 157
    invoke-virtual/range {v16 .. v16}, Loh;->v()Lww;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual/range {v16 .. v16}, Loh;->m()Lww;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {}, Lhf;->d()J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    invoke-static {}, Lhf;->d()J

    .line 170
    .line 171
    .line 172
    move-result-wide v7

    .line 173
    invoke-static {}, Lhf;->d()J

    .line 174
    .line 175
    .line 176
    move-result-wide v9

    .line 177
    invoke-static {v13, v9, v10}, Lff;->b(FJ)J

    .line 178
    .line 179
    .line 180
    move-result-wide v9

    .line 181
    invoke-static/range {v5 .. v11}, Lz60;->q(JJJLpi;)Lei0;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    move-object/from16 v2, p1

    .line 189
    .line 190
    move-object v5, v0

    .line 191
    move-object v8, v1

    .line 192
    invoke-static/range {v2 .. v12}, Loi0;->b(Ljw0;ZLhw;Lww;Lpe0;ZLww;ZLei0;Lji;I)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_7
    invoke-virtual {v11}, Lpi;->R()V

    .line 197
    .line 198
    .line 199
    :goto_5
    sget-object v0, Lna1;->a:Lna1;

    .line 200
    .line 201
    return-object v0
.end method

.method public static synthetic K(Loh0;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->V(Loh0;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final K0(Lwg0;)Lna1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lzc0;->H0(Lwg0;I)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lna1;->a:Lna1;

    .line 6
    .line 7
    return-object p0
.end method

.method public static synthetic L(Llf1;ZLsw;ZLao0;ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lzc0;->F0(Llf1;ZLsw;ZLao0;ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final L0(Lwg0;)Lna1;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lzc0;->H0(Lwg0;I)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lna1;->a:Lna1;

    .line 6
    .line 7
    return-object p0
.end method

.method public static synthetic M(ZIILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lzc0;->Y(ZIILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final M0(Lww;Lji;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lww;",
            "Lji;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    check-cast v7, Lpi;

    .line 11
    .line 12
    const v2, -0x1cea2545

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v2}, Lpi;->X(I)Lpi;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v2, v1, 0x6

    .line 19
    .line 20
    const/4 v9, 0x2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v7, v0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v9

    .line 32
    :goto_0
    or-int/2addr v2, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v1

    .line 35
    :goto_1
    and-int/lit8 v3, v2, 0x3

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-eq v3, v9, :cond_2

    .line 39
    .line 40
    move v3, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v3, 0x0

    .line 43
    :goto_2
    and-int/2addr v2, v4

    .line 44
    invoke-virtual {v7, v2, v3}, Lpi;->O(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_8

    .line 49
    .line 50
    sget-object v2, Ls11;->a:Lrt;

    .line 51
    .line 52
    const/high16 v3, 0x41600000    # 14.0f

    .line 53
    .line 54
    invoke-static {v3}, Lew0;->a(F)Ldw0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v5, Lnf;->a:Lg41;

    .line 59
    .line 60
    invoke-virtual {v7, v5}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Llf;

    .line 65
    .line 66
    iget-wide v10, v6, Llf;->p:J

    .line 67
    .line 68
    invoke-static {v10, v11, v7}, Lnf;->b(JLji;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v12

    .line 72
    sget-wide v14, Lff;->g:J

    .line 73
    .line 74
    const v6, 0x3ec28f5c    # 0.38f

    .line 75
    .line 76
    .line 77
    invoke-static {v6, v12, v13}, Lff;->b(FJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v16

    .line 81
    invoke-virtual {v7, v5}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Llf;

    .line 86
    .line 87
    invoke-static {v5}, Lpf1;->w(Llf;)Lfd;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-wide/16 v18, 0x10

    .line 92
    .line 93
    cmp-long v6, v10, v18

    .line 94
    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    :goto_3
    move-wide/from16 v21, v10

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_3
    iget-wide v10, v5, Lfd;->a:J

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    cmp-long v6, v12, v18

    .line 104
    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    :goto_5
    move-wide/from16 v23, v12

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_4
    iget-wide v12, v5, Lfd;->b:J

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :goto_6
    cmp-long v6, v14, v18

    .line 114
    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    :goto_7
    move-wide/from16 v25, v14

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_5
    iget-wide v14, v5, Lfd;->c:J

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :goto_8
    cmp-long v6, v16, v18

    .line 124
    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    move-wide/from16 v27, v16

    .line 128
    .line 129
    goto :goto_9

    .line 130
    :cond_6
    iget-wide v5, v5, Lfd;->d:J

    .line 131
    .line 132
    move-wide/from16 v27, v5

    .line 133
    .line 134
    :goto_9
    new-instance v20, Lfd;

    .line 135
    .line 136
    invoke-direct/range {v20 .. v28}, Lfd;-><init>(JJJJ)V

    .line 137
    .line 138
    .line 139
    const/16 v5, 0x3e

    .line 140
    .line 141
    and-int/2addr v5, v4

    .line 142
    if-eqz v5, :cond_7

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    goto :goto_a

    .line 146
    :cond_7
    const/high16 v5, 0x40000000    # 2.0f

    .line 147
    .line 148
    :goto_a
    sget v6, Lo30;->j:F

    .line 149
    .line 150
    sget v8, Lo30;->i:F

    .line 151
    .line 152
    new-instance v10, Lgd;

    .line 153
    .line 154
    invoke-direct {v10, v5, v6, v8}, Lgd;-><init>(FFF)V

    .line 155
    .line 156
    .line 157
    new-instance v5, Lvc;

    .line 158
    .line 159
    invoke-direct {v5, v4, v0}, Lvc;-><init>(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    const v4, 0x22958c89

    .line 163
    .line 164
    .line 165
    invoke-static {v4, v5, v7}, Lkl;->w(ILex;Lji;)Lmh;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    const v8, 0x30006

    .line 170
    .line 171
    .line 172
    move-object v5, v10

    .line 173
    move-object/from16 v4, v20

    .line 174
    .line 175
    invoke-static/range {v2 .. v8}, Li4;->a(Lpe0;Lx01;Lfd;Lgd;Lmh;Lji;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_b

    .line 179
    :cond_8
    invoke-virtual {v7}, Lpi;->R()V

    .line 180
    .line 181
    .line 182
    :goto_b
    invoke-virtual {v7}, Lpi;->r()Lht0;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-eqz v2, :cond_9

    .line 187
    .line 188
    new-instance v3, Lq80;

    .line 189
    .line 190
    invoke-direct {v3, v1, v9, v0}, Lq80;-><init>(IILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iput-object v3, v2, Lht0;->d:Lww;

    .line 194
    .line 195
    :cond_9
    return-void
.end method

.method public static synthetic N(Llf1;ZLsw;Lpe0;IZIILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lzc0;->G0(Llf1;ZLsw;Lpe0;IZIILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final N0(Lww;Lwf;Lji;I)Lna1;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p3, 0x11

    .line 5
    .line 6
    const/16 v0, 0x10

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    move p1, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v1

    .line 15
    :goto_0
    and-int/2addr p3, v2

    .line 16
    check-cast p2, Lpi;

    .line 17
    .line 18
    invoke-virtual {p2, p3, p1}, Lpi;->O(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    sget-object p1, Lme0;->a:Lme0;

    .line 25
    .line 26
    invoke-static {p1}, Lrd0;->D(Lpe0;)Lpe0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object p3, Ln2;->q:Lfa;

    .line 31
    .line 32
    invoke-static {p3, p2, v1}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    iget-wide v3, p2, Lpi;->T:J

    .line 37
    .line 38
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p2}, Lpi;->l()Lfq0;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {p2, p1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v4, Lfi;->b:Lei;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v4, Lei;->b:Lcj;

    .line 56
    .line 57
    invoke-virtual {p2}, Lpi;->Z()V

    .line 58
    .line 59
    .line 60
    iget-boolean v5, p2, Lpi;->S:Z

    .line 61
    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    invoke-virtual {p2, v4}, Lpi;->k(Lhw;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p2}, Lpi;->j0()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object v4, Lei;->e:Lm7;

    .line 72
    .line 73
    invoke-static {p2, v4, p3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p3, Lei;->d:Lm7;

    .line 77
    .line 78
    invoke-static {p2, p3, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    sget-object v0, Lei;->f:Lm7;

    .line 86
    .line 87
    invoke-static {p2, p3, v0}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 88
    .line 89
    .line 90
    sget-object p3, Lei;->g:Lp3;

    .line 91
    .line 92
    invoke-static {p2, p3}, Lw60;->G(Lji;Lsw;)V

    .line 93
    .line 94
    .line 95
    sget-object p3, Lei;->c:Lm7;

    .line 96
    .line 97
    invoke-static {p2, p3, p1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p0, p2, p1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v2}, Lpi;->p(Z)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    invoke-virtual {p2}, Lpi;->R()V

    .line 112
    .line 113
    .line 114
    :goto_2
    sget-object p0, Lna1;->a:Lna1;

    .line 115
    .line 116
    return-object p0
.end method

.method public static final O(Lji;I)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    check-cast v1, Lpi;

    .line 4
    .line 5
    const v2, 0x3b5dce1b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move v4, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v2

    .line 18
    :goto_0
    and-int/lit8 v5, p1, 0x1

    .line 19
    .line 20
    invoke-virtual {v1, v5, v4}, Lpi;->O(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_7

    .line 25
    .line 26
    sget-object v4, Lr4;->b:Lg41;

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroid/content/Context;

    .line 33
    .line 34
    new-instance v5, Luo0;

    .line 35
    .line 36
    const-string v6, "https://github.com/LuckyPray/DexKit"

    .line 37
    .line 38
    const-string v7, "\u5f00\u6e90\u7684\u9ad8\u6027\u80fdDEX\u53cd\u6df7\u6dc6\u4e0eHook\u70b9\u67e5\u627e\u5e93"

    .line 39
    .line 40
    invoke-direct {v5, v6, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v8, Luo0;

    .line 44
    .line 45
    const-string v6, "DexKit"

    .line 46
    .line 47
    invoke-direct {v8, v6, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v5, Luo0;

    .line 51
    .line 52
    const-string v6, "https://github.com/frida/frida"

    .line 53
    .line 54
    const-string v7, "\u5f00\u6e90\u8de8\u5e73\u53f0\u52a8\u6001\u63d2\u6869\u4e0e\u9006\u5411\u8c03\u8bd5\u6846\u67b6"

    .line 55
    .line 56
    invoke-direct {v5, v6, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Luo0;

    .line 60
    .line 61
    const-string v6, "Frida"

    .line 62
    .line 63
    invoke-direct {v9, v6, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v5, Luo0;

    .line 67
    .line 68
    const-string v6, "https://www.deepseek.com/"

    .line 69
    .line 70
    const-string v7, "\u6df1\u5ea6\u6c42\u7d22\u51fa\u54c1\u7684\u56fd\u4ea7\u5927\u8bed\u8a00\u6a21\u578b"

    .line 71
    .line 72
    invoke-direct {v5, v6, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v10, Luo0;

    .line 76
    .line 77
    const-string v6, "DeepSeek"

    .line 78
    .line 79
    invoke-direct {v10, v6, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v5, Luo0;

    .line 83
    .line 84
    const-string v6, "https://www.trae.cn/"

    .line 85
    .line 86
    const-string v7, "\u5b57\u8282\u8df3\u52a8\u51fa\u54c1\u7684AI\u7f16\u7a0bIDE"

    .line 87
    .line 88
    invoke-direct {v5, v6, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v11, Luo0;

    .line 92
    .line 93
    const-string v6, "Trae CN"

    .line 94
    .line 95
    invoke-direct {v11, v6, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v5, Luo0;

    .line 99
    .line 100
    const-string v6, "https://github.com/skylot/jadx"

    .line 101
    .line 102
    const-string v7, "\u5f00\u6e90\u7684Android DEX/APK\u53cd\u7f16\u8bd1\u5de5\u5177"

    .line 103
    .line 104
    invoke-direct {v5, v6, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v12, Luo0;

    .line 108
    .line 109
    const-string v6, "JADX"

    .line 110
    .line 111
    invoke-direct {v12, v6, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v5, Luo0;

    .line 115
    .line 116
    const-string v6, "https://github.com/zinja-coder/jadx-ai-mcp"

    .line 117
    .line 118
    const-string v7, "\u5f00\u6e90\u7684\u57fa\u4e8eMCP\u534f\u8bae\u7684JADX\u667a\u80fdAI\u63d2\u4ef6"

    .line 119
    .line 120
    invoke-direct {v5, v6, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v13, Luo0;

    .line 124
    .line 125
    const-string v6, "JADX-AI-MCP"

    .line 126
    .line 127
    invoke-direct {v13, v6, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    filled-new-array/range {v8 .. v13}, [Luo0;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v5}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    sget-object v6, Ln2;->q:Lfa;

    .line 139
    .line 140
    invoke-static {v6, v1, v2}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    iget-wide v7, v1, Lpi;->T:J

    .line 145
    .line 146
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-virtual {v1}, Lpi;->l()Lfq0;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    sget-object v9, Lme0;->a:Lme0;

    .line 155
    .line 156
    invoke-static {v1, v9}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    sget-object v10, Lfi;->b:Lei;

    .line 161
    .line 162
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    sget-object v10, Lei;->b:Lcj;

    .line 166
    .line 167
    invoke-virtual {v1}, Lpi;->Z()V

    .line 168
    .line 169
    .line 170
    iget-boolean v11, v1, Lpi;->S:Z

    .line 171
    .line 172
    if-eqz v11, :cond_1

    .line 173
    .line 174
    invoke-virtual {v1, v10}, Lpi;->k(Lhw;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_1
    invoke-virtual {v1}, Lpi;->j0()V

    .line 179
    .line 180
    .line 181
    :goto_1
    sget-object v10, Lei;->e:Lm7;

    .line 182
    .line 183
    invoke-static {v1, v10, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    sget-object v6, Lei;->d:Lm7;

    .line 187
    .line 188
    invoke-static {v1, v6, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    sget-object v7, Lei;->f:Lm7;

    .line 196
    .line 197
    invoke-static {v1, v6, v7}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 198
    .line 199
    .line 200
    sget-object v6, Lei;->g:Lp3;

    .line 201
    .line 202
    invoke-static {v1, v6}, Lw60;->G(Lji;Lsw;)V

    .line 203
    .line 204
    .line 205
    sget-object v6, Lei;->c:Lm7;

    .line 206
    .line 207
    invoke-static {v1, v6, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    const v6, 0x7ecdeecd

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v6}, Lpi;->W(I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v23

    .line 220
    move v5, v2

    .line 221
    :goto_2
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-eqz v6, :cond_6

    .line 226
    .line 227
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    add-int/lit8 v24, v5, 0x1

    .line 232
    .line 233
    if-ltz v5, :cond_5

    .line 234
    .line 235
    check-cast v6, Luo0;

    .line 236
    .line 237
    iget-object v5, v6, Luo0;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v5, Ljava/lang/String;

    .line 240
    .line 241
    iget-object v6, v6, Luo0;->e:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v6, Luo0;

    .line 244
    .line 245
    iget-object v7, v6, Luo0;->d:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v7, Ljava/lang/String;

    .line 248
    .line 249
    iget-object v6, v6, Luo0;->e:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v6, Ljava/lang/String;

    .line 252
    .line 253
    sget-object v8, Ls11;->a:Lrt;

    .line 254
    .line 255
    invoke-virtual {v1, v7}, Lpi;->f(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    invoke-virtual {v1, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    or-int/2addr v9, v10

    .line 264
    invoke-virtual {v1}, Lpi;->L()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    if-nez v9, :cond_2

    .line 269
    .line 270
    sget-object v9, Lii;->a:Lr3;

    .line 271
    .line 272
    if-ne v10, v9, :cond_3

    .line 273
    .line 274
    :cond_2
    new-instance v10, Lkc0;

    .line 275
    .line 276
    invoke-direct {v10, v7, v4}, Lkc0;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_3
    check-cast v10, Lhw;

    .line 283
    .line 284
    invoke-static {v8, v10}, Lrd0;->j(Lpe0;Lhw;)Lpe0;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    const/high16 v8, 0x40800000    # 4.0f

    .line 289
    .line 290
    const/4 v9, 0x0

    .line 291
    invoke-static {v7, v9, v8, v3}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    sget-object v8, Lrd0;->a:Lt8;

    .line 296
    .line 297
    sget-object v9, Ln2;->n:Lga;

    .line 298
    .line 299
    invoke-static {v8, v9, v1, v2}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    iget-wide v9, v1, Lpi;->T:J

    .line 304
    .line 305
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    invoke-virtual {v1}, Lpi;->l()Lfq0;

    .line 310
    .line 311
    .line 312
    move-result-object v10

    .line 313
    invoke-static {v1, v7}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    sget-object v11, Lfi;->b:Lei;

    .line 318
    .line 319
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    sget-object v11, Lei;->b:Lcj;

    .line 323
    .line 324
    invoke-virtual {v1}, Lpi;->Z()V

    .line 325
    .line 326
    .line 327
    iget-boolean v12, v1, Lpi;->S:Z

    .line 328
    .line 329
    if-eqz v12, :cond_4

    .line 330
    .line 331
    invoke-virtual {v1, v11}, Lpi;->k(Lhw;)V

    .line 332
    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_4
    invoke-virtual {v1}, Lpi;->j0()V

    .line 336
    .line 337
    .line 338
    :goto_3
    sget-object v11, Lei;->e:Lm7;

    .line 339
    .line 340
    invoke-static {v1, v11, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    sget-object v8, Lei;->d:Lm7;

    .line 344
    .line 345
    invoke-static {v1, v8, v10}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    sget-object v9, Lei;->f:Lm7;

    .line 353
    .line 354
    invoke-static {v1, v8, v9}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 355
    .line 356
    .line 357
    sget-object v8, Lei;->g:Lp3;

    .line 358
    .line 359
    invoke-static {v1, v8}, Lw60;->G(Lji;Lsw;)V

    .line 360
    .line 361
    .line 362
    sget-object v8, Lei;->c:Lm7;

    .line 363
    .line 364
    invoke-static {v1, v8, v7}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    const/16 v7, 0xd

    .line 368
    .line 369
    invoke-static {v7}, Lj50;->q(I)J

    .line 370
    .line 371
    .line 372
    move-result-wide v7

    .line 373
    move-object/from16 v19, v1

    .line 374
    .line 375
    move-object v1, v5

    .line 376
    move-wide/from16 v29, v7

    .line 377
    .line 378
    move-object v8, v6

    .line 379
    move-wide/from16 v5, v29

    .line 380
    .line 381
    sget-object v7, Lzv;->g:Lzv;

    .line 382
    .line 383
    move v10, v3

    .line 384
    move-object v9, v4

    .line 385
    invoke-static {}, Lhf;->d()J

    .line 386
    .line 387
    .line 388
    move-result-wide v3

    .line 389
    const/16 v21, 0x0

    .line 390
    .line 391
    const v22, 0x3ffaa

    .line 392
    .line 393
    .line 394
    move v11, v2

    .line 395
    const/4 v2, 0x0

    .line 396
    move-object v12, v8

    .line 397
    const/4 v8, 0x0

    .line 398
    move-object v13, v9

    .line 399
    move v14, v10

    .line 400
    const-wide/16 v9, 0x0

    .line 401
    .line 402
    move v15, v11

    .line 403
    const/4 v11, 0x0

    .line 404
    move-object/from16 v17, v12

    .line 405
    .line 406
    move-object/from16 v16, v13

    .line 407
    .line 408
    const-wide/16 v12, 0x0

    .line 409
    .line 410
    move/from16 v18, v14

    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    move/from16 v20, v15

    .line 414
    .line 415
    const/4 v15, 0x0

    .line 416
    move-object/from16 v25, v16

    .line 417
    .line 418
    const/16 v16, 0x0

    .line 419
    .line 420
    move-object/from16 v26, v17

    .line 421
    .line 422
    const/16 v17, 0x0

    .line 423
    .line 424
    move/from16 v27, v18

    .line 425
    .line 426
    const/16 v18, 0x0

    .line 427
    .line 428
    move/from16 v28, v20

    .line 429
    .line 430
    const v20, 0x186000

    .line 431
    .line 432
    .line 433
    move-object/from16 v0, v26

    .line 434
    .line 435
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v1, v19

    .line 439
    .line 440
    new-instance v2, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    const-string v3, " - "

    .line 443
    .line 444
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    const/16 v2, 0xc

    .line 455
    .line 456
    invoke-static {v2}, Lj50;->q(I)J

    .line 457
    .line 458
    .line 459
    move-result-wide v5

    .line 460
    sget-object v2, Lnf;->a:Lg41;

    .line 461
    .line 462
    invoke-virtual {v1, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    check-cast v2, Llf;

    .line 467
    .line 468
    iget-wide v3, v2, Llf;->s:J

    .line 469
    .line 470
    const v22, 0x3ffea

    .line 471
    .line 472
    .line 473
    const/4 v2, 0x0

    .line 474
    const/4 v7, 0x0

    .line 475
    const/16 v20, 0x6000

    .line 476
    .line 477
    move-object v1, v0

    .line 478
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 479
    .line 480
    .line 481
    move-object/from16 v1, v19

    .line 482
    .line 483
    const/4 v14, 0x1

    .line 484
    invoke-virtual {v1, v14}, Lpi;->p(Z)V

    .line 485
    .line 486
    .line 487
    move v3, v14

    .line 488
    move/from16 v5, v24

    .line 489
    .line 490
    move-object/from16 v4, v25

    .line 491
    .line 492
    const/4 v2, 0x0

    .line 493
    goto/16 :goto_2

    .line 494
    .line 495
    :cond_5
    invoke-static {}, Lo30;->A()V

    .line 496
    .line 497
    .line 498
    const/4 v0, 0x0

    .line 499
    throw v0

    .line 500
    :cond_6
    move v15, v2

    .line 501
    move v14, v3

    .line 502
    invoke-virtual {v1, v15}, Lpi;->p(Z)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, v14}, Lpi;->p(Z)V

    .line 506
    .line 507
    .line 508
    goto :goto_4

    .line 509
    :cond_7
    move v15, v2

    .line 510
    invoke-virtual {v1}, Lpi;->R()V

    .line 511
    .line 512
    .line 513
    :goto_4
    invoke-virtual {v1}, Lpi;->r()Lht0;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    if-eqz v0, :cond_8

    .line 518
    .line 519
    new-instance v1, Llc0;

    .line 520
    .line 521
    move/from16 v2, p1

    .line 522
    .line 523
    invoke-direct {v1, v2, v15}, Llc0;-><init>(II)V

    .line 524
    .line 525
    .line 526
    iput-object v1, v0, Lht0;->d:Lww;

    .line 527
    .line 528
    :cond_8
    return-void
.end method

.method private static final O0(Lww;ILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p1}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p2, p1}, Lzc0;->M0(Lww;Lji;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final P(Ljava/lang/String;Landroid/content/Context;)Lna1;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const-string p0, "\u672a\u627e\u5230\u6d4f\u89c8\u5668"

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p0, Lna1;->a:Lna1;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final P0(Ljava/lang/String;Lpe0;Lji;II)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p2

    .line 7
    .line 8
    check-cast v1, Lpi;

    .line 9
    .line 10
    const v2, 0x5bf14c3a

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lpi;->X(I)Lpi;

    .line 14
    .line 15
    .line 16
    and-int/lit8 v2, p3, 0x6

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int v2, p3, v2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move/from16 v2, p3

    .line 33
    .line 34
    :goto_1
    and-int/lit8 v3, p4, 0x2

    .line 35
    .line 36
    const/16 v4, 0x10

    .line 37
    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x30

    .line 41
    .line 42
    :cond_2
    move-object/from16 v5, p1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    and-int/lit8 v5, p3, 0x30

    .line 46
    .line 47
    if-nez v5, :cond_2

    .line 48
    .line 49
    move-object/from16 v5, p1

    .line 50
    .line 51
    invoke-virtual {v1, v5}, Lpi;->f(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    const/16 v6, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    move v6, v4

    .line 61
    :goto_2
    or-int/2addr v2, v6

    .line 62
    :goto_3
    and-int/lit8 v6, v2, 0x13

    .line 63
    .line 64
    const/16 v7, 0x12

    .line 65
    .line 66
    if-eq v6, v7, :cond_5

    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    const/4 v6, 0x0

    .line 71
    :goto_4
    and-int/lit8 v7, v2, 0x1

    .line 72
    .line 73
    invoke-virtual {v1, v7, v6}, Lpi;->O(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_7

    .line 78
    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    sget-object v3, Lme0;->a:Lme0;

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    move-object v3, v5

    .line 85
    :goto_5
    invoke-static {v4}, Lj50;->q(I)J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    sget-object v6, Lzv;->h:Lzv;

    .line 90
    .line 91
    sget-object v7, Lnf;->a:Lg41;

    .line 92
    .line 93
    invoke-virtual {v1, v7}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Llf;

    .line 98
    .line 99
    iget-wide v7, v7, Llf;->q:J

    .line 100
    .line 101
    and-int/lit8 v9, v2, 0xe

    .line 102
    .line 103
    const v10, 0x186000

    .line 104
    .line 105
    .line 106
    or-int/2addr v9, v10

    .line 107
    and-int/lit8 v2, v2, 0x70

    .line 108
    .line 109
    or-int v19, v9, v2

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    const v21, 0x3ffa8

    .line 114
    .line 115
    .line 116
    move-object/from16 v18, v1

    .line 117
    .line 118
    move-object v1, v3

    .line 119
    move-wide v2, v7

    .line 120
    const/4 v7, 0x0

    .line 121
    const-wide/16 v8, 0x0

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    const-wide/16 v11, 0x0

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    invoke-static/range {v0 .. v21}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 134
    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_7
    move-object/from16 v18, v1

    .line 138
    .line 139
    invoke-virtual/range {v18 .. v18}, Lpi;->R()V

    .line 140
    .line 141
    .line 142
    move-object v1, v5

    .line 143
    :goto_6
    invoke-virtual/range {v18 .. v18}, Lpi;->r()Lht0;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    new-instance v3, Lpc0;

    .line 150
    .line 151
    move/from16 v4, p3

    .line 152
    .line 153
    move/from16 v5, p4

    .line 154
    .line 155
    invoke-direct {v3, v0, v1, v4, v5}, Lpc0;-><init>(Ljava/lang/String;Lpe0;II)V

    .line 156
    .line 157
    .line 158
    iput-object v3, v2, Lht0;->d:Lww;

    .line 159
    .line 160
    :cond_8
    return-void
.end method

.method private static final Q(ILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    invoke-static {p0}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p1, p0}, Lzc0;->O(Lji;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final Q0(Ljava/lang/String;Lpe0;IILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p4, p2, p3}, Lzc0;->P0(Ljava/lang/String;Lpe0;Lji;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final R(ZLji;II)V
    .locals 38

    .line 1
    move-object/from16 v10, p1

    .line 2
    .line 3
    check-cast v10, Lpi;

    .line 4
    .line 5
    const v2, -0x10b85e84

    .line 6
    .line 7
    .line 8
    invoke-virtual {v10, v2}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v2, p3, 0x1

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v4, p2, 0x6

    .line 17
    .line 18
    move v5, v4

    .line 19
    move/from16 v4, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v4, p2, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    move/from16 v4, p0

    .line 27
    .line 28
    invoke-virtual {v10, v4}, Lpi;->g(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v5, v3

    .line 37
    :goto_0
    or-int v5, p2, v5

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move/from16 v4, p0

    .line 41
    .line 42
    move/from16 v5, p2

    .line 43
    .line 44
    :goto_1
    and-int/lit8 v6, v5, 0x3

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x1

    .line 48
    if-eq v6, v3, :cond_3

    .line 49
    .line 50
    move v6, v8

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    move v6, v7

    .line 53
    :goto_2
    and-int/2addr v5, v8

    .line 54
    invoke-virtual {v10, v5, v6}, Lpi;->O(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_20

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move/from16 v24, v7

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move/from16 v24, v4

    .line 66
    .line 67
    :goto_3
    sget-object v2, Lr4;->b:Lg41;

    .line 68
    .line 69
    invoke-virtual {v10, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    sget-object v5, Lii;->a:Lr3;

    .line 80
    .line 81
    if-ne v4, v5, :cond_5

    .line 82
    .line 83
    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v4}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v10, v4}, Lpi;->g0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    check-cast v4, Loh0;

    .line 95
    .line 96
    sget-object v6, Ln2;->q:Lfa;

    .line 97
    .line 98
    invoke-static {v6, v10, v7}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    iget-wide v11, v10, Lpi;->T:J

    .line 103
    .line 104
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    invoke-virtual {v10}, Lpi;->l()Lfq0;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    sget-object v12, Lme0;->a:Lme0;

    .line 113
    .line 114
    invoke-static {v10, v12}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    sget-object v14, Lfi;->b:Lei;

    .line 119
    .line 120
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v14, Lei;->b:Lcj;

    .line 124
    .line 125
    invoke-virtual {v10}, Lpi;->Z()V

    .line 126
    .line 127
    .line 128
    iget-boolean v15, v10, Lpi;->S:Z

    .line 129
    .line 130
    if-eqz v15, :cond_6

    .line 131
    .line 132
    invoke-virtual {v10, v14}, Lpi;->k(Lhw;)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    invoke-virtual {v10}, Lpi;->j0()V

    .line 137
    .line 138
    .line 139
    :goto_4
    sget-object v14, Lei;->e:Lm7;

    .line 140
    .line 141
    invoke-static {v10, v14, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object v6, Lei;->d:Lm7;

    .line 145
    .line 146
    invoke-static {v10, v6, v11}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    sget-object v9, Lei;->f:Lm7;

    .line 154
    .line 155
    invoke-static {v10, v6, v9}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 156
    .line 157
    .line 158
    sget-object v6, Lei;->g:Lp3;

    .line 159
    .line 160
    invoke-static {v10, v6}, Lw60;->G(Lji;Lsw;)V

    .line 161
    .line 162
    .line 163
    sget-object v6, Lei;->c:Lm7;

    .line 164
    .line 165
    invoke-static {v10, v6, v13}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    const/16 v6, 0xd

    .line 169
    .line 170
    invoke-static {v6}, Lj50;->q(I)J

    .line 171
    .line 172
    .line 173
    move-result-wide v13

    .line 174
    sget-object v6, Lnf;->a:Lg41;

    .line 175
    .line 176
    invoke-virtual {v10, v6}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    check-cast v9, Llf;

    .line 181
    .line 182
    move-object/from16 p0, v4

    .line 183
    .line 184
    iget-wide v3, v9, Llf;->s:J

    .line 185
    .line 186
    const/16 v9, 0x14

    .line 187
    .line 188
    invoke-static {v9}, Lj50;->q(I)J

    .line 189
    .line 190
    .line 191
    move-result-wide v15

    .line 192
    const/16 v22, 0x30

    .line 193
    .line 194
    const v23, 0x3f7ea

    .line 195
    .line 196
    .line 197
    move-object v9, v5

    .line 198
    move-wide v4, v3

    .line 199
    const/4 v3, 0x0

    .line 200
    move v11, v8

    .line 201
    const/4 v8, 0x0

    .line 202
    move-object/from16 v17, v9

    .line 203
    .line 204
    const/4 v9, 0x0

    .line 205
    move-object/from16 v20, v10

    .line 206
    .line 207
    move/from16 v18, v11

    .line 208
    .line 209
    const-wide/16 v10, 0x0

    .line 210
    .line 211
    move-object/from16 v19, v12

    .line 212
    .line 213
    const/4 v12, 0x0

    .line 214
    move/from16 v21, v7

    .line 215
    .line 216
    move-wide/from16 v36, v15

    .line 217
    .line 218
    move-object/from16 v16, v6

    .line 219
    .line 220
    move-wide v6, v13

    .line 221
    move-wide/from16 v13, v36

    .line 222
    .line 223
    const/4 v15, 0x0

    .line 224
    move-object/from16 v25, v16

    .line 225
    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    move-object/from16 v26, v17

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    move/from16 v27, v18

    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    move-object/from16 v28, v19

    .line 237
    .line 238
    const/16 v19, 0x0

    .line 239
    .line 240
    move/from16 v29, v21

    .line 241
    .line 242
    const/16 v21, 0x6006

    .line 243
    .line 244
    move-object/from16 v30, v2

    .line 245
    .line 246
    const-string v2, "\u611f\u8c22\u4ee5\u4e0b\u5c0f\u4f19\u4f34\u7684\u81ea\u613f\u6253\u8d4f\u652f\u6301\uff0c\u4f60\u4eec\u7684\u652f\u6301\u662f\u6211\u7ee7\u7eed\u66f4\u65b0\u7684\u52a8\u529b\uff01"

    .line 247
    .line 248
    move-object/from16 v31, p0

    .line 249
    .line 250
    move-object/from16 v0, v25

    .line 251
    .line 252
    move-object/from16 v32, v26

    .line 253
    .line 254
    move-object/from16 v1, v28

    .line 255
    .line 256
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 257
    .line 258
    .line 259
    move-object/from16 v10, v20

    .line 260
    .line 261
    const/high16 v2, 0x40800000    # 4.0f

    .line 262
    .line 263
    invoke-static {v1, v2}, Ls11;->b(Lpe0;F)Lpe0;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {v10, v2}, Lu50;->c(Lji;Lpe0;)V

    .line 268
    .line 269
    .line 270
    const/16 v2, 0xb

    .line 271
    .line 272
    invoke-static {v2}, Lj50;->q(I)J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    invoke-virtual {v10, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    check-cast v2, Llf;

    .line 281
    .line 282
    iget-wide v2, v2, Llf;->s:J

    .line 283
    .line 284
    const v4, 0x3f0ccccd    # 0.55f

    .line 285
    .line 286
    .line 287
    invoke-static {v4, v2, v3}, Lff;->b(FJ)J

    .line 288
    .line 289
    .line 290
    move-result-wide v4

    .line 291
    const/16 v2, 0x10

    .line 292
    .line 293
    invoke-static {v2}, Lj50;->q(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v13

    .line 297
    const/4 v3, 0x0

    .line 298
    const-wide/16 v10, 0x0

    .line 299
    .line 300
    const-string v2, "\uff08\u4e0d\u613f\u610f\u900f\u9732\u59d3\u540d\u7684\u6253\u8d4f\u8005\u4ee5\u300c\u533f\u540d\u5c0f\u4f19\u4f34x\u53f7\u300d\u4ee3\u66ff\uff09"

    .line 301
    .line 302
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v10, v20

    .line 306
    .line 307
    const/high16 v2, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-static {v1, v2}, Ls11;->b(Lpe0;F)Lpe0;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-static {v10, v2}, Lu50;->c(Lji;Lpe0;)V

    .line 314
    .line 315
    .line 316
    const/16 v2, 0xb

    .line 317
    .line 318
    invoke-static {v2}, Lj50;->q(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v6

    .line 322
    invoke-virtual {v10, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Llf;

    .line 327
    .line 328
    iget-wide v2, v0, Llf;->s:J

    .line 329
    .line 330
    const v0, 0x3f0ccccd    # 0.55f

    .line 331
    .line 332
    .line 333
    invoke-static {v0, v2, v3}, Lff;->b(FJ)J

    .line 334
    .line 335
    .line 336
    move-result-wide v4

    .line 337
    const/16 v0, 0x10

    .line 338
    .line 339
    invoke-static {v0}, Lj50;->q(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v13

    .line 343
    const/4 v3, 0x0

    .line 344
    const-wide/16 v10, 0x0

    .line 345
    .line 346
    const-string v2, "\uff08\u6392\u540d\u6309\u6253\u8d4f\u65f6\u95f4\u5148\u540e\u987a\u5e8f\uff0c\u4e0e\u91d1\u989d\u5927\u5c0f\u65e0\u5173\uff09"

    .line 347
    .line 348
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v10, v20

    .line 352
    .line 353
    const/high16 v0, 0x41200000    # 10.0f

    .line 354
    .line 355
    invoke-static {v1, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v10, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 360
    .line 361
    .line 362
    const-string v21, "\u533f\u540d\u5c0f\u4f19\u4f345\u53f7"

    .line 363
    .line 364
    const-string v22, "\u597d**\u6ee1"

    .line 365
    .line 366
    const-string v11, "\u533f\u540d\u5c0f\u4f19\u4f341\u53f7"

    .line 367
    .line 368
    const-string v12, "cuan"

    .line 369
    .line 370
    const-string v13, "*\u590f"

    .line 371
    .line 372
    const-string v14, "\u758f**\u6708"

    .line 373
    .line 374
    const-string v15, "*\u5cf0"

    .line 375
    .line 376
    const-string v16, "\u533f\u540d\u5c0f\u4f19\u4f342\u53f7"

    .line 377
    .line 378
    const-string v17, "\u665a\u5b89\u9152"

    .line 379
    .line 380
    const-string v18, "*\u558b"

    .line 381
    .line 382
    const-string v19, "\u533f\u540d\u5c0f\u4f19\u4f343\u53f7"

    .line 383
    .line 384
    const-string v20, "\u533f\u540d\u5c0f\u4f19\u4f344\u53f7"

    .line 385
    .line 386
    filled-new-array/range {v11 .. v22}, [Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    instance-of v2, v0, Ljava/util/RandomAccess;

    .line 395
    .line 396
    if-eqz v2, :cond_b

    .line 397
    .line 398
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    div-int/lit8 v3, v2, 0x5

    .line 403
    .line 404
    rem-int/lit8 v4, v2, 0x5

    .line 405
    .line 406
    if-nez v4, :cond_7

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    goto :goto_5

    .line 410
    :cond_7
    const/4 v7, 0x1

    .line 411
    :goto_5
    add-int/2addr v3, v7

    .line 412
    new-instance v4, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 415
    .line 416
    .line 417
    const/4 v7, 0x0

    .line 418
    :goto_6
    if-ltz v7, :cond_a

    .line 419
    .line 420
    if-ge v7, v2, :cond_a

    .line 421
    .line 422
    sub-int v3, v2, v7

    .line 423
    .line 424
    const/4 v5, 0x5

    .line 425
    if-le v5, v3, :cond_8

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_8
    move v3, v5

    .line 429
    :goto_7
    new-instance v5, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 432
    .line 433
    .line 434
    const/4 v6, 0x0

    .line 435
    :goto_8
    if-ge v6, v3, :cond_9

    .line 436
    .line 437
    add-int v8, v6, v7

    .line 438
    .line 439
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    add-int/lit8 v6, v6, 0x1

    .line 447
    .line 448
    goto :goto_8

    .line 449
    :cond_9
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    add-int/lit8 v7, v7, 0x5

    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_a
    move-object v0, v4

    .line 456
    goto :goto_a

    .line 457
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    if-nez v2, :cond_c

    .line 474
    .line 475
    sget-object v0, Lgs;->d:Lgs;

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_c
    new-instance v2, Lu11;

    .line 479
    .line 480
    const/4 v3, 0x0

    .line 481
    invoke-direct {v2, v0, v3}, Lu11;-><init>(Ljava/util/Iterator;Lik;)V

    .line 482
    .line 483
    .line 484
    invoke-static {v2}, Lv50;->n(Lww;)Lq01;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-eqz v2, :cond_a

    .line 493
    .line 494
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    check-cast v2, Ljava/util/List;

    .line 499
    .line 500
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    goto :goto_9

    .line 504
    :goto_a
    invoke-static {v10}, Le90;->a(Lji;)Lc90;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    move-object/from16 v12, v32

    .line 513
    .line 514
    if-ne v2, v12, :cond_d

    .line 515
    .line 516
    new-instance v2, Ldp0;

    .line 517
    .line 518
    const/4 v4, 0x0

    .line 519
    invoke-direct {v2, v4}, Ldp0;-><init>(I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v10, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    :cond_d
    move-object v13, v2

    .line 526
    check-cast v13, Lwg0;

    .line 527
    .line 528
    iget-object v2, v3, Lc90;->e:Lfe;

    .line 529
    .line 530
    iget-object v2, v2, Lfe;->b:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v2, Ldp0;

    .line 533
    .line 534
    invoke-virtual {v2}, Ldp0;->g()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    invoke-virtual {v10, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    if-nez v4, :cond_e

    .line 551
    .line 552
    if-ne v5, v12, :cond_f

    .line 553
    .line 554
    :cond_e
    new-instance v5, Lzc0$a;

    .line 555
    .line 556
    const/4 v4, 0x0

    .line 557
    invoke-direct {v5, v3, v13, v4}, Lzc0$a;-><init>(Lc90;Lwg0;Lik;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v10, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :cond_f
    check-cast v5, Lww;

    .line 564
    .line 565
    invoke-static {v10, v5, v2}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    sget-object v2, Ls11;->a:Lrt;

    .line 569
    .line 570
    invoke-static {v3, v10}, Lu50;->w(Lc90;Lpi;)Lf21;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    invoke-virtual {v10, v0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    if-nez v4, :cond_10

    .line 583
    .line 584
    if-ne v5, v12, :cond_11

    .line 585
    .line 586
    :cond_10
    new-instance v5, Lyc0;

    .line 587
    .line 588
    const/4 v4, 0x0

    .line 589
    invoke-direct {v5, v4, v0}, Lyc0;-><init>(ILjava/util/ArrayList;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v10, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    :cond_11
    move-object v9, v5

    .line 596
    check-cast v9, Lsw;

    .line 597
    .line 598
    const v11, 0xc00006

    .line 599
    .line 600
    .line 601
    const/4 v4, 0x0

    .line 602
    const/4 v5, 0x0

    .line 603
    const/4 v6, 0x0

    .line 604
    const/4 v8, 0x0

    .line 605
    invoke-static/range {v2 .. v11}, Lw60;->a(Lpe0;Lc90;Ljn0;Lu8;Lga;Lyt;Lj5;Lsw;Lji;I)V

    .line 606
    .line 607
    .line 608
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    const/high16 v4, 0x41000000    # 8.0f

    .line 613
    .line 614
    const/4 v5, 0x3

    .line 615
    const/4 v6, 0x6

    .line 616
    const/4 v7, 0x1

    .line 617
    if-le v3, v7, :cond_16

    .line 618
    .line 619
    const v3, -0x490264e4

    .line 620
    .line 621
    .line 622
    invoke-virtual {v10, v3}, Lpi;->W(I)V

    .line 623
    .line 624
    .line 625
    invoke-static {v2, v4}, Lrd0;->G(Lpe0;F)Lpe0;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    sget-object v3, Lrd0;->c:Lr3;

    .line 630
    .line 631
    sget-object v8, Ln2;->n:Lga;

    .line 632
    .line 633
    invoke-static {v3, v8, v10, v6}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    iget-wide v8, v10, Lpi;->T:J

    .line 638
    .line 639
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 640
    .line 641
    .line 642
    move-result v8

    .line 643
    invoke-virtual {v10}, Lpi;->l()Lfq0;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    invoke-static {v10, v2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    sget-object v11, Lfi;->b:Lei;

    .line 652
    .line 653
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    sget-object v11, Lei;->b:Lcj;

    .line 657
    .line 658
    invoke-virtual {v10}, Lpi;->Z()V

    .line 659
    .line 660
    .line 661
    iget-boolean v14, v10, Lpi;->S:Z

    .line 662
    .line 663
    if-eqz v14, :cond_12

    .line 664
    .line 665
    invoke-virtual {v10, v11}, Lpi;->k(Lhw;)V

    .line 666
    .line 667
    .line 668
    goto :goto_b

    .line 669
    :cond_12
    invoke-virtual {v10}, Lpi;->j0()V

    .line 670
    .line 671
    .line 672
    :goto_b
    sget-object v11, Lei;->e:Lm7;

    .line 673
    .line 674
    invoke-static {v10, v11, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    sget-object v3, Lei;->d:Lm7;

    .line 678
    .line 679
    invoke-static {v10, v3, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    sget-object v8, Lei;->f:Lm7;

    .line 687
    .line 688
    invoke-static {v10, v3, v8}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 689
    .line 690
    .line 691
    sget-object v3, Lei;->g:Lp3;

    .line 692
    .line 693
    invoke-static {v10, v3}, Lw60;->G(Lji;Lsw;)V

    .line 694
    .line 695
    .line 696
    sget-object v3, Lei;->c:Lm7;

    .line 697
    .line 698
    invoke-static {v10, v3, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    const v2, 0x6beabed0

    .line 702
    .line 703
    .line 704
    invoke-virtual {v10, v2}, Lpi;->W(I)V

    .line 705
    .line 706
    .line 707
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    const/4 v2, 0x0

    .line 712
    :goto_c
    if-ge v2, v0, :cond_15

    .line 713
    .line 714
    const/high16 v3, 0x40400000    # 3.0f

    .line 715
    .line 716
    const/4 v8, 0x0

    .line 717
    const/4 v9, 0x2

    .line 718
    invoke-static {v1, v3, v8, v9}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    invoke-static {v13}, Lzc0;->b0(Lwg0;)I

    .line 723
    .line 724
    .line 725
    move-result v8

    .line 726
    if-ne v2, v8, :cond_13

    .line 727
    .line 728
    move v8, v4

    .line 729
    goto :goto_d

    .line 730
    :cond_13
    const/high16 v8, 0x40c00000    # 6.0f

    .line 731
    .line 732
    :goto_d
    invoke-static {v3, v8}, Ls11;->c(Lpe0;F)Lpe0;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    sget-object v8, Lew0;->a:Ldw0;

    .line 737
    .line 738
    const v11, 0x7e7ff

    .line 739
    .line 740
    .line 741
    invoke-static {v3, v8, v11}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    invoke-static {v13}, Lzc0;->b0(Lwg0;)I

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    invoke-static {}, Lhf;->d()J

    .line 750
    .line 751
    .line 752
    move-result-wide v14

    .line 753
    if-ne v2, v8, :cond_14

    .line 754
    .line 755
    goto :goto_e

    .line 756
    :cond_14
    const/high16 v8, 0x3e800000    # 0.25f

    .line 757
    .line 758
    invoke-static {v8, v14, v15}, Lff;->b(FJ)J

    .line 759
    .line 760
    .line 761
    move-result-wide v14

    .line 762
    :goto_e
    sget-object v8, Lpf1;->i:Lfz;

    .line 763
    .line 764
    invoke-static {v3, v14, v15, v8}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    const/4 v8, 0x0

    .line 769
    invoke-static {v3, v10, v8}, Lza;->a(Lpe0;Lji;I)V

    .line 770
    .line 771
    .line 772
    add-int/lit8 v2, v2, 0x1

    .line 773
    .line 774
    goto :goto_c

    .line 775
    :cond_15
    const/4 v8, 0x0

    .line 776
    const/4 v9, 0x2

    .line 777
    invoke-virtual {v10, v8}, Lpi;->p(Z)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v10, v7}, Lpi;->p(Z)V

    .line 781
    .line 782
    .line 783
    const/high16 v0, 0x40800000    # 4.0f

    .line 784
    .line 785
    invoke-static {v1, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-static {v10, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 790
    .line 791
    .line 792
    const/16 v0, 0xb

    .line 793
    .line 794
    invoke-static {v0}, Lj50;->q(I)J

    .line 795
    .line 796
    .line 797
    move-result-wide v2

    .line 798
    sget-object v0, Lnf;->a:Lg41;

    .line 799
    .line 800
    invoke-virtual {v10, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    check-cast v0, Llf;

    .line 805
    .line 806
    iget-wide v13, v0, Llf;->s:J

    .line 807
    .line 808
    const/high16 v0, 0x3f000000    # 0.5f

    .line 809
    .line 810
    invoke-static {v0, v13, v14}, Lff;->b(FJ)J

    .line 811
    .line 812
    .line 813
    move-result-wide v13

    .line 814
    move v0, v6

    .line 815
    move/from16 v18, v7

    .line 816
    .line 817
    move-wide v6, v2

    .line 818
    sget-object v3, Ls11;->a:Lrt;

    .line 819
    .line 820
    move-object/from16 v32, v12

    .line 821
    .line 822
    new-instance v12, Lr61;

    .line 823
    .line 824
    invoke-direct {v12, v5}, Lr61;-><init>(I)V

    .line 825
    .line 826
    .line 827
    const/16 v22, 0x0

    .line 828
    .line 829
    const v23, 0x3fbe8

    .line 830
    .line 831
    .line 832
    const-string v2, "\u2190 \u5de6\u53f3\u6ed1\u52a8\u67e5\u770b\u66f4\u591a \u2192"

    .line 833
    .line 834
    const/4 v8, 0x0

    .line 835
    move/from16 v33, v9

    .line 836
    .line 837
    const/4 v9, 0x0

    .line 838
    move-object/from16 v20, v10

    .line 839
    .line 840
    const-wide/16 v10, 0x0

    .line 841
    .line 842
    move v15, v4

    .line 843
    move/from16 v16, v5

    .line 844
    .line 845
    move-wide v4, v13

    .line 846
    const-wide/16 v13, 0x0

    .line 847
    .line 848
    move/from16 v17, v15

    .line 849
    .line 850
    const/4 v15, 0x0

    .line 851
    move/from16 v19, v16

    .line 852
    .line 853
    const/16 v16, 0x0

    .line 854
    .line 855
    move/from16 v21, v17

    .line 856
    .line 857
    const/16 v17, 0x0

    .line 858
    .line 859
    move/from16 v34, v18

    .line 860
    .line 861
    const/16 v18, 0x0

    .line 862
    .line 863
    move/from16 v25, v19

    .line 864
    .line 865
    const/16 v19, 0x0

    .line 866
    .line 867
    move/from16 v26, v21

    .line 868
    .line 869
    const/16 v21, 0x6036

    .line 870
    .line 871
    move/from16 v0, v26

    .line 872
    .line 873
    move-object/from16 v35, v32

    .line 874
    .line 875
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 876
    .line 877
    .line 878
    move-object/from16 v10, v20

    .line 879
    .line 880
    const/4 v4, 0x0

    .line 881
    :goto_f
    invoke-virtual {v10, v4}, Lpi;->p(Z)V

    .line 882
    .line 883
    .line 884
    goto :goto_10

    .line 885
    :cond_16
    move v0, v4

    .line 886
    move-object/from16 v35, v12

    .line 887
    .line 888
    const/4 v4, 0x0

    .line 889
    const v2, -0x4b4508f0

    .line 890
    .line 891
    .line 892
    invoke-virtual {v10, v2}, Lpi;->W(I)V

    .line 893
    .line 894
    .line 895
    goto :goto_f

    .line 896
    :goto_10
    invoke-static {v1, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    invoke-static {v10, v2}, Lu50;->c(Lji;Lpe0;)V

    .line 901
    .line 902
    .line 903
    sget-object v9, Lnf;->a:Lg41;

    .line 904
    .line 905
    invoke-virtual {v10, v9}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    check-cast v2, Llf;

    .line 910
    .line 911
    iget-wide v4, v2, Llf;->r:J

    .line 912
    .line 913
    const/16 v7, 0x30

    .line 914
    .line 915
    const/4 v8, 0x1

    .line 916
    const/4 v2, 0x0

    .line 917
    const/high16 v3, 0x3f000000    # 0.5f

    .line 918
    .line 919
    move-object v6, v10

    .line 920
    invoke-static/range {v2 .. v8}, Lkl;->c(Lpe0;FJLji;II)V

    .line 921
    .line 922
    .line 923
    invoke-static {v1, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-static {v10, v2}, Lu50;->c(Lji;Lpe0;)V

    .line 928
    .line 929
    .line 930
    const/16 v2, 0xc

    .line 931
    .line 932
    invoke-static {v2}, Lj50;->q(I)J

    .line 933
    .line 934
    .line 935
    move-result-wide v6

    .line 936
    invoke-virtual {v10, v9}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    check-cast v2, Llf;

    .line 941
    .line 942
    iget-wide v4, v2, Llf;->s:J

    .line 943
    .line 944
    const/16 v2, 0x12

    .line 945
    .line 946
    invoke-static {v2}, Lj50;->q(I)J

    .line 947
    .line 948
    .line 949
    move-result-wide v13

    .line 950
    const/16 v22, 0x30

    .line 951
    .line 952
    const v23, 0x3f7ea

    .line 953
    .line 954
    .line 955
    const-string v2, "\u5982\u679c\u4f60\u89c9\u5f97\u672c\u6a21\u5757\u5bf9\u4f60\u6709\u5e2e\u52a9\uff0c\u6b22\u8fce\u81ea\u613f\u6253\u8d4f\u652f\u6301~"

    .line 956
    .line 957
    const/4 v3, 0x0

    .line 958
    const/4 v8, 0x0

    .line 959
    move-object v11, v9

    .line 960
    const/4 v9, 0x0

    .line 961
    move-object/from16 v20, v10

    .line 962
    .line 963
    move-object v12, v11

    .line 964
    const-wide/16 v10, 0x0

    .line 965
    .line 966
    move-object v15, v12

    .line 967
    const/4 v12, 0x0

    .line 968
    move-object/from16 v16, v15

    .line 969
    .line 970
    const/4 v15, 0x0

    .line 971
    move-object/from16 v17, v16

    .line 972
    .line 973
    const/16 v16, 0x0

    .line 974
    .line 975
    move-object/from16 v18, v17

    .line 976
    .line 977
    const/16 v17, 0x0

    .line 978
    .line 979
    move-object/from16 v19, v18

    .line 980
    .line 981
    const/16 v18, 0x0

    .line 982
    .line 983
    move-object/from16 v21, v19

    .line 984
    .line 985
    const/16 v19, 0x0

    .line 986
    .line 987
    move-object/from16 v25, v21

    .line 988
    .line 989
    const/16 v21, 0x6006

    .line 990
    .line 991
    move/from16 v26, v0

    .line 992
    .line 993
    move-object/from16 v0, v25

    .line 994
    .line 995
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 996
    .line 997
    .line 998
    move-object/from16 v10, v20

    .line 999
    .line 1000
    const/high16 v2, 0x41200000    # 10.0f

    .line 1001
    .line 1002
    invoke-static {v1, v2}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    invoke-static {v10, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 1007
    .line 1008
    .line 1009
    sget-object v1, Ldc;->a:Lln0;

    .line 1010
    .line 1011
    invoke-static {}, Lhf;->d()J

    .line 1012
    .line 1013
    .line 1014
    move-result-wide v1

    .line 1015
    sget-wide v3, Lff;->g:J

    .line 1016
    .line 1017
    invoke-virtual {v10, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    check-cast v0, Llf;

    .line 1022
    .line 1023
    iget-object v5, v0, Llf;->W:Lcc;

    .line 1024
    .line 1025
    if-nez v5, :cond_17

    .line 1026
    .line 1027
    new-instance v11, Lcc;

    .line 1028
    .line 1029
    sget-object v5, Lkl;->k:Lmf;

    .line 1030
    .line 1031
    invoke-static {v0, v5}, Lnf;->c(Llf;Lmf;)J

    .line 1032
    .line 1033
    .line 1034
    move-result-wide v12

    .line 1035
    sget-object v5, Lkl;->q:Lmf;

    .line 1036
    .line 1037
    invoke-static {v0, v5}, Lnf;->c(Llf;Lmf;)J

    .line 1038
    .line 1039
    .line 1040
    move-result-wide v14

    .line 1041
    sget-object v5, Lkl;->l:Lmf;

    .line 1042
    .line 1043
    invoke-static {v0, v5}, Lnf;->c(Llf;Lmf;)J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v5

    .line 1047
    sget v7, Lkl;->m:F

    .line 1048
    .line 1049
    invoke-static {v7, v5, v6}, Lff;->b(FJ)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v16

    .line 1053
    sget-object v5, Lkl;->n:Lmf;

    .line 1054
    .line 1055
    invoke-static {v0, v5}, Lnf;->c(Llf;Lmf;)J

    .line 1056
    .line 1057
    .line 1058
    move-result-wide v5

    .line 1059
    sget v7, Lkl;->o:F

    .line 1060
    .line 1061
    invoke-static {v7, v5, v6}, Lff;->b(FJ)J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v18

    .line 1065
    invoke-direct/range {v11 .. v19}, Lcc;-><init>(JJJJ)V

    .line 1066
    .line 1067
    .line 1068
    iput-object v11, v0, Llf;->W:Lcc;

    .line 1069
    .line 1070
    move-object v5, v11

    .line 1071
    :cond_17
    const-wide/16 v6, 0x10

    .line 1072
    .line 1073
    cmp-long v0, v1, v6

    .line 1074
    .line 1075
    if-eqz v0, :cond_18

    .line 1076
    .line 1077
    :goto_11
    move-wide v12, v1

    .line 1078
    goto :goto_12

    .line 1079
    :cond_18
    iget-wide v1, v5, Lcc;->a:J

    .line 1080
    .line 1081
    goto :goto_11

    .line 1082
    :goto_12
    cmp-long v0, v3, v6

    .line 1083
    .line 1084
    if-eqz v0, :cond_19

    .line 1085
    .line 1086
    move-wide v14, v3

    .line 1087
    goto :goto_13

    .line 1088
    :cond_19
    iget-wide v1, v5, Lcc;->b:J

    .line 1089
    .line 1090
    move-wide v14, v1

    .line 1091
    :goto_13
    if-eqz v0, :cond_1a

    .line 1092
    .line 1093
    move-wide/from16 v16, v3

    .line 1094
    .line 1095
    goto :goto_14

    .line 1096
    :cond_1a
    iget-wide v1, v5, Lcc;->c:J

    .line 1097
    .line 1098
    move-wide/from16 v16, v1

    .line 1099
    .line 1100
    :goto_14
    if-eqz v0, :cond_1b

    .line 1101
    .line 1102
    :goto_15
    move-wide/from16 v18, v3

    .line 1103
    .line 1104
    goto :goto_16

    .line 1105
    :cond_1b
    iget-wide v3, v5, Lcc;->d:J

    .line 1106
    .line 1107
    goto :goto_15

    .line 1108
    :goto_16
    new-instance v6, Lcc;

    .line 1109
    .line 1110
    move-object v11, v6

    .line 1111
    invoke-direct/range {v11 .. v19}, Lcc;-><init>(JJJJ)V

    .line 1112
    .line 1113
    .line 1114
    invoke-static/range {v26 .. v26}, Lew0;->a(F)Ldw0;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v5

    .line 1118
    sget-object v3, Ls11;->a:Lrt;

    .line 1119
    .line 1120
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    move-object/from16 v1, v35

    .line 1125
    .line 1126
    if-ne v0, v1, :cond_1c

    .line 1127
    .line 1128
    new-instance v0, Lq70;

    .line 1129
    .line 1130
    move-object/from16 v13, v31

    .line 1131
    .line 1132
    const/4 v2, 0x6

    .line 1133
    invoke-direct {v0, v13, v2}, Lq70;-><init>(Loh0;I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v10, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_17

    .line 1140
    :cond_1c
    move-object/from16 v13, v31

    .line 1141
    .line 1142
    :goto_17
    move-object v2, v0

    .line 1143
    check-cast v2, Lhw;

    .line 1144
    .line 1145
    sget-object v0, Loh;->a:Loh;

    .line 1146
    .line 1147
    invoke-virtual {v0}, Loh;->s()Lxw;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v9

    .line 1151
    const v11, 0x30000036

    .line 1152
    .line 1153
    .line 1154
    const/16 v12, 0x1e4

    .line 1155
    .line 1156
    const/4 v4, 0x0

    .line 1157
    const/4 v7, 0x0

    .line 1158
    const/4 v8, 0x0

    .line 1159
    invoke-static/range {v2 .. v12}, Lo30;->d(Lhw;Lpe0;ZLx01;Lcc;Lgc;Ljn0;Lxw;Lji;II)V

    .line 1160
    .line 1161
    .line 1162
    const/4 v7, 0x1

    .line 1163
    invoke-virtual {v10, v7}, Lpi;->p(Z)V

    .line 1164
    .line 1165
    .line 1166
    invoke-static {v13}, Lzc0;->Z(Loh0;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v2

    .line 1170
    if-eqz v2, :cond_1f

    .line 1171
    .line 1172
    const v2, 0x4114d90a

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v10, v2}, Lpi;->W(I)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    if-ne v2, v1, :cond_1d

    .line 1183
    .line 1184
    invoke-virtual/range {v30 .. v30}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    sget v3, Ldt0$c;->a:I

    .line 1189
    .line 1190
    invoke-static {v2, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v2

    .line 1194
    invoke-virtual {v10, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    :cond_1d
    check-cast v2, Landroid/graphics/Bitmap;

    .line 1198
    .line 1199
    invoke-virtual {v10}, Lpi;->L()Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v3

    .line 1203
    if-ne v3, v1, :cond_1e

    .line 1204
    .line 1205
    new-instance v3, Lq70;

    .line 1206
    .line 1207
    const/4 v9, 0x2

    .line 1208
    invoke-direct {v3, v13, v9}, Lq70;-><init>(Loh0;I)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v10, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1212
    .line 1213
    .line 1214
    :cond_1e
    check-cast v3, Lhw;

    .line 1215
    .line 1216
    new-instance v1, Led;

    .line 1217
    .line 1218
    const/16 v4, 0x9

    .line 1219
    .line 1220
    move-object/from16 v5, v30

    .line 1221
    .line 1222
    invoke-direct {v1, v4, v5, v2}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1223
    .line 1224
    .line 1225
    const v4, -0x10244471

    .line 1226
    .line 1227
    .line 1228
    invoke-static {v4, v1, v10}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    new-instance v4, Lgc0;

    .line 1233
    .line 1234
    const/4 v8, 0x0

    .line 1235
    invoke-direct {v4, v13, v8}, Lgc0;-><init>(Loh0;I)V

    .line 1236
    .line 1237
    .line 1238
    const v5, -0x354aca33    # -5937894.5f

    .line 1239
    .line 1240
    .line 1241
    invoke-static {v5, v4, v10}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v5

    .line 1245
    invoke-virtual {v0}, Loh;->p()Lww;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v6

    .line 1249
    new-instance v0, Lya;

    .line 1250
    .line 1251
    const/4 v4, 0x3

    .line 1252
    invoke-direct {v0, v4, v2}, Lya;-><init>(ILjava/lang/Object;)V

    .line 1253
    .line 1254
    .line 1255
    const v2, 0x12fb6d2a

    .line 1256
    .line 1257
    .line 1258
    invoke-static {v2, v0, v10}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v7

    .line 1262
    const/16 v17, 0x0

    .line 1263
    .line 1264
    const v19, 0x1b0c36

    .line 1265
    .line 1266
    .line 1267
    const/4 v4, 0x0

    .line 1268
    const/4 v8, 0x0

    .line 1269
    move-object/from16 v20, v10

    .line 1270
    .line 1271
    const-wide/16 v9, 0x0

    .line 1272
    .line 1273
    const-wide/16 v11, 0x0

    .line 1274
    .line 1275
    const-wide/16 v13, 0x0

    .line 1276
    .line 1277
    const-wide/16 v15, 0x0

    .line 1278
    .line 1279
    move-object v2, v3

    .line 1280
    move-object/from16 v18, v20

    .line 1281
    .line 1282
    move-object v3, v1

    .line 1283
    invoke-static/range {v2 .. v19}, Lkl;->a(Lhw;Lmh;Lpe0;Lww;Lww;Lww;Lx01;JJJJLxn;Lji;I)V

    .line 1284
    .line 1285
    .line 1286
    move-object/from16 v10, v18

    .line 1287
    .line 1288
    const/4 v4, 0x0

    .line 1289
    :goto_18
    invoke-virtual {v10, v4}, Lpi;->p(Z)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_19

    .line 1293
    :cond_1f
    const/4 v4, 0x0

    .line 1294
    const v0, 0x3eb3f9a6

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v10, v0}, Lpi;->W(I)V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_18

    .line 1301
    :goto_19
    move/from16 v4, v24

    .line 1302
    .line 1303
    goto :goto_1a

    .line 1304
    :cond_20
    invoke-virtual {v10}, Lpi;->R()V

    .line 1305
    .line 1306
    .line 1307
    :goto_1a
    invoke-virtual {v10}, Lpi;->r()Lht0;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    if-eqz v0, :cond_21

    .line 1312
    .line 1313
    new-instance v1, Lhc0;

    .line 1314
    .line 1315
    move/from16 v2, p2

    .line 1316
    .line 1317
    move/from16 v3, p3

    .line 1318
    .line 1319
    invoke-direct {v1, v2, v3, v4}, Lhc0;-><init>(IIZ)V

    .line 1320
    .line 1321
    .line 1322
    iput-object v1, v0, Lht0;->d:Lww;

    .line 1323
    .line 1324
    :cond_21
    return-void
.end method

.method public static final R0(Lji;I)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    check-cast v1, Lpi;

    .line 4
    .line 5
    const v2, 0x200a5af1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move v4, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    :goto_0
    and-int/lit8 v5, p1, 0x1

    .line 19
    .line 20
    invoke-virtual {v1, v5, v4}, Lpi;->O(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_5

    .line 25
    .line 26
    sget-object v4, Ln2;->q:Lfa;

    .line 27
    .line 28
    invoke-static {v4, v1, v3}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-wide v5, v1, Lpi;->T:J

    .line 33
    .line 34
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {v1}, Lpi;->l()Lfq0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v7, Lme0;->a:Lme0;

    .line 43
    .line 44
    invoke-static {v1, v7}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    sget-object v9, Lfi;->b:Lei;

    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget-object v9, Lei;->b:Lcj;

    .line 54
    .line 55
    invoke-virtual {v1}, Lpi;->Z()V

    .line 56
    .line 57
    .line 58
    iget-boolean v10, v1, Lpi;->S:Z

    .line 59
    .line 60
    if-eqz v10, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1, v9}, Lpi;->k(Lhw;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v1}, Lpi;->j0()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object v9, Lei;->e:Lm7;

    .line 70
    .line 71
    invoke-static {v1, v9, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v4, Lei;->d:Lm7;

    .line 75
    .line 76
    invoke-static {v1, v4, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    sget-object v5, Lei;->f:Lm7;

    .line 84
    .line 85
    invoke-static {v1, v4, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 86
    .line 87
    .line 88
    sget-object v4, Lei;->g:Lp3;

    .line 89
    .line 90
    invoke-static {v1, v4}, Lw60;->G(Lji;Lsw;)V

    .line 91
    .line 92
    .line 93
    sget-object v4, Lei;->c:Lm7;

    .line 94
    .line 95
    invoke-static {v1, v4, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const/16 v23, 0xd

    .line 99
    .line 100
    invoke-static/range {v23 .. v23}, Lj50;->q(I)J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    sget-object v4, Lnf;->a:Lg41;

    .line 105
    .line 106
    invoke-virtual {v1, v4}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Llf;

    .line 111
    .line 112
    iget-wide v8, v4, Llf;->s:J

    .line 113
    .line 114
    const/16 v4, 0x14

    .line 115
    .line 116
    invoke-static {v4}, Lj50;->q(I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v12

    .line 120
    const/16 v21, 0x30

    .line 121
    .line 122
    const v22, 0x3f7ea

    .line 123
    .line 124
    .line 125
    move-object/from16 v19, v1

    .line 126
    .line 127
    const-string v1, "\u611f\u8c22\u4ee5\u4e0b\u670b\u53cb\u5728\u5f00\u53d1\u8fc7\u7a0b\u4e2d\u63d0\u4f9b\u7684\u5e2e\u52a9\u4e0e\u652f\u6301\uff01"

    .line 128
    .line 129
    move v4, v2

    .line 130
    const/4 v2, 0x0

    .line 131
    move-object v10, v7

    .line 132
    const/4 v7, 0x0

    .line 133
    move v11, v3

    .line 134
    move-wide/from16 v27, v8

    .line 135
    .line 136
    move v9, v4

    .line 137
    move-wide/from16 v3, v27

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    move v14, v9

    .line 141
    move-object v15, v10

    .line 142
    const-wide/16 v9, 0x0

    .line 143
    .line 144
    move/from16 v16, v11

    .line 145
    .line 146
    const/4 v11, 0x0

    .line 147
    move/from16 v17, v14

    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    move-object/from16 v18, v15

    .line 151
    .line 152
    const/4 v15, 0x0

    .line 153
    move/from16 v20, v16

    .line 154
    .line 155
    const/16 v16, 0x0

    .line 156
    .line 157
    move/from16 v24, v17

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    move-object/from16 v25, v18

    .line 162
    .line 163
    const/16 v18, 0x0

    .line 164
    .line 165
    move/from16 v26, v20

    .line 166
    .line 167
    const/16 v20, 0x6006

    .line 168
    .line 169
    move-object/from16 v0, v25

    .line 170
    .line 171
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v1, v19

    .line 175
    .line 176
    const/high16 v2, 0x41400000    # 12.0f

    .line 177
    .line 178
    invoke-static {v0, v2}, Ls11;->b(Lpe0;F)Lpe0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v1, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 183
    .line 184
    .line 185
    const-string v0, "\u5c0f\u516b"

    .line 186
    .line 187
    const-string v2, "\u5341\u4ee3\u6d9b\u7687"

    .line 188
    .line 189
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const v2, 0x3a5c5e3

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v2}, Lpi;->W(I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_4

    .line 212
    .line 213
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Ljava/lang/String;

    .line 218
    .line 219
    sget-object v3, Ls11;->a:Lrt;

    .line 220
    .line 221
    const/high16 v4, 0x40400000    # 3.0f

    .line 222
    .line 223
    const/4 v5, 0x0

    .line 224
    const/4 v14, 0x1

    .line 225
    invoke-static {v3, v5, v4, v14}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    sget-object v4, Lrd0;->a:Lt8;

    .line 230
    .line 231
    sget-object v5, Ln2;->n:Lga;

    .line 232
    .line 233
    const/4 v6, 0x0

    .line 234
    invoke-static {v4, v5, v1, v6}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    iget-wide v7, v1, Lpi;->T:J

    .line 239
    .line 240
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    invoke-virtual {v1}, Lpi;->l()Lfq0;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-static {v1, v3}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    sget-object v8, Lfi;->b:Lei;

    .line 253
    .line 254
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    sget-object v8, Lei;->b:Lcj;

    .line 258
    .line 259
    invoke-virtual {v1}, Lpi;->Z()V

    .line 260
    .line 261
    .line 262
    iget-boolean v9, v1, Lpi;->S:Z

    .line 263
    .line 264
    if-eqz v9, :cond_2

    .line 265
    .line 266
    invoke-virtual {v1, v8}, Lpi;->k(Lhw;)V

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_2
    invoke-virtual {v1}, Lpi;->j0()V

    .line 271
    .line 272
    .line 273
    :goto_3
    sget-object v8, Lei;->e:Lm7;

    .line 274
    .line 275
    invoke-static {v1, v8, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    sget-object v4, Lei;->d:Lm7;

    .line 279
    .line 280
    invoke-static {v1, v4, v7}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    sget-object v5, Lei;->f:Lm7;

    .line 288
    .line 289
    invoke-static {v1, v4, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 290
    .line 291
    .line 292
    sget-object v4, Lei;->g:Lp3;

    .line 293
    .line 294
    invoke-static {v1, v4}, Lw60;->G(Lji;Lsw;)V

    .line 295
    .line 296
    .line 297
    sget-object v4, Lei;->c:Lm7;

    .line 298
    .line 299
    invoke-static {v1, v4, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    const/16 v3, 0xe

    .line 303
    .line 304
    invoke-static {v3}, Lj50;->q(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v3

    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const v22, 0x3ffee

    .line 311
    .line 312
    .line 313
    move-object/from16 v19, v1

    .line 314
    .line 315
    const-string v1, "\u2b50"

    .line 316
    .line 317
    move-object v5, v2

    .line 318
    const/4 v2, 0x0

    .line 319
    move-object v7, v5

    .line 320
    move/from16 v16, v6

    .line 321
    .line 322
    move-wide v5, v3

    .line 323
    const-wide/16 v3, 0x0

    .line 324
    .line 325
    move-object v8, v7

    .line 326
    const/4 v7, 0x0

    .line 327
    move-object v9, v8

    .line 328
    const/4 v8, 0x0

    .line 329
    move-object v11, v9

    .line 330
    const-wide/16 v9, 0x0

    .line 331
    .line 332
    move-object v12, v11

    .line 333
    const/4 v11, 0x0

    .line 334
    move-object v14, v12

    .line 335
    const-wide/16 v12, 0x0

    .line 336
    .line 337
    move-object v15, v14

    .line 338
    const/4 v14, 0x0

    .line 339
    move-object/from16 v17, v15

    .line 340
    .line 341
    const/4 v15, 0x0

    .line 342
    move/from16 v20, v16

    .line 343
    .line 344
    const/16 v16, 0x0

    .line 345
    .line 346
    move-object/from16 v18, v17

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    move-object/from16 v25, v18

    .line 351
    .line 352
    const/16 v18, 0x0

    .line 353
    .line 354
    move/from16 v26, v20

    .line 355
    .line 356
    const/16 v20, 0x6006

    .line 357
    .line 358
    move-object/from16 p0, v0

    .line 359
    .line 360
    move-object/from16 v0, v25

    .line 361
    .line 362
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 363
    .line 364
    .line 365
    move-object/from16 v1, v19

    .line 366
    .line 367
    const/high16 v2, 0x41000000    # 8.0f

    .line 368
    .line 369
    invoke-static {v2}, Ls11;->e(F)Lpe0;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-static {v1, v2}, Lu50;->c(Lji;Lpe0;)V

    .line 374
    .line 375
    .line 376
    invoke-static/range {v23 .. v23}, Lj50;->q(I)J

    .line 377
    .line 378
    .line 379
    move-result-wide v5

    .line 380
    const-string v2, "\u6682\u65e0"

    .line 381
    .line 382
    const/4 v3, 0x0

    .line 383
    invoke-static {v0, v2, v3}, Lr41;->S(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_3

    .line 388
    .line 389
    const v2, -0x239522de

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v2}, Lpi;->W(I)V

    .line 393
    .line 394
    .line 395
    sget-object v2, Lnf;->a:Lg41;

    .line 396
    .line 397
    invoke-virtual {v1, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    check-cast v2, Llf;

    .line 402
    .line 403
    iget-wide v7, v2, Llf;->s:J

    .line 404
    .line 405
    const v2, 0x3f19999a    # 0.6f

    .line 406
    .line 407
    .line 408
    invoke-static {v2, v7, v8}, Lff;->b(FJ)J

    .line 409
    .line 410
    .line 411
    move-result-wide v7

    .line 412
    invoke-virtual {v1, v3}, Lpi;->p(Z)V

    .line 413
    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_3
    const v2, -0x23936864

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v2}, Lpi;->W(I)V

    .line 420
    .line 421
    .line 422
    sget-object v2, Lnf;->a:Lg41;

    .line 423
    .line 424
    invoke-virtual {v1, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    check-cast v2, Llf;

    .line 429
    .line 430
    iget-wide v7, v2, Llf;->q:J

    .line 431
    .line 432
    invoke-virtual {v1, v3}, Lpi;->p(Z)V

    .line 433
    .line 434
    .line 435
    :goto_4
    const/16 v21, 0x0

    .line 436
    .line 437
    const v22, 0x3ffea

    .line 438
    .line 439
    .line 440
    const/4 v2, 0x0

    .line 441
    move/from16 v16, v3

    .line 442
    .line 443
    move-wide v3, v7

    .line 444
    const/4 v7, 0x0

    .line 445
    const/4 v8, 0x0

    .line 446
    const-wide/16 v9, 0x0

    .line 447
    .line 448
    const/4 v11, 0x0

    .line 449
    const-wide/16 v12, 0x0

    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    move/from16 v20, v16

    .line 454
    .line 455
    const/16 v16, 0x0

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/16 v18, 0x0

    .line 460
    .line 461
    move/from16 v26, v20

    .line 462
    .line 463
    const/16 v20, 0x6000

    .line 464
    .line 465
    move-object/from16 v19, v1

    .line 466
    .line 467
    move-object v1, v0

    .line 468
    move/from16 v0, v26

    .line 469
    .line 470
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 471
    .line 472
    .line 473
    move-object/from16 v1, v19

    .line 474
    .line 475
    const/4 v14, 0x1

    .line 476
    invoke-virtual {v1, v14}, Lpi;->p(Z)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v0, p0

    .line 480
    .line 481
    goto/16 :goto_2

    .line 482
    .line 483
    :cond_4
    const/4 v0, 0x0

    .line 484
    const/4 v14, 0x1

    .line 485
    invoke-virtual {v1, v0}, Lpi;->p(Z)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v14}, Lpi;->p(Z)V

    .line 489
    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_5
    invoke-virtual {v1}, Lpi;->R()V

    .line 493
    .line 494
    .line 495
    :goto_5
    invoke-virtual {v1}, Lpi;->r()Lht0;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    if-eqz v0, :cond_6

    .line 500
    .line 501
    new-instance v1, Llc0;

    .line 502
    .line 503
    const/4 v2, 0x2

    .line 504
    move/from16 v3, p1

    .line 505
    .line 506
    invoke-direct {v1, v3, v2}, Llc0;-><init>(II)V

    .line 507
    .line 508
    .line 509
    iput-object v1, v0, Lht0;->d:Lww;

    .line 510
    .line 511
    :cond_6
    return-void
.end method

.method private static final S(Loh0;)Lna1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lzc0;->a0(Loh0;Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lna1;->a:Lna1;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final S0(ILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    invoke-static {p0}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p1, p0}, Lzc0;->R0(Lji;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final T(Landroid/content/Context;Landroid/graphics/Bitmap;Lji;I)Lna1;
    .locals 10

    .line 1
    and-int/lit8 v0, p3, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/2addr p3, v2

    .line 11
    move-object v8, p2

    .line 12
    check-cast v8, Lpi;

    .line 13
    .line 14
    invoke-virtual {v8, p3, v0}, Lpi;->O(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_3

    .line 19
    .line 20
    invoke-virtual {v8, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-virtual {v8, p1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    or-int/2addr p2, p3

    .line 29
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    sget-object p2, Lii;->a:Lr3;

    .line 36
    .line 37
    if-ne p3, p2, :cond_2

    .line 38
    .line 39
    :cond_1
    new-instance p3, Lc7;

    .line 40
    .line 41
    const/4 p2, 0x6

    .line 42
    invoke-direct {p3, p2, p0, p1}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v8, p3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    move-object v1, p3

    .line 49
    check-cast v1, Lhw;

    .line 50
    .line 51
    sget-object p0, Loh;->a:Loh;

    .line 52
    .line 53
    invoke-virtual {p0}, Loh;->t()Lxw;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    const/high16 v9, 0x30000000

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v1 .. v9}, Lo30;->h(Lhw;Lpe0;ZLx01;Lcc;Ljn0;Lxw;Lji;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v8}, Lpi;->R()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 72
    .line 73
    return-object p0
.end method

.method public static final T0(Lpe0;ZLji;II)V
    .locals 33

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    check-cast v2, Lpi;

    .line 4
    .line 5
    const v3, -0x20d2cb18

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2, v3}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v3, p4, 0x1

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    or-int/lit8 v4, p3, 0x6

    .line 16
    .line 17
    move v5, v4

    .line 18
    move-object/from16 v4, p0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v4, p3, 0x6

    .line 22
    .line 23
    if-nez v4, :cond_2

    .line 24
    .line 25
    move-object/from16 v4, p0

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v5, 0x2

    .line 36
    :goto_0
    or-int v5, p3, v5

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v4, p0

    .line 40
    .line 41
    move/from16 v5, p3

    .line 42
    .line 43
    :goto_1
    and-int/lit8 v6, p4, 0x2

    .line 44
    .line 45
    if-eqz v6, :cond_4

    .line 46
    .line 47
    or-int/lit8 v5, v5, 0x30

    .line 48
    .line 49
    :cond_3
    move/from16 v7, p1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    and-int/lit8 v7, p3, 0x30

    .line 53
    .line 54
    if-nez v7, :cond_3

    .line 55
    .line 56
    move/from16 v7, p1

    .line 57
    .line 58
    invoke-virtual {v2, v7}, Lpi;->g(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_5

    .line 63
    .line 64
    const/16 v8, 0x20

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    const/16 v8, 0x10

    .line 68
    .line 69
    :goto_2
    or-int/2addr v5, v8

    .line 70
    :goto_3
    and-int/lit8 v8, v5, 0x13

    .line 71
    .line 72
    const/16 v9, 0x12

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v11, 0x1

    .line 76
    if-eq v8, v9, :cond_6

    .line 77
    .line 78
    move v8, v11

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    move v8, v10

    .line 81
    :goto_4
    and-int/2addr v5, v11

    .line 82
    invoke-virtual {v2, v5, v8}, Lpi;->O(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_a

    .line 87
    .line 88
    sget-object v5, Lme0;->a:Lme0;

    .line 89
    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    move-object v3, v5

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move-object v3, v4

    .line 95
    :goto_5
    if-eqz v6, :cond_8

    .line 96
    .line 97
    move v7, v10

    .line 98
    :cond_8
    invoke-static {v2}, Lrd0;->P(Lpi;)Lpy0;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    sget-object v6, Ls11;->b:Lrt;

    .line 103
    .line 104
    invoke-interface {v3, v6}, Lpe0;->c(Lpe0;)Lpe0;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-static {v6, v4}, Lrd0;->X(Lpe0;Lpy0;)Lpe0;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    sget-object v6, Lnf;->a:Lg41;

    .line 113
    .line 114
    invoke-virtual {v2, v6}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Llf;

    .line 119
    .line 120
    iget-wide v8, v8, Llf;->n:J

    .line 121
    .line 122
    sget-object v12, Lpf1;->i:Lfz;

    .line 123
    .line 124
    invoke-static {v4, v8, v9, v12}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const/high16 v8, 0x41c00000    # 24.0f

    .line 129
    .line 130
    const/high16 v9, 0x41a00000    # 20.0f

    .line 131
    .line 132
    invoke-static {v4, v9, v8}, Lrd0;->E(Lpe0;FF)Lpe0;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    sget-object v8, Ln2;->q:Lfa;

    .line 137
    .line 138
    invoke-static {v8, v2, v10}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    iget-wide v12, v2, Lpi;->T:J

    .line 143
    .line 144
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual {v2}, Lpi;->l()Lfq0;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    invoke-static {v2, v4}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    sget-object v13, Lfi;->b:Lei;

    .line 157
    .line 158
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    sget-object v13, Lei;->b:Lcj;

    .line 162
    .line 163
    invoke-virtual {v2}, Lpi;->Z()V

    .line 164
    .line 165
    .line 166
    iget-boolean v14, v2, Lpi;->S:Z

    .line 167
    .line 168
    if-eqz v14, :cond_9

    .line 169
    .line 170
    invoke-virtual {v2, v13}, Lpi;->k(Lhw;)V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_9
    invoke-virtual {v2}, Lpi;->j0()V

    .line 175
    .line 176
    .line 177
    :goto_6
    sget-object v13, Lei;->e:Lm7;

    .line 178
    .line 179
    invoke-static {v2, v13, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-object v8, Lei;->d:Lm7;

    .line 183
    .line 184
    invoke-static {v2, v8, v12}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    sget-object v10, Lei;->f:Lm7;

    .line 192
    .line 193
    invoke-static {v2, v8, v10}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 194
    .line 195
    .line 196
    sget-object v8, Lei;->g:Lp3;

    .line 197
    .line 198
    invoke-static {v2, v8}, Lw60;->G(Lji;Lsw;)V

    .line 199
    .line 200
    .line 201
    sget-object v8, Lei;->c:Lm7;

    .line 202
    .line 203
    invoke-static {v2, v8, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    const/16 v4, 0x18

    .line 207
    .line 208
    invoke-static {v4}, Lj50;->q(I)J

    .line 209
    .line 210
    .line 211
    move-result-wide v12

    .line 212
    sget-object v8, Lzv;->i:Lzv;

    .line 213
    .line 214
    move-object v10, v5

    .line 215
    invoke-static {}, Lhf;->d()J

    .line 216
    .line 217
    .line 218
    move-result-wide v4

    .line 219
    move-object v14, v3

    .line 220
    sget-object v3, Ls11;->a:Lrt;

    .line 221
    .line 222
    move-object v15, v6

    .line 223
    move-wide/from16 v31, v12

    .line 224
    .line 225
    move v13, v7

    .line 226
    move-wide/from16 v6, v31

    .line 227
    .line 228
    new-instance v12, Lr61;

    .line 229
    .line 230
    const/4 v9, 0x3

    .line 231
    invoke-direct {v12, v9}, Lr61;-><init>(I)V

    .line 232
    .line 233
    .line 234
    const/16 v22, 0x0

    .line 235
    .line 236
    const v23, 0x3fba8

    .line 237
    .line 238
    .line 239
    move-object/from16 v20, v2

    .line 240
    .line 241
    const-string v2, "\u81f4\u8c22"

    .line 242
    .line 243
    move/from16 v16, v9

    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    move-object/from16 v17, v10

    .line 247
    .line 248
    move/from16 v18, v11

    .line 249
    .line 250
    const-wide/16 v10, 0x0

    .line 251
    .line 252
    move/from16 v21, v13

    .line 253
    .line 254
    move-object/from16 v19, v14

    .line 255
    .line 256
    const-wide/16 v13, 0x0

    .line 257
    .line 258
    move-object/from16 v24, v15

    .line 259
    .line 260
    const/4 v15, 0x0

    .line 261
    move/from16 v25, v16

    .line 262
    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    move-object/from16 v26, v17

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    move/from16 v27, v18

    .line 270
    .line 271
    const/16 v18, 0x0

    .line 272
    .line 273
    move-object/from16 v28, v19

    .line 274
    .line 275
    const/16 v19, 0x0

    .line 276
    .line 277
    move/from16 v29, v21

    .line 278
    .line 279
    const v21, 0x186036

    .line 280
    .line 281
    .line 282
    move-object/from16 v1, v24

    .line 283
    .line 284
    move-object/from16 v0, v26

    .line 285
    .line 286
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v2, v20

    .line 290
    .line 291
    const/high16 v4, 0x40c00000    # 6.0f

    .line 292
    .line 293
    invoke-static {v0, v4}, Ls11;->b(Lpe0;F)Lpe0;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-static {v2, v4}, Lu50;->c(Lji;Lpe0;)V

    .line 298
    .line 299
    .line 300
    const/16 v24, 0xd

    .line 301
    .line 302
    invoke-static/range {v24 .. v24}, Lj50;->q(I)J

    .line 303
    .line 304
    .line 305
    move-result-wide v6

    .line 306
    invoke-virtual {v2, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, Llf;

    .line 311
    .line 312
    iget-wide v4, v4, Llf;->s:J

    .line 313
    .line 314
    new-instance v12, Lr61;

    .line 315
    .line 316
    const/4 v8, 0x3

    .line 317
    invoke-direct {v12, v8}, Lr61;-><init>(I)V

    .line 318
    .line 319
    .line 320
    const v23, 0x3fbe8

    .line 321
    .line 322
    .line 323
    const-string v2, "\u611f\u8c22\u4ee5\u4e0b\u9879\u76ee\u4e0e\u5de5\u5177"

    .line 324
    .line 325
    move/from16 v30, v8

    .line 326
    .line 327
    const/4 v8, 0x0

    .line 328
    const/16 v21, 0x6036

    .line 329
    .line 330
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 331
    .line 332
    .line 333
    move-object/from16 v2, v20

    .line 334
    .line 335
    const/high16 v4, 0x41e00000    # 28.0f

    .line 336
    .line 337
    invoke-static {v0, v4}, Ls11;->b(Lpe0;F)Lpe0;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-static {v2, v4}, Lu50;->c(Lji;Lpe0;)V

    .line 342
    .line 343
    .line 344
    sget-object v4, Loh;->a:Loh;

    .line 345
    .line 346
    invoke-virtual {v4}, Loh;->u()Lww;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    const/4 v6, 0x6

    .line 351
    invoke-static {v5, v2, v6}, Lzc0;->M0(Lww;Lji;I)V

    .line 352
    .line 353
    .line 354
    const/high16 v5, 0x41600000    # 14.0f

    .line 355
    .line 356
    invoke-static {v0, v5}, Ls11;->b(Lpe0;F)Lpe0;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-static {v2, v7}, Lu50;->c(Lji;Lpe0;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Loh;->w()Lww;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-static {v4, v2, v6}, Lzc0;->M0(Lww;Lji;I)V

    .line 368
    .line 369
    .line 370
    invoke-static {v0, v5}, Ls11;->b(Lpe0;F)Lpe0;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-static {v2, v4}, Lu50;->c(Lji;Lpe0;)V

    .line 375
    .line 376
    .line 377
    new-instance v4, Luc0;

    .line 378
    .line 379
    move/from16 v5, v29

    .line 380
    .line 381
    invoke-direct {v4, v5}, Luc0;-><init>(Z)V

    .line 382
    .line 383
    .line 384
    const v7, -0x4d6691c0

    .line 385
    .line 386
    .line 387
    invoke-static {v7, v4, v2}, Lkl;->w(ILex;Lji;)Lmh;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-static {v4, v2, v6}, Lzc0;->M0(Lww;Lji;I)V

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41a00000    # 20.0f

    .line 395
    .line 396
    invoke-static {v0, v4}, Ls11;->b(Lpe0;F)Lpe0;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    invoke-static {v2, v4}, Lu50;->c(Lji;Lpe0;)V

    .line 401
    .line 402
    .line 403
    invoke-static/range {v24 .. v24}, Lj50;->q(I)J

    .line 404
    .line 405
    .line 406
    move-result-wide v6

    .line 407
    invoke-virtual {v2, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, Llf;

    .line 412
    .line 413
    iget-wide v8, v1, Llf;->s:J

    .line 414
    .line 415
    const/16 v1, 0x14

    .line 416
    .line 417
    invoke-static {v1}, Lj50;->q(I)J

    .line 418
    .line 419
    .line 420
    move-result-wide v13

    .line 421
    new-instance v12, Lr61;

    .line 422
    .line 423
    const/4 v1, 0x3

    .line 424
    invoke-direct {v12, v1}, Lr61;-><init>(I)V

    .line 425
    .line 426
    .line 427
    const/16 v22, 0x30

    .line 428
    .line 429
    const v23, 0x3f3e8

    .line 430
    .line 431
    .line 432
    const-string v2, "\u9664\u4e86\u611f\u8c22\u4ee5\u4e0a\u5404\u4f4d\u4ee5\u5916\uff0c\u4e5f\u540c\u6837\u611f\u8c22\u5176\u4ed6\u4e00\u76f4\u9ed8\u9ed8\u652f\u6301\u672c\u6a21\u5757\u7684\u5404\u4f4d\u5c0f\u4f19\u4f34\u7684\u652f\u6301\u4e0e\u5e2e\u52a9\uff01"

    .line 433
    .line 434
    move-wide v4, v8

    .line 435
    const/4 v8, 0x0

    .line 436
    const/4 v9, 0x0

    .line 437
    invoke-static/range {v2 .. v23}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 438
    .line 439
    .line 440
    move-object/from16 v2, v20

    .line 441
    .line 442
    const/high16 v1, 0x41800000    # 16.0f

    .line 443
    .line 444
    invoke-static {v0, v1}, Ls11;->b(Lpe0;F)Lpe0;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-static {v2, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 449
    .line 450
    .line 451
    const/4 v0, 0x1

    .line 452
    invoke-virtual {v2, v0}, Lpi;->p(Z)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v4, v28

    .line 456
    .line 457
    move/from16 v7, v29

    .line 458
    .line 459
    goto :goto_7

    .line 460
    :cond_a
    invoke-virtual {v2}, Lpi;->R()V

    .line 461
    .line 462
    .line 463
    :goto_7
    invoke-virtual {v2}, Lpi;->r()Lht0;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    if-eqz v0, :cond_b

    .line 468
    .line 469
    new-instance v1, Lvc0;

    .line 470
    .line 471
    move/from16 v2, p3

    .line 472
    .line 473
    move/from16 v3, p4

    .line 474
    .line 475
    invoke-direct {v1, v4, v7, v2, v3}, Lvc0;-><init>(Lpe0;ZII)V

    .line 476
    .line 477
    .line 478
    iput-object v1, v0, Lht0;->d:Lww;

    .line 479
    .line 480
    :cond_b
    return-void
.end method

.method private static final U(Landroid/content/Context;Landroid/graphics/Bitmap;)Lna1;
    .locals 7

    .line 1
    const-string v0, "weixin_zs_"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Landroid/content/ContentValues;

    .line 5
    .line 6
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "_display_name"

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ".png"

    .line 24
    .line 25
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "mime_type"

    .line 36
    .line 37
    const-string v3, "image/png"

    .line 38
    .line 39
    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "relative_path"

    .line 43
    .line 44
    sget-object v3, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 54
    .line 55
    invoke-virtual {v0, v3, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 72
    .line 73
    const/16 v3, 0x64

    .line 74
    .line 75
    invoke-virtual {p1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    :catchall_1
    move-exception v2

    .line 85
    :try_start_4
    invoke-static {v0, p1}, Li4;->k(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_0
    :goto_0
    const-string p1, "\u4fdd\u5b58\u6210\u529f"

    .line 90
    .line 91
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catch_0
    const-string p1, "\u4fdd\u5b58\u5931\u8d25"

    .line 100
    .line 101
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 106
    .line 107
    .line 108
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 109
    .line 110
    return-object p0
.end method

.method private static final U0(ZLji;I)Lna1;
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    and-int/2addr p2, v1

    .line 12
    check-cast p1, Lpi;

    .line 13
    .line 14
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    const-string p2, "\u611f\u8c22\u81ea\u613f\u6253\u8d4f"

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    const/4 v1, 0x6

    .line 24
    invoke-static {p2, v0, p1, v1, v3}, Lzc0;->P0(Ljava/lang/String;Lpe0;Lji;II)V

    .line 25
    .line 26
    .line 27
    sget-object p2, Lme0;->a:Lme0;

    .line 28
    .line 29
    const/high16 v0, 0x41000000    # 8.0f

    .line 30
    .line 31
    invoke-static {p2, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p1, p2}, Lu50;->c(Lji;Lpe0;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1, v2, v2}, Lzc0;->R(ZLji;II)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 43
    .line 44
    .line 45
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 46
    .line 47
    return-object p0
.end method

.method private static final V(Loh0;Lji;I)Lna1;
    .locals 10

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/2addr p2, v2

    .line 11
    move-object v8, p1

    .line 12
    check-cast v8, Lpi;

    .line 13
    .line 14
    invoke-virtual {v8, p2, v0}, Lpi;->O(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lii;->a:Lr3;

    .line 25
    .line 26
    if-ne p1, p2, :cond_1

    .line 27
    .line 28
    new-instance p1, Lq70;

    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    invoke-direct {p1, p0, p2}, Lq70;-><init>(Loh0;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v8, p1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move-object v1, p1

    .line 38
    check-cast v1, Lhw;

    .line 39
    .line 40
    sget-object p0, Loh;->a:Loh;

    .line 41
    .line 42
    invoke-virtual {p0}, Loh;->o()Lxw;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    const v9, 0x30000006

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-static/range {v1 .. v9}, Lo30;->h(Lhw;Lpe0;ZLx01;Lcc;Ljn0;Lxw;Lji;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v8}, Lpi;->R()V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 62
    .line 63
    return-object p0
.end method

.method private static final V0(Lpe0;ZIILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p4, p2, p3}, Lzc0;->T0(Lpe0;ZLji;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final W(Loh0;)Lna1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lzc0;->a0(Loh0;Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lna1;->a:Lna1;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final W0(Lji;I)V
    .locals 34

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    check-cast v5, Lpi;

    .line 4
    .line 5
    const v1, -0x31ad9f0b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v1}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move v3, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v3, v2

    .line 18
    :goto_0
    and-int/lit8 v4, p1, 0x1

    .line 19
    .line 20
    invoke-virtual {v5, v4, v3}, Lpi;->O(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_5

    .line 25
    .line 26
    const-string v10, "5. \u4e0b\u8f7d\u6309\u94ae\u4e3a\u7ea2\u8272\u65f6\uff0c\u53ef\u6b63\u5e38\u70b9\u51fb\u5f39\u51fa\u6a21\u5757\u4e13\u5c5e\u6d4f\u89c8\u4e0e\u4e0b\u8f7d\u754c\u9762"

    .line 27
    .line 28
    const-string v11, "6. \u5269\u4e0b\u81ea\u5df1\u63a2\u7d22\uff0c\u4e00\u8d77\u6316\u7ea2\u85af\ud83c\udf60\u5427\ud83d\ude0a\uff01"

    .line 29
    .line 30
    const-string v6, "1. \u5b89\u88c5\u6a21\u5757\u540e\u5728 LSPosed \u6846\u67b6\u6fc0\u6d3b\u6a21\u5757\u5e76\u4e14\u52fe\u9009\u63a8\u8350\u4f5c\u7528\u57df"

    .line 31
    .line 32
    const-string v7, "2. \u9996\u6b21\u5b89\u88c5\u4f7f\u7528\u672c\u6a21\u5757\u4f1a\u5f39\u7a97\u4f7f\u7528\u534f\u8bae\uff0c\u4ed4\u7ec6\u9605\u8bfb\u5e76\u4e14\u540c\u610f\u540e\u65b9\u53ef\u4f7f\u7528\uff08\u540c\u610f\u540e\u540e\u7eed\u4e0d\u518d\u5f39\u51fa\uff09"

    .line 33
    .line 34
    const-string v8, "3. \u5f53\u8fdb\u5165\u56fe\u7247\u5e16\u5b50\u8be6\u60c5\u9875\u65f6\u4f1a\u6709\u4e0b\u8f7d\u6309\u94ae\uff0c\u6309\u94ae\u4f4d\u7f6e\u53ef\u4ee5\u81ea\u7531\u62d6\u52a8"

    .line 35
    .line 36
    const-string v9, "4. \u4e0b\u8f7d\u6309\u94ae\u72b6\u6001\u4e3a\u7070\u8272\u8bf4\u660e\u8fd8\u672a\u52a0\u8f7d\u5b8c\u6210\uff0c\u65e0\u6cd5\u70b9\u51fb"

    .line 37
    .line 38
    filled-new-array/range {v6 .. v11}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v23

    .line 46
    sget-object v3, Ln2;->q:Lfa;

    .line 47
    .line 48
    invoke-static {v3, v5, v2}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-wide v6, v5, Lpi;->T:J

    .line 53
    .line 54
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v5}, Lpi;->l()Lfq0;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    sget-object v7, Lme0;->a:Lme0;

    .line 63
    .line 64
    invoke-static {v5, v7}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    sget-object v9, Lfi;->b:Lei;

    .line 69
    .line 70
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v9, Lei;->b:Lcj;

    .line 74
    .line 75
    invoke-virtual {v5}, Lpi;->Z()V

    .line 76
    .line 77
    .line 78
    iget-boolean v10, v5, Lpi;->S:Z

    .line 79
    .line 80
    if-eqz v10, :cond_1

    .line 81
    .line 82
    invoke-virtual {v5, v9}, Lpi;->k(Lhw;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v5}, Lpi;->j0()V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object v9, Lei;->e:Lm7;

    .line 90
    .line 91
    invoke-static {v5, v9, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object v3, Lei;->d:Lm7;

    .line 95
    .line 96
    invoke-static {v5, v3, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    sget-object v4, Lei;->f:Lm7;

    .line 104
    .line 105
    invoke-static {v5, v3, v4}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 106
    .line 107
    .line 108
    sget-object v3, Lei;->g:Lp3;

    .line 109
    .line 110
    invoke-static {v5, v3}, Lw60;->G(Lji;Lsw;)V

    .line 111
    .line 112
    .line 113
    sget-object v3, Lei;->c:Lm7;

    .line 114
    .line 115
    invoke-static {v5, v3, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const v3, -0x170e552b

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v3}, Lpi;->W(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v24

    .line 128
    move v3, v2

    .line 129
    :goto_2
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    const/16 v8, 0xd

    .line 134
    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    add-int/lit8 v25, v3, 0x1

    .line 142
    .line 143
    if-ltz v3, :cond_3

    .line 144
    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v8}, Lj50;->q(I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v8

    .line 151
    const/16 v6, 0x14

    .line 152
    .line 153
    invoke-static {v6}, Lj50;->q(I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    sget-object v6, Lnf;->a:Lg41;

    .line 158
    .line 159
    invoke-virtual {v5, v6}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Llf;

    .line 164
    .line 165
    iget-wide v10, v6, Llf;->s:J

    .line 166
    .line 167
    const/16 v21, 0x30

    .line 168
    .line 169
    const v22, 0x3f7ea

    .line 170
    .line 171
    .line 172
    move v6, v2

    .line 173
    const/4 v2, 0x0

    .line 174
    move-object v14, v7

    .line 175
    const/4 v7, 0x0

    .line 176
    move-object/from16 v19, v5

    .line 177
    .line 178
    move-wide/from16 v32, v8

    .line 179
    .line 180
    move v9, v6

    .line 181
    move-wide/from16 v5, v32

    .line 182
    .line 183
    const/4 v8, 0x0

    .line 184
    move v15, v1

    .line 185
    move-object v1, v4

    .line 186
    move/from16 v16, v9

    .line 187
    .line 188
    move-wide/from16 v32, v10

    .line 189
    .line 190
    move v11, v3

    .line 191
    move-wide/from16 v3, v32

    .line 192
    .line 193
    const-wide/16 v9, 0x0

    .line 194
    .line 195
    move/from16 v17, v11

    .line 196
    .line 197
    const/4 v11, 0x0

    .line 198
    move-object/from16 v18, v14

    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    move/from16 v20, v15

    .line 202
    .line 203
    const/4 v15, 0x0

    .line 204
    move/from16 v26, v16

    .line 205
    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    move/from16 v27, v17

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    move-object/from16 v28, v18

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    move/from16 v29, v20

    .line 217
    .line 218
    const/16 v20, 0x6000

    .line 219
    .line 220
    move/from16 v0, v26

    .line 221
    .line 222
    move-object/from16 v30, v28

    .line 223
    .line 224
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 225
    .line 226
    .line 227
    move-object/from16 v5, v19

    .line 228
    .line 229
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    add-int/lit8 v1, v1, -0x1

    .line 234
    .line 235
    move/from16 v11, v27

    .line 236
    .line 237
    if-ge v11, v1, :cond_2

    .line 238
    .line 239
    const v1, -0x16de098c

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v1}, Lpi;->W(I)V

    .line 243
    .line 244
    .line 245
    const/high16 v1, 0x40c00000    # 6.0f

    .line 246
    .line 247
    move-object/from16 v9, v30

    .line 248
    .line 249
    invoke-static {v9, v1}, Ls11;->b(Lpe0;F)Lpe0;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-static {v5, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 254
    .line 255
    .line 256
    :goto_3
    invoke-virtual {v5, v0}, Lpi;->p(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_2
    move-object/from16 v9, v30

    .line 261
    .line 262
    const v1, -0x18b8318f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v1}, Lpi;->W(I)V

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :goto_4
    move v2, v0

    .line 270
    move-object v7, v9

    .line 271
    move/from16 v3, v25

    .line 272
    .line 273
    move/from16 v1, v29

    .line 274
    .line 275
    goto/16 :goto_2

    .line 276
    .line 277
    :cond_3
    invoke-static {}, Lo30;->A()V

    .line 278
    .line 279
    .line 280
    const/4 v0, 0x0

    .line 281
    throw v0

    .line 282
    :cond_4
    move/from16 v29, v1

    .line 283
    .line 284
    move v0, v2

    .line 285
    move-object v9, v7

    .line 286
    invoke-virtual {v5, v0}, Lpi;->p(Z)V

    .line 287
    .line 288
    .line 289
    move/from16 v15, v29

    .line 290
    .line 291
    invoke-virtual {v5, v15}, Lpi;->p(Z)V

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41000000    # 8.0f

    .line 295
    .line 296
    invoke-static {v9, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v5, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 301
    .line 302
    .line 303
    sget-object v10, Lnf;->a:Lg41;

    .line 304
    .line 305
    invoke-virtual {v5, v10}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    check-cast v1, Llf;

    .line 310
    .line 311
    iget-wide v3, v1, Llf;->r:J

    .line 312
    .line 313
    const/16 v6, 0x30

    .line 314
    .line 315
    const/4 v7, 0x1

    .line 316
    const/4 v1, 0x0

    .line 317
    const/high16 v2, 0x3f000000    # 0.5f

    .line 318
    .line 319
    invoke-static/range {v1 .. v7}, Lkl;->c(Lpe0;FJLji;II)V

    .line 320
    .line 321
    .line 322
    move/from16 v23, v2

    .line 323
    .line 324
    invoke-static {v9, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-static {v5, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v8}, Lj50;->q(I)J

    .line 332
    .line 333
    .line 334
    move-result-wide v1

    .line 335
    sget-object v7, Lzv;->i:Lzv;

    .line 336
    .line 337
    invoke-static {}, Lhf;->d()J

    .line 338
    .line 339
    .line 340
    move-result-wide v3

    .line 341
    move-object/from16 v19, v5

    .line 342
    .line 343
    move-wide v5, v1

    .line 344
    sget-object v2, Ls11;->a:Lrt;

    .line 345
    .line 346
    const/16 v21, 0x0

    .line 347
    .line 348
    const v22, 0x3ffa8

    .line 349
    .line 350
    .line 351
    const-string v1, "\u26a0\ufe0f \u53cd\u9988\u987b\u77e5"

    .line 352
    .line 353
    const/4 v8, 0x0

    .line 354
    move-object v14, v9

    .line 355
    move-object v11, v10

    .line 356
    const-wide/16 v9, 0x0

    .line 357
    .line 358
    move-object v12, v11

    .line 359
    const/4 v11, 0x0

    .line 360
    move-object v15, v12

    .line 361
    const-wide/16 v12, 0x0

    .line 362
    .line 363
    move-object/from16 v30, v14

    .line 364
    .line 365
    const/4 v14, 0x0

    .line 366
    move-object/from16 v16, v15

    .line 367
    .line 368
    const/4 v15, 0x0

    .line 369
    move-object/from16 v17, v16

    .line 370
    .line 371
    const/16 v16, 0x0

    .line 372
    .line 373
    move-object/from16 v18, v17

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    move-object/from16 v20, v18

    .line 378
    .line 379
    const/16 v18, 0x0

    .line 380
    .line 381
    move-object/from16 v24, v20

    .line 382
    .line 383
    const v20, 0x186036

    .line 384
    .line 385
    .line 386
    move-object/from16 v31, v24

    .line 387
    .line 388
    move-object/from16 v0, v30

    .line 389
    .line 390
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 391
    .line 392
    .line 393
    move-object/from16 v5, v19

    .line 394
    .line 395
    const/high16 v1, 0x40800000    # 4.0f

    .line 396
    .line 397
    invoke-static {v0, v1}, Ls11;->b(Lpe0;F)Lpe0;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-static {v5, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 402
    .line 403
    .line 404
    const/16 v24, 0xc

    .line 405
    .line 406
    invoke-static/range {v24 .. v24}, Lj50;->q(I)J

    .line 407
    .line 408
    .line 409
    move-result-wide v5

    .line 410
    sget-object v7, Lzv;->g:Lzv;

    .line 411
    .line 412
    invoke-static {}, Lhf;->d()J

    .line 413
    .line 414
    .line 415
    move-result-wide v3

    .line 416
    const v1, 0x3f59999a    # 0.85f

    .line 417
    .line 418
    .line 419
    invoke-static {v1, v3, v4}, Lff;->b(FJ)J

    .line 420
    .line 421
    .line 422
    move-result-wide v3

    .line 423
    const/16 v25, 0x12

    .line 424
    .line 425
    invoke-static/range {v25 .. v25}, Lj50;->q(I)J

    .line 426
    .line 427
    .line 428
    move-result-wide v12

    .line 429
    const/16 v21, 0x30

    .line 430
    .line 431
    const v22, 0x3f7a8

    .line 432
    .line 433
    .line 434
    const-string v1, "\u53cd\u9988\u95ee\u9898\u524d\uff0c\u8bf7\u8ba4\u771f\u67e5\u770b\u672c\u6a21\u5757\u5404\u754c\u9762\u7684\u8bf4\u660e\u4ee5\u53ca\u4ea4\u6d41\u7fa4\u7ec4\u5185\u7684\u516c\u544a\u548c\u8bf4\u660e\u3002\u82e5\u53cd\u9988\u7684\u95ee\u9898\u5df2\u6709\u660e\u786e\u63d0\u9192\u6216\u8bf4\u660e\uff0c\u6216\u672a\u6309\u8981\u6c42\u683c\u5f0f\u63d0\u4f9b\u95ee\u9898\u63cf\u8ff0\u4e0e\u65e5\u5fd7\uff0c\u5c06\u88ab\u79fb\u51fa\u7fa4\u7ec4\u5e76\u5c01\u7981\uff0c\u6055\u4e0d\u53e6\u884c\u901a\u77e5\u3002"

    .line 435
    .line 436
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 437
    .line 438
    .line 439
    move-object v8, v2

    .line 440
    move-object v9, v7

    .line 441
    move-object/from16 v5, v19

    .line 442
    .line 443
    const/high16 v10, 0x41000000    # 8.0f

    .line 444
    .line 445
    invoke-static {v0, v10}, Ls11;->b(Lpe0;F)Lpe0;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-static {v5, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 450
    .line 451
    .line 452
    move-object/from16 v15, v31

    .line 453
    .line 454
    invoke-virtual {v5, v15}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    check-cast v1, Llf;

    .line 459
    .line 460
    iget-wide v3, v1, Llf;->r:J

    .line 461
    .line 462
    const/16 v6, 0x30

    .line 463
    .line 464
    const/4 v7, 0x1

    .line 465
    const/4 v1, 0x0

    .line 466
    move/from16 v2, v23

    .line 467
    .line 468
    invoke-static/range {v1 .. v7}, Lkl;->c(Lpe0;FJLji;II)V

    .line 469
    .line 470
    .line 471
    invoke-static {v0, v10}, Ls11;->b(Lpe0;F)Lpe0;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-static {v5, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 476
    .line 477
    .line 478
    invoke-static/range {v24 .. v24}, Lj50;->q(I)J

    .line 479
    .line 480
    .line 481
    move-result-wide v0

    .line 482
    invoke-static {}, Lhf;->d()J

    .line 483
    .line 484
    .line 485
    move-result-wide v3

    .line 486
    invoke-static/range {v25 .. v25}, Lj50;->q(I)J

    .line 487
    .line 488
    .line 489
    move-result-wide v12

    .line 490
    move-wide v5, v0

    .line 491
    const-string v1, "\u6ce8\u610f\u26a0\ufe0f\uff1a\u672c\u6a21\u5757\u4ec5\u4f9b\u4e2a\u4eba\u7814\u7a76\u5b66\u4e60\u4f7f\u7528\n\u8bf7\u572824\u5c0f\u65f6\u5185\u5220\u9664\uff01"

    .line 492
    .line 493
    move-object v2, v8

    .line 494
    const/4 v8, 0x0

    .line 495
    move-object v7, v9

    .line 496
    const-wide/16 v9, 0x0

    .line 497
    .line 498
    const/4 v15, 0x0

    .line 499
    invoke-static/range {v1 .. v22}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 500
    .line 501
    .line 502
    goto :goto_5

    .line 503
    :cond_5
    move-object/from16 v19, v5

    .line 504
    .line 505
    invoke-virtual/range {v19 .. v19}, Lpi;->R()V

    .line 506
    .line 507
    .line 508
    :goto_5
    invoke-virtual/range {v19 .. v19}, Lpi;->r()Lht0;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    if-eqz v0, :cond_6

    .line 513
    .line 514
    new-instance v1, Llc0;

    .line 515
    .line 516
    move/from16 v2, p1

    .line 517
    .line 518
    const/4 v15, 0x1

    .line 519
    invoke-direct {v1, v2, v15}, Llc0;-><init>(II)V

    .line 520
    .line 521
    .line 522
    iput-object v1, v0, Lht0;->d:Lww;

    .line 523
    .line 524
    :cond_6
    return-void
.end method

.method private static final X(Landroid/graphics/Bitmap;Lji;I)Lna1;
    .locals 25

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 11
    .line 12
    move-object/from16 v7, p1

    .line 13
    .line 14
    check-cast v7, Lpi;

    .line 15
    .line 16
    invoke-virtual {v7, v1, v0}, Lpi;->O(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    sget-object v0, Ln2;->r:Lfa;

    .line 23
    .line 24
    const/16 v1, 0x30

    .line 25
    .line 26
    invoke-static {v0, v7, v1}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-wide v3, v7, Lpi;->T:J

    .line 31
    .line 32
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v7}, Lpi;->l()Lfq0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    sget-object v9, Lme0;->a:Lme0;

    .line 41
    .line 42
    invoke-static {v7, v9}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sget-object v5, Lfi;->b:Lei;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v5, Lei;->b:Lcj;

    .line 52
    .line 53
    invoke-virtual {v7}, Lpi;->Z()V

    .line 54
    .line 55
    .line 56
    iget-boolean v6, v7, Lpi;->S:Z

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    invoke-virtual {v7, v5}, Lpi;->k(Lhw;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v7}, Lpi;->j0()V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object v5, Lei;->e:Lm7;

    .line 68
    .line 69
    invoke-static {v7, v5, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lei;->d:Lm7;

    .line 73
    .line 74
    invoke-static {v7, v0, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Lei;->f:Lm7;

    .line 82
    .line 83
    invoke-static {v7, v0, v1}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lei;->g:Lp3;

    .line 87
    .line 88
    invoke-static {v7, v0}, Lw60;->G(Lji;Lsw;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lei;->c:Lm7;

    .line 92
    .line 93
    invoke-static {v7, v0, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v0, Lt5;

    .line 100
    .line 101
    move-object/from16 v1, p0

    .line 102
    .line 103
    invoke-direct {v0, v1}, Lt5;-><init>(Landroid/graphics/Bitmap;)V

    .line 104
    .line 105
    .line 106
    sget-object v4, Ls11;->a:Lrt;

    .line 107
    .line 108
    sget-object v5, Ln2;->i:Lha;

    .line 109
    .line 110
    invoke-virtual {v7, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {v7}, Lpi;->L()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-nez v3, :cond_2

    .line 119
    .line 120
    sget-object v3, Lii;->a:Lr3;

    .line 121
    .line 122
    if-ne v6, v3, :cond_3

    .line 123
    .line 124
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    int-to-long v10, v3

    .line 133
    const/16 v3, 0x20

    .line 134
    .line 135
    shl-long/2addr v10, v3

    .line 136
    int-to-long v12, v1

    .line 137
    const-wide v14, 0xffffffffL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    and-long/2addr v12, v14

    .line 143
    or-long/2addr v10, v12

    .line 144
    new-instance v6, Lia;

    .line 145
    .line 146
    invoke-direct {v6, v0, v10, v11}, Lia;-><init>(Lt5;J)V

    .line 147
    .line 148
    .line 149
    iput v2, v6, Lia;->g:I

    .line 150
    .line 151
    invoke-virtual {v7, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    move-object v3, v6

    .line 155
    check-cast v3, Lia;

    .line 156
    .line 157
    const/16 v8, 0x1b8

    .line 158
    .line 159
    sget-object v6, Ldk;->a:Lr3;

    .line 160
    .line 161
    invoke-static/range {v3 .. v8}, Lo30;->f(Lro0;Lpe0;Lha;Lr3;Lji;I)V

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41000000    # 8.0f

    .line 165
    .line 166
    invoke-static {v9, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v7, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 171
    .line 172
    .line 173
    const/16 v0, 0xd

    .line 174
    .line 175
    invoke-static {v0}, Lj50;->q(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v0

    .line 179
    sget-object v3, Lnf;->a:Lg41;

    .line 180
    .line 181
    invoke-virtual {v7, v3}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Llf;

    .line 186
    .line 187
    iget-wide v5, v3, Llf;->s:J

    .line 188
    .line 189
    new-instance v13, Lr61;

    .line 190
    .line 191
    const/4 v3, 0x3

    .line 192
    invoke-direct {v13, v3}, Lr61;-><init>(I)V

    .line 193
    .line 194
    .line 195
    const/16 v23, 0x0

    .line 196
    .line 197
    const v24, 0x3fbe8

    .line 198
    .line 199
    .line 200
    const-string v3, "\u4f7f\u7528\u5fae\u4fe1\u626b\u4e00\u626b\u4e8c\u7ef4\u7801\u8fdb\u884c\u81ea\u613f\u6253\u8d4f\u652f\u6301"

    .line 201
    .line 202
    const/4 v9, 0x0

    .line 203
    const/4 v10, 0x0

    .line 204
    const-wide/16 v11, 0x0

    .line 205
    .line 206
    const-wide/16 v14, 0x0

    .line 207
    .line 208
    const/16 v16, 0x0

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const/16 v19, 0x0

    .line 215
    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    const/16 v22, 0x6036

    .line 219
    .line 220
    move-object/from16 v21, v7

    .line 221
    .line 222
    move-wide v7, v0

    .line 223
    invoke-static/range {v3 .. v24}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 224
    .line 225
    .line 226
    move-object/from16 v7, v21

    .line 227
    .line 228
    invoke-virtual {v7, v2}, Lpi;->p(Z)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_4
    invoke-virtual {v7}, Lpi;->R()V

    .line 233
    .line 234
    .line 235
    :goto_2
    sget-object v0, Lna1;->a:Lna1;

    .line 236
    .line 237
    return-object v0
.end method

.method private static final X0(ILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    invoke-static {p0}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p1, p0}, Lzc0;->W0(Lji;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final Y(ZIILji;I)Lna1;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p1}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p3, p1, p2}, Lzc0;->R(ZLji;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final synthetic Y0(Lwg0;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzc0;->c0(Lwg0;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final Z(Loh0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final synthetic Z0(Lwg0;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzc0;->n0(Lwg0;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(ILjava/util/ArrayList;Landroid/content/Context;Lx80;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lzc0;->o0(ILjava/util/List;Landroid/content/Context;Lx80;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final a0(Loh0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic a1(Lwg0;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->C0(Lwg0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->S0(ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b0(Lwg0;)I
    .locals 0

    .line 1
    check-cast p0, Ldp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldp0;->g()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final synthetic b1(Lwg0;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzc0;->H0(Lwg0;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Llf1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLjava/util/List;Lji;I)Lna1;
    .locals 15

    .line 1
    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 2
    .line 3
    move v0, p0

    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    .line 10
    move-object/from16 v4, p4

    .line 11
    .line 12
    move-object/from16 v5, p5

    .line 13
    .line 14
    move-object/from16 v6, p6

    .line 15
    .line 16
    move-object/from16 v8, p7

    .line 17
    .line 18
    move-object/from16 v9, p8

    .line 19
    .line 20
    move-object/from16 v10, p9

    .line 21
    .line 22
    move/from16 v11, p10

    .line 23
    .line 24
    move-object/from16 v12, p11

    .line 25
    .line 26
    move-object/from16 v13, p12

    .line 27
    .line 28
    move/from16 v14, p13

    .line 29
    .line 30
    invoke-static/range {v0 .. v14}, Lzc0;->l0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Llf1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLjava/util/List;Lji;I)Lna1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method private static final c0(Lwg0;I)V
    .locals 0

    .line 1
    check-cast p0, Ldp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldp0;->h(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final c1()J
    .locals 2

    .line 1
    sget-wide v0, Lzc0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic d(Lwg0;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->I0(Lwg0;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d0(Ljava/util/List;Lx80;)Lna1;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-instance v1, Lb6;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v2, p0}, Lb6;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Lmh;

    .line 15
    .line 16
    const v3, 0xb94e8c6

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v3, v2, v1}, Lmh;-><init>(IZLex;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0, p0}, Lx80;->a(Lx80;ILmh;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lna1;->a:Lna1;

    .line 26
    .line 27
    return-object p0
.end method

.method public static final d1()Ljava/lang/String;
    .locals 6

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "android.os.SystemProperties"

    .line 5
    .line 6
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "get"

    .line 11
    .line 12
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "ro.product.marketname"

    .line 21
    .line 22
    const-string v3, "ro.config.marketing_name"

    .line 23
    .line 24
    const-string v4, "ro.product.vendor.marketname"

    .line 25
    .line 26
    const-string v5, "ro.product.odm.marketname"

    .line 27
    .line 28
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/String;

    .line 51
    .line 52
    const-string v4, ""

    .line 53
    .line 54
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3}, Lk41;->a0(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    if-nez v4, :cond_0

    .line 72
    .line 73
    return-object v3

    .line 74
    :catch_0
    :cond_1
    return-object v1
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lzc0;->x0(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e0(Ljava/util/List;Lx60;ILji;I)Lna1;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    and-int/lit8 v2, p4, 0x6

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    move-object/from16 v2, p3

    .line 14
    .line 15
    check-cast v2, Lpi;

    .line 16
    .line 17
    move-object/from16 v4, p1

    .line 18
    .line 19
    invoke-virtual {v2, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v2, v3

    .line 28
    :goto_0
    or-int v2, p4, v2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v4, p1

    .line 32
    .line 33
    move/from16 v2, p4

    .line 34
    .line 35
    :goto_1
    and-int/lit8 v5, p4, 0x30

    .line 36
    .line 37
    if-nez v5, :cond_3

    .line 38
    .line 39
    move-object/from16 v5, p3

    .line 40
    .line 41
    check-cast v5, Lpi;

    .line 42
    .line 43
    invoke-virtual {v5, v1}, Lpi;->d(I)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    const/16 v5, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v5, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v5

    .line 55
    :cond_3
    and-int/lit16 v5, v2, 0x93

    .line 56
    .line 57
    const/16 v6, 0x92

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x1

    .line 61
    if-eq v5, v6, :cond_4

    .line 62
    .line 63
    move v5, v8

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move v5, v7

    .line 66
    :goto_3
    and-int/2addr v2, v8

    .line 67
    move-object/from16 v6, p3

    .line 68
    .line 69
    check-cast v6, Lpi;

    .line 70
    .line 71
    invoke-virtual {v6, v2, v5}, Lpi;->O(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_a

    .line 76
    .line 77
    invoke-static {v4}, Lx60;->a(Lx60;)Lpe0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const/high16 v4, 0x40800000    # 4.0f

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    invoke-static {v2, v4, v5, v3}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    sget-object v3, Ln2;->q:Lfa;

    .line 89
    .line 90
    invoke-static {v3, v6, v7}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-wide v9, v6, Lpi;->T:J

    .line 95
    .line 96
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v6}, Lpi;->l()Lfq0;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-static {v6, v2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    sget-object v10, Lfi;->b:Lei;

    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v10, Lei;->b:Lcj;

    .line 114
    .line 115
    invoke-virtual {v6}, Lpi;->Z()V

    .line 116
    .line 117
    .line 118
    iget-boolean v11, v6, Lpi;->S:Z

    .line 119
    .line 120
    if-eqz v11, :cond_5

    .line 121
    .line 122
    invoke-virtual {v6, v10}, Lpi;->k(Lhw;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-virtual {v6}, Lpi;->j0()V

    .line 127
    .line 128
    .line 129
    :goto_4
    sget-object v10, Lei;->e:Lm7;

    .line 130
    .line 131
    invoke-static {v6, v10, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v3, Lei;->d:Lm7;

    .line 135
    .line 136
    invoke-static {v6, v3, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v4, Lei;->f:Lm7;

    .line 144
    .line 145
    invoke-static {v6, v3, v4}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 146
    .line 147
    .line 148
    sget-object v3, Lei;->g:Lp3;

    .line 149
    .line 150
    invoke-static {v6, v3}, Lw60;->G(Lji;Lsw;)V

    .line 151
    .line 152
    .line 153
    sget-object v3, Lei;->c:Lm7;

    .line 154
    .line 155
    invoke-static {v6, v3, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const v2, -0x70e5e155

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v2}, Lpi;->W(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Ljava/lang/Iterable;

    .line 169
    .line 170
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move v3, v7

    .line 175
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_8

    .line 180
    .line 181
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    add-int/lit8 v31, v3, 0x1

    .line 186
    .line 187
    if-ltz v3, :cond_7

    .line 188
    .line 189
    check-cast v4, Ljava/lang/String;

    .line 190
    .line 191
    sget-object v9, Ls11;->a:Lrt;

    .line 192
    .line 193
    const/high16 v10, 0x40400000    # 3.0f

    .line 194
    .line 195
    invoke-static {v9, v5, v10, v8}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    sget-object v10, Lrd0;->a:Lt8;

    .line 200
    .line 201
    sget-object v11, Ln2;->n:Lga;

    .line 202
    .line 203
    invoke-static {v10, v11, v6, v7}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    iget-wide v11, v6, Lpi;->T:J

    .line 208
    .line 209
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    invoke-virtual {v6}, Lpi;->l()Lfq0;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-static {v6, v9}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    sget-object v13, Lfi;->b:Lei;

    .line 222
    .line 223
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    sget-object v13, Lei;->b:Lcj;

    .line 227
    .line 228
    invoke-virtual {v6}, Lpi;->Z()V

    .line 229
    .line 230
    .line 231
    iget-boolean v14, v6, Lpi;->S:Z

    .line 232
    .line 233
    if-eqz v14, :cond_6

    .line 234
    .line 235
    invoke-virtual {v6, v13}, Lpi;->k(Lhw;)V

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_6
    invoke-virtual {v6}, Lpi;->j0()V

    .line 240
    .line 241
    .line 242
    :goto_6
    sget-object v13, Lei;->e:Lm7;

    .line 243
    .line 244
    invoke-static {v6, v13, v10}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    sget-object v10, Lei;->d:Lm7;

    .line 248
    .line 249
    invoke-static {v6, v10, v12}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    sget-object v11, Lei;->f:Lm7;

    .line 257
    .line 258
    invoke-static {v6, v10, v11}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 259
    .line 260
    .line 261
    sget-object v10, Lei;->g:Lp3;

    .line 262
    .line 263
    invoke-static {v6, v10}, Lw60;->G(Lji;Lsw;)V

    .line 264
    .line 265
    .line 266
    sget-object v10, Lei;->c:Lm7;

    .line 267
    .line 268
    invoke-static {v6, v10, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    const/16 v9, 0xe

    .line 272
    .line 273
    invoke-static {v9}, Lj50;->q(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v13

    .line 277
    invoke-static {}, Lhf;->d()J

    .line 278
    .line 279
    .line 280
    move-result-wide v11

    .line 281
    const/16 v29, 0x0

    .line 282
    .line 283
    const v30, 0x3ffea

    .line 284
    .line 285
    .line 286
    const-string v9, "\u2764"

    .line 287
    .line 288
    const/4 v10, 0x0

    .line 289
    const/4 v15, 0x0

    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    const-wide/16 v17, 0x0

    .line 293
    .line 294
    const/16 v19, 0x0

    .line 295
    .line 296
    const-wide/16 v20, 0x0

    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    const/16 v23, 0x0

    .line 301
    .line 302
    const/16 v24, 0x0

    .line 303
    .line 304
    const/16 v25, 0x0

    .line 305
    .line 306
    const/16 v26, 0x0

    .line 307
    .line 308
    const/16 v28, 0x6006

    .line 309
    .line 310
    move-object/from16 v27, v6

    .line 311
    .line 312
    invoke-static/range {v9 .. v30}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 313
    .line 314
    .line 315
    const/high16 v9, 0x41000000    # 8.0f

    .line 316
    .line 317
    invoke-static {v9}, Ls11;->e(F)Lpe0;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    invoke-static {v6, v9}, Lu50;->c(Lji;Lpe0;)V

    .line 322
    .line 323
    .line 324
    mul-int/lit8 v9, v1, 0x5

    .line 325
    .line 326
    add-int/2addr v9, v3

    .line 327
    add-int/2addr v9, v8

    .line 328
    new-instance v3, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v9, ". "

    .line 337
    .line 338
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    const/16 v3, 0xd

    .line 349
    .line 350
    invoke-static {v3}, Lj50;->q(I)J

    .line 351
    .line 352
    .line 353
    move-result-wide v13

    .line 354
    sget-object v3, Lnf;->a:Lg41;

    .line 355
    .line 356
    invoke-virtual {v6, v3}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    check-cast v3, Llf;

    .line 361
    .line 362
    iget-wide v11, v3, Llf;->q:J

    .line 363
    .line 364
    const/16 v28, 0x6000

    .line 365
    .line 366
    invoke-static/range {v9 .. v30}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v6, v8}, Lpi;->p(Z)V

    .line 370
    .line 371
    .line 372
    move/from16 v3, v31

    .line 373
    .line 374
    goto/16 :goto_5

    .line 375
    .line 376
    :cond_7
    invoke-static {}, Lo30;->A()V

    .line 377
    .line 378
    .line 379
    const/4 v0, 0x0

    .line 380
    throw v0

    .line 381
    :cond_8
    invoke-virtual {v6, v7}, Lpi;->p(Z)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    check-cast v0, Ljava/util/List;

    .line 389
    .line 390
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    rsub-int/lit8 v0, v0, 0x5

    .line 395
    .line 396
    const v1, -0x70e56dcf

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6, v1}, Lpi;->W(I)V

    .line 400
    .line 401
    .line 402
    move v1, v7

    .line 403
    :goto_7
    if-ge v1, v0, :cond_9

    .line 404
    .line 405
    sget-object v2, Lme0;->a:Lme0;

    .line 406
    .line 407
    const/high16 v3, 0x41d00000    # 26.0f

    .line 408
    .line 409
    invoke-static {v2, v3}, Ls11;->b(Lpe0;F)Lpe0;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-static {v6, v2}, Lu50;->c(Lji;Lpe0;)V

    .line 414
    .line 415
    .line 416
    add-int/lit8 v1, v1, 0x1

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_9
    invoke-virtual {v6, v7}, Lpi;->p(Z)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v6, v8}, Lpi;->p(Z)V

    .line 423
    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_a
    invoke-virtual {v6}, Lpi;->R()V

    .line 427
    .line 428
    .line 429
    :goto_8
    sget-object v0, Lna1;->a:Lna1;

    .line 430
    .line 431
    return-object v0
.end method

.method public static synthetic f(Lpe0;ZIILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lzc0;->V0(Lpe0;ZIILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f0(Loh0;)Lna1;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lzc0;->a0(Loh0;Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lna1;->a:Lna1;

    .line 6
    .line 7
    return-object p0
.end method

.method public static synthetic g(ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->X0(ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final g0(Llf1;ZLsw;Lpe0;Lji;II)V
    .locals 74
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf1;",
            "Z",
            "Lsw;",
            "Lpe0;",
            "Lji;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v13, p1

    .line 4
    .line 5
    move-object/from16 v14, p2

    .line 6
    .line 7
    move/from16 v15, p5

    .line 8
    .line 9
    const-string v0, "1.7"

    .line 10
    .line 11
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object/from16 v8, p4

    .line 15
    .line 16
    check-cast v8, Lpi;

    .line 17
    .line 18
    const v2, 0x5a954445

    .line 19
    .line 20
    .line 21
    invoke-virtual {v8, v2}, Lpi;->X(I)Lpi;

    .line 22
    .line 23
    .line 24
    and-int/lit8 v2, v15, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v8, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v2, 0x2

    .line 37
    :goto_0
    or-int/2addr v2, v15

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v2, v15

    .line 40
    :goto_1
    and-int/lit8 v5, v15, 0x30

    .line 41
    .line 42
    const/16 v38, 0x10

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {v8, v13}, Lpi;->g(Z)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    const/16 v5, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move/from16 v5, v38

    .line 56
    .line 57
    :goto_2
    or-int/2addr v2, v5

    .line 58
    :cond_3
    and-int/lit16 v5, v15, 0x180

    .line 59
    .line 60
    if-nez v5, :cond_5

    .line 61
    .line 62
    invoke-virtual {v8, v14}, Lpi;->h(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    const/16 v5, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v5, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v2, v5

    .line 74
    :cond_5
    and-int/lit8 v5, p6, 0x8

    .line 75
    .line 76
    if-eqz v5, :cond_7

    .line 77
    .line 78
    or-int/lit16 v2, v2, 0xc00

    .line 79
    .line 80
    :cond_6
    move-object/from16 v6, p3

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_7
    and-int/lit16 v6, v15, 0xc00

    .line 84
    .line 85
    if-nez v6, :cond_6

    .line 86
    .line 87
    move-object/from16 v6, p3

    .line 88
    .line 89
    invoke-virtual {v8, v6}, Lpi;->f(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_8

    .line 94
    .line 95
    const/16 v7, 0x800

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_8
    const/16 v7, 0x400

    .line 99
    .line 100
    :goto_4
    or-int/2addr v2, v7

    .line 101
    :goto_5
    and-int/lit16 v7, v2, 0x493

    .line 102
    .line 103
    const/16 v9, 0x492

    .line 104
    .line 105
    const/4 v11, 0x1

    .line 106
    if-eq v7, v9, :cond_9

    .line 107
    .line 108
    move v7, v11

    .line 109
    goto :goto_6

    .line 110
    :cond_9
    const/4 v7, 0x0

    .line 111
    :goto_6
    and-int/2addr v2, v11

    .line 112
    invoke-virtual {v8, v2, v7}, Lpi;->O(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_23

    .line 117
    .line 118
    sget-object v2, Lme0;->a:Lme0;

    .line 119
    .line 120
    if-eqz v5, :cond_a

    .line 121
    .line 122
    move-object v5, v2

    .line 123
    goto :goto_7

    .line 124
    :cond_a
    move-object v5, v6

    .line 125
    :goto_7
    sget-object v6, Lr4;->b:Lg41;

    .line 126
    .line 127
    invoke-virtual {v8, v6}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, Landroid/content/Context;

    .line 132
    .line 133
    invoke-static {v8}, Lrd0;->P(Lpi;)Lpy0;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-eqz v1, :cond_b

    .line 138
    .line 139
    move v9, v11

    .line 140
    goto :goto_8

    .line 141
    :cond_b
    const/4 v9, 0x0

    .line 142
    :goto_8
    const/4 v12, 0x3

    .line 143
    const-string v11, "io.github.libxposed.service.IXposedService"

    .line 144
    .line 145
    if-eqz v1, :cond_c

    .line 146
    .line 147
    :try_start_0
    iget-object v4, v1, Llf1;->a:Llz;

    .line 148
    .line 149
    check-cast v4, Ljz;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 159
    .line 160
    .line 161
    move-result-object v10
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :try_start_1
    invoke-virtual {v3, v11}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, v4, Ljz;->a:Landroid/os/IBinder;

    .line 166
    .line 167
    move-object/from16 v18, v0

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-interface {v4, v12, v3, v10, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10}, Landroid/os/Parcel;->readException()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    :try_start_2
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 184
    .line 185
    .line 186
    if-nez v0, :cond_d

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 194
    .line 195
    .line 196
    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 197
    :catch_0
    move-exception v0

    .line 198
    new-instance v1, Lsg;

    .line 199
    .line 200
    invoke-direct {v1, v0}, Lsg;-><init>(Landroid/os/RemoteException;)V

    .line 201
    .line 202
    .line 203
    throw v1

    .line 204
    :cond_c
    move-object/from16 v18, v0

    .line 205
    .line 206
    :goto_9
    const-string v0, "\u672a\u8fde\u63a5"

    .line 207
    .line 208
    :cond_d
    const-string v3, "-"

    .line 209
    .line 210
    if-eqz v1, :cond_f

    .line 211
    .line 212
    :try_start_3
    iget-object v4, v1, Llf1;->a:Llz;

    .line 213
    .line 214
    check-cast v4, Ljz;

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 224
    .line 225
    .line 226
    move-result-object v12
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 227
    :try_start_4
    invoke-virtual {v10, v11}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v4, Ljz;->a:Landroid/os/IBinder;

    .line 231
    .line 232
    move-object/from16 v40, v0

    .line 233
    .line 234
    move-object/from16 v17, v3

    .line 235
    .line 236
    const/4 v0, 0x4

    .line 237
    const/4 v3, 0x0

    .line 238
    invoke-interface {v4, v0, v10, v12, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroid/os/Parcel;->readException()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 248
    :try_start_5
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 252
    .line 253
    .line 254
    if-nez v0, :cond_e

    .line 255
    .line 256
    goto :goto_a

    .line 257
    :cond_e
    move-object v3, v0

    .line 258
    goto :goto_b

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 264
    .line 265
    .line 266
    throw v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1

    .line 267
    :catch_1
    move-exception v0

    .line 268
    new-instance v1, Lsg;

    .line 269
    .line 270
    invoke-direct {v1, v0}, Lsg;-><init>(Landroid/os/RemoteException;)V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    :cond_f
    move-object/from16 v40, v0

    .line 275
    .line 276
    move-object/from16 v17, v3

    .line 277
    .line 278
    :goto_a
    move-object/from16 v3, v17

    .line 279
    .line 280
    :goto_b
    if-eqz v1, :cond_11

    .line 281
    .line 282
    :try_start_6
    iget-object v0, v1, Llf1;->a:Llz;

    .line 283
    .line 284
    check-cast v0, Ljz;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 294
    .line 295
    .line 296
    move-result-object v10
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2

    .line 297
    :try_start_7
    invoke-virtual {v4, v11}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object v0, v0, Ljz;->a:Landroid/os/IBinder;

    .line 301
    .line 302
    move-object/from16 v41, v3

    .line 303
    .line 304
    const/4 v3, 0x0

    .line 305
    const/4 v12, 0x2

    .line 306
    invoke-interface {v0, v12, v4, v10, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10}, Landroid/os/Parcel;->readException()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10}, Landroid/os/Parcel;->readInt()I

    .line 313
    .line 314
    .line 315
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 316
    :try_start_8
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2

    .line 320
    .line 321
    .line 322
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    if-nez v0, :cond_10

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :cond_10
    move-object v4, v0

    .line 334
    goto :goto_d

    .line 335
    :catchall_2
    move-exception v0

    .line 336
    :try_start_9
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 340
    .line 341
    .line 342
    throw v0
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2

    .line 343
    :catch_2
    move-exception v0

    .line 344
    new-instance v1, Lsg;

    .line 345
    .line 346
    invoke-direct {v1, v0}, Lsg;-><init>(Landroid/os/RemoteException;)V

    .line 347
    .line 348
    .line 349
    throw v1

    .line 350
    :cond_11
    move-object/from16 v41, v3

    .line 351
    .line 352
    :goto_c
    move-object/from16 v4, v17

    .line 353
    .line 354
    :goto_d
    const/16 v0, 0xb

    .line 355
    .line 356
    if-eqz v1, :cond_13

    .line 357
    .line 358
    :try_start_a
    iget-object v3, v1, Llf1;->a:Llz;

    .line 359
    .line 360
    check-cast v3, Ljz;

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 370
    .line 371
    .line 372
    move-result-object v12
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_3

    .line 373
    :try_start_b
    invoke-virtual {v10, v11}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v3, v3, Ljz;->a:Landroid/os/IBinder;

    .line 377
    .line 378
    const/4 v11, 0x0

    .line 379
    invoke-interface {v3, v0, v10, v12, v11}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroid/os/Parcel;->readException()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 386
    .line 387
    .line 388
    move-result-object v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 389
    :try_start_c
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 393
    .line 394
    .line 395
    if-nez v3, :cond_12

    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_12
    :goto_e
    move-object v12, v3

    .line 399
    goto :goto_10

    .line 400
    :catchall_3
    move-exception v0

    .line 401
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 405
    .line 406
    .line 407
    throw v0
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_3

    .line 408
    :catch_3
    move-exception v0

    .line 409
    new-instance v1, Lsg;

    .line 410
    .line 411
    invoke-direct {v1, v0}, Lsg;-><init>(Landroid/os/RemoteException;)V

    .line 412
    .line 413
    .line 414
    throw v1

    .line 415
    :cond_13
    :goto_f
    sget-object v3, Lhs;->d:Lhs;

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :goto_10
    const-string v3, "com.xingin.xhs"

    .line 419
    .line 420
    invoke-interface {v12, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 425
    .line 426
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 427
    .line 428
    new-instance v0, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    const-string v3, " "

    .line 437
    .line 438
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    sget-object v10, Lii;->a:Lr3;

    .line 453
    .line 454
    if-ne v3, v10, :cond_14

    .line 455
    .line 456
    invoke-static {}, Lzc0;->d1()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-virtual {v8, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    :cond_14
    check-cast v3, Ljava/lang/String;

    .line 464
    .line 465
    sget-object v16, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 466
    .line 467
    move-object/from16 v43, v0

    .line 468
    .line 469
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 470
    .line 471
    const-string v1, "SDK "

    .line 472
    .line 473
    invoke-static {v1, v0}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    move-object/from16 v44, v0

    .line 483
    .line 484
    array-length v0, v1

    .line 485
    if-nez v0, :cond_15

    .line 486
    .line 487
    const/4 v0, 0x0

    .line 488
    goto :goto_11

    .line 489
    :cond_15
    const/16 v39, 0x0

    .line 490
    .line 491
    aget-object v0, v1, v39

    .line 492
    .line 493
    :goto_11
    if-nez v0, :cond_16

    .line 494
    .line 495
    const-string v0, "unknown"

    .line 496
    .line 497
    :cond_16
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    if-ne v1, v10, :cond_18

    .line 502
    .line 503
    :try_start_d
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 504
    .line 505
    .line 506
    move-result-object v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 507
    move-object/from16 v45, v0

    .line 508
    .line 509
    :try_start_e
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4

    .line 513
    move-object/from16 v46, v3

    .line 514
    .line 515
    const/4 v3, 0x0

    .line 516
    :try_start_f
    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6

    .line 521
    .line 522
    if-nez v0, :cond_17

    .line 523
    .line 524
    goto :goto_13

    .line 525
    :catch_4
    :goto_12
    move-object/from16 v46, v3

    .line 526
    .line 527
    goto :goto_13

    .line 528
    :catch_5
    move-object/from16 v45, v0

    .line 529
    .line 530
    goto :goto_12

    .line 531
    :catch_6
    :goto_13
    move-object/from16 v0, v18

    .line 532
    .line 533
    :cond_17
    invoke-virtual {v8, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    move-object v1, v0

    .line 537
    goto :goto_14

    .line 538
    :cond_18
    move-object/from16 v45, v0

    .line 539
    .line 540
    move-object/from16 v46, v3

    .line 541
    .line 542
    :goto_14
    check-cast v1, Ljava/lang/String;

    .line 543
    .line 544
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    if-ne v0, v10, :cond_19

    .line 549
    .line 550
    :try_start_10
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v3
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7

    .line 558
    move-object/from16 v47, v1

    .line 559
    .line 560
    const/4 v1, 0x0

    .line 561
    :try_start_11
    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 566
    .line 567
    .line 568
    move-result-wide v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_8

    .line 569
    long-to-int v0, v0

    .line 570
    goto :goto_15

    .line 571
    :catch_7
    move-object/from16 v47, v1

    .line 572
    .line 573
    :catch_8
    const/4 v0, 0x0

    .line 574
    :goto_15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v8, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    goto :goto_16

    .line 582
    :cond_19
    move-object/from16 v47, v1

    .line 583
    .line 584
    :goto_16
    check-cast v0, Ljava/lang/Number;

    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    if-ne v1, v10, :cond_1a

    .line 595
    .line 596
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 597
    .line 598
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 599
    .line 600
    move/from16 v48, v0

    .line 601
    .line 602
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-direct {v1, v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 607
    .line 608
    .line 609
    new-instance v0, Ljava/util/Date;

    .line 610
    .line 611
    move-object/from16 v49, v4

    .line 612
    .line 613
    const-wide v3, 0x19f79d7a84cL

    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-virtual {v8, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    goto :goto_17

    .line 629
    :cond_1a
    move/from16 v48, v0

    .line 630
    .line 631
    move-object/from16 v49, v4

    .line 632
    .line 633
    :goto_17
    check-cast v1, Ljava/lang/String;

    .line 634
    .line 635
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    if-ne v0, v10, :cond_1b

    .line 640
    .line 641
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 642
    .line 643
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v8, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_1b
    check-cast v0, Loh0;

    .line 651
    .line 652
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    if-ne v3, v10, :cond_1c

    .line 657
    .line 658
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 659
    .line 660
    invoke-static {v3}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    invoke-virtual {v8, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    :cond_1c
    check-cast v3, Loh0;

    .line 668
    .line 669
    sget-object v4, Ls11;->b:Lrt;

    .line 670
    .line 671
    invoke-interface {v5, v4}, Lpe0;->c(Lpe0;)Lpe0;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    invoke-static {v4, v7}, Lrd0;->X(Lpe0;Lpy0;)Lpe0;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    sget-object v7, Lnf;->a:Lg41;

    .line 680
    .line 681
    invoke-virtual {v8, v7}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v16

    .line 685
    move-object/from16 v50, v0

    .line 686
    .line 687
    move-object/from16 v0, v16

    .line 688
    .line 689
    check-cast v0, Llf;

    .line 690
    .line 691
    move-object/from16 v51, v1

    .line 692
    .line 693
    iget-wide v0, v0, Llf;->n:J

    .line 694
    .line 695
    sget-object v15, Lpf1;->i:Lfz;

    .line 696
    .line 697
    invoke-static {v4, v0, v1, v15}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    const/high16 v1, 0x41c00000    # 24.0f

    .line 702
    .line 703
    const/high16 v4, 0x41a00000    # 20.0f

    .line 704
    .line 705
    invoke-static {v0, v4, v1}, Lrd0;->E(Lpe0;FF)Lpe0;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    sget-object v1, Ln2;->q:Lfa;

    .line 710
    .line 711
    move-object/from16 v39, v3

    .line 712
    .line 713
    const/4 v4, 0x0

    .line 714
    invoke-static {v1, v8, v4}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    move-object/from16 v52, v5

    .line 719
    .line 720
    iget-wide v4, v8, Lpi;->T:J

    .line 721
    .line 722
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    invoke-virtual {v8}, Lpi;->l()Lfq0;

    .line 727
    .line 728
    .line 729
    move-result-object v5

    .line 730
    invoke-static {v8, v0}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    sget-object v16, Lfi;->b:Lei;

    .line 735
    .line 736
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    sget-object v13, Lei;->b:Lcj;

    .line 740
    .line 741
    invoke-virtual {v8}, Lpi;->Z()V

    .line 742
    .line 743
    .line 744
    move-object/from16 v53, v1

    .line 745
    .line 746
    iget-boolean v1, v8, Lpi;->S:Z

    .line 747
    .line 748
    if-eqz v1, :cond_1d

    .line 749
    .line 750
    invoke-virtual {v8, v13}, Lpi;->k(Lhw;)V

    .line 751
    .line 752
    .line 753
    goto :goto_18

    .line 754
    :cond_1d
    invoke-virtual {v8}, Lpi;->j0()V

    .line 755
    .line 756
    .line 757
    :goto_18
    sget-object v1, Lei;->e:Lm7;

    .line 758
    .line 759
    invoke-static {v8, v1, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    sget-object v3, Lei;->d:Lm7;

    .line 763
    .line 764
    invoke-static {v8, v3, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    sget-object v5, Lei;->f:Lm7;

    .line 772
    .line 773
    invoke-static {v8, v4, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 774
    .line 775
    .line 776
    sget-object v4, Lei;->g:Lp3;

    .line 777
    .line 778
    invoke-static {v8, v4}, Lw60;->G(Lji;Lsw;)V

    .line 779
    .line 780
    .line 781
    sget-object v14, Lei;->c:Lm7;

    .line 782
    .line 783
    invoke-static {v8, v14, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    const/16 v0, 0x18

    .line 787
    .line 788
    invoke-static {v0}, Lj50;->q(I)J

    .line 789
    .line 790
    .line 791
    move-result-wide v20

    .line 792
    sget-object v22, Lzv;->i:Lzv;

    .line 793
    .line 794
    invoke-static {}, Lhf;->d()J

    .line 795
    .line 796
    .line 797
    move-result-wide v18

    .line 798
    sget-object v17, Ls11;->a:Lrt;

    .line 799
    .line 800
    new-instance v0, Lr61;

    .line 801
    .line 802
    move-object/from16 v54, v6

    .line 803
    .line 804
    const/4 v6, 0x3

    .line 805
    invoke-direct {v0, v6}, Lr61;-><init>(I)V

    .line 806
    .line 807
    .line 808
    const/16 v36, 0x0

    .line 809
    .line 810
    const v37, 0x3fba8

    .line 811
    .line 812
    .line 813
    const-string v16, "\u6316\u7ea2\u85af\u5440-WHS"

    .line 814
    .line 815
    const/16 v23, 0x0

    .line 816
    .line 817
    const-wide/16 v24, 0x0

    .line 818
    .line 819
    const-wide/16 v27, 0x0

    .line 820
    .line 821
    const/16 v29, 0x0

    .line 822
    .line 823
    const/16 v30, 0x0

    .line 824
    .line 825
    const/16 v31, 0x0

    .line 826
    .line 827
    const/16 v32, 0x0

    .line 828
    .line 829
    const/16 v33, 0x0

    .line 830
    .line 831
    const v35, 0x186036

    .line 832
    .line 833
    .line 834
    move-object/from16 v26, v0

    .line 835
    .line 836
    move-object/from16 v34, v8

    .line 837
    .line 838
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 839
    .line 840
    .line 841
    move-object/from16 v0, v17

    .line 842
    .line 843
    move-object/from16 p3, v22

    .line 844
    .line 845
    const/high16 v6, 0x40c00000    # 6.0f

    .line 846
    .line 847
    move/from16 v55, v9

    .line 848
    .line 849
    invoke-static {v2, v6}, Ls11;->b(Lpe0;F)Lpe0;

    .line 850
    .line 851
    .line 852
    move-result-object v9

    .line 853
    invoke-static {v8, v9}, Lu50;->c(Lji;Lpe0;)V

    .line 854
    .line 855
    .line 856
    sget-object v9, Lrd0;->c:Lr3;

    .line 857
    .line 858
    sget-object v6, Ln2;->o:Lga;

    .line 859
    .line 860
    move-object/from16 v57, v10

    .line 861
    .line 862
    const/16 v10, 0x36

    .line 863
    .line 864
    invoke-static {v9, v6, v8, v10}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 865
    .line 866
    .line 867
    move-result-object v9

    .line 868
    move/from16 v58, v11

    .line 869
    .line 870
    iget-wide v10, v8, Lpi;->T:J

    .line 871
    .line 872
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 873
    .line 874
    .line 875
    move-result v10

    .line 876
    invoke-virtual {v8}, Lpi;->l()Lfq0;

    .line 877
    .line 878
    .line 879
    move-result-object v11

    .line 880
    move-object/from16 v59, v6

    .line 881
    .line 882
    invoke-static {v8, v0}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 883
    .line 884
    .line 885
    move-result-object v6

    .line 886
    invoke-virtual {v8}, Lpi;->Z()V

    .line 887
    .line 888
    .line 889
    move-object/from16 v60, v0

    .line 890
    .line 891
    iget-boolean v0, v8, Lpi;->S:Z

    .line 892
    .line 893
    if-eqz v0, :cond_1e

    .line 894
    .line 895
    invoke-virtual {v8, v13}, Lpi;->k(Lhw;)V

    .line 896
    .line 897
    .line 898
    goto :goto_19

    .line 899
    :cond_1e
    invoke-virtual {v8}, Lpi;->j0()V

    .line 900
    .line 901
    .line 902
    :goto_19
    invoke-static {v8, v1, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    invoke-static {v8, v3, v11}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-static {v8, v0, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 913
    .line 914
    .line 915
    invoke-static {v8, v4}, Lw60;->G(Lji;Lsw;)V

    .line 916
    .line 917
    .line 918
    invoke-static {v8, v14, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    const/16 v61, 0xd

    .line 922
    .line 923
    invoke-static/range {v61 .. v61}, Lj50;->q(I)J

    .line 924
    .line 925
    .line 926
    move-result-wide v20

    .line 927
    invoke-virtual {v8, v7}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    check-cast v0, Llf;

    .line 932
    .line 933
    iget-wide v9, v0, Llf;->s:J

    .line 934
    .line 935
    const/16 v36, 0x0

    .line 936
    .line 937
    const v37, 0x3ffea

    .line 938
    .line 939
    .line 940
    const-string v16, "Xposed \u6a21\u5757 (API102)"

    .line 941
    .line 942
    const/16 v17, 0x0

    .line 943
    .line 944
    const/16 v22, 0x0

    .line 945
    .line 946
    const/16 v23, 0x0

    .line 947
    .line 948
    const-wide/16 v24, 0x0

    .line 949
    .line 950
    const/16 v26, 0x0

    .line 951
    .line 952
    const-wide/16 v27, 0x0

    .line 953
    .line 954
    const/16 v29, 0x0

    .line 955
    .line 956
    const/16 v30, 0x0

    .line 957
    .line 958
    const/16 v31, 0x0

    .line 959
    .line 960
    const/16 v32, 0x0

    .line 961
    .line 962
    const/16 v33, 0x0

    .line 963
    .line 964
    const/16 v35, 0x6006

    .line 965
    .line 966
    move-object/from16 v34, v8

    .line 967
    .line 968
    move-wide/from16 v18, v9

    .line 969
    .line 970
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 971
    .line 972
    .line 973
    const/high16 v0, 0x41000000    # 8.0f

    .line 974
    .line 975
    invoke-static {v0}, Ls11;->e(F)Lpe0;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-static {v8, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 980
    .line 981
    .line 982
    const/16 v0, 0xc

    .line 983
    .line 984
    invoke-static {v0}, Lj50;->q(I)J

    .line 985
    .line 986
    .line 987
    move-result-wide v20

    .line 988
    sget-wide v18, Lff;->c:J

    .line 989
    .line 990
    const/high16 v0, 0x40800000    # 4.0f

    .line 991
    .line 992
    invoke-static {v0}, Lew0;->a(F)Ldw0;

    .line 993
    .line 994
    .line 995
    move-result-object v6

    .line 996
    const v9, 0x7e7ff

    .line 997
    .line 998
    .line 999
    invoke-static {v2, v6, v9}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v6

    .line 1003
    const-wide v10, 0xff2196f3L

    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    invoke-static {v10, v11}, Lp30;->c(J)J

    .line 1009
    .line 1010
    .line 1011
    move-result-wide v10

    .line 1012
    invoke-static {v6, v10, v11, v15}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v6

    .line 1016
    const/high16 v10, 0x40000000    # 2.0f

    .line 1017
    .line 1018
    const/high16 v11, 0x40c00000    # 6.0f

    .line 1019
    .line 1020
    invoke-static {v6, v11, v10}, Lrd0;->E(Lpe0;FF)Lpe0;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v17

    .line 1024
    const v37, 0x3ffa8

    .line 1025
    .line 1026
    .line 1027
    const-string v16, "3.0"

    .line 1028
    .line 1029
    const v35, 0x186186

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v22, p3

    .line 1033
    .line 1034
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 1035
    .line 1036
    .line 1037
    move-object/from16 v56, v22

    .line 1038
    .line 1039
    move-object/from16 v6, v34

    .line 1040
    .line 1041
    const/4 v8, 0x1

    .line 1042
    invoke-virtual {v6, v8}, Lpi;->p(Z)V

    .line 1043
    .line 1044
    .line 1045
    const/high16 v10, 0x41e00000    # 28.0f

    .line 1046
    .line 1047
    invoke-static {v2, v10}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v10

    .line 1051
    invoke-static {v6, v10}, Lu50;->c(Lji;Lpe0;)V

    .line 1052
    .line 1053
    .line 1054
    move v10, v0

    .line 1055
    new-instance v0, Lqc0;

    .line 1056
    .line 1057
    move-object/from16 v68, v1

    .line 1058
    .line 1059
    move-object/from16 v69, v3

    .line 1060
    .line 1061
    move-object/from16 v71, v4

    .line 1062
    .line 1063
    move-object/from16 v70, v5

    .line 1064
    .line 1065
    move-object/from16 v66, v7

    .line 1066
    .line 1067
    move-object/from16 p4, v13

    .line 1068
    .line 1069
    move-object/from16 p3, v14

    .line 1070
    .line 1071
    move-object/from16 v16, v15

    .line 1072
    .line 1073
    move-object/from16 v65, v39

    .line 1074
    .line 1075
    move-object/from16 v3, v41

    .line 1076
    .line 1077
    move-object/from16 v7, v43

    .line 1078
    .line 1079
    move-object/from16 v8, v44

    .line 1080
    .line 1081
    move-object/from16 v9, v45

    .line 1082
    .line 1083
    move-object/from16 v62, v47

    .line 1084
    .line 1085
    move/from16 v63, v48

    .line 1086
    .line 1087
    move-object/from16 v4, v49

    .line 1088
    .line 1089
    move-object/from16 v64, v51

    .line 1090
    .line 1091
    move-object/from16 v67, v53

    .line 1092
    .line 1093
    move-object/from16 v10, v54

    .line 1094
    .line 1095
    move/from16 v1, v55

    .line 1096
    .line 1097
    move-object/from16 v73, v57

    .line 1098
    .line 1099
    move-object/from16 v72, v59

    .line 1100
    .line 1101
    move-object/from16 v13, v60

    .line 1102
    .line 1103
    const/16 v42, 0xb

    .line 1104
    .line 1105
    move-object/from16 v5, p0

    .line 1106
    .line 1107
    move-object v15, v2

    .line 1108
    move-object v14, v6

    .line 1109
    move/from16 v39, v11

    .line 1110
    .line 1111
    move-object/from16 v2, v40

    .line 1112
    .line 1113
    move-object/from16 v6, v46

    .line 1114
    .line 1115
    move/from16 v11, v58

    .line 1116
    .line 1117
    invoke-direct/range {v0 .. v12}, Lqc0;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Llf1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLjava/util/List;)V

    .line 1118
    .line 1119
    .line 1120
    const v1, 0x2777c2a5

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v1, v0, v14}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    const/4 v10, 0x6

    .line 1128
    invoke-static {v0, v14, v10}, Lzc0;->M0(Lww;Lji;I)V

    .line 1129
    .line 1130
    .line 1131
    const/high16 v0, 0x41600000    # 14.0f

    .line 1132
    .line 1133
    invoke-static {v15, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    invoke-static {v14, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-static {v0}, Lew0;->a(F)Ldw0;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v1

    .line 1144
    const v2, 0x7e7ff

    .line 1145
    .line 1146
    .line 1147
    invoke-static {v13, v1, v2}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    invoke-static {}, Lhf;->d()J

    .line 1152
    .line 1153
    .line 1154
    move-result-wide v2

    .line 1155
    const v4, 0x3ee66666    # 0.45f

    .line 1156
    .line 1157
    .line 1158
    invoke-static {v4, v2, v3}, Lff;->b(FJ)J

    .line 1159
    .line 1160
    .line 1161
    move-result-wide v2

    .line 1162
    new-instance v4, Lg31;

    .line 1163
    .line 1164
    invoke-direct {v4, v2, v3}, Lg31;-><init>(J)V

    .line 1165
    .line 1166
    .line 1167
    invoke-static {v0}, Lew0;->a(F)Ldw0;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    new-instance v3, Lta;

    .line 1172
    .line 1173
    const/high16 v5, 0x3fc00000    # 1.5f

    .line 1174
    .line 1175
    invoke-direct {v3, v5, v4, v2}, Lta;-><init>(FLg31;Lx01;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-interface {v1, v3}, Lpe0;->c(Lpe0;)Lpe0;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v1

    .line 1182
    invoke-static {}, Lhf;->d()J

    .line 1183
    .line 1184
    .line 1185
    move-result-wide v2

    .line 1186
    const v4, 0x3d8f5c29    # 0.07f

    .line 1187
    .line 1188
    .line 1189
    invoke-static {v4, v2, v3}, Lff;->b(FJ)J

    .line 1190
    .line 1191
    .line 1192
    move-result-wide v2

    .line 1193
    move-object/from16 v4, v16

    .line 1194
    .line 1195
    invoke-static {v1, v2, v3, v4}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    invoke-virtual {v14}, Lpi;->L()Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v2

    .line 1203
    move-object/from16 v3, v73

    .line 1204
    .line 1205
    if-ne v2, v3, :cond_1f

    .line 1206
    .line 1207
    new-instance v2, Lq70;

    .line 1208
    .line 1209
    const/4 v3, 0x5

    .line 1210
    move-object/from16 v4, v50

    .line 1211
    .line 1212
    invoke-direct {v2, v4, v3}, Lq70;-><init>(Loh0;I)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v14, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 1216
    .line 1217
    .line 1218
    goto :goto_1a

    .line 1219
    :cond_1f
    move-object/from16 v4, v50

    .line 1220
    .line 1221
    :goto_1a
    check-cast v2, Lhw;

    .line 1222
    .line 1223
    invoke-static {v1, v2}, Lrd0;->j(Lpe0;Lhw;)Lpe0;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v1

    .line 1227
    invoke-static {v1}, Lrd0;->D(Lpe0;)Lpe0;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v1

    .line 1231
    move-object/from16 v2, v67

    .line 1232
    .line 1233
    const/4 v3, 0x0

    .line 1234
    invoke-static {v2, v14, v3}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v2

    .line 1238
    iget-wide v5, v14, Lpi;->T:J

    .line 1239
    .line 1240
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 1241
    .line 1242
    .line 1243
    move-result v3

    .line 1244
    invoke-virtual {v14}, Lpi;->l()Lfq0;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v5

    .line 1248
    invoke-static {v14, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v1

    .line 1252
    invoke-virtual {v14}, Lpi;->Z()V

    .line 1253
    .line 1254
    .line 1255
    iget-boolean v6, v14, Lpi;->S:Z

    .line 1256
    .line 1257
    if-eqz v6, :cond_20

    .line 1258
    .line 1259
    move-object/from16 v6, p4

    .line 1260
    .line 1261
    invoke-virtual {v14, v6}, Lpi;->k(Lhw;)V

    .line 1262
    .line 1263
    .line 1264
    :goto_1b
    move-object/from16 v7, v68

    .line 1265
    .line 1266
    goto :goto_1c

    .line 1267
    :cond_20
    move-object/from16 v6, p4

    .line 1268
    .line 1269
    invoke-virtual {v14}, Lpi;->j0()V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_1b

    .line 1273
    :goto_1c
    invoke-static {v14, v7, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1274
    .line 1275
    .line 1276
    move-object/from16 v2, v69

    .line 1277
    .line 1278
    invoke-static {v14, v2, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v3

    .line 1285
    move-object/from16 v5, v70

    .line 1286
    .line 1287
    invoke-static {v14, v3, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 1288
    .line 1289
    .line 1290
    move-object/from16 v3, v71

    .line 1291
    .line 1292
    invoke-static {v14, v3}, Lw60;->G(Lji;Lsw;)V

    .line 1293
    .line 1294
    .line 1295
    move-object/from16 v8, p3

    .line 1296
    .line 1297
    invoke-static {v14, v8, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1298
    .line 1299
    .line 1300
    sget-object v1, Lrd0;->a:Lt8;

    .line 1301
    .line 1302
    const/16 v9, 0x30

    .line 1303
    .line 1304
    move-object/from16 v11, v72

    .line 1305
    .line 1306
    invoke-static {v1, v11, v14, v9}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    iget-wide v11, v14, Lpi;->T:J

    .line 1311
    .line 1312
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 1313
    .line 1314
    .line 1315
    move-result v9

    .line 1316
    invoke-virtual {v14}, Lpi;->l()Lfq0;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v11

    .line 1320
    invoke-static {v14, v13}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v12

    .line 1324
    invoke-virtual {v14}, Lpi;->Z()V

    .line 1325
    .line 1326
    .line 1327
    iget-boolean v10, v14, Lpi;->S:Z

    .line 1328
    .line 1329
    if-eqz v10, :cond_21

    .line 1330
    .line 1331
    invoke-virtual {v14, v6}, Lpi;->k(Lhw;)V

    .line 1332
    .line 1333
    .line 1334
    goto :goto_1d

    .line 1335
    :cond_21
    invoke-virtual {v14}, Lpi;->j0()V

    .line 1336
    .line 1337
    .line 1338
    :goto_1d
    invoke-static {v14, v7, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    invoke-static {v14, v2, v11}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1342
    .line 1343
    .line 1344
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v1

    .line 1348
    invoke-static {v14, v1, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 1349
    .line 1350
    .line 1351
    invoke-static {v14, v3}, Lw60;->G(Lji;Lsw;)V

    .line 1352
    .line 1353
    .line 1354
    invoke-static {v14, v8, v12}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    const/16 v1, 0x12

    .line 1358
    .line 1359
    invoke-static {v1}, Lj50;->q(I)J

    .line 1360
    .line 1361
    .line 1362
    move-result-wide v20

    .line 1363
    const/16 v36, 0x0

    .line 1364
    .line 1365
    const v37, 0x3ffee

    .line 1366
    .line 1367
    .line 1368
    const-string v16, "\u26a0\ufe0f"

    .line 1369
    .line 1370
    const/16 v17, 0x0

    .line 1371
    .line 1372
    const-wide/16 v18, 0x0

    .line 1373
    .line 1374
    const/16 v22, 0x0

    .line 1375
    .line 1376
    const/16 v23, 0x0

    .line 1377
    .line 1378
    const-wide/16 v24, 0x0

    .line 1379
    .line 1380
    const/16 v26, 0x0

    .line 1381
    .line 1382
    const-wide/16 v27, 0x0

    .line 1383
    .line 1384
    const/16 v29, 0x0

    .line 1385
    .line 1386
    const/16 v30, 0x0

    .line 1387
    .line 1388
    const/16 v31, 0x0

    .line 1389
    .line 1390
    const/16 v32, 0x0

    .line 1391
    .line 1392
    const/16 v33, 0x0

    .line 1393
    .line 1394
    const/16 v35, 0x6006

    .line 1395
    .line 1396
    move-object/from16 v34, v14

    .line 1397
    .line 1398
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 1399
    .line 1400
    .line 1401
    move-object/from16 v8, v34

    .line 1402
    .line 1403
    invoke-static/range {v39 .. v39}, Ls11;->e(F)Lpe0;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v1

    .line 1407
    invoke-static {v8, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-static/range {v38 .. v38}, Lj50;->q(I)J

    .line 1411
    .line 1412
    .line 1413
    move-result-wide v20

    .line 1414
    invoke-static {}, Lhf;->d()J

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v18

    .line 1418
    new-instance v1, Ls60;

    .line 1419
    .line 1420
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1421
    .line 1422
    const/4 v10, 0x1

    .line 1423
    invoke-direct {v1, v2, v10}, Ls60;-><init>(FZ)V

    .line 1424
    .line 1425
    .line 1426
    const v37, 0x3ffa8

    .line 1427
    .line 1428
    .line 1429
    const-string v16, "\u514d\u8d23\u58f0\u660e"

    .line 1430
    .line 1431
    const v35, 0x186006

    .line 1432
    .line 1433
    .line 1434
    move-object/from16 v17, v1

    .line 1435
    .line 1436
    move-object/from16 v22, v56

    .line 1437
    .line 1438
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 1439
    .line 1440
    .line 1441
    invoke-static {v4}, Lzc0;->h0(Loh0;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v1

    .line 1445
    if-eqz v1, :cond_22

    .line 1446
    .line 1447
    const-string v1, "\u25b2"

    .line 1448
    .line 1449
    :goto_1e
    move-object/from16 v16, v1

    .line 1450
    .line 1451
    goto :goto_1f

    .line 1452
    :cond_22
    const-string v1, "\u25bc"

    .line 1453
    .line 1454
    goto :goto_1e

    .line 1455
    :goto_1f
    const/16 v1, 0xe

    .line 1456
    .line 1457
    invoke-static {v1}, Lj50;->q(I)J

    .line 1458
    .line 1459
    .line 1460
    move-result-wide v20

    .line 1461
    invoke-static {}, Lhf;->d()J

    .line 1462
    .line 1463
    .line 1464
    move-result-wide v1

    .line 1465
    const v3, 0x3f19999a    # 0.6f

    .line 1466
    .line 1467
    .line 1468
    invoke-static {v3, v1, v2}, Lff;->b(FJ)J

    .line 1469
    .line 1470
    .line 1471
    move-result-wide v18

    .line 1472
    const/16 v36, 0x0

    .line 1473
    .line 1474
    const v37, 0x3ffea

    .line 1475
    .line 1476
    .line 1477
    const/16 v17, 0x0

    .line 1478
    .line 1479
    const/16 v22, 0x0

    .line 1480
    .line 1481
    const/16 v23, 0x0

    .line 1482
    .line 1483
    const-wide/16 v24, 0x0

    .line 1484
    .line 1485
    const/16 v26, 0x0

    .line 1486
    .line 1487
    const-wide/16 v27, 0x0

    .line 1488
    .line 1489
    const/16 v29, 0x0

    .line 1490
    .line 1491
    const/16 v30, 0x0

    .line 1492
    .line 1493
    const/16 v31, 0x0

    .line 1494
    .line 1495
    const/16 v32, 0x0

    .line 1496
    .line 1497
    const/16 v33, 0x0

    .line 1498
    .line 1499
    const/16 v35, 0x6000

    .line 1500
    .line 1501
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 1502
    .line 1503
    .line 1504
    move-object/from16 v8, v34

    .line 1505
    .line 1506
    invoke-virtual {v8, v10}, Lpi;->p(Z)V

    .line 1507
    .line 1508
    .line 1509
    invoke-static {v4}, Lzc0;->h0(Loh0;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v2

    .line 1513
    invoke-static {}, Lrs;->a()Lvs;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v4

    .line 1517
    invoke-static {}, Lrs;->b()Ljt;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v5

    .line 1521
    sget-object v1, Loh;->a:Loh;

    .line 1522
    .line 1523
    invoke-virtual {v1}, Loh;->r()Lxw;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v7

    .line 1527
    const v9, 0x186c06

    .line 1528
    .line 1529
    .line 1530
    sget-object v1, Lxf;->a:Lxf;

    .line 1531
    .line 1532
    const/4 v3, 0x0

    .line 1533
    const/4 v6, 0x0

    .line 1534
    invoke-static/range {v1 .. v9}, Lo30;->b(Lwf;ZLpe0;Lvs;Ljt;Ljava/lang/String;Lxw;Lji;I)V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v8, v10}, Lpi;->p(Z)V

    .line 1538
    .line 1539
    .line 1540
    invoke-static {v15, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v1

    .line 1544
    invoke-static {v8, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 1545
    .line 1546
    .line 1547
    new-instance v1, Lgc0;

    .line 1548
    .line 1549
    move-object/from16 v3, v65

    .line 1550
    .line 1551
    invoke-direct {v1, v3, v10}, Lgc0;-><init>(Loh0;I)V

    .line 1552
    .line 1553
    .line 1554
    const v2, 0x16e6971c

    .line 1555
    .line 1556
    .line 1557
    invoke-static {v2, v1, v8}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v1

    .line 1561
    const/4 v2, 0x6

    .line 1562
    invoke-static {v1, v8, v2}, Lzc0;->M0(Lww;Lji;I)V

    .line 1563
    .line 1564
    .line 1565
    invoke-static {v15, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v1

    .line 1569
    invoke-static {v8, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 1570
    .line 1571
    .line 1572
    new-instance v1, Lwc0;

    .line 1573
    .line 1574
    move/from16 v3, p1

    .line 1575
    .line 1576
    move-object/from16 v14, p2

    .line 1577
    .line 1578
    invoke-direct {v1, v14, v3}, Lwc0;-><init>(Lsw;Z)V

    .line 1579
    .line 1580
    .line 1581
    const v4, 0x212d6b9d

    .line 1582
    .line 1583
    .line 1584
    invoke-static {v4, v1, v8}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v1

    .line 1588
    invoke-static {v1, v8, v2}, Lzc0;->M0(Lww;Lji;I)V

    .line 1589
    .line 1590
    .line 1591
    invoke-static {v15, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v0

    .line 1595
    invoke-static {v8, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 1596
    .line 1597
    .line 1598
    new-instance v0, Lnc0;

    .line 1599
    .line 1600
    move-object/from16 v1, v62

    .line 1601
    .line 1602
    move/from16 v4, v63

    .line 1603
    .line 1604
    move-object/from16 v5, v64

    .line 1605
    .line 1606
    invoke-direct {v0, v4, v10, v5, v1}, Lnc0;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 1607
    .line 1608
    .line 1609
    const v1, 0x2b74401e

    .line 1610
    .line 1611
    .line 1612
    invoke-static {v1, v0, v8}, Lkl;->w(ILex;Lji;)Lmh;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v0

    .line 1616
    invoke-static {v0, v8, v2}, Lzc0;->M0(Lww;Lji;I)V

    .line 1617
    .line 1618
    .line 1619
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1620
    .line 1621
    invoke-static {v15, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v0

    .line 1625
    invoke-static {v8, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 1626
    .line 1627
    .line 1628
    invoke-static/range {v61 .. v61}, Lj50;->q(I)J

    .line 1629
    .line 1630
    .line 1631
    move-result-wide v20

    .line 1632
    move-object/from16 v0, v66

    .line 1633
    .line 1634
    invoke-virtual {v8, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    check-cast v1, Llf;

    .line 1639
    .line 1640
    iget-wide v1, v1, Llf;->s:J

    .line 1641
    .line 1642
    new-instance v4, Lr61;

    .line 1643
    .line 1644
    const/4 v6, 0x3

    .line 1645
    invoke-direct {v4, v6}, Lr61;-><init>(I)V

    .line 1646
    .line 1647
    .line 1648
    const v37, 0x3fbe8

    .line 1649
    .line 1650
    .line 1651
    const-string v16, "by \u5c0f\u6865\uff08@ANJAO2024\uff09"

    .line 1652
    .line 1653
    const/16 v35, 0x6036

    .line 1654
    .line 1655
    move-wide/from16 v18, v1

    .line 1656
    .line 1657
    move-object/from16 v26, v4

    .line 1658
    .line 1659
    move-object/from16 v17, v13

    .line 1660
    .line 1661
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 1662
    .line 1663
    .line 1664
    const/high16 v1, 0x40800000    # 4.0f

    .line 1665
    .line 1666
    invoke-static {v15, v1}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    invoke-static {v8, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 1671
    .line 1672
    .line 1673
    invoke-static/range {v42 .. v42}, Lj50;->q(I)J

    .line 1674
    .line 1675
    .line 1676
    move-result-wide v20

    .line 1677
    invoke-virtual {v8, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    check-cast v0, Llf;

    .line 1682
    .line 1683
    iget-wide v0, v0, Llf;->s:J

    .line 1684
    .line 1685
    const/high16 v2, 0x3f000000    # 0.5f

    .line 1686
    .line 1687
    invoke-static {v2, v0, v1}, Lff;->b(FJ)J

    .line 1688
    .line 1689
    .line 1690
    move-result-wide v18

    .line 1691
    new-instance v0, Lr61;

    .line 1692
    .line 1693
    invoke-direct {v0, v6}, Lr61;-><init>(I)V

    .line 1694
    .line 1695
    .line 1696
    const-string v16, "\u4ec5\u4f9b\u4e2a\u4eba\u5b66\u4e60\u7814\u7a76\u4f7f\u7528"

    .line 1697
    .line 1698
    move-object/from16 v26, v0

    .line 1699
    .line 1700
    invoke-static/range {v16 .. v37}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 1701
    .line 1702
    .line 1703
    const/high16 v0, 0x41800000    # 16.0f

    .line 1704
    .line 1705
    invoke-static {v15, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v0

    .line 1709
    invoke-static {v8, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 1710
    .line 1711
    .line 1712
    invoke-virtual {v8, v10}, Lpi;->p(Z)V

    .line 1713
    .line 1714
    .line 1715
    move-object/from16 v4, v52

    .line 1716
    .line 1717
    goto :goto_20

    .line 1718
    :cond_23
    move v3, v13

    .line 1719
    invoke-virtual {v8}, Lpi;->R()V

    .line 1720
    .line 1721
    .line 1722
    move-object v4, v6

    .line 1723
    :goto_20
    invoke-virtual {v8}, Lpi;->r()Lht0;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v7

    .line 1727
    if-eqz v7, :cond_24

    .line 1728
    .line 1729
    new-instance v0, Lxc0;

    .line 1730
    .line 1731
    move-object/from16 v1, p0

    .line 1732
    .line 1733
    move/from16 v5, p5

    .line 1734
    .line 1735
    move/from16 v6, p6

    .line 1736
    .line 1737
    move v2, v3

    .line 1738
    move-object v3, v14

    .line 1739
    invoke-direct/range {v0 .. v6}, Lxc0;-><init>(Llf1;ZLsw;Lpe0;II)V

    .line 1740
    .line 1741
    .line 1742
    iput-object v0, v7, Lht0;->d:Lww;

    .line 1743
    .line 1744
    :cond_24
    return-void
.end method

.method public static synthetic h()Lna1;
    .locals 1

    .line 1
    invoke-static {}, Lzc0;->s0()Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final h0(Loh0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static synthetic i(Lww;ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lzc0;->O0(Lww;ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i0(Loh0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic j(ZLji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->U0(ZLji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final j0(Loh0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static synthetic k(ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->Q(ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k0(Loh0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic l(ILwg0;Llf1;ZLsw;ZLjn0;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lzc0;->D0(ILwg0;Llf1;ZLsw;ZLjn0;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final l0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Llf1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLjava/util/List;Lji;I)Lna1;
    .locals 44

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    sget-object v6, Lrd0;->a:Lt8;

    sget-object v7, Ln2;->o:Lga;

    and-int/lit8 v8, p14, 0x3

    const/4 v9, 0x1

    const/4 v11, 0x2

    if-eq v8, v11, :cond_0

    move v8, v9

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    and-int/lit8 v12, p14, 0x1

    move-object/from16 v13, p13

    check-cast v13, Lpi;

    invoke-virtual {v13, v12, v8}, Lpi;->O(IZ)Z

    move-result v8

    if-eqz v8, :cond_19

    .line 1
    const-string v8, "\u6846\u67b6\u72b6\u6001"

    const/4 v12, 0x0

    const/4 v14, 0x6

    invoke-static {v8, v12, v13, v14, v11}, Lzc0;->P0(Ljava/lang/String;Lpe0;Lji;II)V

    .line 2
    sget-object v8, Lme0;->a:Lme0;

    const/high16 v15, 0x41400000    # 12.0f

    invoke-static {v8, v15}, Ls11;->b(Lpe0;F)Lpe0;

    move-result-object v14

    invoke-static {v13, v14}, Lu50;->c(Lji;Lpe0;)V

    .line 3
    sget-object v14, Ls11;->a:Lrt;

    const/16 v11, 0x30

    .line 4
    invoke-static {v6, v7, v13, v11}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    move-result-object v15

    .line 5
    iget-wide v11, v13, Lpi;->T:J

    .line 6
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    .line 7
    invoke-virtual {v13}, Lpi;->l()Lfq0;

    move-result-object v12

    .line 8
    invoke-static {v13, v14}, Ls91;->E(Lji;Lpe0;)Lpe0;

    move-result-object v9

    .line 9
    sget-object v16, Lfi;->b:Lei;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    sget-object v10, Lei;->b:Lcj;

    .line 11
    invoke-virtual {v13}, Lpi;->Z()V

    move/from16 v16, v11

    .line 12
    iget-boolean v11, v13, Lpi;->S:Z

    if-eqz v11, :cond_1

    .line 13
    invoke-virtual {v13, v10}, Lpi;->k(Lhw;)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v13}, Lpi;->j0()V

    .line 15
    :goto_1
    sget-object v11, Lei;->e:Lm7;

    .line 16
    invoke-static {v13, v11, v15}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 17
    sget-object v15, Lei;->d:Lm7;

    .line 18
    invoke-static {v13, v15, v12}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 19
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v16, v14

    .line 20
    sget-object v14, Lei;->f:Lm7;

    .line 21
    invoke-static {v13, v12, v14}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 22
    sget-object v12, Lei;->g:Lp3;

    .line 23
    invoke-static {v13, v12}, Lw60;->G(Lji;Lsw;)V

    move-object/from16 v17, v14

    .line 24
    sget-object v14, Lei;->c:Lm7;

    .line 25
    invoke-static {v13, v14, v9}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    if-eqz p0, :cond_2

    .line 26
    invoke-static {}, Lrd0;->t()Lr00;

    move-result-object v9

    goto :goto_2

    :cond_2
    invoke-static {}, Lr60;->r()Lr00;

    move-result-object v9

    :goto_2
    const-wide v35, 0xffff9800L

    const-wide v37, 0xff4caf50L

    if-eqz p0, :cond_3

    .line 27
    invoke-static/range {v37 .. v38}, Lp30;->c(J)J

    move-result-wide v18

    :goto_3
    move-object/from16 v20, v9

    goto :goto_4

    :cond_3
    invoke-static/range {v35 .. v36}, Lp30;->c(J)J

    move-result-wide v18

    goto :goto_3

    :goto_4
    const/high16 v9, 0x42000000    # 32.0f

    .line 28
    invoke-static {v8, v9}, Ls11;->c(Lpe0;F)Lpe0;

    move-result-object v9

    move-object/from16 v21, v17

    move-wide/from16 v42, v18

    move-object/from16 v18, v16

    move-wide/from16 v16, v42

    const/16 v19, 0x1b0

    move-object/from16 v31, v13

    move-object/from16 v13, v20

    const/16 v20, 0x0

    move-object/from16 v22, v14

    const/4 v14, 0x0

    move-object/from16 p13, v15

    move-object v15, v9

    move-object/from16 v9, p13

    move-object/from16 v39, v6

    move-object/from16 v40, v7

    move-object/from16 p13, v18

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move-object/from16 v18, v31

    const/high16 p14, 0x41400000    # 12.0f

    const/4 v5, 0x6

    .line 29
    invoke-static/range {v13 .. v20}, Loz;->a(Lr00;Ljava/lang/String;Lpe0;JLji;II)V

    move-object/from16 v13, v18

    .line 30
    invoke-static/range {p14 .. p14}, Ls11;->e(F)Lpe0;

    move-result-object v14

    invoke-static {v13, v14}, Lu50;->c(Lji;Lpe0;)V

    .line 31
    sget-object v14, Ln2;->q:Lfa;

    const/4 v15, 0x0

    .line 32
    invoke-static {v14, v13, v15}, Ltf;->a(Lfa;Lji;I)Lvf;

    move-result-object v14

    move-object/from16 v41, v6

    .line 33
    iget-wide v5, v13, Lpi;->T:J

    .line 34
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    .line 35
    invoke-virtual {v13}, Lpi;->l()Lfq0;

    move-result-object v6

    .line 36
    invoke-static {v13, v8}, Ls91;->E(Lji;Lpe0;)Lpe0;

    move-result-object v15

    .line 37
    invoke-virtual {v13}, Lpi;->Z()V

    move/from16 v16, v5

    .line 38
    iget-boolean v5, v13, Lpi;->S:Z

    if-eqz v5, :cond_4

    .line 39
    invoke-virtual {v13, v10}, Lpi;->k(Lhw;)V

    goto :goto_5

    .line 40
    :cond_4
    invoke-virtual {v13}, Lpi;->j0()V

    .line 41
    :goto_5
    invoke-static {v13, v11, v14}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 42
    invoke-static {v13, v9, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 43
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v6, v41

    invoke-static {v13, v5, v6}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 44
    invoke-static {v13, v12}, Lw60;->G(Lji;Lsw;)V

    .line 45
    invoke-static {v13, v7, v15}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    if-eqz p0, :cond_5

    .line 46
    const-string v5, "\u6a21\u5757\u5df2\u6fc0\u6d3b"

    goto :goto_6

    :cond_5
    const-string v5, "\u6a21\u5757\u672a\u6fc0\u6d3b"

    :goto_6
    const/16 v14, 0x10

    .line 47
    invoke-static {v14}, Lj50;->q(I)J

    move-result-wide v17

    .line 48
    sget-object v19, Lzv;->i:Lzv;

    if-eqz p0, :cond_6

    .line 49
    invoke-static/range {v37 .. v38}, Lp30;->c(J)J

    move-result-wide v14

    :goto_7
    move-wide v15, v14

    goto :goto_8

    :cond_6
    invoke-static/range {v35 .. v36}, Lp30;->c(J)J

    move-result-wide v14

    goto :goto_7

    :goto_8
    const/16 v33, 0x0

    const v34, 0x3ffaa

    const/4 v14, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v32, 0x186000

    move-object/from16 v31, v13

    move-object v13, v5

    .line 50
    invoke-static/range {v13 .. v34}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    move-object/from16 v13, v31

    if-eqz p0, :cond_7

    .line 51
    const-string v5, "LSPosed \u6846\u67b6\u5df2\u6210\u529f\u8fde\u63a5"

    goto :goto_9

    :cond_7
    const-string v5, "\u8bf7\u786e\u4fdd LSPosed \u6846\u67b6\u5df2\u5b89\u88c5\u5e76\u5728\u7ba1\u7406\u5668\u6fc0\u6d3b\u6a21\u5757"

    :goto_9
    const/16 v14, 0xc

    .line 52
    invoke-static {v14}, Lj50;->q(I)J

    move-result-wide v17

    .line 53
    sget-object v14, Lnf;->a:Lg41;

    .line 54
    invoke-virtual {v13, v14}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v15

    .line 55
    check-cast v15, Llf;

    move-object/from16 v31, v13

    move-object/from16 v16, v14

    .line 56
    iget-wide v13, v15, Llf;->s:J

    const/16 v33, 0x0

    const v34, 0x3ffea

    move-wide/from16 v42, v13

    move-object/from16 v13, v16

    move-wide/from16 v15, v42

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x6000

    move-object/from16 v42, v13

    move-object v13, v5

    move-object/from16 v5, v42

    .line 57
    invoke-static/range {v13 .. v34}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    move-object/from16 v13, v31

    const/4 v14, 0x1

    .line 58
    invoke-virtual {v13, v14}, Lpi;->p(Z)V

    .line 59
    invoke-virtual {v13, v14}, Lpi;->p(Z)V

    if-eqz p0, :cond_18

    const v15, -0x16456383

    .line 60
    invoke-virtual {v13, v15}, Lpi;->W(I)V

    move/from16 v15, p14

    .line 61
    invoke-static {v8, v15}, Ls11;->b(Lpe0;F)Lpe0;

    move-result-object v14

    invoke-static {v13, v14}, Lu50;->c(Lji;Lpe0;)V

    .line 62
    invoke-virtual {v13, v5}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v5

    .line 63
    check-cast v5, Llf;

    move-object/from16 v31, v13

    .line 64
    iget-wide v13, v5, Llf;->r:J

    const/16 v18, 0x0

    const/16 v19, 0x3

    move v5, v15

    move-wide v15, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v31

    .line 65
    invoke-static/range {v13 .. v19}, Lkl;->c(Lpe0;FJLji;II)V

    move-object/from16 v13, v17

    .line 66
    invoke-static {v8, v5}, Ls11;->b(Lpe0;F)Lpe0;

    move-result-object v5

    invoke-static {v13, v5}, Lu50;->c(Lji;Lpe0;)V

    .line 67
    new-instance v5, Luo0;

    const-string v14, "\u6846\u67b6\u540d\u79f0"

    move-object/from16 v15, p1

    invoke-direct {v5, v14, v15}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    new-instance v14, Luo0;

    const-string v15, "\u6846\u67b6\u7248\u672c"

    move-object/from16 v41, v8

    move-object/from16 v8, p2

    invoke-direct {v14, v15, v8}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    new-instance v8, Luo0;

    const-string v15, "API \u7248\u672c"

    move-object/from16 v22, v7

    move-object/from16 v7, p3

    invoke-direct {v8, v15, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    invoke-virtual/range {p4 .. p4}, Llf1;->a()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    cmp-long v7, v15, v17

    if-lez v7, :cond_8

    invoke-virtual/range {p4 .. p4}, Llf1;->a()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    goto :goto_a

    :cond_8
    const-string v7, "-"

    .line 71
    :goto_a
    new-instance v15, Luo0;

    move-object/from16 v16, v12

    const-string v12, "\u5185\u90e8\u7248\u672c"

    invoke-direct {v15, v12, v7}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v7, p4

    .line 72
    :try_start_0
    iget-object v7, v7, Llf1;->a:Llz;

    check-cast v7, Ljz;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v12

    move-object/from16 v21, v6

    .line 74
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v19, v9

    .line 75
    :try_start_1
    const-string v9, "io.github.libxposed.service.IXposedService"

    invoke-virtual {v12, v9}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 76
    iget-object v7, v7, Ljz;->a:Landroid/os/IBinder;

    move-object/from16 v20, v11

    const/4 v9, 0x6

    const/4 v11, 0x0

    invoke-interface {v7, v9, v12, v6, v11}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 77
    invoke-virtual {v6}, Landroid/os/Parcel;->readException()V

    .line 78
    invoke-virtual {v6}, Landroid/os/Parcel;->readLong()J

    move-result-wide v23
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    :try_start_2
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 80
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    const-wide/16 v6, 0x4

    and-long v6, v23, v6

    cmp-long v6, v6, v17

    if-eqz v6, :cond_9

    .line 81
    const-string v6, "\u5df2\u542f\u7528"

    goto :goto_b

    :cond_9
    const-string v6, "\u672a\u542f\u7528"

    .line 82
    :goto_b
    new-instance v7, Luo0;

    const-string v9, "API\u4fdd\u62a4"

    invoke-direct {v7, v9, v6}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    filled-new-array {v5, v14, v8, v15, v7}, [Luo0;

    move-result-object v5

    .line 84
    invoke-static {v5}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 85
    invoke-static {v5}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 86
    const-string v6, "CPU \u67b6\u6784"

    const-string v7, "SDK"

    const-string v8, "Android "

    const-string v9, "\u7cfb\u7edf\u7248\u672c"

    if-eqz v0, :cond_a

    .line 87
    new-instance v11, Luo0;

    const-string v12, "\u8bbe\u5907\u540d\u79f0"

    invoke-direct {v11, v12, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    new-instance v0, Luo0;

    const-string v12, "\u8bbe\u5907\u4ee3\u53f7"

    invoke-direct {v0, v12, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 90
    new-instance v2, Luo0;

    invoke-direct {v2, v9, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    new-instance v1, Luo0;

    invoke-direct {v1, v7, v3}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    new-instance v3, Luo0;

    invoke-direct {v3, v6, v4}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    filled-new-array {v11, v0, v2, v1, v3}, [Luo0;

    move-result-object v0

    .line 94
    invoke-static {v0}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 95
    invoke-static {v0}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_c

    .line 96
    :cond_a
    new-instance v0, Luo0;

    const-string v11, "\u8bbe\u5907"

    invoke-direct {v0, v11, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 98
    new-instance v2, Luo0;

    invoke-direct {v2, v9, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    new-instance v1, Luo0;

    invoke-direct {v1, v7, v3}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    new-instance v3, Luo0;

    invoke-direct {v3, v6, v4}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    filled-new-array {v0, v2, v1, v3}, [Luo0;

    move-result-object v0

    .line 102
    invoke-static {v0}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 103
    invoke-static {v0}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 104
    :goto_c
    invoke-static {v5, v0}, Lye;->S(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 106
    invoke-static {v13}, Le90;->a(Lji;)Lc90;

    move-result-object v2

    .line 107
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v3

    .line 108
    sget-object v4, Lii;->a:Lr3;

    if-ne v3, v4, :cond_b

    .line 109
    new-instance v3, Ldp0;

    const/4 v11, 0x0

    invoke-direct {v3, v11}, Ldp0;-><init>(I)V

    .line 110
    invoke-virtual {v13, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 111
    :cond_b
    check-cast v3, Lwg0;

    .line 112
    iget-object v5, v2, Lc90;->e:Lfe;

    .line 113
    iget-object v5, v5, Lfe;->b:Ljava/lang/Object;

    check-cast v5, Ldp0;

    .line 114
    invoke-virtual {v5}, Ldp0;->g()I

    move-result v5

    .line 115
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v13, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v6

    .line 116
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_c

    if-ne v7, v4, :cond_d

    .line 117
    :cond_c
    new-instance v7, Lzc0$b;

    const/4 v6, 0x0

    invoke-direct {v7, v2, v3, v6}, Lzc0$b;-><init>(Lc90;Lwg0;Lik;)V

    .line 118
    invoke-virtual {v13, v7}, Lpi;->g0(Ljava/lang/Object;)V

    .line 119
    :cond_d
    check-cast v7, Lww;

    invoke-static {v13, v7, v5}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 120
    invoke-static {v2, v13}, Lu50;->w(Lc90;Lpi;)Lf21;

    move-result-object v5

    .line 121
    invoke-virtual {v13, v1}, Lpi;->d(I)Z

    move-result v6

    invoke-virtual {v13, v0}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    move-object/from16 v7, p10

    invoke-virtual {v13, v7}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    .line 122
    invoke-virtual {v13}, Lpi;->L()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_e

    if-ne v8, v4, :cond_f

    .line 123
    :cond_e
    new-instance v8, Lmc0;

    invoke-direct {v8, v1, v0, v7}, Lmc0;-><init>(ILjava/util/ArrayList;Landroid/content/Context;)V

    .line 124
    invoke-virtual {v13, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 125
    :cond_f
    check-cast v8, Lsw;

    const v0, 0xc00006

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 p0, p13

    move/from16 p9, v0

    move-object/from16 p1, v2

    move-object/from16 p2, v4

    move-object/from16 p5, v5

    move-object/from16 p3, v6

    move-object/from16 p4, v7

    move-object/from16 p7, v8

    move-object/from16 p6, v9

    move-object/from16 p8, v13

    .line 126
    invoke-static/range {p0 .. p9}, Lw60;->a(Lpe0;Lc90;Ljn0;Lu8;Lga;Lyt;Lj5;Lsw;Lji;I)V

    move-object/from16 v0, p0

    const v2, 0x3ecccccd    # 0.4f

    const/16 v4, 0xa

    const/4 v5, 0x3

    const/4 v14, 0x1

    if-le v1, v14, :cond_14

    const v6, -0x1605077f

    .line 127
    invoke-virtual {v13, v6}, Lpi;->W(I)V

    const/high16 v6, 0x40c00000    # 6.0f

    .line 128
    invoke-static {v0, v6}, Lrd0;->G(Lpe0;F)Lpe0;

    move-result-object v0

    .line 129
    sget-object v6, Lrd0;->c:Lr3;

    .line 130
    sget-object v7, Ln2;->n:Lga;

    const/4 v9, 0x6

    .line 131
    invoke-static {v6, v7, v13, v9}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    move-result-object v6

    .line 132
    iget-wide v7, v13, Lpi;->T:J

    .line 133
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    .line 134
    invoke-virtual {v13}, Lpi;->l()Lfq0;

    move-result-object v8

    .line 135
    invoke-static {v13, v0}, Ls91;->E(Lji;Lpe0;)Lpe0;

    move-result-object v0

    .line 136
    invoke-virtual {v13}, Lpi;->Z()V

    .line 137
    iget-boolean v9, v13, Lpi;->S:Z

    if-eqz v9, :cond_10

    .line 138
    invoke-virtual {v13, v10}, Lpi;->k(Lhw;)V

    :goto_d
    move-object/from16 v9, v20

    goto :goto_e

    .line 139
    :cond_10
    invoke-virtual {v13}, Lpi;->j0()V

    goto :goto_d

    .line 140
    :goto_e
    invoke-static {v13, v9, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    move-object/from16 v9, v19

    .line 141
    invoke-static {v13, v9, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 142
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v7, v21

    invoke-static {v13, v6, v7}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    move-object/from16 v6, v16

    .line 143
    invoke-static {v13, v6}, Lw60;->G(Lji;Lsw;)V

    move-object/from16 v7, v22

    .line 144
    invoke-static {v13, v7, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    const v0, -0xe90fc96

    .line 145
    invoke-virtual {v13, v0}, Lpi;->W(I)V

    const/4 v0, 0x0

    :goto_f
    if-ge v0, v1, :cond_13

    const/high16 v6, 0x40400000    # 3.0f

    const/4 v7, 0x0

    move-object/from16 v8, v41

    const/4 v9, 0x2

    .line 146
    invoke-static {v8, v6, v7, v9}, Lrd0;->F(Lpe0;FFI)Lpe0;

    move-result-object v6

    .line 147
    invoke-static {v3}, Lzc0;->m0(Lwg0;)I

    move-result v7

    if-ne v0, v7, :cond_11

    const/high16 v7, 0x40e00000    # 7.0f

    goto :goto_10

    :cond_11
    const/high16 v7, 0x40a00000    # 5.0f

    :goto_10
    invoke-static {v6, v7}, Ls11;->c(Lpe0;F)Lpe0;

    move-result-object v6

    .line 148
    sget-object v7, Lew0;->a:Ldw0;

    const v10, 0x7e7ff

    .line 149
    invoke-static {v6, v7, v10}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    move-result-object v6

    .line 150
    invoke-static {v3}, Lzc0;->m0(Lwg0;)I

    move-result v7

    invoke-static {}, Lhf;->d()J

    move-result-wide v10

    if-ne v0, v7, :cond_12

    goto :goto_11

    :cond_12
    const/high16 v7, 0x3e800000    # 0.25f

    invoke-static {v7, v10, v11}, Lff;->b(FJ)J

    move-result-wide v10

    .line 151
    :goto_11
    sget-object v7, Lpf1;->i:Lfz;

    invoke-static {v6, v10, v11, v7}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    move-result-object v6

    const/4 v11, 0x0

    .line 152
    invoke-static {v6, v13, v11}, Lza;->a(Lpe0;Lji;I)V

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v41, v8

    goto :goto_f

    :cond_13
    move-object/from16 v8, v41

    const/4 v11, 0x0

    .line 153
    invoke-virtual {v13, v11}, Lpi;->p(Z)V

    const/4 v14, 0x1

    .line 154
    invoke-virtual {v13, v14}, Lpi;->p(Z)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 155
    invoke-static {v8, v0}, Ls11;->b(Lpe0;F)Lpe0;

    move-result-object v0

    invoke-static {v13, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 156
    invoke-static {v4}, Lj50;->q(I)J

    move-result-wide v17

    .line 157
    sget-object v0, Lnf;->a:Lg41;

    .line 158
    invoke-virtual {v13, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v0

    .line 159
    check-cast v0, Llf;

    .line 160
    iget-wide v0, v0, Llf;->s:J

    .line 161
    invoke-static {v2, v0, v1}, Lff;->b(FJ)J

    move-result-wide v15

    .line 162
    sget-object v14, Ls11;->a:Lrt;

    .line 163
    new-instance v0, Lr61;

    invoke-direct {v0, v5}, Lr61;-><init>(I)V

    const/16 v33, 0x0

    const v34, 0x3fbe8

    move-object/from16 v31, v13

    .line 164
    const-string v13, "\u2190 \u5de6\u53f3\u6ed1\u52a8\u67e5\u770b\u66f4\u591a \u2192"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x6036

    move-object/from16 v23, v0

    invoke-static/range {v13 .. v34}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    move-object/from16 v13, v31

    const/4 v11, 0x0

    .line 165
    :goto_12
    invoke-virtual {v13, v11}, Lpi;->p(Z)V

    goto :goto_13

    :cond_14
    move-object/from16 v8, v41

    const v0, -0x171c7b43

    const/4 v11, 0x0

    .line 166
    invoke-virtual {v13, v0}, Lpi;->W(I)V

    goto :goto_12

    .line 167
    :goto_13
    invoke-static {v4}, Lj50;->q(I)J

    move-result-wide v17

    .line 168
    sget-object v0, Lnf;->a:Lg41;

    .line 169
    invoke-virtual {v13, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v1

    .line 170
    check-cast v1, Llf;

    .line 171
    iget-wide v3, v1, Llf;->s:J

    .line 172
    invoke-static {v2, v3, v4}, Lff;->b(FJ)J

    move-result-wide v15

    .line 173
    sget-object v14, Ls11;->a:Lrt;

    .line 174
    new-instance v1, Lr61;

    invoke-direct {v1, v5}, Lr61;-><init>(I)V

    const/16 v33, 0x0

    const v34, 0x3fbe8

    move-object/from16 v31, v13

    .line 175
    const-string v13, "\u957f\u6309\u4fe1\u606f\u533a\u57df\u53ef\u590d\u5236\u5f53\u524d\u663e\u793a\u7684\u5168\u90e8\u4fe1\u606f"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x6036

    move-object/from16 v23, v1

    invoke-static/range {v13 .. v34}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    move-object/from16 v13, v31

    const/high16 v1, 0x41000000    # 8.0f

    .line 176
    invoke-static {v8, v1}, Ls11;->b(Lpe0;F)Lpe0;

    move-result-object v2

    invoke-static {v13, v2}, Lu50;->c(Lji;Lpe0;)V

    move-object/from16 v2, v39

    move-object/from16 v3, v40

    const/16 v4, 0x30

    .line 177
    invoke-static {v2, v3, v13, v4}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    move-result-object v2

    .line 178
    iget-wide v3, v13, Lpi;->T:J

    .line 179
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    .line 180
    invoke-virtual {v13}, Lpi;->l()Lfq0;

    move-result-object v4

    .line 181
    invoke-static {v13, v14}, Ls91;->E(Lji;Lpe0;)Lpe0;

    move-result-object v5

    .line 182
    sget-object v6, Lfi;->b:Lei;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    sget-object v6, Lei;->b:Lcj;

    .line 184
    invoke-virtual {v13}, Lpi;->Z()V

    .line 185
    iget-boolean v7, v13, Lpi;->S:Z

    if-eqz v7, :cond_15

    .line 186
    invoke-virtual {v13, v6}, Lpi;->k(Lhw;)V

    goto :goto_14

    .line 187
    :cond_15
    invoke-virtual {v13}, Lpi;->j0()V

    .line 188
    :goto_14
    sget-object v6, Lei;->e:Lm7;

    .line 189
    invoke-static {v13, v6, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 190
    sget-object v2, Lei;->d:Lm7;

    .line 191
    invoke-static {v13, v2, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 192
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 193
    sget-object v3, Lei;->f:Lm7;

    .line 194
    invoke-static {v13, v2, v3}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 195
    sget-object v2, Lei;->g:Lp3;

    .line 196
    invoke-static {v13, v2}, Lw60;->G(Lji;Lsw;)V

    .line 197
    sget-object v2, Lei;->c:Lm7;

    .line 198
    invoke-static {v13, v2, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    if-eqz p11, :cond_16

    .line 199
    invoke-static {}, Lrd0;->t()Lr00;

    move-result-object v2

    goto :goto_15

    :cond_16
    invoke-static {}, Lr60;->r()Lr00;

    move-result-object v2

    :goto_15
    if-eqz p11, :cond_17

    .line 200
    invoke-static/range {v37 .. v38}, Lp30;->c(J)J

    move-result-wide v3

    goto :goto_16

    :cond_17
    invoke-static/range {v35 .. v36}, Lp30;->c(J)J

    move-result-wide v3

    :goto_16
    const/high16 v5, 0x41a00000    # 20.0f

    .line 201
    invoke-static {v8, v5}, Ls11;->c(Lpe0;F)Lpe0;

    move-result-object v5

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p0, v2

    move-wide/from16 p3, v3

    move-object/from16 p2, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p1, v8

    move-object/from16 p5, v13

    .line 202
    invoke-static/range {p0 .. p7}, Loz;->a(Lr00;Ljava/lang/String;Lpe0;JLji;II)V

    .line 203
    invoke-static {v1}, Ls11;->e(F)Lpe0;

    move-result-object v1

    invoke-static {v13, v1}, Lu50;->c(Lji;Lpe0;)V

    .line 204
    invoke-interface/range {p12 .. p12}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x3e

    const-string v4, ", "

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 p0, p12

    move-object/from16 p4, v2

    move/from16 p5, v3

    move-object/from16 p1, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    invoke-static/range {p0 .. p5}, Lye;->O(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsw;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\u4f5c\u7528\u57df("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xd

    .line 205
    invoke-static {v2}, Lj50;->q(I)J

    move-result-wide v17

    .line 206
    invoke-virtual {v13, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v0

    .line 207
    check-cast v0, Llf;

    .line 208
    iget-wide v2, v0, Llf;->q:J

    const/16 v33, 0x0

    const v34, 0x3ffea

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x6000

    move-wide v15, v2

    move-object/from16 v31, v13

    move-object v13, v1

    .line 209
    invoke-static/range {v13 .. v34}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    move-object/from16 v13, v31

    const/4 v14, 0x1

    .line 210
    invoke-virtual {v13, v14}, Lpi;->p(Z)V

    :goto_17
    const/4 v11, 0x0

    .line 211
    invoke-virtual {v13, v11}, Lpi;->p(Z)V

    goto :goto_18

    :catchall_0
    move-exception v0

    .line 212
    :try_start_3
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 213
    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    .line 214
    throw v0
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    .line 215
    new-instance v1, Lsg;

    invoke-direct {v1, v0}, Lsg;-><init>(Landroid/os/RemoteException;)V

    throw v1

    :cond_18
    const v0, -0x171c7b43

    .line 216
    invoke-virtual {v13, v0}, Lpi;->W(I)V

    goto :goto_17

    .line 217
    :cond_19
    invoke-virtual {v13}, Lpi;->R()V

    .line 218
    :goto_18
    sget-object v0, Lna1;->a:Lna1;

    return-object v0
.end method

.method public static synthetic m(Lwg0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->K0(Lwg0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final m0(Lwg0;)I
    .locals 0

    .line 1
    check-cast p0, Ldp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldp0;->g()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static synthetic n(Lww;Lwf;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lzc0;->N0(Lww;Lwf;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final n0(Lwg0;I)V
    .locals 0

    .line 1
    check-cast p0, Ldp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldp0;->h(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic o(Landroid/graphics/Bitmap;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzc0;->X(Landroid/graphics/Bitmap;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final o0(ILjava/util/List;Landroid/content/Context;Lx80;)Lna1;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrc0;

    .line 5
    .line 6
    invoke-direct {v0, p2, p1}, Lrc0;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lmh;

    .line 10
    .line 11
    const p2, 0x30735416

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, p2, v1, v0}, Lmh;-><init>(IZLex;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p3, p0, p1}, Lx80;->a(Lx80;ILmh;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lna1;->a:Lna1;

    .line 22
    .line 23
    return-object p0
.end method

.method public static synthetic p(Luo0;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->q0(Luo0;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final p0(Ljava/util/List;Landroid/content/Context;Lx60;ILji;I)Lna1;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v3, p5, 0x6

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    move-object/from16 v3, p4

    .line 16
    .line 17
    check-cast v3, Lpi;

    .line 18
    .line 19
    move-object/from16 v5, p2

    .line 20
    .line 21
    invoke-virtual {v3, v5}, Lpi;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v3, v4

    .line 30
    :goto_0
    or-int v3, p5, v3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object/from16 v5, p2

    .line 34
    .line 35
    move/from16 v3, p5

    .line 36
    .line 37
    :goto_1
    and-int/lit8 v6, p5, 0x30

    .line 38
    .line 39
    if-nez v6, :cond_3

    .line 40
    .line 41
    move-object/from16 v6, p4

    .line 42
    .line 43
    check-cast v6, Lpi;

    .line 44
    .line 45
    invoke-virtual {v6, v2}, Lpi;->d(I)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    const/16 v6, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v6, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v3, v6

    .line 57
    :cond_3
    and-int/lit16 v6, v3, 0x93

    .line 58
    .line 59
    const/16 v7, 0x92

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x1

    .line 63
    if-eq v6, v7, :cond_4

    .line 64
    .line 65
    move v6, v9

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move v6, v8

    .line 68
    :goto_3
    and-int/2addr v3, v9

    .line 69
    move-object/from16 v7, p4

    .line 70
    .line 71
    check-cast v7, Lpi;

    .line 72
    .line 73
    invoke-virtual {v7, v3, v6}, Lpi;->O(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_c

    .line 78
    .line 79
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    move-object v10, v3

    .line 84
    check-cast v10, Ljava/lang/Iterable;

    .line 85
    .line 86
    invoke-virtual {v7}, Lpi;->L()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    sget-object v6, Lii;->a:Lr3;

    .line 91
    .line 92
    if-ne v3, v6, :cond_5

    .line 93
    .line 94
    new-instance v3, Lpn;

    .line 95
    .line 96
    const/16 v11, 0x1c

    .line 97
    .line 98
    invoke-direct {v3, v11}, Lpn;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    move-object v14, v3

    .line 105
    check-cast v14, Lsw;

    .line 106
    .line 107
    const/16 v15, 0x1e

    .line 108
    .line 109
    const-string v11, "\n"

    .line 110
    .line 111
    const/4 v12, 0x0

    .line 112
    const/4 v13, 0x0

    .line 113
    invoke-static/range {v10 .. v15}, Lye;->O(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsw;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v5}, Lx60;->a(Lx60;)Lpe0;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const/high16 v10, 0x40800000    # 4.0f

    .line 122
    .line 123
    const/4 v11, 0x0

    .line 124
    invoke-static {v5, v10, v11, v4}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v7, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-virtual {v7, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    or-int/2addr v5, v12

    .line 137
    invoke-virtual {v7}, Lpi;->L()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    if-nez v5, :cond_6

    .line 142
    .line 143
    if-ne v12, v6, :cond_7

    .line 144
    .line 145
    :cond_6
    new-instance v12, Lkc0;

    .line 146
    .line 147
    invoke-direct {v12, v1, v3}, Lkc0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v12}, Lpi;->g0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    check-cast v12, Lhw;

    .line 154
    .line 155
    invoke-virtual {v7}, Lpi;->L()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-ne v1, v6, :cond_8

    .line 160
    .line 161
    new-instance v1, La00;

    .line 162
    .line 163
    const/16 v3, 0x1d

    .line 164
    .line 165
    invoke-direct {v1, v3}, La00;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_8
    check-cast v1, Lhw;

    .line 172
    .line 173
    new-instance v3, Lyf;

    .line 174
    .line 175
    invoke-direct {v3, v1, v12}, Lyf;-><init>(Lhw;Lhw;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v4, v3}, Lpe0;->c(Lpe0;)Lpe0;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sget-object v3, Ln2;->q:Lfa;

    .line 183
    .line 184
    invoke-static {v3, v7, v8}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    iget-wide v4, v7, Lpi;->T:J

    .line 189
    .line 190
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    invoke-virtual {v7}, Lpi;->l()Lfq0;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-static {v7, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    sget-object v6, Lfi;->b:Lei;

    .line 203
    .line 204
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    sget-object v6, Lei;->b:Lcj;

    .line 208
    .line 209
    invoke-virtual {v7}, Lpi;->Z()V

    .line 210
    .line 211
    .line 212
    iget-boolean v12, v7, Lpi;->S:Z

    .line 213
    .line 214
    if-eqz v12, :cond_9

    .line 215
    .line 216
    invoke-virtual {v7, v6}, Lpi;->k(Lhw;)V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_9
    invoke-virtual {v7}, Lpi;->j0()V

    .line 221
    .line 222
    .line 223
    :goto_4
    sget-object v6, Lei;->e:Lm7;

    .line 224
    .line 225
    invoke-static {v7, v6, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object v3, Lei;->d:Lm7;

    .line 229
    .line 230
    invoke-static {v7, v3, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    sget-object v4, Lei;->f:Lm7;

    .line 238
    .line 239
    invoke-static {v7, v3, v4}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 240
    .line 241
    .line 242
    sget-object v3, Lei;->g:Lp3;

    .line 243
    .line 244
    invoke-static {v7, v3}, Lw60;->G(Lji;Lsw;)V

    .line 245
    .line 246
    .line 247
    sget-object v3, Lei;->c:Lm7;

    .line 248
    .line 249
    invoke-static {v7, v3, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    const v1, -0x44f60826

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v1}, Lpi;->W(I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Ljava/lang/Iterable;

    .line 263
    .line 264
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_b

    .line 273
    .line 274
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, Luo0;

    .line 279
    .line 280
    iget-object v2, v1, Luo0;->d:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v2, Ljava/lang/String;

    .line 283
    .line 284
    iget-object v1, v1, Luo0;->e:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v1, Ljava/lang/String;

    .line 287
    .line 288
    sget-object v3, Ls11;->a:Lrt;

    .line 289
    .line 290
    invoke-static {v3, v11, v10, v9}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    sget-object v4, Lrd0;->d:Lr3;

    .line 295
    .line 296
    sget-object v5, Ln2;->n:Lga;

    .line 297
    .line 298
    const/4 v6, 0x6

    .line 299
    invoke-static {v4, v5, v7, v6}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    iget-wide v5, v7, Lpi;->T:J

    .line 304
    .line 305
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    invoke-virtual {v7}, Lpi;->l()Lfq0;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-static {v7, v3}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    sget-object v12, Lfi;->b:Lei;

    .line 318
    .line 319
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    sget-object v12, Lei;->b:Lcj;

    .line 323
    .line 324
    invoke-virtual {v7}, Lpi;->Z()V

    .line 325
    .line 326
    .line 327
    iget-boolean v13, v7, Lpi;->S:Z

    .line 328
    .line 329
    if-eqz v13, :cond_a

    .line 330
    .line 331
    invoke-virtual {v7, v12}, Lpi;->k(Lhw;)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_a
    invoke-virtual {v7}, Lpi;->j0()V

    .line 336
    .line 337
    .line 338
    :goto_6
    sget-object v12, Lei;->e:Lm7;

    .line 339
    .line 340
    invoke-static {v7, v12, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    sget-object v4, Lei;->d:Lm7;

    .line 344
    .line 345
    invoke-static {v7, v4, v6}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    sget-object v5, Lei;->f:Lm7;

    .line 353
    .line 354
    invoke-static {v7, v4, v5}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 355
    .line 356
    .line 357
    sget-object v4, Lei;->g:Lp3;

    .line 358
    .line 359
    invoke-static {v7, v4}, Lw60;->G(Lji;Lsw;)V

    .line 360
    .line 361
    .line 362
    sget-object v4, Lei;->c:Lm7;

    .line 363
    .line 364
    invoke-static {v7, v4, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    const/16 v3, 0xd

    .line 368
    .line 369
    invoke-static {v3}, Lj50;->q(I)J

    .line 370
    .line 371
    .line 372
    move-result-wide v14

    .line 373
    sget-object v4, Lnf;->a:Lg41;

    .line 374
    .line 375
    invoke-virtual {v7, v4}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    check-cast v5, Llf;

    .line 380
    .line 381
    iget-wide v12, v5, Llf;->s:J

    .line 382
    .line 383
    const/16 v30, 0x0

    .line 384
    .line 385
    const v31, 0x3ffea

    .line 386
    .line 387
    .line 388
    move v5, v11

    .line 389
    const/4 v11, 0x0

    .line 390
    const/16 v16, 0x0

    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const-wide/16 v18, 0x0

    .line 395
    .line 396
    const/16 v20, 0x0

    .line 397
    .line 398
    const-wide/16 v21, 0x0

    .line 399
    .line 400
    const/16 v23, 0x0

    .line 401
    .line 402
    const/16 v24, 0x0

    .line 403
    .line 404
    const/16 v25, 0x0

    .line 405
    .line 406
    const/16 v26, 0x0

    .line 407
    .line 408
    const/16 v27, 0x0

    .line 409
    .line 410
    const/16 v29, 0x6000

    .line 411
    .line 412
    move/from16 v28, v10

    .line 413
    .line 414
    move-object v10, v2

    .line 415
    move/from16 v2, v28

    .line 416
    .line 417
    move-object/from16 v28, v7

    .line 418
    .line 419
    invoke-static/range {v10 .. v31}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v6, v28

    .line 423
    .line 424
    invoke-static {v3}, Lj50;->q(I)J

    .line 425
    .line 426
    .line 427
    move-result-wide v14

    .line 428
    sget-object v16, Lzv;->g:Lzv;

    .line 429
    .line 430
    invoke-virtual {v6, v4}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    check-cast v3, Llf;

    .line 435
    .line 436
    iget-wide v12, v3, Llf;->q:J

    .line 437
    .line 438
    const v31, 0x3ff2a

    .line 439
    .line 440
    .line 441
    sget-object v17, Lz51;->c:Lmx;

    .line 442
    .line 443
    const v29, 0x186000

    .line 444
    .line 445
    .line 446
    move-object v10, v1

    .line 447
    invoke-static/range {v10 .. v31}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6, v9}, Lpi;->p(Z)V

    .line 451
    .line 452
    .line 453
    move v10, v2

    .line 454
    move v11, v5

    .line 455
    move-object v7, v6

    .line 456
    goto/16 :goto_5

    .line 457
    .line 458
    :cond_b
    move-object v6, v7

    .line 459
    invoke-virtual {v6, v8}, Lpi;->p(Z)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v6, v9}, Lpi;->p(Z)V

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_c
    move-object v6, v7

    .line 467
    invoke-virtual {v6}, Lpi;->R()V

    .line 468
    .line 469
    .line 470
    :goto_7
    sget-object v0, Lna1;->a:Lna1;

    .line 471
    .line 472
    return-object v0
.end method

.method public static synthetic q(Llf1;ZLsw;Lpe0;IILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lzc0;->y0(Llf1;ZLsw;Lpe0;IILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final q0(Luo0;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Luo0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Luo0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v0, ": "

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static synthetic r(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lzc0;->A0(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final r0(Landroid/content/Context;Ljava/lang/String;)Lna1;
    .locals 2

    .line 1
    const-string v0, "clipboard"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Landroid/content/ClipboardManager;

    .line 11
    .line 12
    const-string v1, "info"

    .line 13
    .line 14
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 19
    .line 20
    .line 21
    const-string p1, "\u5df2\u590d\u5236\u5f53\u524d\u9875\u4fe1\u606f"

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lna1;->a:Lna1;

    .line 32
    .line 33
    return-object p0
.end method

.method public static synthetic s(Landroid/content/Context;Landroid/graphics/Bitmap;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzc0;->U(Landroid/content/Context;Landroid/graphics/Bitmap;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final s0()Lna1;
    .locals 1

    .line 1
    sget-object v0, Lna1;->a:Lna1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic t(Ljava/lang/String;Lpe0;IILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lzc0;->Q0(Ljava/lang/String;Lpe0;IILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final t0(Loh0;)Lna1;
    .locals 1

    .line 1
    invoke-static {p0}, Lzc0;->h0(Loh0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {p0, v0}, Lzc0;->i0(Loh0;Z)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic u(Loh0;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lzc0;->S(Loh0;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final u0(Lwf;Loh0;Lji;I)Lna1;
    .locals 26

    .line 1
    and-int/lit8 v0, p3, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    and-int/lit8 v1, p3, 0x1

    .line 12
    .line 13
    move-object/from16 v11, p2

    .line 14
    .line 15
    check-cast v11, Lpi;

    .line 16
    .line 17
    invoke-virtual {v11, v1, v0}, Lpi;->O(IZ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    sget-object v0, Ln2;->o:Lga;

    .line 24
    .line 25
    sget-object v1, Ls11;->a:Lrt;

    .line 26
    .line 27
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, Lii;->a:Lr3;

    .line 32
    .line 33
    if-ne v4, v5, :cond_1

    .line 34
    .line 35
    new-instance v4, Lq70;

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    move-object/from16 v6, p1

    .line 39
    .line 40
    invoke-direct {v4, v6, v5}, Lq70;-><init>(Loh0;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v11, v4}, Lpi;->g0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object/from16 v6, p1

    .line 48
    .line 49
    :goto_1
    check-cast v4, Lhw;

    .line 50
    .line 51
    invoke-static {v1, v4}, Lrd0;->j(Lpe0;Lhw;)Lpe0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v4, Lrd0;->a:Lt8;

    .line 56
    .line 57
    const/16 v5, 0x30

    .line 58
    .line 59
    invoke-static {v4, v0, v11, v5}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-wide v4, v11, Lpi;->T:J

    .line 64
    .line 65
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {v11}, Lpi;->l()Lfq0;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v11, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v7, Lfi;->b:Lei;

    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v7, Lei;->b:Lcj;

    .line 83
    .line 84
    invoke-virtual {v11}, Lpi;->Z()V

    .line 85
    .line 86
    .line 87
    iget-boolean v8, v11, Lpi;->S:Z

    .line 88
    .line 89
    if-eqz v8, :cond_2

    .line 90
    .line 91
    invoke-virtual {v11, v7}, Lpi;->k(Lhw;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v11}, Lpi;->j0()V

    .line 96
    .line 97
    .line 98
    :goto_2
    sget-object v7, Lei;->e:Lm7;

    .line 99
    .line 100
    invoke-static {v11, v7, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lei;->d:Lm7;

    .line 104
    .line 105
    invoke-static {v11, v0, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v4, Lei;->f:Lm7;

    .line 113
    .line 114
    invoke-static {v11, v0, v4}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lei;->g:Lp3;

    .line 118
    .line 119
    invoke-static {v11, v0}, Lw60;->G(Lji;Lsw;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lei;->c:Lm7;

    .line 123
    .line 124
    invoke-static {v11, v0, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Ls60;

    .line 128
    .line 129
    const/high16 v1, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-direct {v0, v1, v3}, Ls60;-><init>(FZ)V

    .line 132
    .line 133
    .line 134
    const/4 v1, 0x6

    .line 135
    const-string v4, "\u4f7f\u7528\u8bf4\u660e"

    .line 136
    .line 137
    invoke-static {v4, v0, v11, v1, v2}, Lzc0;->P0(Ljava/lang/String;Lpe0;Lji;II)V

    .line 138
    .line 139
    .line 140
    invoke-static {v6}, Lzc0;->j0(Loh0;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    const-string v0, "\u25b2"

    .line 147
    .line 148
    :goto_3
    move-object v4, v0

    .line 149
    goto :goto_4

    .line 150
    :cond_3
    const-string v0, "\u25bc"

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :goto_4
    const/16 v0, 0xe

    .line 154
    .line 155
    invoke-static {v0}, Lj50;->q(I)J

    .line 156
    .line 157
    .line 158
    move-result-wide v8

    .line 159
    sget-object v0, Lnf;->a:Lg41;

    .line 160
    .line 161
    invoke-virtual {v11, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Llf;

    .line 166
    .line 167
    iget-wide v0, v0, Llf;->s:J

    .line 168
    .line 169
    const/16 v24, 0x0

    .line 170
    .line 171
    const v25, 0x3ffea

    .line 172
    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v10, 0x0

    .line 176
    move-object/from16 v22, v11

    .line 177
    .line 178
    const/4 v11, 0x0

    .line 179
    const-wide/16 v12, 0x0

    .line 180
    .line 181
    const/4 v14, 0x0

    .line 182
    const-wide/16 v15, 0x0

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/16 v18, 0x0

    .line 187
    .line 188
    const/16 v19, 0x0

    .line 189
    .line 190
    const/16 v20, 0x0

    .line 191
    .line 192
    const/16 v21, 0x0

    .line 193
    .line 194
    const/16 v23, 0x6000

    .line 195
    .line 196
    move-wide v6, v0

    .line 197
    invoke-static/range {v4 .. v25}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 198
    .line 199
    .line 200
    move-object/from16 v11, v22

    .line 201
    .line 202
    invoke-virtual {v11, v3}, Lpi;->p(Z)V

    .line 203
    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, Lzc0;->j0(Loh0;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    invoke-static {}, Lrs;->a()Lvs;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-static {}, Lrs;->b()Ljt;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    sget-object v0, Loh;->a:Loh;

    .line 218
    .line 219
    invoke-virtual {v0}, Loh;->q()Lxw;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    const v12, 0x186c00

    .line 224
    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    move-object/from16 v4, p0

    .line 229
    .line 230
    invoke-static/range {v4 .. v12}, Lo30;->b(Lwf;ZLpe0;Lvs;Ljt;Ljava/lang/String;Lxw;Lji;I)V

    .line 231
    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_4
    move-object/from16 v22, v11

    .line 235
    .line 236
    invoke-virtual/range {v22 .. v22}, Lpi;->R()V

    .line 237
    .line 238
    .line 239
    :goto_5
    sget-object v0, Lna1;->a:Lna1;

    .line 240
    .line 241
    return-object v0
.end method

.method public static synthetic v(Ljava/util/ArrayList;Lx80;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzc0;->d0(Ljava/util/List;Lx80;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final v0(Loh0;)Lna1;
    .locals 1

    .line 1
    invoke-static {p0}, Lzc0;->j0(Loh0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {p0, v0}, Lzc0;->k0(Loh0;Z)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic w(ZLsw;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lzc0;->w0(ZLsw;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final w0(ZLsw;Lji;I)Lna1;
    .locals 44

    .line 1
    and-int/lit8 v0, p3, 0x3

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    and-int/lit8 v4, p3, 0x1

    .line 12
    .line 13
    move-object/from16 v10, p2

    .line 14
    .line 15
    check-cast v10, Lpi;

    .line 16
    .line 17
    invoke-virtual {v10, v4, v0}, Lpi;->O(IZ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    const-string v0, "\u56fe\u6807\u9690\u85cf\u8bbe\u7f6e"

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x6

    .line 27
    invoke-static {v0, v4, v10, v5, v3}, Lzc0;->P0(Ljava/lang/String;Lpe0;Lji;II)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lme0;->a:Lme0;

    .line 31
    .line 32
    const/high16 v3, 0x41400000    # 12.0f

    .line 33
    .line 34
    invoke-static {v0, v3}, Ls11;->b(Lpe0;F)Lpe0;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v10, v4}, Lu50;->c(Lji;Lpe0;)V

    .line 39
    .line 40
    .line 41
    sget-object v4, Ls11;->a:Lrt;

    .line 42
    .line 43
    sget-object v5, Lrd0;->d:Lr3;

    .line 44
    .line 45
    sget-object v6, Ln2;->o:Lga;

    .line 46
    .line 47
    const/16 v7, 0x36

    .line 48
    .line 49
    invoke-static {v5, v6, v10, v7}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iget-wide v6, v10, Lpi;->T:J

    .line 54
    .line 55
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-virtual {v10}, Lpi;->l()Lfq0;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v10, v4}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    sget-object v8, Lfi;->b:Lei;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v8, Lei;->b:Lcj;

    .line 73
    .line 74
    invoke-virtual {v10}, Lpi;->Z()V

    .line 75
    .line 76
    .line 77
    iget-boolean v9, v10, Lpi;->S:Z

    .line 78
    .line 79
    if-eqz v9, :cond_1

    .line 80
    .line 81
    invoke-virtual {v10, v8}, Lpi;->k(Lhw;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v10}, Lpi;->j0()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v9, Lei;->e:Lm7;

    .line 89
    .line 90
    invoke-static {v10, v9, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v5, Lei;->d:Lm7;

    .line 94
    .line 95
    invoke-static {v10, v5, v7}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-object v7, Lei;->f:Lm7;

    .line 103
    .line 104
    invoke-static {v10, v6, v7}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 105
    .line 106
    .line 107
    sget-object v6, Lei;->g:Lp3;

    .line 108
    .line 109
    invoke-static {v10, v6}, Lw60;->G(Lji;Lsw;)V

    .line 110
    .line 111
    .line 112
    sget-object v11, Lei;->c:Lm7;

    .line 113
    .line 114
    invoke-static {v10, v11, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Ls60;

    .line 118
    .line 119
    const/high16 v12, 0x3f800000    # 1.0f

    .line 120
    .line 121
    invoke-direct {v4, v12, v2}, Ls60;-><init>(FZ)V

    .line 122
    .line 123
    .line 124
    sget-object v12, Ln2;->q:Lfa;

    .line 125
    .line 126
    invoke-static {v12, v10, v1}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-wide v12, v10, Lpi;->T:J

    .line 131
    .line 132
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    invoke-virtual {v10}, Lpi;->l()Lfq0;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-static {v10, v4}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v10}, Lpi;->Z()V

    .line 145
    .line 146
    .line 147
    iget-boolean v14, v10, Lpi;->S:Z

    .line 148
    .line 149
    if-eqz v14, :cond_2

    .line 150
    .line 151
    invoke-virtual {v10, v8}, Lpi;->k(Lhw;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_2
    invoke-virtual {v10}, Lpi;->j0()V

    .line 156
    .line 157
    .line 158
    :goto_2
    invoke-static {v10, v9, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v10, v5, v13}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v10, v1, v7}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v10, v6}, Lw60;->G(Lji;Lsw;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v10, v11, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    const/16 v1, 0xf

    .line 178
    .line 179
    invoke-static {v1}, Lj50;->q(I)J

    .line 180
    .line 181
    .line 182
    move-result-wide v4

    .line 183
    sget-object v11, Lzv;->g:Lzv;

    .line 184
    .line 185
    sget-object v1, Lnf;->a:Lg41;

    .line 186
    .line 187
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Llf;

    .line 192
    .line 193
    iget-wide v7, v6, Llf;->q:J

    .line 194
    .line 195
    const/16 v25, 0x0

    .line 196
    .line 197
    const v26, 0x3ffaa

    .line 198
    .line 199
    .line 200
    move-object/from16 v23, v10

    .line 201
    .line 202
    move-wide v9, v4

    .line 203
    const-string v5, "\u684c\u9762\u56fe\u6807"

    .line 204
    .line 205
    const/4 v6, 0x0

    .line 206
    const/4 v12, 0x0

    .line 207
    const-wide/16 v13, 0x0

    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    const-wide/16 v16, 0x0

    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const/16 v19, 0x0

    .line 215
    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    const/16 v21, 0x0

    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const v24, 0x186006

    .line 223
    .line 224
    .line 225
    invoke-static/range {v5 .. v26}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v10, v23

    .line 229
    .line 230
    const/high16 v4, 0x40000000    # 2.0f

    .line 231
    .line 232
    invoke-static {v0, v4}, Ls11;->b(Lpe0;F)Lpe0;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v10, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 237
    .line 238
    .line 239
    const/16 v0, 0xc

    .line 240
    .line 241
    invoke-static {v0}, Lj50;->q(I)J

    .line 242
    .line 243
    .line 244
    move-result-wide v4

    .line 245
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Llf;

    .line 250
    .line 251
    iget-wide v7, v0, Llf;->s:J

    .line 252
    .line 253
    const/16 v0, 0x10

    .line 254
    .line 255
    invoke-static {v0}, Lj50;->q(I)J

    .line 256
    .line 257
    .line 258
    move-result-wide v16

    .line 259
    const/16 v25, 0x30

    .line 260
    .line 261
    const v26, 0x3f7ea

    .line 262
    .line 263
    .line 264
    move-wide v9, v4

    .line 265
    const-string v5, "\u5173\u95ed\u540e\u56fe\u6807\u7acb\u5373\u6d88\u5931\uff0cLSPosed \u5185\u4ecd\u53ef\u542f\u52a8"

    .line 266
    .line 267
    const/4 v11, 0x0

    .line 268
    const/16 v24, 0x6006

    .line 269
    .line 270
    invoke-static/range {v5 .. v26}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v10, v23

    .line 274
    .line 275
    invoke-virtual {v10, v2}, Lpi;->p(Z)V

    .line 276
    .line 277
    .line 278
    invoke-static {v3}, Ls11;->e(F)Lpe0;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v10, v0}, Lu50;->c(Lji;Lpe0;)V

    .line 283
    .line 284
    .line 285
    sget-wide v12, Lff;->c:J

    .line 286
    .line 287
    invoke-static {}, Lhf;->d()J

    .line 288
    .line 289
    .line 290
    move-result-wide v14

    .line 291
    sget-wide v16, Lff;->f:J

    .line 292
    .line 293
    sget-object v0, Lo30;->E:Lmf;

    .line 294
    .line 295
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 296
    .line 297
    .line 298
    move-result-wide v18

    .line 299
    sget-object v0, Lo30;->L:Lmf;

    .line 300
    .line 301
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 302
    .line 303
    .line 304
    move-result-wide v20

    .line 305
    sget-object v0, Lo30;->O:Lmf;

    .line 306
    .line 307
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 308
    .line 309
    .line 310
    move-result-wide v22

    .line 311
    sget-object v0, Lo30;->K:Lmf;

    .line 312
    .line 313
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 314
    .line 315
    .line 316
    move-result-wide v24

    .line 317
    sget-object v0, Lo30;->N:Lmf;

    .line 318
    .line 319
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 320
    .line 321
    .line 322
    move-result-wide v26

    .line 323
    sget-object v0, Lo30;->p:Lmf;

    .line 324
    .line 325
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 326
    .line 327
    .line 328
    move-result-wide v3

    .line 329
    sget v0, Lo30;->q:F

    .line 330
    .line 331
    invoke-static {v0, v3, v4}, Lff;->b(FJ)J

    .line 332
    .line 333
    .line 334
    move-result-wide v3

    .line 335
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, Llf;

    .line 340
    .line 341
    iget-wide v5, v0, Llf;->p:J

    .line 342
    .line 343
    invoke-static {v3, v4, v5, v6}, Lp30;->u(JJ)J

    .line 344
    .line 345
    .line 346
    move-result-wide v28

    .line 347
    sget-object v0, Lo30;->t:Lmf;

    .line 348
    .line 349
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 350
    .line 351
    .line 352
    move-result-wide v3

    .line 353
    sget v0, Lo30;->u:F

    .line 354
    .line 355
    invoke-static {v0, v3, v4}, Lff;->b(FJ)J

    .line 356
    .line 357
    .line 358
    move-result-wide v3

    .line 359
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    check-cast v5, Llf;

    .line 364
    .line 365
    iget-wide v5, v5, Llf;->p:J

    .line 366
    .line 367
    invoke-static {v3, v4, v5, v6}, Lp30;->u(JJ)J

    .line 368
    .line 369
    .line 370
    move-result-wide v30

    .line 371
    sget-object v3, Lo30;->r:Lmf;

    .line 372
    .line 373
    invoke-static {v3, v10}, Lnf;->d(Lmf;Lji;)J

    .line 374
    .line 375
    .line 376
    move-result-wide v3

    .line 377
    sget v5, Lo30;->s:F

    .line 378
    .line 379
    invoke-static {v5, v3, v4}, Lff;->b(FJ)J

    .line 380
    .line 381
    .line 382
    move-result-wide v3

    .line 383
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    check-cast v5, Llf;

    .line 388
    .line 389
    iget-wide v5, v5, Llf;->p:J

    .line 390
    .line 391
    invoke-static {v3, v4, v5, v6}, Lp30;->u(JJ)J

    .line 392
    .line 393
    .line 394
    move-result-wide v34

    .line 395
    sget-object v3, Lo30;->v:Lmf;

    .line 396
    .line 397
    invoke-static {v3, v10}, Lnf;->d(Lmf;Lji;)J

    .line 398
    .line 399
    .line 400
    move-result-wide v3

    .line 401
    sget v5, Lo30;->w:F

    .line 402
    .line 403
    invoke-static {v5, v3, v4}, Lff;->b(FJ)J

    .line 404
    .line 405
    .line 406
    move-result-wide v3

    .line 407
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    check-cast v5, Llf;

    .line 412
    .line 413
    iget-wide v5, v5, Llf;->p:J

    .line 414
    .line 415
    invoke-static {v3, v4, v5, v6}, Lp30;->u(JJ)J

    .line 416
    .line 417
    .line 418
    move-result-wide v36

    .line 419
    sget-object v3, Lo30;->z:Lmf;

    .line 420
    .line 421
    invoke-static {v3, v10}, Lnf;->d(Lmf;Lji;)J

    .line 422
    .line 423
    .line 424
    move-result-wide v3

    .line 425
    invoke-static {v0, v3, v4}, Lff;->b(FJ)J

    .line 426
    .line 427
    .line 428
    move-result-wide v3

    .line 429
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    check-cast v5, Llf;

    .line 434
    .line 435
    iget-wide v5, v5, Llf;->p:J

    .line 436
    .line 437
    invoke-static {v3, v4, v5, v6}, Lp30;->u(JJ)J

    .line 438
    .line 439
    .line 440
    move-result-wide v38

    .line 441
    sget-object v3, Lo30;->A:Lmf;

    .line 442
    .line 443
    invoke-static {v3, v10}, Lnf;->d(Lmf;Lji;)J

    .line 444
    .line 445
    .line 446
    move-result-wide v3

    .line 447
    invoke-static {v0, v3, v4}, Lff;->b(FJ)J

    .line 448
    .line 449
    .line 450
    move-result-wide v3

    .line 451
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, Llf;

    .line 456
    .line 457
    iget-wide v5, v0, Llf;->p:J

    .line 458
    .line 459
    invoke-static {v3, v4, v5, v6}, Lp30;->u(JJ)J

    .line 460
    .line 461
    .line 462
    move-result-wide v40

    .line 463
    sget-object v0, Lo30;->x:Lmf;

    .line 464
    .line 465
    invoke-static {v0, v10}, Lnf;->d(Lmf;Lji;)J

    .line 466
    .line 467
    .line 468
    move-result-wide v3

    .line 469
    sget v0, Lo30;->y:F

    .line 470
    .line 471
    invoke-static {v0, v3, v4}, Lff;->b(FJ)J

    .line 472
    .line 473
    .line 474
    move-result-wide v3

    .line 475
    invoke-virtual {v10, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    check-cast v0, Llf;

    .line 480
    .line 481
    iget-wide v0, v0, Llf;->p:J

    .line 482
    .line 483
    invoke-static {v3, v4, v0, v1}, Lp30;->u(JJ)J

    .line 484
    .line 485
    .line 486
    move-result-wide v42

    .line 487
    new-instance v9, Lt51;

    .line 488
    .line 489
    move-wide/from16 v32, v16

    .line 490
    .line 491
    move-object v11, v9

    .line 492
    invoke-direct/range {v11 .. v43}, Lt51;-><init>(JJJJJJJJJJJJJJJJ)V

    .line 493
    .line 494
    .line 495
    const/4 v11, 0x0

    .line 496
    const/4 v7, 0x0

    .line 497
    const/4 v8, 0x0

    .line 498
    move/from16 v5, p0

    .line 499
    .line 500
    move-object/from16 v6, p1

    .line 501
    .line 502
    invoke-static/range {v5 .. v11}, Lw51;->a(ZLsw;Lpe0;ZLt51;Lji;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v10, v2}, Lpi;->p(Z)V

    .line 506
    .line 507
    .line 508
    goto :goto_3

    .line 509
    :cond_3
    invoke-virtual {v10}, Lpi;->R()V

    .line 510
    .line 511
    .line 512
    :goto_3
    sget-object v0, Lna1;->a:Lna1;

    .line 513
    .line 514
    return-object v0
.end method

.method public static synthetic x(Ljava/util/List;Lx60;ILji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lzc0;->e0(Ljava/util/List;Lx60;ILji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final x0(Ljava/lang/String;Ljava/lang/String;ILji;I)Lna1;
    .locals 3

    .line 1
    and-int/lit8 v0, p4, 0x3

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eq v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/2addr p4, v1

    .line 11
    check-cast p3, Lpi;

    .line 12
    .line 13
    invoke-virtual {p3, p4, v0}, Lpi;->O(IZ)Z

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    const-string p4, "\u7248\u672c\u4fe1\u606f"

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x6

    .line 23
    invoke-static {p4, v0, p3, v1, v2}, Lzc0;->P0(Ljava/lang/String;Lpe0;Lji;II)V

    .line 24
    .line 25
    .line 26
    sget-object p4, Lme0;->a:Lme0;

    .line 27
    .line 28
    const/high16 v0, 0x41000000    # 8.0f

    .line 29
    .line 30
    invoke-static {p4, v0}, Ls11;->b(Lpe0;F)Lpe0;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    invoke-static {p3, p4}, Lu50;->c(Lji;Lpe0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string p4, "\u7f16\u8bd1\u65f6\u95f4"

    .line 41
    .line 42
    invoke-static {p4, p0, p3, v1}, Lzc0;->z0(Ljava/lang/String;Ljava/lang/String;Lji;I)V

    .line 43
    .line 44
    .line 45
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p4, "v"

    .line 48
    .line 49
    invoke-direct {p0, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, " ("

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, ")"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string p1, "\u7248\u672c\u53f7"

    .line 73
    .line 74
    invoke-static {p1, p0, p3, v1}, Lzc0;->z0(Ljava/lang/String;Ljava/lang/String;Lji;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {p3}, Lpi;->R()V

    .line 79
    .line 80
    .line 81
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 82
    .line 83
    return-object p0
.end method

.method public static synthetic y(Lwg0;Ljw0;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lzc0;->J0(Lwg0;Ljw0;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final y0(Llf1;ZLsw;Lpe0;IILji;I)Lna1;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Lj50;->A(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v0, p0

    .line 8
    move v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move v6, p5

    .line 12
    move-object v4, p6

    .line 13
    invoke-static/range {v0 .. v6}, Lzc0;->g0(Llf1;ZLsw;Lpe0;Lji;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lna1;->a:Lna1;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic z(Landroid/content/Context;Ljava/lang/String;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzc0;->r0(Landroid/content/Context;Ljava/lang/String;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final z0(Ljava/lang/String;Ljava/lang/String;Lji;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    check-cast v2, Lpi;

    .line 14
    .line 15
    const v3, 0x4fac7a3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lpi;->X(I)Lpi;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v3, p3, 0x6

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v3, 0x2

    .line 34
    :goto_0
    or-int v3, p3, v3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move/from16 v3, p3

    .line 38
    .line 39
    :goto_1
    and-int/lit8 v4, p3, 0x30

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v4, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v3, v4

    .line 55
    :cond_3
    move/from16 v22, v3

    .line 56
    .line 57
    and-int/lit8 v3, v22, 0x13

    .line 58
    .line 59
    const/16 v4, 0x12

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x1

    .line 63
    if-eq v3, v4, :cond_4

    .line 64
    .line 65
    move v3, v6

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move v3, v5

    .line 68
    :goto_3
    and-int/lit8 v4, v22, 0x1

    .line 69
    .line 70
    invoke-virtual {v2, v4, v3}, Lpi;->O(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_6

    .line 75
    .line 76
    sget-object v3, Ls11;->a:Lrt;

    .line 77
    .line 78
    const/high16 v4, 0x40800000    # 4.0f

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    invoke-static {v3, v7, v4, v6}, Lrd0;->F(Lpe0;FFI)Lpe0;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    sget-object v4, Lrd0;->d:Lr3;

    .line 86
    .line 87
    sget-object v7, Ln2;->n:Lga;

    .line 88
    .line 89
    const/4 v8, 0x6

    .line 90
    invoke-static {v4, v7, v2, v8}, Lhw0;->a(Lu8;Lga;Lpi;I)Liw0;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-wide v7, v2, Lpi;->T:J

    .line 95
    .line 96
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-virtual {v2}, Lpi;->l()Lfq0;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-static {v2, v3}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object v9, Lfi;->b:Lei;

    .line 109
    .line 110
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v9, Lei;->b:Lcj;

    .line 114
    .line 115
    invoke-virtual {v2}, Lpi;->Z()V

    .line 116
    .line 117
    .line 118
    iget-boolean v10, v2, Lpi;->S:Z

    .line 119
    .line 120
    if-eqz v10, :cond_5

    .line 121
    .line 122
    invoke-virtual {v2, v9}, Lpi;->k(Lhw;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-virtual {v2}, Lpi;->j0()V

    .line 127
    .line 128
    .line 129
    :goto_4
    sget-object v9, Lei;->e:Lm7;

    .line 130
    .line 131
    invoke-static {v2, v9, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v4, Lei;->d:Lm7;

    .line 135
    .line 136
    invoke-static {v2, v4, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    sget-object v7, Lei;->f:Lm7;

    .line 144
    .line 145
    invoke-static {v2, v4, v7}, Lw60;->y(Lji;Ljava/lang/Integer;Lww;)V

    .line 146
    .line 147
    .line 148
    sget-object v4, Lei;->g:Lp3;

    .line 149
    .line 150
    invoke-static {v2, v4}, Lw60;->G(Lji;Lsw;)V

    .line 151
    .line 152
    .line 153
    sget-object v4, Lei;->c:Lm7;

    .line 154
    .line 155
    invoke-static {v2, v4, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const/16 v23, 0xd

    .line 159
    .line 160
    move v3, v5

    .line 161
    invoke-static/range {v23 .. v23}, Lj50;->q(I)J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    sget-object v7, Lnf;->a:Lg41;

    .line 166
    .line 167
    invoke-virtual {v2, v7}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    check-cast v8, Llf;

    .line 172
    .line 173
    iget-wide v8, v8, Llf;->s:J

    .line 174
    .line 175
    and-int/lit8 v10, v22, 0xe

    .line 176
    .line 177
    or-int/lit16 v10, v10, 0x6000

    .line 178
    .line 179
    const/16 v20, 0x0

    .line 180
    .line 181
    const v21, 0x3ffea

    .line 182
    .line 183
    .line 184
    const/4 v1, 0x0

    .line 185
    move v11, v6

    .line 186
    const/4 v6, 0x0

    .line 187
    move-object v12, v7

    .line 188
    const/4 v7, 0x0

    .line 189
    move-object/from16 v18, v2

    .line 190
    .line 191
    move v13, v3

    .line 192
    move-wide v2, v8

    .line 193
    const-wide/16 v8, 0x0

    .line 194
    .line 195
    move/from16 v19, v10

    .line 196
    .line 197
    const/4 v10, 0x0

    .line 198
    move v15, v11

    .line 199
    move-object v14, v12

    .line 200
    const-wide/16 v11, 0x0

    .line 201
    .line 202
    move/from16 v16, v13

    .line 203
    .line 204
    const/4 v13, 0x0

    .line 205
    move-object/from16 v17, v14

    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    move/from16 v24, v15

    .line 209
    .line 210
    const/4 v15, 0x0

    .line 211
    move/from16 v25, v16

    .line 212
    .line 213
    const/16 v16, 0x0

    .line 214
    .line 215
    move-object/from16 v26, v17

    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    move-object/from16 v27, v26

    .line 220
    .line 221
    invoke-static/range {v0 .. v21}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 222
    .line 223
    .line 224
    move-object/from16 v0, v18

    .line 225
    .line 226
    invoke-static/range {v23 .. v23}, Lj50;->q(I)J

    .line 227
    .line 228
    .line 229
    move-result-wide v4

    .line 230
    sget-object v6, Lzv;->g:Lzv;

    .line 231
    .line 232
    move-object/from16 v12, v27

    .line 233
    .line 234
    invoke-virtual {v0, v12}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Llf;

    .line 239
    .line 240
    iget-wide v2, v1, Llf;->q:J

    .line 241
    .line 242
    shr-int/lit8 v1, v22, 0x3

    .line 243
    .line 244
    and-int/lit8 v1, v1, 0xe

    .line 245
    .line 246
    const v7, 0x186000

    .line 247
    .line 248
    .line 249
    or-int v19, v1, v7

    .line 250
    .line 251
    const v21, 0x3ff2a

    .line 252
    .line 253
    .line 254
    const/4 v1, 0x0

    .line 255
    sget-object v7, Lz51;->c:Lmx;

    .line 256
    .line 257
    const-wide/16 v11, 0x0

    .line 258
    .line 259
    move-object/from16 v0, p1

    .line 260
    .line 261
    invoke-static/range {v0 .. v21}, Ld71;->b(Ljava/lang/String;Lpe0;JJLzv;Lz51;JLr61;JIZIILs71;Lji;III)V

    .line 262
    .line 263
    .line 264
    move-object/from16 v1, v18

    .line 265
    .line 266
    const/4 v15, 0x1

    .line 267
    invoke-virtual {v1, v15}, Lpi;->p(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_6
    move-object v0, v1

    .line 272
    move-object v1, v2

    .line 273
    invoke-virtual {v1}, Lpi;->R()V

    .line 274
    .line 275
    .line 276
    :goto_5
    invoke-virtual {v1}, Lpi;->r()Lht0;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-eqz v1, :cond_7

    .line 281
    .line 282
    new-instance v2, Lnc0;

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    move-object/from16 v3, p0

    .line 286
    .line 287
    move/from16 v4, p3

    .line 288
    .line 289
    invoke-direct {v2, v4, v13, v3, v0}, Lnc0;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iput-object v2, v1, Lht0;->d:Lww;

    .line 293
    .line 294
    :cond_7
    return-void
.end method
