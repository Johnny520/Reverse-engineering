.class public final Lba/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lba/r;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lba/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lba/r;->a:Lba/r;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lba/r;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Landroid/content/Context;Lba/n;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-static {p0}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v2, "message_bubbles"

    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p1, Lba/n;->g:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static b(Ljava/io/File;)Lba/o;
    .locals 12

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-lez v2, :cond_23

    .line 22
    .line 23
    if-lez v0, :cond_23

    .line 24
    .line 25
    const/16 v4, 0x800

    .line 26
    .line 27
    if-gt v2, v4, :cond_23

    .line 28
    .line 29
    if-gt v0, v4, :cond_23

    .line 30
    .line 31
    int-to-long v4, v2

    .line 32
    int-to-long v6, v0

    .line 33
    mul-long/2addr v4, v6

    .line 34
    const-wide/32 v6, 0x1e8480

    .line 35
    .line 36
    .line 37
    cmp-long v0, v4, v6

    .line 38
    .line 39
    if-lez v0, :cond_0

    .line 40
    .line 41
    goto/16 :goto_16

    .line 42
    .line 43
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v2, Ljava/io/FileInputStream;

    .line 49
    .line 50
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 51
    .line 52
    .line 53
    :try_start_0
    new-instance p0, Landroid/graphics/BitmapFactory$Options;

    .line 54
    .line 55
    invoke-direct {p0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 56
    .line 57
    .line 58
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 59
    .line 60
    iput-object v4, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 61
    .line 62
    invoke-static {v2, v0, p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 66
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 67
    .line 68
    .line 69
    if-eqz p0, :cond_23

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const/4 v4, 0x0

    .line 76
    if-nez v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-lez v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-lez v2, :cond_1

    .line 89
    .line 90
    move v2, v1

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move v2, v4

    .line 93
    :goto_0
    if-eqz v2, :cond_2

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move-object p0, v3

    .line 97
    :goto_1
    if-eqz p0, :cond_23

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-eqz v2, :cond_3

    .line 104
    .line 105
    invoke-static {v2}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_3

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move-object v2, v3

    .line 113
    :goto_2
    if-eqz v2, :cond_6

    .line 114
    .line 115
    new-instance v1, Lba/o;

    .line 116
    .line 117
    array-length v4, v2

    .line 118
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 123
    .line 124
    if-ltz v4, :cond_4

    .line 125
    .line 126
    iget v5, v0, Landroid/graphics/Rect;->top:I

    .line 127
    .line 128
    if-ltz v5, :cond_4

    .line 129
    .line 130
    iget v6, v0, Landroid/graphics/Rect;->right:I

    .line 131
    .line 132
    if-ltz v6, :cond_4

    .line 133
    .line 134
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    .line 135
    .line 136
    if-ltz v7, :cond_4

    .line 137
    .line 138
    add-int/2addr v4, v5

    .line 139
    add-int/2addr v4, v6

    .line 140
    add-int/2addr v4, v7

    .line 141
    if-lez v4, :cond_4

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_4
    move-object v0, v3

    .line 145
    :goto_3
    if-eqz v0, :cond_5

    .line 146
    .line 147
    new-instance v3, Landroid/graphics/Rect;

    .line 148
    .line 149
    invoke-direct {v3, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    invoke-static {p0}, Lba/r;->h(Landroid/graphics/Bitmap;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    invoke-direct {v1, p0, v2, v3, v0}, Lba/o;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;I)V

    .line 157
    .line 158
    .line 159
    return-object v1

    .line 160
    :cond_6
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    const/4 v2, 0x3

    .line 165
    if-lt v0, v2, :cond_21

    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-lt v0, v2, :cond_21

    .line 172
    .line 173
    invoke-virtual {p0, v4, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v0}, Lba/r;->d(I)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_21

    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    sub-int/2addr v0, v1

    .line 188
    invoke-virtual {p0, v0, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-static {v0}, Lba/r;->d(I)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_21

    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    sub-int/2addr v0, v1

    .line 203
    invoke-virtual {p0, v4, v0}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-static {v0}, Lba/r;->d(I)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_21

    .line 212
    .line 213
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    sub-int/2addr v0, v1

    .line 218
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    sub-int/2addr v2, v1

    .line 223
    invoke-virtual {p0, v0, v2}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-static {v0}, Lba/r;->d(I)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_7

    .line 232
    .line 233
    goto/16 :goto_13

    .line 234
    .line 235
    :cond_7
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    sub-int/2addr v0, v1

    .line 240
    move v2, v1

    .line 241
    move v5, v4

    .line 242
    :goto_4
    if-lt v2, v0, :cond_1d

    .line 243
    .line 244
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    add-int/lit8 v6, v0, -0x1

    .line 249
    .line 250
    move v0, v1

    .line 251
    move v2, v4

    .line 252
    :goto_5
    if-lt v0, v6, :cond_19

    .line 253
    .line 254
    if-eqz v5, :cond_21

    .line 255
    .line 256
    if-eqz v2, :cond_21

    .line 257
    .line 258
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    const/4 v2, 0x2

    .line 263
    sub-int/2addr v0, v2

    .line 264
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    sub-int/2addr v5, v2

    .line 269
    invoke-static {p0, v1, v4}, Lba/r;->f(Landroid/graphics/Bitmap;ZZ)[I

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    array-length v7, v6

    .line 274
    if-nez v7, :cond_8

    .line 275
    .line 276
    move-object v6, v3

    .line 277
    :cond_8
    if-eqz v6, :cond_9

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_9
    new-array v6, v2, [I

    .line 281
    .line 282
    aput v4, v6, v4

    .line 283
    .line 284
    aput v0, v6, v1

    .line 285
    .line 286
    :goto_6
    invoke-static {p0, v4, v4}, Lba/r;->f(Landroid/graphics/Bitmap;ZZ)[I

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    array-length v8, v7

    .line 291
    if-nez v8, :cond_a

    .line 292
    .line 293
    move-object v7, v3

    .line 294
    :cond_a
    if-eqz v7, :cond_b

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_b
    new-array v7, v2, [I

    .line 298
    .line 299
    aput v4, v7, v4

    .line 300
    .line 301
    aput v5, v7, v1

    .line 302
    .line 303
    :goto_7
    invoke-static {p0, v1, v1}, Lba/r;->f(Landroid/graphics/Bitmap;ZZ)[I

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-static {p0, v4, v1}, Lba/r;->f(Landroid/graphics/Bitmap;ZZ)[I

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    array-length v10, v8

    .line 312
    if-ne v10, v2, :cond_e

    .line 313
    .line 314
    array-length v10, v9

    .line 315
    if-ne v10, v2, :cond_e

    .line 316
    .line 317
    new-instance v2, Landroid/graphics/Rect;

    .line 318
    .line 319
    aget v10, v8, v4

    .line 320
    .line 321
    aget v11, v9, v4

    .line 322
    .line 323
    aget v8, v8, v1

    .line 324
    .line 325
    sub-int v8, v0, v8

    .line 326
    .line 327
    if-gez v8, :cond_c

    .line 328
    .line 329
    move v8, v4

    .line 330
    :cond_c
    aget v9, v9, v1

    .line 331
    .line 332
    sub-int v9, v5, v9

    .line 333
    .line 334
    if-gez v9, :cond_d

    .line 335
    .line 336
    move v9, v4

    .line 337
    :cond_d
    invoke-direct {v2, v10, v11, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 338
    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_e
    move-object v2, v3

    .line 342
    :goto_8
    invoke-static {p0, v1, v1, v0, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 350
    .line 351
    .line 352
    array-length v5, v6

    .line 353
    add-int/2addr v5, v1

    .line 354
    array-length v8, v7

    .line 355
    add-int/2addr v8, v1

    .line 356
    mul-int/2addr v8, v5

    .line 357
    new-array v5, v8, [I

    .line 358
    .line 359
    move v9, v4

    .line 360
    :goto_9
    if-ge v9, v8, :cond_f

    .line 361
    .line 362
    aput v1, v5, v9

    .line 363
    .line 364
    add-int/lit8 v9, v9, 0x1

    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_f
    array-length v9, v6

    .line 368
    array-length v10, v7

    .line 369
    add-int/2addr v9, v10

    .line 370
    add-int/2addr v9, v8

    .line 371
    mul-int/lit8 v9, v9, 0x4

    .line 372
    .line 373
    add-int/lit8 v9, v9, 0x20

    .line 374
    .line 375
    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 388
    .line 389
    .line 390
    array-length v1, v6

    .line 391
    int-to-byte v1, v1

    .line 392
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 393
    .line 394
    .line 395
    array-length v1, v7

    .line 396
    int-to-byte v1, v1

    .line 397
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 398
    .line 399
    .line 400
    int-to-byte v1, v8

    .line 401
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v9, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v9, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 408
    .line 409
    .line 410
    if-eqz v2, :cond_10

    .line 411
    .line 412
    iget v1, v2, Landroid/graphics/Rect;->left:I

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_10
    move v1, v4

    .line 416
    :goto_a
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 417
    .line 418
    .line 419
    if-eqz v2, :cond_11

    .line 420
    .line 421
    iget v1, v2, Landroid/graphics/Rect;->right:I

    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_11
    move v1, v4

    .line 425
    :goto_b
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 426
    .line 427
    .line 428
    if-eqz v2, :cond_12

    .line 429
    .line 430
    iget v1, v2, Landroid/graphics/Rect;->top:I

    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_12
    move v1, v4

    .line 434
    :goto_c
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 435
    .line 436
    .line 437
    if-eqz v2, :cond_13

    .line 438
    .line 439
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_13
    move v1, v4

    .line 443
    :goto_d
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v9, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 447
    .line 448
    .line 449
    array-length v1, v6

    .line 450
    move v10, v4

    .line 451
    :goto_e
    if-ge v10, v1, :cond_14

    .line 452
    .line 453
    aget v11, v6, v10

    .line 454
    .line 455
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 456
    .line 457
    .line 458
    add-int/lit8 v10, v10, 0x1

    .line 459
    .line 460
    goto :goto_e

    .line 461
    :cond_14
    array-length v1, v7

    .line 462
    move v6, v4

    .line 463
    :goto_f
    if-ge v6, v1, :cond_15

    .line 464
    .line 465
    aget v10, v7, v6

    .line 466
    .line 467
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 468
    .line 469
    .line 470
    add-int/lit8 v6, v6, 0x1

    .line 471
    .line 472
    goto :goto_f

    .line 473
    :cond_15
    :goto_10
    if-ge v4, v8, :cond_16

    .line 474
    .line 475
    aget v1, v5, v4

    .line 476
    .line 477
    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 478
    .line 479
    .line 480
    add-int/lit8 v4, v4, 0x1

    .line 481
    .line 482
    goto :goto_10

    .line 483
    :cond_16
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    :try_start_1
    invoke-static {v1}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 495
    .line 496
    .line 497
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 498
    goto :goto_11

    .line 499
    :catchall_0
    move-exception v4

    .line 500
    new-instance v5, Lsf/f;

    .line 501
    .line 502
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 503
    .line 504
    .line 505
    move-object v4, v5

    .line 506
    :goto_11
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 507
    .line 508
    instance-of v6, v4, Lsf/f;

    .line 509
    .line 510
    if-eqz v6, :cond_17

    .line 511
    .line 512
    move-object v4, v5

    .line 513
    :cond_17
    check-cast v4, Ljava/lang/Boolean;

    .line 514
    .line 515
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    if-eqz v4, :cond_18

    .line 520
    .line 521
    goto :goto_12

    .line 522
    :cond_18
    move-object v1, v3

    .line 523
    :goto_12
    new-instance v4, Lba/o;

    .line 524
    .line 525
    invoke-static {v0}, Lba/r;->h(Landroid/graphics/Bitmap;)I

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    invoke-direct {v4, v0, v1, v2, v5}, Lba/o;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;I)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_14

    .line 533
    .line 534
    :cond_19
    invoke-virtual {p0, v4, v0}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 535
    .line 536
    .line 537
    move-result v7

    .line 538
    invoke-static {v7}, Lba/r;->d(I)Z

    .line 539
    .line 540
    .line 541
    move-result v8

    .line 542
    if-nez v8, :cond_1a

    .line 543
    .line 544
    invoke-static {v7}, Lba/r;->c(I)Z

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    if-nez v8, :cond_1a

    .line 549
    .line 550
    goto :goto_13

    .line 551
    :cond_1a
    invoke-static {v7}, Lba/r;->c(I)Z

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    if-eqz v7, :cond_1b

    .line 556
    .line 557
    move v2, v1

    .line 558
    :cond_1b
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    sub-int/2addr v7, v1

    .line 563
    invoke-virtual {p0, v7, v0}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 564
    .line 565
    .line 566
    move-result v7

    .line 567
    invoke-static {v7}, Lba/r;->d(I)Z

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    if-nez v8, :cond_1c

    .line 572
    .line 573
    invoke-static {v7}, Lba/r;->c(I)Z

    .line 574
    .line 575
    .line 576
    move-result v7

    .line 577
    if-nez v7, :cond_1c

    .line 578
    .line 579
    goto :goto_13

    .line 580
    :cond_1c
    add-int/lit8 v0, v0, 0x1

    .line 581
    .line 582
    goto/16 :goto_5

    .line 583
    .line 584
    :cond_1d
    invoke-virtual {p0, v2, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 585
    .line 586
    .line 587
    move-result v6

    .line 588
    invoke-static {v6}, Lba/r;->d(I)Z

    .line 589
    .line 590
    .line 591
    move-result v7

    .line 592
    if-nez v7, :cond_1e

    .line 593
    .line 594
    invoke-static {v6}, Lba/r;->c(I)Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    if-nez v7, :cond_1e

    .line 599
    .line 600
    goto :goto_13

    .line 601
    :cond_1e
    invoke-static {v6}, Lba/r;->c(I)Z

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    if-eqz v6, :cond_1f

    .line 606
    .line 607
    move v5, v1

    .line 608
    :cond_1f
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 609
    .line 610
    .line 611
    move-result v6

    .line 612
    sub-int/2addr v6, v1

    .line 613
    invoke-virtual {p0, v2, v6}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 614
    .line 615
    .line 616
    move-result v6

    .line 617
    invoke-static {v6}, Lba/r;->d(I)Z

    .line 618
    .line 619
    .line 620
    move-result v7

    .line 621
    if-nez v7, :cond_20

    .line 622
    .line 623
    invoke-static {v6}, Lba/r;->c(I)Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    if-nez v6, :cond_20

    .line 628
    .line 629
    goto :goto_13

    .line 630
    :cond_20
    add-int/lit8 v2, v2, 0x1

    .line 631
    .line 632
    goto/16 :goto_4

    .line 633
    .line 634
    :cond_21
    :goto_13
    move-object v4, v3

    .line 635
    :goto_14
    if-eqz v4, :cond_22

    .line 636
    .line 637
    goto :goto_15

    .line 638
    :cond_22
    new-instance v4, Lba/o;

    .line 639
    .line 640
    invoke-static {p0}, Lba/r;->h(Landroid/graphics/Bitmap;)I

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    invoke-direct {v4, p0, v3, v3, v0}, Lba/o;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;I)V

    .line 645
    .line 646
    .line 647
    :goto_15
    return-object v4

    .line 648
    :catchall_1
    move-exception p0

    .line 649
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 650
    :catchall_2
    move-exception v0

    .line 651
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 652
    .line 653
    .line 654
    throw v0

    .line 655
    :cond_23
    :goto_16
    return-object v3
.end method

.method public static c(I)Z
    .locals 1

    .line 1
    ushr-int/lit8 v0, p0, 0x18

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0xffffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p0, v0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static d(I)Z
    .locals 0

    .line 1
    ushr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static f(Landroid/graphics/Bitmap;ZZ)[I
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    const/4 v1, 0x1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    const/4 v2, -0x1

    .line 15
    move v4, v1

    .line 16
    move v3, v2

    .line 17
    :goto_1
    const/4 v5, 0x0

    .line 18
    if-lt v4, v0, :cond_2

    .line 19
    .line 20
    if-ltz v2, :cond_1

    .line 21
    .line 22
    if-le v3, v2, :cond_1

    .line 23
    .line 24
    filled-new-array {v2, v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    new-array p0, v5, [I

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    if-eqz p1, :cond_4

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    sub-int/2addr v5, v1

    .line 41
    :cond_3
    invoke-virtual {p0, v4, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    if-eqz p2, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    sub-int/2addr v5, v1

    .line 53
    :cond_5
    invoke-virtual {p0, v5, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    :goto_2
    invoke-static {v5}, Lba/r;->c(I)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_7

    .line 62
    .line 63
    if-gez v2, :cond_6

    .line 64
    .line 65
    add-int/lit8 v2, v4, -0x1

    .line 66
    .line 67
    :cond_6
    move v3, v4

    .line 68
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_1
.end method

.method public static final g(Landroid/content/Context;Z)V
    .locals 6

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    sget-object v2, Lba/n;->l:La2/a;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v2, Lba/a;->h:Lba/a;

    .line 39
    .line 40
    invoke-static {v2, v1, p1}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sget-object v4, Lba/r;->a:Lba/r;

    .line 45
    .line 46
    invoke-virtual {v4, p0, v3}, Lba/r;->e(Landroid/content/Context;Lba/n;)Lba/o;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    iget-boolean v3, v3, Lba/n;->k:Z

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-static {v2, v1, v3}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v4, p0, v1}, Lba/r;->e(Landroid/content/Context;Lba/n;)Lba/o;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-void
.end method

.method public static h(Landroid/graphics/Bitmap;)I
    .locals 15

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x20

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    div-int/lit8 v2, v2, 0x20

    .line 16
    .line 17
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v2

    .line 21
    :goto_0
    const/4 v2, 0x0

    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    move v5, v2

    .line 25
    move v6, v5

    .line 26
    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-ge v5, v7, :cond_4

    .line 31
    .line 32
    move v7, v2

    .line 33
    :goto_2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-ge v7, v8, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0, v7, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    const/16 v10, 0x60

    .line 48
    .line 49
    if-lt v9, v10, :cond_2

    .line 50
    .line 51
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    int-to-double v9, v9

    .line 56
    const-wide v11, 0x3fd322d0e5604189L    # 0.299

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    mul-double/2addr v9, v11

    .line 62
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    int-to-double v11, v11

    .line 67
    const-wide v13, 0x3fe2c8b439581062L    # 0.587

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    mul-double/2addr v11, v13

    .line 73
    add-double/2addr v11, v9

    .line 74
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    int-to-double v8, v8

    .line 79
    const-wide v13, 0x3fbd2f1a9fbe76c9L    # 0.114

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    mul-double/2addr v8, v13

    .line 85
    add-double/2addr v8, v11

    .line 86
    const-wide v10, 0x406fe00000000000L    # 255.0

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    div-double/2addr v8, v10

    .line 92
    add-double/2addr v3, v8

    .line 93
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    :cond_2
    add-int/2addr v7, v0

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    add-int/2addr v5, v1

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    if-lez v6, :cond_5

    .line 100
    .line 101
    int-to-double v0, v6

    .line 102
    div-double/2addr v3, v0

    .line 103
    const-wide v0, 0x3fe28f5c28f5c28fL    # 0.58

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    cmpl-double p0, v3, v0

    .line 109
    .line 110
    if-ltz p0, :cond_5

    .line 111
    .line 112
    const/high16 p0, -0x1000000

    .line 113
    .line 114
    return p0

    .line 115
    :cond_5
    const/4 p0, -0x1

    .line 116
    return p0
.end method


# virtual methods
.method public final declared-synchronized e(Landroid/content/Context;Lba/n;)Lba/o;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1, p2}, Lba/r;->a(Landroid/content/Context;Lba/n;)Ljava/io/File;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    sget-object v0, Lba/r;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lba/p;

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    iget-wide v3, v2, Lba/p;->a:J

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    cmp-long v3, v3, v5

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    iget-wide v3, v2, Lba/p;->b:J

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    cmp-long v3, v3, v5

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    iget-object v3, v2, Lba/p;->c:Lba/o;

    .line 55
    .line 56
    iget-object v3, v3, Lba/o;->a:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_1

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    move-object p1, v0

    .line 68
    goto :goto_3

    .line 69
    :cond_1
    const/4 v3, 0x0

    .line 70
    :goto_0
    if-eqz v3, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v2, v1

    .line 74
    :goto_1
    if-eqz v2, :cond_3

    .line 75
    .line 76
    iget-object p1, v2, Lba/p;->c:Lba/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-object p1

    .line 80
    :cond_3
    :try_start_1
    invoke-static {p1}, Lba/r;->b(Ljava/io/File;)Lba/o;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-eqz v6, :cond_4

    .line 85
    .line 86
    new-instance v1, Lba/p;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    invoke-direct/range {v1 .. v6}, Lba/p;-><init>(JJLba/o;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return-object v6

    .line 104
    :cond_4
    monitor-exit p0

    .line 105
    return-object v1

    .line 106
    :cond_5
    :goto_2
    :try_start_2
    sget-object p1, Lba/r;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    .line 110
    .line 111
    monitor-exit p0

    .line 112
    return-object v1

    .line 113
    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 114
    throw p1
.end method
