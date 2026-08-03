.class public final synthetic Lwb/zi;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/zi;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/zi;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/zi;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 11
    iput p4, p0, Lwb/zi;->g:I

    iput-object p1, p0, Lwb/zi;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/zi;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/zi;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lfg/a;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ls0/d;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    check-cast v3, Li0/h0;

    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    check-cast v4, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    and-int/lit8 v5, v4, 0x3

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    const/4 v7, 0x1

    .line 32
    if-eq v5, v6, :cond_0

    .line 33
    .line 34
    move v5, v7

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v5, 0x0

    .line 37
    :goto_0
    and-int/2addr v4, v7

    .line 38
    invoke-virtual {v3, v4, v5}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    sget-object v4, Lbi/g;->a:Li0/m2;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-nez v5, :cond_1

    .line 55
    .line 56
    sget-object v5, Li0/l;->a:Li0/e;

    .line 57
    .line 58
    if-ne v6, v5, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v6, Lxh/f;

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-direct {v6, v1, v5}, Lxh/f;-><init>(Lfg/a;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    check-cast v6, Lfg/a;

    .line 70
    .line 71
    invoke-virtual {v4, v6}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v4, Lbi/i;

    .line 76
    .line 77
    const/4 v5, 0x4

    .line 78
    invoke-direct {v4, v2, v5}, Lbi/i;-><init>(Ls0/d;I)V

    .line 79
    .line 80
    .line 81
    const v2, 0x4c7ba3d

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v4, v3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/16 v4, 0x38

    .line 89
    .line 90
    invoke-static {v1, v2, v3, v4}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 98
    .line 99
    return-object v1

    .line 100
    :pswitch_0
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lxb/i;

    .line 103
    .line 104
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Ls1/x;

    .line 107
    .line 108
    move-object/from16 v3, p1

    .line 109
    .line 110
    check-cast v3, Ls1/t;

    .line 111
    .line 112
    move-object/from16 v4, p2

    .line 113
    .line 114
    check-cast v4, Le1/b;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-wide v5, v3, Ls1/t;->c:J

    .line 120
    .line 121
    iget-wide v7, v3, Ls1/t;->g:J

    .line 122
    .line 123
    iget-object v3, v1, Lxb/i;->c:Lc9/u;

    .line 124
    .line 125
    new-instance v9, Le1/b;

    .line 126
    .line 127
    invoke-direct {v9, v5, v6}, Le1/b;-><init>(J)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v9}, Lc9/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    new-instance v6, Le1/b;

    .line 141
    .line 142
    invoke-direct {v6, v7, v8}, Le1/b;-><init>(J)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v6}, Lc9/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v5, :cond_4

    .line 156
    .line 157
    if-eqz v3, :cond_4

    .line 158
    .line 159
    iget-object v3, v1, Lxb/i;->e:Lwb/k3;

    .line 160
    .line 161
    check-cast v2, Ls1/l0;

    .line 162
    .line 163
    iget-wide v5, v2, Ls1/l0;->E:J

    .line 164
    .line 165
    new-instance v2, Lu2/l;

    .line 166
    .line 167
    invoke-direct {v2, v5, v6}, Lu2/l;-><init>(J)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v1, v2, v4}, Lwb/k3;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 174
    .line 175
    return-object v1

    .line 176
    :pswitch_1
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, Ls0/d;

    .line 179
    .line 180
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, Lwb/n7;

    .line 183
    .line 184
    move-object/from16 v3, p1

    .line 185
    .line 186
    check-cast v3, Li0/h0;

    .line 187
    .line 188
    move-object/from16 v4, p2

    .line 189
    .line 190
    check-cast v4, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    and-int/lit8 v5, v4, 0x3

    .line 197
    .line 198
    const/4 v6, 0x2

    .line 199
    const/4 v7, 0x0

    .line 200
    const/4 v8, 0x1

    .line 201
    if-eq v5, v6, :cond_5

    .line 202
    .line 203
    move v5, v8

    .line 204
    goto :goto_2

    .line 205
    :cond_5
    move v5, v7

    .line 206
    :goto_2
    and-int/2addr v4, v8

    .line 207
    invoke-virtual {v3, v4, v5}, Li0/h0;->S(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_6

    .line 212
    .line 213
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v1, v2, v3, v4}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_6
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 222
    .line 223
    .line 224
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 225
    .line 226
    return-object v1

    .line 227
    :pswitch_2
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v1, Lwb/y2;

    .line 230
    .line 231
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, Ljava/lang/String;

    .line 234
    .line 235
    move-object/from16 v3, p1

    .line 236
    .line 237
    check-cast v3, Li0/h0;

    .line 238
    .line 239
    move-object/from16 v4, p2

    .line 240
    .line 241
    check-cast v4, Ljava/lang/Integer;

    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    const/16 v4, 0x31

    .line 247
    .line 248
    invoke-static {v4}, Li0/r;->C(I)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    invoke-virtual {v1, v2, v3, v4}, Lwb/y2;->V(Ljava/lang/String;Li0/h0;I)V

    .line 253
    .line 254
    .line 255
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 256
    .line 257
    return-object v1

    .line 258
    :pswitch_3
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v1, Lwb/y2;

    .line 261
    .line 262
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v2, Ly0/o;

    .line 265
    .line 266
    move-object/from16 v3, p1

    .line 267
    .line 268
    check-cast v3, Li0/h0;

    .line 269
    .line 270
    move-object/from16 v4, p2

    .line 271
    .line 272
    check-cast v4, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    const/16 v4, 0x37

    .line 278
    .line 279
    invoke-static {v4}, Li0/r;->C(I)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    invoke-virtual {v1, v2, v3, v4}, Lwb/y2;->t0(Ly0/o;Li0/h0;I)V

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :pswitch_4
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v1, Li0/a1;

    .line 290
    .line 291
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v2, Lx8/r;

    .line 294
    .line 295
    move-object/from16 v3, p1

    .line 296
    .line 297
    check-cast v3, Lx8/b;

    .line 298
    .line 299
    move-object/from16 v4, p2

    .line 300
    .line 301
    check-cast v4, Ljava/lang/Boolean;

    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    check-cast v4, Ljava/util/List;

    .line 315
    .line 316
    new-instance v5, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-eqz v6, :cond_8

    .line 334
    .line 335
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    check-cast v6, Lx8/b;

    .line 340
    .line 341
    iget-object v8, v6, Lx8/b;->a:Ljava/lang/String;

    .line 342
    .line 343
    iget-object v9, v3, Lx8/b;->a:Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v8

    .line 349
    if-eqz v8, :cond_7

    .line 350
    .line 351
    const/16 v24, 0x0

    .line 352
    .line 353
    const v25, 0x7fffb

    .line 354
    .line 355
    .line 356
    move-object v8, v5

    .line 357
    move-object v5, v6

    .line 358
    const/4 v6, 0x0

    .line 359
    move-object v9, v8

    .line 360
    const/4 v8, 0x0

    .line 361
    move-object v10, v9

    .line 362
    const/4 v9, 0x0

    .line 363
    move-object v11, v10

    .line 364
    const/4 v10, 0x0

    .line 365
    move-object v12, v11

    .line 366
    const/4 v11, 0x0

    .line 367
    move-object v13, v12

    .line 368
    const/4 v12, 0x0

    .line 369
    move-object v14, v13

    .line 370
    const/4 v13, 0x0

    .line 371
    move-object v15, v14

    .line 372
    const/4 v14, 0x0

    .line 373
    move-object/from16 v16, v15

    .line 374
    .line 375
    const/4 v15, 0x0

    .line 376
    move-object/from16 v17, v16

    .line 377
    .line 378
    const/16 v16, 0x0

    .line 379
    .line 380
    move-object/from16 v18, v17

    .line 381
    .line 382
    const/16 v17, 0x0

    .line 383
    .line 384
    move-object/from16 v19, v18

    .line 385
    .line 386
    const/16 v18, 0x0

    .line 387
    .line 388
    move-object/from16 v20, v19

    .line 389
    .line 390
    const/16 v19, 0x0

    .line 391
    .line 392
    move-object/from16 v21, v20

    .line 393
    .line 394
    const/16 v20, 0x0

    .line 395
    .line 396
    move-object/from16 v23, v21

    .line 397
    .line 398
    const-wide/16 v21, 0x0

    .line 399
    .line 400
    move-object/from16 v26, v23

    .line 401
    .line 402
    const/16 v23, 0x0

    .line 403
    .line 404
    move-object/from16 p1, v3

    .line 405
    .line 406
    move-object/from16 v3, v26

    .line 407
    .line 408
    invoke-static/range {v5 .. v25}, Lx8/b;->a(Lx8/b;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;I)Lx8/b;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    goto :goto_6

    .line 413
    :cond_7
    move-object/from16 p1, v3

    .line 414
    .line 415
    move-object v3, v5

    .line 416
    move-object v5, v6

    .line 417
    :goto_6
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-object v5, v3

    .line 421
    move-object/from16 v3, p1

    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_8
    move-object v3, v5

    .line 425
    invoke-static {v2, v1, v3}, Lwb/ho;->B(Lx8/r;Li0/a1;Ljava/util/ArrayList;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_4

    .line 429
    .line 430
    :pswitch_5
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v1, Landroid/content/Context;

    .line 433
    .line 434
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v2, Ls0/d;

    .line 437
    .line 438
    move-object/from16 v3, p1

    .line 439
    .line 440
    check-cast v3, Li0/h0;

    .line 441
    .line 442
    move-object/from16 v4, p2

    .line 443
    .line 444
    check-cast v4, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    const/16 v4, 0x31

    .line 450
    .line 451
    invoke-static {v4}, Li0/r;->C(I)I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    invoke-static {v1, v2, v3, v4}, Lwb/ho;->x1(Landroid/content/Context;Ls0/d;Li0/h0;I)V

    .line 456
    .line 457
    .line 458
    goto/16 :goto_4

    .line 459
    .line 460
    :pswitch_6
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v1, Lj8/i;

    .line 463
    .line 464
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v2, Lfg/l;

    .line 467
    .line 468
    move-object/from16 v3, p1

    .line 469
    .line 470
    check-cast v3, Li0/h0;

    .line 471
    .line 472
    move-object/from16 v4, p2

    .line 473
    .line 474
    check-cast v4, Ljava/lang/Integer;

    .line 475
    .line 476
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    const/16 v4, 0x9

    .line 480
    .line 481
    invoke-static {v4}, Li0/r;->C(I)I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    invoke-static {v1, v2, v3, v4}, Lwb/ho;->C0(Lj8/i;Lfg/l;Li0/h0;I)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_4

    .line 489
    .line 490
    :pswitch_7
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v1, Lwb/t0;

    .line 493
    .line 494
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v2, Lfg/l;

    .line 497
    .line 498
    move-object/from16 v3, p1

    .line 499
    .line 500
    check-cast v3, Li0/h0;

    .line 501
    .line 502
    move-object/from16 v4, p2

    .line 503
    .line 504
    check-cast v4, Ljava/lang/Integer;

    .line 505
    .line 506
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    const/4 v4, 0x1

    .line 510
    invoke-static {v4}, Li0/r;->C(I)I

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    invoke-static {v1, v2, v3, v4}, Lwb/ho;->Z0(Lwb/t0;Lfg/l;Li0/h0;I)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_4

    .line 518
    .line 519
    :pswitch_8
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v1, Ljava/util/Set;

    .line 522
    .line 523
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v2, Lfg/l;

    .line 526
    .line 527
    move-object/from16 v3, p1

    .line 528
    .line 529
    check-cast v3, Li0/h0;

    .line 530
    .line 531
    move-object/from16 v4, p2

    .line 532
    .line 533
    check-cast v4, Ljava/lang/Integer;

    .line 534
    .line 535
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    const/4 v4, 0x1

    .line 539
    invoke-static {v4}, Li0/r;->C(I)I

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    invoke-static {v1, v2, v3, v4}, Lwb/ho;->o3(Ljava/util/Set;Lfg/l;Li0/h0;I)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_4

    .line 547
    .line 548
    :pswitch_9
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v1, Lwb/t5;

    .line 551
    .line 552
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v2, Lfg/a;

    .line 555
    .line 556
    move-object/from16 v3, p1

    .line 557
    .line 558
    check-cast v3, Li0/h0;

    .line 559
    .line 560
    move-object/from16 v4, p2

    .line 561
    .line 562
    check-cast v4, Ljava/lang/Integer;

    .line 563
    .line 564
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    const/4 v4, 0x1

    .line 568
    invoke-static {v4}, Li0/r;->C(I)I

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    invoke-static {v1, v2, v3, v4}, Lwb/ho;->Z1(Lwb/t5;Lfg/a;Li0/h0;I)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_4

    .line 576
    .line 577
    :pswitch_a
    iget-object v1, v0, Lwb/zi;->h:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v1, Lwb/a3;

    .line 580
    .line 581
    iget-object v2, v0, Lwb/zi;->i:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v2, Lfg/l;

    .line 584
    .line 585
    move-object/from16 v3, p1

    .line 586
    .line 587
    check-cast v3, Li0/h0;

    .line 588
    .line 589
    move-object/from16 v4, p2

    .line 590
    .line 591
    check-cast v4, Ljava/lang/Integer;

    .line 592
    .line 593
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    const/4 v4, 0x1

    .line 597
    invoke-static {v4}, Li0/r;->C(I)I

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    invoke-static {v1, v2, v3, v4}, Lwb/ho;->D0(Lwb/a3;Lfg/l;Li0/h0;I)V

    .line 602
    .line 603
    .line 604
    goto/16 :goto_4

    .line 605
    .line 606
    nop

    .line 607
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
