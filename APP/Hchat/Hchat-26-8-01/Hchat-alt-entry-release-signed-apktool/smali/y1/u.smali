.class public final Ly1/u;
.super Landroidx/lifecycle/x;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic i:Ly1/z;


# direct methods
.method public constructor <init>(Ly1/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/u;->i:Ly1/z;

    .line 2
    .line 3
    const/16 p1, 0x11

    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroidx/lifecycle/x;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final H(IILandroid/os/Bundle;)Z
    .locals 24

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v2, Ly1/u;->i:Ly1/z;

    .line 10
    .line 11
    iget-object v5, v4, Ly1/z;->m:Landroid/view/accessibility/AccessibilityManager;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    iget-object v8, v4, Ly1/z;->j:Ly1/t;

    .line 19
    .line 20
    invoke-virtual {v4}, Ly1/z;->l()Lf/k;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    invoke-virtual {v9, v0}, Lf/k;->b(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    check-cast v9, Lf2/r;

    .line 29
    .line 30
    if-eqz v9, :cond_0

    .line 31
    .line 32
    iget-object v12, v9, Lf2/r;->a:Lf2/q;

    .line 33
    .line 34
    if-nez v12, :cond_1

    .line 35
    .line 36
    :cond_0
    :goto_0
    const/16 v18, 0x0

    .line 37
    .line 38
    goto/16 :goto_4e

    .line 39
    .line 40
    :cond_1
    iget-object v9, v12, Lf2/q;->c:Lx1/f0;

    .line 41
    .line 42
    iget v11, v12, Lf2/q;->f:I

    .line 43
    .line 44
    iget-object v13, v12, Lf2/q;->d:Lf2/m;

    .line 45
    .line 46
    iget-object v14, v13, Lf2/m;->g:Lf/k0;

    .line 47
    .line 48
    sget-object v15, Lf2/u;->n:Lf2/x;

    .line 49
    .line 50
    invoke-virtual {v14, v15}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v15

    .line 54
    move/from16 v16, v6

    .line 55
    .line 56
    if-nez v15, :cond_2

    .line 57
    .line 58
    const/4 v15, 0x0

    .line 59
    :cond_2
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-static {v15, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    if-eqz v15, :cond_4

    .line 66
    .line 67
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v10, 0x22

    .line 70
    .line 71
    if-lt v15, v10, :cond_3

    .line 72
    .line 73
    invoke-static {v5}, Lh3/b;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v10, 0x1

    .line 79
    :goto_1
    if-nez v10, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    const/16 v10, 0x40

    .line 83
    .line 84
    const/high16 v15, -0x80000000

    .line 85
    .line 86
    if-eq v1, v10, :cond_8b

    .line 87
    .line 88
    const/16 v5, 0x80

    .line 89
    .line 90
    if-eq v1, v5, :cond_89

    .line 91
    .line 92
    const/16 v10, 0x200

    .line 93
    .line 94
    const/16 v5, 0x100

    .line 95
    .line 96
    const/4 v15, -0x1

    .line 97
    if-eq v1, v5, :cond_6b

    .line 98
    .line 99
    if-eq v1, v10, :cond_6b

    .line 100
    .line 101
    const/16 v5, 0x4000

    .line 102
    .line 103
    if-eq v1, v5, :cond_69

    .line 104
    .line 105
    const/high16 v5, 0x20000

    .line 106
    .line 107
    if-eq v1, v5, :cond_65

    .line 108
    .line 109
    invoke-static {v12}, Ly1/g0;->b(Lf2/q;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    const/4 v5, 0x1

    .line 117
    if-eq v1, v5, :cond_62

    .line 118
    .line 119
    const/4 v5, 0x2

    .line 120
    if-eq v1, v5, :cond_60

    .line 121
    .line 122
    sget-object v5, Lu2/m;->h:Lu2/m;

    .line 123
    .line 124
    sparse-switch v1, :sswitch_data_0

    .line 125
    .line 126
    .line 127
    packed-switch v1, :pswitch_data_0

    .line 128
    .line 129
    .line 130
    packed-switch v1, :pswitch_data_1

    .line 131
    .line 132
    .line 133
    iget-object v3, v4, Ly1/z;->x:Lf/t0;

    .line 134
    .line 135
    invoke-virtual {v3, v0}, Lf/t0;->b(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lf/t0;

    .line 140
    .line 141
    if-eqz v0, :cond_0

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lf/t0;->b(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/lang/CharSequence;

    .line 148
    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_6
    sget-object v0, Lf2/l;->x:Lf2/x;

    .line 153
    .line 154
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-nez v0, :cond_7

    .line 159
    .line 160
    const/4 v6, 0x0

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    move-object v6, v0

    .line 163
    :goto_2
    check-cast v6, Ljava/util/List;

    .line 164
    .line 165
    if-nez v6, :cond_8

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_8
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-gtz v0, :cond_9

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_9
    const/4 v0, 0x0

    .line 178
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lah/a;->d()V

    .line 186
    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    return v0

    .line 190
    :pswitch_0
    sget-object v0, Lf2/l;->B:Lf2/x;

    .line 191
    .line 192
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-nez v0, :cond_a

    .line 197
    .line 198
    const/4 v6, 0x0

    .line 199
    goto :goto_3

    .line 200
    :cond_a
    move-object v6, v0

    .line 201
    :goto_3
    check-cast v6, Lf2/a;

    .line 202
    .line 203
    if-eqz v6, :cond_0

    .line 204
    .line 205
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 206
    .line 207
    check-cast v0, Lfg/a;

    .line 208
    .line 209
    if-eqz v0, :cond_0

    .line 210
    .line 211
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    return v0

    .line 222
    :pswitch_1
    sget-object v0, Lf2/l;->z:Lf2/x;

    .line 223
    .line 224
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-nez v0, :cond_b

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    goto :goto_4

    .line 232
    :cond_b
    move-object v6, v0

    .line 233
    :goto_4
    check-cast v6, Lf2/a;

    .line 234
    .line 235
    if-eqz v6, :cond_0

    .line 236
    .line 237
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 238
    .line 239
    check-cast v0, Lfg/a;

    .line 240
    .line 241
    if-eqz v0, :cond_0

    .line 242
    .line 243
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Ljava/lang/Boolean;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    return v0

    .line 254
    :pswitch_2
    sget-object v0, Lf2/l;->A:Lf2/x;

    .line 255
    .line 256
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_c

    .line 261
    .line 262
    const/4 v6, 0x0

    .line 263
    goto :goto_5

    .line 264
    :cond_c
    move-object v6, v0

    .line 265
    :goto_5
    check-cast v6, Lf2/a;

    .line 266
    .line 267
    if-eqz v6, :cond_0

    .line 268
    .line 269
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 270
    .line 271
    check-cast v0, Lfg/a;

    .line 272
    .line 273
    if-eqz v0, :cond_0

    .line 274
    .line 275
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Ljava/lang/Boolean;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    return v0

    .line 286
    :pswitch_3
    sget-object v0, Lf2/l;->y:Lf2/x;

    .line 287
    .line 288
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-nez v0, :cond_d

    .line 293
    .line 294
    const/4 v6, 0x0

    .line 295
    goto :goto_6

    .line 296
    :cond_d
    move-object v6, v0

    .line 297
    :goto_6
    check-cast v6, Lf2/a;

    .line 298
    .line 299
    if-eqz v6, :cond_0

    .line 300
    .line 301
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 302
    .line 303
    check-cast v0, Lfg/a;

    .line 304
    .line 305
    if-eqz v0, :cond_0

    .line 306
    .line 307
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    return v0

    .line 318
    :pswitch_4
    :sswitch_0
    const/16 v20, 0x20

    .line 319
    .line 320
    const-wide v22, 0xffffffffL

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    goto/16 :goto_1e

    .line 326
    .line 327
    :sswitch_1
    sget-object v0, Lf2/l;->p:Lf2/x;

    .line 328
    .line 329
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-nez v0, :cond_e

    .line 334
    .line 335
    const/4 v6, 0x0

    .line 336
    goto :goto_7

    .line 337
    :cond_e
    move-object v6, v0

    .line 338
    :goto_7
    check-cast v6, Lf2/a;

    .line 339
    .line 340
    if-eqz v6, :cond_0

    .line 341
    .line 342
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 343
    .line 344
    check-cast v0, Lfg/a;

    .line 345
    .line 346
    if-eqz v0, :cond_0

    .line 347
    .line 348
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    return v0

    .line 359
    :sswitch_2
    if-eqz v3, :cond_0

    .line 360
    .line 361
    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 362
    .line 363
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-nez v1, :cond_f

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :cond_f
    sget-object v1, Lf2/l;->i:Lf2/x;

    .line 372
    .line 373
    invoke-virtual {v14, v1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    if-nez v1, :cond_10

    .line 378
    .line 379
    const/4 v6, 0x0

    .line 380
    goto :goto_8

    .line 381
    :cond_10
    move-object v6, v1

    .line 382
    :goto_8
    check-cast v6, Lf2/a;

    .line 383
    .line 384
    if-eqz v6, :cond_0

    .line 385
    .line 386
    iget-object v1, v6, Lf2/a;->b:Lsf/b;

    .line 387
    .line 388
    check-cast v1, Lfg/l;

    .line 389
    .line 390
    if-eqz v1, :cond_0

    .line 391
    .line 392
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    return v0

    .line 411
    :sswitch_3
    invoke-virtual {v12}, Lf2/q;->l()Lf2/q;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-eqz v0, :cond_12

    .line 416
    .line 417
    iget-object v1, v0, Lf2/q;->d:Lf2/m;

    .line 418
    .line 419
    sget-object v3, Lf2/l;->d:Lf2/x;

    .line 420
    .line 421
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 422
    .line 423
    invoke-virtual {v1, v3}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    if-nez v1, :cond_11

    .line 428
    .line 429
    const/4 v1, 0x0

    .line 430
    :cond_11
    check-cast v1, Lf2/a;

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_12
    const/4 v1, 0x0

    .line 434
    :goto_9
    if-nez v1, :cond_14

    .line 435
    .line 436
    if-eqz v0, :cond_14

    .line 437
    .line 438
    invoke-virtual {v0}, Lf2/q;->l()Lf2/q;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    if-eqz v0, :cond_12

    .line 443
    .line 444
    iget-object v1, v0, Lf2/q;->d:Lf2/m;

    .line 445
    .line 446
    sget-object v3, Lf2/l;->d:Lf2/x;

    .line 447
    .line 448
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 449
    .line 450
    invoke-virtual {v1, v3}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    if-nez v1, :cond_13

    .line 455
    .line 456
    const/4 v1, 0x0

    .line 457
    :cond_13
    check-cast v1, Lf2/a;

    .line 458
    .line 459
    goto :goto_9

    .line 460
    :cond_14
    if-nez v0, :cond_15

    .line 461
    .line 462
    invoke-virtual {v12}, Lf2/q;->g()Le1/c;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    new-instance v1, Landroid/graphics/Rect;

    .line 467
    .line 468
    iget v3, v0, Le1/c;->a:F

    .line 469
    .line 470
    float-to-double v3, v3

    .line 471
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 472
    .line 473
    .line 474
    move-result-wide v3

    .line 475
    double-to-float v3, v3

    .line 476
    float-to-int v3, v3

    .line 477
    iget v4, v0, Le1/c;->b:F

    .line 478
    .line 479
    float-to-double v4, v4

    .line 480
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 481
    .line 482
    .line 483
    move-result-wide v4

    .line 484
    double-to-float v4, v4

    .line 485
    float-to-int v4, v4

    .line 486
    iget v5, v0, Le1/c;->c:F

    .line 487
    .line 488
    float-to-double v5, v5

    .line 489
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 490
    .line 491
    .line 492
    move-result-wide v5

    .line 493
    double-to-float v5, v5

    .line 494
    invoke-static {v5}, Lig/a;->X(F)I

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    iget v0, v0, Le1/c;->d:F

    .line 499
    .line 500
    float-to-double v6, v0

    .line 501
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 502
    .line 503
    .line 504
    move-result-wide v6

    .line 505
    double-to-float v0, v6

    .line 506
    invoke-static {v0}, Lig/a;->X(F)I

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    invoke-direct {v1, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v8, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    return v0

    .line 518
    :cond_15
    const-wide/16 v3, 0x0

    .line 519
    .line 520
    move-wide v7, v3

    .line 521
    const/4 v1, 0x0

    .line 522
    :goto_a
    if-eqz v0, :cond_27

    .line 523
    .line 524
    iget-object v13, v0, Lf2/q;->c:Lx1/f0;

    .line 525
    .line 526
    iget-object v14, v0, Lf2/q;->d:Lf2/m;

    .line 527
    .line 528
    iget-object v14, v14, Lf2/m;->g:Lf/k0;

    .line 529
    .line 530
    sget-object v15, Lf2/l;->d:Lf2/x;

    .line 531
    .line 532
    invoke-virtual {v14, v15}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v15

    .line 536
    if-nez v15, :cond_16

    .line 537
    .line 538
    const/4 v15, 0x0

    .line 539
    :cond_16
    check-cast v15, Lf2/a;

    .line 540
    .line 541
    const/16 v20, 0x20

    .line 542
    .line 543
    if-eqz v15, :cond_26

    .line 544
    .line 545
    iget-object v6, v13, Lx1/f0;->L:Lx1/b1;

    .line 546
    .line 547
    iget-object v6, v6, Lx1/b1;->c:Lx1/r;

    .line 548
    .line 549
    invoke-static {v6}, Lv1/w;->e(Lv1/t;)Le1/c;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    iget-object v13, v13, Lx1/f0;->L:Lx1/b1;

    .line 554
    .line 555
    iget-object v13, v13, Lx1/b1;->c:Lx1/r;

    .line 556
    .line 557
    invoke-virtual {v13}, Lx1/i1;->b0()Lv1/t;

    .line 558
    .line 559
    .line 560
    move-result-object v13

    .line 561
    if-eqz v13, :cond_17

    .line 562
    .line 563
    check-cast v13, Lx1/i1;

    .line 564
    .line 565
    invoke-virtual {v13, v3, v4}, Lx1/i1;->m0(J)J

    .line 566
    .line 567
    .line 568
    move-result-wide v21

    .line 569
    move-wide/from16 v10, v21

    .line 570
    .line 571
    :goto_b
    const-wide v22, 0xffffffffL

    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    goto :goto_c

    .line 577
    :cond_17
    move-wide v10, v3

    .line 578
    goto :goto_b

    .line 579
    :goto_c
    invoke-virtual {v6, v10, v11}, Le1/c;->i(J)Le1/c;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    invoke-virtual {v12}, Lf2/q;->d()Lx1/i1;

    .line 584
    .line 585
    .line 586
    move-result-object v10

    .line 587
    if-eqz v10, :cond_19

    .line 588
    .line 589
    invoke-virtual {v10}, Lx1/i1;->r1()Ly0/n;

    .line 590
    .line 591
    .line 592
    move-result-object v11

    .line 593
    iget-boolean v11, v11, Ly0/n;->t:Z

    .line 594
    .line 595
    if-eqz v11, :cond_18

    .line 596
    .line 597
    goto :goto_d

    .line 598
    :cond_18
    const/4 v10, 0x0

    .line 599
    :goto_d
    if-eqz v10, :cond_19

    .line 600
    .line 601
    invoke-virtual {v10, v3, v4}, Lx1/i1;->m0(J)J

    .line 602
    .line 603
    .line 604
    move-result-wide v10

    .line 605
    goto :goto_e

    .line 606
    :cond_19
    move-wide v10, v3

    .line 607
    :goto_e
    invoke-static {v10, v11, v7, v8}, Le1/b;->e(JJ)J

    .line 608
    .line 609
    .line 610
    move-result-wide v10

    .line 611
    invoke-virtual {v12}, Lf2/q;->d()Lx1/i1;

    .line 612
    .line 613
    .line 614
    move-result-object v13

    .line 615
    if-eqz v13, :cond_1a

    .line 616
    .line 617
    iget-wide v3, v13, Lv1/b1;->i:J

    .line 618
    .line 619
    goto :goto_f

    .line 620
    :cond_1a
    const-wide/16 v3, 0x0

    .line 621
    .line 622
    :goto_f
    invoke-static {v3, v4}, Lr9/e0;->q0(J)J

    .line 623
    .line 624
    .line 625
    move-result-wide v3

    .line 626
    invoke-static {v10, v11, v3, v4}, Lac/p;->a(JJ)Le1/c;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    iget v4, v3, Le1/c;->a:F

    .line 631
    .line 632
    iget v10, v6, Le1/c;->a:F

    .line 633
    .line 634
    sub-float/2addr v4, v10

    .line 635
    iget v10, v3, Le1/c;->c:F

    .line 636
    .line 637
    iget v11, v6, Le1/c;->c:F

    .line 638
    .line 639
    sub-float/2addr v10, v11

    .line 640
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 641
    .line 642
    .line 643
    move-result v11

    .line 644
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 645
    .line 646
    .line 647
    move-result v13

    .line 648
    cmpg-float v11, v11, v13

    .line 649
    .line 650
    if-nez v11, :cond_1c

    .line 651
    .line 652
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 653
    .line 654
    .line 655
    move-result v11

    .line 656
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 657
    .line 658
    .line 659
    move-result v13

    .line 660
    cmpg-float v11, v11, v13

    .line 661
    .line 662
    if-gez v11, :cond_1b

    .line 663
    .line 664
    goto :goto_10

    .line 665
    :cond_1b
    move v4, v10

    .line 666
    goto :goto_10

    .line 667
    :cond_1c
    move/from16 v4, v16

    .line 668
    .line 669
    :goto_10
    iget v10, v3, Le1/c;->b:F

    .line 670
    .line 671
    iget v11, v6, Le1/c;->b:F

    .line 672
    .line 673
    sub-float/2addr v10, v11

    .line 674
    iget v3, v3, Le1/c;->d:F

    .line 675
    .line 676
    iget v6, v6, Le1/c;->d:F

    .line 677
    .line 678
    sub-float/2addr v3, v6

    .line 679
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 680
    .line 681
    .line 682
    move-result v6

    .line 683
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    cmpg-float v6, v6, v11

    .line 688
    .line 689
    if-nez v6, :cond_1e

    .line 690
    .line 691
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 692
    .line 693
    .line 694
    move-result v6

    .line 695
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    cmpg-float v6, v6, v11

    .line 700
    .line 701
    if-gez v6, :cond_1d

    .line 702
    .line 703
    goto :goto_11

    .line 704
    :cond_1d
    move v10, v3

    .line 705
    goto :goto_11

    .line 706
    :cond_1e
    move/from16 v10, v16

    .line 707
    .line 708
    :goto_11
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    int-to-long v3, v3

    .line 713
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 714
    .line 715
    .line 716
    move-result v6

    .line 717
    int-to-long v10, v6

    .line 718
    shl-long v3, v3, v20

    .line 719
    .line 720
    and-long v10, v10, v22

    .line 721
    .line 722
    or-long/2addr v3, v10

    .line 723
    const-wide/16 v10, 0x0

    .line 724
    .line 725
    invoke-static {v3, v4, v10, v11}, Le1/b;->b(JJ)Z

    .line 726
    .line 727
    .line 728
    move-result v6

    .line 729
    if-eqz v6, :cond_1f

    .line 730
    .line 731
    move-wide v10, v3

    .line 732
    goto :goto_13

    .line 733
    :cond_1f
    shr-long v10, v3, v20

    .line 734
    .line 735
    long-to-int v6, v10

    .line 736
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 737
    .line 738
    .line 739
    move-result v6

    .line 740
    and-long v10, v3, v22

    .line 741
    .line 742
    long-to-int v10, v10

    .line 743
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 744
    .line 745
    .line 746
    move-result v10

    .line 747
    sget-object v11, Lf2/u;->u:Lf2/x;

    .line 748
    .line 749
    invoke-virtual {v14, v11}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v11

    .line 753
    if-nez v11, :cond_20

    .line 754
    .line 755
    const/4 v11, 0x0

    .line 756
    :cond_20
    check-cast v11, Lf2/j;

    .line 757
    .line 758
    iget-object v11, v9, Lx1/f0;->F:Lu2/m;

    .line 759
    .line 760
    if-ne v11, v5, :cond_21

    .line 761
    .line 762
    const/4 v11, 0x1

    .line 763
    goto :goto_12

    .line 764
    :cond_21
    const/4 v11, 0x0

    .line 765
    :goto_12
    if-eqz v11, :cond_22

    .line 766
    .line 767
    neg-float v6, v6

    .line 768
    :cond_22
    sget-object v11, Lf2/u;->v:Lf2/x;

    .line 769
    .line 770
    invoke-virtual {v14, v11}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v11

    .line 774
    if-nez v11, :cond_23

    .line 775
    .line 776
    const/4 v11, 0x0

    .line 777
    :cond_23
    check-cast v11, Lf2/j;

    .line 778
    .line 779
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 780
    .line 781
    .line 782
    move-result v6

    .line 783
    int-to-long v13, v6

    .line 784
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    int-to-long v10, v6

    .line 789
    shl-long v13, v13, v20

    .line 790
    .line 791
    and-long v10, v10, v22

    .line 792
    .line 793
    or-long/2addr v10, v13

    .line 794
    :goto_13
    iget-object v6, v15, Lf2/a;->b:Lsf/b;

    .line 795
    .line 796
    check-cast v6, Lfg/p;

    .line 797
    .line 798
    if-eqz v6, :cond_24

    .line 799
    .line 800
    shr-long v13, v10, v20

    .line 801
    .line 802
    long-to-int v13, v13

    .line 803
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 804
    .line 805
    .line 806
    move-result v13

    .line 807
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 808
    .line 809
    .line 810
    move-result-object v13

    .line 811
    and-long v10, v10, v22

    .line 812
    .line 813
    long-to-int v10, v10

    .line 814
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 815
    .line 816
    .line 817
    move-result v10

    .line 818
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 819
    .line 820
    .line 821
    move-result-object v10

    .line 822
    invoke-interface {v6, v13, v10}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v6

    .line 826
    check-cast v6, Ljava/lang/Boolean;

    .line 827
    .line 828
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 829
    .line 830
    .line 831
    move-result v6

    .line 832
    const/4 v10, 0x1

    .line 833
    if-ne v6, v10, :cond_24

    .line 834
    .line 835
    goto :goto_14

    .line 836
    :cond_24
    if-eqz v1, :cond_25

    .line 837
    .line 838
    :goto_14
    const/4 v1, 0x1

    .line 839
    goto :goto_15

    .line 840
    :cond_25
    const/4 v1, 0x0

    .line 841
    :goto_15
    invoke-static {v7, v8, v3, v4}, Le1/b;->d(JJ)J

    .line 842
    .line 843
    .line 844
    move-result-wide v7

    .line 845
    goto :goto_16

    .line 846
    :cond_26
    const-wide v22, 0xffffffffL

    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    :goto_16
    invoke-virtual {v0}, Lf2/q;->l()Lf2/q;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    const-wide/16 v3, 0x0

    .line 856
    .line 857
    goto/16 :goto_a

    .line 858
    .line 859
    :cond_27
    return v1

    .line 860
    :sswitch_4
    if-eqz v3, :cond_28

    .line 861
    .line 862
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 863
    .line 864
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    goto :goto_17

    .line 869
    :cond_28
    const/4 v0, 0x0

    .line 870
    :goto_17
    sget-object v1, Lf2/l;->k:Lf2/x;

    .line 871
    .line 872
    invoke-virtual {v14, v1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    if-nez v1, :cond_29

    .line 877
    .line 878
    const/4 v6, 0x0

    .line 879
    goto :goto_18

    .line 880
    :cond_29
    move-object v6, v1

    .line 881
    :goto_18
    check-cast v6, Lf2/a;

    .line 882
    .line 883
    if-eqz v6, :cond_0

    .line 884
    .line 885
    iget-object v1, v6, Lf2/a;->b:Lsf/b;

    .line 886
    .line 887
    check-cast v1, Lfg/l;

    .line 888
    .line 889
    if-eqz v1, :cond_0

    .line 890
    .line 891
    new-instance v3, Li2/g;

    .line 892
    .line 893
    if-nez v0, :cond_2a

    .line 894
    .line 895
    const-string v0, ""

    .line 896
    .line 897
    :cond_2a
    invoke-direct {v3, v0}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    invoke-interface {v1, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    check-cast v0, Ljava/lang/Boolean;

    .line 905
    .line 906
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 907
    .line 908
    .line 909
    move-result v0

    .line 910
    return v0

    .line 911
    :sswitch_5
    sget-object v0, Lf2/l;->v:Lf2/x;

    .line 912
    .line 913
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    if-nez v0, :cond_2b

    .line 918
    .line 919
    const/4 v6, 0x0

    .line 920
    goto :goto_19

    .line 921
    :cond_2b
    move-object v6, v0

    .line 922
    :goto_19
    check-cast v6, Lf2/a;

    .line 923
    .line 924
    if-eqz v6, :cond_0

    .line 925
    .line 926
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 927
    .line 928
    check-cast v0, Lfg/a;

    .line 929
    .line 930
    if-eqz v0, :cond_0

    .line 931
    .line 932
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    check-cast v0, Ljava/lang/Boolean;

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 939
    .line 940
    .line 941
    move-result v0

    .line 942
    return v0

    .line 943
    :sswitch_6
    sget-object v0, Lf2/l;->u:Lf2/x;

    .line 944
    .line 945
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    if-nez v0, :cond_2c

    .line 950
    .line 951
    const/4 v6, 0x0

    .line 952
    goto :goto_1a

    .line 953
    :cond_2c
    move-object v6, v0

    .line 954
    :goto_1a
    check-cast v6, Lf2/a;

    .line 955
    .line 956
    if-eqz v6, :cond_0

    .line 957
    .line 958
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 959
    .line 960
    check-cast v0, Lfg/a;

    .line 961
    .line 962
    if-eqz v0, :cond_0

    .line 963
    .line 964
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    check-cast v0, Ljava/lang/Boolean;

    .line 969
    .line 970
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    return v0

    .line 975
    :sswitch_7
    sget-object v0, Lf2/l;->t:Lf2/x;

    .line 976
    .line 977
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    if-nez v0, :cond_2d

    .line 982
    .line 983
    const/4 v6, 0x0

    .line 984
    goto :goto_1b

    .line 985
    :cond_2d
    move-object v6, v0

    .line 986
    :goto_1b
    check-cast v6, Lf2/a;

    .line 987
    .line 988
    if-eqz v6, :cond_0

    .line 989
    .line 990
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 991
    .line 992
    check-cast v0, Lfg/a;

    .line 993
    .line 994
    if-eqz v0, :cond_0

    .line 995
    .line 996
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    check-cast v0, Ljava/lang/Boolean;

    .line 1001
    .line 1002
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    return v0

    .line 1007
    :sswitch_8
    sget-object v0, Lf2/l;->r:Lf2/x;

    .line 1008
    .line 1009
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    if-nez v0, :cond_2e

    .line 1014
    .line 1015
    const/4 v6, 0x0

    .line 1016
    goto :goto_1c

    .line 1017
    :cond_2e
    move-object v6, v0

    .line 1018
    :goto_1c
    check-cast v6, Lf2/a;

    .line 1019
    .line 1020
    if-eqz v6, :cond_0

    .line 1021
    .line 1022
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1023
    .line 1024
    check-cast v0, Lfg/a;

    .line 1025
    .line 1026
    if-eqz v0, :cond_0

    .line 1027
    .line 1028
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    check-cast v0, Ljava/lang/Boolean;

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v0

    .line 1038
    return v0

    .line 1039
    :sswitch_9
    sget-object v0, Lf2/l;->s:Lf2/x;

    .line 1040
    .line 1041
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    if-nez v0, :cond_2f

    .line 1046
    .line 1047
    const/4 v6, 0x0

    .line 1048
    goto :goto_1d

    .line 1049
    :cond_2f
    move-object v6, v0

    .line 1050
    :goto_1d
    check-cast v6, Lf2/a;

    .line 1051
    .line 1052
    if-eqz v6, :cond_0

    .line 1053
    .line 1054
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1055
    .line 1056
    check-cast v0, Lfg/a;

    .line 1057
    .line 1058
    if-eqz v0, :cond_0

    .line 1059
    .line 1060
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    check-cast v0, Ljava/lang/Boolean;

    .line 1065
    .line 1066
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    return v0

    .line 1071
    :goto_1e
    const/16 v0, 0x1000

    .line 1072
    .line 1073
    if-ne v1, v0, :cond_30

    .line 1074
    .line 1075
    const/4 v0, 0x1

    .line 1076
    goto :goto_1f

    .line 1077
    :cond_30
    const/4 v0, 0x0

    .line 1078
    :goto_1f
    const/16 v3, 0x2000

    .line 1079
    .line 1080
    if-ne v1, v3, :cond_31

    .line 1081
    .line 1082
    const/4 v3, 0x1

    .line 1083
    goto :goto_20

    .line 1084
    :cond_31
    const/4 v3, 0x0

    .line 1085
    :goto_20
    const v4, 0x1020039

    .line 1086
    .line 1087
    .line 1088
    if-ne v1, v4, :cond_32

    .line 1089
    .line 1090
    const/4 v4, 0x1

    .line 1091
    goto :goto_21

    .line 1092
    :cond_32
    const/4 v4, 0x0

    .line 1093
    :goto_21
    const v6, 0x102003b

    .line 1094
    .line 1095
    .line 1096
    if-ne v1, v6, :cond_33

    .line 1097
    .line 1098
    const/4 v6, 0x1

    .line 1099
    goto :goto_22

    .line 1100
    :cond_33
    const/4 v6, 0x0

    .line 1101
    :goto_22
    const v8, 0x1020038

    .line 1102
    .line 1103
    .line 1104
    if-ne v1, v8, :cond_34

    .line 1105
    .line 1106
    const/4 v8, 0x1

    .line 1107
    goto :goto_23

    .line 1108
    :cond_34
    const/4 v8, 0x0

    .line 1109
    :goto_23
    const v10, 0x102003a

    .line 1110
    .line 1111
    .line 1112
    if-ne v1, v10, :cond_35

    .line 1113
    .line 1114
    const/4 v1, 0x1

    .line 1115
    goto :goto_24

    .line 1116
    :cond_35
    const/4 v1, 0x0

    .line 1117
    :goto_24
    if-nez v4, :cond_37

    .line 1118
    .line 1119
    if-nez v6, :cond_37

    .line 1120
    .line 1121
    if-nez v0, :cond_37

    .line 1122
    .line 1123
    if-eqz v3, :cond_36

    .line 1124
    .line 1125
    goto :goto_25

    .line 1126
    :cond_36
    const/4 v10, 0x0

    .line 1127
    goto :goto_26

    .line 1128
    :cond_37
    :goto_25
    const/4 v10, 0x1

    .line 1129
    :goto_26
    if-nez v8, :cond_39

    .line 1130
    .line 1131
    if-nez v1, :cond_39

    .line 1132
    .line 1133
    if-nez v0, :cond_39

    .line 1134
    .line 1135
    if-eqz v3, :cond_38

    .line 1136
    .line 1137
    goto :goto_27

    .line 1138
    :cond_38
    const/4 v1, 0x0

    .line 1139
    goto :goto_28

    .line 1140
    :cond_39
    :goto_27
    const/4 v1, 0x1

    .line 1141
    :goto_28
    if-nez v0, :cond_3a

    .line 1142
    .line 1143
    if-eqz v3, :cond_41

    .line 1144
    .line 1145
    :cond_3a
    sget-object v0, Lf2/u;->c:Lf2/x;

    .line 1146
    .line 1147
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    if-nez v0, :cond_3b

    .line 1152
    .line 1153
    const/4 v0, 0x0

    .line 1154
    :cond_3b
    check-cast v0, Lf2/h;

    .line 1155
    .line 1156
    sget-object v11, Lf2/l;->i:Lf2/x;

    .line 1157
    .line 1158
    invoke-virtual {v14, v11}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v11

    .line 1162
    if-nez v11, :cond_3c

    .line 1163
    .line 1164
    const/4 v11, 0x0

    .line 1165
    :cond_3c
    check-cast v11, Lf2/a;

    .line 1166
    .line 1167
    if-eqz v0, :cond_41

    .line 1168
    .line 1169
    iget-object v12, v0, Lf2/h;->b:Llg/a;

    .line 1170
    .line 1171
    if-eqz v11, :cond_41

    .line 1172
    .line 1173
    iget v1, v12, Llg/a;->b:F

    .line 1174
    .line 1175
    iget v4, v12, Llg/a;->a:F

    .line 1176
    .line 1177
    cmpg-float v5, v1, v4

    .line 1178
    .line 1179
    if-gez v5, :cond_3d

    .line 1180
    .line 1181
    move v5, v4

    .line 1182
    goto :goto_29

    .line 1183
    :cond_3d
    move v5, v1

    .line 1184
    :goto_29
    cmpl-float v6, v4, v1

    .line 1185
    .line 1186
    if-lez v6, :cond_3e

    .line 1187
    .line 1188
    goto :goto_2a

    .line 1189
    :cond_3e
    move v1, v4

    .line 1190
    :goto_2a
    iget v4, v0, Lf2/h;->c:I

    .line 1191
    .line 1192
    if-lez v4, :cond_3f

    .line 1193
    .line 1194
    sub-float/2addr v5, v1

    .line 1195
    const/16 v19, 0x1

    .line 1196
    .line 1197
    add-int/lit8 v4, v4, 0x1

    .line 1198
    .line 1199
    int-to-float v1, v4

    .line 1200
    :goto_2b
    div-float/2addr v5, v1

    .line 1201
    goto :goto_2c

    .line 1202
    :cond_3f
    sub-float/2addr v5, v1

    .line 1203
    const/16 v1, 0x14

    .line 1204
    .line 1205
    int-to-float v1, v1

    .line 1206
    goto :goto_2b

    .line 1207
    :goto_2c
    if-eqz v3, :cond_40

    .line 1208
    .line 1209
    neg-float v5, v5

    .line 1210
    :cond_40
    iget-object v1, v11, Lf2/a;->b:Lsf/b;

    .line 1211
    .line 1212
    check-cast v1, Lfg/l;

    .line 1213
    .line 1214
    if-eqz v1, :cond_0

    .line 1215
    .line 1216
    iget v0, v0, Lf2/h;->a:F

    .line 1217
    .line 1218
    add-float/2addr v0, v5

    .line 1219
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    check-cast v0, Ljava/lang/Boolean;

    .line 1228
    .line 1229
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    return v0

    .line 1234
    :cond_41
    iget-object v0, v9, Lx1/f0;->L:Lx1/b1;

    .line 1235
    .line 1236
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 1237
    .line 1238
    invoke-static {v0}, Lv1/w;->e(Lv1/t;)Le1/c;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    invoke-virtual {v0}, Le1/c;->c()J

    .line 1243
    .line 1244
    .line 1245
    move-result-wide v11

    .line 1246
    new-instance v0, Ljava/util/ArrayList;

    .line 1247
    .line 1248
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1249
    .line 1250
    .line 1251
    sget-object v13, Lf2/l;->C:Lf2/x;

    .line 1252
    .line 1253
    invoke-virtual {v14, v13}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v13

    .line 1257
    if-nez v13, :cond_42

    .line 1258
    .line 1259
    const/4 v13, 0x0

    .line 1260
    :cond_42
    check-cast v13, Lf2/a;

    .line 1261
    .line 1262
    if-eqz v13, :cond_43

    .line 1263
    .line 1264
    iget-object v13, v13, Lf2/a;->b:Lsf/b;

    .line 1265
    .line 1266
    check-cast v13, Lfg/l;

    .line 1267
    .line 1268
    if-eqz v13, :cond_43

    .line 1269
    .line 1270
    invoke-interface {v13, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v13

    .line 1274
    check-cast v13, Ljava/lang/Boolean;

    .line 1275
    .line 1276
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v13

    .line 1280
    if-eqz v13, :cond_43

    .line 1281
    .line 1282
    const/4 v13, 0x0

    .line 1283
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    check-cast v0, Ljava/lang/Float;

    .line 1288
    .line 1289
    goto :goto_2d

    .line 1290
    :cond_43
    const/4 v0, 0x0

    .line 1291
    :goto_2d
    sget-object v13, Lf2/l;->d:Lf2/x;

    .line 1292
    .line 1293
    invoke-virtual {v14, v13}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v13

    .line 1297
    if-nez v13, :cond_44

    .line 1298
    .line 1299
    const/4 v13, 0x0

    .line 1300
    :cond_44
    check-cast v13, Lf2/a;

    .line 1301
    .line 1302
    if-nez v13, :cond_45

    .line 1303
    .line 1304
    goto/16 :goto_0

    .line 1305
    .line 1306
    :cond_45
    iget-object v13, v13, Lf2/a;->b:Lsf/b;

    .line 1307
    .line 1308
    sget-object v15, Lf2/u;->u:Lf2/x;

    .line 1309
    .line 1310
    invoke-virtual {v14, v15}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v15

    .line 1314
    if-nez v15, :cond_46

    .line 1315
    .line 1316
    const/4 v15, 0x0

    .line 1317
    :cond_46
    check-cast v15, Lf2/j;

    .line 1318
    .line 1319
    if-eqz v15, :cond_52

    .line 1320
    .line 1321
    if-eqz v10, :cond_52

    .line 1322
    .line 1323
    if-eqz v0, :cond_47

    .line 1324
    .line 1325
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1326
    .line 1327
    .line 1328
    move-result v10

    .line 1329
    move-object/from16 p2, v0

    .line 1330
    .line 1331
    move/from16 p1, v1

    .line 1332
    .line 1333
    goto :goto_2e

    .line 1334
    :cond_47
    move-object/from16 p2, v0

    .line 1335
    .line 1336
    move/from16 p1, v1

    .line 1337
    .line 1338
    shr-long v0, v11, v20

    .line 1339
    .line 1340
    long-to-int v0, v0

    .line 1341
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1342
    .line 1343
    .line 1344
    move-result v10

    .line 1345
    :goto_2e
    if-nez v4, :cond_48

    .line 1346
    .line 1347
    if-eqz v3, :cond_49

    .line 1348
    .line 1349
    :cond_48
    neg-float v10, v10

    .line 1350
    :cond_49
    iget-object v0, v9, Lx1/f0;->F:Lu2/m;

    .line 1351
    .line 1352
    if-ne v0, v5, :cond_4a

    .line 1353
    .line 1354
    const/16 v19, 0x1

    .line 1355
    .line 1356
    goto :goto_2f

    .line 1357
    :cond_4a
    const/16 v19, 0x0

    .line 1358
    .line 1359
    :goto_2f
    if-eqz v19, :cond_4c

    .line 1360
    .line 1361
    if-nez v4, :cond_4b

    .line 1362
    .line 1363
    if-eqz v6, :cond_4c

    .line 1364
    .line 1365
    :cond_4b
    neg-float v10, v10

    .line 1366
    :cond_4c
    invoke-static {v15, v10}, Ly1/z;->q(Lf2/j;F)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v0

    .line 1370
    if-eqz v0, :cond_53

    .line 1371
    .line 1372
    sget-object v0, Lf2/l;->z:Lf2/x;

    .line 1373
    .line 1374
    invoke-virtual {v14, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v1

    .line 1378
    if-nez v1, :cond_4e

    .line 1379
    .line 1380
    sget-object v1, Lf2/l;->B:Lf2/x;

    .line 1381
    .line 1382
    invoke-virtual {v14, v1}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v1

    .line 1386
    if-eqz v1, :cond_4d

    .line 1387
    .line 1388
    goto :goto_30

    .line 1389
    :cond_4d
    check-cast v13, Lfg/p;

    .line 1390
    .line 1391
    if-eqz v13, :cond_0

    .line 1392
    .line 1393
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v0

    .line 1397
    invoke-interface {v13, v0, v7}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    check-cast v0, Ljava/lang/Boolean;

    .line 1402
    .line 1403
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1404
    .line 1405
    .line 1406
    move-result v0

    .line 1407
    return v0

    .line 1408
    :cond_4e
    :goto_30
    cmpl-float v1, v10, v16

    .line 1409
    .line 1410
    if-lez v1, :cond_50

    .line 1411
    .line 1412
    sget-object v0, Lf2/l;->B:Lf2/x;

    .line 1413
    .line 1414
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    if-nez v0, :cond_4f

    .line 1419
    .line 1420
    const/4 v6, 0x0

    .line 1421
    goto :goto_31

    .line 1422
    :cond_4f
    move-object v6, v0

    .line 1423
    :goto_31
    check-cast v6, Lf2/a;

    .line 1424
    .line 1425
    goto :goto_33

    .line 1426
    :cond_50
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    if-nez v0, :cond_51

    .line 1431
    .line 1432
    const/4 v6, 0x0

    .line 1433
    goto :goto_32

    .line 1434
    :cond_51
    move-object v6, v0

    .line 1435
    :goto_32
    check-cast v6, Lf2/a;

    .line 1436
    .line 1437
    :goto_33
    if-eqz v6, :cond_0

    .line 1438
    .line 1439
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1440
    .line 1441
    check-cast v0, Lfg/a;

    .line 1442
    .line 1443
    if-eqz v0, :cond_0

    .line 1444
    .line 1445
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    check-cast v0, Ljava/lang/Boolean;

    .line 1450
    .line 1451
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1452
    .line 1453
    .line 1454
    move-result v0

    .line 1455
    return v0

    .line 1456
    :cond_52
    move-object/from16 p2, v0

    .line 1457
    .line 1458
    move/from16 p1, v1

    .line 1459
    .line 1460
    :cond_53
    sget-object v0, Lf2/u;->v:Lf2/x;

    .line 1461
    .line 1462
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    if-nez v0, :cond_54

    .line 1467
    .line 1468
    const/4 v0, 0x0

    .line 1469
    :cond_54
    check-cast v0, Lf2/j;

    .line 1470
    .line 1471
    if-eqz v0, :cond_0

    .line 1472
    .line 1473
    if-eqz p1, :cond_0

    .line 1474
    .line 1475
    if-eqz p2, :cond_55

    .line 1476
    .line 1477
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    .line 1478
    .line 1479
    .line 1480
    move-result v1

    .line 1481
    goto :goto_34

    .line 1482
    :cond_55
    and-long v4, v11, v22

    .line 1483
    .line 1484
    long-to-int v1, v4

    .line 1485
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1486
    .line 1487
    .line 1488
    move-result v1

    .line 1489
    :goto_34
    if-nez v8, :cond_56

    .line 1490
    .line 1491
    if-eqz v3, :cond_57

    .line 1492
    .line 1493
    :cond_56
    neg-float v1, v1

    .line 1494
    :cond_57
    invoke-static {v0, v1}, Ly1/z;->q(Lf2/j;F)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    if-eqz v0, :cond_0

    .line 1499
    .line 1500
    sget-object v0, Lf2/l;->y:Lf2/x;

    .line 1501
    .line 1502
    invoke-virtual {v14, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v3

    .line 1506
    if-nez v3, :cond_59

    .line 1507
    .line 1508
    sget-object v3, Lf2/l;->A:Lf2/x;

    .line 1509
    .line 1510
    invoke-virtual {v14, v3}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v3

    .line 1514
    if-eqz v3, :cond_58

    .line 1515
    .line 1516
    goto :goto_35

    .line 1517
    :cond_58
    check-cast v13, Lfg/p;

    .line 1518
    .line 1519
    if-eqz v13, :cond_0

    .line 1520
    .line 1521
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-interface {v13, v7, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    check-cast v0, Ljava/lang/Boolean;

    .line 1530
    .line 1531
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1532
    .line 1533
    .line 1534
    move-result v0

    .line 1535
    return v0

    .line 1536
    :cond_59
    :goto_35
    cmpl-float v1, v1, v16

    .line 1537
    .line 1538
    if-lez v1, :cond_5b

    .line 1539
    .line 1540
    sget-object v0, Lf2/l;->A:Lf2/x;

    .line 1541
    .line 1542
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    if-nez v0, :cond_5a

    .line 1547
    .line 1548
    const/4 v6, 0x0

    .line 1549
    goto :goto_36

    .line 1550
    :cond_5a
    move-object v6, v0

    .line 1551
    :goto_36
    check-cast v6, Lf2/a;

    .line 1552
    .line 1553
    goto :goto_38

    .line 1554
    :cond_5b
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v0

    .line 1558
    if-nez v0, :cond_5c

    .line 1559
    .line 1560
    const/4 v6, 0x0

    .line 1561
    goto :goto_37

    .line 1562
    :cond_5c
    move-object v6, v0

    .line 1563
    :goto_37
    check-cast v6, Lf2/a;

    .line 1564
    .line 1565
    :goto_38
    if-eqz v6, :cond_0

    .line 1566
    .line 1567
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1568
    .line 1569
    check-cast v0, Lfg/a;

    .line 1570
    .line 1571
    if-eqz v0, :cond_0

    .line 1572
    .line 1573
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v0

    .line 1577
    check-cast v0, Ljava/lang/Boolean;

    .line 1578
    .line 1579
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1580
    .line 1581
    .line 1582
    move-result v0

    .line 1583
    return v0

    .line 1584
    :sswitch_a
    sget-object v0, Lf2/l;->c:Lf2/x;

    .line 1585
    .line 1586
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    if-nez v0, :cond_5d

    .line 1591
    .line 1592
    const/4 v6, 0x0

    .line 1593
    goto :goto_39

    .line 1594
    :cond_5d
    move-object v6, v0

    .line 1595
    :goto_39
    check-cast v6, Lf2/a;

    .line 1596
    .line 1597
    if-eqz v6, :cond_0

    .line 1598
    .line 1599
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1600
    .line 1601
    check-cast v0, Lfg/a;

    .line 1602
    .line 1603
    if-eqz v0, :cond_0

    .line 1604
    .line 1605
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    check-cast v0, Ljava/lang/Boolean;

    .line 1610
    .line 1611
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1612
    .line 1613
    .line 1614
    move-result v0

    .line 1615
    return v0

    .line 1616
    :sswitch_b
    sget-object v1, Lf2/l;->b:Lf2/x;

    .line 1617
    .line 1618
    invoke-virtual {v14, v1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v1

    .line 1622
    if-nez v1, :cond_5e

    .line 1623
    .line 1624
    const/4 v1, 0x0

    .line 1625
    :cond_5e
    check-cast v1, Lf2/a;

    .line 1626
    .line 1627
    if-eqz v1, :cond_5f

    .line 1628
    .line 1629
    iget-object v1, v1, Lf2/a;->b:Lsf/b;

    .line 1630
    .line 1631
    check-cast v1, Lfg/a;

    .line 1632
    .line 1633
    if-eqz v1, :cond_5f

    .line 1634
    .line 1635
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v1

    .line 1639
    check-cast v1, Ljava/lang/Boolean;

    .line 1640
    .line 1641
    move-object/from16 v17, v1

    .line 1642
    .line 1643
    :goto_3a
    const/16 v1, 0xc

    .line 1644
    .line 1645
    const/4 v3, 0x0

    .line 1646
    const/4 v5, 0x1

    .line 1647
    goto :goto_3b

    .line 1648
    :cond_5f
    const/16 v17, 0x0

    .line 1649
    .line 1650
    goto :goto_3a

    .line 1651
    :goto_3b
    invoke-static {v4, v0, v5, v3, v1}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 1652
    .line 1653
    .line 1654
    if-eqz v17, :cond_0

    .line 1655
    .line 1656
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1657
    .line 1658
    .line 1659
    move-result v0

    .line 1660
    return v0

    .line 1661
    :cond_60
    sget-object v0, Lf2/u;->l:Lf2/x;

    .line 1662
    .line 1663
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v0

    .line 1667
    if-nez v0, :cond_61

    .line 1668
    .line 1669
    const/4 v0, 0x0

    .line 1670
    :cond_61
    invoke-static {v0, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v0

    .line 1674
    if-eqz v0, :cond_0

    .line 1675
    .line 1676
    invoke-virtual {v8}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    check-cast v0, Ld1/p;

    .line 1681
    .line 1682
    const/16 v1, 0x8

    .line 1683
    .line 1684
    const/4 v5, 0x1

    .line 1685
    const/4 v13, 0x0

    .line 1686
    invoke-virtual {v0, v1, v13, v5}, Ld1/p;->b(IZZ)Z

    .line 1687
    .line 1688
    .line 1689
    return v5

    .line 1690
    :cond_62
    invoke-virtual {v8}, Landroid/view/View;->isInTouchMode()Z

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    if-eqz v0, :cond_63

    .line 1695
    .line 1696
    invoke-virtual {v8}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 1697
    .line 1698
    .line 1699
    :cond_63
    sget-object v0, Lf2/l;->w:Lf2/x;

    .line 1700
    .line 1701
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    if-nez v0, :cond_64

    .line 1706
    .line 1707
    const/4 v6, 0x0

    .line 1708
    goto :goto_3c

    .line 1709
    :cond_64
    move-object v6, v0

    .line 1710
    :goto_3c
    check-cast v6, Lf2/a;

    .line 1711
    .line 1712
    if-eqz v6, :cond_0

    .line 1713
    .line 1714
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1715
    .line 1716
    check-cast v0, Lfg/a;

    .line 1717
    .line 1718
    if-eqz v0, :cond_0

    .line 1719
    .line 1720
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v0

    .line 1724
    check-cast v0, Ljava/lang/Boolean;

    .line 1725
    .line 1726
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1727
    .line 1728
    .line 1729
    move-result v0

    .line 1730
    return v0

    .line 1731
    :cond_65
    if-eqz v3, :cond_66

    .line 1732
    .line 1733
    const-string v0, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 1734
    .line 1735
    invoke-virtual {v3, v0, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1736
    .line 1737
    .line 1738
    move-result v0

    .line 1739
    goto :goto_3d

    .line 1740
    :cond_66
    move v0, v15

    .line 1741
    :goto_3d
    if-eqz v3, :cond_67

    .line 1742
    .line 1743
    const-string v1, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 1744
    .line 1745
    invoke-virtual {v3, v1, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1746
    .line 1747
    .line 1748
    move-result v15

    .line 1749
    :cond_67
    const/4 v13, 0x0

    .line 1750
    invoke-virtual {v4, v12, v0, v15, v13}, Ly1/z;->D(Lf2/q;IIZ)Z

    .line 1751
    .line 1752
    .line 1753
    move-result v0

    .line 1754
    if-eqz v0, :cond_68

    .line 1755
    .line 1756
    invoke-virtual {v4, v11}, Ly1/z;->t(I)I

    .line 1757
    .line 1758
    .line 1759
    move-result v1

    .line 1760
    const/16 v3, 0xc

    .line 1761
    .line 1762
    const/4 v5, 0x0

    .line 1763
    invoke-static {v4, v1, v13, v5, v3}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 1764
    .line 1765
    .line 1766
    :cond_68
    return v0

    .line 1767
    :cond_69
    sget-object v0, Lf2/l;->q:Lf2/x;

    .line 1768
    .line 1769
    invoke-virtual {v14, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v0

    .line 1773
    if-nez v0, :cond_6a

    .line 1774
    .line 1775
    const/4 v6, 0x0

    .line 1776
    goto :goto_3e

    .line 1777
    :cond_6a
    move-object v6, v0

    .line 1778
    :goto_3e
    check-cast v6, Lf2/a;

    .line 1779
    .line 1780
    if-eqz v6, :cond_0

    .line 1781
    .line 1782
    iget-object v0, v6, Lf2/a;->b:Lsf/b;

    .line 1783
    .line 1784
    check-cast v0, Lfg/a;

    .line 1785
    .line 1786
    if-eqz v0, :cond_0

    .line 1787
    .line 1788
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v0

    .line 1792
    check-cast v0, Ljava/lang/Boolean;

    .line 1793
    .line 1794
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1795
    .line 1796
    .line 1797
    move-result v0

    .line 1798
    return v0

    .line 1799
    :cond_6b
    if-eqz v3, :cond_0

    .line 1800
    .line 1801
    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 1802
    .line 1803
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1804
    .line 1805
    .line 1806
    move-result v0

    .line 1807
    const-string v6, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 1808
    .line 1809
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v3

    .line 1813
    if-ne v1, v5, :cond_6c

    .line 1814
    .line 1815
    const/4 v1, 0x1

    .line 1816
    goto :goto_3f

    .line 1817
    :cond_6c
    const/4 v1, 0x0

    .line 1818
    :goto_3f
    iget-object v6, v4, Ly1/z;->A:Ljava/lang/Integer;

    .line 1819
    .line 1820
    if-nez v6, :cond_6d

    .line 1821
    .line 1822
    goto :goto_40

    .line 1823
    :cond_6d
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1824
    .line 1825
    .line 1826
    move-result v6

    .line 1827
    if-eq v11, v6, :cond_6e

    .line 1828
    .line 1829
    :goto_40
    iput v15, v4, Ly1/z;->z:I

    .line 1830
    .line 1831
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v6

    .line 1835
    iput-object v6, v4, Ly1/z;->A:Ljava/lang/Integer;

    .line 1836
    .line 1837
    :cond_6e
    invoke-static {v12}, Ly1/z;->m(Lf2/q;)Ljava/lang/String;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v6

    .line 1841
    if-eqz v6, :cond_0

    .line 1842
    .line 1843
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1844
    .line 1845
    .line 1846
    move-result v7

    .line 1847
    if-nez v7, :cond_6f

    .line 1848
    .line 1849
    goto/16 :goto_0

    .line 1850
    .line 1851
    :cond_6f
    invoke-static {v12}, Ly1/z;->m(Lf2/q;)Ljava/lang/String;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v7

    .line 1855
    if-eqz v7, :cond_71

    .line 1856
    .line 1857
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1858
    .line 1859
    .line 1860
    move-result v9

    .line 1861
    if-nez v9, :cond_70

    .line 1862
    .line 1863
    goto :goto_41

    .line 1864
    :cond_70
    const/4 v9, 0x1

    .line 1865
    if-eq v0, v9, :cond_7c

    .line 1866
    .line 1867
    const/4 v9, 0x2

    .line 1868
    if-eq v0, v9, :cond_7a

    .line 1869
    .line 1870
    const/4 v8, 0x4

    .line 1871
    if-eq v0, v8, :cond_74

    .line 1872
    .line 1873
    const/16 v9, 0x8

    .line 1874
    .line 1875
    if-eq v0, v9, :cond_72

    .line 1876
    .line 1877
    const/16 v9, 0x10

    .line 1878
    .line 1879
    if-eq v0, v9, :cond_74

    .line 1880
    .line 1881
    :cond_71
    :goto_41
    const/4 v8, 0x0

    .line 1882
    goto/16 :goto_42

    .line 1883
    .line 1884
    :cond_72
    sget-object v8, Ly1/e;->c:Ly1/e;

    .line 1885
    .line 1886
    if-nez v8, :cond_73

    .line 1887
    .line 1888
    new-instance v8, Ly1/e;

    .line 1889
    .line 1890
    invoke-direct {v8}, Ly1/b;-><init>()V

    .line 1891
    .line 1892
    .line 1893
    sput-object v8, Ly1/e;->c:Ly1/e;

    .line 1894
    .line 1895
    :cond_73
    sget-object v8, Ly1/e;->c:Ly1/e;

    .line 1896
    .line 1897
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1898
    .line 1899
    .line 1900
    iput-object v7, v8, Ly1/b;->a:Ljava/lang/String;

    .line 1901
    .line 1902
    goto/16 :goto_42

    .line 1903
    .line 1904
    :cond_74
    sget-object v9, Lf2/l;->a:Lf2/x;

    .line 1905
    .line 1906
    invoke-virtual {v14, v9}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1907
    .line 1908
    .line 1909
    move-result v9

    .line 1910
    if-nez v9, :cond_75

    .line 1911
    .line 1912
    goto :goto_41

    .line 1913
    :cond_75
    invoke-static {v13}, Ly1/g0;->o(Lf2/m;)Li2/k0;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v9

    .line 1917
    if-nez v9, :cond_76

    .line 1918
    .line 1919
    goto :goto_41

    .line 1920
    :cond_76
    if-ne v0, v8, :cond_78

    .line 1921
    .line 1922
    sget-object v8, Ly1/c;->g:Ly1/c;

    .line 1923
    .line 1924
    if-nez v8, :cond_77

    .line 1925
    .line 1926
    new-instance v8, Ly1/c;

    .line 1927
    .line 1928
    const/4 v11, 0x2

    .line 1929
    invoke-direct {v8, v11}, Ly1/c;-><init>(I)V

    .line 1930
    .line 1931
    .line 1932
    sput-object v8, Ly1/c;->g:Ly1/c;

    .line 1933
    .line 1934
    :cond_77
    sget-object v8, Ly1/c;->g:Ly1/c;

    .line 1935
    .line 1936
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1937
    .line 1938
    .line 1939
    iput-object v7, v8, Ly1/b;->a:Ljava/lang/String;

    .line 1940
    .line 1941
    iput-object v9, v8, Ly1/c;->d:Ljava/lang/Object;

    .line 1942
    .line 1943
    goto :goto_42

    .line 1944
    :cond_78
    sget-object v8, Ly1/d;->e:Ly1/d;

    .line 1945
    .line 1946
    if-nez v8, :cond_79

    .line 1947
    .line 1948
    new-instance v8, Ly1/d;

    .line 1949
    .line 1950
    invoke-direct {v8}, Ly1/b;-><init>()V

    .line 1951
    .line 1952
    .line 1953
    new-instance v11, Landroid/graphics/Rect;

    .line 1954
    .line 1955
    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 1956
    .line 1957
    .line 1958
    sput-object v8, Ly1/d;->e:Ly1/d;

    .line 1959
    .line 1960
    :cond_79
    sget-object v8, Ly1/d;->e:Ly1/d;

    .line 1961
    .line 1962
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1963
    .line 1964
    .line 1965
    iput-object v7, v8, Ly1/b;->a:Ljava/lang/String;

    .line 1966
    .line 1967
    iput-object v9, v8, Ly1/d;->c:Li2/k0;

    .line 1968
    .line 1969
    iput-object v12, v8, Ly1/d;->d:Lf2/q;

    .line 1970
    .line 1971
    goto :goto_42

    .line 1972
    :cond_7a
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v8

    .line 1976
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v8

    .line 1980
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v8

    .line 1984
    iget-object v8, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1985
    .line 1986
    sget-object v9, Ly1/c;->f:Ly1/c;

    .line 1987
    .line 1988
    if-nez v9, :cond_7b

    .line 1989
    .line 1990
    new-instance v9, Ly1/c;

    .line 1991
    .line 1992
    const/4 v11, 0x1

    .line 1993
    invoke-direct {v9, v11}, Ly1/c;-><init>(I)V

    .line 1994
    .line 1995
    .line 1996
    invoke-static {v8}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v8

    .line 2000
    iput-object v8, v9, Ly1/c;->d:Ljava/lang/Object;

    .line 2001
    .line 2002
    sput-object v9, Ly1/c;->f:Ly1/c;

    .line 2003
    .line 2004
    :cond_7b
    sget-object v8, Ly1/c;->f:Ly1/c;

    .line 2005
    .line 2006
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v8, v7}, Ly1/c;->f(Ljava/lang/String;)V

    .line 2010
    .line 2011
    .line 2012
    goto :goto_42

    .line 2013
    :cond_7c
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v8

    .line 2017
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v8

    .line 2021
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v8

    .line 2025
    iget-object v8, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 2026
    .line 2027
    sget-object v9, Ly1/c;->e:Ly1/c;

    .line 2028
    .line 2029
    if-nez v9, :cond_7d

    .line 2030
    .line 2031
    new-instance v9, Ly1/c;

    .line 2032
    .line 2033
    const/4 v11, 0x0

    .line 2034
    invoke-direct {v9, v11}, Ly1/c;-><init>(I)V

    .line 2035
    .line 2036
    .line 2037
    invoke-static {v8}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v8

    .line 2041
    iput-object v8, v9, Ly1/c;->d:Ljava/lang/Object;

    .line 2042
    .line 2043
    sput-object v9, Ly1/c;->e:Ly1/c;

    .line 2044
    .line 2045
    :cond_7d
    sget-object v8, Ly1/c;->e:Ly1/c;

    .line 2046
    .line 2047
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v8, v7}, Ly1/c;->f(Ljava/lang/String;)V

    .line 2051
    .line 2052
    .line 2053
    :goto_42
    if-nez v8, :cond_7e

    .line 2054
    .line 2055
    goto/16 :goto_0

    .line 2056
    .line 2057
    :cond_7e
    invoke-virtual {v4, v12}, Ly1/z;->j(Lf2/q;)I

    .line 2058
    .line 2059
    .line 2060
    move-result v7

    .line 2061
    if-ne v7, v15, :cond_80

    .line 2062
    .line 2063
    if-eqz v1, :cond_7f

    .line 2064
    .line 2065
    const/4 v6, 0x0

    .line 2066
    goto :goto_43

    .line 2067
    :cond_7f
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2068
    .line 2069
    .line 2070
    move-result v6

    .line 2071
    :goto_43
    move v7, v6

    .line 2072
    :cond_80
    if-eqz v1, :cond_81

    .line 2073
    .line 2074
    invoke-virtual {v8, v7}, Ly1/b;->a(I)[I

    .line 2075
    .line 2076
    .line 2077
    move-result-object v6

    .line 2078
    goto :goto_44

    .line 2079
    :cond_81
    invoke-virtual {v8, v7}, Ly1/b;->d(I)[I

    .line 2080
    .line 2081
    .line 2082
    move-result-object v6

    .line 2083
    :goto_44
    if-nez v6, :cond_82

    .line 2084
    .line 2085
    goto/16 :goto_0

    .line 2086
    .line 2087
    :cond_82
    const/16 v18, 0x0

    .line 2088
    .line 2089
    aget v7, v6, v18

    .line 2090
    .line 2091
    const/16 v19, 0x1

    .line 2092
    .line 2093
    aget v16, v6, v19

    .line 2094
    .line 2095
    if-eqz v3, :cond_86

    .line 2096
    .line 2097
    sget-object v3, Lf2/u;->a:Lf2/x;

    .line 2098
    .line 2099
    invoke-virtual {v14, v3}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2100
    .line 2101
    .line 2102
    move-result v3

    .line 2103
    if-nez v3, :cond_86

    .line 2104
    .line 2105
    sget-object v3, Lf2/u;->F:Lf2/x;

    .line 2106
    .line 2107
    invoke-virtual {v14, v3}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2108
    .line 2109
    .line 2110
    move-result v3

    .line 2111
    if-eqz v3, :cond_86

    .line 2112
    .line 2113
    invoke-virtual {v4, v12}, Ly1/z;->k(Lf2/q;)I

    .line 2114
    .line 2115
    .line 2116
    move-result v3

    .line 2117
    if-ne v3, v15, :cond_84

    .line 2118
    .line 2119
    if-eqz v1, :cond_83

    .line 2120
    .line 2121
    move v3, v7

    .line 2122
    goto :goto_45

    .line 2123
    :cond_83
    move/from16 v3, v16

    .line 2124
    .line 2125
    :cond_84
    :goto_45
    if-eqz v1, :cond_85

    .line 2126
    .line 2127
    move/from16 v6, v16

    .line 2128
    .line 2129
    goto :goto_47

    .line 2130
    :cond_85
    move v6, v7

    .line 2131
    goto :goto_47

    .line 2132
    :cond_86
    if-eqz v1, :cond_87

    .line 2133
    .line 2134
    move/from16 v3, v16

    .line 2135
    .line 2136
    goto :goto_46

    .line 2137
    :cond_87
    move v3, v7

    .line 2138
    :goto_46
    move v6, v3

    .line 2139
    :goto_47
    if-eqz v1, :cond_88

    .line 2140
    .line 2141
    move v13, v5

    .line 2142
    goto :goto_48

    .line 2143
    :cond_88
    move v13, v10

    .line 2144
    :goto_48
    new-instance v11, Ly1/v;

    .line 2145
    .line 2146
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2147
    .line 2148
    .line 2149
    move-result-wide v17

    .line 2150
    move v14, v0

    .line 2151
    move v15, v7

    .line 2152
    invoke-direct/range {v11 .. v18}, Ly1/v;-><init>(Lf2/q;IIIIJ)V

    .line 2153
    .line 2154
    .line 2155
    iput-object v11, v4, Ly1/z;->E:Ly1/v;

    .line 2156
    .line 2157
    const/4 v5, 0x1

    .line 2158
    invoke-virtual {v4, v12, v3, v6, v5}, Ly1/z;->D(Lf2/q;IIZ)Z

    .line 2159
    .line 2160
    .line 2161
    return v5

    .line 2162
    :cond_89
    iget v1, v4, Ly1/z;->q:I

    .line 2163
    .line 2164
    if-ne v1, v0, :cond_8a

    .line 2165
    .line 2166
    const/4 v1, 0x1

    .line 2167
    goto :goto_49

    .line 2168
    :cond_8a
    const/4 v1, 0x0

    .line 2169
    :goto_49
    if-eqz v1, :cond_0

    .line 2170
    .line 2171
    iput v15, v4, Ly1/z;->q:I

    .line 2172
    .line 2173
    const/4 v3, 0x0

    .line 2174
    iput-object v3, v4, Ly1/z;->s:Lh3/g;

    .line 2175
    .line 2176
    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    .line 2177
    .line 2178
    .line 2179
    const/high16 v1, 0x10000

    .line 2180
    .line 2181
    const/16 v5, 0xc

    .line 2182
    .line 2183
    invoke-static {v4, v0, v1, v3, v5}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 2184
    .line 2185
    .line 2186
    :goto_4a
    const/16 v19, 0x1

    .line 2187
    .line 2188
    return v19

    .line 2189
    :cond_8b
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 2190
    .line 2191
    .line 2192
    move-result v1

    .line 2193
    if-eqz v1, :cond_8c

    .line 2194
    .line 2195
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 2196
    .line 2197
    .line 2198
    move-result v1

    .line 2199
    if-eqz v1, :cond_8c

    .line 2200
    .line 2201
    const/4 v5, 0x1

    .line 2202
    goto :goto_4b

    .line 2203
    :cond_8c
    const/4 v5, 0x0

    .line 2204
    :goto_4b
    if-nez v5, :cond_8d

    .line 2205
    .line 2206
    goto/16 :goto_0

    .line 2207
    .line 2208
    :cond_8d
    iget v1, v4, Ly1/z;->q:I

    .line 2209
    .line 2210
    if-ne v1, v0, :cond_8e

    .line 2211
    .line 2212
    const/4 v5, 0x1

    .line 2213
    goto :goto_4c

    .line 2214
    :cond_8e
    const/4 v5, 0x0

    .line 2215
    :goto_4c
    if-nez v5, :cond_0

    .line 2216
    .line 2217
    if-eq v1, v15, :cond_8f

    .line 2218
    .line 2219
    const/high16 v3, 0x10000

    .line 2220
    .line 2221
    const/16 v5, 0xc

    .line 2222
    .line 2223
    const/4 v6, 0x0

    .line 2224
    invoke-static {v4, v1, v3, v6, v5}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 2225
    .line 2226
    .line 2227
    goto :goto_4d

    .line 2228
    :cond_8f
    const/16 v5, 0xc

    .line 2229
    .line 2230
    const/4 v6, 0x0

    .line 2231
    :goto_4d
    iput v0, v4, Ly1/z;->q:I

    .line 2232
    .line 2233
    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    .line 2234
    .line 2235
    .line 2236
    const v1, 0x8000

    .line 2237
    .line 2238
    .line 2239
    invoke-static {v4, v0, v1, v6, v5}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 2240
    .line 2241
    .line 2242
    goto :goto_4a

    .line 2243
    :goto_4e
    return v18

    .line 2244
    nop

    .line 2245
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_0
        0x8000 -> :sswitch_9
        0x10000 -> :sswitch_8
        0x40000 -> :sswitch_7
        0x80000 -> :sswitch_6
        0x100000 -> :sswitch_5
        0x200000 -> :sswitch_4
        0x1020036 -> :sswitch_3
        0x102003d -> :sswitch_2
        0x1020054 -> :sswitch_1
    .end sparse-switch

    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(ILh3/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/u;->i:Ly1/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ly1/z;->c(ILh3/g;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(I)Lh3/g;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ly1/u;->i:Ly1/z;

    .line 6
    .line 7
    iget-object v3, v2, Ly1/z;->m:Landroid/view/accessibility/AccessibilityManager;

    .line 8
    .line 9
    iget-object v4, v2, Ly1/z;->j:Ly1/t;

    .line 10
    .line 11
    invoke-virtual {v4}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    iget-object v5, v5, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 16
    .line 17
    invoke-interface {v5}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v5, v5, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 22
    .line 23
    sget-object v6, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 24
    .line 25
    if-ne v5, v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v7, Lh3/g;

    .line 38
    .line 39
    invoke-direct {v7, v3}, Lh3/g;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v7, 0x0

    .line 44
    :goto_0
    move v5, v1

    .line 45
    move-object v12, v2

    .line 46
    goto/16 :goto_5d

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v2}, Ly1/z;->l()Lf/k;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5, v1}, Lf/k;->b(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lf2/r;

    .line 57
    .line 58
    if-nez v5, :cond_2

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v7, Lh3/g;

    .line 71
    .line 72
    invoke-direct {v7, v3}, Lh3/g;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object v6, v5, Lf2/r;->a:Lf2/q;

    .line 77
    .line 78
    invoke-virtual {v6}, Lf2/q;->k()Lf2/m;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    iget-object v9, v6, Lf2/q;->c:Lx1/f0;

    .line 83
    .line 84
    sget-object v10, Lf2/u;->n:Lf2/x;

    .line 85
    .line 86
    iget-object v8, v8, Lf2/m;->g:Lf/k0;

    .line 87
    .line 88
    invoke-virtual {v8, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    if-nez v8, :cond_3

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    :cond_3
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    const/16 v10, 0x22

    .line 102
    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    if-lt v12, v10, :cond_4

    .line 108
    .line 109
    invoke-static {v3}, Lh3/b;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    goto :goto_1

    .line 114
    :cond_4
    const/4 v12, 0x1

    .line 115
    :goto_1
    if-nez v12, :cond_5

    .line 116
    .line 117
    move v5, v1

    .line 118
    move-object v12, v2

    .line 119
    const/4 v7, 0x0

    .line 120
    goto/16 :goto_5d

    .line 121
    .line 122
    :cond_5
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    new-instance v13, Lh3/g;

    .line 127
    .line 128
    invoke-direct {v13, v12}, Lh3/g;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 129
    .line 130
    .line 131
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    if-lt v14, v10, :cond_6

    .line 134
    .line 135
    invoke-static {v12, v8}, Lh3/b;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    const/16 v15, 0x40

    .line 140
    .line 141
    invoke-virtual {v13, v15, v8}, Lh3/g;->f(IZ)V

    .line 142
    .line 143
    .line 144
    :goto_2
    const/4 v8, -0x1

    .line 145
    if-ne v1, v8, :cond_8

    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    instance-of v7, v15, Landroid/view/View;

    .line 154
    .line 155
    if-eqz v7, :cond_7

    .line 156
    .line 157
    move-object v7, v15

    .line 158
    check-cast v7, Landroid/view/View;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    move-object/from16 v7, v16

    .line 162
    .line 163
    :goto_3
    iput v8, v13, Lh3/g;->b:I

    .line 164
    .line 165
    invoke-virtual {v12, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    const/16 v16, 0x0

    .line 170
    .line 171
    invoke-virtual {v6}, Lf2/q;->l()Lf2/q;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    if-eqz v7, :cond_9

    .line 176
    .line 177
    iget v7, v7, Lf2/q;->f:I

    .line 178
    .line 179
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    goto :goto_4

    .line 184
    :cond_9
    move-object/from16 v7, v16

    .line 185
    .line 186
    :goto_4
    if-eqz v7, :cond_ba

    .line 187
    .line 188
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-virtual {v4}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    invoke-virtual {v15}, Lf2/s;->a()Lf2/q;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    iget v15, v15, Lf2/q;->f:I

    .line 201
    .line 202
    if-ne v7, v15, :cond_a

    .line 203
    .line 204
    move v7, v8

    .line 205
    :cond_a
    iput v7, v13, Lh3/g;->b:I

    .line 206
    .line 207
    invoke-virtual {v12, v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 208
    .line 209
    .line 210
    :goto_5
    iput v1, v13, Lh3/g;->c:I

    .line 211
    .line 212
    invoke-virtual {v12, v4, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v5}, Ly1/z;->d(Lf2/r;)Landroid/graphics/Rect;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v12, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 220
    .line 221
    .line 222
    iget-object v5, v2, Ly1/z;->P:Lf/u;

    .line 223
    .line 224
    iget-object v7, v2, Ly1/z;->y:Lf/t0;

    .line 225
    .line 226
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    const-string v11, "android.view.View"

    .line 235
    .line 236
    invoke-virtual {v13, v11}, Lh3/g;->g(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    iget-object v11, v6, Lf2/q;->d:Lf2/m;

    .line 240
    .line 241
    iget-object v8, v11, Lf2/m;->g:Lf/k0;

    .line 242
    .line 243
    sget-object v10, Lf2/u;->F:Lf2/x;

    .line 244
    .line 245
    invoke-virtual {v8, v10}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    if-eqz v10, :cond_b

    .line 250
    .line 251
    const-string v10, "android.widget.EditText"

    .line 252
    .line 253
    invoke-virtual {v13, v10}, Lh3/g;->g(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :cond_b
    sget-object v10, Lf2/u;->B:Lf2/x;

    .line 257
    .line 258
    invoke-virtual {v8, v10}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-eqz v10, :cond_c

    .line 263
    .line 264
    const-string v10, "android.widget.TextView"

    .line 265
    .line 266
    invoke-virtual {v13, v10}, Lh3/g;->g(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :cond_c
    sget-object v10, Lf2/u;->y:Lf2/x;

    .line 270
    .line 271
    invoke-virtual {v8, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    if-nez v10, :cond_d

    .line 276
    .line 277
    move-object/from16 v10, v16

    .line 278
    .line 279
    :cond_d
    check-cast v10, Lf2/i;

    .line 280
    .line 281
    if-eqz v10, :cond_12

    .line 282
    .line 283
    iget v0, v10, Lf2/i;->a:I

    .line 284
    .line 285
    invoke-virtual {v6}, Lf2/q;->o()Z

    .line 286
    .line 287
    .line 288
    move-result v19

    .line 289
    if-nez v19, :cond_e

    .line 290
    .line 291
    move-object/from16 v19, v3

    .line 292
    .line 293
    const/4 v3, 0x4

    .line 294
    invoke-static {v3, v6}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v18

    .line 298
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v18

    .line 302
    move-object/from16 v20, v7

    .line 303
    .line 304
    if-eqz v18, :cond_13

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_e
    move-object/from16 v19, v3

    .line 308
    .line 309
    const/4 v3, 0x4

    .line 310
    move-object/from16 v20, v7

    .line 311
    .line 312
    :goto_6
    const-string v7, "AccessibilityNodeInfo.roleDescription"

    .line 313
    .line 314
    if-ne v0, v3, :cond_f

    .line 315
    .line 316
    const v0, 0x7f09001d

    .line 317
    .line 318
    .line 319
    invoke-virtual {v15, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-virtual {v3, v7, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_f
    const/4 v3, 0x2

    .line 332
    if-ne v0, v3, :cond_10

    .line 333
    .line 334
    const v0, 0x7f09001c

    .line 335
    .line 336
    .line 337
    invoke-virtual {v15, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-virtual {v3, v7, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 346
    .line 347
    .line 348
    goto :goto_7

    .line 349
    :cond_10
    invoke-static {v0}, Ly1/g0;->v(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    const/4 v7, 0x5

    .line 354
    if-ne v0, v7, :cond_11

    .line 355
    .line 356
    invoke-virtual {v6}, Lf2/q;->q()Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-nez v0, :cond_11

    .line 361
    .line 362
    iget-boolean v0, v11, Lf2/m;->i:Z

    .line 363
    .line 364
    if-eqz v0, :cond_13

    .line 365
    .line 366
    :cond_11
    invoke-virtual {v13, v3}, Lh3/g;->g(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_12
    move-object/from16 v19, v3

    .line 371
    .line 372
    move-object/from16 v20, v7

    .line 373
    .line 374
    :cond_13
    :goto_7
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v12, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 383
    .line 384
    .line 385
    invoke-static {v6}, Lf2/t;->h(Lf2/q;)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    invoke-virtual {v12, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 390
    .line 391
    .line 392
    const/16 v0, 0x22

    .line 393
    .line 394
    if-lt v14, v0, :cond_14

    .line 395
    .line 396
    invoke-static/range {v19 .. v19}, Lh3/b;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    :goto_8
    const/4 v3, 0x4

    .line 401
    goto :goto_9

    .line 402
    :cond_14
    const/4 v0, 0x1

    .line 403
    goto :goto_8

    .line 404
    :goto_9
    invoke-static {v3, v6}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    move/from16 v19, v0

    .line 413
    .line 414
    const/4 v0, 0x0

    .line 415
    const/4 v14, 0x0

    .line 416
    :goto_a
    if-ge v14, v3, :cond_1c

    .line 417
    .line 418
    invoke-interface {v7, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v21

    .line 422
    move/from16 v22, v3

    .line 423
    .line 424
    move-object/from16 v3, v21

    .line 425
    .line 426
    check-cast v3, Lf2/q;

    .line 427
    .line 428
    move-object/from16 v21, v7

    .line 429
    .line 430
    invoke-virtual {v2}, Ly1/z;->l()Lf/k;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    move/from16 v23, v14

    .line 435
    .line 436
    iget v14, v3, Lf2/q;->f:I

    .line 437
    .line 438
    invoke-virtual {v7, v14}, Lf/k;->a(I)Z

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    if-eqz v7, :cond_1b

    .line 443
    .line 444
    invoke-virtual {v4}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-virtual {v7}, Ly1/r0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    iget-object v3, v3, Lf2/q;->c:Lx1/f0;

    .line 453
    .line 454
    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    check-cast v3, Lx2/h;

    .line 459
    .line 460
    const/4 v7, -0x1

    .line 461
    if-ne v14, v7, :cond_15

    .line 462
    .line 463
    goto :goto_d

    .line 464
    :cond_15
    if-eqz v3, :cond_16

    .line 465
    .line 466
    invoke-virtual {v12, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    .line 467
    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_16
    invoke-virtual {v2}, Ly1/z;->l()Lf/k;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v3, v14}, Lf/k;->b(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    check-cast v3, Lf2/r;

    .line 479
    .line 480
    if-eqz v3, :cond_18

    .line 481
    .line 482
    iget-object v3, v3, Lf2/r;->a:Lf2/q;

    .line 483
    .line 484
    if-eqz v3, :cond_18

    .line 485
    .line 486
    invoke-virtual {v3}, Lf2/q;->k()Lf2/m;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    sget-object v7, Lf2/u;->n:Lf2/x;

    .line 491
    .line 492
    iget-object v3, v3, Lf2/m;->g:Lf/k0;

    .line 493
    .line 494
    invoke-virtual {v3, v7}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    if-nez v3, :cond_17

    .line 499
    .line 500
    move-object/from16 v3, v16

    .line 501
    .line 502
    :cond_17
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 503
    .line 504
    invoke-static {v3, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    goto :goto_b

    .line 509
    :cond_18
    const/4 v3, 0x0

    .line 510
    :goto_b
    if-nez v19, :cond_19

    .line 511
    .line 512
    if-nez v3, :cond_1a

    .line 513
    .line 514
    :cond_19
    invoke-virtual {v12, v4, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 515
    .line 516
    .line 517
    :cond_1a
    :goto_c
    invoke-virtual {v5, v14, v0}, Lf/u;->f(II)V

    .line 518
    .line 519
    .line 520
    add-int/lit8 v0, v0, 0x1

    .line 521
    .line 522
    :cond_1b
    :goto_d
    add-int/lit8 v14, v23, 0x1

    .line 523
    .line 524
    move-object/from16 v7, v21

    .line 525
    .line 526
    move/from16 v3, v22

    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_1c
    iget v0, v2, Ly1/z;->q:I

    .line 530
    .line 531
    iget-object v3, v13, Lh3/g;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 532
    .line 533
    if-ne v1, v0, :cond_1d

    .line 534
    .line 535
    const/4 v0, 0x1

    .line 536
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 537
    .line 538
    .line 539
    sget-object v0, Lh3/e;->d:Lh3/e;

    .line 540
    .line 541
    invoke-virtual {v13, v0}, Lh3/g;->a(Lh3/e;)V

    .line 542
    .line 543
    .line 544
    goto :goto_e

    .line 545
    :cond_1d
    const/4 v0, 0x0

    .line 546
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 547
    .line 548
    .line 549
    sget-object v0, Lh3/e;->c:Lh3/e;

    .line 550
    .line 551
    invoke-virtual {v13, v0}, Lh3/g;->a(Lh3/e;)V

    .line 552
    .line 553
    .line 554
    :goto_e
    invoke-static {v6}, Ly1/g0;->m(Lf2/q;)Li2/g;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    if-eqz v0, :cond_38

    .line 559
    .line 560
    invoke-virtual {v4}, Ly1/t;->getFontFamilyResolver()Lm2/d;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v4}, Ly1/t;->getDensity()Lu2/c;

    .line 564
    .line 565
    .line 566
    move-result-object v24

    .line 567
    iget-object v7, v2, Ly1/z;->L:Lb5/c;

    .line 568
    .line 569
    new-instance v14, Landroid/text/SpannableString;

    .line 570
    .line 571
    move-object/from16 v19, v4

    .line 572
    .line 573
    iget-object v4, v0, Li2/g;->h:Ljava/lang/String;

    .line 574
    .line 575
    move-object/from16 v27, v9

    .line 576
    .line 577
    iget-object v9, v0, Li2/g;->g:Ljava/util/List;

    .line 578
    .line 579
    invoke-direct {v14, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 580
    .line 581
    .line 582
    move-object/from16 v28, v4

    .line 583
    .line 584
    iget-object v4, v0, Li2/g;->i:Ljava/util/ArrayList;

    .line 585
    .line 586
    move-object/from16 v29, v2

    .line 587
    .line 588
    if-eqz v4, :cond_29

    .line 589
    .line 590
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    move-object/from16 v30, v5

    .line 595
    .line 596
    const/4 v5, 0x0

    .line 597
    :goto_f
    if-ge v5, v2, :cond_28

    .line 598
    .line 599
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v21

    .line 603
    move/from16 v31, v2

    .line 604
    .line 605
    move-object/from16 v2, v21

    .line 606
    .line 607
    check-cast v2, Li2/e;

    .line 608
    .line 609
    move-object/from16 v32, v4

    .line 610
    .line 611
    iget-object v4, v2, Li2/e;->a:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v4, Li2/f0;

    .line 614
    .line 615
    move/from16 v33, v5

    .line 616
    .line 617
    iget v5, v2, Li2/e;->b:I

    .line 618
    .line 619
    iget v2, v2, Li2/e;->c:I

    .line 620
    .line 621
    iget-object v1, v4, Li2/f0;->a:Lt2/o;

    .line 622
    .line 623
    move-object/from16 v35, v10

    .line 624
    .line 625
    move-object/from16 v34, v11

    .line 626
    .line 627
    invoke-interface {v1}, Lt2/o;->b()J

    .line 628
    .line 629
    .line 630
    move-result-wide v10

    .line 631
    move-object v1, v12

    .line 632
    move-object/from16 v36, v13

    .line 633
    .line 634
    iget-wide v12, v4, Li2/f0;->b:J

    .line 635
    .line 636
    move-object/from16 v37, v1

    .line 637
    .line 638
    iget-object v1, v4, Li2/f0;->c:Lm2/k;

    .line 639
    .line 640
    move-object/from16 v38, v1

    .line 641
    .line 642
    iget-object v1, v4, Li2/f0;->d:Lm2/i;

    .line 643
    .line 644
    move-wide/from16 v22, v12

    .line 645
    .line 646
    iget-object v12, v4, Li2/f0;->j:Lt2/p;

    .line 647
    .line 648
    iget-object v13, v4, Li2/f0;->k:Lp2/b;

    .line 649
    .line 650
    move-object/from16 v39, v6

    .line 651
    .line 652
    move-object/from16 v40, v7

    .line 653
    .line 654
    iget-wide v6, v4, Li2/f0;->l:J

    .line 655
    .line 656
    move-wide/from16 v41, v6

    .line 657
    .line 658
    iget-object v6, v4, Li2/f0;->m:Lt2/l;

    .line 659
    .line 660
    iget-object v4, v4, Li2/f0;->a:Lt2/o;

    .line 661
    .line 662
    move-object/from16 v43, v8

    .line 663
    .line 664
    invoke-interface {v4}, Lt2/o;->b()J

    .line 665
    .line 666
    .line 667
    move-result-wide v7

    .line 668
    invoke-static {v10, v11, v7, v8}, Lf1/w;->c(JJ)Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    const-wide/16 v44, 0x10

    .line 673
    .line 674
    if-eqz v7, :cond_1e

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :cond_1e
    cmp-long v4, v10, v44

    .line 678
    .line 679
    if-eqz v4, :cond_1f

    .line 680
    .line 681
    new-instance v4, Lt2/c;

    .line 682
    .line 683
    invoke-direct {v4, v10, v11}, Lt2/c;-><init>(J)V

    .line 684
    .line 685
    .line 686
    goto :goto_10

    .line 687
    :cond_1f
    sget-object v4, Lt2/n;->a:Lt2/n;

    .line 688
    .line 689
    :goto_10
    invoke-interface {v4}, Lt2/o;->b()J

    .line 690
    .line 691
    .line 692
    move-result-wide v7

    .line 693
    invoke-static {v14, v7, v8, v5, v2}, Lf8/i;->C0(Landroid/text/Spannable;JII)V

    .line 694
    .line 695
    .line 696
    move/from16 v26, v2

    .line 697
    .line 698
    move/from16 v25, v5

    .line 699
    .line 700
    move-object/from16 v21, v14

    .line 701
    .line 702
    invoke-static/range {v21 .. v26}, Lf8/i;->D0(Landroid/text/Spannable;JLu2/c;II)V

    .line 703
    .line 704
    .line 705
    move-object/from16 v2, v21

    .line 706
    .line 707
    move/from16 v4, v25

    .line 708
    .line 709
    move/from16 v5, v26

    .line 710
    .line 711
    if-nez v38, :cond_21

    .line 712
    .line 713
    if-eqz v1, :cond_20

    .line 714
    .line 715
    goto :goto_11

    .line 716
    :cond_20
    const/16 v1, 0x21

    .line 717
    .line 718
    goto :goto_14

    .line 719
    :cond_21
    :goto_11
    if-nez v38, :cond_22

    .line 720
    .line 721
    sget-object v7, Lm2/k;->i:Lm2/k;

    .line 722
    .line 723
    goto :goto_12

    .line 724
    :cond_22
    move-object/from16 v7, v38

    .line 725
    .line 726
    :goto_12
    if-eqz v1, :cond_23

    .line 727
    .line 728
    iget v1, v1, Lm2/i;->a:I

    .line 729
    .line 730
    goto :goto_13

    .line 731
    :cond_23
    const/4 v1, 0x0

    .line 732
    :goto_13
    new-instance v8, Landroid/text/style/StyleSpan;

    .line 733
    .line 734
    invoke-static {v7, v1}, Lg4/a;->q(Lm2/k;I)I

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    invoke-direct {v8, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 739
    .line 740
    .line 741
    const/16 v1, 0x21

    .line 742
    .line 743
    invoke-virtual {v2, v8, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 744
    .line 745
    .line 746
    :goto_14
    if-eqz v6, :cond_25

    .line 747
    .line 748
    iget v6, v6, Lt2/l;->a:I

    .line 749
    .line 750
    or-int/lit8 v7, v6, 0x1

    .line 751
    .line 752
    if-ne v7, v6, :cond_24

    .line 753
    .line 754
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 755
    .line 756
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2, v7, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 760
    .line 761
    .line 762
    :cond_24
    or-int/lit8 v7, v6, 0x2

    .line 763
    .line 764
    if-ne v7, v6, :cond_25

    .line 765
    .line 766
    new-instance v6, Landroid/text/style/StrikethroughSpan;

    .line 767
    .line 768
    invoke-direct {v6}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2, v6, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 772
    .line 773
    .line 774
    :cond_25
    if-eqz v12, :cond_26

    .line 775
    .line 776
    new-instance v6, Landroid/text/style/ScaleXSpan;

    .line 777
    .line 778
    iget v7, v12, Lt2/p;->a:F

    .line 779
    .line 780
    invoke-direct {v6, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v6, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 784
    .line 785
    .line 786
    :cond_26
    invoke-static {v2, v13, v4, v5}, Lf8/i;->E0(Landroid/text/Spannable;Lp2/b;II)V

    .line 787
    .line 788
    .line 789
    cmp-long v6, v41, v44

    .line 790
    .line 791
    if-eqz v6, :cond_27

    .line 792
    .line 793
    new-instance v6, Landroid/text/style/BackgroundColorSpan;

    .line 794
    .line 795
    invoke-static/range {v41 .. v42}, Lf1/c0;->w(J)I

    .line 796
    .line 797
    .line 798
    move-result v7

    .line 799
    invoke-direct {v6, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2, v6, v4, v5, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 803
    .line 804
    .line 805
    :cond_27
    add-int/lit8 v5, v33, 0x1

    .line 806
    .line 807
    move/from16 v1, p1

    .line 808
    .line 809
    move-object v14, v2

    .line 810
    move/from16 v2, v31

    .line 811
    .line 812
    move-object/from16 v4, v32

    .line 813
    .line 814
    move-object/from16 v11, v34

    .line 815
    .line 816
    move-object/from16 v10, v35

    .line 817
    .line 818
    move-object/from16 v13, v36

    .line 819
    .line 820
    move-object/from16 v12, v37

    .line 821
    .line 822
    move-object/from16 v6, v39

    .line 823
    .line 824
    move-object/from16 v7, v40

    .line 825
    .line 826
    move-object/from16 v8, v43

    .line 827
    .line 828
    goto/16 :goto_f

    .line 829
    .line 830
    :cond_28
    :goto_15
    move-object/from16 v39, v6

    .line 831
    .line 832
    move-object/from16 v40, v7

    .line 833
    .line 834
    move-object/from16 v43, v8

    .line 835
    .line 836
    move-object/from16 v35, v10

    .line 837
    .line 838
    move-object/from16 v34, v11

    .line 839
    .line 840
    move-object/from16 v37, v12

    .line 841
    .line 842
    move-object/from16 v36, v13

    .line 843
    .line 844
    move-object v2, v14

    .line 845
    goto :goto_16

    .line 846
    :cond_29
    move-object/from16 v30, v5

    .line 847
    .line 848
    goto :goto_15

    .line 849
    :goto_16
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 854
    .line 855
    if-eqz v9, :cond_2b

    .line 856
    .line 857
    new-instance v5, Ljava/util/ArrayList;

    .line 858
    .line 859
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 860
    .line 861
    .line 862
    move-result v6

    .line 863
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 864
    .line 865
    .line 866
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 867
    .line 868
    .line 869
    move-result v6

    .line 870
    const/4 v7, 0x0

    .line 871
    :goto_17
    if-ge v7, v6, :cond_2c

    .line 872
    .line 873
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v8

    .line 877
    move-object v10, v8

    .line 878
    check-cast v10, Li2/e;

    .line 879
    .line 880
    iget-object v11, v10, Li2/e;->a:Ljava/lang/Object;

    .line 881
    .line 882
    instance-of v11, v11, Li2/p0;

    .line 883
    .line 884
    if-eqz v11, :cond_2a

    .line 885
    .line 886
    iget v11, v10, Li2/e;->b:I

    .line 887
    .line 888
    iget v10, v10, Li2/e;->c:I

    .line 889
    .line 890
    const/4 v12, 0x0

    .line 891
    invoke-static {v12, v1, v11, v10}, Li2/h;->b(IIII)Z

    .line 892
    .line 893
    .line 894
    move-result v10

    .line 895
    if-eqz v10, :cond_2a

    .line 896
    .line 897
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 901
    .line 902
    goto :goto_17

    .line 903
    :cond_2b
    move-object v5, v4

    .line 904
    :cond_2c
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 905
    .line 906
    .line 907
    move-result v1

    .line 908
    const/4 v6, 0x0

    .line 909
    :goto_18
    if-ge v6, v1, :cond_2e

    .line 910
    .line 911
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v7

    .line 915
    check-cast v7, Li2/e;

    .line 916
    .line 917
    iget-object v8, v7, Li2/e;->a:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v8, Li2/p0;

    .line 920
    .line 921
    iget v10, v7, Li2/e;->b:I

    .line 922
    .line 923
    iget v7, v7, Li2/e;->c:I

    .line 924
    .line 925
    instance-of v11, v8, Li2/p0;

    .line 926
    .line 927
    if-eqz v11, :cond_2d

    .line 928
    .line 929
    new-instance v11, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 930
    .line 931
    iget-object v8, v8, Li2/p0;->a:Ljava/lang/String;

    .line 932
    .line 933
    invoke-direct {v11, v8}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v11}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    const/16 v11, 0x21

    .line 941
    .line 942
    invoke-virtual {v2, v8, v10, v7, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 943
    .line 944
    .line 945
    add-int/lit8 v6, v6, 0x1

    .line 946
    .line 947
    goto :goto_18

    .line 948
    :cond_2d
    invoke-static {}, Lokio/a;->k()V

    .line 949
    .line 950
    .line 951
    return-object v16

    .line 952
    :cond_2e
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 953
    .line 954
    .line 955
    move-result v1

    .line 956
    if-eqz v9, :cond_30

    .line 957
    .line 958
    new-instance v4, Ljava/util/ArrayList;

    .line 959
    .line 960
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 961
    .line 962
    .line 963
    move-result v5

    .line 964
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 965
    .line 966
    .line 967
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    const/4 v6, 0x0

    .line 972
    :goto_19
    if-ge v6, v5, :cond_30

    .line 973
    .line 974
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v7

    .line 978
    move-object v8, v7

    .line 979
    check-cast v8, Li2/e;

    .line 980
    .line 981
    iget-object v10, v8, Li2/e;->a:Ljava/lang/Object;

    .line 982
    .line 983
    instance-of v10, v10, Li2/o0;

    .line 984
    .line 985
    if-eqz v10, :cond_2f

    .line 986
    .line 987
    iget v10, v8, Li2/e;->b:I

    .line 988
    .line 989
    iget v8, v8, Li2/e;->c:I

    .line 990
    .line 991
    const/4 v12, 0x0

    .line 992
    invoke-static {v12, v1, v10, v8}, Li2/h;->b(IIII)Z

    .line 993
    .line 994
    .line 995
    move-result v8

    .line 996
    if-eqz v8, :cond_2f

    .line 997
    .line 998
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 999
    .line 1000
    .line 1001
    :cond_2f
    add-int/lit8 v6, v6, 0x1

    .line 1002
    .line 1003
    goto :goto_19

    .line 1004
    :cond_30
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1005
    .line 1006
    .line 1007
    move-result v1

    .line 1008
    const/4 v5, 0x0

    .line 1009
    :goto_1a
    if-ge v5, v1, :cond_32

    .line 1010
    .line 1011
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v6

    .line 1015
    check-cast v6, Li2/e;

    .line 1016
    .line 1017
    iget-object v7, v6, Li2/e;->a:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v7, Li2/o0;

    .line 1020
    .line 1021
    iget v8, v6, Li2/e;->b:I

    .line 1022
    .line 1023
    iget v6, v6, Li2/e;->c:I

    .line 1024
    .line 1025
    move-object/from16 v9, v40

    .line 1026
    .line 1027
    iget-object v10, v9, Lb5/c;->a:Ljava/lang/Object;

    .line 1028
    .line 1029
    check-cast v10, Ljava/util/WeakHashMap;

    .line 1030
    .line 1031
    invoke-virtual {v10, v7}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v11

    .line 1035
    if-nez v11, :cond_31

    .line 1036
    .line 1037
    new-instance v11, Landroid/text/style/URLSpan;

    .line 1038
    .line 1039
    iget-object v12, v7, Li2/o0;->a:Ljava/lang/String;

    .line 1040
    .line 1041
    invoke-direct {v11, v12}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v10, v7, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    :cond_31
    check-cast v11, Landroid/text/style/URLSpan;

    .line 1048
    .line 1049
    const/16 v7, 0x21

    .line 1050
    .line 1051
    invoke-virtual {v2, v11, v8, v6, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1052
    .line 1053
    .line 1054
    add-int/lit8 v5, v5, 0x1

    .line 1055
    .line 1056
    move-object/from16 v40, v9

    .line 1057
    .line 1058
    goto :goto_1a

    .line 1059
    :cond_32
    move-object/from16 v9, v40

    .line 1060
    .line 1061
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 1062
    .line 1063
    .line 1064
    move-result v1

    .line 1065
    invoke-virtual {v0, v1}, Li2/g;->a(I)Ljava/util/List;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1070
    .line 1071
    .line 1072
    move-result v1

    .line 1073
    const/4 v4, 0x0

    .line 1074
    :goto_1b
    if-ge v4, v1, :cond_37

    .line 1075
    .line 1076
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v5

    .line 1080
    check-cast v5, Li2/e;

    .line 1081
    .line 1082
    iget v6, v5, Li2/e;->b:I

    .line 1083
    .line 1084
    iget-object v7, v5, Li2/e;->a:Ljava/lang/Object;

    .line 1085
    .line 1086
    iget v8, v5, Li2/e;->c:I

    .line 1087
    .line 1088
    if-eq v6, v8, :cond_36

    .line 1089
    .line 1090
    move-object v10, v7

    .line 1091
    check-cast v10, Li2/m;

    .line 1092
    .line 1093
    instance-of v11, v10, Li2/l;

    .line 1094
    .line 1095
    if-eqz v11, :cond_34

    .line 1096
    .line 1097
    new-instance v5, Li2/e;

    .line 1098
    .line 1099
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    check-cast v7, Li2/l;

    .line 1103
    .line 1104
    invoke-direct {v5, v6, v8, v7}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    iget-object v10, v9, Lb5/c;->b:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v10, Ljava/util/WeakHashMap;

    .line 1110
    .line 1111
    invoke-virtual {v10, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v11

    .line 1115
    if-nez v11, :cond_33

    .line 1116
    .line 1117
    new-instance v11, Landroid/text/style/URLSpan;

    .line 1118
    .line 1119
    iget-object v7, v7, Li2/l;->a:Ljava/lang/String;

    .line 1120
    .line 1121
    invoke-direct {v11, v7}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v10, v5, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    :cond_33
    check-cast v11, Landroid/text/style/URLSpan;

    .line 1128
    .line 1129
    const/16 v7, 0x21

    .line 1130
    .line 1131
    invoke-virtual {v2, v11, v6, v8, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1132
    .line 1133
    .line 1134
    goto :goto_1c

    .line 1135
    :cond_34
    iget-object v7, v9, Lb5/c;->c:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v7, Ljava/util/WeakHashMap;

    .line 1138
    .line 1139
    invoke-virtual {v7, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v11

    .line 1143
    if-nez v11, :cond_35

    .line 1144
    .line 1145
    new-instance v11, La9/b;

    .line 1146
    .line 1147
    invoke-direct {v11, v10}, La9/b;-><init>(Li2/m;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v7, v5, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    :cond_35
    check-cast v11, Landroid/text/style/ClickableSpan;

    .line 1154
    .line 1155
    const/16 v7, 0x21

    .line 1156
    .line 1157
    invoke-virtual {v2, v11, v6, v8, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1158
    .line 1159
    .line 1160
    goto :goto_1c

    .line 1161
    :cond_36
    const/16 v7, 0x21

    .line 1162
    .line 1163
    :goto_1c
    add-int/lit8 v4, v4, 0x1

    .line 1164
    .line 1165
    goto :goto_1b

    .line 1166
    :cond_37
    invoke-static {v2}, Ly1/z;->I(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    check-cast v0, Landroid/text/SpannableString;

    .line 1171
    .line 1172
    goto :goto_1d

    .line 1173
    :cond_38
    move-object/from16 v29, v2

    .line 1174
    .line 1175
    move-object/from16 v19, v4

    .line 1176
    .line 1177
    move-object/from16 v30, v5

    .line 1178
    .line 1179
    move-object/from16 v39, v6

    .line 1180
    .line 1181
    move-object/from16 v43, v8

    .line 1182
    .line 1183
    move-object/from16 v27, v9

    .line 1184
    .line 1185
    move-object/from16 v35, v10

    .line 1186
    .line 1187
    move-object/from16 v34, v11

    .line 1188
    .line 1189
    move-object/from16 v37, v12

    .line 1190
    .line 1191
    move-object/from16 v36, v13

    .line 1192
    .line 1193
    move-object/from16 v0, v16

    .line 1194
    .line 1195
    :goto_1d
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 1196
    .line 1197
    .line 1198
    sget-object v0, Lf2/u;->L:Lf2/x;

    .line 1199
    .line 1200
    move-object/from16 v1, v43

    .line 1201
    .line 1202
    invoke-virtual {v1, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    move-result v2

    .line 1206
    if-eqz v2, :cond_3a

    .line 1207
    .line 1208
    move-object/from16 v2, v37

    .line 1209
    .line 1210
    const/4 v4, 0x1

    .line 1211
    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v1, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    if-nez v0, :cond_39

    .line 1219
    .line 1220
    move-object/from16 v0, v16

    .line 1221
    .line 1222
    :cond_39
    check-cast v0, Ljava/lang/CharSequence;

    .line 1223
    .line 1224
    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 1225
    .line 1226
    .line 1227
    :goto_1e
    move-object/from16 v0, v39

    .line 1228
    .line 1229
    goto :goto_1f

    .line 1230
    :cond_3a
    move-object/from16 v2, v37

    .line 1231
    .line 1232
    goto :goto_1e

    .line 1233
    :goto_1f
    invoke-static {v0, v15}, Ly1/g0;->l(Lf2/q;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v4

    .line 1237
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1238
    .line 1239
    const/16 v6, 0x1e

    .line 1240
    .line 1241
    if-lt v5, v6, :cond_3b

    .line 1242
    .line 1243
    invoke-static {v3, v4}, Lb2/b;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 1244
    .line 1245
    .line 1246
    goto :goto_20

    .line 1247
    :cond_3b
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v5

    .line 1251
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 1252
    .line 1253
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 1254
    .line 1255
    .line 1256
    :goto_20
    invoke-static {v0}, Ly1/g0;->k(Lf2/q;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v4

    .line 1260
    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 1261
    .line 1262
    .line 1263
    sget-object v4, Lf2/u;->J:Lf2/x;

    .line 1264
    .line 1265
    invoke-virtual {v1, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v4

    .line 1269
    if-nez v4, :cond_3c

    .line 1270
    .line 1271
    move-object/from16 v4, v16

    .line 1272
    .line 1273
    :cond_3c
    check-cast v4, Lh2/a;

    .line 1274
    .line 1275
    if-eqz v4, :cond_3e

    .line 1276
    .line 1277
    sget-object v5, Lh2/a;->g:Lh2/a;

    .line 1278
    .line 1279
    if-ne v4, v5, :cond_3d

    .line 1280
    .line 1281
    const/4 v5, 0x1

    .line 1282
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1283
    .line 1284
    .line 1285
    goto :goto_21

    .line 1286
    :cond_3d
    sget-object v5, Lh2/a;->h:Lh2/a;

    .line 1287
    .line 1288
    if-ne v4, v5, :cond_3e

    .line 1289
    .line 1290
    const/4 v12, 0x0

    .line 1291
    invoke-virtual {v3, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1292
    .line 1293
    .line 1294
    :cond_3e
    :goto_21
    sget-object v4, Lf2/u;->I:Lf2/x;

    .line 1295
    .line 1296
    invoke-virtual {v1, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v4

    .line 1300
    if-nez v4, :cond_3f

    .line 1301
    .line 1302
    move-object/from16 v4, v16

    .line 1303
    .line 1304
    :cond_3f
    check-cast v4, Ljava/lang/Boolean;

    .line 1305
    .line 1306
    if-eqz v4, :cond_42

    .line 1307
    .line 1308
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1309
    .line 1310
    .line 1311
    move-result v4

    .line 1312
    if-nez v35, :cond_40

    .line 1313
    .line 1314
    move-object/from16 v10, v35

    .line 1315
    .line 1316
    const/4 v6, 0x4

    .line 1317
    goto :goto_22

    .line 1318
    :cond_40
    move-object/from16 v10, v35

    .line 1319
    .line 1320
    iget v5, v10, Lf2/i;->a:I

    .line 1321
    .line 1322
    const/4 v6, 0x4

    .line 1323
    if-ne v5, v6, :cond_41

    .line 1324
    .line 1325
    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 1326
    .line 1327
    .line 1328
    goto :goto_23

    .line 1329
    :cond_41
    :goto_22
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1330
    .line 1331
    .line 1332
    :goto_23
    move-object/from16 v4, v34

    .line 1333
    .line 1334
    goto :goto_24

    .line 1335
    :cond_42
    move-object/from16 v10, v35

    .line 1336
    .line 1337
    const/4 v6, 0x4

    .line 1338
    goto :goto_23

    .line 1339
    :goto_24
    iget-boolean v5, v4, Lf2/m;->i:Z

    .line 1340
    .line 1341
    if-eqz v5, :cond_43

    .line 1342
    .line 1343
    invoke-static {v6, v0}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v5

    .line 1347
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v5

    .line 1351
    if-eqz v5, :cond_46

    .line 1352
    .line 1353
    :cond_43
    sget-object v5, Lf2/u;->a:Lf2/x;

    .line 1354
    .line 1355
    invoke-virtual {v1, v5}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v5

    .line 1359
    if-nez v5, :cond_44

    .line 1360
    .line 1361
    move-object/from16 v5, v16

    .line 1362
    .line 1363
    :cond_44
    check-cast v5, Ljava/util/List;

    .line 1364
    .line 1365
    if-eqz v5, :cond_45

    .line 1366
    .line 1367
    invoke-static {v5}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v5

    .line 1371
    check-cast v5, Ljava/lang/String;

    .line 1372
    .line 1373
    goto :goto_25

    .line 1374
    :cond_45
    move-object/from16 v5, v16

    .line 1375
    .line 1376
    :goto_25
    invoke-virtual {v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1377
    .line 1378
    .line 1379
    :cond_46
    sget-object v5, Lf2/u;->z:Lf2/x;

    .line 1380
    .line 1381
    invoke-virtual {v1, v5}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v5

    .line 1385
    if-nez v5, :cond_47

    .line 1386
    .line 1387
    move-object/from16 v5, v16

    .line 1388
    .line 1389
    :cond_47
    check-cast v5, Ljava/lang/String;

    .line 1390
    .line 1391
    if-eqz v5, :cond_4a

    .line 1392
    .line 1393
    move-object v6, v0

    .line 1394
    :goto_26
    if-eqz v6, :cond_49

    .line 1395
    .line 1396
    iget-object v7, v6, Lf2/q;->d:Lf2/m;

    .line 1397
    .line 1398
    sget-object v8, Lf2/v;->a:Lf2/x;

    .line 1399
    .line 1400
    iget-object v9, v7, Lf2/m;->g:Lf/k0;

    .line 1401
    .line 1402
    invoke-virtual {v9, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1403
    .line 1404
    .line 1405
    move-result v9

    .line 1406
    if-eqz v9, :cond_48

    .line 1407
    .line 1408
    invoke-virtual {v7, v8}, Lf2/m;->d(Lf2/x;)Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v6

    .line 1412
    check-cast v6, Ljava/lang/Boolean;

    .line 1413
    .line 1414
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1415
    .line 1416
    .line 1417
    move-result v6

    .line 1418
    goto :goto_27

    .line 1419
    :cond_48
    invoke-virtual {v6}, Lf2/q;->l()Lf2/q;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v6

    .line 1423
    goto :goto_26

    .line 1424
    :cond_49
    const/4 v6, 0x0

    .line 1425
    :goto_27
    if-eqz v6, :cond_4a

    .line 1426
    .line 1427
    invoke-virtual {v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 1428
    .line 1429
    .line 1430
    :cond_4a
    sget-object v5, Lf2/u;->h:Lf2/x;

    .line 1431
    .line 1432
    invoke-virtual {v1, v5}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v5

    .line 1436
    if-nez v5, :cond_4b

    .line 1437
    .line 1438
    move-object/from16 v5, v16

    .line 1439
    .line 1440
    :cond_4b
    check-cast v5, Lsf/n;

    .line 1441
    .line 1442
    const/16 v6, 0x1c

    .line 1443
    .line 1444
    if-eqz v5, :cond_4d

    .line 1445
    .line 1446
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1447
    .line 1448
    if-lt v5, v6, :cond_4c

    .line 1449
    .line 1450
    const/4 v5, 0x1

    .line 1451
    invoke-static {v3, v5}, Lh3/c;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 1452
    .line 1453
    .line 1454
    goto :goto_28

    .line 1455
    :cond_4c
    move-object/from16 v7, v36

    .line 1456
    .line 1457
    const/4 v5, 0x1

    .line 1458
    const/4 v8, 0x2

    .line 1459
    invoke-virtual {v7, v8, v5}, Lh3/g;->f(IZ)V

    .line 1460
    .line 1461
    .line 1462
    goto :goto_29

    .line 1463
    :cond_4d
    :goto_28
    move-object/from16 v7, v36

    .line 1464
    .line 1465
    :goto_29
    sget-object v5, Lf2/u;->i:Lf2/x;

    .line 1466
    .line 1467
    invoke-virtual {v1, v5}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v5

    .line 1471
    if-nez v5, :cond_4e

    .line 1472
    .line 1473
    move-object/from16 v5, v16

    .line 1474
    .line 1475
    :cond_4e
    check-cast v5, Lsf/n;

    .line 1476
    .line 1477
    const/16 v8, 0x1d

    .line 1478
    .line 1479
    if-eqz v5, :cond_50

    .line 1480
    .line 1481
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1482
    .line 1483
    if-lt v5, v8, :cond_4f

    .line 1484
    .line 1485
    invoke-static {v2}, Lf1/a;->p(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_2a

    .line 1489
    :cond_4f
    const/16 v5, 0x8

    .line 1490
    .line 1491
    const/4 v9, 0x1

    .line 1492
    invoke-virtual {v7, v5, v9}, Lh3/g;->f(IZ)V

    .line 1493
    .line 1494
    .line 1495
    :cond_50
    :goto_2a
    move/from16 v5, p1

    .line 1496
    .line 1497
    const/4 v9, -0x1

    .line 1498
    if-eq v5, v9, :cond_52

    .line 1499
    .line 1500
    iget v11, v0, Lf2/q;->f:I

    .line 1501
    .line 1502
    move-object/from16 v12, v30

    .line 1503
    .line 1504
    invoke-virtual {v12, v11}, Lf/u;->d(I)I

    .line 1505
    .line 1506
    .line 1507
    move-result v11

    .line 1508
    if-eq v11, v9, :cond_51

    .line 1509
    .line 1510
    invoke-virtual {v2, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    .line 1511
    .line 1512
    .line 1513
    goto :goto_2b

    .line 1514
    :cond_51
    const-string v9, "AccessibilityDelegate"

    .line 1515
    .line 1516
    const-string v11, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    .line 1517
    .line 1518
    invoke-static {v9, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1519
    .line 1520
    .line 1521
    :cond_52
    :goto_2b
    sget-object v9, Lf2/u;->K:Lf2/x;

    .line 1522
    .line 1523
    invoke-virtual {v1, v9}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1524
    .line 1525
    .line 1526
    move-result v9

    .line 1527
    invoke-virtual {v2, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 1528
    .line 1529
    .line 1530
    sget-object v9, Lf2/u;->N:Lf2/x;

    .line 1531
    .line 1532
    invoke-virtual {v1, v9}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v9

    .line 1536
    if-nez v9, :cond_53

    .line 1537
    .line 1538
    move-object/from16 v9, v16

    .line 1539
    .line 1540
    :cond_53
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1541
    .line 1542
    invoke-static {v9, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v9

    .line 1546
    invoke-virtual {v2, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 1547
    .line 1548
    .line 1549
    sget-object v9, Lf2/u;->O:Lf2/x;

    .line 1550
    .line 1551
    invoke-virtual {v1, v9}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v9

    .line 1555
    if-nez v9, :cond_54

    .line 1556
    .line 1557
    move-object/from16 v9, v16

    .line 1558
    .line 1559
    :cond_54
    check-cast v9, Ljava/lang/Integer;

    .line 1560
    .line 1561
    if-eqz v9, :cond_55

    .line 1562
    .line 1563
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1564
    .line 1565
    .line 1566
    move-result v9

    .line 1567
    goto :goto_2c

    .line 1568
    :cond_55
    const/4 v9, -0x1

    .line 1569
    :goto_2c
    invoke-virtual {v2, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 1570
    .line 1571
    .line 1572
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 1573
    .line 1574
    .line 1575
    move-result v9

    .line 1576
    invoke-virtual {v2, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 1577
    .line 1578
    .line 1579
    sget-object v9, Lf2/u;->l:Lf2/x;

    .line 1580
    .line 1581
    invoke-virtual {v1, v9}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v12

    .line 1585
    invoke-virtual {v2, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v12

    .line 1592
    if-eqz v12, :cond_57

    .line 1593
    .line 1594
    invoke-virtual {v4, v9}, Lf2/m;->d(Lf2/x;)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v12

    .line 1598
    check-cast v12, Ljava/lang/Boolean;

    .line 1599
    .line 1600
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1601
    .line 1602
    .line 1603
    move-result v12

    .line 1604
    invoke-virtual {v2, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1608
    .line 1609
    .line 1610
    move-result v12

    .line 1611
    if-eqz v12, :cond_56

    .line 1612
    .line 1613
    const/4 v12, 0x2

    .line 1614
    invoke-virtual {v3, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1615
    .line 1616
    .line 1617
    move-object/from16 v12, v29

    .line 1618
    .line 1619
    iput v5, v12, Ly1/z;->r:I

    .line 1620
    .line 1621
    :goto_2d
    const/4 v13, 0x1

    .line 1622
    goto :goto_2e

    .line 1623
    :cond_56
    move-object/from16 v12, v29

    .line 1624
    .line 1625
    const/4 v13, 0x1

    .line 1626
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1627
    .line 1628
    .line 1629
    goto :goto_2e

    .line 1630
    :cond_57
    move-object/from16 v12, v29

    .line 1631
    .line 1632
    goto :goto_2d

    .line 1633
    :goto_2e
    invoke-static {v0}, Lf2/t;->g(Lf2/q;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v14

    .line 1637
    xor-int/2addr v14, v13

    .line 1638
    invoke-virtual {v3, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v0}, Lf2/q;->o()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v13

    .line 1645
    if-eqz v13, :cond_58

    .line 1646
    .line 1647
    invoke-virtual {v0}, Lf2/q;->l()Lf2/q;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v13

    .line 1651
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1652
    .line 1653
    .line 1654
    goto :goto_2f

    .line 1655
    :cond_58
    move-object v13, v0

    .line 1656
    :goto_2f
    invoke-virtual {v13}, Lf2/q;->m()Le1/c;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v13

    .line 1660
    invoke-virtual {v13}, Le1/c;->f()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v13

    .line 1664
    if-eqz v13, :cond_59

    .line 1665
    .line 1666
    const/4 v13, 0x0

    .line 1667
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1668
    .line 1669
    .line 1670
    goto :goto_30

    .line 1671
    :cond_59
    const/4 v13, 0x0

    .line 1672
    :goto_30
    sget-object v14, Lf2/u;->k:Lf2/x;

    .line 1673
    .line 1674
    invoke-virtual {v1, v14}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v14

    .line 1678
    if-nez v14, :cond_5a

    .line 1679
    .line 1680
    move-object/from16 v14, v16

    .line 1681
    .line 1682
    :cond_5a
    if-nez v14, :cond_b9

    .line 1683
    .line 1684
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1685
    .line 1686
    .line 1687
    sget-object v13, Lf2/l;->b:Lf2/x;

    .line 1688
    .line 1689
    invoke-virtual {v1, v13}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v13

    .line 1693
    if-nez v13, :cond_5b

    .line 1694
    .line 1695
    move-object/from16 v13, v16

    .line 1696
    .line 1697
    :cond_5b
    check-cast v13, Lf2/a;

    .line 1698
    .line 1699
    if-eqz v13, :cond_65

    .line 1700
    .line 1701
    sget-object v8, Lf2/u;->I:Lf2/x;

    .line 1702
    .line 1703
    invoke-virtual {v1, v8}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v8

    .line 1707
    if-nez v8, :cond_5c

    .line 1708
    .line 1709
    move-object/from16 v8, v16

    .line 1710
    .line 1711
    :cond_5c
    invoke-static {v8, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v8

    .line 1715
    if-nez v10, :cond_5e

    .line 1716
    .line 1717
    :cond_5d
    const/4 v6, 0x0

    .line 1718
    goto :goto_31

    .line 1719
    :cond_5e
    iget v14, v10, Lf2/i;->a:I

    .line 1720
    .line 1721
    const/4 v6, 0x4

    .line 1722
    if-ne v14, v6, :cond_5d

    .line 1723
    .line 1724
    const/4 v6, 0x1

    .line 1725
    :goto_31
    if-nez v6, :cond_62

    .line 1726
    .line 1727
    if-nez v10, :cond_60

    .line 1728
    .line 1729
    :cond_5f
    const/4 v6, 0x0

    .line 1730
    goto :goto_32

    .line 1731
    :cond_60
    iget v6, v10, Lf2/i;->a:I

    .line 1732
    .line 1733
    const/4 v10, 0x3

    .line 1734
    if-ne v6, v10, :cond_5f

    .line 1735
    .line 1736
    const/4 v6, 0x1

    .line 1737
    :goto_32
    if-eqz v6, :cond_61

    .line 1738
    .line 1739
    goto :goto_33

    .line 1740
    :cond_61
    const/4 v6, 0x0

    .line 1741
    goto :goto_34

    .line 1742
    :cond_62
    :goto_33
    const/4 v6, 0x1

    .line 1743
    :goto_34
    if-eqz v6, :cond_64

    .line 1744
    .line 1745
    if-eqz v6, :cond_63

    .line 1746
    .line 1747
    if-nez v8, :cond_63

    .line 1748
    .line 1749
    goto :goto_35

    .line 1750
    :cond_63
    const/4 v6, 0x0

    .line 1751
    goto :goto_36

    .line 1752
    :cond_64
    :goto_35
    const/4 v6, 0x1

    .line 1753
    :goto_36
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1754
    .line 1755
    .line 1756
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 1757
    .line 1758
    .line 1759
    move-result v6

    .line 1760
    if-eqz v6, :cond_65

    .line 1761
    .line 1762
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    .line 1763
    .line 1764
    .line 1765
    move-result v6

    .line 1766
    if-eqz v6, :cond_65

    .line 1767
    .line 1768
    new-instance v6, Lh3/e;

    .line 1769
    .line 1770
    iget-object v8, v13, Lf2/a;->a:Ljava/lang/String;

    .line 1771
    .line 1772
    const/16 v10, 0x10

    .line 1773
    .line 1774
    invoke-direct {v6, v10, v8}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1775
    .line 1776
    .line 1777
    invoke-virtual {v7, v6}, Lh3/g;->a(Lh3/e;)V

    .line 1778
    .line 1779
    .line 1780
    :cond_65
    const/4 v13, 0x0

    .line 1781
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1782
    .line 1783
    .line 1784
    sget-object v6, Lf2/l;->c:Lf2/x;

    .line 1785
    .line 1786
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v6

    .line 1790
    check-cast v6, Lf2/a;

    .line 1791
    .line 1792
    if-eqz v6, :cond_66

    .line 1793
    .line 1794
    const/4 v13, 0x1

    .line 1795
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1796
    .line 1797
    .line 1798
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result v8

    .line 1802
    if-eqz v8, :cond_66

    .line 1803
    .line 1804
    new-instance v8, Lh3/e;

    .line 1805
    .line 1806
    const/16 v10, 0x20

    .line 1807
    .line 1808
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 1809
    .line 1810
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 1814
    .line 1815
    .line 1816
    :cond_66
    sget-object v6, Lf2/l;->q:Lf2/x;

    .line 1817
    .line 1818
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v6

    .line 1822
    check-cast v6, Lf2/a;

    .line 1823
    .line 1824
    if-eqz v6, :cond_67

    .line 1825
    .line 1826
    new-instance v8, Lh3/e;

    .line 1827
    .line 1828
    const/16 v10, 0x4000

    .line 1829
    .line 1830
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 1831
    .line 1832
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 1836
    .line 1837
    .line 1838
    :cond_67
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v6

    .line 1842
    if-eqz v6, :cond_6c

    .line 1843
    .line 1844
    sget-object v6, Lf2/l;->k:Lf2/x;

    .line 1845
    .line 1846
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v6

    .line 1850
    check-cast v6, Lf2/a;

    .line 1851
    .line 1852
    if-eqz v6, :cond_68

    .line 1853
    .line 1854
    new-instance v8, Lh3/e;

    .line 1855
    .line 1856
    const/high16 v10, 0x200000

    .line 1857
    .line 1858
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 1859
    .line 1860
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1861
    .line 1862
    .line 1863
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 1864
    .line 1865
    .line 1866
    :cond_68
    sget-object v6, Lf2/l;->p:Lf2/x;

    .line 1867
    .line 1868
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v6

    .line 1872
    check-cast v6, Lf2/a;

    .line 1873
    .line 1874
    if-eqz v6, :cond_69

    .line 1875
    .line 1876
    new-instance v8, Lh3/e;

    .line 1877
    .line 1878
    const v10, 0x1020054

    .line 1879
    .line 1880
    .line 1881
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 1882
    .line 1883
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 1887
    .line 1888
    .line 1889
    :cond_69
    sget-object v6, Lf2/l;->r:Lf2/x;

    .line 1890
    .line 1891
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v6

    .line 1895
    check-cast v6, Lf2/a;

    .line 1896
    .line 1897
    if-eqz v6, :cond_6a

    .line 1898
    .line 1899
    new-instance v8, Lh3/e;

    .line 1900
    .line 1901
    const/high16 v10, 0x10000

    .line 1902
    .line 1903
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 1904
    .line 1905
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 1909
    .line 1910
    .line 1911
    :cond_6a
    sget-object v6, Lf2/l;->s:Lf2/x;

    .line 1912
    .line 1913
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v6

    .line 1917
    check-cast v6, Lf2/a;

    .line 1918
    .line 1919
    if-eqz v6, :cond_6c

    .line 1920
    .line 1921
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1922
    .line 1923
    .line 1924
    move-result v8

    .line 1925
    if-eqz v8, :cond_6c

    .line 1926
    .line 1927
    invoke-virtual/range {v19 .. v19}, Ly1/t;->getClipboardManager()Ly1/i;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v8

    .line 1931
    invoke-virtual {v8}, Ly1/i;->a()Landroid/content/ClipboardManager;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v8

    .line 1935
    invoke-virtual {v8}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v8

    .line 1939
    if-eqz v8, :cond_6b

    .line 1940
    .line 1941
    const-string v10, "text/*"

    .line 1942
    .line 1943
    invoke-virtual {v8, v10}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 1944
    .line 1945
    .line 1946
    move-result v8

    .line 1947
    goto :goto_37

    .line 1948
    :cond_6b
    const/4 v8, 0x0

    .line 1949
    :goto_37
    if-eqz v8, :cond_6c

    .line 1950
    .line 1951
    new-instance v8, Lh3/e;

    .line 1952
    .line 1953
    const v10, 0x8000

    .line 1954
    .line 1955
    .line 1956
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 1957
    .line 1958
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 1959
    .line 1960
    .line 1961
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 1962
    .line 1963
    .line 1964
    :cond_6c
    invoke-static {v0}, Ly1/z;->m(Lf2/q;)Ljava/lang/String;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v6

    .line 1968
    if-eqz v6, :cond_6e

    .line 1969
    .line 1970
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1971
    .line 1972
    .line 1973
    move-result v6

    .line 1974
    if-nez v6, :cond_6d

    .line 1975
    .line 1976
    goto :goto_38

    .line 1977
    :cond_6d
    const/4 v6, 0x0

    .line 1978
    goto :goto_39

    .line 1979
    :cond_6e
    :goto_38
    const/4 v6, 0x1

    .line 1980
    :goto_39
    if-nez v6, :cond_79

    .line 1981
    .line 1982
    invoke-virtual {v12, v0}, Ly1/z;->k(Lf2/q;)I

    .line 1983
    .line 1984
    .line 1985
    move-result v6

    .line 1986
    invoke-virtual {v12, v0}, Ly1/z;->j(Lf2/q;)I

    .line 1987
    .line 1988
    .line 1989
    move-result v8

    .line 1990
    invoke-virtual {v2, v6, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 1991
    .line 1992
    .line 1993
    sget-object v6, Lf2/l;->j:Lf2/x;

    .line 1994
    .line 1995
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v6

    .line 1999
    check-cast v6, Lf2/a;

    .line 2000
    .line 2001
    new-instance v8, Lh3/e;

    .line 2002
    .line 2003
    if-eqz v6, :cond_6f

    .line 2004
    .line 2005
    iget-object v6, v6, Lf2/a;->a:Ljava/lang/String;

    .line 2006
    .line 2007
    goto :goto_3a

    .line 2008
    :cond_6f
    move-object/from16 v6, v16

    .line 2009
    .line 2010
    :goto_3a
    const/high16 v10, 0x20000

    .line 2011
    .line 2012
    invoke-direct {v8, v10, v6}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v7, v8}, Lh3/g;->a(Lh3/e;)V

    .line 2016
    .line 2017
    .line 2018
    const/16 v6, 0x100

    .line 2019
    .line 2020
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 2021
    .line 2022
    .line 2023
    const/16 v6, 0x200

    .line 2024
    .line 2025
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 2026
    .line 2027
    .line 2028
    const/16 v6, 0xb

    .line 2029
    .line 2030
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2031
    .line 2032
    .line 2033
    sget-object v6, Lf2/u;->a:Lf2/x;

    .line 2034
    .line 2035
    invoke-static {v4, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v6

    .line 2039
    check-cast v6, Ljava/util/List;

    .line 2040
    .line 2041
    if-eqz v6, :cond_71

    .line 2042
    .line 2043
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2044
    .line 2045
    .line 2046
    move-result v6

    .line 2047
    if-eqz v6, :cond_70

    .line 2048
    .line 2049
    goto :goto_3b

    .line 2050
    :cond_70
    const/4 v6, 0x0

    .line 2051
    goto :goto_3c

    .line 2052
    :cond_71
    :goto_3b
    const/4 v6, 0x1

    .line 2053
    :goto_3c
    if-eqz v6, :cond_79

    .line 2054
    .line 2055
    sget-object v6, Lf2/l;->a:Lf2/x;

    .line 2056
    .line 2057
    invoke-virtual {v1, v6}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2058
    .line 2059
    .line 2060
    move-result v6

    .line 2061
    if-eqz v6, :cond_79

    .line 2062
    .line 2063
    sget-object v6, Lf2/u;->F:Lf2/x;

    .line 2064
    .line 2065
    invoke-virtual {v1, v6}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v6

    .line 2069
    if-eqz v6, :cond_72

    .line 2070
    .line 2071
    invoke-static {v4, v9}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v6

    .line 2075
    invoke-static {v6, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2076
    .line 2077
    .line 2078
    move-result v6

    .line 2079
    if-nez v6, :cond_72

    .line 2080
    .line 2081
    goto :goto_41

    .line 2082
    :cond_72
    invoke-virtual/range {v27 .. v27}, Lx1/f0;->u()Lx1/f0;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v6

    .line 2086
    :goto_3d
    if-eqz v6, :cond_75

    .line 2087
    .line 2088
    invoke-virtual {v6}, Lx1/f0;->w()Lf2/m;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v8

    .line 2092
    if-eqz v8, :cond_73

    .line 2093
    .line 2094
    iget-boolean v9, v8, Lf2/m;->i:Z

    .line 2095
    .line 2096
    const/4 v13, 0x1

    .line 2097
    if-ne v9, v13, :cond_73

    .line 2098
    .line 2099
    sget-object v9, Lf2/u;->F:Lf2/x;

    .line 2100
    .line 2101
    iget-object v8, v8, Lf2/m;->g:Lf/k0;

    .line 2102
    .line 2103
    invoke-virtual {v8, v9}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2104
    .line 2105
    .line 2106
    move-result v8

    .line 2107
    if-eqz v8, :cond_73

    .line 2108
    .line 2109
    const/4 v8, 0x1

    .line 2110
    goto :goto_3e

    .line 2111
    :cond_73
    const/4 v8, 0x0

    .line 2112
    :goto_3e
    if-eqz v8, :cond_74

    .line 2113
    .line 2114
    goto :goto_3f

    .line 2115
    :cond_74
    invoke-virtual {v6}, Lx1/f0;->u()Lx1/f0;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v6

    .line 2119
    goto :goto_3d

    .line 2120
    :cond_75
    move-object/from16 v6, v16

    .line 2121
    .line 2122
    :goto_3f
    if-eqz v6, :cond_78

    .line 2123
    .line 2124
    invoke-virtual {v6}, Lx1/f0;->w()Lf2/m;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v6

    .line 2128
    if-eqz v6, :cond_77

    .line 2129
    .line 2130
    sget-object v8, Lf2/u;->l:Lf2/x;

    .line 2131
    .line 2132
    iget-object v6, v6, Lf2/m;->g:Lf/k0;

    .line 2133
    .line 2134
    invoke-virtual {v6, v8}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v6

    .line 2138
    if-nez v6, :cond_76

    .line 2139
    .line 2140
    move-object/from16 v6, v16

    .line 2141
    .line 2142
    :cond_76
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2143
    .line 2144
    invoke-static {v6, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2145
    .line 2146
    .line 2147
    move-result v6

    .line 2148
    goto :goto_40

    .line 2149
    :cond_77
    const/4 v6, 0x0

    .line 2150
    :goto_40
    if-nez v6, :cond_78

    .line 2151
    .line 2152
    :goto_41
    const/4 v6, 0x1

    .line 2153
    goto :goto_42

    .line 2154
    :cond_78
    const/4 v6, 0x0

    .line 2155
    :goto_42
    if-nez v6, :cond_79

    .line 2156
    .line 2157
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    .line 2158
    .line 2159
    .line 2160
    move-result v6

    .line 2161
    or-int/lit8 v6, v6, 0x14

    .line 2162
    .line 2163
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2164
    .line 2165
    .line 2166
    :cond_79
    new-instance v6, Ljava/util/ArrayList;

    .line 2167
    .line 2168
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2169
    .line 2170
    .line 2171
    const-string v8, "androidx.compose.ui.semantics.id"

    .line 2172
    .line 2173
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2174
    .line 2175
    .line 2176
    invoke-virtual {v7}, Lh3/g;->e()Ljava/lang/CharSequence;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v8

    .line 2180
    if-eqz v8, :cond_7b

    .line 2181
    .line 2182
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 2183
    .line 2184
    .line 2185
    move-result v8

    .line 2186
    if-nez v8, :cond_7a

    .line 2187
    .line 2188
    goto :goto_43

    .line 2189
    :cond_7a
    const/4 v8, 0x0

    .line 2190
    goto :goto_44

    .line 2191
    :cond_7b
    :goto_43
    const/4 v8, 0x1

    .line 2192
    :goto_44
    if-nez v8, :cond_7c

    .line 2193
    .line 2194
    sget-object v8, Lf2/l;->a:Lf2/x;

    .line 2195
    .line 2196
    invoke-virtual {v1, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2197
    .line 2198
    .line 2199
    move-result v8

    .line 2200
    if-eqz v8, :cond_7c

    .line 2201
    .line 2202
    const-string v8, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 2203
    .line 2204
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2205
    .line 2206
    .line 2207
    :cond_7c
    sget-object v8, Lf2/u;->z:Lf2/x;

    .line 2208
    .line 2209
    invoke-virtual {v1, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v8

    .line 2213
    if-eqz v8, :cond_7d

    .line 2214
    .line 2215
    const-string v8, "androidx.compose.ui.semantics.testTag"

    .line 2216
    .line 2217
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2218
    .line 2219
    .line 2220
    :cond_7d
    sget-object v8, Lf2/u;->P:Lf2/x;

    .line 2221
    .line 2222
    invoke-virtual {v1, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2223
    .line 2224
    .line 2225
    move-result v8

    .line 2226
    if-eqz v8, :cond_7e

    .line 2227
    .line 2228
    const-string v8, "androidx.compose.ui.semantics.shapeType"

    .line 2229
    .line 2230
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2231
    .line 2232
    .line 2233
    const-string v8, "androidx.compose.ui.semantics.shapeRect"

    .line 2234
    .line 2235
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2236
    .line 2237
    .line 2238
    const-string v8, "androidx.compose.ui.semantics.shapeCorners"

    .line 2239
    .line 2240
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2241
    .line 2242
    .line 2243
    const-string v8, "androidx.compose.ui.semantics.shapeRegion"

    .line 2244
    .line 2245
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2246
    .line 2247
    .line 2248
    :cond_7e
    invoke-virtual {v2, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAvailableExtraData(Ljava/util/List;)V

    .line 2249
    .line 2250
    .line 2251
    sget-object v2, Lf2/u;->c:Lf2/x;

    .line 2252
    .line 2253
    invoke-static {v4, v2}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v2

    .line 2257
    check-cast v2, Lf2/h;

    .line 2258
    .line 2259
    if-eqz v2, :cond_84

    .line 2260
    .line 2261
    iget v4, v2, Lf2/h;->a:F

    .line 2262
    .line 2263
    iget-object v6, v2, Lf2/h;->b:Llg/a;

    .line 2264
    .line 2265
    sget-object v8, Lf2/l;->i:Lf2/x;

    .line 2266
    .line 2267
    invoke-virtual {v1, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2268
    .line 2269
    .line 2270
    move-result v9

    .line 2271
    if-eqz v9, :cond_7f

    .line 2272
    .line 2273
    const-string v9, "android.widget.SeekBar"

    .line 2274
    .line 2275
    invoke-virtual {v7, v9}, Lh3/g;->g(Ljava/lang/String;)V

    .line 2276
    .line 2277
    .line 2278
    goto :goto_45

    .line 2279
    :cond_7f
    const-string v9, "android.widget.ProgressBar"

    .line 2280
    .line 2281
    invoke-virtual {v7, v9}, Lh3/g;->g(Ljava/lang/String;)V

    .line 2282
    .line 2283
    .line 2284
    :goto_45
    sget-object v9, Lf2/h;->d:Lf2/h;

    .line 2285
    .line 2286
    if-eq v2, v9, :cond_80

    .line 2287
    .line 2288
    iget v2, v6, Llg/a;->a:F

    .line 2289
    .line 2290
    iget v9, v6, Llg/a;->b:F

    .line 2291
    .line 2292
    new-instance v10, Lh3/f;

    .line 2293
    .line 2294
    const/4 v13, 0x1

    .line 2295
    invoke-static {v13, v2, v9, v4}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v2

    .line 2299
    invoke-direct {v10, v2}, Lh3/f;-><init>(Ljava/lang/Object;)V

    .line 2300
    .line 2301
    .line 2302
    iget-object v2, v10, Lh3/f;->a:Ljava/lang/Object;

    .line 2303
    .line 2304
    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2305
    .line 2306
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 2307
    .line 2308
    .line 2309
    :cond_80
    invoke-virtual {v1, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2310
    .line 2311
    .line 2312
    move-result v1

    .line 2313
    if-eqz v1, :cond_84

    .line 2314
    .line 2315
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 2316
    .line 2317
    .line 2318
    move-result v1

    .line 2319
    if-eqz v1, :cond_84

    .line 2320
    .line 2321
    invoke-virtual {v6}, Llg/a;->a()Ljava/lang/Comparable;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v1

    .line 2325
    check-cast v1, Ljava/lang/Number;

    .line 2326
    .line 2327
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 2328
    .line 2329
    .line 2330
    move-result v1

    .line 2331
    invoke-virtual {v6}, Llg/a;->b()Ljava/lang/Comparable;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v2

    .line 2335
    check-cast v2, Ljava/lang/Number;

    .line 2336
    .line 2337
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 2338
    .line 2339
    .line 2340
    move-result v2

    .line 2341
    cmpg-float v8, v1, v2

    .line 2342
    .line 2343
    if-gez v8, :cond_81

    .line 2344
    .line 2345
    move v1, v2

    .line 2346
    :cond_81
    cmpg-float v1, v4, v1

    .line 2347
    .line 2348
    if-gez v1, :cond_82

    .line 2349
    .line 2350
    sget-object v1, Lh3/e;->e:Lh3/e;

    .line 2351
    .line 2352
    invoke-virtual {v7, v1}, Lh3/g;->a(Lh3/e;)V

    .line 2353
    .line 2354
    .line 2355
    :cond_82
    invoke-virtual {v6}, Llg/a;->b()Ljava/lang/Comparable;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v1

    .line 2359
    check-cast v1, Ljava/lang/Number;

    .line 2360
    .line 2361
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 2362
    .line 2363
    .line 2364
    move-result v1

    .line 2365
    invoke-virtual {v6}, Llg/a;->a()Ljava/lang/Comparable;

    .line 2366
    .line 2367
    .line 2368
    move-result-object v2

    .line 2369
    check-cast v2, Ljava/lang/Number;

    .line 2370
    .line 2371
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 2372
    .line 2373
    .line 2374
    move-result v2

    .line 2375
    cmpl-float v6, v1, v2

    .line 2376
    .line 2377
    if-lez v6, :cond_83

    .line 2378
    .line 2379
    move v1, v2

    .line 2380
    :cond_83
    cmpl-float v1, v4, v1

    .line 2381
    .line 2382
    if-lez v1, :cond_84

    .line 2383
    .line 2384
    sget-object v1, Lh3/e;->f:Lh3/e;

    .line 2385
    .line 2386
    invoke-virtual {v7, v1}, Lh3/g;->a(Lh3/e;)V

    .line 2387
    .line 2388
    .line 2389
    :cond_84
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 2390
    .line 2391
    .line 2392
    move-result v1

    .line 2393
    if-eqz v1, :cond_86

    .line 2394
    .line 2395
    iget-object v1, v0, Lf2/q;->d:Lf2/m;

    .line 2396
    .line 2397
    sget-object v2, Lf2/l;->i:Lf2/x;

    .line 2398
    .line 2399
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 2400
    .line 2401
    invoke-virtual {v1, v2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v1

    .line 2405
    if-nez v1, :cond_85

    .line 2406
    .line 2407
    move-object/from16 v1, v16

    .line 2408
    .line 2409
    :cond_85
    check-cast v1, Lf2/a;

    .line 2410
    .line 2411
    if-eqz v1, :cond_86

    .line 2412
    .line 2413
    new-instance v2, Lh3/e;

    .line 2414
    .line 2415
    const v4, 0x102003d

    .line 2416
    .line 2417
    .line 2418
    iget-object v1, v1, Lf2/a;->a:Ljava/lang/String;

    .line 2419
    .line 2420
    move-object/from16 v6, v16

    .line 2421
    .line 2422
    invoke-direct {v2, v6, v4, v1, v6}, Lh3/e;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 2423
    .line 2424
    .line 2425
    invoke-virtual {v7, v2}, Lh3/g;->a(Lh3/e;)V

    .line 2426
    .line 2427
    .line 2428
    :cond_86
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v1

    .line 2432
    sget-object v2, Lf2/u;->f:Lf2/x;

    .line 2433
    .line 2434
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 2435
    .line 2436
    invoke-virtual {v1, v2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v1

    .line 2440
    if-nez v1, :cond_87

    .line 2441
    .line 2442
    const/4 v1, 0x0

    .line 2443
    :cond_87
    check-cast v1, Lf2/d;

    .line 2444
    .line 2445
    if-eqz v1, :cond_88

    .line 2446
    .line 2447
    iget v2, v1, Lf2/d;->a:I

    .line 2448
    .line 2449
    iget v1, v1, Lf2/d;->b:I

    .line 2450
    .line 2451
    const/4 v13, 0x0

    .line 2452
    invoke-static {v2, v1, v13, v13}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v1

    .line 2456
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 2457
    .line 2458
    .line 2459
    goto :goto_4a

    .line 2460
    :cond_88
    new-instance v1, Ljava/util/ArrayList;

    .line 2461
    .line 2462
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2463
    .line 2464
    .line 2465
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v2

    .line 2469
    sget-object v4, Lf2/u;->e:Lf2/x;

    .line 2470
    .line 2471
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 2472
    .line 2473
    invoke-virtual {v2, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v2

    .line 2477
    if-nez v2, :cond_89

    .line 2478
    .line 2479
    const/4 v2, 0x0

    .line 2480
    :cond_89
    if-eqz v2, :cond_8b

    .line 2481
    .line 2482
    const/4 v6, 0x4

    .line 2483
    invoke-static {v6, v0}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v2

    .line 2487
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2488
    .line 2489
    .line 2490
    move-result v4

    .line 2491
    const/4 v6, 0x0

    .line 2492
    :goto_46
    if-ge v6, v4, :cond_8b

    .line 2493
    .line 2494
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v8

    .line 2498
    check-cast v8, Lf2/q;

    .line 2499
    .line 2500
    invoke-virtual {v8}, Lf2/q;->k()Lf2/m;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v9

    .line 2504
    sget-object v10, Lf2/u;->I:Lf2/x;

    .line 2505
    .line 2506
    iget-object v9, v9, Lf2/m;->g:Lf/k0;

    .line 2507
    .line 2508
    invoke-virtual {v9, v10}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2509
    .line 2510
    .line 2511
    move-result v9

    .line 2512
    if-eqz v9, :cond_8a

    .line 2513
    .line 2514
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2515
    .line 2516
    .line 2517
    :cond_8a
    add-int/lit8 v6, v6, 0x1

    .line 2518
    .line 2519
    goto :goto_46

    .line 2520
    :cond_8b
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2521
    .line 2522
    .line 2523
    move-result v2

    .line 2524
    if-nez v2, :cond_8e

    .line 2525
    .line 2526
    invoke-static {v1}, Loh/h;->n(Ljava/util/ArrayList;)Z

    .line 2527
    .line 2528
    .line 2529
    move-result v2

    .line 2530
    if-eqz v2, :cond_8c

    .line 2531
    .line 2532
    const/4 v4, 0x1

    .line 2533
    goto :goto_47

    .line 2534
    :cond_8c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2535
    .line 2536
    .line 2537
    move-result v4

    .line 2538
    :goto_47
    if-eqz v2, :cond_8d

    .line 2539
    .line 2540
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2541
    .line 2542
    .line 2543
    move-result v1

    .line 2544
    :goto_48
    const/4 v13, 0x0

    .line 2545
    goto :goto_49

    .line 2546
    :cond_8d
    const/4 v1, 0x1

    .line 2547
    goto :goto_48

    .line 2548
    :goto_49
    invoke-static {v4, v1, v13, v13}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v1

    .line 2552
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 2553
    .line 2554
    .line 2555
    :cond_8e
    :goto_4a
    invoke-static {v0, v7}, Loh/h;->T(Lf2/q;Lh3/g;)V

    .line 2556
    .line 2557
    .line 2558
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v1

    .line 2562
    sget-object v2, Lf2/u;->u:Lf2/x;

    .line 2563
    .line 2564
    invoke-static {v1, v2}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v1

    .line 2568
    check-cast v1, Lf2/j;

    .line 2569
    .line 2570
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v2

    .line 2574
    sget-object v4, Lf2/l;->d:Lf2/x;

    .line 2575
    .line 2576
    invoke-static {v2, v4}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v2

    .line 2580
    check-cast v2, Lf2/a;

    .line 2581
    .line 2582
    const/4 v4, 0x0

    .line 2583
    if-eqz v1, :cond_9a

    .line 2584
    .line 2585
    if-eqz v2, :cond_9a

    .line 2586
    .line 2587
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v6

    .line 2591
    sget-object v8, Lf2/u;->f:Lf2/x;

    .line 2592
    .line 2593
    iget-object v6, v6, Lf2/m;->g:Lf/k0;

    .line 2594
    .line 2595
    invoke-virtual {v6, v8}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2596
    .line 2597
    .line 2598
    move-result-object v6

    .line 2599
    if-nez v6, :cond_8f

    .line 2600
    .line 2601
    const/4 v6, 0x0

    .line 2602
    :cond_8f
    if-nez v6, :cond_92

    .line 2603
    .line 2604
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 2605
    .line 2606
    .line 2607
    move-result-object v6

    .line 2608
    sget-object v8, Lf2/u;->e:Lf2/x;

    .line 2609
    .line 2610
    iget-object v6, v6, Lf2/m;->g:Lf/k0;

    .line 2611
    .line 2612
    invoke-virtual {v6, v8}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v6

    .line 2616
    if-nez v6, :cond_90

    .line 2617
    .line 2618
    const/4 v6, 0x0

    .line 2619
    :cond_90
    if-eqz v6, :cond_91

    .line 2620
    .line 2621
    goto :goto_4b

    .line 2622
    :cond_91
    const/4 v6, 0x0

    .line 2623
    goto :goto_4c

    .line 2624
    :cond_92
    :goto_4b
    const/4 v6, 0x1

    .line 2625
    :goto_4c
    if-nez v6, :cond_93

    .line 2626
    .line 2627
    const-string v6, "android.widget.HorizontalScrollView"

    .line 2628
    .line 2629
    invoke-virtual {v7, v6}, Lh3/g;->g(Ljava/lang/String;)V

    .line 2630
    .line 2631
    .line 2632
    :cond_93
    iget-object v6, v1, Lf2/j;->b:Lfg/a;

    .line 2633
    .line 2634
    invoke-interface {v6}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v6

    .line 2638
    check-cast v6, Ljava/lang/Number;

    .line 2639
    .line 2640
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 2641
    .line 2642
    .line 2643
    move-result v6

    .line 2644
    cmpl-float v6, v6, v4

    .line 2645
    .line 2646
    if-lez v6, :cond_94

    .line 2647
    .line 2648
    const/4 v13, 0x1

    .line 2649
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 2650
    .line 2651
    .line 2652
    :cond_94
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 2653
    .line 2654
    .line 2655
    move-result v6

    .line 2656
    if-eqz v6, :cond_9a

    .line 2657
    .line 2658
    invoke-static {v1}, Ly1/z;->s(Lf2/j;)Z

    .line 2659
    .line 2660
    .line 2661
    move-result v6

    .line 2662
    sget-object v8, Lu2/m;->h:Lu2/m;

    .line 2663
    .line 2664
    if-eqz v6, :cond_97

    .line 2665
    .line 2666
    sget-object v6, Lh3/e;->e:Lh3/e;

    .line 2667
    .line 2668
    invoke-virtual {v7, v6}, Lh3/g;->a(Lh3/e;)V

    .line 2669
    .line 2670
    .line 2671
    move-object/from16 v6, v27

    .line 2672
    .line 2673
    iget-object v9, v6, Lx1/f0;->F:Lu2/m;

    .line 2674
    .line 2675
    if-ne v9, v8, :cond_95

    .line 2676
    .line 2677
    const/4 v9, 0x1

    .line 2678
    goto :goto_4d

    .line 2679
    :cond_95
    const/4 v9, 0x0

    .line 2680
    :goto_4d
    if-nez v9, :cond_96

    .line 2681
    .line 2682
    sget-object v9, Lh3/e;->j:Lh3/e;

    .line 2683
    .line 2684
    goto :goto_4e

    .line 2685
    :cond_96
    sget-object v9, Lh3/e;->h:Lh3/e;

    .line 2686
    .line 2687
    :goto_4e
    invoke-virtual {v7, v9}, Lh3/g;->a(Lh3/e;)V

    .line 2688
    .line 2689
    .line 2690
    goto :goto_4f

    .line 2691
    :cond_97
    move-object/from16 v6, v27

    .line 2692
    .line 2693
    :goto_4f
    invoke-static {v1}, Ly1/z;->r(Lf2/j;)Z

    .line 2694
    .line 2695
    .line 2696
    move-result v1

    .line 2697
    if-eqz v1, :cond_9a

    .line 2698
    .line 2699
    sget-object v1, Lh3/e;->f:Lh3/e;

    .line 2700
    .line 2701
    invoke-virtual {v7, v1}, Lh3/g;->a(Lh3/e;)V

    .line 2702
    .line 2703
    .line 2704
    iget-object v1, v6, Lx1/f0;->F:Lu2/m;

    .line 2705
    .line 2706
    if-ne v1, v8, :cond_98

    .line 2707
    .line 2708
    const/4 v1, 0x1

    .line 2709
    goto :goto_50

    .line 2710
    :cond_98
    const/4 v1, 0x0

    .line 2711
    :goto_50
    if-nez v1, :cond_99

    .line 2712
    .line 2713
    sget-object v1, Lh3/e;->h:Lh3/e;

    .line 2714
    .line 2715
    goto :goto_51

    .line 2716
    :cond_99
    sget-object v1, Lh3/e;->j:Lh3/e;

    .line 2717
    .line 2718
    :goto_51
    invoke-virtual {v7, v1}, Lh3/g;->a(Lh3/e;)V

    .line 2719
    .line 2720
    .line 2721
    :cond_9a
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v1

    .line 2725
    sget-object v6, Lf2/u;->v:Lf2/x;

    .line 2726
    .line 2727
    invoke-static {v1, v6}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2728
    .line 2729
    .line 2730
    move-result-object v1

    .line 2731
    check-cast v1, Lf2/j;

    .line 2732
    .line 2733
    if-eqz v1, :cond_a2

    .line 2734
    .line 2735
    if-eqz v2, :cond_a2

    .line 2736
    .line 2737
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 2738
    .line 2739
    .line 2740
    move-result-object v2

    .line 2741
    sget-object v6, Lf2/u;->f:Lf2/x;

    .line 2742
    .line 2743
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 2744
    .line 2745
    invoke-virtual {v2, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v2

    .line 2749
    if-nez v2, :cond_9b

    .line 2750
    .line 2751
    const/4 v2, 0x0

    .line 2752
    :cond_9b
    if-nez v2, :cond_9e

    .line 2753
    .line 2754
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 2755
    .line 2756
    .line 2757
    move-result-object v2

    .line 2758
    sget-object v6, Lf2/u;->e:Lf2/x;

    .line 2759
    .line 2760
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 2761
    .line 2762
    invoke-virtual {v2, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v2

    .line 2766
    if-nez v2, :cond_9c

    .line 2767
    .line 2768
    const/4 v2, 0x0

    .line 2769
    :cond_9c
    if-eqz v2, :cond_9d

    .line 2770
    .line 2771
    goto :goto_52

    .line 2772
    :cond_9d
    const/4 v2, 0x0

    .line 2773
    goto :goto_53

    .line 2774
    :cond_9e
    :goto_52
    const/4 v2, 0x1

    .line 2775
    :goto_53
    if-nez v2, :cond_9f

    .line 2776
    .line 2777
    const-string v2, "android.widget.ScrollView"

    .line 2778
    .line 2779
    invoke-virtual {v7, v2}, Lh3/g;->g(Ljava/lang/String;)V

    .line 2780
    .line 2781
    .line 2782
    :cond_9f
    iget-object v2, v1, Lf2/j;->b:Lfg/a;

    .line 2783
    .line 2784
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v2

    .line 2788
    check-cast v2, Ljava/lang/Number;

    .line 2789
    .line 2790
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 2791
    .line 2792
    .line 2793
    move-result v2

    .line 2794
    cmpl-float v2, v2, v4

    .line 2795
    .line 2796
    if-lez v2, :cond_a0

    .line 2797
    .line 2798
    const/4 v13, 0x1

    .line 2799
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 2800
    .line 2801
    .line 2802
    :cond_a0
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 2803
    .line 2804
    .line 2805
    move-result v2

    .line 2806
    if-eqz v2, :cond_a2

    .line 2807
    .line 2808
    invoke-static {v1}, Ly1/z;->s(Lf2/j;)Z

    .line 2809
    .line 2810
    .line 2811
    move-result v2

    .line 2812
    if-eqz v2, :cond_a1

    .line 2813
    .line 2814
    sget-object v2, Lh3/e;->e:Lh3/e;

    .line 2815
    .line 2816
    invoke-virtual {v7, v2}, Lh3/g;->a(Lh3/e;)V

    .line 2817
    .line 2818
    .line 2819
    sget-object v2, Lh3/e;->i:Lh3/e;

    .line 2820
    .line 2821
    invoke-virtual {v7, v2}, Lh3/g;->a(Lh3/e;)V

    .line 2822
    .line 2823
    .line 2824
    :cond_a1
    invoke-static {v1}, Ly1/z;->r(Lf2/j;)Z

    .line 2825
    .line 2826
    .line 2827
    move-result v1

    .line 2828
    if-eqz v1, :cond_a2

    .line 2829
    .line 2830
    sget-object v1, Lh3/e;->f:Lh3/e;

    .line 2831
    .line 2832
    invoke-virtual {v7, v1}, Lh3/g;->a(Lh3/e;)V

    .line 2833
    .line 2834
    .line 2835
    sget-object v1, Lh3/e;->g:Lh3/e;

    .line 2836
    .line 2837
    invoke-virtual {v7, v1}, Lh3/g;->a(Lh3/e;)V

    .line 2838
    .line 2839
    .line 2840
    :cond_a2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2841
    .line 2842
    const/16 v2, 0x1d

    .line 2843
    .line 2844
    if-lt v1, v2, :cond_a3

    .line 2845
    .line 2846
    invoke-static {v0, v7}, Ly1/g0;->d(Lf2/q;Lh3/g;)V

    .line 2847
    .line 2848
    .line 2849
    :cond_a3
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2850
    .line 2851
    .line 2852
    move-result-object v2

    .line 2853
    sget-object v4, Lf2/u;->d:Lf2/x;

    .line 2854
    .line 2855
    invoke-static {v2, v4}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2856
    .line 2857
    .line 2858
    move-result-object v2

    .line 2859
    check-cast v2, Ljava/lang/CharSequence;

    .line 2860
    .line 2861
    const/16 v4, 0x1c

    .line 2862
    .line 2863
    if-lt v1, v4, :cond_a4

    .line 2864
    .line 2865
    invoke-static {v3, v2}, Lh3/c;->j(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 2866
    .line 2867
    .line 2868
    goto :goto_54

    .line 2869
    :cond_a4
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 2870
    .line 2871
    .line 2872
    move-result-object v1

    .line 2873
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 2874
    .line 2875
    invoke-virtual {v1, v4, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 2876
    .line 2877
    .line 2878
    :goto_54
    invoke-static {v0}, Ly1/g0;->b(Lf2/q;)Z

    .line 2879
    .line 2880
    .line 2881
    move-result v1

    .line 2882
    if-eqz v1, :cond_b1

    .line 2883
    .line 2884
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v1

    .line 2888
    sget-object v2, Lf2/l;->t:Lf2/x;

    .line 2889
    .line 2890
    invoke-static {v1, v2}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2891
    .line 2892
    .line 2893
    move-result-object v1

    .line 2894
    check-cast v1, Lf2/a;

    .line 2895
    .line 2896
    if-eqz v1, :cond_a5

    .line 2897
    .line 2898
    new-instance v2, Lh3/e;

    .line 2899
    .line 2900
    const/high16 v4, 0x40000

    .line 2901
    .line 2902
    iget-object v1, v1, Lf2/a;->a:Ljava/lang/String;

    .line 2903
    .line 2904
    invoke-direct {v2, v4, v1}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 2905
    .line 2906
    .line 2907
    invoke-virtual {v7, v2}, Lh3/g;->a(Lh3/e;)V

    .line 2908
    .line 2909
    .line 2910
    :cond_a5
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2911
    .line 2912
    .line 2913
    move-result-object v1

    .line 2914
    sget-object v2, Lf2/l;->u:Lf2/x;

    .line 2915
    .line 2916
    invoke-static {v1, v2}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2917
    .line 2918
    .line 2919
    move-result-object v1

    .line 2920
    check-cast v1, Lf2/a;

    .line 2921
    .line 2922
    if-eqz v1, :cond_a6

    .line 2923
    .line 2924
    new-instance v2, Lh3/e;

    .line 2925
    .line 2926
    const/high16 v4, 0x80000

    .line 2927
    .line 2928
    iget-object v1, v1, Lf2/a;->a:Ljava/lang/String;

    .line 2929
    .line 2930
    invoke-direct {v2, v4, v1}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 2931
    .line 2932
    .line 2933
    invoke-virtual {v7, v2}, Lh3/g;->a(Lh3/e;)V

    .line 2934
    .line 2935
    .line 2936
    :cond_a6
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v1

    .line 2940
    sget-object v2, Lf2/l;->v:Lf2/x;

    .line 2941
    .line 2942
    invoke-static {v1, v2}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 2943
    .line 2944
    .line 2945
    move-result-object v1

    .line 2946
    check-cast v1, Lf2/a;

    .line 2947
    .line 2948
    if-eqz v1, :cond_a7

    .line 2949
    .line 2950
    new-instance v2, Lh3/e;

    .line 2951
    .line 2952
    const/high16 v4, 0x100000

    .line 2953
    .line 2954
    iget-object v1, v1, Lf2/a;->a:Ljava/lang/String;

    .line 2955
    .line 2956
    invoke-direct {v2, v4, v1}, Lh3/e;-><init>(ILjava/lang/String;)V

    .line 2957
    .line 2958
    .line 2959
    invoke-virtual {v7, v2}, Lh3/g;->a(Lh3/e;)V

    .line 2960
    .line 2961
    .line 2962
    :cond_a7
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2963
    .line 2964
    .line 2965
    move-result-object v1

    .line 2966
    sget-object v2, Lf2/l;->x:Lf2/x;

    .line 2967
    .line 2968
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 2969
    .line 2970
    invoke-virtual {v1, v2}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 2971
    .line 2972
    .line 2973
    move-result v1

    .line 2974
    if-eqz v1, :cond_b1

    .line 2975
    .line 2976
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 2977
    .line 2978
    .line 2979
    move-result-object v1

    .line 2980
    invoke-virtual {v1, v2}, Lf2/m;->d(Lf2/x;)Ljava/lang/Object;

    .line 2981
    .line 2982
    .line 2983
    move-result-object v1

    .line 2984
    check-cast v1, Ljava/util/List;

    .line 2985
    .line 2986
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2987
    .line 2988
    .line 2989
    move-result v2

    .line 2990
    sget-object v4, Ly1/z;->T:Lf/v;

    .line 2991
    .line 2992
    iget v6, v4, Lf/v;->b:I

    .line 2993
    .line 2994
    if-ge v2, v6, :cond_b0

    .line 2995
    .line 2996
    new-instance v2, Lf/t0;

    .line 2997
    .line 2998
    invoke-direct {v2}, Lf/t0;-><init>()V

    .line 2999
    .line 3000
    .line 3001
    invoke-static {}, Lf/o0;->a()Lf/b0;

    .line 3002
    .line 3003
    .line 3004
    move-result-object v6

    .line 3005
    move-object/from16 v8, v20

    .line 3006
    .line 3007
    iget-object v9, v8, Lf/t0;->g:[I

    .line 3008
    .line 3009
    iget v10, v8, Lf/t0;->i:I

    .line 3010
    .line 3011
    invoke-static {v9, v10, v5}, Lg/a;->a([III)I

    .line 3012
    .line 3013
    .line 3014
    move-result v9

    .line 3015
    if-ltz v9, :cond_a8

    .line 3016
    .line 3017
    const/4 v9, 0x1

    .line 3018
    goto :goto_55

    .line 3019
    :cond_a8
    const/4 v9, 0x0

    .line 3020
    :goto_55
    if-eqz v9, :cond_ae

    .line 3021
    .line 3022
    invoke-virtual {v8, v5}, Lf/t0;->b(I)Ljava/lang/Object;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v9

    .line 3026
    check-cast v9, Lf/b0;

    .line 3027
    .line 3028
    const/16 v10, 0x10

    .line 3029
    .line 3030
    new-array v10, v10, [I

    .line 3031
    .line 3032
    iget-object v11, v4, Lf/v;->a:[I

    .line 3033
    .line 3034
    iget v4, v4, Lf/v;->b:I

    .line 3035
    .line 3036
    move-object v14, v10

    .line 3037
    const/4 v10, 0x0

    .line 3038
    const/4 v13, 0x0

    .line 3039
    :goto_56
    if-ge v10, v4, :cond_aa

    .line 3040
    .line 3041
    aget v18, v11, v10

    .line 3042
    .line 3043
    move/from16 v20, v4

    .line 3044
    .line 3045
    add-int/lit8 v4, v13, 0x1

    .line 3046
    .line 3047
    move-object/from16 v22, v9

    .line 3048
    .line 3049
    array-length v9, v14

    .line 3050
    if-ge v9, v4, :cond_a9

    .line 3051
    .line 3052
    array-length v9, v14

    .line 3053
    const/16 v24, 0x3

    .line 3054
    .line 3055
    mul-int/lit8 v9, v9, 0x3

    .line 3056
    .line 3057
    const/16 v17, 0x2

    .line 3058
    .line 3059
    div-int/lit8 v9, v9, 0x2

    .line 3060
    .line 3061
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 3062
    .line 3063
    .line 3064
    move-result v9

    .line 3065
    invoke-static {v14, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 3066
    .line 3067
    .line 3068
    move-result-object v9

    .line 3069
    move-object v14, v9

    .line 3070
    goto :goto_57

    .line 3071
    :cond_a9
    const/16 v17, 0x2

    .line 3072
    .line 3073
    const/16 v24, 0x3

    .line 3074
    .line 3075
    :goto_57
    aput v18, v14, v13

    .line 3076
    .line 3077
    add-int/lit8 v10, v10, 0x1

    .line 3078
    .line 3079
    move v13, v4

    .line 3080
    move/from16 v4, v20

    .line 3081
    .line 3082
    move-object/from16 v9, v22

    .line 3083
    .line 3084
    goto :goto_56

    .line 3085
    :cond_aa
    move-object/from16 v22, v9

    .line 3086
    .line 3087
    new-instance v4, Ljava/util/ArrayList;

    .line 3088
    .line 3089
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3090
    .line 3091
    .line 3092
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 3093
    .line 3094
    .line 3095
    move-result v9

    .line 3096
    if-gtz v9, :cond_ad

    .line 3097
    .line 3098
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 3099
    .line 3100
    .line 3101
    move-result v1

    .line 3102
    if-gtz v1, :cond_ab

    .line 3103
    .line 3104
    const/16 v16, 0x0

    .line 3105
    .line 3106
    goto :goto_58

    .line 3107
    :cond_ab
    const/4 v9, 0x0

    .line 3108
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3109
    .line 3110
    .line 3111
    move-result-object v0

    .line 3112
    invoke-static {v0}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 3113
    .line 3114
    .line 3115
    if-gtz v13, :cond_ac

    .line 3116
    .line 3117
    const-string v0, "Index must be between 0 and size"

    .line 3118
    .line 3119
    invoke-static {v0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 3120
    .line 3121
    .line 3122
    const/16 v16, 0x0

    .line 3123
    .line 3124
    return-object v16

    .line 3125
    :cond_ac
    const/16 v16, 0x0

    .line 3126
    .line 3127
    aget v0, v14, v9

    .line 3128
    .line 3129
    throw v16

    .line 3130
    :cond_ad
    const/4 v9, 0x0

    .line 3131
    const/16 v16, 0x0

    .line 3132
    .line 3133
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3134
    .line 3135
    .line 3136
    move-result-object v0

    .line 3137
    invoke-static {v0}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 3138
    .line 3139
    .line 3140
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3141
    .line 3142
    .line 3143
    throw v16

    .line 3144
    :cond_ae
    const/4 v9, 0x0

    .line 3145
    const/16 v16, 0x0

    .line 3146
    .line 3147
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 3148
    .line 3149
    .line 3150
    move-result v10

    .line 3151
    if-gtz v10, :cond_af

    .line 3152
    .line 3153
    :goto_58
    iget-object v1, v12, Ly1/z;->x:Lf/t0;

    .line 3154
    .line 3155
    invoke-virtual {v1, v5, v2}, Lf/t0;->c(ILjava/lang/Object;)V

    .line 3156
    .line 3157
    .line 3158
    invoke-virtual {v8, v5, v6}, Lf/t0;->c(ILjava/lang/Object;)V

    .line 3159
    .line 3160
    .line 3161
    goto :goto_59

    .line 3162
    :cond_af
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3163
    .line 3164
    .line 3165
    move-result-object v0

    .line 3166
    invoke-static {v0}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 3167
    .line 3168
    .line 3169
    invoke-virtual {v4, v9}, Lf/v;->c(I)I

    .line 3170
    .line 3171
    .line 3172
    throw v16

    .line 3173
    :cond_b0
    const/16 v16, 0x0

    .line 3174
    .line 3175
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3176
    .line 3177
    const-string v1, "Can\'t have more than "

    .line 3178
    .line 3179
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3180
    .line 3181
    .line 3182
    iget v1, v4, Lf/v;->b:I

    .line 3183
    .line 3184
    const-string v2, " custom actions for one widget"

    .line 3185
    .line 3186
    invoke-static {v0, v1, v2}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 3187
    .line 3188
    .line 3189
    move-result-object v0

    .line 3190
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 3191
    .line 3192
    .line 3193
    return-object v16

    .line 3194
    :cond_b1
    :goto_59
    invoke-static {v0, v15}, Ly1/g0;->c(Lf2/q;Landroid/content/res/Resources;)Z

    .line 3195
    .line 3196
    .line 3197
    move-result v1

    .line 3198
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3199
    .line 3200
    const/16 v4, 0x1c

    .line 3201
    .line 3202
    if-lt v2, v4, :cond_b2

    .line 3203
    .line 3204
    invoke-static {v3, v1}, Lb0/b0;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 3205
    .line 3206
    .line 3207
    goto :goto_5a

    .line 3208
    :cond_b2
    const/4 v13, 0x1

    .line 3209
    invoke-virtual {v7, v13, v1}, Lh3/g;->f(IZ)V

    .line 3210
    .line 3211
    .line 3212
    :goto_5a
    iget-object v1, v12, Ly1/z;->H:Lf/u;

    .line 3213
    .line 3214
    invoke-virtual {v1, v5}, Lf/u;->d(I)I

    .line 3215
    .line 3216
    .line 3217
    move-result v1

    .line 3218
    const/4 v9, -0x1

    .line 3219
    if-eq v1, v9, :cond_b4

    .line 3220
    .line 3221
    invoke-virtual/range {v19 .. v19}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 3222
    .line 3223
    .line 3224
    move-result-object v2

    .line 3225
    invoke-static {v2, v1}, Ly1/g0;->t(Ly1/r0;I)Lx2/h;

    .line 3226
    .line 3227
    .line 3228
    move-result-object v2

    .line 3229
    if-eqz v2, :cond_b3

    .line 3230
    .line 3231
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;)V

    .line 3232
    .line 3233
    .line 3234
    move-object/from16 v2, v19

    .line 3235
    .line 3236
    goto :goto_5b

    .line 3237
    :cond_b3
    move-object/from16 v2, v19

    .line 3238
    .line 3239
    invoke-virtual {v3, v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 3240
    .line 3241
    .line 3242
    :goto_5b
    iget-object v1, v12, Ly1/z;->J:Ljava/lang/String;

    .line 3243
    .line 3244
    const/4 v6, 0x0

    .line 3245
    invoke-virtual {v12, v5, v7, v1, v6}, Ly1/z;->c(ILh3/g;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3246
    .line 3247
    .line 3248
    goto :goto_5c

    .line 3249
    :cond_b4
    move-object/from16 v2, v19

    .line 3250
    .line 3251
    const/4 v6, 0x0

    .line 3252
    :goto_5c
    iget-object v1, v12, Ly1/z;->I:Lf/u;

    .line 3253
    .line 3254
    invoke-virtual {v1, v5}, Lf/u;->d(I)I

    .line 3255
    .line 3256
    .line 3257
    move-result v1

    .line 3258
    const/4 v9, -0x1

    .line 3259
    if-eq v1, v9, :cond_b5

    .line 3260
    .line 3261
    invoke-virtual {v2}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 3262
    .line 3263
    .line 3264
    move-result-object v2

    .line 3265
    invoke-static {v2, v1}, Ly1/g0;->t(Ly1/r0;I)Lx2/h;

    .line 3266
    .line 3267
    .line 3268
    move-result-object v1

    .line 3269
    if-eqz v1, :cond_b5

    .line 3270
    .line 3271
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    .line 3272
    .line 3273
    .line 3274
    iget-object v1, v12, Ly1/z;->K:Ljava/lang/String;

    .line 3275
    .line 3276
    invoke-virtual {v12, v5, v7, v1, v6}, Ly1/z;->c(ILh3/g;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3277
    .line 3278
    .line 3279
    :cond_b5
    invoke-virtual {v0}, Lf2/q;->n()Lf2/m;

    .line 3280
    .line 3281
    .line 3282
    move-result-object v0

    .line 3283
    sget-object v1, Lf2/v;->b:Lf2/x;

    .line 3284
    .line 3285
    invoke-static {v0, v1}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 3286
    .line 3287
    .line 3288
    move-result-object v0

    .line 3289
    check-cast v0, Ljava/lang/String;

    .line 3290
    .line 3291
    if-eqz v0, :cond_b6

    .line 3292
    .line 3293
    invoke-virtual {v7, v0}, Lh3/g;->g(Ljava/lang/String;)V

    .line 3294
    .line 3295
    .line 3296
    :cond_b6
    :goto_5d
    iget-boolean v0, v12, Ly1/z;->u:Z

    .line 3297
    .line 3298
    if-eqz v0, :cond_b8

    .line 3299
    .line 3300
    iget v0, v12, Ly1/z;->q:I

    .line 3301
    .line 3302
    if-ne v5, v0, :cond_b7

    .line 3303
    .line 3304
    iput-object v7, v12, Ly1/z;->s:Lh3/g;

    .line 3305
    .line 3306
    :cond_b7
    iget v0, v12, Ly1/z;->r:I

    .line 3307
    .line 3308
    if-ne v5, v0, :cond_b8

    .line 3309
    .line 3310
    iput-object v7, v12, Ly1/z;->t:Lh3/g;

    .line 3311
    .line 3312
    :cond_b8
    return-object v7

    .line 3313
    :cond_b9
    invoke-static {}, Lah/a;->d()V

    .line 3314
    .line 3315
    .line 3316
    const/16 v16, 0x0

    .line 3317
    .line 3318
    return-object v16

    .line 3319
    :cond_ba
    move v5, v1

    .line 3320
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3321
    .line 3322
    const-string v1, "semanticsNode "

    .line 3323
    .line 3324
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3325
    .line 3326
    .line 3327
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3328
    .line 3329
    .line 3330
    const-string v1, " has null parent"

    .line 3331
    .line 3332
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3333
    .line 3334
    .line 3335
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3336
    .line 3337
    .line 3338
    move-result-object v0

    .line 3339
    invoke-static {v0}, Lu1/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 3340
    .line 3341
    .line 3342
    invoke-static {}, Lokio/a;->c()V

    .line 3343
    .line 3344
    .line 3345
    return-object v16
.end method

.method public final r(I)Lh3/g;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Ly1/u;->i:Ly1/z;

    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget p1, v1, Ly1/z;->q:I

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ly1/u;->l(I)Lh3/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const-string v0, "Unknown focus type: "

    .line 17
    .line 18
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    iget p1, v1, Ly1/z;->r:I

    .line 28
    .line 29
    const/high16 v0, -0x80000000

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return-object p1

    .line 35
    :cond_2
    invoke-virtual {p0, p1}, Ly1/u;->l(I)Lh3/g;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method
