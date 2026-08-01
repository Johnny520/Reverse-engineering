.class public final Lh2;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lww;


# direct methods
.method public synthetic constructor <init>(ILww;)V
    .locals 0

    .line 1
    iput p1, p0, Lh2;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lh2;->e:Lww;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lh2;->d:I

    .line 2
    .line 3
    sget-object v1, Lme0;->a:Lme0;

    .line 4
    .line 5
    sget-object v2, Lna1;->a:Lna1;

    .line 6
    .line 7
    iget-object p0, p0, Lh2;->e:Lww;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lji;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    and-int/2addr p2, v5

    .line 31
    check-cast p1, Lpi;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    sget-object p2, Ln2;->e:Lha;

    .line 40
    .line 41
    invoke-static {p2, v4}, Lza;->d(Lha;Z)Lxd0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {p1, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v6, Lfi;->b:Lei;

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v6, Lei;->b:Lcj;

    .line 63
    .line 64
    invoke-virtual {p1}, Lpi;->Z()V

    .line 65
    .line 66
    .line 67
    iget-boolean v7, p1, Lpi;->S:Z

    .line 68
    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {p1}, Lpi;->j0()V

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object v6, Lei;->e:Lm7;

    .line 79
    .line 80
    invoke-static {p1, v6, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p2, Lei;->d:Lm7;

    .line 84
    .line 85
    invoke-static {p1, p2, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p2, Lei;->f:Lm7;

    .line 89
    .line 90
    iget-boolean v3, p1, Lpi;->S:Z

    .line 91
    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v3, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_3

    .line 107
    .line 108
    :cond_2
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    sget-object p2, Lei;->c:Lm7;

    .line 112
    .line 113
    invoke-static {p1, p2, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-virtual {p1}, Lpi;->R()V

    .line 128
    .line 129
    .line 130
    :goto_2
    return-object v2

    .line 131
    :pswitch_0
    check-cast p1, Lji;

    .line 132
    .line 133
    check-cast p2, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    and-int/lit8 v0, p2, 0x3

    .line 140
    .line 141
    if-eq v0, v3, :cond_5

    .line 142
    .line 143
    move v0, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move v0, v4

    .line 146
    :goto_3
    and-int/2addr p2, v5

    .line 147
    check-cast p1, Lpi;

    .line 148
    .line 149
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_9

    .line 154
    .line 155
    sget-object p2, Ln2;->e:Lha;

    .line 156
    .line 157
    invoke-static {p2, v4}, Lza;->d(Lha;Z)Lxd0;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {p1, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    sget-object v6, Lfi;->b:Lei;

    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v6, Lei;->b:Lcj;

    .line 179
    .line 180
    invoke-virtual {p1}, Lpi;->Z()V

    .line 181
    .line 182
    .line 183
    iget-boolean v7, p1, Lpi;->S:Z

    .line 184
    .line 185
    if-eqz v7, :cond_6

    .line 186
    .line 187
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_6
    invoke-virtual {p1}, Lpi;->j0()V

    .line 192
    .line 193
    .line 194
    :goto_4
    sget-object v6, Lei;->e:Lm7;

    .line 195
    .line 196
    invoke-static {p1, v6, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object p2, Lei;->d:Lm7;

    .line 200
    .line 201
    invoke-static {p1, p2, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    sget-object p2, Lei;->f:Lm7;

    .line 205
    .line 206
    iget-boolean v3, p1, Lpi;->S:Z

    .line 207
    .line 208
    if-nez v3, :cond_7

    .line 209
    .line 210
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-static {v3, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-nez v3, :cond_8

    .line 223
    .line 224
    :cond_7
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 225
    .line 226
    .line 227
    :cond_8
    sget-object p2, Lei;->c:Lm7;

    .line 228
    .line 229
    invoke-static {p1, p2, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    invoke-virtual {p1}, Lpi;->R()V

    .line 244
    .line 245
    .line 246
    :goto_5
    return-object v2

    .line 247
    :pswitch_1
    check-cast p1, Lji;

    .line 248
    .line 249
    check-cast p2, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    and-int/lit8 v0, p2, 0x3

    .line 256
    .line 257
    if-eq v0, v3, :cond_a

    .line 258
    .line 259
    move v0, v5

    .line 260
    goto :goto_6

    .line 261
    :cond_a
    move v0, v4

    .line 262
    :goto_6
    and-int/2addr p2, v5

    .line 263
    check-cast p1, Lpi;

    .line 264
    .line 265
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    if-eqz p2, :cond_e

    .line 270
    .line 271
    sget-object p2, Ln2;->e:Lha;

    .line 272
    .line 273
    invoke-static {p2, v4}, Lza;->d(Lha;Z)Lxd0;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-static {p1, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    sget-object v6, Lfi;->b:Lei;

    .line 290
    .line 291
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    sget-object v6, Lei;->b:Lcj;

    .line 295
    .line 296
    invoke-virtual {p1}, Lpi;->Z()V

    .line 297
    .line 298
    .line 299
    iget-boolean v7, p1, Lpi;->S:Z

    .line 300
    .line 301
    if-eqz v7, :cond_b

    .line 302
    .line 303
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_b
    invoke-virtual {p1}, Lpi;->j0()V

    .line 308
    .line 309
    .line 310
    :goto_7
    sget-object v6, Lei;->e:Lm7;

    .line 311
    .line 312
    invoke-static {p1, v6, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    sget-object p2, Lei;->d:Lm7;

    .line 316
    .line 317
    invoke-static {p1, p2, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    sget-object p2, Lei;->f:Lm7;

    .line 321
    .line 322
    iget-boolean v3, p1, Lpi;->S:Z

    .line 323
    .line 324
    if-nez v3, :cond_c

    .line 325
    .line 326
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    invoke-static {v3, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-nez v3, :cond_d

    .line 339
    .line 340
    :cond_c
    invoke-static {v0, p1, v0, p2}, Lt1;->o(ILpi;ILm7;)V

    .line 341
    .line 342
    .line 343
    :cond_d
    sget-object p2, Lei;->c:Lm7;

    .line 344
    .line 345
    invoke-static {p1, p2, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 356
    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_e
    invoke-virtual {p1}, Lpi;->R()V

    .line 360
    .line 361
    .line 362
    :goto_8
    return-object v2

    .line 363
    :pswitch_2
    check-cast p1, Lji;

    .line 364
    .line 365
    check-cast p2, Ljava/lang/Number;

    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    and-int/lit8 v0, p2, 0x3

    .line 372
    .line 373
    if-eq v0, v3, :cond_f

    .line 374
    .line 375
    move v0, v5

    .line 376
    goto :goto_9

    .line 377
    :cond_f
    move v0, v4

    .line 378
    :goto_9
    and-int/2addr p2, v5

    .line 379
    check-cast p1, Lpi;

    .line 380
    .line 381
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 382
    .line 383
    .line 384
    move-result p2

    .line 385
    if-eqz p2, :cond_13

    .line 386
    .line 387
    new-instance p2, Ls60;

    .line 388
    .line 389
    const/high16 v0, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-direct {p2, v0, v4}, Ls60;-><init>(FZ)V

    .line 392
    .line 393
    .line 394
    sget-object v0, Lm2;->c:Lln0;

    .line 395
    .line 396
    invoke-static {p2, v0}, Lrd0;->C(Lpe0;Ljn0;)Lpe0;

    .line 397
    .line 398
    .line 399
    move-result-object p2

    .line 400
    sget-object v0, Ln2;->q:Lfa;

    .line 401
    .line 402
    new-instance v1, Laz;

    .line 403
    .line 404
    invoke-direct {v1, v0}, Laz;-><init>(Lfa;)V

    .line 405
    .line 406
    .line 407
    invoke-interface {p2, v1}, Lpe0;->c(Lpe0;)Lpe0;

    .line 408
    .line 409
    .line 410
    move-result-object p2

    .line 411
    sget-object v0, Ln2;->e:Lha;

    .line 412
    .line 413
    invoke-static {v0, v4}, Lza;->d(Lha;Z)Lxd0;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-static {p1, p2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    sget-object v6, Lfi;->b:Lei;

    .line 430
    .line 431
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    sget-object v6, Lei;->b:Lcj;

    .line 435
    .line 436
    invoke-virtual {p1}, Lpi;->Z()V

    .line 437
    .line 438
    .line 439
    iget-boolean v7, p1, Lpi;->S:Z

    .line 440
    .line 441
    if-eqz v7, :cond_10

    .line 442
    .line 443
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 444
    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_10
    invoke-virtual {p1}, Lpi;->j0()V

    .line 448
    .line 449
    .line 450
    :goto_a
    sget-object v6, Lei;->e:Lm7;

    .line 451
    .line 452
    invoke-static {p1, v6, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lei;->d:Lm7;

    .line 456
    .line 457
    invoke-static {p1, v0, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    sget-object v0, Lei;->f:Lm7;

    .line 461
    .line 462
    iget-boolean v3, p1, Lpi;->S:Z

    .line 463
    .line 464
    if-nez v3, :cond_11

    .line 465
    .line 466
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    invoke-static {v3, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-nez v3, :cond_12

    .line 479
    .line 480
    :cond_11
    invoke-static {v1, p1, v1, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 481
    .line 482
    .line 483
    :cond_12
    sget-object v0, Lei;->c:Lm7;

    .line 484
    .line 485
    invoke-static {p1, v0, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 496
    .line 497
    .line 498
    goto :goto_b

    .line 499
    :cond_13
    invoke-virtual {p1}, Lpi;->R()V

    .line 500
    .line 501
    .line 502
    :goto_b
    return-object v2

    .line 503
    :pswitch_3
    check-cast p1, Lji;

    .line 504
    .line 505
    check-cast p2, Ljava/lang/Number;

    .line 506
    .line 507
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result p2

    .line 511
    and-int/lit8 v0, p2, 0x3

    .line 512
    .line 513
    if-eq v0, v3, :cond_14

    .line 514
    .line 515
    move v0, v5

    .line 516
    goto :goto_c

    .line 517
    :cond_14
    move v0, v4

    .line 518
    :goto_c
    and-int/2addr p2, v5

    .line 519
    check-cast p1, Lpi;

    .line 520
    .line 521
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 522
    .line 523
    .line 524
    move-result p2

    .line 525
    if-eqz p2, :cond_18

    .line 526
    .line 527
    sget-object p2, Lm2;->b:Lln0;

    .line 528
    .line 529
    invoke-static {v1, p2}, Lrd0;->C(Lpe0;Ljn0;)Lpe0;

    .line 530
    .line 531
    .line 532
    move-result-object p2

    .line 533
    sget-object v0, Ln2;->q:Lfa;

    .line 534
    .line 535
    new-instance v1, Laz;

    .line 536
    .line 537
    invoke-direct {v1, v0}, Laz;-><init>(Lfa;)V

    .line 538
    .line 539
    .line 540
    invoke-interface {p2, v1}, Lpe0;->c(Lpe0;)Lpe0;

    .line 541
    .line 542
    .line 543
    move-result-object p2

    .line 544
    sget-object v0, Ln2;->e:Lha;

    .line 545
    .line 546
    invoke-static {v0, v4}, Lza;->d(Lha;Z)Lxd0;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    invoke-static {p1, p2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 559
    .line 560
    .line 561
    move-result-object p2

    .line 562
    sget-object v6, Lfi;->b:Lei;

    .line 563
    .line 564
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    sget-object v6, Lei;->b:Lcj;

    .line 568
    .line 569
    invoke-virtual {p1}, Lpi;->Z()V

    .line 570
    .line 571
    .line 572
    iget-boolean v7, p1, Lpi;->S:Z

    .line 573
    .line 574
    if-eqz v7, :cond_15

    .line 575
    .line 576
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 577
    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_15
    invoke-virtual {p1}, Lpi;->j0()V

    .line 581
    .line 582
    .line 583
    :goto_d
    sget-object v6, Lei;->e:Lm7;

    .line 584
    .line 585
    invoke-static {p1, v6, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    sget-object v0, Lei;->d:Lm7;

    .line 589
    .line 590
    invoke-static {p1, v0, v3}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    sget-object v0, Lei;->f:Lm7;

    .line 594
    .line 595
    iget-boolean v3, p1, Lpi;->S:Z

    .line 596
    .line 597
    if-nez v3, :cond_16

    .line 598
    .line 599
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    invoke-static {v3, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-nez v3, :cond_17

    .line 612
    .line 613
    :cond_16
    invoke-static {v1, p1, v1, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 614
    .line 615
    .line 616
    :cond_17
    sget-object v0, Lei;->c:Lm7;

    .line 617
    .line 618
    invoke-static {p1, v0, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 622
    .line 623
    .line 624
    move-result-object p2

    .line 625
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    invoke-virtual {p1, v5}, Lpi;->p(Z)V

    .line 629
    .line 630
    .line 631
    goto :goto_e

    .line 632
    :cond_18
    invoke-virtual {p1}, Lpi;->R()V

    .line 633
    .line 634
    .line 635
    :goto_e
    return-object v2

    .line 636
    nop

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
