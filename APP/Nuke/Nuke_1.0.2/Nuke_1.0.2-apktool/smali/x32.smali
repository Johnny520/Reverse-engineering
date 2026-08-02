.class public abstract Lx32;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ls30;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lmi1;->b:Ls30;

    .line 2
    .line 3
    sput-object v0, Lx32;->a:Ls30;

    .line 4
    .line 5
    return-void
.end method

.method public static final a(Luh1;JFJIFLpx;I)V
    .locals 20

    .line 1
    move-wide/from16 v10, p1

    .line 2
    .line 3
    move-object/from16 v12, p8

    .line 4
    .line 5
    check-cast v12, Lgo0;

    .line 6
    .line 7
    const v0, 0x13db87c1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v12, v0}, Lgo0;->X(I)Lgo0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v12, v10, v11}, Lgo0;->e(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0x10

    .line 23
    .line 24
    :goto_0
    or-int v0, p9, v0

    .line 25
    .line 26
    const v2, 0x36400

    .line 27
    .line 28
    .line 29
    or-int/2addr v0, v2

    .line 30
    const v2, 0x12493

    .line 31
    .line 32
    .line 33
    and-int/2addr v2, v0

    .line 34
    const v3, 0x12492

    .line 35
    .line 36
    .line 37
    const/4 v13, 0x0

    .line 38
    if-eq v2, v3, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v2, v13

    .line 43
    :goto_1
    and-int/lit8 v3, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {v12, v3, v2}, Lgo0;->O(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_a

    .line 50
    .line 51
    invoke-virtual {v12}, Lgo0;->T()V

    .line 52
    .line 53
    .line 54
    and-int/lit8 v2, p9, 0x1

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {v12}, Lgo0;->y()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v12}, Lgo0;->R()V

    .line 66
    .line 67
    .line 68
    and-int/lit16 v0, v0, -0x1c01

    .line 69
    .line 70
    move-wide/from16 v7, p4

    .line 71
    .line 72
    move/from16 v17, p6

    .line 73
    .line 74
    move/from16 v3, p7

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    :goto_2
    sget-wide v2, Lju;->f:J

    .line 78
    .line 79
    and-int/lit16 v0, v0, -0x1c01

    .line 80
    .line 81
    const/high16 v5, 0x40800000    # 4.0f

    .line 82
    .line 83
    move-wide v7, v2

    .line 84
    move v3, v5

    .line 85
    const/16 v17, 0x1

    .line 86
    .line 87
    :goto_3
    invoke-virtual {v12}, Lgo0;->q()V

    .line 88
    .line 89
    .line 90
    sget-object v2, Lly;->h:Ltu2;

    .line 91
    .line 92
    invoke-virtual {v12, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Le70;

    .line 97
    .line 98
    new-instance v9, Lxv2;

    .line 99
    .line 100
    move/from16 v5, p3

    .line 101
    .line 102
    invoke-interface {v2, v5}, Le70;->A(F)F

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/16 v19, 0x1a

    .line 109
    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    move-object v14, v9

    .line 113
    invoke-direct/range {v14 .. v19}, Lxv2;-><init>(FFIII)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v6, Lnx;->a:Leb;

    .line 121
    .line 122
    if-ne v2, v6, :cond_4

    .line 123
    .line 124
    new-instance v2, Lcz0;

    .line 125
    .line 126
    invoke-direct {v2}, Lcz0;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    check-cast v2, Lcz0;

    .line 133
    .line 134
    invoke-virtual {v2, v13, v12}, Lcz0;->a(ILpx;)V

    .line 135
    .line 136
    .line 137
    sget-object v14, Lhd0;->b:Lc80;

    .line 138
    .line 139
    const/16 v15, 0x1770

    .line 140
    .line 141
    const/4 v13, 0x2

    .line 142
    invoke-static {v15, v14, v13}, Lup0;->J(ILgd0;I)Lm43;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    new-instance v14, Lzy0;

    .line 147
    .line 148
    invoke-direct {v14, v13}, Lzy0;-><init>(Lbd0;)V

    .line 149
    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const/high16 v1, 0x44870000    # 1080.0f

    .line 153
    .line 154
    invoke-static {v2, v13, v1, v14, v12}, Lop0;->i(Lcz0;FFLzy0;Lpx;)Laz0;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v14, Leq1;

    .line 159
    .line 160
    const/16 v4, 0xe

    .line 161
    .line 162
    invoke-direct {v14, v4}, Leq1;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v14}, Lup0;->A(Lin0;)Lq51;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    new-instance v14, Lzy0;

    .line 170
    .line 171
    invoke-direct {v14, v4}, Lzy0;-><init>(Lbd0;)V

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x43b40000    # 360.0f

    .line 175
    .line 176
    invoke-static {v2, v13, v4, v14, v12}, Lop0;->i(Lcz0;FFLzy0;Lpx;)Laz0;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    new-instance v13, Lq51;

    .line 181
    .line 182
    new-instance v14, Lp51;

    .line 183
    .line 184
    invoke-direct {v14}, Lp51;-><init>()V

    .line 185
    .line 186
    .line 187
    iput v15, v14, Lp51;->a:I

    .line 188
    .line 189
    const p5, 0x3f5eb852    # 0.87f

    .line 190
    .line 191
    .line 192
    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    move/from16 p6, v0

    .line 197
    .line 198
    const/16 v0, 0xbb8

    .line 199
    .line 200
    invoke-virtual {v14, v15, v0}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    sget-object v15, Lx32;->a:Ls30;

    .line 205
    .line 206
    iput-object v15, v0, Lo51;->b:Lgd0;

    .line 207
    .line 208
    const v0, 0x3dcccccd    # 0.1f

    .line 209
    .line 210
    .line 211
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    const/16 v0, 0x1770

    .line 216
    .line 217
    invoke-virtual {v14, v15, v0}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 218
    .line 219
    .line 220
    invoke-direct {v13, v14}, Lq51;-><init>(Lp51;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lzy0;

    .line 224
    .line 225
    invoke-direct {v0, v13}, Lzy0;-><init>(Lbd0;)V

    .line 226
    .line 227
    .line 228
    move/from16 v13, p5

    .line 229
    .line 230
    const v14, 0x3dcccccd    # 0.1f

    .line 231
    .line 232
    .line 233
    invoke-static {v2, v14, v13, v0, v12}, Lop0;->i(Lcz0;FFLzy0;Lpx;)Laz0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v2, Leq1;

    .line 238
    .line 239
    const/16 v13, 0xf

    .line 240
    .line 241
    invoke-direct {v2, v13}, Leq1;-><init>(I)V

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x1

    .line 245
    move-object/from16 v13, p0

    .line 246
    .line 247
    invoke-static {v13, v14, v2}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const/high16 v15, 0x42200000    # 40.0f

    .line 252
    .line 253
    invoke-static {v2, v15}, Lte;->g0(Luh1;F)Luh1;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    invoke-virtual {v12, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-virtual {v12, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v18

    .line 265
    or-int v2, v2, v18

    .line 266
    .line 267
    invoke-virtual {v12, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v18

    .line 271
    or-int v2, v2, v18

    .line 272
    .line 273
    invoke-virtual {v12, v7, v8}, Lgo0;->e(J)Z

    .line 274
    .line 275
    .line 276
    move-result v18

    .line 277
    or-int v2, v2, v18

    .line 278
    .line 279
    invoke-virtual {v12, v9}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v18

    .line 283
    or-int v2, v2, v18

    .line 284
    .line 285
    and-int/lit8 v18, p6, 0x70

    .line 286
    .line 287
    xor-int/lit8 v14, v18, 0x30

    .line 288
    .line 289
    move-object/from16 p4, v0

    .line 290
    .line 291
    const/16 v0, 0x20

    .line 292
    .line 293
    if-le v14, v0, :cond_5

    .line 294
    .line 295
    invoke-virtual {v12, v10, v11}, Lgo0;->e(J)Z

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    if-nez v14, :cond_6

    .line 300
    .line 301
    :cond_5
    and-int/lit8 v14, p6, 0x30

    .line 302
    .line 303
    if-ne v14, v0, :cond_7

    .line 304
    .line 305
    :cond_6
    const/16 v19, 0x1

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_7
    const/16 v19, 0x0

    .line 309
    .line 310
    :goto_4
    or-int v0, v2, v19

    .line 311
    .line 312
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-nez v0, :cond_8

    .line 317
    .line 318
    if-ne v2, v6, :cond_9

    .line 319
    .line 320
    :cond_8
    new-instance v0, Lv32;

    .line 321
    .line 322
    move-object v6, v4

    .line 323
    move v4, v5

    .line 324
    move/from16 v2, v17

    .line 325
    .line 326
    move-object v5, v1

    .line 327
    move-object/from16 v1, p4

    .line 328
    .line 329
    invoke-direct/range {v0 .. v11}, Lv32;-><init>(Laz0;IFFLaz0;Laz0;JLxv2;J)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    move-object v2, v0

    .line 336
    :cond_9
    check-cast v2, Lin0;

    .line 337
    .line 338
    const/4 v0, 0x0

    .line 339
    invoke-static {v15, v2, v12, v0}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 340
    .line 341
    .line 342
    move-wide v5, v7

    .line 343
    move/from16 v7, v17

    .line 344
    .line 345
    move v8, v3

    .line 346
    goto :goto_5

    .line 347
    :cond_a
    move-object/from16 v13, p0

    .line 348
    .line 349
    invoke-virtual {v12}, Lgo0;->R()V

    .line 350
    .line 351
    .line 352
    move-wide/from16 v5, p4

    .line 353
    .line 354
    move/from16 v7, p6

    .line 355
    .line 356
    move/from16 v8, p7

    .line 357
    .line 358
    :goto_5
    invoke-virtual {v12}, Lgo0;->r()Lb62;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    if-eqz v10, :cond_b

    .line 363
    .line 364
    new-instance v0, Lw32;

    .line 365
    .line 366
    move-wide/from16 v2, p1

    .line 367
    .line 368
    move/from16 v4, p3

    .line 369
    .line 370
    move/from16 v9, p9

    .line 371
    .line 372
    move-object v1, v13

    .line 373
    invoke-direct/range {v0 .. v9}, Lw32;-><init>(Luh1;JFJIFI)V

    .line 374
    .line 375
    .line 376
    iput-object v0, v10, Lb62;->d:Lmn0;

    .line 377
    .line 378
    :cond_b
    return-void
.end method

.method public static final b(Lxm0;Luh1;JJIFLin0;Lpx;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p9

    .line 4
    .line 5
    check-cast v0, Lgo0;

    .line 6
    .line 7
    const v2, -0x144387f6

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lgo0;->X(I)Lgo0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x4

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    move v2, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x2

    .line 23
    :goto_0
    or-int v2, p10, v2

    .line 24
    .line 25
    const v4, 0xb6480

    .line 26
    .line 27
    .line 28
    or-int/2addr v2, v4

    .line 29
    const v4, 0x92493

    .line 30
    .line 31
    .line 32
    and-int/2addr v4, v2

    .line 33
    const v5, 0x92492

    .line 34
    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    if-eq v4, v5, :cond_1

    .line 38
    .line 39
    move v4, v7

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    :goto_1
    and-int/lit8 v5, v2, 0x1

    .line 43
    .line 44
    invoke-virtual {v0, v5, v4}, Lgo0;->O(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_d

    .line 49
    .line 50
    invoke-virtual {v0}, Lgo0;->T()V

    .line 51
    .line 52
    .line 53
    and-int/lit8 v4, p10, 0x1

    .line 54
    .line 55
    const/high16 v5, 0x40800000    # 4.0f

    .line 56
    .line 57
    const v8, -0x381f81

    .line 58
    .line 59
    .line 60
    sget-object v9, Lnx;->a:Leb;

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0}, Lgo0;->y()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-virtual {v0}, Lgo0;->R()V

    .line 72
    .line 73
    .line 74
    and-int/2addr v2, v8

    .line 75
    move-wide/from16 v10, p2

    .line 76
    .line 77
    move-wide/from16 v12, p4

    .line 78
    .line 79
    move/from16 v15, p6

    .line 80
    .line 81
    move/from16 v16, p7

    .line 82
    .line 83
    move-object/from16 v4, p8

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    :goto_2
    sget-object v4, Leu;->l:Lqu;

    .line 87
    .line 88
    invoke-static {v4, v0}, Lru;->b(Lqu;Lpx;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v10

    .line 92
    sget-object v4, Leu;->m:Lqu;

    .line 93
    .line 94
    invoke-static {v4, v0}, Lru;->b(Lqu;Lpx;)J

    .line 95
    .line 96
    .line 97
    move-result-wide v12

    .line 98
    invoke-virtual {v0, v10, v11}, Lgo0;->e(J)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v14

    .line 106
    if-nez v4, :cond_4

    .line 107
    .line 108
    if-ne v14, v9, :cond_5

    .line 109
    .line 110
    :cond_4
    new-instance v14, Lc8;

    .line 111
    .line 112
    const/16 v4, 0x8

    .line 113
    .line 114
    invoke-direct {v14, v10, v11, v4}, Lc8;-><init>(JI)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    move-object v4, v14

    .line 121
    check-cast v4, Lin0;

    .line 122
    .line 123
    and-int/2addr v2, v8

    .line 124
    move/from16 v16, v5

    .line 125
    .line 126
    move v15, v7

    .line 127
    :goto_3
    invoke-virtual {v0}, Lgo0;->q()V

    .line 128
    .line 129
    .line 130
    and-int/lit8 v2, v2, 0xe

    .line 131
    .line 132
    if-ne v2, v3, :cond_6

    .line 133
    .line 134
    move v2, v7

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    const/4 v2, 0x0

    .line 137
    :goto_4
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v2, :cond_7

    .line 142
    .line 143
    if-ne v3, v9, :cond_8

    .line 144
    .line 145
    :cond_7
    new-instance v3, Lxr0;

    .line 146
    .line 147
    invoke-direct {v3, v1, v7}, Lxr0;-><init>(Lxm0;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_8
    check-cast v3, Lxm0;

    .line 154
    .line 155
    sget-object v2, Lp4;->a:Luh1;

    .line 156
    .line 157
    move-object/from16 v8, p1

    .line 158
    .line 159
    invoke-interface {v8, v2}, Luh1;->c(Luh1;)Luh1;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-nez v14, :cond_9

    .line 172
    .line 173
    if-ne v6, v9, :cond_a

    .line 174
    .line 175
    :cond_9
    new-instance v6, Lgp1;

    .line 176
    .line 177
    invoke-direct {v6, v3, v7}, Lgp1;-><init>(Lxm0;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_a
    check-cast v6, Lin0;

    .line 184
    .line 185
    invoke-static {v2, v7, v6}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const/high16 v6, 0x43700000    # 240.0f

    .line 190
    .line 191
    invoke-static {v2, v6, v5}, Lte;->h0(Luh1;FF)Luh1;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v0, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    invoke-virtual {v0, v12, v13}, Lgo0;->e(J)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    or-int/2addr v5, v6

    .line 204
    invoke-virtual {v0, v10, v11}, Lgo0;->e(J)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    or-int/2addr v5, v6

    .line 209
    invoke-virtual {v0, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    or-int/2addr v5, v6

    .line 214
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    if-nez v5, :cond_c

    .line 219
    .line 220
    if-ne v6, v9, :cond_b

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_b
    move-object/from16 v22, v4

    .line 224
    .line 225
    move-wide/from16 v20, v10

    .line 226
    .line 227
    move-wide/from16 v18, v12

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_c
    :goto_5
    new-instance v14, Lt32;

    .line 231
    .line 232
    move-object/from16 v17, v3

    .line 233
    .line 234
    move-object/from16 v22, v4

    .line 235
    .line 236
    move-wide/from16 v20, v10

    .line 237
    .line 238
    move-wide/from16 v18, v12

    .line 239
    .line 240
    invoke-direct/range {v14 .. v22}, Lt32;-><init>(IFLxm0;JJLin0;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    move-object v6, v14

    .line 247
    :goto_6
    check-cast v6, Lin0;

    .line 248
    .line 249
    const/4 v3, 0x0

    .line 250
    invoke-static {v2, v6, v0, v3}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 251
    .line 252
    .line 253
    move v7, v15

    .line 254
    move/from16 v8, v16

    .line 255
    .line 256
    move-wide/from16 v5, v18

    .line 257
    .line 258
    move-wide/from16 v3, v20

    .line 259
    .line 260
    move-object/from16 v9, v22

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_d
    move-object/from16 v8, p1

    .line 264
    .line 265
    invoke-virtual {v0}, Lgo0;->R()V

    .line 266
    .line 267
    .line 268
    move-wide/from16 v3, p2

    .line 269
    .line 270
    move-wide/from16 v5, p4

    .line 271
    .line 272
    move/from16 v7, p6

    .line 273
    .line 274
    move/from16 v8, p7

    .line 275
    .line 276
    move-object/from16 v9, p8

    .line 277
    .line 278
    :goto_7
    invoke-virtual {v0}, Lgo0;->r()Lb62;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    if-eqz v11, :cond_e

    .line 283
    .line 284
    new-instance v0, Lu32;

    .line 285
    .line 286
    move-object/from16 v2, p1

    .line 287
    .line 288
    move/from16 v10, p10

    .line 289
    .line 290
    invoke-direct/range {v0 .. v10}, Lu32;-><init>(Lxm0;Luh1;JJIFLin0;I)V

    .line 291
    .line 292
    .line 293
    iput-object v0, v11, Lb62;->d:Lmn0;

    .line 294
    .line 295
    :cond_e
    return-void
.end method

.method public static final c(Lnc0;FFJLxv2;)V
    .locals 10

    .line 1
    iget v0, p5, Lxv2;->h:F

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    div-float/2addr v0, v1

    .line 6
    invoke-interface {p0}, Lnc0;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    shr-long/2addr v2, v4

    .line 13
    long-to-int v2, v2

    .line 14
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    mul-float/2addr v1, v0

    .line 19
    sub-float/2addr v2, v1

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-long v5, v1

    .line 25
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-long v0, v0

    .line 30
    shl-long/2addr v5, v4

    .line 31
    const-wide v7, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v0, v7

    .line 37
    or-long/2addr v5, v0

    .line 38
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    int-to-long v2, v2

    .line 48
    shl-long/2addr v0, v4

    .line 49
    and-long/2addr v2, v7

    .line 50
    or-long v7, v0, v2

    .line 51
    .line 52
    move-object v0, p0

    .line 53
    move v3, p1

    .line 54
    move v4, p2

    .line 55
    move-wide v1, p3

    .line 56
    move-object v9, p5

    .line 57
    invoke-interface/range {v0 .. v9}, Lnc0;->z0(JFFJJLop0;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static final d(Lnc0;FFJFI)V
    .locals 21

    .line 1
    invoke-interface/range {p0 .. p0}, Lnc0;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface/range {p0 .. p0}, Lnc0;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide v5, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v3, v5

    .line 23
    long-to-int v1, v3

    .line 24
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v3, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float v4, v1, v3

    .line 31
    .line 32
    invoke-interface/range {p0 .. p0}, Lnc0;->getLayoutDirection()Ld61;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    sget-object v8, Ld61;->h:Ld61;

    .line 37
    .line 38
    if-ne v7, v8, :cond_0

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v7, 0x0

    .line 43
    :goto_0
    const/high16 v8, 0x3f800000    # 1.0f

    .line 44
    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    move/from16 v9, p1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sub-float v9, v8, p2

    .line 51
    .line 52
    :goto_1
    mul-float/2addr v9, v0

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    move/from16 v8, p2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    sub-float v8, v8, p1

    .line 59
    .line 60
    :goto_2
    mul-float/2addr v8, v0

    .line 61
    if-nez p6, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    cmpl-float v1, v1, v0

    .line 65
    .line 66
    if-lez v1, :cond_4

    .line 67
    .line 68
    :goto_3
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-long v0, v0

    .line 73
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    int-to-long v9, v3

    .line 78
    shl-long/2addr v0, v2

    .line 79
    and-long/2addr v9, v5

    .line 80
    or-long v14, v0, v9

    .line 81
    .line 82
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    int-to-long v0, v0

    .line 87
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    int-to-long v3, v3

    .line 92
    shl-long/2addr v0, v2

    .line 93
    and-long v2, v3, v5

    .line 94
    .line 95
    or-long v16, v0, v2

    .line 96
    .line 97
    const/16 v19, 0x0

    .line 98
    .line 99
    const/16 v20, 0x1f0

    .line 100
    .line 101
    move-object/from16 v11, p0

    .line 102
    .line 103
    move-wide/from16 v12, p3

    .line 104
    .line 105
    move/from16 v18, p5

    .line 106
    .line 107
    invoke-static/range {v11 .. v20}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    div-float v1, p5, v3

    .line 112
    .line 113
    sub-float/2addr v0, v1

    .line 114
    cmpg-float v3, v9, v1

    .line 115
    .line 116
    if-gez v3, :cond_5

    .line 117
    .line 118
    move v9, v1

    .line 119
    :cond_5
    cmpl-float v3, v9, v0

    .line 120
    .line 121
    if-lez v3, :cond_6

    .line 122
    .line 123
    move v9, v0

    .line 124
    :cond_6
    cmpg-float v3, v8, v1

    .line 125
    .line 126
    if-gez v3, :cond_7

    .line 127
    .line 128
    move v8, v1

    .line 129
    :cond_7
    cmpl-float v1, v8, v0

    .line 130
    .line 131
    if-lez v1, :cond_8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    move v0, v8

    .line 135
    :goto_4
    sub-float v1, p2, p1

    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    const/4 v3, 0x0

    .line 142
    cmpl-float v1, v1, v3

    .line 143
    .line 144
    if-lez v1, :cond_9

    .line 145
    .line 146
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    int-to-long v7, v1

    .line 151
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    int-to-long v9, v1

    .line 156
    shl-long/2addr v7, v2

    .line 157
    and-long/2addr v9, v5

    .line 158
    or-long/2addr v7, v9

    .line 159
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    int-to-long v0, v0

    .line 164
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    int-to-long v3, v3

    .line 169
    shl-long/2addr v0, v2

    .line 170
    and-long v2, v3, v5

    .line 171
    .line 172
    or-long v5, v0, v2

    .line 173
    .line 174
    const/16 v9, 0x1e0

    .line 175
    .line 176
    move-object/from16 v0, p0

    .line 177
    .line 178
    move-wide/from16 v1, p3

    .line 179
    .line 180
    move-wide v3, v7

    .line 181
    move/from16 v7, p5

    .line 182
    .line 183
    move/from16 v8, p6

    .line 184
    .line 185
    invoke-static/range {v0 .. v9}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 186
    .line 187
    .line 188
    :cond_9
    return-void
.end method
