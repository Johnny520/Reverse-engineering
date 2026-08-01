.class public final Lnm1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ε:I

.field public ζ:I

.field public η:Landroid/widget/OverScroller;

.field public θ:Landroid/view/animation/Interpolator;

.field public ι:Z

.field public κ:Z

.field public final synthetic λ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->ц:Lrl1;

    .line 7
    .line 8
    iput-object v0, p0, Lnm1;->θ:Landroid/view/animation/Interpolator;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lnm1;->ι:Z

    .line 12
    .line 13
    iput-boolean v1, p0, Lnm1;->κ:Z

    .line 14
    .line 15
    new-instance v1, Landroid/widget/OverScroller;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-object v0, p0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v7, 0x0

    .line 19
    iput-boolean v7, p0, Lnm1;->κ:Z

    .line 20
    .line 21
    const/4 v8, 0x1

    .line 22
    iput-boolean v8, p0, Lnm1;->ι:Z

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ε()V

    .line 25
    .line 26
    .line 27
    iget-object v9, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 28
    .line 29
    invoke-virtual {v9}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v10, 0x2

    .line 34
    if-eqz v1, :cond_17

    .line 35
    .line 36
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getCurrX()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getCurrY()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget v3, p0, Lnm1;->ε:I

    .line 45
    .line 46
    sub-int v3, v1, v3

    .line 47
    .line 48
    iget v4, p0, Lnm1;->ζ:I

    .line 49
    .line 50
    sub-int v4, v2, v4

    .line 51
    .line 52
    iput v1, p0, Lnm1;->ε:I

    .line 53
    .line 54
    iput v2, p0, Lnm1;->ζ:I

    .line 55
    .line 56
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 57
    .line 58
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-static {v3, v1, v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->δ(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 69
    .line 70
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-static {v4, v2, v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->δ(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 81
    .line 82
    aput v7, v4, v7

    .line 83
    .line 84
    aput v7, v4, v8

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v3, 0x1

    .line 88
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->η(III[I[I)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    aget v3, v6, v7

    .line 95
    .line 96
    sub-int/2addr v1, v3

    .line 97
    aget v3, v6, v8

    .line 98
    .line 99
    sub-int/2addr v2, v3

    .line 100
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eq v3, v10, :cond_2

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->γ(II)V

    .line 107
    .line 108
    .line 109
    :cond_2
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_3

    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 118
    .line 119
    .line 120
    :cond_3
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 121
    .line 122
    aput v7, v5, v7

    .line 123
    .line 124
    aput v7, v5, v8

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v3, 0x1

    .line 128
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->θ(III[I[I)V

    .line 129
    .line 130
    .line 131
    aget v3, v6, v7

    .line 132
    .line 133
    sub-int/2addr v1, v3

    .line 134
    aget v3, v6, v8

    .line 135
    .line 136
    sub-int/2addr v2, v3

    .line 137
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->α(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_4

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 144
    .line 145
    .line 146
    :cond_4
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getCurrX()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getFinalX()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-ne v3, v4, :cond_5

    .line 155
    .line 156
    move v3, v8

    .line 157
    goto :goto_0

    .line 158
    :cond_5
    move v3, v7

    .line 159
    :goto_0
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getCurrY()I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getFinalY()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-ne v4, v5, :cond_6

    .line 168
    .line 169
    move v4, v8

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    move v4, v7

    .line 172
    :goto_1
    invoke-virtual {v9}, Landroid/widget/OverScroller;->isFinished()Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-nez v5, :cond_9

    .line 177
    .line 178
    if-nez v3, :cond_7

    .line 179
    .line 180
    if-eqz v1, :cond_8

    .line 181
    .line 182
    :cond_7
    if-nez v4, :cond_9

    .line 183
    .line 184
    if-eqz v2, :cond_8

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_8
    move v3, v7

    .line 188
    goto :goto_3

    .line 189
    :cond_9
    :goto_2
    move v3, v8

    .line 190
    :goto_3
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 191
    .line 192
    iget-object v4, v4, Lzl1;->ε:Lds0;

    .line 193
    .line 194
    if-eqz v4, :cond_a

    .line 195
    .line 196
    iget-boolean v4, v4, Lds0;->δ:Z

    .line 197
    .line 198
    if-eqz v4, :cond_a

    .line 199
    .line 200
    goto/16 :goto_8

    .line 201
    .line 202
    :cond_a
    if-eqz v3, :cond_15

    .line 203
    .line 204
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eq v3, v10, :cond_14

    .line 209
    .line 210
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getCurrVelocity()F

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    float-to-int v3, v3

    .line 215
    if-gez v1, :cond_b

    .line 216
    .line 217
    neg-int v1, v3

    .line 218
    goto :goto_4

    .line 219
    :cond_b
    if-lez v1, :cond_c

    .line 220
    .line 221
    move v1, v3

    .line 222
    goto :goto_4

    .line 223
    :cond_c
    move v1, v7

    .line 224
    :goto_4
    if-gez v2, :cond_d

    .line 225
    .line 226
    neg-int v3, v3

    .line 227
    goto :goto_5

    .line 228
    :cond_d
    if-lez v2, :cond_e

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_e
    move v3, v7

    .line 232
    :goto_5
    if-gez v1, :cond_f

    .line 233
    .line 234
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->κ()V

    .line 235
    .line 236
    .line 237
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 238
    .line 239
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_10

    .line 244
    .line 245
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 246
    .line 247
    neg-int v4, v1

    .line 248
    invoke-virtual {v2, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_f
    if-lez v1, :cond_10

    .line 253
    .line 254
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->λ()V

    .line 255
    .line 256
    .line 257
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 258
    .line 259
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_10

    .line 264
    .line 265
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 266
    .line 267
    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 268
    .line 269
    .line 270
    :cond_10
    :goto_6
    if-gez v3, :cond_11

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->μ()V

    .line 273
    .line 274
    .line 275
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 276
    .line 277
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_12

    .line 282
    .line 283
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 284
    .line 285
    neg-int v4, v3

    .line 286
    invoke-virtual {v2, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_11
    if-lez v3, :cond_12

    .line 291
    .line 292
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ι()V

    .line 293
    .line 294
    .line 295
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 296
    .line 297
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_12

    .line 302
    .line 303
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 304
    .line 305
    invoke-virtual {v2, v3}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 306
    .line 307
    .line 308
    :cond_12
    :goto_7
    if-nez v1, :cond_13

    .line 309
    .line 310
    if-eqz v3, :cond_14

    .line 311
    .line 312
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 313
    .line 314
    .line 315
    :cond_14
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 316
    .line 317
    if-eqz v1, :cond_16

    .line 318
    .line 319
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->г:Lb90;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iput v7, v1, Lb90;->γ:I

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_15
    :goto_8
    invoke-virtual {p0}, Lnm1;->β()V

    .line 328
    .line 329
    .line 330
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 331
    .line 332
    if-eqz v1, :cond_16

    .line 333
    .line 334
    invoke-virtual {v1, v0, v7, v7}, Ld90;->α(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 335
    .line 336
    .line 337
    :cond_16
    :goto_9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 338
    .line 339
    const/16 v2, 0x23

    .line 340
    .line 341
    if-lt v1, v2, :cond_17

    .line 342
    .line 343
    invoke-virtual {v9}, Landroid/widget/OverScroller;->getCurrVelocity()F

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-static {v0, v1}, Lul1;->α(Landroid/view/View;F)V

    .line 352
    .line 353
    .line 354
    :cond_17
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 355
    .line 356
    iget-object v1, v1, Lzl1;->ε:Lds0;

    .line 357
    .line 358
    if-eqz v1, :cond_34

    .line 359
    .line 360
    iget-boolean v2, v1, Lds0;->δ:Z

    .line 361
    .line 362
    if-eqz v2, :cond_34

    .line 363
    .line 364
    iget-object v2, v1, Lds0;->η:Lim1;

    .line 365
    .line 366
    iget-object v3, v1, Lds0;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 367
    .line 368
    iget v4, v1, Lds0;->α:I

    .line 369
    .line 370
    const/4 v5, -0x1

    .line 371
    if-eq v4, v5, :cond_18

    .line 372
    .line 373
    if-nez v3, :cond_19

    .line 374
    .line 375
    :cond_18
    invoke-virtual {v1}, Lds0;->δ()V

    .line 376
    .line 377
    .line 378
    :cond_19
    iget-boolean v4, v1, Lds0;->δ:Z

    .line 379
    .line 380
    const/4 v6, 0x0

    .line 381
    if-eqz v4, :cond_1f

    .line 382
    .line 383
    iget-object v4, v1, Lds0;->ζ:Landroid/view/View;

    .line 384
    .line 385
    if-nez v4, :cond_1f

    .line 386
    .line 387
    iget-object v4, v1, Lds0;->γ:Lzl1;

    .line 388
    .line 389
    if-eqz v4, :cond_1f

    .line 390
    .line 391
    iget v4, v1, Lds0;->α:I

    .line 392
    .line 393
    invoke-virtual {v1, v4}, Lds0;->γ(I)Landroid/graphics/PointF;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    if-eqz v4, :cond_1f

    .line 398
    .line 399
    iget v9, v4, Landroid/graphics/PointF;->x:F

    .line 400
    .line 401
    cmpl-float v11, v9, v6

    .line 402
    .line 403
    if-nez v11, :cond_1a

    .line 404
    .line 405
    iget v11, v4, Landroid/graphics/PointF;->y:F

    .line 406
    .line 407
    cmpl-float v11, v11, v6

    .line 408
    .line 409
    if-eqz v11, :cond_1f

    .line 410
    .line 411
    :cond_1a
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    float-to-int v9, v9

    .line 416
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 417
    .line 418
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    float-to-int v4, v4

    .line 423
    iget-object v11, v3, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 424
    .line 425
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->Η()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->φ()V

    .line 429
    .line 430
    .line 431
    const-string v12, "RV Scroll"

    .line 432
    .line 433
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    iget-object v12, v3, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 437
    .line 438
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 439
    .line 440
    .line 441
    move-result v13

    .line 442
    if-ne v13, v10, :cond_1b

    .line 443
    .line 444
    iget-object v10, v3, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 445
    .line 446
    iget-object v10, v10, Lnm1;->η:Landroid/widget/OverScroller;

    .line 447
    .line 448
    invoke-virtual {v10}, Landroid/widget/OverScroller;->getFinalX()I

    .line 449
    .line 450
    .line 451
    invoke-virtual {v10}, Landroid/widget/OverScroller;->getCurrX()I

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10}, Landroid/widget/OverScroller;->getFinalY()I

    .line 458
    .line 459
    .line 460
    invoke-virtual {v10}, Landroid/widget/OverScroller;->getCurrY()I

    .line 461
    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_1b
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    :goto_a
    if-eqz v9, :cond_1c

    .line 468
    .line 469
    iget-object v10, v3, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 470
    .line 471
    invoke-virtual {v10, v9, v11, v12}, Lzl1;->Τ(ILfm1;Lkm1;)I

    .line 472
    .line 473
    .line 474
    :cond_1c
    if-eqz v4, :cond_1d

    .line 475
    .line 476
    iget-object v9, v3, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 477
    .line 478
    invoke-virtual {v9, v4, v11, v12}, Lzl1;->Φ(ILfm1;Lkm1;)I

    .line 479
    .line 480
    .line 481
    :cond_1d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 482
    .line 483
    .line 484
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 485
    .line 486
    invoke-virtual {v4}, Lm6;->χ()I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    move v9, v7

    .line 491
    :goto_b
    if-ge v9, v4, :cond_1e

    .line 492
    .line 493
    iget-object v10, v3, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 494
    .line 495
    invoke-virtual {v10, v9}, Lm6;->φ(I)Landroid/view/View;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    invoke-virtual {v3, v10}, Landroidx/recyclerview/widget/RecyclerView;->ρ(Landroid/view/View;)V

    .line 500
    .line 501
    .line 502
    add-int/lit8 v9, v9, 0x1

    .line 503
    .line 504
    goto :goto_b

    .line 505
    :cond_1e
    invoke-virtual {v3, v8}, Landroidx/recyclerview/widget/RecyclerView;->χ(Z)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v3, v7}, Landroidx/recyclerview/widget/RecyclerView;->Ι(Z)V

    .line 509
    .line 510
    .line 511
    :cond_1f
    iput-boolean v7, v1, Lds0;->δ:Z

    .line 512
    .line 513
    iget-object v4, v1, Lds0;->ζ:Landroid/view/View;

    .line 514
    .line 515
    if-eqz v4, :cond_2c

    .line 516
    .line 517
    iget-object v9, v1, Lds0;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 518
    .line 519
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    iget v4, v1, Lds0;->α:I

    .line 526
    .line 527
    if-ne v5, v4, :cond_2b

    .line 528
    .line 529
    iget-object v4, v1, Lds0;->ζ:Landroid/view/View;

    .line 530
    .line 531
    iget-object v9, v3, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 532
    .line 533
    iget-object v9, v1, Lds0;->λ:Landroid/graphics/PointF;

    .line 534
    .line 535
    if-eqz v9, :cond_22

    .line 536
    .line 537
    iget v9, v9, Landroid/graphics/PointF;->x:F

    .line 538
    .line 539
    cmpl-float v9, v9, v6

    .line 540
    .line 541
    if-nez v9, :cond_20

    .line 542
    .line 543
    goto :goto_c

    .line 544
    :cond_20
    if-lez v9, :cond_21

    .line 545
    .line 546
    move v9, v8

    .line 547
    goto :goto_d

    .line 548
    :cond_21
    move v9, v5

    .line 549
    goto :goto_d

    .line 550
    :cond_22
    :goto_c
    move v9, v7

    .line 551
    :goto_d
    iget-object v10, v1, Lds0;->γ:Lzl1;

    .line 552
    .line 553
    if-eqz v10, :cond_24

    .line 554
    .line 555
    invoke-virtual {v10}, Lzl1;->γ()Z

    .line 556
    .line 557
    .line 558
    move-result v11

    .line 559
    if-nez v11, :cond_23

    .line 560
    .line 561
    goto :goto_e

    .line 562
    :cond_23
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 563
    .line 564
    .line 565
    move-result-object v11

    .line 566
    check-cast v11, Lam1;

    .line 567
    .line 568
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 569
    .line 570
    .line 571
    move-result v12

    .line 572
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 573
    .line 574
    .line 575
    move-result-object v13

    .line 576
    check-cast v13, Lam1;

    .line 577
    .line 578
    iget-object v13, v13, Lam1;->α:Landroid/graphics/Rect;

    .line 579
    .line 580
    iget v13, v13, Landroid/graphics/Rect;->left:I

    .line 581
    .line 582
    sub-int/2addr v12, v13

    .line 583
    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 584
    .line 585
    sub-int/2addr v12, v13

    .line 586
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 587
    .line 588
    .line 589
    move-result v13

    .line 590
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 591
    .line 592
    .line 593
    move-result-object v14

    .line 594
    check-cast v14, Lam1;

    .line 595
    .line 596
    iget-object v14, v14, Lam1;->α:Landroid/graphics/Rect;

    .line 597
    .line 598
    iget v14, v14, Landroid/graphics/Rect;->right:I

    .line 599
    .line 600
    add-int/2addr v13, v14

    .line 601
    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 602
    .line 603
    add-int/2addr v13, v11

    .line 604
    invoke-virtual {v10}, Lzl1;->φ()I

    .line 605
    .line 606
    .line 607
    move-result v11

    .line 608
    iget v14, v10, Lzl1;->ι:I

    .line 609
    .line 610
    invoke-virtual {v10}, Lzl1;->χ()I

    .line 611
    .line 612
    .line 613
    move-result v10

    .line 614
    sub-int/2addr v14, v10

    .line 615
    invoke-static {v12, v13, v11, v14, v9}, Lds0;->α(IIIII)I

    .line 616
    .line 617
    .line 618
    move-result v9

    .line 619
    goto :goto_f

    .line 620
    :cond_24
    :goto_e
    move v9, v7

    .line 621
    :goto_f
    iget-object v10, v1, Lds0;->λ:Landroid/graphics/PointF;

    .line 622
    .line 623
    if-eqz v10, :cond_26

    .line 624
    .line 625
    iget v10, v10, Landroid/graphics/PointF;->y:F

    .line 626
    .line 627
    cmpl-float v10, v10, v6

    .line 628
    .line 629
    if-nez v10, :cond_25

    .line 630
    .line 631
    goto :goto_10

    .line 632
    :cond_25
    if-lez v10, :cond_27

    .line 633
    .line 634
    move v5, v8

    .line 635
    goto :goto_11

    .line 636
    :cond_26
    :goto_10
    move v5, v7

    .line 637
    :cond_27
    :goto_11
    iget-object v10, v1, Lds0;->γ:Lzl1;

    .line 638
    .line 639
    if-eqz v10, :cond_29

    .line 640
    .line 641
    invoke-virtual {v10}, Lzl1;->δ()Z

    .line 642
    .line 643
    .line 644
    move-result v11

    .line 645
    if-nez v11, :cond_28

    .line 646
    .line 647
    goto :goto_12

    .line 648
    :cond_28
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 649
    .line 650
    .line 651
    move-result-object v11

    .line 652
    check-cast v11, Lam1;

    .line 653
    .line 654
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 655
    .line 656
    .line 657
    move-result v12

    .line 658
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 659
    .line 660
    .line 661
    move-result-object v13

    .line 662
    check-cast v13, Lam1;

    .line 663
    .line 664
    iget-object v13, v13, Lam1;->α:Landroid/graphics/Rect;

    .line 665
    .line 666
    iget v13, v13, Landroid/graphics/Rect;->top:I

    .line 667
    .line 668
    sub-int/2addr v12, v13

    .line 669
    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 670
    .line 671
    sub-int/2addr v12, v13

    .line 672
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 673
    .line 674
    .line 675
    move-result v13

    .line 676
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    check-cast v4, Lam1;

    .line 681
    .line 682
    iget-object v4, v4, Lam1;->α:Landroid/graphics/Rect;

    .line 683
    .line 684
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 685
    .line 686
    add-int/2addr v13, v4

    .line 687
    iget v4, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 688
    .line 689
    add-int/2addr v13, v4

    .line 690
    invoke-virtual {v10}, Lzl1;->ψ()I

    .line 691
    .line 692
    .line 693
    move-result v4

    .line 694
    iget v11, v10, Lzl1;->κ:I

    .line 695
    .line 696
    invoke-virtual {v10}, Lzl1;->υ()I

    .line 697
    .line 698
    .line 699
    move-result v10

    .line 700
    sub-int/2addr v11, v10

    .line 701
    invoke-static {v12, v13, v4, v11, v5}, Lds0;->α(IIIII)I

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    goto :goto_13

    .line 706
    :cond_29
    :goto_12
    move v4, v7

    .line 707
    :goto_13
    mul-int v5, v9, v9

    .line 708
    .line 709
    mul-int v10, v4, v4

    .line 710
    .line 711
    add-int/2addr v10, v5

    .line 712
    int-to-double v10, v10

    .line 713
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 714
    .line 715
    .line 716
    move-result-wide v10

    .line 717
    double-to-int v5, v10

    .line 718
    invoke-virtual {v1, v5}, Lds0;->β(I)I

    .line 719
    .line 720
    .line 721
    move-result v5

    .line 722
    int-to-double v10, v5

    .line 723
    const-wide v12, 0x3fd57a786c22680aL    # 0.3356

    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    div-double/2addr v10, v12

    .line 729
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 730
    .line 731
    .line 732
    move-result-wide v10

    .line 733
    double-to-int v5, v10

    .line 734
    if-lez v5, :cond_2a

    .line 735
    .line 736
    neg-int v9, v9

    .line 737
    neg-int v4, v4

    .line 738
    iget-object v10, v1, Lds0;->κ:Landroid/view/animation/DecelerateInterpolator;

    .line 739
    .line 740
    iput v9, v2, Lim1;->α:I

    .line 741
    .line 742
    iput v4, v2, Lim1;->β:I

    .line 743
    .line 744
    iput v5, v2, Lim1;->γ:I

    .line 745
    .line 746
    iput-object v10, v2, Lim1;->ε:Landroid/view/animation/Interpolator;

    .line 747
    .line 748
    iput-boolean v8, v2, Lim1;->ζ:Z

    .line 749
    .line 750
    :cond_2a
    invoke-virtual {v2, v3}, Lim1;->α(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1}, Lds0;->δ()V

    .line 754
    .line 755
    .line 756
    goto :goto_14

    .line 757
    :cond_2b
    const-string v4, "RecyclerView"

    .line 758
    .line 759
    const-string v5, "Passed over target position while smooth scrolling."

    .line 760
    .line 761
    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 762
    .line 763
    .line 764
    const/4 v4, 0x0

    .line 765
    iput-object v4, v1, Lds0;->ζ:Landroid/view/View;

    .line 766
    .line 767
    :cond_2c
    :goto_14
    iget-boolean v4, v1, Lds0;->ε:Z

    .line 768
    .line 769
    if-eqz v4, :cond_34

    .line 770
    .line 771
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 772
    .line 773
    iget-object v4, v1, Lds0;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 774
    .line 775
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 776
    .line 777
    invoke-virtual {v4}, Lzl1;->σ()I

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    if-nez v4, :cond_2d

    .line 782
    .line 783
    invoke-virtual {v1}, Lds0;->δ()V

    .line 784
    .line 785
    .line 786
    goto/16 :goto_16

    .line 787
    .line 788
    :cond_2d
    iget v4, v1, Lds0;->ο:I

    .line 789
    .line 790
    mul-int v5, v4, v4

    .line 791
    .line 792
    if-gtz v5, :cond_2e

    .line 793
    .line 794
    move v4, v7

    .line 795
    :cond_2e
    iput v4, v1, Lds0;->ο:I

    .line 796
    .line 797
    iget v5, v1, Lds0;->π:I

    .line 798
    .line 799
    mul-int v9, v5, v5

    .line 800
    .line 801
    if-gtz v9, :cond_2f

    .line 802
    .line 803
    move v5, v7

    .line 804
    :cond_2f
    iput v5, v1, Lds0;->π:I

    .line 805
    .line 806
    if-nez v4, :cond_32

    .line 807
    .line 808
    if-nez v5, :cond_32

    .line 809
    .line 810
    iget v4, v1, Lds0;->α:I

    .line 811
    .line 812
    invoke-virtual {v1, v4}, Lds0;->γ(I)Landroid/graphics/PointF;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    if-eqz v4, :cond_31

    .line 817
    .line 818
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 819
    .line 820
    cmpl-float v9, v5, v6

    .line 821
    .line 822
    if-nez v9, :cond_30

    .line 823
    .line 824
    iget v9, v4, Landroid/graphics/PointF;->y:F

    .line 825
    .line 826
    cmpl-float v6, v9, v6

    .line 827
    .line 828
    if-nez v6, :cond_30

    .line 829
    .line 830
    goto :goto_15

    .line 831
    :cond_30
    mul-float/2addr v5, v5

    .line 832
    iget v6, v4, Landroid/graphics/PointF;->y:F

    .line 833
    .line 834
    mul-float/2addr v6, v6

    .line 835
    add-float/2addr v6, v5

    .line 836
    float-to-double v5, v6

    .line 837
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 838
    .line 839
    .line 840
    move-result-wide v5

    .line 841
    double-to-float v5, v5

    .line 842
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 843
    .line 844
    div-float/2addr v6, v5

    .line 845
    iput v6, v4, Landroid/graphics/PointF;->x:F

    .line 846
    .line 847
    iget v9, v4, Landroid/graphics/PointF;->y:F

    .line 848
    .line 849
    div-float/2addr v9, v5

    .line 850
    iput v9, v4, Landroid/graphics/PointF;->y:F

    .line 851
    .line 852
    iput-object v4, v1, Lds0;->λ:Landroid/graphics/PointF;

    .line 853
    .line 854
    const v4, 0x461c4000    # 10000.0f

    .line 855
    .line 856
    .line 857
    mul-float/2addr v6, v4

    .line 858
    float-to-int v5, v6

    .line 859
    iput v5, v1, Lds0;->ο:I

    .line 860
    .line 861
    mul-float/2addr v9, v4

    .line 862
    float-to-int v4, v9

    .line 863
    iput v4, v1, Lds0;->π:I

    .line 864
    .line 865
    const/16 v4, 0x2710

    .line 866
    .line 867
    invoke-virtual {v1, v4}, Lds0;->β(I)I

    .line 868
    .line 869
    .line 870
    move-result v4

    .line 871
    iget v5, v1, Lds0;->ο:I

    .line 872
    .line 873
    int-to-float v5, v5

    .line 874
    const v6, 0x3f99999a    # 1.2f

    .line 875
    .line 876
    .line 877
    mul-float/2addr v5, v6

    .line 878
    float-to-int v5, v5

    .line 879
    iget v9, v1, Lds0;->π:I

    .line 880
    .line 881
    int-to-float v9, v9

    .line 882
    mul-float/2addr v9, v6

    .line 883
    float-to-int v9, v9

    .line 884
    int-to-float v4, v4

    .line 885
    mul-float/2addr v4, v6

    .line 886
    float-to-int v4, v4

    .line 887
    iget-object v6, v1, Lds0;->ι:Landroid/view/animation/LinearInterpolator;

    .line 888
    .line 889
    iput v5, v2, Lim1;->α:I

    .line 890
    .line 891
    iput v9, v2, Lim1;->β:I

    .line 892
    .line 893
    iput v4, v2, Lim1;->γ:I

    .line 894
    .line 895
    iput-object v6, v2, Lim1;->ε:Landroid/view/animation/Interpolator;

    .line 896
    .line 897
    iput-boolean v8, v2, Lim1;->ζ:Z

    .line 898
    .line 899
    goto :goto_16

    .line 900
    :cond_31
    :goto_15
    iget v4, v1, Lds0;->α:I

    .line 901
    .line 902
    iput v4, v2, Lim1;->δ:I

    .line 903
    .line 904
    invoke-virtual {v1}, Lds0;->δ()V

    .line 905
    .line 906
    .line 907
    :cond_32
    :goto_16
    iget v4, v2, Lim1;->δ:I

    .line 908
    .line 909
    if-ltz v4, :cond_33

    .line 910
    .line 911
    move v4, v8

    .line 912
    goto :goto_17

    .line 913
    :cond_33
    move v4, v7

    .line 914
    :goto_17
    invoke-virtual {v2, v3}, Lim1;->α(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 915
    .line 916
    .line 917
    if-eqz v4, :cond_34

    .line 918
    .line 919
    iget-boolean v2, v1, Lds0;->ε:Z

    .line 920
    .line 921
    if-eqz v2, :cond_34

    .line 922
    .line 923
    iput-boolean v8, v1, Lds0;->δ:Z

    .line 924
    .line 925
    iget-object v1, v3, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 926
    .line 927
    invoke-virtual {v1}, Lnm1;->β()V

    .line 928
    .line 929
    .line 930
    :cond_34
    iput-boolean v7, p0, Lnm1;->ι:Z

    .line 931
    .line 932
    iget-boolean v1, p0, Lnm1;->κ:Z

    .line 933
    .line 934
    if-eqz v1, :cond_35

    .line 935
    .line 936
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 937
    .line 938
    .line 939
    sget-object v1, Lb92;->α:Ljava/util/WeakHashMap;

    .line 940
    .line 941
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 942
    .line 943
    .line 944
    return-void

    .line 945
    :cond_35
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 949
    .line 950
    .line 951
    return-void
.end method

.method public final α(II)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lnm1;->ζ:I

    .line 9
    .line 10
    iput v0, p0, Lnm1;->ε:I

    .line 11
    .line 12
    iget-object v0, p0, Lnm1;->θ:Landroid/view/animation/Interpolator;

    .line 13
    .line 14
    sget-object v2, Landroidx/recyclerview/widget/RecyclerView;->ц:Lrl1;

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    iput-object v2, p0, Lnm1;->θ:Landroid/view/animation/Interpolator;

    .line 19
    .line 20
    new-instance v0, Landroid/widget/OverScroller;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 30
    .line 31
    :cond_0
    iget-object v3, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 32
    .line 33
    const/high16 v10, -0x80000000

    .line 34
    .line 35
    const v11, 0x7fffffff

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/high16 v8, -0x80000000

    .line 41
    .line 42
    const v9, 0x7fffffff

    .line 43
    .line 44
    .line 45
    move v6, p1

    .line 46
    move v7, p2

    .line 47
    invoke-virtual/range {v3 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lnm1;->β()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final β()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnm1;->ι:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lnm1;->κ:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    sget-object v1, Lb92;->α:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final γ(IIILandroid/view/animation/Interpolator;)V
    .locals 9

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    if-ne p3, v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-le p3, v0, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v1

    .line 21
    :goto_0
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    :goto_1
    if-eqz v3, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move p3, v0

    .line 36
    :goto_2
    int-to-float p3, p3

    .line 37
    int-to-float v0, v4

    .line 38
    div-float/2addr p3, v0

    .line 39
    const/high16 v0, 0x3f800000    # 1.0f

    .line 40
    .line 41
    add-float/2addr p3, v0

    .line 42
    const/high16 v0, 0x43960000    # 300.0f

    .line 43
    .line 44
    mul-float/2addr p3, v0

    .line 45
    float-to-int p3, p3

    .line 46
    const/16 v0, 0x7d0

    .line 47
    .line 48
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    :cond_3
    move v8, p3

    .line 53
    if-nez p4, :cond_4

    .line 54
    .line 55
    sget-object p4, Landroidx/recyclerview/widget/RecyclerView;->ц:Lrl1;

    .line 56
    .line 57
    :cond_4
    iget-object p3, p0, Lnm1;->θ:Landroid/view/animation/Interpolator;

    .line 58
    .line 59
    if-eq p3, p4, :cond_5

    .line 60
    .line 61
    iput-object p4, p0, Lnm1;->θ:Landroid/view/animation/Interpolator;

    .line 62
    .line 63
    new-instance p3, Landroid/widget/OverScroller;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {p3, v0, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 70
    .line 71
    .line 72
    iput-object p3, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 73
    .line 74
    :cond_5
    iput v1, p0, Lnm1;->ζ:I

    .line 75
    .line 76
    iput v1, p0, Lnm1;->ε:I

    .line 77
    .line 78
    const/4 p3, 0x2

    .line 79
    invoke-virtual {v2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 80
    .line 81
    .line 82
    iget-object v3, p0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    const/4 v5, 0x0

    .line 86
    move v6, p1

    .line 87
    move v7, p2

    .line 88
    invoke-virtual/range {v3 .. v8}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lnm1;->β()V

    .line 92
    .line 93
    .line 94
    return-void
.end method
