.class public final Lb1/f;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb1/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb1/f;->h:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lb1/f;->g:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "(this)"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    sget-object v8, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    iget-object v9, v1, Lb1/f;->h:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, Ln2/l;

    .line 21
    .line 22
    iget-object v2, v0, Ln2/l;->b:Lf0/v;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lf0/v;->closeConnection()V

    .line 27
    .line 28
    .line 29
    iput-object v6, v0, Ln2/l;->b:Lf0/v;

    .line 30
    .line 31
    :cond_0
    check-cast v9, Ly1/s1;

    .line 32
    .line 33
    iget-object v2, v9, Ly1/s1;->d:Lj0/b;

    .line 34
    .line 35
    iget-object v3, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 36
    .line 37
    iget v4, v2, Lj0/b;->i:I

    .line 38
    .line 39
    :goto_0
    if-ge v7, v4, :cond_2

    .line 40
    .line 41
    aget-object v5, v3, v7

    .line 42
    .line 43
    check-cast v5, Lx1/g2;

    .line 44
    .line 45
    invoke-static {v5, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v7, -0x1

    .line 56
    :goto_1
    if-ltz v7, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2, v7}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_3
    iget v0, v2, Lj0/b;->i:I

    .line 62
    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    iget-object v0, v9, Ly1/s1;->b:Ld1/c0;

    .line 66
    .line 67
    invoke-virtual {v0}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_4
    return-object v8

    .line 71
    :pswitch_0
    check-cast v0, Lh1/d;

    .line 72
    .line 73
    check-cast v9, Ly1/o1;

    .line 74
    .line 75
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Lb5/c;->p()Lf1/u;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object v3, v9, Ly1/o1;->j:Lfg/p;

    .line 84
    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Li1/b;

    .line 94
    .line 95
    invoke-interface {v3, v2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_5
    return-object v8

    .line 99
    :pswitch_1
    sget-object v0, Ly1/n1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 100
    .line 101
    invoke-virtual {v0, v7, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    check-cast v9, Lsg/c;

    .line 108
    .line 109
    invoke-interface {v9, v8}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    :cond_6
    return-object v8

    .line 113
    :pswitch_2
    check-cast v0, Li0/a0;

    .line 114
    .line 115
    check-cast v9, Ly1/k1;

    .line 116
    .line 117
    new-instance v0, Lb0/m;

    .line 118
    .line 119
    const/4 v2, 0x7

    .line 120
    invoke-direct {v0, v9, v2}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_3
    check-cast v0, Lf2/q;

    .line 125
    .line 126
    check-cast v9, Landroid/content/res/Resources;

    .line 127
    .line 128
    invoke-static {v0, v9}, Ly1/g0;->c(Lf2/q;Landroid/content/res/Resources;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0

    .line 137
    :pswitch_4
    check-cast v0, Lf2/q;

    .line 138
    .line 139
    check-cast v9, Lf/k;

    .line 140
    .line 141
    iget v0, v0, Lf2/q;->f:I

    .line 142
    .line 143
    invoke-virtual {v9, v0}, Lf/k;->a(I)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    :pswitch_5
    move-object v2, v9

    .line 153
    move-object v9, v0

    .line 154
    check-cast v9, Lx1/k0;

    .line 155
    .line 156
    move-object v0, v2

    .line 157
    check-cast v0, Ly1/k;

    .line 158
    .line 159
    iget-object v0, v0, Ly1/k;->v:Ly1/t;

    .line 160
    .line 161
    invoke-virtual {v0}, Ly1/t;->getInsetsListener()Lv1/n;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v2, v2, Lv1/n;->n:Li0/g1;

    .line 166
    .line 167
    invoke-virtual {v2}, Li0/g1;->g()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-lez v2, :cond_a

    .line 172
    .line 173
    sget-object v2, Lv1/q1;->a:Lf/w;

    .line 174
    .line 175
    iput-boolean v5, v9, Lx1/k0;->g:Z

    .line 176
    .line 177
    iget-object v2, v9, Lx1/k0;->j:Lx1/n0;

    .line 178
    .line 179
    invoke-virtual {v2}, Lx1/n0;->T0()Lv1/t;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iget-wide v4, v9, Lx1/k0;->h:J

    .line 184
    .line 185
    const-wide v10, 0x7fffffff7fffffffL

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    invoke-static {v4, v5, v10, v11}, Lu2/j;->b(JJ)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_7

    .line 195
    .line 196
    const-wide/16 v4, 0x0

    .line 197
    .line 198
    invoke-interface {v3, v4, v5}, Lv1/t;->P(J)J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    invoke-static {v4, v5}, Lig/a;->W(J)J

    .line 203
    .line 204
    .line 205
    move-result-wide v4

    .line 206
    iput-wide v4, v9, Lx1/k0;->h:J

    .line 207
    .line 208
    invoke-interface {v3}, Lv1/t;->F()J

    .line 209
    .line 210
    .line 211
    move-result-wide v4

    .line 212
    iput-wide v4, v9, Lx1/k0;->i:J

    .line 213
    .line 214
    :cond_7
    invoke-virtual {v2}, Lx1/n0;->Y0()Lx1/f0;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    iget-object v2, v2, Lx1/f0;->M:Lx1/j0;

    .line 219
    .line 220
    invoke-virtual {v2}, Lx1/j0;->b()V

    .line 221
    .line 222
    .line 223
    invoke-interface {v3}, Lv1/t;->F()J

    .line 224
    .line 225
    .line 226
    move-result-wide v2

    .line 227
    invoke-virtual {v0}, Ly1/t;->getInsetsListener()Lv1/n;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iget-object v4, v4, Lv1/n;->m:Lf/k0;

    .line 232
    .line 233
    const/16 v5, 0x20

    .line 234
    .line 235
    shr-long v5, v2, v5

    .line 236
    .line 237
    long-to-int v13, v5

    .line 238
    const-wide v5, 0xffffffffL

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    and-long/2addr v2, v5

    .line 244
    long-to-int v14, v2

    .line 245
    sget-object v2, Lv1/q1;->b:[Lv1/o1;

    .line 246
    .line 247
    array-length v3, v2

    .line 248
    move v5, v7

    .line 249
    :goto_2
    if-ge v5, v3, :cond_9

    .line 250
    .line 251
    aget-object v6, v2, v5

    .line 252
    .line 253
    invoke-virtual {v4, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-object v15, v10

    .line 261
    check-cast v15, Lv1/r1;

    .line 262
    .line 263
    check-cast v6, Lv1/p1;

    .line 264
    .line 265
    iget-object v10, v6, Lv1/p1;->c:Lv1/m;

    .line 266
    .line 267
    iget-wide v11, v15, Lv1/r1;->h:J

    .line 268
    .line 269
    invoke-static/range {v9 .. v14}, Lv1/q1;->a(Lx1/k0;Lv1/m;JII)V

    .line 270
    .line 271
    .line 272
    iget-object v10, v15, Lv1/r1;->b:Li0/j1;

    .line 273
    .line 274
    invoke-virtual {v10}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    check-cast v10, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    if-eqz v10, :cond_8

    .line 285
    .line 286
    iget-object v10, v15, Lv1/r1;->f:Lv1/m;

    .line 287
    .line 288
    iget-wide v11, v15, Lv1/r1;->j:J

    .line 289
    .line 290
    invoke-static/range {v9 .. v14}, Lv1/q1;->a(Lx1/k0;Lv1/m;JII)V

    .line 291
    .line 292
    .line 293
    iget-object v10, v15, Lv1/r1;->g:Lv1/m;

    .line 294
    .line 295
    iget-wide v11, v15, Lv1/r1;->k:J

    .line 296
    .line 297
    invoke-static/range {v9 .. v14}, Lv1/q1;->a(Lx1/k0;Lv1/m;JII)V

    .line 298
    .line 299
    .line 300
    :cond_8
    iget-object v10, v6, Lv1/p1;->d:Lv1/m;

    .line 301
    .line 302
    iget-wide v11, v15, Lv1/r1;->i:J

    .line 303
    .line 304
    invoke-static/range {v9 .. v14}, Lv1/q1;->a(Lx1/k0;Lv1/m;JII)V

    .line 305
    .line 306
    .line 307
    add-int/lit8 v5, v5, 0x1

    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_9
    invoke-virtual {v0}, Ly1/t;->getInsetsListener()Lv1/n;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    iget-object v2, v2, Lv1/n;->o:Lf/f0;

    .line 315
    .line 316
    invoke-virtual {v2}, Lf/f0;->i()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_a

    .line 321
    .line 322
    invoke-virtual {v0}, Ly1/t;->getInsetsListener()Lv1/n;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iget-object v0, v0, Lv1/n;->p:Lw0/p;

    .line 327
    .line 328
    iget-object v3, v2, Lf/f0;->a:[Ljava/lang/Object;

    .line 329
    .line 330
    iget v2, v2, Lf/f0;->b:I

    .line 331
    .line 332
    :goto_3
    if-ge v7, v2, :cond_a

    .line 333
    .line 334
    aget-object v4, v3, v7

    .line 335
    .line 336
    check-cast v4, Li0/a1;

    .line 337
    .line 338
    invoke-virtual {v0, v7}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Lv1/m;

    .line 343
    .line 344
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    check-cast v4, Landroid/graphics/Rect;

    .line 349
    .line 350
    invoke-virtual {v5}, Lv1/m;->b()Lv1/l;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    iget v10, v4, Landroid/graphics/Rect;->left:I

    .line 355
    .line 356
    int-to-float v10, v10

    .line 357
    invoke-virtual {v9, v6, v10}, Lx1/k0;->e(Lv1/l;F)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5}, Lv1/m;->d()Lv1/l;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    iget v10, v4, Landroid/graphics/Rect;->top:I

    .line 365
    .line 366
    int-to-float v10, v10

    .line 367
    invoke-virtual {v9, v6, v10}, Lx1/k0;->e(Lv1/l;F)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5}, Lv1/m;->c()Lv1/l;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    iget v10, v4, Landroid/graphics/Rect;->right:I

    .line 375
    .line 376
    int-to-float v10, v10

    .line 377
    invoke-virtual {v9, v6, v10}, Lx1/k0;->e(Lv1/l;F)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v5}, Lv1/m;->a()Lv1/l;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 385
    .line 386
    int-to-float v4, v4

    .line 387
    invoke-virtual {v9, v5, v4}, Lx1/k0;->e(Lv1/l;F)V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v7, v7, 0x1

    .line 391
    .line 392
    goto :goto_3

    .line 393
    :cond_a
    return-object v8

    .line 394
    :pswitch_6
    move-object v2, v9

    .line 395
    check-cast v0, Ld1/b0;

    .line 396
    .line 397
    move-object v9, v2

    .line 398
    check-cast v9, Ld1/f;

    .line 399
    .line 400
    iget v2, v9, Ld1/f;->a:I

    .line 401
    .line 402
    invoke-virtual {v0, v2}, Ld1/b0;->r1(I)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    return-object v0

    .line 411
    :pswitch_7
    move-object v2, v9

    .line 412
    check-cast v0, Le1/c;

    .line 413
    .line 414
    move-object v9, v2

    .line 415
    check-cast v9, Lx2/n;

    .line 416
    .line 417
    iget-boolean v2, v9, Ly0/n;->t:Z

    .line 418
    .line 419
    if-eqz v2, :cond_b

    .line 420
    .line 421
    invoke-virtual {v9}, Ly0/n;->Y0()Lqg/t;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    new-instance v3, Lci/j;

    .line 426
    .line 427
    const/16 v4, 0x17

    .line 428
    .line 429
    invoke-direct {v3, v9, v0, v6, v4}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 430
    .line 431
    .line 432
    const/4 v0, 0x3

    .line 433
    invoke-static {v2, v6, v3, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 434
    .line 435
    .line 436
    :cond_b
    return-object v8

    .line 437
    :pswitch_8
    move-object v2, v9

    .line 438
    check-cast v0, Lu2/c;

    .line 439
    .line 440
    move-object v9, v2

    .line 441
    check-cast v9, Lx1/f0;

    .line 442
    .line 443
    invoke-virtual {v9, v0}, Lx1/f0;->Z(Lu2/c;)V

    .line 444
    .line 445
    .line 446
    return-object v8

    .line 447
    :pswitch_9
    move-object v2, v9

    .line 448
    check-cast v0, Ly0/m;

    .line 449
    .line 450
    move-object v9, v2

    .line 451
    check-cast v9, Lj0/b;

    .line 452
    .line 453
    invoke-virtual {v9, v0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 457
    .line 458
    return-object v0

    .line 459
    :pswitch_a
    move-object v2, v9

    .line 460
    check-cast v0, Lx1/a;

    .line 461
    .line 462
    move-object v9, v2

    .line 463
    check-cast v9, Lx1/g0;

    .line 464
    .line 465
    invoke-interface {v0}, Lx1/a;->H()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    const v3, 0x7fffffff

    .line 470
    .line 471
    .line 472
    if-ne v2, v3, :cond_c

    .line 473
    .line 474
    goto/16 :goto_7

    .line 475
    .line 476
    :cond_c
    invoke-interface {v0}, Lx1/a;->e()Lx1/g0;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    iget-boolean v2, v2, Lx1/g0;->b:Z

    .line 481
    .line 482
    if-eqz v2, :cond_d

    .line 483
    .line 484
    invoke-interface {v0}, Lx1/a;->h0()V

    .line 485
    .line 486
    .line 487
    :cond_d
    invoke-interface {v0}, Lx1/a;->e()Lx1/g0;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    iget-object v2, v2, Lx1/g0;->g:Ljava/util/HashMap;

    .line 492
    .line 493
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    if-eqz v3, :cond_e

    .line 506
    .line 507
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    check-cast v3, Ljava/util/Map$Entry;

    .line 512
    .line 513
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Lv1/j;

    .line 518
    .line 519
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    check-cast v3, Ljava/lang/Number;

    .line 524
    .line 525
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    invoke-interface {v0}, Lx1/a;->A()Lx1/r;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-static {v9, v4, v3, v5}, Lx1/g0;->a(Lx1/g0;Lv1/j;ILx1/i1;)V

    .line 534
    .line 535
    .line 536
    goto :goto_4

    .line 537
    :cond_e
    invoke-interface {v0}, Lx1/a;->A()Lx1/r;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    :goto_5
    iget-object v2, v9, Lx1/g0;->a:Lv1/b1;

    .line 547
    .line 548
    invoke-interface {v2}, Lx1/a;->A()Lx1/r;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    if-nez v2, :cond_10

    .line 557
    .line 558
    invoke-virtual {v9, v0}, Lx1/g0;->b(Lx1/i1;)Ljava/util/Map;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    check-cast v2, Ljava/lang/Iterable;

    .line 567
    .line 568
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    if-eqz v3, :cond_f

    .line 577
    .line 578
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    check-cast v3, Lv1/j;

    .line 583
    .line 584
    invoke-virtual {v9, v0, v3}, Lx1/g0;->c(Lx1/i1;Lv1/j;)I

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    invoke-static {v9, v3, v4, v0}, Lx1/g0;->a(Lx1/g0;Lv1/j;ILx1/i1;)V

    .line 589
    .line 590
    .line 591
    goto :goto_6

    .line 592
    :cond_f
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 593
    .line 594
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    goto :goto_5

    .line 598
    :cond_10
    :goto_7
    return-object v8

    .line 599
    :pswitch_b
    move-object v2, v9

    .line 600
    check-cast v0, Ljava/lang/Throwable;

    .line 601
    .line 602
    move-object v9, v2

    .line 603
    check-cast v9, Ls1/k0;

    .line 604
    .line 605
    iget-object v2, v9, Ls1/k0;->i:Lqg/g;

    .line 606
    .line 607
    if-eqz v2, :cond_11

    .line 608
    .line 609
    invoke-virtual {v2, v0}, Lqg/g;->w(Ljava/lang/Throwable;)Z

    .line 610
    .line 611
    .line 612
    :cond_11
    iput-object v6, v9, Ls1/k0;->i:Lqg/g;

    .line 613
    .line 614
    return-object v8

    .line 615
    :pswitch_c
    move-object v2, v9

    .line 616
    check-cast v0, Lm1/c0;

    .line 617
    .line 618
    move-object v9, v2

    .line 619
    check-cast v9, Lm1/c;

    .line 620
    .line 621
    invoke-virtual {v9, v0}, Lm1/c;->g(Lm1/c0;)V

    .line 622
    .line 623
    .line 624
    iget-object v2, v9, Lm1/c;->i:Lfg/l;

    .line 625
    .line 626
    if-eqz v2, :cond_12

    .line 627
    .line 628
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    :cond_12
    return-object v8

    .line 632
    :pswitch_d
    move-object v2, v9

    .line 633
    check-cast v0, Lh1/d;

    .line 634
    .line 635
    move-object v9, v2

    .line 636
    check-cast v9, Li1/b;

    .line 637
    .line 638
    iget-object v2, v9, Li1/b;->l:Lf1/j;

    .line 639
    .line 640
    iget-boolean v3, v9, Li1/b;->n:Z

    .line 641
    .line 642
    if-eqz v3, :cond_13

    .line 643
    .line 644
    iget-boolean v3, v9, Li1/b;->w:Z

    .line 645
    .line 646
    if-eqz v3, :cond_13

    .line 647
    .line 648
    if-eqz v2, :cond_13

    .line 649
    .line 650
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    invoke-virtual {v3}, Lb5/c;->v()J

    .line 655
    .line 656
    .line 657
    move-result-wide v4

    .line 658
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 659
    .line 660
    .line 661
    move-result-object v6

    .line 662
    invoke-interface {v6}, Lf1/u;->e()V

    .line 663
    .line 664
    .line 665
    :try_start_0
    iget-object v6, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v6, Landroidx/lifecycle/x;

    .line 668
    .line 669
    iget-object v6, v6, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v6, Lb5/c;

    .line 672
    .line 673
    invoke-virtual {v6}, Lb5/c;->p()Lf1/u;

    .line 674
    .line 675
    .line 676
    move-result-object v6

    .line 677
    invoke-interface {v6, v2}, Lf1/u;->d(Lf1/j;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v9, v0}, Li1/b;->c(Lh1/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 681
    .line 682
    .line 683
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-interface {v0}, Lf1/u;->p()V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v3, v4, v5}, Lb5/c;->U(J)V

    .line 691
    .line 692
    .line 693
    goto :goto_8

    .line 694
    :catchall_0
    move-exception v0

    .line 695
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-interface {v2}, Lf1/u;->p()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v4, v5}, Lb5/c;->U(J)V

    .line 703
    .line 704
    .line 705
    throw v0

    .line 706
    :cond_13
    invoke-virtual {v9, v0}, Li1/b;->c(Lh1/d;)V

    .line 707
    .line 708
    .line 709
    :goto_8
    return-object v8

    .line 710
    :pswitch_e
    move-object v2, v9

    .line 711
    check-cast v0, Li/p;

    .line 712
    .line 713
    iget v4, v0, Li/p;->b:F

    .line 714
    .line 715
    cmpg-float v5, v4, v3

    .line 716
    .line 717
    if-gez v5, :cond_14

    .line 718
    .line 719
    move v4, v3

    .line 720
    :cond_14
    const/high16 v5, 0x3f800000    # 1.0f

    .line 721
    .line 722
    cmpl-float v6, v4, v5

    .line 723
    .line 724
    if-lez v6, :cond_15

    .line 725
    .line 726
    move v4, v5

    .line 727
    :cond_15
    iget v6, v0, Li/p;->c:F

    .line 728
    .line 729
    const/high16 v7, -0x41000000    # -0.5f

    .line 730
    .line 731
    cmpg-float v8, v6, v7

    .line 732
    .line 733
    if-gez v8, :cond_16

    .line 734
    .line 735
    move v6, v7

    .line 736
    :cond_16
    const/high16 v8, 0x3f000000    # 0.5f

    .line 737
    .line 738
    cmpl-float v9, v6, v8

    .line 739
    .line 740
    if-lez v9, :cond_17

    .line 741
    .line 742
    move v6, v8

    .line 743
    :cond_17
    iget v9, v0, Li/p;->d:F

    .line 744
    .line 745
    cmpg-float v10, v9, v7

    .line 746
    .line 747
    if-gez v10, :cond_18

    .line 748
    .line 749
    goto :goto_9

    .line 750
    :cond_18
    move v7, v9

    .line 751
    :goto_9
    cmpl-float v9, v7, v8

    .line 752
    .line 753
    if-lez v9, :cond_19

    .line 754
    .line 755
    goto :goto_a

    .line 756
    :cond_19
    move v8, v7

    .line 757
    :goto_a
    iget v0, v0, Li/p;->a:F

    .line 758
    .line 759
    cmpg-float v7, v0, v3

    .line 760
    .line 761
    if-gez v7, :cond_1a

    .line 762
    .line 763
    goto :goto_b

    .line 764
    :cond_1a
    move v3, v0

    .line 765
    :goto_b
    cmpl-float v0, v3, v5

    .line 766
    .line 767
    if-lez v0, :cond_1b

    .line 768
    .line 769
    goto :goto_c

    .line 770
    :cond_1b
    move v5, v3

    .line 771
    :goto_c
    sget-object v0, Lg1/e;->x:Lg1/m;

    .line 772
    .line 773
    invoke-static {v4, v6, v8, v5, v0}, Lf1/c0;->b(FFFFLg1/c;)J

    .line 774
    .line 775
    .line 776
    move-result-wide v3

    .line 777
    move-object v9, v2

    .line 778
    check-cast v9, Lg1/c;

    .line 779
    .line 780
    invoke-static {v3, v4, v9}, Lf1/w;->a(JLg1/c;)J

    .line 781
    .line 782
    .line 783
    move-result-wide v2

    .line 784
    new-instance v0, Lf1/w;

    .line 785
    .line 786
    invoke-direct {v0, v2, v3}, Lf1/w;-><init>(J)V

    .line 787
    .line 788
    .line 789
    return-object v0

    .line 790
    :pswitch_f
    move-object v2, v9

    .line 791
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    return-object v0

    .line 800
    :pswitch_10
    move-object v2, v9

    .line 801
    check-cast v0, Ljava/util/List;

    .line 802
    .line 803
    move-object v9, v2

    .line 804
    check-cast v9, Ls/u0;

    .line 805
    .line 806
    invoke-virtual {v9}, Ls/u0;->invoke()Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    check-cast v2, Ljava/lang/Float;

    .line 811
    .line 812
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    return-object v0

    .line 820
    :pswitch_11
    move-object v2, v9

    .line 821
    check-cast v0, Lf2/y;

    .line 822
    .line 823
    move-object v9, v2

    .line 824
    check-cast v9, Ljava/lang/String;

    .line 825
    .line 826
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 827
    .line 828
    sget-object v2, Lf2/u;->a:Lf2/x;

    .line 829
    .line 830
    invoke-static {v9}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    invoke-interface {v0, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    return-object v8

    .line 838
    :pswitch_12
    move-object v2, v9

    .line 839
    check-cast v0, Lf2/y;

    .line 840
    .line 841
    move-object v9, v2

    .line 842
    check-cast v9, Lf2/i;

    .line 843
    .line 844
    iget v2, v9, Lf2/i;->a:I

    .line 845
    .line 846
    invoke-static {v0, v2}, Lf2/w;->c(Lf2/y;I)V

    .line 847
    .line 848
    .line 849
    return-object v8

    .line 850
    :pswitch_13
    move-object v2, v9

    .line 851
    check-cast v0, Lf1/d0;

    .line 852
    .line 853
    move-object v9, v2

    .line 854
    check-cast v9, Lf1/s0;

    .line 855
    .line 856
    iget v2, v9, Lf1/s0;->u:F

    .line 857
    .line 858
    invoke-interface {v0, v2}, Lf1/d0;->q(F)V

    .line 859
    .line 860
    .line 861
    iget v2, v9, Lf1/s0;->v:F

    .line 862
    .line 863
    invoke-interface {v0, v2}, Lf1/d0;->i(F)V

    .line 864
    .line 865
    .line 866
    iget v2, v9, Lf1/s0;->w:F

    .line 867
    .line 868
    invoke-interface {v0, v2}, Lf1/d0;->n(F)V

    .line 869
    .line 870
    .line 871
    invoke-interface {v0, v3}, Lf1/d0;->s(F)V

    .line 872
    .line 873
    .line 874
    invoke-interface {v0, v3}, Lf1/d0;->g(F)V

    .line 875
    .line 876
    .line 877
    iget v2, v9, Lf1/s0;->x:F

    .line 878
    .line 879
    invoke-interface {v0, v2}, Lf1/d0;->c(F)V

    .line 880
    .line 881
    .line 882
    invoke-interface {v0}, Lf1/d0;->l()V

    .line 883
    .line 884
    .line 885
    invoke-interface {v0}, Lf1/d0;->o()V

    .line 886
    .line 887
    .line 888
    invoke-interface {v0, v3}, Lf1/d0;->f(F)V

    .line 889
    .line 890
    .line 891
    iget v2, v9, Lf1/s0;->y:F

    .line 892
    .line 893
    invoke-interface {v0, v2}, Lf1/d0;->u(F)V

    .line 894
    .line 895
    .line 896
    iget-wide v2, v9, Lf1/s0;->z:J

    .line 897
    .line 898
    invoke-interface {v0, v2, v3}, Lf1/d0;->H0(J)V

    .line 899
    .line 900
    .line 901
    iget-object v2, v9, Lf1/s0;->A:Lf1/r0;

    .line 902
    .line 903
    invoke-interface {v0, v2}, Lf1/d0;->Q0(Lf1/r0;)V

    .line 904
    .line 905
    .line 906
    iget-boolean v2, v9, Lf1/s0;->B:Z

    .line 907
    .line 908
    invoke-interface {v0, v2}, Lf1/d0;->r(Z)V

    .line 909
    .line 910
    .line 911
    invoke-interface {v0}, Lf1/d0;->I()V

    .line 912
    .line 913
    .line 914
    iget-wide v2, v9, Lf1/s0;->C:J

    .line 915
    .line 916
    invoke-interface {v0, v2, v3}, Lf1/d0;->p(J)V

    .line 917
    .line 918
    .line 919
    iget-wide v2, v9, Lf1/s0;->D:J

    .line 920
    .line 921
    invoke-interface {v0, v2, v3}, Lf1/d0;->t(J)V

    .line 922
    .line 923
    .line 924
    invoke-interface {v0, v7}, Lf1/d0;->Y(I)V

    .line 925
    .line 926
    .line 927
    iget v2, v9, Lf1/s0;->E:I

    .line 928
    .line 929
    invoke-interface {v0, v2}, Lf1/d0;->h(I)V

    .line 930
    .line 931
    .line 932
    iget-object v2, v9, Lf1/s0;->F:Lf1/n;

    .line 933
    .line 934
    invoke-interface {v0, v2}, Lf1/d0;->k(Lf1/n;)V

    .line 935
    .line 936
    .line 937
    return-object v8

    .line 938
    :pswitch_14
    move-object v2, v9

    .line 939
    move-object v9, v2

    .line 940
    check-cast v9, Lf/l0;

    .line 941
    .line 942
    if-ne v0, v9, :cond_1c

    .line 943
    .line 944
    goto :goto_d

    .line 945
    :cond_1c
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    :goto_d
    return-object v4

    .line 950
    :pswitch_15
    move-object v2, v9

    .line 951
    move-object v9, v2

    .line 952
    check-cast v9, Lf/g0;

    .line 953
    .line 954
    if-ne v0, v9, :cond_1d

    .line 955
    .line 956
    goto :goto_e

    .line 957
    :cond_1d
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v4

    .line 961
    :goto_e
    return-object v4

    .line 962
    :pswitch_16
    move-object v2, v9

    .line 963
    move-object v9, v2

    .line 964
    check-cast v9, Lf/f0;

    .line 965
    .line 966
    if-ne v0, v9, :cond_1e

    .line 967
    .line 968
    goto :goto_f

    .line 969
    :cond_1e
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v4

    .line 973
    :goto_f
    return-object v4

    .line 974
    :pswitch_17
    move-object v2, v9

    .line 975
    check-cast v0, Ljava/lang/Throwable;

    .line 976
    .line 977
    if-eqz v0, :cond_1f

    .line 978
    .line 979
    move-object v9, v2

    .line 980
    check-cast v9, Landroid/os/CancellationSignal;

    .line 981
    .line 982
    invoke-virtual {v9}, Landroid/os/CancellationSignal;->cancel()V

    .line 983
    .line 984
    .line 985
    :cond_1f
    return-object v8

    .line 986
    :pswitch_18
    move-object v2, v9

    .line 987
    check-cast v0, Lf1/d0;

    .line 988
    .line 989
    move-object v9, v2

    .line 990
    check-cast v9, Lc1/p;

    .line 991
    .line 992
    sget v2, Ll/f;->d:F

    .line 993
    .line 994
    invoke-interface {v0}, Lu2/c;->d()F

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    mul-float/2addr v3, v2

    .line 999
    invoke-interface {v0, v3}, Lf1/d0;->c(F)V

    .line 1000
    .line 1001
    .line 1002
    iget-object v2, v9, Lc1/p;->a:Lf1/r0;

    .line 1003
    .line 1004
    invoke-interface {v0, v2}, Lf1/d0;->Q0(Lf1/r0;)V

    .line 1005
    .line 1006
    .line 1007
    iget-boolean v2, v9, Lc1/p;->b:Z

    .line 1008
    .line 1009
    invoke-interface {v0, v2}, Lf1/d0;->r(Z)V

    .line 1010
    .line 1011
    .line 1012
    iget-wide v2, v9, Lc1/p;->c:J

    .line 1013
    .line 1014
    invoke-interface {v0, v2, v3}, Lf1/d0;->p(J)V

    .line 1015
    .line 1016
    .line 1017
    iget-wide v2, v9, Lc1/p;->d:J

    .line 1018
    .line 1019
    invoke-interface {v0, v2, v3}, Lf1/d0;->t(J)V

    .line 1020
    .line 1021
    .line 1022
    return-object v8

    .line 1023
    :pswitch_19
    move-object v2, v9

    .line 1024
    check-cast v0, Lx1/h0;

    .line 1025
    .line 1026
    move-object v9, v2

    .line 1027
    check-cast v9, Li0/w1;

    .line 1028
    .line 1029
    invoke-virtual {v9, v0}, Li0/w1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 1033
    .line 1034
    .line 1035
    return-object v8

    .line 1036
    :pswitch_1a
    move-object v2, v9

    .line 1037
    check-cast v0, Lb1/h;

    .line 1038
    .line 1039
    iget-object v3, v0, Ly0/n;->g:Ly0/n;

    .line 1040
    .line 1041
    iget-boolean v3, v3, Ly0/n;->t:Z

    .line 1042
    .line 1043
    if-nez v3, :cond_20

    .line 1044
    .line 1045
    sget-object v0, Lx1/d2;->h:Lx1/d2;

    .line 1046
    .line 1047
    goto :goto_11

    .line 1048
    :cond_20
    iget-object v3, v0, Lb1/h;->v:Lb1/h;

    .line 1049
    .line 1050
    sget-object v4, Lx1/d2;->g:Lx1/d2;

    .line 1051
    .line 1052
    if-eqz v3, :cond_22

    .line 1053
    .line 1054
    move-object v9, v2

    .line 1055
    check-cast v9, Landroidx/lifecycle/x;

    .line 1056
    .line 1057
    new-instance v2, Lb1/f;

    .line 1058
    .line 1059
    invoke-direct {v2, v9, v7}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v2, v3}, Lb1/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v5

    .line 1066
    if-eq v5, v4, :cond_21

    .line 1067
    .line 1068
    goto :goto_10

    .line 1069
    :cond_21
    invoke-static {v3, v2}, Lx1/k;->B(Lx1/e2;Lfg/l;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_22
    :goto_10
    iput-object v6, v0, Lb1/h;->v:Lb1/h;

    .line 1073
    .line 1074
    iput-object v6, v0, Lb1/h;->u:Lb1/h;

    .line 1075
    .line 1076
    move-object v0, v4

    .line 1077
    :goto_11
    return-object v0

    .line 1078
    nop

    .line 1079
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
