.class public final Lu4/j;
.super Lu4/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final o:Lv4/c0;

.field public static final p:Lv4/c0;

.field public static final q:Lv4/c0;


# instance fields
.field public final k:Lw4/e;

.field public final l:Lv4/y;

.field public final m:Lv4/y;

.field public final n:Lv4/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv4/c0;

    .line 2
    .line 3
    const-string v1, "([Ljava/lang/Object;)Ljava/lang/Object;"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu4/j;->o:Lv4/c0;

    .line 9
    .line 10
    new-instance v0, Lv4/c0;

    .line 11
    .line 12
    const-string v1, "([Ljava/lang/Object;)V"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lu4/j;->p:Lv4/c0;

    .line 18
    .line 19
    new-instance v0, Lv4/c0;

    .line 20
    .line 21
    const-string v1, "([Ljava/lang/Object;)Z"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lu4/j;->q:Lv4/c0;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/y;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Lu4/i;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 3
    .line 4
    .line 5
    iget p1, p1, Lu4/r;->e:I

    .line 6
    .line 7
    const/4 p2, 0x6

    .line 8
    if-ne p1, p2, :cond_25

    .line 9
    .line 10
    if-eqz p4, :cond_24

    .line 11
    .line 12
    iput-object p4, p0, Lu4/j;->k:Lw4/e;

    .line 13
    .line 14
    if-eqz p5, :cond_23

    .line 15
    .line 16
    invoke-virtual {p5}, Lv4/e;->k()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_22

    .line 21
    .line 22
    iput-object p5, p0, Lu4/j;->l:Lv4/y;

    .line 23
    .line 24
    iget-object p1, p5, Lv4/w;->g:Lv4/d0;

    .line 25
    .line 26
    iget-object p3, p5, Lv4/w;->h:Lv4/z;

    .line 27
    .line 28
    iget-object p3, p3, Lv4/z;->g:Lv4/c0;

    .line 29
    .line 30
    iget-object p4, p3, Lv4/c0;->g:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v1, Lv4/d0;->B:Lv4/d0;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sget-object v2, Lu4/j;->o:Lv4/c0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const-string v1, "invoke"

    .line 43
    .line 44
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    const-string v1, "invokeExact"

    .line 51
    .line 52
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    :cond_0
    new-instance p2, Lv4/z;

    .line 59
    .line 60
    invoke-direct {p2, p3, v2}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 61
    .line 62
    .line 63
    new-instance p3, Lv4/y;

    .line 64
    .line 65
    invoke-direct {p3, p1, p2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_1
    sget-object v1, Lv4/d0;->C:Lv4/d0;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_21

    .line 77
    .line 78
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/4 v3, -0x1

    .line 86
    sparse-switch v1, :sswitch_data_0

    .line 87
    .line 88
    .line 89
    :goto_0
    move p2, v3

    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :sswitch_0
    const-string p2, "weakCompareAndSetRelease"

    .line 93
    .line 94
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_2

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const/16 p2, 0x1e

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :sswitch_1
    const-string p2, "getAndSetAcquire"

    .line 106
    .line 107
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-nez p2, :cond_3

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    const/16 p2, 0x1d

    .line 115
    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :sswitch_2
    const-string p2, "compareAndExchange"

    .line 119
    .line 120
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_4

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    const/16 p2, 0x1c

    .line 128
    .line 129
    goto/16 :goto_1

    .line 130
    .line 131
    :sswitch_3
    const-string p2, "getAndBitwiseOr"

    .line 132
    .line 133
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-nez p2, :cond_5

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_5
    const/16 p2, 0x1b

    .line 141
    .line 142
    goto/16 :goto_1

    .line 143
    .line 144
    :sswitch_4
    const-string p2, "getAndBitwiseXorAcquire"

    .line 145
    .line 146
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-nez p2, :cond_6

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_6
    const/16 p2, 0x1a

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :sswitch_5
    const-string p2, "getAndAddAcquire"

    .line 158
    .line 159
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-nez p2, :cond_7

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_7
    const/16 p2, 0x19

    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :sswitch_6
    const-string p2, "compareAndExchangeAcquire"

    .line 171
    .line 172
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-nez p2, :cond_8

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_8
    const/16 p2, 0x18

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :sswitch_7
    const-string p2, "getOpaque"

    .line 184
    .line 185
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-nez p2, :cond_9

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_9
    const/16 p2, 0x17

    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :sswitch_8
    const-string p2, "setOpaque"

    .line 197
    .line 198
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-nez p2, :cond_a

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_a
    const/16 p2, 0x16

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :sswitch_9
    const-string p2, "getAndBitwiseAndAcquire"

    .line 210
    .line 211
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-nez p2, :cond_b

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_b
    const/16 p2, 0x15

    .line 220
    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :sswitch_a
    const-string p2, "getAndSet"

    .line 224
    .line 225
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    if-nez p2, :cond_c

    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_c
    const/16 p2, 0x14

    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :sswitch_b
    const-string p2, "getAndAdd"

    .line 238
    .line 239
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-nez p2, :cond_d

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_d
    const/16 p2, 0x13

    .line 248
    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :sswitch_c
    const-string p2, "getVolatile"

    .line 252
    .line 253
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-nez p2, :cond_e

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_e
    const/16 p2, 0x12

    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :sswitch_d
    const-string p2, "setVolatile"

    .line 266
    .line 267
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    if-nez p2, :cond_f

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_f
    const/16 p2, 0x11

    .line 276
    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :sswitch_e
    const-string p2, "getAndBitwiseOrAcquire"

    .line 280
    .line 281
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    if-nez p2, :cond_10

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_10
    const/16 p2, 0x10

    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :sswitch_f
    const-string p2, "set"

    .line 294
    .line 295
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    if-nez p2, :cond_11

    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_11
    const/16 p2, 0xf

    .line 304
    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :sswitch_10
    const-string p2, "get"

    .line 308
    .line 309
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p2

    .line 313
    if-nez p2, :cond_12

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_12
    const/16 p2, 0xe

    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :sswitch_11
    const-string p2, "getAndSetRelease"

    .line 322
    .line 323
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result p2

    .line 327
    if-nez p2, :cond_13

    .line 328
    .line 329
    goto/16 :goto_0

    .line 330
    .line 331
    :cond_13
    const/16 p2, 0xd

    .line 332
    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :sswitch_12
    const-string p2, "getAcquire"

    .line 336
    .line 337
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result p2

    .line 341
    if-nez p2, :cond_14

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_14
    const/16 p2, 0xc

    .line 346
    .line 347
    goto/16 :goto_1

    .line 348
    .line 349
    :sswitch_13
    const-string p2, "setRelease"

    .line 350
    .line 351
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result p2

    .line 355
    if-nez p2, :cond_15

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :cond_15
    const/16 p2, 0xb

    .line 360
    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :sswitch_14
    const-string p2, "weakCompareAndSetAcquire"

    .line 364
    .line 365
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result p2

    .line 369
    if-nez p2, :cond_16

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_16
    const/16 p2, 0xa

    .line 374
    .line 375
    goto/16 :goto_1

    .line 376
    .line 377
    :sswitch_15
    const-string p2, "weakCompareAndSetPlain"

    .line 378
    .line 379
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p2

    .line 383
    if-nez p2, :cond_17

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_17
    const/16 p2, 0x9

    .line 388
    .line 389
    goto/16 :goto_1

    .line 390
    .line 391
    :sswitch_16
    const-string p2, "getAndBitwiseXorRelease"

    .line 392
    .line 393
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result p2

    .line 397
    if-nez p2, :cond_18

    .line 398
    .line 399
    goto/16 :goto_0

    .line 400
    .line 401
    :cond_18
    const/16 p2, 0x8

    .line 402
    .line 403
    goto :goto_1

    .line 404
    :sswitch_17
    const-string p2, "getAndBitwiseXor"

    .line 405
    .line 406
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result p2

    .line 410
    if-nez p2, :cond_19

    .line 411
    .line 412
    goto/16 :goto_0

    .line 413
    .line 414
    :cond_19
    const/4 p2, 0x7

    .line 415
    goto :goto_1

    .line 416
    :sswitch_18
    const-string v1, "getAndBitwiseAnd"

    .line 417
    .line 418
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result p4

    .line 422
    if-nez p4, :cond_20

    .line 423
    .line 424
    goto/16 :goto_0

    .line 425
    .line 426
    :sswitch_19
    const-string p2, "getAndAddRelease"

    .line 427
    .line 428
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    if-nez p2, :cond_1a

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :cond_1a
    const/4 p2, 0x5

    .line 437
    goto :goto_1

    .line 438
    :sswitch_1a
    const-string p2, "weakCompareAndSet"

    .line 439
    .line 440
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    if-nez p2, :cond_1b

    .line 445
    .line 446
    goto/16 :goto_0

    .line 447
    .line 448
    :cond_1b
    const/4 p2, 0x4

    .line 449
    goto :goto_1

    .line 450
    :sswitch_1b
    const-string p2, "compareAndExchangeRelease"

    .line 451
    .line 452
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result p2

    .line 456
    if-nez p2, :cond_1c

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_1c
    const/4 p2, 0x3

    .line 461
    goto :goto_1

    .line 462
    :sswitch_1c
    const-string p2, "compareAndSet"

    .line 463
    .line 464
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result p2

    .line 468
    if-nez p2, :cond_1d

    .line 469
    .line 470
    goto/16 :goto_0

    .line 471
    .line 472
    :cond_1d
    const/4 p2, 0x2

    .line 473
    goto :goto_1

    .line 474
    :sswitch_1d
    const-string p2, "getAndBitwiseAndRelease"

    .line 475
    .line 476
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result p2

    .line 480
    if-nez p2, :cond_1e

    .line 481
    .line 482
    goto/16 :goto_0

    .line 483
    .line 484
    :cond_1e
    const/4 p2, 0x1

    .line 485
    goto :goto_1

    .line 486
    :sswitch_1e
    const-string p2, "getAndBitwiseOrRelease"

    .line 487
    .line 488
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result p2

    .line 492
    if-nez p2, :cond_1f

    .line 493
    .line 494
    goto/16 :goto_0

    .line 495
    .line 496
    :cond_1f
    const/4 p2, 0x0

    .line 497
    :cond_20
    :goto_1
    packed-switch p2, :pswitch_data_0

    .line 498
    .line 499
    .line 500
    goto :goto_3

    .line 501
    :pswitch_0
    new-instance p2, Lv4/z;

    .line 502
    .line 503
    sget-object p4, Lu4/j;->p:Lv4/c0;

    .line 504
    .line 505
    invoke-direct {p2, p3, p4}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 506
    .line 507
    .line 508
    new-instance p3, Lv4/y;

    .line 509
    .line 510
    invoke-direct {p3, p1, p2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 511
    .line 512
    .line 513
    goto :goto_2

    .line 514
    :pswitch_1
    new-instance p2, Lv4/z;

    .line 515
    .line 516
    sget-object p4, Lu4/j;->q:Lv4/c0;

    .line 517
    .line 518
    invoke-direct {p2, p3, p4}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 519
    .line 520
    .line 521
    new-instance p3, Lv4/y;

    .line 522
    .line 523
    invoke-direct {p3, p1, p2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 524
    .line 525
    .line 526
    goto :goto_2

    .line 527
    :pswitch_2
    new-instance p2, Lv4/z;

    .line 528
    .line 529
    invoke-direct {p2, p3, v2}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 530
    .line 531
    .line 532
    new-instance p3, Lv4/y;

    .line 533
    .line 534
    invoke-direct {p3, p1, p2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 535
    .line 536
    .line 537
    :goto_2
    iput-object p3, p0, Lu4/j;->m:Lv4/y;

    .line 538
    .line 539
    new-instance p1, Lv4/a0;

    .line 540
    .line 541
    iget-object p2, p5, Lv4/e;->i:Lw4/a;

    .line 542
    .line 543
    invoke-direct {p1, p2}, Lv4/a0;-><init>(Lw4/a;)V

    .line 544
    .line 545
    .line 546
    iput-object p1, p0, Lu4/j;->n:Lv4/a0;

    .line 547
    .line 548
    return-void

    .line 549
    :cond_21
    :goto_3
    invoke-virtual {p5}, Lv4/w;->a()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    const-string p2, "Unknown signature polymorphic method: "

    .line 554
    .line 555
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    throw v0

    .line 563
    :cond_22
    const-string p1, "callSiteMethod is not signature polymorphic"

    .line 564
    .line 565
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw v0

    .line 569
    :cond_23
    const-string p1, "callSiteMethod == null"

    .line 570
    .line 571
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v0

    .line 575
    :cond_24
    const-string p1, "catches == null"

    .line 576
    .line 577
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    throw v0

    .line 581
    :cond_25
    const-string p2, "opcode with invalid branchingness: "

    .line 582
    .line 583
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v0

    .line 591
    :sswitch_data_0
    .sparse-switch
        -0x74054ecc -> :sswitch_1e
        -0x64896c60 -> :sswitch_1d
        -0x639aefb0 -> :sswitch_1c
        -0x4d038cae -> :sswitch_1b
        -0x42a27c48 -> :sswitch_1a
        -0x41bf8e59 -> :sswitch_19
        -0x3d910599 -> :sswitch_18
        -0x3d90af15 -> :sswitch_17
        -0x2f5b5f64 -> :sswitch_16
        -0x21ce070e -> :sswitch_15
        -0xe5aaa02 -> :sswitch_14
        -0xdc04ebb -> :sswitch_13
        -0x7976360 -> :sswitch_12
        -0x23e5d3a -> :sswitch_11
        0x18f56 -> :sswitch_10
        0x1bc62 -> :sswitch_f
        0x594ea03 -> :sswitch_e
        0x6099c1e -> :sswitch_d
        0xb513b12 -> :sswitch_c
        0x10d9c640 -> :sswitch_b
        0x10da0a01 -> :sswitch_a
        0x1510cc6f -> :sswitch_9
        0x1c0e5b23 -> :sswitch_8
        0x28d92717 -> :sswitch_7
        0x2c96ac21 -> :sswitch_6
        0x37daaa76 -> :sswitch_5
        0x4a3ed96b -> :sswitch_4
        0x50983b53 -> :sswitch_3
        0x58737ef5 -> :sswitch_2
        0x775bdb95 -> :sswitch_1
        0x780b1d2f -> :sswitch_0
    .end sparse-switch

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final d(Lu4/h;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lu4/h;->j(Lu4/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e()Lw4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/j;->k:Lw4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu4/j;->m:Lv4/y;

    .line 7
    .line 8
    invoke-virtual {v1}, Lv4/w;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lu4/j;->n:Lv4/a0;

    .line 21
    .line 22
    invoke-virtual {v2}, Lv4/a0;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lu4/j;->k:Lw4/e;

    .line 33
    .line 34
    invoke-static {v1}, Lu4/u;->j(Lw4/e;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public final i(Lw4/c;)Lu4/i;
    .locals 6

    .line 1
    new-instance v0, Lu4/j;

    .line 2
    .line 3
    iget-object v1, p0, Lu4/j;->k:Lw4/e;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lw4/e;->d(Lw4/c;)Lw4/e;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v5, p0, Lu4/j;->l:Lv4/y;

    .line 10
    .line 11
    iget-object v1, p0, Lu4/i;->g:Lu4/r;

    .line 12
    .line 13
    iget-object v2, p0, Lu4/i;->h:Lu4/t;

    .line 14
    .line 15
    iget-object v3, p0, Lu4/i;->j:Lu4/p;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lu4/j;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/y;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
