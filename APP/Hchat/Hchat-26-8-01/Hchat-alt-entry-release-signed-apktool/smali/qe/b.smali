.class public final synthetic Lqe/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqe/c;


# direct methods
.method public synthetic constructor <init>(Lqe/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqe/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lqe/b;->b:Lqe/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lqe/b;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    check-cast v0, Lud/r;

    .line 11
    .line 12
    iget-object v2, v0, Lud/r;->D:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_7

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lqd/s;

    .line 30
    .line 31
    iget-object v5, v4, Lqd/s;->l:Lp4/t;

    .line 32
    .line 33
    iget-object v5, v5, Lp4/t;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Lqd/j;

    .line 36
    .line 37
    invoke-virtual {v5}, Lqd/j;->w()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4}, Lqd/s;->i()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v6, v4, Lqd/s;->l:Lp4/t;

    .line 55
    .line 56
    iget-object v6, v6, Lp4/t;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_2

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Lqe/d;

    .line 75
    .line 76
    invoke-interface {v7}, Lqe/d;->getType()Lqd/j;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v7}, Lqd/j;->w()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_1

    .line 85
    .line 86
    invoke-virtual {v7}, Lqd/j;->v()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    invoke-interface {v5, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_6

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    check-cast v7, Lqd/j;

    .line 118
    .line 119
    invoke-virtual {v7}, Lqd/j;->v()Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_4

    .line 124
    .line 125
    invoke-virtual {v7}, Lqd/j;->b()Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_4

    .line 130
    .line 131
    instance-of v8, v7, Lqd/c;

    .line 132
    .line 133
    if-eqz v8, :cond_5

    .line 134
    .line 135
    sget-object v7, Lqd/j;->k:Lqd/e;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    invoke-virtual {v7}, Lqd/j;->l()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-static {v7}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    :goto_2
    iget-object v8, v1, Lqe/b;->b:Lqe/c;

    .line 147
    .line 148
    iget-object v8, v8, Lqe/c;->h:Lqe/x;

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    sget-object v9, Lqe/a0;->c:Lqe/a0;

    .line 154
    .line 155
    invoke-virtual {v8, v0, v4, v7, v9}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    const/4 v8, 0x3

    .line 160
    if-ne v7, v8, :cond_4

    .line 161
    .line 162
    invoke-virtual {v4}, Lqd/s;->o()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    const-string v6, ", "

    .line 167
    .line 168
    invoke-static {v5, v6}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    new-instance v6, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v7, "Type inference failed for "

    .line 175
    .line 176
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v4, ". Raw type applied. Possible types: "

    .line 183
    .line 184
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-virtual {v0, v4}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_6
    :goto_3
    const/4 v3, 0x0

    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_0
    move-object/from16 v0, p1

    .line 208
    .line 209
    check-cast v0, Lud/r;

    .line 210
    .line 211
    iget-object v2, v1, Lqe/b;->b:Lqe/c;

    .line 212
    .line 213
    iget-object v3, v2, Lqe/c;->g:Lqe/n;

    .line 214
    .line 215
    iget-object v4, v0, Lud/r;->z:Ljava/util/List;

    .line 216
    .line 217
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    const/4 v5, 0x0

    .line 222
    move v6, v5

    .line 223
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    const/4 v8, 0x1

    .line 228
    if-eqz v7, :cond_e

    .line 229
    .line 230
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    check-cast v7, Lud/a;

    .line 235
    .line 236
    sget-object v9, Lmd/b;->x:Lmd/b;

    .line 237
    .line 238
    iget-object v7, v7, Lmd/e;->g:Lmd/f;

    .line 239
    .line 240
    invoke-virtual {v7, v9}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    check-cast v7, Lnd/c0;

    .line 245
    .line 246
    if-eqz v7, :cond_8

    .line 247
    .line 248
    iget-object v7, v7, Lnd/c0;->g:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    if-eqz v9, :cond_8

    .line 259
    .line 260
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    check-cast v9, Lpd/q;

    .line 265
    .line 266
    iget-object v10, v9, Lud/p;->m:Ljava/util/List;

    .line 267
    .line 268
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    const/4 v11, 0x0

    .line 273
    move-object v12, v11

    .line 274
    :cond_9
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    if-eqz v13, :cond_b

    .line 279
    .line 280
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v13

    .line 284
    check-cast v13, Lqd/l;

    .line 285
    .line 286
    invoke-virtual {v13}, Lqd/l;->I()Lqd/j;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    if-nez v12, :cond_a

    .line 291
    .line 292
    move-object v12, v13

    .line 293
    goto :goto_5

    .line 294
    :cond_a
    invoke-virtual {v12, v13}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    if-nez v13, :cond_9

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_b
    move-object v11, v12

    .line 302
    :goto_6
    if-eqz v11, :cond_c

    .line 303
    .line 304
    invoke-virtual {v11}, Lqd/j;->w()Z

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    if-eqz v10, :cond_c

    .line 309
    .line 310
    :goto_7
    move v9, v5

    .line 311
    goto :goto_8

    .line 312
    :cond_c
    invoke-static {v0, v9, v5}, Lqe/c;->l(Lud/r;Lpd/q;Z)I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    if-nez v10, :cond_d

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_d
    invoke-static {v0, v9, v8}, Lqe/c;->l(Lud/r;Lpd/q;Z)I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    :goto_8
    add-int/2addr v6, v9

    .line 324
    goto :goto_4

    .line 325
    :cond_e
    if-nez v6, :cond_f

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_f
    invoke-static {v0}, Lbe/b;->W(Lud/r;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v0}, Lqe/n;->l(Lud/r;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v0}, Lqe/n;->m(Lud/r;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v0}, Lqe/c;->k(Lud/r;)Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_10

    .line 342
    .line 343
    move v5, v8

    .line 344
    goto :goto_9

    .line 345
    :cond_10
    invoke-virtual {v2, v0}, Lqe/c;->p(Lud/r;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    :goto_9
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    return-object v0

    .line 354
    :pswitch_1
    move-object/from16 v0, p1

    .line 355
    .line 356
    check-cast v0, Lud/r;

    .line 357
    .line 358
    iget-object v2, v0, Lud/r;->D:Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const/4 v3, 0x0

    .line 365
    move v4, v3

    .line 366
    :cond_11
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    const/4 v6, 0x1

    .line 371
    if-eqz v5, :cond_14

    .line 372
    .line 373
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, Lqd/s;

    .line 378
    .line 379
    iget-object v7, v5, Lqd/s;->l:Lp4/t;

    .line 380
    .line 381
    iget-object v7, v7, Lp4/t;->h:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v7, Lqd/j;

    .line 384
    .line 385
    invoke-virtual {v7}, Lqd/j;->w()Z

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    if-nez v7, :cond_11

    .line 390
    .line 391
    invoke-virtual {v5}, Lqd/s;->i()Z

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-eqz v7, :cond_11

    .line 396
    .line 397
    iget-object v7, v5, Lqd/s;->j:Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    :cond_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    if-eqz v8, :cond_11

    .line 408
    .line 409
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    check-cast v8, Lqd/r;

    .line 414
    .line 415
    iget-object v8, v8, Lqd/l;->j:Lud/p;

    .line 416
    .line 417
    if-eqz v8, :cond_12

    .line 418
    .line 419
    iget-object v8, v8, Lud/p;->k:Lpd/k;

    .line 420
    .line 421
    sget-object v9, Lpd/k;->G:Lpd/k;

    .line 422
    .line 423
    if-eq v8, v9, :cond_13

    .line 424
    .line 425
    sget-object v9, Lpd/k;->H:Lpd/k;

    .line 426
    .line 427
    if-ne v8, v9, :cond_12

    .line 428
    .line 429
    :cond_13
    invoke-virtual {v5}, Lqd/s;->d()Lqd/j;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-virtual {v5, v4}, Lqd/s;->n(Lqd/j;)V

    .line 434
    .line 435
    .line 436
    move v4, v6

    .line 437
    goto :goto_a

    .line 438
    :cond_14
    if-nez v4, :cond_15

    .line 439
    .line 440
    goto :goto_b

    .line 441
    :cond_15
    iget-object v2, v1, Lqe/b;->b:Lqe/c;

    .line 442
    .line 443
    iget-object v2, v2, Lqe/c;->g:Lqe/n;

    .line 444
    .line 445
    invoke-virtual {v2, v0}, Lqe/n;->m(Lud/r;)V

    .line 446
    .line 447
    .line 448
    move v3, v6

    .line 449
    :goto_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0

    .line 454
    :pswitch_2
    move-object/from16 v0, p1

    .line 455
    .line 456
    check-cast v0, Lud/r;

    .line 457
    .line 458
    iget-object v2, v1, Lqe/b;->b:Lqe/c;

    .line 459
    .line 460
    iget-object v2, v2, Lqe/c;->g:Lqe/n;

    .line 461
    .line 462
    iget-object v3, v0, Lud/r;->D:Ljava/util/List;

    .line 463
    .line 464
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    const/4 v5, 0x0

    .line 469
    move v6, v5

    .line 470
    move v7, v6

    .line 471
    :goto_c
    const/4 v8, 0x1

    .line 472
    if-ge v6, v4, :cond_33

    .line 473
    .line 474
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    check-cast v9, Lqd/s;

    .line 479
    .line 480
    iget-object v10, v9, Lqd/s;->l:Lp4/t;

    .line 481
    .line 482
    iget-object v11, v10, Lp4/t;->h:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v11, Lqd/j;

    .line 485
    .line 486
    invoke-virtual {v11}, Lqd/j;->w()Z

    .line 487
    .line 488
    .line 489
    move-result v11

    .line 490
    if-eqz v11, :cond_16

    .line 491
    .line 492
    move-object/from16 v16, v3

    .line 493
    .line 494
    move/from16 v17, v4

    .line 495
    .line 496
    move v9, v5

    .line 497
    move/from16 v18, v6

    .line 498
    .line 499
    move/from16 v19, v7

    .line 500
    .line 501
    goto/16 :goto_21

    .line 502
    .line 503
    :cond_16
    iget-object v10, v10, Lp4/t;->i:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v10, Ljava/util/LinkedHashSet;

    .line 506
    .line 507
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    move v11, v5

    .line 512
    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    if-eqz v12, :cond_21

    .line 517
    .line 518
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    check-cast v12, Lqe/d;

    .line 523
    .line 524
    invoke-interface {v12}, Lqe/d;->getType()Lqd/j;

    .line 525
    .line 526
    .line 527
    move-result-object v13

    .line 528
    invoke-interface {v12}, Lqe/d;->b()I

    .line 529
    .line 530
    .line 531
    move-result v12

    .line 532
    invoke-static {v12}, Lt3/c;->b(I)I

    .line 533
    .line 534
    .line 535
    move-result v12

    .line 536
    if-eqz v12, :cond_1e

    .line 537
    .line 538
    if-eq v12, v8, :cond_17

    .line 539
    .line 540
    goto :goto_15

    .line 541
    :cond_17
    instance-of v12, v13, Lqd/g;

    .line 542
    .line 543
    if-eqz v12, :cond_1a

    .line 544
    .line 545
    check-cast v13, Lqd/g;

    .line 546
    .line 547
    iget-object v12, v13, Lqd/g;->K:Lqd/q;

    .line 548
    .line 549
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    sget-object v13, Lqd/q;->r:Lqd/q;

    .line 553
    .line 554
    if-eq v12, v13, :cond_19

    .line 555
    .line 556
    sget-object v13, Lqd/q;->s:Lqd/q;

    .line 557
    .line 558
    if-ne v12, v13, :cond_18

    .line 559
    .line 560
    goto :goto_e

    .line 561
    :cond_18
    move v12, v5

    .line 562
    goto :goto_f

    .line 563
    :cond_19
    :goto_e
    move v12, v8

    .line 564
    :goto_f
    xor-int/2addr v12, v8

    .line 565
    goto :goto_12

    .line 566
    :cond_1a
    invoke-virtual {v13}, Lqd/j;->n()[Lqd/q;

    .line 567
    .line 568
    .line 569
    move-result-object v12

    .line 570
    array-length v13, v12

    .line 571
    move v14, v5

    .line 572
    :goto_10
    if-ge v14, v13, :cond_1d

    .line 573
    .line 574
    aget-object v15, v12, v14

    .line 575
    .line 576
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    sget-object v8, Lqd/q;->r:Lqd/q;

    .line 580
    .line 581
    if-eq v15, v8, :cond_1c

    .line 582
    .line 583
    sget-object v8, Lqd/q;->s:Lqd/q;

    .line 584
    .line 585
    if-ne v15, v8, :cond_1b

    .line 586
    .line 587
    goto :goto_11

    .line 588
    :cond_1b
    const/4 v12, 0x1

    .line 589
    goto :goto_12

    .line 590
    :cond_1c
    :goto_11
    add-int/lit8 v14, v14, 0x1

    .line 591
    .line 592
    const/4 v8, 0x1

    .line 593
    goto :goto_10

    .line 594
    :cond_1d
    move v12, v5

    .line 595
    :goto_12
    if-nez v12, :cond_20

    .line 596
    .line 597
    :goto_13
    move-object/from16 v16, v3

    .line 598
    .line 599
    move/from16 v17, v4

    .line 600
    .line 601
    move v9, v5

    .line 602
    :goto_14
    move/from16 v18, v6

    .line 603
    .line 604
    move/from16 v19, v7

    .line 605
    .line 606
    const/4 v8, 0x1

    .line 607
    goto/16 :goto_21

    .line 608
    .line 609
    :cond_1e
    sget-object v8, Lqd/q;->j:Lqd/q;

    .line 610
    .line 611
    invoke-virtual {v13, v8}, Lqd/j;->a(Lqd/q;)Z

    .line 612
    .line 613
    .line 614
    move-result v8

    .line 615
    if-nez v8, :cond_1f

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_1f
    const/4 v11, 0x1

    .line 619
    :cond_20
    :goto_15
    const/4 v8, 0x1

    .line 620
    goto :goto_d

    .line 621
    :cond_21
    if-nez v11, :cond_22

    .line 622
    .line 623
    goto :goto_13

    .line 624
    :cond_22
    new-instance v8, Ljava/util/ArrayList;

    .line 625
    .line 626
    iget-object v9, v9, Lqd/s;->j:Ljava/util/ArrayList;

    .line 627
    .line 628
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    move v9, v5

    .line 636
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    if-eqz v10, :cond_31

    .line 641
    .line 642
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v10

    .line 646
    check-cast v10, Lqd/r;

    .line 647
    .line 648
    iget-object v11, v10, Lqd/l;->i:Lqd/j;

    .line 649
    .line 650
    sget-object v12, Lqd/j;->c:Lqd/g;

    .line 651
    .line 652
    if-eq v11, v12, :cond_24

    .line 653
    .line 654
    invoke-virtual {v11}, Lqd/j;->w()Z

    .line 655
    .line 656
    .line 657
    move-result v13

    .line 658
    if-eqz v13, :cond_23

    .line 659
    .line 660
    instance-of v13, v11, Lqd/g;

    .line 661
    .line 662
    if-nez v13, :cond_23

    .line 663
    .line 664
    goto :goto_17

    .line 665
    :cond_23
    iget-object v13, v10, Lqd/l;->j:Lud/p;

    .line 666
    .line 667
    if-eqz v13, :cond_24

    .line 668
    .line 669
    iget-object v14, v13, Lud/p;->k:Lpd/k;

    .line 670
    .line 671
    sget-object v15, Lpd/k;->v:Lpd/k;

    .line 672
    .line 673
    if-ne v14, v15, :cond_25

    .line 674
    .line 675
    :cond_24
    :goto_17
    move-object/from16 v16, v3

    .line 676
    .line 677
    move/from16 v17, v4

    .line 678
    .line 679
    move/from16 v18, v6

    .line 680
    .line 681
    move/from16 v19, v7

    .line 682
    .line 683
    move-object/from16 v20, v8

    .line 684
    .line 685
    const/4 v8, 0x1

    .line 686
    goto/16 :goto_1f

    .line 687
    .line 688
    :cond_25
    iget-object v15, v0, Lud/r;->z:Ljava/util/List;

    .line 689
    .line 690
    invoke-static {v0, v13, v15}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 691
    .line 692
    .line 693
    move-result-object v15

    .line 694
    if-nez v15, :cond_26

    .line 695
    .line 696
    move-object/from16 v16, v3

    .line 697
    .line 698
    move/from16 v17, v4

    .line 699
    .line 700
    move/from16 v18, v6

    .line 701
    .line 702
    move/from16 v19, v7

    .line 703
    .line 704
    move-object/from16 v20, v8

    .line 705
    .line 706
    :goto_18
    const/4 v8, 0x1

    .line 707
    goto/16 :goto_20

    .line 708
    .line 709
    :cond_26
    move-object/from16 v16, v3

    .line 710
    .line 711
    iget-object v3, v15, Lud/a;->l:Ljava/util/ArrayList;

    .line 712
    .line 713
    move/from16 v17, v4

    .line 714
    .line 715
    invoke-static {v3, v13, v5}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    const/4 v5, -0x1

    .line 720
    if-ne v4, v5, :cond_27

    .line 721
    .line 722
    move/from16 v18, v6

    .line 723
    .line 724
    move/from16 v19, v7

    .line 725
    .line 726
    move-object/from16 v20, v8

    .line 727
    .line 728
    const/4 v5, 0x0

    .line 729
    goto :goto_18

    .line 730
    :cond_27
    sget-object v5, Lpd/k;->o:Lpd/k;

    .line 731
    .line 732
    move/from16 v18, v6

    .line 733
    .line 734
    sget-object v6, Lmd/a;->m:Lmd/a;

    .line 735
    .line 736
    if-ne v14, v5, :cond_28

    .line 737
    .line 738
    move-object v3, v13

    .line 739
    check-cast v3, Lpd/j;

    .line 740
    .line 741
    iget-object v3, v3, Lpd/j;->o:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v3, Lqd/j;

    .line 744
    .line 745
    iget-object v5, v13, Lud/p;->l:Lqd/r;

    .line 746
    .line 747
    iget-object v10, v10, Lqd/r;->m:Lqd/s;

    .line 748
    .line 749
    iget-object v10, v10, Lqd/s;->i:Lqd/r;

    .line 750
    .line 751
    invoke-virtual {v10}, Lqd/r;->c0()Lqd/r;

    .line 752
    .line 753
    .line 754
    move-result-object v10

    .line 755
    invoke-static {v5, v10, v3}, Lbe/d0;->k(Lqd/r;Lqd/l;Lqd/j;)Ltd/b;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    invoke-virtual {v3, v6}, Lmd/e;->w(Lmd/a;)V

    .line 760
    .line 761
    .line 762
    invoke-static {v0, v15, v4, v3}, La/a;->J0(Lud/r;Lud/a;ILud/p;)V

    .line 763
    .line 764
    .line 765
    move/from16 v19, v7

    .line 766
    .line 767
    move-object/from16 v20, v8

    .line 768
    .line 769
    const/4 v5, 0x1

    .line 770
    goto :goto_18

    .line 771
    :cond_28
    sget-object v5, Lpd/k;->j:Lpd/k;

    .line 772
    .line 773
    if-ne v14, v5, :cond_2f

    .line 774
    .line 775
    move-object v5, v13

    .line 776
    check-cast v5, Lpd/a;

    .line 777
    .line 778
    iget v14, v5, Lpd/a;->o:I

    .line 779
    .line 780
    move/from16 v19, v7

    .line 781
    .line 782
    const/16 v7, 0x8

    .line 783
    .line 784
    if-ne v14, v7, :cond_2e

    .line 785
    .line 786
    iget-object v7, v5, Lud/p;->m:Ljava/util/List;

    .line 787
    .line 788
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 789
    .line 790
    .line 791
    move-result v7

    .line 792
    const/4 v14, 0x2

    .line 793
    if-ne v7, v14, :cond_2e

    .line 794
    .line 795
    const/4 v7, 0x1

    .line 796
    invoke-virtual {v5, v7}, Lud/p;->S(I)Lqd/l;

    .line 797
    .line 798
    .line 799
    move-result-object v14

    .line 800
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    instance-of v7, v14, Lqd/n;

    .line 804
    .line 805
    if-eqz v7, :cond_2e

    .line 806
    .line 807
    check-cast v14, Lqd/n;

    .line 808
    .line 809
    move-object/from16 v20, v8

    .line 810
    .line 811
    iget-wide v7, v14, Lqd/n;->l:J

    .line 812
    .line 813
    const-wide/16 v21, 0x1

    .line 814
    .line 815
    cmp-long v7, v7, v21

    .line 816
    .line 817
    if-nez v7, :cond_2d

    .line 818
    .line 819
    new-instance v3, Lud/p;

    .line 820
    .line 821
    sget-object v7, Lpd/k;->l:Lpd/k;

    .line 822
    .line 823
    const/4 v8, 0x1

    .line 824
    invoke-direct {v3, v7, v8}, Lud/p;-><init>(Lpd/k;I)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v10}, Lqd/r;->c0()Lqd/r;

    .line 828
    .line 829
    .line 830
    move-result-object v7

    .line 831
    invoke-virtual {v3, v7}, Lud/p;->I(Lqd/l;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v3, v6}, Lmd/e;->w(Lmd/a;)V

    .line 835
    .line 836
    .line 837
    iget-object v7, v5, Lud/p;->l:Lqd/r;

    .line 838
    .line 839
    invoke-virtual {v7}, Lqd/r;->I()Lqd/j;

    .line 840
    .line 841
    .line 842
    move-result-object v7

    .line 843
    sget-object v10, Lqd/q;->j:Lqd/q;

    .line 844
    .line 845
    instance-of v11, v7, Lqd/g;

    .line 846
    .line 847
    if-eqz v11, :cond_29

    .line 848
    .line 849
    move-object v11, v7

    .line 850
    check-cast v11, Lqd/g;

    .line 851
    .line 852
    iget-object v11, v11, Lqd/g;->K:Lqd/q;

    .line 853
    .line 854
    if-eq v11, v10, :cond_2a

    .line 855
    .line 856
    :cond_29
    invoke-virtual {v7}, Lqd/j;->w()Z

    .line 857
    .line 858
    .line 859
    move-result v11

    .line 860
    if-nez v11, :cond_2b

    .line 861
    .line 862
    invoke-virtual {v7, v10}, Lqd/j;->a(Lqd/q;)Z

    .line 863
    .line 864
    .line 865
    move-result v7

    .line 866
    if-eqz v7, :cond_2b

    .line 867
    .line 868
    :cond_2a
    move v7, v8

    .line 869
    goto :goto_19

    .line 870
    :cond_2b
    const/4 v7, 0x0

    .line 871
    :goto_19
    if-eqz v7, :cond_2c

    .line 872
    .line 873
    iget-object v5, v5, Lud/p;->l:Lqd/r;

    .line 874
    .line 875
    invoke-virtual {v3, v5}, Lud/p;->d0(Lqd/r;)V

    .line 876
    .line 877
    .line 878
    goto :goto_1a

    .line 879
    :cond_2c
    invoke-static {v3}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 880
    .line 881
    .line 882
    move-result-object v3

    .line 883
    iput-object v12, v3, Lqd/l;->i:Lqd/j;

    .line 884
    .line 885
    iget-object v5, v5, Lud/p;->l:Lqd/r;

    .line 886
    .line 887
    sget-object v7, Lqd/j;->b:Lqd/g;

    .line 888
    .line 889
    invoke-static {v5, v3, v7}, Lbe/d0;->k(Lqd/r;Lqd/l;Lqd/j;)Ltd/b;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    invoke-virtual {v3, v6}, Lmd/e;->w(Lmd/a;)V

    .line 894
    .line 895
    .line 896
    :goto_1a
    invoke-static {v0, v15, v4, v3}, La/a;->J0(Lud/r;Lud/a;ILud/p;)V

    .line 897
    .line 898
    .line 899
    :goto_1b
    move v5, v8

    .line 900
    goto :goto_20

    .line 901
    :cond_2d
    :goto_1c
    const/4 v8, 0x1

    .line 902
    goto :goto_1e

    .line 903
    :cond_2e
    :goto_1d
    move-object/from16 v20, v8

    .line 904
    .line 905
    goto :goto_1c

    .line 906
    :cond_2f
    move/from16 v19, v7

    .line 907
    .line 908
    goto :goto_1d

    .line 909
    :goto_1e
    invoke-virtual {v10, v0}, Lqd/r;->e0(Lud/r;)Lqd/r;

    .line 910
    .line 911
    .line 912
    move-result-object v5

    .line 913
    iget-object v7, v10, Lqd/r;->m:Lqd/s;

    .line 914
    .line 915
    iget-object v7, v7, Lqd/s;->i:Lqd/r;

    .line 916
    .line 917
    invoke-virtual {v7}, Lqd/r;->c0()Lqd/r;

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    invoke-static {v5, v7, v11}, Lbe/d0;->k(Lqd/r;Lqd/l;Lqd/j;)Ltd/b;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    invoke-virtual {v5, v6}, Lmd/e;->w(Lmd/a;)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    iget-object v3, v5, Lud/p;->l:Lqd/r;

    .line 932
    .line 933
    invoke-virtual {v3}, Lqd/r;->c0()Lqd/r;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-virtual {v13, v10, v3}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 938
    .line 939
    .line 940
    goto :goto_1b

    .line 941
    :goto_1f
    const/4 v5, 0x0

    .line 942
    :goto_20
    if-eqz v5, :cond_30

    .line 943
    .line 944
    move v9, v8

    .line 945
    :cond_30
    move-object/from16 v3, v16

    .line 946
    .line 947
    move/from16 v4, v17

    .line 948
    .line 949
    move/from16 v6, v18

    .line 950
    .line 951
    move/from16 v7, v19

    .line 952
    .line 953
    move-object/from16 v8, v20

    .line 954
    .line 955
    const/4 v5, 0x0

    .line 956
    goto/16 :goto_16

    .line 957
    .line 958
    :cond_31
    move-object/from16 v16, v3

    .line 959
    .line 960
    move/from16 v17, v4

    .line 961
    .line 962
    goto/16 :goto_14

    .line 963
    .line 964
    :goto_21
    if-eqz v9, :cond_32

    .line 965
    .line 966
    move v7, v8

    .line 967
    goto :goto_22

    .line 968
    :cond_32
    move/from16 v7, v19

    .line 969
    .line 970
    :goto_22
    add-int/lit8 v6, v18, 0x1

    .line 971
    .line 972
    move-object/from16 v3, v16

    .line 973
    .line 974
    move/from16 v4, v17

    .line 975
    .line 976
    const/4 v5, 0x0

    .line 977
    goto/16 :goto_c

    .line 978
    .line 979
    :cond_33
    move/from16 v19, v7

    .line 980
    .line 981
    if-nez v19, :cond_34

    .line 982
    .line 983
    const/4 v5, 0x0

    .line 984
    goto :goto_23

    .line 985
    :cond_34
    invoke-static {v0}, Lbe/b;->W(Lud/r;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v2, v0}, Lqe/n;->l(Lud/r;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v2, v0}, Lqe/n;->m(Lud/r;)V

    .line 992
    .line 993
    .line 994
    move v5, v8

    .line 995
    :goto_23
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    return-object v0

    .line 1000
    :pswitch_3
    move-object/from16 v0, p1

    .line 1001
    .line 1002
    check-cast v0, Lud/r;

    .line 1003
    .line 1004
    iget-object v2, v1, Lqe/b;->b:Lqe/c;

    .line 1005
    .line 1006
    iget-object v2, v2, Lqe/c;->g:Lqe/n;

    .line 1007
    .line 1008
    new-instance v3, Ljava/util/ArrayList;

    .line 1009
    .line 1010
    iget-object v4, v0, Lud/r;->D:Ljava/util/List;

    .line 1011
    .line 1012
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    const/4 v5, 0x0

    .line 1020
    :cond_35
    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v6

    .line 1024
    const/4 v7, 0x1

    .line 1025
    if-eqz v6, :cond_47

    .line 1026
    .line 1027
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v6

    .line 1031
    check-cast v6, Lqd/s;

    .line 1032
    .line 1033
    iget-object v8, v6, Lqd/s;->l:Lp4/t;

    .line 1034
    .line 1035
    iget-object v8, v8, Lp4/t;->h:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v8, Lqd/j;

    .line 1038
    .line 1039
    invoke-virtual {v8}, Lqd/j;->w()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v8

    .line 1043
    if-nez v8, :cond_35

    .line 1044
    .line 1045
    invoke-virtual {v6}, Lqd/s;->i()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v8

    .line 1049
    if-eqz v8, :cond_36

    .line 1050
    .line 1051
    goto :goto_24

    .line 1052
    :cond_36
    iget-object v8, v6, Lqd/s;->k:Ljava/util/ArrayList;

    .line 1053
    .line 1054
    if-nez v8, :cond_37

    .line 1055
    .line 1056
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1057
    .line 1058
    :cond_37
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1059
    .line 1060
    .line 1061
    move-result v8

    .line 1062
    sget-object v9, Lpd/k;->g:Lpd/k;

    .line 1063
    .line 1064
    const/4 v10, 0x2

    .line 1065
    if-ge v8, v10, :cond_38

    .line 1066
    .line 1067
    goto :goto_25

    .line 1068
    :cond_38
    iget-object v8, v6, Lqd/s;->i:Lqd/r;

    .line 1069
    .line 1070
    invoke-virtual {v8}, Lqd/r;->f0()Lud/p;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v8

    .line 1074
    invoke-static {v8, v9}, Lxe/m;->a(Lud/p;Lpd/k;)Lud/p;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v8

    .line 1078
    if-nez v8, :cond_39

    .line 1079
    .line 1080
    goto :goto_25

    .line 1081
    :cond_39
    iget-object v11, v0, Lud/r;->z:Ljava/util/List;

    .line 1082
    .line 1083
    invoke-static {v0, v8, v11}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v11

    .line 1087
    if-nez v11, :cond_3f

    .line 1088
    .line 1089
    :goto_25
    iget-object v8, v6, Lqd/s;->i:Lqd/r;

    .line 1090
    .line 1091
    iget-object v6, v6, Lqd/s;->j:Ljava/util/ArrayList;

    .line 1092
    .line 1093
    invoke-virtual {v8}, Lqd/r;->f0()Lud/p;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v8

    .line 1097
    invoke-static {v8, v9}, Lxe/m;->j(Lud/p;Lpd/k;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v9

    .line 1101
    if-nez v9, :cond_3a

    .line 1102
    .line 1103
    goto :goto_24

    .line 1104
    :cond_3a
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1105
    .line 1106
    .line 1107
    move-result v9

    .line 1108
    if-ge v9, v10, :cond_3b

    .line 1109
    .line 1110
    goto :goto_24

    .line 1111
    :cond_3b
    iget-object v9, v0, Lud/r;->z:Ljava/util/List;

    .line 1112
    .line 1113
    invoke-static {v0, v8, v9}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v9

    .line 1117
    if-nez v9, :cond_3c

    .line 1118
    .line 1119
    goto :goto_24

    .line 1120
    :cond_3c
    sget-object v5, Lmd/a;->q:Lmd/a;

    .line 1121
    .line 1122
    invoke-virtual {v8, v5}, Lmd/e;->D(Lmd/a;)V

    .line 1123
    .line 1124
    .line 1125
    invoke-static {v9, v8}, La/a;->Y(Lud/a;Lud/p;)I

    .line 1126
    .line 1127
    .line 1128
    move-result v5

    .line 1129
    add-int/2addr v5, v7

    .line 1130
    new-instance v10, Ljava/util/ArrayList;

    .line 1131
    .line 1132
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1136
    .line 1137
    .line 1138
    move-result v6

    .line 1139
    const/4 v11, 0x0

    .line 1140
    :goto_26
    if-ge v11, v6, :cond_46

    .line 1141
    .line 1142
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v12

    .line 1146
    check-cast v12, Lqd/r;

    .line 1147
    .line 1148
    sget-object v13, Lmd/a;->r:Lmd/a;

    .line 1149
    .line 1150
    invoke-virtual {v12, v13}, Lmd/e;->D(Lmd/a;)V

    .line 1151
    .line 1152
    .line 1153
    if-nez v11, :cond_3d

    .line 1154
    .line 1155
    goto :goto_27

    .line 1156
    :cond_3d
    iget-object v13, v12, Lqd/l;->j:Lud/p;

    .line 1157
    .line 1158
    if-nez v13, :cond_3e

    .line 1159
    .line 1160
    goto :goto_27

    .line 1161
    :cond_3e
    invoke-virtual {v8, v0}, Lud/p;->Q(Lud/r;)Lud/p;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v14

    .line 1165
    iget-object v15, v9, Lud/a;->l:Ljava/util/ArrayList;

    .line 1166
    .line 1167
    invoke-virtual {v15, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1168
    .line 1169
    .line 1170
    iget-object v14, v14, Lud/p;->l:Lqd/r;

    .line 1171
    .line 1172
    invoke-virtual {v14}, Lqd/r;->c0()Lqd/r;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v14

    .line 1176
    invoke-virtual {v13, v12, v14}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 1177
    .line 1178
    .line 1179
    :goto_27
    add-int/lit8 v11, v11, 0x1

    .line 1180
    .line 1181
    goto :goto_26

    .line 1182
    :cond_3f
    iget-object v5, v6, Lqd/s;->k:Ljava/util/ArrayList;

    .line 1183
    .line 1184
    if-nez v5, :cond_40

    .line 1185
    .line 1186
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1187
    .line 1188
    :cond_40
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v5

    .line 1192
    move v9, v7

    .line 1193
    :goto_28
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1194
    .line 1195
    .line 1196
    move-result v10

    .line 1197
    if-eqz v10, :cond_46

    .line 1198
    .line 1199
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v10

    .line 1203
    check-cast v10, Lpd/q;

    .line 1204
    .line 1205
    if-eqz v9, :cond_41

    .line 1206
    .line 1207
    const/4 v9, 0x0

    .line 1208
    goto :goto_28

    .line 1209
    :cond_41
    invoke-virtual {v8, v0}, Lud/p;->Q(Lud/r;)Lud/p;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v12

    .line 1213
    sget-object v13, Lmd/a;->m:Lmd/a;

    .line 1214
    .line 1215
    invoke-virtual {v12, v13}, Lmd/e;->w(Lmd/a;)V

    .line 1216
    .line 1217
    .line 1218
    invoke-static {v11, v8}, La/a;->Y(Lud/a;Lud/p;)I

    .line 1219
    .line 1220
    .line 1221
    move-result v13

    .line 1222
    const/4 v14, -0x1

    .line 1223
    if-ne v13, v14, :cond_42

    .line 1224
    .line 1225
    goto :goto_29

    .line 1226
    :cond_42
    iget-object v14, v11, Lud/a;->l:Ljava/util/ArrayList;

    .line 1227
    .line 1228
    add-int/lit8 v13, v13, 0x1

    .line 1229
    .line 1230
    invoke-virtual {v14, v13, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    :goto_29
    iget-object v13, v10, Lud/p;->m:Ljava/util/List;

    .line 1234
    .line 1235
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1236
    .line 1237
    .line 1238
    move-result v14

    .line 1239
    const/4 v15, 0x0

    .line 1240
    if-nez v14, :cond_43

    .line 1241
    .line 1242
    goto :goto_2a

    .line 1243
    :cond_43
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v13

    .line 1247
    :cond_44
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v14

    .line 1251
    if-eqz v14, :cond_45

    .line 1252
    .line 1253
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v14

    .line 1257
    check-cast v14, Lqd/l;

    .line 1258
    .line 1259
    check-cast v14, Lqd/r;

    .line 1260
    .line 1261
    iget-object v4, v14, Lqd/r;->m:Lqd/s;

    .line 1262
    .line 1263
    if-ne v4, v6, :cond_44

    .line 1264
    .line 1265
    move-object v15, v14

    .line 1266
    :cond_45
    :goto_2a
    iget-object v4, v12, Lud/p;->l:Lqd/r;

    .line 1267
    .line 1268
    invoke-virtual {v4}, Lqd/r;->c0()Lqd/r;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v4

    .line 1272
    invoke-virtual {v10, v15, v4}, Lpd/q;->b0(Lqd/l;Lqd/l;)Z

    .line 1273
    .line 1274
    .line 1275
    goto :goto_28

    .line 1276
    :cond_46
    move v5, v7

    .line 1277
    goto/16 :goto_24

    .line 1278
    .line 1279
    :cond_47
    if-nez v5, :cond_48

    .line 1280
    .line 1281
    const/4 v4, 0x0

    .line 1282
    goto :goto_2b

    .line 1283
    :cond_48
    invoke-static {v0}, Lbe/b;->W(Lud/r;)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v2, v0}, Lqe/n;->l(Lud/r;)V

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v2, v0}, Lqe/n;->m(Lud/r;)V

    .line 1290
    .line 1291
    .line 1292
    move v4, v7

    .line 1293
    :goto_2b
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    return-object v0

    .line 1298
    :pswitch_4
    iget-object v0, v1, Lqe/b;->b:Lqe/c;

    .line 1299
    .line 1300
    move-object/from16 v2, p1

    .line 1301
    .line 1302
    check-cast v2, Lud/r;

    .line 1303
    .line 1304
    invoke-virtual {v0, v2}, Lqe/c;->p(Lud/r;)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v0

    .line 1308
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    return-object v0

    .line 1313
    :pswitch_5
    move-object/from16 v0, p1

    .line 1314
    .line 1315
    check-cast v0, Lud/r;

    .line 1316
    .line 1317
    iget-object v2, v1, Lqe/b;->b:Lqe/c;

    .line 1318
    .line 1319
    iget-object v2, v2, Lqe/c;->g:Lqe/n;

    .line 1320
    .line 1321
    iget-object v3, v0, Lud/r;->D:Ljava/util/List;

    .line 1322
    .line 1323
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1324
    .line 1325
    .line 1326
    move-result v4

    .line 1327
    const/4 v6, 0x0

    .line 1328
    const/4 v7, 0x0

    .line 1329
    :goto_2c
    const/4 v8, 0x1

    .line 1330
    if-ge v6, v4, :cond_55

    .line 1331
    .line 1332
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v9

    .line 1336
    check-cast v9, Lqd/s;

    .line 1337
    .line 1338
    iget-object v10, v9, Lqd/s;->l:Lp4/t;

    .line 1339
    .line 1340
    iget-object v11, v10, Lp4/t;->h:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v11, Lqd/j;

    .line 1343
    .line 1344
    invoke-virtual {v11}, Lqd/j;->w()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v11

    .line 1348
    if-nez v11, :cond_54

    .line 1349
    .line 1350
    invoke-virtual {v9}, Lqd/s;->i()Z

    .line 1351
    .line 1352
    .line 1353
    move-result v11

    .line 1354
    if-nez v11, :cond_54

    .line 1355
    .line 1356
    iget-object v11, v10, Lp4/t;->i:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v11, Ljava/util/LinkedHashSet;

    .line 1359
    .line 1360
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v11

    .line 1364
    :cond_49
    :goto_2d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v12

    .line 1368
    if-eqz v12, :cond_50

    .line 1369
    .line 1370
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v12

    .line 1374
    check-cast v12, Lqe/d;

    .line 1375
    .line 1376
    invoke-interface {v12}, Lqe/d;->getType()Lqd/j;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v12

    .line 1380
    invoke-virtual {v12}, Lqd/j;->w()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v13

    .line 1384
    if-eqz v13, :cond_49

    .line 1385
    .line 1386
    iget-object v13, v10, Lp4/t;->h:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v13, Lqd/j;

    .line 1389
    .line 1390
    invoke-virtual {v12, v13}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 1391
    .line 1392
    .line 1393
    move-result v13

    .line 1394
    if-nez v13, :cond_49

    .line 1395
    .line 1396
    invoke-virtual {v12}, Lqd/j;->c()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v13

    .line 1400
    if-eqz v13, :cond_49

    .line 1401
    .line 1402
    iget-object v13, v0, Lud/r;->l:Lud/e;

    .line 1403
    .line 1404
    iget-object v13, v13, Lud/e;->k:Lud/u;

    .line 1405
    .line 1406
    iget-object v13, v13, Lud/u;->i:Lfe/a;

    .line 1407
    .line 1408
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    invoke-static {v0}, Lfe/a;->e(Lud/r;)Ljava/util/Set;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v13

    .line 1415
    new-instance v14, Lqe/w;

    .line 1416
    .line 1417
    const/4 v15, 0x1

    .line 1418
    invoke-direct {v14, v13, v15}, Lqe/w;-><init>(Ljava/util/Set;I)V

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v12, v14}, Lqd/j;->C(Ljava/util/function/Function;)Ljava/lang/Object;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v13

    .line 1425
    check-cast v13, Lqd/j;

    .line 1426
    .line 1427
    if-eqz v13, :cond_4a

    .line 1428
    .line 1429
    goto :goto_2d

    .line 1430
    :cond_4a
    iget-object v10, v9, Lqd/s;->i:Lqd/r;

    .line 1431
    .line 1432
    iget-object v11, v10, Lqd/l;->j:Lud/p;

    .line 1433
    .line 1434
    if-eqz v11, :cond_4c

    .line 1435
    .line 1436
    iget-object v14, v11, Lud/p;->k:Lpd/k;

    .line 1437
    .line 1438
    sget-object v15, Lpd/k;->X:Lpd/k;

    .line 1439
    .line 1440
    if-ne v14, v15, :cond_4b

    .line 1441
    .line 1442
    goto :goto_2e

    .line 1443
    :cond_4b
    iget-object v14, v0, Lud/r;->z:Ljava/util/List;

    .line 1444
    .line 1445
    invoke-static {v0, v11, v14}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v14

    .line 1449
    if-nez v14, :cond_4d

    .line 1450
    .line 1451
    :cond_4c
    :goto_2e
    const/4 v13, 0x0

    .line 1452
    goto :goto_2f

    .line 1453
    :cond_4d
    invoke-virtual {v10, v0}, Lqd/r;->e0(Lud/r;)Lqd/r;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v15

    .line 1457
    invoke-virtual {v11, v15}, Lud/p;->d0(Lqd/r;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v10}, Lqd/r;->c0()Lqd/r;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v10

    .line 1464
    iget-object v15, v11, Lud/p;->l:Lqd/r;

    .line 1465
    .line 1466
    invoke-virtual {v15}, Lqd/r;->c0()Lqd/r;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v15

    .line 1470
    new-instance v5, Lpd/j;

    .line 1471
    .line 1472
    sget-object v13, Lpd/k;->A:Lpd/k;

    .line 1473
    .line 1474
    invoke-direct {v5, v13, v12, v8}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v5, v10}, Lud/p;->d0(Lqd/r;)V

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v5, v15}, Lud/p;->I(Lqd/l;)V

    .line 1481
    .line 1482
    .line 1483
    sget-object v10, Lmd/a;->m:Lmd/a;

    .line 1484
    .line 1485
    invoke-virtual {v5, v10}, Lmd/e;->w(Lmd/a;)V

    .line 1486
    .line 1487
    .line 1488
    invoke-static {v14, v11}, La/a;->Y(Lud/a;Lud/p;)I

    .line 1489
    .line 1490
    .line 1491
    move-result v10

    .line 1492
    const/4 v11, -0x1

    .line 1493
    if-ne v10, v11, :cond_4e

    .line 1494
    .line 1495
    goto :goto_2e

    .line 1496
    :cond_4e
    iget-object v11, v14, Lud/a;->l:Ljava/util/ArrayList;

    .line 1497
    .line 1498
    add-int/lit8 v10, v10, 0x1

    .line 1499
    .line 1500
    invoke-virtual {v11, v10, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1501
    .line 1502
    .line 1503
    move-object v13, v5

    .line 1504
    :goto_2f
    sget-object v5, Lmd/a;->Y:Lmd/a;

    .line 1505
    .line 1506
    if-eqz v13, :cond_4f

    .line 1507
    .line 1508
    invoke-virtual {v13, v5}, Lmd/e;->w(Lmd/a;)V

    .line 1509
    .line 1510
    .line 1511
    goto :goto_31

    .line 1512
    :cond_4f
    iget-object v8, v9, Lqd/s;->j:Ljava/util/ArrayList;

    .line 1513
    .line 1514
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1515
    .line 1516
    .line 1517
    move-result v9

    .line 1518
    if-eqz v9, :cond_51

    .line 1519
    .line 1520
    :cond_50
    const/4 v8, 0x0

    .line 1521
    goto :goto_31

    .line 1522
    :cond_51
    new-instance v9, Ljava/util/ArrayList;

    .line 1523
    .line 1524
    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v8

    .line 1531
    const/4 v9, 0x0

    .line 1532
    :cond_52
    :goto_30
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v10

    .line 1536
    if-eqz v10, :cond_53

    .line 1537
    .line 1538
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v10

    .line 1542
    check-cast v10, Lqd/r;

    .line 1543
    .line 1544
    iget-object v11, v10, Lqd/l;->i:Lqd/j;

    .line 1545
    .line 1546
    invoke-static {v0, v10, v11}, Lqe/c;->m(Lud/r;Lqd/r;Lqd/j;)Lpd/j;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v10

    .line 1550
    if-eqz v10, :cond_52

    .line 1551
    .line 1552
    invoke-virtual {v10, v5}, Lmd/e;->w(Lmd/a;)V

    .line 1553
    .line 1554
    .line 1555
    add-int/lit8 v9, v9, 0x1

    .line 1556
    .line 1557
    goto :goto_30

    .line 1558
    :cond_53
    move v8, v9

    .line 1559
    :goto_31
    add-int/2addr v7, v8

    .line 1560
    :cond_54
    add-int/lit8 v6, v6, 0x1

    .line 1561
    .line 1562
    goto/16 :goto_2c

    .line 1563
    .line 1564
    :cond_55
    if-eqz v7, :cond_56

    .line 1565
    .line 1566
    invoke-static {v0}, Lbe/b;->W(Lud/r;)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v2, v0}, Lqe/n;->l(Lud/r;)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v2, v0}, Lqe/n;->m(Lud/r;)V

    .line 1573
    .line 1574
    .line 1575
    move v5, v8

    .line 1576
    goto :goto_32

    .line 1577
    :cond_56
    const/4 v5, 0x0

    .line 1578
    :goto_32
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    return-object v0

    .line 1583
    :pswitch_6
    move-object/from16 v0, p1

    .line 1584
    .line 1585
    check-cast v0, Lud/r;

    .line 1586
    .line 1587
    iget-object v2, v1, Lqe/b;->b:Lqe/c;

    .line 1588
    .line 1589
    iget-object v3, v2, Lqe/c;->g:Lqe/n;

    .line 1590
    .line 1591
    iget-object v4, v0, Lud/r;->D:Ljava/util/List;

    .line 1592
    .line 1593
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v4

    .line 1597
    const/4 v5, 0x0

    .line 1598
    move v6, v5

    .line 1599
    :goto_33
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1600
    .line 1601
    .line 1602
    move-result v7

    .line 1603
    const/4 v8, 0x1

    .line 1604
    if-eqz v7, :cond_5e

    .line 1605
    .line 1606
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v7

    .line 1610
    check-cast v7, Lqd/s;

    .line 1611
    .line 1612
    iget-object v7, v7, Lqd/s;->l:Lp4/t;

    .line 1613
    .line 1614
    iget-object v7, v7, Lp4/t;->i:Ljava/lang/Object;

    .line 1615
    .line 1616
    check-cast v7, Ljava/util/LinkedHashSet;

    .line 1617
    .line 1618
    new-instance v9, Lce/n;

    .line 1619
    .line 1620
    const/16 v10, 0x15

    .line 1621
    .line 1622
    invoke-direct {v9, v10}, Lce/n;-><init>(I)V

    .line 1623
    .line 1624
    .line 1625
    invoke-static {v7, v9}, Lbe/h;->k(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 1626
    .line 1627
    .line 1628
    move-result v9

    .line 1629
    if-nez v9, :cond_57

    .line 1630
    .line 1631
    :goto_34
    move v10, v5

    .line 1632
    goto :goto_36

    .line 1633
    :cond_57
    new-instance v9, Lce/n;

    .line 1634
    .line 1635
    const/16 v10, 0x16

    .line 1636
    .line 1637
    invoke-direct {v9, v10}, Lce/n;-><init>(I)V

    .line 1638
    .line 1639
    .line 1640
    invoke-static {v7, v9}, Lbe/h;->v(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v9

    .line 1644
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1645
    .line 1646
    .line 1647
    move-result v10

    .line 1648
    if-eqz v10, :cond_58

    .line 1649
    .line 1650
    goto :goto_34

    .line 1651
    :cond_58
    invoke-virtual {v2, v7}, Lqe/c;->o(Ljava/util/LinkedHashSet;)Ljava/util/Optional;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v7

    .line 1655
    sget-object v10, Lqd/j;->u:Lqd/h;

    .line 1656
    .line 1657
    invoke-virtual {v7, v10}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v7

    .line 1661
    check-cast v7, Lqd/j;

    .line 1662
    .line 1663
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    instance-of v10, v7, Lqd/c;

    .line 1667
    .line 1668
    if-nez v10, :cond_59

    .line 1669
    .line 1670
    goto :goto_34

    .line 1671
    :cond_59
    invoke-virtual {v7}, Lqd/j;->i()Ljava/util/List;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v10

    .line 1675
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1676
    .line 1677
    .line 1678
    move-result v11

    .line 1679
    if-eq v11, v8, :cond_5a

    .line 1680
    .line 1681
    goto :goto_34

    .line 1682
    :cond_5a
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v8

    .line 1686
    check-cast v8, Lqd/j;

    .line 1687
    .line 1688
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v9

    .line 1692
    move v10, v5

    .line 1693
    :cond_5b
    :goto_35
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1694
    .line 1695
    .line 1696
    move-result v11

    .line 1697
    if-eqz v11, :cond_5d

    .line 1698
    .line 1699
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v11

    .line 1703
    check-cast v11, Lqe/d;

    .line 1704
    .line 1705
    check-cast v11, Lqe/f;

    .line 1706
    .line 1707
    invoke-virtual {v11}, Lqe/f;->getType()Lqd/j;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v12

    .line 1711
    iget-object v13, v2, Lqe/c;->h:Lqe/x;

    .line 1712
    .line 1713
    iget-object v13, v13, Lqe/x;->c:Lqe/k;

    .line 1714
    .line 1715
    invoke-virtual {v13, v8, v12}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v12

    .line 1719
    invoke-virtual {v12}, Lqe/l;->b()Z

    .line 1720
    .line 1721
    .line 1722
    move-result v13

    .line 1723
    if-nez v13, :cond_5c

    .line 1724
    .line 1725
    sget-object v13, Lqe/l;->i:Lqe/l;

    .line 1726
    .line 1727
    if-ne v12, v13, :cond_5b

    .line 1728
    .line 1729
    :cond_5c
    iget-object v11, v11, Lqe/f;->b:Lpd/j;

    .line 1730
    .line 1731
    iput-object v7, v11, Lpd/j;->o:Ljava/lang/Object;

    .line 1732
    .line 1733
    add-int/lit8 v10, v10, 0x1

    .line 1734
    .line 1735
    goto :goto_35

    .line 1736
    :cond_5d
    :goto_36
    add-int/2addr v6, v10

    .line 1737
    goto/16 :goto_33

    .line 1738
    .line 1739
    :cond_5e
    if-nez v6, :cond_5f

    .line 1740
    .line 1741
    goto :goto_37

    .line 1742
    :cond_5f
    invoke-virtual {v3, v0}, Lqe/n;->l(Lud/r;)V

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {v3, v0}, Lqe/n;->m(Lud/r;)V

    .line 1746
    .line 1747
    .line 1748
    move v5, v8

    .line 1749
    :goto_37
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    return-object v0

    .line 1754
    :pswitch_7
    move-object/from16 v2, p1

    .line 1755
    .line 1756
    check-cast v2, Lud/r;

    .line 1757
    .line 1758
    iget-object v0, v1, Lqe/b;->b:Lqe/c;

    .line 1759
    .line 1760
    iget-object v0, v0, Lqe/c;->g:Lqe/n;

    .line 1761
    .line 1762
    :try_start_0
    iget-object v3, v2, Lud/r;->D:Ljava/util/List;

    .line 1763
    .line 1764
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1765
    .line 1766
    .line 1767
    move-result v4

    .line 1768
    const/4 v5, 0x0

    .line 1769
    move v6, v5

    .line 1770
    move v7, v6

    .line 1771
    :goto_38
    const/4 v8, 0x1

    .line 1772
    if-ge v6, v4, :cond_61

    .line 1773
    .line 1774
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v9

    .line 1778
    check-cast v9, Lqd/s;

    .line 1779
    .line 1780
    invoke-static {v2, v9, v8}, Lqe/c;->q(Lud/r;Lqd/s;Z)Z

    .line 1781
    .line 1782
    .line 1783
    move-result v9

    .line 1784
    if-eqz v9, :cond_60

    .line 1785
    .line 1786
    move v7, v8

    .line 1787
    :cond_60
    add-int/lit8 v6, v6, 0x1

    .line 1788
    .line 1789
    goto :goto_38

    .line 1790
    :catch_0
    move-exception v0

    .line 1791
    goto :goto_3a

    .line 1792
    :cond_61
    if-nez v7, :cond_62

    .line 1793
    .line 1794
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1795
    .line 1796
    goto :goto_3b

    .line 1797
    :cond_62
    invoke-static {v2}, Lbe/b;->W(Lud/r;)V

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v0, v2}, Lqe/n;->l(Lud/r;)V

    .line 1801
    .line 1802
    .line 1803
    invoke-virtual {v0, v2}, Lqe/n;->m(Lud/r;)V

    .line 1804
    .line 1805
    .line 1806
    iget-object v3, v2, Lud/r;->D:Ljava/util/List;

    .line 1807
    .line 1808
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v3

    .line 1812
    :cond_63
    :goto_39
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1813
    .line 1814
    .line 1815
    move-result v4

    .line 1816
    if-eqz v4, :cond_64

    .line 1817
    .line 1818
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v4

    .line 1822
    check-cast v4, Lqd/s;

    .line 1823
    .line 1824
    invoke-static {v2, v4, v5}, Lqe/c;->q(Lud/r;Lqd/s;Z)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v4

    .line 1828
    if-eqz v4, :cond_63

    .line 1829
    .line 1830
    move v8, v5

    .line 1831
    goto :goto_39

    .line 1832
    :cond_64
    if-nez v8, :cond_65

    .line 1833
    .line 1834
    invoke-virtual {v0, v2}, Lqe/n;->l(Lud/r;)V

    .line 1835
    .line 1836
    .line 1837
    invoke-virtual {v0, v2}, Lqe/n;->m(Lud/r;)V

    .line 1838
    .line 1839
    .line 1840
    const-string v0, "Type inference incomplete: some casts might be missing"

    .line 1841
    .line 1842
    invoke-virtual {v2, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 1843
    .line 1844
    .line 1845
    :cond_65
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1849
    goto :goto_3b

    .line 1850
    :goto_3a
    const-string v3, "Type inference fix \'apply assigned field type\' failed"

    .line 1851
    .line 1852
    invoke-virtual {v2, v3, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1853
    .line 1854
    .line 1855
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1856
    .line 1857
    :goto_3b
    return-object v0

    .line 1858
    nop

    .line 1859
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
