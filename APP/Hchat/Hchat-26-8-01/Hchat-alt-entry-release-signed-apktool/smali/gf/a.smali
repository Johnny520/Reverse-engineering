.class public final Lgf/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:La5/a;

.field public final b:Lac/k;

.field public final c:Lac/k;

.field public d:Lgf/c;

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:[I

.field public j:I

.field public k:J

.field public l:I

.field public m:I

.field public n:Lsc/a;


# direct methods
.method public constructor <init>(La5/a;Lac/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iput-object v0, p0, Lgf/a;->i:[I

    .line 8
    .line 9
    iput-object p1, p0, Lgf/a;->a:La5/a;

    .line 10
    .line 11
    iput-object p2, p0, Lgf/a;->b:Lac/k;

    .line 12
    .line 13
    invoke-virtual {p2}, Lac/k;->g()Lac/k;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lgf/a;->c:Lac/k;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lgf/a;->d:Lgf/c;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-boolean v1, p0, Lgf/a;->e:Z

    .line 6
    .line 7
    if-nez v1, :cond_b

    .line 8
    .line 9
    iget-object v0, v0, Lgf/c;->c:Lgf/b;

    .line 10
    .line 11
    iget v1, p0, Lgf/a;->f:I

    .line 12
    .line 13
    iget-object v2, p0, Lgf/a;->a:La5/a;

    .line 14
    .line 15
    iget-object v2, v2, La5/a;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lac/k;

    .line 18
    .line 19
    iget v0, v0, Lgf/b;->c:I

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lgf/a;->i:[I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    aput v1, v0, v3

    .line 32
    .line 33
    iget v0, p0, Lgf/a;->h:I

    .line 34
    .line 35
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v1, v0

    .line 44
    iput v1, p0, Lgf/a;->l:I

    .line 45
    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :pswitch_0
    iget-object v0, p0, Lgf/a;->i:[I

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    aput v1, v0, v3

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v2}, Lac/k;->L()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    aput v2, v0, v1

    .line 63
    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :pswitch_1
    iget v0, p0, Lgf/a;->h:I

    .line 67
    .line 68
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    iput v1, p0, Lgf/a;->l:I

    .line 78
    .line 79
    goto/16 :goto_8

    .line 80
    .line 81
    :pswitch_2
    iget v0, p0, Lgf/a;->h:I

    .line 82
    .line 83
    shr-int/lit8 v1, v1, 0x8

    .line 84
    .line 85
    int-to-byte v1, v1

    .line 86
    add-int/2addr v0, v1

    .line 87
    iput v0, p0, Lgf/a;->l:I

    .line 88
    .line 89
    goto/16 :goto_8

    .line 90
    .line 91
    :pswitch_3
    iget-object v0, p0, Lgf/a;->i:[I

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    aput v1, v0, v2

    .line 99
    .line 100
    goto/16 :goto_8

    .line 101
    .line 102
    :pswitch_4
    iget-object v0, p0, Lgf/a;->i:[I

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    invoke-static {v1}, Lgf/b;->c(I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    aput v3, v0, v2

    .line 110
    .line 111
    shr-int/lit8 v0, v1, 0xc

    .line 112
    .line 113
    and-int/lit8 v0, v0, 0xf

    .line 114
    .line 115
    shl-int/lit8 v0, v0, 0x1c

    .line 116
    .line 117
    shr-int/lit8 v0, v0, 0x1c

    .line 118
    .line 119
    int-to-long v0, v0

    .line 120
    iput-wide v0, p0, Lgf/a;->k:J

    .line 121
    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :pswitch_5
    invoke-virtual {v2}, Lac/k;->L()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    const/4 v4, 0x4

    .line 137
    const/4 v5, 0x2

    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x1

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    if-eq v0, v7, :cond_3

    .line 143
    .line 144
    if-eq v0, v5, :cond_2

    .line 145
    .line 146
    if-eq v0, v4, :cond_1

    .line 147
    .line 148
    const/16 v2, 0x8

    .line 149
    .line 150
    if-ne v0, v2, :cond_0

    .line 151
    .line 152
    new-array v2, v3, [J

    .line 153
    .line 154
    :goto_0
    if-ge v6, v3, :cond_6

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    aput-wide v8, v2, v6

    .line 161
    .line 162
    add-int/lit8 v6, v6, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_0
    new-instance v1, Laf/d;

    .line 166
    .line 167
    const-string v2, "Unexpected element size in FILL_ARRAY_DATA_PAYLOAD: "

    .line 168
    .line 169
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v1

    .line 177
    :cond_1
    new-array v2, v3, [I

    .line 178
    .line 179
    :goto_1
    if-ge v6, v3, :cond_6

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    aput v8, v2, v6

    .line 186
    .line 187
    add-int/lit8 v6, v6, 0x1

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_2
    new-array v2, v3, [S

    .line 191
    .line 192
    :goto_2
    if-ge v6, v3, :cond_6

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    int-to-short v8, v8

    .line 199
    aput-short v8, v2, v6

    .line 200
    .line 201
    add-int/lit8 v6, v6, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_3
    new-array v6, v3, [B

    .line 205
    .line 206
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 207
    .line 208
    .line 209
    rem-int/lit8 v1, v3, 0x2

    .line 210
    .line 211
    if-eqz v1, :cond_4

    .line 212
    .line 213
    invoke-virtual {v2}, Lac/k;->K()I

    .line 214
    .line 215
    .line 216
    :cond_4
    move-object v2, v6

    .line 217
    goto :goto_3

    .line 218
    :cond_5
    new-array v2, v6, [B

    .line 219
    .line 220
    :cond_6
    :goto_3
    mul-int v1, v3, v0

    .line 221
    .line 222
    add-int/2addr v1, v7

    .line 223
    div-int/2addr v1, v5

    .line 224
    add-int/2addr v1, v4

    .line 225
    iput v1, p0, Lgf/a;->g:I

    .line 226
    .line 227
    new-instance v1, Lhf/a;

    .line 228
    .line 229
    invoke-direct {v1, v3, v0, v2}, Lhf/a;-><init>(IILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    iput-object v1, p0, Lgf/a;->n:Lsc/a;

    .line 233
    .line 234
    goto/16 :goto_8

    .line 235
    .line 236
    :pswitch_6
    iget-object v0, p0, Lgf/a;->i:[I

    .line 237
    .line 238
    const/4 v2, 0x0

    .line 239
    invoke-static {v1}, Lgf/b;->c(I)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    aput v3, v0, v2

    .line 244
    .line 245
    const/4 v2, 0x1

    .line 246
    invoke-static {v1}, Lgf/b;->d(I)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    aput v1, v0, v2

    .line 251
    .line 252
    goto/16 :goto_8

    .line 253
    .line 254
    :pswitch_7
    invoke-virtual {v2}, Lac/k;->L()I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 261
    .line 262
    new-array v2, v0, [I

    .line 263
    .line 264
    const/4 v3, 0x0

    .line 265
    move v4, v3

    .line 266
    :goto_4
    if-ge v4, v0, :cond_7

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    aput v5, v2, v4

    .line 273
    .line 274
    add-int/lit8 v4, v4, 0x1

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_7
    new-array v4, v0, [I

    .line 278
    .line 279
    :goto_5
    if-ge v3, v0, :cond_8

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    aput v5, v4, v3

    .line 286
    .line 287
    add-int/lit8 v3, v3, 0x1

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_8
    new-instance v1, Ltc/a;

    .line 291
    .line 292
    invoke-direct {v1, v0, v2, v4}, Ltc/a;-><init>(I[I[I)V

    .line 293
    .line 294
    .line 295
    iput-object v1, p0, Lgf/a;->n:Lsc/a;

    .line 296
    .line 297
    mul-int/lit8 v0, v0, 0x4

    .line 298
    .line 299
    add-int/lit8 v0, v0, 0x2

    .line 300
    .line 301
    iput v0, p0, Lgf/a;->g:I

    .line 302
    .line 303
    goto/16 :goto_8

    .line 304
    .line 305
    :pswitch_8
    invoke-virtual {v2}, Lac/k;->L()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    new-array v3, v0, [I

    .line 318
    .line 319
    new-array v4, v0, [I

    .line 320
    .line 321
    const/4 v5, 0x0

    .line 322
    :goto_6
    if-ge v5, v0, :cond_9

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    aput v6, v4, v5

    .line 329
    .line 330
    add-int v6, v2, v5

    .line 331
    .line 332
    aput v6, v3, v5

    .line 333
    .line 334
    add-int/lit8 v5, v5, 0x1

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_9
    new-instance v1, Ltc/a;

    .line 338
    .line 339
    invoke-direct {v1, v0, v3, v4}, Ltc/a;-><init>(I[I[I)V

    .line 340
    .line 341
    .line 342
    iput-object v1, p0, Lgf/a;->n:Lsc/a;

    .line 343
    .line 344
    mul-int/lit8 v0, v0, 0x2

    .line 345
    .line 346
    add-int/lit8 v0, v0, 0x4

    .line 347
    .line 348
    iput v0, p0, Lgf/a;->g:I

    .line 349
    .line 350
    goto/16 :goto_8

    .line 351
    .line 352
    :pswitch_9
    iget-object v0, p0, Lgf/a;->i:[I

    .line 353
    .line 354
    const/4 v3, 0x0

    .line 355
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    aput v1, v0, v3

    .line 360
    .line 361
    iget-object v0, v2, Lac/k;->i:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 366
    .line 367
    .line 368
    move-result-wide v0

    .line 369
    iput-wide v0, p0, Lgf/a;->k:J

    .line 370
    .line 371
    goto/16 :goto_8

    .line 372
    .line 373
    :pswitch_a
    invoke-static {p0, v1, v2}, Lgf/b;->f(Lgf/a;ILac/k;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Lac/k;->L()I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    iput v0, p0, Lgf/a;->l:I

    .line 381
    .line 382
    goto/16 :goto_8

    .line 383
    .line 384
    :pswitch_b
    invoke-static {p0, v1, v2}, Lgf/b;->e(Lgf/a;ILac/k;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Lac/k;->L()I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    iput v0, p0, Lgf/a;->l:I

    .line 392
    .line 393
    goto/16 :goto_8

    .line 394
    .line 395
    :pswitch_c
    invoke-static {p0, v1, v2}, Lgf/b;->f(Lgf/a;ILac/k;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_8

    .line 399
    .line 400
    :pswitch_d
    invoke-static {p0, v1, v2}, Lgf/b;->e(Lgf/a;ILac/k;)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_8

    .line 404
    .line 405
    :pswitch_e
    iget-object v0, p0, Lgf/a;->i:[I

    .line 406
    .line 407
    const/4 v3, 0x0

    .line 408
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    aput v1, v0, v3

    .line 413
    .line 414
    iget-object v0, v2, Lac/k;->i:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    iput v0, p0, Lgf/a;->m:I

    .line 423
    .line 424
    goto/16 :goto_8

    .line 425
    .line 426
    :pswitch_f
    iget-object v0, p0, Lgf/a;->i:[I

    .line 427
    .line 428
    const/4 v3, 0x0

    .line 429
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    aput v1, v0, v3

    .line 434
    .line 435
    iget v0, p0, Lgf/a;->h:I

    .line 436
    .line 437
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    add-int/2addr v1, v0

    .line 446
    iput v1, p0, Lgf/a;->l:I

    .line 447
    .line 448
    goto/16 :goto_8

    .line 449
    .line 450
    :pswitch_10
    iget-object v0, p0, Lgf/a;->i:[I

    .line 451
    .line 452
    const/4 v3, 0x0

    .line 453
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    aput v1, v0, v3

    .line 458
    .line 459
    iget-object v0, v2, Lac/k;->i:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    int-to-long v0, v0

    .line 468
    iput-wide v0, p0, Lgf/a;->k:J

    .line 469
    .line 470
    goto/16 :goto_8

    .line 471
    .line 472
    :pswitch_11
    iget-object v0, p0, Lgf/a;->i:[I

    .line 473
    .line 474
    const/4 v1, 0x0

    .line 475
    invoke-virtual {v2}, Lac/k;->L()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    aput v3, v0, v1

    .line 480
    .line 481
    const/4 v1, 0x1

    .line 482
    invoke-virtual {v2}, Lac/k;->L()I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    aput v2, v0, v1

    .line 487
    .line 488
    goto/16 :goto_8

    .line 489
    .line 490
    :pswitch_12
    iget v0, p0, Lgf/a;->h:I

    .line 491
    .line 492
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 495
    .line 496
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    add-int/2addr v1, v0

    .line 501
    iput v1, p0, Lgf/a;->l:I

    .line 502
    .line 503
    goto/16 :goto_8

    .line 504
    .line 505
    :pswitch_13
    iget-object v0, p0, Lgf/a;->i:[I

    .line 506
    .line 507
    const/4 v3, 0x0

    .line 508
    invoke-static {v1}, Lgf/b;->c(I)I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    aput v4, v0, v3

    .line 513
    .line 514
    const/4 v3, 0x1

    .line 515
    invoke-static {v1}, Lgf/b;->d(I)I

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    aput v1, v0, v3

    .line 520
    .line 521
    invoke-virtual {v2}, Lac/k;->L()I

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    iput v0, p0, Lgf/a;->m:I

    .line 526
    .line 527
    const-wide/16 v0, 0x0

    .line 528
    .line 529
    iput-wide v0, p0, Lgf/a;->k:J

    .line 530
    .line 531
    goto/16 :goto_8

    .line 532
    .line 533
    :pswitch_14
    iget-object v0, p0, Lgf/a;->i:[I

    .line 534
    .line 535
    const/4 v3, 0x0

    .line 536
    invoke-static {v1}, Lgf/b;->c(I)I

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    aput v4, v0, v3

    .line 541
    .line 542
    const/4 v3, 0x1

    .line 543
    invoke-static {v1}, Lgf/b;->d(I)I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    aput v1, v0, v3

    .line 548
    .line 549
    iget-object v0, v2, Lac/k;->i:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    int-to-long v0, v0

    .line 558
    iput-wide v0, p0, Lgf/a;->k:J

    .line 559
    .line 560
    goto/16 :goto_8

    .line 561
    .line 562
    :pswitch_15
    iget-object v0, p0, Lgf/a;->i:[I

    .line 563
    .line 564
    const/4 v3, 0x0

    .line 565
    invoke-static {v1}, Lgf/b;->c(I)I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    aput v4, v0, v3

    .line 570
    .line 571
    const/4 v3, 0x1

    .line 572
    invoke-static {v1}, Lgf/b;->d(I)I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    aput v1, v0, v3

    .line 577
    .line 578
    iget v0, p0, Lgf/a;->h:I

    .line 579
    .line 580
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    add-int/2addr v1, v0

    .line 589
    iput v1, p0, Lgf/a;->l:I

    .line 590
    .line 591
    goto/16 :goto_8

    .line 592
    .line 593
    :pswitch_16
    iget-object v0, p0, Lgf/a;->i:[I

    .line 594
    .line 595
    const/4 v3, 0x0

    .line 596
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    aput v1, v0, v3

    .line 601
    .line 602
    invoke-virtual {v2}, Lac/k;->L()I

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    and-int/lit16 v2, v1, 0xff

    .line 607
    .line 608
    const/4 v3, 0x1

    .line 609
    aput v2, v0, v3

    .line 610
    .line 611
    shr-int/lit8 v0, v1, 0x8

    .line 612
    .line 613
    int-to-byte v0, v0

    .line 614
    int-to-long v0, v0

    .line 615
    iput-wide v0, p0, Lgf/a;->k:J

    .line 616
    .line 617
    goto :goto_8

    .line 618
    :pswitch_17
    iget-object v0, p0, Lgf/a;->i:[I

    .line 619
    .line 620
    const/4 v3, 0x0

    .line 621
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    aput v1, v0, v3

    .line 626
    .line 627
    invoke-virtual {v2}, Lac/k;->L()I

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    and-int/lit16 v2, v1, 0xff

    .line 632
    .line 633
    const/4 v3, 0x1

    .line 634
    aput v2, v0, v3

    .line 635
    .line 636
    const/4 v2, 0x2

    .line 637
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    aput v1, v0, v2

    .line 642
    .line 643
    goto :goto_8

    .line 644
    :pswitch_18
    iget-object v0, p0, Lgf/a;->i:[I

    .line 645
    .line 646
    const/4 v3, 0x0

    .line 647
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    aput v1, v0, v3

    .line 652
    .line 653
    invoke-virtual {v2}, Lac/k;->L()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    iput v0, p0, Lgf/a;->m:I

    .line 658
    .line 659
    goto :goto_8

    .line 660
    :pswitch_19
    iget-object v0, p0, Lgf/a;->i:[I

    .line 661
    .line 662
    const/4 v3, 0x0

    .line 663
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    aput v4, v0, v3

    .line 668
    .line 669
    iget-object v0, v2, Lac/k;->i:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    int-to-long v2, v0

    .line 678
    and-int/lit16 v0, v1, 0xff

    .line 679
    .line 680
    const/16 v1, 0x15

    .line 681
    .line 682
    if-ne v0, v1, :cond_a

    .line 683
    .line 684
    const/16 v0, 0x10

    .line 685
    .line 686
    goto :goto_7

    .line 687
    :cond_a
    const/16 v0, 0x30

    .line 688
    .line 689
    :goto_7
    shl-long v0, v2, v0

    .line 690
    .line 691
    iput-wide v0, p0, Lgf/a;->k:J

    .line 692
    .line 693
    goto :goto_8

    .line 694
    :pswitch_1a
    iget-object v0, p0, Lgf/a;->i:[I

    .line 695
    .line 696
    const/4 v3, 0x0

    .line 697
    invoke-static {v1}, Lgf/b;->a(I)I

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    aput v1, v0, v3

    .line 702
    .line 703
    iget-object v0, v2, Lac/k;->i:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 706
    .line 707
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    int-to-long v0, v0

    .line 712
    iput-wide v0, p0, Lgf/a;->k:J

    .line 713
    .line 714
    :goto_8
    :pswitch_1b
    const/4 v0, 0x1

    .line 715
    iput-boolean v0, p0, Lgf/a;->e:Z

    .line 716
    .line 717
    :cond_b
    return-void

    .line 718
    nop

    .line 719
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
        :pswitch_1b
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

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lgf/a;->b:Lac/k;

    .line 2
    .line 3
    iget v1, p0, Lgf/a;->m:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lac/k;->y(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lgf/a;->h:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "0x%04X"

    .line 17
    .line 18
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ": "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lgf/a;->d:Lgf/c;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget v1, v1, Lgf/c;->b:I

    .line 37
    .line 38
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    const-string v1, "null"

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :pswitch_0
    const-string v1, "JAVA_RET"

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :pswitch_1
    const-string v1, "JAVA_JSR"

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :pswitch_2
    const-string v1, "CONST_METHOD_TYPE"

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :pswitch_3
    const-string v1, "CONST_METHOD_HANDLE"

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :pswitch_4
    const-string v1, "INVOKE_CUSTOM_RANGE"

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :pswitch_5
    const-string v1, "INVOKE_CUSTOM"

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :pswitch_6
    const-string v1, "INVOKE_POLYMORPHIC_RANGE"

    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :pswitch_7
    const-string v1, "INVOKE_POLYMORPHIC"

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :pswitch_8
    const-string v1, "SPARSE_SWITCH_PAYLOAD"

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :pswitch_9
    const-string v1, "SPARSE_SWITCH"

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :pswitch_a
    const-string v1, "PACKED_SWITCH_PAYLOAD"

    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :pswitch_b
    const-string v1, "PACKED_SWITCH"

    .line 90
    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :pswitch_c
    const-string v1, "FILL_ARRAY_DATA_PAYLOAD"

    .line 94
    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :pswitch_d
    const-string v1, "FILL_ARRAY_DATA"

    .line 98
    .line 99
    goto/16 :goto_1

    .line 100
    .line 101
    :pswitch_e
    const-string v1, "FILLED_NEW_ARRAY_RANGE"

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :pswitch_f
    const-string v1, "FILLED_NEW_ARRAY"

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :pswitch_10
    const-string v1, "NEW_ARRAY"

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :pswitch_11
    const-string v1, "XOR_LONG"

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :pswitch_12
    const-string v1, "XOR_INT_LIT"

    .line 118
    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :pswitch_13
    const-string v1, "XOR_INT"

    .line 122
    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :pswitch_14
    const-string v1, "USHR_LONG"

    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :pswitch_15
    const-string v1, "USHR_INT_LIT"

    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :pswitch_16
    const-string v1, "USHR_INT"

    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :pswitch_17
    const-string v1, "THROW"

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :pswitch_18
    const-string v1, "SUB_LONG"

    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    :pswitch_19
    const-string v1, "SUB_INT"

    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :pswitch_1a
    const-string v1, "SUB_FLOAT"

    .line 150
    .line 151
    goto/16 :goto_1

    .line 152
    .line 153
    :pswitch_1b
    const-string v1, "SUB_DOUBLE"

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :pswitch_1c
    const-string v1, "SHR_LONG"

    .line 158
    .line 159
    goto/16 :goto_1

    .line 160
    .line 161
    :pswitch_1d
    const-string v1, "SHR_INT_LIT"

    .line 162
    .line 163
    goto/16 :goto_1

    .line 164
    .line 165
    :pswitch_1e
    const-string v1, "SHR_INT"

    .line 166
    .line 167
    goto/16 :goto_1

    .line 168
    .line 169
    :pswitch_1f
    const-string v1, "SHL_LONG"

    .line 170
    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :pswitch_20
    const-string v1, "SHL_INT_LIT"

    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :pswitch_21
    const-string v1, "SHL_INT"

    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :pswitch_22
    const-string v1, "RSUB_INT"

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :pswitch_23
    const-string v1, "RETURN_VOID"

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :pswitch_24
    const-string v1, "RETURN"

    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :pswitch_25
    const-string v1, "REM_LONG"

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :pswitch_26
    const-string v1, "REM_INT_LIT"

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :pswitch_27
    const-string v1, "REM_INT"

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_28
    const-string v1, "REM_FLOAT"

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_29
    const-string v1, "REM_DOUBLE"

    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :pswitch_2a
    const-string v1, "OR_LONG"

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :pswitch_2b
    const-string v1, "OR_INT_LIT"

    .line 218
    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :pswitch_2c
    const-string v1, "OR_INT"

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_2d
    const-string v1, "NOT_LONG"

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :pswitch_2e
    const-string v1, "NOT_INT"

    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :pswitch_2f
    const-string v1, "NEW_INSTANCE"

    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :pswitch_30
    const-string v1, "NEG_LONG"

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :pswitch_31
    const-string v1, "NEG_INT"

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_32
    const-string v1, "NEG_FLOAT"

    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :pswitch_33
    const-string v1, "NEG_DOUBLE"

    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_34
    const-string v1, "NEG"

    .line 254
    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :pswitch_35
    const-string v1, "MUL_LONG"

    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :pswitch_36
    const-string v1, "MUL_INT_LIT"

    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :pswitch_37
    const-string v1, "MUL_INT"

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_38
    const-string v1, "MUL_FLOAT"

    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :pswitch_39
    const-string v1, "MUL_DOUBLE"

    .line 274
    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :pswitch_3a
    const-string v1, "MOVE_WIDE"

    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :pswitch_3b
    const-string v1, "MOVE_RESULT"

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :pswitch_3c
    const-string v1, "MOVE_OBJECT"

    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :pswitch_3d
    const-string v1, "MOVE_EXCEPTION"

    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :pswitch_3e
    const-string v1, "MOVE_MULTI"

    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :pswitch_3f
    const-string v1, "MOVE"

    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :pswitch_40
    const-string v1, "MONITOR_EXIT"

    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :pswitch_41
    const-string v1, "MONITOR_ENTER"

    .line 306
    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :pswitch_42
    const-string v1, "LONG_TO_INT"

    .line 310
    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :pswitch_43
    const-string v1, "LONG_TO_FLOAT"

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_44
    const-string v1, "LONG_TO_DOUBLE"

    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :pswitch_45
    const-string v1, "SPUT"

    .line 322
    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :pswitch_46
    const-string v1, "SGET"

    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :pswitch_47
    const-string v1, "IPUT"

    .line 330
    .line 331
    goto/16 :goto_1

    .line 332
    .line 333
    :pswitch_48
    const-string v1, "IGET"

    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :pswitch_49
    const-string v1, "INVOKE_SPECIAL"

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :pswitch_4a
    const-string v1, "INVOKE_VIRTUAL_RANGE"

    .line 342
    .line 343
    goto/16 :goto_1

    .line 344
    .line 345
    :pswitch_4b
    const-string v1, "INVOKE_VIRTUAL"

    .line 346
    .line 347
    goto/16 :goto_1

    .line 348
    .line 349
    :pswitch_4c
    const-string v1, "INVOKE_SUPER_RANGE"

    .line 350
    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :pswitch_4d
    const-string v1, "INVOKE_SUPER"

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :pswitch_4e
    const-string v1, "INVOKE_STATIC_RANGE"

    .line 358
    .line 359
    goto/16 :goto_1

    .line 360
    .line 361
    :pswitch_4f
    const-string v1, "INVOKE_STATIC"

    .line 362
    .line 363
    goto/16 :goto_1

    .line 364
    .line 365
    :pswitch_50
    const-string v1, "INVOKE_INTERFACE_RANGE"

    .line 366
    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :pswitch_51
    const-string v1, "INVOKE_INTERFACE"

    .line 370
    .line 371
    goto/16 :goto_1

    .line 372
    .line 373
    :pswitch_52
    const-string v1, "INVOKE_DIRECT_RANGE"

    .line 374
    .line 375
    goto/16 :goto_1

    .line 376
    .line 377
    :pswitch_53
    const-string v1, "INVOKE_DIRECT"

    .line 378
    .line 379
    goto/16 :goto_1

    .line 380
    .line 381
    :pswitch_54
    const-string v1, "INT_TO_SHORT"

    .line 382
    .line 383
    goto/16 :goto_1

    .line 384
    .line 385
    :pswitch_55
    const-string v1, "INT_TO_LONG"

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :pswitch_56
    const-string v1, "INT_TO_FLOAT"

    .line 390
    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :pswitch_57
    const-string v1, "INT_TO_DOUBLE"

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :pswitch_58
    const-string v1, "INT_TO_CHAR"

    .line 398
    .line 399
    goto/16 :goto_1

    .line 400
    .line 401
    :pswitch_59
    const-string v1, "INT_TO_BYTE"

    .line 402
    .line 403
    goto/16 :goto_1

    .line 404
    .line 405
    :pswitch_5a
    const-string v1, "INSTANCE_OF"

    .line 406
    .line 407
    goto/16 :goto_1

    .line 408
    .line 409
    :pswitch_5b
    const-string v1, "IF_NEZ"

    .line 410
    .line 411
    goto/16 :goto_1

    .line 412
    .line 413
    :pswitch_5c
    const-string v1, "IF_NE"

    .line 414
    .line 415
    goto/16 :goto_1

    .line 416
    .line 417
    :pswitch_5d
    const-string v1, "IF_LTZ"

    .line 418
    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :pswitch_5e
    const-string v1, "IF_LT"

    .line 422
    .line 423
    goto/16 :goto_1

    .line 424
    .line 425
    :pswitch_5f
    const-string v1, "IF_LEZ"

    .line 426
    .line 427
    goto/16 :goto_1

    .line 428
    .line 429
    :pswitch_60
    const-string v1, "IF_LE"

    .line 430
    .line 431
    goto/16 :goto_1

    .line 432
    .line 433
    :pswitch_61
    const-string v1, "IF_GTZ"

    .line 434
    .line 435
    goto/16 :goto_1

    .line 436
    .line 437
    :pswitch_62
    const-string v1, "IF_GT"

    .line 438
    .line 439
    goto/16 :goto_1

    .line 440
    .line 441
    :pswitch_63
    const-string v1, "IF_GEZ"

    .line 442
    .line 443
    goto/16 :goto_1

    .line 444
    .line 445
    :pswitch_64
    const-string v1, "IF_GE"

    .line 446
    .line 447
    goto/16 :goto_1

    .line 448
    .line 449
    :pswitch_65
    const-string v1, "IF_EQZ"

    .line 450
    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :pswitch_66
    const-string v1, "IF_EQ"

    .line 454
    .line 455
    goto/16 :goto_1

    .line 456
    .line 457
    :pswitch_67
    const-string v1, "IF"

    .line 458
    .line 459
    goto/16 :goto_1

    .line 460
    .line 461
    :pswitch_68
    const-string v1, "GOTO"

    .line 462
    .line 463
    goto/16 :goto_1

    .line 464
    .line 465
    :pswitch_69
    const-string v1, "FLOAT_TO_LONG"

    .line 466
    .line 467
    goto/16 :goto_1

    .line 468
    .line 469
    :pswitch_6a
    const-string v1, "FLOAT_TO_INT"

    .line 470
    .line 471
    goto/16 :goto_1

    .line 472
    .line 473
    :pswitch_6b
    const-string v1, "FLOAT_TO_DOUBLE"

    .line 474
    .line 475
    goto/16 :goto_1

    .line 476
    .line 477
    :pswitch_6c
    const-string v1, "DOUBLE_TO_LONG"

    .line 478
    .line 479
    goto/16 :goto_1

    .line 480
    .line 481
    :pswitch_6d
    const-string v1, "DOUBLE_TO_INT"

    .line 482
    .line 483
    goto/16 :goto_1

    .line 484
    .line 485
    :pswitch_6e
    const-string v1, "DOUBLE_TO_FLOAT"

    .line 486
    .line 487
    goto/16 :goto_1

    .line 488
    .line 489
    :pswitch_6f
    const-string v1, "DIV_LONG"

    .line 490
    .line 491
    goto/16 :goto_1

    .line 492
    .line 493
    :pswitch_70
    const-string v1, "DIV_INT_LIT"

    .line 494
    .line 495
    goto/16 :goto_1

    .line 496
    .line 497
    :pswitch_71
    const-string v1, "DIV_INT"

    .line 498
    .line 499
    goto/16 :goto_1

    .line 500
    .line 501
    :pswitch_72
    const-string v1, "DIV_FLOAT"

    .line 502
    .line 503
    goto/16 :goto_1

    .line 504
    .line 505
    :pswitch_73
    const-string v1, "DIV_DOUBLE"

    .line 506
    .line 507
    goto/16 :goto_1

    .line 508
    .line 509
    :pswitch_74
    const-string v1, "CONST_WIDE"

    .line 510
    .line 511
    goto/16 :goto_1

    .line 512
    .line 513
    :pswitch_75
    const-string v1, "CONST_STRING"

    .line 514
    .line 515
    goto/16 :goto_1

    .line 516
    .line 517
    :pswitch_76
    const-string v1, "CONST_CLASS"

    .line 518
    .line 519
    goto/16 :goto_1

    .line 520
    .line 521
    :pswitch_77
    const-string v1, "CONST"

    .line 522
    .line 523
    goto/16 :goto_1

    .line 524
    .line 525
    :pswitch_78
    const-string v1, "CMP_LONG"

    .line 526
    .line 527
    goto/16 :goto_1

    .line 528
    .line 529
    :pswitch_79
    const-string v1, "CMPL_FLOAT"

    .line 530
    .line 531
    goto/16 :goto_1

    .line 532
    .line 533
    :pswitch_7a
    const-string v1, "CMPL_DOUBLE"

    .line 534
    .line 535
    goto/16 :goto_1

    .line 536
    .line 537
    :pswitch_7b
    const-string v1, "CMPG_FLOAT"

    .line 538
    .line 539
    goto/16 :goto_1

    .line 540
    .line 541
    :pswitch_7c
    const-string v1, "CMPG_DOUBLE"

    .line 542
    .line 543
    goto/16 :goto_1

    .line 544
    .line 545
    :pswitch_7d
    const-string v1, "CHECK_CAST"

    .line 546
    .line 547
    goto/16 :goto_1

    .line 548
    .line 549
    :pswitch_7e
    const-string v1, "CAST"

    .line 550
    .line 551
    goto/16 :goto_1

    .line 552
    .line 553
    :pswitch_7f
    const-string v1, "ARRAY_LENGTH"

    .line 554
    .line 555
    goto/16 :goto_1

    .line 556
    .line 557
    :pswitch_80
    const-string v1, "ARITH"

    .line 558
    .line 559
    goto/16 :goto_1

    .line 560
    .line 561
    :pswitch_81
    const-string v1, "APUT_WIDE"

    .line 562
    .line 563
    goto :goto_1

    .line 564
    :pswitch_82
    const-string v1, "APUT_SHORT"

    .line 565
    .line 566
    goto :goto_1

    .line 567
    :pswitch_83
    const-string v1, "APUT_OBJECT"

    .line 568
    .line 569
    goto :goto_1

    .line 570
    :pswitch_84
    const-string v1, "APUT_CHAR"

    .line 571
    .line 572
    goto :goto_1

    .line 573
    :pswitch_85
    const-string v1, "APUT_BYTE_BOOLEAN"

    .line 574
    .line 575
    goto :goto_1

    .line 576
    :pswitch_86
    const-string v1, "APUT_BYTE"

    .line 577
    .line 578
    goto :goto_1

    .line 579
    :pswitch_87
    const-string v1, "APUT_BOOLEAN"

    .line 580
    .line 581
    goto :goto_1

    .line 582
    :pswitch_88
    const-string v1, "APUT"

    .line 583
    .line 584
    goto :goto_1

    .line 585
    :pswitch_89
    const-string v1, "AGET_WIDE"

    .line 586
    .line 587
    goto :goto_1

    .line 588
    :pswitch_8a
    const-string v1, "AGET_SHORT"

    .line 589
    .line 590
    goto :goto_1

    .line 591
    :pswitch_8b
    const-string v1, "AGET_OBJECT"

    .line 592
    .line 593
    goto :goto_1

    .line 594
    :pswitch_8c
    const-string v1, "AGET_CHAR"

    .line 595
    .line 596
    goto :goto_1

    .line 597
    :pswitch_8d
    const-string v1, "AGET_BYTE_BOOLEAN"

    .line 598
    .line 599
    goto :goto_1

    .line 600
    :pswitch_8e
    const-string v1, "AGET_BYTE"

    .line 601
    .line 602
    goto :goto_1

    .line 603
    :pswitch_8f
    const-string v1, "AGET_BOOLEAN"

    .line 604
    .line 605
    goto :goto_1

    .line 606
    :pswitch_90
    const-string v1, "AGET"

    .line 607
    .line 608
    goto :goto_1

    .line 609
    :pswitch_91
    const-string v1, "AND_LONG"

    .line 610
    .line 611
    goto :goto_1

    .line 612
    :pswitch_92
    const-string v1, "AND_INT_LIT"

    .line 613
    .line 614
    goto :goto_1

    .line 615
    :pswitch_93
    const-string v1, "AND_INT"

    .line 616
    .line 617
    goto :goto_1

    .line 618
    :pswitch_94
    const-string v1, "ADD_LONG"

    .line 619
    .line 620
    goto :goto_1

    .line 621
    :pswitch_95
    const-string v1, "ADD_INT_LIT"

    .line 622
    .line 623
    goto :goto_1

    .line 624
    :pswitch_96
    const-string v1, "ADD_INT"

    .line 625
    .line 626
    goto :goto_1

    .line 627
    :pswitch_97
    const-string v1, "ADD_FLOAT"

    .line 628
    .line 629
    goto :goto_1

    .line 630
    :pswitch_98
    const-string v1, "ADD_DOUBLE"

    .line 631
    .line 632
    goto :goto_1

    .line 633
    :pswitch_99
    const-string v1, "NOP"

    .line 634
    .line 635
    goto :goto_1

    .line 636
    :pswitch_9a
    const-string v1, "UNKNOWN"

    .line 637
    .line 638
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    iget-object v1, p0, Lgf/a;->d:Lgf/c;

    .line 642
    .line 643
    if-nez v1, :cond_1

    .line 644
    .line 645
    iget v1, p0, Lgf/a;->f:I

    .line 646
    .line 647
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    const-string v2, "(0x%04X)"

    .line 656
    .line 657
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    goto :goto_3

    .line 665
    :cond_1
    iget v1, p0, Lgf/a;->j:I

    .line 666
    .line 667
    iget-boolean v2, p0, Lgf/a;->e:Z

    .line 668
    .line 669
    if-eqz v2, :cond_3

    .line 670
    .line 671
    const/16 v2, 0x20

    .line 672
    .line 673
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const/4 v2, 0x0

    .line 677
    :goto_2
    if-ge v2, v1, :cond_3

    .line 678
    .line 679
    if-eqz v2, :cond_2

    .line 680
    .line 681
    const-string v3, ", "

    .line 682
    .line 683
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    :cond_2
    const-string v3, "r"

    .line 687
    .line 688
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    iget-object v3, p0, Lgf/a;->i:[I

    .line 692
    .line 693
    aget v3, v3, v2

    .line 694
    .line 695
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    add-int/lit8 v2, v2, 0x1

    .line 699
    .line 700
    goto :goto_2

    .line 701
    :cond_3
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    return-object v0

    .line 706
    nop

    .line 707
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9a
        :pswitch_99
        :pswitch_98
        :pswitch_97
        :pswitch_96
        :pswitch_95
        :pswitch_94
        :pswitch_93
        :pswitch_92
        :pswitch_91
        :pswitch_90
        :pswitch_8f
        :pswitch_8e
        :pswitch_8d
        :pswitch_8c
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
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
