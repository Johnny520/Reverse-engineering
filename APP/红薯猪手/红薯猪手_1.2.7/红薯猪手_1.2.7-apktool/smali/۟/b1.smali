.class public final L۟/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public final ۥ۟۟:Landroid/view/ScaleGestureDetector;

.field public ۥ۟۠:Landroid/view/VelocityTracker;

.field public ۥ۟ۡ:Z

.field public ۥ۟ۢ:F

.field public ۥۣ۟:F

.field public final ۥ۟ۤ:F

.field public final ۥ۟ۥ:F

.field public ۥ۟ۦ:L۟/y6;


# direct methods
.method public constructor <init>(Landroid/content/Context;L۟/y6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, L۟/b1;->ۥ:I

    const/4 v0, 0x0

    iput v0, p0, L۟/b1;->ۥ۟:I

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, L۟/b1;->ۥ۟ۥ:F

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, L۟/b1;->ۥ۟ۤ:F

    iput-object p2, p0, L۟/b1;->ۥ۟ۦ:L۟/y6;

    new-instance p2, L۟/b1$a;

    invoke-direct {p2, p0}, L۟/b1$a;-><init>(L۟/b1;)V

    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-direct {v0, p1, p2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, L۟/b1;->ۥ۟۟:Landroid/view/ScaleGestureDetector;

    return-void
.end method


# virtual methods
.method public final ۥ(Landroid/view/MotionEvent;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    and-int/lit16 v2, v2, 0xff

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v2, :cond_14

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eq v2, v6, :cond_d

    .line 18
    .line 19
    const/4 v7, 0x2

    .line 20
    if-eq v2, v7, :cond_3

    .line 21
    .line 22
    const/4 v7, 0x3

    .line 23
    if-eq v2, v7, :cond_2

    .line 24
    .line 25
    const/4 v5, 0x6

    .line 26
    if-eq v2, v5, :cond_0

    .line 27
    .line 28
    goto/16 :goto_d

    .line 29
    .line 30
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const v5, 0xff00

    .line 35
    .line 36
    .line 37
    and-int/2addr v2, v5

    .line 38
    shr-int/lit8 v2, v2, 0x8

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget v7, v0, L۟/b1;->ۥ:I

    .line 45
    .line 46
    if-ne v5, v7, :cond_16

    .line 47
    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v6, v4

    .line 52
    :goto_0
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iput v2, v0, L۟/b1;->ۥ:I

    .line 57
    .line 58
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iput v2, v0, L۟/b1;->ۥ۟ۢ:F

    .line 63
    .line 64
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, v0, L۟/b1;->ۥۣ۟:F

    .line 69
    .line 70
    goto/16 :goto_d

    .line 71
    .line 72
    :cond_2
    iput v3, v0, L۟/b1;->ۥ:I

    .line 73
    .line 74
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 75
    .line 76
    if-eqz v2, :cond_16

    .line 77
    .line 78
    goto/16 :goto_a

    .line 79
    .line 80
    :cond_3
    :try_start_0
    iget v2, v0, L۟/b1;->ۥ۟:I

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 83
    .line 84
    .line 85
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_1

    .line 87
    :catch_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    :goto_1
    :try_start_1
    iget v5, v0, L۟/b1;->ۥ۟:I

    .line 92
    .line 93
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 94
    .line 95
    .line 96
    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    goto :goto_2

    .line 98
    :catch_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    :goto_2
    iget v8, v0, L۟/b1;->ۥ۟ۢ:F

    .line 103
    .line 104
    sub-float v8, v2, v8

    .line 105
    .line 106
    iget v9, v0, L۟/b1;->ۥۣ۟:F

    .line 107
    .line 108
    sub-float v9, v5, v9

    .line 109
    .line 110
    iget-boolean v10, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 111
    .line 112
    if-nez v10, :cond_5

    .line 113
    .line 114
    mul-float v10, v8, v8

    .line 115
    .line 116
    mul-float v11, v9, v9

    .line 117
    .line 118
    add-float/2addr v11, v10

    .line 119
    float-to-double v10, v11

    .line 120
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    iget v12, v0, L۟/b1;->ۥ۟ۤ:F

    .line 125
    .line 126
    float-to-double v12, v12

    .line 127
    cmpl-double v10, v10, v12

    .line 128
    .line 129
    if-ltz v10, :cond_4

    .line 130
    .line 131
    move v10, v6

    .line 132
    goto :goto_3

    .line 133
    :cond_4
    move v10, v4

    .line 134
    :goto_3
    iput-boolean v10, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 135
    .line 136
    :cond_5
    iget-boolean v10, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 137
    .line 138
    if-eqz v10, :cond_16

    .line 139
    .line 140
    iget-object v10, v0, L۟/b1;->ۥ۟ۦ:L۟/y6;

    .line 141
    .line 142
    check-cast v10, L۟/s7$a;

    .line 143
    .line 144
    iget-object v11, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 145
    .line 146
    iget-object v11, v11, L۟/s7;->ۥ۟ۦ:L۟/b1;

    .line 147
    .line 148
    iget-object v11, v11, L۟/b1;->ۥ۟۟:Landroid/view/ScaleGestureDetector;

    .line 149
    .line 150
    invoke-virtual {v11}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    if-eqz v11, :cond_6

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    iget-object v11, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 158
    .line 159
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v11, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 163
    .line 164
    iget-object v11, v11, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 165
    .line 166
    invoke-virtual {v11, v8, v9}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 167
    .line 168
    .line 169
    iget-object v11, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 170
    .line 171
    invoke-virtual {v11}, L۟/s7;->ۥ()V

    .line 172
    .line 173
    .line 174
    iget-object v11, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 175
    .line 176
    iget-object v11, v11, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 177
    .line 178
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    iget-object v12, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 183
    .line 184
    iget-boolean v13, v12, L۟/s7;->ۥ۟ۢ:Z

    .line 185
    .line 186
    if-eqz v13, :cond_b

    .line 187
    .line 188
    iget-object v12, v12, L۟/s7;->ۥ۟ۦ:L۟/b1;

    .line 189
    .line 190
    iget-object v12, v12, L۟/b1;->ۥ۟۟:Landroid/view/ScaleGestureDetector;

    .line 191
    .line 192
    invoke-virtual {v12}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-nez v12, :cond_b

    .line 197
    .line 198
    iget-object v10, v10, L۟/s7$a;->ۥ:L۟/s7;

    .line 199
    .line 200
    iget-boolean v12, v10, L۟/s7;->ۥۣ۟:Z

    .line 201
    .line 202
    if-nez v12, :cond_b

    .line 203
    .line 204
    iget v12, v10, L۟/s7;->ۥ۠ۥ:I

    .line 205
    .line 206
    if-eq v12, v7, :cond_a

    .line 207
    .line 208
    const/high16 v7, 0x3f800000    # 1.0f

    .line 209
    .line 210
    if-nez v12, :cond_7

    .line 211
    .line 212
    cmpl-float v13, v8, v7

    .line 213
    .line 214
    if-gez v13, :cond_a

    .line 215
    .line 216
    :cond_7
    const/high16 v13, -0x40800000    # -1.0f

    .line 217
    .line 218
    if-ne v12, v6, :cond_8

    .line 219
    .line 220
    cmpg-float v8, v8, v13

    .line 221
    .line 222
    if-lez v8, :cond_a

    .line 223
    .line 224
    :cond_8
    iget v8, v10, L۟/s7;->ۥ۠ۦ:I

    .line 225
    .line 226
    if-nez v8, :cond_9

    .line 227
    .line 228
    cmpl-float v7, v9, v7

    .line 229
    .line 230
    if-gez v7, :cond_a

    .line 231
    .line 232
    :cond_9
    if-ne v8, v6, :cond_c

    .line 233
    .line 234
    cmpg-float v6, v9, v13

    .line 235
    .line 236
    if-gtz v6, :cond_c

    .line 237
    .line 238
    :cond_a
    if-eqz v11, :cond_c

    .line 239
    .line 240
    invoke-interface {v11, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_b
    if-eqz v11, :cond_c

    .line 245
    .line 246
    invoke-interface {v11, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 247
    .line 248
    .line 249
    :cond_c
    :goto_4
    iput v2, v0, L۟/b1;->ۥ۟ۢ:F

    .line 250
    .line 251
    iput v5, v0, L۟/b1;->ۥۣ۟:F

    .line 252
    .line 253
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 254
    .line 255
    if-eqz v2, :cond_16

    .line 256
    .line 257
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_d

    .line 261
    .line 262
    :cond_d
    iput v3, v0, L۟/b1;->ۥ:I

    .line 263
    .line 264
    iget-boolean v2, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 265
    .line 266
    if-eqz v2, :cond_13

    .line 267
    .line 268
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 269
    .line 270
    if-eqz v2, :cond_13

    .line 271
    .line 272
    :try_start_2
    iget v2, v0, L۟/b1;->ۥ۟:I

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 275
    .line 276
    .line 277
    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 278
    goto :goto_5

    .line 279
    :catch_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    :goto_5
    iput v2, v0, L۟/b1;->ۥ۟ۢ:F

    .line 284
    .line 285
    :try_start_3
    iget v2, v0, L۟/b1;->ۥ۟:I

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 288
    .line 289
    .line 290
    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 291
    goto :goto_6

    .line 292
    :catch_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    :goto_6
    iput v2, v0, L۟/b1;->ۥۣ۟:F

    .line 297
    .line 298
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 299
    .line 300
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 301
    .line 302
    .line 303
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 304
    .line 305
    const/16 v6, 0x3e8

    .line 306
    .line 307
    invoke-virtual {v2, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 308
    .line 309
    .line 310
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 311
    .line 312
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    iget-object v6, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 317
    .line 318
    invoke-virtual {v6}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 327
    .line 328
    .line 329
    move-result v8

    .line 330
    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    iget v8, v0, L۟/b1;->ۥ۟ۥ:F

    .line 335
    .line 336
    cmpl-float v7, v7, v8

    .line 337
    .line 338
    if-ltz v7, :cond_13

    .line 339
    .line 340
    iget-object v7, v0, L۟/b1;->ۥ۟ۦ:L۟/y6;

    .line 341
    .line 342
    neg-float v2, v2

    .line 343
    neg-float v6, v6

    .line 344
    check-cast v7, L۟/s7$a;

    .line 345
    .line 346
    iget-object v8, v7, L۟/s7$a;->ۥ:L۟/s7;

    .line 347
    .line 348
    new-instance v9, L۟/s7$f;

    .line 349
    .line 350
    iget-object v10, v8, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 351
    .line 352
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 353
    .line 354
    .line 355
    move-result-object v10

    .line 356
    invoke-direct {v9, v8, v10}, L۟/s7$f;-><init>(L۟/s7;Landroid/content/Context;)V

    .line 357
    .line 358
    .line 359
    iput-object v9, v8, L۟/s7;->ۥ۠ۤ:L۟/s7$f;

    .line 360
    .line 361
    iget-object v8, v7, L۟/s7$a;->ۥ:L۟/s7;

    .line 362
    .line 363
    iget-object v9, v8, L۟/s7;->ۥ۠ۤ:L۟/s7$f;

    .line 364
    .line 365
    iget-object v8, v8, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 366
    .line 367
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    sub-int/2addr v10, v11

    .line 376
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    sub-int/2addr v10, v8

    .line 381
    iget-object v8, v7, L۟/s7$a;->ۥ:L۟/s7;

    .line 382
    .line 383
    iget-object v8, v8, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 384
    .line 385
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    invoke-virtual {v8}, Landroid/view/View;->getPaddingTop()I

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    sub-int/2addr v11, v12

    .line 394
    invoke-virtual {v8}, Landroid/view/View;->getPaddingBottom()I

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    sub-int/2addr v11, v8

    .line 399
    float-to-int v15, v2

    .line 400
    float-to-int v2, v6

    .line 401
    iget-object v6, v9, L۟/s7$f;->ۥ۟۠:L۟/s7;

    .line 402
    .line 403
    invoke-virtual {v6}, L۟/s7;->ۥ۟۟()Landroid/graphics/RectF;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    if-nez v6, :cond_e

    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_e
    iget v8, v6, Landroid/graphics/RectF;->left:F

    .line 411
    .line 412
    neg-float v8, v8

    .line 413
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    int-to-float v8, v10

    .line 418
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    cmpg-float v10, v8, v10

    .line 423
    .line 424
    if-gez v10, :cond_f

    .line 425
    .line 426
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    sub-float/2addr v10, v8

    .line 431
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    move/from16 v17, v4

    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_f
    move v8, v13

    .line 439
    move/from16 v17, v8

    .line 440
    .line 441
    :goto_7
    iget v10, v6, Landroid/graphics/RectF;->top:F

    .line 442
    .line 443
    neg-float v10, v10

    .line 444
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 445
    .line 446
    .line 447
    move-result v14

    .line 448
    int-to-float v10, v11

    .line 449
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    cmpg-float v11, v10, v11

    .line 454
    .line 455
    if-gez v11, :cond_10

    .line 456
    .line 457
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    sub-float/2addr v6, v10

    .line 462
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    move/from16 v19, v4

    .line 467
    .line 468
    goto :goto_8

    .line 469
    :cond_10
    move v6, v14

    .line 470
    move/from16 v19, v6

    .line 471
    .line 472
    :goto_8
    iput v13, v9, L۟/s7$f;->ۥ۟:I

    .line 473
    .line 474
    iput v14, v9, L۟/s7$f;->ۥ۟۟:I

    .line 475
    .line 476
    if-ne v13, v8, :cond_11

    .line 477
    .line 478
    if-eq v14, v6, :cond_12

    .line 479
    .line 480
    :cond_11
    iget-object v12, v9, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    .line 481
    .line 482
    const/16 v21, 0x0

    .line 483
    .line 484
    const/16 v22, 0x0

    .line 485
    .line 486
    move/from16 v16, v2

    .line 487
    .line 488
    move/from16 v18, v8

    .line 489
    .line 490
    move/from16 v20, v6

    .line 491
    .line 492
    invoke-virtual/range {v12 .. v22}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 493
    .line 494
    .line 495
    :cond_12
    :goto_9
    iget-object v2, v7, L۟/s7$a;->ۥ:L۟/s7;

    .line 496
    .line 497
    iget-object v6, v2, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 498
    .line 499
    iget-object v2, v2, L۟/s7;->ۥ۠ۤ:L۟/s7$f;

    .line 500
    .line 501
    invoke-virtual {v6, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 502
    .line 503
    .line 504
    :cond_13
    iget-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 505
    .line 506
    if-eqz v2, :cond_16

    .line 507
    .line 508
    :goto_a
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    .line 509
    .line 510
    .line 511
    iput-object v5, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 512
    .line 513
    goto :goto_d

    .line 514
    :cond_14
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    iput v2, v0, L۟/b1;->ۥ:I

    .line 519
    .line 520
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    iput-object v2, v0, L۟/b1;->ۥ۟۠:Landroid/view/VelocityTracker;

    .line 525
    .line 526
    if-eqz v2, :cond_15

    .line 527
    .line 528
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 529
    .line 530
    .line 531
    :cond_15
    :try_start_4
    iget v2, v0, L۟/b1;->ۥ۟:I

    .line 532
    .line 533
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 534
    .line 535
    .line 536
    move-result v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 537
    goto :goto_b

    .line 538
    :catch_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    :goto_b
    iput v2, v0, L۟/b1;->ۥ۟ۢ:F

    .line 543
    .line 544
    :try_start_5
    iget v2, v0, L۟/b1;->ۥ۟:I

    .line 545
    .line 546
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 547
    .line 548
    .line 549
    move-result v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 550
    goto :goto_c

    .line 551
    :catch_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    :goto_c
    iput v2, v0, L۟/b1;->ۥۣ۟:F

    .line 556
    .line 557
    iput-boolean v4, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 558
    .line 559
    :cond_16
    :goto_d
    iget v2, v0, L۟/b1;->ۥ:I

    .line 560
    .line 561
    if-eq v2, v3, :cond_17

    .line 562
    .line 563
    move v4, v2

    .line 564
    :cond_17
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    iput v1, v0, L۟/b1;->ۥ۟:I

    .line 569
    .line 570
    return-void
.end method
