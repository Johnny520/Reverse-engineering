.class public final Ls0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/concurrent/ExecutorService;

.field public final f:Ljava/util/concurrent/ExecutorService;

.field public final g:Ls0/f;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Ls0/g;

.field public final j:Landroid/widget/ListView;

.field public final k:Landroid/widget/EditText;

.field public final l:Landroid/widget/TextView;

.field public m:Ls0/b;

.field public n:LC/d;

.field public final o:Lt0/e;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x1

    .line 11
    const-string v8, "context"

    .line 12
    .line 13
    invoke-static {v1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v8, "selectedItems"

    .line 17
    .line 18
    move-object/from16 v9, p2

    .line 19
    .line 20
    invoke-static {v9, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 27
    .line 28
    move-object/from16 v1, p4

    .line 29
    .line 30
    iput-object v1, v0, Ls0/l;->b:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, v0, Ls0/l;->c:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, v0, Ls0/l;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, v0, Ls0/l;->e:Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    iput-object v8, v0, Ls0/l;->f:Ljava/util/concurrent/ExecutorService;

    .line 58
    .line 59
    new-instance v8, Ls0/f;

    .line 60
    .line 61
    const/high16 v10, 0x800000

    .line 62
    .line 63
    invoke-direct {v8, v10, v7}, Ls0/f;-><init>(II)V

    .line 64
    .line 65
    .line 66
    iput-object v8, v0, Ls0/l;->g:Ls0/f;

    .line 67
    .line 68
    new-instance v8, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-direct {v8, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    iput-object v8, v0, Ls0/l;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    .line 75
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_1

    .line 84
    .line 85
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    check-cast v9, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 90
    .line 91
    invoke-virtual {v9}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-static {v10}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-nez v10, :cond_0

    .line 100
    .line 101
    iget-object v10, v0, Ls0/l;->c:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v9}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-interface {v10, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance v8, Lt0/e;

    .line 112
    .line 113
    new-instance v9, Landroid/widget/LinearLayout;

    .line 114
    .line 115
    iget-object v10, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 116
    .line 117
    invoke-direct {v9, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    new-instance v11, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 121
    .line 122
    const/4 v12, -0x1

    .line 123
    invoke-direct {v11, v12, v12}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 130
    .line 131
    .line 132
    iget-object v11, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 133
    .line 134
    invoke-static {v11}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    const/16 v13, 0x16

    .line 139
    .line 140
    invoke-static {v13}, LB0/a;->b(I)I

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    iget v11, v11, Ls0/K;->d:I

    .line 145
    .line 146
    const/4 v14, 0x0

    .line 147
    invoke-static {v0, v11, v13, v14}, Ls0/l;->g(Ls0/l;IILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-virtual {v9, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9, v7}, Landroid/view/View;->setClipToOutline(Z)V

    .line 155
    .line 156
    .line 157
    new-instance v11, Landroid/widget/FrameLayout;

    .line 158
    .line 159
    invoke-direct {v11, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 160
    .line 161
    .line 162
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 163
    .line 164
    const/16 v15, 0x48

    .line 165
    .line 166
    invoke-static {v15}, LB0/a;->b(I)I

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    invoke-direct {v13, v12, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v11, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    const/16 v13, 0x18

    .line 177
    .line 178
    invoke-static {v13}, LB0/a;->b(I)I

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    invoke-static {v13}, LB0/a;->b(I)I

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    invoke-virtual {v11, v15, v4, v13, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 187
    .line 188
    .line 189
    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    .line 190
    .line 191
    invoke-direct {v13}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v13, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 195
    .line 196
    .line 197
    iget-object v15, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 198
    .line 199
    invoke-static {v15}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    iget v15, v15, Ls0/K;->b:I

    .line 204
    .line 205
    invoke-virtual {v13, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 206
    .line 207
    .line 208
    const/high16 v15, 0x41b00000    # 22.0f

    .line 209
    .line 210
    invoke-static {v15}, LB0/a;->a(F)F

    .line 211
    .line 212
    .line 213
    move-result v16

    .line 214
    invoke-static {v15}, LB0/a;->a(F)F

    .line 215
    .line 216
    .line 217
    move-result v17

    .line 218
    invoke-static {v15}, LB0/a;->a(F)F

    .line 219
    .line 220
    .line 221
    move-result v18

    .line 222
    invoke-static {v15}, LB0/a;->a(F)F

    .line 223
    .line 224
    .line 225
    move-result v15

    .line 226
    const/16 p3, 0x4

    .line 227
    .line 228
    new-array v2, v3, [F

    .line 229
    .line 230
    aput v16, v2, v4

    .line 231
    .line 232
    aput v17, v2, v7

    .line 233
    .line 234
    aput v18, v2, v5

    .line 235
    .line 236
    aput v15, v2, v1

    .line 237
    .line 238
    aput v6, v2, p3

    .line 239
    .line 240
    const/4 v15, 0x5

    .line 241
    aput v6, v2, v15

    .line 242
    .line 243
    const/4 v15, 0x6

    .line 244
    aput v6, v2, v15

    .line 245
    .line 246
    const/4 v15, 0x7

    .line 247
    aput v6, v2, v15

    .line 248
    .line 249
    invoke-virtual {v13, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v11, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 253
    .line 254
    .line 255
    new-instance v2, Landroid/widget/TextView;

    .line 256
    .line 257
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-direct {v2, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 265
    .line 266
    const/16 v13, 0x30

    .line 267
    .line 268
    invoke-static {v13}, LB0/a;->b(I)I

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    invoke-direct {v6, v13, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 273
    .line 274
    .line 275
    const v13, 0x800003

    .line 276
    .line 277
    .line 278
    iput v13, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 279
    .line 280
    invoke-virtual {v2, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 281
    .line 282
    .line 283
    const/16 v6, 0x11

    .line 284
    .line 285
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 286
    .line 287
    .line 288
    const-string v13, "\u2039"

    .line 289
    .line 290
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    iget-object v13, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 294
    .line 295
    invoke-static {v13}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    iget v13, v13, Ls0/K;->f:I

    .line 300
    .line 301
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 302
    .line 303
    .line 304
    const/high16 v13, 0x42000000    # 32.0f

    .line 305
    .line 306
    invoke-virtual {v2, v5, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 307
    .line 308
    .line 309
    new-instance v13, Lm0/h;

    .line 310
    .line 311
    invoke-direct {v13, v5, v0}, Lm0/h;-><init>(ILjava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    new-instance v2, Landroid/widget/TextView;

    .line 321
    .line 322
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 323
    .line 324
    .line 325
    move-result-object v13

    .line 326
    invoke-direct {v2, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 327
    .line 328
    .line 329
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    .line 330
    .line 331
    const/4 v15, -0x2

    .line 332
    invoke-direct {v13, v15, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 333
    .line 334
    .line 335
    iput v6, v13, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 336
    .line 337
    invoke-virtual {v2, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 338
    .line 339
    .line 340
    const-string v13, "\u9009\u62e9\u8054\u7cfb\u4eba"

    .line 341
    .line 342
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    .line 345
    iget-object v13, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 346
    .line 347
    invoke-static {v13}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 348
    .line 349
    .line 350
    move-result-object v13

    .line 351
    iget v13, v13, Ls0/K;->f:I

    .line 352
    .line 353
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 354
    .line 355
    .line 356
    sget-object v13, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 357
    .line 358
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 359
    .line 360
    .line 361
    const/high16 v13, 0x41a00000    # 20.0f

    .line 362
    .line 363
    invoke-virtual {v2, v5, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 370
    .line 371
    .line 372
    new-instance v2, Landroid/widget/EditText;

    .line 373
    .line 374
    invoke-direct {v2, v10}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 375
    .line 376
    .line 377
    iput-object v2, v0, Ls0/l;->k:Landroid/widget/EditText;

    .line 378
    .line 379
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 380
    .line 381
    const/16 v13, 0x2a

    .line 382
    .line 383
    invoke-static {v13}, LB0/a;->b(I)I

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    invoke-direct {v11, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 388
    .line 389
    .line 390
    const/16 v13, 0x14

    .line 391
    .line 392
    invoke-static {v13}, LB0/a;->b(I)I

    .line 393
    .line 394
    .line 395
    move-result v15

    .line 396
    const/16 v16, 0xe

    .line 397
    .line 398
    move/from16 v17, v3

    .line 399
    .line 400
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    invoke-static {v13}, LB0/a;->b(I)I

    .line 405
    .line 406
    .line 407
    move-result v13

    .line 408
    move-object/from16 p1, v14

    .line 409
    .line 410
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 411
    .line 412
    .line 413
    move-result v14

    .line 414
    invoke-virtual {v11, v15, v3, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 421
    .line 422
    .line 423
    const-string v3, "\u641c\u7d22\u5907\u6ce8\u3001\u6635\u79f0\u3001\u5fae\u4fe1ID"

    .line 424
    .line 425
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 426
    .line 427
    .line 428
    iget-object v3, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 429
    .line 430
    invoke-static {v3}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    iget v3, v3, Ls0/K;->g:I

    .line 435
    .line 436
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 437
    .line 438
    .line 439
    iget-object v3, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 440
    .line 441
    invoke-static {v3}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    iget v3, v3, Ls0/K;->f:I

    .line 446
    .line 447
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 448
    .line 449
    .line 450
    const/high16 v3, 0x41600000    # 14.0f

    .line 451
    .line 452
    invoke-virtual {v2, v5, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 456
    .line 457
    .line 458
    const/16 v1, 0x10

    .line 459
    .line 460
    invoke-static {v1}, LB0/a;->b(I)I

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    invoke-static {v1}, LB0/a;->b(I)I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-virtual {v2, v11, v4, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 469
    .line 470
    .line 471
    iget-object v1, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 472
    .line 473
    invoke-static {v1}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    const/16 v11, 0x12

    .line 478
    .line 479
    invoke-static {v11}, LB0/a;->b(I)I

    .line 480
    .line 481
    .line 482
    move-result v11

    .line 483
    iget-object v13, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 484
    .line 485
    invoke-static {v13}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 486
    .line 487
    .line 488
    move-result-object v13

    .line 489
    iget v13, v13, Ls0/K;->i:I

    .line 490
    .line 491
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v13

    .line 495
    iget v1, v1, Ls0/K;->e:I

    .line 496
    .line 497
    invoke-static {v0, v1, v11, v13}, Ls0/l;->g(Ls0/l;IILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 502
    .line 503
    .line 504
    new-instance v1, Li/R0;

    .line 505
    .line 506
    invoke-direct {v1, v7, v0}, Li/R0;-><init>(ILjava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 513
    .line 514
    .line 515
    new-instance v1, Ls0/g;

    .line 516
    .line 517
    invoke-direct {v1, v0}, Ls0/g;-><init>(Ls0/l;)V

    .line 518
    .line 519
    .line 520
    iput-object v1, v0, Ls0/l;->i:Ls0/g;

    .line 521
    .line 522
    new-instance v1, Landroid/widget/FrameLayout;

    .line 523
    .line 524
    invoke-direct {v1, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 525
    .line 526
    .line 527
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 528
    .line 529
    invoke-direct {v2, v12, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 530
    .line 531
    .line 532
    const/high16 v10, 0x3f800000    # 1.0f

    .line 533
    .line 534
    iput v10, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 535
    .line 536
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 537
    .line 538
    .line 539
    iget-object v2, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 540
    .line 541
    invoke-static {v2}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    iget v2, v2, Ls0/K;->d:I

    .line 546
    .line 547
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 548
    .line 549
    .line 550
    new-instance v2, Landroid/widget/ListView;

    .line 551
    .line 552
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    invoke-direct {v2, v10}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 557
    .line 558
    .line 559
    iput-object v2, v0, Ls0/l;->j:Landroid/widget/ListView;

    .line 560
    .line 561
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 562
    .line 563
    invoke-direct {v10, v12, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2, v4}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 570
    .line 571
    .line 572
    invoke-static/range {p3 .. p3}, LB0/a;->b(I)I

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    const/16 v11, 0xc

    .line 577
    .line 578
    invoke-static {v11}, LB0/a;->b(I)I

    .line 579
    .line 580
    .line 581
    move-result v11

    .line 582
    invoke-virtual {v2, v4, v10, v4, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 583
    .line 584
    .line 585
    iget-object v10, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 586
    .line 587
    invoke-static {v10}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 588
    .line 589
    .line 590
    move-result-object v10

    .line 591
    iget v10, v10, Ls0/K;->d:I

    .line 592
    .line 593
    invoke-virtual {v2, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 594
    .line 595
    .line 596
    new-instance v10, Landroid/graphics/drawable/ColorDrawable;

    .line 597
    .line 598
    iget-object v11, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 599
    .line 600
    invoke-static {v11}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 601
    .line 602
    .line 603
    move-result-object v11

    .line 604
    iget v11, v11, Ls0/K;->i:I

    .line 605
    .line 606
    invoke-direct {v10, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v10}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 610
    .line 611
    .line 612
    invoke-static {v7}, LB0/a;->b(I)I

    .line 613
    .line 614
    .line 615
    move-result v7

    .line 616
    invoke-virtual {v2, v7}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 617
    .line 618
    .line 619
    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    .line 620
    .line 621
    invoke-direct {v7, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2, v7}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 625
    .line 626
    .line 627
    iget-object v4, v0, Ls0/l;->i:Ls0/g;

    .line 628
    .line 629
    if-eqz v4, :cond_3

    .line 630
    .line 631
    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 635
    .line 636
    .line 637
    new-instance v2, Landroid/widget/TextView;

    .line 638
    .line 639
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 644
    .line 645
    .line 646
    iput-object v2, v0, Ls0/l;->l:Landroid/widget/TextView;

    .line 647
    .line 648
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 649
    .line 650
    invoke-direct {v4, v12, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 657
    .line 658
    .line 659
    const-string v4, "\u6b63\u5728\u52a0\u8f7d\u8054\u7cfb\u4eba..."

    .line 660
    .line 661
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 662
    .line 663
    .line 664
    iget-object v4, v0, Ls0/l;->a:Landroid/app/Activity;

    .line 665
    .line 666
    invoke-static {v4}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    iget v4, v4, Ls0/K;->g:I

    .line 671
    .line 672
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v5, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 682
    .line 683
    .line 684
    invoke-direct {v8, v9}, Lt0/e;-><init>(Landroid/widget/LinearLayout;)V

    .line 685
    .line 686
    .line 687
    iput-object v8, v0, Ls0/l;->o:Lt0/e;

    .line 688
    .line 689
    iget-object v1, v0, Ls0/l;->j:Landroid/widget/ListView;

    .line 690
    .line 691
    if-eqz v1, :cond_2

    .line 692
    .line 693
    invoke-virtual {v8, v1}, Lt0/e;->setNeedScrollChild(Landroid/view/View;)V

    .line 694
    .line 695
    .line 696
    new-instance v1, LC/d;

    .line 697
    .line 698
    const/16 v2, 0xa

    .line 699
    .line 700
    invoke-direct {v1, v2, v0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v8, v1}, Lt0/c;->setOnDismissListener(LM0/l;)V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :cond_2
    const-string v1, "listView"

    .line 708
    .line 709
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    throw p1

    .line 713
    :cond_3
    const-string v1, "listAdapter"

    .line 714
    .line 715
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    throw p1
.end method

.method public static final a(Ls0/l;Ls0/i;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ls0/l;->e(Ls0/i;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, LU0/i;->l0(Ljava/lang/String;)Ljava/lang/Character;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/16 p1, 0x61

    .line 19
    .line 20
    if-gt p1, p0, :cond_0

    .line 21
    .line 22
    const/16 p1, 0x7b

    .line 23
    .line 24
    if-ge p0, p1, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_0
    const/16 p1, 0x30

    .line 29
    .line 30
    if-gt p1, p0, :cond_1

    .line 31
    .line 32
    const/16 p1, 0x3a

    .line 33
    .line 34
    if-ge p0, p1, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    const/4 p0, 0x2

    .line 39
    return p0
.end method

.method public static final b(Ls0/l;Ls0/i;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 5
    .line 6
    iget-object v1, p1, Ls0/i;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p1, Ls0/i;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v6, p1, Ls0/i;->i:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v7, 0x1c

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Ls0/l;->n:LC/d;

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-static {v1}, Ls0/l;->f(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    new-instance v4, Landroid/app/AlertDialog$Builder;

    .line 33
    .line 34
    iget-object v5, p0, Ls0/l;->a:Landroid/app/Activity;

    .line 35
    .line 36
    invoke-direct {v4, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    const-string v5, "\u672c\u5730\u5934\u50cf"

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, "\n"

    .line 54
    .line 55
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v4, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v2, Lq0/b;

    .line 70
    .line 71
    const/4 v4, 0x3

    .line 72
    invoke-direct {v2, p1, p0, v4}, Lq0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    const-string p1, "\u6e05\u9664"

    .line 76
    .line 77
    invoke-virtual {v1, p1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v1, Ls0/h;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-direct {v1, p0, v3, v0, v2}, Ls0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    const-string p0, "\u4fee\u6539"

    .line 88
    .line 89
    invoke-virtual {p1, p0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string p1, "\u53d6\u6d88"

    .line 94
    .line 95
    invoke-virtual {p0, p1, v10}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_0
    iget-object p1, p0, Ls0/l;->o:Lt0/e;

    .line 104
    .line 105
    invoke-virtual {p1}, Lt0/c;->a()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ls0/l;->d()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v0}, LC/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_1
    iget-object p1, p0, Ls0/l;->c:Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    invoke-virtual {p1, v1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_2

    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    move-object v3, v2

    .line 125
    move-object v2, v1

    .line 126
    new-instance v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 127
    .line 128
    const/16 v8, 0x1c

    .line 129
    .line 130
    const/4 v9, 0x0

    .line 131
    const/4 v4, 0x0

    .line 132
    const/4 v5, 0x0

    .line 133
    move-object v7, v6

    .line 134
    const/4 v6, 0x0

    .line 135
    invoke-direct/range {v1 .. v9}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V

    .line 136
    .line 137
    .line 138
    move-object v0, v1

    .line 139
    move-object v1, v2

    .line 140
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    sget-boolean v1, Lz0/i;->a:Z

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string v1, "<get-values>(...)"

    .line 150
    .line 151
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p1}, Lz0/g;->N(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Ls0/l;->m:Ls0/b;

    .line 162
    .line 163
    if-eqz p1, :cond_3

    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ls0/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :cond_3
    iget-object p0, p0, Ls0/l;->i:Ls0/g;

    .line 169
    .line 170
    if-eqz p0, :cond_4

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 173
    .line 174
    .line 175
    const-string p0, "\u5df2\u52a0\u5165\u9690\u85cf\u540d\u5355"

    .line 176
    .line 177
    invoke-static {p0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    const-string p0, "listAdapter"

    .line 182
    .line 183
    invoke-static {p0}, LN0/g;->g(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v10
.end method

.method public static e(Ls0/i;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Ls0/i;->g:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ls0/i;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ls0/i;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Ls0/i;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Ls0/i;->a:Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v2, v0

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v0, v1

    .line 45
    :goto_0
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "getDefault(...)"

    .line 64
    .line 65
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string p0, "toLowerCase(...)"

    .line 73
    .line 74
    invoke-static {v1, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    if-nez v1, :cond_3

    .line 78
    .line 79
    const-string p0, ""

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    return-object v1
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lz0/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static g(Ls0/l;IILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, LB0/a;->b(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 19
    .line 20
    .line 21
    int-to-float p1, p2

    .line 22
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 23
    .line 24
    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0, v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getDefault(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "toLowerCase(...)"

    .line 23
    .line 24
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Ls0/l;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move-object v2, v3

    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_3

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
    check-cast v7, Ls0/i;

    .line 60
    .line 61
    iget-object v8, v7, Ls0/i;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-static {v9, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v8, p1, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-nez v8, :cond_2

    .line 82
    .line 83
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v9, v7, Ls0/i;->d:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v9, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v8, p1, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v8, :cond_2

    .line 104
    .line 105
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v9, v7, Ls0/i;->e:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v9, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v8, p1, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_2

    .line 126
    .line 127
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v9, v7, Ls0/i;->f:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v9, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v8, p1, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-nez v8, :cond_2

    .line 148
    .line 149
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v9, v7, Ls0/i;->g:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v9, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v8, p1, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_2

    .line 170
    .line 171
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-static {v8, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v7, v7, Ls0/i;->h:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-static {v7, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v7, p1, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_1

    .line 192
    .line 193
    :cond_2
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_3
    :goto_1
    new-instance p1, Ls0/k;

    .line 199
    .line 200
    const/4 v0, 0x0

    .line 201
    invoke-direct {p1, p0, v0}, Ls0/k;-><init>(Ls0/l;I)V

    .line 202
    .line 203
    .line 204
    new-instance v0, LA0/Q;

    .line 205
    .line 206
    const/4 v1, 0x1

    .line 207
    invoke-direct {v0, p1, p0, v1}, LA0/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    new-instance p1, LA0/Q;

    .line 211
    .line 212
    const/4 v1, 0x2

    .line 213
    invoke-direct {p1, v0, p0, v1}, LA0/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 214
    .line 215
    .line 216
    new-instance v0, LA0/f;

    .line 217
    .line 218
    const/16 v1, 0x11

    .line 219
    .line 220
    invoke-direct {v0, v1, p1}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v2, v0}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-object v0, p0, Ls0/l;->i:Ls0/g;

    .line 228
    .line 229
    const/4 v1, 0x0

    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    iget-object v2, v0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 241
    .line 242
    .line 243
    iget-object v0, p0, Ls0/l;->l:Landroid/widget/TextView;

    .line 244
    .line 245
    const-string v2, "emptyView"

    .line 246
    .line 247
    if-eqz v0, :cond_8

    .line 248
    .line 249
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-eqz v5, :cond_4

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_4
    const/16 v4, 0x8

    .line 257
    .line 258
    :goto_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-eqz p1, :cond_7

    .line 266
    .line 267
    iget-object p1, p0, Ls0/l;->l:Landroid/widget/TextView;

    .line 268
    .line 269
    if-eqz p1, :cond_6

    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_5

    .line 276
    .line 277
    const-string v0, "\u672a\u8bfb\u53d6\u5230\u8054\u7cfb\u4eba"

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_5
    const-string v0, "\u6ca1\u6709\u5339\u914d\u8054\u7cfb\u4eba"

    .line 281
    .line 282
    :goto_3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_6
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v1

    .line 290
    :cond_7
    return-void

    .line 291
    :cond_8
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v1

    .line 295
    :cond_9
    const-string p1, "listAdapter"

    .line 296
    .line 297
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v1
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls0/l;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Ls0/l;->e:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ls0/l;->f:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ls0/l;->g:Ls0/f;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Ls0/l;->m:Ls0/b;

    .line 29
    .line 30
    iput-object v0, p0, Ls0/l;->n:LC/d;

    .line 31
    .line 32
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Ls0/l;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Ls0/l;->o:Lt0/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lt0/c;->g()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Ls0/l;->l:Landroid/widget/TextView;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const-string v2, "emptyView"

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ls0/l;->l:Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const-string v1, "\u6b63\u5728\u52a0\u8f7d\u8054\u7cfb\u4eba..."

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroidx/activity/b;

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    invoke-direct {v0, v1, p0}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Ls0/l;->e:Ljava/util/concurrent/ExecutorService;

    .line 50
    .line 51
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_3
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1
.end method
