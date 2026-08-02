.class public final synthetic Le2;
.super Lyn0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Le2;->o:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lyn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Le2;->o:I

    .line 6
    .line 7
    const-string v3, "msgSvrId"

    .line 8
    .line 9
    const-string v4, "createTime"

    .line 10
    .line 11
    const-string v5, "content"

    .line 12
    .line 13
    const-string v6, "type"

    .line 14
    .line 15
    const-string v7, "talker"

    .line 16
    .line 17
    const-string v8, "status"

    .line 18
    .line 19
    const/4 v9, 0x3

    .line 20
    const/16 v10, 0x8

    .line 21
    .line 22
    const/16 v11, 0xa

    .line 23
    .line 24
    sget-object v13, La83;->a:La83;

    .line 25
    .line 26
    const/4 v14, 0x2

    .line 27
    const/4 v15, 0x1

    .line 28
    iget-object v0, v0, Lbp;->i:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v12, 0x0

    .line 31
    packed-switch v2, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    check-cast v1, Landroid/database/Cursor;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v0, Lzi1;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v13, Lyi1;

    .line 45
    .line 46
    const-string v0, "isSend"

    .line 47
    .line 48
    invoke-static {v1, v0}, Lp40;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v14

    .line 52
    invoke-static {v1, v8}, Lp40;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    invoke-static {v1, v7}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v16

    .line 60
    const-string v0, "lvbuffer"

    .line 61
    .line 62
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-interface {v1, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    :goto_0
    move-object/from16 v17, v12

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    invoke-static {v1, v6}, Lp40;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v18

    .line 84
    const-string v0, "msgId"

    .line 85
    .line 86
    invoke-static {v1, v0}, Lp40;->N(Landroid/database/Cursor;Ljava/lang/String;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v19

    .line 90
    invoke-static {v1, v5}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v23

    .line 94
    invoke-static {v1, v4}, Lp40;->N(Landroid/database/Cursor;Ljava/lang/String;)J

    .line 95
    .line 96
    .line 97
    move-result-wide v24

    .line 98
    invoke-static {v1, v3}, Lp40;->N(Landroid/database/Cursor;Ljava/lang/String;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v26

    .line 102
    const-wide/16 v29, 0x0

    .line 103
    .line 104
    const/16 v31, 0x1c00

    .line 105
    .line 106
    const-wide/16 v21, 0x0

    .line 107
    .line 108
    const/16 v28, 0x0

    .line 109
    .line 110
    invoke-direct/range {v13 .. v31}, Lyi1;-><init>(IILjava/lang/String;[BIJJLjava/lang/String;JJIJI)V

    .line 111
    .line 112
    .line 113
    return-object v13

    .line 114
    :pswitch_0
    check-cast v1, Ld51;

    .line 115
    .line 116
    iget-object v1, v1, Ld51;->a:Landroid/view/KeyEvent;

    .line 117
    .line 118
    check-cast v0, Lmz2;

    .line 119
    .line 120
    iget-object v2, v0, Lmz2;->f:Le13;

    .line 121
    .line 122
    iget-boolean v3, v0, Lmz2;->d:Z

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getAction()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_5

    .line 129
    .line 130
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-static {v4}, Ljava/lang/Character;->isISOControl(I)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_5

    .line 139
    .line 140
    iget-object v4, v0, Lmz2;->i:Ln40;

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    const/high16 v6, -0x80000000

    .line 150
    .line 151
    and-int/2addr v6, v5

    .line 152
    if-eqz v6, :cond_1

    .line 153
    .line 154
    const v6, 0x7fffffff

    .line 155
    .line 156
    .line 157
    and-int/2addr v5, v6

    .line 158
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iput-object v5, v4, Ln40;->a:Ljava/lang/Integer;

    .line 163
    .line 164
    move-object v4, v12

    .line 165
    goto :goto_2

    .line 166
    :cond_1
    iget-object v6, v4, Ln40;->a:Ljava/lang/Integer;

    .line 167
    .line 168
    if-eqz v6, :cond_4

    .line 169
    .line 170
    iput-object v12, v4, Ln40;->a:Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v4, v5}, Landroid/view/KeyCharacterMap;->getDeadChar(II)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    if-nez v4, :cond_2

    .line 185
    .line 186
    move-object v6, v12

    .line 187
    :cond_2
    if-eqz v6, :cond_3

    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    goto :goto_2

    .line 198
    :cond_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    :goto_2
    if-eqz v4, :cond_5

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    new-instance v5, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    new-instance v5, Lev;

    .line 222
    .line 223
    invoke-direct {v5, v4, v15}, Lev;-><init>(Ljava/lang/String;I)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_5
    move-object v5, v12

    .line 228
    :goto_3
    if-eqz v5, :cond_7

    .line 229
    .line 230
    if-eqz v3, :cond_6

    .line 231
    .line 232
    invoke-static {v5}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v0, v1}, Lmz2;->a(Ljava/util/List;)V

    .line 237
    .line 238
    .line 239
    iput-object v12, v2, Le13;->a:Ljava/lang/Float;

    .line 240
    .line 241
    move v12, v15

    .line 242
    goto/16 :goto_2d

    .line 243
    .line 244
    :cond_6
    :goto_4
    const/4 v12, 0x0

    .line 245
    goto/16 :goto_2d

    .line 246
    .line 247
    :cond_7
    invoke-static {v1}, Lqp0;->C(Landroid/view/KeyEvent;)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-ne v4, v14, :cond_6

    .line 252
    .line 253
    iget-object v4, v0, Lmz2;->j:Lj51;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-static {v1}, Leu;->M(Landroid/view/KeyEvent;)I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    sget v5, Lrp0;->o:I

    .line 263
    .line 264
    const/16 v5, 0x9

    .line 265
    .line 266
    if-ne v4, v5, :cond_c

    .line 267
    .line 268
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-static {v4}, Lsp0;->f(I)J

    .line 273
    .line 274
    .line 275
    move-result-wide v4

    .line 276
    sget-wide v6, Lb51;->f:J

    .line 277
    .line 278
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_8

    .line 283
    .line 284
    sget-object v4, Lc51;->X:Lc51;

    .line 285
    .line 286
    goto/16 :goto_5

    .line 287
    .line 288
    :cond_8
    sget-wide v6, Lb51;->g:J

    .line 289
    .line 290
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-eqz v6, :cond_9

    .line 295
    .line 296
    sget-object v4, Lc51;->Y:Lc51;

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_9
    sget-wide v6, Lb51;->d:J

    .line 300
    .line 301
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_a

    .line 306
    .line 307
    sget-object v4, Lc51;->P:Lc51;

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_a
    sget-wide v6, Lb51;->e:J

    .line 311
    .line 312
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    if-eqz v4, :cond_b

    .line 317
    .line 318
    sget-object v4, Lc51;->Q:Lc51;

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_b
    move-object v4, v12

    .line 322
    goto :goto_5

    .line 323
    :cond_c
    if-ne v4, v15, :cond_b

    .line 324
    .line 325
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    invoke-static {v4}, Lsp0;->f(I)J

    .line 330
    .line 331
    .line 332
    move-result-wide v4

    .line 333
    sget-wide v6, Lb51;->f:J

    .line 334
    .line 335
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-eqz v6, :cond_d

    .line 340
    .line 341
    sget-object v4, Lc51;->q:Lc51;

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_d
    sget-wide v6, Lb51;->g:J

    .line 345
    .line 346
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-eqz v6, :cond_e

    .line 351
    .line 352
    sget-object v4, Lc51;->r:Lc51;

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_e
    sget-wide v6, Lb51;->d:J

    .line 356
    .line 357
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-eqz v6, :cond_f

    .line 362
    .line 363
    sget-object v4, Lc51;->x:Lc51;

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_f
    sget-wide v6, Lb51;->e:J

    .line 367
    .line 368
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-eqz v6, :cond_10

    .line 373
    .line 374
    sget-object v4, Lc51;->y:Lc51;

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_10
    sget-wide v6, Lb51;->s:J

    .line 378
    .line 379
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-eqz v4, :cond_b

    .line 384
    .line 385
    sget-object v4, Lc51;->G:Lc51;

    .line 386
    .line 387
    :goto_5
    if-nez v4, :cond_69

    .line 388
    .line 389
    sget-object v4, Ls11;->d:Ln4;

    .line 390
    .line 391
    sget v5, Lrp0;->p:I

    .line 392
    .line 393
    invoke-static {v1}, Leu;->M(Landroid/view/KeyEvent;)I

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    invoke-static {v6}, Lsp0;->f(I)J

    .line 402
    .line 403
    .line 404
    move-result-wide v6

    .line 405
    sget-wide v8, Lb51;->s:J

    .line 406
    .line 407
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    sget-object v9, Lc51;->a0:Lc51;

    .line 412
    .line 413
    sget-object v13, Lc51;->C:Lc51;

    .line 414
    .line 415
    if-eqz v8, :cond_16

    .line 416
    .line 417
    if-nez v5, :cond_11

    .line 418
    .line 419
    goto :goto_6

    .line 420
    :cond_11
    if-ne v5, v10, :cond_12

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_12
    sget v6, Lrp0;->q:I

    .line 424
    .line 425
    const/16 v6, 0xc

    .line 426
    .line 427
    if-ne v5, v6, :cond_13

    .line 428
    .line 429
    :goto_6
    move-object/from16 p1, v13

    .line 430
    .line 431
    move-object/from16 v5, p1

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_13
    if-ne v5, v14, :cond_14

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_14
    if-ne v5, v11, :cond_15

    .line 438
    .line 439
    :goto_7
    sget-object v5, Lc51;->E:Lc51;

    .line 440
    .line 441
    :goto_8
    move-object/from16 p1, v13

    .line 442
    .line 443
    goto :goto_b

    .line 444
    :cond_15
    move-object v5, v12

    .line 445
    goto :goto_8

    .line 446
    :cond_16
    move-object/from16 p1, v13

    .line 447
    .line 448
    sget-wide v12, Lb51;->r:J

    .line 449
    .line 450
    invoke-static {v6, v7, v12, v13}, Lb51;->a(JJ)Z

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    if-nez v8, :cond_18

    .line 455
    .line 456
    sget-wide v12, Lb51;->E:J

    .line 457
    .line 458
    invoke-static {v6, v7, v12, v13}, Lb51;->a(JJ)Z

    .line 459
    .line 460
    .line 461
    move-result v6

    .line 462
    if-eqz v6, :cond_17

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_17
    const/4 v5, 0x0

    .line 466
    goto :goto_b

    .line 467
    :cond_18
    :goto_9
    if-nez v5, :cond_19

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_19
    if-ne v5, v10, :cond_1a

    .line 471
    .line 472
    goto :goto_a

    .line 473
    :cond_1a
    if-ne v5, v14, :cond_1b

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_1b
    if-ne v5, v11, :cond_17

    .line 477
    .line 478
    :goto_a
    move-object v5, v9

    .line 479
    :goto_b
    if-eqz v5, :cond_1d

    .line 480
    .line 481
    :cond_1c
    move-object v4, v5

    .line 482
    goto/16 :goto_2c

    .line 483
    .line 484
    :cond_1d
    invoke-static {v1}, Leu;->M(Landroid/view/KeyEvent;)I

    .line 485
    .line 486
    .line 487
    move-result v5

    .line 488
    sget-object v6, Lc51;->V:Lc51;

    .line 489
    .line 490
    sget-object v7, Lc51;->W:Lc51;

    .line 491
    .line 492
    if-ne v5, v11, :cond_26

    .line 493
    .line 494
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    invoke-static {v5}, Lsp0;->f(I)J

    .line 499
    .line 500
    .line 501
    move-result-wide v12

    .line 502
    sget-wide v10, Lb51;->f:J

    .line 503
    .line 504
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    if-nez v5, :cond_25

    .line 509
    .line 510
    sget-wide v10, Lb51;->H:J

    .line 511
    .line 512
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-eqz v5, :cond_1e

    .line 517
    .line 518
    goto :goto_f

    .line 519
    :cond_1e
    sget-wide v10, Lb51;->g:J

    .line 520
    .line 521
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 522
    .line 523
    .line 524
    move-result v5

    .line 525
    if-nez v5, :cond_24

    .line 526
    .line 527
    sget-wide v10, Lb51;->I:J

    .line 528
    .line 529
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    if-eqz v5, :cond_1f

    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_1f
    sget-wide v10, Lb51;->d:J

    .line 537
    .line 538
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    if-nez v5, :cond_23

    .line 543
    .line 544
    sget-wide v10, Lb51;->F:J

    .line 545
    .line 546
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 547
    .line 548
    .line 549
    move-result v5

    .line 550
    if-eqz v5, :cond_20

    .line 551
    .line 552
    goto :goto_d

    .line 553
    :cond_20
    sget-wide v10, Lb51;->e:J

    .line 554
    .line 555
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    if-nez v5, :cond_22

    .line 560
    .line 561
    sget-wide v10, Lb51;->G:J

    .line 562
    .line 563
    invoke-static {v12, v13, v10, v11}, Lb51;->a(JJ)Z

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    if-eqz v5, :cond_21

    .line 568
    .line 569
    goto :goto_c

    .line 570
    :cond_21
    const/4 v5, 0x0

    .line 571
    goto/16 :goto_15

    .line 572
    .line 573
    :cond_22
    :goto_c
    sget-object v5, Lc51;->T:Lc51;

    .line 574
    .line 575
    goto/16 :goto_15

    .line 576
    .line 577
    :cond_23
    :goto_d
    sget-object v5, Lc51;->U:Lc51;

    .line 578
    .line 579
    goto/16 :goto_15

    .line 580
    .line 581
    :cond_24
    :goto_e
    sget-object v5, Lc51;->S:Lc51;

    .line 582
    .line 583
    goto/16 :goto_15

    .line 584
    .line 585
    :cond_25
    :goto_f
    sget-object v5, Lc51;->R:Lc51;

    .line 586
    .line 587
    goto/16 :goto_15

    .line 588
    .line 589
    :cond_26
    if-ne v5, v14, :cond_31

    .line 590
    .line 591
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    invoke-static {v5}, Lsp0;->f(I)J

    .line 596
    .line 597
    .line 598
    move-result-wide v10

    .line 599
    sget-wide v12, Lb51;->f:J

    .line 600
    .line 601
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    if-nez v5, :cond_30

    .line 606
    .line 607
    sget-wide v12, Lb51;->H:J

    .line 608
    .line 609
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    if-eqz v5, :cond_27

    .line 614
    .line 615
    goto :goto_13

    .line 616
    :cond_27
    sget-wide v12, Lb51;->g:J

    .line 617
    .line 618
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    if-nez v5, :cond_2f

    .line 623
    .line 624
    sget-wide v12, Lb51;->I:J

    .line 625
    .line 626
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    if-eqz v5, :cond_28

    .line 631
    .line 632
    goto :goto_12

    .line 633
    :cond_28
    sget-wide v12, Lb51;->d:J

    .line 634
    .line 635
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    if-nez v5, :cond_2e

    .line 640
    .line 641
    sget-wide v12, Lb51;->F:J

    .line 642
    .line 643
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 644
    .line 645
    .line 646
    move-result v5

    .line 647
    if-eqz v5, :cond_29

    .line 648
    .line 649
    goto :goto_11

    .line 650
    :cond_29
    sget-wide v12, Lb51;->e:J

    .line 651
    .line 652
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    if-nez v5, :cond_2d

    .line 657
    .line 658
    sget-wide v12, Lb51;->G:J

    .line 659
    .line 660
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 661
    .line 662
    .line 663
    move-result v5

    .line 664
    if-eqz v5, :cond_2a

    .line 665
    .line 666
    goto :goto_10

    .line 667
    :cond_2a
    sget-wide v12, Lb51;->k:J

    .line 668
    .line 669
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 670
    .line 671
    .line 672
    move-result v5

    .line 673
    if-eqz v5, :cond_2b

    .line 674
    .line 675
    move-object/from16 v5, p1

    .line 676
    .line 677
    goto/16 :goto_15

    .line 678
    .line 679
    :cond_2b
    sget-wide v12, Lb51;->t:J

    .line 680
    .line 681
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    if-eqz v5, :cond_2c

    .line 686
    .line 687
    sget-object v5, Lc51;->F:Lc51;

    .line 688
    .line 689
    goto :goto_15

    .line 690
    :cond_2c
    sget-wide v12, Lb51;->B:J

    .line 691
    .line 692
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    if-eqz v5, :cond_21

    .line 697
    .line 698
    sget-object v5, Lc51;->Z:Lc51;

    .line 699
    .line 700
    goto :goto_15

    .line 701
    :cond_2d
    :goto_10
    sget-object v5, Lc51;->m:Lc51;

    .line 702
    .line 703
    goto :goto_15

    .line 704
    :cond_2e
    :goto_11
    sget-object v5, Lc51;->n:Lc51;

    .line 705
    .line 706
    goto :goto_15

    .line 707
    :cond_2f
    :goto_12
    sget-object v5, Lc51;->k:Lc51;

    .line 708
    .line 709
    goto :goto_15

    .line 710
    :cond_30
    :goto_13
    sget-object v5, Lc51;->l:Lc51;

    .line 711
    .line 712
    goto :goto_15

    .line 713
    :cond_31
    const/16 v8, 0x8

    .line 714
    .line 715
    if-ne v5, v8, :cond_35

    .line 716
    .line 717
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 718
    .line 719
    .line 720
    move-result v5

    .line 721
    invoke-static {v5}, Lsp0;->f(I)J

    .line 722
    .line 723
    .line 724
    move-result-wide v10

    .line 725
    sget-wide v12, Lb51;->v:J

    .line 726
    .line 727
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 728
    .line 729
    .line 730
    move-result v5

    .line 731
    if-nez v5, :cond_34

    .line 732
    .line 733
    sget-wide v12, Lb51;->J:J

    .line 734
    .line 735
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    if-eqz v5, :cond_32

    .line 740
    .line 741
    goto :goto_14

    .line 742
    :cond_32
    sget-wide v12, Lb51;->w:J

    .line 743
    .line 744
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    if-nez v5, :cond_33

    .line 749
    .line 750
    sget-wide v12, Lb51;->K:J

    .line 751
    .line 752
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    if-eqz v5, :cond_21

    .line 757
    .line 758
    :cond_33
    move-object v5, v7

    .line 759
    goto :goto_15

    .line 760
    :cond_34
    :goto_14
    move-object v5, v6

    .line 761
    goto :goto_15

    .line 762
    :cond_35
    if-ne v5, v15, :cond_21

    .line 763
    .line 764
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 765
    .line 766
    .line 767
    move-result v5

    .line 768
    invoke-static {v5}, Lsp0;->f(I)J

    .line 769
    .line 770
    .line 771
    move-result-wide v10

    .line 772
    sget-wide v12, Lb51;->t:J

    .line 773
    .line 774
    invoke-static {v10, v11, v12, v13}, Lb51;->a(JJ)Z

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    if-eqz v5, :cond_21

    .line 779
    .line 780
    sget-object v5, Lc51;->H:Lc51;

    .line 781
    .line 782
    :goto_15
    if-nez v5, :cond_1c

    .line 783
    .line 784
    iget-object v4, v4, Ln4;->i:Ljava/lang/Object;

    .line 785
    .line 786
    invoke-static {v1}, Leu;->M(Landroid/view/KeyEvent;)I

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    sget-object v5, Lc51;->d0:Lc51;

    .line 791
    .line 792
    const/16 v8, 0xa

    .line 793
    .line 794
    if-ne v4, v8, :cond_36

    .line 795
    .line 796
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    invoke-static {v1}, Lsp0;->f(I)J

    .line 801
    .line 802
    .line 803
    move-result-wide v6

    .line 804
    sget-wide v8, Lb51;->o:J

    .line 805
    .line 806
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    if-eqz v1, :cond_68

    .line 811
    .line 812
    :goto_16
    move-object v12, v5

    .line 813
    goto/16 :goto_2b

    .line 814
    .line 815
    :cond_36
    sget-object v8, Lc51;->z:Lc51;

    .line 816
    .line 817
    sget-object v10, Lc51;->B:Lc51;

    .line 818
    .line 819
    sget-object v11, Lc51;->A:Lc51;

    .line 820
    .line 821
    if-ne v4, v14, :cond_3e

    .line 822
    .line 823
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    invoke-static {v1}, Lsp0;->f(I)J

    .line 828
    .line 829
    .line 830
    move-result-wide v6

    .line 831
    sget-wide v12, Lb51;->j:J

    .line 832
    .line 833
    invoke-static {v6, v7, v12, v13}, Lb51;->a(JJ)Z

    .line 834
    .line 835
    .line 836
    move-result v1

    .line 837
    if-nez v1, :cond_3d

    .line 838
    .line 839
    sget-wide v12, Lb51;->x:J

    .line 840
    .line 841
    invoke-static {v6, v7, v12, v13}, Lb51;->a(JJ)Z

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    if-nez v1, :cond_3d

    .line 846
    .line 847
    sget-wide v12, Lb51;->N:J

    .line 848
    .line 849
    invoke-static {v6, v7, v12, v13}, Lb51;->a(JJ)Z

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    if-eqz v1, :cond_37

    .line 854
    .line 855
    goto :goto_19

    .line 856
    :cond_37
    sget-wide v8, Lb51;->l:J

    .line 857
    .line 858
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 859
    .line 860
    .line 861
    move-result v1

    .line 862
    if-eqz v1, :cond_39

    .line 863
    .line 864
    :cond_38
    :goto_17
    move-object v12, v11

    .line 865
    goto/16 :goto_2b

    .line 866
    .line 867
    :cond_39
    sget-wide v8, Lb51;->m:J

    .line 868
    .line 869
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    if-eqz v1, :cond_3a

    .line 874
    .line 875
    :goto_18
    move-object v12, v10

    .line 876
    goto/16 :goto_2b

    .line 877
    .line 878
    :cond_3a
    sget-wide v8, Lb51;->i:J

    .line 879
    .line 880
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 881
    .line 882
    .line 883
    move-result v1

    .line 884
    if-eqz v1, :cond_3b

    .line 885
    .line 886
    sget-object v12, Lc51;->I:Lc51;

    .line 887
    .line 888
    goto/16 :goto_2b

    .line 889
    .line 890
    :cond_3b
    sget-wide v8, Lb51;->n:J

    .line 891
    .line 892
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 893
    .line 894
    .line 895
    move-result v1

    .line 896
    if-eqz v1, :cond_3c

    .line 897
    .line 898
    goto :goto_16

    .line 899
    :cond_3c
    sget-wide v4, Lb51;->o:J

    .line 900
    .line 901
    invoke-static {v6, v7, v4, v5}, Lb51;->a(JJ)Z

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    if-eqz v1, :cond_68

    .line 906
    .line 907
    sget-object v12, Lc51;->c0:Lc51;

    .line 908
    .line 909
    goto/16 :goto_2b

    .line 910
    .line 911
    :cond_3d
    :goto_19
    move-object v12, v8

    .line 912
    goto/16 :goto_2b

    .line 913
    .line 914
    :cond_3e
    const/16 v5, 0x8

    .line 915
    .line 916
    if-ne v4, v5, :cond_4f

    .line 917
    .line 918
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 919
    .line 920
    .line 921
    move-result v1

    .line 922
    invoke-static {v1}, Lsp0;->f(I)J

    .line 923
    .line 924
    .line 925
    move-result-wide v4

    .line 926
    sget-wide v8, Lb51;->f:J

    .line 927
    .line 928
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    if-nez v1, :cond_4e

    .line 933
    .line 934
    sget-wide v8, Lb51;->H:J

    .line 935
    .line 936
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 937
    .line 938
    .line 939
    move-result v1

    .line 940
    if-eqz v1, :cond_3f

    .line 941
    .line 942
    goto/16 :goto_21

    .line 943
    .line 944
    :cond_3f
    sget-wide v8, Lb51;->g:J

    .line 945
    .line 946
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    if-nez v1, :cond_4d

    .line 951
    .line 952
    sget-wide v8, Lb51;->I:J

    .line 953
    .line 954
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 955
    .line 956
    .line 957
    move-result v1

    .line 958
    if-eqz v1, :cond_40

    .line 959
    .line 960
    goto/16 :goto_20

    .line 961
    .line 962
    :cond_40
    sget-wide v8, Lb51;->d:J

    .line 963
    .line 964
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 965
    .line 966
    .line 967
    move-result v1

    .line 968
    if-nez v1, :cond_4c

    .line 969
    .line 970
    sget-wide v8, Lb51;->F:J

    .line 971
    .line 972
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-eqz v1, :cond_41

    .line 977
    .line 978
    goto/16 :goto_1f

    .line 979
    .line 980
    :cond_41
    sget-wide v8, Lb51;->e:J

    .line 981
    .line 982
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 983
    .line 984
    .line 985
    move-result v1

    .line 986
    if-nez v1, :cond_4b

    .line 987
    .line 988
    sget-wide v8, Lb51;->G:J

    .line 989
    .line 990
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    if-eqz v1, :cond_42

    .line 995
    .line 996
    goto/16 :goto_1e

    .line 997
    .line 998
    :cond_42
    sget-wide v8, Lb51;->C:J

    .line 999
    .line 1000
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v1

    .line 1004
    if-nez v1, :cond_4a

    .line 1005
    .line 1006
    sget-wide v8, Lb51;->L:J

    .line 1007
    .line 1008
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    if-eqz v1, :cond_43

    .line 1013
    .line 1014
    goto :goto_1d

    .line 1015
    :cond_43
    sget-wide v8, Lb51;->D:J

    .line 1016
    .line 1017
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v1

    .line 1021
    if-nez v1, :cond_49

    .line 1022
    .line 1023
    sget-wide v8, Lb51;->M:J

    .line 1024
    .line 1025
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v1

    .line 1029
    if-eqz v1, :cond_44

    .line 1030
    .line 1031
    goto :goto_1c

    .line 1032
    :cond_44
    sget-wide v8, Lb51;->v:J

    .line 1033
    .line 1034
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    if-nez v1, :cond_48

    .line 1039
    .line 1040
    sget-wide v8, Lb51;->J:J

    .line 1041
    .line 1042
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v1

    .line 1046
    if-eqz v1, :cond_45

    .line 1047
    .line 1048
    goto :goto_1b

    .line 1049
    :cond_45
    sget-wide v8, Lb51;->w:J

    .line 1050
    .line 1051
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v1

    .line 1055
    if-nez v1, :cond_47

    .line 1056
    .line 1057
    sget-wide v8, Lb51;->K:J

    .line 1058
    .line 1059
    invoke-static {v4, v5, v8, v9}, Lb51;->a(JJ)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v1

    .line 1063
    if-eqz v1, :cond_46

    .line 1064
    .line 1065
    goto :goto_1a

    .line 1066
    :cond_46
    sget-wide v6, Lb51;->x:J

    .line 1067
    .line 1068
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v1

    .line 1072
    if-nez v1, :cond_38

    .line 1073
    .line 1074
    sget-wide v6, Lb51;->N:J

    .line 1075
    .line 1076
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v1

    .line 1080
    if-eqz v1, :cond_68

    .line 1081
    .line 1082
    goto/16 :goto_17

    .line 1083
    .line 1084
    :cond_47
    :goto_1a
    move-object v12, v7

    .line 1085
    goto/16 :goto_2b

    .line 1086
    .line 1087
    :cond_48
    :goto_1b
    move-object v12, v6

    .line 1088
    goto/16 :goto_2b

    .line 1089
    .line 1090
    :cond_49
    :goto_1c
    sget-object v12, Lc51;->O:Lc51;

    .line 1091
    .line 1092
    goto/16 :goto_2b

    .line 1093
    .line 1094
    :cond_4a
    :goto_1d
    sget-object v12, Lc51;->N:Lc51;

    .line 1095
    .line 1096
    goto/16 :goto_2b

    .line 1097
    .line 1098
    :cond_4b
    :goto_1e
    sget-object v12, Lc51;->M:Lc51;

    .line 1099
    .line 1100
    goto/16 :goto_2b

    .line 1101
    .line 1102
    :cond_4c
    :goto_1f
    sget-object v12, Lc51;->L:Lc51;

    .line 1103
    .line 1104
    goto/16 :goto_2b

    .line 1105
    .line 1106
    :cond_4d
    :goto_20
    sget-object v12, Lc51;->K:Lc51;

    .line 1107
    .line 1108
    goto/16 :goto_2b

    .line 1109
    .line 1110
    :cond_4e
    :goto_21
    sget-object v12, Lc51;->J:Lc51;

    .line 1111
    .line 1112
    goto/16 :goto_2b

    .line 1113
    .line 1114
    :cond_4f
    if-nez v4, :cond_68

    .line 1115
    .line 1116
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 1117
    .line 1118
    .line 1119
    move-result v1

    .line 1120
    invoke-static {v1}, Lsp0;->f(I)J

    .line 1121
    .line 1122
    .line 1123
    move-result-wide v4

    .line 1124
    sget-wide v6, Lb51;->f:J

    .line 1125
    .line 1126
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-nez v1, :cond_67

    .line 1131
    .line 1132
    sget-wide v6, Lb51;->H:J

    .line 1133
    .line 1134
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v1

    .line 1138
    if-eqz v1, :cond_50

    .line 1139
    .line 1140
    goto/16 :goto_2a

    .line 1141
    .line 1142
    :cond_50
    sget-wide v6, Lb51;->g:J

    .line 1143
    .line 1144
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v1

    .line 1148
    if-nez v1, :cond_66

    .line 1149
    .line 1150
    sget-wide v6, Lb51;->I:J

    .line 1151
    .line 1152
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v1

    .line 1156
    if-eqz v1, :cond_51

    .line 1157
    .line 1158
    goto/16 :goto_29

    .line 1159
    .line 1160
    :cond_51
    sget-wide v6, Lb51;->d:J

    .line 1161
    .line 1162
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v1

    .line 1166
    if-nez v1, :cond_65

    .line 1167
    .line 1168
    sget-wide v6, Lb51;->F:J

    .line 1169
    .line 1170
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v1

    .line 1174
    if-eqz v1, :cond_52

    .line 1175
    .line 1176
    goto/16 :goto_28

    .line 1177
    .line 1178
    :cond_52
    sget-wide v6, Lb51;->e:J

    .line 1179
    .line 1180
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v1

    .line 1184
    if-nez v1, :cond_64

    .line 1185
    .line 1186
    sget-wide v6, Lb51;->G:J

    .line 1187
    .line 1188
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v1

    .line 1192
    if-eqz v1, :cond_53

    .line 1193
    .line 1194
    goto/16 :goto_27

    .line 1195
    .line 1196
    :cond_53
    sget-wide v6, Lb51;->h:J

    .line 1197
    .line 1198
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v1

    .line 1202
    if-eqz v1, :cond_54

    .line 1203
    .line 1204
    sget-object v12, Lc51;->u:Lc51;

    .line 1205
    .line 1206
    goto/16 :goto_2b

    .line 1207
    .line 1208
    :cond_54
    sget-wide v6, Lb51;->C:J

    .line 1209
    .line 1210
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v1

    .line 1214
    if-nez v1, :cond_63

    .line 1215
    .line 1216
    sget-wide v6, Lb51;->L:J

    .line 1217
    .line 1218
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v1

    .line 1222
    if-eqz v1, :cond_55

    .line 1223
    .line 1224
    goto/16 :goto_26

    .line 1225
    .line 1226
    :cond_55
    sget-wide v6, Lb51;->D:J

    .line 1227
    .line 1228
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v1

    .line 1232
    if-nez v1, :cond_62

    .line 1233
    .line 1234
    sget-wide v6, Lb51;->M:J

    .line 1235
    .line 1236
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v1

    .line 1240
    if-eqz v1, :cond_56

    .line 1241
    .line 1242
    goto/16 :goto_25

    .line 1243
    .line 1244
    :cond_56
    sget-wide v6, Lb51;->v:J

    .line 1245
    .line 1246
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v1

    .line 1250
    if-nez v1, :cond_61

    .line 1251
    .line 1252
    sget-wide v6, Lb51;->J:J

    .line 1253
    .line 1254
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v1

    .line 1258
    if-eqz v1, :cond_57

    .line 1259
    .line 1260
    goto/16 :goto_24

    .line 1261
    .line 1262
    :cond_57
    sget-wide v6, Lb51;->w:J

    .line 1263
    .line 1264
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1265
    .line 1266
    .line 1267
    move-result v1

    .line 1268
    if-nez v1, :cond_60

    .line 1269
    .line 1270
    sget-wide v6, Lb51;->K:J

    .line 1271
    .line 1272
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v1

    .line 1276
    if-eqz v1, :cond_58

    .line 1277
    .line 1278
    goto :goto_23

    .line 1279
    :cond_58
    sget-wide v6, Lb51;->r:J

    .line 1280
    .line 1281
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v1

    .line 1285
    if-nez v1, :cond_5f

    .line 1286
    .line 1287
    sget-wide v6, Lb51;->E:J

    .line 1288
    .line 1289
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1290
    .line 1291
    .line 1292
    move-result v1

    .line 1293
    if-eqz v1, :cond_59

    .line 1294
    .line 1295
    goto :goto_22

    .line 1296
    :cond_59
    sget-wide v6, Lb51;->s:J

    .line 1297
    .line 1298
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v1

    .line 1302
    if-eqz v1, :cond_5a

    .line 1303
    .line 1304
    move-object/from16 v12, p1

    .line 1305
    .line 1306
    goto :goto_2b

    .line 1307
    :cond_5a
    sget-wide v6, Lb51;->t:J

    .line 1308
    .line 1309
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v1

    .line 1313
    if-eqz v1, :cond_5b

    .line 1314
    .line 1315
    sget-object v12, Lc51;->D:Lc51;

    .line 1316
    .line 1317
    goto :goto_2b

    .line 1318
    :cond_5b
    sget-wide v6, Lb51;->A:J

    .line 1319
    .line 1320
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v1

    .line 1324
    if-eqz v1, :cond_5c

    .line 1325
    .line 1326
    goto/16 :goto_17

    .line 1327
    .line 1328
    :cond_5c
    sget-wide v6, Lb51;->y:J

    .line 1329
    .line 1330
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v1

    .line 1334
    if-eqz v1, :cond_5d

    .line 1335
    .line 1336
    goto/16 :goto_18

    .line 1337
    .line 1338
    :cond_5d
    sget-wide v6, Lb51;->z:J

    .line 1339
    .line 1340
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v1

    .line 1344
    if-eqz v1, :cond_5e

    .line 1345
    .line 1346
    goto/16 :goto_19

    .line 1347
    .line 1348
    :cond_5e
    sget-wide v6, Lb51;->p:J

    .line 1349
    .line 1350
    invoke-static {v4, v5, v6, v7}, Lb51;->a(JJ)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v1

    .line 1354
    if-eqz v1, :cond_68

    .line 1355
    .line 1356
    sget-object v12, Lc51;->b0:Lc51;

    .line 1357
    .line 1358
    goto :goto_2b

    .line 1359
    :cond_5f
    :goto_22
    move-object v12, v9

    .line 1360
    goto :goto_2b

    .line 1361
    :cond_60
    :goto_23
    sget-object v12, Lc51;->p:Lc51;

    .line 1362
    .line 1363
    goto :goto_2b

    .line 1364
    :cond_61
    :goto_24
    sget-object v12, Lc51;->o:Lc51;

    .line 1365
    .line 1366
    goto :goto_2b

    .line 1367
    :cond_62
    :goto_25
    sget-object v12, Lc51;->w:Lc51;

    .line 1368
    .line 1369
    goto :goto_2b

    .line 1370
    :cond_63
    :goto_26
    sget-object v12, Lc51;->v:Lc51;

    .line 1371
    .line 1372
    goto :goto_2b

    .line 1373
    :cond_64
    :goto_27
    sget-object v12, Lc51;->t:Lc51;

    .line 1374
    .line 1375
    goto :goto_2b

    .line 1376
    :cond_65
    :goto_28
    sget-object v12, Lc51;->s:Lc51;

    .line 1377
    .line 1378
    goto :goto_2b

    .line 1379
    :cond_66
    :goto_29
    sget-object v12, Lc51;->j:Lc51;

    .line 1380
    .line 1381
    goto :goto_2b

    .line 1382
    :cond_67
    :goto_2a
    sget-object v12, Lc51;->i:Lc51;

    .line 1383
    .line 1384
    goto :goto_2b

    .line 1385
    :cond_68
    const/4 v12, 0x0

    .line 1386
    :goto_2b
    move-object v4, v12

    .line 1387
    :cond_69
    :goto_2c
    if-eqz v4, :cond_6

    .line 1388
    .line 1389
    iget-boolean v1, v4, Lc51;->h:Z

    .line 1390
    .line 1391
    if-eqz v1, :cond_6a

    .line 1392
    .line 1393
    if-nez v3, :cond_6a

    .line 1394
    .line 1395
    goto/16 :goto_4

    .line 1396
    .line 1397
    :cond_6a
    new-instance v1, Ly62;

    .line 1398
    .line 1399
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1400
    .line 1401
    .line 1402
    iput-boolean v15, v1, Ly62;->h:Z

    .line 1403
    .line 1404
    new-instance v3, Lm0;

    .line 1405
    .line 1406
    const/16 v5, 0xd

    .line 1407
    .line 1408
    invoke-direct {v3, v4, v0, v1, v5}, Lm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1409
    .line 1410
    .line 1411
    new-instance v4, Lpz2;

    .line 1412
    .line 1413
    iget-object v5, v0, Lmz2;->c:Lk03;

    .line 1414
    .line 1415
    iget-object v6, v0, Lmz2;->g:Lus1;

    .line 1416
    .line 1417
    iget-object v7, v0, Lmz2;->a:Lt91;

    .line 1418
    .line 1419
    invoke-virtual {v7}, Lt91;->d()Lz03;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v7

    .line 1423
    invoke-direct {v4, v5, v6, v7, v2}, Lpz2;-><init>(Lk03;Lus1;Lz03;Le13;)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v3, v4}, Lm0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    iget-wide v2, v4, Lpz2;->f:J

    .line 1430
    .line 1431
    iget-wide v6, v5, Lk03;->b:J

    .line 1432
    .line 1433
    invoke-static {v2, v3, v6, v7}, Lf13;->b(JJ)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v2

    .line 1437
    iget-object v3, v4, Lpz2;->g:Lsd;

    .line 1438
    .line 1439
    if-eqz v2, :cond_6b

    .line 1440
    .line 1441
    iget-object v2, v5, Lk03;->a:Lsd;

    .line 1442
    .line 1443
    invoke-static {v3, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    if-nez v2, :cond_6c

    .line 1448
    .line 1449
    :cond_6b
    iget-object v2, v0, Lmz2;->k:Lin0;

    .line 1450
    .line 1451
    iget-wide v6, v4, Lpz2;->f:J

    .line 1452
    .line 1453
    const/4 v4, 0x4

    .line 1454
    invoke-static {v5, v3, v6, v7, v4}, Lk03;->a(Lk03;Lsd;JI)Lk03;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v3

    .line 1458
    invoke-interface {v2, v3}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    :cond_6c
    iget-object v0, v0, Lmz2;->h:Lw73;

    .line 1462
    .line 1463
    if-eqz v0, :cond_6d

    .line 1464
    .line 1465
    iput-boolean v15, v0, Lw73;->e:Z

    .line 1466
    .line 1467
    :cond_6d
    iget-boolean v12, v1, Ly62;->h:Z

    .line 1468
    .line 1469
    :goto_2d
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    return-object v0

    .line 1474
    :pswitch_1
    check-cast v1, Lin0;

    .line 1475
    .line 1476
    check-cast v0, Loy2;

    .line 1477
    .line 1478
    iget-object v0, v0, Loy2;->b:Llk1;

    .line 1479
    .line 1480
    invoke-virtual {v0, v1}, Llk1;->a(Ljava/lang/Object;)V

    .line 1481
    .line 1482
    .line 1483
    return-object v13

    .line 1484
    :pswitch_2
    check-cast v1, Lrs1;

    .line 1485
    .line 1486
    iget-wide v4, v1, Lrs1;->a:J

    .line 1487
    .line 1488
    move-object v3, v0

    .line 1489
    check-cast v3, Lvy2;

    .line 1490
    .line 1491
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    sget-object v0, Laz2;->a:Lmy;

    .line 1495
    .line 1496
    invoke-static {v3, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    move-object v6, v0

    .line 1501
    check-cast v6, Lzy2;

    .line 1502
    .line 1503
    if-nez v6, :cond_6e

    .line 1504
    .line 1505
    goto :goto_2e

    .line 1506
    :cond_6e
    new-instance v7, Luy2;

    .line 1507
    .line 1508
    invoke-direct {v7, v3, v4, v5}, Luy2;-><init>(Lvy2;J)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v3}, Lth1;->A0()Lj20;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    new-instance v2, Lf2;

    .line 1516
    .line 1517
    const/4 v8, 0x0

    .line 1518
    invoke-direct/range {v2 .. v8}, Lf2;-><init>(Lvy2;JLzy2;Luy2;Lt00;)V

    .line 1519
    .line 1520
    .line 1521
    const/4 v1, 0x0

    .line 1522
    invoke-static {v0, v1, v2, v9}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 1523
    .line 1524
    .line 1525
    :goto_2e
    return-object v13

    .line 1526
    :pswitch_3
    check-cast v0, Laf2;

    .line 1527
    .line 1528
    invoke-virtual {v0, v1}, Laf2;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    return-object v0

    .line 1533
    :pswitch_4
    check-cast v0, Laf2;

    .line 1534
    .line 1535
    invoke-virtual {v0, v1}, Laf2;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0

    .line 1539
    return-object v0

    .line 1540
    :pswitch_5
    check-cast v0, Laf2;

    .line 1541
    .line 1542
    invoke-virtual {v0, v1}, Laf2;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    return-object v0

    .line 1547
    :pswitch_6
    check-cast v1, Ljava/lang/Throwable;

    .line 1548
    .line 1549
    check-cast v0, Ln21;

    .line 1550
    .line 1551
    invoke-virtual {v0, v1}, Ln21;->l(Ljava/lang/Throwable;)V

    .line 1552
    .line 1553
    .line 1554
    return-object v13

    .line 1555
    :pswitch_7
    check-cast v1, Lmd3;

    .line 1556
    .line 1557
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1558
    .line 1559
    .line 1560
    check-cast v0, Lee;

    .line 1561
    .line 1562
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1563
    .line 1564
    .line 1565
    sget-object v2, Lee;->h:Ljava/lang/String;

    .line 1566
    .line 1567
    iget-object v0, v1, Lmd3;->a:Ljava/util/List;

    .line 1568
    .line 1569
    const/4 v10, 0x0

    .line 1570
    invoke-static {v10, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v11

    .line 1574
    instance-of v10, v11, Ljava/lang/String;

    .line 1575
    .line 1576
    if-eqz v10, :cond_6f

    .line 1577
    .line 1578
    move-object v10, v11

    .line 1579
    check-cast v10, Ljava/lang/String;

    .line 1580
    .line 1581
    goto :goto_2f

    .line 1582
    :cond_6f
    const/4 v10, 0x0

    .line 1583
    :goto_2f
    if-nez v10, :cond_70

    .line 1584
    .line 1585
    :goto_30
    goto/16 :goto_34

    .line 1586
    .line 1587
    :cond_70
    invoke-static {v15, v0}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v0

    .line 1591
    instance-of v11, v0, Ljava/lang/String;

    .line 1592
    .line 1593
    if-eqz v11, :cond_71

    .line 1594
    .line 1595
    check-cast v0, Ljava/lang/String;

    .line 1596
    .line 1597
    goto :goto_31

    .line 1598
    :cond_71
    const/4 v0, 0x0

    .line 1599
    :goto_31
    if-nez v0, :cond_72

    .line 1600
    .line 1601
    goto :goto_30

    .line 1602
    :cond_72
    const-string v11, "sysmsg"

    .line 1603
    .line 1604
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v0

    .line 1608
    if-eqz v0, :cond_78

    .line 1609
    .line 1610
    const-string v0, "revokemsg"

    .line 1611
    .line 1612
    const/4 v11, 0x0

    .line 1613
    invoke-static {v10, v0, v11}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1614
    .line 1615
    .line 1616
    move-result v10

    .line 1617
    if-nez v10, :cond_73

    .line 1618
    .line 1619
    goto :goto_30

    .line 1620
    :cond_73
    iget-object v1, v1, Lmd3;->b:Ljava/util/Map;

    .line 1621
    .line 1622
    const-string v10, ".sysmsg.$type"

    .line 1623
    .line 1624
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v11

    .line 1628
    if-eqz v11, :cond_74

    .line 1629
    .line 1630
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v11

    .line 1634
    goto :goto_32

    .line 1635
    :cond_74
    const/4 v11, 0x0

    .line 1636
    :goto_32
    invoke-static {v11, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1637
    .line 1638
    .line 1639
    move-result v0

    .line 1640
    if-nez v0, :cond_75

    .line 1641
    .line 1642
    goto :goto_30

    .line 1643
    :cond_75
    const-string v0, ".sysmsg.revokemsg.newmsgid"

    .line 1644
    .line 1645
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    if-eqz v0, :cond_78

    .line 1650
    .line 1651
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v0

    .line 1655
    if-eqz v0, :cond_78

    .line 1656
    .line 1657
    const/16 v11, 0xa

    .line 1658
    .line 1659
    invoke-static {v0, v11}, Lwv2;->g0(Ljava/lang/String;I)Ljava/lang/Long;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v0

    .line 1663
    if-eqz v0, :cond_78

    .line 1664
    .line 1665
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1666
    .line 1667
    .line 1668
    move-result-wide v11

    .line 1669
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v0

    .line 1677
    new-instance v17, Le2;

    .line 1678
    .line 1679
    const/16 v24, 0x0

    .line 1680
    .line 1681
    const/16 v25, 0x9

    .line 1682
    .line 1683
    const/16 v18, 0x1

    .line 1684
    .line 1685
    sget-object v19, Lzi1;->a:Lzi1;

    .line 1686
    .line 1687
    const-class v20, Lzi1;

    .line 1688
    .line 1689
    const-string v21, "invoke"

    .line 1690
    .line 1691
    const-string v22, "invoke(Landroid/database/Cursor;)Lnuke/module/wechat/data/MsgInfoBean;"

    .line 1692
    .line 1693
    const/16 v23, 0x0

    .line 1694
    .line 1695
    invoke-direct/range {v17 .. v25}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1696
    .line 1697
    .line 1698
    move/from16 v18, v9

    .line 1699
    .line 1700
    move-object/from16 v9, v17

    .line 1701
    .line 1702
    sget-object v15, Lyc3;->k:Lyc3;

    .line 1703
    .line 1704
    const-string v14, "SELECT type, content, talker, createTime, lvbuffer,\n       msgId, msgSvrId, isSend, status\nFROM message\nWHERE msgSvrId = ?\nLIMIT 1"

    .line 1705
    .line 1706
    invoke-static {v15, v14, v0, v9}, Ldd3;->m(Lyc3;Ljava/lang/String;[Ljava/lang/String;Lin0;)Lbd3;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    sget-object v9, Lcd3;->o:Lcd3;

    .line 1711
    .line 1712
    instance-of v14, v0, Lad3;

    .line 1713
    .line 1714
    if-eqz v14, :cond_76

    .line 1715
    .line 1716
    new-instance v14, Lad3;

    .line 1717
    .line 1718
    check-cast v0, Lad3;

    .line 1719
    .line 1720
    iget-object v0, v0, Lad3;->a:Ljava/lang/Object;

    .line 1721
    .line 1722
    invoke-virtual {v9, v0}, Lcd3;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    invoke-direct {v14, v0}, Lad3;-><init>(Ljava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    move-object v0, v14

    .line 1730
    goto :goto_33

    .line 1731
    :cond_76
    instance-of v9, v0, Lzc3;

    .line 1732
    .line 1733
    if-eqz v9, :cond_8f

    .line 1734
    .line 1735
    :goto_33
    instance-of v9, v0, Lad3;

    .line 1736
    .line 1737
    if-eqz v9, :cond_8d

    .line 1738
    .line 1739
    check-cast v0, Lad3;

    .line 1740
    .line 1741
    iget-object v0, v0, Lad3;->a:Ljava/lang/Object;

    .line 1742
    .line 1743
    move-object v9, v0

    .line 1744
    check-cast v9, Lyi1;

    .line 1745
    .line 1746
    if-nez v9, :cond_77

    .line 1747
    .line 1748
    goto/16 :goto_30

    .line 1749
    .line 1750
    :cond_77
    iget-object v14, v9, Lyi1;->c:Ljava/lang/String;

    .line 1751
    .line 1752
    iget v0, v9, Lyi1;->a:I

    .line 1753
    .line 1754
    if-eqz v0, :cond_79

    .line 1755
    .line 1756
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1757
    .line 1758
    const-string v1, "Skipped outgoing revoke: msgSvrId="

    .line 1759
    .line 1760
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1764
    .line 1765
    .line 1766
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v0

    .line 1770
    invoke-static {v2, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1771
    .line 1772
    .line 1773
    :cond_78
    :goto_34
    move-object/from16 v28, v13

    .line 1774
    .line 1775
    goto/16 :goto_43

    .line 1776
    .line 1777
    :cond_79
    const/4 v15, 0x0

    .line 1778
    invoke-static {v15}, Lee;->r(Landroid/content/Context;)Lde;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    :try_start_0
    const-string v15, ".sysmsg.revokemsg.replacemsg"

    .line 1783
    .line 1784
    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v15

    .line 1788
    if-eqz v15, :cond_7a

    .line 1789
    .line 1790
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v15

    .line 1794
    goto :goto_36

    .line 1795
    :catchall_0
    move-exception v0

    .line 1796
    move-object/from16 v28, v13

    .line 1797
    .line 1798
    :goto_35
    move-object/from16 v24, v14

    .line 1799
    .line 1800
    goto :goto_39

    .line 1801
    :cond_7a
    const/4 v15, 0x0

    .line 1802
    :goto_36
    if-nez v15, :cond_7b

    .line 1803
    .line 1804
    const-string v15, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1805
    .line 1806
    :cond_7b
    move-object/from16 v28, v13

    .line 1807
    .line 1808
    :try_start_1
    sget-object v13, Lee;->j:Lo72;

    .line 1809
    .line 1810
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1811
    .line 1812
    .line 1813
    iget-object v13, v13, Lo72;->i:Ljava/lang/Object;

    .line 1814
    .line 1815
    check-cast v13, Ljava/util/regex/Pattern;

    .line 1816
    .line 1817
    invoke-virtual {v13, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v13

    .line 1821
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1822
    .line 1823
    .line 1824
    move-object/from16 v24, v14

    .line 1825
    .line 1826
    const/4 v14, 0x0

    .line 1827
    :try_start_2
    invoke-virtual {v13, v14}, Ljava/util/regex/Matcher;->find(I)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v17

    .line 1831
    if-nez v17, :cond_7c

    .line 1832
    .line 1833
    const/4 v14, 0x0

    .line 1834
    goto :goto_37

    .line 1835
    :cond_7c
    new-instance v14, Lkj1;

    .line 1836
    .line 1837
    invoke-direct {v14, v13, v15}, Lkj1;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 1838
    .line 1839
    .line 1840
    :goto_37
    if-eqz v14, :cond_7d

    .line 1841
    .line 1842
    invoke-virtual {v14}, Lkj1;->x()Ljava/util/List;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v13

    .line 1846
    const/4 v14, 0x2

    .line 1847
    invoke-static {v14, v13}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v13

    .line 1851
    check-cast v13, Ljava/lang/String;

    .line 1852
    .line 1853
    if-eqz v13, :cond_7d

    .line 1854
    .line 1855
    invoke-static {v13}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v13

    .line 1859
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v13

    .line 1863
    if-eqz v13, :cond_7d

    .line 1864
    .line 1865
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1866
    .line 1867
    .line 1868
    move-result v14

    .line 1869
    if-lez v14, :cond_7d

    .line 1870
    .line 1871
    goto :goto_38

    .line 1872
    :cond_7d
    const/4 v13, 0x0

    .line 1873
    :goto_38
    if-nez v13, :cond_7e

    .line 1874
    .line 1875
    goto/16 :goto_43

    .line 1876
    .line 1877
    :cond_7e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1878
    .line 1879
    .line 1880
    move-result-wide v14

    .line 1881
    invoke-static {v0, v13, v9, v14, v15}, Lee;->q(Lde;Ljava/lang/String;Lyi1;J)Ljava/lang/String;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1885
    goto :goto_3a

    .line 1886
    :catchall_1
    move-exception v0

    .line 1887
    goto :goto_39

    .line 1888
    :catchall_2
    move-exception v0

    .line 1889
    goto :goto_35

    .line 1890
    :goto_39
    new-instance v13, Lx92;

    .line 1891
    .line 1892
    invoke-direct {v13, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1893
    .line 1894
    .line 1895
    move-object v0, v13

    .line 1896
    :goto_3a
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v13

    .line 1900
    if-nez v13, :cond_8c

    .line 1901
    .line 1902
    check-cast v0, Ljava/lang/String;

    .line 1903
    .line 1904
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 1905
    .line 1906
    .line 1907
    move-result v13

    .line 1908
    if-eqz v13, :cond_7f

    .line 1909
    .line 1910
    const-string v0, "Skipped revoke interception because the system message is empty"

    .line 1911
    .line 1912
    invoke-static {v2, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1913
    .line 1914
    .line 1915
    goto/16 :goto_43

    .line 1916
    .line 1917
    :cond_7f
    const/4 v15, 0x0

    .line 1918
    invoke-interface {v1, v10, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    iget-wide v9, v9, Lyi1;->i:J

    .line 1922
    .line 1923
    const-wide/16 v13, 0x1

    .line 1924
    .line 1925
    add-long/2addr v9, v13

    .line 1926
    const-string v1, "Unsupported MsgInfoStorage insert parameter count: "

    .line 1927
    .line 1928
    invoke-static/range {v24 .. v24}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 1929
    .line 1930
    .line 1931
    move-result v13

    .line 1932
    sget-object v21, Lpo2;->k:Lpo2;

    .line 1933
    .line 1934
    if-eqz v13, :cond_80

    .line 1935
    .line 1936
    const/16 v26, 0x0

    .line 1937
    .line 1938
    const/16 v27, 0x30

    .line 1939
    .line 1940
    sget-object v22, Lio2;->h:Lio2;

    .line 1941
    .line 1942
    const-string v23, "Talker is empty"

    .line 1943
    .line 1944
    const/16 v25, 0x0

    .line 1945
    .line 1946
    invoke-static/range {v21 .. v27}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v0

    .line 1950
    :goto_3b
    move-object/from16 v13, v24

    .line 1951
    .line 1952
    goto/16 :goto_41

    .line 1953
    .line 1954
    :cond_80
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 1955
    .line 1956
    .line 1957
    move-result v13

    .line 1958
    if-eqz v13, :cond_81

    .line 1959
    .line 1960
    const/16 v26, 0x0

    .line 1961
    .line 1962
    const/16 v27, 0x30

    .line 1963
    .line 1964
    sget-object v22, Lio2;->i:Lio2;

    .line 1965
    .line 1966
    const-string v23, "System message content is empty"

    .line 1967
    .line 1968
    const/16 v25, 0x0

    .line 1969
    .line 1970
    invoke-static/range {v21 .. v27}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v0

    .line 1974
    goto :goto_3b

    .line 1975
    :cond_81
    move-object/from16 v14, v21

    .line 1976
    .line 1977
    move-object/from16 v13, v24

    .line 1978
    .line 1979
    :try_start_3
    new-instance v15, Landroid/content/ContentValues;

    .line 1980
    .line 1981
    invoke-direct {v15}, Landroid/content/ContentValues;-><init>()V

    .line 1982
    .line 1983
    .line 1984
    move-wide/from16 v24, v9

    .line 1985
    .line 1986
    const-string v9, "msgid"

    .line 1987
    .line 1988
    const-wide/16 v21, 0x0

    .line 1989
    .line 1990
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v10

    .line 1994
    invoke-virtual {v15, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1995
    .line 1996
    .line 1997
    sget-object v9, Li52;->h:Ld3;

    .line 1998
    .line 1999
    sget-object v9, Li52;->h:Ld3;

    .line 2000
    .line 2001
    invoke-virtual {v9}, Ld3;->a()Ljava/util/Random;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v9

    .line 2005
    invoke-virtual {v9}, Ljava/util/Random;->nextInt()I

    .line 2006
    .line 2007
    .line 2008
    move-result v9

    .line 2009
    int-to-long v9, v9

    .line 2010
    add-long v9, v24, v9

    .line 2011
    .line 2012
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v9

    .line 2016
    invoke-virtual {v15, v3, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2017
    .line 2018
    .line 2019
    const/16 v3, 0x2710

    .line 2020
    .line 2021
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v3

    .line 2025
    invoke-virtual {v15, v6, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2026
    .line 2027
    .line 2028
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v3

    .line 2032
    invoke-virtual {v15, v8, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2033
    .line 2034
    .line 2035
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v3

    .line 2039
    invoke-virtual {v15, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2040
    .line 2041
    .line 2042
    invoke-virtual {v15, v7, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2043
    .line 2044
    .line 2045
    invoke-virtual {v15, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2046
    .line 2047
    .line 2048
    sget-object v3, Lxi1;->d:Lxi1;

    .line 2049
    .line 2050
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2051
    .line 2052
    .line 2053
    sget-object v3, Lxi1;->f:Lhx2;

    .line 2054
    .line 2055
    invoke-virtual {v3}, Lhx2;->getValue()Ljava/lang/Object;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v3

    .line 2059
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2060
    .line 2061
    .line 2062
    check-cast v3, Ljava/lang/Class;

    .line 2063
    .line 2064
    const/4 v10, 0x0

    .line 2065
    new-array v4, v10, [Ljava/lang/Object;

    .line 2066
    .line 2067
    invoke-static {v3, v4}, Ldt;->c(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v3

    .line 2071
    invoke-static {v3}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v4

    .line 2075
    invoke-virtual {v4}, Ln4;->v()Lsg1;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v4

    .line 2079
    invoke-virtual {v4}, Lzf1;->b()V

    .line 2080
    .line 2081
    .line 2082
    const-string v5, "convertFrom"

    .line 2083
    .line 2084
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 2085
    .line 2086
    new-instance v5, Lyb3;

    .line 2087
    .line 2088
    const/16 v6, 0x11

    .line 2089
    .line 2090
    invoke-direct {v5, v6}, Lyb3;-><init>(I)V

    .line 2091
    .line 2092
    .line 2093
    iput-object v5, v4, Lsg1;->i:Lin0;

    .line 2094
    .line 2095
    invoke-virtual {v4}, Lsg1;->c()Ljava/util/List;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v4

    .line 2099
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v4

    .line 2103
    check-cast v4, Lzg1;

    .line 2104
    .line 2105
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2106
    .line 2107
    filled-new-array {v15, v5}, [Ljava/lang/Object;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v5

    .line 2111
    invoke-virtual {v4, v5}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2112
    .line 2113
    .line 2114
    sget-object v4, Lhp2;->d:Lhp2;

    .line 2115
    .line 2116
    sget-object v5, Lqg1;->d:Lqg1;

    .line 2117
    .line 2118
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2119
    .line 2120
    .line 2121
    sget-object v5, Lqg1;->f:Lhx2;

    .line 2122
    .line 2123
    invoke-virtual {v5}, Lhx2;->getValue()Ljava/lang/Object;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v5

    .line 2127
    check-cast v5, Ljava/lang/Class;

    .line 2128
    .line 2129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2130
    .line 2131
    .line 2132
    invoke-static {v5}, Lhp2;->j(Ljava/lang/Class;)Ljava/lang/Object;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v4

    .line 2136
    invoke-static {v4}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v4

    .line 2140
    invoke-virtual {v4}, Ln4;->v()Lsg1;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v4

    .line 2144
    invoke-virtual {v4}, Lzf1;->b()V

    .line 2145
    .line 2146
    .line 2147
    const/16 v16, 0x0

    .line 2148
    .line 2149
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v5

    .line 2153
    iput-object v5, v4, Lsg1;->l:Ljava/lang/Integer;

    .line 2154
    .line 2155
    sget-object v5, Lbj1;->d:Lbj1;

    .line 2156
    .line 2157
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2158
    .line 2159
    .line 2160
    sget-object v5, Lbj1;->f:Lhx2;

    .line 2161
    .line 2162
    invoke-virtual {v5}, Lhx2;->getValue()Ljava/lang/Object;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v5

    .line 2166
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2167
    .line 2168
    .line 2169
    check-cast v5, Ljava/lang/Class;

    .line 2170
    .line 2171
    iput-object v5, v4, Lsg1;->C:Ljava/lang/Class;

    .line 2172
    .line 2173
    invoke-virtual {v4}, Lsg1;->c()Ljava/util/List;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v4

    .line 2177
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v4

    .line 2181
    check-cast v4, Lzg1;

    .line 2182
    .line 2183
    const/4 v10, 0x0

    .line 2184
    new-array v5, v10, [Ljava/lang/Object;

    .line 2185
    .line 2186
    invoke-virtual {v4, v5}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v4

    .line 2190
    if-eqz v4, :cond_87

    .line 2191
    .line 2192
    sget-object v5, Lbj1;->g:Lhx2;

    .line 2193
    .line 2194
    invoke-virtual {v5}, Lhx2;->getValue()Ljava/lang/Object;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v5

    .line 2198
    check-cast v5, Ljava/lang/reflect/Method;

    .line 2199
    .line 2200
    invoke-static {v5}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 2201
    .line 2202
    .line 2203
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 2204
    .line 2205
    .line 2206
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 2207
    const/4 v7, 0x1

    .line 2208
    if-eq v6, v7, :cond_84

    .line 2209
    .line 2210
    const/4 v7, 0x2

    .line 2211
    if-eq v6, v7, :cond_83

    .line 2212
    .line 2213
    move/from16 v7, v18

    .line 2214
    .line 2215
    if-ne v6, v7, :cond_82

    .line 2216
    .line 2217
    :try_start_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2218
    .line 2219
    filled-new-array {v3, v1, v1}, [Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v1

    .line 2223
    invoke-virtual {v5, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v1

    .line 2227
    goto :goto_3c

    .line 2228
    :catchall_3
    move-exception v0

    .line 2229
    move-object/from16 v26, v0

    .line 2230
    .line 2231
    move-object/from16 v24, v13

    .line 2232
    .line 2233
    goto/16 :goto_3f

    .line 2234
    .line 2235
    :cond_82
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2236
    .line 2237
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 2238
    .line 2239
    .line 2240
    move-result v3

    .line 2241
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2242
    .line 2243
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2244
    .line 2245
    .line 2246
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2247
    .line 2248
    .line 2249
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v1

    .line 2253
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v1

    .line 2257
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2258
    .line 2259
    .line 2260
    throw v0

    .line 2261
    :cond_83
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2262
    .line 2263
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v1

    .line 2267
    invoke-virtual {v5, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 2271
    goto :goto_3c

    .line 2272
    :cond_84
    :try_start_5
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v1

    .line 2276
    invoke-virtual {v5, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v1

    .line 2280
    :goto_3c
    instance-of v3, v1, Ljava/lang/Number;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 2281
    .line 2282
    if-eqz v3, :cond_85

    .line 2283
    .line 2284
    :try_start_6
    check-cast v1, Ljava/lang/Number;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 2285
    .line 2286
    goto :goto_3d

    .line 2287
    :cond_85
    const/4 v1, 0x0

    .line 2288
    :goto_3d
    if-eqz v1, :cond_86

    .line 2289
    .line 2290
    :try_start_7
    new-instance v3, Lro2;

    .line 2291
    .line 2292
    new-instance v21, Llo2;

    .line 2293
    .line 2294
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 2295
    .line 2296
    .line 2297
    move-result-wide v26
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 2298
    move-object/from16 v23, v0

    .line 2299
    .line 2300
    move-object/from16 v22, v13

    .line 2301
    .line 2302
    :try_start_8
    invoke-direct/range {v21 .. v27}, Llo2;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 2303
    .line 2304
    .line 2305
    move-object/from16 v0, v21

    .line 2306
    .line 2307
    move-object/from16 v24, v22

    .line 2308
    .line 2309
    :try_start_9
    invoke-direct {v3, v0}, Lro2;-><init>(Ljava/lang/Object;)V

    .line 2310
    .line 2311
    .line 2312
    move-object v0, v3

    .line 2313
    goto/16 :goto_3b

    .line 2314
    .line 2315
    :catchall_4
    move-exception v0

    .line 2316
    :goto_3e
    move-object/from16 v26, v0

    .line 2317
    .line 2318
    goto :goto_3f

    .line 2319
    :catchall_5
    move-exception v0

    .line 2320
    move-object/from16 v24, v22

    .line 2321
    .line 2322
    goto :goto_3e

    .line 2323
    :catchall_6
    move-exception v0

    .line 2324
    move-object/from16 v24, v13

    .line 2325
    .line 2326
    goto :goto_3e

    .line 2327
    :cond_86
    move-object/from16 v24, v13

    .line 2328
    .line 2329
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2330
    .line 2331
    const-string v1, "MsgInfoStorage insert returned no message id"

    .line 2332
    .line 2333
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2334
    .line 2335
    .line 2336
    throw v0

    .line 2337
    :cond_87
    move-object/from16 v24, v13

    .line 2338
    .line 2339
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2340
    .line 2341
    const-string v1, "MsgInfoStorage service is not initialized"

    .line 2342
    .line 2343
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2344
    .line 2345
    .line 2346
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 2347
    :goto_3f
    move-object/from16 v0, v26

    .line 2348
    .line 2349
    :goto_40
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v1

    .line 2353
    if-eqz v1, :cond_88

    .line 2354
    .line 2355
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v1

    .line 2359
    if-eq v1, v0, :cond_88

    .line 2360
    .line 2361
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v0

    .line 2365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2366
    .line 2367
    .line 2368
    goto :goto_40

    .line 2369
    :cond_88
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v0

    .line 2373
    if-nez v0, :cond_89

    .line 2374
    .line 2375
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v0

    .line 2379
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v0

    .line 2383
    :cond_89
    move-object/from16 v23, v0

    .line 2384
    .line 2385
    const/16 v25, 0x0

    .line 2386
    .line 2387
    const/16 v27, 0x10

    .line 2388
    .line 2389
    sget-object v22, Lio2;->q:Lio2;

    .line 2390
    .line 2391
    move-object/from16 v21, v14

    .line 2392
    .line 2393
    invoke-static/range {v21 .. v27}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v0

    .line 2397
    goto/16 :goto_3b

    .line 2398
    .line 2399
    :goto_41
    instance-of v1, v0, Lro2;

    .line 2400
    .line 2401
    if-eqz v1, :cond_8a

    .line 2402
    .line 2403
    check-cast v0, Lro2;

    .line 2404
    .line 2405
    iget-object v0, v0, Lro2;->a:Ljava/lang/Object;

    .line 2406
    .line 2407
    check-cast v0, Llo2;

    .line 2408
    .line 2409
    iget-wide v0, v0, Llo2;->d:J

    .line 2410
    .line 2411
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2412
    .line 2413
    const-string v4, "Blocked revoke: talker="

    .line 2414
    .line 2415
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2416
    .line 2417
    .line 2418
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2419
    .line 2420
    .line 2421
    const-string v4, ", msgSvrId="

    .line 2422
    .line 2423
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2427
    .line 2428
    .line 2429
    const-string v4, ", systemMsgId="

    .line 2430
    .line 2431
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2432
    .line 2433
    .line 2434
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2435
    .line 2436
    .line 2437
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2438
    .line 2439
    .line 2440
    move-result-object v0

    .line 2441
    invoke-static {v2, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 2442
    .line 2443
    .line 2444
    goto :goto_43

    .line 2445
    :cond_8a
    instance-of v1, v0, Lqo2;

    .line 2446
    .line 2447
    if-eqz v1, :cond_8b

    .line 2448
    .line 2449
    check-cast v0, Lqo2;

    .line 2450
    .line 2451
    iget-object v0, v0, Lqo2;->a:Ljo2;

    .line 2452
    .line 2453
    iget-object v0, v0, Ljo2;->c:Ljava/lang/String;

    .line 2454
    .line 2455
    const-string v1, "Revoke was blocked, but system message insertion failed: "

    .line 2456
    .line 2457
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v0

    .line 2461
    invoke-static {v2, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2462
    .line 2463
    .line 2464
    goto :goto_43

    .line 2465
    :cond_8b
    invoke-static {}, Lc80;->s()V

    .line 2466
    .line 2467
    .line 2468
    :goto_42
    const/4 v13, 0x0

    .line 2469
    goto :goto_44

    .line 2470
    :cond_8c
    sget-object v0, Lee;->d:Lee;

    .line 2471
    .line 2472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2473
    .line 2474
    .line 2475
    invoke-static {v13}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v0

    .line 2479
    const-string v1, "Unable to build revoke system message: "

    .line 2480
    .line 2481
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v0

    .line 2485
    invoke-static {v2, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2486
    .line 2487
    .line 2488
    goto :goto_43

    .line 2489
    :cond_8d
    move-object/from16 v28, v13

    .line 2490
    .line 2491
    instance-of v1, v0, Lzc3;

    .line 2492
    .line 2493
    if-eqz v1, :cond_8e

    .line 2494
    .line 2495
    check-cast v0, Lzc3;

    .line 2496
    .line 2497
    iget-object v0, v0, Lzc3;->a:Lxc3;

    .line 2498
    .line 2499
    iget-object v0, v0, Lxc3;->c:Ljava/lang/String;

    .line 2500
    .line 2501
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2502
    .line 2503
    const-string v3, "Unable to load revoked message "

    .line 2504
    .line 2505
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2506
    .line 2507
    .line 2508
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2509
    .line 2510
    .line 2511
    const-string v3, ": "

    .line 2512
    .line 2513
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2514
    .line 2515
    .line 2516
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2517
    .line 2518
    .line 2519
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v0

    .line 2523
    invoke-static {v2, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2524
    .line 2525
    .line 2526
    goto :goto_43

    .line 2527
    :cond_8e
    invoke-static {}, Lc80;->s()V

    .line 2528
    .line 2529
    .line 2530
    goto :goto_42

    .line 2531
    :cond_8f
    invoke-static {}, Lc80;->s()V

    .line 2532
    .line 2533
    .line 2534
    goto :goto_42

    .line 2535
    :goto_43
    move-object/from16 v13, v28

    .line 2536
    .line 2537
    :goto_44
    return-object v13

    .line 2538
    :pswitch_8
    move-object/from16 v28, v13

    .line 2539
    .line 2540
    check-cast v1, Ljava/lang/Boolean;

    .line 2541
    .line 2542
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2543
    .line 2544
    .line 2545
    move-result v1

    .line 2546
    check-cast v0, Lkt;

    .line 2547
    .line 2548
    iget-object v2, v0, Lkt;->I:Ldk1;

    .line 2549
    .line 2550
    if-eqz v1, :cond_90

    .line 2551
    .line 2552
    invoke-virtual {v0}, Lkt;->S0()V

    .line 2553
    .line 2554
    .line 2555
    goto/16 :goto_4b

    .line 2556
    .line 2557
    :cond_90
    iget-object v1, v0, Lkt;->x:Lbk1;

    .line 2558
    .line 2559
    if-eqz v1, :cond_95

    .line 2560
    .line 2561
    iget-object v1, v2, Ldk1;->c:[Ljava/lang/Object;

    .line 2562
    .line 2563
    iget-object v3, v2, Ldk1;->a:[J

    .line 2564
    .line 2565
    array-length v4, v3

    .line 2566
    const/16 v20, 0x2

    .line 2567
    .line 2568
    add-int/lit8 v4, v4, -0x2

    .line 2569
    .line 2570
    if-ltz v4, :cond_94

    .line 2571
    .line 2572
    const/4 v10, 0x0

    .line 2573
    :goto_45
    aget-wide v5, v3, v10

    .line 2574
    .line 2575
    not-long v7, v5

    .line 2576
    const/4 v9, 0x7

    .line 2577
    shl-long/2addr v7, v9

    .line 2578
    and-long/2addr v7, v5

    .line 2579
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    and-long/2addr v7, v11

    .line 2585
    cmp-long v7, v7, v11

    .line 2586
    .line 2587
    if-eqz v7, :cond_93

    .line 2588
    .line 2589
    sub-int v7, v10, v4

    .line 2590
    .line 2591
    not-int v7, v7

    .line 2592
    ushr-int/lit8 v7, v7, 0x1f

    .line 2593
    .line 2594
    const/16 v17, 0x8

    .line 2595
    .line 2596
    rsub-int/lit8 v7, v7, 0x8

    .line 2597
    .line 2598
    const/4 v8, 0x0

    .line 2599
    :goto_46
    if-ge v8, v7, :cond_92

    .line 2600
    .line 2601
    const-wide/16 v11, 0xff

    .line 2602
    .line 2603
    and-long/2addr v11, v5

    .line 2604
    const-wide/16 v13, 0x80

    .line 2605
    .line 2606
    cmp-long v9, v11, v13

    .line 2607
    .line 2608
    if-gez v9, :cond_91

    .line 2609
    .line 2610
    shl-int/lit8 v9, v10, 0x3

    .line 2611
    .line 2612
    add-int/2addr v9, v8

    .line 2613
    aget-object v9, v1, v9

    .line 2614
    .line 2615
    check-cast v9, Lz22;

    .line 2616
    .line 2617
    invoke-virtual {v0}, Lth1;->A0()Lj20;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v11

    .line 2621
    new-instance v12, Li2;

    .line 2622
    .line 2623
    const/4 v14, 0x0

    .line 2624
    const/4 v15, 0x0

    .line 2625
    invoke-direct {v12, v0, v9, v15, v14}, Li2;-><init>(Lkt;Lz22;Lt00;I)V

    .line 2626
    .line 2627
    .line 2628
    const/4 v9, 0x3

    .line 2629
    invoke-static {v11, v15, v12, v9}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 2630
    .line 2631
    .line 2632
    :goto_47
    const/16 v9, 0x8

    .line 2633
    .line 2634
    goto :goto_48

    .line 2635
    :cond_91
    const/4 v14, 0x0

    .line 2636
    goto :goto_47

    .line 2637
    :goto_48
    shr-long/2addr v5, v9

    .line 2638
    add-int/lit8 v8, v8, 0x1

    .line 2639
    .line 2640
    goto :goto_46

    .line 2641
    :cond_92
    const/16 v9, 0x8

    .line 2642
    .line 2643
    const/4 v14, 0x0

    .line 2644
    if-ne v7, v9, :cond_94

    .line 2645
    .line 2646
    goto :goto_49

    .line 2647
    :cond_93
    const/16 v9, 0x8

    .line 2648
    .line 2649
    const/4 v14, 0x0

    .line 2650
    :goto_49
    if-eq v10, v4, :cond_94

    .line 2651
    .line 2652
    add-int/lit8 v10, v10, 0x1

    .line 2653
    .line 2654
    goto :goto_45

    .line 2655
    :cond_94
    iget-object v1, v0, Lkt;->K:Lz22;

    .line 2656
    .line 2657
    if-eqz v1, :cond_95

    .line 2658
    .line 2659
    invoke-virtual {v0}, Lth1;->A0()Lj20;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v3

    .line 2663
    new-instance v4, Li2;

    .line 2664
    .line 2665
    const/4 v7, 0x1

    .line 2666
    const/4 v15, 0x0

    .line 2667
    invoke-direct {v4, v0, v1, v15, v7}, Li2;-><init>(Lkt;Lz22;Lt00;I)V

    .line 2668
    .line 2669
    .line 2670
    const/4 v7, 0x3

    .line 2671
    invoke-static {v3, v15, v4, v7}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 2672
    .line 2673
    .line 2674
    goto :goto_4a

    .line 2675
    :cond_95
    const/4 v15, 0x0

    .line 2676
    :goto_4a
    invoke-virtual {v2}, Ldk1;->a()V

    .line 2677
    .line 2678
    .line 2679
    iput-object v15, v0, Lkt;->K:Lz22;

    .line 2680
    .line 2681
    :goto_4b
    return-object v28

    .line 2682
    nop

    .line 2683
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
