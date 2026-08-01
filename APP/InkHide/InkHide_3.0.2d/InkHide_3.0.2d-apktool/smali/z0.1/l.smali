.class public abstract Lz0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/util/LruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/util/LruCache;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lz0/l;->a:Landroid/util/LruCache;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/String;)V
    .locals 11

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_13

    .line 10
    .line 11
    :cond_0
    invoke-static {p1}, Lz0/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_13

    .line 18
    .line 19
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v2, p0, v1}, Lz0/l;->b(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    move-object v5, v4

    .line 37
    goto/16 :goto_9

    .line 38
    .line 39
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_f

    .line 53
    .line 54
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    move-object v7, v6

    .line 59
    check-cast v7, Landroid/widget/ImageView;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const-string v9, "Avatar"

    .line 70
    .line 71
    invoke-static {v8, v9, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_e

    .line 76
    .line 77
    const-string v9, "Head"

    .line 78
    .line 79
    invoke-static {v8, v9, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_4

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_4
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    if-lez v8, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move-object v9, v4

    .line 99
    :goto_1
    if-eqz v9, :cond_6

    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    if-eqz v8, :cond_7

    .line 111
    .line 112
    iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 113
    .line 114
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    goto :goto_2

    .line 119
    :cond_7
    move-object v8, v4

    .line 120
    :goto_2
    if-eqz v8, :cond_8

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    goto :goto_3

    .line 127
    :cond_8
    move v8, v2

    .line 128
    :goto_3
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    if-lez v9, :cond_9

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_9
    move-object v10, v4

    .line 140
    :goto_4
    if-eqz v10, :cond_a

    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    goto :goto_6

    .line 147
    :cond_a
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    if-eqz v7, :cond_b

    .line 152
    .line 153
    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 154
    .line 155
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    goto :goto_5

    .line 160
    :cond_b
    move-object v7, v4

    .line 161
    :goto_5
    if-eqz v7, :cond_c

    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    goto :goto_6

    .line 168
    :cond_c
    move v7, v2

    .line 169
    :goto_6
    if-lez v8, :cond_3

    .line 170
    .line 171
    if-gtz v7, :cond_d

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_d
    int-to-float v9, v8

    .line 175
    int-to-float v10, v7

    .line 176
    div-float/2addr v9, v10

    .line 177
    const/high16 v10, 0x3f400000    # 0.75f

    .line 178
    .line 179
    cmpg-float v10, v10, v9

    .line 180
    .line 181
    if-gtz v10, :cond_3

    .line 182
    .line 183
    const v10, 0x3faccccd    # 1.35f

    .line 184
    .line 185
    .line 186
    cmpg-float v9, v9, v10

    .line 187
    .line 188
    if-gtz v9, :cond_3

    .line 189
    .line 190
    const/16 v9, 0x20

    .line 191
    .line 192
    if-gt v9, v8, :cond_3

    .line 193
    .line 194
    const/16 v10, 0xdd

    .line 195
    .line 196
    if-ge v8, v10, :cond_3

    .line 197
    .line 198
    if-gt v9, v7, :cond_3

    .line 199
    .line 200
    if-ge v7, v10, :cond_3

    .line 201
    .line 202
    :cond_e
    :goto_7
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_f
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-nez v5, :cond_10

    .line 216
    .line 217
    move-object v5, v4

    .line 218
    goto :goto_8

    .line 219
    :cond_10
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-nez v6, :cond_11

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_11
    move-object v6, v5

    .line 231
    check-cast v6, Landroid/widget/ImageView;

    .line 232
    .line 233
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    :cond_12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    move-object v8, v7

    .line 242
    check-cast v8, Landroid/widget/ImageView;

    .line 243
    .line 244
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-le v6, v8, :cond_13

    .line 249
    .line 250
    move-object v5, v7

    .line 251
    move v6, v8

    .line 252
    :cond_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    if-nez v7, :cond_12

    .line 257
    .line 258
    :goto_8
    check-cast v5, Landroid/widget/ImageView;

    .line 259
    .line 260
    if-nez v5, :cond_14

    .line 261
    .line 262
    invoke-static {v1}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    move-object v5, p0

    .line 267
    check-cast v5, Landroid/widget/ImageView;

    .line 268
    .line 269
    :cond_14
    :goto_9
    if-nez v5, :cond_15

    .line 270
    .line 271
    goto/16 :goto_13

    .line 272
    .line 273
    :cond_15
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    if-eqz p0, :cond_16

    .line 278
    .line 279
    goto/16 :goto_13

    .line 280
    .line 281
    :cond_16
    new-instance p0, Ljava/io/File;

    .line 282
    .line 283
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-lez p1, :cond_17

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_17
    move-object v0, v4

    .line 298
    :goto_a
    if-eqz v0, :cond_18

    .line 299
    .line 300
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    goto :goto_d

    .line 305
    :cond_18
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    if-eqz p1, :cond_19

    .line 310
    .line 311
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 312
    .line 313
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-lez p1, :cond_19

    .line 318
    .line 319
    goto :goto_c

    .line 320
    :cond_19
    move-object v0, v4

    .line 321
    :goto_c
    if-eqz v0, :cond_1a

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_1a
    const/16 p1, 0x9c

    .line 325
    .line 326
    :goto_d
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    .line 331
    .line 332
    .line 333
    move-result-wide v6

    .line 334
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 335
    .line 336
    .line 337
    move-result-wide v8

    .line 338
    new-instance v1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v0, ":"

    .line 347
    .line 348
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    sget-object v1, Lz0/l;->a:Landroid/util/LruCache;

    .line 371
    .line 372
    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    check-cast v6, Landroid/graphics/Bitmap;

    .line 377
    .line 378
    if-nez v6, :cond_22

    .line 379
    .line 380
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    if-nez p0, :cond_1b

    .line 389
    .line 390
    move-object p0, v4

    .line 391
    goto/16 :goto_12

    .line 392
    .line 393
    :cond_1b
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    if-lez v6, :cond_1f

    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-gtz v6, :cond_1c

    .line 404
    .line 405
    goto :goto_12

    .line 406
    :cond_1c
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    int-to-float v6, v6

    .line 411
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    int-to-float v7, v7

    .line 416
    div-float/2addr v6, v7

    .line 417
    const/high16 v7, 0x3f800000    # 1.0f

    .line 418
    .line 419
    cmpl-float v6, v6, v7

    .line 420
    .line 421
    if-lez v6, :cond_1d

    .line 422
    .line 423
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    sub-int/2addr v7, v6

    .line 432
    div-int/lit8 v7, v7, 0x2

    .line 433
    .line 434
    new-instance v8, Landroid/graphics/Rect;

    .line 435
    .line 436
    add-int/2addr v6, v7

    .line 437
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    invoke-direct {v8, v7, v2, v6, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 442
    .line 443
    .line 444
    goto :goto_e

    .line 445
    :catchall_0
    move-exception p1

    .line 446
    goto :goto_f

    .line 447
    :cond_1d
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    sub-int/2addr v7, v6

    .line 456
    div-int/lit8 v7, v7, 0x2

    .line 457
    .line 458
    new-instance v8, Landroid/graphics/Rect;

    .line 459
    .line 460
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    add-int/2addr v6, v7

    .line 465
    invoke-direct {v8, v2, v7, v9, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 466
    .line 467
    .line 468
    :goto_e
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 469
    .line 470
    invoke-static {p1, p1, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    new-instance v7, Landroid/graphics/Canvas;

    .line 475
    .line 476
    invoke-direct {v7, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 477
    .line 478
    .line 479
    new-instance v9, Landroid/graphics/Rect;

    .line 480
    .line 481
    invoke-direct {v9, v2, v2, p1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 482
    .line 483
    .line 484
    new-instance p1, Landroid/graphics/Paint;

    .line 485
    .line 486
    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v7, p0, v8, v9, p1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 496
    .line 497
    .line 498
    goto :goto_10

    .line 499
    :goto_f
    new-instance v6, LE0/d;

    .line 500
    .line 501
    invoke-direct {v6, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    :goto_10
    instance-of p1, v6, LE0/d;

    .line 505
    .line 506
    if-eqz p1, :cond_1e

    .line 507
    .line 508
    goto :goto_11

    .line 509
    :cond_1e
    move-object p0, v6

    .line 510
    :goto_11
    check-cast p0, Landroid/graphics/Bitmap;

    .line 511
    .line 512
    :cond_1f
    :goto_12
    if-eqz p0, :cond_20

    .line 513
    .line 514
    invoke-virtual {v1, v0, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-object v4, p0

    .line 518
    :cond_20
    if-nez v4, :cond_21

    .line 519
    .line 520
    goto :goto_13

    .line 521
    :cond_21
    move-object v6, v4

    .line 522
    :cond_22
    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 523
    .line 524
    invoke-virtual {v5, p0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 531
    .line 532
    .line 533
    :goto_13
    return-void
.end method

.method public static b(ILandroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-le p0, v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p1, Landroid/view/ViewGroup;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-nez p1, :cond_3

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_1
    if-ge v1, v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    add-int/lit8 v3, p0, 0x1

    .line 45
    .line 46
    invoke-static {v3, v2, p2}, Lz0/l;->b(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    :goto_2
    return-void
.end method

.method public static c()Ljava/util/Map;
    .locals 7

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "sp"

    .line 8
    .line 9
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "startReloadIfChangedUnexpectedly"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "custom_local_avatars"

    .line 35
    .line 36
    const-string v2, "{}"

    .line 37
    .line 38
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, ""

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_0
    :try_start_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v2, v0

    .line 55
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const-string v4, "keys(...)"

    .line 70
    .line 71
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const-string v6, "optString(...)"

    .line 91
    .line 92
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-nez v6, :cond_2

    .line 111
    .line 112
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_2

    .line 117
    .line 118
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    new-instance v2, LE0/d;

    .line 124
    .line 125
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    :cond_3
    invoke-static {v2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    const-string v1, "custom avatar map parse fail"

    .line 136
    .line 137
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object v2, LF0/t;->a:LF0/t;

    .line 145
    .line 146
    :goto_2
    check-cast v2, Ljava/util/Map;

    .line 147
    .line 148
    return-object v2
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    :cond_1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-static {}, Lz0/l;->c()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    new-instance v1, Ljava/io/File;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static e()Lz0/k;
    .locals 7

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "sp"

    .line 8
    .line 9
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 18
    .line 19
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v2, "custom_local_avatar_methods"

    .line 35
    .line 36
    const-string v3, "[]"

    .line 37
    .line 38
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    const-string v0, ""

    .line 45
    .line 46
    :cond_0
    :try_start_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    const-string v0, "{}"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_0
    new-instance v2, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v0, "versionCode"

    .line 63
    .line 64
    const/4 v3, -0x1

    .line 65
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const-string v3, "versionName"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {}, Lz0/r;->p()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ne v0, v4, :cond_3

    .line 80
    .line 81
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    new-instance v4, Lz0/k;

    .line 93
    .line 94
    const-string v5, "loadMethods"

    .line 95
    .line 96
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-static {v5}, Lz0/l;->i(Lorg/json/JSONArray;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v6, "hdGalleryMethods"

    .line 105
    .line 106
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2}, Lz0/l;->i(Lorg/json/JSONArray;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-direct {v4, v5, v2, v0, v3}, Lz0/k;-><init>(Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    :goto_1
    move-object v4, v1

    .line 119
    goto :goto_3

    .line 120
    :goto_2
    new-instance v4, LE0/d;

    .line 121
    .line 122
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :goto_3
    instance-of v0, v4, LE0/d;

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    move-object v4, v1

    .line 130
    :cond_4
    check-cast v4, Lz0/k;

    .line 131
    .line 132
    if-eqz v4, :cond_6

    .line 133
    .line 134
    iget-object v0, v4, Lz0/k;->a:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    iget-object v0, v4, Lz0/k;->b:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_6

    .line 149
    .line 150
    :cond_5
    move-object v1, v4

    .line 151
    :cond_6
    return-object v1
.end method

.method public static f(Ljava/util/LinkedHashMap;)Z
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget-boolean p0, Lz0/i;->a:Z

    .line 55
    .line 56
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v1, "custom_local_avatars"

    .line 65
    .line 66
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    invoke-static {}, Lz0/g;->I()V

    .line 81
    .line 82
    .line 83
    :cond_2
    return p0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "custom_local_avatar_pending_wxid"

    .line 12
    .line 13
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static h(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lz0/j;

    .line 29
    .line 30
    new-instance v2, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v1, Lz0/j;->a:Ljava/lang/String;

    .line 36
    .line 37
    const-string v4, "className"

    .line 38
    .line 39
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    const-string v3, "methodName"

    .line 43
    .line 44
    iget-object v4, v1, Lz0/j;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    const-string v3, "methodSign"

    .line 50
    .line 51
    iget-object v1, v1, Lz0/j;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-object v0
.end method

.method public static i(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, LF0/s;->a:LF0/s;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, LD/h;->U(II)LR0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    move-object v2, v0

    .line 25
    check-cast v2, LR0/b;

    .line 26
    .line 27
    iget-boolean v2, v2, LR0/b;->c:Z

    .line 28
    .line 29
    if-eqz v2, :cond_4

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, LR0/b;

    .line 33
    .line 34
    invoke-virtual {v2}, LR0/b;->a()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    new-instance v4, Lz0/j;

    .line 47
    .line 48
    const-string v5, "className"

    .line 49
    .line 50
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const-string v6, "optString(...)"

    .line 55
    .line 56
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v7, "methodName"

    .line 60
    .line 61
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v7, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v8, "methodSign"

    .line 69
    .line 70
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v4, v5, v7, v2}, Lz0/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_3

    .line 91
    .line 92
    move-object v3, v4

    .line 93
    :cond_3
    :goto_1
    if-eqz v3, :cond_1

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    return-object v1
.end method
