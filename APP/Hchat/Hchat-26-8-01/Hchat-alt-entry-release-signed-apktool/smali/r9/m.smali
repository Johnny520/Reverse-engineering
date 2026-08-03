.class public final synthetic Lr9/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lr9/d0;

.field public final synthetic h:Landroid/widget/TextView;

.field public final synthetic i:Landroid/view/View;

.field public final synthetic j:Lr9/q;

.field public final synthetic k:Landroid/view/View;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:I

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:Landroid/widget/RelativeLayout;


# direct methods
.method public synthetic constructor <init>(Lr9/d0;Landroid/widget/TextView;Landroid/view/View;Lr9/q;Landroid/view/View;Ljava/lang/String;IZILandroid/widget/RelativeLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/m;->g:Lr9/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/m;->h:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/m;->i:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/m;->j:Lr9/q;

    .line 11
    .line 12
    iput-object p5, p0, Lr9/m;->k:Landroid/view/View;

    .line 13
    .line 14
    iput-object p6, p0, Lr9/m;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput p7, p0, Lr9/m;->m:I

    .line 17
    .line 18
    iput-boolean p8, p0, Lr9/m;->n:Z

    .line 19
    .line 20
    iput p9, p0, Lr9/m;->o:I

    .line 21
    .line 22
    iput-object p10, p0, Lr9/m;->p:Landroid/widget/RelativeLayout;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v3, v1, Lr9/m;->g:Lr9/d0;

    .line 4
    .line 5
    iget-object v4, v1, Lr9/m;->h:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object v5, v1, Lr9/m;->i:Landroid/view/View;

    .line 8
    .line 9
    iget-object v6, v1, Lr9/m;->j:Lr9/q;

    .line 10
    .line 11
    iget-object v7, v1, Lr9/m;->k:Landroid/view/View;

    .line 12
    .line 13
    iget-object v8, v1, Lr9/m;->l:Ljava/lang/String;

    .line 14
    .line 15
    iget v9, v1, Lr9/m;->m:I

    .line 16
    .line 17
    iget-boolean v10, v1, Lr9/m;->n:Z

    .line 18
    .line 19
    iget v0, v1, Lr9/m;->o:I

    .line 20
    .line 21
    iget-object v2, v1, Lr9/m;->p:Landroid/widget/RelativeLayout;

    .line 22
    .line 23
    const/4 v13, 0x2

    .line 24
    if-lt v0, v13, :cond_0

    .line 25
    .line 26
    const/4 v14, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v14, 0x0

    .line 29
    :goto_0
    iget-object v15, v6, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 30
    .line 31
    move/from16 v16, v13

    .line 32
    .line 33
    iget-object v13, v6, Lr9/q;->b:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    if-ne v12, v15, :cond_1

    .line 40
    .line 41
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    if-lez v12, :cond_1

    .line 46
    .line 47
    iget-boolean v12, v6, Lr9/q;->c:Z

    .line 48
    .line 49
    if-nez v12, :cond_2

    .line 50
    .line 51
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    if-gtz v12, :cond_2

    .line 56
    .line 57
    :cond_1
    move-object/from16 v18, v2

    .line 58
    .line 59
    move-object/from16 v20, v5

    .line 60
    .line 61
    move-object/from16 v21, v7

    .line 62
    .line 63
    move/from16 v19, v9

    .line 64
    .line 65
    move/from16 v22, v10

    .line 66
    .line 67
    goto/16 :goto_13

    .line 68
    .line 69
    :cond_2
    const/4 v12, 0x0

    .line 70
    invoke-static {v12, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    invoke-static {v12, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v4, v11, v1}, Landroid/view/View;->measure(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    if-lez v1, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const/4 v11, 0x0

    .line 93
    :goto_1
    if-eqz v11, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    if-lez v1, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    const/4 v11, 0x0

    .line 108
    :goto_2
    if-eqz v11, :cond_8

    .line 109
    .line 110
    instance-of v1, v5, Landroid/view/ViewGroup;

    .line 111
    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    invoke-static {v15, v5}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    new-instance v1, Landroid/graphics/Rect;

    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    move-object v12, v5

    .line 127
    check-cast v12, Landroid/view/ViewGroup;

    .line 128
    .line 129
    move-object/from16 v18, v2

    .line 130
    .line 131
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    move/from16 v19, v9

    .line 136
    .line 137
    const/4 v9, 0x1

    .line 138
    if-ge v2, v9, :cond_6

    .line 139
    .line 140
    const/4 v2, 0x1

    .line 141
    :cond_6
    const/4 v9, 0x0

    .line 142
    invoke-direct {v1, v9, v9, v11, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 143
    .line 144
    .line 145
    if-eq v5, v15, :cond_7

    .line 146
    .line 147
    invoke-virtual {v12, v15, v1}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-lez v2, :cond_9

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_8
    move-object/from16 v18, v2

    .line 158
    .line 159
    move/from16 v19, v9

    .line 160
    .line 161
    :cond_9
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-lez v1, :cond_a

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_a
    const/4 v2, 0x0

    .line 173
    :goto_3
    if-eqz v2, :cond_b

    .line 174
    .line 175
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    goto :goto_6

    .line 180
    :cond_b
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-lez v1, :cond_c

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_c
    const/4 v2, 0x0

    .line 192
    :goto_5
    if-eqz v2, :cond_e

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :goto_6
    new-instance v2, Landroid/graphics/Rect;

    .line 196
    .line 197
    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    const/4 v11, 0x1

    .line 202
    if-ge v9, v11, :cond_d

    .line 203
    .line 204
    const/4 v9, 0x1

    .line 205
    :cond_d
    const/4 v12, 0x0

    .line 206
    invoke-direct {v2, v12, v12, v1, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 207
    .line 208
    .line 209
    move-object v1, v2

    .line 210
    goto :goto_7

    .line 211
    :cond_e
    const/4 v1, 0x0

    .line 212
    :goto_7
    if-eqz v1, :cond_22

    .line 213
    .line 214
    if-ne v13, v15, :cond_f

    .line 215
    .line 216
    new-instance v2, Landroid/graphics/Rect;

    .line 217
    .line 218
    invoke-virtual {v15}, Landroid/view/View;->getPaddingLeft()I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    invoke-virtual {v15}, Landroid/view/View;->getPaddingTop()I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    sub-int/2addr v12, v13

    .line 235
    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    invoke-virtual {v15}, Landroid/view/View;->getPaddingBottom()I

    .line 240
    .line 241
    .line 242
    move-result v20

    .line 243
    sub-int v13, v13, v20

    .line 244
    .line 245
    invoke-direct {v2, v9, v11, v12, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_f
    new-instance v2, Landroid/graphics/Rect;

    .line 250
    .line 251
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    const/4 v12, 0x0

    .line 260
    invoke-direct {v2, v12, v12, v9, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v15, v13, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 264
    .line 265
    .line 266
    :goto_8
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    instance-of v11, v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 271
    .line 272
    if-eqz v11, :cond_10

    .line 273
    .line 274
    check-cast v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_10
    const/4 v9, 0x0

    .line 278
    :goto_9
    if-eqz v9, :cond_21

    .line 279
    .line 280
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    iget v12, v1, Landroid/graphics/Rect;->left:I

    .line 285
    .line 286
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 287
    .line 288
    sub-int/2addr v1, v11

    .line 289
    if-ge v1, v12, :cond_11

    .line 290
    .line 291
    move v1, v12

    .line 292
    :cond_11
    if-eqz v7, :cond_13

    .line 293
    .line 294
    iget-boolean v13, v6, Lr9/q;->c:Z

    .line 295
    .line 296
    if-eqz v13, :cond_12

    .line 297
    .line 298
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 299
    .line 300
    .line 301
    move-result v13

    .line 302
    if-lez v13, :cond_12

    .line 303
    .line 304
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    if-lez v13, :cond_12

    .line 309
    .line 310
    invoke-static {v7, v15}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    if-eqz v13, :cond_12

    .line 315
    .line 316
    move-object v13, v7

    .line 317
    goto :goto_a

    .line 318
    :cond_12
    const/4 v13, 0x0

    .line 319
    :goto_a
    if-eqz v13, :cond_13

    .line 320
    .line 321
    move-object/from16 v20, v5

    .line 322
    .line 323
    new-instance v5, Landroid/graphics/Rect;

    .line 324
    .line 325
    move-object/from16 v21, v7

    .line 326
    .line 327
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    move/from16 v22, v10

    .line 332
    .line 333
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    move/from16 v23, v14

    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    invoke-direct {v5, v14, v14, v7, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v15, v13, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 344
    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_13
    move-object/from16 v20, v5

    .line 348
    .line 349
    move-object/from16 v21, v7

    .line 350
    .line 351
    move/from16 v22, v10

    .line 352
    .line 353
    move/from16 v23, v14

    .line 354
    .line 355
    const/4 v5, 0x0

    .line 356
    :goto_b
    iget-boolean v7, v6, Lr9/q;->c:Z

    .line 357
    .line 358
    if-eqz v7, :cond_17

    .line 359
    .line 360
    if-eqz v22, :cond_15

    .line 361
    .line 362
    if-eqz v5, :cond_14

    .line 363
    .line 364
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 365
    .line 366
    sub-int/2addr v5, v11

    .line 367
    goto :goto_c

    .line 368
    :cond_14
    move v5, v1

    .line 369
    :goto_c
    invoke-static {v5, v12, v1}, Lr9/e0;->r(III)I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    goto :goto_e

    .line 374
    :cond_15
    if-eqz v5, :cond_16

    .line 375
    .line 376
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 377
    .line 378
    goto :goto_d

    .line 379
    :cond_16
    move v5, v12

    .line 380
    :goto_d
    invoke-static {v5, v12, v1}, Lr9/e0;->r(III)I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    goto :goto_e

    .line 385
    :cond_17
    iget v5, v2, Landroid/graphics/Rect;->left:I

    .line 386
    .line 387
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    sub-int/2addr v7, v11

    .line 392
    div-int/lit8 v7, v7, 0x2

    .line 393
    .line 394
    add-int/2addr v7, v5

    .line 395
    invoke-static {v7, v12, v1}, Lr9/e0;->r(III)I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    :goto_e
    const-string v5, "avatar_above"

    .line 400
    .line 401
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    if-eqz v5, :cond_18

    .line 406
    .line 407
    iget v5, v2, Landroid/graphics/Rect;->top:I

    .line 408
    .line 409
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    sub-int/2addr v5, v7

    .line 414
    sub-int v5, v5, v19

    .line 415
    .line 416
    goto :goto_f

    .line 417
    :cond_18
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    .line 418
    .line 419
    add-int v5, v5, v19

    .line 420
    .line 421
    :goto_f
    const-string v7, "avatar_below"

    .line 422
    .line 423
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    if-eqz v7, :cond_1b

    .line 428
    .line 429
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    add-int/2addr v7, v5

    .line 434
    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    sub-int/2addr v7, v10

    .line 439
    if-lez v7, :cond_1b

    .line 440
    .line 441
    if-gtz v7, :cond_19

    .line 442
    .line 443
    goto :goto_10

    .line 444
    :cond_19
    iget-object v10, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 445
    .line 446
    monitor-enter v10

    .line 447
    :try_start_0
    iget-object v12, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 448
    .line 449
    invoke-virtual {v12, v15}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v12

    .line 453
    check-cast v12, Lr9/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 454
    .line 455
    monitor-exit v10

    .line 456
    if-eqz v12, :cond_1b

    .line 457
    .line 458
    iget v10, v12, Lr9/s;->d:I

    .line 459
    .line 460
    iget v13, v12, Lr9/s;->b:I

    .line 461
    .line 462
    if-eq v10, v13, :cond_1a

    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_1a
    add-int/2addr v10, v7

    .line 466
    const/16 v1, 0x37

    .line 467
    .line 468
    const/4 v9, 0x0

    .line 469
    invoke-static {v12, v9, v10, v1}, Lr9/s;->a(Lr9/s;III)Lr9/s;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual {v15}, Landroid/view/View;->getPaddingLeft()I

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    iget v5, v1, Lr9/s;->c:I

    .line 478
    .line 479
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    iget v9, v1, Lr9/s;->d:I

    .line 484
    .line 485
    invoke-virtual {v15, v2, v5, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 486
    .line 487
    .line 488
    iget-object v2, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 489
    .line 490
    monitor-enter v2

    .line 491
    :try_start_1
    iget-object v5, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 492
    .line 493
    invoke-virtual {v5, v15, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 494
    .line 495
    .line 496
    monitor-exit v2

    .line 497
    sget-object v1, Lr9/t;->h:Lr9/t;

    .line 498
    .line 499
    goto/16 :goto_14

    .line 500
    .line 501
    :catchall_0
    move-exception v0

    .line 502
    monitor-exit v2

    .line 503
    throw v0

    .line 504
    :catchall_1
    move-exception v0

    .line 505
    monitor-exit v10

    .line 506
    throw v0

    .line 507
    :cond_1b
    :goto_10
    if-gez v5, :cond_1e

    .line 508
    .line 509
    const-string v7, "avatar_above"

    .line 510
    .line 511
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v7

    .line 515
    if-eqz v7, :cond_1e

    .line 516
    .line 517
    if-nez v23, :cond_1e

    .line 518
    .line 519
    neg-int v1, v5

    .line 520
    if-gtz v1, :cond_1c

    .line 521
    .line 522
    goto :goto_11

    .line 523
    :cond_1c
    iget-object v2, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 524
    .line 525
    monitor-enter v2

    .line 526
    :try_start_2
    iget-object v5, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 527
    .line 528
    invoke-virtual {v5, v15}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    check-cast v5, Lr9/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 533
    .line 534
    monitor-exit v2

    .line 535
    if-eqz v5, :cond_1d

    .line 536
    .line 537
    iget v2, v5, Lr9/s;->c:I

    .line 538
    .line 539
    add-int/2addr v2, v1

    .line 540
    const/16 v1, 0x3b

    .line 541
    .line 542
    const/4 v12, 0x0

    .line 543
    invoke-static {v5, v2, v12, v1}, Lr9/s;->a(Lr9/s;III)Lr9/s;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v15}, Landroid/view/View;->getPaddingLeft()I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    iget v5, v1, Lr9/s;->c:I

    .line 552
    .line 553
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    iget v9, v1, Lr9/s;->d:I

    .line 558
    .line 559
    invoke-virtual {v15, v2, v5, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 560
    .line 561
    .line 562
    iget-object v2, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 563
    .line 564
    monitor-enter v2

    .line 565
    :try_start_3
    iget-object v5, v3, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 566
    .line 567
    invoke-virtual {v5, v15, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 568
    .line 569
    .line 570
    monitor-exit v2

    .line 571
    sget-object v1, Lr9/t;->h:Lr9/t;

    .line 572
    .line 573
    goto :goto_14

    .line 574
    :catchall_2
    move-exception v0

    .line 575
    monitor-exit v2

    .line 576
    throw v0

    .line 577
    :cond_1d
    :goto_11
    sget-object v1, Lr9/t;->i:Lr9/t;

    .line 578
    .line 579
    goto :goto_14

    .line 580
    :catchall_3
    move-exception v0

    .line 581
    monitor-exit v2

    .line 582
    throw v0

    .line 583
    :cond_1e
    if-ltz v5, :cond_1f

    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_1f
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 587
    .line 588
    add-int v5, v2, v19

    .line 589
    .line 590
    :goto_12
    invoke-virtual {v15}, Landroid/view/View;->getPaddingLeft()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    sub-int/2addr v1, v2

    .line 595
    invoke-virtual {v15}, Landroid/view/View;->getPaddingTop()I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    sub-int/2addr v5, v2

    .line 600
    iget v2, v9, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 601
    .line 602
    if-ne v2, v11, :cond_20

    .line 603
    .line 604
    iget v2, v9, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 605
    .line 606
    if-ne v2, v1, :cond_20

    .line 607
    .line 608
    iget v2, v9, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 609
    .line 610
    if-ne v2, v5, :cond_20

    .line 611
    .line 612
    sget-object v1, Lr9/t;->g:Lr9/t;

    .line 613
    .line 614
    goto :goto_14

    .line 615
    :cond_20
    iput v11, v9, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 616
    .line 617
    iput v1, v9, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 618
    .line 619
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 620
    .line 621
    .line 622
    iput v5, v9, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 623
    .line 624
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 625
    .line 626
    .line 627
    sget-object v1, Lr9/t;->h:Lr9/t;

    .line 628
    .line 629
    goto :goto_14

    .line 630
    :cond_21
    move-object/from16 v20, v5

    .line 631
    .line 632
    move-object/from16 v21, v7

    .line 633
    .line 634
    move/from16 v22, v10

    .line 635
    .line 636
    sget-object v1, Lr9/t;->i:Lr9/t;

    .line 637
    .line 638
    goto :goto_14

    .line 639
    :cond_22
    move-object/from16 v20, v5

    .line 640
    .line 641
    move-object/from16 v21, v7

    .line 642
    .line 643
    move/from16 v22, v10

    .line 644
    .line 645
    sget-object v1, Lr9/t;->i:Lr9/t;

    .line 646
    .line 647
    goto :goto_14

    .line 648
    :goto_13
    sget-object v1, Lr9/t;->i:Lr9/t;

    .line 649
    .line 650
    :goto_14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    if-eqz v1, :cond_2b

    .line 655
    .line 656
    const/4 v2, 0x4

    .line 657
    const/4 v9, 0x1

    .line 658
    if-eq v1, v9, :cond_25

    .line 659
    .line 660
    move/from16 v5, v16

    .line 661
    .line 662
    if-ne v1, v5, :cond_24

    .line 663
    .line 664
    if-ge v0, v2, :cond_23

    .line 665
    .line 666
    add-int/lit8 v11, v0, 0x1

    .line 667
    .line 668
    iget-object v12, v6, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 669
    .line 670
    iget-object v0, v3, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 671
    .line 672
    new-instance v2, Lr9/m;

    .line 673
    .line 674
    move/from16 v9, v19

    .line 675
    .line 676
    move-object/from16 v5, v20

    .line 677
    .line 678
    move-object/from16 v7, v21

    .line 679
    .line 680
    move/from16 v10, v22

    .line 681
    .line 682
    invoke-direct/range {v2 .. v12}, Lr9/m;-><init>(Lr9/d0;Landroid/widget/TextView;Landroid/view/View;Lr9/q;Landroid/view/View;Ljava/lang/String;IZILandroid/widget/RelativeLayout;)V

    .line 683
    .line 684
    .line 685
    invoke-static {v4, v12, v0, v2}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 686
    .line 687
    .line 688
    goto/16 :goto_18

    .line 689
    .line 690
    :cond_23
    move-object/from16 v5, v20

    .line 691
    .line 692
    const/4 v1, 0x0

    .line 693
    invoke-virtual {v3, v5, v1}, Lr9/d0;->u0(Landroid/view/View;Landroid/widget/TextView;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v3, v5, v1}, Lr9/d0;->y0(Landroid/view/View;Landroid/widget/RelativeLayout;)V

    .line 697
    .line 698
    .line 699
    goto/16 :goto_18

    .line 700
    .line 701
    :cond_24
    invoke-static {}, Lokio/a;->k()V

    .line 702
    .line 703
    .line 704
    const/4 v0, 0x0

    .line 705
    return-object v0

    .line 706
    :cond_25
    move/from16 v9, v19

    .line 707
    .line 708
    move-object/from16 v5, v20

    .line 709
    .line 710
    move-object/from16 v7, v21

    .line 711
    .line 712
    move/from16 v10, v22

    .line 713
    .line 714
    const/4 v1, 0x0

    .line 715
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 716
    .line 717
    .line 718
    move-result-object v11

    .line 719
    instance-of v12, v11, Landroid/widget/RelativeLayout$LayoutParams;

    .line 720
    .line 721
    if-eqz v12, :cond_26

    .line 722
    .line 723
    check-cast v11, Landroid/widget/RelativeLayout$LayoutParams;

    .line 724
    .line 725
    goto :goto_15

    .line 726
    :cond_26
    move-object v11, v1

    .line 727
    :goto_15
    if-eqz v11, :cond_2a

    .line 728
    .line 729
    iget v12, v11, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 730
    .line 731
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 732
    .line 733
    .line 734
    move-result-object v13

    .line 735
    if-lez v12, :cond_27

    .line 736
    .line 737
    move-object v1, v13

    .line 738
    :cond_27
    if-eqz v1, :cond_28

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    goto :goto_16

    .line 745
    :cond_28
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    :goto_16
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 750
    .line 751
    .line 752
    move-result v12

    .line 753
    if-lez v1, :cond_2a

    .line 754
    .line 755
    if-gtz v12, :cond_29

    .line 756
    .line 757
    goto :goto_17

    .line 758
    :cond_29
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getPaddingLeft()I

    .line 759
    .line 760
    .line 761
    move-result v13

    .line 762
    iget v14, v11, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 763
    .line 764
    add-int/2addr v13, v14

    .line 765
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getPaddingTop()I

    .line 766
    .line 767
    .line 768
    move-result v14

    .line 769
    iget v11, v11, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 770
    .line 771
    add-int/2addr v14, v11

    .line 772
    add-int/2addr v1, v13

    .line 773
    add-int/2addr v12, v14

    .line 774
    invoke-virtual {v4, v13, v14, v1, v12}, Landroid/view/View;->layout(IIII)V

    .line 775
    .line 776
    .line 777
    :cond_2a
    :goto_17
    const/4 v12, 0x0

    .line 778
    invoke-virtual {v4, v12}, Landroid/view/View;->setVisibility(I)V

    .line 779
    .line 780
    .line 781
    if-ge v0, v2, :cond_2c

    .line 782
    .line 783
    const/16 v17, 0x1

    .line 784
    .line 785
    add-int/lit8 v11, v0, 0x1

    .line 786
    .line 787
    iget-object v12, v6, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 788
    .line 789
    iget-object v0, v3, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 790
    .line 791
    new-instance v2, Lr9/m;

    .line 792
    .line 793
    invoke-direct/range {v2 .. v12}, Lr9/m;-><init>(Lr9/d0;Landroid/widget/TextView;Landroid/view/View;Lr9/q;Landroid/view/View;Ljava/lang/String;IZILandroid/widget/RelativeLayout;)V

    .line 794
    .line 795
    .line 796
    invoke-static {v4, v12, v0, v2}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 797
    .line 798
    .line 799
    goto :goto_18

    .line 800
    :cond_2b
    const/4 v12, 0x0

    .line 801
    invoke-virtual {v4, v12}, Landroid/view/View;->setVisibility(I)V

    .line 802
    .line 803
    .line 804
    :cond_2c
    :goto_18
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 805
    .line 806
    return-object v0
.end method
