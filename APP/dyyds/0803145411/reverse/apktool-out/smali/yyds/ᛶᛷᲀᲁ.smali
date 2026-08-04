.class public final Lyyds/ᛶᛷᲀᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:Z

.field public ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:Lyyds/ᛵᛵᲀᛲ;

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:Z

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:[B

.field public ᛷᲈᲈᲁ:Z

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Ljava/io/BufferedOutputStream;)V
    .locals 2

    .line 1
    const-wide v0, -0x6291ae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛶᛷᲀᲁ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᛶᛷᲀᲁ;->ᲇᲇᲇᛱ:Z

    .line 16
    .line 17
    const/16 p1, 0xa

    .line 18
    .line 19
    iput p1, p0, Lyyds/ᛶᛷᲀᲁ;->ᛱᲈᲁ:I

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    iput p1, p0, Lyyds/ᛶᛷᲀᲁ;->ᛲᛳᛶᲁ:I

    .line 23
    .line 24
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᛶᛷᲀᲁ;Ljava/util/List;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, -0x6291ee68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const v2, 0x7fffffff

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    if-lt v1, v3, :cond_1

    .line 35
    .line 36
    move v3, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    div-int/2addr v3, v1

    .line 43
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, -0x1

    .line 53
    add-int/2addr v5, v6

    .line 54
    const/16 v7, 0x2e

    .line 55
    .line 56
    if-lez v3, :cond_36

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    invoke-static {v8, v5, v3}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const/16 v9, 0x80

    .line 64
    .line 65
    const/16 v10, 0xff

    .line 66
    .line 67
    move-object/from16 v11, p1

    .line 68
    .line 69
    if-ltz v5, :cond_7

    .line 70
    .line 71
    move v12, v8

    .line 72
    :goto_1
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    move-object v14, v13

    .line 77
    check-cast v14, Landroid/graphics/Bitmap;

    .line 78
    .line 79
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v17

    .line 83
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v21

    .line 87
    mul-int v13, v17, v21

    .line 88
    .line 89
    new-array v15, v13, [I

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    move/from16 v20, v17

    .line 98
    .line 99
    invoke-virtual/range {v14 .. v21}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 100
    .line 101
    .line 102
    div-int/lit16 v14, v13, 0x2710

    .line 103
    .line 104
    invoke-static {v4, v14}, Ljava/lang/Math;->max(II)I

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    add-int/2addr v13, v6

    .line 109
    if-lez v14, :cond_6

    .line 110
    .line 111
    invoke-static {v8, v13, v14}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-ltz v13, :cond_4

    .line 116
    .line 117
    move v2, v8

    .line 118
    :goto_2
    aget v17, v15, v2

    .line 119
    .line 120
    move/from16 v18, v8

    .line 121
    .line 122
    iget-boolean v8, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 123
    .line 124
    if-eqz v8, :cond_2

    .line 125
    .line 126
    ushr-int/lit8 v8, v17, 0x18

    .line 127
    .line 128
    and-int/2addr v8, v10

    .line 129
    if-lt v8, v9, :cond_3

    .line 130
    .line 131
    :cond_2
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_3
    if-eq v2, v13, :cond_5

    .line 139
    .line 140
    add-int/2addr v2, v14

    .line 141
    move/from16 v8, v18

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    move/from16 v18, v8

    .line 145
    .line 146
    :cond_5
    if-eq v12, v5, :cond_8

    .line 147
    .line 148
    add-int/2addr v12, v3

    .line 149
    move/from16 v8, v18

    .line 150
    .line 151
    const v2, 0x7fffffff

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-wide v1, -0x62942e68a836eL

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v14, v7}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_7
    move/from16 v18, v8

    .line 178
    .line 179
    :cond_8
    iget-boolean v2, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 180
    .line 181
    if-eqz v2, :cond_c

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_c

    .line 188
    .line 189
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_c

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    move-object/from16 v19, v3

    .line 204
    .line 205
    check-cast v19, Landroid/graphics/Bitmap;

    .line 206
    .line 207
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Bitmap;->getWidth()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    new-array v5, v3, [I

    .line 212
    .line 213
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Bitmap;->getHeight()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    move/from16 v8, v18

    .line 218
    .line 219
    :goto_3
    if-ge v8, v7, :cond_9

    .line 220
    .line 221
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Bitmap;->getWidth()I

    .line 222
    .line 223
    .line 224
    move-result v22

    .line 225
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Bitmap;->getWidth()I

    .line 226
    .line 227
    .line 228
    move-result v25

    .line 229
    const/16 v26, 0x1

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    move-object/from16 v20, v5

    .line 236
    .line 237
    move/from16 v24, v8

    .line 238
    .line 239
    invoke-virtual/range {v19 .. v26}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 240
    .line 241
    .line 242
    move/from16 v5, v18

    .line 243
    .line 244
    :goto_4
    if-ge v5, v3, :cond_b

    .line 245
    .line 246
    aget v8, v20, v5

    .line 247
    .line 248
    ushr-int/lit8 v11, v8, 0x18

    .line 249
    .line 250
    and-int/2addr v11, v10

    .line 251
    if-lt v11, v9, :cond_a

    .line 252
    .line 253
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    const/16 v11, 0x2710

    .line 265
    .line 266
    if-ge v8, v11, :cond_c

    .line 267
    .line 268
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_b
    add-int/lit8 v8, v24, 0x1

    .line 272
    .line 273
    move-object/from16 v5, v20

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    const/16 v3, 0x300

    .line 281
    .line 282
    if-eqz v2, :cond_d

    .line 283
    .line 284
    new-array v1, v3, [B

    .line 285
    .line 286
    iput-object v1, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᛵᲇᲀ:[B

    .line 287
    .line 288
    const/4 v1, 0x0

    .line 289
    iput-object v1, v0, Lyyds/ᛶᛷᲀᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛵᛵᲀᛲ;

    .line 290
    .line 291
    iput-boolean v4, v0, Lyyds/ᛶᛷᲀᲁ;->ᛱᛳᲇ:Z

    .line 292
    .line 293
    return-void

    .line 294
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    const/4 v5, 0x3

    .line 299
    mul-int/2addr v2, v5

    .line 300
    new-array v7, v2, [B

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    move/from16 v9, v18

    .line 307
    .line 308
    :goto_5
    const/4 v11, 0x2

    .line 309
    if-ge v9, v8, :cond_e

    .line 310
    .line 311
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v12

    .line 315
    check-cast v12, Ljava/lang/Number;

    .line 316
    .line 317
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    mul-int/lit8 v13, v9, 0x3

    .line 322
    .line 323
    and-int/lit16 v14, v12, 0xff

    .line 324
    .line 325
    int-to-byte v14, v14

    .line 326
    aput-byte v14, v7, v13

    .line 327
    .line 328
    add-int/lit8 v14, v13, 0x1

    .line 329
    .line 330
    shr-int/lit8 v15, v12, 0x8

    .line 331
    .line 332
    and-int/2addr v15, v10

    .line 333
    int-to-byte v15, v15

    .line 334
    aput-byte v15, v7, v14

    .line 335
    .line 336
    add-int/2addr v13, v11

    .line 337
    shr-int/lit8 v11, v12, 0x10

    .line 338
    .line 339
    and-int/2addr v11, v10

    .line 340
    int-to-byte v11, v11

    .line 341
    aput-byte v11, v7, v13

    .line 342
    .line 343
    add-int/lit8 v9, v9, 0x1

    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_e
    new-instance v1, Lyyds/ᛵᛵᲀᛲ;

    .line 347
    .line 348
    iget v8, v0, Lyyds/ᛶᛷᲀᲁ;->ᛱᲈᲁ:I

    .line 349
    .line 350
    invoke-direct {v1, v2, v8, v4, v7}, Lyyds/ᛵᛵᲀᛲ;-><init>(III[B)V

    .line 351
    .line 352
    .line 353
    iget v2, v1, Lyyds/ᛵᛵᲀᛲ;->ᛵᛸᛸᛷ:I

    .line 354
    .line 355
    const/16 v7, 0x5e5

    .line 356
    .line 357
    if-ge v2, v7, :cond_f

    .line 358
    .line 359
    iput v4, v1, Lyyds/ᛵᛵᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 360
    .line 361
    :cond_f
    iget v8, v1, Lyyds/ᛵᛵᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 362
    .line 363
    add-int/lit8 v9, v8, -0x1

    .line 364
    .line 365
    div-int/2addr v9, v5

    .line 366
    add-int/lit8 v9, v9, 0x1e

    .line 367
    .line 368
    iput v9, v1, Lyyds/ᛵᛵᲀᛲ;->ᲇᲈᛵᛷ:I

    .line 369
    .line 370
    mul-int/2addr v8, v5

    .line 371
    div-int v8, v2, v8

    .line 372
    .line 373
    div-int/lit8 v9, v8, 0x64

    .line 374
    .line 375
    move/from16 v12, v18

    .line 376
    .line 377
    :goto_6
    const/16 v13, 0x100

    .line 378
    .line 379
    iget-object v14, v1, Lyyds/ᛵᛵᲀᛲ;->ᛲᛳᛶᲁ:[I

    .line 380
    .line 381
    const/16 v15, 0x400

    .line 382
    .line 383
    move/from16 p1, v11

    .line 384
    .line 385
    const/16 v11, 0x20

    .line 386
    .line 387
    if-ge v12, v11, :cond_10

    .line 388
    .line 389
    mul-int v11, v12, v12

    .line 390
    .line 391
    rsub-int v11, v11, 0x400

    .line 392
    .line 393
    mul-int/2addr v11, v13

    .line 394
    div-int/2addr v11, v15

    .line 395
    mul-int/2addr v11, v15

    .line 396
    aput v11, v14, v12

    .line 397
    .line 398
    add-int/lit8 v12, v12, 0x1

    .line 399
    .line 400
    move/from16 v11, p1

    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_10
    if-ge v2, v7, :cond_11

    .line 404
    .line 405
    move v7, v5

    .line 406
    goto :goto_7

    .line 407
    :cond_11
    rem-int/lit16 v12, v2, 0x1f3

    .line 408
    .line 409
    if-eqz v12, :cond_12

    .line 410
    .line 411
    const/16 v7, 0x5d9

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_12
    rem-int/lit16 v12, v2, 0x1eb

    .line 415
    .line 416
    if-eqz v12, :cond_13

    .line 417
    .line 418
    const/16 v7, 0x5c1

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_13
    rem-int/lit16 v12, v2, 0x1e7

    .line 422
    .line 423
    if-eqz v12, :cond_14

    .line 424
    .line 425
    const/16 v7, 0x5b5

    .line 426
    .line 427
    :cond_14
    :goto_7
    const/16 v12, 0x800

    .line 428
    .line 429
    move/from16 v17, v5

    .line 430
    .line 431
    move/from16 v20, v15

    .line 432
    .line 433
    move/from16 v5, v18

    .line 434
    .line 435
    move/from16 v19, v5

    .line 436
    .line 437
    :goto_8
    iget-object v3, v1, Lyyds/ᛵᛵᲀᛲ;->ᛲᛴᛳᛲ:[[I

    .line 438
    .line 439
    move/from16 v22, v4

    .line 440
    .line 441
    if-ge v5, v8, :cond_25

    .line 442
    .line 443
    const/16 v23, 0x4

    .line 444
    .line 445
    iget-object v4, v1, Lyyds/ᛵᛵᲀᛲ;->ᛲᲈᲁ:[B

    .line 446
    .line 447
    aget-byte v6, v4, v19

    .line 448
    .line 449
    and-int/2addr v6, v10

    .line 450
    shl-int/lit8 v6, v6, 0x4

    .line 451
    .line 452
    add-int/lit8 v25, v19, 0x1

    .line 453
    .line 454
    aget-byte v15, v4, v25

    .line 455
    .line 456
    and-int/2addr v15, v10

    .line 457
    shl-int/lit8 v15, v15, 0x4

    .line 458
    .line 459
    add-int/lit8 v25, v19, 0x2

    .line 460
    .line 461
    aget-byte v4, v4, v25

    .line 462
    .line 463
    and-int/2addr v4, v10

    .line 464
    shl-int/lit8 v4, v4, 0x4

    .line 465
    .line 466
    move-object/from16 v30, v3

    .line 467
    .line 468
    move/from16 v10, v18

    .line 469
    .line 470
    const/16 v23, -0x1

    .line 471
    .line 472
    const/16 v27, -0x1

    .line 473
    .line 474
    const v28, 0x7fffffff

    .line 475
    .line 476
    .line 477
    const v29, 0x7fffffff

    .line 478
    .line 479
    .line 480
    :goto_9
    iget-object v3, v1, Lyyds/ᛵᛵᲀᛲ;->ᛱᲈᲁ:[I

    .line 481
    .line 482
    move-object/from16 v31, v3

    .line 483
    .line 484
    iget-object v3, v1, Lyyds/ᛵᛵᲀᛲ;->ᛶᛷᛲᲁ:[I

    .line 485
    .line 486
    if-ge v10, v13, :cond_1a

    .line 487
    .line 488
    aget-object v32, v30, v10

    .line 489
    .line 490
    aget v33, v32, v18

    .line 491
    .line 492
    sub-int v13, v33, v6

    .line 493
    .line 494
    if-gez v13, :cond_15

    .line 495
    .line 496
    neg-int v13, v13

    .line 497
    :cond_15
    aget v33, v32, v22

    .line 498
    .line 499
    move-object/from16 v34, v3

    .line 500
    .line 501
    sub-int v3, v33, v15

    .line 502
    .line 503
    if-gez v3, :cond_16

    .line 504
    .line 505
    neg-int v3, v3

    .line 506
    :cond_16
    add-int/2addr v13, v3

    .line 507
    aget v3, v32, p1

    .line 508
    .line 509
    sub-int/2addr v3, v4

    .line 510
    if-gez v3, :cond_17

    .line 511
    .line 512
    neg-int v3, v3

    .line 513
    :cond_17
    add-int/2addr v13, v3

    .line 514
    move/from16 v3, v28

    .line 515
    .line 516
    if-ge v13, v3, :cond_18

    .line 517
    .line 518
    move/from16 v23, v10

    .line 519
    .line 520
    move/from16 v28, v13

    .line 521
    .line 522
    goto :goto_a

    .line 523
    :cond_18
    move/from16 v28, v3

    .line 524
    .line 525
    :goto_a
    aget v3, v34, v10

    .line 526
    .line 527
    shr-int/lit8 v3, v3, 0xc

    .line 528
    .line 529
    sub-int/2addr v13, v3

    .line 530
    move/from16 v3, v29

    .line 531
    .line 532
    if-ge v13, v3, :cond_19

    .line 533
    .line 534
    move/from16 v27, v10

    .line 535
    .line 536
    move/from16 v29, v13

    .line 537
    .line 538
    goto :goto_b

    .line 539
    :cond_19
    move/from16 v29, v3

    .line 540
    .line 541
    :goto_b
    aget v3, v31, v10

    .line 542
    .line 543
    shr-int/lit8 v13, v3, 0xa

    .line 544
    .line 545
    sub-int/2addr v3, v13

    .line 546
    aput v3, v31, v10

    .line 547
    .line 548
    aget v3, v34, v10

    .line 549
    .line 550
    shl-int/lit8 v13, v13, 0xa

    .line 551
    .line 552
    add-int/2addr v3, v13

    .line 553
    aput v3, v34, v10

    .line 554
    .line 555
    add-int/lit8 v10, v10, 0x1

    .line 556
    .line 557
    const/16 v13, 0x100

    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_1a
    move-object/from16 v34, v3

    .line 561
    .line 562
    aget v3, v31, v23

    .line 563
    .line 564
    add-int/lit8 v3, v3, 0x40

    .line 565
    .line 566
    aput v3, v31, v23

    .line 567
    .line 568
    aget v3, v34, v23

    .line 569
    .line 570
    const/high16 v10, 0x10000

    .line 571
    .line 572
    sub-int/2addr v3, v10

    .line 573
    aput v3, v34, v23

    .line 574
    .line 575
    aget-object v3, v30, v27

    .line 576
    .line 577
    aget v10, v3, v18

    .line 578
    .line 579
    sub-int v13, v10, v6

    .line 580
    .line 581
    mul-int v13, v13, v20

    .line 582
    .line 583
    move-object/from16 v23, v3

    .line 584
    .line 585
    const/16 v3, 0x400

    .line 586
    .line 587
    div-int/2addr v13, v3

    .line 588
    sub-int/2addr v10, v13

    .line 589
    aput v10, v23, v18

    .line 590
    .line 591
    aget v10, v23, v22

    .line 592
    .line 593
    sub-int v13, v10, v15

    .line 594
    .line 595
    mul-int v13, v13, v20

    .line 596
    .line 597
    div-int/2addr v13, v3

    .line 598
    sub-int/2addr v10, v13

    .line 599
    aput v10, v23, v22

    .line 600
    .line 601
    aget v10, v23, p1

    .line 602
    .line 603
    sub-int v13, v10, v4

    .line 604
    .line 605
    mul-int v13, v13, v20

    .line 606
    .line 607
    div-int/2addr v13, v3

    .line 608
    sub-int/2addr v10, v13

    .line 609
    aput v10, v23, p1

    .line 610
    .line 611
    if-eqz v11, :cond_20

    .line 612
    .line 613
    sub-int v10, v27, v11

    .line 614
    .line 615
    const/4 v13, -0x1

    .line 616
    if-ge v10, v13, :cond_1b

    .line 617
    .line 618
    move v10, v13

    .line 619
    :cond_1b
    add-int v3, v27, v11

    .line 620
    .line 621
    const/16 v13, 0x100

    .line 622
    .line 623
    if-le v3, v13, :cond_1c

    .line 624
    .line 625
    const/16 v3, 0x100

    .line 626
    .line 627
    :cond_1c
    add-int/lit8 v13, v27, 0x1

    .line 628
    .line 629
    add-int/lit8 v27, v27, -0x1

    .line 630
    .line 631
    move/from16 v23, v27

    .line 632
    .line 633
    move/from16 v27, v4

    .line 634
    .line 635
    move/from16 v4, v23

    .line 636
    .line 637
    move/from16 v23, v22

    .line 638
    .line 639
    :goto_c
    if-lt v13, v3, :cond_1d

    .line 640
    .line 641
    if-le v4, v10, :cond_20

    .line 642
    .line 643
    :cond_1d
    add-int/lit8 v28, v23, 0x1

    .line 644
    .line 645
    aget v23, v14, v23

    .line 646
    .line 647
    const/high16 v29, 0x40000

    .line 648
    .line 649
    if-ge v13, v3, :cond_1e

    .line 650
    .line 651
    add-int/lit8 v31, v13, 0x1

    .line 652
    .line 653
    aget-object v13, v30, v13

    .line 654
    .line 655
    :try_start_0
    aget v32, v13, v18

    .line 656
    .line 657
    sub-int v33, v32, v6

    .line 658
    .line 659
    mul-int v33, v33, v23

    .line 660
    .line 661
    div-int v33, v33, v29

    .line 662
    .line 663
    sub-int v32, v32, v33

    .line 664
    .line 665
    aput v32, v13, v18

    .line 666
    .line 667
    aget v32, v13, v22

    .line 668
    .line 669
    sub-int v33, v32, v15

    .line 670
    .line 671
    mul-int v33, v33, v23

    .line 672
    .line 673
    div-int v33, v33, v29

    .line 674
    .line 675
    sub-int v32, v32, v33

    .line 676
    .line 677
    aput v32, v13, v22

    .line 678
    .line 679
    aget v32, v13, p1

    .line 680
    .line 681
    sub-int v33, v32, v27

    .line 682
    .line 683
    mul-int v33, v33, v23

    .line 684
    .line 685
    div-int v33, v33, v29

    .line 686
    .line 687
    sub-int v32, v32, v33

    .line 688
    .line 689
    aput v32, v13, p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 690
    .line 691
    :catch_0
    move/from16 v13, v31

    .line 692
    .line 693
    :cond_1e
    if-le v4, v10, :cond_1f

    .line 694
    .line 695
    add-int/lit8 v31, v4, -0x1

    .line 696
    .line 697
    aget-object v4, v30, v4

    .line 698
    .line 699
    :try_start_1
    aget v32, v4, v18

    .line 700
    .line 701
    sub-int v33, v32, v6

    .line 702
    .line 703
    mul-int v33, v33, v23

    .line 704
    .line 705
    div-int v33, v33, v29

    .line 706
    .line 707
    sub-int v32, v32, v33

    .line 708
    .line 709
    aput v32, v4, v18

    .line 710
    .line 711
    aget v32, v4, v22

    .line 712
    .line 713
    sub-int v33, v32, v15

    .line 714
    .line 715
    mul-int v33, v33, v23

    .line 716
    .line 717
    div-int v33, v33, v29

    .line 718
    .line 719
    sub-int v32, v32, v33

    .line 720
    .line 721
    aput v32, v4, v22

    .line 722
    .line 723
    aget v32, v4, p1

    .line 724
    .line 725
    sub-int v33, v32, v27

    .line 726
    .line 727
    mul-int v33, v33, v23

    .line 728
    .line 729
    div-int v33, v33, v29

    .line 730
    .line 731
    sub-int v32, v32, v33

    .line 732
    .line 733
    aput v32, v4, p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 734
    .line 735
    :catch_1
    move/from16 v23, v28

    .line 736
    .line 737
    move/from16 v4, v31

    .line 738
    .line 739
    goto :goto_c

    .line 740
    :cond_1f
    move/from16 v23, v28

    .line 741
    .line 742
    goto :goto_c

    .line 743
    :cond_20
    add-int v3, v19, v7

    .line 744
    .line 745
    if-lt v3, v2, :cond_21

    .line 746
    .line 747
    sub-int/2addr v3, v2

    .line 748
    :cond_21
    move/from16 v19, v3

    .line 749
    .line 750
    add-int/lit8 v5, v5, 0x1

    .line 751
    .line 752
    if-nez v9, :cond_22

    .line 753
    .line 754
    move/from16 v9, v22

    .line 755
    .line 756
    :cond_22
    rem-int v3, v5, v9

    .line 757
    .line 758
    if-nez v3, :cond_24

    .line 759
    .line 760
    iget v3, v1, Lyyds/ᛵᛵᲀᛲ;->ᲇᲈᛵᛷ:I

    .line 761
    .line 762
    div-int v3, v20, v3

    .line 763
    .line 764
    sub-int v20, v20, v3

    .line 765
    .line 766
    div-int/lit8 v3, v12, 0x1e

    .line 767
    .line 768
    sub-int/2addr v12, v3

    .line 769
    shr-int/lit8 v3, v12, 0x6

    .line 770
    .line 771
    move/from16 v4, v22

    .line 772
    .line 773
    if-gt v3, v4, :cond_23

    .line 774
    .line 775
    move/from16 v11, v18

    .line 776
    .line 777
    goto :goto_d

    .line 778
    :cond_23
    move v11, v3

    .line 779
    :goto_d
    mul-int v3, v11, v11

    .line 780
    .line 781
    move/from16 v4, v18

    .line 782
    .line 783
    :goto_e
    if-ge v4, v11, :cond_24

    .line 784
    .line 785
    mul-int v6, v4, v4

    .line 786
    .line 787
    sub-int v6, v3, v6

    .line 788
    .line 789
    const/16 v13, 0x100

    .line 790
    .line 791
    mul-int/2addr v6, v13

    .line 792
    div-int/2addr v6, v3

    .line 793
    mul-int v6, v6, v20

    .line 794
    .line 795
    aput v6, v14, v4

    .line 796
    .line 797
    add-int/lit8 v4, v4, 0x1

    .line 798
    .line 799
    goto :goto_e

    .line 800
    :cond_24
    const/4 v4, 0x1

    .line 801
    const/4 v6, -0x1

    .line 802
    const/16 v10, 0xff

    .line 803
    .line 804
    const/16 v13, 0x100

    .line 805
    .line 806
    const/16 v15, 0x400

    .line 807
    .line 808
    goto/16 :goto_8

    .line 809
    .line 810
    :cond_25
    move-object/from16 v30, v3

    .line 811
    .line 812
    const/16 v23, 0x4

    .line 813
    .line 814
    move/from16 v2, v18

    .line 815
    .line 816
    :goto_f
    if-ge v2, v13, :cond_26

    .line 817
    .line 818
    aget-object v3, v30, v2

    .line 819
    .line 820
    aget v4, v3, v18

    .line 821
    .line 822
    shr-int/lit8 v4, v4, 0x4

    .line 823
    .line 824
    aput v4, v3, v18

    .line 825
    .line 826
    const/16 v22, 0x1

    .line 827
    .line 828
    aget v4, v3, v22

    .line 829
    .line 830
    shr-int/lit8 v4, v4, 0x4

    .line 831
    .line 832
    aput v4, v3, v22

    .line 833
    .line 834
    aget v4, v3, p1

    .line 835
    .line 836
    shr-int/lit8 v4, v4, 0x4

    .line 837
    .line 838
    aput v4, v3, p1

    .line 839
    .line 840
    aput v2, v3, v17

    .line 841
    .line 842
    add-int/lit8 v2, v2, 0x1

    .line 843
    .line 844
    const/16 v13, 0x100

    .line 845
    .line 846
    goto :goto_f

    .line 847
    :cond_26
    move/from16 v2, v18

    .line 848
    .line 849
    move v3, v2

    .line 850
    move v4, v3

    .line 851
    :goto_10
    iget-object v5, v1, Lyyds/ᛵᛵᲀᛲ;->ᲇᲇᲇᛱ:[I

    .line 852
    .line 853
    const/16 v13, 0x100

    .line 854
    .line 855
    if-ge v2, v13, :cond_2d

    .line 856
    .line 857
    aget-object v6, v30, v2

    .line 858
    .line 859
    const/16 v22, 0x1

    .line 860
    .line 861
    aget v7, v6, v22

    .line 862
    .line 863
    add-int/lit8 v8, v2, 0x1

    .line 864
    .line 865
    move v10, v2

    .line 866
    move v9, v8

    .line 867
    :goto_11
    if-ge v9, v13, :cond_28

    .line 868
    .line 869
    aget-object v11, v30, v9

    .line 870
    .line 871
    aget v11, v11, v22

    .line 872
    .line 873
    if-ge v11, v7, :cond_27

    .line 874
    .line 875
    move v10, v9

    .line 876
    move v7, v11

    .line 877
    :cond_27
    add-int/lit8 v9, v9, 0x1

    .line 878
    .line 879
    const/16 v13, 0x100

    .line 880
    .line 881
    const/16 v22, 0x1

    .line 882
    .line 883
    goto :goto_11

    .line 884
    :cond_28
    aget-object v9, v30, v10

    .line 885
    .line 886
    if-eq v2, v10, :cond_29

    .line 887
    .line 888
    move/from16 v10, v18

    .line 889
    .line 890
    move/from16 v11, v23

    .line 891
    .line 892
    :goto_12
    if-ge v10, v11, :cond_2a

    .line 893
    .line 894
    aget v12, v9, v10

    .line 895
    .line 896
    aget v13, v6, v10

    .line 897
    .line 898
    aput v13, v9, v10

    .line 899
    .line 900
    aput v12, v6, v10

    .line 901
    .line 902
    add-int/lit8 v10, v10, 0x1

    .line 903
    .line 904
    goto :goto_12

    .line 905
    :cond_29
    move/from16 v11, v23

    .line 906
    .line 907
    :cond_2a
    if-eq v7, v3, :cond_2c

    .line 908
    .line 909
    add-int/2addr v4, v2

    .line 910
    const/16 v22, 0x1

    .line 911
    .line 912
    shr-int/lit8 v4, v4, 0x1

    .line 913
    .line 914
    aput v4, v5, v3

    .line 915
    .line 916
    :goto_13
    add-int/lit8 v3, v3, 0x1

    .line 917
    .line 918
    if-ge v3, v7, :cond_2b

    .line 919
    .line 920
    aput v2, v5, v3

    .line 921
    .line 922
    goto :goto_13

    .line 923
    :cond_2b
    move v4, v2

    .line 924
    move v3, v7

    .line 925
    :cond_2c
    move v2, v8

    .line 926
    move/from16 v23, v11

    .line 927
    .line 928
    goto :goto_10

    .line 929
    :cond_2d
    const/16 v2, 0xff

    .line 930
    .line 931
    add-int/2addr v4, v2

    .line 932
    const/16 v22, 0x1

    .line 933
    .line 934
    shr-int/lit8 v4, v4, 0x1

    .line 935
    .line 936
    aput v4, v5, v3

    .line 937
    .line 938
    add-int/lit8 v3, v3, 0x1

    .line 939
    .line 940
    const/16 v13, 0x100

    .line 941
    .line 942
    :goto_14
    if-ge v3, v13, :cond_2e

    .line 943
    .line 944
    aput v2, v5, v3

    .line 945
    .line 946
    add-int/lit8 v3, v3, 0x1

    .line 947
    .line 948
    const/16 v2, 0xff

    .line 949
    .line 950
    goto :goto_14

    .line 951
    :cond_2e
    const/16 v2, 0x300

    .line 952
    .line 953
    new-array v2, v2, [B

    .line 954
    .line 955
    new-array v3, v13, [I

    .line 956
    .line 957
    move/from16 v4, v18

    .line 958
    .line 959
    :goto_15
    if-ge v4, v13, :cond_2f

    .line 960
    .line 961
    aget-object v5, v30, v4

    .line 962
    .line 963
    aget v5, v5, v17

    .line 964
    .line 965
    aput v4, v3, v5

    .line 966
    .line 967
    add-int/lit8 v4, v4, 0x1

    .line 968
    .line 969
    goto :goto_15

    .line 970
    :cond_2f
    move/from16 v4, v18

    .line 971
    .line 972
    move v5, v4

    .line 973
    :goto_16
    if-ge v4, v13, :cond_30

    .line 974
    .line 975
    aget v6, v3, v4

    .line 976
    .line 977
    add-int/lit8 v7, v5, 0x1

    .line 978
    .line 979
    aget-object v6, v30, v6

    .line 980
    .line 981
    aget v8, v6, v18

    .line 982
    .line 983
    int-to-byte v8, v8

    .line 984
    aput-byte v8, v2, v5

    .line 985
    .line 986
    add-int/lit8 v8, v5, 0x2

    .line 987
    .line 988
    const/16 v22, 0x1

    .line 989
    .line 990
    aget v9, v6, v22

    .line 991
    .line 992
    int-to-byte v9, v9

    .line 993
    aput-byte v9, v2, v7

    .line 994
    .line 995
    add-int/lit8 v5, v5, 0x3

    .line 996
    .line 997
    aget v6, v6, p1

    .line 998
    .line 999
    int-to-byte v6, v6

    .line 1000
    aput-byte v6, v2, v8

    .line 1001
    .line 1002
    add-int/lit8 v4, v4, 0x1

    .line 1003
    .line 1004
    const/16 v13, 0x100

    .line 1005
    .line 1006
    goto :goto_16

    .line 1007
    :cond_30
    const/16 v3, 0x2ff

    .line 1008
    .line 1009
    move/from16 v4, v17

    .line 1010
    .line 1011
    move/from16 v5, v18

    .line 1012
    .line 1013
    invoke-static {v5, v3, v4}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    if-ltz v4, :cond_31

    .line 1018
    .line 1019
    const/4 v5, 0x0

    .line 1020
    :goto_17
    aget-byte v6, v2, v5

    .line 1021
    .line 1022
    add-int/lit8 v7, v5, 0x2

    .line 1023
    .line 1024
    aget-byte v8, v2, v7

    .line 1025
    .line 1026
    aput-byte v8, v2, v5

    .line 1027
    .line 1028
    aput-byte v6, v2, v7

    .line 1029
    .line 1030
    if-eq v5, v4, :cond_31

    .line 1031
    .line 1032
    add-int/lit8 v5, v5, 0x3

    .line 1033
    .line 1034
    goto :goto_17

    .line 1035
    :cond_31
    iget-boolean v4, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 1036
    .line 1037
    if-eqz v4, :cond_35

    .line 1038
    .line 1039
    const/16 v4, 0x2fd

    .line 1040
    .line 1041
    aget-byte v5, v2, v4

    .line 1042
    .line 1043
    const/16 v6, 0xff

    .line 1044
    .line 1045
    and-int/2addr v5, v6

    .line 1046
    const/16 v7, 0x2fe

    .line 1047
    .line 1048
    aget-byte v8, v2, v7

    .line 1049
    .line 1050
    and-int/2addr v8, v6

    .line 1051
    aget-byte v9, v2, v3

    .line 1052
    .line 1053
    and-int/2addr v9, v6

    .line 1054
    const v10, 0x7fffffff

    .line 1055
    .line 1056
    .line 1057
    const/4 v11, 0x0

    .line 1058
    const/4 v12, 0x0

    .line 1059
    const/16 v13, 0x100

    .line 1060
    .line 1061
    :goto_18
    if-ge v11, v13, :cond_34

    .line 1062
    .line 1063
    if-eq v11, v6, :cond_32

    .line 1064
    .line 1065
    mul-int/lit8 v14, v11, 0x3

    .line 1066
    .line 1067
    aget-byte v15, v2, v14

    .line 1068
    .line 1069
    and-int/2addr v15, v6

    .line 1070
    sub-int/2addr v15, v5

    .line 1071
    add-int/lit8 v16, v14, 0x1

    .line 1072
    .line 1073
    move/from16 v17, v3

    .line 1074
    .line 1075
    aget-byte v3, v2, v16

    .line 1076
    .line 1077
    and-int/2addr v3, v6

    .line 1078
    sub-int/2addr v3, v8

    .line 1079
    add-int/lit8 v14, v14, 0x2

    .line 1080
    .line 1081
    aget-byte v14, v2, v14

    .line 1082
    .line 1083
    and-int/2addr v14, v6

    .line 1084
    sub-int/2addr v14, v9

    .line 1085
    mul-int/2addr v15, v15

    .line 1086
    mul-int/2addr v3, v3

    .line 1087
    add-int/2addr v3, v15

    .line 1088
    mul-int/2addr v14, v14

    .line 1089
    add-int/2addr v14, v3

    .line 1090
    if-ge v14, v10, :cond_33

    .line 1091
    .line 1092
    move v12, v11

    .line 1093
    move v10, v14

    .line 1094
    goto :goto_19

    .line 1095
    :cond_32
    move/from16 v17, v3

    .line 1096
    .line 1097
    :cond_33
    :goto_19
    add-int/lit8 v11, v11, 0x1

    .line 1098
    .line 1099
    move/from16 v3, v17

    .line 1100
    .line 1101
    goto :goto_18

    .line 1102
    :cond_34
    move/from16 v17, v3

    .line 1103
    .line 1104
    iput v12, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᛲᲈᛱ:I

    .line 1105
    .line 1106
    const/16 v18, 0x0

    .line 1107
    .line 1108
    aput-byte v18, v2, v4

    .line 1109
    .line 1110
    aput-byte v18, v2, v7

    .line 1111
    .line 1112
    aput-byte v18, v2, v17

    .line 1113
    .line 1114
    :cond_35
    iput-object v2, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᛵᲇᲀ:[B

    .line 1115
    .line 1116
    iput-object v1, v0, Lyyds/ᛶᛷᲀᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛵᛵᲀᛲ;

    .line 1117
    .line 1118
    const/4 v4, 0x1

    .line 1119
    iput-boolean v4, v0, Lyyds/ᛶᛷᲀᲁ;->ᛱᛳᲇ:Z

    .line 1120
    .line 1121
    return-void

    .line 1122
    :cond_36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1123
    .line 1124
    const-wide v1, -0x62925e68a836eL

    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v0, v3, v7}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(I)V
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    shr-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ᛲᲈᲁ(Landroid/graphics/Bitmap;)Z
    .locals 8

    .line 1
    const-wide v0, -0x62966e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_c

    .line 13
    .line 14
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛶᛷᛲᲁ:Z

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ge v0, v2, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x140

    .line 30
    .line 31
    :cond_0
    iput v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ:I

    .line 32
    .line 33
    if-ge v3, v2, :cond_1

    .line 34
    .line 35
    const/16 v3, 0xf0

    .line 36
    .line 37
    :cond_1
    iput v3, p0, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 38
    .line 39
    iput-boolean v2, p0, Lyyds/ᛶᛷᲀᲁ;->ᛶᛷᛲᲁ:Z

    .line 40
    .line 41
    :cond_2
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛱᛳᲇ:Z

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, v0}, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ(Lyyds/ᛶᛷᲀᲁ;Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-virtual {p0, p1}, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;)[B

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᲇᲇᲇᛱ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    const/16 v3, 0x21

    .line 59
    .line 60
    const/16 v4, 0xff

    .line 61
    .line 62
    iget-object v5, p0, Lyyds/ᛶᛷᲀᲁ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 63
    .line 64
    if-eqz v0, :cond_7

    .line 65
    .line 66
    :try_start_1
    iget v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ:I

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 69
    .line 70
    .line 71
    iget v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 74
    .line 75
    .line 76
    const/16 v0, 0xf7

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 79
    .line 80
    .line 81
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    move v0, v4

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    move v0, v1

    .line 88
    :goto_0
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write(I)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛷᛵᲇᲀ:[B

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    array-length v6, v0

    .line 100
    invoke-virtual {v5, v0, v1, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 101
    .line 102
    .line 103
    array-length v0, v0

    .line 104
    rsub-int v0, v0, 0x300

    .line 105
    .line 106
    move v6, v1

    .line 107
    :goto_1
    if-ge v6, v0, :cond_6

    .line 108
    .line 109
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write(I)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v6, v6, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    :goto_2
    invoke-virtual {v5, v3}, Ljava/io/OutputStream;->write(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v4}, Ljava/io/OutputStream;->write(I)V

    .line 119
    .line 120
    .line 121
    const/16 v0, 0xb

    .line 122
    .line 123
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 124
    .line 125
    .line 126
    const-wide v6, -0x62996e68a836eL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sget-object v6, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 136
    .line 137
    invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-wide v6, -0x629a2e68a836eL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write([B)V

    .line 150
    .line 151
    .line 152
    const/4 v0, 0x3

    .line 153
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v1}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write(I)V

    .line 163
    .line 164
    .line 165
    :cond_7
    invoke-virtual {v5, v3}, Ljava/io/OutputStream;->write(I)V

    .line 166
    .line 167
    .line 168
    const/16 v0, 0xf9

    .line 169
    .line 170
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 171
    .line 172
    .line 173
    const/4 v0, 0x4

    .line 174
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 175
    .line 176
    .line 177
    iget v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛲᛳᛶᲁ:I

    .line 178
    .line 179
    const/4 v3, 0x2

    .line 180
    if-ltz v0, :cond_8

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_8
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 184
    .line 185
    if-eqz v0, :cond_9

    .line 186
    .line 187
    move v0, v3

    .line 188
    goto :goto_3

    .line 189
    :cond_9
    move v0, v1

    .line 190
    :goto_3
    iget-boolean v6, p0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 191
    .line 192
    shl-int/2addr v0, v3

    .line 193
    or-int/2addr v0, v6

    .line 194
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 195
    .line 196
    .line 197
    iget v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᲇᲈᛵᛷ:I

    .line 198
    .line 199
    div-int/lit8 v0, v0, 0xa

    .line 200
    .line 201
    if-ge v0, v3, :cond_a

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_a
    move v3, v0

    .line 205
    :goto_4
    invoke-virtual {p0, v3}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 206
    .line 207
    .line 208
    iget-boolean v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 209
    .line 210
    if-eqz v0, :cond_b

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_b
    move v4, v1

    .line 214
    :goto_5
    invoke-virtual {v5, v4}, Ljava/io/OutputStream;->write(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write(I)V

    .line 218
    .line 219
    .line 220
    const/16 v0, 0x2c

    .line 221
    .line 222
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v1}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v1}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 229
    .line 230
    .line 231
    iget v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ:I

    .line 232
    .line 233
    invoke-virtual {p0, v0}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 234
    .line 235
    .line 236
    iget v0, p0, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 237
    .line 238
    invoke-virtual {p0, v0}, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, p1}, Lyyds/ᛶᛷᲀᲁ;->ᲇᲈᛵᛷ([B)V

    .line 245
    .line 246
    .line 247
    iput-boolean v1, p0, Lyyds/ᛶᛷᲀᲁ;->ᲇᲇᲇᛱ:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 248
    .line 249
    return v2

    .line 250
    :catch_0
    return v1

    .line 251
    :cond_c
    const-wide p0, -0x6296de68a836eL

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    return v1
.end method

.method public final ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;)[B
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget v3, v0, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    if-ne v2, v3, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget v3, v0, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v6, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    iget v2, v0, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    iget v3, v0, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 27
    .line 28
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 29
    .line 30
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Landroid/graphics/Canvas;

    .line 35
    .line 36
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-virtual {v3, v1, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 46
    .line 47
    .line 48
    move-object v6, v2

    .line 49
    :goto_1
    iget v9, v0, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ:I

    .line 50
    .line 51
    iget v13, v0, Lyyds/ᛶᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 52
    .line 53
    mul-int v2, v9, v13

    .line 54
    .line 55
    new-array v7, v2, [I

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v8, 0x0

    .line 60
    move v12, v9

    .line 61
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 62
    .line 63
    .line 64
    if-eq v6, v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 67
    .line 68
    .line 69
    :cond_2
    new-array v1, v2, [B

    .line 70
    .line 71
    iget-object v3, v0, Lyyds/ᛶᛷᲀᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛵᛵᲀᛲ;

    .line 72
    .line 73
    const/4 v4, -0x1

    .line 74
    const/4 v5, 0x0

    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    iget-boolean v0, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 78
    .line 79
    if-eqz v0, :cond_12

    .line 80
    .line 81
    invoke-static {v1, v5, v2, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    move v6, v5

    .line 86
    :goto_2
    if-ge v6, v2, :cond_12

    .line 87
    .line 88
    aget v8, v7, v6

    .line 89
    .line 90
    ushr-int/lit8 v9, v8, 0x18

    .line 91
    .line 92
    const/16 v10, 0xff

    .line 93
    .line 94
    and-int/2addr v9, v10

    .line 95
    iget-boolean v11, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 96
    .line 97
    if-eqz v11, :cond_4

    .line 98
    .line 99
    const/16 v11, 0x80

    .line 100
    .line 101
    if-ge v9, v11, :cond_4

    .line 102
    .line 103
    aput-byte v4, v1, v6

    .line 104
    .line 105
    move/from16 v16, v5

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    and-int/lit16 v9, v8, 0xff

    .line 109
    .line 110
    shr-int/lit8 v11, v8, 0x8

    .line 111
    .line 112
    and-int/2addr v11, v10

    .line 113
    shr-int/lit8 v8, v8, 0x10

    .line 114
    .line 115
    and-int/2addr v8, v10

    .line 116
    iget-object v12, v3, Lyyds/ᛵᛵᲀᛲ;->ᛲᛴᛳᛲ:[[I

    .line 117
    .line 118
    iget-object v13, v3, Lyyds/ᛵᛵᲀᛲ;->ᲇᲇᲇᛱ:[I

    .line 119
    .line 120
    aget v13, v13, v11

    .line 121
    .line 122
    add-int/lit8 v14, v13, -0x1

    .line 123
    .line 124
    const/16 v15, 0x3e8

    .line 125
    .line 126
    move/from16 v16, v5

    .line 127
    .line 128
    :goto_3
    const/16 v5, 0x100

    .line 129
    .line 130
    if-lt v13, v5, :cond_7

    .line 131
    .line 132
    if-ltz v14, :cond_5

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_5
    iget-boolean v5, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 136
    .line 137
    if-eqz v5, :cond_6

    .line 138
    .line 139
    if-ne v4, v10, :cond_6

    .line 140
    .line 141
    iget v4, v0, Lyyds/ᛶᛷᲀᲁ;->ᛷᛲᲈᛱ:I

    .line 142
    .line 143
    :cond_6
    int-to-byte v4, v4

    .line 144
    aput-byte v4, v1, v6

    .line 145
    .line 146
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 147
    .line 148
    move/from16 v5, v16

    .line 149
    .line 150
    const/4 v4, -0x1

    .line 151
    goto :goto_2

    .line 152
    :cond_7
    :goto_5
    const/16 v17, 0x1

    .line 153
    .line 154
    const/16 v18, 0x3

    .line 155
    .line 156
    const/16 v19, 0x2

    .line 157
    .line 158
    if-ge v13, v5, :cond_c

    .line 159
    .line 160
    aget-object v20, v12, v13

    .line 161
    .line 162
    aget v21, v20, v17

    .line 163
    .line 164
    sub-int v5, v21, v11

    .line 165
    .line 166
    if-lt v5, v15, :cond_8

    .line 167
    .line 168
    const/16 v13, 0x100

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 172
    .line 173
    if-gez v5, :cond_9

    .line 174
    .line 175
    neg-int v5, v5

    .line 176
    :cond_9
    aget v21, v20, v16

    .line 177
    .line 178
    sub-int v10, v21, v9

    .line 179
    .line 180
    if-gez v10, :cond_a

    .line 181
    .line 182
    neg-int v10, v10

    .line 183
    :cond_a
    add-int/2addr v5, v10

    .line 184
    if-ge v5, v15, :cond_c

    .line 185
    .line 186
    aget v10, v20, v19

    .line 187
    .line 188
    sub-int/2addr v10, v8

    .line 189
    if-gez v10, :cond_b

    .line 190
    .line 191
    neg-int v10, v10

    .line 192
    :cond_b
    add-int/2addr v5, v10

    .line 193
    if-ge v5, v15, :cond_c

    .line 194
    .line 195
    aget v4, v20, v18

    .line 196
    .line 197
    move v15, v5

    .line 198
    :cond_c
    :goto_6
    if-ltz v14, :cond_11

    .line 199
    .line 200
    aget-object v5, v12, v14

    .line 201
    .line 202
    aget v10, v5, v17

    .line 203
    .line 204
    sub-int v10, v11, v10

    .line 205
    .line 206
    if-lt v10, v15, :cond_d

    .line 207
    .line 208
    const/16 v10, 0xff

    .line 209
    .line 210
    const/4 v14, -0x1

    .line 211
    goto :goto_3

    .line 212
    :cond_d
    add-int/lit8 v14, v14, -0x1

    .line 213
    .line 214
    if-gez v10, :cond_e

    .line 215
    .line 216
    neg-int v10, v10

    .line 217
    :cond_e
    aget v17, v5, v16

    .line 218
    .line 219
    sub-int v0, v17, v9

    .line 220
    .line 221
    if-gez v0, :cond_f

    .line 222
    .line 223
    neg-int v0, v0

    .line 224
    :cond_f
    add-int/2addr v10, v0

    .line 225
    if-ge v10, v15, :cond_11

    .line 226
    .line 227
    aget v0, v5, v19

    .line 228
    .line 229
    sub-int/2addr v0, v8

    .line 230
    if-gez v0, :cond_10

    .line 231
    .line 232
    neg-int v0, v0

    .line 233
    :cond_10
    add-int/2addr v0, v10

    .line 234
    if-ge v0, v15, :cond_11

    .line 235
    .line 236
    aget v4, v5, v18

    .line 237
    .line 238
    const/16 v10, 0xff

    .line 239
    .line 240
    move v15, v0

    .line 241
    :goto_7
    move-object/from16 v0, p0

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_11
    const/16 v10, 0xff

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_12
    return-object v1
.end method

.method public final ᲇᲈᛵᛷ([B)V
    .locals 16

    .line 1
    new-instance v0, Lyyds/ᛲᛶᛵ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛶᛵ;-><init>(I[B)V

    .line 7
    .line 8
    .line 9
    const-wide v2, -0x621dee68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p0

    .line 18
    .line 19
    iget-object v2, v2, Lyyds/ᛶᛷᲀᲁ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 20
    .line 21
    iget v3, v0, Lyyds/ᛲᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v3, 0x1

    .line 27
    .line 28
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛷᲈᲈᲁ:I

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    iput-boolean v5, v0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 32
    .line 33
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᲇᲈᛵᛷ:I

    .line 34
    .line 35
    shl-int v4, v1, v4

    .line 36
    .line 37
    sub-int/2addr v4, v1

    .line 38
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛲᛴᛳᛲ:I

    .line 39
    .line 40
    shl-int v3, v1, v3

    .line 41
    .line 42
    iput v3, v0, Lyyds/ᛲᛶᛵ;->ᛷᛲᲈᛱ:I

    .line 43
    .line 44
    add-int/lit8 v4, v3, 0x1

    .line 45
    .line 46
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 47
    .line 48
    add-int/lit8 v4, v3, 0x2

    .line 49
    .line 50
    iput v4, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 51
    .line 52
    iput v5, v0, Lyyds/ᛲᛶᛵ;->ᲇᛱᛲ:I

    .line 53
    .line 54
    iget-object v4, v0, Lyyds/ᛲᛶᛵ;->ᛵᛸᛸᛷ:[I

    .line 55
    .line 56
    array-length v6, v4

    .line 57
    if-nez v6, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 60
    .line 61
    .line 62
    iget v1, v0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_0
    aget v3, v4, v5

    .line 70
    .line 71
    const/16 v6, 0x138b

    .line 72
    .line 73
    move v8, v5

    .line 74
    move v7, v6

    .line 75
    :goto_0
    const/high16 v9, 0x10000

    .line 76
    .line 77
    if-ge v7, v9, :cond_1

    .line 78
    .line 79
    add-int/lit8 v8, v8, 0x1

    .line 80
    .line 81
    mul-int/lit8 v7, v7, 0x2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    rsub-int/lit8 v7, v8, 0x8

    .line 85
    .line 86
    move v8, v5

    .line 87
    :goto_1
    const/4 v9, -0x1

    .line 88
    iget-object v10, v0, Lyyds/ᛲᛶᛵ;->ᲇᲇᲇᛱ:[I

    .line 89
    .line 90
    if-ge v8, v6, :cond_2

    .line 91
    .line 92
    aput v9, v10, v8

    .line 93
    .line 94
    add-int/lit8 v8, v8, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iget v8, v0, Lyyds/ᛲᛶᛵ;->ᛷᛲᲈᛱ:I

    .line 98
    .line 99
    invoke-virtual {v0, v8, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 100
    .line 101
    .line 102
    array-length v8, v4

    .line 103
    move v11, v1

    .line 104
    :goto_2
    if-ge v11, v8, :cond_b

    .line 105
    .line 106
    aget v12, v4, v11

    .line 107
    .line 108
    shl-int/lit8 v13, v12, 0xc

    .line 109
    .line 110
    add-int/2addr v13, v3

    .line 111
    shl-int/2addr v12, v7

    .line 112
    xor-int/2addr v12, v3

    .line 113
    aget v14, v10, v12

    .line 114
    .line 115
    iget-object v15, v0, Lyyds/ᛲᛶᛵ;->ᛶᛷᛲᲁ:[I

    .line 116
    .line 117
    if-ne v14, v13, :cond_3

    .line 118
    .line 119
    aget v3, v15, v12

    .line 120
    .line 121
    move/from16 p0, v9

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_3
    if-ltz v14, :cond_8

    .line 125
    .line 126
    rsub-int v14, v12, 0x138b

    .line 127
    .line 128
    if-nez v12, :cond_4

    .line 129
    .line 130
    move v14, v1

    .line 131
    :cond_4
    :goto_3
    sub-int/2addr v12, v14

    .line 132
    if-gez v12, :cond_5

    .line 133
    .line 134
    add-int/lit16 v12, v12, 0x138b

    .line 135
    .line 136
    :cond_5
    move/from16 p0, v9

    .line 137
    .line 138
    aget v9, v10, v12

    .line 139
    .line 140
    if-ne v9, v13, :cond_6

    .line 141
    .line 142
    aget v3, v15, v12

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_6
    if-gez v9, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    move/from16 v9, p0

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    move/from16 p0, v9

    .line 152
    .line 153
    :goto_4
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 154
    .line 155
    .line 156
    aget v3, v4, v11

    .line 157
    .line 158
    iget v9, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 159
    .line 160
    const/16 v14, 0x1000

    .line 161
    .line 162
    if-ge v9, v14, :cond_9

    .line 163
    .line 164
    add-int/lit8 v14, v9, 0x1

    .line 165
    .line 166
    iput v14, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 167
    .line 168
    aput v9, v15, v12

    .line 169
    .line 170
    aput v13, v10, v12

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    move v9, v5

    .line 174
    :goto_5
    if-ge v9, v6, :cond_a

    .line 175
    .line 176
    aput p0, v10, v9

    .line 177
    .line 178
    add-int/lit8 v9, v9, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_a
    iget v9, v0, Lyyds/ᛲᛶᛵ;->ᛷᛲᲈᛱ:I

    .line 182
    .line 183
    add-int/lit8 v12, v9, 0x2

    .line 184
    .line 185
    iput v12, v0, Lyyds/ᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 186
    .line 187
    iput-boolean v1, v0, Lyyds/ᛲᛶᛵ;->ᛲᛳᛶᲁ:Z

    .line 188
    .line 189
    invoke-virtual {v0, v9, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 190
    .line 191
    .line 192
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 193
    .line 194
    move/from16 v9, p0

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_b
    invoke-virtual {v0, v3, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 198
    .line 199
    .line 200
    iget v1, v0, Lyyds/ᛲᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 201
    .line 202
    invoke-virtual {v0, v1, v2}, Lyyds/ᛲᛶᛵ;->ᛲᲈᲁ(ILjava/io/BufferedOutputStream;)V

    .line 203
    .line 204
    .line 205
    :goto_7
    invoke-virtual {v2, v5}, Ljava/io/OutputStream;->write(I)V

    .line 206
    .line 207
    .line 208
    return-void
.end method
