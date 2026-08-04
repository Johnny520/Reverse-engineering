.class public abstract Lyyds/ᛸᲈᛴᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛸᲈᛴᛱ;->ᛲᲈᲁ:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x2

    .line 15
    if-eq v3, v5, :cond_0

    .line 16
    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ne v3, v5, :cond_27

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v6, "selector"

    .line 27
    .line 28
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_26

    .line 33
    .line 34
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    add-int/2addr v3, v4

    .line 39
    const/16 v6, 0x14

    .line 40
    .line 41
    new-array v7, v6, [[I

    .line 42
    .line 43
    new-array v6, v6, [I

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    move v9, v8

    .line 47
    :goto_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eq v10, v4, :cond_25

    .line 52
    .line 53
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    const/4 v12, 0x3

    .line 58
    if-ge v11, v3, :cond_1

    .line 59
    .line 60
    if-eq v10, v12, :cond_25

    .line 61
    .line 62
    :cond_1
    if-ne v10, v5, :cond_2

    .line 63
    .line 64
    if-gt v11, v3, :cond_2

    .line 65
    .line 66
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    const-string v11, "item"

    .line 71
    .line 72
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_3

    .line 77
    .line 78
    :cond_2
    move-object/from16 v33, v2

    .line 79
    .line 80
    move/from16 v35, v3

    .line 81
    .line 82
    move/from16 v16, v4

    .line 83
    .line 84
    move/from16 v17, v5

    .line 85
    .line 86
    goto/16 :goto_1b

    .line 87
    .line 88
    :cond_3
    sget-object v10, Lyyds/ᛵᛲᛱᲀ;->ᛲᲈᲁ:[I

    .line 89
    .line 90
    if-nez v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0, v2, v10}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {v1, v2, v10, v8, v8}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    :goto_2
    const/4 v11, -0x1

    .line 102
    invoke-virtual {v10, v8, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    const v14, -0xff01

    .line 107
    .line 108
    .line 109
    const/16 v15, 0x1f

    .line 110
    .line 111
    if-eq v13, v11, :cond_7

    .line 112
    .line 113
    sget-object v11, Lyyds/ᛸᲈᛴᛱ;->ᛲᲈᲁ:Ljava/lang/ThreadLocal;

    .line 114
    .line 115
    invoke-virtual {v11}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v16

    .line 119
    check-cast v16, Landroid/util/TypedValue;

    .line 120
    .line 121
    if-nez v16, :cond_5

    .line 122
    .line 123
    new-instance v5, Landroid/util/TypedValue;

    .line 124
    .line 125
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move-object/from16 v5, v16

    .line 133
    .line 134
    :goto_3
    invoke-virtual {v0, v13, v5, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 135
    .line 136
    .line 137
    iget v5, v5, Landroid/util/TypedValue;->type:I

    .line 138
    .line 139
    const/16 v11, 0x1c

    .line 140
    .line 141
    if-lt v5, v11, :cond_6

    .line 142
    .line 143
    if-gt v5, v15, :cond_6

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    :try_start_0
    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-static {v0, v5, v1}, Lyyds/ᛸᲈᛴᛱ;->ᛲᲈᲁ(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v5}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 155
    .line 156
    .line 157
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    goto :goto_5

    .line 159
    :catch_0
    invoke-virtual {v10, v8, v14}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    :goto_4
    invoke-virtual {v10, v8, v14}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    :goto_5
    invoke-virtual {v10, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    const/high16 v13, 0x3f800000    # 1.0f

    .line 173
    .line 174
    if-eqz v11, :cond_8

    .line 175
    .line 176
    invoke-virtual {v10, v4, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    goto :goto_6

    .line 181
    :cond_8
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    if-eqz v11, :cond_9

    .line 186
    .line 187
    invoke-virtual {v10, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    goto :goto_6

    .line 192
    :cond_9
    move v11, v13

    .line 193
    :goto_6
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 194
    .line 195
    const/4 v14, 0x4

    .line 196
    move/from16 v16, v4

    .line 197
    .line 198
    const/high16 v4, -0x40800000    # -1.0f

    .line 199
    .line 200
    if-lt v12, v15, :cond_a

    .line 201
    .line 202
    const/4 v12, 0x2

    .line 203
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    if-eqz v15, :cond_a

    .line 208
    .line 209
    invoke-virtual {v10, v12, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    goto :goto_7

    .line 214
    :cond_a
    invoke-virtual {v10, v14, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    :goto_7
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v2}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    new-array v12, v10, [I

    .line 226
    .line 227
    move v15, v8

    .line 228
    move/from16 v18, v13

    .line 229
    .line 230
    move v13, v15

    .line 231
    :goto_8
    if-ge v15, v10, :cond_d

    .line 232
    .line 233
    invoke-interface {v2, v15}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    const v8, 0x10101a5

    .line 238
    .line 239
    .line 240
    if-eq v14, v8, :cond_c

    .line 241
    .line 242
    const v8, 0x101031f

    .line 243
    .line 244
    .line 245
    if-eq v14, v8, :cond_c

    .line 246
    .line 247
    const v8, 0x6604002b

    .line 248
    .line 249
    .line 250
    if-eq v14, v8, :cond_c

    .line 251
    .line 252
    const v8, 0x6604019a

    .line 253
    .line 254
    .line 255
    if-eq v14, v8, :cond_c

    .line 256
    .line 257
    add-int/lit8 v8, v13, 0x1

    .line 258
    .line 259
    const/4 v0, 0x0

    .line 260
    invoke-interface {v2, v15, v0}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result v20

    .line 264
    if-eqz v20, :cond_b

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_b
    neg-int v14, v14

    .line 268
    :goto_9
    aput v14, v12, v13

    .line 269
    .line 270
    move v13, v8

    .line 271
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 272
    .line 273
    move-object/from16 v0, p0

    .line 274
    .line 275
    const/4 v8, 0x0

    .line 276
    const/4 v14, 0x4

    .line 277
    goto :goto_8

    .line 278
    :cond_d
    invoke-static {v12, v13}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const/4 v8, 0x0

    .line 283
    cmpl-float v10, v4, v8

    .line 284
    .line 285
    const/high16 v12, 0x42c80000    # 100.0f

    .line 286
    .line 287
    if-ltz v10, :cond_e

    .line 288
    .line 289
    cmpg-float v10, v4, v12

    .line 290
    .line 291
    if-gtz v10, :cond_e

    .line 292
    .line 293
    move/from16 v10, v16

    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_e
    const/4 v10, 0x0

    .line 297
    :goto_a
    cmpl-float v13, v11, v18

    .line 298
    .line 299
    if-nez v13, :cond_f

    .line 300
    .line 301
    if-nez v10, :cond_f

    .line 302
    .line 303
    move-object/from16 v31, v0

    .line 304
    .line 305
    move-object/from16 v33, v2

    .line 306
    .line 307
    move/from16 v35, v3

    .line 308
    .line 309
    const/16 v17, 0x2

    .line 310
    .line 311
    goto/16 :goto_18

    .line 312
    .line 313
    :cond_f
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 314
    .line 315
    .line 316
    move-result v13

    .line 317
    int-to-float v13, v13

    .line 318
    mul-float/2addr v13, v11

    .line 319
    const/high16 v11, 0x3f000000    # 0.5f

    .line 320
    .line 321
    add-float/2addr v13, v11

    .line 322
    float-to-int v11, v13

    .line 323
    if-gez v11, :cond_10

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    goto :goto_b

    .line 327
    :cond_10
    const/16 v13, 0xff

    .line 328
    .line 329
    if-le v11, v13, :cond_11

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_11
    move v13, v11

    .line 333
    :goto_b
    if-eqz v10, :cond_20

    .line 334
    .line 335
    invoke-static {v5}, Lyyds/ᲇᲁᲈᛷ;->ᛲᲈᲁ(I)Lyyds/ᲇᲁᲈᛷ;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    iget v10, v5, Lyyds/ᲇᲁᲈᛷ;->ᛲᲈᲁ:F

    .line 340
    .line 341
    iget v5, v5, Lyyds/ᲇᲁᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 342
    .line 343
    sget-object v11, Lyyds/ᛷᛸᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛷᛸᛷᛷ;

    .line 344
    .line 345
    float-to-double v14, v5

    .line 346
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 347
    .line 348
    cmpg-double v14, v14, v20

    .line 349
    .line 350
    if-ltz v14, :cond_12

    .line 351
    .line 352
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 353
    .line 354
    .line 355
    move-result v14

    .line 356
    int-to-double v14, v14

    .line 357
    const-wide/16 v20, 0x0

    .line 358
    .line 359
    cmpg-double v14, v14, v20

    .line 360
    .line 361
    if-lez v14, :cond_12

    .line 362
    .line 363
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 364
    .line 365
    .line 366
    move-result v14

    .line 367
    int-to-double v14, v14

    .line 368
    const-wide/high16 v20, 0x4059000000000000L    # 100.0

    .line 369
    .line 370
    cmpl-double v14, v14, v20

    .line 371
    .line 372
    if-ltz v14, :cond_13

    .line 373
    .line 374
    :cond_12
    move-object/from16 v31, v0

    .line 375
    .line 376
    move-object/from16 v33, v2

    .line 377
    .line 378
    move/from16 v35, v3

    .line 379
    .line 380
    const/16 v17, 0x2

    .line 381
    .line 382
    goto/16 :goto_16

    .line 383
    .line 384
    :cond_13
    cmpg-float v14, v10, v8

    .line 385
    .line 386
    if-gez v14, :cond_14

    .line 387
    .line 388
    move v10, v8

    .line 389
    goto :goto_c

    .line 390
    :cond_14
    const/high16 v14, 0x43b40000    # 360.0f

    .line 391
    .line 392
    invoke-static {v14, v10}, Ljava/lang/Math;->min(FF)F

    .line 393
    .line 394
    .line 395
    move-result v10

    .line 396
    :goto_c
    move v15, v5

    .line 397
    move/from16 v21, v8

    .line 398
    .line 399
    move/from16 v22, v21

    .line 400
    .line 401
    move/from16 v20, v16

    .line 402
    .line 403
    const/4 v8, 0x0

    .line 404
    :goto_d
    sub-float v23, v21, v5

    .line 405
    .line 406
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    .line 407
    .line 408
    .line 409
    move-result v23

    .line 410
    const v24, 0x3ecccccd    # 0.4f

    .line 411
    .line 412
    .line 413
    cmpl-float v23, v23, v24

    .line 414
    .line 415
    if-ltz v23, :cond_1e

    .line 416
    .line 417
    const/high16 v23, 0x447a0000    # 1000.0f

    .line 418
    .line 419
    move/from16 v26, v12

    .line 420
    .line 421
    move/from16 v25, v22

    .line 422
    .line 423
    move/from16 v24, v23

    .line 424
    .line 425
    const/16 v27, 0x0

    .line 426
    .line 427
    :goto_e
    sub-float v28, v25, v26

    .line 428
    .line 429
    invoke-static/range {v28 .. v28}, Ljava/lang/Math;->abs(F)F

    .line 430
    .line 431
    .line 432
    move-result v28

    .line 433
    const v29, 0x3c23d70a    # 0.01f

    .line 434
    .line 435
    .line 436
    cmpl-float v28, v28, v29

    .line 437
    .line 438
    const/high16 v29, 0x40000000    # 2.0f

    .line 439
    .line 440
    if-lez v28, :cond_1a

    .line 441
    .line 442
    sub-float v28, v26, v25

    .line 443
    .line 444
    div-float v28, v28, v29

    .line 445
    .line 446
    move/from16 v30, v12

    .line 447
    .line 448
    add-float v12, v28, v25

    .line 449
    .line 450
    invoke-static {v12, v15, v10}, Lyyds/ᲇᲁᲈᛷ;->ᛵᛸᛸᛷ(FFF)Lyyds/ᲇᲁᲈᛷ;

    .line 451
    .line 452
    .line 453
    move-result-object v14

    .line 454
    move-object/from16 v31, v0

    .line 455
    .line 456
    sget-object v0, Lyyds/ᛷᛸᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛷᛸᛷᛷ;

    .line 457
    .line 458
    invoke-virtual {v14, v0}, Lyyds/ᲇᲁᲈᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛷᛷ;)I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 463
    .line 464
    .line 465
    move-result v14

    .line 466
    invoke-static {v14}, Lyyds/ᛸᛳᛷᛳ;->ᛶᛳᛶᛵ(I)F

    .line 467
    .line 468
    .line 469
    move-result v14

    .line 470
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 471
    .line 472
    .line 473
    move-result v32

    .line 474
    invoke-static/range {v32 .. v32}, Lyyds/ᛸᛳᛷᛳ;->ᛶᛳᛶᛵ(I)F

    .line 475
    .line 476
    .line 477
    move-result v32

    .line 478
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 479
    .line 480
    .line 481
    move-result v33

    .line 482
    invoke-static/range {v33 .. v33}, Lyyds/ᛸᛳᛷᛳ;->ᛶᛳᛶᛵ(I)F

    .line 483
    .line 484
    .line 485
    move-result v33

    .line 486
    sget-object v34, Lyyds/ᛸᛳᛷᛳ;->ᲇᲈᛵᛷ:[[F

    .line 487
    .line 488
    aget-object v34, v34, v16

    .line 489
    .line 490
    const/16 v19, 0x0

    .line 491
    .line 492
    aget v35, v34, v19

    .line 493
    .line 494
    mul-float v14, v14, v35

    .line 495
    .line 496
    aget v35, v34, v16

    .line 497
    .line 498
    mul-float v32, v32, v35

    .line 499
    .line 500
    add-float v32, v32, v14

    .line 501
    .line 502
    const/16 v17, 0x2

    .line 503
    .line 504
    aget v14, v34, v17

    .line 505
    .line 506
    mul-float v33, v33, v14

    .line 507
    .line 508
    add-float v33, v33, v32

    .line 509
    .line 510
    div-float v14, v33, v30

    .line 511
    .line 512
    const v32, 0x3c111aa7

    .line 513
    .line 514
    .line 515
    cmpg-float v32, v14, v32

    .line 516
    .line 517
    if-gtz v32, :cond_15

    .line 518
    .line 519
    const v32, 0x4461d2f7

    .line 520
    .line 521
    .line 522
    mul-float v14, v14, v32

    .line 523
    .line 524
    move/from16 v32, v0

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_15
    move/from16 v32, v0

    .line 528
    .line 529
    float-to-double v0, v14

    .line 530
    invoke-static {v0, v1}, Ljava/lang/Math;->cbrt(D)D

    .line 531
    .line 532
    .line 533
    move-result-wide v0

    .line 534
    double-to-float v0, v0

    .line 535
    const/high16 v1, 0x42e80000    # 116.0f

    .line 536
    .line 537
    mul-float/2addr v0, v1

    .line 538
    const/high16 v1, 0x41800000    # 16.0f

    .line 539
    .line 540
    sub-float v14, v0, v1

    .line 541
    .line 542
    :goto_f
    sub-float v0, v4, v14

    .line 543
    .line 544
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    const v1, 0x3e4ccccd    # 0.2f

    .line 549
    .line 550
    .line 551
    cmpg-float v1, v0, v1

    .line 552
    .line 553
    if-gez v1, :cond_16

    .line 554
    .line 555
    invoke-static/range {v32 .. v32}, Lyyds/ᲇᲁᲈᛷ;->ᛲᲈᲁ(I)Lyyds/ᲇᲁᲈᛷ;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    move/from16 v32, v0

    .line 560
    .line 561
    iget v0, v1, Lyyds/ᲇᲁᲈᛷ;->ᲀᛲᛳᲀ:F

    .line 562
    .line 563
    move-object/from16 v33, v2

    .line 564
    .line 565
    iget v2, v1, Lyyds/ᲇᲁᲈᛷ;->ᛵᛸᛸᛷ:F

    .line 566
    .line 567
    invoke-static {v0, v2, v10}, Lyyds/ᲇᲁᲈᛷ;->ᛵᛸᛸᛷ(FFF)Lyyds/ᲇᲁᲈᛷ;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget v2, v1, Lyyds/ᲇᲁᲈᛷ;->ᲇᲈᛵᛷ:F

    .line 572
    .line 573
    move/from16 v34, v2

    .line 574
    .line 575
    iget v2, v0, Lyyds/ᲇᲁᲈᛷ;->ᲇᲈᛵᛷ:F

    .line 576
    .line 577
    sub-float v2, v34, v2

    .line 578
    .line 579
    move/from16 v34, v2

    .line 580
    .line 581
    iget v2, v1, Lyyds/ᲇᲁᲈᛷ;->ᛲᛴᛳᛲ:F

    .line 582
    .line 583
    move/from16 v35, v2

    .line 584
    .line 585
    iget v2, v0, Lyyds/ᲇᲁᲈᛷ;->ᛲᛴᛳᛲ:F

    .line 586
    .line 587
    sub-float v2, v35, v2

    .line 588
    .line 589
    move/from16 v35, v2

    .line 590
    .line 591
    iget v2, v1, Lyyds/ᲇᲁᲈᛷ;->ᲇᲇᲇᛱ:F

    .line 592
    .line 593
    iget v0, v0, Lyyds/ᲇᲁᲈᛷ;->ᲇᲇᲇᛱ:F

    .line 594
    .line 595
    sub-float/2addr v2, v0

    .line 596
    mul-float v0, v34, v34

    .line 597
    .line 598
    mul-float v34, v35, v35

    .line 599
    .line 600
    add-float v34, v34, v0

    .line 601
    .line 602
    mul-float/2addr v2, v2

    .line 603
    add-float v2, v2, v34

    .line 604
    .line 605
    move-object/from16 v34, v1

    .line 606
    .line 607
    float-to-double v0, v2

    .line 608
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 609
    .line 610
    .line 611
    move-result-wide v0

    .line 612
    move/from16 v35, v3

    .line 613
    .line 614
    const-wide v2, 0x3fe428f5c28f5c29L    # 0.63

    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 620
    .line 621
    .line 622
    move-result-wide v0

    .line 623
    const-wide v2, 0x3ff68f5c28f5c28fL    # 1.41

    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    mul-double/2addr v0, v2

    .line 629
    double-to-float v0, v0

    .line 630
    cmpg-float v1, v0, v18

    .line 631
    .line 632
    if-gtz v1, :cond_17

    .line 633
    .line 634
    move/from16 v24, v0

    .line 635
    .line 636
    move/from16 v23, v32

    .line 637
    .line 638
    move-object/from16 v27, v34

    .line 639
    .line 640
    goto :goto_10

    .line 641
    :cond_16
    move-object/from16 v33, v2

    .line 642
    .line 643
    move/from16 v35, v3

    .line 644
    .line 645
    :cond_17
    :goto_10
    cmpl-float v0, v23, v22

    .line 646
    .line 647
    if-nez v0, :cond_18

    .line 648
    .line 649
    cmpl-float v0, v24, v22

    .line 650
    .line 651
    if-nez v0, :cond_18

    .line 652
    .line 653
    :goto_11
    move-object/from16 v0, v27

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :cond_18
    cmpg-float v0, v14, v4

    .line 657
    .line 658
    if-gez v0, :cond_19

    .line 659
    .line 660
    move/from16 v25, v12

    .line 661
    .line 662
    goto :goto_12

    .line 663
    :cond_19
    move/from16 v26, v12

    .line 664
    .line 665
    :goto_12
    move-object/from16 v1, p2

    .line 666
    .line 667
    move/from16 v12, v30

    .line 668
    .line 669
    move-object/from16 v0, v31

    .line 670
    .line 671
    move-object/from16 v2, v33

    .line 672
    .line 673
    move/from16 v3, v35

    .line 674
    .line 675
    goto/16 :goto_e

    .line 676
    .line 677
    :cond_1a
    move-object/from16 v31, v0

    .line 678
    .line 679
    move-object/from16 v33, v2

    .line 680
    .line 681
    move/from16 v35, v3

    .line 682
    .line 683
    move/from16 v30, v12

    .line 684
    .line 685
    const/16 v17, 0x2

    .line 686
    .line 687
    goto :goto_11

    .line 688
    :goto_13
    if-eqz v20, :cond_1c

    .line 689
    .line 690
    if-eqz v0, :cond_1b

    .line 691
    .line 692
    invoke-virtual {v0, v11}, Lyyds/ᲇᲁᲈᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛷᛷ;)I

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    :goto_14
    move v5, v0

    .line 697
    goto :goto_17

    .line 698
    :cond_1b
    sub-float v0, v5, v21

    .line 699
    .line 700
    div-float v0, v0, v29

    .line 701
    .line 702
    add-float v15, v0, v21

    .line 703
    .line 704
    move-object/from16 v1, p2

    .line 705
    .line 706
    move/from16 v12, v30

    .line 707
    .line 708
    move-object/from16 v0, v31

    .line 709
    .line 710
    move-object/from16 v2, v33

    .line 711
    .line 712
    move/from16 v3, v35

    .line 713
    .line 714
    const/16 v20, 0x0

    .line 715
    .line 716
    goto/16 :goto_d

    .line 717
    .line 718
    :cond_1c
    if-nez v0, :cond_1d

    .line 719
    .line 720
    move v5, v15

    .line 721
    goto :goto_15

    .line 722
    :cond_1d
    move-object v8, v0

    .line 723
    move/from16 v21, v15

    .line 724
    .line 725
    :goto_15
    sub-float v0, v5, v21

    .line 726
    .line 727
    div-float v0, v0, v29

    .line 728
    .line 729
    add-float v15, v0, v21

    .line 730
    .line 731
    move-object/from16 v1, p2

    .line 732
    .line 733
    move/from16 v12, v30

    .line 734
    .line 735
    move-object/from16 v0, v31

    .line 736
    .line 737
    move-object/from16 v2, v33

    .line 738
    .line 739
    move/from16 v3, v35

    .line 740
    .line 741
    goto/16 :goto_d

    .line 742
    .line 743
    :cond_1e
    move-object/from16 v31, v0

    .line 744
    .line 745
    move-object/from16 v33, v2

    .line 746
    .line 747
    move/from16 v35, v3

    .line 748
    .line 749
    const/16 v17, 0x2

    .line 750
    .line 751
    if-nez v8, :cond_1f

    .line 752
    .line 753
    invoke-static {v4}, Lyyds/ᛸᛳᛷᛳ;->ᛱᛳᲇ(F)I

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    goto :goto_14

    .line 758
    :cond_1f
    invoke-virtual {v8, v11}, Lyyds/ᲇᲁᲈᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛷᛷ;)I

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    goto :goto_14

    .line 763
    :goto_16
    invoke-static {v4}, Lyyds/ᛸᛳᛷᛳ;->ᛱᛳᲇ(F)I

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    goto :goto_14

    .line 768
    :cond_20
    move-object/from16 v31, v0

    .line 769
    .line 770
    move-object/from16 v33, v2

    .line 771
    .line 772
    move/from16 v35, v3

    .line 773
    .line 774
    const/16 v17, 0x2

    .line 775
    .line 776
    :goto_17
    const v0, 0xffffff

    .line 777
    .line 778
    .line 779
    and-int/2addr v0, v5

    .line 780
    shl-int/lit8 v1, v13, 0x18

    .line 781
    .line 782
    or-int v5, v0, v1

    .line 783
    .line 784
    :goto_18
    add-int/lit8 v0, v9, 0x1

    .line 785
    .line 786
    array-length v1, v6

    .line 787
    const/16 v2, 0x8

    .line 788
    .line 789
    if-le v0, v1, :cond_22

    .line 790
    .line 791
    const/4 v1, 0x4

    .line 792
    if-gt v9, v1, :cond_21

    .line 793
    .line 794
    move v1, v2

    .line 795
    goto :goto_19

    .line 796
    :cond_21
    mul-int/lit8 v1, v9, 0x2

    .line 797
    .line 798
    :goto_19
    new-array v1, v1, [I

    .line 799
    .line 800
    const/4 v3, 0x0

    .line 801
    invoke-static {v6, v3, v1, v3, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 802
    .line 803
    .line 804
    move-object v6, v1

    .line 805
    :cond_22
    aput v5, v6, v9

    .line 806
    .line 807
    array-length v1, v7

    .line 808
    if-le v0, v1, :cond_24

    .line 809
    .line 810
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    const/4 v3, 0x4

    .line 819
    if-gt v9, v3, :cond_23

    .line 820
    .line 821
    goto :goto_1a

    .line 822
    :cond_23
    mul-int/lit8 v2, v9, 0x2

    .line 823
    .line 824
    :goto_1a
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    check-cast v1, [Ljava/lang/Object;

    .line 829
    .line 830
    const/4 v3, 0x0

    .line 831
    invoke-static {v7, v3, v1, v3, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 832
    .line 833
    .line 834
    move-object v7, v1

    .line 835
    :cond_24
    aput-object v31, v7, v9

    .line 836
    .line 837
    check-cast v7, [[I

    .line 838
    .line 839
    move-object/from16 v1, p2

    .line 840
    .line 841
    move v9, v0

    .line 842
    move/from16 v4, v16

    .line 843
    .line 844
    move/from16 v5, v17

    .line 845
    .line 846
    move-object/from16 v2, v33

    .line 847
    .line 848
    move/from16 v3, v35

    .line 849
    .line 850
    const/4 v8, 0x0

    .line 851
    move-object/from16 v0, p0

    .line 852
    .line 853
    goto/16 :goto_1

    .line 854
    .line 855
    :goto_1b
    move-object/from16 v0, p0

    .line 856
    .line 857
    move-object/from16 v1, p2

    .line 858
    .line 859
    move/from16 v4, v16

    .line 860
    .line 861
    move/from16 v5, v17

    .line 862
    .line 863
    move-object/from16 v2, v33

    .line 864
    .line 865
    move/from16 v3, v35

    .line 866
    .line 867
    const/4 v8, 0x0

    .line 868
    goto/16 :goto_1

    .line 869
    .line 870
    :cond_25
    new-array v0, v9, [I

    .line 871
    .line 872
    new-array v1, v9, [[I

    .line 873
    .line 874
    const/4 v3, 0x0

    .line 875
    invoke-static {v6, v3, v0, v3, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 876
    .line 877
    .line 878
    invoke-static {v7, v3, v1, v3, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 879
    .line 880
    .line 881
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 882
    .line 883
    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 884
    .line 885
    .line 886
    return-object v2

    .line 887
    :cond_26
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 888
    .line 889
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    new-instance v2, Ljava/lang/StringBuilder;

    .line 894
    .line 895
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    const-string v1, ": invalid color state list tag "

    .line 902
    .line 903
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    throw v0

    .line 917
    :cond_27
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 918
    .line 919
    const-string v1, "No start tag found"

    .line 920
    .line 921
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    throw v0
.end method
