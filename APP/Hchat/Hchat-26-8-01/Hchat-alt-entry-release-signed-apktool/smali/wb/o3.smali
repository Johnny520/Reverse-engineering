.class public abstract Lwb/o3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/m2;

.field public static final b:Luh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lk/s1;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk/s1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Li0/m2;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Li0/p1;-><init>(Lfg/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lwb/o3;->a:Li0/m2;

    .line 14
    .line 15
    new-instance v0, Luh/b;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    int-to-float v1, v1

    .line 19
    new-instance v2, Luh/a;

    .line 20
    .line 21
    sget-wide v3, Lf1/w;->c:J

    .line 22
    .line 23
    const v5, 0x3df5c28f    # 0.12f

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4, v5}, Lf1/w;->b(JF)J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 31
    .line 32
    double-to-float v7, v7

    .line 33
    move-wide v8, v3

    .line 34
    move-wide v3, v5

    .line 35
    new-instance v6, Luh/d;

    .line 36
    .line 37
    new-instance v5, Luh/c;

    .line 38
    .line 39
    const v10, -0x41666666    # -0.3f

    .line 40
    .line 41
    .line 42
    const v11, -0x42b33333    # -0.05f

    .line 43
    .line 44
    .line 45
    const/high16 v12, 0x3f000000    # 0.5f

    .line 46
    .line 47
    invoke-direct {v5, v12, v10, v11}, Luh/c;-><init>(FFF)V

    .line 48
    .line 49
    .line 50
    const/high16 v10, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-direct {v6, v5, v8, v9, v10}, Luh/d;-><init>(Luh/c;JF)V

    .line 53
    .line 54
    .line 55
    move v5, v7

    .line 56
    new-instance v7, Luh/d;

    .line 57
    .line 58
    new-instance v11, Luh/c;

    .line 59
    .line 60
    const v13, 0x3f4ccccd    # 0.8f

    .line 61
    .line 62
    .line 63
    const/high16 v14, -0x41000000    # -0.5f

    .line 64
    .line 65
    invoke-direct {v11, v12, v13, v14}, Luh/c;-><init>(FFF)V

    .line 66
    .line 67
    .line 68
    const v12, 0x3ecccccd    # 0.4f

    .line 69
    .line 70
    .line 71
    invoke-direct {v7, v11, v8, v9, v12}, Luh/d;-><init>(Luh/c;JF)V

    .line 72
    .line 73
    .line 74
    const/4 v8, 0x2

    .line 75
    invoke-direct/range {v2 .. v8}, Luh/a;-><init>(JFLuh/d;Luh/d;I)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1, v10, v2}, Luh/b;-><init>(FFLuh/a;)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lwb/o3;->b:Luh/b;

    .line 82
    .line 83
    return-void
.end method

.method public static final a(Ly0/o;Lfg/a;Lfg/l;Lth/a;IZZLs0/d;Li0/h0;I)V
    .locals 54

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    move/from16 v11, p5

    .line 6
    .line 7
    move/from16 v12, p6

    .line 8
    .line 9
    move-object/from16 v8, p7

    .line 10
    .line 11
    move-object/from16 v13, p8

    .line 12
    .line 13
    move/from16 v14, p9

    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const v0, -0x1dfcf76b

    .line 25
    .line 26
    .line 27
    invoke-virtual {v13, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 28
    .line 29
    .line 30
    or-int/lit8 v0, v14, 0x6

    .line 31
    .line 32
    and-int/lit8 v2, v14, 0x30

    .line 33
    .line 34
    move-object/from16 v15, p1

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v13, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    const/16 v2, 0x20

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/16 v2, 0x10

    .line 48
    .line 49
    :goto_0
    or-int/2addr v0, v2

    .line 50
    :cond_1
    and-int/lit16 v2, v14, 0x180

    .line 51
    .line 52
    move-object/from16 v3, p2

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {v13, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    const/16 v2, 0x100

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/16 v2, 0x80

    .line 66
    .line 67
    :goto_1
    or-int/2addr v0, v2

    .line 68
    :cond_3
    and-int/lit16 v2, v14, 0xc00

    .line 69
    .line 70
    if-nez v2, :cond_6

    .line 71
    .line 72
    and-int/lit16 v2, v14, 0x1000

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-virtual {v13, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :goto_2
    if-eqz v2, :cond_5

    .line 86
    .line 87
    const/16 v2, 0x800

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    const/16 v2, 0x400

    .line 91
    .line 92
    :goto_3
    or-int/2addr v0, v2

    .line 93
    :cond_6
    and-int/lit16 v2, v14, 0x6000

    .line 94
    .line 95
    if-nez v2, :cond_8

    .line 96
    .line 97
    invoke-virtual {v13, v4}, Li0/h0;->d(I)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_7

    .line 102
    .line 103
    const/16 v2, 0x4000

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    const/16 v2, 0x2000

    .line 107
    .line 108
    :goto_4
    or-int/2addr v0, v2

    .line 109
    :cond_8
    const/high16 v2, 0x30000

    .line 110
    .line 111
    and-int/2addr v2, v14

    .line 112
    if-nez v2, :cond_a

    .line 113
    .line 114
    invoke-virtual {v13, v11}, Li0/h0;->g(Z)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_9

    .line 119
    .line 120
    const/high16 v2, 0x20000

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_9
    const/high16 v2, 0x10000

    .line 124
    .line 125
    :goto_5
    or-int/2addr v0, v2

    .line 126
    :cond_a
    const/high16 v2, 0x180000

    .line 127
    .line 128
    and-int/2addr v2, v14

    .line 129
    if-nez v2, :cond_c

    .line 130
    .line 131
    invoke-virtual {v13, v12}, Li0/h0;->g(Z)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_b

    .line 136
    .line 137
    const/high16 v2, 0x100000

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_b
    const/high16 v2, 0x80000

    .line 141
    .line 142
    :goto_6
    or-int/2addr v0, v2

    .line 143
    :cond_c
    const/high16 v2, 0xc00000

    .line 144
    .line 145
    and-int/2addr v2, v14

    .line 146
    if-nez v2, :cond_e

    .line 147
    .line 148
    invoke-virtual {v13, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_d

    .line 153
    .line 154
    const/high16 v2, 0x800000

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_d
    const/high16 v2, 0x400000

    .line 158
    .line 159
    :goto_7
    or-int/2addr v0, v2

    .line 160
    :cond_e
    move v10, v0

    .line 161
    const v0, 0x492493

    .line 162
    .line 163
    .line 164
    and-int/2addr v0, v10

    .line 165
    const v2, 0x492492

    .line 166
    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    if-eq v0, v2, :cond_f

    .line 170
    .line 171
    const/4 v0, 0x1

    .line 172
    goto :goto_8

    .line 173
    :cond_f
    move v0, v5

    .line 174
    :goto_8
    and-int/lit8 v2, v10, 0x1

    .line 175
    .line 176
    invoke-virtual {v13, v2, v0}, Li0/h0;->S(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_55

    .line 181
    .line 182
    if-eqz v11, :cond_10

    .line 183
    .line 184
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 185
    .line 186
    const/16 v2, 0x21

    .line 187
    .line 188
    if-lt v0, v2, :cond_10

    .line 189
    .line 190
    const/16 v16, 0x1

    .line 191
    .line 192
    goto :goto_9

    .line 193
    :cond_10
    move/from16 v16, v5

    .line 194
    .line 195
    :goto_9
    invoke-static {v13}, Lk/n;->p(Li0/h0;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    sget-object v7, Li0/l;->a:Li0/e;

    .line 204
    .line 205
    if-ne v2, v7, :cond_11

    .line 206
    .line 207
    sget-object v2, Lv/e;->a:Lv/d;

    .line 208
    .line 209
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_11
    check-cast v2, Lv/d;

    .line 213
    .line 214
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 215
    .line 216
    invoke-virtual {v13, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v18

    .line 220
    check-cast v18, Lbi/b;

    .line 221
    .line 222
    invoke-virtual/range {v18 .. v18}, Lbi/b;->j()J

    .line 223
    .line 224
    .line 225
    move-result-wide v18

    .line 226
    invoke-virtual {v13, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    check-cast v6, Lbi/b;

    .line 231
    .line 232
    move/from16 v21, v10

    .line 233
    .line 234
    invoke-virtual {v6}, Lbi/b;->m()J

    .line 235
    .line 236
    .line 237
    move-result-wide v9

    .line 238
    if-eqz v16, :cond_12

    .line 239
    .line 240
    const v6, 0x3ecccccd    # 0.4f

    .line 241
    .line 242
    .line 243
    invoke-static {v9, v10, v6}, Lf1/w;->b(JF)J

    .line 244
    .line 245
    .line 246
    move-result-wide v9

    .line 247
    :cond_12
    const/4 v6, 0x3

    .line 248
    move/from16 p0, v0

    .line 249
    .line 250
    const/4 v0, 0x0

    .line 251
    invoke-static {v0, v13, v5, v6}, Lth/c;->e(Li1/b;Li0/h0;II)Lth/j;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    sget-object v5, Ly1/h1;->h:Li0/m2;

    .line 256
    .line 257
    invoke-virtual {v13, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Lu2/c;

    .line 262
    .line 263
    sget-object v0, Ly1/h1;->n:Li0/m2;

    .line 264
    .line 265
    invoke-virtual {v13, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    move-object/from16 v30, v2

    .line 270
    .line 271
    sget-object v2, Lu2/m;->g:Lu2/m;

    .line 272
    .line 273
    if-ne v0, v2, :cond_13

    .line 274
    .line 275
    const/4 v0, 0x1

    .line 276
    goto :goto_a

    .line 277
    :cond_13
    const/4 v0, 0x0

    .line 278
    :goto_a
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    if-ne v2, v7, :cond_14

    .line 283
    .line 284
    invoke-static {v13}, Li0/r;->n(Li0/h0;)Lqg/t;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_14
    check-cast v2, Lqg/t;

    .line 292
    .line 293
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    const/4 v11, 0x0

    .line 298
    if-ne v3, v7, :cond_15

    .line 299
    .line 300
    new-instance v3, Li0/f1;

    .line 301
    .line 302
    invoke-direct {v3, v11}, Li0/f1;-><init>(F)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_15
    move-object/from16 v25, v3

    .line 309
    .line 310
    check-cast v25, Li0/f1;

    .line 311
    .line 312
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    if-ne v3, v7, :cond_16

    .line 317
    .line 318
    new-instance v3, Li0/f1;

    .line 319
    .line 320
    invoke-direct {v3, v11}, Li0/f1;-><init>(F)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v13, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_16
    check-cast v3, Li0/f1;

    .line 327
    .line 328
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    if-ne v11, v7, :cond_17

    .line 333
    .line 334
    const v11, 0x3c23d70a    # 0.01f

    .line 335
    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    invoke-static {v4, v11}, Li/d;->a(FF)Li/c;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-virtual {v13, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_17
    check-cast v11, Li/c;

    .line 346
    .line 347
    const/4 v4, 0x4

    .line 348
    int-to-float v12, v4

    .line 349
    invoke-interface {v5, v12}, Lu2/c;->x0(F)F

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    invoke-virtual {v13, v4}, Li0/h0;->c(F)Z

    .line 354
    .line 355
    .line 356
    move-result v22

    .line 357
    move-object/from16 v32, v6

    .line 358
    .line 359
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    if-nez v22, :cond_18

    .line 364
    .line 365
    if-ne v6, v7, :cond_19

    .line 366
    .line 367
    :cond_18
    new-instance v6, Lwb/e3;

    .line 368
    .line 369
    invoke-direct {v6, v11, v4, v3}, Lwb/e3;-><init>(Li/c;FLi0/f1;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v6}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    invoke-virtual {v13, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_19
    move-object/from16 v39, v6

    .line 380
    .line 381
    check-cast v39, Li0/l2;

    .line 382
    .line 383
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    if-ne v4, v7, :cond_1a

    .line 388
    .line 389
    invoke-interface {v15}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    check-cast v4, Ljava/lang/Number;

    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    new-instance v6, Li0/g1;

    .line 400
    .line 401
    invoke-direct {v6, v4}, Li0/g1;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v13, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    move-object v4, v6

    .line 408
    :cond_1a
    move-object v6, v4

    .line 409
    check-cast v6, Li0/g1;

    .line 410
    .line 411
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    if-ne v4, v7, :cond_1b

    .line 416
    .line 417
    new-instance v4, Lwb/m3;

    .line 418
    .line 419
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_1b
    move-object/from16 v23, v4

    .line 426
    .line 427
    check-cast v23, Lwb/m3;

    .line 428
    .line 429
    invoke-virtual {v13, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    const v22, 0xe000

    .line 434
    .line 435
    .line 436
    move-object/from16 v33, v11

    .line 437
    .line 438
    and-int v11, v21, v22

    .line 439
    .line 440
    move-object/from16 v34, v2

    .line 441
    .line 442
    const/16 v2, 0x4000

    .line 443
    .line 444
    if-ne v11, v2, :cond_1c

    .line 445
    .line 446
    const/4 v2, 0x1

    .line 447
    goto :goto_b

    .line 448
    :cond_1c
    const/4 v2, 0x0

    .line 449
    :goto_b
    or-int/2addr v2, v4

    .line 450
    invoke-virtual {v13, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    or-int/2addr v2, v4

    .line 455
    invoke-virtual {v13, v0}, Li0/h0;->g(Z)Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    or-int/2addr v2, v4

    .line 460
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    if-nez v2, :cond_1d

    .line 465
    .line 466
    if-ne v4, v7, :cond_1e

    .line 467
    .line 468
    :cond_1d
    const/4 v2, 0x4

    .line 469
    goto :goto_c

    .line 470
    :cond_1e
    move/from16 v27, v0

    .line 471
    .line 472
    move-object/from16 v28, v3

    .line 473
    .line 474
    move-object/from16 v41, v5

    .line 475
    .line 476
    move-object v15, v6

    .line 477
    move-object v0, v7

    .line 478
    move-object/from16 v40, v30

    .line 479
    .line 480
    move-object/from16 v17, v32

    .line 481
    .line 482
    move-object/from16 v5, v34

    .line 483
    .line 484
    goto/16 :goto_d

    .line 485
    .line 486
    :goto_c
    new-instance v31, Lxb/i;

    .line 487
    .line 488
    invoke-interface {v15}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    check-cast v4, Ljava/lang/Number;

    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    int-to-float v4, v4

    .line 499
    add-int/lit8 v2, p4, -0x1

    .line 500
    .line 501
    int-to-float v2, v2

    .line 502
    move/from16 v27, v0

    .line 503
    .line 504
    new-instance v0, Llg/a;

    .line 505
    .line 506
    move-object/from16 v22, v3

    .line 507
    .line 508
    const/4 v3, 0x0

    .line 509
    invoke-direct {v0, v3, v2}, Llg/a;-><init>(FF)V

    .line 510
    .line 511
    .line 512
    move-object/from16 v3, v22

    .line 513
    .line 514
    new-instance v22, Lc9/u;

    .line 515
    .line 516
    const/16 v28, 0x4

    .line 517
    .line 518
    move-object/from16 v24, v5

    .line 519
    .line 520
    move-object/from16 v26, v25

    .line 521
    .line 522
    move/from16 v25, v27

    .line 523
    .line 524
    move-object/from16 v27, v3

    .line 525
    .line 526
    invoke-direct/range {v22 .. v28}, Lc9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 527
    .line 528
    .line 529
    move-object/from16 v28, v27

    .line 530
    .line 531
    move/from16 v27, v25

    .line 532
    .line 533
    move-object/from16 v25, v26

    .line 534
    .line 535
    new-instance v2, Lwb/m0;

    .line 536
    .line 537
    const/4 v3, 0x6

    .line 538
    invoke-direct {v2, v3}, Lwb/m0;-><init>(I)V

    .line 539
    .line 540
    .line 541
    new-instance v37, Lhb/w;

    .line 542
    .line 543
    move/from16 v3, p4

    .line 544
    .line 545
    move-object/from16 v36, v2

    .line 546
    .line 547
    move-object/from16 v14, v23

    .line 548
    .line 549
    move-object/from16 v41, v24

    .line 550
    .line 551
    move-object/from16 v40, v30

    .line 552
    .line 553
    move-object/from16 v17, v32

    .line 554
    .line 555
    move-object/from16 v5, v34

    .line 556
    .line 557
    move-object/from16 v2, v37

    .line 558
    .line 559
    move-object/from16 v34, v0

    .line 560
    .line 561
    move-object v0, v7

    .line 562
    move-object/from16 v7, v33

    .line 563
    .line 564
    move/from16 v33, v4

    .line 565
    .line 566
    move-object/from16 v4, p2

    .line 567
    .line 568
    invoke-direct/range {v2 .. v7}, Lhb/w;-><init>(ILfg/l;Lqg/t;Li0/g1;Li/c;)V

    .line 569
    .line 570
    .line 571
    new-instance v38, Lwb/k3;

    .line 572
    .line 573
    move/from16 v4, p4

    .line 574
    .line 575
    move-object v15, v6

    .line 576
    move-object/from16 v6, v25

    .line 577
    .line 578
    move/from16 v3, v27

    .line 579
    .line 580
    move-object/from16 v2, v38

    .line 581
    .line 582
    invoke-direct/range {v2 .. v7}, Lwb/k3;-><init>(ZILqg/t;Li0/f1;Li/c;)V

    .line 583
    .line 584
    .line 585
    move-object/from16 v32, v5

    .line 586
    .line 587
    move-object/from16 v35, v22

    .line 588
    .line 589
    invoke-direct/range {v31 .. v38}, Lxb/i;-><init>(Lqg/t;FLlg/a;Lc9/u;Lwb/m0;Lhb/w;Lwb/k3;)V

    .line 590
    .line 591
    .line 592
    move-object/from16 v4, v31

    .line 593
    .line 594
    iput-object v4, v14, Lwb/m3;->a:Lxb/i;

    .line 595
    .line 596
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    :goto_d
    check-cast v4, Lxb/i;

    .line 600
    .line 601
    invoke-interface/range {p1 .. p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    check-cast v2, Ljava/lang/Number;

    .line 606
    .line 607
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    add-int/lit8 v3, p4, -0x1

    .line 612
    .line 613
    if-gez v2, :cond_1f

    .line 614
    .line 615
    const/4 v2, 0x0

    .line 616
    :cond_1f
    if-le v2, v3, :cond_20

    .line 617
    .line 618
    goto :goto_e

    .line 619
    :cond_20
    move v3, v2

    .line 620
    :goto_e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-virtual {v13, v3}, Li0/h0;->d(I)Z

    .line 625
    .line 626
    .line 627
    move-result v6

    .line 628
    invoke-virtual {v13, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v7

    .line 632
    or-int/2addr v6, v7

    .line 633
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    if-nez v6, :cond_22

    .line 638
    .line 639
    if-ne v7, v0, :cond_21

    .line 640
    .line 641
    goto :goto_f

    .line 642
    :cond_21
    const/4 v6, 0x0

    .line 643
    goto :goto_10

    .line 644
    :cond_22
    :goto_f
    new-instance v7, Lci/j;

    .line 645
    .line 646
    const/4 v6, 0x0

    .line 647
    invoke-direct {v7, v3, v4, v15, v6}, Lci/j;-><init>(ILxb/i;Li0/g1;Lwf/c;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v13, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    :goto_10
    check-cast v7, Lfg/p;

    .line 654
    .line 655
    invoke-static {v2, v4, v7, v13}, Li0/r;->g(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V

    .line 656
    .line 657
    .line 658
    if-eqz v16, :cond_25

    .line 659
    .line 660
    const v2, 0x3f42f10d

    .line 661
    .line 662
    .line 663
    invoke-virtual {v13, v2}, Li0/h0;->a0(I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v25 .. v25}, Li0/f1;->g()F

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    invoke-virtual {v13, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    invoke-virtual {v13, v2}, Li0/h0;->c(F)Z

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    or-int/2addr v2, v3

    .line 679
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    if-nez v2, :cond_24

    .line 684
    .line 685
    if-ne v3, v0, :cond_23

    .line 686
    .line 687
    goto :goto_11

    .line 688
    :cond_23
    move-object/from16 v23, v4

    .line 689
    .line 690
    move/from16 v14, v27

    .line 691
    .line 692
    move-object/from16 v15, v39

    .line 693
    .line 694
    goto :goto_12

    .line 695
    :cond_24
    :goto_11
    new-instance v3, Lxb/o;

    .line 696
    .line 697
    new-instance v22, Lsh/j;

    .line 698
    .line 699
    const/16 v23, 0x1

    .line 700
    .line 701
    move-object/from16 v24, v4

    .line 702
    .line 703
    move-object/from16 v26, v39

    .line 704
    .line 705
    invoke-direct/range {v22 .. v27}, Lsh/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 706
    .line 707
    .line 708
    move-object/from16 v2, v22

    .line 709
    .line 710
    move-object/from16 v23, v24

    .line 711
    .line 712
    move-object/from16 v15, v26

    .line 713
    .line 714
    move/from16 v14, v27

    .line 715
    .line 716
    invoke-direct {v3, v5, v2}, Lxb/o;-><init>(Lqg/t;Lsh/j;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v13, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    :goto_12
    move-object v2, v3

    .line 723
    check-cast v2, Lxb/o;

    .line 724
    .line 725
    const/4 v3, 0x0

    .line 726
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 727
    .line 728
    .line 729
    move-object v6, v2

    .line 730
    goto :goto_13

    .line 731
    :cond_25
    move-object/from16 v23, v4

    .line 732
    .line 733
    move/from16 v14, v27

    .line 734
    .line 735
    move-object/from16 v15, v39

    .line 736
    .line 737
    const/4 v3, 0x0

    .line 738
    const v2, 0x3f4a8cb9

    .line 739
    .line 740
    .line 741
    invoke-virtual {v13, v2}, Li0/h0;->a0(I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 745
    .line 746
    .line 747
    :goto_13
    const/high16 v2, -0x3dcc0000    # -45.0f

    .line 748
    .line 749
    sget-object v3, Lwb/o3;->b:Luh/b;

    .line 750
    .line 751
    const/4 v4, 0x6

    .line 752
    invoke-static {v3, v2, v13, v4}, Lwb/o3;->e(Luh/b;FLi0/h0;I)Luh/b;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    const/high16 v5, 0x42b40000    # 90.0f

    .line 757
    .line 758
    const/16 v7, 0x36

    .line 759
    .line 760
    invoke-static {v3, v5, v13, v7}, Lwb/o3;->e(Luh/b;FLi0/h0;I)Luh/b;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    shr-int/lit8 v5, v21, 0x9

    .line 765
    .line 766
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    and-int/lit8 v7, v5, 0xe

    .line 770
    .line 771
    xor-int/2addr v7, v4

    .line 772
    move/from16 v22, v4

    .line 773
    .line 774
    const/4 v4, 0x4

    .line 775
    if-le v7, v4, :cond_26

    .line 776
    .line 777
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v7

    .line 781
    if-nez v7, :cond_27

    .line 782
    .line 783
    :cond_26
    and-int/lit8 v5, v5, 0x6

    .line 784
    .line 785
    if-ne v5, v4, :cond_28

    .line 786
    .line 787
    :cond_27
    const/4 v5, 0x1

    .line 788
    :goto_14
    move-object/from16 v4, v17

    .line 789
    .line 790
    goto :goto_15

    .line 791
    :cond_28
    const/4 v5, 0x0

    .line 792
    goto :goto_14

    .line 793
    :goto_15
    invoke-virtual {v13, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v7

    .line 797
    or-int/2addr v5, v7

    .line 798
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v7

    .line 802
    if-nez v5, :cond_29

    .line 803
    .line 804
    if-ne v7, v0, :cond_2a

    .line 805
    .line 806
    :cond_29
    new-instance v7, Lyb/a;

    .line 807
    .line 808
    invoke-direct {v7, v1, v4}, Lyb/a;-><init>(Lth/a;Lth/j;)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v13, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    :cond_2a
    move-object/from16 v30, v7

    .line 815
    .line 816
    check-cast v30, Lyb/a;

    .line 817
    .line 818
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 819
    .line 820
    if-eqz p6, :cond_2b

    .line 821
    .line 822
    sget-object v7, Lp/n0;->g:Lp/n0;

    .line 823
    .line 824
    invoke-static {v5, v7}, Lp/d;->s(Ly0/o;Lp/n0;)Ly0/o;

    .line 825
    .line 826
    .line 827
    move-result-object v7

    .line 828
    goto :goto_16

    .line 829
    :cond_2b
    const/high16 v7, 0x3f800000    # 1.0f

    .line 830
    .line 831
    invoke-static {v5, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 832
    .line 833
    .line 834
    move-result-object v7

    .line 835
    :goto_16
    sget-object v1, Ly0/b;->j:Ly0/g;

    .line 836
    .line 837
    move-object/from16 v17, v2

    .line 838
    .line 839
    const/4 v2, 0x0

    .line 840
    invoke-static {v1, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    move-object/from16 v24, v3

    .line 845
    .line 846
    iget-wide v2, v13, Li0/h0;->T:J

    .line 847
    .line 848
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    invoke-virtual {v13}, Li0/h0;->l()Ls0/h;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    invoke-static {v13, v7}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 857
    .line 858
    .line 859
    move-result-object v7

    .line 860
    sget-object v26, Lx1/g;->f:Lx1/f;

    .line 861
    .line 862
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    move/from16 v27, v14

    .line 866
    .line 867
    sget-object v14, Lx1/f;->b:Lx1/y;

    .line 868
    .line 869
    invoke-virtual {v13}, Li0/h0;->d0()V

    .line 870
    .line 871
    .line 872
    move/from16 v26, v2

    .line 873
    .line 874
    iget-boolean v2, v13, Li0/h0;->S:Z

    .line 875
    .line 876
    if-eqz v2, :cond_2c

    .line 877
    .line 878
    invoke-virtual {v13, v14}, Li0/h0;->k(Lfg/a;)V

    .line 879
    .line 880
    .line 881
    goto :goto_17

    .line 882
    :cond_2c
    invoke-virtual {v13}, Li0/h0;->n0()V

    .line 883
    .line 884
    .line 885
    :goto_17
    sget-object v2, Lx1/f;->e:Lx1/e;

    .line 886
    .line 887
    invoke-static {v2, v13, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 891
    .line 892
    invoke-static {v1, v13, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 900
    .line 901
    invoke-static {v8, v13, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 905
    .line 906
    invoke-static {v3, v13}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 907
    .line 908
    .line 909
    move-object/from16 v26, v8

    .line 910
    .line 911
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 912
    .line 913
    invoke-static {v8, v13, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    move-object/from16 v7, v41

    .line 917
    .line 918
    invoke-virtual {v13, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    move-result v29

    .line 922
    move-object/from16 v31, v1

    .line 923
    .line 924
    const/16 v1, 0x4000

    .line 925
    .line 926
    if-ne v11, v1, :cond_2d

    .line 927
    .line 928
    const/4 v1, 0x1

    .line 929
    goto :goto_18

    .line 930
    :cond_2d
    const/4 v1, 0x0

    .line 931
    :goto_18
    or-int v1, v29, v1

    .line 932
    .line 933
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v11

    .line 937
    if-nez v1, :cond_2e

    .line 938
    .line 939
    if-ne v11, v0, :cond_2f

    .line 940
    .line 941
    :cond_2e
    move-object v1, v2

    .line 942
    goto :goto_19

    .line 943
    :cond_2f
    move-object/from16 v1, v23

    .line 944
    .line 945
    move-object/from16 v23, v2

    .line 946
    .line 947
    move-object v2, v11

    .line 948
    move-object v11, v1

    .line 949
    move-object/from16 v43, v3

    .line 950
    .line 951
    move-object/from16 v32, v4

    .line 952
    .line 953
    move-object/from16 v20, v8

    .line 954
    .line 955
    move-object/from16 v1, v17

    .line 956
    .line 957
    move-object/from16 v42, v24

    .line 958
    .line 959
    move-object v8, v5

    .line 960
    move-object/from16 v17, v6

    .line 961
    .line 962
    move-object/from16 v24, v7

    .line 963
    .line 964
    goto :goto_1a

    .line 965
    :goto_19
    new-instance v2, Lca/k;

    .line 966
    .line 967
    move-object/from16 v41, v7

    .line 968
    .line 969
    const/4 v7, 0x6

    .line 970
    move-object/from16 v43, v3

    .line 971
    .line 972
    move-object/from16 v32, v4

    .line 973
    .line 974
    move-object/from16 v20, v8

    .line 975
    .line 976
    move-object/from16 v11, v23

    .line 977
    .line 978
    move-object/from16 v42, v24

    .line 979
    .line 980
    move-object/from16 v3, v41

    .line 981
    .line 982
    move/from16 v4, p4

    .line 983
    .line 984
    move-object/from16 v23, v1

    .line 985
    .line 986
    move-object v8, v5

    .line 987
    move-object/from16 v1, v17

    .line 988
    .line 989
    move-object/from16 v5, v28

    .line 990
    .line 991
    move-object/from16 v17, v6

    .line 992
    .line 993
    move-object/from16 v6, v25

    .line 994
    .line 995
    invoke-direct/range {v2 .. v7}, Lca/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 996
    .line 997
    .line 998
    move-object/from16 v24, v3

    .line 999
    .line 1000
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1001
    .line 1002
    .line 1003
    :goto_1a
    check-cast v2, Lfg/l;

    .line 1004
    .line 1005
    invoke-static {v8, v2}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    invoke-virtual {v13, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v4

    .line 1017
    if-nez v3, :cond_30

    .line 1018
    .line 1019
    if-ne v4, v0, :cond_31

    .line 1020
    .line 1021
    :cond_30
    new-instance v4, Lsh/y0;

    .line 1022
    .line 1023
    const/4 v3, 0x7

    .line 1024
    invoke-direct {v4, v15, v3}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    :cond_31
    check-cast v4, Lfg/l;

    .line 1031
    .line 1032
    invoke-static {v2, v4}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    new-instance v3, Ll1/d;

    .line 1037
    .line 1038
    const/16 v4, 0xa

    .line 1039
    .line 1040
    int-to-float v4, v4

    .line 1041
    sget-wide v5, Lf1/w;->b:J

    .line 1042
    .line 1043
    if-eqz p0, :cond_32

    .line 1044
    .line 1045
    const v7, 0x3e4ccccd    # 0.2f

    .line 1046
    .line 1047
    .line 1048
    goto :goto_1b

    .line 1049
    :cond_32
    const v7, 0x3dcccccd    # 0.1f

    .line 1050
    .line 1051
    .line 1052
    :goto_1b
    invoke-direct {v3, v4, v7, v5, v6}, Ll1/d;-><init>(FFJ)V

    .line 1053
    .line 1054
    .line 1055
    new-instance v4, Lc1/q;

    .line 1056
    .line 1057
    move-object/from16 v5, v40

    .line 1058
    .line 1059
    invoke-direct {v4, v5, v3}, Lc1/q;-><init>(Lf1/r0;Ll1/d;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-interface {v2, v4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v44

    .line 1066
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    if-ne v2, v0, :cond_33

    .line 1071
    .line 1072
    new-instance v2, Ln/k;

    .line 1073
    .line 1074
    invoke-direct {v2}, Ln/k;-><init>()V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    :cond_33
    move-object/from16 v45, v2

    .line 1081
    .line 1082
    check-cast v45, Ln/k;

    .line 1083
    .line 1084
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    if-ne v2, v0, :cond_34

    .line 1089
    .line 1090
    new-instance v2, Lk/s1;

    .line 1091
    .line 1092
    const/16 v3, 0x15

    .line 1093
    .line 1094
    invoke-direct {v2, v3}, Lk/s1;-><init>(I)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1098
    .line 1099
    .line 1100
    :cond_34
    move-object/from16 v49, v2

    .line 1101
    .line 1102
    check-cast v49, Lfg/a;

    .line 1103
    .line 1104
    const/16 v50, 0x1c

    .line 1105
    .line 1106
    const/16 v46, 0x0

    .line 1107
    .line 1108
    const/16 v47, 0x0

    .line 1109
    .line 1110
    const/16 v48, 0x0

    .line 1111
    .line 1112
    invoke-static/range {v44 .. v50}, Lk/n;->i(Ly0/o;Ln/k;Lk/y0;ZLf2/i;Lfg/a;I)Ly0/o;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    if-eqz v16, :cond_3d

    .line 1117
    .line 1118
    const v3, 0x5b09024f

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v13, v3}, Li0/h0;->a0(I)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v3

    .line 1128
    if-ne v3, v0, :cond_35

    .line 1129
    .line 1130
    new-instance v3, Lv0/a;

    .line 1131
    .line 1132
    const/16 v4, 0x8

    .line 1133
    .line 1134
    invoke-direct {v3, v5, v4}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v13, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    :cond_35
    check-cast v3, Lfg/a;

    .line 1141
    .line 1142
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v4

    .line 1146
    if-ne v4, v0, :cond_36

    .line 1147
    .line 1148
    new-instance v4, Lw0/l;

    .line 1149
    .line 1150
    const/4 v6, 0x2

    .line 1151
    invoke-direct {v4, v6}, Lw0/l;-><init>(I)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    :cond_36
    check-cast v4, Lfg/l;

    .line 1158
    .line 1159
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v6

    .line 1163
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v7

    .line 1167
    if-nez v6, :cond_37

    .line 1168
    .line 1169
    if-ne v7, v0, :cond_38

    .line 1170
    .line 1171
    :cond_37
    new-instance v7, Lwb/l3;

    .line 1172
    .line 1173
    const/4 v6, 0x0

    .line 1174
    invoke-direct {v7, v1, v6}, Lwb/l3;-><init>(Luh/b;I)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v13, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    :cond_38
    check-cast v7, Lfg/l;

    .line 1181
    .line 1182
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v1

    .line 1186
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v6

    .line 1190
    if-nez v1, :cond_39

    .line 1191
    .line 1192
    if-ne v6, v0, :cond_3a

    .line 1193
    .line 1194
    :cond_39
    new-instance v6, Lwb/f3;

    .line 1195
    .line 1196
    const/4 v1, 0x1

    .line 1197
    invoke-direct {v6, v11, v1}, Lwb/f3;-><init>(Lxb/i;I)V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v13, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1201
    .line 1202
    .line 1203
    :cond_3a
    check-cast v6, Lfg/l;

    .line 1204
    .line 1205
    invoke-virtual {v13, v9, v10}, Li0/h0;->e(J)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    move/from16 v28, v1

    .line 1210
    .line 1211
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    if-nez v28, :cond_3c

    .line 1216
    .line 1217
    if-ne v1, v0, :cond_3b

    .line 1218
    .line 1219
    goto :goto_1c

    .line 1220
    :cond_3b
    move-object/from16 v28, v0

    .line 1221
    .line 1222
    goto :goto_1d

    .line 1223
    :cond_3c
    :goto_1c
    new-instance v1, Lca/c;

    .line 1224
    .line 1225
    move-object/from16 v28, v0

    .line 1226
    .line 1227
    const/16 v0, 0x13

    .line 1228
    .line 1229
    invoke-direct {v1, v9, v10, v0}, Lca/c;-><init>(JI)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v13, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1233
    .line 1234
    .line 1235
    :goto_1d
    check-cast v1, Lfg/l;

    .line 1236
    .line 1237
    move-object v0, v2

    .line 1238
    move-object v2, v3

    .line 1239
    move-object v3, v4

    .line 1240
    move-object v4, v7

    .line 1241
    const/16 v7, 0x760

    .line 1242
    .line 1243
    move-object/from16 v51, v17

    .line 1244
    .line 1245
    move-object/from16 v17, v15

    .line 1246
    .line 1247
    move-object/from16 v15, v51

    .line 1248
    .line 1249
    move-object/from16 v51, v28

    .line 1250
    .line 1251
    move-object/from16 v28, v11

    .line 1252
    .line 1253
    move-object v11, v0

    .line 1254
    move-object v0, v8

    .line 1255
    move-object v8, v5

    .line 1256
    move-object v5, v6

    .line 1257
    move-object v6, v1

    .line 1258
    move-object/from16 v1, p3

    .line 1259
    .line 1260
    invoke-static/range {v0 .. v7}, Lth/c;->b(Ly0/o;Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;I)Ly0/o;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v2

    .line 1264
    const/4 v3, 0x0

    .line 1265
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_1e

    .line 1269
    :cond_3d
    move-object/from16 v3, v17

    .line 1270
    .line 1271
    move-object/from16 v17, v15

    .line 1272
    .line 1273
    move-object v15, v3

    .line 1274
    move-object/from16 v51, v0

    .line 1275
    .line 1276
    move-object v0, v8

    .line 1277
    move-object/from16 v28, v11

    .line 1278
    .line 1279
    const/4 v3, 0x0

    .line 1280
    move-object v11, v2

    .line 1281
    move-object v8, v5

    .line 1282
    const v1, 0x5b18fb29

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v13, v1}, Li0/h0;->a0(I)V

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1289
    .line 1290
    .line 1291
    invoke-static {v0, v9, v10, v8}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    :goto_1e
    invoke-interface {v11, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v1

    .line 1299
    if-eqz v15, :cond_3e

    .line 1300
    .line 1301
    iget-object v5, v15, Lxb/o;->i:Ly0/o;

    .line 1302
    .line 1303
    if-eqz v5, :cond_3e

    .line 1304
    .line 1305
    goto :goto_1f

    .line 1306
    :cond_3e
    move-object v5, v0

    .line 1307
    :goto_1f
    invoke-interface {v1, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    const/16 v2, 0x40

    .line 1312
    .line 1313
    int-to-float v2, v2

    .line 1314
    invoke-static {v1, v2}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    invoke-static {v1, v12}, Lp/d;->l(Ly0/o;F)Ly0/o;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    sget-object v2, Ly0/b;->q:Ly0/f;

    .line 1323
    .line 1324
    shr-int/lit8 v3, v21, 0xc

    .line 1325
    .line 1326
    and-int/lit16 v3, v3, 0x1c00

    .line 1327
    .line 1328
    or-int/lit16 v3, v3, 0x180

    .line 1329
    .line 1330
    sget-object v4, Lp/j;->a:Lp/c;

    .line 1331
    .line 1332
    const/16 v5, 0x30

    .line 1333
    .line 1334
    invoke-static {v4, v2, v13, v5}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v2

    .line 1338
    iget-wide v4, v13, Li0/h0;->T:J

    .line 1339
    .line 1340
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 1341
    .line 1342
    .line 1343
    move-result v4

    .line 1344
    invoke-virtual {v13}, Li0/h0;->l()Ls0/h;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v5

    .line 1348
    invoke-static {v13, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    invoke-virtual {v13}, Li0/h0;->d0()V

    .line 1353
    .line 1354
    .line 1355
    iget-boolean v6, v13, Li0/h0;->S:Z

    .line 1356
    .line 1357
    if-eqz v6, :cond_3f

    .line 1358
    .line 1359
    invoke-virtual {v13, v14}, Li0/h0;->k(Lfg/a;)V

    .line 1360
    .line 1361
    .line 1362
    :goto_20
    move-object/from16 v6, v23

    .line 1363
    .line 1364
    goto :goto_21

    .line 1365
    :cond_3f
    invoke-virtual {v13}, Li0/h0;->n0()V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_20

    .line 1369
    :goto_21
    invoke-static {v6, v13, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1370
    .line 1371
    .line 1372
    move-object/from16 v2, v31

    .line 1373
    .line 1374
    invoke-static {v2, v13, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1375
    .line 1376
    .line 1377
    move-object/from16 v2, v26

    .line 1378
    .line 1379
    move-object/from16 v5, v43

    .line 1380
    .line 1381
    invoke-static {v4, v13, v2, v13, v5}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 1382
    .line 1383
    .line 1384
    move-object/from16 v2, v20

    .line 1385
    .line 1386
    invoke-static {v2, v13, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    shr-int/lit8 v1, v3, 0x6

    .line 1390
    .line 1391
    and-int/lit8 v1, v1, 0x70

    .line 1392
    .line 1393
    or-int/lit8 v1, v1, 0x6

    .line 1394
    .line 1395
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v1

    .line 1399
    sget-object v2, Lp/f1;->a:Lp/f1;

    .line 1400
    .line 1401
    move-object/from16 v3, p7

    .line 1402
    .line 1403
    invoke-virtual {v3, v2, v13, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    const/4 v11, 0x1

    .line 1407
    invoke-virtual {v13, v11}, Li0/h0;->p(Z)V

    .line 1408
    .line 1409
    .line 1410
    const/16 v14, 0x38

    .line 1411
    .line 1412
    if-eqz v16, :cond_42

    .line 1413
    .line 1414
    const v1, 0x5b1f581d

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v13, v1}, Li0/h0;->a0(I)V

    .line 1418
    .line 1419
    .line 1420
    move-object/from16 v1, v28

    .line 1421
    .line 1422
    invoke-virtual {v13, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1423
    .line 1424
    .line 1425
    move-result v2

    .line 1426
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v4

    .line 1430
    if-nez v2, :cond_40

    .line 1431
    .line 1432
    move-object/from16 v2, v51

    .line 1433
    .line 1434
    if-ne v4, v2, :cond_41

    .line 1435
    .line 1436
    goto :goto_22

    .line 1437
    :cond_40
    move-object/from16 v2, v51

    .line 1438
    .line 1439
    :goto_22
    new-instance v4, Lwb/h3;

    .line 1440
    .line 1441
    const/4 v5, 0x1

    .line 1442
    invoke-direct {v4, v1, v5}, Lwb/h3;-><init>(Lxb/i;I)V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1446
    .line 1447
    .line 1448
    :cond_41
    check-cast v4, Lfg/a;

    .line 1449
    .line 1450
    sget-object v5, Lwb/o3;->a:Li0/m2;

    .line 1451
    .line 1452
    invoke-virtual {v5, v4}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v4

    .line 1456
    move-object v5, v0

    .line 1457
    new-instance v0, Lsh/b0;

    .line 1458
    .line 1459
    move-object v11, v1

    .line 1460
    move-object/from16 v53, v2

    .line 1461
    .line 1462
    move-object/from16 v52, v5

    .line 1463
    .line 1464
    move-object v6, v15

    .line 1465
    move-object/from16 v2, v17

    .line 1466
    .line 1467
    move-object/from16 v1, v32

    .line 1468
    .line 1469
    move-object v15, v4

    .line 1470
    move-wide v4, v9

    .line 1471
    move-object v9, v3

    .line 1472
    move-object v10, v8

    .line 1473
    move-wide/from16 v7, v18

    .line 1474
    .line 1475
    move-object/from16 v3, p3

    .line 1476
    .line 1477
    invoke-direct/range {v0 .. v10}, Lsh/b0;-><init>(Lth/j;Li0/l2;Lth/a;JLxb/o;JLs0/d;Lv/d;)V

    .line 1478
    .line 1479
    .line 1480
    move-object v3, v0

    .line 1481
    move-wide v0, v7

    .line 1482
    move-object v8, v10

    .line 1483
    const v4, -0x546109ca

    .line 1484
    .line 1485
    .line 1486
    invoke-static {v4, v3, v13}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v3

    .line 1490
    invoke-static {v15, v3, v13, v14}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 1491
    .line 1492
    .line 1493
    const/4 v3, 0x0

    .line 1494
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1495
    .line 1496
    .line 1497
    goto :goto_23

    .line 1498
    :cond_42
    move-object/from16 v52, v0

    .line 1499
    .line 1500
    move-object v6, v15

    .line 1501
    move-object/from16 v2, v17

    .line 1502
    .line 1503
    move-wide/from16 v0, v18

    .line 1504
    .line 1505
    move-object/from16 v11, v28

    .line 1506
    .line 1507
    move-object/from16 v53, v51

    .line 1508
    .line 1509
    const/4 v3, 0x0

    .line 1510
    const v4, 0x5b351367

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v13, v4}, Li0/h0;->a0(I)V

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1517
    .line 1518
    .line 1519
    :goto_23
    invoke-virtual/range {v25 .. v25}, Li0/f1;->g()F

    .line 1520
    .line 1521
    .line 1522
    move-result v3

    .line 1523
    const/4 v4, 0x0

    .line 1524
    cmpl-float v3, v3, v4

    .line 1525
    .line 1526
    if-lez v3, :cond_54

    .line 1527
    .line 1528
    const v3, 0x5b373c51

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v13, v3}, Li0/h0;->a0(I)V

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual/range {v25 .. v25}, Li0/f1;->g()F

    .line 1535
    .line 1536
    .line 1537
    move-result v3

    .line 1538
    move-object/from16 v7, v24

    .line 1539
    .line 1540
    invoke-interface {v7, v3}, Lu2/c;->l0(F)F

    .line 1541
    .line 1542
    .line 1543
    move-result v3

    .line 1544
    const/4 v5, 0x2

    .line 1545
    if-eqz v16, :cond_51

    .line 1546
    .line 1547
    const v0, 0x5b387349

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v13, v0}, Li0/h0;->a0(I)V

    .line 1551
    .line 1552
    .line 1553
    move-object/from16 v7, v52

    .line 1554
    .line 1555
    invoke-static {v7, v12, v4, v5}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v0

    .line 1559
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1560
    .line 1561
    .line 1562
    move-result v1

    .line 1563
    move/from16 v4, v27

    .line 1564
    .line 1565
    invoke-virtual {v13, v4}, Li0/h0;->g(Z)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v5

    .line 1569
    or-int/2addr v1, v5

    .line 1570
    invoke-virtual {v13, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1571
    .line 1572
    .line 1573
    move-result v5

    .line 1574
    or-int/2addr v1, v5

    .line 1575
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v5

    .line 1579
    move-object/from16 v9, v53

    .line 1580
    .line 1581
    if-nez v1, :cond_43

    .line 1582
    .line 1583
    if-ne v5, v9, :cond_44

    .line 1584
    .line 1585
    :cond_43
    new-instance v22, Lwb/i3;

    .line 1586
    .line 1587
    const/16 v27, 0x1

    .line 1588
    .line 1589
    move-object/from16 v26, v2

    .line 1590
    .line 1591
    move/from16 v24, v4

    .line 1592
    .line 1593
    move-object/from16 v23, v11

    .line 1594
    .line 1595
    invoke-direct/range {v22 .. v27}, Lwb/i3;-><init>(Lxb/i;ZLi0/f1;Li0/l2;I)V

    .line 1596
    .line 1597
    .line 1598
    move-object/from16 v5, v22

    .line 1599
    .line 1600
    invoke-virtual {v13, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1601
    .line 1602
    .line 1603
    :cond_44
    check-cast v5, Lfg/l;

    .line 1604
    .line 1605
    invoke-static {v0, v5}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    if-eqz v6, :cond_45

    .line 1610
    .line 1611
    iget-object v5, v6, Lxb/o;->j:Ly0/o;

    .line 1612
    .line 1613
    if-eqz v5, :cond_45

    .line 1614
    .line 1615
    goto :goto_24

    .line 1616
    :cond_45
    move-object v5, v7

    .line 1617
    :goto_24
    invoke-interface {v0, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    iget-object v1, v11, Lxb/i;->r:Ly0/o;

    .line 1622
    .line 1623
    invoke-interface {v0, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v29

    .line 1627
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    if-ne v0, v9, :cond_46

    .line 1632
    .line 1633
    new-instance v0, Lv0/a;

    .line 1634
    .line 1635
    const/16 v1, 0x8

    .line 1636
    .line 1637
    invoke-direct {v0, v8, v1}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v13, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1641
    .line 1642
    .line 1643
    :cond_46
    move-object/from16 v31, v0

    .line 1644
    .line 1645
    check-cast v31, Lfg/a;

    .line 1646
    .line 1647
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v0

    .line 1651
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v1

    .line 1655
    if-nez v0, :cond_47

    .line 1656
    .line 1657
    if-ne v1, v9, :cond_48

    .line 1658
    .line 1659
    :cond_47
    new-instance v1, Lwb/f3;

    .line 1660
    .line 1661
    const/4 v0, 0x2

    .line 1662
    invoke-direct {v1, v11, v0}, Lwb/f3;-><init>(Lxb/i;I)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v13, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1666
    .line 1667
    .line 1668
    :cond_48
    move-object/from16 v32, v1

    .line 1669
    .line 1670
    check-cast v32, Lfg/l;

    .line 1671
    .line 1672
    move-object/from16 v0, v42

    .line 1673
    .line 1674
    invoke-virtual {v13, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v1

    .line 1678
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1679
    .line 1680
    .line 1681
    move-result v2

    .line 1682
    or-int/2addr v1, v2

    .line 1683
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v2

    .line 1687
    if-nez v1, :cond_49

    .line 1688
    .line 1689
    if-ne v2, v9, :cond_4a

    .line 1690
    .line 1691
    :cond_49
    new-instance v2, Lm/b;

    .line 1692
    .line 1693
    const/16 v1, 0x1b

    .line 1694
    .line 1695
    invoke-direct {v2, v0, v1, v11}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1699
    .line 1700
    .line 1701
    :cond_4a
    move-object/from16 v33, v2

    .line 1702
    .line 1703
    check-cast v33, Lfg/l;

    .line 1704
    .line 1705
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v0

    .line 1709
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v1

    .line 1713
    if-nez v0, :cond_4b

    .line 1714
    .line 1715
    if-ne v1, v9, :cond_4c

    .line 1716
    .line 1717
    :cond_4b
    new-instance v1, Lwb/f3;

    .line 1718
    .line 1719
    const/4 v0, 0x0

    .line 1720
    invoke-direct {v1, v11, v0}, Lwb/f3;-><init>(Lxb/i;I)V

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v13, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1724
    .line 1725
    .line 1726
    :cond_4c
    move-object/from16 v34, v1

    .line 1727
    .line 1728
    check-cast v34, Lfg/l;

    .line 1729
    .line 1730
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1731
    .line 1732
    .line 1733
    move-result v0

    .line 1734
    move/from16 v1, p0

    .line 1735
    .line 1736
    invoke-virtual {v13, v1}, Li0/h0;->g(Z)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v2

    .line 1740
    or-int/2addr v0, v2

    .line 1741
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v2

    .line 1745
    if-nez v0, :cond_4d

    .line 1746
    .line 1747
    if-ne v2, v9, :cond_4e

    .line 1748
    .line 1749
    :cond_4d
    new-instance v2, Lwb/g3;

    .line 1750
    .line 1751
    const/4 v0, 0x0

    .line 1752
    invoke-direct {v2, v11, v1, v0}, Lwb/g3;-><init>(Ljava/lang/Object;ZI)V

    .line 1753
    .line 1754
    .line 1755
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1756
    .line 1757
    .line 1758
    :cond_4e
    move-object/from16 v35, v2

    .line 1759
    .line 1760
    check-cast v35, Lfg/l;

    .line 1761
    .line 1762
    const/16 v36, 0x760

    .line 1763
    .line 1764
    invoke-static/range {v29 .. v36}, Lth/c;->b(Ly0/o;Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;I)Ly0/o;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v0

    .line 1768
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1769
    .line 1770
    .line 1771
    move-result v1

    .line 1772
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v2

    .line 1776
    if-nez v1, :cond_4f

    .line 1777
    .line 1778
    if-ne v2, v9, :cond_50

    .line 1779
    .line 1780
    :cond_4f
    new-instance v2, Lwb/h3;

    .line 1781
    .line 1782
    const/4 v1, 0x0

    .line 1783
    invoke-direct {v2, v11, v1}, Lwb/h3;-><init>(Lxb/i;I)V

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1787
    .line 1788
    .line 1789
    :cond_50
    check-cast v2, Lfg/a;

    .line 1790
    .line 1791
    invoke-static {v0, v8, v2}, Lyb/d;->a(Ly0/o;Lv/d;Lfg/a;)Ly0/o;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    int-to-float v1, v14

    .line 1796
    invoke-static {v0, v1}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v0

    .line 1800
    invoke-static {v0, v3}, Lp/h1;->n(Ly0/o;F)Ly0/o;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v0

    .line 1804
    const/4 v3, 0x0

    .line 1805
    invoke-static {v0, v13, v3}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1809
    .line 1810
    .line 1811
    goto :goto_25

    .line 1812
    :cond_51
    move/from16 v4, v27

    .line 1813
    .line 1814
    move-object/from16 v7, v52

    .line 1815
    .line 1816
    move-object/from16 v9, v53

    .line 1817
    .line 1818
    const v6, 0x5b61a728    # 6.351566E16f

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {v13, v6}, Li0/h0;->a0(I)V

    .line 1822
    .line 1823
    .line 1824
    const/4 v6, 0x0

    .line 1825
    invoke-static {v7, v12, v6, v5}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v5

    .line 1829
    invoke-virtual {v13, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1830
    .line 1831
    .line 1832
    move-result v6

    .line 1833
    invoke-virtual {v13, v4}, Li0/h0;->g(Z)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v10

    .line 1837
    or-int/2addr v6, v10

    .line 1838
    invoke-virtual {v13, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v10

    .line 1842
    or-int/2addr v6, v10

    .line 1843
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v10

    .line 1847
    if-nez v6, :cond_52

    .line 1848
    .line 1849
    if-ne v10, v9, :cond_53

    .line 1850
    .line 1851
    :cond_52
    new-instance v22, Lwb/i3;

    .line 1852
    .line 1853
    const/16 v27, 0x0

    .line 1854
    .line 1855
    move-object/from16 v26, v2

    .line 1856
    .line 1857
    move/from16 v24, v4

    .line 1858
    .line 1859
    move-object/from16 v23, v11

    .line 1860
    .line 1861
    invoke-direct/range {v22 .. v27}, Lwb/i3;-><init>(Lxb/i;ZLi0/f1;Li0/l2;I)V

    .line 1862
    .line 1863
    .line 1864
    move-object/from16 v10, v22

    .line 1865
    .line 1866
    invoke-virtual {v13, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1867
    .line 1868
    .line 1869
    :cond_53
    check-cast v10, Lfg/l;

    .line 1870
    .line 1871
    invoke-static {v5, v10}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v2

    .line 1875
    iget-object v4, v11, Lxb/i;->r:Ly0/o;

    .line 1876
    .line 1877
    invoke-interface {v2, v4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v2

    .line 1881
    invoke-static {v2, v8}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v2

    .line 1885
    const v4, 0x3e19999a    # 0.15f

    .line 1886
    .line 1887
    .line 1888
    invoke-static {v0, v1, v4}, Lf1/w;->b(JF)J

    .line 1889
    .line 1890
    .line 1891
    move-result-wide v0

    .line 1892
    invoke-static {v2, v0, v1, v8}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v0

    .line 1896
    int-to-float v1, v14

    .line 1897
    invoke-static {v0, v1}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v0

    .line 1901
    invoke-static {v0, v3}, Lp/h1;->n(Ly0/o;F)Ly0/o;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v0

    .line 1905
    const/4 v3, 0x0

    .line 1906
    invoke-static {v0, v13, v3}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1910
    .line 1911
    .line 1912
    :goto_25
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1913
    .line 1914
    .line 1915
    :goto_26
    const/4 v11, 0x1

    .line 1916
    goto :goto_27

    .line 1917
    :cond_54
    move-object/from16 v7, v52

    .line 1918
    .line 1919
    const/4 v3, 0x0

    .line 1920
    const v0, 0x5b6ba4c7

    .line 1921
    .line 1922
    .line 1923
    invoke-virtual {v13, v0}, Li0/h0;->a0(I)V

    .line 1924
    .line 1925
    .line 1926
    invoke-virtual {v13, v3}, Li0/h0;->p(Z)V

    .line 1927
    .line 1928
    .line 1929
    goto :goto_26

    .line 1930
    :goto_27
    invoke-virtual {v13, v11}, Li0/h0;->p(Z)V

    .line 1931
    .line 1932
    .line 1933
    move-object v1, v7

    .line 1934
    goto :goto_28

    .line 1935
    :cond_55
    invoke-virtual {v13}, Li0/h0;->V()V

    .line 1936
    .line 1937
    .line 1938
    move-object/from16 v1, p0

    .line 1939
    .line 1940
    :goto_28
    invoke-virtual {v13}, Li0/h0;->t()Li0/r1;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v10

    .line 1944
    if-eqz v10, :cond_56

    .line 1945
    .line 1946
    new-instance v0, Lwb/j3;

    .line 1947
    .line 1948
    move-object/from16 v2, p1

    .line 1949
    .line 1950
    move-object/from16 v3, p2

    .line 1951
    .line 1952
    move-object/from16 v4, p3

    .line 1953
    .line 1954
    move/from16 v5, p4

    .line 1955
    .line 1956
    move/from16 v6, p5

    .line 1957
    .line 1958
    move/from16 v7, p6

    .line 1959
    .line 1960
    move-object/from16 v8, p7

    .line 1961
    .line 1962
    move/from16 v9, p9

    .line 1963
    .line 1964
    invoke-direct/range {v0 .. v9}, Lwb/j3;-><init>(Ly0/o;Lfg/a;Lfg/l;Lth/a;IZZLs0/d;I)V

    .line 1965
    .line 1966
    .line 1967
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 1968
    .line 1969
    :cond_56
    return-void
.end method

.method public static final b(Li0/l2;)F
    .locals 0

    .line 1
    invoke-interface {p0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final c(Lp/f1;Lfg/a;Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v2, -0x68f08480

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Li0/h0;->b0(I)Li0/h0;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v2, v5, 0x6

    .line 24
    .line 25
    const/4 v6, 0x4

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    move v2, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v2, 0x2

    .line 37
    :goto_0
    or-int/2addr v2, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v2, v5

    .line 40
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 41
    .line 42
    move-object/from16 v13, p1

    .line 43
    .line 44
    if-nez v7, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    const/16 v7, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v7, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v2, v7

    .line 58
    :cond_3
    and-int/lit16 v7, v5, 0x180

    .line 59
    .line 60
    if-nez v7, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    const/16 v7, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v7, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v2, v7

    .line 74
    :cond_5
    and-int/lit16 v7, v5, 0xc00

    .line 75
    .line 76
    if-nez v7, :cond_7

    .line 77
    .line 78
    invoke-virtual {v0, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_6

    .line 83
    .line 84
    const/16 v7, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v7, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v2, v7

    .line 90
    :cond_7
    and-int/lit16 v7, v2, 0x493

    .line 91
    .line 92
    const/16 v8, 0x492

    .line 93
    .line 94
    const/4 v15, 0x0

    .line 95
    const/4 v9, 0x1

    .line 96
    if-eq v7, v8, :cond_8

    .line 97
    .line 98
    move v7, v9

    .line 99
    goto :goto_5

    .line 100
    :cond_8
    move v7, v15

    .line 101
    :goto_5
    and-int/lit8 v8, v2, 0x1

    .line 102
    .line 103
    invoke-virtual {v0, v8, v7}, Li0/h0;->S(IZ)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_c

    .line 108
    .line 109
    sget-object v7, Lwb/o3;->a:Li0/m2;

    .line 110
    .line 111
    invoke-virtual {v0, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Lfg/a;

    .line 116
    .line 117
    sget-object v8, Lv/e;->a:Lv/d;

    .line 118
    .line 119
    invoke-static {v3, v8}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    new-instance v12, Lf2/i;

    .line 124
    .line 125
    invoke-direct {v12, v6}, Lf2/i;-><init>(I)V

    .line 126
    .line 127
    .line 128
    const/16 v14, 0xc

    .line 129
    .line 130
    move v6, v9

    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    invoke-static/range {v8 .. v14}, Lk/n;->i(Ly0/o;Ln/k;Lk/y0;ZLf2/i;Lfg/a;I)Ly0/o;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    sget-object v9, Lp/h1;->b:Lp/a0;

    .line 139
    .line 140
    invoke-interface {v8, v9}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v1, v8, v6}, Lp/f1;->a(Ly0/o;Z)Ly0/o;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    if-nez v9, :cond_9

    .line 157
    .line 158
    sget-object v9, Li0/l;->a:Li0/e;

    .line 159
    .line 160
    if-ne v10, v9, :cond_a

    .line 161
    .line 162
    :cond_9
    new-instance v10, Lh0/g1;

    .line 163
    .line 164
    invoke-direct {v10, v7, v6}, Lh0/g1;-><init>(Lfg/a;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_a
    check-cast v10, Lfg/l;

    .line 171
    .line 172
    invoke-static {v8, v10}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    sget-object v8, Lp/j;->a:Lp/c;

    .line 177
    .line 178
    int-to-float v8, v6

    .line 179
    new-instance v9, Lp/h;

    .line 180
    .line 181
    new-instance v10, Lokio/a;

    .line 182
    .line 183
    const/4 v11, 0x3

    .line 184
    invoke-direct {v10, v11}, Lokio/a;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-direct {v9, v8, v15, v10}, Lp/h;-><init>(FZLokio/a;)V

    .line 188
    .line 189
    .line 190
    sget-object v8, Ly0/b;->t:Ly0/e;

    .line 191
    .line 192
    and-int/lit16 v2, v2, 0x1c00

    .line 193
    .line 194
    or-int/lit16 v2, v2, 0x1b0

    .line 195
    .line 196
    const/16 v10, 0x36

    .line 197
    .line 198
    invoke-static {v9, v8, v0, v10}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    iget-wide v9, v0, Li0/h0;->T:J

    .line 203
    .line 204
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    invoke-static {v0, v7}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 217
    .line 218
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 222
    .line 223
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 224
    .line 225
    .line 226
    iget-boolean v12, v0, Li0/h0;->S:Z

    .line 227
    .line 228
    if-eqz v12, :cond_b

    .line 229
    .line 230
    invoke-virtual {v0, v11}, Li0/h0;->k(Lfg/a;)V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_b
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 235
    .line 236
    .line 237
    :goto_6
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 238
    .line 239
    invoke-static {v11, v0, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object v8, Lx1/f;->d:Lx1/e;

    .line 243
    .line 244
    invoke-static {v8, v0, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    sget-object v9, Lx1/f;->f:Lx1/e;

    .line 252
    .line 253
    invoke-static {v9, v0, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    sget-object v8, Lx1/f;->g:Lx1/d;

    .line 257
    .line 258
    invoke-static {v8, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 259
    .line 260
    .line 261
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 262
    .line 263
    invoke-static {v8, v0, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    shr-int/lit8 v2, v2, 0x6

    .line 267
    .line 268
    and-int/lit8 v2, v2, 0x70

    .line 269
    .line 270
    or-int/lit8 v2, v2, 0x6

    .line 271
    .line 272
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    sget-object v7, Lp/u;->a:Lp/u;

    .line 277
    .line 278
    invoke-virtual {v4, v7, v0, v2}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v6}, Li0/h0;->p(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_c
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 286
    .line 287
    .line 288
    :goto_7
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    if-eqz v6, :cond_d

    .line 293
    .line 294
    new-instance v0, Ls0/c;

    .line 295
    .line 296
    move-object/from16 v2, p1

    .line 297
    .line 298
    invoke-direct/range {v0 .. v5}, Ls0/c;-><init>(Lp/f1;Lfg/a;Ly0/o;Ls0/d;I)V

    .line 299
    .line 300
    .line 301
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 302
    .line 303
    :cond_d
    return-void
.end method

.method public static final d(Lth/j;ZLy0/o;Ls0/d;Li0/h0;I)V
    .locals 16

    .line 1
    move/from16 v6, p1

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    const v1, 0x5b62d587

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p0

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    :goto_0
    or-int v1, p5, v1

    .line 25
    .line 26
    invoke-virtual {v0, v6}, Li0/h0;->g(Z)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    const/16 v5, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v5, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v1, v5

    .line 38
    invoke-virtual {v0, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    const/16 v5, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v5, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v1, v5

    .line 50
    and-int/lit16 v5, v1, 0x493

    .line 51
    .line 52
    const/16 v7, 0x492

    .line 53
    .line 54
    const/4 v15, 0x1

    .line 55
    const/4 v8, 0x0

    .line 56
    if-eq v5, v7, :cond_3

    .line 57
    .line 58
    move v5, v15

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move v5, v8

    .line 61
    :goto_3
    and-int/2addr v1, v15

    .line 62
    invoke-virtual {v0, v1, v5}, Li0/h0;->S(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_10

    .line 67
    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 71
    .line 72
    const/16 v5, 0x21

    .line 73
    .line 74
    if-lt v1, v5, :cond_4

    .line 75
    .line 76
    move v1, v15

    .line 77
    goto :goto_4

    .line 78
    :cond_4
    move v1, v8

    .line 79
    :goto_4
    invoke-static {v0}, Lk/n;->p(Li0/h0;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    sget-object v9, Li0/l;->a:Li0/e;

    .line 88
    .line 89
    if-ne v7, v9, :cond_5

    .line 90
    .line 91
    sget-object v7, Lv/e;->a:Lv/d;

    .line 92
    .line 93
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    check-cast v7, Lv/d;

    .line 97
    .line 98
    sget-object v10, Lbi/d;->a:Li0/m2;

    .line 99
    .line 100
    invoke-virtual {v0, v10}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    check-cast v10, Lbi/b;

    .line 105
    .line 106
    invoke-virtual {v10}, Lbi/b;->m()J

    .line 107
    .line 108
    .line 109
    move-result-wide v10

    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    const v12, 0x3ecccccd    # 0.4f

    .line 113
    .line 114
    .line 115
    invoke-static {v10, v11, v12}, Lf1/w;->b(JF)J

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    :cond_6
    sget-object v12, Lwb/o3;->b:Luh/b;

    .line 120
    .line 121
    const/high16 v13, -0x3dcc0000    # -45.0f

    .line 122
    .line 123
    const/4 v14, 0x6

    .line 124
    invoke-static {v12, v13, v0, v14}, Lwb/o3;->e(Luh/b;FLi0/h0;I)Luh/b;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    new-instance v13, Ll1/d;

    .line 129
    .line 130
    const/16 v14, 0xa

    .line 131
    .line 132
    int-to-float v14, v14

    .line 133
    sget-wide v2, Lf1/w;->b:J

    .line 134
    .line 135
    if-eqz v5, :cond_7

    .line 136
    .line 137
    const v5, 0x3e4ccccd    # 0.2f

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    const v5, 0x3dcccccd    # 0.1f

    .line 142
    .line 143
    .line 144
    :goto_5
    invoke-direct {v13, v14, v5, v2, v3}, Ll1/d;-><init>(FFJ)V

    .line 145
    .line 146
    .line 147
    new-instance v2, Lc1/q;

    .line 148
    .line 149
    invoke-direct {v2, v7, v13}, Lc1/q;-><init>(Lf1/r0;Ll1/d;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v4, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v3, Ly0/l;->a:Ly0/l;

    .line 157
    .line 158
    if-eqz v1, :cond_e

    .line 159
    .line 160
    const v1, -0x4d82c545

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Li0/h0;->a0(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    if-ne v1, v9, :cond_8

    .line 171
    .line 172
    new-instance v1, Lv0/a;

    .line 173
    .line 174
    const/16 v5, 0x8

    .line 175
    .line 176
    invoke-direct {v1, v7, v5}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_8
    check-cast v1, Lfg/a;

    .line 183
    .line 184
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    if-ne v5, v9, :cond_9

    .line 189
    .line 190
    new-instance v5, Lw0/l;

    .line 191
    .line 192
    const/4 v13, 0x5

    .line 193
    invoke-direct {v5, v13}, Lw0/l;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_9
    check-cast v5, Lfg/l;

    .line 200
    .line 201
    invoke-virtual {v0, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    if-nez v13, :cond_a

    .line 210
    .line 211
    if-ne v14, v9, :cond_b

    .line 212
    .line 213
    :cond_a
    new-instance v14, Lwb/l3;

    .line 214
    .line 215
    const/4 v13, 0x1

    .line 216
    invoke-direct {v14, v12, v13}, Lwb/l3;-><init>(Luh/b;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_b
    check-cast v14, Lfg/l;

    .line 223
    .line 224
    invoke-virtual {v0, v10, v11}, Li0/h0;->e(J)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    if-nez v12, :cond_c

    .line 233
    .line 234
    if-ne v13, v9, :cond_d

    .line 235
    .line 236
    :cond_c
    new-instance v13, Lca/c;

    .line 237
    .line 238
    const/16 v9, 0x12

    .line 239
    .line 240
    invoke-direct {v13, v10, v11, v9}, Lca/c;-><init>(JI)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_d
    check-cast v13, Lfg/l;

    .line 247
    .line 248
    move-object v11, v14

    .line 249
    const/16 v14, 0x770

    .line 250
    .line 251
    const/4 v12, 0x0

    .line 252
    move-object v9, v1

    .line 253
    move-object v10, v5

    .line 254
    move-object v1, v7

    .line 255
    move-object v7, v3

    .line 256
    move v3, v8

    .line 257
    move-object/from16 v8, p0

    .line 258
    .line 259
    invoke-static/range {v7 .. v14}, Lth/c;->b(Ly0/o;Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;I)Ly0/o;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-virtual {v0, v3}, Li0/h0;->p(Z)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_e
    move-object v1, v7

    .line 268
    move-object v7, v3

    .line 269
    move v3, v8

    .line 270
    const v5, -0x4d78c8fb

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v5}, Li0/h0;->a0(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v3}, Li0/h0;->p(Z)V

    .line 277
    .line 278
    .line 279
    invoke-static {v7, v10, v11, v1}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    :goto_6
    invoke-interface {v2, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-static {v2, v1}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    const/4 v2, 0x4

    .line 292
    int-to-float v2, v2

    .line 293
    invoke-static {v1, v2}, Lp/d;->l(Ly0/o;F)Ly0/o;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    sget-object v2, Ly0/b;->k:Ly0/g;

    .line 298
    .line 299
    invoke-static {v2, v3}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget-wide v7, v0, Li0/h0;->T:J

    .line 304
    .line 305
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-static {v0, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 318
    .line 319
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 323
    .line 324
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 325
    .line 326
    .line 327
    iget-boolean v8, v0, Li0/h0;->S:Z

    .line 328
    .line 329
    if-eqz v8, :cond_f

    .line 330
    .line 331
    invoke-virtual {v0, v7}, Li0/h0;->k(Lfg/a;)V

    .line 332
    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_f
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 336
    .line 337
    .line 338
    :goto_7
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 339
    .line 340
    invoke-static {v7, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 344
    .line 345
    invoke-static {v2, v0, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    sget-object v3, Lx1/f;->f:Lx1/e;

    .line 353
    .line 354
    invoke-static {v3, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 358
    .line 359
    invoke-static {v2, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 360
    .line 361
    .line 362
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 363
    .line 364
    invoke-static {v2, v0, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    const/16 v1, 0x36

    .line 368
    .line 369
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    sget-object v2, Lp/r;->a:Lp/r;

    .line 374
    .line 375
    move-object/from16 v5, p3

    .line 376
    .line 377
    invoke-virtual {v5, v2, v0, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v15}, Li0/h0;->p(Z)V

    .line 381
    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_10
    move-object/from16 v5, p3

    .line 385
    .line 386
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 387
    .line 388
    .line 389
    :goto_8
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    if-eqz v7, :cond_11

    .line 394
    .line 395
    new-instance v0, Lsh/j;

    .line 396
    .line 397
    const/4 v2, 0x2

    .line 398
    move-object/from16 v3, p0

    .line 399
    .line 400
    move/from16 v1, p5

    .line 401
    .line 402
    invoke-direct/range {v0 .. v6}, Lsh/j;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lsf/b;Z)V

    .line 403
    .line 404
    .line 405
    iput-object v0, v7, Li0/r1;->d:Lfg/p;

    .line 406
    .line 407
    :cond_11
    return-void
.end method

.method public static final e(Luh/b;FLi0/h0;I)Luh/b;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Luh/b;->c:Luh/a;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v4, v3, Luh/a;->d:Luh/d;

    .line 13
    .line 14
    sget-object v5, Ly1/i0;->b:Li0/m2;

    .line 15
    .line 16
    invoke-virtual {v2, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Landroid/content/Context;

    .line 21
    .line 22
    sget-object v6, Lo3/a;->a:Li0/p1;

    .line 23
    .line 24
    invoke-virtual {v2, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Landroidx/lifecycle/q;

    .line 29
    .line 30
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    sget-object v8, Li0/l;->a:Li0/e;

    .line 35
    .line 36
    if-ne v7, v8, :cond_0

    .line 37
    .line 38
    sget-object v7, Lwh/a;->e:Lwh/a;

    .line 39
    .line 40
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v2, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    check-cast v7, Li0/a1;

    .line 48
    .line 49
    const v9, 0x3e19999a    # 0.15f

    .line 50
    .line 51
    .line 52
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-virtual {v2, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    invoke-virtual {v2, v9}, Li0/h0;->c(F)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    or-int/2addr v9, v11

    .line 65
    invoke-virtual {v2, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    or-int/2addr v9, v11

    .line 70
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    if-nez v9, :cond_1

    .line 75
    .line 76
    if-ne v11, v8, :cond_2

    .line 77
    .line 78
    :cond_1
    new-instance v11, Lwb/dj;

    .line 79
    .line 80
    const/16 v9, 0x9

    .line 81
    .line 82
    invoke-direct {v11, v5, v6, v7, v9}, Lwb/dj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    check-cast v11, Lfg/l;

    .line 89
    .line 90
    invoke-virtual {v2, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-virtual {v2, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    or-int/2addr v5, v6

    .line 99
    invoke-virtual {v2, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    or-int/2addr v5, v6

    .line 104
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-nez v5, :cond_3

    .line 109
    .line 110
    if-ne v6, v8, :cond_4

    .line 111
    .line 112
    :cond_3
    new-instance v6, Li0/y;

    .line 113
    .line 114
    invoke-direct {v6, v11}, Li0/y;-><init>(Lfg/l;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    check-cast v6, Li0/y;

    .line 121
    .line 122
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Lwh/a;

    .line 127
    .line 128
    invoke-virtual {v2, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-virtual {v2, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    or-int/2addr v5, v6

    .line 137
    and-int/lit8 v6, p3, 0x70

    .line 138
    .line 139
    xor-int/lit8 v6, v6, 0x30

    .line 140
    .line 141
    const/16 v9, 0x20

    .line 142
    .line 143
    if-le v6, v9, :cond_5

    .line 144
    .line 145
    invoke-virtual {v2, v1}, Li0/h0;->c(F)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_6

    .line 150
    .line 151
    :cond_5
    and-int/lit8 v6, p3, 0x30

    .line 152
    .line 153
    if-ne v6, v9, :cond_7

    .line 154
    .line 155
    :cond_6
    const/4 v6, 0x1

    .line 156
    goto :goto_0

    .line 157
    :cond_7
    const/4 v6, 0x0

    .line 158
    :goto_0
    or-int/2addr v5, v6

    .line 159
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    const/4 v9, 0x0

    .line 164
    if-nez v5, :cond_8

    .line 165
    .line 166
    if-ne v6, v8, :cond_a

    .line 167
    .line 168
    :cond_8
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Lwh/a;

    .line 173
    .line 174
    iget v5, v5, Lwh/a;->c:F

    .line 175
    .line 176
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    check-cast v6, Lwh/a;

    .line 181
    .line 182
    iget v6, v6, Lwh/a;->d:F

    .line 183
    .line 184
    mul-float v7, v5, v5

    .line 185
    .line 186
    mul-float v10, v6, v6

    .line 187
    .line 188
    add-float/2addr v10, v7

    .line 189
    const v7, 0x3c23d70a    # 0.01f

    .line 190
    .line 191
    .line 192
    cmpl-float v7, v10, v7

    .line 193
    .line 194
    if-lez v7, :cond_9

    .line 195
    .line 196
    float-to-double v10, v10

    .line 197
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 198
    .line 199
    .line 200
    move-result-wide v10

    .line 201
    double-to-float v7, v10

    .line 202
    const/high16 v10, 0x3f800000    # 1.0f

    .line 203
    .line 204
    div-float/2addr v10, v7

    .line 205
    mul-float/2addr v5, v10

    .line 206
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    mul-float/2addr v6, v10

    .line 211
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    new-instance v7, Lsf/e;

    .line 216
    .line 217
    invoke-direct {v7, v5, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_9
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    const/high16 v6, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    new-instance v7, Lsf/e;

    .line 232
    .line 233
    invoke-direct {v7, v5, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :goto_1
    iget-object v5, v7, Lsf/e;->g:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v5, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    iget-object v6, v7, Lsf/e;->h:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v6, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    float-to-double v10, v1

    .line 253
    const-wide v12, 0x400921fb54442d18L    # Math.PI

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    mul-double/2addr v10, v12

    .line 259
    const-wide v12, 0x4066800000000000L    # 180.0

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    div-double/2addr v10, v12

    .line 265
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 266
    .line 267
    .line 268
    move-result-wide v12

    .line 269
    double-to-float v1, v12

    .line 270
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 271
    .line 272
    .line 273
    move-result-wide v10

    .line 274
    double-to-float v7, v10

    .line 275
    mul-float v10, v1, v5

    .line 276
    .line 277
    mul-float v11, v7, v6

    .line 278
    .line 279
    sub-float/2addr v10, v11

    .line 280
    mul-float/2addr v7, v5

    .line 281
    mul-float/2addr v1, v6

    .line 282
    add-float/2addr v1, v7

    .line 283
    new-instance v5, Luh/c;

    .line 284
    .line 285
    const/high16 v6, 0x3f000000    # 0.5f

    .line 286
    .line 287
    add-float/2addr v10, v6

    .line 288
    const v6, 0x3f333333    # 0.7f

    .line 289
    .line 290
    .line 291
    add-float/2addr v1, v6

    .line 292
    iget-object v6, v4, Luh/d;->a:Luh/c;

    .line 293
    .line 294
    iget v6, v6, Luh/c;->c:F

    .line 295
    .line 296
    invoke-direct {v5, v10, v1, v6}, Luh/c;-><init>(FFF)V

    .line 297
    .line 298
    .line 299
    iget-wide v6, v4, Luh/d;->b:J

    .line 300
    .line 301
    iget v1, v4, Luh/d;->c:F

    .line 302
    .line 303
    new-instance v4, Luh/d;

    .line 304
    .line 305
    invoke-direct {v4, v5, v6, v7, v1}, Luh/d;-><init>(Luh/c;JF)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    move-object v6, v4

    .line 312
    :cond_a
    move-object v15, v6

    .line 313
    check-cast v15, Luh/d;

    .line 314
    .line 315
    invoke-virtual {v2, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    if-nez v1, :cond_b

    .line 324
    .line 325
    if-ne v4, v8, :cond_c

    .line 326
    .line 327
    :cond_b
    iget-wide v11, v3, Luh/a;->a:J

    .line 328
    .line 329
    iget v13, v3, Luh/a;->b:I

    .line 330
    .line 331
    iget v14, v3, Luh/a;->c:F

    .line 332
    .line 333
    iget-object v1, v3, Luh/a;->e:Luh/d;

    .line 334
    .line 335
    iget-boolean v3, v3, Luh/a;->f:Z

    .line 336
    .line 337
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    new-instance v10, Luh/a;

    .line 344
    .line 345
    move-object/from16 v16, v1

    .line 346
    .line 347
    move/from16 v17, v3

    .line 348
    .line 349
    invoke-direct/range {v10 .. v17}, Luh/a;-><init>(JIFLuh/d;Luh/d;Z)V

    .line 350
    .line 351
    .line 352
    const/4 v1, 0x3

    .line 353
    invoke-static {v0, v9, v10, v1}, Luh/b;->a(Luh/b;FLuh/a;I)Luh/b;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {v2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_c
    check-cast v4, Luh/b;

    .line 361
    .line 362
    return-object v4
.end method
