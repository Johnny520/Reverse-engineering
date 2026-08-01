.class public final Lxhss/ᛳᛲᛶᛶ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:I

.field public final ᲇᛴᲇᛵ:Ljava/lang/String;

.field public final ᲇᛶᛴᲀ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛳᛲᛶᛶ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᛳᛲᛶᛶ;->ᛷᛴᛷᛱ:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lxhss/ᛳᛲᛶᛶ;->ᲇᛶᛴᲀ:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lxhss/ᛳᛲᛶᛶ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v3, :cond_25

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x5

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    iget v4, v0, Lxhss/ᛳᛲᛶᛶ;->ᛷᛴᛷᛱ:I

    .line 18
    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    .line 21
    iput v5, v0, Lxhss/ᛳᛲᛶᛶ;->ᛷᛴᛷᛱ:I

    .line 22
    .line 23
    :cond_0
    iget-object v4, v1, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ:Lxhss/ᛶᛵᲇᛸ;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    move v6, v2

    .line 33
    :goto_0
    const/16 v7, 0x80

    .line 34
    .line 35
    if-ge v6, v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-ge v8, v7, :cond_1

    .line 42
    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v8, v4

    .line 47
    :goto_1
    const/4 v9, 0x1

    .line 48
    const v10, 0xdfff

    .line 49
    .line 50
    .line 51
    const v11, 0xd800

    .line 52
    .line 53
    .line 54
    const/16 v12, 0x800

    .line 55
    .line 56
    if-ge v6, v4, :cond_7

    .line 57
    .line 58
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    if-ge v13, v12, :cond_2

    .line 63
    .line 64
    rsub-int/lit8 v9, v13, 0x7f

    .line 65
    .line 66
    ushr-int/lit8 v9, v9, 0x1f

    .line 67
    .line 68
    add-int/2addr v8, v9

    .line 69
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    move v14, v2

    .line 77
    :goto_2
    if-ge v6, v13, :cond_6

    .line 78
    .line 79
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    if-ge v15, v12, :cond_3

    .line 84
    .line 85
    rsub-int/lit8 v15, v15, 0x7f

    .line 86
    .line 87
    ushr-int/lit8 v15, v15, 0x1f

    .line 88
    .line 89
    add-int/2addr v14, v15

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    add-int/lit8 v14, v14, 0x2

    .line 92
    .line 93
    if-gt v11, v15, :cond_5

    .line 94
    .line 95
    if-gt v15, v10, :cond_5

    .line 96
    .line 97
    invoke-static {v3, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    const/high16 v5, 0x10000

    .line 102
    .line 103
    if-lt v15, v5, :cond_4

    .line 104
    .line 105
    add-int/lit8 v6, v6, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    new-instance v0, Lxhss/ᛲᛴᛴᲁ;

    .line 109
    .line 110
    invoke-direct {v0, v6, v13}, Lxhss/ᛲᛴᛴᲁ;-><init>(II)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_5
    :goto_3
    add-int/2addr v6, v9

    .line 115
    const/4 v5, 0x5

    .line 116
    goto :goto_2

    .line 117
    :cond_6
    add-int/2addr v8, v14

    .line 118
    :cond_7
    if-lt v8, v4, :cond_24

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ(B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v9, v8, v9}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛸᛳᲁ(III)V

    .line 124
    .line 125
    .line 126
    iget-object v4, v1, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    iget v5, v1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 129
    .line 130
    sub-int/2addr v5, v8

    .line 131
    iput v5, v1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 132
    .line 133
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 134
    .line 135
    .line 136
    iget-object v4, v1, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    const-string v6, " at index "

    .line 143
    .line 144
    const-string v8, "Failed writing "

    .line 145
    .line 146
    if-eqz v5, :cond_14

    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    add-int/2addr v14, v5

    .line 161
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    add-int/2addr v15, v14

    .line 170
    move/from16 v17, v9

    .line 171
    .line 172
    const/4 v9, 0x0

    .line 173
    :goto_4
    if-ge v9, v2, :cond_8

    .line 174
    .line 175
    add-int v10, v9, v14

    .line 176
    .line 177
    if-ge v10, v15, :cond_8

    .line 178
    .line 179
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-ge v11, v7, :cond_8

    .line 184
    .line 185
    int-to-byte v11, v11

    .line 186
    aput-byte v11, v13, v10

    .line 187
    .line 188
    add-int/lit8 v9, v9, 0x1

    .line 189
    .line 190
    const v10, 0xdfff

    .line 191
    .line 192
    .line 193
    const v11, 0xd800

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    if-ne v9, v2, :cond_a

    .line 198
    .line 199
    add-int/2addr v14, v2

    .line 200
    :cond_9
    move/from16 v20, v5

    .line 201
    .line 202
    goto/16 :goto_9

    .line 203
    .line 204
    :cond_a
    add-int/2addr v14, v9

    .line 205
    :goto_5
    if-ge v9, v2, :cond_9

    .line 206
    .line 207
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-ge v10, v7, :cond_b

    .line 212
    .line 213
    if-ge v14, v15, :cond_b

    .line 214
    .line 215
    add-int/lit8 v11, v14, 0x1

    .line 216
    .line 217
    int-to-byte v10, v10

    .line 218
    aput-byte v10, v13, v14

    .line 219
    .line 220
    move/from16 v20, v5

    .line 221
    .line 222
    move v14, v11

    .line 223
    goto/16 :goto_8

    .line 224
    .line 225
    :cond_b
    if-ge v10, v12, :cond_c

    .line 226
    .line 227
    add-int/lit8 v11, v15, -0x2

    .line 228
    .line 229
    if-gt v14, v11, :cond_c

    .line 230
    .line 231
    add-int/lit8 v11, v14, 0x1

    .line 232
    .line 233
    ushr-int/lit8 v12, v10, 0x6

    .line 234
    .line 235
    or-int/lit16 v12, v12, 0x3c0

    .line 236
    .line 237
    int-to-byte v12, v12

    .line 238
    aput-byte v12, v13, v14

    .line 239
    .line 240
    add-int/lit8 v14, v14, 0x2

    .line 241
    .line 242
    and-int/lit8 v10, v10, 0x3f

    .line 243
    .line 244
    or-int/2addr v10, v7

    .line 245
    int-to-byte v10, v10

    .line 246
    aput-byte v10, v13, v11

    .line 247
    .line 248
    move/from16 v20, v5

    .line 249
    .line 250
    goto/16 :goto_8

    .line 251
    .line 252
    :cond_c
    const v11, 0xd800

    .line 253
    .line 254
    .line 255
    if-lt v10, v11, :cond_e

    .line 256
    .line 257
    const v11, 0xdfff

    .line 258
    .line 259
    .line 260
    if-ge v11, v10, :cond_d

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_d
    move/from16 v20, v5

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_e
    :goto_6
    add-int/lit8 v11, v15, -0x3

    .line 267
    .line 268
    if-gt v14, v11, :cond_d

    .line 269
    .line 270
    add-int/lit8 v11, v14, 0x1

    .line 271
    .line 272
    ushr-int/lit8 v12, v10, 0xc

    .line 273
    .line 274
    or-int/lit16 v12, v12, 0x1e0

    .line 275
    .line 276
    int-to-byte v12, v12

    .line 277
    aput-byte v12, v13, v14

    .line 278
    .line 279
    add-int/lit8 v12, v14, 0x2

    .line 280
    .line 281
    ushr-int/lit8 v19, v10, 0x6

    .line 282
    .line 283
    move/from16 v20, v5

    .line 284
    .line 285
    and-int/lit8 v5, v19, 0x3f

    .line 286
    .line 287
    or-int/2addr v5, v7

    .line 288
    int-to-byte v5, v5

    .line 289
    aput-byte v5, v13, v11

    .line 290
    .line 291
    add-int/lit8 v14, v14, 0x3

    .line 292
    .line 293
    and-int/lit8 v5, v10, 0x3f

    .line 294
    .line 295
    or-int/2addr v5, v7

    .line 296
    int-to-byte v5, v5

    .line 297
    aput-byte v5, v13, v12

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :goto_7
    add-int/lit8 v5, v15, -0x4

    .line 301
    .line 302
    if-gt v14, v5, :cond_11

    .line 303
    .line 304
    add-int/lit8 v5, v9, 0x1

    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result v11

    .line 310
    if-eq v5, v11, :cond_10

    .line 311
    .line 312
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    invoke-static {v10, v9}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    if-eqz v11, :cond_f

    .line 321
    .line 322
    invoke-static {v10, v9}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    add-int/lit8 v10, v14, 0x1

    .line 327
    .line 328
    ushr-int/lit8 v11, v9, 0x12

    .line 329
    .line 330
    or-int/lit16 v11, v11, 0xf0

    .line 331
    .line 332
    int-to-byte v11, v11

    .line 333
    aput-byte v11, v13, v14

    .line 334
    .line 335
    add-int/lit8 v11, v14, 0x2

    .line 336
    .line 337
    ushr-int/lit8 v12, v9, 0xc

    .line 338
    .line 339
    and-int/lit8 v12, v12, 0x3f

    .line 340
    .line 341
    or-int/2addr v12, v7

    .line 342
    int-to-byte v12, v12

    .line 343
    aput-byte v12, v13, v10

    .line 344
    .line 345
    add-int/lit8 v10, v14, 0x3

    .line 346
    .line 347
    ushr-int/lit8 v12, v9, 0x6

    .line 348
    .line 349
    and-int/lit8 v12, v12, 0x3f

    .line 350
    .line 351
    or-int/2addr v12, v7

    .line 352
    int-to-byte v12, v12

    .line 353
    aput-byte v12, v13, v11

    .line 354
    .line 355
    add-int/lit8 v14, v14, 0x4

    .line 356
    .line 357
    and-int/lit8 v9, v9, 0x3f

    .line 358
    .line 359
    or-int/2addr v9, v7

    .line 360
    int-to-byte v9, v9

    .line 361
    aput-byte v9, v13, v10

    .line 362
    .line 363
    move v9, v5

    .line 364
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 365
    .line 366
    move/from16 v5, v20

    .line 367
    .line 368
    const/16 v12, 0x800

    .line 369
    .line 370
    goto/16 :goto_5

    .line 371
    .line 372
    :cond_f
    move v9, v5

    .line 373
    :cond_10
    new-instance v0, Lxhss/ᛲᛴᛴᲁ;

    .line 374
    .line 375
    add-int/lit8 v9, v9, -0x1

    .line 376
    .line 377
    invoke-direct {v0, v9, v2}, Lxhss/ᛲᛴᛴᲁ;-><init>(II)V

    .line 378
    .line 379
    .line 380
    throw v0

    .line 381
    :cond_11
    const v11, 0xd800

    .line 382
    .line 383
    .line 384
    if-gt v11, v10, :cond_13

    .line 385
    .line 386
    const v11, 0xdfff

    .line 387
    .line 388
    .line 389
    if-gt v10, v11, :cond_13

    .line 390
    .line 391
    add-int/lit8 v0, v9, 0x1

    .line 392
    .line 393
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-eq v0, v1, :cond_12

    .line 398
    .line 399
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    invoke-static {v10, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-nez v0, :cond_13

    .line 408
    .line 409
    :cond_12
    new-instance v0, Lxhss/ᛲᛴᛴᲁ;

    .line 410
    .line 411
    invoke-direct {v0, v9, v2}, Lxhss/ᛲᛴᛴᲁ;-><init>(II)V

    .line 412
    .line 413
    .line 414
    throw v0

    .line 415
    :cond_13
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 416
    .line 417
    new-instance v1, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v0

    .line 439
    :goto_9
    sub-int v14, v14, v20

    .line 440
    .line 441
    invoke-virtual {v4, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 442
    .line 443
    .line 444
    goto/16 :goto_11

    .line 445
    .line 446
    :cond_14
    move/from16 v17, v9

    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    const/4 v9, 0x0

    .line 457
    :goto_a
    if-ge v9, v2, :cond_15

    .line 458
    .line 459
    :try_start_0
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 460
    .line 461
    .line 462
    move-result v10

    .line 463
    if-ge v10, v7, :cond_15

    .line 464
    .line 465
    add-int v11, v5, v9

    .line 466
    .line 467
    int-to-byte v10, v10

    .line 468
    invoke-virtual {v4, v11, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 469
    .line 470
    .line 471
    add-int/lit8 v9, v9, 0x1

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :catch_0
    :goto_b
    move/from16 v2, v17

    .line 475
    .line 476
    goto/16 :goto_13

    .line 477
    .line 478
    :cond_15
    if-ne v9, v2, :cond_16

    .line 479
    .line 480
    add-int v2, v5, v9

    .line 481
    .line 482
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 483
    .line 484
    .line 485
    goto/16 :goto_11

    .line 486
    .line 487
    :cond_16
    add-int/2addr v5, v9

    .line 488
    :goto_c
    if-ge v9, v2, :cond_1d

    .line 489
    .line 490
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 491
    .line 492
    .line 493
    move-result v10

    .line 494
    if-ge v10, v7, :cond_17

    .line 495
    .line 496
    int-to-byte v10, v10

    .line 497
    invoke-virtual {v4, v5, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 498
    .line 499
    .line 500
    :goto_d
    const v12, 0xd800

    .line 501
    .line 502
    .line 503
    const v13, 0xdfff

    .line 504
    .line 505
    .line 506
    goto/16 :goto_10

    .line 507
    .line 508
    :cond_17
    const/16 v11, 0x800

    .line 509
    .line 510
    if-ge v10, v11, :cond_18

    .line 511
    .line 512
    add-int/lit8 v12, v5, 0x1

    .line 513
    .line 514
    ushr-int/lit8 v13, v10, 0x6

    .line 515
    .line 516
    or-int/lit16 v13, v13, 0xc0

    .line 517
    .line 518
    int-to-byte v13, v13

    .line 519
    :try_start_1
    invoke-virtual {v4, v5, v13}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 520
    .line 521
    .line 522
    and-int/lit8 v5, v10, 0x3f

    .line 523
    .line 524
    or-int/2addr v5, v7

    .line 525
    int-to-byte v5, v5

    .line 526
    invoke-virtual {v4, v12, v5}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 527
    .line 528
    .line 529
    move v5, v12

    .line 530
    goto :goto_d

    .line 531
    :catch_1
    move v5, v12

    .line 532
    goto :goto_b

    .line 533
    :cond_18
    const v12, 0xd800

    .line 534
    .line 535
    .line 536
    const v13, 0xdfff

    .line 537
    .line 538
    .line 539
    if-lt v10, v12, :cond_1c

    .line 540
    .line 541
    if-ge v13, v10, :cond_19

    .line 542
    .line 543
    goto :goto_f

    .line 544
    :cond_19
    add-int/lit8 v14, v9, 0x1

    .line 545
    .line 546
    if-eq v14, v2, :cond_1b

    .line 547
    .line 548
    :try_start_2
    invoke-virtual {v3, v14}, Ljava/lang/String;->charAt(I)C

    .line 549
    .line 550
    .line 551
    move-result v9

    .line 552
    invoke-static {v10, v9}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 553
    .line 554
    .line 555
    move-result v15

    .line 556
    if-eqz v15, :cond_1a

    .line 557
    .line 558
    invoke-static {v10, v9}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 559
    .line 560
    .line 561
    move-result v9
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    .line 562
    add-int/lit8 v10, v5, 0x1

    .line 563
    .line 564
    ushr-int/lit8 v15, v9, 0x12

    .line 565
    .line 566
    or-int/lit16 v15, v15, 0xf0

    .line 567
    .line 568
    int-to-byte v15, v15

    .line 569
    :try_start_3
    invoke-virtual {v4, v5, v15}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_4

    .line 570
    .line 571
    .line 572
    add-int/lit8 v15, v5, 0x2

    .line 573
    .line 574
    ushr-int/lit8 v18, v9, 0xc

    .line 575
    .line 576
    and-int/lit8 v11, v18, 0x3f

    .line 577
    .line 578
    or-int/2addr v11, v7

    .line 579
    int-to-byte v11, v11

    .line 580
    :try_start_4
    invoke-virtual {v4, v10, v11}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_3

    .line 581
    .line 582
    .line 583
    add-int/lit8 v5, v5, 0x3

    .line 584
    .line 585
    ushr-int/lit8 v10, v9, 0x6

    .line 586
    .line 587
    and-int/lit8 v10, v10, 0x3f

    .line 588
    .line 589
    or-int/2addr v10, v7

    .line 590
    int-to-byte v10, v10

    .line 591
    :try_start_5
    invoke-virtual {v4, v15, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 592
    .line 593
    .line 594
    and-int/lit8 v9, v9, 0x3f

    .line 595
    .line 596
    or-int/2addr v9, v7

    .line 597
    int-to-byte v9, v9

    .line 598
    invoke-virtual {v4, v5, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_2

    .line 599
    .line 600
    .line 601
    move v9, v14

    .line 602
    goto :goto_10

    .line 603
    :catch_2
    :goto_e
    move v9, v14

    .line 604
    goto/16 :goto_b

    .line 605
    .line 606
    :catch_3
    move v9, v14

    .line 607
    move v5, v15

    .line 608
    goto/16 :goto_b

    .line 609
    .line 610
    :catch_4
    move v5, v10

    .line 611
    goto :goto_e

    .line 612
    :cond_1a
    move v9, v14

    .line 613
    :cond_1b
    :try_start_6
    new-instance v0, Lxhss/ᛲᛴᛴᲁ;

    .line 614
    .line 615
    invoke-direct {v0, v9, v2}, Lxhss/ᛲᛴᛴᲁ;-><init>(II)V

    .line 616
    .line 617
    .line 618
    throw v0
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0

    .line 619
    :cond_1c
    :goto_f
    add-int/lit8 v11, v5, 0x1

    .line 620
    .line 621
    ushr-int/lit8 v14, v10, 0xc

    .line 622
    .line 623
    or-int/lit16 v14, v14, 0xe0

    .line 624
    .line 625
    int-to-byte v14, v14

    .line 626
    :try_start_7
    invoke-virtual {v4, v5, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_5

    .line 627
    .line 628
    .line 629
    add-int/lit8 v5, v5, 0x2

    .line 630
    .line 631
    ushr-int/lit8 v14, v10, 0x6

    .line 632
    .line 633
    and-int/lit8 v14, v14, 0x3f

    .line 634
    .line 635
    or-int/2addr v14, v7

    .line 636
    int-to-byte v14, v14

    .line 637
    :try_start_8
    invoke-virtual {v4, v11, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 638
    .line 639
    .line 640
    and-int/lit8 v10, v10, 0x3f

    .line 641
    .line 642
    or-int/2addr v10, v7

    .line 643
    int-to-byte v10, v10

    .line 644
    invoke-virtual {v4, v5, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 645
    .line 646
    .line 647
    :goto_10
    add-int/lit8 v9, v9, 0x1

    .line 648
    .line 649
    add-int/lit8 v5, v5, 0x1

    .line 650
    .line 651
    goto/16 :goto_c

    .line 652
    .line 653
    :catch_5
    move v5, v11

    .line 654
    goto/16 :goto_b

    .line 655
    .line 656
    :cond_1d
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_0

    .line 657
    .line 658
    .line 659
    :goto_11
    invoke-virtual {v1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ()I

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    iget v3, v0, Lxhss/ᛳᛲᛶᛶ;->ᛷᛴᛷᛱ:I

    .line 664
    .line 665
    const/4 v4, 0x3

    .line 666
    const/4 v5, 0x2

    .line 667
    move/from16 v6, v17

    .line 668
    .line 669
    if-eq v3, v6, :cond_22

    .line 670
    .line 671
    if-eq v3, v5, :cond_21

    .line 672
    .line 673
    if-eq v3, v4, :cond_20

    .line 674
    .line 675
    const/4 v6, 0x4

    .line 676
    if-eq v3, v6, :cond_1f

    .line 677
    .line 678
    const/4 v7, 0x5

    .line 679
    if-ne v3, v7, :cond_1e

    .line 680
    .line 681
    goto :goto_12

    .line 682
    :cond_1e
    const/4 v0, 0x0

    .line 683
    throw v0

    .line 684
    :cond_1f
    move v6, v4

    .line 685
    goto :goto_12

    .line 686
    :cond_20
    move v6, v5

    .line 687
    goto :goto_12

    .line 688
    :cond_21
    const/4 v6, 0x1

    .line 689
    goto :goto_12

    .line 690
    :cond_22
    const/4 v6, 0x0

    .line 691
    :goto_12
    invoke-virtual {v1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 692
    .line 693
    .line 694
    const/4 v3, 0x0

    .line 695
    invoke-virtual {v1, v3, v2}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 696
    .line 697
    .line 698
    iget-boolean v0, v0, Lxhss/ᛳᛲᛶᛶ;->ᲇᛶᛴᲀ:Z

    .line 699
    .line 700
    const/4 v2, 0x1

    .line 701
    if-eqz v0, :cond_23

    .line 702
    .line 703
    invoke-virtual {v1, v2, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 704
    .line 705
    .line 706
    iget-object v3, v1, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 707
    .line 708
    iget v4, v1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 709
    .line 710
    sub-int/2addr v4, v2

    .line 711
    iput v4, v1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 712
    .line 713
    int-to-byte v0, v0

    .line 714
    invoke-virtual {v3, v4, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 715
    .line 716
    .line 717
    iget-object v0, v1, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 718
    .line 719
    invoke-virtual {v1}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    aput v3, v0, v5

    .line 724
    .line 725
    :cond_23
    invoke-virtual {v1, v2, v6}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    invoke-virtual {v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 733
    .line 734
    .line 735
    return v0

    .line 736
    :goto_13
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    sub-int/2addr v5, v1

    .line 745
    add-int/2addr v5, v2

    .line 746
    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    add-int/2addr v1, v0

    .line 751
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 752
    .line 753
    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    .line 754
    .line 755
    .line 756
    move-result v2

    .line 757
    new-instance v3, Ljava/lang/StringBuilder;

    .line 758
    .line 759
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    throw v0

    .line 779
    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 780
    .line 781
    int-to-long v1, v8

    .line 782
    const-wide v3, 0x100000000L

    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    add-long/2addr v1, v3

    .line 788
    new-instance v3, Ljava/lang/StringBuilder;

    .line 789
    .line 790
    const-string v4, "UTF-8 length does not fit in int: "

    .line 791
    .line 792
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    throw v0

    .line 806
    :cond_25
    const-string v0, "value must be specified"

    .line 807
    .line 808
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    const/16 v16, 0x0

    .line 812
    .line 813
    return v16
.end method
