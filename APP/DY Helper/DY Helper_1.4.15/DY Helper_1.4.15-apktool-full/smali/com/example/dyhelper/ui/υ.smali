.class public final synthetic Lcom/example/dyhelper/ui/υ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/graphics/Bitmap;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lum1;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Landroid/app/Activity;Lum1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/υ;->ε:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/example/dyhelper/ui/υ;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/example/dyhelper/ui/υ;->η:Lum1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/example/dyhelper/ui/υ;->ε:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/example/dyhelper/ui/υ;->ζ:Landroid/app/Activity;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_7

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v4, "comment_panel_width_px"

    .line 22
    .line 23
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-interface {v5, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 28
    .line 29
    .line 30
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move v4, v3

    .line 33
    :goto_0
    const-string v5, "comment_panel_height_px"

    .line 34
    .line 35
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {v6, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move v5, v3

    .line 45
    :goto_1
    if-lez v4, :cond_1

    .line 46
    .line 47
    if-lez v5, :cond_1

    .line 48
    .line 49
    new-instance v6, Ll91;

    .line 50
    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-direct {v6, v4, v5}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 72
    .line 73
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    const/high16 v6, 0x3f400000    # 0.75f

    .line 77
    .line 78
    mul-float/2addr v4, v6

    .line 79
    float-to-int v4, v4

    .line 80
    new-instance v6, Ll91;

    .line 81
    .line 82
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-direct {v6, v5, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    iget-object v4, v6, Ll91;->ε:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    iget-object v4, v6, Ll91;->ζ:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v4, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    new-instance v4, Ln;

    .line 110
    .line 111
    invoke-direct {v4, v2}, Ln;-><init>(Landroid/app/Activity;)V

    .line 112
    .line 113
    .line 114
    new-instance v10, Lm3;

    .line 115
    .line 116
    const/16 v5, 0xc

    .line 117
    .line 118
    iget-object v0, v0, Lcom/example/dyhelper/ui/υ;->η:Lum1;

    .line 119
    .line 120
    invoke-direct {v10, v2, v1, v0, v5}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v4, Ln;->ζ:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    move-object v12, v0

    .line 132
    check-cast v12, Landroid/app/Activity;

    .line 133
    .line 134
    if-eqz v12, :cond_6

    .line 135
    .line 136
    invoke-virtual {v12}, Landroid/app/Activity;->isFinishing()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_6

    .line 141
    .line 142
    invoke-virtual {v12}, Landroid/app/Activity;->isDestroyed()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    const-string v0, "\u56fe\u7247\u5df2\u88ab\u56de\u6536"

    .line 157
    .line 158
    invoke-static {v12, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_3
    if-lez v8, :cond_6

    .line 167
    .line 168
    if-gtz v9, :cond_4

    .line 169
    .line 170
    goto/16 :goto_4

    .line 171
    .line 172
    :cond_4
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 181
    .line 182
    int-to-double v5, v0

    .line 183
    const-wide v13, 0x3feb333333333333L    # 0.85

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    mul-double/2addr v5, v13

    .line 189
    double-to-int v0, v5

    .line 190
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 199
    .line 200
    int-to-double v5, v2

    .line 201
    const-wide v13, 0x3fe199999999999aL    # 0.55

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    mul-double/2addr v5, v13

    .line 207
    double-to-int v2, v5

    .line 208
    int-to-float v5, v8

    .line 209
    int-to-float v6, v9

    .line 210
    div-float/2addr v5, v6

    .line 211
    int-to-float v6, v0

    .line 212
    int-to-float v7, v2

    .line 213
    div-float v11, v6, v7

    .line 214
    .line 215
    cmpl-float v11, v11, v5

    .line 216
    .line 217
    if-lez v11, :cond_5

    .line 218
    .line 219
    mul-float/2addr v7, v5

    .line 220
    float-to-int v0, v7

    .line 221
    goto :goto_3

    .line 222
    :cond_5
    div-float/2addr v6, v5

    .line 223
    float-to-int v2, v6

    .line 224
    :goto_3
    const/16 v5, 0x10

    .line 225
    .line 226
    invoke-static {v12, v5}, Ln;->σ(Landroid/app/Activity;I)I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    mul-int/lit8 v7, v6, 0x2

    .line 231
    .line 232
    add-int v15, v0, v7

    .line 233
    .line 234
    add-int v16, v2, v7

    .line 235
    .line 236
    new-instance v14, Landroid/graphics/Rect;

    .line 237
    .line 238
    add-int/2addr v0, v6

    .line 239
    add-int/2addr v2, v6

    .line 240
    invoke-direct {v14, v6, v6, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 241
    .line 242
    .line 243
    move-object v0, v4

    .line 244
    new-instance v4, Lum1;

    .line 245
    .line 246
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object v1, v4, Lum1;->ε:Ljava/lang/Object;

    .line 250
    .line 251
    new-instance v2, Lsm1;

    .line 252
    .line 253
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 254
    .line 255
    .line 256
    new-instance v11, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 257
    .line 258
    iget-object v6, v4, Lum1;->ε:Ljava/lang/Object;

    .line 259
    .line 260
    move-object v13, v6

    .line 261
    check-cast v13, Landroid/graphics/Bitmap;

    .line 262
    .line 263
    invoke-direct/range {v11 .. v16}, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;-><init>(Landroid/app/Activity;Landroid/graphics/Bitmap;Landroid/graphics/Rect;II)V

    .line 264
    .line 265
    .line 266
    new-instance v6, Landroid/widget/LinearLayout;

    .line 267
    .line 268
    invoke-direct {v6, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    const/4 v7, 0x1

    .line 272
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 276
    .line 277
    .line 278
    invoke-static {v12, v5}, Ln;->σ(Landroid/app/Activity;I)I

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    const/16 v13, 0x8

    .line 283
    .line 284
    invoke-static {v12, v13}, Ln;->σ(Landroid/app/Activity;I)I

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    invoke-static {v12, v5}, Ln;->σ(Landroid/app/Activity;I)I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    const/4 v15, 0x4

    .line 293
    invoke-static {v12, v15}, Ln;->σ(Landroid/app/Activity;I)I

    .line 294
    .line 295
    .line 296
    move-result v15

    .line 297
    invoke-virtual {v6, v7, v14, v5, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 298
    .line 299
    .line 300
    new-instance v5, Landroid/widget/TextView;

    .line 301
    .line 302
    invoke-direct {v5, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 303
    .line 304
    .line 305
    new-instance v7, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v14, "\u5355\u6307\u62d6\u52a8 \u00b7 \u53cc\u6307\u7f29\u653e \u00b7 \u8f93\u51fa "

    .line 308
    .line 309
    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v14, "\u00d7"

    .line 316
    .line 317
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    const/high16 v7, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 333
    .line 334
    .line 335
    const-string v7, "#999999"

    .line 336
    .line 337
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    .line 343
    .line 344
    const/16 v7, 0x11

    .line 345
    .line 346
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 347
    .line 348
    .line 349
    invoke-static {v12, v13}, Ln;->σ(Landroid/app/Activity;I)I

    .line 350
    .line 351
    .line 352
    move-result v13

    .line 353
    invoke-virtual {v5, v3, v3, v3, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v6, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 360
    .line 361
    .line 362
    new-instance v13, Landroid/widget/TextView;

    .line 363
    .line 364
    invoke-direct {v13, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 365
    .line 366
    .line 367
    const-string v3, " \u65cb\u8f6c 90\u00b0"

    .line 368
    .line 369
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    const/high16 v3, 0x41600000    # 14.0f

    .line 373
    .line 374
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 375
    .line 376
    .line 377
    const-string v3, "#FE2C55"

    .line 378
    .line 379
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 384
    .line 385
    .line 386
    const/16 v3, 0xc

    .line 387
    .line 388
    invoke-static {v12, v3}, Ln;->σ(Landroid/app/Activity;I)I

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    const/16 v14, 0xa

    .line 393
    .line 394
    invoke-static {v12, v14}, Ln;->σ(Landroid/app/Activity;I)I

    .line 395
    .line 396
    .line 397
    move-result v15

    .line 398
    invoke-static {v12, v3}, Ln;->σ(Landroid/app/Activity;I)I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    invoke-static {v12, v14}, Ln;->σ(Landroid/app/Activity;I)I

    .line 403
    .line 404
    .line 405
    move-result v14

    .line 406
    invoke-virtual {v13, v5, v15, v3, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v13, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 410
    .line 411
    .line 412
    move-object v3, v0

    .line 413
    new-instance v0, Lcom/example/dyhelper/ui/π;

    .line 414
    .line 415
    move-object v5, v11

    .line 416
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/ui/π;-><init>(Landroid/graphics/Bitmap;Lsm1;Ln;Lum1;Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 420
    .line 421
    .line 422
    new-instance v0, Landroid/widget/LinearLayout;

    .line 423
    .line 424
    invoke-direct {v0, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 434
    .line 435
    .line 436
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 437
    .line 438
    invoke-direct {v0, v12}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 439
    .line 440
    .line 441
    const-string v2, "\u88c1\u526a\u56fe\u7247"

    .line 442
    .line 443
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    const-string v2, "\u5b8c\u6210"

    .line 452
    .line 453
    const/4 v3, 0x0

    .line 454
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    const-string v2, "\u53d6\u6d88"

    .line 459
    .line 460
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    new-instance v0, Lj9;

    .line 469
    .line 470
    const/4 v2, 0x1

    .line 471
    invoke-direct {v0, v4, v2, v1}, Lj9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v13, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v13}, Landroid/app/Dialog;->show()V

    .line 478
    .line 479
    .line 480
    const/4 v0, -0x1

    .line 481
    invoke-virtual {v13, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    new-instance v7, Lcom/example/dyhelper/ui/ρ;

    .line 486
    .line 487
    move-object v14, v11

    .line 488
    move-object v11, v4

    .line 489
    invoke-direct/range {v7 .. v14}, Lcom/example/dyhelper/ui/ρ;-><init>(IILm3;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 493
    .line 494
    .line 495
    :cond_6
    :goto_4
    return-void

    .line 496
    :cond_7
    :goto_5
    const-string v0, "\u56fe\u7247\u8bfb\u53d6\u5931\u8d25"

    .line 497
    .line 498
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 503
    .line 504
    .line 505
    return-void
.end method
