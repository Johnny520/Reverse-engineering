.class public final Lyyds/ᛷᲁᛷᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x6214ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/io/File;Ljava/io/File;)Lyyds/ᛳᛷᛶᛴ;
    .locals 39

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-wide v2, -0x6202be68a836eL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    const-wide v2, -0x61f11e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/io/File;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v4, 0x3

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x1

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 36
    .line 37
    .line 38
    move-result-wide v9

    .line 39
    const-wide/16 v11, 0xc

    .line 40
    .line 41
    cmp-long v2, v9, v11

    .line 42
    .line 43
    if-gez v2, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 47
    .line 48
    const-wide v9, -0x61f1ae68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-direct {v2, v0, v9}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    :try_start_0
    new-array v9, v0, [B

    .line 62
    .line 63
    invoke-virtual {v2, v9}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 64
    .line 65
    .line 66
    new-instance v10, Ljava/lang/String;

    .line 67
    .line 68
    sget-object v13, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    invoke-direct {v10, v9, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 71
    .line 72
    .line 73
    const-wide v14, -0x61f1ce68a836eL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v14, v15}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 86
    if-nez v9, :cond_2

    .line 87
    .line 88
    :goto_0
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_1
    const/16 p0, 0x2

    .line 92
    .line 93
    :goto_2
    const/4 v14, 0x0

    .line 94
    goto/16 :goto_c

    .line 95
    .line 96
    :cond_2
    :try_start_1
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    new-array v14, v0, [B

    .line 101
    .line 102
    invoke-virtual {v2, v14}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 103
    .line 104
    .line 105
    new-instance v15, Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {v15, v14, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 108
    .line 109
    .line 110
    const-wide v13, -0x61f21e68a836eL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-virtual {v15, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    if-nez v13, :cond_3

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    new-instance v13, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    add-long/2addr v9, v11

    .line 132
    move v15, v7

    .line 133
    move/from16 v16, v15

    .line 134
    .line 135
    move/from16 v17, v16

    .line 136
    .line 137
    move/from16 v18, v17

    .line 138
    .line 139
    move/from16 v19, v18

    .line 140
    .line 141
    move/from16 v21, v19

    .line 142
    .line 143
    :goto_3
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 144
    .line 145
    .line 146
    move-result-wide v11

    .line 147
    cmp-long v11, v11, v9

    .line 148
    .line 149
    if-gez v11, :cond_14

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 152
    .line 153
    .line 154
    move-result-wide v11

    .line 155
    const-wide/16 v22, 0x8

    .line 156
    .line 157
    add-long v11, v11, v22

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    .line 160
    .line 161
    .line 162
    move-result-wide v22

    .line 163
    cmp-long v11, v11, v22

    .line 164
    .line 165
    if-gtz v11, :cond_14

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 168
    .line 169
    .line 170
    new-array v11, v0, [B

    .line 171
    .line 172
    invoke-virtual {v2, v11}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 173
    .line 174
    .line 175
    new-instance v12, Ljava/lang/String;

    .line 176
    .line 177
    sget-object v14, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 178
    .line 179
    invoke-direct {v12, v11, v14}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    .line 181
    .line 182
    const/16 p0, 0x2

    .line 183
    .line 184
    :try_start_2
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v5

    .line 188
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFilePointer()J

    .line 189
    .line 190
    .line 191
    move-result-wide v22

    .line 192
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    const-wide/16 v24, 0xa

    .line 197
    .line 198
    sparse-switch v11, :sswitch_data_0

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :sswitch_0
    const-wide v26, -0x61f26e68a836eL

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    invoke-static/range {v26 .. v27}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-nez v11, :cond_4

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_4
    cmp-long v11, v5, v24

    .line 219
    .line 220
    if-ltz v11, :cond_7

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 227
    .line 228
    .line 229
    and-int/lit8 v12, v11, 0x2

    .line 230
    .line 231
    if-eqz v12, :cond_5

    .line 232
    .line 233
    move v15, v8

    .line 234
    goto :goto_4

    .line 235
    :cond_5
    move v15, v7

    .line 236
    :goto_4
    and-int/lit8 v11, v11, 0x10

    .line 237
    .line 238
    if-eqz v11, :cond_6

    .line 239
    .line 240
    move/from16 v21, v8

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_6
    move/from16 v21, v7

    .line 244
    .line 245
    :goto_5
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    add-int/lit8 v16, v11, 0x1

    .line 250
    .line 251
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    add-int/lit8 v17, v11, 0x1

    .line 256
    .line 257
    :cond_7
    :goto_6
    move-wide/from16 v35, v9

    .line 258
    .line 259
    goto/16 :goto_a

    .line 260
    .line 261
    :catchall_0
    move-exception v0

    .line 262
    goto/16 :goto_b

    .line 263
    .line 264
    :sswitch_1
    const-wide v26, -0x61f2be68a836eL

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    invoke-static/range {v26 .. v27}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-nez v11, :cond_8

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :sswitch_2
    const-wide v26, -0x61f35e68a836eL

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    invoke-static/range {v26 .. v27}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    if-nez v11, :cond_8

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_8
    if-nez v15, :cond_7

    .line 297
    .line 298
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-eqz v11, :cond_7

    .line 303
    .line 304
    const-wide v26, -0x61f3fe68a836eL

    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    invoke-static/range {v26 .. v27}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    if-eqz v11, :cond_a

    .line 318
    .line 319
    cmp-long v11, v5, v24

    .line 320
    .line 321
    if-ltz v11, :cond_a

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 327
    .line 328
    .line 329
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;)I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    and-int/lit16 v11, v11, 0x3fff

    .line 334
    .line 335
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;)I

    .line 336
    .line 337
    .line 338
    move-result v12

    .line 339
    and-int/lit16 v12, v12, 0x3fff

    .line 340
    .line 341
    if-nez v16, :cond_9

    .line 342
    .line 343
    move/from16 v16, v11

    .line 344
    .line 345
    :cond_9
    if-nez v17, :cond_7

    .line 346
    .line 347
    move-wide/from16 v35, v9

    .line 348
    .line 349
    move/from16 v17, v12

    .line 350
    .line 351
    goto/16 :goto_a

    .line 352
    .line 353
    :cond_a
    const-wide v24, -0x61f44e68a836eL

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    invoke-static/range {v24 .. v25}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    if-eqz v11, :cond_7

    .line 367
    .line 368
    const-wide/16 v11, 0x5

    .line 369
    .line 370
    cmp-long v11, v5, v11

    .line 371
    .line 372
    if-ltz v11, :cond_7

    .line 373
    .line 374
    invoke-virtual {v2, v8}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 375
    .line 376
    .line 377
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛳᛶᛵ(Ljava/io/RandomAccessFile;)J

    .line 378
    .line 379
    .line 380
    move-result-wide v11

    .line 381
    long-to-int v11, v11

    .line 382
    and-int/lit16 v12, v11, 0x3fff

    .line 383
    .line 384
    add-int/2addr v12, v8

    .line 385
    shr-int/lit8 v14, v11, 0xe

    .line 386
    .line 387
    and-int/lit16 v14, v14, 0x3fff

    .line 388
    .line 389
    add-int/2addr v14, v8

    .line 390
    if-nez v16, :cond_b

    .line 391
    .line 392
    move/from16 v16, v12

    .line 393
    .line 394
    :cond_b
    if-nez v17, :cond_c

    .line 395
    .line 396
    move/from16 v17, v14

    .line 397
    .line 398
    :cond_c
    shr-int/lit8 v11, v11, 0x1c

    .line 399
    .line 400
    and-int/2addr v11, v8

    .line 401
    if-eqz v11, :cond_d

    .line 402
    .line 403
    move/from16 v21, v8

    .line 404
    .line 405
    goto/16 :goto_6

    .line 406
    .line 407
    :cond_d
    move/from16 v21, v7

    .line 408
    .line 409
    goto/16 :goto_6

    .line 410
    .line 411
    :sswitch_3
    const-wide v24, -0x61f30e68a836eL

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    invoke-static/range {v24 .. v25}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v11

    .line 420
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    if-nez v11, :cond_e

    .line 425
    .line 426
    goto/16 :goto_6

    .line 427
    .line 428
    :cond_e
    const-wide/16 v11, 0x10

    .line 429
    .line 430
    cmp-long v14, v5, v11

    .line 431
    .line 432
    if-ltz v14, :cond_7

    .line 433
    .line 434
    const-wide/32 v24, 0x7fffffff

    .line 435
    .line 436
    .line 437
    cmp-long v14, v5, v24

    .line 438
    .line 439
    if-gtz v14, :cond_7

    .line 440
    .line 441
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 442
    .line 443
    .line 444
    move-result v14

    .line 445
    mul-int/lit8 v25, v14, 0x2

    .line 446
    .line 447
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 448
    .line 449
    .line 450
    move-result v14

    .line 451
    mul-int/lit8 v26, v14, 0x2

    .line 452
    .line 453
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 454
    .line 455
    .line 456
    move-result v14

    .line 457
    add-int/lit8 v27, v14, 0x1

    .line 458
    .line 459
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 460
    .line 461
    .line 462
    move-result v14

    .line 463
    add-int/lit8 v28, v14, 0x1

    .line 464
    .line 465
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᲇᛱᛲ(Ljava/io/RandomAccessFile;)I

    .line 466
    .line 467
    .line 468
    move-result v14

    .line 469
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    .line 470
    .line 471
    .line 472
    move-result v20

    .line 473
    and-int/lit8 v24, v20, 0x1

    .line 474
    .line 475
    if-eqz v24, :cond_f

    .line 476
    .line 477
    move/from16 v31, v8

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_f
    move/from16 v31, v7

    .line 481
    .line 482
    :goto_7
    and-int/lit8 v20, v20, 0x2

    .line 483
    .line 484
    if-eqz v20, :cond_10

    .line 485
    .line 486
    move/from16 v30, v8

    .line 487
    .line 488
    goto :goto_8

    .line 489
    :cond_10
    move/from16 v30, v7

    .line 490
    .line 491
    :goto_8
    add-long v32, v22, v11

    .line 492
    .line 493
    long-to-int v11, v5

    .line 494
    add-int/lit8 v11, v11, -0x10

    .line 495
    .line 496
    if-gtz v14, :cond_11

    .line 497
    .line 498
    const/16 v29, 0x64

    .line 499
    .line 500
    goto :goto_9

    .line 501
    :cond_11
    move/from16 v29, v14

    .line 502
    .line 503
    :goto_9
    if-lez v11, :cond_7

    .line 504
    .line 505
    move-wide/from16 v35, v9

    .line 506
    .line 507
    int-to-long v8, v11

    .line 508
    add-long v8, v32, v8

    .line 509
    .line 510
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    .line 511
    .line 512
    .line 513
    move-result-wide v37

    .line 514
    cmp-long v8, v8, v37

    .line 515
    .line 516
    if-gtz v8, :cond_13

    .line 517
    .line 518
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    const/16 v9, 0x2710

    .line 523
    .line 524
    if-ge v8, v9, :cond_13

    .line 525
    .line 526
    new-instance v24, Lyyds/ᛸᲇᛶᲈ;

    .line 527
    .line 528
    move/from16 v34, v11

    .line 529
    .line 530
    invoke-direct/range {v24 .. v34}, Lyyds/ᛸᲇᛶᲈ;-><init>(IIIIIZZJI)V

    .line 531
    .line 532
    .line 533
    move-object/from16 v8, v24

    .line 534
    .line 535
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    goto :goto_a

    .line 539
    :sswitch_4
    move-wide/from16 v35, v9

    .line 540
    .line 541
    const-wide v8, -0x61f3ae68a836eL

    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-nez v8, :cond_12

    .line 555
    .line 556
    goto :goto_a

    .line 557
    :cond_12
    const-wide/16 v8, 0x6

    .line 558
    .line 559
    cmp-long v8, v5, v8

    .line 560
    .line 561
    if-ltz v8, :cond_13

    .line 562
    .line 563
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    .line 564
    .line 565
    .line 566
    move-result v8

    .line 567
    and-int/lit16 v8, v8, 0xff

    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    .line 570
    .line 571
    .line 572
    move-result v9

    .line 573
    and-int/lit16 v9, v9, 0xff

    .line 574
    .line 575
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    .line 576
    .line 577
    .line 578
    move-result v10

    .line 579
    and-int/lit16 v10, v10, 0xff

    .line 580
    .line 581
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    and-int/lit16 v11, v11, 0xff

    .line 586
    .line 587
    shl-int/lit8 v11, v11, 0x18

    .line 588
    .line 589
    shl-int/lit8 v10, v10, 0x10

    .line 590
    .line 591
    or-int/2addr v10, v11

    .line 592
    shl-int/lit8 v9, v9, 0x8

    .line 593
    .line 594
    or-int/2addr v9, v10

    .line 595
    or-int v19, v9, v8

    .line 596
    .line 597
    invoke-static {v2}, Lyyds/ᲁᲀᲈᛸ;->ᛳᲁᲁᲇ(Ljava/io/RandomAccessFile;)I

    .line 598
    .line 599
    .line 600
    move-result v18

    .line 601
    :cond_13
    :goto_a
    add-long v22, v22, v5

    .line 602
    .line 603
    const-wide/16 v8, 0x2

    .line 604
    .line 605
    rem-long/2addr v5, v8

    .line 606
    add-long v5, v22, v5

    .line 607
    .line 608
    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 609
    .line 610
    .line 611
    move-wide/from16 v9, v35

    .line 612
    .line 613
    const/4 v8, 0x1

    .line 614
    goto/16 :goto_3

    .line 615
    .line 616
    :catchall_1
    move-exception v0

    .line 617
    const/16 p0, 0x2

    .line 618
    .line 619
    goto :goto_b

    .line 620
    :cond_14
    const/16 p0, 0x2

    .line 621
    .line 622
    new-instance v14, Lyyds/ᲈᛱᛲᲀ;

    .line 623
    .line 624
    move-object/from16 v20, v13

    .line 625
    .line 626
    invoke-direct/range {v14 .. v21}, Lyyds/ᲈᛱᛲᲀ;-><init>(ZIIIILjava/util/ArrayList;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    .line 630
    .line 631
    .line 632
    goto :goto_c

    .line 633
    :goto_b
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 634
    .line 635
    .line 636
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    .line 637
    .line 638
    .line 639
    goto/16 :goto_2

    .line 640
    .line 641
    :catchall_2
    move-exception v0

    .line 642
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    .line 643
    .line 644
    .line 645
    throw v0

    .line 646
    :goto_c
    if-nez v14, :cond_15

    .line 647
    .line 648
    new-instance v15, Lyyds/ᛳᛷᛶᛴ;

    .line 649
    .line 650
    const-wide v0, -0x62040e68a836eL

    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v22

    .line 659
    const/16 v23, 0x3e

    .line 660
    .line 661
    const/16 v16, 0x0

    .line 662
    .line 663
    const/16 v17, 0x0

    .line 664
    .line 665
    const/16 v18, 0x0

    .line 666
    .line 667
    const/16 v19, 0x0

    .line 668
    .line 669
    const/16 v20, 0x0

    .line 670
    .line 671
    const/16 v21, 0x0

    .line 672
    .line 673
    invoke-direct/range {v15 .. v23}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 674
    .line 675
    .line 676
    return-object v15

    .line 677
    :cond_15
    iget v2, v14, Lyyds/ᲈᛱᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 678
    .line 679
    iget-object v5, v14, Lyyds/ᲈᛱᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 680
    .line 681
    iget-boolean v0, v14, Lyyds/ᲈᛱᛲᲀ;->ᛲᲈᲁ:Z

    .line 682
    .line 683
    if-eqz v0, :cond_2e

    .line 684
    .line 685
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    if-eqz v0, :cond_16

    .line 690
    .line 691
    goto/16 :goto_21

    .line 692
    .line 693
    :cond_16
    iget v6, v14, Lyyds/ᲈᛱᛲᲀ;->ᛵᛸᛸᛷ:I

    .line 694
    .line 695
    iget v8, v14, Lyyds/ᲈᛱᛲᲀ;->ᲀᛲᛳᲀ:I

    .line 696
    .line 697
    const/16 v0, 0x78

    .line 698
    .line 699
    if-lez v6, :cond_17

    .line 700
    .line 701
    if-gtz v8, :cond_18

    .line 702
    .line 703
    :cond_17
    move v1, v6

    .line 704
    move v2, v8

    .line 705
    goto/16 :goto_20

    .line 706
    .line 707
    :cond_18
    int-to-long v9, v6

    .line 708
    int-to-long v11, v8

    .line 709
    mul-long/2addr v9, v11

    .line 710
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    int-to-long v11, v11

    .line 715
    mul-long/2addr v9, v11

    .line 716
    const-wide/32 v11, 0x3d09000

    .line 717
    .line 718
    .line 719
    cmp-long v9, v9, v11

    .line 720
    .line 721
    if-lez v9, :cond_19

    .line 722
    .line 723
    new-instance v15, Lyyds/ᛳᛷᛶᛴ;

    .line 724
    .line 725
    new-instance v1, Ljava/lang/StringBuilder;

    .line 726
    .line 727
    const-wide v2, -0x6206de68a836eL

    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-wide v2, -0x62074e68a836eL

    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    const-wide v2, -0x62078e68a836eL

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v22

    .line 783
    const/16 v23, 0x3e

    .line 784
    .line 785
    const/16 v16, 0x0

    .line 786
    .line 787
    const/16 v17, 0x0

    .line 788
    .line 789
    const/16 v18, 0x0

    .line 790
    .line 791
    const/16 v19, 0x0

    .line 792
    .line 793
    const/16 v20, 0x0

    .line 794
    .line 795
    const/16 v21, 0x0

    .line 796
    .line 797
    invoke-direct/range {v15 .. v23}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 798
    .line 799
    .line 800
    return-object v15

    .line 801
    :cond_19
    const-wide v9, -0x6208fe68a836eL

    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v9

    .line 810
    new-instance v10, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    const-wide v11, -0x620a2e68a836eL

    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v11

    .line 821
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    const-wide v11, -0x620a9e68a836eL

    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 846
    .line 847
    .line 848
    move-result v0

    .line 849
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    const-wide v11, -0x620ace68a836eL

    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    iget-boolean v0, v14, Lyyds/ᲈᛱᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 865
    .line 866
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    const-wide v11, -0x620b7e68a836eL

    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-static {v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 889
    .line 890
    .line 891
    new-instance v9, Ljava/util/ArrayList;

    .line 892
    .line 893
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 894
    .line 895
    .line 896
    new-instance v10, Ljava/util/ArrayList;

    .line 897
    .line 898
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 899
    .line 900
    .line 901
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 902
    .line 903
    invoke-static {v6, v8, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 904
    .line 905
    .line 906
    move-result-object v11

    .line 907
    const-wide v12, -0x620bfe68a836eL

    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    invoke-static {v12, v13}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    new-instance v14, Landroid/graphics/Canvas;

    .line 916
    .line 917
    invoke-direct {v14, v11}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 918
    .line 919
    .line 920
    new-instance v12, Landroid/graphics/Paint;

    .line 921
    .line 922
    invoke-direct {v12, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 923
    .line 924
    .line 925
    new-instance v4, Landroid/graphics/Paint;

    .line 926
    .line 927
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 928
    .line 929
    .line 930
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 931
    .line 932
    sget-object v13, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 933
    .line 934
    invoke-direct {v0, v13}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v11, v7}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 944
    .line 945
    .line 946
    move-result v13

    .line 947
    move v15, v7

    .line 948
    :goto_d
    if-ge v15, v13, :cond_20

    .line 949
    .line 950
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    move-object v3, v0

    .line 955
    check-cast v3, Lyyds/ᛸᲇᛶᲈ;

    .line 956
    .line 957
    const-wide v16, -0x61f49e68a836eL

    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    iget v0, v3, Lyyds/ᛸᲇᛶᲈ;->ᛲᛳᛶᲁ:I

    .line 966
    .line 967
    if-gtz v0, :cond_1a

    .line 968
    .line 969
    move-object/from16 v22, v1

    .line 970
    .line 971
    move-object/from16 v19, v4

    .line 972
    .line 973
    move-object v1, v5

    .line 974
    :goto_e
    const/4 v0, 0x0

    .line 975
    goto :goto_f

    .line 976
    :cond_1a
    new-instance v7, Ljava/io/RandomAccessFile;

    .line 977
    .line 978
    move-object/from16 v19, v4

    .line 979
    .line 980
    new-instance v4, Ljava/io/File;

    .line 981
    .line 982
    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    const-wide v16, -0x61f53e68a836eL

    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    move-object/from16 v22, v1

    .line 991
    .line 992
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    invoke-direct {v7, v4, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    move-object v1, v5

    .line 1000
    :try_start_4
    iget-wide v4, v3, Lyyds/ᛸᲇᛶᲈ;->ᛱᲈᲁ:J

    .line 1001
    .line 1002
    invoke-virtual {v7, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 1003
    .line 1004
    .line 1005
    new-array v0, v0, [B

    .line 1006
    .line 1007
    invoke-virtual {v7, v0}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v0, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛳᛸᛴᛶ([BLyyds/ᛸᲇᛶᲈ;)[B

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1014
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_f

    .line 1018
    :catchall_3
    move-exception v0

    .line 1019
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    .line 1023
    .line 1024
    .line 1025
    goto :goto_e

    .line 1026
    :goto_f
    if-nez v0, :cond_1b

    .line 1027
    .line 1028
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 1029
    .line 1030
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    const-wide v4, -0x620d1e68a836eL

    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    const-wide v4, -0x620d4e68a836eL

    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v4

    .line 1056
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v3

    .line 1063
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    invoke-static {v3}, Lyyds/ᲈᛷᛵᛷ;->ᛶᲈᛴᲈ(Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    move-object/from16 v23, v1

    .line 1070
    .line 1071
    :goto_10
    move/from16 v24, v6

    .line 1072
    .line 1073
    move/from16 v25, v8

    .line 1074
    .line 1075
    move v7, v15

    .line 1076
    const/4 v4, 0x0

    .line 1077
    goto/16 :goto_14

    .line 1078
    .line 1079
    :cond_1b
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    .line 1080
    .line 1081
    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1082
    .line 1083
    .line 1084
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1085
    .line 1086
    iput-object v5, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1087
    .line 1088
    array-length v7, v0

    .line 1089
    move-object/from16 v23, v1

    .line 1090
    .line 1091
    const/4 v1, 0x0

    .line 1092
    invoke-static {v0, v1, v7, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    if-nez v0, :cond_1c

    .line 1097
    .line 1098
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 1099
    .line 1100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    const-wide v3, -0x620dde68a836eL

    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1115
    .line 1116
    .line 1117
    const-wide v3, -0x620e0e68a836eL

    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v3

    .line 1126
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v1}, Lyyds/ᲈᛷᛵᛷ;->ᛶᲈᛴᲈ(Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_10

    .line 1140
    :cond_1c
    new-instance v1, Landroid/graphics/Rect;

    .line 1141
    .line 1142
    iget v4, v3, Lyyds/ᛸᲇᛶᲈ;->ᛲᲈᲁ:I

    .line 1143
    .line 1144
    iget v7, v3, Lyyds/ᛸᲇᛶᲈ;->ᛵᛸᛸᛷ:I

    .line 1145
    .line 1146
    move/from16 v24, v6

    .line 1147
    .line 1148
    iget v6, v3, Lyyds/ᛸᲇᛶᲈ;->ᲀᛲᛳᲀ:I

    .line 1149
    .line 1150
    add-int/2addr v6, v4

    .line 1151
    move/from16 v25, v8

    .line 1152
    .line 1153
    iget v8, v3, Lyyds/ᛸᲇᛶᲈ;->ᲇᲈᛵᛷ:I

    .line 1154
    .line 1155
    add-int/2addr v8, v7

    .line 1156
    invoke-direct {v1, v4, v7, v6, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1157
    .line 1158
    .line 1159
    iget-boolean v4, v3, Lyyds/ᛸᲇᛶᲈ;->ᲇᲇᲇᛱ:Z

    .line 1160
    .line 1161
    if-eqz v4, :cond_1d

    .line 1162
    .line 1163
    iget v4, v1, Landroid/graphics/Rect;->left:I

    .line 1164
    .line 1165
    int-to-float v4, v4

    .line 1166
    iget v6, v1, Landroid/graphics/Rect;->top:I

    .line 1167
    .line 1168
    int-to-float v6, v6

    .line 1169
    iget v7, v1, Landroid/graphics/Rect;->right:I

    .line 1170
    .line 1171
    int-to-float v7, v7

    .line 1172
    iget v8, v1, Landroid/graphics/Rect;->bottom:I

    .line 1173
    .line 1174
    int-to-float v8, v8

    .line 1175
    move/from16 v16, v6

    .line 1176
    .line 1177
    move/from16 v17, v7

    .line 1178
    .line 1179
    move/from16 v18, v8

    .line 1180
    .line 1181
    move v7, v15

    .line 1182
    move v15, v4

    .line 1183
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1184
    .line 1185
    .line 1186
    const/4 v4, 0x0

    .line 1187
    invoke-virtual {v14, v0, v4, v1, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 1188
    .line 1189
    .line 1190
    :goto_11
    const/4 v6, 0x0

    .line 1191
    goto :goto_12

    .line 1192
    :cond_1d
    move v7, v15

    .line 1193
    const/4 v4, 0x0

    .line 1194
    invoke-virtual {v14, v0, v4, v1, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 1195
    .line 1196
    .line 1197
    goto :goto_11

    .line 1198
    :goto_12
    invoke-virtual {v11, v5, v6}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v5

    .line 1202
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    iget v5, v3, Lyyds/ᛸᲇᛶᲈ;->ᛲᛴᛳᛲ:I

    .line 1206
    .line 1207
    if-lez v5, :cond_1e

    .line 1208
    .line 1209
    goto :goto_13

    .line 1210
    :cond_1e
    const/16 v5, 0x64

    .line 1211
    .line 1212
    :goto_13
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v5

    .line 1216
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    iget-boolean v3, v3, Lyyds/ᛸᲇᛶᲈ;->ᛶᛷᛲᲁ:Z

    .line 1220
    .line 1221
    if-eqz v3, :cond_1f

    .line 1222
    .line 1223
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 1224
    .line 1225
    int-to-float v15, v3

    .line 1226
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 1227
    .line 1228
    int-to-float v3, v3

    .line 1229
    iget v5, v1, Landroid/graphics/Rect;->right:I

    .line 1230
    .line 1231
    int-to-float v5, v5

    .line 1232
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 1233
    .line 1234
    int-to-float v1, v1

    .line 1235
    move/from16 v18, v1

    .line 1236
    .line 1237
    move/from16 v16, v3

    .line 1238
    .line 1239
    move/from16 v17, v5

    .line 1240
    .line 1241
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1242
    .line 1243
    .line 1244
    :cond_1f
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1245
    .line 1246
    .line 1247
    :goto_14
    add-int/lit8 v15, v7, 0x1

    .line 1248
    .line 1249
    move-object/from16 v4, v19

    .line 1250
    .line 1251
    move-object/from16 v1, v22

    .line 1252
    .line 1253
    move-object/from16 v5, v23

    .line 1254
    .line 1255
    move/from16 v6, v24

    .line 1256
    .line 1257
    move/from16 v8, v25

    .line 1258
    .line 1259
    const/4 v7, 0x0

    .line 1260
    goto/16 :goto_d

    .line 1261
    .line 1262
    :catchall_4
    move-exception v0

    .line 1263
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    .line 1264
    .line 1265
    .line 1266
    throw v0

    .line 1267
    :cond_20
    move/from16 v24, v6

    .line 1268
    .line 1269
    move/from16 v25, v8

    .line 1270
    .line 1271
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->recycle()V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1275
    .line 1276
    .line 1277
    move-result v0

    .line 1278
    if-eqz v0, :cond_21

    .line 1279
    .line 1280
    new-instance v11, Lyyds/ᛳᛷᛶᛴ;

    .line 1281
    .line 1282
    const-wide v0, -0x620e9e68a836eL

    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v18

    .line 1291
    const/16 v19, 0x3e

    .line 1292
    .line 1293
    const/4 v12, 0x0

    .line 1294
    const/4 v13, 0x0

    .line 1295
    const/4 v14, 0x0

    .line 1296
    const/4 v15, 0x0

    .line 1297
    const/16 v16, 0x0

    .line 1298
    .line 1299
    const/16 v17, 0x0

    .line 1300
    .line 1301
    invoke-direct/range {v11 .. v19}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 1302
    .line 1303
    .line 1304
    return-object v11

    .line 1305
    :cond_21
    const-wide v0, -0x620f3e68a836eL

    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    const-wide v3, -0x62106e68a836eL

    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1329
    .line 1330
    .line 1331
    move-result v3

    .line 1332
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1333
    .line 1334
    .line 1335
    const-wide v3, -0x6210ae68a836eL

    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v3

    .line 1344
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v1

    .line 1351
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1359
    .line 1360
    .line 1361
    move-result v1

    .line 1362
    if-eqz v1, :cond_25

    .line 1363
    .line 1364
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v1

    .line 1368
    move-object v11, v1

    .line 1369
    check-cast v11, Landroid/graphics/Bitmap;

    .line 1370
    .line 1371
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1372
    .line 1373
    .line 1374
    move-result v14

    .line 1375
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1376
    .line 1377
    .line 1378
    move-result v18

    .line 1379
    mul-int v1, v14, v18

    .line 1380
    .line 1381
    new-array v12, v1, [I

    .line 1382
    .line 1383
    const/4 v15, 0x0

    .line 1384
    const/16 v16, 0x0

    .line 1385
    .line 1386
    const/4 v13, 0x0

    .line 1387
    move/from16 v17, v14

    .line 1388
    .line 1389
    invoke-virtual/range {v11 .. v18}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 1390
    .line 1391
    .line 1392
    const/4 v3, 0x0

    .line 1393
    const/4 v4, 0x0

    .line 1394
    :goto_15
    if-ge v3, v1, :cond_24

    .line 1395
    .line 1396
    aget v5, v12, v3

    .line 1397
    .line 1398
    shr-int/lit8 v5, v5, 0x18

    .line 1399
    .line 1400
    and-int/lit16 v5, v5, 0xff

    .line 1401
    .line 1402
    const/16 v6, 0x80

    .line 1403
    .line 1404
    if-ge v5, v6, :cond_23

    .line 1405
    .line 1406
    add-int/lit8 v4, v4, 0x1

    .line 1407
    .line 1408
    :cond_23
    add-int/lit8 v3, v3, 0x1

    .line 1409
    .line 1410
    goto :goto_15

    .line 1411
    :cond_24
    int-to-double v3, v4

    .line 1412
    int-to-double v5, v1

    .line 1413
    div-double/2addr v3, v5

    .line 1414
    const-wide v5, 0x3f847ae147ae147bL    # 0.01

    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    cmpl-double v1, v3, v5

    .line 1420
    .line 1421
    if-lez v1, :cond_22

    .line 1422
    .line 1423
    const/4 v1, 0x1

    .line 1424
    goto :goto_16

    .line 1425
    :cond_25
    const/4 v1, 0x0

    .line 1426
    :goto_16
    const-wide v3, -0x6210fe68a836eL

    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1436
    .line 1437
    const-wide v4, -0x62122e68a836eL

    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v4

    .line 1446
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1450
    .line 1451
    .line 1452
    const-wide v4, -0x6212fe68a836eL

    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v4

    .line 1461
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v3

    .line 1468
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1469
    .line 1470
    .line 1471
    invoke-static {v10}, Lyyds/ᛷᛷᛶᲇ;->ᛳᛷᛶᛲ(Ljava/util/ArrayList;)[I

    .line 1472
    .line 1473
    .line 1474
    move-result-object v0

    .line 1475
    new-instance v3, Ljava/io/FileOutputStream;

    .line 1476
    .line 1477
    move-object/from16 v4, p2

    .line 1478
    .line 1479
    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 1480
    .line 1481
    .line 1482
    new-instance v5, Ljava/io/BufferedOutputStream;

    .line 1483
    .line 1484
    const/high16 v6, 0x10000

    .line 1485
    .line 1486
    invoke-direct {v5, v3, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 1487
    .line 1488
    .line 1489
    :try_start_6
    new-instance v6, Lyyds/ᛴᛶᲈᲈ;

    .line 1490
    .line 1491
    invoke-direct {v6, v5}, Lyyds/ᛴᛶᲈᲈ;-><init>(Ljava/io/BufferedOutputStream;)V

    .line 1492
    .line 1493
    .line 1494
    if-ltz v2, :cond_26

    .line 1495
    .line 1496
    iput v2, v6, Lyyds/ᛴᛶᲈᲈ;->ᲇᲈᛵᛷ:I

    .line 1497
    .line 1498
    goto :goto_17

    .line 1499
    :catchall_5
    move-exception v0

    .line 1500
    goto/16 :goto_1f

    .line 1501
    .line 1502
    :catch_0
    move-exception v0

    .line 1503
    const/4 v2, 0x0

    .line 1504
    goto :goto_1b

    .line 1505
    :cond_26
    :goto_17
    const/16 v2, 0xa

    .line 1506
    .line 1507
    iput v2, v6, Lyyds/ᛴᛶᲈᲈ;->ᛲᛳᛶᲁ:I

    .line 1508
    .line 1509
    iput-boolean v1, v6, Lyyds/ᛴᛶᲈᲈ;->ᛷᛲᲈᛱ:Z

    .line 1510
    .line 1511
    if-eqz v1, :cond_27

    .line 1512
    .line 1513
    move/from16 v2, p0

    .line 1514
    .line 1515
    iput v2, v6, Lyyds/ᛴᛶᲈᲈ;->ᛷᲈᲈᲁ:I

    .line 1516
    .line 1517
    :cond_27
    invoke-static {v6, v9}, Lyyds/ᛴᛶᲈᲈ;->ᛵᛸᛸᛷ(Lyyds/ᛴᛶᲈᲈ;Ljava/util/ArrayList;)V

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v6}, Lyyds/ᛴᛶᲈᲈ;->ᲇᲈᛵᛷ()V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1524
    .line 1525
    .line 1526
    move-result v2

    .line 1527
    const/4 v7, 0x0

    .line 1528
    :goto_18
    if-ge v7, v2, :cond_29

    .line 1529
    .line 1530
    if-ltz v7, :cond_28

    .line 1531
    .line 1532
    array-length v8, v0

    .line 1533
    if-ge v7, v8, :cond_28

    .line 1534
    .line 1535
    aget v8, v0, v7

    .line 1536
    .line 1537
    goto :goto_19

    .line 1538
    :cond_28
    const/16 v8, 0x64

    .line 1539
    .line 1540
    :goto_19
    iput v8, v6, Lyyds/ᛴᛶᲈᲈ;->ᛲᛴᛳᛲ:I

    .line 1541
    .line 1542
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v8

    .line 1546
    check-cast v8, Landroid/graphics/Bitmap;

    .line 1547
    .line 1548
    invoke-virtual {v6, v8}, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ(Landroid/graphics/Bitmap;)V

    .line 1549
    .line 1550
    .line 1551
    add-int/lit8 v7, v7, 0x1

    .line 1552
    .line 1553
    goto :goto_18

    .line 1554
    :cond_29
    iget-object v0, v6, Lyyds/ᛴᛶᲈᲈ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 1555
    .line 1556
    iget-boolean v2, v6, Lyyds/ᛴᛶᲈᲈ;->ᲇᲇᲇᛱ:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1557
    .line 1558
    if-nez v2, :cond_2a

    .line 1559
    .line 1560
    goto :goto_1a

    .line 1561
    :cond_2a
    const/16 v2, 0x3b

    .line 1562
    .line 1563
    :try_start_7
    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 1567
    .line 1568
    .line 1569
    const/4 v2, 0x0

    .line 1570
    iput-boolean v2, v6, Lyyds/ᛴᛶᲈᲈ;->ᲇᲇᲇᛱ:Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1571
    .line 1572
    :catch_1
    :goto_1a
    :try_start_8
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 1573
    .line 1574
    .line 1575
    :catch_2
    :try_start_9
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 1576
    .line 1577
    .line 1578
    :catch_3
    const/4 v7, 0x1

    .line 1579
    goto :goto_1c

    .line 1580
    :goto_1b
    :try_start_a
    sget-object v6, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 1581
    .line 1582
    const-wide v7, -0x62143e68a836eL

    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v7

    .line 1591
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    invoke-static {v7, v0}, Lyyds/ᲈᛷᛵᛷ;->ᛶᛸᲀᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1595
    .line 1596
    .line 1597
    :try_start_b
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    .line 1598
    .line 1599
    .line 1600
    :catch_4
    :try_start_c
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    .line 1601
    .line 1602
    .line 1603
    :catch_5
    move v7, v2

    .line 1604
    :goto_1c
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1609
    .line 1610
    .line 1611
    move-result v2

    .line 1612
    if-eqz v2, :cond_2b

    .line 1613
    .line 1614
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v2

    .line 1618
    check-cast v2, Landroid/graphics/Bitmap;

    .line 1619
    .line 1620
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1621
    .line 1622
    .line 1623
    goto :goto_1d

    .line 1624
    :cond_2b
    if-eqz v7, :cond_2d

    .line 1625
    .line 1626
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 1627
    .line 1628
    .line 1629
    move-result v0

    .line 1630
    if-eqz v0, :cond_2d

    .line 1631
    .line 1632
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 1633
    .line 1634
    .line 1635
    move-result-wide v2

    .line 1636
    const-wide/16 v5, 0x0

    .line 1637
    .line 1638
    cmp-long v0, v2, v5

    .line 1639
    .line 1640
    if-nez v0, :cond_2c

    .line 1641
    .line 1642
    goto :goto_1e

    .line 1643
    :cond_2c
    new-instance v15, Lyyds/ᛳᛷᛶᛴ;

    .line 1644
    .line 1645
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v17

    .line 1649
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1650
    .line 1651
    .line 1652
    move-result v18

    .line 1653
    const/16 v22, 0x0

    .line 1654
    .line 1655
    const/16 v23, 0x40

    .line 1656
    .line 1657
    const/16 v16, 0x1

    .line 1658
    .line 1659
    move/from16 v21, v1

    .line 1660
    .line 1661
    move/from16 v19, v24

    .line 1662
    .line 1663
    move/from16 v20, v25

    .line 1664
    .line 1665
    invoke-direct/range {v15 .. v23}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 1666
    .line 1667
    .line 1668
    return-object v15

    .line 1669
    :cond_2d
    :goto_1e
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 1670
    .line 1671
    .line 1672
    new-instance v0, Lyyds/ᛳᛷᛶᛴ;

    .line 1673
    .line 1674
    const-wide v1, -0x6213ae68a836eL

    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v7

    .line 1683
    const/16 v8, 0x3e

    .line 1684
    .line 1685
    const/4 v1, 0x0

    .line 1686
    const/4 v2, 0x0

    .line 1687
    const/4 v3, 0x0

    .line 1688
    const/4 v4, 0x0

    .line 1689
    const/4 v5, 0x0

    .line 1690
    const/4 v6, 0x0

    .line 1691
    invoke-direct/range {v0 .. v8}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 1692
    .line 1693
    .line 1694
    return-object v0

    .line 1695
    :goto_1f
    :try_start_d
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6

    .line 1696
    .line 1697
    .line 1698
    :catch_6
    :try_start_e
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    .line 1699
    .line 1700
    .line 1701
    :catch_7
    throw v0

    .line 1702
    :goto_20
    new-instance v3, Lyyds/ᛳᛷᛶᛴ;

    .line 1703
    .line 1704
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1705
    .line 1706
    const-wide v5, -0x62064e68a836eL

    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v5

    .line 1715
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v10

    .line 1731
    const/16 v11, 0x3e

    .line 1732
    .line 1733
    const/4 v4, 0x0

    .line 1734
    const/4 v5, 0x0

    .line 1735
    const/4 v6, 0x0

    .line 1736
    const/4 v7, 0x0

    .line 1737
    const/4 v8, 0x0

    .line 1738
    const/4 v9, 0x0

    .line 1739
    invoke-direct/range {v3 .. v11}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 1740
    .line 1741
    .line 1742
    return-object v3

    .line 1743
    :cond_2e
    :goto_21
    new-instance v4, Lyyds/ᛳᛷᛶᛴ;

    .line 1744
    .line 1745
    const-wide v0, -0x6204ce68a836eL

    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v11

    .line 1754
    const/16 v12, 0x3e

    .line 1755
    .line 1756
    const/4 v5, 0x0

    .line 1757
    const/4 v6, 0x0

    .line 1758
    const/4 v7, 0x0

    .line 1759
    const/4 v8, 0x0

    .line 1760
    const/4 v9, 0x0

    .line 1761
    const/4 v10, 0x0

    .line 1762
    invoke-direct/range {v4 .. v12}, Lyyds/ᛳᛷᛶᛴ;-><init>(ZLjava/lang/String;IIIZLjava/lang/String;I)V

    .line 1763
    .line 1764
    .line 1765
    return-object v4

    .line 1766
    nop

    .line 1767
    :sswitch_data_0
    .sparse-switch
        0x1eba11 -> :sswitch_4
        0x1eba86 -> :sswitch_3
        0x284b22 -> :sswitch_2
        0x284b4e -> :sswitch_1
        0x284b5a -> :sswitch_0
    .end sparse-switch
.end method
