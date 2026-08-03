.class public abstract Lsh/p0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lsh/p0;->a:F

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    int-to-float v0, v0

    .line 8
    sput v0, Lsh/p0;->b:F

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Ly0/o;Ls0/d;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lfg/p;JLp/r1;Ls0/d;Li0/h0;I)V
    .locals 28

    .line 1
    move-object/from16 v12, p11

    .line 2
    .line 3
    move-object/from16 v8, p13

    .line 4
    .line 5
    const v0, -0x1917237d

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    const v0, 0x16db6c06

    .line 12
    .line 13
    .line 14
    or-int v0, p14, v0

    .line 15
    .line 16
    invoke-virtual {v8, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x4

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    const/16 v4, 0x30

    .line 28
    .line 29
    or-int/2addr v1, v4

    .line 30
    const v4, 0x12492493

    .line 31
    .line 32
    .line 33
    and-int/2addr v4, v0

    .line 34
    const v5, 0x12492492

    .line 35
    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-ne v4, v5, :cond_2

    .line 40
    .line 41
    and-int/lit8 v4, v1, 0x13

    .line 42
    .line 43
    const/16 v5, 0x12

    .line 44
    .line 45
    if-eq v4, v5, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v4, v6

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :goto_1
    move v4, v7

    .line 51
    :goto_2
    and-int/2addr v0, v7

    .line 52
    invoke-virtual {v8, v0, v4}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_13

    .line 57
    .line 58
    invoke-virtual {v8}, Li0/h0;->X()V

    .line 59
    .line 60
    .line 61
    and-int/lit8 v0, p14, 0x1

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {v8}, Li0/h0;->B()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 73
    .line 74
    .line 75
    move-object/from16 v10, p0

    .line 76
    .line 77
    move-object/from16 v21, p3

    .line 78
    .line 79
    move/from16 v22, p4

    .line 80
    .line 81
    move-object/from16 v23, p5

    .line 82
    .line 83
    move/from16 v24, p6

    .line 84
    .line 85
    move-object/from16 v19, p7

    .line 86
    .line 87
    move-object/from16 v25, p8

    .line 88
    .line 89
    move-wide/from16 v4, p9

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    :goto_3
    sget-object v0, Lbi/d;->a:Li0/m2;

    .line 93
    .line 94
    invoke-virtual {v8, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lbi/b;

    .line 99
    .line 100
    invoke-virtual {v0}, Lbi/b;->l()J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 105
    .line 106
    sget-object v9, Lsh/s;->a:Ls0/d;

    .line 107
    .line 108
    sget-object v10, Lsh/s;->b:Ls0/d;

    .line 109
    .line 110
    const/4 v11, 0x7

    .line 111
    sget-object v13, Lsh/s;->c:Ls0/d;

    .line 112
    .line 113
    sget-object v14, Lsh/s;->d:Ls0/d;

    .line 114
    .line 115
    move/from16 v22, v2

    .line 116
    .line 117
    move-object/from16 v21, v9

    .line 118
    .line 119
    move-object/from16 v23, v10

    .line 120
    .line 121
    move/from16 v24, v11

    .line 122
    .line 123
    move-object/from16 v19, v13

    .line 124
    .line 125
    move-object/from16 v25, v14

    .line 126
    .line 127
    move-object v10, v0

    .line 128
    :goto_4
    invoke-virtual {v8}, Li0/h0;->q()V

    .line 129
    .line 130
    .line 131
    and-int/lit8 v0, v1, 0xe

    .line 132
    .line 133
    xor-int/lit8 v0, v0, 0x6

    .line 134
    .line 135
    if-le v0, v3, :cond_5

    .line 136
    .line 137
    invoke-virtual {v8, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_6

    .line 142
    .line 143
    :cond_5
    and-int/lit8 v2, v1, 0x6

    .line 144
    .line 145
    if-ne v2, v3, :cond_7

    .line 146
    .line 147
    :cond_6
    move v2, v7

    .line 148
    goto :goto_5

    .line 149
    :cond_7
    move v2, v6

    .line 150
    :goto_5
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    sget-object v11, Li0/l;->a:Li0/e;

    .line 155
    .line 156
    if-nez v2, :cond_8

    .line 157
    .line 158
    if-ne v9, v11, :cond_9

    .line 159
    .line 160
    :cond_8
    new-instance v9, Lsh/e0;

    .line 161
    .line 162
    invoke-direct {v9, v12}, Lsh/e0;-><init>(Lp/r1;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_9
    check-cast v9, Lsh/e0;

    .line 169
    .line 170
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-ne v2, v11, :cond_a

    .line 175
    .line 176
    new-instance v2, Lw0/p;

    .line 177
    .line 178
    invoke-direct {v2}, Lw0/p;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_a
    move-object v14, v2

    .line 185
    check-cast v14, Lw0/p;

    .line 186
    .line 187
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-ne v2, v11, :cond_b

    .line 192
    .line 193
    new-instance v2, Lw0/p;

    .line 194
    .line 195
    invoke-direct {v2}, Lw0/p;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_b
    move-object v15, v2

    .line 202
    check-cast v15, Lw0/p;

    .line 203
    .line 204
    sget-object v2, Lci/y;->c:Li0/m2;

    .line 205
    .line 206
    invoke-virtual {v8, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    check-cast v2, Ljava/util/List;

    .line 211
    .line 212
    if-nez v2, :cond_c

    .line 213
    .line 214
    move-object/from16 v16, v15

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_c
    move-object/from16 v16, v2

    .line 218
    .line 219
    :goto_6
    sget-object v2, Lci/y;->d:Li0/m2;

    .line 220
    .line 221
    invoke-virtual {v8, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, Ljava/util/List;

    .line 226
    .line 227
    if-nez v2, :cond_d

    .line 228
    .line 229
    move-object/from16 v17, v14

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_d
    move-object/from16 v17, v2

    .line 233
    .line 234
    :goto_7
    invoke-virtual {v8, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-le v0, v3, :cond_e

    .line 239
    .line 240
    invoke-virtual {v8, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_f

    .line 245
    .line 246
    :cond_e
    and-int/lit8 v0, v1, 0x6

    .line 247
    .line 248
    if-ne v0, v3, :cond_10

    .line 249
    .line 250
    :cond_f
    move v6, v7

    .line 251
    :cond_10
    or-int v0, v2, v6

    .line 252
    .line 253
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-nez v0, :cond_11

    .line 258
    .line 259
    if-ne v1, v11, :cond_12

    .line 260
    .line 261
    :cond_11
    new-instance v1, Lm/b;

    .line 262
    .line 263
    const/16 v0, 0xf

    .line 264
    .line 265
    invoke-direct {v1, v9, v0, v12}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_12
    check-cast v1, Lfg/l;

    .line 272
    .line 273
    invoke-static {v10, v1}, Lp/d;->j(Ly0/o;Lfg/l;)Ly0/o;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v13, Lsh/m0;

    .line 278
    .line 279
    move-object/from16 v18, p1

    .line 280
    .line 281
    move-object/from16 v20, p2

    .line 282
    .line 283
    move-object/from16 v27, p12

    .line 284
    .line 285
    move-object/from16 v26, v9

    .line 286
    .line 287
    invoke-direct/range {v13 .. v27}, Lsh/m0;-><init>(Lw0/p;Lw0/p;Ljava/util/List;Ljava/util/List;Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lsh/e0;Ls0/d;)V

    .line 288
    .line 289
    .line 290
    const v1, 0x17277dc7

    .line 291
    .line 292
    .line 293
    invoke-static {v1, v13, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    const/high16 v9, 0x180000

    .line 298
    .line 299
    const/4 v1, 0x0

    .line 300
    move-wide v2, v4

    .line 301
    const-wide/16 v4, 0x0

    .line 302
    .line 303
    const/4 v6, 0x0

    .line 304
    invoke-static/range {v0 .. v9}, Lsh/s;->l(Ly0/o;Lf1/r0;JJFLs0/d;Li0/h0;I)V

    .line 305
    .line 306
    .line 307
    move-object v1, v10

    .line 308
    move-object/from16 v8, v19

    .line 309
    .line 310
    move-object/from16 v4, v21

    .line 311
    .line 312
    move/from16 v5, v22

    .line 313
    .line 314
    move-object/from16 v6, v23

    .line 315
    .line 316
    move/from16 v7, v24

    .line 317
    .line 318
    move-object/from16 v9, v25

    .line 319
    .line 320
    move-wide v10, v2

    .line 321
    goto :goto_8

    .line 322
    :cond_13
    invoke-virtual/range {p13 .. p13}, Li0/h0;->V()V

    .line 323
    .line 324
    .line 325
    move-object/from16 v1, p0

    .line 326
    .line 327
    move-object/from16 v4, p3

    .line 328
    .line 329
    move/from16 v5, p4

    .line 330
    .line 331
    move-object/from16 v6, p5

    .line 332
    .line 333
    move/from16 v7, p6

    .line 334
    .line 335
    move-object/from16 v8, p7

    .line 336
    .line 337
    move-object/from16 v9, p8

    .line 338
    .line 339
    move-wide/from16 v10, p9

    .line 340
    .line 341
    :goto_8
    invoke-virtual/range {p13 .. p13}, Li0/h0;->t()Li0/r1;

    .line 342
    .line 343
    .line 344
    move-result-object v15

    .line 345
    if-eqz v15, :cond_14

    .line 346
    .line 347
    new-instance v0, Lsh/n0;

    .line 348
    .line 349
    move-object/from16 v2, p1

    .line 350
    .line 351
    move-object/from16 v3, p2

    .line 352
    .line 353
    move-object/from16 v13, p12

    .line 354
    .line 355
    move/from16 v14, p14

    .line 356
    .line 357
    invoke-direct/range {v0 .. v14}, Lsh/n0;-><init>(Ly0/o;Ls0/d;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lfg/p;JLp/r1;Ls0/d;I)V

    .line 358
    .line 359
    .line 360
    iput-object v0, v15, Li0/r1;->d:Lfg/p;

    .line 361
    .line 362
    :cond_14
    return-void
.end method

.method public static final b(Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lp/r1;Ls0/d;Li0/h0;I)V
    .locals 27

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
    move-object/from16 v6, p5

    .line 10
    .line 11
    move-object/from16 v8, p7

    .line 12
    .line 13
    move-object/from16 v10, p9

    .line 14
    .line 15
    move-object/from16 v0, p10

    .line 16
    .line 17
    const v5, 0x2f6003e3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v5}, Li0/h0;->b0(I)Li0/h0;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x2

    .line 32
    :goto_0
    or-int v5, p11, v5

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    if-eqz v9, :cond_1

    .line 39
    .line 40
    const/16 v9, 0x20

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v9, 0x10

    .line 44
    .line 45
    :goto_1
    or-int/2addr v5, v9

    .line 46
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-eqz v9, :cond_2

    .line 51
    .line 52
    const/16 v9, 0x100

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v9, 0x80

    .line 56
    .line 57
    :goto_2
    or-int/2addr v5, v9

    .line 58
    invoke-virtual {v0, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_3

    .line 63
    .line 64
    const/16 v9, 0x800

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const/16 v9, 0x400

    .line 68
    .line 69
    :goto_3
    or-int/2addr v5, v9

    .line 70
    move/from16 v9, p4

    .line 71
    .line 72
    invoke-virtual {v0, v9}, Li0/h0;->d(I)Z

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    if-eqz v14, :cond_4

    .line 77
    .line 78
    const/16 v14, 0x4000

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    const/16 v14, 0x2000

    .line 82
    .line 83
    :goto_4
    or-int/2addr v5, v14

    .line 84
    invoke-virtual {v0, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    if-eqz v14, :cond_5

    .line 89
    .line 90
    const/high16 v14, 0x20000

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    const/high16 v14, 0x10000

    .line 94
    .line 95
    :goto_5
    or-int/2addr v5, v14

    .line 96
    move/from16 v14, p6

    .line 97
    .line 98
    invoke-virtual {v0, v14}, Li0/h0;->d(I)Z

    .line 99
    .line 100
    .line 101
    move-result v17

    .line 102
    if-eqz v17, :cond_6

    .line 103
    .line 104
    const/high16 v17, 0x100000

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    const/high16 v17, 0x80000

    .line 108
    .line 109
    :goto_6
    or-int v5, v5, v17

    .line 110
    .line 111
    invoke-virtual {v0, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v17

    .line 115
    const/high16 v12, 0x800000

    .line 116
    .line 117
    if-eqz v17, :cond_7

    .line 118
    .line 119
    move/from16 v17, v12

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_7
    const/high16 v17, 0x400000

    .line 123
    .line 124
    :goto_7
    or-int v5, v5, v17

    .line 125
    .line 126
    move-object/from16 v15, p8

    .line 127
    .line 128
    invoke-virtual {v0, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v20

    .line 132
    if-eqz v20, :cond_8

    .line 133
    .line 134
    const/high16 v20, 0x4000000

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_8
    const/high16 v20, 0x2000000

    .line 138
    .line 139
    :goto_8
    or-int v5, v5, v20

    .line 140
    .line 141
    invoke-virtual {v0, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v20

    .line 145
    if-eqz v20, :cond_9

    .line 146
    .line 147
    const/high16 v20, 0x20000000

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_9
    const/high16 v20, 0x10000000

    .line 151
    .line 152
    :goto_9
    or-int v5, v5, v20

    .line 153
    .line 154
    const v20, 0x12492493

    .line 155
    .line 156
    .line 157
    and-int v13, v5, v20

    .line 158
    .line 159
    const v11, 0x12492492

    .line 160
    .line 161
    .line 162
    if-eq v13, v11, :cond_a

    .line 163
    .line 164
    const/4 v11, 0x1

    .line 165
    goto :goto_a

    .line 166
    :cond_a
    const/4 v11, 0x0

    .line 167
    :goto_a
    and-int/lit8 v13, v5, 0x1

    .line 168
    .line 169
    invoke-virtual {v0, v13, v11}, Li0/h0;->S(IZ)Z

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    if-eqz v11, :cond_26

    .line 174
    .line 175
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    sget-object v13, Li0/l;->a:Li0/e;

    .line 180
    .line 181
    if-ne v11, v13, :cond_b

    .line 182
    .line 183
    new-instance v11, Lsh/o0;

    .line 184
    .line 185
    invoke-direct {v11}, Lsh/o0;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_b
    check-cast v11, Lsh/o0;

    .line 192
    .line 193
    const/high16 v25, 0x1c00000

    .line 194
    .line 195
    and-int v7, v5, v25

    .line 196
    .line 197
    if-ne v7, v12, :cond_c

    .line 198
    .line 199
    const/4 v7, 0x1

    .line 200
    goto :goto_b

    .line 201
    :cond_c
    const/4 v7, 0x0

    .line 202
    :goto_b
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    if-nez v7, :cond_d

    .line 207
    .line 208
    if-ne v12, v13, :cond_e

    .line 209
    .line 210
    :cond_d
    new-instance v7, Lsh/i0;

    .line 211
    .line 212
    const/4 v12, 0x1

    .line 213
    invoke-direct {v7, v12, v8}, Lsh/i0;-><init>(ILfg/p;)V

    .line 214
    .line 215
    .line 216
    new-instance v12, Ls0/d;

    .line 217
    .line 218
    const v8, -0x2f9f84b6

    .line 219
    .line 220
    .line 221
    const/4 v9, 0x1

    .line 222
    invoke-direct {v12, v8, v7, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_e
    check-cast v12, Lfg/p;

    .line 229
    .line 230
    and-int/lit8 v7, v5, 0xe

    .line 231
    .line 232
    const/4 v8, 0x4

    .line 233
    if-ne v7, v8, :cond_f

    .line 234
    .line 235
    const/4 v7, 0x1

    .line 236
    goto :goto_c

    .line 237
    :cond_f
    const/4 v7, 0x0

    .line 238
    :goto_c
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-nez v7, :cond_10

    .line 243
    .line 244
    if-ne v8, v13, :cond_11

    .line 245
    .line 246
    :cond_10
    new-instance v7, Lbi/i;

    .line 247
    .line 248
    const/4 v8, 0x3

    .line 249
    invoke-direct {v7, v1, v8}, Lbi/i;-><init>(Ls0/d;I)V

    .line 250
    .line 251
    .line 252
    new-instance v8, Ls0/d;

    .line 253
    .line 254
    const v9, -0x5a005dba

    .line 255
    .line 256
    .line 257
    const/4 v1, 0x1

    .line 258
    invoke-direct {v8, v9, v7, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_11
    check-cast v8, Lfg/p;

    .line 265
    .line 266
    and-int/lit8 v1, v5, 0x70

    .line 267
    .line 268
    const/16 v7, 0x20

    .line 269
    .line 270
    if-ne v1, v7, :cond_12

    .line 271
    .line 272
    const/4 v1, 0x1

    .line 273
    goto :goto_d

    .line 274
    :cond_12
    const/4 v1, 0x0

    .line 275
    :goto_d
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    if-nez v1, :cond_13

    .line 280
    .line 281
    if-ne v7, v13, :cond_14

    .line 282
    .line 283
    :cond_13
    new-instance v1, Lsh/i0;

    .line 284
    .line 285
    const/4 v7, 0x2

    .line 286
    invoke-direct {v1, v7, v2}, Lsh/i0;-><init>(ILfg/p;)V

    .line 287
    .line 288
    .line 289
    new-instance v7, Ls0/d;

    .line 290
    .line 291
    const v9, -0x25ee9da1

    .line 292
    .line 293
    .line 294
    const/4 v2, 0x1

    .line 295
    invoke-direct {v7, v9, v1, v2}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_14
    check-cast v7, Lfg/p;

    .line 302
    .line 303
    and-int/lit16 v1, v5, 0x1c00

    .line 304
    .line 305
    const/16 v2, 0x800

    .line 306
    .line 307
    if-ne v1, v2, :cond_15

    .line 308
    .line 309
    const/4 v1, 0x1

    .line 310
    goto :goto_e

    .line 311
    :cond_15
    const/4 v1, 0x0

    .line 312
    :goto_e
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-nez v1, :cond_16

    .line 317
    .line 318
    if-ne v2, v13, :cond_17

    .line 319
    .line 320
    :cond_16
    new-instance v1, Lsh/i0;

    .line 321
    .line 322
    const/4 v2, 0x3

    .line 323
    invoke-direct {v1, v2, v4}, Lsh/i0;-><init>(ILfg/p;)V

    .line 324
    .line 325
    .line 326
    new-instance v2, Ls0/d;

    .line 327
    .line 328
    const v9, -0x3ad5c1aa

    .line 329
    .line 330
    .line 331
    const/4 v4, 0x1

    .line 332
    invoke-direct {v2, v9, v1, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :cond_17
    check-cast v2, Lfg/p;

    .line 339
    .line 340
    const/high16 v1, 0x70000

    .line 341
    .line 342
    and-int/2addr v1, v5

    .line 343
    const/high16 v4, 0x20000

    .line 344
    .line 345
    if-ne v1, v4, :cond_18

    .line 346
    .line 347
    const/4 v1, 0x1

    .line 348
    goto :goto_f

    .line 349
    :cond_18
    const/4 v1, 0x0

    .line 350
    :goto_f
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    if-nez v1, :cond_19

    .line 355
    .line 356
    if-ne v4, v13, :cond_1a

    .line 357
    .line 358
    :cond_19
    new-instance v1, Lsh/i0;

    .line 359
    .line 360
    const/4 v4, 0x4

    .line 361
    invoke-direct {v1, v4, v6}, Lsh/i0;-><init>(ILfg/p;)V

    .line 362
    .line 363
    .line 364
    new-instance v4, Ls0/d;

    .line 365
    .line 366
    const v9, -0x5da0fa3f

    .line 367
    .line 368
    .line 369
    const/4 v6, 0x1

    .line 370
    invoke-direct {v4, v9, v1, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    :cond_1a
    check-cast v4, Lfg/p;

    .line 377
    .line 378
    const/high16 v1, 0x70000000

    .line 379
    .line 380
    and-int/2addr v1, v5

    .line 381
    const/high16 v6, 0x20000000

    .line 382
    .line 383
    if-ne v1, v6, :cond_1b

    .line 384
    .line 385
    const/4 v1, 0x1

    .line 386
    goto :goto_10

    .line 387
    :cond_1b
    const/4 v1, 0x0

    .line 388
    :goto_10
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    if-nez v1, :cond_1c

    .line 393
    .line 394
    if-ne v6, v13, :cond_1d

    .line 395
    .line 396
    :cond_1c
    new-instance v1, Lb0/q;

    .line 397
    .line 398
    const/16 v6, 0xe

    .line 399
    .line 400
    invoke-direct {v1, v10, v6, v11}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    new-instance v6, Ls0/d;

    .line 404
    .line 405
    const v9, 0x6f26b3e3

    .line 406
    .line 407
    .line 408
    const/4 v10, 0x1

    .line 409
    invoke-direct {v6, v9, v1, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :cond_1d
    check-cast v6, Lfg/p;

    .line 416
    .line 417
    and-int/lit16 v1, v5, 0x380

    .line 418
    .line 419
    const/16 v9, 0x100

    .line 420
    .line 421
    if-ne v1, v9, :cond_1e

    .line 422
    .line 423
    const/4 v9, 0x1

    .line 424
    goto :goto_11

    .line 425
    :cond_1e
    const/4 v9, 0x0

    .line 426
    :goto_11
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    if-nez v9, :cond_20

    .line 431
    .line 432
    if-ne v1, v13, :cond_1f

    .line 433
    .line 434
    goto :goto_12

    .line 435
    :cond_1f
    const/4 v3, 0x1

    .line 436
    goto :goto_13

    .line 437
    :cond_20
    :goto_12
    new-instance v1, Lsh/i0;

    .line 438
    .line 439
    const/4 v9, 0x0

    .line 440
    invoke-direct {v1, v9, v3}, Lsh/i0;-><init>(ILfg/p;)V

    .line 441
    .line 442
    .line 443
    new-instance v9, Ls0/d;

    .line 444
    .line 445
    const v10, -0x473f70f2

    .line 446
    .line 447
    .line 448
    const/4 v3, 0x1

    .line 449
    invoke-direct {v9, v10, v1, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    move-object v1, v9

    .line 456
    :goto_13
    check-cast v1, Lfg/p;

    .line 457
    .line 458
    const/high16 v9, 0xe000000

    .line 459
    .line 460
    and-int/2addr v9, v5

    .line 461
    const/high16 v10, 0x4000000

    .line 462
    .line 463
    if-ne v9, v10, :cond_21

    .line 464
    .line 465
    move v9, v3

    .line 466
    goto :goto_14

    .line 467
    :cond_21
    const/4 v9, 0x0

    .line 468
    :goto_14
    invoke-virtual {v0, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    or-int/2addr v9, v10

    .line 473
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    or-int/2addr v9, v10

    .line 478
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    or-int/2addr v9, v10

    .line 483
    invoke-virtual {v0, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    or-int/2addr v9, v10

    .line 488
    const v10, 0xe000

    .line 489
    .line 490
    .line 491
    and-int/2addr v10, v5

    .line 492
    const/16 v3, 0x4000

    .line 493
    .line 494
    if-ne v10, v3, :cond_22

    .line 495
    .line 496
    const/4 v3, 0x1

    .line 497
    goto :goto_15

    .line 498
    :cond_22
    const/4 v3, 0x0

    .line 499
    :goto_15
    or-int/2addr v3, v9

    .line 500
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v9

    .line 504
    or-int/2addr v3, v9

    .line 505
    invoke-virtual {v0, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    or-int/2addr v3, v9

    .line 510
    invoke-virtual {v0, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v9

    .line 514
    or-int/2addr v3, v9

    .line 515
    const/high16 v9, 0x380000

    .line 516
    .line 517
    and-int/2addr v5, v9

    .line 518
    const/high16 v9, 0x100000

    .line 519
    .line 520
    if-ne v5, v9, :cond_23

    .line 521
    .line 522
    const/16 v26, 0x1

    .line 523
    .line 524
    goto :goto_16

    .line 525
    :cond_23
    const/16 v26, 0x0

    .line 526
    .line 527
    :goto_16
    or-int v3, v3, v26

    .line 528
    .line 529
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    if-nez v3, :cond_24

    .line 534
    .line 535
    if-ne v5, v13, :cond_25

    .line 536
    .line 537
    :cond_24
    new-instance v14, Lsh/j0;

    .line 538
    .line 539
    move/from16 v20, p4

    .line 540
    .line 541
    move/from16 v25, p6

    .line 542
    .line 543
    move-object/from16 v21, v1

    .line 544
    .line 545
    move-object/from16 v19, v2

    .line 546
    .line 547
    move-object/from16 v22, v4

    .line 548
    .line 549
    move-object/from16 v24, v6

    .line 550
    .line 551
    move-object/from16 v18, v7

    .line 552
    .line 553
    move-object/from16 v17, v8

    .line 554
    .line 555
    move-object/from16 v23, v11

    .line 556
    .line 557
    move-object/from16 v16, v12

    .line 558
    .line 559
    invoke-direct/range {v14 .. v25}, Lsh/j0;-><init>(Lp/r1;Lfg/p;Lfg/p;Lfg/p;Lfg/p;ILfg/p;Lfg/p;Lsh/o0;Lfg/p;I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    move-object v5, v14

    .line 566
    :cond_25
    check-cast v5, Lfg/p;

    .line 567
    .line 568
    const/4 v1, 0x0

    .line 569
    const/4 v2, 0x0

    .line 570
    invoke-static {v1, v5, v0, v2}, Lv1/w;->b(Ly0/o;Lfg/p;Li0/h0;I)V

    .line 571
    .line 572
    .line 573
    goto :goto_17

    .line 574
    :cond_26
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 575
    .line 576
    .line 577
    :goto_17
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 578
    .line 579
    .line 580
    move-result-object v12

    .line 581
    if-eqz v12, :cond_27

    .line 582
    .line 583
    new-instance v0, Lsh/k0;

    .line 584
    .line 585
    move-object/from16 v1, p0

    .line 586
    .line 587
    move-object/from16 v2, p1

    .line 588
    .line 589
    move-object/from16 v3, p2

    .line 590
    .line 591
    move-object/from16 v4, p3

    .line 592
    .line 593
    move/from16 v5, p4

    .line 594
    .line 595
    move-object/from16 v6, p5

    .line 596
    .line 597
    move/from16 v7, p6

    .line 598
    .line 599
    move-object/from16 v8, p7

    .line 600
    .line 601
    move-object/from16 v9, p8

    .line 602
    .line 603
    move-object/from16 v10, p9

    .line 604
    .line 605
    move/from16 v11, p11

    .line 606
    .line 607
    invoke-direct/range {v0 .. v11}, Lsh/k0;-><init>(Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lp/r1;Ls0/d;I)V

    .line 608
    .line 609
    .line 610
    iput-object v0, v12, Li0/r1;->d:Lfg/p;

    .line 611
    .line 612
    :cond_27
    return-void
.end method
