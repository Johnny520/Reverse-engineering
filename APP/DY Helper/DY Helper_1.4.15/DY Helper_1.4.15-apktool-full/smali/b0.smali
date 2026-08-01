.class public final Lb0;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lb0;->ε:I

    iput-object p2, p0, Lb0;->ζ:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ln;Lmv;Lqm1;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput p1, p0, Lb0;->ε:I

    .line 4
    .line 5
    iput-object p3, p0, Lb0;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lb0;->ε:I

    .line 2
    .line 3
    sget-object v1, Lw52;->ζ:Lw52;

    .line 4
    .line 5
    sget-object v2, Lw52;->ε:Lw52;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const-string v5, "(this)"

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    sget-object v8, Ls62;->α:Ls62;

    .line 14
    .line 15
    iget-object p0, p0, Lb0;->ζ:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, Ljava/lang/Throwable;

    .line 21
    .line 22
    check-cast p0, Ld22;

    .line 23
    .line 24
    iget-object v0, p0, Ld22;->η:Lae;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lae;->ο(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iput-object v6, p0, Ld22;->η:Lae;

    .line 32
    .line 33
    return-object v8

    .line 34
    :pswitch_0
    check-cast p1, Lza0;

    .line 35
    .line 36
    check-cast p0, Lgw1;

    .line 37
    .line 38
    iget v0, p0, Lgw1;->τ:F

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lza0;->Δ(F)V

    .line 41
    .line 42
    .line 43
    iget v0, p0, Lgw1;->υ:F

    .line 44
    .line 45
    invoke-interface {p1, v0}, Lza0;->Τ(F)V

    .line 46
    .line 47
    .line 48
    iget v0, p0, Lgw1;->φ:F

    .line 49
    .line 50
    invoke-interface {p1, v0}, Lza0;->η(F)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Lza0;->Ι()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Lza0;->ο()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v3}, Lza0;->κ(F)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Lza0;->ε()V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1}, Lza0;->ψ()V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1}, Lza0;->Ο()V

    .line 69
    .line 70
    .line 71
    iget v0, p0, Lgw1;->χ:F

    .line 72
    .line 73
    invoke-interface {p1, v0}, Lza0;->и(F)V

    .line 74
    .line 75
    .line 76
    iget-wide v0, p0, Lgw1;->ψ:J

    .line 77
    .line 78
    invoke-interface {p1, v0, v1}, Lza0;->Π(J)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lgw1;->ω:Liv1;

    .line 82
    .line 83
    invoke-interface {p1, v0}, Lza0;->π(Liv1;)V

    .line 84
    .line 85
    .line 86
    iget-boolean v0, p0, Lgw1;->Α:Z

    .line 87
    .line 88
    invoke-interface {p1, v0}, Lza0;->Κ(Z)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v6}, Lza0;->Σ(Lin;)V

    .line 92
    .line 93
    .line 94
    iget-wide v0, p0, Lgw1;->Β:J

    .line 95
    .line 96
    invoke-interface {p1, v0, v1}, Lza0;->ω(J)V

    .line 97
    .line 98
    .line 99
    iget-wide v0, p0, Lgw1;->Γ:J

    .line 100
    .line 101
    invoke-interface {p1, v0, v1}, Lza0;->Ρ(J)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v7}, Lza0;->б(I)V

    .line 105
    .line 106
    .line 107
    iget p0, p0, Lgw1;->Δ:I

    .line 108
    .line 109
    invoke-interface {p1, p0}, Lza0;->Ε(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Lza0;->Γ()V

    .line 113
    .line 114
    .line 115
    return-object v8

    .line 116
    :pswitch_1
    check-cast p1, Lza0;

    .line 117
    .line 118
    check-cast p0, Lgv1;

    .line 119
    .line 120
    iget v0, p0, Lgv1;->α:F

    .line 121
    .line 122
    invoke-interface {p1}, Lyr;->β()F

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    mul-float/2addr v1, v0

    .line 127
    invoke-interface {p1, v1}, Lza0;->κ(F)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lgv1;->β:Liv1;

    .line 131
    .line 132
    invoke-interface {p1, v0}, Lza0;->π(Liv1;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v7}, Lza0;->Κ(Z)V

    .line 136
    .line 137
    .line 138
    iget-wide v0, p0, Lgv1;->γ:J

    .line 139
    .line 140
    invoke-interface {p1, v0, v1}, Lza0;->ω(J)V

    .line 141
    .line 142
    .line 143
    iget-wide v0, p0, Lgv1;->δ:J

    .line 144
    .line 145
    invoke-interface {p1, v0, v1}, Lza0;->Ρ(J)V

    .line 146
    .line 147
    .line 148
    return-object v8

    .line 149
    :pswitch_2
    check-cast p1, Ljs1;

    .line 150
    .line 151
    check-cast p0, Ljava/lang/String;

    .line 152
    .line 153
    sget-object v0, Lhs1;->α:[Lso0;

    .line 154
    .line 155
    sget-object v0, Lfs1;->α:Lis1;

    .line 156
    .line 157
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-interface {p1, v0, p0}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    return-object v8

    .line 165
    :pswitch_3
    check-cast p1, Ljs1;

    .line 166
    .line 167
    check-cast p0, Lso1;

    .line 168
    .line 169
    iget p0, p0, Lso1;->α:I

    .line 170
    .line 171
    invoke-static {p1, p0}, Lhs1;->α(Ljs1;I)V

    .line 172
    .line 173
    .line 174
    return-object v8

    .line 175
    :pswitch_4
    check-cast p0, Lc21;

    .line 176
    .line 177
    if-ne p1, p0, :cond_1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    :goto_0
    return-object v5

    .line 185
    :pswitch_5
    check-cast p1, Lbh1;

    .line 186
    .line 187
    check-cast p0, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    :goto_1
    if-ge v7, v0, :cond_2

    .line 194
    .line 195
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Lch1;

    .line 200
    .line 201
    invoke-static {p1, v1}, Lbh1;->χ(Lbh1;Lch1;)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v7, v7, 0x1

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_2
    return-object v8

    .line 208
    :pswitch_6
    check-cast p0, Lw11;

    .line 209
    .line 210
    if-ne p1, p0, :cond_3

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    :goto_2
    return-object v5

    .line 218
    :pswitch_7
    check-cast p0, Lv11;

    .line 219
    .line 220
    if-ne p1, p0, :cond_4

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    :goto_3
    return-object v5

    .line 228
    :pswitch_8
    check-cast p1, Lv01;

    .line 229
    .line 230
    check-cast p0, Lk21;

    .line 231
    .line 232
    invoke-virtual {p0, p1}, Lk21;->β(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_9
    check-cast p1, Lcw;

    .line 239
    .line 240
    check-cast p0, Lya0;

    .line 241
    .line 242
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Lm6;->υ()Lde;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget-object p0, p0, Lya0;->θ:Le80;

    .line 251
    .line 252
    if-eqz p0, :cond_5

    .line 253
    .line 254
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    iget-object p1, p1, Lm6;->η:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p1, Lwa0;

    .line 261
    .line 262
    invoke-interface {p0, v0, p1}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_5
    return-object v8

    .line 266
    :pswitch_a
    check-cast p1, Lcw;

    .line 267
    .line 268
    check-cast p0, Lwa0;

    .line 269
    .line 270
    iget-object v0, p0, Lwa0;->μ:Lz91;

    .line 271
    .line 272
    iget-boolean v1, p0, Lwa0;->ξ:Z

    .line 273
    .line 274
    if-eqz v1, :cond_6

    .line 275
    .line 276
    iget-boolean v1, p0, Lwa0;->ψ:Z

    .line 277
    .line 278
    if-eqz v1, :cond_6

    .line 279
    .line 280
    if-eqz v0, :cond_6

    .line 281
    .line 282
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1}, Lm6;->Ζ()J

    .line 287
    .line 288
    .line 289
    move-result-wide v2

    .line 290
    invoke-virtual {v1}, Lm6;->υ()Lde;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-interface {v4}, Lde;->θ()V

    .line 295
    .line 296
    .line 297
    :try_start_0
    iget-object v4, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v4, Ln;

    .line 300
    .line 301
    iget-object v4, v4, Ln;->ζ:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, Lm6;

    .line 304
    .line 305
    invoke-virtual {v4}, Lm6;->υ()Lde;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-interface {v4, v0}, Lde;->λ(Lz91;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, p1}, Lwa0;->γ(Lcw;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Lm6;->υ()Lde;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-interface {p0}, Lde;->ζ()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v2, v3}, Lm6;->Υ(J)V

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :catchall_0
    move-exception v0

    .line 327
    move-object p0, v0

    .line 328
    invoke-virtual {v1}, Lm6;->υ()Lde;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-interface {p1}, Lde;->ζ()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, v2, v3}, Lm6;->Υ(J)V

    .line 336
    .line 337
    .line 338
    throw p0

    .line 339
    :cond_6
    invoke-virtual {p0, p1}, Lwa0;->γ(Lcw;)V

    .line 340
    .line 341
    .line 342
    :goto_4
    return-object v8

    .line 343
    :pswitch_b
    sget-object p1, Lta0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 344
    .line 345
    invoke-virtual {p1, v7, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    if-eqz p1, :cond_7

    .line 350
    .line 351
    check-cast p0, Lwc;

    .line 352
    .line 353
    invoke-interface {p0, v8}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    :cond_7
    return-object v8

    .line 357
    :pswitch_c
    check-cast p1, Lmv;

    .line 358
    .line 359
    iget-object v0, p1, Lq01;->ε:Lq01;

    .line 360
    .line 361
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 362
    .line 363
    if-nez v0, :cond_8

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_8
    iget-object v0, p1, Lmv;->υ:Lmv;

    .line 367
    .line 368
    if-eqz v0, :cond_a

    .line 369
    .line 370
    check-cast p0, Ln;

    .line 371
    .line 372
    new-instance v1, Lb0;

    .line 373
    .line 374
    const/16 v3, 0x9

    .line 375
    .line 376
    invoke-direct {v1, v3, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v0}, Lb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    if-eq p0, v2, :cond_9

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_9
    invoke-static {v0, v1}, Lg81;->ψ(Lx52;La80;)V

    .line 387
    .line 388
    .line 389
    :cond_a
    :goto_5
    iput-object v6, p1, Lmv;->υ:Lmv;

    .line 390
    .line 391
    iput-object v6, p1, Lmv;->τ:Lmv;

    .line 392
    .line 393
    move-object v1, v2

    .line 394
    :goto_6
    return-object v1

    .line 395
    :pswitch_d
    check-cast p1, Lmv;

    .line 396
    .line 397
    iget-boolean v0, p1, Lq01;->σ:Z

    .line 398
    .line 399
    if-nez v0, :cond_b

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_b
    iget-object v0, p1, Lmv;->υ:Lmv;

    .line 403
    .line 404
    if-nez v0, :cond_c

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_c
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 408
    .line 409
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    :goto_7
    iput-object v6, p1, Lmv;->υ:Lmv;

    .line 413
    .line 414
    check-cast p0, Lqm1;

    .line 415
    .line 416
    iget-boolean p1, p0, Lqm1;->ε:Z

    .line 417
    .line 418
    iput-boolean p1, p0, Lqm1;->ε:Z

    .line 419
    .line 420
    move-object v1, v2

    .line 421
    :goto_8
    return-object v1

    .line 422
    :pswitch_e
    check-cast p1, Lut;

    .line 423
    .line 424
    check-cast p0, Lwt;

    .line 425
    .line 426
    new-instance p1, Lmn;

    .line 427
    .line 428
    invoke-direct {p1, p0}, Lmn;-><init>(Lwt;)V

    .line 429
    .line 430
    .line 431
    return-object p1

    .line 432
    :pswitch_f
    check-cast p1, Lb4;

    .line 433
    .line 434
    iget v0, p1, Lb4;->β:F

    .line 435
    .line 436
    cmpg-float v1, v0, v3

    .line 437
    .line 438
    if-gez v1, :cond_d

    .line 439
    .line 440
    move v0, v3

    .line 441
    :cond_d
    const/high16 v1, 0x3f800000    # 1.0f

    .line 442
    .line 443
    cmpl-float v2, v0, v1

    .line 444
    .line 445
    if-lez v2, :cond_e

    .line 446
    .line 447
    move v0, v1

    .line 448
    :cond_e
    iget v2, p1, Lb4;->γ:F

    .line 449
    .line 450
    const/high16 v4, -0x41000000    # -0.5f

    .line 451
    .line 452
    cmpg-float v5, v2, v4

    .line 453
    .line 454
    if-gez v5, :cond_f

    .line 455
    .line 456
    move v2, v4

    .line 457
    :cond_f
    const/high16 v5, 0x3f000000    # 0.5f

    .line 458
    .line 459
    cmpl-float v6, v2, v5

    .line 460
    .line 461
    if-lez v6, :cond_10

    .line 462
    .line 463
    move v2, v5

    .line 464
    :cond_10
    iget v6, p1, Lb4;->δ:F

    .line 465
    .line 466
    cmpg-float v7, v6, v4

    .line 467
    .line 468
    if-gez v7, :cond_11

    .line 469
    .line 470
    goto :goto_9

    .line 471
    :cond_11
    move v4, v6

    .line 472
    :goto_9
    cmpl-float v6, v4, v5

    .line 473
    .line 474
    if-lez v6, :cond_12

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_12
    move v5, v4

    .line 478
    :goto_a
    iget p1, p1, Lb4;->α:F

    .line 479
    .line 480
    cmpg-float v4, p1, v3

    .line 481
    .line 482
    if-gez v4, :cond_13

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_13
    move v3, p1

    .line 486
    :goto_b
    cmpl-float p1, v3, v1

    .line 487
    .line 488
    if-lez p1, :cond_14

    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_14
    move v1, v3

    .line 492
    :goto_c
    sget-object p1, Lmi;->ω:Lu41;

    .line 493
    .line 494
    invoke-static {v0, v2, v5, v1, p1}, Lkn0;->α(FFFFLji;)J

    .line 495
    .line 496
    .line 497
    move-result-wide v0

    .line 498
    check-cast p0, Lji;

    .line 499
    .line 500
    invoke-static {v0, v1, p0}, Lci;->α(JLji;)J

    .line 501
    .line 502
    .line 503
    move-result-wide p0

    .line 504
    new-instance v0, Lci;

    .line 505
    .line 506
    invoke-direct {v0, p0, p1}, Lci;-><init>(J)V

    .line 507
    .line 508
    .line 509
    return-object v0

    .line 510
    :pswitch_10
    check-cast p1, Lbs1;

    .line 511
    .line 512
    check-cast p0, Landroid/content/res/Resources;

    .line 513
    .line 514
    invoke-static {p1, p0}, Lkn0;->ζ(Lbs1;Landroid/content/res/Resources;)Z

    .line 515
    .line 516
    .line 517
    move-result p0

    .line 518
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    return-object p0

    .line 523
    :pswitch_11
    check-cast p1, Lbs1;

    .line 524
    .line 525
    check-cast p0, Lsm0;

    .line 526
    .line 527
    iget p1, p1, Lbs1;->ζ:I

    .line 528
    .line 529
    invoke-virtual {p0, p1}, Lsm0;->α(I)Z

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    return-object p0

    .line 538
    :pswitch_12
    check-cast p1, Lc50;

    .line 539
    .line 540
    check-cast p0, Lum1;

    .line 541
    .line 542
    iput-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 543
    .line 544
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 545
    .line 546
    return-object p0

    .line 547
    :pswitch_13
    move-object v0, p1

    .line 548
    check-cast v0, Law0;

    .line 549
    .line 550
    check-cast p0, Lu0;

    .line 551
    .line 552
    iget-object p0, p0, Lu0;->υ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 553
    .line 554
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lom0;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    iget-object p1, p1, Lom0;->κ:Lu91;

    .line 559
    .line 560
    invoke-virtual {p1}, Lu91;->η()I

    .line 561
    .line 562
    .line 563
    move-result p1

    .line 564
    if-lez p1, :cond_18

    .line 565
    .line 566
    sget-object p1, Lsc2;->α:Ln11;

    .line 567
    .line 568
    iput-boolean v4, v0, Law0;->ε:Z

    .line 569
    .line 570
    iget-object p1, v0, Law0;->θ:Ldw0;

    .line 571
    .line 572
    invoke-virtual {p1}, Ldw0;->я()Lmp0;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    iget-wide v2, v0, Law0;->ζ:J

    .line 577
    .line 578
    const-wide v4, 0x7fffffff7fffffffL

    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    invoke-static {v2, v3, v4, v5}, Lum0;->α(JJ)Z

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    if-eqz v2, :cond_15

    .line 588
    .line 589
    const-wide/16 v2, 0x0

    .line 590
    .line 591
    invoke-interface {v1, v2, v3}, Lmp0;->δ(J)J

    .line 592
    .line 593
    .line 594
    move-result-wide v2

    .line 595
    invoke-static {v2, v3}, Lh62;->щ(J)J

    .line 596
    .line 597
    .line 598
    move-result-wide v2

    .line 599
    iput-wide v2, v0, Law0;->ζ:J

    .line 600
    .line 601
    invoke-interface {v1}, Lmp0;->з()J

    .line 602
    .line 603
    .line 604
    move-result-wide v2

    .line 605
    iput-wide v2, v0, Law0;->η:J

    .line 606
    .line 607
    :cond_15
    invoke-virtual {p1}, Ldw0;->Б()Lyp0;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    iget-object p1, p1, Lyp0;->Λ:Lbq0;

    .line 612
    .line 613
    invoke-virtual {p1}, Lbq0;->β()V

    .line 614
    .line 615
    .line 616
    invoke-interface {v1}, Lmp0;->з()J

    .line 617
    .line 618
    .line 619
    move-result-wide v1

    .line 620
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lom0;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    iget-object p1, p1, Lom0;->ι:Lb21;

    .line 625
    .line 626
    const/16 v3, 0x20

    .line 627
    .line 628
    shr-long v3, v1, v3

    .line 629
    .line 630
    long-to-int v4, v3

    .line 631
    const-wide v5, 0xffffffffL

    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    and-long/2addr v1, v5

    .line 637
    long-to-int v5, v1

    .line 638
    sget-object v6, Lsc2;->β:[Lqc2;

    .line 639
    .line 640
    array-length v9, v6

    .line 641
    move v10, v7

    .line 642
    :goto_d
    if-ge v10, v9, :cond_17

    .line 643
    .line 644
    aget-object v1, v6, v10

    .line 645
    .line 646
    invoke-virtual {p1, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    move-object v11, v2

    .line 654
    check-cast v11, Led2;

    .line 655
    .line 656
    move-object v12, v1

    .line 657
    check-cast v12, Lrc2;

    .line 658
    .line 659
    iget-object v1, v12, Lrc2;->γ:Lhm0;

    .line 660
    .line 661
    iget-wide v2, v11, Led2;->θ:J

    .line 662
    .line 663
    invoke-static/range {v0 .. v5}, Lsc2;->α(Law0;Lhm0;JII)V

    .line 664
    .line 665
    .line 666
    iget-object v1, v11, Led2;->β:Lx91;

    .line 667
    .line 668
    invoke-virtual {v1}, Lx91;->getValue()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    check-cast v1, Ljava/lang/Boolean;

    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 675
    .line 676
    .line 677
    move-result v1

    .line 678
    if-eqz v1, :cond_16

    .line 679
    .line 680
    iget-object v1, v11, Led2;->ζ:Lhm0;

    .line 681
    .line 682
    iget-wide v2, v11, Led2;->κ:J

    .line 683
    .line 684
    invoke-static/range {v0 .. v5}, Lsc2;->α(Law0;Lhm0;JII)V

    .line 685
    .line 686
    .line 687
    iget-object v1, v11, Led2;->η:Lhm0;

    .line 688
    .line 689
    iget-wide v2, v11, Led2;->λ:J

    .line 690
    .line 691
    invoke-static/range {v0 .. v5}, Lsc2;->α(Law0;Lhm0;JII)V

    .line 692
    .line 693
    .line 694
    :cond_16
    iget-object v1, v12, Lrc2;->δ:Lhm0;

    .line 695
    .line 696
    iget-wide v2, v11, Led2;->ι:J

    .line 697
    .line 698
    invoke-static/range {v0 .. v5}, Lsc2;->α(Law0;Lhm0;JII)V

    .line 699
    .line 700
    .line 701
    add-int/lit8 v10, v10, 0x1

    .line 702
    .line 703
    goto :goto_d

    .line 704
    :cond_17
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lom0;

    .line 705
    .line 706
    .line 707
    move-result-object p1

    .line 708
    iget-object p1, p1, Lom0;->λ:Lv11;

    .line 709
    .line 710
    invoke-virtual {p1}, Lv11;->ι()Z

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    if-eqz v1, :cond_18

    .line 715
    .line 716
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lom0;

    .line 717
    .line 718
    .line 719
    move-result-object p0

    .line 720
    iget-object p0, p0, Lom0;->μ:Lix1;

    .line 721
    .line 722
    iget-object v1, p1, Lv11;->α:[Ljava/lang/Object;

    .line 723
    .line 724
    iget p1, p1, Lv11;->β:I

    .line 725
    .line 726
    :goto_e
    if-ge v7, p1, :cond_18

    .line 727
    .line 728
    aget-object v2, v1, v7

    .line 729
    .line 730
    check-cast v2, Lg21;

    .line 731
    .line 732
    invoke-virtual {p0, v7}, Lix1;->get(I)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    check-cast v3, Lhm0;

    .line 737
    .line 738
    invoke-interface {v2}, Lc02;->getValue()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    check-cast v2, Landroid/graphics/Rect;

    .line 743
    .line 744
    invoke-virtual {v3}, Lhm0;->β()Lte0;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    iget v5, v2, Landroid/graphics/Rect;->left:I

    .line 749
    .line 750
    int-to-float v5, v5

    .line 751
    invoke-virtual {v0, v4, v5}, Law0;->γ(Lte0;F)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v3}, Lhm0;->δ()Lte0;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    iget v5, v2, Landroid/graphics/Rect;->top:I

    .line 759
    .line 760
    int-to-float v5, v5

    .line 761
    invoke-virtual {v0, v4, v5}, Law0;->γ(Lte0;F)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v3}, Lhm0;->γ()Lte0;

    .line 765
    .line 766
    .line 767
    move-result-object v4

    .line 768
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 769
    .line 770
    int-to-float v5, v5

    .line 771
    invoke-virtual {v0, v4, v5}, Law0;->γ(Lte0;F)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v3}, Lhm0;->α()Lte0;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 779
    .line 780
    int-to-float v2, v2

    .line 781
    invoke-virtual {v0, v3, v2}, Law0;->γ(Lte0;F)V

    .line 782
    .line 783
    .line 784
    add-int/lit8 v7, v7, 0x1

    .line 785
    .line 786
    goto :goto_e

    .line 787
    :cond_18
    return-object v8

    .line 788
    :pswitch_14
    check-cast p1, Lc50;

    .line 789
    .line 790
    check-cast p0, Lq40;

    .line 791
    .line 792
    iget p0, p0, Lq40;->α:I

    .line 793
    .line 794
    invoke-virtual {p1, p0}, Lc50;->И(I)Z

    .line 795
    .line 796
    .line 797
    move-result p0

    .line 798
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 799
    .line 800
    .line 801
    move-result-object p0

    .line 802
    return-object p0

    .line 803
    :pswitch_15
    check-cast p1, Lc0;

    .line 804
    .line 805
    check-cast p0, Lzp0;

    .line 806
    .line 807
    invoke-interface {p1}, Lc0;->й()I

    .line 808
    .line 809
    .line 810
    move-result v0

    .line 811
    const v1, 0x7fffffff

    .line 812
    .line 813
    .line 814
    if-ne v0, v1, :cond_19

    .line 815
    .line 816
    goto/16 :goto_12

    .line 817
    .line 818
    :cond_19
    invoke-interface {p1}, Lc0;->γ()Lzp0;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    iget-boolean v0, v0, Lzp0;->β:Z

    .line 823
    .line 824
    if-eqz v0, :cond_1a

    .line 825
    .line 826
    invoke-interface {p1}, Lc0;->Υ()V

    .line 827
    .line 828
    .line 829
    :cond_1a
    invoke-interface {p1}, Lc0;->γ()Lzp0;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    iget-object v0, v0, Lzp0;->η:Ljava/util/HashMap;

    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 844
    .line 845
    .line 846
    move-result v1

    .line 847
    if-eqz v1, :cond_1b

    .line 848
    .line 849
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    check-cast v1, Ljava/util/Map$Entry;

    .line 854
    .line 855
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    check-cast v2, Lre0;

    .line 860
    .line 861
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    check-cast v1, Ljava/lang/Number;

    .line 866
    .line 867
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 868
    .line 869
    .line 870
    move-result v1

    .line 871
    invoke-interface {p1}, Lc0;->Ζ()Lgm0;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    invoke-static {p0, v2, v1, v3}, Lzp0;->α(Lzp0;Lre0;ILq31;)V

    .line 876
    .line 877
    .line 878
    goto :goto_f

    .line 879
    :cond_1b
    invoke-interface {p1}, Lc0;->Ζ()Lgm0;

    .line 880
    .line 881
    .line 882
    move-result-object p1

    .line 883
    iget-object p1, p1, Lq31;->υ:Lq31;

    .line 884
    .line 885
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    :goto_10
    iget-object v0, p0, Lzp0;->α:Lch1;

    .line 889
    .line 890
    invoke-interface {v0}, Lc0;->Ζ()Lgm0;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v0

    .line 898
    if-nez v0, :cond_1d

    .line 899
    .line 900
    invoke-virtual {p0, p1}, Lzp0;->β(Lq31;)Ljava/util/Map;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    check-cast v0, Ljava/lang/Iterable;

    .line 909
    .line 910
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 915
    .line 916
    .line 917
    move-result v1

    .line 918
    if-eqz v1, :cond_1c

    .line 919
    .line 920
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    check-cast v1, Lre0;

    .line 925
    .line 926
    invoke-virtual {p0, p1, v1}, Lzp0;->γ(Lq31;Lre0;)I

    .line 927
    .line 928
    .line 929
    move-result v2

    .line 930
    invoke-static {p0, v1, v2, p1}, Lzp0;->α(Lzp0;Lre0;ILq31;)V

    .line 931
    .line 932
    .line 933
    goto :goto_11

    .line 934
    :cond_1c
    iget-object p1, p1, Lq31;->υ:Lq31;

    .line 935
    .line 936
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    goto :goto_10

    .line 940
    :cond_1d
    :goto_12
    return-object v8

    .line 941
    :pswitch_data_0
    .packed-switch 0x0
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
