.class public abstract Loz;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lpe0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lme0;->a:Lme0;

    .line 2
    .line 3
    sget v1, Lz60;->a:F

    .line 4
    .line 5
    invoke-static {v0, v1}, Ls11;->c(Lpe0;F)Lpe0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Loz;->a:Lpe0;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lr00;Ljava/lang/String;Lpe0;JLji;II)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p6

    .line 4
    .line 5
    move-object/from16 v12, p5

    .line 6
    .line 7
    check-cast v12, Lpi;

    .line 8
    .line 9
    const v0, -0x79033cc

    .line 10
    .line 11
    .line 12
    invoke-virtual {v12, v0}, Lpi;->X(I)Lpi;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v12, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int/2addr v0, v6

    .line 25
    and-int/lit8 v2, p7, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    or-int/lit16 v0, v0, 0x180

    .line 30
    .line 31
    :cond_1
    move-object/from16 v3, p2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    and-int/lit16 v3, v6, 0x180

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    move-object/from16 v3, p2

    .line 39
    .line 40
    invoke-virtual {v12, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    const/16 v4, 0x100

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/16 v4, 0x80

    .line 50
    .line 51
    :goto_1
    or-int/2addr v0, v4

    .line 52
    :goto_2
    and-int/lit8 v4, p7, 0x8

    .line 53
    .line 54
    if-nez v4, :cond_4

    .line 55
    .line 56
    move-wide/from16 v4, p3

    .line 57
    .line 58
    invoke-virtual {v12, v4, v5}, Lpi;->e(J)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_5

    .line 63
    .line 64
    const/16 v7, 0x800

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move-wide/from16 v4, p3

    .line 68
    .line 69
    :cond_5
    const/16 v7, 0x400

    .line 70
    .line 71
    :goto_3
    or-int/2addr v0, v7

    .line 72
    and-int/lit16 v7, v0, 0x493

    .line 73
    .line 74
    const/16 v8, 0x492

    .line 75
    .line 76
    if-eq v7, v8, :cond_6

    .line 77
    .line 78
    const/4 v7, 0x1

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/4 v7, 0x0

    .line 81
    :goto_4
    and-int/lit8 v8, v0, 0x1

    .line 82
    .line 83
    invoke-virtual {v12, v8, v7}, Lpi;->O(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_11

    .line 88
    .line 89
    invoke-virtual {v12}, Lpi;->T()V

    .line 90
    .line 91
    .line 92
    and-int/lit8 v7, v6, 0x1

    .line 93
    .line 94
    if-eqz v7, :cond_9

    .line 95
    .line 96
    invoke-virtual {v12}, Lpi;->y()Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_7

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_7
    invoke-virtual {v12}, Lpi;->R()V

    .line 104
    .line 105
    .line 106
    and-int/lit8 v2, p7, 0x8

    .line 107
    .line 108
    if-eqz v2, :cond_8

    .line 109
    .line 110
    and-int/lit16 v0, v0, -0x1c01

    .line 111
    .line 112
    :cond_8
    move-object v9, v3

    .line 113
    :goto_5
    move-wide v10, v4

    .line 114
    goto :goto_8

    .line 115
    :cond_9
    :goto_6
    if-eqz v2, :cond_a

    .line 116
    .line 117
    sget-object v2, Lme0;->a:Lme0;

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_a
    move-object v2, v3

    .line 121
    :goto_7
    and-int/lit8 v3, p7, 0x8

    .line 122
    .line 123
    if-eqz v3, :cond_b

    .line 124
    .line 125
    sget-object v3, Lxj;->a:Lej;

    .line 126
    .line 127
    invoke-virtual {v12, v3}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Lff;

    .line 132
    .line 133
    iget-wide v3, v3, Lff;->a:J

    .line 134
    .line 135
    and-int/lit16 v0, v0, -0x1c01

    .line 136
    .line 137
    move-object v9, v2

    .line 138
    move-wide v10, v3

    .line 139
    goto :goto_8

    .line 140
    :cond_b
    move-object v9, v2

    .line 141
    goto :goto_5

    .line 142
    :goto_8
    invoke-virtual {v12}, Lpi;->q()V

    .line 143
    .line 144
    .line 145
    sget-object v2, Ldj;->h:Lg41;

    .line 146
    .line 147
    invoke-virtual {v12, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Lym;

    .line 152
    .line 153
    iget v3, v1, Lr00;->i:I

    .line 154
    .line 155
    int-to-float v3, v3

    .line 156
    invoke-interface {v2}, Lym;->b()F

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    int-to-long v7, v3

    .line 165
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    int-to-long v3, v3

    .line 170
    const/16 v5, 0x20

    .line 171
    .line 172
    shl-long/2addr v7, v5

    .line 173
    const-wide v13, 0xffffffffL

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    and-long/2addr v3, v13

    .line 179
    or-long/2addr v3, v7

    .line 180
    invoke-virtual {v12, v3, v4}, Lpi;->e(J)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-virtual {v12}, Lpi;->L()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    if-nez v3, :cond_c

    .line 189
    .line 190
    sget-object v3, Lii;->a:Lr3;

    .line 191
    .line 192
    if-ne v4, v3, :cond_10

    .line 193
    .line 194
    :cond_c
    new-instance v3, Lay;

    .line 195
    .line 196
    invoke-direct {v3}, Lay;-><init>()V

    .line 197
    .line 198
    .line 199
    iget-object v4, v1, Lr00;->f:Lhb1;

    .line 200
    .line 201
    invoke-static {v3, v4}, Lv50;->h(Lay;Lhb1;)V

    .line 202
    .line 203
    .line 204
    iget v4, v1, Lr00;->b:F

    .line 205
    .line 206
    iget v7, v1, Lr00;->c:F

    .line 207
    .line 208
    invoke-interface {v2, v4}, Lym;->p(F)F

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-interface {v2, v7}, Lym;->p(F)F

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    int-to-long v7, v4

    .line 221
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    move/from16 p2, v5

    .line 226
    .line 227
    int-to-long v5, v2

    .line 228
    shl-long v7, v7, p2

    .line 229
    .line 230
    and-long v4, v5, v13

    .line 231
    .line 232
    or-long/2addr v4, v7

    .line 233
    iget v2, v1, Lr00;->d:F

    .line 234
    .line 235
    iget v6, v1, Lr00;->e:F

    .line 236
    .line 237
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_d

    .line 242
    .line 243
    shr-long v7, v4, p2

    .line 244
    .line 245
    long-to-int v2, v7

    .line 246
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    :cond_d
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_e

    .line 255
    .line 256
    and-long v6, v4, v13

    .line 257
    .line 258
    long-to-int v6, v6

    .line 259
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    :cond_e
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    int-to-long v7, v2

    .line 268
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    move-wide/from16 p3, v13

    .line 273
    .line 274
    int-to-long v13, v2

    .line 275
    shl-long v6, v7, p2

    .line 276
    .line 277
    and-long v13, v13, p3

    .line 278
    .line 279
    or-long/2addr v6, v13

    .line 280
    new-instance v2, Lkb1;

    .line 281
    .line 282
    invoke-direct {v2, v3}, Lkb1;-><init>(Lay;)V

    .line 283
    .line 284
    .line 285
    iget-object v3, v1, Lr00;->a:Ljava/lang/String;

    .line 286
    .line 287
    iget-wide v13, v1, Lr00;->g:J

    .line 288
    .line 289
    iget v8, v1, Lr00;->h:I

    .line 290
    .line 291
    const-wide/16 v15, 0x10

    .line 292
    .line 293
    cmp-long v15, v13, v15

    .line 294
    .line 295
    if-eqz v15, :cond_f

    .line 296
    .line 297
    new-instance v15, Lja;

    .line 298
    .line 299
    invoke-direct {v15, v8, v13, v14}, Lja;-><init>(IJ)V

    .line 300
    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_f
    const/4 v15, 0x0

    .line 304
    :goto_9
    new-instance v8, Lq11;

    .line 305
    .line 306
    invoke-direct {v8, v4, v5}, Lq11;-><init>(J)V

    .line 307
    .line 308
    .line 309
    iget-object v4, v2, Lkb1;->e:Lgp0;

    .line 310
    .line 311
    invoke-virtual {v4, v8}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object v4, v2, Lkb1;->f:Lgp0;

    .line 315
    .line 316
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 317
    .line 318
    invoke-virtual {v4, v5}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    iget-object v4, v2, Lkb1;->g:Lfb1;

    .line 322
    .line 323
    iget-object v5, v4, Lfb1;->g:Lgp0;

    .line 324
    .line 325
    invoke-virtual {v5, v15}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    iget-object v5, v4, Lfb1;->i:Lgp0;

    .line 329
    .line 330
    new-instance v8, Lq11;

    .line 331
    .line 332
    invoke-direct {v8, v6, v7}, Lq11;-><init>(J)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5, v8}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    iput-object v3, v4, Lfb1;->c:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {v12, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    move-object v4, v2

    .line 344
    :cond_10
    move-object v7, v4

    .line 345
    check-cast v7, Lkb1;

    .line 346
    .line 347
    and-int/lit16 v2, v0, 0x380

    .line 348
    .line 349
    const/16 v3, 0x38

    .line 350
    .line 351
    or-int/2addr v2, v3

    .line 352
    and-int/lit16 v0, v0, 0x1c00

    .line 353
    .line 354
    or-int v13, v2, v0

    .line 355
    .line 356
    move-object/from16 v8, p1

    .line 357
    .line 358
    invoke-static/range {v7 .. v13}, Loz;->b(Lro0;Ljava/lang/String;Lpe0;JLji;I)V

    .line 359
    .line 360
    .line 361
    move-object v3, v9

    .line 362
    move-wide v4, v10

    .line 363
    goto :goto_a

    .line 364
    :cond_11
    invoke-virtual {v12}, Lpi;->R()V

    .line 365
    .line 366
    .line 367
    :goto_a
    invoke-virtual {v12}, Lpi;->r()Lht0;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    if-eqz v8, :cond_12

    .line 372
    .line 373
    new-instance v0, Lmz;

    .line 374
    .line 375
    move-object/from16 v2, p1

    .line 376
    .line 377
    move/from16 v6, p6

    .line 378
    .line 379
    move/from16 v7, p7

    .line 380
    .line 381
    invoke-direct/range {v0 .. v7}, Lmz;-><init>(Lr00;Ljava/lang/String;Lpe0;JII)V

    .line 382
    .line 383
    .line 384
    iput-object v0, v8, Lht0;->d:Lww;

    .line 385
    .line 386
    :cond_12
    return-void
.end method

.method public static final b(Lro0;Ljava/lang/String;Lpe0;JLji;I)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-wide/from16 v4, p3

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    move-object/from16 v0, p5

    .line 10
    .line 11
    check-cast v0, Lpi;

    .line 12
    .line 13
    const v1, -0x7faffaf9

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lpi;->X(I)Lpi;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v1, v6, 0x6

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    move-object/from16 v1, p0

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    const/4 v7, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v7, 0x2

    .line 34
    :goto_0
    or-int/2addr v7, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object/from16 v1, p0

    .line 37
    .line 38
    move v7, v6

    .line 39
    :goto_1
    and-int/lit8 v8, v6, 0x30

    .line 40
    .line 41
    const/16 v9, 0x20

    .line 42
    .line 43
    if-nez v8, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-eqz v8, :cond_2

    .line 50
    .line 51
    move v8, v9

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v8, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v7, v8

    .line 56
    :cond_3
    and-int/lit16 v8, v6, 0x180

    .line 57
    .line 58
    if-nez v8, :cond_5

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    const/16 v8, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v8, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v7, v8

    .line 72
    :cond_5
    and-int/lit16 v8, v6, 0xc00

    .line 73
    .line 74
    const/16 v10, 0x800

    .line 75
    .line 76
    if-nez v8, :cond_7

    .line 77
    .line 78
    invoke-virtual {v0, v4, v5}, Lpi;->e(J)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_6

    .line 83
    .line 84
    move v8, v10

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v8, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v7, v8

    .line 89
    :cond_7
    and-int/lit16 v8, v7, 0x493

    .line 90
    .line 91
    const/16 v11, 0x492

    .line 92
    .line 93
    const/4 v13, 0x0

    .line 94
    const/4 v12, 0x1

    .line 95
    if-eq v8, v11, :cond_8

    .line 96
    .line 97
    move v8, v12

    .line 98
    goto :goto_5

    .line 99
    :cond_8
    move v8, v13

    .line 100
    :goto_5
    and-int/lit8 v11, v7, 0x1

    .line 101
    .line 102
    invoke-virtual {v0, v11, v8}, Lpi;->O(IZ)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_17

    .line 107
    .line 108
    invoke-virtual {v0}, Lpi;->T()V

    .line 109
    .line 110
    .line 111
    and-int/lit8 v8, v6, 0x1

    .line 112
    .line 113
    if-eqz v8, :cond_a

    .line 114
    .line 115
    invoke-virtual {v0}, Lpi;->y()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_9

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_9
    invoke-virtual {v0}, Lpi;->R()V

    .line 123
    .line 124
    .line 125
    :cond_a
    :goto_6
    invoke-virtual {v0}, Lpi;->q()V

    .line 126
    .line 127
    .line 128
    and-int/lit16 v8, v7, 0x1c00

    .line 129
    .line 130
    xor-int/lit16 v8, v8, 0xc00

    .line 131
    .line 132
    if-le v8, v10, :cond_b

    .line 133
    .line 134
    invoke-virtual {v0, v4, v5}, Lpi;->e(J)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-nez v8, :cond_c

    .line 139
    .line 140
    :cond_b
    and-int/lit16 v8, v7, 0xc00

    .line 141
    .line 142
    if-ne v8, v10, :cond_d

    .line 143
    .line 144
    :cond_c
    move v8, v12

    .line 145
    goto :goto_7

    .line 146
    :cond_d
    move v8, v13

    .line 147
    :goto_7
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    sget-object v11, Lii;->a:Lr3;

    .line 152
    .line 153
    if-nez v8, :cond_e

    .line 154
    .line 155
    if-ne v10, v11, :cond_10

    .line 156
    .line 157
    :cond_e
    sget-wide v14, Lff;->g:J

    .line 158
    .line 159
    invoke-static {v4, v5, v14, v15}, Lff;->c(JJ)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-eqz v8, :cond_f

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    :goto_8
    move-object v10, v8

    .line 167
    goto :goto_9

    .line 168
    :cond_f
    new-instance v8, Lja;

    .line 169
    .line 170
    const/4 v10, 0x5

    .line 171
    invoke-direct {v8, v10, v4, v5}, Lja;-><init>(IJ)V

    .line 172
    .line 173
    .line 174
    goto :goto_8

    .line 175
    :goto_9
    invoke-virtual {v0, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_10
    check-cast v10, Lja;

    .line 179
    .line 180
    sget-object v8, Lme0;->a:Lme0;

    .line 181
    .line 182
    if-eqz v2, :cond_14

    .line 183
    .line 184
    const v14, -0x2001d503

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v14}, Lpi;->W(I)V

    .line 188
    .line 189
    .line 190
    and-int/lit8 v7, v7, 0x70

    .line 191
    .line 192
    if-ne v7, v9, :cond_11

    .line 193
    .line 194
    move v7, v12

    .line 195
    goto :goto_a

    .line 196
    :cond_11
    move v7, v13

    .line 197
    :goto_a
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    if-nez v7, :cond_12

    .line 202
    .line 203
    if-ne v14, v11, :cond_13

    .line 204
    .line 205
    :cond_12
    new-instance v14, Lnl;

    .line 206
    .line 207
    invoke-direct {v14, v2, v12}, Lnl;-><init>(Ljava/lang/String;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_13
    check-cast v14, Lsw;

    .line 214
    .line 215
    invoke-static {v8, v14}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-virtual {v0, v13}, Lpi;->p(Z)V

    .line 220
    .line 221
    .line 222
    move-object v14, v7

    .line 223
    goto :goto_b

    .line 224
    :cond_14
    const v7, -0x1fff68c5

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v7}, Lpi;->W(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v13}, Lpi;->p(Z)V

    .line 231
    .line 232
    .line 233
    move-object v14, v8

    .line 234
    :goto_b
    invoke-virtual {v1}, Lro0;->d()J

    .line 235
    .line 236
    .line 237
    move-result-wide v11

    .line 238
    move/from16 p5, v9

    .line 239
    .line 240
    move-object v7, v10

    .line 241
    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    invoke-static {v11, v12, v9, v10}, Lq11;->a(JJ)Z

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    if-nez v9, :cond_15

    .line 251
    .line 252
    invoke-virtual {v1}, Lro0;->d()J

    .line 253
    .line 254
    .line 255
    move-result-wide v9

    .line 256
    shr-long v11, v9, p5

    .line 257
    .line 258
    long-to-int v11, v11

    .line 259
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    invoke-static {v11}, Ljava/lang/Float;->isInfinite(F)Z

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    if-eqz v11, :cond_16

    .line 268
    .line 269
    const-wide v11, 0xffffffffL

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    and-long/2addr v9, v11

    .line 275
    long-to-int v9, v9

    .line 276
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    invoke-static {v9}, Ljava/lang/Float;->isInfinite(F)Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-eqz v9, :cond_16

    .line 285
    .line 286
    :cond_15
    sget-object v8, Loz;->a:Lpe0;

    .line 287
    .line 288
    :cond_16
    invoke-interface {v3, v8}, Lpe0;->c(Lpe0;)Lpe0;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    const/4 v9, 0x0

    .line 293
    const/16 v12, 0x16

    .line 294
    .line 295
    sget-object v10, Ldk;->a:Lr3;

    .line 296
    .line 297
    move-object v11, v7

    .line 298
    move-object v7, v8

    .line 299
    move-object v8, v1

    .line 300
    invoke-static/range {v7 .. v12}, Ls91;->J(Lpe0;Lro0;Lha;Lr3;Lja;I)Lpe0;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-interface {v1, v14}, Lpe0;->c(Lpe0;)Lpe0;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v1, v0, v13}, Lza;->a(Lpe0;Lji;I)V

    .line 309
    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_17
    invoke-virtual {v0}, Lpi;->R()V

    .line 313
    .line 314
    .line 315
    :goto_c
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    if-eqz v7, :cond_18

    .line 320
    .line 321
    new-instance v0, Lnz;

    .line 322
    .line 323
    move-object/from16 v1, p0

    .line 324
    .line 325
    invoke-direct/range {v0 .. v6}, Lnz;-><init>(Lro0;Ljava/lang/String;Lpe0;JI)V

    .line 326
    .line 327
    .line 328
    iput-object v0, v7, Lht0;->d:Lww;

    .line 329
    .line 330
    :cond_18
    return-void
.end method
