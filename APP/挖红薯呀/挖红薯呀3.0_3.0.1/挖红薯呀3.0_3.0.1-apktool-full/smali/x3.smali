.class public final synthetic Lx3;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx3;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lx3;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx3;->d:I

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v0, v0, Lx3;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Lsw;

    .line 13
    .line 14
    invoke-static {v0}, Lwb1;->b(Lsw;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast v0, Ltv0;

    .line 19
    .line 20
    invoke-static {v0}, Ltv0;->a(Ltv0;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    check-cast v0, Los0;

    .line 25
    .line 26
    iget-object v1, v0, Los0;->i:Lz90;

    .line 27
    .line 28
    iget v2, v0, Los0;->e:I

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    iput-boolean v4, v0, Los0;->f:Z

    .line 33
    .line 34
    sget-object v2, Lq90;->ON_PAUSE:Lq90;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lz90;->e(Lq90;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget v2, v0, Los0;->d:I

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget-boolean v2, v0, Los0;->f:Z

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    sget-object v2, Lq90;->ON_STOP:Lq90;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lz90;->e(Lq90;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v4, v0, Los0;->g:Z

    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :pswitch_2
    check-cast v0, Lm90;

    .line 56
    .line 57
    invoke-static {v0}, Lm90;->b(Lm90;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_3
    move-object v1, v0

    .line 62
    check-cast v1, Lsv;

    .line 63
    .line 64
    const-string v0, "fetchFonts result is not OK. ("

    .line 65
    .line 66
    iget-object v2, v1, Lsv;->g:Ljava/lang/Object;

    .line 67
    .line 68
    monitor-enter v2

    .line 69
    :try_start_0
    iget-object v4, v1, Lsv;->k:Ls91;

    .line 70
    .line 71
    if-nez v4, :cond_2

    .line 72
    .line 73
    monitor-exit v2

    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :try_start_1
    invoke-virtual {v1}, Lsv;->c()Lcw;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget v4, v2, Lcw;->f:I

    .line 85
    .line 86
    if-ne v4, v3, :cond_3

    .line 87
    .line 88
    iget-object v3, v1, Lsv;->g:Ljava/lang/Object;

    .line 89
    .line 90
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 91
    :try_start_2
    monitor-exit v3

    .line 92
    goto :goto_0

    .line 93
    :catchall_1
    move-exception v0

    .line 94
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 96
    :catchall_2
    move-exception v0

    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_3
    :goto_0
    if-nez v4, :cond_6

    .line 100
    .line 101
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 102
    .line 103
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v1, Lsv;->f:Lr3;

    .line 107
    .line 108
    iget-object v3, v1, Lsv;->d:Landroid/content/Context;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    filled-new-array {v2}, [Lcw;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v3, v0}, Lw91;->a(Landroid/content/Context;[Lcw;)Landroid/graphics/Typeface;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v3, v1, Lsv;->d:Landroid/content/Context;

    .line 122
    .line 123
    iget-object v2, v2, Lcw;->a:Landroid/net/Uri;

    .line 124
    .line 125
    invoke-static {v3, v2}, Lu50;->t(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 126
    .line 127
    .line 128
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 129
    if-eqz v2, :cond_5

    .line 130
    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    :try_start_5
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 134
    .line 135
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Ly2;

    .line 139
    .line 140
    invoke-static {v2}, Lz60;->L(Ljava/nio/MappedByteBuffer;)Lge0;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-direct {v3, v0, v2}, Ly2;-><init>(Landroid/graphics/Typeface;Lge0;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 145
    .line 146
    .line 147
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 148
    .line 149
    .line 150
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 151
    .line 152
    .line 153
    iget-object v2, v1, Lsv;->g:Ljava/lang/Object;

    .line 154
    .line 155
    monitor-enter v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 156
    :try_start_8
    iget-object v0, v1, Lsv;->k:Ls91;

    .line 157
    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Ls91;->I(Ly2;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :catchall_3
    move-exception v0

    .line 165
    goto :goto_2

    .line 166
    :cond_4
    :goto_1
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 167
    :try_start_9
    invoke-virtual {v1}, Lsv;->b()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :goto_2
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 172
    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 173
    :catchall_4
    move-exception v0

    .line 174
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 179
    .line 180
    const-string v2, "Unable to open file."

    .line 181
    .line 182
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 186
    :catchall_5
    move-exception v0

    .line 187
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :cond_6
    new-instance v2, Ljava/lang/RuntimeException;

    .line 192
    .line 193
    new-instance v3, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v0, ")"

    .line 202
    .line 203
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 214
    :goto_3
    iget-object v3, v1, Lsv;->g:Ljava/lang/Object;

    .line 215
    .line 216
    monitor-enter v3

    .line 217
    :try_start_e
    iget-object v2, v1, Lsv;->k:Ls91;

    .line 218
    .line 219
    if-eqz v2, :cond_7

    .line 220
    .line 221
    invoke-virtual {v2, v0}, Ls91;->H(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :catchall_6
    move-exception v0

    .line 226
    goto :goto_6

    .line 227
    :cond_7
    :goto_4
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 228
    invoke-virtual {v1}, Lsv;->b()V

    .line 229
    .line 230
    .line 231
    :goto_5
    return-void

    .line 232
    :goto_6
    :try_start_f
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 233
    throw v0

    .line 234
    :goto_7
    :try_start_10
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 235
    throw v0

    .line 236
    :pswitch_4
    check-cast v0, Lzn;

    .line 237
    .line 238
    invoke-static {v0}, Lzn;->a(Lzn;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_5
    check-cast v0, Ldh;

    .line 243
    .line 244
    iget-object v1, v0, Ldh;->e:Ljava/lang/Runnable;

    .line 245
    .line 246
    if-eqz v1, :cond_8

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 249
    .line 250
    .line 251
    const/4 v1, 0x0

    .line 252
    iput-object v1, v0, Ldh;->e:Ljava/lang/Runnable;

    .line 253
    .line 254
    :cond_8
    return-void

    .line 255
    :pswitch_6
    check-cast v0, Lv4;

    .line 256
    .line 257
    invoke-virtual {v0}, Lv4;->i()Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    iget-object v5, v0, Lv4;->d:Lw3;

    .line 262
    .line 263
    if-nez v1, :cond_9

    .line 264
    .line 265
    goto/16 :goto_c

    .line 266
    .line 267
    :cond_9
    const-string v1, "ContentCapture:changeChecker"

    .line 268
    .line 269
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :try_start_11
    invoke-virtual {v5, v4}, Lw3;->s(Z)V

    .line 273
    .line 274
    .line 275
    iget-object v1, v0, Lv4;->o:Lug0;

    .line 276
    .line 277
    iget-object v4, v1, Lu20;->b:[I

    .line 278
    .line 279
    iget-object v1, v1, Lu20;->a:[J

    .line 280
    .line 281
    array-length v6, v1

    .line 282
    sub-int/2addr v6, v3

    .line 283
    if-ltz v6, :cond_d

    .line 284
    .line 285
    const/4 v3, 0x0

    .line 286
    :goto_8
    aget-wide v7, v1, v3

    .line 287
    .line 288
    not-long v9, v7

    .line 289
    const/4 v11, 0x7

    .line 290
    shl-long/2addr v9, v11

    .line 291
    and-long/2addr v9, v7

    .line 292
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    and-long/2addr v9, v11

    .line 298
    cmp-long v9, v9, v11

    .line 299
    .line 300
    if-eqz v9, :cond_c

    .line 301
    .line 302
    sub-int v9, v3, v6

    .line 303
    .line 304
    not-int v9, v9

    .line 305
    ushr-int/lit8 v9, v9, 0x1f

    .line 306
    .line 307
    const/16 v10, 0x8

    .line 308
    .line 309
    rsub-int/lit8 v9, v9, 0x8

    .line 310
    .line 311
    const/4 v11, 0x0

    .line 312
    :goto_9
    if-ge v11, v9, :cond_b

    .line 313
    .line 314
    const-wide/16 v12, 0xff

    .line 315
    .line 316
    and-long/2addr v12, v7

    .line 317
    const-wide/16 v14, 0x80

    .line 318
    .line 319
    cmp-long v12, v12, v14

    .line 320
    .line 321
    if-gez v12, :cond_a

    .line 322
    .line 323
    shl-int/lit8 v12, v3, 0x3

    .line 324
    .line 325
    add-int/2addr v12, v11

    .line 326
    aget v14, v4, v12

    .line 327
    .line 328
    invoke-virtual {v0}, Lv4;->h()Lu20;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    invoke-virtual {v12, v14}, Lu20;->a(I)Z

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    if-nez v12, :cond_a

    .line 337
    .line 338
    iget-object v12, v0, Lv4;->g:Ljava/util/ArrayList;

    .line 339
    .line 340
    new-instance v13, Luj;

    .line 341
    .line 342
    move/from16 p0, v3

    .line 343
    .line 344
    iget-wide v2, v0, Lv4;->n:J

    .line 345
    .line 346
    sget-object v17, Lvj;->e:Lvj;

    .line 347
    .line 348
    const/16 v18, 0x0

    .line 349
    .line 350
    move-wide v15, v2

    .line 351
    invoke-direct/range {v13 .. v18}, Luj;-><init>(IJLvj;Lqb1;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    iget-object v2, v0, Lv4;->k:Lvb;

    .line 358
    .line 359
    sget-object v3, Lna1;->a:Lna1;

    .line 360
    .line 361
    invoke-interface {v2, v3}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_a
    move/from16 p0, v3

    .line 366
    .line 367
    :goto_a
    shr-long/2addr v7, v10

    .line 368
    add-int/lit8 v11, v11, 0x1

    .line 369
    .line 370
    move/from16 v3, p0

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_b
    move/from16 p0, v3

    .line 374
    .line 375
    if-ne v9, v10, :cond_d

    .line 376
    .line 377
    move/from16 v2, p0

    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_c
    move v2, v3

    .line 381
    :goto_b
    if-eq v2, v6, :cond_d

    .line 382
    .line 383
    add-int/lit8 v3, v2, 0x1

    .line 384
    .line 385
    goto :goto_8

    .line 386
    :cond_d
    const-string v1, "ContentCapture:sendAppearEvents"

    .line 387
    .line 388
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 389
    .line 390
    .line 391
    :try_start_12
    invoke-virtual {v5}, Lw3;->getSemanticsOwner()La01;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v1}, La01;->a()Lxz0;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    iget-object v2, v0, Lv4;->p:Lyz0;

    .line 400
    .line 401
    invoke-virtual {v0, v1, v2}, Lv4;->k(Lxz0;Lyz0;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 402
    .line 403
    .line 404
    :try_start_13
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Lv4;->h()Lu20;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v0, v1}, Lv4;->f(Lu20;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Lv4;->n()V

    .line 415
    .line 416
    .line 417
    const/4 v1, 0x0

    .line 418
    iput-boolean v1, v0, Lv4;->q:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 419
    .line 420
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 421
    .line 422
    .line 423
    :goto_c
    return-void

    .line 424
    :catchall_7
    move-exception v0

    .line 425
    :try_start_14
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 426
    .line 427
    .line 428
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 429
    :catchall_8
    move-exception v0

    .line 430
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 431
    .line 432
    .line 433
    throw v0

    .line 434
    :pswitch_7
    check-cast v0, Lc4;

    .line 435
    .line 436
    const-string v1, "measureAndLayout"

    .line 437
    .line 438
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :try_start_15
    iget-object v1, v0, Lc4;->g:Lw3;

    .line 442
    .line 443
    invoke-virtual {v1, v4}, Lw3;->s(Z)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 447
    .line 448
    .line 449
    const-string v1, "checkForSemanticsChanges"

    .line 450
    .line 451
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    :try_start_16
    invoke-virtual {v0}, Lc4;->f()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 458
    .line 459
    .line 460
    const/4 v1, 0x0

    .line 461
    iput-boolean v1, v0, Lc4;->M:Z

    .line 462
    .line 463
    return-void

    .line 464
    :catchall_9
    move-exception v0

    .line 465
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 466
    .line 467
    .line 468
    throw v0

    .line 469
    :catchall_a
    move-exception v0

    .line 470
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    nop

    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
