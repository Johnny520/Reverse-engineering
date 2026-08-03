.class public final synthetic Lk9/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lgg/r;

.field public final synthetic b:Lgg/r;

.field public final synthetic c:Lgg/s;

.field public final synthetic d:Lgg/s;

.field public final synthetic e:Lgg/s;

.field public final synthetic f:Lgg/s;

.field public final synthetic g:Lgg/q;

.field public final synthetic h:I

.field public final synthetic i:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Lgg/r;Lgg/r;Lgg/s;Lgg/s;Lgg/s;Lgg/s;Lgg/q;ILandroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk9/m;->a:Lgg/r;

    .line 5
    .line 6
    iput-object p2, p0, Lk9/m;->b:Lgg/r;

    .line 7
    .line 8
    iput-object p3, p0, Lk9/m;->c:Lgg/s;

    .line 9
    .line 10
    iput-object p4, p0, Lk9/m;->d:Lgg/s;

    .line 11
    .line 12
    iput-object p5, p0, Lk9/m;->e:Lgg/s;

    .line 13
    .line 14
    iput-object p6, p0, Lk9/m;->f:Lgg/s;

    .line 15
    .line 16
    iput-object p7, p0, Lk9/m;->g:Lgg/q;

    .line 17
    .line 18
    iput p8, p0, Lk9/m;->h:I

    .line 19
    .line 20
    iput-object p9, p0, Lk9/m;->i:Landroid/view/ViewGroup;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lk9/r;->a:Lk9/r;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    instance-of v3, v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_15

    .line 21
    .line 22
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iget-object v6, v0, Lk9/m;->a:Lgg/r;

    .line 27
    .line 28
    iget-object v7, v0, Lk9/m;->b:Lgg/r;

    .line 29
    .line 30
    iget-object v8, v0, Lk9/m;->c:Lgg/s;

    .line 31
    .line 32
    iget-object v9, v0, Lk9/m;->d:Lgg/s;

    .line 33
    .line 34
    iget-object v10, v0, Lk9/m;->e:Lgg/s;

    .line 35
    .line 36
    iget-object v11, v0, Lk9/m;->f:Lgg/s;

    .line 37
    .line 38
    iget-object v12, v0, Lk9/m;->g:Lgg/q;

    .line 39
    .line 40
    const/4 v13, 0x1

    .line 41
    if-eqz v5, :cond_10

    .line 42
    .line 43
    iget-object v14, v0, Lk9/m;->i:Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eq v5, v13, :cond_e

    .line 46
    .line 47
    const/4 v15, 0x2

    .line 48
    if-eq v5, v15, :cond_2

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    if-eq v5, v2, :cond_1

    .line 52
    .line 53
    goto/16 :goto_8

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 56
    .line 57
    .line 58
    iget-boolean v2, v12, Lgg/q;->g:Z

    .line 59
    .line 60
    if-eqz v2, :cond_d

    .line 61
    .line 62
    invoke-static {v1, v14}, Lk9/r;->l(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v14}, Lk9/r;->n(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 66
    .line 67
    .line 68
    return v13

    .line 69
    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    iget v6, v6, Lgg/r;->g:F

    .line 74
    .line 75
    sub-float/2addr v5, v6

    .line 76
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    iget v7, v7, Lgg/r;->g:F

    .line 81
    .line 82
    sub-float/2addr v6, v7

    .line 83
    iget-boolean v7, v12, Lgg/q;->g:Z

    .line 84
    .line 85
    if-nez v7, :cond_4

    .line 86
    .line 87
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    iget v15, v0, Lk9/m;->h:I

    .line 92
    .line 93
    int-to-float v15, v15

    .line 94
    cmpl-float v7, v7, v15

    .line 95
    .line 96
    if-gtz v7, :cond_3

    .line 97
    .line 98
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    cmpl-float v7, v7, v15

    .line 103
    .line 104
    if-lez v7, :cond_4

    .line 105
    .line 106
    :cond_3
    iput-boolean v13, v12, Lgg/q;->g:Z

    .line 107
    .line 108
    invoke-virtual {v1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iget-boolean v3, v12, Lgg/q;->g:Z

    .line 112
    .line 113
    if-eqz v3, :cond_d

    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const/16 v7, 0x8

    .line 123
    .line 124
    invoke-static {v3, v7}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    sub-int/2addr v7, v12

    .line 137
    sub-int/2addr v7, v3

    .line 138
    if-ge v7, v3, :cond_5

    .line 139
    .line 140
    move v7, v3

    .line 141
    :cond_5
    sget-object v12, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    check-cast v12, Landroid/view/View;

    .line 148
    .line 149
    if-eqz v12, :cond_6

    .line 150
    .line 151
    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    if-ne v15, v14, :cond_6

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_6
    const/4 v12, 0x0

    .line 159
    :goto_1
    if-eqz v12, :cond_7

    .line 160
    .line 161
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    add-int/2addr v12, v3

    .line 166
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const/16 v4, 0xa

    .line 174
    .line 175
    invoke-static {v15, v4}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    add-int/2addr v4, v12

    .line 180
    if-le v4, v7, :cond_8

    .line 181
    .line 182
    move v4, v7

    .line 183
    goto :goto_2

    .line 184
    :cond_7
    move v4, v3

    .line 185
    :cond_8
    :goto_2
    iget v12, v8, Lgg/s;->g:I

    .line 186
    .line 187
    float-to-int v5, v5

    .line 188
    add-int/2addr v12, v5

    .line 189
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    sub-int/2addr v5, v15

    .line 198
    sub-int/2addr v5, v3

    .line 199
    if-ge v5, v3, :cond_9

    .line 200
    .line 201
    move v5, v3

    .line 202
    :cond_9
    invoke-static {v12, v3, v5}, Lr9/e0;->r(III)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 207
    .line 208
    iget v3, v9, Lgg/s;->g:I

    .line 209
    .line 210
    float-to-int v5, v6

    .line 211
    add-int/2addr v3, v5

    .line 212
    invoke-static {v3, v4, v7}, Lr9/e0;->r(III)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    .line 220
    .line 221
    iget v1, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 222
    .line 223
    iget v3, v8, Lgg/s;->g:I

    .line 224
    .line 225
    sub-int/2addr v1, v3

    .line 226
    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 227
    .line 228
    iget v3, v9, Lgg/s;->g:I

    .line 229
    .line 230
    sub-int/2addr v2, v3

    .line 231
    iget v3, v10, Lgg/s;->g:I

    .line 232
    .line 233
    iget v4, v11, Lgg/s;->g:I

    .line 234
    .line 235
    sget-object v5, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, Landroid/view/View;

    .line 242
    .line 243
    if-eqz v5, :cond_d

    .line 244
    .line 245
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    instance-of v7, v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 250
    .line 251
    if-eqz v7, :cond_a

    .line 252
    .line 253
    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_a
    const/4 v6, 0x0

    .line 257
    :goto_3
    if-eqz v6, :cond_d

    .line 258
    .line 259
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    const/16 v8, 0xc

    .line 267
    .line 268
    invoke-static {v7, v8}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    add-int/2addr v3, v1

    .line 273
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    sub-int/2addr v1, v8

    .line 282
    sub-int/2addr v1, v7

    .line 283
    if-ge v1, v7, :cond_b

    .line 284
    .line 285
    move v1, v7

    .line 286
    :cond_b
    invoke-static {v3, v7, v1}, Lr9/e0;->r(III)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    iput v1, v6, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 291
    .line 292
    add-int/2addr v4, v2

    .line 293
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    sub-int/2addr v1, v2

    .line 302
    sub-int/2addr v1, v7

    .line 303
    if-ge v1, v7, :cond_c

    .line 304
    .line 305
    move v1, v7

    .line 306
    :cond_c
    invoke-static {v4, v7, v1}, Lr9/e0;->r(III)I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    iput v1, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 311
    .line 312
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 313
    .line 314
    .line 315
    :cond_d
    return v13

    .line 316
    :cond_e
    invoke-virtual {v1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 317
    .line 318
    .line 319
    iget-boolean v2, v12, Lgg/q;->g:Z

    .line 320
    .line 321
    if-eqz v2, :cond_f

    .line 322
    .line 323
    invoke-static {v1, v14}, Lk9/r;->l(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v14}, Lk9/r;->n(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 327
    .line 328
    .line 329
    return v13

    .line 330
    :cond_f
    invoke-virtual {v1}, Landroid/view/View;->performClick()Z

    .line 331
    .line 332
    .line 333
    return v13

    .line 334
    :cond_10
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    iput v4, v6, Lgg/r;->g:F

    .line 339
    .line 340
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    iput v4, v7, Lgg/r;->g:F

    .line 345
    .line 346
    iget v4, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 347
    .line 348
    iput v4, v8, Lgg/s;->g:I

    .line 349
    .line 350
    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 351
    .line 352
    iput v2, v9, Lgg/s;->g:I

    .line 353
    .line 354
    sget-object v2, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    check-cast v2, Landroid/view/View;

    .line 361
    .line 362
    if-eqz v2, :cond_11

    .line 363
    .line 364
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    goto :goto_4

    .line 369
    :cond_11
    const/4 v2, 0x0

    .line 370
    :goto_4
    instance-of v4, v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 371
    .line 372
    if-eqz v4, :cond_12

    .line 373
    .line 374
    move-object v4, v2

    .line 375
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 376
    .line 377
    goto :goto_5

    .line 378
    :cond_12
    const/4 v4, 0x0

    .line 379
    :goto_5
    if-eqz v4, :cond_13

    .line 380
    .line 381
    iget v2, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_13
    move v2, v3

    .line 385
    :goto_6
    iput v2, v10, Lgg/s;->g:I

    .line 386
    .line 387
    if-eqz v4, :cond_14

    .line 388
    .line 389
    iget v2, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_14
    move v2, v3

    .line 393
    :goto_7
    iput v2, v11, Lgg/s;->g:I

    .line 394
    .line 395
    iput-boolean v3, v12, Lgg/q;->g:Z

    .line 396
    .line 397
    invoke-virtual {v1, v13}, Landroid/view/View;->setPressed(Z)V

    .line 398
    .line 399
    .line 400
    return v13

    .line 401
    :cond_15
    :goto_8
    return v3
.end method
