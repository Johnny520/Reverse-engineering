.class public abstract Ls/r0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9c4

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Ls/r0;->a:F

    .line 5
    .line 6
    const/16 v0, 0x5dc

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    sput v0, Ls/r0;->b:F

    .line 10
    .line 11
    const/16 v0, 0x32

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    sput v0, Ls/r0;->c:F

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lm/k2;IILu2/c;Lyf/c;)Ljava/lang/Object;
    .locals 25

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Ls/q0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Ls/q0;

    .line 13
    .line 14
    iget v4, v3, Ls/q0;->r:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Ls/q0;->r:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Ls/q0;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Lyf/c;-><init>(Lwf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Ls/q0;->q:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Ls/q0;->r:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x1

    .line 38
    sget-object v9, Lxf/a;->g:Lxf/a;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v8, :cond_2

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Ls/q0;->k:I

    .line 47
    .line 48
    iget-object v1, v3, Ls/q0;->g:Lm/k2;

    .line 49
    .line 50
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_f

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0

    .line 62
    :cond_2
    iget v0, v3, Ls/q0;->m:I

    .line 63
    .line 64
    iget v1, v3, Ls/q0;->p:F

    .line 65
    .line 66
    iget v4, v3, Ls/q0;->o:F

    .line 67
    .line 68
    iget v10, v3, Ls/q0;->n:F

    .line 69
    .line 70
    iget v11, v3, Ls/q0;->l:I

    .line 71
    .line 72
    iget v12, v3, Ls/q0;->k:I

    .line 73
    .line 74
    iget-object v13, v3, Ls/q0;->j:Lgg/s;

    .line 75
    .line 76
    iget-object v14, v3, Ls/q0;->i:Lgg/u;

    .line 77
    .line 78
    iget-object v15, v3, Ls/q0;->h:Lgg/q;

    .line 79
    .line 80
    iget-object v7, v3, Ls/q0;->g:Lm/k2;

    .line 81
    .line 82
    :try_start_0
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ls/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    move-object v2, v15

    .line 86
    move-object v15, v7

    .line 87
    move-object v7, v2

    .line 88
    move v2, v1

    .line 89
    move v1, v12

    .line 90
    :goto_1
    move/from16 v21, v4

    .line 91
    .line 92
    move-object v4, v14

    .line 93
    goto/16 :goto_9

    .line 94
    .line 95
    :catch_0
    move-exception v0

    .line 96
    move-object v11, v7

    .line 97
    move v7, v12

    .line 98
    goto/16 :goto_c

    .line 99
    .line 100
    :cond_3
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    int-to-float v2, v1

    .line 104
    cmpl-float v2, v2, v5

    .line 105
    .line 106
    if-ltz v2, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    const-string v2, "Index should be non-negative"

    .line 110
    .line 111
    invoke-static {v2}, Lo/b;->a(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    :try_start_1
    sget v2, Ls/r0;->a:F

    .line 115
    .line 116
    invoke-interface {v0, v2}, Lu2/c;->x0(F)F

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    sget v4, Ls/r0;->b:F

    .line 121
    .line 122
    invoke-interface {v0, v4}, Lu2/c;->x0(F)F

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    sget v7, Ls/r0;->c:F

    .line 127
    .line 128
    invoke-interface {v0, v7}, Lu2/c;->x0(F)F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    new-instance v7, Lgg/q;

    .line 133
    .line 134
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-boolean v8, v7, Lgg/q;->g:Z

    .line 138
    .line 139
    new-instance v10, Lgg/u;

    .line 140
    .line 141
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 142
    .line 143
    .line 144
    const/16 v11, 0x1e

    .line 145
    .line 146
    invoke-static {v5, v5, v11}, Li/d;->b(FFI)Li/l;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    iput-object v11, v10, Lgg/u;->g:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static/range {p0 .. p1}, Ls/r0;->c(Lm/k2;I)Z

    .line 153
    .line 154
    .line 155
    move-result v11
    :try_end_1
    .catch Ls/j; {:try_start_1 .. :try_end_1} :catch_8

    .line 156
    if-nez v11, :cond_c

    .line 157
    .line 158
    move-object/from16 v11, p0

    .line 159
    .line 160
    :try_start_2
    iget-object v12, v11, Lm/k2;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v12, Lr/z;

    .line 163
    .line 164
    invoke-virtual {v12}, Lr/z;->h()I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-le v1, v12, :cond_5

    .line 169
    .line 170
    move v12, v8

    .line 171
    goto :goto_3

    .line 172
    :cond_5
    const/4 v12, 0x0

    .line 173
    :goto_3
    new-instance v13, Lgg/s;

    .line 174
    .line 175
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    iput v8, v13, Lgg/s;->g:I
    :try_end_2
    .catch Ls/j; {:try_start_2 .. :try_end_2} :catch_7

    .line 179
    .line 180
    move/from16 v23, p2

    .line 181
    .line 182
    move/from16 v21, v4

    .line 183
    .line 184
    move-object v4, v10

    .line 185
    move-object v15, v11

    .line 186
    move v10, v2

    .line 187
    move v2, v0

    .line 188
    move v0, v12

    .line 189
    :goto_4
    move-object/from16 v22, v13

    .line 190
    .line 191
    :try_start_3
    iget-boolean v11, v7, Lgg/q;->g:Z
    :try_end_3
    .catch Ls/j; {:try_start_3 .. :try_end_3} :catch_5

    .line 192
    .line 193
    if-eqz v11, :cond_f

    .line 194
    .line 195
    :try_start_4
    iget-object v11, v15, Lm/k2;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v11, Lr/z;

    .line 198
    .line 199
    invoke-virtual {v11}, Lr/z;->j()Lr/p;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    iget v11, v11, Lr/p;->n:I
    :try_end_4
    .catch Ls/j; {:try_start_4 .. :try_end_4} :catch_6

    .line 204
    .line 205
    if-lez v11, :cond_f

    .line 206
    .line 207
    :try_start_5
    invoke-static {v15, v1}, Lm/k2;->b(Lm/k2;I)I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 212
    .line 213
    .line 214
    move-result v12
    :try_end_5
    .catch Ls/j; {:try_start_5 .. :try_end_5} :catch_5

    .line 215
    int-to-float v12, v12

    .line 216
    cmpg-float v12, v12, v10

    .line 217
    .line 218
    if-gez v12, :cond_7

    .line 219
    .line 220
    int-to-float v11, v11

    .line 221
    :try_start_6
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    invoke-static {v11, v2}, Ljava/lang/Math;->max(FF)F

    .line 226
    .line 227
    .line 228
    move-result v11
    :try_end_6
    .catch Ls/j; {:try_start_6 .. :try_end_6} :catch_1

    .line 229
    if-eqz v0, :cond_6

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_6
    neg-float v11, v11

    .line 233
    goto :goto_6

    .line 234
    :catch_1
    move-exception v0

    .line 235
    move v7, v1

    .line 236
    :goto_5
    move-object v11, v15

    .line 237
    goto/16 :goto_c

    .line 238
    .line 239
    :cond_7
    if-eqz v0, :cond_8

    .line 240
    .line 241
    move v11, v10

    .line 242
    goto :goto_6

    .line 243
    :cond_8
    neg-float v11, v10

    .line 244
    :goto_6
    :try_start_7
    iget-object v12, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v12, Li/l;

    .line 247
    .line 248
    invoke-static {v12, v5}, Li/d;->j(Li/l;F)Li/l;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    iput-object v12, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 253
    .line 254
    new-instance v18, Lgg/r;

    .line 255
    .line 256
    invoke-direct/range {v18 .. v18}, Ljava/lang/Object;-><init>()V
    :try_end_7
    .catch Ls/j; {:try_start_7 .. :try_end_7} :catch_5

    .line 257
    .line 258
    .line 259
    :try_start_8
    new-instance v13, Ljava/lang/Float;

    .line 260
    .line 261
    invoke-direct {v13, v11}, Ljava/lang/Float;-><init>(F)V
    :try_end_8
    .catch Ls/j; {:try_start_8 .. :try_end_8} :catch_6

    .line 262
    .line 263
    .line 264
    :try_start_9
    iget-object v14, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v14, Li/l;
    :try_end_9
    .catch Ls/j; {:try_start_9 .. :try_end_9} :catch_5

    .line 267
    .line 268
    :try_start_a
    iget-object v6, v14, Li/l;->g:Li/m1;

    .line 269
    .line 270
    iget-object v6, v6, Li/m1;->b:Lfg/l;

    .line 271
    .line 272
    iget-object v14, v14, Li/l;->i:Li/q;

    .line 273
    .line 274
    invoke-interface {v6, v14}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6
    :try_end_a
    .catch Ls/j; {:try_start_a .. :try_end_a} :catch_6

    .line 278
    :try_start_b
    check-cast v6, Ljava/lang/Number;

    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    cmpg-float v6, v6, v5

    .line 285
    .line 286
    if-nez v6, :cond_9

    .line 287
    .line 288
    move v6, v8

    .line 289
    goto :goto_7

    .line 290
    :cond_9
    const/4 v6, 0x0

    .line 291
    :goto_7
    xor-int/2addr v6, v8

    .line 292
    if-eqz v0, :cond_a

    .line 293
    .line 294
    move/from16 v20, v8

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_a
    const/16 v20, 0x0

    .line 298
    .line 299
    :goto_8
    new-instance v14, Ls/p0;
    :try_end_b
    .catch Ls/j; {:try_start_b .. :try_end_b} :catch_5

    .line 300
    .line 301
    move/from16 v16, v1

    .line 302
    .line 303
    move-object/from16 v24, v4

    .line 304
    .line 305
    move-object/from16 v19, v7

    .line 306
    .line 307
    move/from16 v17, v11

    .line 308
    .line 309
    :try_start_c
    invoke-direct/range {v14 .. v24}, Ls/p0;-><init>(Lm/k2;IFLgg/r;Lgg/q;ZFLgg/s;ILgg/u;)V
    :try_end_c
    .catch Ls/j; {:try_start_c .. :try_end_c} :catch_4

    .line 310
    .line 311
    .line 312
    move-object/from16 v20, v14

    .line 313
    .line 314
    move-object v11, v15

    .line 315
    move/from16 v7, v16

    .line 316
    .line 317
    move-object/from16 v15, v19

    .line 318
    .line 319
    move/from16 v4, v21

    .line 320
    .line 321
    move-object/from16 v1, v22

    .line 322
    .line 323
    move/from16 v5, v23

    .line 324
    .line 325
    move-object/from16 v14, v24

    .line 326
    .line 327
    :try_start_d
    iput-object v11, v3, Ls/q0;->g:Lm/k2;

    .line 328
    .line 329
    iput-object v15, v3, Ls/q0;->h:Lgg/q;

    .line 330
    .line 331
    iput-object v14, v3, Ls/q0;->i:Lgg/u;

    .line 332
    .line 333
    iput-object v1, v3, Ls/q0;->j:Lgg/s;

    .line 334
    .line 335
    iput v7, v3, Ls/q0;->k:I

    .line 336
    .line 337
    iput v5, v3, Ls/q0;->l:I

    .line 338
    .line 339
    iput v10, v3, Ls/q0;->n:F

    .line 340
    .line 341
    iput v4, v3, Ls/q0;->o:F

    .line 342
    .line 343
    iput v2, v3, Ls/q0;->p:F

    .line 344
    .line 345
    iput v0, v3, Ls/q0;->m:I

    .line 346
    .line 347
    iput v8, v3, Ls/q0;->r:I
    :try_end_d
    .catch Ls/j; {:try_start_d .. :try_end_d} :catch_3

    .line 348
    .line 349
    const/16 v18, 0x0

    .line 350
    .line 351
    const/16 v22, 0x2

    .line 352
    .line 353
    move-object/from16 v21, v3

    .line 354
    .line 355
    move/from16 v19, v6

    .line 356
    .line 357
    move-object/from16 v16, v12

    .line 358
    .line 359
    move-object/from16 v17, v13

    .line 360
    .line 361
    :try_start_e
    invoke-static/range {v16 .. v22}, Li/d;->h(Li/l;Ljava/lang/Float;Li/k;ZLfg/l;Lyf/c;I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v3
    :try_end_e
    .catch Ls/j; {:try_start_e .. :try_end_e} :catch_2

    .line 365
    if-ne v3, v9, :cond_b

    .line 366
    .line 367
    goto/16 :goto_e

    .line 368
    .line 369
    :cond_b
    move-object v13, v1

    .line 370
    move v1, v7

    .line 371
    move-object v7, v15

    .line 372
    move-object/from16 v3, v21

    .line 373
    .line 374
    move-object v15, v11

    .line 375
    move v11, v5

    .line 376
    goto/16 :goto_1

    .line 377
    .line 378
    :goto_9
    :try_start_f
    iget v5, v13, Lgg/s;->g:I

    .line 379
    .line 380
    add-int/2addr v5, v8

    .line 381
    iput v5, v13, Lgg/s;->g:I
    :try_end_f
    .catch Ls/j; {:try_start_f .. :try_end_f} :catch_1

    .line 382
    .line 383
    move/from16 v23, v11

    .line 384
    .line 385
    const/4 v5, 0x0

    .line 386
    const/4 v6, 0x2

    .line 387
    goto/16 :goto_4

    .line 388
    .line 389
    :catch_2
    move-exception v0

    .line 390
    :goto_a
    move-object/from16 v3, v21

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :catch_3
    move-exception v0

    .line 394
    move-object/from16 v21, v3

    .line 395
    .line 396
    goto :goto_c

    .line 397
    :catch_4
    move-exception v0

    .line 398
    move-object/from16 v21, v3

    .line 399
    .line 400
    move-object v11, v15

    .line 401
    move/from16 v7, v16

    .line 402
    .line 403
    goto :goto_c

    .line 404
    :catch_5
    move-exception v0

    .line 405
    move v7, v1

    .line 406
    move-object/from16 v21, v3

    .line 407
    .line 408
    goto/16 :goto_5

    .line 409
    .line 410
    :catch_6
    move-exception v0

    .line 411
    move v7, v1

    .line 412
    move-object/from16 v21, v3

    .line 413
    .line 414
    move-object v11, v15

    .line 415
    goto :goto_a

    .line 416
    :catch_7
    move-exception v0

    .line 417
    :goto_b
    move v7, v1

    .line 418
    goto :goto_c

    .line 419
    :cond_c
    move-object/from16 v11, p0

    .line 420
    .line 421
    :try_start_10
    invoke-static/range {p0 .. p1}, Lm/k2;->b(Lm/k2;I)I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    new-instance v2, Ls/j;

    .line 426
    .line 427
    iget-object v4, v10, Lgg/u;->g:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v4, Li/l;

    .line 430
    .line 431
    invoke-direct {v2, v0, v4}, Ls/j;-><init>(ILi/l;)V

    .line 432
    .line 433
    .line 434
    throw v2
    :try_end_10
    .catch Ls/j; {:try_start_10 .. :try_end_10} :catch_7

    .line 435
    :catch_8
    move-exception v0

    .line 436
    move-object/from16 v11, p0

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :goto_c
    iget-object v1, v0, Ls/j;->h:Li/l;

    .line 440
    .line 441
    const/4 v2, 0x0

    .line 442
    invoke-static {v1, v2}, Li/d;->j(Li/l;F)Li/l;

    .line 443
    .line 444
    .line 445
    move-result-object v12

    .line 446
    iget v0, v0, Ls/j;->g:I

    .line 447
    .line 448
    int-to-float v0, v0

    .line 449
    new-instance v1, Lgg/r;

    .line 450
    .line 451
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 452
    .line 453
    .line 454
    new-instance v13, Ljava/lang/Float;

    .line 455
    .line 456
    invoke-direct {v13, v0}, Ljava/lang/Float;-><init>(F)V

    .line 457
    .line 458
    .line 459
    iget-object v2, v12, Li/l;->g:Li/m1;

    .line 460
    .line 461
    iget-object v2, v2, Li/m1;->b:Lfg/l;

    .line 462
    .line 463
    iget-object v4, v12, Li/l;->i:Li/q;

    .line 464
    .line 465
    invoke-interface {v2, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    check-cast v2, Ljava/lang/Number;

    .line 470
    .line 471
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    const/16 v23, 0x0

    .line 476
    .line 477
    cmpg-float v2, v2, v23

    .line 478
    .line 479
    if-nez v2, :cond_d

    .line 480
    .line 481
    move v2, v8

    .line 482
    goto :goto_d

    .line 483
    :cond_d
    const/4 v2, 0x0

    .line 484
    :goto_d
    xor-int/lit8 v15, v2, 0x1

    .line 485
    .line 486
    new-instance v2, Lm/e3;

    .line 487
    .line 488
    const/4 v4, 0x1

    .line 489
    invoke-direct {v2, v0, v1, v11, v4}, Lm/e3;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    .line 490
    .line 491
    .line 492
    iput-object v11, v3, Ls/q0;->g:Lm/k2;

    .line 493
    .line 494
    const/4 v0, 0x0

    .line 495
    iput-object v0, v3, Ls/q0;->h:Lgg/q;

    .line 496
    .line 497
    iput-object v0, v3, Ls/q0;->i:Lgg/u;

    .line 498
    .line 499
    iput-object v0, v3, Ls/q0;->j:Lgg/s;

    .line 500
    .line 501
    iput v7, v3, Ls/q0;->k:I

    .line 502
    .line 503
    const/4 v1, 0x2

    .line 504
    iput v1, v3, Ls/q0;->r:I

    .line 505
    .line 506
    const/4 v14, 0x0

    .line 507
    const/16 v18, 0x2

    .line 508
    .line 509
    move-object/from16 v16, v2

    .line 510
    .line 511
    move-object/from16 v17, v3

    .line 512
    .line 513
    invoke-static/range {v12 .. v18}, Li/d;->h(Li/l;Ljava/lang/Float;Li/k;ZLfg/l;Lyf/c;I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    if-ne v0, v9, :cond_e

    .line 518
    .line 519
    :goto_e
    return-object v9

    .line 520
    :cond_e
    move v0, v7

    .line 521
    move-object v1, v11

    .line 522
    :goto_f
    iget-object v1, v1, Lm/k2;->c:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v1, Lr/z;

    .line 525
    .line 526
    invoke-virtual {v1, v0, v8}, Lr/z;->n(IZ)V

    .line 527
    .line 528
    .line 529
    :cond_f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 530
    .line 531
    return-object v0
.end method

.method public static final b(ZLm/k2;I)Z
    .locals 0

    .line 1
    iget-object p1, p1, Lm/k2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lr/z;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lr/z;->h()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-le p0, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lr/z;->h()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-ne p0, p2, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1}, Lr/z;->i()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-lez p0, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Lr/z;->h()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ge p0, p2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {p1}, Lr/z;->h()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-ne p0, p2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lr/z;->i()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-gez p0, :cond_3

    .line 45
    .line 46
    :goto_0
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_3
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final c(Lm/k2;I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/k2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr/z;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/z;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lm/k2;->c()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-gt p1, p0, :cond_0

    .line 14
    .line 15
    if-gt v0, p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
