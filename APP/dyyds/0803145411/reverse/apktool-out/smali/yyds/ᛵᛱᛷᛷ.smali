.class public final Lyyds/ᛵᛱᛷᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x628cee68a836eL

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

.method public static ᛲᛴᛳᛲ(Landroid/media/MediaFormat;II)Lyyds/ᛸᛴᛶ;
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-wide v1, -0x62860e68a836eL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move v1, v0

    .line 19
    :goto_0
    const-wide v2, -0x6286fe68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    :catch_1
    move p0, v0

    .line 33
    move v0, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move p0, v0

    .line 36
    :goto_1
    const/4 v1, 0x2

    .line 37
    if-gtz v0, :cond_3

    .line 38
    .line 39
    const/16 v0, 0x2d0

    .line 40
    .line 41
    if-ge p2, v0, :cond_2

    .line 42
    .line 43
    const/16 p2, 0x500

    .line 44
    .line 45
    if-lt p1, p2, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move v0, v1

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    :goto_2
    const/4 p1, 0x1

    .line 51
    move v0, p1

    .line 52
    :cond_3
    :goto_3
    if-gtz p0, :cond_4

    .line 53
    .line 54
    move p0, v1

    .line 55
    :cond_4
    new-instance p1, Lyyds/ᛸᛴᛶ;

    .line 56
    .line 57
    invoke-direct {p1, v0, p0}, Lyyds/ᛸᛴᛶ;-><init>(II)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method

.method public static ᲀᛲᛳᲀ(Ljava/util/List;)Z
    .locals 11

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Landroid/graphics/Bitmap;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->hasAlpha()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-array v3, v0, [I

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    move v7, v1

    .line 36
    :goto_0
    if-ge v7, v10, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    const/4 v9, 0x1

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 50
    .line 51
    .line 52
    move v4, v1

    .line 53
    :goto_1
    if-ge v4, v0, :cond_2

    .line 54
    .line 55
    aget v5, v3, v4

    .line 56
    .line 57
    ushr-int/lit8 v5, v5, 0x18

    .line 58
    .line 59
    and-int/lit16 v5, v5, 0xff

    .line 60
    .line 61
    const/16 v6, 0x80

    .line 62
    .line 63
    if-ge v5, v6, :cond_1

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return v1
.end method

.method public static ᲇᲇᲇᛱ(Landroid/media/Image;Lyyds/ᛸᛴᛶ;)Landroid/graphics/Bitmap;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getCropRect()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    iget v4, v1, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :goto_0
    move v13, v1

    .line 29
    move v9, v5

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v3, v2

    .line 40
    move v4, v3

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    aget-object v1, v1, v2

    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x1

    .line 53
    aget-object v5, v5, v6

    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const/4 v8, 0x2

    .line 60
    aget-object v7, v7, v8

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-virtual {v7}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    invoke-virtual {v7}, Landroid/media/Image$Plane;->getRowStride()I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-virtual {v7}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    move/from16 v16, v2

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/nio/Buffer;->limit()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    move/from16 p0, v8

    .line 101
    .line 102
    invoke-virtual {v11}, Ljava/nio/Buffer;->limit()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {v12}, Ljava/nio/Buffer;->limit()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    move/from16 v18, v1

    .line 111
    .line 112
    iget v1, v0, Lyyds/ᛸᛴᛶ;->ᛲᲈᲁ:I

    .line 113
    .line 114
    move/from16 v19, v3

    .line 115
    .line 116
    const/16 v20, 0x3

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    if-eq v1, v3, :cond_2

    .line 120
    .line 121
    move/from16 v17, v3

    .line 122
    .line 123
    const/4 v3, 0x6

    .line 124
    if-eq v1, v3, :cond_1

    .line 125
    .line 126
    const/4 v1, 0x4

    .line 127
    new-array v1, v1, [F

    .line 128
    .line 129
    const v3, 0x3fb374bc    # 1.402f

    .line 130
    .line 131
    .line 132
    aput v3, v1, v16

    .line 133
    .line 134
    const v3, 0x3eb03298    # 0.344136f

    .line 135
    .line 136
    .line 137
    aput v3, v1, v17

    .line 138
    .line 139
    const v3, 0x3f36d19e

    .line 140
    .line 141
    .line 142
    aput v3, v1, p0

    .line 143
    .line 144
    const v3, 0x3fe2d0e5    # 1.772f

    .line 145
    .line 146
    .line 147
    aput v3, v1, v20

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_1
    const/4 v1, 0x4

    .line 151
    new-array v1, v1, [F

    .line 152
    .line 153
    const v3, 0x3fbcbfb1    # 1.4746f

    .line 154
    .line 155
    .line 156
    aput v3, v1, v16

    .line 157
    .line 158
    const v3, 0x3e287fcc    # 0.16455f

    .line 159
    .line 160
    .line 161
    aput v3, v1, v17

    .line 162
    .line 163
    const v3, 0x3f1243fe

    .line 164
    .line 165
    .line 166
    aput v3, v1, p0

    .line 167
    .line 168
    const v3, 0x3ff0d1b7    # 1.8814f

    .line 169
    .line 170
    .line 171
    aput v3, v1, v20

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_2
    move/from16 v17, v3

    .line 175
    .line 176
    const/4 v1, 0x4

    .line 177
    new-array v1, v1, [F

    .line 178
    .line 179
    const v3, 0x3fc9930c    # 1.5748f

    .line 180
    .line 181
    .line 182
    aput v3, v1, v16

    .line 183
    .line 184
    const v3, 0x3e3fcb92    # 0.1873f

    .line 185
    .line 186
    .line 187
    aput v3, v1, v17

    .line 188
    .line 189
    const v3, 0x3eefaace    # 0.4681f

    .line 190
    .line 191
    .line 192
    aput v3, v1, p0

    .line 193
    .line 194
    const v3, 0x3fed844d    # 1.8556f

    .line 195
    .line 196
    .line 197
    aput v3, v1, v20

    .line 198
    .line 199
    :goto_2
    aget v3, v1, v16

    .line 200
    .line 201
    aget v21, v1, v17

    .line 202
    .line 203
    aget v22, v1, p0

    .line 204
    .line 205
    aget v1, v1, v20

    .line 206
    .line 207
    iget v0, v0, Lyyds/ᛸᛴᛶ;->ᛵᛸᛸᛷ:I

    .line 208
    .line 209
    move/from16 v20, v1

    .line 210
    .line 211
    move/from16 v1, p0

    .line 212
    .line 213
    if-ne v0, v1, :cond_3

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_3
    move/from16 v17, v16

    .line 217
    .line 218
    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 219
    .line 220
    if-eqz v17, :cond_4

    .line 221
    .line 222
    const v1, 0x3f950a85

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_4
    move v1, v0

    .line 227
    :goto_4
    if-eqz v17, :cond_5

    .line 228
    .line 229
    const/high16 v23, 0x41800000    # 16.0f

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_5
    const/16 v23, 0x0

    .line 233
    .line 234
    :goto_5
    if-eqz v17, :cond_6

    .line 235
    .line 236
    const v0, 0x3f91b6db

    .line 237
    .line 238
    .line 239
    :cond_6
    move/from16 p1, v0

    .line 240
    .line 241
    mul-int v0, v9, v13

    .line 242
    .line 243
    new-array v0, v0, [I

    .line 244
    .line 245
    move-object/from16 v17, v0

    .line 246
    .line 247
    move/from16 v0, v16

    .line 248
    .line 249
    :goto_6
    if-ge v0, v13, :cond_b

    .line 250
    .line 251
    add-int v24, v0, v4

    .line 252
    .line 253
    mul-int v25, v24, v18

    .line 254
    .line 255
    const/16 v26, 0x2

    .line 256
    .line 257
    div-int/lit8 v24, v24, 0x2

    .line 258
    .line 259
    mul-int v27, v24, v14

    .line 260
    .line 261
    mul-int v24, v24, v15

    .line 262
    .line 263
    move/from16 p0, v0

    .line 264
    .line 265
    move/from16 v0, v16

    .line 266
    .line 267
    :goto_7
    if-ge v0, v9, :cond_a

    .line 268
    .line 269
    add-int v28, v0, v19

    .line 270
    .line 271
    move/from16 v29, v0

    .line 272
    .line 273
    add-int v0, v25, v28

    .line 274
    .line 275
    div-int/lit8 v28, v28, 0x2

    .line 276
    .line 277
    mul-int v30, v28, v5

    .line 278
    .line 279
    move/from16 v31, v1

    .line 280
    .line 281
    add-int v1, v30, v27

    .line 282
    .line 283
    mul-int v28, v28, v7

    .line 284
    .line 285
    move/from16 v30, v3

    .line 286
    .line 287
    add-int v3, v28, v24

    .line 288
    .line 289
    move/from16 v28, v4

    .line 290
    .line 291
    const/16 v4, 0xff

    .line 292
    .line 293
    if-ge v0, v2, :cond_7

    .line 294
    .line 295
    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    and-int/2addr v0, v4

    .line 300
    goto :goto_8

    .line 301
    :cond_7
    move/from16 v0, v16

    .line 302
    .line 303
    :goto_8
    const/16 v32, 0x80

    .line 304
    .line 305
    if-ge v1, v8, :cond_8

    .line 306
    .line 307
    invoke-virtual {v11, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    and-int/2addr v1, v4

    .line 312
    goto :goto_9

    .line 313
    :cond_8
    move/from16 v1, v32

    .line 314
    .line 315
    :goto_9
    if-ge v3, v6, :cond_9

    .line 316
    .line 317
    invoke-virtual {v12, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    and-int/2addr v3, v4

    .line 322
    goto :goto_a

    .line 323
    :cond_9
    move/from16 v3, v32

    .line 324
    .line 325
    :goto_a
    int-to-float v0, v0

    .line 326
    sub-float v0, v0, v23

    .line 327
    .line 328
    mul-float v0, v0, v31

    .line 329
    .line 330
    add-int/lit8 v1, v1, -0x80

    .line 331
    .line 332
    int-to-float v1, v1

    .line 333
    mul-float v1, v1, p1

    .line 334
    .line 335
    add-int/lit8 v3, v3, -0x80

    .line 336
    .line 337
    int-to-float v3, v3

    .line 338
    mul-float v3, v3, p1

    .line 339
    .line 340
    mul-float v32, v30, v3

    .line 341
    .line 342
    add-float v4, v32, v0

    .line 343
    .line 344
    float-to-int v4, v4

    .line 345
    mul-float v32, v21, v1

    .line 346
    .line 347
    sub-float v32, v0, v32

    .line 348
    .line 349
    mul-float v3, v3, v22

    .line 350
    .line 351
    sub-float v3, v32, v3

    .line 352
    .line 353
    float-to-int v3, v3

    .line 354
    mul-float v1, v1, v20

    .line 355
    .line 356
    add-float/2addr v1, v0

    .line 357
    float-to-int v0, v1

    .line 358
    move/from16 v1, v16

    .line 359
    .line 360
    move/from16 v16, v2

    .line 361
    .line 362
    move v2, v1

    .line 363
    const/16 v1, 0xff

    .line 364
    .line 365
    invoke-static {v4, v2, v1}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    invoke-static {v3, v2, v1}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    invoke-static {v0, v2, v1}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    mul-int v1, p0, v9

    .line 378
    .line 379
    add-int v1, v1, v29

    .line 380
    .line 381
    shl-int/lit8 v4, v4, 0x10

    .line 382
    .line 383
    const/high16 v32, -0x1000000

    .line 384
    .line 385
    or-int v4, v4, v32

    .line 386
    .line 387
    shl-int/lit8 v3, v3, 0x8

    .line 388
    .line 389
    or-int/2addr v3, v4

    .line 390
    or-int/2addr v0, v3

    .line 391
    aput v0, v17, v1

    .line 392
    .line 393
    add-int/lit8 v0, v29, 0x1

    .line 394
    .line 395
    move/from16 v1, v16

    .line 396
    .line 397
    move/from16 v16, v2

    .line 398
    .line 399
    move v2, v1

    .line 400
    move/from16 v4, v28

    .line 401
    .line 402
    move/from16 v3, v30

    .line 403
    .line 404
    move/from16 v1, v31

    .line 405
    .line 406
    goto/16 :goto_7

    .line 407
    .line 408
    :cond_a
    move/from16 v28, v16

    .line 409
    .line 410
    move/from16 v16, v2

    .line 411
    .line 412
    move/from16 v2, v28

    .line 413
    .line 414
    move/from16 v31, v1

    .line 415
    .line 416
    move/from16 v30, v3

    .line 417
    .line 418
    move/from16 v28, v4

    .line 419
    .line 420
    add-int/lit8 v0, p0, 0x1

    .line 421
    .line 422
    move/from16 v1, v16

    .line 423
    .line 424
    move/from16 v16, v2

    .line 425
    .line 426
    move v2, v1

    .line 427
    move/from16 v1, v31

    .line 428
    .line 429
    goto/16 :goto_6

    .line 430
    .line 431
    :cond_b
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 432
    .line 433
    invoke-static {v9, v13, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    const-wide v0, -0x628a0e68a836eL

    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    const/4 v10, 0x0

    .line 446
    const/4 v11, 0x0

    .line 447
    const/4 v8, 0x0

    .line 448
    move v12, v9

    .line 449
    move-object/from16 v7, v17

    .line 450
    .line 451
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 452
    .line 453
    .line 454
    return-object v6
.end method

.method public static ᲇᲈᛵᛷ(Landroid/media/Image;Lyyds/ᛸᛴᛶ;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x23

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p1}, Lyyds/ᛵᛱᛷᛷ;->ᲇᲇᲇᛱ(Landroid/media/Image;Lyyds/ᛸᛴᛶ;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p1, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-wide v2, -0x6287be68a836eL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lyyds/ᲈᛷᛵᛷ;->ᛶᲈᛴᲈ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :goto_0
    const-wide v1, -0x62886e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-wide v1, -0x62899e68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {p1, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    return-object v0
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Ljava/io/File;Ljava/util/ArrayList;)Lyyds/ᛴᲀᛶᛱ;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Landroid/media/MediaMetadataRetriever;

    .line 10
    .line 11
    invoke-direct {v4}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v6, Lyyds/ᛵᛴᛴᛳ;

    .line 15
    .line 16
    invoke-direct {v6, v1}, Lyyds/ᛵᛴᛴᛳ;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6}, Lyyds/ᛵᛴᛴᛳ;->ᛲᛴᛳᛲ()Lyyds/ᲁᲇᛷᛳ;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    const/4 v8, 0x1

    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    iget v9, v7, Lyyds/ᲁᲇᛷᛳ;->ᛲᲈᲁ:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto/16 :goto_11

    .line 31
    .line 32
    :catch_0
    move-exception v0

    .line 33
    const/16 v17, 0x0

    .line 34
    .line 35
    goto/16 :goto_f

    .line 36
    .line 37
    :cond_0
    move v9, v8

    .line 38
    :goto_0
    const/16 v11, 0x14

    .line 39
    .line 40
    const-wide/32 v12, 0x3d09000

    .line 41
    .line 42
    .line 43
    const-wide/16 v14, 0x0

    .line 44
    .line 45
    const/16 v16, 0x0

    .line 46
    .line 47
    if-gt v9, v8, :cond_a

    .line 48
    .line 49
    invoke-virtual {v6}, Lyyds/ᛵᛴᛴᛳ;->ᛶᛷᛲᲁ()Lyyds/ᛲᛵᛱᛱ;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    if-eqz v6, :cond_a

    .line 54
    .line 55
    sget-object v6, Lyyds/ᛳᛶᛷᛳ;->ᛲᲈᲁ:Lyyds/ᛳᛶᛷᛳ;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lyyds/ᛳᛶᛷᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Lyyds/ᛸᲀᛲ;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-boolean v6, v1, Lyyds/ᛸᲀᛲ;->ᲀᛲᛳᲀ:Z

    .line 67
    .line 68
    if-nez v6, :cond_2

    .line 69
    .line 70
    :cond_1
    const/16 v17, 0x0

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_2
    iget-object v1, v1, Lyyds/ᛸᲀᛲ;->ᛲᲈᲁ:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    int-to-long v8, v6

    .line 81
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    int-to-long v5, v6

    .line 88
    mul-long/2addr v8, v5

    .line 89
    cmp-long v5, v8, v12

    .line 90
    .line 91
    if-lez v5, :cond_3

    .line 92
    .line 93
    :try_start_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 94
    .line 95
    .line 96
    const-wide v0, -0x62787e68a836eL

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    :try_start_2
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 109
    .line 110
    .line 111
    :catch_1
    return-object v17

    .line 112
    :catch_2
    move-exception v0

    .line 113
    goto/16 :goto_f

    .line 114
    .line 115
    :cond_3
    if-eqz v7, :cond_5

    .line 116
    .line 117
    :try_start_3
    iget-object v5, v7, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 118
    .line 119
    array-length v6, v5

    .line 120
    if-nez v6, :cond_4

    .line 121
    .line 122
    move-object/from16 v5, v17

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    aget v5, v5, v16

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    :goto_1
    if-eqz v5, :cond_5

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v16
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 137
    :cond_5
    move/from16 v5, v16

    .line 138
    .line 139
    :try_start_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    if-ge v5, v11, :cond_6

    .line 144
    .line 145
    const/16 v10, 0x64

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    move v10, v5

    .line 149
    :goto_2
    filled-new-array {v10}, [I

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v0, v6, v5, v2}, Lyyds/ᛵᛱᛷᛷ;->ᛵᛸᛸᛷ(Ljava/util/List;[ILjava/io/File;)Z

    .line 154
    .line 155
    .line 156
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 157
    :try_start_5
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 158
    .line 159
    .line 160
    if-eqz v0, :cond_8

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 169
    .line 170
    .line 171
    move-result-wide v0

    .line 172
    cmp-long v0, v0, v14

    .line 173
    .line 174
    if-nez v0, :cond_7

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_7
    new-instance v5, Lyyds/ᛴᲀᛶᛱ;

    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    const/4 v9, 0x0

    .line 184
    const/16 v8, 0x8

    .line 185
    .line 186
    const/4 v10, 0x1

    .line 187
    const/4 v7, 0x1

    .line 188
    invoke-direct/range {v5 .. v10}, Lyyds/ᛴᲀᛶᛱ;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 189
    .line 190
    .line 191
    :try_start_6
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 192
    .line 193
    .line 194
    :catch_3
    return-object v5

    .line 195
    :cond_8
    :goto_3
    :try_start_7
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 196
    .line 197
    .line 198
    const-wide v0, -0x627abe68a836eL

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 208
    .line 209
    .line 210
    :try_start_8
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 211
    .line 212
    .line 213
    :catch_4
    return-object v17

    .line 214
    :catchall_1
    move-exception v0

    .line 215
    :try_start_9
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :goto_4
    if-eqz v1, :cond_9

    .line 220
    .line 221
    iget-object v0, v1, Lyyds/ᛸᲀᛲ;->ᛲᲈᲁ:Landroid/graphics/Bitmap;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 224
    .line 225
    .line 226
    :cond_9
    const-wide v0, -0x62769e68a836eL

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 236
    .line 237
    .line 238
    :try_start_a
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 239
    .line 240
    .line 241
    :catch_5
    return-object v17

    .line 242
    :cond_a
    const/16 v17, 0x0

    .line 243
    .line 244
    :try_start_b
    invoke-virtual {v4, v1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/16 v1, 0x1b

    .line 248
    .line 249
    invoke-virtual {v4, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    if-eqz v1, :cond_b

    .line 254
    .line 255
    invoke-static {v1}, Lyyds/ᛳᲇᲁᛳ;->ᛶᛳᛶᛵ(Ljava/lang/String;)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-eqz v1, :cond_b

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    :cond_b
    if-gtz v8, :cond_c

    .line 266
    .line 267
    const-wide v0, -0x627bfe68a836eL

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 277
    .line 278
    .line 279
    :try_start_c
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    .line 280
    .line 281
    .line 282
    :catch_6
    return-object v17

    .line 283
    :cond_c
    :try_start_d
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 284
    .line 285
    new-instance v5, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const-wide v18, -0x627d0e68a836eL

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    invoke-static/range {v18 .. v19}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-virtual {v1, v5}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    new-instance v1, Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 315
    .line 316
    .line 317
    new-instance v5, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 320
    .line 321
    .line 322
    move-wide/from16 v18, v14

    .line 323
    .line 324
    move/from16 v6, v16

    .line 325
    .line 326
    :goto_5
    if-ge v6, v8, :cond_13

    .line 327
    .line 328
    :try_start_e
    invoke-virtual {v4, v6}, Landroid/media/MediaMetadataRetriever;->getImageAtIndex(I)Landroid/graphics/Bitmap;

    .line 329
    .line 330
    .line 331
    move-result-object v9
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 332
    goto :goto_6

    .line 333
    :catch_7
    :try_start_f
    invoke-virtual {v4, v6}, Landroid/media/MediaMetadataRetriever;->getFrameAtIndex(I)Landroid/graphics/Bitmap;

    .line 334
    .line 335
    .line 336
    move-result-object v9
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 337
    goto :goto_6

    .line 338
    :catch_8
    move-object/from16 v9, v17

    .line 339
    .line 340
    :goto_6
    if-eqz v9, :cond_12

    .line 341
    .line 342
    :try_start_10
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    move-wide/from16 v20, v12

    .line 347
    .line 348
    int-to-long v12, v10

    .line 349
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    move-wide/from16 v22, v14

    .line 354
    .line 355
    int-to-long v14, v10

    .line 356
    mul-long/2addr v12, v14

    .line 357
    add-long v18, v12, v18

    .line 358
    .line 359
    cmp-long v10, v18, v20

    .line 360
    .line 361
    if-lez v10, :cond_e

    .line 362
    .line 363
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_d

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Landroid/graphics/Bitmap;

    .line 381
    .line 382
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_d
    const-wide v0, -0x627dfe68a836eL

    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 396
    .line 397
    .line 398
    :goto_8
    :try_start_11
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_a

    .line 399
    .line 400
    .line 401
    goto/16 :goto_10

    .line 402
    .line 403
    :cond_e
    :try_start_12
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    if-eqz v7, :cond_10

    .line 407
    .line 408
    iget-object v9, v7, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 409
    .line 410
    if-ltz v6, :cond_f

    .line 411
    .line 412
    array-length v10, v9

    .line 413
    if-ge v6, v10, :cond_f

    .line 414
    .line 415
    aget v9, v9, v6

    .line 416
    .line 417
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    goto :goto_9

    .line 422
    :cond_f
    move-object/from16 v9, v17

    .line 423
    .line 424
    :goto_9
    if-eqz v9, :cond_10

    .line 425
    .line 426
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    goto :goto_a

    .line 431
    :cond_10
    move/from16 v9, v16

    .line 432
    .line 433
    :goto_a
    if-ge v9, v11, :cond_11

    .line 434
    .line 435
    const/16 v9, 0x64

    .line 436
    .line 437
    :cond_11
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    goto :goto_b

    .line 445
    :cond_12
    move-wide/from16 v20, v12

    .line 446
    .line 447
    move-wide/from16 v22, v14

    .line 448
    .line 449
    :goto_b
    add-int/lit8 v6, v6, 0x1

    .line 450
    .line 451
    move-wide/from16 v12, v20

    .line 452
    .line 453
    move-wide/from16 v14, v22

    .line 454
    .line 455
    goto/16 :goto_5

    .line 456
    .line 457
    :cond_13
    move-wide/from16 v22, v14

    .line 458
    .line 459
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    if-eqz v6, :cond_14

    .line 464
    .line 465
    const-wide v0, -0x62803e68a836eL

    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 479
    .line 480
    .line 481
    move-result v7
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 482
    :try_start_13
    invoke-static {v5}, Lyyds/ᛷᛷᛶᲇ;->ᛳᛷᛶᛲ(Ljava/util/ArrayList;)[I

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    invoke-virtual {v0, v1, v5, v2}, Lyyds/ᛵᛱᛷᛷ;->ᛵᛸᛸᛷ(Ljava/util/List;[ILjava/io/File;)Z

    .line 487
    .line 488
    .line 489
    move-result v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 490
    :try_start_14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    if-eqz v5, :cond_15

    .line 499
    .line 500
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    check-cast v5, Landroid/graphics/Bitmap;

    .line 505
    .line 506
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 507
    .line 508
    .line 509
    goto :goto_c

    .line 510
    :cond_15
    if-eqz v0, :cond_17

    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_17

    .line 517
    .line 518
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 519
    .line 520
    .line 521
    move-result-wide v0

    .line 522
    cmp-long v0, v0, v22

    .line 523
    .line 524
    if-nez v0, :cond_16

    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_16
    new-instance v5, Lyyds/ᛴᲀᛶᛱ;

    .line 528
    .line 529
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    const/4 v9, 0x0

    .line 534
    const/16 v8, 0x8

    .line 535
    .line 536
    const/4 v10, 0x1

    .line 537
    invoke-direct/range {v5 .. v10}, Lyyds/ᛴᲀᛶᛱ;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_2
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 538
    .line 539
    .line 540
    :try_start_15
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9

    .line 541
    .line 542
    .line 543
    :catch_9
    return-object v5

    .line 544
    :cond_17
    :goto_d
    :try_start_16
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 545
    .line 546
    .line 547
    const-wide v0, -0x62818e68a836eL

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    goto/16 :goto_8

    .line 560
    .line 561
    :catchall_2
    move-exception v0

    .line 562
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    if-eqz v5, :cond_18

    .line 571
    .line 572
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    check-cast v5, Landroid/graphics/Bitmap;

    .line 577
    .line 578
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 579
    .line 580
    .line 581
    goto :goto_e

    .line 582
    :cond_18
    throw v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_2
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 583
    :goto_f
    const-wide v5, -0x6282ce68a836eL

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    :try_start_17
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    const-wide v5, -0x6283fe68a836eL

    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    invoke-static {v1, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 602
    .line 603
    .line 604
    new-instance v1, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 607
    .line 608
    .line 609
    const-wide v5, -0x6284ee68a836eL

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-result-object v5

    .line 625
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    const-wide v5, -0x6285de68a836eL

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 659
    .line 660
    .line 661
    goto/16 :goto_8

    .line 662
    .line 663
    :catch_a
    :goto_10
    return-object v17

    .line 664
    :goto_11
    :try_start_18
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_b

    .line 665
    .line 666
    .line 667
    :catch_b
    throw v0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/util/List;[ILjava/io/File;)Z
    .locals 7

    .line 1
    new-instance p0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    new-instance p3, Ljava/io/BufferedOutputStream;

    .line 7
    .line 8
    const/high16 v0, 0x10000

    .line 9
    .line 10
    invoke-direct {p3, p0, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    new-instance v1, Lyyds/ᛶᛷᲀᲁ;

    .line 15
    .line 16
    invoke-direct {v1, p3}, Lyyds/ᛶᛷᲀᲁ;-><init>(Ljava/io/BufferedOutputStream;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lyyds/ᛶᛷᲀᲁ;->ᛲᲈᲁ:Ljava/io/BufferedOutputStream;

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    iput v3, v1, Lyyds/ᛶᛷᲀᲁ;->ᛱᲈᲁ:I

    .line 24
    .line 25
    invoke-static {p1}, Lyyds/ᛵᛱᛷᛷ;->ᲀᛲᛳᲀ(Ljava/util/List;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iput-boolean v3, v1, Lyyds/ᛶᛷᲀᲁ;->ᛷᲈᲈᲁ:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    iput v3, v1, Lyyds/ᛶᛷᲀᲁ;->ᛲᛳᛶᲁ:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_5

    .line 42
    :cond_0
    :goto_0
    invoke-static {v1, p1}, Lyyds/ᛶᛷᲀᲁ;->ᛵᛸᛸᛷ(Lyyds/ᛶᛷᲀᲁ;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    const-wide v3, -0x6295fe68a836eL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const-wide v4, -0x629a2e68a836eL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    iput-boolean v3, v1, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    :try_start_2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    move v5, v0

    .line 79
    :goto_1
    if-ge v5, v4, :cond_3

    .line 80
    .line 81
    if-ltz v5, :cond_1

    .line 82
    .line 83
    array-length v6, p2

    .line 84
    if-ge v5, v6, :cond_1

    .line 85
    .line 86
    aget v6, p2, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    const/16 v6, 0x64

    .line 90
    .line 91
    :goto_2
    iput v6, v1, Lyyds/ᛶᛷᲀᲁ;->ᲇᲈᛵᛷ:I

    .line 92
    .line 93
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Landroid/graphics/Bitmap;

    .line 98
    .line 99
    invoke-virtual {v1, v6}, Lyyds/ᛶᛷᲀᲁ;->ᛲᲈᲁ(Landroid/graphics/Bitmap;)Z

    .line 100
    .line 101
    .line 102
    move-result v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    if-nez v6, :cond_2

    .line 104
    .line 105
    :catch_1
    :try_start_3
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 106
    .line 107
    .line 108
    :catch_2
    :try_start_4
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    :try_start_5
    iget-boolean p1, v1, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ:Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 116
    .line 117
    if-nez p1, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    const/16 p1, 0x3b

    .line 121
    .line 122
    :try_start_6
    invoke-virtual {v2, p1}, Ljava/io/OutputStream;->write(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 126
    .line 127
    .line 128
    iput-boolean v0, v1, Lyyds/ᛶᛷᲀᲁ;->ᛲᛴᛳᛲ:Z

    .line 129
    .line 130
    iput-boolean v3, v1, Lyyds/ᛶᛷᲀᲁ;->ᲇᲇᲇᛱ:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 131
    .line 132
    move v0, v3

    .line 133
    :catch_3
    :goto_3
    :try_start_7
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 134
    .line 135
    .line 136
    :catch_4
    :try_start_8
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :catch_5
    :goto_4
    return v0

    .line 141
    :goto_5
    const-wide v1, -0x628b2e68a836eL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    :try_start_9
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    const-wide v1, -0x628c5e68a836eL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {p2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :catch_6
    :goto_6
    return v0

    .line 164
    :goto_7
    :try_start_a
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 165
    .line 166
    .line 167
    :catch_7
    :try_start_b
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    .line 168
    .line 169
    .line 170
    :catch_8
    throw p1
.end method
