.class public final Le/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/p;
.implements Li/m0;
.implements Lh/y;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Le/u;


# direct methods
.method public synthetic constructor <init>(Le/u;I)V
    .locals 0

    .line 1
    iput p2, p0, Le/m;->b:I

    iput-object p1, p0, Le/m;->c:Le/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ly/g0;)Ly/g0;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v3, v2, Ly/g0;->a:Ly/f0;

    .line 6
    .line 7
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v4, v0, Lr/c;->b:I

    .line 12
    .line 13
    move-object/from16 v5, p0

    .line 14
    .line 15
    iget-object v6, v5, Le/m;->c:Le/u;

    .line 16
    .line 17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v7, v0, Lr/c;->b:I

    .line 25
    .line 26
    iget-object v0, v6, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 27
    .line 28
    const/16 v9, 0x8

    .line 29
    .line 30
    if-eqz v0, :cond_f

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 37
    .line 38
    if-eqz v0, :cond_f

    .line 39
    .line 40
    iget-object v0, v6, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v10, v0

    .line 47
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    .line 49
    iget-object v0, v6, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_d

    .line 56
    .line 57
    iget-object v0, v6, Le/u;->W:Landroid/graphics/Rect;

    .line 58
    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    new-instance v0, Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, v6, Le/u;->W:Landroid/graphics/Rect;

    .line 67
    .line 68
    new-instance v0, Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, v6, Le/u;->X:Landroid/graphics/Rect;

    .line 74
    .line 75
    :cond_0
    iget-object v12, v6, Le/u;->W:Landroid/graphics/Rect;

    .line 76
    .line 77
    iget-object v0, v6, Le/u;->X:Landroid/graphics/Rect;

    .line 78
    .line 79
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    iget v13, v13, Lr/c;->a:I

    .line 84
    .line 85
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    iget v14, v14, Lr/c;->b:I

    .line 90
    .line 91
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    iget v15, v15, Lr/c;->c:I

    .line 96
    .line 97
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    iget v11, v11, Lr/c;->d:I

    .line 102
    .line 103
    invoke-virtual {v12, v13, v14, v15, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 104
    .line 105
    .line 106
    iget-object v11, v6, Le/u;->u:Landroid/view/ViewGroup;

    .line 107
    .line 108
    sget-object v13, Li/t1;->a:Ljava/lang/reflect/Method;

    .line 109
    .line 110
    if-eqz v13, :cond_1

    .line 111
    .line 112
    :try_start_0
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v13, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    const-string v11, "ViewUtils"

    .line 122
    .line 123
    const-string v13, "Could not invoke computeFitSystemWindows"

    .line 124
    .line 125
    invoke-static {v11, v13, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 126
    .line 127
    .line 128
    :cond_1
    :goto_0
    iget v0, v12, Landroid/graphics/Rect;->top:I

    .line 129
    .line 130
    iget v11, v12, Landroid/graphics/Rect;->left:I

    .line 131
    .line 132
    iget v12, v12, Landroid/graphics/Rect;->right:I

    .line 133
    .line 134
    iget-object v13, v6, Le/u;->u:Landroid/view/ViewGroup;

    .line 135
    .line 136
    sget-object v14, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 137
    .line 138
    invoke-static {v13}, Ly/C;->a(Landroid/view/View;)Ly/g0;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    if-nez v13, :cond_2

    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    goto :goto_1

    .line 146
    :cond_2
    iget-object v14, v13, Ly/g0;->a:Ly/f0;

    .line 147
    .line 148
    invoke-virtual {v14}, Ly/f0;->g()Lr/c;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    iget v14, v14, Lr/c;->a:I

    .line 153
    .line 154
    :goto_1
    if-nez v13, :cond_3

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    goto :goto_2

    .line 158
    :cond_3
    iget-object v13, v13, Ly/g0;->a:Ly/f0;

    .line 159
    .line 160
    invoke-virtual {v13}, Ly/f0;->g()Lr/c;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    iget v13, v13, Lr/c;->c:I

    .line 165
    .line 166
    :goto_2
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 167
    .line 168
    if-ne v15, v0, :cond_5

    .line 169
    .line 170
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 171
    .line 172
    if-ne v15, v11, :cond_5

    .line 173
    .line 174
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 175
    .line 176
    if-eq v15, v12, :cond_4

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_4
    const/4 v11, 0x0

    .line 180
    goto :goto_4

    .line 181
    :cond_5
    :goto_3
    iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 182
    .line 183
    iput v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 184
    .line 185
    iput v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 186
    .line 187
    const/4 v11, 0x1

    .line 188
    :goto_4
    iget-object v12, v6, Le/u;->e:Landroid/content/Context;

    .line 189
    .line 190
    if-lez v0, :cond_6

    .line 191
    .line 192
    iget-object v0, v6, Le/u;->w:Landroid/view/View;

    .line 193
    .line 194
    if-nez v0, :cond_6

    .line 195
    .line 196
    new-instance v0, Landroid/view/View;

    .line 197
    .line 198
    invoke-direct {v0, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    iput-object v0, v6, Le/u;->w:Landroid/view/View;

    .line 202
    .line 203
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 204
    .line 205
    .line 206
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 207
    .line 208
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 209
    .line 210
    const/16 v9, 0x33

    .line 211
    .line 212
    const/4 v8, -0x1

    .line 213
    invoke-direct {v0, v8, v15, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 214
    .line 215
    .line 216
    iput v14, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 217
    .line 218
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 219
    .line 220
    iget-object v9, v6, Le/u;->u:Landroid/view/ViewGroup;

    .line 221
    .line 222
    iget-object v13, v6, Le/u;->w:Landroid/view/View;

    .line 223
    .line 224
    invoke-virtual {v9, v13, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_6
    iget-object v0, v6, Le/u;->w:Landroid/view/View;

    .line 229
    .line 230
    if-eqz v0, :cond_8

    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 237
    .line 238
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 239
    .line 240
    iget v9, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 241
    .line 242
    if-ne v8, v9, :cond_7

    .line 243
    .line 244
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 245
    .line 246
    if-ne v8, v14, :cond_7

    .line 247
    .line 248
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 249
    .line 250
    if-eq v8, v13, :cond_8

    .line 251
    .line 252
    :cond_7
    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 253
    .line 254
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 255
    .line 256
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 257
    .line 258
    iget-object v8, v6, Le/u;->w:Landroid/view/View;

    .line 259
    .line 260
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    .line 262
    .line 263
    :cond_8
    :goto_5
    iget-object v0, v6, Le/u;->w:Landroid/view/View;

    .line 264
    .line 265
    if-eqz v0, :cond_9

    .line 266
    .line 267
    const/16 v16, 0x1

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_9
    const/16 v16, 0x0

    .line 271
    .line 272
    :goto_6
    if-eqz v16, :cond_b

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    iget-object v0, v6, Le/u;->w:Landroid/view/View;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    and-int/lit16 v8, v8, 0x2000

    .line 287
    .line 288
    if-eqz v8, :cond_a

    .line 289
    .line 290
    const v8, 0x7f060006

    .line 291
    .line 292
    .line 293
    invoke-static {v12, v8}, Lp/b;->a(Landroid/content/Context;I)I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    goto :goto_7

    .line 298
    :cond_a
    const v8, 0x7f060005

    .line 299
    .line 300
    .line 301
    invoke-static {v12, v8}, Lp/b;->a(Landroid/content/Context;I)I

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    :goto_7
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 306
    .line 307
    .line 308
    :cond_b
    iget-boolean v0, v6, Le/u;->B:Z

    .line 309
    .line 310
    if-nez v0, :cond_c

    .line 311
    .line 312
    if-eqz v16, :cond_c

    .line 313
    .line 314
    const/4 v7, 0x0

    .line 315
    :cond_c
    const/4 v8, 0x0

    .line 316
    goto :goto_8

    .line 317
    :cond_d
    iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 318
    .line 319
    const/4 v8, 0x0

    .line 320
    if-eqz v0, :cond_e

    .line 321
    .line 322
    iput v8, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 323
    .line 324
    move/from16 v16, v8

    .line 325
    .line 326
    const/4 v11, 0x1

    .line 327
    goto :goto_8

    .line 328
    :cond_e
    move v11, v8

    .line 329
    move/from16 v16, v11

    .line 330
    .line 331
    :goto_8
    if-eqz v11, :cond_10

    .line 332
    .line 333
    iget-object v0, v6, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 334
    .line 335
    invoke-virtual {v0, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_f
    const/4 v8, 0x0

    .line 340
    move/from16 v16, v8

    .line 341
    .line 342
    :cond_10
    :goto_9
    iget-object v0, v6, Le/u;->w:Landroid/view/View;

    .line 343
    .line 344
    if-eqz v0, :cond_12

    .line 345
    .line 346
    if-eqz v16, :cond_11

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_11
    const/16 v8, 0x8

    .line 350
    .line 351
    :goto_a
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 352
    .line 353
    .line 354
    :cond_12
    if-eq v4, v7, :cond_15

    .line 355
    .line 356
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iget v0, v0, Lr/c;->a:I

    .line 361
    .line 362
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    iget v4, v4, Lr/c;->c:I

    .line 367
    .line 368
    invoke-virtual {v3}, Ly/f0;->g()Lr/c;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    iget v3, v3, Lr/c;->d:I

    .line 373
    .line 374
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 375
    .line 376
    const/16 v8, 0x1e

    .line 377
    .line 378
    if-lt v6, v8, :cond_13

    .line 379
    .line 380
    new-instance v6, Ly/X;

    .line 381
    .line 382
    invoke-direct {v6, v2}, Ly/X;-><init>(Ly/g0;)V

    .line 383
    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_13
    const/16 v8, 0x1d

    .line 387
    .line 388
    if-lt v6, v8, :cond_14

    .line 389
    .line 390
    new-instance v6, Ly/W;

    .line 391
    .line 392
    invoke-direct {v6, v2}, Ly/W;-><init>(Ly/g0;)V

    .line 393
    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_14
    new-instance v6, Ly/V;

    .line 397
    .line 398
    invoke-direct {v6, v2}, Ly/V;-><init>(Ly/g0;)V

    .line 399
    .line 400
    .line 401
    :goto_b
    invoke-static {v0, v7, v4, v3}, Lr/c;->a(IIII)Lr/c;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v6, v0}, Ly/Y;->d(Lr/c;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v6}, Ly/Y;->b()Ly/g0;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    goto :goto_c

    .line 413
    :cond_15
    move-object v0, v2

    .line 414
    :goto_c
    sget-object v2, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 415
    .line 416
    invoke-virtual {v0}, Ly/g0;->b()Landroid/view/WindowInsets;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    if-eqz v2, :cond_16

    .line 421
    .line 422
    invoke-static {v1, v2}, Ly/z;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-nez v2, :cond_16

    .line 431
    .line 432
    invoke-static {v3, v1}, Ly/g0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Ly/g0;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    :cond_16
    return-object v0
.end method

.method public b(Lh/m;Z)V
    .locals 9

    .line 1
    iget v0, p0, Le/m;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lh/m;->k()Lh/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    move v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_1
    iget-object v4, p0, Le/m;->c:Le/u;

    .line 21
    .line 22
    iget-object v5, v4, Le/u;->F:[Le/t;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v6, v1

    .line 29
    :goto_1
    if-ge v1, v6, :cond_4

    .line 30
    .line 31
    aget-object v7, v5, v1

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iget-object v8, v7, Le/t;->h:Lh/m;

    .line 36
    .line 37
    if-ne v8, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v7, 0x0

    .line 44
    :goto_2
    if-eqz v7, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v7, Le/t;->a:I

    .line 49
    .line 50
    invoke-virtual {v4, p1, v7, v0}, Le/u;->o(ILe/t;Lh/m;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v7, v2}, Le/u;->q(Le/t;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {v4, v7, p2}, Le/u;->q(Le/t;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    iget-object p2, p0, Le/m;->c:Le/u;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Le/u;->p(Lh/m;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public m(Lh/m;)Z
    .locals 2

    .line 1
    iget v0, p0, Le/m;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lh/m;->k()Lh/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Le/m;->c:Le/u;

    .line 13
    .line 14
    iget-boolean v1, v0, Le/u;->z:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Le/u;->f:Landroid/view/Window;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, v0, Le/u;->K:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x6c

    .line 31
    .line 32
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :pswitch_0
    iget-object v0, p0, Le/m;->c:Le/u;

    .line 38
    .line 39
    iget-object v0, v0, Le/u;->f:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/16 v1, 0x6c

    .line 48
    .line 49
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
