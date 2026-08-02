.class public final Lt6;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt6;->i:I

    .line 2
    .line 3
    iput-object p2, p0, Lt6;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lt6;->k:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lt6;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, La83;->a:La83;

    .line 7
    .line 8
    iget-object v5, p0, Lt6;->k:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lt6;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lba1;

    .line 16
    .line 17
    check-cast v5, Llg1;

    .line 18
    .line 19
    invoke-virtual {p0, v5}, Lba1;->b(Lha1;)V

    .line 20
    .line 21
    .line 22
    return-object v4

    .line 23
    :pswitch_0
    check-cast p0, Lin0;

    .line 24
    .line 25
    sget-object v0, Lzn1;->T:Lca2;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    check-cast v5, Lzn1;

    .line 31
    .line 32
    iget-object p0, v5, Lzn1;->K:Leq2;

    .line 33
    .line 34
    iget-object v1, v0, Lca2;->u:Leq2;

    .line 35
    .line 36
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    iget-boolean v1, v5, Lzn1;->L:Z

    .line 41
    .line 42
    iget-boolean v6, v0, Lca2;->v:Z

    .line 43
    .line 44
    if-eq v1, v6, :cond_0

    .line 45
    .line 46
    move v2, v3

    .line 47
    :cond_0
    if-eqz p0, :cond_1

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    :cond_1
    iget-object v1, v0, Lca2;->u:Leq2;

    .line 52
    .line 53
    iput-object v1, v5, Lzn1;->K:Leq2;

    .line 54
    .line 55
    iput-boolean v6, v5, Lzn1;->L:Z

    .line 56
    .line 57
    iget-boolean v1, v5, Lzn1;->M:Z

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    if-nez p0, :cond_3

    .line 66
    .line 67
    :cond_2
    iget-object p0, v5, Lzn1;->v:Lr61;

    .line 68
    .line 69
    invoke-virtual {p0}, Lr61;->F()V

    .line 70
    .line 71
    .line 72
    :cond_3
    iput-boolean v3, v5, Lzn1;->M:Z

    .line 73
    .line 74
    iget-object p0, v0, Lca2;->u:Leq2;

    .line 75
    .line 76
    iget-wide v1, v0, Lca2;->w:J

    .line 77
    .line 78
    iget-object v3, v0, Lca2;->y:Ld61;

    .line 79
    .line 80
    iget-object v5, v0, Lca2;->x:Le70;

    .line 81
    .line 82
    invoke-interface {p0, v1, v2, v3, v5}, Leq2;->a(JLd61;Le70;)Lte;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    iput-object p0, v0, Lca2;->A:Lte;

    .line 87
    .line 88
    return-object v4

    .line 89
    :pswitch_1
    check-cast p0, Lr61;

    .line 90
    .line 91
    iget-object p0, p0, Lr61;->M:Lvn1;

    .line 92
    .line 93
    check-cast v5, Lo72;

    .line 94
    .line 95
    iget-object v0, p0, Lvn1;->g:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lth1;

    .line 98
    .line 99
    iget v0, v0, Lth1;->k:I

    .line 100
    .line 101
    and-int/lit8 v0, v0, 0x8

    .line 102
    .line 103
    if-eqz v0, :cond_e

    .line 104
    .line 105
    iget-object p0, p0, Lvn1;->f:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lqx2;

    .line 108
    .line 109
    :goto_0
    if-eqz p0, :cond_e

    .line 110
    .line 111
    iget v0, p0, Lth1;->j:I

    .line 112
    .line 113
    and-int/lit8 v0, v0, 0x8

    .line 114
    .line 115
    if-eqz v0, :cond_d

    .line 116
    .line 117
    move-object v0, p0

    .line 118
    move-object v6, v1

    .line 119
    :goto_1
    if-eqz v0, :cond_d

    .line 120
    .line 121
    instance-of v7, v0, Lon2;

    .line 122
    .line 123
    if-eqz v7, :cond_6

    .line 124
    .line 125
    check-cast v0, Lon2;

    .line 126
    .line 127
    invoke-interface {v0}, Lon2;->n0()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_4

    .line 132
    .line 133
    new-instance v7, Lln2;

    .line 134
    .line 135
    invoke-direct {v7}, Lln2;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v7, v5, Lo72;->i:Ljava/lang/Object;

    .line 139
    .line 140
    iput-boolean v3, v7, Lln2;->k:Z

    .line 141
    .line 142
    :cond_4
    invoke-interface {v0}, Lon2;->o0()Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_5

    .line 147
    .line 148
    iget-object v7, v5, Lo72;->i:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v7, Lln2;

    .line 151
    .line 152
    iput-boolean v3, v7, Lln2;->j:Z

    .line 153
    .line 154
    :cond_5
    iget-object v7, v5, Lo72;->i:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v7, Lzn2;

    .line 157
    .line 158
    invoke-interface {v0, v7}, Lon2;->l0(Lzn2;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    iget v7, v0, Lth1;->j:I

    .line 163
    .line 164
    and-int/lit8 v7, v7, 0x8

    .line 165
    .line 166
    if-eqz v7, :cond_c

    .line 167
    .line 168
    instance-of v7, v0, Lu60;

    .line 169
    .line 170
    if-eqz v7, :cond_c

    .line 171
    .line 172
    move-object v7, v0

    .line 173
    check-cast v7, Lu60;

    .line 174
    .line 175
    iget-object v7, v7, Lu60;->w:Lth1;

    .line 176
    .line 177
    move v8, v2

    .line 178
    :goto_2
    if-eqz v7, :cond_b

    .line 179
    .line 180
    iget v9, v7, Lth1;->j:I

    .line 181
    .line 182
    and-int/lit8 v9, v9, 0x8

    .line 183
    .line 184
    if-eqz v9, :cond_a

    .line 185
    .line 186
    add-int/lit8 v8, v8, 0x1

    .line 187
    .line 188
    if-ne v8, v3, :cond_7

    .line 189
    .line 190
    move-object v0, v7

    .line 191
    goto :goto_3

    .line 192
    :cond_7
    if-nez v6, :cond_8

    .line 193
    .line 194
    new-instance v6, Lzk1;

    .line 195
    .line 196
    const/16 v9, 0x10

    .line 197
    .line 198
    new-array v9, v9, [Lth1;

    .line 199
    .line 200
    invoke-direct {v6, v9}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_8
    if-eqz v0, :cond_9

    .line 204
    .line 205
    invoke-virtual {v6, v0}, Lzk1;->b(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    move-object v0, v1

    .line 209
    :cond_9
    invoke-virtual {v6, v7}, Lzk1;->b(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_a
    :goto_3
    iget-object v7, v7, Lth1;->m:Lth1;

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_b
    if-ne v8, v3, :cond_c

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_c
    :goto_4
    invoke-static {v6}, Lsp0;->m(Lzk1;)Lth1;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    goto :goto_1

    .line 223
    :cond_d
    iget-object p0, p0, Lth1;->l:Lth1;

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_e
    return-object v4

    .line 227
    :pswitch_2
    check-cast p0, Ljava/lang/String;

    .line 228
    .line 229
    move v0, v2

    .line 230
    :goto_5
    const-string v1, "[]"

    .line 231
    .line 232
    invoke-static {p0, v1, v2}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_f

    .line 237
    .line 238
    add-int/lit8 v0, v0, 0x1

    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    add-int/lit8 v1, v1, -0x2

    .line 245
    .line 246
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    goto :goto_5

    .line 251
    :cond_f
    sget-object v1, Lm01;->b:Ljava/util/Map;

    .line 252
    .line 253
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Ljava/lang/Class;

    .line 258
    .line 259
    if-nez v1, :cond_10

    .line 260
    .line 261
    check-cast v5, Ljava/lang/ClassLoader;

    .line 262
    .line 263
    invoke-virtual {v5, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move p0, v2

    .line 271
    :goto_6
    if-ge p0, v0, :cond_11

    .line 272
    .line 273
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    add-int/lit8 p0, p0, 0x1

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_11
    return-object v1

    .line 285
    :pswitch_3
    check-cast p0, Lus0;

    .line 286
    .line 287
    check-cast v5, Lth1;

    .line 288
    .line 289
    invoke-virtual {p0, v5}, Lus0;->d(Lth1;)V

    .line 290
    .line 291
    .line 292
    return-object v4

    .line 293
    :pswitch_4
    check-cast p0, Lo72;

    .line 294
    .line 295
    check-cast v5, Lpl0;

    .line 296
    .line 297
    invoke-virtual {v5}, Lpl0;->O0()Lel0;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iput-object v0, p0, Lo72;->i:Ljava/lang/Object;

    .line 302
    .line 303
    return-object v4

    .line 304
    :pswitch_5
    check-cast p0, Lo72;

    .line 305
    .line 306
    check-cast v5, Lnl0;

    .line 307
    .line 308
    sget-object v0, Lqz1;->a:Lmy;

    .line 309
    .line 310
    invoke-static {v5, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    iput-object v0, p0, Lo72;->i:Ljava/lang/Object;

    .line 315
    .line 316
    return-object v4

    .line 317
    :pswitch_6
    check-cast p0, Lpo;

    .line 318
    .line 319
    iget-object p0, p0, Lpo;->x:Lin0;

    .line 320
    .line 321
    check-cast v5, Lqo;

    .line 322
    .line 323
    invoke-interface {p0, v5}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    return-object v4

    .line 327
    :pswitch_7
    check-cast p0, Lxm0;

    .line 328
    .line 329
    if-eqz p0, :cond_13

    .line 330
    .line 331
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    check-cast p0, Lo62;

    .line 336
    .line 337
    if-nez p0, :cond_12

    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_12
    move-object v1, p0

    .line 341
    goto :goto_9

    .line 342
    :cond_13
    :goto_7
    check-cast v5, Lzn1;

    .line 343
    .line 344
    invoke-virtual {v5}, Lzn1;->S0()Lth1;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    iget-boolean p0, p0, Lth1;->u:Z

    .line 349
    .line 350
    if-eqz p0, :cond_14

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_14
    move-object v5, v1

    .line 354
    :goto_8
    if-eqz v5, :cond_15

    .line 355
    .line 356
    iget-wide v0, v5, Lsz1;->j:J

    .line 357
    .line 358
    invoke-static {v0, v1}, Ls11;->q0(J)J

    .line 359
    .line 360
    .line 361
    move-result-wide v0

    .line 362
    const-wide/16 v2, 0x0

    .line 363
    .line 364
    invoke-static {v2, v3, v0, v1}, Leu;->q(JJ)Lo62;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    :cond_15
    :goto_9
    return-object v1

    .line 369
    :pswitch_8
    check-cast v5, Lh7;

    .line 370
    .line 371
    check-cast p0, Ljl2;

    .line 372
    .line 373
    iget-object v0, p0, Ljl2;->l:Lel2;

    .line 374
    .line 375
    iget-object v1, p0, Ljl2;->m:Lel2;

    .line 376
    .line 377
    iget-object v2, p0, Ljl2;->j:Ljava/lang/Float;

    .line 378
    .line 379
    iget-object v3, p0, Ljl2;->k:Ljava/lang/Float;

    .line 380
    .line 381
    const/4 v6, 0x0

    .line 382
    if-eqz v0, :cond_16

    .line 383
    .line 384
    if-eqz v2, :cond_16

    .line 385
    .line 386
    iget-object v7, v0, Lel2;->a:Lxm0;

    .line 387
    .line 388
    invoke-interface {v7}, Lxm0;->a()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    check-cast v7, Ljava/lang/Number;

    .line 393
    .line 394
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    sub-float/2addr v7, v2

    .line 403
    goto :goto_a

    .line 404
    :cond_16
    move v7, v6

    .line 405
    :goto_a
    if-eqz v1, :cond_17

    .line 406
    .line 407
    if-eqz v3, :cond_17

    .line 408
    .line 409
    iget-object v2, v1, Lel2;->a:Lxm0;

    .line 410
    .line 411
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    check-cast v2, Ljava/lang/Number;

    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    sub-float/2addr v2, v3

    .line 426
    goto :goto_b

    .line 427
    :cond_17
    move v2, v6

    .line 428
    :goto_b
    cmpg-float v3, v7, v6

    .line 429
    .line 430
    if-nez v3, :cond_18

    .line 431
    .line 432
    cmpg-float v2, v2, v6

    .line 433
    .line 434
    if-nez v2, :cond_18

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_18
    iget v2, p0, Ljl2;->h:I

    .line 438
    .line 439
    invoke-virtual {v5, v2}, Lh7;->t(I)I

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    invoke-virtual {v5}, Lh7;->l()Lx01;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    iget v6, v5, Lh7;->r:I

    .line 448
    .line 449
    invoke-virtual {v3, v6}, Lx01;->b(I)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    check-cast v3, Lsn2;

    .line 454
    .line 455
    if-eqz v3, :cond_19

    .line 456
    .line 457
    :try_start_0
    iget-object v6, v5, Lh7;->t:Ll4;

    .line 458
    .line 459
    if-eqz v6, :cond_19

    .line 460
    .line 461
    invoke-virtual {v5, v3}, Lh7;->d(Lsn2;)Landroid/graphics/Rect;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    iget-object v6, v6, Ll4;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 466
    .line 467
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 468
    .line 469
    .line 470
    :catch_0
    :cond_19
    invoke-virtual {v5}, Lh7;->l()Lx01;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    iget v6, v5, Lh7;->s:I

    .line 475
    .line 476
    invoke-virtual {v3, v6}, Lx01;->b(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    check-cast v3, Lsn2;

    .line 481
    .line 482
    if-eqz v3, :cond_1a

    .line 483
    .line 484
    :try_start_1
    iget-object v6, v5, Lh7;->u:Ll4;

    .line 485
    .line 486
    if-eqz v6, :cond_1a

    .line 487
    .line 488
    invoke-virtual {v5, v3}, Lh7;->d(Lsn2;)Landroid/graphics/Rect;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    iget-object v6, v6, Ll4;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 493
    .line 494
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 495
    .line 496
    .line 497
    :catch_1
    :cond_1a
    iget-object v3, v5, Lh7;->k:Lb7;

    .line 498
    .line 499
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v5}, Lh7;->l()Lx01;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    invoke-virtual {v3, v2}, Lx01;->b(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    check-cast v3, Lsn2;

    .line 511
    .line 512
    if-eqz v3, :cond_1d

    .line 513
    .line 514
    iget-object v3, v3, Lsn2;->a:Lqn2;

    .line 515
    .line 516
    if-eqz v3, :cond_1d

    .line 517
    .line 518
    iget-object v3, v3, Lqn2;->c:Lr61;

    .line 519
    .line 520
    if-eqz v3, :cond_1d

    .line 521
    .line 522
    if-eqz v0, :cond_1b

    .line 523
    .line 524
    iget-object v6, v5, Lh7;->w:Lzj1;

    .line 525
    .line 526
    invoke-virtual {v6, v2, v0}, Lzj1;->h(ILjava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    :cond_1b
    if-eqz v1, :cond_1c

    .line 530
    .line 531
    iget-object v6, v5, Lh7;->x:Lzj1;

    .line 532
    .line 533
    invoke-virtual {v6, v2, v1}, Lzj1;->h(ILjava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    :cond_1c
    invoke-virtual {v5, v3}, Lh7;->p(Lr61;)V

    .line 537
    .line 538
    .line 539
    :cond_1d
    :goto_c
    if-eqz v0, :cond_1e

    .line 540
    .line 541
    iget-object v0, v0, Lel2;->a:Lxm0;

    .line 542
    .line 543
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, Ljava/lang/Float;

    .line 548
    .line 549
    iput-object v0, p0, Ljl2;->j:Ljava/lang/Float;

    .line 550
    .line 551
    :cond_1e
    if-eqz v1, :cond_1f

    .line 552
    .line 553
    iget-object v0, v1, Lel2;->a:Lxm0;

    .line 554
    .line 555
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    check-cast v0, Ljava/lang/Float;

    .line 560
    .line 561
    iput-object v0, p0, Ljl2;->k:Ljava/lang/Float;

    .line 562
    .line 563
    :cond_1f
    return-object v4

    .line 564
    :pswitch_9
    check-cast p0, Lb7;

    .line 565
    .line 566
    check-cast v5, Landroid/view/KeyEvent;

    .line 567
    .line 568
    invoke-static {p0, v5}, Lb7;->f(Lb7;Landroid/view/KeyEvent;)Z

    .line 569
    .line 570
    .line 571
    move-result p0

    .line 572
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    return-object p0

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
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
