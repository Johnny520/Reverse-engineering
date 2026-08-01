.class public final synthetic Lgy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgy0;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Lgy0;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lwp1;

    .line 7
    .line 8
    check-cast p2, Lur0;

    .line 9
    .line 10
    iget p0, p2, Lur0;->α:I

    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, Lwp1;

    .line 18
    .line 19
    check-cast p2, Lvr0;

    .line 20
    .line 21
    iget p0, p2, Lvr0;->α:I

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    check-cast p1, Lwp1;

    .line 29
    .line 30
    check-cast p2, Ltr0;

    .line 31
    .line 32
    iget p0, p2, Ltr0;->α:F

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_2
    check-cast p1, Lwp1;

    .line 40
    .line 41
    check-cast p2, Lwr0;

    .line 42
    .line 43
    iget p0, p2, Lwr0;->α:F

    .line 44
    .line 45
    new-instance v0, Ltr0;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Ltr0;-><init>(F)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lrq1;->Δ:Lqq1;

    .line 51
    .line 52
    invoke-static {v0, p0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget v0, p2, Lwr0;->β:I

    .line 57
    .line 58
    new-instance v1, Lvr0;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Lvr0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lrq1;->Ε:Lqq1;

    .line 64
    .line 65
    invoke-static {v1, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget p2, p2, Lwr0;->γ:I

    .line 70
    .line 71
    new-instance v1, Lur0;

    .line 72
    .line 73
    invoke-direct {v1, p2}, Lur0;-><init>(I)V

    .line 74
    .line 75
    .line 76
    sget-object p2, Lrq1;->Ζ:Lqq1;

    .line 77
    .line 78
    invoke-static {v1, p2, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_3
    check-cast p1, Lwp1;

    .line 92
    .line 93
    check-cast p2, Lzu0;

    .line 94
    .line 95
    iget-object p0, p2, Lzu0;->α:Ljava/util/Locale;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_4
    check-cast p1, Lwp1;

    .line 103
    .line 104
    check-cast p2, Lav0;

    .line 105
    .line 106
    iget-object p0, p2, Lav0;->ε:Ljava/lang/Object;

    .line 107
    .line 108
    new-instance p2, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/4 v1, 0x0

    .line 122
    :goto_0
    if-ge v1, v0, :cond_0

    .line 123
    .line 124
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Lzu0;

    .line 129
    .line 130
    sget-object v3, Lrq1;->Β:Ln5;

    .line 131
    .line 132
    invoke-static {v2, v3, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_0
    return-object p2

    .line 143
    :pswitch_5
    check-cast p1, Lwp1;

    .line 144
    .line 145
    check-cast p2, Lf4;

    .line 146
    .line 147
    iget-object p0, p2, Lf4;->α:Ljava/lang/Object;

    .line 148
    .line 149
    instance-of v0, p0, Lr91;

    .line 150
    .line 151
    if-eqz v0, :cond_1

    .line 152
    .line 153
    sget-object v0, Li4;->ε:Li4;

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_1
    instance-of v0, p0, Lux1;

    .line 157
    .line 158
    if-eqz v0, :cond_2

    .line 159
    .line 160
    sget-object v0, Li4;->ζ:Li4;

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_2
    instance-of v0, p0, Lq72;

    .line 164
    .line 165
    if-eqz v0, :cond_3

    .line 166
    .line 167
    sget-object v0, Li4;->η:Li4;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_3
    instance-of v0, p0, La72;

    .line 171
    .line 172
    if-eqz v0, :cond_4

    .line 173
    .line 174
    sget-object v0, Li4;->θ:Li4;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    instance-of v0, p0, Lgs0;

    .line 178
    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    sget-object v0, Li4;->ι:Li4;

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_5
    instance-of v0, p0, Lfs0;

    .line 185
    .line 186
    if-eqz v0, :cond_6

    .line 187
    .line 188
    sget-object v0, Li4;->κ:Li4;

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_6
    instance-of v0, p0, Lp02;

    .line 192
    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    sget-object v0, Li4;->λ:Li4;

    .line 196
    .line 197
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    packed-switch v1, :pswitch_data_1

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lγ;->κ()V

    .line 205
    .line 206
    .line 207
    const/4 p0, 0x0

    .line 208
    goto :goto_3

    .line 209
    :pswitch_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    check-cast p0, Lp02;

    .line 213
    .line 214
    iget-object p0, p0, Lp02;->α:Ljava/lang/String;

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :pswitch_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    check-cast p0, Lfs0;

    .line 221
    .line 222
    sget-object v1, Lrq1;->ζ:Ln5;

    .line 223
    .line 224
    invoke-static {p0, v1, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    goto :goto_2

    .line 229
    :pswitch_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    check-cast p0, Lgs0;

    .line 233
    .line 234
    sget-object v1, Lrq1;->ε:Ln5;

    .line 235
    .line 236
    invoke-static {p0, v1, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    goto :goto_2

    .line 241
    :pswitch_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    check-cast p0, La72;

    .line 245
    .line 246
    sget-object v1, Lrq1;->δ:Ln5;

    .line 247
    .line 248
    invoke-static {p0, v1, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    goto :goto_2

    .line 253
    :pswitch_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    check-cast p0, Lq72;

    .line 257
    .line 258
    sget-object v1, Lrq1;->γ:Ln5;

    .line 259
    .line 260
    invoke-static {p0, v1, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    goto :goto_2

    .line 265
    :pswitch_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    check-cast p0, Lux1;

    .line 269
    .line 270
    sget-object v1, Lrq1;->θ:Ln5;

    .line 271
    .line 272
    invoke-static {p0, v1, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    goto :goto_2

    .line 277
    :pswitch_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    check-cast p0, Lr91;

    .line 281
    .line 282
    sget-object v1, Lrq1;->η:Ln5;

    .line 283
    .line 284
    invoke-static {p0, v1, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    :goto_2
    iget p1, p2, Lf4;->β:I

    .line 289
    .line 290
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iget v1, p2, Lf4;->γ:I

    .line 295
    .line 296
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    iget-object p2, p2, Lf4;->δ:Ljava/lang/String;

    .line 301
    .line 302
    filled-new-array {v0, p0, p1, v1, p2}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    :goto_3
    return-object p0

    .line 311
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 312
    .line 313
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 314
    .line 315
    .line 316
    throw p0

    .line 317
    :pswitch_d
    check-cast p1, Lwp1;

    .line 318
    .line 319
    check-cast p2, Lo41;

    .line 320
    .line 321
    if-nez p2, :cond_8

    .line 322
    .line 323
    const/4 p0, 0x0

    .line 324
    goto :goto_4

    .line 325
    :cond_8
    iget-wide p0, p2, Lo41;->α:J

    .line 326
    .line 327
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    invoke-static {p0, p1, v0, v1}, Lo41;->α(JJ)Z

    .line 333
    .line 334
    .line 335
    move-result p0

    .line 336
    :goto_4
    if-eqz p0, :cond_9

    .line 337
    .line 338
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_9
    iget-wide p0, p2, Lo41;->α:J

    .line 342
    .line 343
    const/16 v0, 0x20

    .line 344
    .line 345
    shr-long/2addr p0, v0

    .line 346
    long-to-int p0, p0

    .line 347
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 348
    .line 349
    .line 350
    move-result p0

    .line 351
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    iget-wide p1, p2, Lo41;->α:J

    .line 356
    .line 357
    const-wide v0, 0xffffffffL

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    and-long/2addr p1, v0

    .line 363
    long-to-int p1, p1

    .line 364
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    filled-new-array {p0, p1}, [Ljava/lang/Float;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    :goto_5
    return-object p0

    .line 381
    :pswitch_e
    check-cast p1, Lwp1;

    .line 382
    .line 383
    check-cast p2, Lz32;

    .line 384
    .line 385
    iget-wide p0, p2, Lz32;->α:J

    .line 386
    .line 387
    const-wide v0, 0x200000000L

    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    invoke-static {p0, p1, v0, v1}, Lz32;->α(JJ)Z

    .line 393
    .line 394
    .line 395
    move-result p2

    .line 396
    if-eqz p2, :cond_a

    .line 397
    .line 398
    const/4 p0, 0x0

    .line 399
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    goto :goto_6

    .line 404
    :cond_a
    const-wide v0, 0x100000000L

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    invoke-static {p0, p1, v0, v1}, Lz32;->α(JJ)Z

    .line 410
    .line 411
    .line 412
    move-result p0

    .line 413
    if-eqz p0, :cond_b

    .line 414
    .line 415
    const/4 p0, 0x1

    .line 416
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    goto :goto_6

    .line 421
    :cond_b
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 422
    .line 423
    :goto_6
    return-object p0

    .line 424
    :pswitch_f
    check-cast p1, Lwp1;

    .line 425
    .line 426
    check-cast p2, Lfs0;

    .line 427
    .line 428
    iget-object p0, p2, Lfs0;->α:Ljava/lang/String;

    .line 429
    .line 430
    iget-object p2, p2, Lfs0;->β:Lo32;

    .line 431
    .line 432
    sget-object v0, Lrq1;->ι:Ln5;

    .line 433
    .line 434
    invoke-static {p2, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    return-object p0

    .line 447
    :pswitch_10
    check-cast p1, Lwp1;

    .line 448
    .line 449
    check-cast p2, Ly32;

    .line 450
    .line 451
    sget-wide v0, Ly32;->γ:J

    .line 452
    .line 453
    if-nez p2, :cond_c

    .line 454
    .line 455
    const/4 p0, 0x0

    .line 456
    goto :goto_7

    .line 457
    :cond_c
    iget-wide v2, p2, Ly32;->α:J

    .line 458
    .line 459
    invoke-static {v2, v3, v0, v1}, Ly32;->α(JJ)Z

    .line 460
    .line 461
    .line 462
    move-result p0

    .line 463
    :goto_7
    if-eqz p0, :cond_d

    .line 464
    .line 465
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_d
    iget-wide v0, p2, Ly32;->α:J

    .line 469
    .line 470
    invoke-static {v0, v1}, Ly32;->γ(J)F

    .line 471
    .line 472
    .line 473
    move-result p0

    .line 474
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    iget-wide v0, p2, Ly32;->α:J

    .line 479
    .line 480
    invoke-static {v0, v1}, Ly32;->β(J)J

    .line 481
    .line 482
    .line 483
    move-result-wide v0

    .line 484
    new-instance p2, Lz32;

    .line 485
    .line 486
    invoke-direct {p2, v0, v1}, Lz32;-><init>(J)V

    .line 487
    .line 488
    .line 489
    sget-object v0, Lrq1;->ψ:Lqq1;

    .line 490
    .line 491
    invoke-static {p2, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    :goto_8
    return-object p0

    .line 504
    :pswitch_11
    check-cast p1, Lwp1;

    .line 505
    .line 506
    check-cast p2, Lc60;

    .line 507
    .line 508
    iget p0, p2, Lc60;->α:I

    .line 509
    .line 510
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    return-object p0

    .line 515
    :pswitch_12
    check-cast p1, Lwp1;

    .line 516
    .line 517
    check-cast p2, Lb60;

    .line 518
    .line 519
    iget p0, p2, Lb60;->α:I

    .line 520
    .line 521
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object p0

    .line 525
    return-object p0

    .line 526
    :pswitch_13
    check-cast p1, Lwp1;

    .line 527
    .line 528
    check-cast p2, Lrg0;

    .line 529
    .line 530
    iget p0, p2, Lrg0;->α:I

    .line 531
    .line 532
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    return-object p0

    .line 537
    :pswitch_14
    check-cast p1, Lwp1;

    .line 538
    .line 539
    check-cast p2, Le32;

    .line 540
    .line 541
    iget p0, p2, Le32;->α:I

    .line 542
    .line 543
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    return-object p0

    .line 548
    :pswitch_15
    check-cast p1, Lwp1;

    .line 549
    .line 550
    check-cast p2, Lz22;

    .line 551
    .line 552
    iget p0, p2, Lz22;->α:I

    .line 553
    .line 554
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    return-object p0

    .line 559
    :pswitch_16
    check-cast p1, Lwp1;

    .line 560
    .line 561
    check-cast p2, Lfv1;

    .line 562
    .line 563
    iget-wide v0, p2, Lfv1;->α:J

    .line 564
    .line 565
    new-instance p0, Lci;

    .line 566
    .line 567
    invoke-direct {p0, v0, v1}, Lci;-><init>(J)V

    .line 568
    .line 569
    .line 570
    sget-object v0, Lrq1;->π:Lqq1;

    .line 571
    .line 572
    invoke-static {p0, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    iget-wide v0, p2, Lfv1;->β:J

    .line 577
    .line 578
    new-instance v2, Lo41;

    .line 579
    .line 580
    invoke-direct {v2, v0, v1}, Lo41;-><init>(J)V

    .line 581
    .line 582
    .line 583
    sget-object v0, Lrq1;->ω:Lqq1;

    .line 584
    .line 585
    invoke-static {v2, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    iget p2, p2, Lfv1;->γ:F

    .line 590
    .line 591
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 592
    .line 593
    .line 594
    move-result-object p2

    .line 595
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object p0

    .line 599
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    return-object p0

    .line 604
    :pswitch_17
    check-cast p1, Lwp1;

    .line 605
    .line 606
    check-cast p2, Lr32;

    .line 607
    .line 608
    iget-wide p0, p2, Lr32;->α:J

    .line 609
    .line 610
    const/16 v0, 0x20

    .line 611
    .line 612
    shr-long/2addr p0, v0

    .line 613
    long-to-int p0, p0

    .line 614
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    iget-wide p1, p2, Lr32;->α:J

    .line 619
    .line 620
    const-wide v0, 0xffffffffL

    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    and-long/2addr p1, v0

    .line 626
    long-to-int p1, p1

    .line 627
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    return-object p0

    .line 640
    :pswitch_18
    check-cast p1, Lwp1;

    .line 641
    .line 642
    check-cast p2, Ljava/util/List;

    .line 643
    .line 644
    new-instance p0, Ljava/util/ArrayList;

    .line 645
    .line 646
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 651
    .line 652
    .line 653
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    const/4 v1, 0x0

    .line 658
    :goto_9
    if-ge v1, v0, :cond_e

    .line 659
    .line 660
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    check-cast v2, Lf4;

    .line 665
    .line 666
    sget-object v3, Lrq1;->β:Ln5;

    .line 667
    .line 668
    invoke-static {v2, v3, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    add-int/lit8 v1, v1, 0x1

    .line 676
    .line 677
    goto :goto_9

    .line 678
    :cond_e
    return-object p0

    .line 679
    :pswitch_19
    check-cast p1, Lwp1;

    .line 680
    .line 681
    check-cast p2, Lr8;

    .line 682
    .line 683
    iget p0, p2, Lr8;->α:F

    .line 684
    .line 685
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    return-object p0

    .line 690
    :pswitch_1a
    check-cast p1, Lwp1;

    .line 691
    .line 692
    check-cast p2, Lgs0;

    .line 693
    .line 694
    iget-object p0, p2, Lgs0;->α:Ljava/lang/String;

    .line 695
    .line 696
    iget-object p2, p2, Lgs0;->β:Lo32;

    .line 697
    .line 698
    sget-object v0, Lrq1;->ι:Ln5;

    .line 699
    .line 700
    invoke-static {p2, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object p1

    .line 704
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    return-object p0

    .line 713
    :pswitch_1b
    check-cast p1, Lwp1;

    .line 714
    .line 715
    check-cast p2, Ld60;

    .line 716
    .line 717
    iget p0, p2, Ld60;->ε:I

    .line 718
    .line 719
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 720
    .line 721
    .line 722
    move-result-object p0

    .line 723
    return-object p0

    .line 724
    :pswitch_1c
    check-cast p1, Lwp1;

    .line 725
    .line 726
    check-cast p2, Lh32;

    .line 727
    .line 728
    iget-wide v0, p2, Lh32;->α:J

    .line 729
    .line 730
    new-instance p0, Ly32;

    .line 731
    .line 732
    invoke-direct {p0, v0, v1}, Ly32;-><init>(J)V

    .line 733
    .line 734
    .line 735
    sget-object v0, Lrq1;->χ:Lqq1;

    .line 736
    .line 737
    invoke-static {p0, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    iget-wide v1, p2, Lh32;->β:J

    .line 742
    .line 743
    new-instance p2, Ly32;

    .line 744
    .line 745
    invoke-direct {p2, v1, v2}, Ly32;-><init>(J)V

    .line 746
    .line 747
    .line 748
    invoke-static {p2, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object p1

    .line 752
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object p0

    .line 756
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 757
    .line 758
    .line 759
    move-result-object p0

    .line 760
    return-object p0

    .line 761
    :pswitch_1d
    check-cast p1, Lwp1;

    .line 762
    .line 763
    check-cast p2, Lg32;

    .line 764
    .line 765
    iget p0, p2, Lg32;->α:F

    .line 766
    .line 767
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 768
    .line 769
    .line 770
    move-result-object p0

    .line 771
    iget p1, p2, Lg32;->β:F

    .line 772
    .line 773
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 774
    .line 775
    .line 776
    move-result-object p1

    .line 777
    filled-new-array {p0, p1}, [Ljava/lang/Float;

    .line 778
    .line 779
    .line 780
    move-result-object p0

    .line 781
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 782
    .line 783
    .line 784
    move-result-object p0

    .line 785
    return-object p0

    .line 786
    :pswitch_1e
    check-cast p1, Lwp1;

    .line 787
    .line 788
    check-cast p2, Lc32;

    .line 789
    .line 790
    iget p0, p2, Lc32;->α:I

    .line 791
    .line 792
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    return-object p0

    .line 797
    :pswitch_1f
    check-cast p1, Lwp1;

    .line 798
    .line 799
    check-cast p2, Lg4;

    .line 800
    .line 801
    iget-object p0, p2, Lg4;->ζ:Ljava/lang/String;

    .line 802
    .line 803
    iget-object p2, p2, Lg4;->ε:Ljava/util/List;

    .line 804
    .line 805
    sget-object v0, Lrq1;->α:Ln5;

    .line 806
    .line 807
    invoke-static {p2, v0, p1}, Lrq1;->α(Ljava/lang/Object;Lmq1;Lwp1;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object p1

    .line 811
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object p0

    .line 815
    invoke-static {p0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 816
    .line 817
    .line 818
    move-result-object p0

    .line 819
    return-object p0

    .line 820
    :pswitch_20
    check-cast p1, Ljava/lang/Integer;

    .line 821
    .line 822
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 823
    .line 824
    .line 825
    move-result p0

    .line 826
    check-cast p2, Lsp;

    .line 827
    .line 828
    add-int/lit8 p0, p0, 0x1

    .line 829
    .line 830
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 831
    .line 832
    .line 833
    move-result-object p0

    .line 834
    return-object p0

    .line 835
    :pswitch_21
    check-cast p1, Lk01;

    .line 836
    .line 837
    check-cast p2, Ljava/lang/Boolean;

    .line 838
    .line 839
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 840
    .line 841
    .line 842
    move-result p0

    .line 843
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->β(Lk01;Z)Ls62;

    .line 844
    .line 845
    .line 846
    move-result-object p0

    .line 847
    return-object p0

    .line 848
    :pswitch_22
    check-cast p1, Lk01;

    .line 849
    .line 850
    check-cast p2, Ljava/lang/Boolean;

    .line 851
    .line 852
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 853
    .line 854
    .line 855
    move-result p0

    .line 856
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->γ(Lk01;Z)Ls62;

    .line 857
    .line 858
    .line 859
    move-result-object p0

    .line 860
    return-object p0

    .line 861
    :pswitch_23
    check-cast p1, Ljava/lang/Long;

    .line 862
    .line 863
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 864
    .line 865
    .line 866
    move-result-wide p0

    .line 867
    check-cast p2, Ljava/lang/Long;

    .line 868
    .line 869
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 870
    .line 871
    .line 872
    move-result-wide v0

    .line 873
    const-wide/16 v2, 0x0

    .line 874
    .line 875
    cmp-long p2, v0, v2

    .line 876
    .line 877
    if-lez p2, :cond_f

    .line 878
    .line 879
    const/16 p2, 0x64

    .line 880
    .line 881
    int-to-long v2, p2

    .line 882
    mul-long/2addr p0, v2

    .line 883
    div-long/2addr p0, v0

    .line 884
    long-to-int p0, p0

    .line 885
    const/4 p1, 0x0

    .line 886
    invoke-static {p0, p1, p2}, Lj81;->μ(III)I

    .line 887
    .line 888
    .line 889
    move-result p0

    .line 890
    goto :goto_a

    .line 891
    :cond_f
    const/4 p0, -0x1

    .line 892
    :goto_a
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 893
    .line 894
    .line 895
    move-result-object p0

    .line 896
    return-object p0

    .line 897
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
